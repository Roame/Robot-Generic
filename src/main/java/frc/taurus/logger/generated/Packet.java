// automatically generated by the FlatBuffers compiler, do not modify

package frc.taurus.logger.generated;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Packet extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static Packet getRootAsPacket(ByteBuffer _bb) { return getRootAsPacket(_bb, new Packet()); }
  public static Packet getRootAsPacket(ByteBuffer _bb, Packet obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public static boolean PacketBufferHasIdentifier(ByteBuffer _bb) { return __has_identifier(_bb, "FPKT"); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Packet __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long packetCount() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public int channelType() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int payload(int j) { int o = __offset(8); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int payloadLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector payloadVector() { return payloadVector(new ByteVector()); }
  public ByteVector payloadVector(ByteVector obj) { int o = __offset(8); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer payloadAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer payloadInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }

  public static int createPacket(FlatBufferBuilder builder,
      long packet_count,
      int channelType,
      int payloadOffset) {
    builder.startTable(3);
    Packet.addPayload(builder, payloadOffset);
    Packet.addChannelType(builder, channelType);
    Packet.addPacketCount(builder, packet_count);
    return Packet.endPacket(builder);
  }

  public static void startPacket(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addPacketCount(FlatBufferBuilder builder, long packetCount) { builder.addInt(0, (int)packetCount, (int)0L); }
  public static void addChannelType(FlatBufferBuilder builder, int channelType) { builder.addInt(1, channelType, 0); }
  public static void addPayload(FlatBufferBuilder builder, int payloadOffset) { builder.addOffset(2, payloadOffset, 0); }
  public static int createPayloadVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createPayloadVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startPayloadVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static int endPacket(FlatBufferBuilder builder) {
    int o = builder.endTable();
    builder.required(o, 8);  // payload
    return o;
  }
  public static void finishPacketBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset, "FPKT"); }
  public static void finishSizePrefixedPacketBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset, "FPKT"); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Packet get(int j) { return get(new Packet(), j); }
    public Packet get(Packet obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

