from google.protobuf import struct_pb2 as _struct_pb2
from ishome.channel.v1 import message_pb2 as _message_pb2
from ishome.common.v1 import channel_type_pb2 as _channel_type_pb2
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

class ConversationOwner(_message.Message):
    __slots__ = ("channel_type", "channel_instance", "external_user_id")
    CHANNEL_TYPE_FIELD_NUMBER: _ClassVar[int]
    CHANNEL_INSTANCE_FIELD_NUMBER: _ClassVar[int]
    EXTERNAL_USER_ID_FIELD_NUMBER: _ClassVar[int]
    channel_type: _channel_type_pb2.ChannelType
    channel_instance: str
    external_user_id: str
    def __init__(self, channel_type: _Optional[_Union[_channel_type_pb2.ChannelType, str]] = ..., channel_instance: _Optional[str] = ..., external_user_id: _Optional[str] = ...) -> None: ...

class Deliverable(_message.Message):
    __slots__ = ("artifact_id", "artifact_type", "object_key", "caption")
    ARTIFACT_ID_FIELD_NUMBER: _ClassVar[int]
    ARTIFACT_TYPE_FIELD_NUMBER: _ClassVar[int]
    OBJECT_KEY_FIELD_NUMBER: _ClassVar[int]
    CAPTION_FIELD_NUMBER: _ClassVar[int]
    artifact_id: str
    artifact_type: str
    object_key: str
    caption: str
    def __init__(self, artifact_id: _Optional[str] = ..., artifact_type: _Optional[str] = ..., object_key: _Optional[str] = ..., caption: _Optional[str] = ...) -> None: ...

class GenerationFailure(_message.Message):
    __slots__ = ("code", "detail", "task_type")
    CODE_FIELD_NUMBER: _ClassVar[int]
    DETAIL_FIELD_NUMBER: _ClassVar[int]
    TASK_TYPE_FIELD_NUMBER: _ClassVar[int]
    code: str
    detail: str
    task_type: str
    def __init__(self, code: _Optional[str] = ..., detail: _Optional[str] = ..., task_type: _Optional[str] = ...) -> None: ...

class PresentDeliverablesRequest(_message.Message):
    __slots__ = ("delivery_id", "project_id", "owner", "deliverables", "failure")
    DELIVERY_ID_FIELD_NUMBER: _ClassVar[int]
    PROJECT_ID_FIELD_NUMBER: _ClassVar[int]
    OWNER_FIELD_NUMBER: _ClassVar[int]
    DELIVERABLES_FIELD_NUMBER: _ClassVar[int]
    FAILURE_FIELD_NUMBER: _ClassVar[int]
    delivery_id: str
    project_id: str
    owner: ConversationOwner
    deliverables: _containers.RepeatedCompositeFieldContainer[Deliverable]
    failure: GenerationFailure
    def __init__(self, delivery_id: _Optional[str] = ..., project_id: _Optional[str] = ..., owner: _Optional[_Union[ConversationOwner, _Mapping]] = ..., deliverables: _Optional[_Iterable[_Union[Deliverable, _Mapping]]] = ..., failure: _Optional[_Union[GenerationFailure, _Mapping]] = ...) -> None: ...

class PresentDeliverablesResponse(_message.Message):
    __slots__ = ("delivered", "message_ids")
    DELIVERED_FIELD_NUMBER: _ClassVar[int]
    MESSAGE_IDS_FIELD_NUMBER: _ClassVar[int]
    delivered: bool
    message_ids: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, delivered: _Optional[bool] = ..., message_ids: _Optional[_Iterable[str]] = ...) -> None: ...
