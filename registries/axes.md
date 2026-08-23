# 变化轴注册索引

> 盘点表唯一真源：《开发规范与代码分层》§5.2（十条轴）——本文件不复制盘点表，只索引各轴在本仓的注册表落点。
> 新增轴入盘点表走 PR 评审；表外位置不建轴（R1：第二实现进路线图或外部协议边界，二者其一才建端口）。
> **R6 注册表纪律**：一轴一张注册表，标识只增不改；**同一现实实体跨轴共用同一标识**——
> `feishu` 在消息轴（channel_type）和身份轴（identity 渠道绑定）必须是同一个值；
> 需要区分实例时统一用两级 `type × instance`，不新造 type。
> **R4 变体名三处白名单**：变体标识只允许出现在 ①adapter 包 ②配置键 ③数据字段值；
> CI grep 清单由各轴注册表自动生成——注册表加一行，拦截规则自动多一条。

| 轴 | 标识 | 本仓注册表 |
|---|---|---|
| 1 IM/触达渠道 | `channel_type × instance` | registries/channel_types.md + proto `ChannelType` |
| 2 登录身份源 | 复用轴 1（R6） | 同上 |
| 3 生成模型供应商 | 任务级逻辑模型名 `{activity}.{variant}` | 无独立注册表：逻辑名→物理 model_id 映射在 LiteLLM 配置（换模型=改配置不改代码；禁止在 packages/adapters 再造 API 适配层——R7 一轴一层） |
| 4 交付图模板 | `templateId` | registries/templates.md |
| 5 规则/检测项 | `rule_id` | registries/rules.md |
| 6 打分维度 | `scorer_id` | registries/scorers.md |
| 7 支付渠道 | `pay_channel × merchant` | 待 trade 落地时建 |
| 8 联盟商品源 | `source_type` | 待 shelf 落地时建 |
| 9 户型输入源 | `source_type` | 待 design/estate 落地时建（归一化产物=BaseFacts） |
| 10 端侧 | `client_type` | 待 c-bff 落地时建（端差异收口在 BFF） |
