# rulebook 契约面（svc_rulebook 知识资产库）

> 权威来源：《装修报告生成规则规范》v2.2 规则 4.12（**contracts 只进契约不进内容**）、
> 《装修报告AgentGraph设计说明》v0.2 §1（dom- 注册表）。
> 条目内容是数据：种子在 ishome-backend `services/project-svc/src/main/resources/rulebook-seeds/`
> （灌库后 DB 即唯一真相，种子封存为审计记录）；此后一切增改走资产回路（规则 4.16/4.17）或
> "改源→编译→核验→release"版本化路径（规则 4.19），**不随本仓评审**。
> 纪律：枚举**只增不改**；新前缀须先进规范 §1.3 前缀全集表。

## 1. 域枚举（dom-，单一命名空间）

一套 `dom-` 同时承载两种身份：**生成单元**（Agent Graph 节点）与**知识/release 域**（发布粒度）——
规则 1.8 第四条（禁两套域枚举）由单一注册表满足。

| dom- | 生成单元 | 知识域(release) | 主产物（art-，见 ../registries/artifacts.md） |
|---|---|---|---|
| `dom-site` | ✓ | — | floorplan-current / daylight-analysis / wall-structure |
| `dom-household` | ✓ | — | （时刻表+变量轴，供全图，匿名） |
| `dom-storage` | ✓ | ✓ | storage-chapter |
| `dom-layout` | ✓ | — | plan-compare / plan-final / flow-analysis |
| `dom-utility-points` | ✓ | — | hydro-layout / hydro-checklist |
| `dom-lighting` | ✓ | ✓ | ceiling-lighting-plan / lighting-chapter |
| `dom-material` | ✓ | ✓ | material-chapter / material-mood |
| `dom-kitchen-bath` | ✓ | — | （产物并入 layout/points/purchase 各表） |
| `dom-softdeco` | ✓ | ✓ | color-soft-chapter |
| `dom-budget` | ✓ | ✓ | budget-chapter / quotation-checklist |
| `dom-construction-seq` | ✓ | — | acceptance-checklist（施工期节奏） |
| `dom-vision` | ✓ | — | space-render 叙事 / 开篇承诺 |
| `dom-ergonomics` | — | ✓ | ergonomics-chapter（求值层产出，dom-layout 消费其校核） |

**存储投影**：`svc_rulebook` 各表的 `domain` 列与 release_tag 存**去前缀形态**（`lighting`、`ergonomics`）——
列即命名空间，前缀不重复入列（规则 1.8 第二条同理）；注册表标识恒带 `dom-` 前缀。
跨域共用资产编译期在 `_common/`（domain=`cross`），灌库时物化进各域 release，release 保持自包含、可独立回滚。

## 2. 形态枚举（form，八表族一一对应）

| form | 表 | 管什么 | calibration 状态机 |
|---|---|---|---|
| `rule` | rules | 触发→条目（tier- 三层三触发） | 有（draft → calibrated → needs_review） |
| `parameter` | parameters | 计算依据与数值区间（lkp- 求值落点） | 有 |
| `attribute` | attributes | 实体×属性参考数据（entity_type + JSONB props） | 有 |
| `template` | templates | gen-assembled 拼装句式（系统自产，规则 4.17） | 有（另带 observing/active/retired 观察态） |
| `vocabulary` | vocabularies | 受控词汇（规格词/禁词/修订维度） | 有 |
| `persona` | personas | 域级语域配置（身份/判断句样例/断言预算/禁词表） | 有 |
| `check` | checks | **纪律**：确定性拦截/降档规则 | **无**（规则 4.10b：纪律不进状态机） |

- `calibrated` **只能由机检核验跑批取得**（规则 4.10a 四项：source 可定位/区间自洽/量纲合法/consumers 双向校验），无人工签字门；经验条目恒 draft，唯一转正路径=埋点信号。
- `check` 结构性防伪装（规则 4.10b）：无 calibration 列、`decided_by` 非空（锚规范条文号+裁决日期）、
  **不得携带内容数值**——阈值只能引用 `lkp-*` 参数。
