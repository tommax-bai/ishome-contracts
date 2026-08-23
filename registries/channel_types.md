# 渠道类型注册表（变化轴 1：IM / 触达渠道）

> 权威来源：规范文档 §6.1；proto 枚举 `ishome/common/v1/channel_type.proto` 与本表同步（两处同改）。
> 纪律：只增不改；R6 同一现实实体跨轴共用同一标识——身份轴（identity-svc 渠道绑定、登录身份源）复用本表，不另建。

## 两级标识：type（协议）× instance（接入实例）

- **channel_type**：一种接入协议/平台一个标识，小写 snake_case。
- **channel_instance**：同一协议下的一个具体接入（一个飞书自建应用、一个公众号主体），
  格式 `{type}:{instance-slug}`，如 `feishu:ishome-prod`。多主体、多环境靠 instance 区分，**不新造 type**。

## 首批注册表

| channel_type | 对应 | 命名理由 / 坑 |
|---|---|---|
| `feishu` | 飞书（open.feishu.cn），**首发渠道** | 用产品通用英文小写（飞书开放平台自己就用 feishu 域名）。**保留 `lark` 给国际版**（open.larksuite.com）——域名、账号体系不同，是另一个渠道，不是同一个 |
| `wecom` | 企业微信 | 微信生态**禁止统称 `wechat`**：公众号 / 小程序客服 / 企微是三套 API、三种身份体系，一个名字盖三套是未来重构的定时炸弹 |
| `wechat_oa` | 微信公众号（服务号） | 同上，待拍板⑤落地时启用 |
| `wechat_mini` | 小程序客服消息 | 同上，待拍板⑤落地时启用 |
| `sms` | 短信触达 | 触达级渠道与会话级渠道同一套注册表，靠能力声明区分，不靠命名区分 |
| `mock` | 内置 mock 渠道（对齐 §6.4） | 集成测试工具兼本地开发环境，会话级能力全开；**仅限本地开发与自动化测试，禁止生产配置启用**（2026-08-23 追加） |

命名规则：取平台**开放平台的通用英文名**小写；无英文名的用拼音；禁止自创缩写。

## 渠道名出现白名单（R4 的渠道轴具体化，CI grep 拦截依据）

渠道名字面量只允许出现在：
1. channel-svc 的 adapter 包内（`com.ishome.channel.infrastructure.adapter.feishu`，一渠道一包，包=可插拔单元）；
2. 配置键：`channel.{type}.{instance}.{key}`，如 `channel.feishu.ishome-prod.app_id`；
3. 数据：`channel_type` 字段的值、网关路由 `/api/v1/channels/{channel_type}/webhook` 的路径参数。

其余位置（design-svc / c-bff 源码、事件名、统一模型字段名）grep 到渠道名字面量即 CI 报警。

## 新渠道接入验收标准（对齐 §6.4，写死）

只写 adapter + 能力声明 + 凭证配置，design-svc 与本仓统一消息模型**零改动**；做不到即插件契约设计失败。
另：内置一个 mock 渠道 adapter，同时充当集成测试工具和本地开发环境。
