# 户型特征标记闭集（layout_feature 触发字段）

> 权威来源：《装修报告生成规则规范》规则 6.3（标注字段扩展）+ 各域 `rules.yaml` 的 `trigger.type=layout_feature`。
> 机器可读投影：`layout_features.json`（解析侧产出校验 + 核验侧规则引用校验共用一份，md 是叙事权威）。
> 纪律：**只增不改**（同 activity 注册名与锁定文案 ID）；标记名沿用规则数据既有的 `snake_case` 形态，
> 不做大小写归一——归一即造出"注册表与规则数据两套写法"（同锁定文案注册表纪律三）。

## 一、标记的形态与匹配语义

**特征以标记集合的形式随匿名画像下发**：`anonymousProfile.layoutFeatures` 是一个 map，
**键＝本闭集内的标记名**（该标记对这套户型成立），**值＝这条标记的依据**（人话，如"图上有指北针 + 卖点写南北通透"）。

- **匹配语义＝键存在即触发**（`trigger.layout_feature: X` ⇔ `layoutFeatures` 含键 `X`）——
  确定性、无表达式语法、**不建映射表**（同城市档裁决：映射表一旦存在就会与数据漂移）；
- **值不参与匹配**，它的用途是**依据留痕**：触发的规则随包下发时带上这条依据，
  报告里"因为你家阳台带家政位"的可追溯数据由此而来（规则 4.3 `triggered_by` 的户型侧对应物）；
- **禁止**把标记设计成"键=值"再做投影（`kitchen_shape=u_shape` → `kitchen_u_shape`）——
  那是同概念两套名 + 一张会漂移的映射表，规则 1.8 第四条禁止项。

## 二、闭集（首版四条：**每条都有规则消费**）

规则 6.3 明文"每字段**必须**有至少一条规则消费"——**闭集因此只收已被规则消费的标记**，
不预登记"将来可能有用"的字段（同规则 6.1"问题即资产：存在理由是至少一条规则消费它"）。

| 标记 | 含义 | 消费它的规则 | 域 |
|---|---|---|---|
| `west_facing` | 该空间西晒 | `rule-practice-material-glossy-stone-west-sun`（西晒空间禁亮面岩板大面积上墙） | material |
| `kitchen_u_shape` | 厨房为 U 形 | `rule-practice-ergo-dual-cook-width`（两人同时下厨时 U 型两排间距取上限区间） | ergonomics |
| `bedroom_east_facing` | 主卧东向 | `rule-personal-softdeco-blackout-by-orientation`（主卧窗帘按全遮光选型） | softdeco |
| `balcony_service` | 阳台带家政/生活功能位 | `rule-practice-storage-balcony-cleaning`（阳台留清洁工具位含插座） | storage |

## 三、扩充路径（写死）

**新增标记必须与消费它的规则同批提交**——先有规则、后有标记，顺序不可倒（否则闭集里会躺着永远不触发的死字段，
即"入册不等于生效"的另一种形态）。同批动作：①规则改源进种子（`calibration: draft`，**种子禁预置 calibrated**）
→ ②本表与 json 同批加标记 → ③重发该域 release → ④解析侧产出该标记。

**解析侧读到闭集外的特征**：**不下发、可记录**——记进解析产物的观察区供后续立规则用，
**禁止**塞进 `layoutFeatures`（下发即等于宣称"有规则会用它"，那是假的）。

## 四、两侧校验（都必须实现，缺一即静默失效）

| 侧 | 校验 | 失败形态 |
|---|---|---|
| 解析产出 | `layoutFeatures` 的键 ⊆ 本闭集 | 响亮失败，报出越界的键 |
| 种子核验（`verify_seeds`） | 规则的 `trigger.layout_feature` ∈ 本闭集 | 核验不通过，拦在入库前 |

**没有这两道校验，键写错就是永远不触发且不报错**——本项目最贵的失效形态（同"判据入册 ≠ 有执行器"）。
