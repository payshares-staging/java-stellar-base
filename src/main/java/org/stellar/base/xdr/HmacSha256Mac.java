// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct HmacSha256Mac
//  {
//          opaque mac[32];
//  };

//  ===========================================================================
public class HmacSha256Mac  {
  public HmacSha256Mac () {}
  private byte[] mac;
  public byte[] getmac() {
    return this.mac;
  }
  public void setmac(byte[] value) {
    this.mac = value;
  }
  public static void encode(XdrDataOutputStream stream, HmacSha256Mac encodedHmacSha256Mac) throws IOException{
    int macsize = encodedHmacSha256Mac.mac.length;
    stream.write(encodedHmacSha256Mac.getmac(), 0, macsize);
  }
  public static HmacSha256Mac decode(XdrDataInputStream stream) throws IOException {
    HmacSha256Mac decodedHmacSha256Mac = new HmacSha256Mac();
    int macsize = 32;
    decodedHmacSha256Mac.mac = new byte[macsize];
    stream.read(decodedHmacSha256Mac.mac, 0, macsize);
    return decodedHmacSha256Mac;
  }
}
