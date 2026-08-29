# 锁定文案 ID 注册表（gen-locked 枚举）

> 权威来源：《装修报告生成规则规范》v2.3 §7（锁定文案全集）+《页面级操作手册》§0.3（五条安全/免责文案）。
> 建表依据：规范 §11.5「contracts 新增：…**锁定文案 ID 枚举**（§7 新增三条）」。
> 纪律：**只增不改**——与产物/activity/事件注册表同机制；ID 一经注册不得改名（改名=改渲染协议）。

## 三条纪律（违反打回）

1. **零生成**（规则 2.4 gen-locked 定义："引用锁定文案 ID 或结构化数据直接渲染，零生成"）：
   消费方只能**引用 ID**，正文由渲染层按 ID 取。**禁止任何代码路径拼接、改写、翻译、润色正文**——
   包括"把免责文案接到句子后面"这种看起来无害的拼接（规范 §7 标题即"代码禁止拼接生成"）。
   写作层（gen-generated/gen-polished）结构性地拿不到这些 ID（reportgen `Card` 上无此字段）。
2. **禁编造正文**：文案正文未落到本表的，一律标注"待补录"，**不得由任何人或 AI 补写**。
   这几条是**法律性质的免责与安全话术**，编一句发出去比缺一句更危险——缺是少说，编是替企业作错误承诺。
   补录路径只有一条：从《页面级操作手册》§0.3 原文逐字抄录（人驱动 AI 改源 → 编译 → release，规则 4.19）。
3. **ID 形态逐字照抄规范 §7**（`UPPER_SNAKE`）：本表不做大小写/前缀归一。规则 1.7 禁纯序号，
   `DISCLAIM_P1` 带语义前缀不属纯序号；沿用规范原形是为避免"注册表与规范两套写法"。

## 文案全集

| 锁定文案 ID | 正文 | 用途与出处 | 状态 |
|---|---|---|---|
| `DISCLAIM_P1` | `本图为点位逻辑示意，标注为相对位置，不含施工坐标。具体尺寸与定位以现场交底、现场复核为准。本图纸为参考级设计产物，不构成施工指令。` | 所有 `prec-schematic` 图纸图框必含（规范 §7；承 v0.1 R-5.1，规则 2.1/2.2） | 正文已登记 |
| `GUIDE_SITE_CHECK` | `请在水电交底当天，携带本清单与施工方逐项现场确认并勾选。` | 清单页头必含（规范 §7；承 v0.1 R-5.2，规则 4.3 现场复核机制） | 正文已登记 |
| `ACK_MANDATORY_WAIVER` | `该项为国家标准/行业强制建议项。我已知悉风险，自主选择不执行。` | `tier-mandatory` 条目的知悉确认（规范 §7）：**勾选留痕，带时间戳**；埋点 `report.hydro.l1_waived{rule_id}`（规则 9.3） | 正文已登记 |
| `SAFE_WALL_GENERAL` | **待从《页面级操作手册》§0.3 补录（禁编造）** | 墙体性质相关安全级话术（规范 §7 明列"页面手册 §0.3 五条继续有效"）；细分口径待补录原文后确认 | 仅 ID 与用途 |
| `SAFE_WALL_SUSPECT` | **待从《页面级操作手册》§0.3 补录（禁编造）** | 同上，"疑似/无法判定"分支话术；细分口径待补录原文后确认 | 仅 ID 与用途 |
| `SAFE_LAYOUT_CHANGE` | **待从《页面级操作手册》§0.3 补录（禁编造）** | 格局改动相关安全级话术；细分口径待补录原文后确认 | 仅 ID 与用途 |
| `DISCLAIM_RENDER` | **待从《页面级操作手册》§0.3 补录（禁编造）** | 效果图/概念图免责（`prec-concept`、概念级产物） | 仅 ID 与用途 |
| `DISCLAIM_PRICE` | **待从《页面级操作手册》§0.3 补录（禁编造）** | 造价免责：规则 5.15 造价章纪律"只出区间，禁止精确总价与任何'这个价能做'式承诺（**DISCLAIM_PRICE 必挂**）" | 仅 ID 与用途 |

**"用途"列的证据等级**：`DISCLAIM_P1`/`GUIDE_SITE_CHECK`/`ACK_MANDATORY_WAIVER` 三条的用途是规范 §7 原文；
五条待补录项里，`DISCLAIM_PRICE` 的必挂锚是规则 5.15 原文、`SAFE_LAYOUT_CHANGE` 的挂载条件是规则 5.6 原文；
其余三条（`SAFE_WALL_GENERAL`/`SAFE_WALL_SUSPECT`/`DISCLAIM_RENDER`）的用途由 ID 语义 + 规范条文推得，
**属推断不属引文**，补录原文时须复核并就地订正。

## 产物 → 必挂文案（挂载纪律）

