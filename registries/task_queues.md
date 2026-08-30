# Temporal task queue 注册表

> 权威来源：对齐文档 §3.1（含 **V1.4 裁决 2026-08-23：绘图能力物理拆分**——绘图 activity 拆三个独立
> 服务/仓库，各自为独立部署 Temporal worker、专属 task queue）。activity 注册名唯一真源：
> `activities/registry.md`（本表只登记队列与归属，不重复定义注册名语义）。
> 纪律：**只增不改**——task queue 名写进 workflow 派发代码与运行中任务，改名等同于改线上协议；
> 新增走 PR 评审。
> 形态：一个 worker 服务监听一个专属队列（namespace `genpipe`）；genpipe workflow 按 activity
> 归属把任务派到对应队列，重试/心跳/取消/背压走 Temporal activity 原生语义，不引入服务间 HTTP 调用。

| task queue | 监听服务（仓库） | 承接 activity | 出处 |
|---|---|---|---|
| `genpipe-activities` | genpipe-worker（ishome-aipipe） | `floorplan-parse`、`plan-layout-solve`、`plan-rule-check`、`consistency-check`、`compliance-check` | 对齐文档 §3.1（编排与非绘图 activity 留 genpipe） |
| `render2d-activities` | render2d-svc（ishome-render2d） | `plan-2d-render` | V1.4 裁决：确定性 2D 绘图，CPU 伸缩轴 |
| `imagegen-activities` | imagegen-svc（ishome-imagegen） | `atmosphere-visual`、`realism-pass` | V1.4 裁决：生成式出图，外部模型 API / GPU 推理伸缩轴 |
| `render3d-activities` | render3d-svc（ishome-render3d） | `scene-compile`、`base-render` | V1.4 裁决：三维管线，GPU + 三维引擎伸缩轴 |
| `reportgen-activities` | reportgen-svc（ishome-reportgen） | `report-unit-compose`、`report-page-assemble`、`report-book-check` | 图 v0.2 §2/§8：报告两线拆分——求值线落 project-svc 规则引擎（同步，不进队列），成文线（gen-generated/gen-polished）落独立 worker，LLM 推理伸缩轴 |
| `reportrender-activities` | reportrender-svc（ishome-reportrender） | `report-book-render` | 裁决 2026-08-29 的后半段兑现：渲染层"不成服务，以工具形式存在，**后续报告产出上线时建立服务**"——报告要交到真人手上，触发条件即此。确定性零 LLM，与成文线分队列是因为伸缩轴不同（渲染是 CPU + IO，成文是 LLM 推理） |
