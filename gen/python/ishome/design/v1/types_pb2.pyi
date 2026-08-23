import datetime

from google.protobuf import struct_pb2 as _struct_pb2
from google.protobuf import timestamp_pb2 as _timestamp_pb2
from ishome.common.v1 import cognitive_state_pb2 as _cognitive_state_pb2
from ishome.common.v1 import fact_kind_pb2 as _fact_kind_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from collections.abc import Iterable as _Iterable, Mapping as _Mapping
from typing import ClassVar as _ClassVar, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class ProjectPhase(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    PROJECT_PHASE_UNSPECIFIED: _ClassVar[ProjectPhase]
    PROJECT_PHASE_PRELIMINARY: _ClassVar[ProjectPhase]
    PROJECT_PHASE_DEEP: _ClassVar[ProjectPhase]

class PatchOpType(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    PATCH_OP_TYPE_UNSPECIFIED: _ClassVar[PatchOpType]
    PATCH_OP_TYPE_ADD: _ClassVar[PatchOpType]
    PATCH_OP_TYPE_REMOVE: _ClassVar[PatchOpType]
    PATCH_OP_TYPE_UPDATE: _ClassVar[PatchOpType]
PROJECT_PHASE_UNSPECIFIED: ProjectPhase
PROJECT_PHASE_PRELIMINARY: ProjectPhase
PROJECT_PHASE_DEEP: ProjectPhase
PATCH_OP_TYPE_UNSPECIFIED: PatchOpType
PATCH_OP_TYPE_ADD: PatchOpType
PATCH_OP_TYPE_REMOVE: PatchOpType
PATCH_OP_TYPE_UPDATE: PatchOpType

class Fact(_message.Message):
    __slots__ = ("fact_id", "target_id", "property", "number_value", "string_value", "bool_value", "unit", "cognitive_state", "fact_kind", "source", "confidence", "stage")
    FACT_ID_FIELD_NUMBER: _ClassVar[int]
    TARGET_ID_FIELD_NUMBER: _ClassVar[int]
    PROPERTY_FIELD_NUMBER: _ClassVar[int]
    NUMBER_VALUE_FIELD_NUMBER: _ClassVar[int]
    STRING_VALUE_FIELD_NUMBER: _ClassVar[int]
    BOOL_VALUE_FIELD_NUMBER: _ClassVar[int]
    UNIT_FIELD_NUMBER: _ClassVar[int]
    COGNITIVE_STATE_FIELD_NUMBER: _ClassVar[int]
    FACT_KIND_FIELD_NUMBER: _ClassVar[int]
    SOURCE_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    STAGE_FIELD_NUMBER: _ClassVar[int]
    fact_id: str
    target_id: str
    property: str
    number_value: float
    string_value: str
    bool_value: bool
    unit: str
    cognitive_state: _cognitive_state_pb2.CognitiveState
    fact_kind: _fact_kind_pb2.FactKind
    source: str
    confidence: float
    stage: ProjectPhase
    def __init__(self, fact_id: _Optional[str] = ..., target_id: _Optional[str] = ..., property: _Optional[str] = ..., number_value: _Optional[float] = ..., string_value: _Optional[str] = ..., bool_value: _Optional[bool] = ..., unit: _Optional[str] = ..., cognitive_state: _Optional[_Union[_cognitive_state_pb2.CognitiveState, str]] = ..., fact_kind: _Optional[_Union[_fact_kind_pb2.FactKind, str]] = ..., source: _Optional[str] = ..., confidence: _Optional[float] = ..., stage: _Optional[_Union[ProjectPhase, str]] = ...) -> None: ...

class Patch(_message.Message):
    __slots__ = ("intent", "stage", "operations", "reason")
    INTENT_FIELD_NUMBER: _ClassVar[int]
    STAGE_FIELD_NUMBER: _ClassVar[int]
    OPERATIONS_FIELD_NUMBER: _ClassVar[int]
    REASON_FIELD_NUMBER: _ClassVar[int]
    intent: str
    stage: ProjectPhase
    operations: _containers.RepeatedCompositeFieldContainer[PatchOp]
    reason: str
    def __init__(self, intent: _Optional[str] = ..., stage: _Optional[_Union[ProjectPhase, str]] = ..., operations: _Optional[_Iterable[_Union[PatchOp, _Mapping]]] = ..., reason: _Optional[str] = ...) -> None: ...

class PatchOp(_message.Message):
    __slots__ = ("op", "target_id", "object_type", "payload")
    OP_FIELD_NUMBER: _ClassVar[int]
    TARGET_ID_FIELD_NUMBER: _ClassVar[int]
    OBJECT_TYPE_FIELD_NUMBER: _ClassVar[int]
    PAYLOAD_FIELD_NUMBER: _ClassVar[int]
    op: PatchOpType
    target_id: str
    object_type: str
    payload: _struct_pb2.Struct
    def __init__(self, op: _Optional[_Union[PatchOpType, str]] = ..., target_id: _Optional[str] = ..., object_type: _Optional[str] = ..., payload: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...

class ConfirmationItem(_message.Message):
    __slots__ = ("item_id", "fact_id", "annotation_text", "annotation_ref")
    ITEM_ID_FIELD_NUMBER: _ClassVar[int]
    FACT_ID_FIELD_NUMBER: _ClassVar[int]
    ANNOTATION_TEXT_FIELD_NUMBER: _ClassVar[int]
    ANNOTATION_REF_FIELD_NUMBER: _ClassVar[int]
    item_id: str
    fact_id: str
    annotation_text: str
    annotation_ref: str
    def __init__(self, item_id: _Optional[str] = ..., fact_id: _Optional[str] = ..., annotation_text: _Optional[str] = ..., annotation_ref: _Optional[str] = ...) -> None: ...

class ProjectSummary(_message.Message):
    __slots__ = ("project_id", "user_id", "phase", "floorplan_ref", "current_revision", "created_at", "updated_at")
    PROJECT_ID_FIELD_NUMBER: _ClassVar[int]
    USER_ID_FIELD_NUMBER: _ClassVar[int]
    PHASE_FIELD_NUMBER: _ClassVar[int]
    FLOORPLAN_REF_FIELD_NUMBER: _ClassVar[int]
    CURRENT_REVISION_FIELD_NUMBER: _ClassVar[int]
    CREATED_AT_FIELD_NUMBER: _ClassVar[int]
    UPDATED_AT_FIELD_NUMBER: _ClassVar[int]
    project_id: str
    user_id: str
    phase: ProjectPhase
    floorplan_ref: str
    current_revision: int
    created_at: _timestamp_pb2.Timestamp
    updated_at: _timestamp_pb2.Timestamp
    def __init__(self, project_id: _Optional[str] = ..., user_id: _Optional[str] = ..., phase: _Optional[_Union[ProjectPhase, str]] = ..., floorplan_ref: _Optional[str] = ..., current_revision: _Optional[int] = ..., created_at: _Optional[_Union[datetime.datetime, _timestamp_pb2.Timestamp, _Mapping]] = ..., updated_at: _Optional[_Union[datetime.datetime, _timestamp_pb2.Timestamp, _Mapping]] = ...) -> None: ...
