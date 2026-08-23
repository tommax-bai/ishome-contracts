# Temporal activity 注册名清单

> 权威来源：对齐文档 §3.1；命名规则：规范文档 §2.4。
> 纪律：**只增不改**——改注册名会破坏历史 workflow 重放，等同于改线上协议。新增走 PR 评审。
> 命名：注册名 = kebab-case，代码中**显式声明** `@activity.defn(name="floorplan-parse")`；
> 函数名 = 同词 snake_case 动词前置（`parse_floorplan`）。
> 渲染两档：涉渲染的 activity 参数含 `preview`（快速低质，会话内迭代与 Patch 后即时反馈）/
> `final`（正式出图，用户显式请求或交付节点触发）；失效传播默认只重算 preview 档（对齐 §3.1）。

| # | 注册名 | 函数名 | 职责 | 两引擎复用 |
|---|---|---|---|---|
| 1 | `floorplan-parse` | `parse_floorplan` | 户型图解析（备用路径） | 工厂建库 / 交互上传，同一实现 |
| 2 | `plan-layout-solve` | `solve_plan_layout` | 自动布局与尺寸计算（确定性求解） | 复用 |
| 3 | `plan-rule-check` | `check_plan_rules` | 空间规则校验（碰撞/通道/边界闭合） | 复用 |
| 4 | `plan-2d-render` | `render_plan_2d` | 母版与确定性图层绘制：确认底图、功能说明图、风格图几何底图；同时输出房间遮罩/墙体图层 | 复用 |
| 5 | `atmosphere-visual` | `generate_atmosphere_visual` | 风格化交付图生成（模板库驱动，固定遮罩） | 复用 |
| 6 | `scene-compile` | `compile_scene` | DeepDesign → Scene Graph → 场景包编译 | 交互引擎专用 |
| 7 | `base-render` | `render_base` | 三维底渲（几何/深度/线稿/遮罩输出） | 交互引擎专用 |
| 8 | `realism-pass` | `apply_realism_pass` | 生成式写实化 | 复用（工厂效果图同用） |
| 9 | `consistency-check` | `check_consistency` | 户型与跨视角一致性校验（机检门禁组件；QA 清单为其第一版检查规范） | 复用 |
| 10 | `compliance-check` | `check_compliance` | 内容安全 | **两条路径都强制**（机检全覆盖） |
