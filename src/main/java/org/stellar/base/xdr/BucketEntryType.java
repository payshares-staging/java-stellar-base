// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  enum BucketEntryType
//  {
//      LIVEENTRY = 0,
//      DEADENTRY = 1
//  };

//  ===========================================================================
public enum BucketEntryType  {
  LIVEENTRY(0),
  DEADENTRY(1),
  ;
  private int mValue;

  BucketEntryType(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  static BucketEntryType decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0: return LIVEENTRY;
      case 1: return DEADENTRY;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  static void encode(XdrDataOutputStream stream, BucketEntryType value) throws IOException {
    stream.writeInt(value.getValue());
  }
}
