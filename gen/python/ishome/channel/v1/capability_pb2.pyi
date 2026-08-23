from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from collections.abc import Iterable as _Iterable, Mapping as _Mapping
from typing import ClassVar as _ClassVar, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class HumanTakeover(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    HUMAN_TAKEOVER_UNSPECIFIED: _ClassVar[HumanTakeover]
    HUMAN_TAKEOVER_NONE: _ClassVar[HumanTakeover]
    HUMAN_TAKEOVER_NATIVE: _ClassVar[HumanTakeover]
    HUMAN_TAKEOVER_GROUP: _ClassVar[HumanTakeover]
    HUMAN_TAKEOVER_CONSOLE: _ClassVar[HumanTakeover]

class ChannelGrade(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    CHANNEL_GRADE_UNSPECIFIED: _ClassVar[ChannelGrade]
    CHANNEL_GRADE_SESSION: _ClassVar[ChannelGrade]
    CHANNEL_GRADE_TOUCH: _ClassVar[ChannelGrade]
HUMAN_TAKEOVER_UNSPECIFIED: HumanTakeover
HUMAN_TAKEOVER_NONE: HumanTakeover
HUMAN_TAKEOVER_NATIVE: HumanTakeover
HUMAN_TAKEOVER_GROUP: HumanTakeover
HUMAN_TAKEOVER_CONSOLE: HumanTakeover
CHANNEL_GRADE_UNSPECIFIED: ChannelGrade
CHANNEL_GRADE_SESSION: ChannelGrade
CHANNEL_GRADE_TOUCH: ChannelGrade

class ChannelCapability(_message.Message):
    __slots__ = ("can_send_proactive", "proactive_policy_ref", "supports_card", "supports_quick_reply", "human_takeover", "media_limits", "channel_grade")
    CAN_SEND_PROACTIVE_FIELD_NUMBER: _ClassVar[int]
    PROACTIVE_POLICY_REF_FIELD_NUMBER: _ClassVar[int]
    SUPPORTS_CARD_FIELD_NUMBER: _ClassVar[int]
    SUPPORTS_QUICK_REPLY_FIELD_NUMBER: _ClassVar[int]
    HUMAN_TAKEOVER_FIELD_NUMBER: _ClassVar[int]
    MEDIA_LIMITS_FIELD_NUMBER: _ClassVar[int]
    CHANNEL_GRADE_FIELD_NUMBER: _ClassVar[int]
    can_send_proactive: bool
    proactive_policy_ref: str
    supports_card: bool
    supports_quick_reply: bool
    human_takeover: HumanTakeover
    media_limits: MediaLimits
    channel_grade: ChannelGrade
    def __init__(self, can_send_proactive: _Optional[bool] = ..., proactive_policy_ref: _Optional[str] = ..., supports_card: _Optional[bool] = ..., supports_quick_reply: _Optional[bool] = ..., human_takeover: _Optional[_Union[HumanTakeover, str]] = ..., media_limits: _Optional[_Union[MediaLimits, _Mapping]] = ..., channel_grade: _Optional[_Union[ChannelGrade, str]] = ...) -> None: ...

class MediaLimits(_message.Message):
    __slots__ = ("image_max_bytes", "image_mime_types", "file_max_bytes", "file_mime_types", "audio_max_bytes", "audio_mime_types")
    IMAGE_MAX_BYTES_FIELD_NUMBER: _ClassVar[int]
    IMAGE_MIME_TYPES_FIELD_NUMBER: _ClassVar[int]
    FILE_MAX_BYTES_FIELD_NUMBER: _ClassVar[int]
    FILE_MIME_TYPES_FIELD_NUMBER: _ClassVar[int]
    AUDIO_MAX_BYTES_FIELD_NUMBER: _ClassVar[int]
    AUDIO_MIME_TYPES_FIELD_NUMBER: _ClassVar[int]
    image_max_bytes: int
    image_mime_types: _containers.RepeatedScalarFieldContainer[str]
    file_max_bytes: int
    file_mime_types: _containers.RepeatedScalarFieldContainer[str]
    audio_max_bytes: int
    audio_mime_types: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, image_max_bytes: _Optional[int] = ..., image_mime_types: _Optional[_Iterable[str]] = ..., file_max_bytes: _Optional[int] = ..., file_mime_types: _Optional[_Iterable[str]] = ..., audio_max_bytes: _Optional[int] = ..., audio_mime_types: _Optional[_Iterable[str]] = ...) -> None: ...
