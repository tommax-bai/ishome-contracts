# 错误码注册表

> 格式：`{DOMAIN}_{3位}`（技术架构 §6.1）；统一错误信封见 `proto/ishome/common/v1/error.proto`
> （REST 侧同信封：`code` + `message` + `request_id`）。
> 纪律：只增不改；码一经注册语义不得变更；新增走 PR 评审。

## 域段位

| DOMAIN | 属主服务 |
|---|---|
| `COMMON` | 跨服务通用（网关/BFF/SDK 层） |
| `IDENTITY` | identity-svc |
| `ESTATE` | estate-svc |
| `CATALOG` | estate-svc 内 catalog 模块（schema `svc_catalog`，逻辑域独立段位） |
| `CONTENT` | content-svc |
| `GENPIPE` | genpipe-svc / genpipe-worker |
| `DESIGN` | design-svc |
| `TRADE` | trade-svc |
| `SHELF` | shelf-svc |
| `CHANNEL` | channel-svc |

## COMMON 种子码

| code | 语义 | HTTP 对应 |
|---|---|---|
| `COMMON_001` | 请求参数校验失败 | 400 |
| `COMMON_002` | 未认证 | 401 |
| `COMMON_003` | 无权限 | 403 |
| `COMMON_004` | 资源不存在 | 404 |
| `COMMON_005` | 幂等键冲突（重复请求） | 409 |
| `COMMON_006` | 乐观并发冲突（base_revision 过期） | 409 |
| `COMMON_007` | 限流 | 429 |
| `COMMON_008` | 内部错误（细节看日志，不外泄） | 500 |
| `COMMON_009` | 下游服务不可用 | 503 |

各域业务码随服务落地注册（如 `DESIGN_001`），先到先得按序分配，不预留语义段。
