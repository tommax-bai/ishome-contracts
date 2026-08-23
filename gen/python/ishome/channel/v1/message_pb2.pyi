import datetime

from google.protobuf import struct_pb2 as _struct_pb2
from google.protobuf import timestamp_pb2 as _timestamp_pb2
from ishome.common.v1 import channel_type_pb2 as _channel_type_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from collections.abc import Iterable as _Iterable, Mapping as _Mapping
from typing import ClassVar as _ClassVar, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class MessageDirection(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    MESSAGE_DIRECTION_UNSPECIFIED: _ClassVar[MessageDirection]
    MESSAGE_DIRECTION_INBOUND: _ClassVar[MessageDirection]
    MESSAGE_DIRECTION_OUTBOUND: _ClassVar[MessageDirection]
MESSAGE_DIRECTION_UNSPECIFIED: MessageDirection
MESSAGE_DIRECTION_INBOUND: MessageDirection
MESSAGE_DIRECTION_OUTBOUND: MessageDirection

class UnifiedMessage(_message.Message):
    __slots__ = ("message_id", "channel_type", "channel_instance", "direction", "external_user_id", "user_id", "occurred_at", "text", "image", "card", "quick_reply", "audio", "raw_payload")
    MESSAGE_ID_FIELD_NUMBER: _ClassVar[int]
    CHANNEL_TYPE_FIELD_NUMBER: _ClassVar[int]
    CHANNEL_INSTANCE_FIELD_NUMBER: _ClassVar[int]
    DIRECTION_FIELD_NUMBER: _ClassVar[int]
    EXTERNAL_USER_ID_FIELD_NUMBER: _ClassVar[int]
    USER_ID_FIELD_NUMBER: _ClassVar[int]
    OCCURRED_AT_FIELD_NUMBER: _ClassVar[int]
    TEXT_FIELD_NUMBER: _ClassVar[int]
    IMAGE_FIELD_NUMBER: _ClassVar[int]
    CARD_FIELD_NUMBER: _ClassVar[int]
    QUICK_REPLY_FIELD_NUMBER: _ClassVar[int]
    AUDIO_FIELD_NUMBER: _ClassVar[int]
    RAW_PAYLOAD_FIELD_NUMBER: _ClassVar[int]
    message_id: str
    channel_type: _channel_type_pb2.ChannelType
    channel_instance: str
    direction: MessageDirection
    external_user_id: str
    user_id: str
    occurred_at: _timestamp_pb2.Timestamp
    text: TextContent
    image: ImageContent
    card: CardContent
    quick_reply: QuickReplyContent
    audio: AudioContent
    raw_payload: _struct_pb2.Struct
    def __init__(self, message_id: _Optional[str] = ..., channel_type: _Optional[_Union[_channel_type_pb2.ChannelType, str]] = ..., channel_instance: _Optional[str] = ..., direction: _Optional[_Union[MessageDirection, str]] = ..., external_user_id: _Optional[str] = ..., user_id: _Optional[str] = ..., occurred_at: _Optional[_Union[datetime.datetime, _timestamp_pb2.Timestamp, _Mapping]] = ..., text: _Optional[_Union[TextContent, _Mapping]] = ..., image: _Optional[_Union[ImageContent, _Mapping]] = ..., card: _Optional[_Union[CardContent, _Mapping]] = ..., quick_reply: _Optional[_Union[QuickReplyContent, _Mapping]] = ..., audio: _Optional[_Union[AudioContent, _Mapping]] = ..., raw_payload: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...

class TextContent(_message.Message):
    __slots__ = ("text",)
    TEXT_FIELD_NUMBER: _ClassVar[int]
    text: str
    def __init__(self, text: _Optional[str] = ...) -> None: ...

class ImageContent(_message.Message):
    __slots__ = ("image_url", "mime_type", "width_px", "height_px")
    IMAGE_URL_FIELD_NUMBER: _ClassVar[int]
    MIME_TYPE_FIELD_NUMBER: _ClassVar[int]
    WIDTH_PX_FIELD_NUMBER: _ClassVar[int]
    HEIGHT_PX_FIELD_NUMBER: _ClassVar[int]
    image_url: str
    mime_type: str
    width_px: int
    height_px: int
    def __init__(self, image_url: _Optional[str] = ..., mime_type: _Optional[str] = ..., width_px: _Optional[int] = ..., height_px: _Optional[int] = ...) -> None: ...

class CardContent(_message.Message):
    __slots__ = ("title", "description", "link_url", "preview_image_url")
    TITLE_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    LINK_URL_FIELD_NUMBER: _ClassVar[int]
    PREVIEW_IMAGE_URL_FIELD_NUMBER: _ClassVar[int]
    title: str
    description: str
    link_url: str
    preview_image_url: str
    def __init__(self, title: _Optional[str] = ..., description: _Optional[str] = ..., link_url: _Optional[str] = ..., preview_image_url: _Optional[str] = ...) -> None: ...

class QuickReplyContent(_message.Message):
    __slots__ = ("prompt_text", "options", "selected_option_id")
    PROMPT_TEXT_FIELD_NUMBER: _ClassVar[int]
    OPTIONS_FIELD_NUMBER: _ClassVar[int]
    SELECTED_OPTION_ID_FIELD_NUMBER: _ClassVar[int]
    prompt_text: str
    options: _containers.RepeatedCompositeFieldContainer[QuickReplyOption]
    selected_option_id: str
    def __init__(self, prompt_text: _Optional[str] = ..., options: _Optional[_Iterable[_Union[QuickReplyOption, _Mapping]]] = ..., selected_option_id: _Optional[str] = ...) -> None: ...

class QuickReplyOption(_message.Message):
    __slots__ = ("option_id", "label")
    OPTION_ID_FIELD_NUMBER: _ClassVar[int]
    LABEL_FIELD_NUMBER: _ClassVar[int]
    option_id: str
    label: str
    def __init__(self, option_id: _Optional[str] = ..., label: _Optional[str] = ...) -> None: ...

class AudioContent(_message.Message):
    __slots__ = ("audio_url", "mime_type", "duration_ms")
    AUDIO_URL_FIELD_NUMBER: _ClassVar[int]
    MIME_TYPE_FIELD_NUMBER: _ClassVar[int]
    DURATION_MS_FIELD_NUMBER: _ClassVar[int]
    audio_url: str
    mime_type: str
    duration_ms: int
    def __init__(self, audio_url: _Optional[str] = ..., mime_type: _Optional[str] = ..., duration_ms: _Optional[int] = ...) -> None: ...
