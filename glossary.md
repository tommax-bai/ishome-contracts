# 领域术语中英对照表（唯一真源）

> 权威来源：《开发规范与代码分层》§4.2 迁移至此（本仓即规范所指的"contracts 仓 glossary"）。
> 纪律：代码中出现表外同义词按 code review 打回；任何一侧改词表，需三处同步（本表、Agent 方案 §8 认知状态词表、Agent 方案 §10 模板声明 JSON 字段——规范文档 §八）。
> 没有这张表，同一概念会长出 `huxing` / `apartment` / `layout` / `floorplan` 四种写法。

| 中文（架构文档用语） | 代码用词 | 备注 |
|---|---|---|
| 小区 | `estate` | 与 estate-svc 一致 |
| 户型 | `floorplan` | |
| 母版 | `plan_master` / `PlanMaster` | plan-2d-render 的产物 |
| 比例锚点 | `scale_anchor` | |
| 认领（认领即分叉） | `claim` | |
| 方案套系 | `suite` | content-svc |
| 模板 / 模板库 | `template` / `template_library` | `templateId` 沿用既定值风格（如 `cream-journal`），注册表见 registries/templates.md |
| 交付图集 | `delivery_set` | |
| 确认项 / 确认清单 | `confirmation_item` / `confirmation_checklist` | |
| 认知状态 | `cognitive_state`，枚举 `CognitiveState` | 六值 `observed / inferred / proposed / user_confirmed / measured / verified`，proto：`ishome/common/v1/cognitive_state.proto`；以 Agent 方案 §8 词表为准，**禁止出现同义变体**（如裸 `confirmed`） |
| 尺寸类 / 结构类 | `fact_kind: dimensional / structural` | 信任分轨的代码表达，proto：`ishome/common/v1/fact_kind.proto` |
| 硬证据 | `hard_evidence` | 结构类信息的机检依据（V1.3：结构复核概念已废除） |
| 触达 | `touch` | channel-svc 触达策略引擎 → `TouchPolicy` |
| 打分器 | `scorer` | packages/scoring，注册表见 registries/scorers.md |
| 机检门禁 | `machine_gate` | 发布/交付前的自动检查组合（V1.3：人审概念已废除） |
| 模板验收 | `template_acceptance` | 设计时动作，非运行时环节 |
| 屋主手账（文案 voice） | `owner-journal` | 已在模板声明 JSON 中使用，保持 |

## 配套通用规则（引自规范文档 §4.1 / §4.3，此处只作索引）

- 量纲入名：长度 `_mm`（全链路毫米）、面积 `_sqm`、金额 `_cents`、时长 `_ms` / `_seconds`。
- 集合用复数（`floorplans`）；布尔 `is/has/can` 前缀；缩写白名单 `id / url / api / db / mq / im / bff / svc`，白名单外禁止缩写。
