// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class StopWifiProvisioningRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static StopWifiProvisioningRequest getRootAsStopWifiProvisioningRequest(ByteBuffer _bb) { return getRootAsStopWifiProvisioningRequest(_bb, new StopWifiProvisioningRequest()); }
  public static StopWifiProvisioningRequest getRootAsStopWifiProvisioningRequest(ByteBuffer _bb, StopWifiProvisioningRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public StopWifiProvisioningRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }


  public static void startStopWifiProvisioningRequest(FlatBufferBuilder builder) { builder.startTable(0); }
  public static int endStopWifiProvisioningRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public StopWifiProvisioningRequest get(int j) { return get(new StopWifiProvisioningRequest(), j); }
    public StopWifiProvisioningRequest get(StopWifiProvisioningRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public StopWifiProvisioningRequestT unpack() {
    StopWifiProvisioningRequestT _o = new StopWifiProvisioningRequestT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(StopWifiProvisioningRequestT _o) {
  }
  public static int pack(FlatBufferBuilder builder, StopWifiProvisioningRequestT _o) {
    if (_o == null) return 0;
    startStopWifiProvisioningRequest(builder);
    return endStopWifiProvisioningRequest(builder);
  }
}