| 锁定文案 ID | 必挂产物（`art-`，见 `artifacts.md`） | 锚（规范条文） | 定级 |
|---|---|---|---|
| `DISCLAIM_P1` | `art-ceiling-lighting-plan`、`art-hydro-layout`（全部 `prec-schematic` 产物） | §7 原文"所有 prec-schematic 图纸图框必含" + 规则 2.1 | **规范明文** |
| `DISCLAIM_PRICE` | `art-budget-chapter` | 规则 5.15"DISCLAIM_PRICE 必挂" | **规范明文** |
| `GUIDE_SITE_CHECK` | `art-hydro-checklist`；**＋任何含"未过门定位数字"的页**（v2.4 新增，见下） | §7 原文"清单页头必含"（正文写死"水电交底当天"）；v2.4 挂载条件扩展的锚=规则 4.10c 原文"安全级话术（§7 锁定文案 `GUIDE_SITE_CHECK`/`DISCLAIM_P1`）本就是为这个场景准备的，与本条配套使用" | **规范明文** |
| `ACK_MANDATORY_WAIVER` | 含 `tier-mandatory` 条目的清单族产物（`art-hydro-checklist` 等） | §7 + 规则 4.1 三层规则 | 规范明文（产物集合待随清单族落地收敛） |
| `DISCLAIM_RENDER` | `art-space-render`、`art-walkthrough-video`、`art-material-mood`（`prec-concept`） | 规则 3.3"所有图纸必须包含…对应免责文案（§7）"＋ID 语义 | **推断，待裁** |
| `SAFE_WALL_GENERAL` / `SAFE_WALL_SUSPECT` | `art-wall-structure`（安全级，`gen-locked`） | 规范 §3.1 该产物准确性=安全级、生成=gen-locked ＋ ID 语义 | **推断，待裁** |
| `SAFE_LAYOUT_CHANGE` | `art-plan-compare`、`art-plan-final`（**涉墙**版本） | 规则 5.6 原文"涉墙版本自动挂 SAFE_LAYOUT_CHANGE" | **规范明文**（挂载条件是逐版本的"涉不涉墙"，不是整个产物恒挂——由求值线判定后随包下发） |

**v2.4 新增的挂载条件（2026-08-29 裁决，隐藏档取消）**：未过可核性门的定位数字原先一律隐藏（规则 4.10c v2.3 三条隐藏判据之一），
现改为**照常进正文 + 同页标注依据 + 挂现场复核话术**。故 `GUIDE_SITE_CHECK` 的挂载条件从"产物是 `art-hydro-checklist`"
扩展为"产物是 `art-hydro-checklist`**或**本页含未过门定位数字"——**挂载条件扩展不是改正文**（只增不改的射程是 ID 与正文，不是挂载条件）。
`DISCLAIM_P1` 的同类配套在**图纸侧**（`prec-schematic` 图框，render2d 按同一 ID 挂载），成文线不经手。
注：`GUIDE_SITE_CHECK` 正文写死"水电交底当天"，用于非水电章节时语境偏窄——它与下方待裁项①同源，
一并由"推广是否新增 ID"的裁决收口；在新 ID 落表前，按规范 4.10c 原文用这一条。

**两处待裁**（不替裁，登记在案）：

- `GUIDE_SITE_CHECK` 正文写死"水电交底当天"，而规则 4.3 把现场复核机制**推广至验收清单**。
  推广到 `art-acceptance-checklist`/`art-quotation-checklist` 需要另一条文案（新 ID），
  **不能改这条的正文**（只增不改）——是否新增由用户裁。
- 五条待补录项的必挂产物集，须待手册原文补录后连同用途一并复核；此前不得据本表推断项做强制校验。

## 运行时消费口径（谁把"要挂哪几条"传进来）

| 环节 | 谁 | 做什么 |
|---|---|---|
| 求值线（project-svc 规则引擎） | 调用方按它在生成哪个 `art-` 传入 | 把本产物必挂的 ID 集放进**报告数据包** `lockedTextsByDomain`（`rulebook/report_data_package.schema.json`），与 `entitlement` 同机制——**规则引擎不持有产物清单** |
| 求值线（同上） | 规则引擎自身**派生**（v2.4 新增） | 求值结果触发的必挂并入同一清单：未过门的**定位数字**落点（`numberClass=locating` 且 `provenance.annotationRequired`）所在域并入 `GUIDE_SITE_CHECK`（规则 4.10c「与现场复核话术配套使用」）。派生依据是**结构化落点属性**，不是从 `requirement` 自然语言抠 ID（后者是禁止项）；清单仍是成文线的唯一口径 |
| 成文线单元（reportgen `report-unit-compose`） | — | **原样透传**，不产出、不选择；写作 prompt 里连 ID 都不出现（规则 2.4 零生成） |
| 页面装配（`report-page-assemble`） | 装配层 | 按要求把 ID 挂上页（`Page.lockedTextIds`）——**页/册级装配契约，不是卡片级写作约束** |
| 册级校验（`report-book-check`） | 规则层（确定性） | 要求集 vs 挂载集，缺一条即 `gate-locked-text-missing`，渲染前拦住 |
| 图纸侧（render2d/imagegen/render3d） | 渲染层 | 图框内的 `DISCLAIM_P1`/`DISCLAIM_RENDER` 由绘图服务按同一 ID 挂载（规范 §11.7 落点映射），成文线不经手 |

**键为什么是 `dom-` 不是 `art-`**：成文线不认识 `art-`（报告数据包内无产物字段，单元轴=`dom-`，
图 v0.2 §2）；`dom-` → 主产物 `art-` 的对应关系已登记（`../rulebook/README.md` §1），
`art-` → `dom-` 的换算在调用方一侧做完。

**与 `checks` 表的 `presence_require` 判据的关系**：`cr-budget-disclaimer`（`decided_by` = 规范规则 5.15）
是同一条纪律的 **check 形态**（规则 4.10b：纪律的唯一形态=机检 check/锁定文案），
它回答"这条纪律存不存在、拦不拦"；本表 + 数据包锁定清单回答"要挂哪几条 ID"。
**执行器不从 `requirement` 自然语言里抠 ID**——那等于发明一套表达式语法（规范 §12 禁止项）。
两条来源的收敛口径（check 结构化持 ID vs 数据包持清单）列为待裁项。
