// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  enum ManageOfferEffect
//  {
//      MANAGE_OFFER_CREATED = 0,
//      MANAGE_OFFER_UPDATED = 1,
//      MANAGE_OFFER_DELETED = 2
//  };

//  ===========================================================================
public enum ManageOfferEffect  {
  MANAGE_OFFER_CREATED(0),
  MANAGE_OFFER_UPDATED(1),
  MANAGE_OFFER_DELETED(2),
  ;
  private int mValue;

  ManageOfferEffect(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  static ManageOfferEffect decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0: return MANAGE_OFFER_CREATED;
      case 1: return MANAGE_OFFER_UPDATED;
      case 2: return MANAGE_OFFER_DELETED;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  static void encode(XdrDataOutputStream stream, ManageOfferEffect value) throws IOException {
    stream.writeInt(value.getValue());
  }
}
