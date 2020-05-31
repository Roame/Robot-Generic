// automatically generated by the FlatBuffers compiler, do not modify

package frc.taurus.config.generated;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Configuration extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static Configuration getRootAsConfiguration(ByteBuffer _bb) { return getRootAsConfiguration(_bb, new Configuration()); }
  public static Configuration getRootAsConfiguration(ByteBuffer _bb, Configuration obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public static boolean ConfigurationBufferHasIdentifier(ByteBuffer _bb) { return __has_identifier(_bb, "CNFG"); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Configuration __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public frc.taurus.config.generated.Channel channels(int j) { return channels(new frc.taurus.config.generated.Channel(), j); }
  public frc.taurus.config.generated.Channel channels(frc.taurus.config.generated.Channel obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int channelsLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public frc.taurus.config.generated.Channel.Vector channelsVector() { return channelsVector(new frc.taurus.config.generated.Channel.Vector()); }
  public frc.taurus.config.generated.Channel.Vector channelsVector(frc.taurus.config.generated.Channel.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createConfiguration(FlatBufferBuilder builder,
      int channelsOffset) {
    builder.startTable(1);
    Configuration.addChannels(builder, channelsOffset);
    return Configuration.endConfiguration(builder);
  }

  public static void startConfiguration(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addChannels(FlatBufferBuilder builder, int channelsOffset) { builder.addOffset(0, channelsOffset, 0); }
  public static int createChannelsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startChannelsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endConfiguration(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishConfigurationBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset, "CNFG"); }
  public static void finishSizePrefixedConfigurationBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset, "CNFG"); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Configuration get(int j) { return get(new Configuration(), j); }
    public Configuration get(Configuration obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
