// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class StatusMessageT {
  private long id;
  private boolean prioritized;
  private solarxr_protocol.rpc.StatusDataUnion data;

  public long getId() { return id; }

  public void setId(long id) { this.id = id; }

  public boolean getPrioritized() { return prioritized; }

  public void setPrioritized(boolean prioritized) { this.prioritized = prioritized; }

  public solarxr_protocol.rpc.StatusDataUnion getData() { return data; }

  public void setData(solarxr_protocol.rpc.StatusDataUnion data) { this.data = data; }


  public StatusMessageT() {
    this.id = 0L;
    this.prioritized = false;
    this.data = null;
  }
}
