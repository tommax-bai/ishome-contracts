from google.protobuf import struct_pb2 as _struct_pb2
from ishome.channel.v1 import message_pb2 as _message_pb2
from ishome.design.v1 import types_pb2 as _types_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from collections.abc import Iterable as _Iterable, Mapping as _Mapping
from typing import ClassVar as _ClassVar, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class ConfirmationAction(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    CONFIRMATION_ACTION_UNSPECIFIED: _ClassVar[ConfirmationAction]
    CONFIRMATION_ACTION_CONFIRMED: _ClassVar[ConfirmationAction]
    CONFIRMATION_ACTION_CORRECTED: _ClassVar[ConfirmationAction]
CONFIRMATION_ACTION_UNSPECIFIED: ConfirmationAction
CONFIRMATION_ACTION_CONFIRMED: ConfirmationAction
CONFIRMATION_ACTION_CORRECTED: ConfirmationAction

class IngestMessageRequest(_message.Message):
    __slots__ = ("message",)
    MESSAGE_FIELD_NUMBER: _ClassVar[int]
    message: _message_pb2.UnifiedMessage
    def __init__(self, message: _Optional[_Union[_message_pb2.UnifiedMessage, _Mapping]] = ...) -> None: ...

class IngestMessageResponse(_message.Message):
    __slots__ = ("message_id",)
    MESSAGE_ID_FIELD_NUMBER: _ClassVar[int]
    message_id: str
    def __init__(self, message_id: _Optional[str] = ...) -> None: ...

class SubmitConfirmationRequest(_message.Message):
    __slots__ = ("project_id", "decisions")
    PROJECT_ID_FIELD_NUMBER: _ClassVar[int]
    DECISIONS_FIELD_NUMBER: _ClassVar[int]
    project_id: str
    decisions: _containers.RepeatedCompositeFieldContainer[ConfirmationDecision]
    def __init__(self, project_id: _Optional[str] = ..., decisions: _Optional[_Iterable[_Union[ConfirmationDecision, _Mapping]]] = ...) -> None: ...

class ConfirmationDecision(_message.Message):
    __slots__ = ("item_id", "action", "correction")
    ITEM_ID_FIELD_NUMBER: _ClassVar[int]
    ACTION_FIELD_NUMBER: _ClassVar[int]
    CORRECTION_FIELD_NUMBER: _ClassVar[int]
    item_id: str
    action: ConfirmationAction
    correction: _struct_pb2.Struct
    def __init__(self, item_id: _Optional[str] = ..., action: _Optional[_Union[ConfirmationAction, str]] = ..., correction: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...

class SubmitConfirmationResponse(_message.Message):
    __slots__ = ("open_item_count",)
    OPEN_ITEM_COUNT_FIELD_NUMBER: _ClassVar[int]
    open_item_count: int
    def __init__(self, open_item_count: _Optional[int] = ...) -> None: ...

class SubmitPatchRequest(_message.Message):
    __slots__ = ("project_id", "base_revision", "patch")
    PROJECT_ID_FIELD_NUMBER: _ClassVar[int]
    BASE_REVISION_FIELD_NUMBER: _ClassVar[int]
    PATCH_FIELD_NUMBER: _ClassVar[int]
    project_id: str
    base_revision: int
    patch: _types_pb2.Patch
    def __init__(self, project_id: _Optional[str] = ..., base_revision: _Optional[int] = ..., patch: _Optional[_Union[_types_pb2.Patch, _Mapping]] = ...) -> None: ...

class SubmitPatchResponse(_message.Message):
    __slots__ = ("new_revision",)
    NEW_REVISION_FIELD_NUMBER: _ClassVar[int]
    new_revision: int
    def __init__(self, new_revision: _Optional[int] = ...) -> None: ...

class GetProjectRequest(_message.Message):
    __slots__ = ("project_id",)
    PROJECT_ID_FIELD_NUMBER: _ClassVar[int]
    project_id: str
    def __init__(self, project_id: _Optional[str] = ...) -> None: ...

class GetProjectResponse(_message.Message):
    __slots__ = ("project",)
    PROJECT_FIELD_NUMBER: _ClassVar[int]
    project: _types_pb2.ProjectSummary
    def __init__(self, project: _Optional[_Union[_types_pb2.ProjectSummary, _Mapping]] = ...) -> None: ...

class ListProjectsRequest(_message.Message):
    __slots__ = ("user_id", "page_size", "page_token")
    USER_ID_FIELD_NUMBER: _ClassVar[int]
    PAGE_SIZE_FIELD_NUMBER: _ClassVar[int]
    PAGE_TOKEN_FIELD_NUMBER: _ClassVar[int]
    user_id: str
    page_size: int
    page_token: str
    def __init__(self, user_id: _Optional[str] = ..., page_size: _Optional[int] = ..., page_token: _Optional[str] = ...) -> None: ...

class ListProjectsResponse(_message.Message):
    __slots__ = ("projects", "next_page_token")
    PROJECTS_FIELD_NUMBER: _ClassVar[int]
    NEXT_PAGE_TOKEN_FIELD_NUMBER: _ClassVar[int]
    projects: _containers.RepeatedCompositeFieldContainer[_types_pb2.ProjectSummary]
    next_page_token: str
    def __init__(self, projects: _Optional[_Iterable[_Union[_types_pb2.ProjectSummary, _Mapping]]] = ..., next_page_token: _Optional[str] = ...) -> None: ...
