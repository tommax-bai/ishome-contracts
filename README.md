# ishome-contracts

《是我的家》契约仓——**唯一真源**。proto、OpenAPI、领域词表、事件/activity/错误码/变化轴注册表全部在此定义；CI 产出 Java/TS/Python 三语言 SDK。

> 基线文档在中控仓 `tommax-bai/ishome`（技术架构 §2.2、对齐文档 §5.3、开发规范 §四/§五/§六）。
> `{code}=ishome` 为工作默认值（★ 待拍板，见中控仓《落地假设与拍板清单》）。

## 四条纪律（违反打回）

1. **字段只增不删**：proto 与 OpenAPI 字段一经首个 tag 发布不得删除/改名（buf breaking + PR 评审强制）；废弃字段带 sunset 头。
2. **注册表只增不改**：事件 type、activity 注册名、错误码、channel_type、templateId 等标识一经注册不得变更（改 activity 注册名=破坏 workflow 重放=改线上协议）。
3. **禁止手写客户端**：跨服务调用只走本仓生成的 SDK（Java↔Python 接口漂移的唯一解法=契约先行；ArchUnit / CI grep 在各仓兑现）。
4. **词表三处同步**：改 glossary 需同步 Agent 方案 §8 词表与 §10 模板声明字段（规范文档 §八）。

## 目录

| 路径 | 内容 |
|---|---|
| `proto/ishome/{domain}/v1/` | gRPC/protobuf 契约（common / channel / design 起步） |
| `openapi/` | REST 契约（snake_case 端到端）：BFF 对外面（`c-bff`/`admin-bff`）+ **服务间调用面**（`genpipe.v1.yaml` 报告成文线与三张图派发入口；`project.v1.yaml` 业务事实入口与生成任务结果回流——都是跨语言那一跳，Java↔Python，字段名对不上时两侧编译器都不报错） |
| `glossary.md` | 领域术语中英对照（唯一真源） |
| `events/registry.md` | CloudEvents 注册表（`com.ishome.{domain}.{entity}.{past-verb}`） |
| `activities/registry.md` | Temporal activity 注册名（只增不改） |
| `errors/registry.md` | 错误码注册表（`{DOMAIN}_{3位}`） |
| `registries/` | 变化轴注册表（渠道、模板、规则、打分器、轴索引）、任务队列注册表、**报告产物注册表**（`artifacts.md`，art-）、**锁定文案 ID 注册表**（`locked_texts.md`，gen-locked 枚举 + 产物必挂映射） |
| `rulebook/` | svc_rulebook 知识资产契约面：dom-/form/gen-/prec- 枚举、release 引用格式、attributes entity_type JSONSchema（只进契约不进内容，规范 v2.2 规则 4.12） |
| `gen/` | 三语言生成代码（`buf generate` 产出，**手改无效**，CI 校验新鲜度） |

## SDK 消费方式

| 语言 | 方式 |
|---|---|
| Java | GitHub Packages Maven：`com.ishome:ishome-contracts-java`（发布启用前：composite build 指向 `gen/java`，或 `cd gen/java && gradle publishToMavenLocal`） |
| TS | GitHub Packages npm：`@tommax-bai/ishome-contracts`（GH Packages 强制 scope=账号名，与 `{code}` 解耦） |
| Python | git 依赖（GH Packages 不支持 PyPI）：`uv add "ishome-contracts @ git+ssh://git@github.com/tommax-bai/ishome-contracts.git#subdirectory=gen/python"` |

## 本地工作流

```bash
buf lint && buf build     # 契约校验
buf generate              # 重新生成 gen/（需外网；本机走 Clash 代理）
# 提交时 gen/ 与 proto/ 必须同 PR——CI 用 git diff 校验新鲜度
```

## 状态

v0 草案（2026-08-22 落地首夜）。design/channel proto 标注 v0 的字段允许在首个 tag 前调整；首个 tag 后全面进入 breaking 纪律。

## 本地质量门（pre-push）

云端 CI 停用期间的本地把关：push 前自动跑本仓全套检查。新 clone 后执行一次 `git config core.hooksPath .githooks` 启用；紧急绕过用 `git push --no-verify`。
