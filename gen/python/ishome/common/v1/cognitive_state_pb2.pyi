from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from typing import ClassVar as _ClassVar

DESCRIPTOR: _descriptor.FileDescriptor

class CognitiveState(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    COGNITIVE_STATE_UNSPECIFIED: _ClassVar[CognitiveState]
    COGNITIVE_STATE_OBSERVED: _ClassVar[CognitiveState]
    COGNITIVE_STATE_INFERRED: _ClassVar[CognitiveState]
    COGNITIVE_STATE_PROPOSED: _ClassVar[CognitiveState]
    COGNITIVE_STATE_USER_CONFIRMED: _ClassVar[CognitiveState]
    COGNITIVE_STATE_MEASURED: _ClassVar[CognitiveState]
    COGNITIVE_STATE_VERIFIED: _ClassVar[CognitiveState]
COGNITIVE_STATE_UNSPECIFIED: CognitiveState
COGNITIVE_STATE_OBSERVED: CognitiveState
COGNITIVE_STATE_INFERRED: CognitiveState
COGNITIVE_STATE_PROPOSED: CognitiveState
COGNITIVE_STATE_USER_CONFIRMED: CognitiveState
COGNITIVE_STATE_MEASURED: CognitiveState
COGNITIVE_STATE_VERIFIED: CognitiveState