- 治理头字段（规则 4.10）为各表公共列：`source` / `calibration` / `consumers` / `effective_from` / `effective_to` / `version`。

## 3. 生成方式枚举（generation_mode，gen-）

| gen- | 定义（v2.2） | 适用 |
|---|---|---|
| `gen-locked` | 引用锁定文案 ID 或结构化数据直接渲染，零生成 | 安全级全部、免责文案、户型参数 |
| `gen-evaluated` | 纯规则求值，同输入同输出**必须可重放** | 清单族、校核、体检评分、预算计算 |
| `gen-assembled` | 规则计算+句式拼装（句式=系统自产 release 数据，非人写模板） | 结论句、日照分析、比选影响估算 |
| `gen-generated` | AI 生成+机检门禁+当事人校验（无验收台、无人工环节） | 效果图、漫游、风格叙述 |
| `gen-polished` | AI 润色，**语义锁定**（不得改变语义） | 清单条目 rationale_display |

组合约束矩阵（准确性等级 × gen-）见规范规则 2.5，违反组合的组件在契约校验层拒绝。

## 4. 精度枚举（precision，prec-）

| prec- | 含义 | 纪律 |
|---|---|---|
| `prec-exact` | 给具体数字，误差可被决策容忍 | — |
| `prec-schematic` | 只给相对位置和逻辑关系 | **禁止出现任何定位数字**（规则 2.2），图框必挂 DISCLAIM_P1 |
| `prec-concept` | 仅传达风格与氛围 | 免比例尺（规则 3.3） |

## 5. 阶段与规则层枚举（stage- / tier-）

- `stage-catalog`（户型级预生成，获客层）/ `stage-project`（家庭级定制生成，付费深化层）——规范规则 1.1。
- `tier-mandatory`（国标/行规强制，禁静默关闭）/ `tier-practice`（行业惯例）/ `tier-personal`（生活方式触发）——规范 §4.1。

## 6. release 引用格式

- **粒度**：一域一版（发布粒度=domain，互不牵连，规则 4.12）。
- **格式**：`{domain}@v{n}`——`domain` 为 dom- 注册项的去前缀形态，`n` 为该域自增版本号。
  例：`ergonomics@v3`、`lighting@v1`。对应 `svc_rulebook.releases.release_tag`（全库唯一）。
- **不可变**：release 快照发布后不改；回滚=切回旧 release_tag。可重放、版本锁定（规则 8.2）、
  "升级不追溯+用户主动刷新"三件事全部由不可变性承载。
- **消费面**：运行时求值只读 release 快照（工作态六表不进运行时）；产物在 `svc_project.artifacts`
  的 lineage 记录本次消费的全部 release 引用集（规则 8.2）；报告数据包落点对象的"依据"字段
  即此引用（图 v0.2 §2）。

## 7. attributes 的 entity_type 属性 JSONSchema

attributes 表以 `entity_type` + JSONB `props` 承载异构实体，**不按实体类建表**（规则 4.12）；
每个 entity_type 的 props 结构在此注册（一 entity_type 一 schema 文件，只增不改；新增 entity_type
须 schema 文件与首批数据同批落库）。治理头（calibration/source/effective/confidence）是表列，
不属于 props 载荷；schema 中出现的同名字段是导入镜像，以表列为准。

| entity_type | schema | 所属域 | 说明 |
|---|---|---|---|
| `material` | `attributes/material.schema.json` | dom-material | 材质属性卡（耐磨/耐污/防潮/保养/环保） |
| `storage_item` | `attributes/storage_item.schema.json` | dom-storage | 收纳物品外廓尺寸（mm） |
| `color` | `attributes/color.schema.json` | dom-softdeco | 色板卡（色值/冷暖/明度） |
| `work_item` | `attributes/work_item.schema.json` | dom-budget | 工项单价区间（单位口径+时效，城市档） |
