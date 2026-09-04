# 交付图模板注册表（变化轴 4：纯数据轴）

> 权威来源：Agent 方案 §10（模板声明结构）、视觉提案 §11（模板价值表）。
> 形态（R2）：**纯数据轴**——新模板 = 新 JSON 声明 + 素材，0 代码、不发版；模板声明由**系统自产/自验**，
> 随 release 发布，回滚=切回旧版本（规范 v2.2 §11.9：无编辑后台、无运营 CRUD）。
> 纪律：`templateId` 只增不改，kebab-case 既定值风格；模板只能决定显示哪些信息层和如何表达，
> **不能改变 PreliminaryPlan**（设计层）；风格化生成必须使用母版的固定空间边界、家具位置和区域遮罩。
> 模板上线 = 系统自产/自验：自动回归门禁（种子集回归+观察态发布，规范 v2.2 规则 4.14/4.17）随 release 发布，
> 回滚=切回旧 release（原"模板验收台一次性验收（template_acceptance）"作废，规范 §11.9）。

## 首批注册

| templateId | 名称 | 信息层 | 主要价值 | 状态 |
|---|---|---|---|---|
| `cream-journal` | 温暖奶油之家 | basicArrangement + layoutPlanning + lifestyleAtmosphere | 情绪安抚、收纳痛点、保存分享（小红书首图、首次获得感） | 视觉规范已定稿（视觉提案 §7） |
| `functional-annotation` | 功能说明图 | basicArrangement + layoutPlanning | 基础专业感（≈ Agent 方案原"图二"规划层） | **templateId 本表首定**；视觉规范待定（Agent 方案 §16-1） |
| `pencil-life-sketch` | 彩铅生活草图 | basicArrangement + layoutPlanning + lifestyleAtmosphere | 生活密度、兴趣身份、真实手绘（生活方式提案、传播性） | 视觉规范已定稿（视觉提案 §8"彩铅建筑生活草图"） |

| `pencil-sketch` | 彩铅生活草图（实装 id） | basicArrangement + layoutPlanning + lifestyleAtmosphere | 同 `pencil-life-sketch` 的价值定位；**实装模板文件用的是本 id**（imagegen `templates/pencil-sketch.json`），`pencil-life-sketch` 保留登记但无实装 | 已真跑（2026-09-01） |
| `lifestyle-notebook` | 手账·零字版 | basicArrangement + layoutPlanning + lifestyleAtmosphere | 手账风格、图上不写字（对照组） | 已真跑（2026-09-01） |
| `lifestyle-notebook-handwritten` | 手账·写字版 | basicArrangement + layoutPlanning + lifestyleAtmosphere | **免费第三张风格图拍定形态**（用户裁决 2026-09-01：手账·写字版，且图上要有注释——注释内容我们给、位置钉在房间上） | 已真机发业主（2026-09-01） |

默认交付组合与顺序（运营配置，非架构约束）：`cream-journal` → `functional-annotation` → `pencil-life-sketch`。
**三张免费图现行组合（2026-09-04，随派发链路接通落定；数据在编排侧配置）**：情绪图＝`cream-journal` 底图 + 确定性叠字（标题/总结/贴士）；功能说明图＝render2d 制图（`functional-annotation` 定位，不经图像模型）；风格图＝`lifestyle-notebook-handwritten` + 注释。

## 信息层定义（模板的组合原料，Agent 方案 §10）

```json
{
  "layers": {
    "basicArrangement": ["space", "boundary", "opening", "furniture", "keyDimension"],
    "layoutPlanning": ["zone", "circulation", "storageHint", "planningNote"],
    "lifestyleAtmosphere": ["person", "activity", "atmosphereHint", "lifestyleNote", "tipsPanel"]
  }
}
```

## 模板声明结构（示例，数据化存储、版本化）

```json
{
  "templateId": "cream-journal",
  "name": "温暖奶油之家",
  "layers": ["basicArrangement", "layoutPlanning", "lifestyleAtmosphere"],
  "styleRef": "asset://style/cream-journal-v4",
  "voice": "owner-journal",
  "negativeRules": ["no-dimension-table", "no-corporate-wording", "no-extra-rooms"],
  "textCompose": "per-decision-10"
}
```

- 模板/实例分离（视觉提案 §12）：户型专属内容（房间表、批注、标题）是槽位，由系统从 PreliminaryPlan 填充；模板本体只有风格描述、构图规则、信息层级、文案口吻与禁词表、通用负面约束。
- 文案口吻规则（如 `owner-journal` 屋主手账体、禁词表）约束 design-svc 的文案生成步骤；文字作为受控载荷下发，不由图像模型自由发挥。
- 文字排版方式（图像直出 vs 确定性叠加）按待拍板⑩结论落 `textCompose` 语义。
