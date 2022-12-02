// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



export class TapDetectionSettings implements flatbuffers.IUnpackableObject<TapDetectionSettingsT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):TapDetectionSettings {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsTapDetectionSettings(bb:flatbuffers.ByteBuffer, obj?:TapDetectionSettings):TapDetectionSettings {
  return (obj || new TapDetectionSettings()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsTapDetectionSettings(bb:flatbuffers.ByteBuffer, obj?:TapDetectionSettings):TapDetectionSettings {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new TapDetectionSettings()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

tapResetDelay():number|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.readFloat32(this.bb_pos + offset) : null;
}

tapResetEnabled():boolean|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? !!this.bb!.readInt8(this.bb_pos + offset) : null;
}

static startTapDetectionSettings(builder:flatbuffers.Builder) {
  builder.startObject(2);
}

static addTapResetDelay(builder:flatbuffers.Builder, tapResetDelay:number) {
  builder.addFieldFloat32(0, tapResetDelay, 0);
}

static addTapResetEnabled(builder:flatbuffers.Builder, tapResetEnabled:boolean) {
  builder.addFieldInt8(1, +tapResetEnabled, 0);
}

static endTapDetectionSettings(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createTapDetectionSettings(builder:flatbuffers.Builder, tapResetDelay:number|null, tapResetEnabled:boolean|null):flatbuffers.Offset {
  TapDetectionSettings.startTapDetectionSettings(builder);
  if (tapResetDelay !== null)
    TapDetectionSettings.addTapResetDelay(builder, tapResetDelay);
  if (tapResetEnabled !== null)
    TapDetectionSettings.addTapResetEnabled(builder, tapResetEnabled);
  return TapDetectionSettings.endTapDetectionSettings(builder);
}

unpack(): TapDetectionSettingsT {
  return new TapDetectionSettingsT(
    this.tapResetDelay(),
    this.tapResetEnabled()
  );
}


unpackTo(_o: TapDetectionSettingsT): void {
  _o.tapResetDelay = this.tapResetDelay();
  _o.tapResetEnabled = this.tapResetEnabled();
}
}

export class TapDetectionSettingsT implements flatbuffers.IGeneratedObject {
constructor(
  public tapResetDelay: number|null = null,
  public tapResetEnabled: boolean|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  return TapDetectionSettings.createTapDetectionSettings(builder,
    this.tapResetDelay,
    this.tapResetEnabled
  );
}
}
