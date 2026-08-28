# 报告产物注册表（art-）

> 权威来源：《装修报告生成规则规范》v2.2 §3.1（图纸登记表=产物总清单）。
> 纪律：**只增不改**——与 activity/事件注册表同机制（规范 §11.5）；`art-` 语义命名按规则 1.7/1.8，
> 禁纯序号（旧编号 D01-D18/C01-C04 只存在于规范 §14.6 历史对照表，本表禁止出现）。
> 形态：**图纸与清单同表**，靠语义名区分，不分两张表（规范 §11.5）。
> 每个产物同时携带三套正交分级标签（精度 `prec-`、准确性、生成方式 `gen-`，规范 §2）；
> 准确性列暂用中文七级名（页面手册 §0.2），`acc-` 枚举形态未注册——注册时按规则 1.7 表另行入本仓。

## 产物全集（规范 §3.1）

| art- | 图名 | 动作 | 精度 | 准确性 | 生成 | 阶段 | 权益 |
|---|---|---|---|---|---|---|---|
| `art-floorplan-current` | 户型现状图 | 表达 | prec-exact | 事实级 | gen-locked | stage-catalog | FREE |
| `art-floorplan-dimensions` | 尺寸标注图 | 表达/决策 | prec-exact | 事实级 | gen-locked | stage-catalog | FREE |
| `art-daylight-analysis` | 采光与日照分析图 | 决策 | — | 分析级 | gen-assembled | stage-catalog | FREE |
| `art-flow-analysis` | 动线/通风/收纳分析图 | 决策 | — | 分析级 | gen-assembled | stage-catalog | FREE |
| `art-wall-structure` | 墙体性质图 | 监督/表达 | prec-exact底图 | 安全级 | gen-locked | stage-catalog | FREE |
| `art-plan-compare` | 平面布置比选图（三版） | 决策 | prec-exact | 分析级 | gen-generated+gen-evaluated校核 | stage-project | PAID |
| `art-plan-final` | 平面布置定稿图 | 表达/采购 | prec-exact | 分析级 | gen-generated+gen-evaluated | stage-project | PAID |
| `art-ergonomics-chapter` | 人体工学专章 | 决策/表达 | — | 分析+清单级 | gen-evaluated/gen-assembled | stage-project | PAID |
| `art-ceiling-lighting-plan` | 天花布置与灯位图 | 表达 | **prec-schematic** | 清单级 | gen-evaluated | stage-project | PAID |
| `art-lighting-chapter` | 灯光设计专章 | 决策/采购 | — | 分析+清单级 | gen-evaluated/gen-assembled | stage-project | PAID |
| `art-material-mood` | 立面/材质意向图 | 表达 | prec-concept+规格词 | 概念级 | gen-generated | stage-project | PAID |
| `art-space-render` | 空间效果图组 | 决策 | prec-concept | 概念级 | gen-generated | stage-catalog | FREE低清1张 / PAID全量 |
| `art-walkthrough-video` | 漫游视频 | 决策/传播 | prec-concept | 概念级 | gen-generated | stage-catalog | PAID(可带水印分享) |
| `art-hydro-layout` | 水电点位示意图 | 监督 | **prec-schematic** | 清单级 | gen-evaluated | stage-project | PAID |
| `art-material-chapter` | 用材专章 | 表达/采购 | 规格词 | 分析+清单级 | gen-evaluated/gen-assembled | stage-project | PAID |
| `art-storage-chapter` | 收纳专章 | 决策/表达 | — | 分析+清单级 | gen-evaluated/gen-assembled | stage-project | PAID |
| `art-color-soft-chapter` | 色彩与软装专章 | 决策/采购 | prec-concept+规格词 | 概念+清单级 | gen-generated+gen-evaluated | stage-project | PAID |
| `art-budget-chapter` | 造价预估专章 | 监督/决策 | — | 参考级 | gen-evaluated/gen-assembled | stage-project | PAID |
| `art-hydro-checklist` | 水电点位检查清单 | 监督 | — | 清单级 | gen-evaluated+gen-polished | stage-project | PAID |
| `art-quotation-checklist` | 报价必含项检查表 | 监督 | — | 清单级 | gen-evaluated | 解锁即得 | FREE 3条 / PAID全表 |
| `art-acceptance-checklist` | 分阶段验收清单 | 监督 | — | 操作级 | gen-evaluated | 施工期 | PAID |
| `art-purchase-checklist` | 尺寸驱动采购清单 | 采购 | prec-exact选型 | 清单级 | gen-evaluated+货架 | stage-project | PAID |

## 随表纪律（注册即受约束）

- `art-hydro-layout` 与 `art-hydro-checklist` 共享同一份点位数据，**禁止**各自独立生成（规范规则 3.1）。
- `art-quotation-checklist` 不依赖平面定稿，解锁即可用，**必须**早于 stage-project 主流程可达（规范规则 3.2）。
- 图名编号格式 `{小区代码}-{面积}-{art-id}`（如 `YLL-89-art-daylight-analysis`，规范规则 3.3）。
- prec-schematic 产物**禁止**输出任何定位数字（规范规则 2.2/2.3，机检双保险见规范 §11.6）。
- 监督/博弈类产物（`art-hydro-checklist`/`art-quotation-checklist`/`art-acceptance-checklist`/`art-budget-chapter`）**禁止**植入商品（规范规则 9.2）。
- 计算/绘制归属映射见规范 §11.7（genpipe-worker / render2d / imagegen / render3d / 规则求值引擎）。
- **锁定文案必挂**：产物 → 必挂锁定文案 ID 的映射见 `locked_texts.md`（如 `art-budget-chapter` 必挂 `DISCLAIM_PRICE`，规范规则 5.15；全部 prec-schematic 产物图框必挂 `DISCLAIM_P1`，规范 §7）。文案为 gen-locked：**只引用 ID，代码禁止拼接生成正文**（规则 2.4）。

## 关联枚举

`prec-` / `gen-` / `stage-` 枚举定义见 `../rulebook/README.md`（同 PR 注册，规范 §1.3 前缀全集）。
锁定文案 ID 枚举（`DISCLAIM_*` / `SAFE_*` / `GUIDE_*` / `ACK_*`）见 `locked_texts.md`（规范 §7/§11.5）。
