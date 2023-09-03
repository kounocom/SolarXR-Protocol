// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



/**
 * SteamVR bridge is disconnected
 */
export class StatusSteamVRDisconnected implements flatbuffers.IUnpackableObject<StatusSteamVRDisconnectedT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):StatusSteamVRDisconnected {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsStatusSteamVRDisconnected(bb:flatbuffers.ByteBuffer, obj?:StatusSteamVRDisconnected):StatusSteamVRDisconnected {
  return (obj || new StatusSteamVRDisconnected()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsStatusSteamVRDisconnected(bb:flatbuffers.ByteBuffer, obj?:StatusSteamVRDisconnected):StatusSteamVRDisconnected {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new StatusSteamVRDisconnected()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

/**
 * Name of bridge in the server's config
 */
bridgeSettingsName():string|null
bridgeSettingsName(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
bridgeSettingsName(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

static startStatusSteamVRDisconnected(builder:flatbuffers.Builder) {
  builder.startObject(1);
}

static addBridgeSettingsName(builder:flatbuffers.Builder, bridgeSettingsNameOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, bridgeSettingsNameOffset, 0);
}

static endStatusSteamVRDisconnected(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createStatusSteamVRDisconnected(builder:flatbuffers.Builder, bridgeSettingsNameOffset:flatbuffers.Offset):flatbuffers.Offset {
  StatusSteamVRDisconnected.startStatusSteamVRDisconnected(builder);
  StatusSteamVRDisconnected.addBridgeSettingsName(builder, bridgeSettingsNameOffset);
  return StatusSteamVRDisconnected.endStatusSteamVRDisconnected(builder);
}

unpack(): StatusSteamVRDisconnectedT {
  return new StatusSteamVRDisconnectedT(
    this.bridgeSettingsName()
  );
}


unpackTo(_o: StatusSteamVRDisconnectedT): void {
  _o.bridgeSettingsName = this.bridgeSettingsName();
}
}

export class StatusSteamVRDisconnectedT implements flatbuffers.IGeneratedObject {
constructor(
  public bridgeSettingsName: string|Uint8Array|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const bridgeSettingsName = (this.bridgeSettingsName !== null ? builder.createString(this.bridgeSettingsName!) : 0);

  return StatusSteamVRDisconnected.createStatusSteamVRDisconnected(builder,
    bridgeSettingsName
  );
}
}