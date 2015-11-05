// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  enum AccountMergeResultCode
//  {
//      // codes considered as "success" for the operation
//      ACCOUNT_MERGE_SUCCESS = 0,
//      // codes considered as "failure" for the operation
//      ACCOUNT_MERGE_MALFORMED = -1,      // can't merge onto itself
//      ACCOUNT_MERGE_NO_ACCOUNT = -2,     // destination does not exist
//      ACCOUNT_MERGE_IMMUTABLE_SET = -3,  // source account has AUTH_IMMUTABLE set
//      ACCOUNT_MERGE_HAS_SUB_ENTRIES = -4 // account has trust lines/offers
//  };

//  ===========================================================================
public enum AccountMergeResultCode  {
  ACCOUNT_MERGE_SUCCESS(0),
  ACCOUNT_MERGE_MALFORMED(-1),
  ACCOUNT_MERGE_NO_ACCOUNT(-2),
  ACCOUNT_MERGE_IMMUTABLE_SET(-3),
  ACCOUNT_MERGE_HAS_SUB_ENTRIES(-4),
  ;
  private int mValue;

  AccountMergeResultCode(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  static AccountMergeResultCode decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0: return ACCOUNT_MERGE_SUCCESS;
      case -1: return ACCOUNT_MERGE_MALFORMED;
      case -2: return ACCOUNT_MERGE_NO_ACCOUNT;
      case -3: return ACCOUNT_MERGE_IMMUTABLE_SET;
      case -4: return ACCOUNT_MERGE_HAS_SUB_ENTRIES;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  static void encode(XdrDataOutputStream stream, AccountMergeResultCode value) throws IOException {
    stream.writeInt(value.getValue());
  }
}
