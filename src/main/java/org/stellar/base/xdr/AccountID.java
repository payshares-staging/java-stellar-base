// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  typedef PublicKey AccountID;

//  ===========================================================================
public class AccountID  {
  private PublicKey AccountID;
  public PublicKey getAccountID() {
    return this.AccountID;
  }
  public void setAccountID(PublicKey value) {
    this.AccountID = value;
  }
  public static void encode(XdrDataOutputStream stream, AccountID  encodedAccountID) throws IOException {
  PublicKey.encode(stream, encodedAccountID.AccountID);
  }
  public static AccountID decode(XdrDataInputStream stream) throws IOException {
    AccountID decodedAccountID = new AccountID();
  decodedAccountID.AccountID = PublicKey.decode(stream);
    return decodedAccountID;
  }
}
