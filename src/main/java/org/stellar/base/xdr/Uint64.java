// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  typedef unsigned hyper uint64;

//  ===========================================================================
public class Uint64  {
  private Long uint64;
  public Long getuint64() {
    return this.uint64;
  }
  public void setuint64(Long value) {
    this.uint64 = value;
  }
  public static void encode(XdrDataOutputStream stream, Uint64  encodedUint64) throws IOException {
  stream.writeLong(encodedUint64.uint64);
  }
  public static Uint64 decode(XdrDataInputStream stream) throws IOException {
    Uint64 decodedUint64 = new Uint64();
  decodedUint64.uint64 = stream.readLong();
    return decodedUint64;
  }
}
