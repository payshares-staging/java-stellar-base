// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  enum IPAddrType
//  {
//      IPv4 = 0,
//      IPv6 = 1
//  };

//  ===========================================================================
public enum IPAddrType  {
  IPv4(0),
  IPv6(1),
  ;
  private int mValue;

  IPAddrType(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  static IPAddrType decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0: return IPv4;
      case 1: return IPv6;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  static void encode(XdrDataOutputStream stream, IPAddrType value) throws IOException {
    stream.writeInt(value.getValue());
  }
}
