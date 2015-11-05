// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct Curve25519Public
//  {
//          opaque key[32];
//  };

//  ===========================================================================
public class Curve25519Public  {
  public Curve25519Public () {}
  private byte[] key;
  public byte[] getkey() {
    return this.key;
  }
  public void setkey(byte[] value) {
    this.key = value;
  }
  public static void encode(XdrDataOutputStream stream, Curve25519Public encodedCurve25519Public) throws IOException{
    int keysize = encodedCurve25519Public.key.length;
    stream.write(encodedCurve25519Public.getkey(), 0, keysize);
  }
  public static Curve25519Public decode(XdrDataInputStream stream) throws IOException {
    Curve25519Public decodedCurve25519Public = new Curve25519Public();
    int keysize = 32;
    decodedCurve25519Public.key = new byte[keysize];
    stream.read(decodedCurve25519Public.key, 0, keysize);
    return decodedCurve25519Public;
  }
}
