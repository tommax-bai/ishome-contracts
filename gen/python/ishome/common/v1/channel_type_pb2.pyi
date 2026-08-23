from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from typing import ClassVar as _ClassVar

DESCRIPTOR: _descriptor.FileDescriptor

class ChannelType(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    CHANNEL_TYPE_UNSPECIFIED: _ClassVar[ChannelType]
    CHANNEL_TYPE_FEISHU: _ClassVar[ChannelType]
    CHANNEL_TYPE_WECOM: _ClassVar[ChannelType]
    CHANNEL_TYPE_WECHAT_OA: _ClassVar[ChannelType]
    CHANNEL_TYPE_WECHAT_MINI: _ClassVar[ChannelType]
    CHANNEL_TYPE_SMS: _ClassVar[ChannelType]
CHANNEL_TYPE_UNSPECIFIED: ChannelType
CHANNEL_TYPE_FEISHU: ChannelType
CHANNEL_TYPE_WECOM: ChannelType
CHANNEL_TYPE_WECHAT_OA: ChannelType
CHANNEL_TYPE_WECHAT_MINI: ChannelType
CHANNEL_TYPE_SMS: ChannelType
