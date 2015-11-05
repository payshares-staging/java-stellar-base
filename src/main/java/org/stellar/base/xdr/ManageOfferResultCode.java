// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  enum ManageOfferResultCode
//  {
//      // codes considered as "success" for the operation
//      MANAGE_OFFER_SUCCESS = 0,
//  
//      // codes considered as "failure" for the operation
//      MANAGE_OFFER_MALFORMED = -1,     // generated offer would be invalid
//      MANAGE_OFFER_SELL_NO_TRUST = -2, // no trust line for what we're selling
//      MANAGE_OFFER_BUY_NO_TRUST = -3,  // no trust line for what we're buying
//      MANAGE_OFFER_SELL_NOT_AUTHORIZED = -4, // not authorized to sell
//      MANAGE_OFFER_BUY_NOT_AUTHORIZED = -5,  // not authorized to buy
//      MANAGE_OFFER_LINE_FULL = -6,      // can't receive more of what it's buying
//      MANAGE_OFFER_UNDERFUNDED = -7,    // doesn't hold what it's trying to sell
//      MANAGE_OFFER_CROSS_SELF = -8,     // would cross an offer from the same user
//      MANAGE_OFFER_SELL_NO_ISSUER = -9, // no issuer for what we're selling
//      MANAGE_OFFER_BUY_NO_ISSUER = -10, // no issuer for what we're buying
//  
//      // update errors
//      MANAGE_OFFER_NOT_FOUND = -11, // offerID does not match an existing offer
//  
//      MANAGE_OFFER_LOW_RESERVE = -12 // not enough funds to create a new Offer
//  };

//  ===========================================================================
public enum ManageOfferResultCode  {
  MANAGE_OFFER_SUCCESS(0),
  MANAGE_OFFER_MALFORMED(-1),
  MANAGE_OFFER_SELL_NO_TRUST(-2),
  MANAGE_OFFER_BUY_NO_TRUST(-3),
  MANAGE_OFFER_SELL_NOT_AUTHORIZED(-4),
  MANAGE_OFFER_BUY_NOT_AUTHORIZED(-5),
  MANAGE_OFFER_LINE_FULL(-6),
  MANAGE_OFFER_UNDERFUNDED(-7),
  MANAGE_OFFER_CROSS_SELF(-8),
  MANAGE_OFFER_SELL_NO_ISSUER(-9),
  MANAGE_OFFER_BUY_NO_ISSUER(-10),
  MANAGE_OFFER_NOT_FOUND(-11),
  MANAGE_OFFER_LOW_RESERVE(-12),
  ;
  private int mValue;

  ManageOfferResultCode(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  static ManageOfferResultCode decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0: return MANAGE_OFFER_SUCCESS;
      case -1: return MANAGE_OFFER_MALFORMED;
      case -2: return MANAGE_OFFER_SELL_NO_TRUST;
      case -3: return MANAGE_OFFER_BUY_NO_TRUST;
      case -4: return MANAGE_OFFER_SELL_NOT_AUTHORIZED;
      case -5: return MANAGE_OFFER_BUY_NOT_AUTHORIZED;
      case -6: return MANAGE_OFFER_LINE_FULL;
      case -7: return MANAGE_OFFER_UNDERFUNDED;
      case -8: return MANAGE_OFFER_CROSS_SELF;
      case -9: return MANAGE_OFFER_SELL_NO_ISSUER;
      case -10: return MANAGE_OFFER_BUY_NO_ISSUER;
      case -11: return MANAGE_OFFER_NOT_FOUND;
      case -12: return MANAGE_OFFER_LOW_RESERVE;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  static void encode(XdrDataOutputStream stream, ManageOfferResultCode value) throws IOException {
    stream.writeInt(value.getValue());
  }
}
