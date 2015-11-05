// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  enum LedgerUpgradeType
//  {
//      LEDGER_UPGRADE_VERSION = 1,
//      LEDGER_UPGRADE_BASE_FEE = 2,
//      LEDGER_UPGRADE_MAX_TX_SET_SIZE = 3
//  };

//  ===========================================================================
public enum LedgerUpgradeType  {
  LEDGER_UPGRADE_VERSION(1),
  LEDGER_UPGRADE_BASE_FEE(2),
  LEDGER_UPGRADE_MAX_TX_SET_SIZE(3),
  ;
  private int mValue;

  LedgerUpgradeType(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  static LedgerUpgradeType decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 1: return LEDGER_UPGRADE_VERSION;
      case 2: return LEDGER_UPGRADE_BASE_FEE;
      case 3: return LEDGER_UPGRADE_MAX_TX_SET_SIZE;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  static void encode(XdrDataOutputStream stream, LedgerUpgradeType value) throws IOException {
    stream.writeInt(value.getValue());
  }
}
