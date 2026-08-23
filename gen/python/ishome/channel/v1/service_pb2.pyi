from ishome.channel.v1 import capability_pb2 as _capability_pb2
from ishome.channel.v1 import message_pb2 as _message_pb2
from ishome.common.v1 import channel_type_pb2 as _channel_type_pb2
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from collections.abc import Mapping as _Mapping
from typing import ClassVar as _ClassVar, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class SendMessageRequest(_message.Message):
    __slots__ = ("message", "idempotency_key")
    MESSAGE_FIELD_NUMBER: _ClassVar[int]
    IDEMPOTENCY_KEY_FIELD_NUMBER: _ClassVar[int]
    message: _message_pb2.UnifiedMessage
    idempotency_key: str
    def __init__(self, message: _Optional[_Union[_message_pb2.UnifiedMessage, _Mapping]] = ..., idempotency_key: _Optional[str] = ...) -> None: ...

class SendMessageResponse(_message.Message):
    __slots__ = ("message_id", "channel_message_id")
    MESSAGE_ID_FIELD_NUMBER: _ClassVar[int]
    CHANNEL_MESSAGE_ID_FIELD_NUMBER: _ClassVar[int]
    message_id: str
    channel_message_id: str
    def __init__(self, message_id: _Optional[str] = ..., channel_message_id: _Optional[str] = ...) -> None: ...

class GetCapabilityRequest(_message.Message):
    __slots__ = ("channel_type", "channel_instance")
    CHANNEL_TYPE_FIELD_NUMBER: _ClassVar[int]
    CHANNEL_INSTANCE_FIELD_NUMBER: _ClassVar[int]
    channel_type: _channel_type_pb2.ChannelType
    channel_instance: str
    def __init__(self, channel_type: _Optional[_Union[_channel_type_pb2.ChannelType, str]] = ..., channel_instance: _Optional[str] = ...) -> None: ...

class GetCapabilityResponse(_message.Message):
    __slots__ = ("capability",)
    CAPABILITY_FIELD_NUMBER: _ClassVar[int]
    capability: _capability_pb2.ChannelCapability
    def __init__(self, capability: _Optional[_Union[_capability_pb2.ChannelCapability, _Mapping]] = ...) -> None: ...
