// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  typedef opaque UpgradeType<128>;

//  ===========================================================================
public class UpgradeType  {
  private byte[] UpgradeType;
  public byte[] getUpgradeType() {
    return this.UpgradeType;
  }
  public void setUpgradeType(byte[] value) {
    this.UpgradeType = value;
  }
  public static void encode(XdrDataOutputStream stream, UpgradeType  encodedUpgradeType) throws IOException {
  int UpgradeTypesize = encodedUpgradeType.UpgradeType.length;
  stream.writeInt(UpgradeTypesize);
  stream.write(encodedUpgradeType.getUpgradeType(), 0, UpgradeTypesize);
  }
  public static UpgradeType decode(XdrDataInputStream stream) throws IOException {
    UpgradeType decodedUpgradeType = new UpgradeType();
  int UpgradeTypesize = stream.readInt();
  decodedUpgradeType.UpgradeType = new byte[UpgradeTypesize];
  stream.read(decodedUpgradeType.UpgradeType, 0, UpgradeTypesize);
    return decodedUpgradeType;
  }
}
