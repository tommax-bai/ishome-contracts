#!/usr/bin/env python3
"""锁定文案 md ↔ json 一致性校验（pre-push 质量门）。

`registries/locked_texts.md` 是叙事权威，`registries/locked_texts.json` 是它的机器可读投影
（渲染层按 ID 逐字取正文）。两边不一致 = 投影在说假话，拦下不许 push。

校验三条（只用标准库，逐字比对不做任何归一化——归一化就是改写）：
1. ID 集合完全相等（md「文案全集」表 vs json ``texts`` 键集）；
2. md 状态为"正文已登记"（正文格反引号包裹）的条目，json 正文与 md **逐字相同**；
3. md 待补录条目（正文格无反引号正文），json 必须为 null——待补录却带正文 = 有人编了正文。
"""

from __future__ import annotations

import json
import re
import sys
from pathlib import Path

REGISTRY_DIR = Path(__file__).resolve().parent.parent / "registries"

ROW_RE = re.compile(r"^\|\s*`([A-Z0-9_]+)`\s*\|\s*(.*?)\s*\|")


def parse_md() -> dict[str, str | None]:
    """「文案全集」表 → {ID: 正文 | None}。只解析该节，避开下方挂载表（首列同为 ID）。"""
    text = (REGISTRY_DIR / "locked_texts.md").read_text(encoding="utf-8")
    match = re.search(r"^## 文案全集$(.*?)^## ", text, re.S | re.M)
    if match is None:
        raise SystemExit("locked_texts.md 缺「## 文案全集」节，无从校验")
    entries: dict[str, str | None] = {}
    for line in match.group(1).splitlines():
        row = ROW_RE.match(line)
        if row is None:
            continue
        text_id, cell = row.group(1), row.group(2)
        if cell.startswith("`") and cell.endswith("`"):
            entries[text_id] = cell[1:-1]
        else:
            entries[text_id] = None  # 待补录（禁编造）
    return entries


def main() -> int:
    md = parse_md()
    data = json.loads((REGISTRY_DIR / "locked_texts.json").read_text(encoding="utf-8"))
    texts = data.get("texts")
    if not isinstance(texts, dict):
        print("locked_texts.json 缺 texts 映射", file=sys.stderr)
        return 1

    problems: list[str] = []
    for text_id in sorted(md.keys() - texts.keys()):
        problems.append(f"{text_id}：在 md 已注册，json 缺失")
    for text_id in sorted(texts.keys() - md.keys()):
        problems.append(f"{text_id}：json 有而 md 无——注册表以 md 为权威，先注册再投影")
    for text_id in sorted(md.keys() & texts.keys()):
        md_text, json_text = md[text_id], texts[text_id]
        if md_text is None and json_text is not None:
            problems.append(f"{text_id}：md 状态为待补录，json 却带正文（禁编造，正文只能来自补录）")
        elif md_text is not None and json_text != md_text:
            problems.append(f"{text_id}：json 正文与 md 不逐字一致")

    if problems:
        print("锁定文案 md ↔ json 不一致：", file=sys.stderr)
        for p in problems:
            print(f"  - {p}", file=sys.stderr)
        return 1
    registered = sum(1 for v in md.values() if v is not None)
    print(f"locked_texts 一致：{len(md)} 条 ID，{registered} 条有正文，其余待补录")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
