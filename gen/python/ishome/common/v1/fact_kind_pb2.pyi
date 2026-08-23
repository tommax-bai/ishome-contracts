from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from typing import ClassVar as _ClassVar

DESCRIPTOR: _descriptor.FileDescriptor

class FactKind(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    FACT_KIND_UNSPECIFIED: _ClassVar[FactKind]
    FACT_KIND_DIMENSIONAL: _ClassVar[FactKind]
    FACT_KIND_STRUCTURAL: _ClassVar[FactKind]
FACT_KIND_UNSPECIFIED: FactKind
FACT_KIND_DIMENSIONAL: FactKind
FACT_KIND_STRUCTURAL: FactKind
