# CloudEvents 事件注册表

> 命名：`com.ishome.{domain}.{entity}.{past-verb}`（技术架构 §6.1）。表内 type 省略 `com.ishome.` 前缀。
> 纪律（违反任一条打回）：
> 1. **只有业务语义事件上 RocketMQ 总线**；编排细节（流程内部步骤）留在 Temporal workflow 里，不发总线——违反这条，总线会变成 workflow 日志的复读机（对齐文档 §5.2）。
> 2. **渠道名不进事件名**（规范 §6.3）：`channel.message.received`，禁止 `channel.feishu.message.received`——渠道信息放事件属性 `channel_type` / `channel_instance`。事件名带渠道 = 每加一个渠道加一族事件 = 订阅方全得改。
> 3. **只增不改**：事件 type 一经注册不得改名；新增走 PR 评审。
> 4. 事件类命名 `Xxx{PastVerb}Event` 与 type 一一对应（如 `CandidateScoredEvent` ↔ `genpipe.candidate.scored`）。
>
> 分析链路：consumer 落 ClickHouse，漏斗在 PostHog/Metabase 看。payload schema 随首个生产方落地补充至 events/schemas/（JSON Schema，文件名=type）。

## design 域（生产方 design-svc；对齐文档 §5.2）

| type | 上总线理由 / 说明 |
|---|---|
| `design.floorplan.uploaded` | 用户上传户型图（备用路径入口） |
| `design.floorplan.matched` | 户型库命中（estate 命中率指标源） |
| `design.floorplan.missed` | 户型库未命中——**estate 排产的需求侧信号，双引擎咬合点** |
| `design.fact.confirmed` | 确认闭环：字段升级 user_confirmed |
| `design.fact.corrected` | 确认闭环：用户修正（回流 estate 数据质量；确认修正率=迭代地面真值之一） |
| `design.plan.revision-created` | PreliminaryPlan 新版本（含 Patch 产生的版本） |
| `design.plan.accepted` | 用户认可初步方案（转化漏斗关键点） |
| `design.project.deep-entered` | 进入深度设计（付费转化点，trade 关心） |
| `design.structure.evidence-provided` | 硬证据提交（合规审计留痕） |
| `design.deep.confirmed` | 深度设计确认 |
| `design.render.generated` | 效果图/交付图生成完成（成本与产能指标源） |
| `design.render.feedback-received` | 用户对图的反馈（含"换一张"——免费负样本标注） |

## channel 域（生产方 channel-svc）

| type | 上总线理由 / 说明 |
|---|---|
| `channel.message.received` | 入站消息（渠道信息在属性 `channel_type` / `channel_instance`） |
| `channel.message.sent` | 出站消息送达渠道 |

## genpipe 域（生产方 genpipe-svc）

| type | 上总线理由 / 说明 |
|---|---|
| `genpipe.candidate.scored` | 候选打分完成（技术架构 §6.1 既定示例；机检门禁指标源） |

## 明确不上总线（Temporal workflow 内部，列出以免误注册）

`BasicRequirementProvided`、`ConfirmationListGenerated`、`DeepDataProvided`（落 facts 即可）——均为 design workflow 编排细节（对齐文档 §5.2 表中标"否"项）。
