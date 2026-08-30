# 落点项名注册表（规则 1.9 受控词表）

> 权威来源：《装修报告生成规则规范》v2.8 规则 1.9 三（项名的命名空间）+ §14.13（用户裁决 2026-08-30）。
> 建表依据：规则 1.9 原文「开集两类走**受控词表**：词表每条登记『项名 + 中文语义 + 首次出处』（v2.8 实施时增登记**展示名**一列，见下），
> 新词随改源进词表并过核验——译名登记一次，不由每次改源临场发挥」。
> **展示名（`label`）为何登记在本表**：渲染层并列多项时要在数字前印几个字（`一般活动 100 lx`）。
> 那几个字若在渲染层另存一份，就是同一条词表两处各写一遍——开集词表长出新词时改了源侧、忘了渲染层，
> 整册当场渲不出来。故展示名是本表的一列，渲染层**拿本表当输入**（同锁定文案 `--locked-texts` 的既有形态）。
> 机器可读投影：`anchor_items.json`（ishome-backend `scripts/rulebook/verify_seeds.py` 读它做拒灌校验；
> 本表仍是叙事权威——语义、出处、归类理由以本表为准，json 只是它的数据形态）。

## 两层模型里的位置

一条落点 = 若干「项」，一项的值 = 一个数，或一个区间（规则 1.9 一）。正文可以引用其中一项，
写作 `{lkp-x.项名}`。项名自 v2.8 起进入标识符命名空间，纪律与规则 1.7/1.8 完全一致。

`valueKind` 七值决定项名受哪套约束，**本表只登记走受控词表（开集）的两类**：

| `valueKind` | 项名取值 | 归谁管 |
|---|---|---|
| `single` / `range` | 一个**匿名**项（无项名，只能整条引用 `{lkp-x}`） | — |
| `tier` | **闭集** `low` / `medium` / `high` | 规范规则 1.9 三，新增取值即改规范 |
| `dimension` | **闭集** `depth` / `width` / `height` | 同上 |
| `comparison` | **形态受控** `{高档}-vs-{低档}`，两侧档名取自 `tier` 闭集 | 同上（形态规则，非词表） |
| `scenario` | **受控词表（开集）** | **本表** |
| `component` | **受控词表（开集）** | **本表** |

**`min`/`max` 不是项**，是项的值形态——`{lkp-x.min}` 在语法上不存在，「引一端丢掉另一端」由结构堵死
而非纪律禁止。单位、参考平面等元信息不进 `value`，各有各的字段（规则 1.9 二）。

## 四条纪律（违反打回）

1. **ASCII 小写 kebab-case**（`^[a-z][a-z0-9-]*$`）：项名与落点标识同处一个记号，混语言等于在一个
   标识符里放两种文字。项名**不进业主视野**（读者看到的是正文人话与渲染出的数值），故「中文语义更准」
   在此不成立——中文语义登记在本表内。
2. **只增不改**：项名一经 release 发布不得改名——它逐字进报告正文的记号，改名等同于改线上协议
   （同 activity 注册名纪律，规则 1.7 第三条）。同锁定文案注册表的「只增不改」是同一条机制。
3. **禁自造缩写、禁同概念两套名**（规则 1.8）：`main-material` 可以，`mat`/`mid` 不行；档位比较统一
   走 `high-vs-medium`，不再并存 `high_vs_mid` 与 `品质_vs_舒适` 两套写法。
4. **核验强制**：项名不在本表内即**拒灌**（`verify_seeds.py` 硬违规 exit 1）。规则写了没人执行，与既有的
   「取值不校验」是同一个坑——这是规则 1.9 三最后一条原文点名的执行位。

**登记路径**：新项名随改源同批进本表（人驱动 AI 改源 → 编译 → 核验 → release，规则 4.19），
先进表再灌库；本表不接受「先灌库后补登记」。

## `scenario`（分场景）

同一个量在不同使用场景下的分档取值。判据：项名回答的是**「什么时候／干什么用」**。

| 项名 | 展示名 | 中文语义 | 首次出处（域/落点 id） |
|---|---|---|---|
| `general` | 一般活动 | 一般活动（非特定作业时的日常照度口径） | `lighting/lkp-illuminance-living` |
| `reading` | 书写阅读 | 书写阅读 | `lighting/lkp-illuminance-living` |
| `task` | 操作台 | 操作台作业（厨房备餐面一类的作业面） | `lighting/lkp-illuminance-kitchen` |
| `vanity` | 化妆台 | 化妆台 | `lighting/lkp-illuminance-bath` |

## `component`（分项）

一个整体拆成的构成分项，各项之和／各项并列构成这条落点。判据：项名回答的是**「哪一部分」**。

| 项名 | 展示名 | 中文语义 | 首次出处（域/落点 id） |
|---|---|---|---|
| `demolition` | 拆改 | 拆改 | `budget/lkp-budget-share` |
| `plumbing-electrical` | 水电 | 水电 | `budget/lkp-budget-share` |
| `masonry-carpentry` | 泥木 | 泥木（泥工+木工，源生合并口径） | `budget/lkp-budget-share` |
| `painting` | 油漆 | 油漆 | `budget/lkp-budget-share` |
| `main-material` | 主材 | 主材 | `budget/lkp-budget-share` |
| `custom-cabinetry` | 定制 | 定制（定制柜体） | `budget/lkp-budget-share` |
| `soft-furnishing` | 软装 | 软装 | `budget/lkp-budget-share` |
| `hang` | 悬挂 | 挂放区（衣柜） | `storage/lkp-wardrobe-hang-fold-ratio` |
| `fold` | 叠放 | 叠放区（衣柜） | `storage/lkp-wardrobe-hang-fold-ratio` |
| `drawer` | 抽屉 | 抽屉区（衣柜） | `storage/lkp-wardrobe-hang-fold-ratio` |
| `main` | 主色 | 主色 | `softdeco/lkp-color-ratio` |
| `secondary` | 辅色 | 辅色 | `softdeco/lkp-color-ratio` |
| `accent` | 点缀色 | 点缀色 | `softdeco/lkp-color-ratio` |

**造价七分项的译名说明**（裁决 2026-08-30「一起改，不留半套旧名」）：七个中文分项名一次性译定并登记于此，
`custom-cabinetry`（定制）取「定制柜体」而非字面的 `custom`——`custom` 单独出现说不出定制的是什么；
`masonry-carpentry`（泥木）保留源生的合并口径（泥工+木工是一个报价分项），不拆成两项，拆分等于改数据。

**`main` 在两处的辨析**：`main`（主色，softdeco）与 `main-material`（主材，budget）是两个项名不是一个词的两种写法——
前者答「哪一种颜色角色」，后者答「哪一个造价分项」；两者都不与对方同域出现，`{lkp-x.项名}` 的解析上下文
恒为那一条落点，不存在歧义。**禁止**把 `main-material` 简写成 `main`（纪律三：同概念两套名）。
