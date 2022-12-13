// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class TapDetectionSettings extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static TapDetectionSettings getRootAsTapDetectionSettings(ByteBuffer _bb) { return getRootAsTapDetectionSettings(_bb, new TapDetectionSettings()); }
  public static TapDetectionSettings getRootAsTapDetectionSettings(ByteBuffer _bb, TapDetectionSettings obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TapDetectionSettings __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean hasTapResetDelay() { return 0 != __offset(4); }
  public float tapResetDelay() { int o = __offset(4); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  public boolean hasTapResetEnabled() { return 0 != __offset(6); }
  public boolean tapResetEnabled() { int o = __offset(6); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasTapResetTaps() { return 0 != __offset(8); }
  public int tapResetTaps() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean hasTapQuickResetDelay() { return 0 != __offset(10); }
  public float tapQuickResetDelay() { int o = __offset(10); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  public boolean hasTapQuickResetEnabled() { return 0 != __offset(12); }
  public boolean tapQuickResetEnabled() { int o = __offset(12); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasTapQuickResetTaps() { return 0 != __offset(14); }
  public int tapQuickResetTaps() { int o = __offset(14); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean hasTapMountingResetDelay() { return 0 != __offset(16); }
  public float tapMountingResetDelay() { int o = __offset(16); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  public boolean hasTapMountingResetEnabled() { return 0 != __offset(18); }
  public boolean tapMountingResetEnabled() { int o = __offset(18); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasTapMountingResetTaps() { return 0 != __offset(20); }
  public int tapMountingResetTaps() { int o = __offset(20); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }

  public static int createTapDetectionSettings(FlatBufferBuilder builder,
      float tapResetDelay,
      boolean tapResetEnabled,
      int tapResetTaps,
      float tapQuickResetDelay,
      boolean tapQuickResetEnabled,
      int tapQuickResetTaps,
      float tapMountingResetDelay,
      boolean tapMountingResetEnabled,
      int tapMountingResetTaps) {
    builder.startTable(9);
    TapDetectionSettings.addTapMountingResetDelay(builder, tapMountingResetDelay);
    TapDetectionSettings.addTapQuickResetDelay(builder, tapQuickResetDelay);
    TapDetectionSettings.addTapResetDelay(builder, tapResetDelay);
    TapDetectionSettings.addTapMountingResetTaps(builder, tapMountingResetTaps);
    TapDetectionSettings.addTapMountingResetEnabled(builder, tapMountingResetEnabled);
    TapDetectionSettings.addTapQuickResetTaps(builder, tapQuickResetTaps);
    TapDetectionSettings.addTapQuickResetEnabled(builder, tapQuickResetEnabled);
    TapDetectionSettings.addTapResetTaps(builder, tapResetTaps);
    TapDetectionSettings.addTapResetEnabled(builder, tapResetEnabled);
    return TapDetectionSettings.endTapDetectionSettings(builder);
  }

  public static void startTapDetectionSettings(FlatBufferBuilder builder) { builder.startTable(9); }
  public static void addTapResetDelay(FlatBufferBuilder builder, float tapResetDelay) { builder.addFloat(0, tapResetDelay, 0f); }
  public static void addTapResetEnabled(FlatBufferBuilder builder, boolean tapResetEnabled) { builder.addBoolean(1, tapResetEnabled, false); }
  public static void addTapResetTaps(FlatBufferBuilder builder, int tapResetTaps) { builder.addByte(2, (byte) tapResetTaps, (byte) 0); }
  public static void addTapQuickResetDelay(FlatBufferBuilder builder, float tapQuickResetDelay) { builder.addFloat(3, tapQuickResetDelay, 0f); }
  public static void addTapQuickResetEnabled(FlatBufferBuilder builder, boolean tapQuickResetEnabled) { builder.addBoolean(4, tapQuickResetEnabled, false); }
  public static void addTapQuickResetTaps(FlatBufferBuilder builder, int tapQuickResetTaps) { builder.addByte(5, (byte) tapQuickResetTaps, (byte) 0); }
  public static void addTapMountingResetDelay(FlatBufferBuilder builder, float tapMountingResetDelay) { builder.addFloat(6, tapMountingResetDelay, 0f); }
  public static void addTapMountingResetEnabled(FlatBufferBuilder builder, boolean tapMountingResetEnabled) { builder.addBoolean(7, tapMountingResetEnabled, false); }
  public static void addTapMountingResetTaps(FlatBufferBuilder builder, int tapMountingResetTaps) { builder.addByte(8, (byte) tapMountingResetTaps, (byte) 0); }
  public static int endTapDetectionSettings(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TapDetectionSettings get(int j) { return get(new TapDetectionSettings(), j); }
    public TapDetectionSettings get(TapDetectionSettings obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public TapDetectionSettingsT unpack() {
    TapDetectionSettingsT _o = new TapDetectionSettingsT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(TapDetectionSettingsT _o) {
    Float _oTapResetDelay = hasTapResetDelay() ? tapResetDelay() : null;
    _o.setTapResetDelay(_oTapResetDelay);
    Boolean _oTapResetEnabled = hasTapResetEnabled() ? tapResetEnabled() : null;
    _o.setTapResetEnabled(_oTapResetEnabled);
    Integer _oTapResetTaps = hasTapResetTaps() ? tapResetTaps() : null;
    _o.setTapResetTaps(_oTapResetTaps);
    Float _oTapQuickResetDelay = hasTapQuickResetDelay() ? tapQuickResetDelay() : null;
    _o.setTapQuickResetDelay(_oTapQuickResetDelay);
    Boolean _oTapQuickResetEnabled = hasTapQuickResetEnabled() ? tapQuickResetEnabled() : null;
    _o.setTapQuickResetEnabled(_oTapQuickResetEnabled);
    Integer _oTapQuickResetTaps = hasTapQuickResetTaps() ? tapQuickResetTaps() : null;
    _o.setTapQuickResetTaps(_oTapQuickResetTaps);
    Float _oTapMountingResetDelay = hasTapMountingResetDelay() ? tapMountingResetDelay() : null;
    _o.setTapMountingResetDelay(_oTapMountingResetDelay);
    Boolean _oTapMountingResetEnabled = hasTapMountingResetEnabled() ? tapMountingResetEnabled() : null;
    _o.setTapMountingResetEnabled(_oTapMountingResetEnabled);
    Integer _oTapMountingResetTaps = hasTapMountingResetTaps() ? tapMountingResetTaps() : null;
    _o.setTapMountingResetTaps(_oTapMountingResetTaps);
  }
  public static int pack(FlatBufferBuilder builder, TapDetectionSettingsT _o) {
    if (_o == null) return 0;
    return createTapDetectionSettings(
      builder,
      _o.getTapResetDelay(),
      _o.getTapResetEnabled(),
      _o.getTapResetTaps(),
      _o.getTapQuickResetDelay(),
      _o.getTapQuickResetEnabled(),
      _o.getTapQuickResetTaps(),
      _o.getTapMountingResetDelay(),
      _o.getTapMountingResetEnabled(),
      _o.getTapMountingResetTaps());
  }
}
