// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  typedef opaque Value<>;

//  ===========================================================================
public class Value  {
  private byte[] Value;
  public byte[] getValue() {
    return this.Value;
  }
  public void setValue(byte[] value) {
    this.Value = value;
  }
  public static void encode(XdrDataOutputStream stream, Value  encodedValue) throws IOException {
  int Valuesize = encodedValue.Value.length;
  stream.writeInt(Valuesize);
  stream.write(encodedValue.getValue(), 0, Valuesize);
  }
  public static Value decode(XdrDataInputStream stream) throws IOException {
    Value decodedValue = new Value();
  int Valuesize = stream.readInt();
  decodedValue.Value = new byte[Valuesize];
  stream.read(decodedValue.Value, 0, Valuesize);
    return decodedValue;
  }
}
