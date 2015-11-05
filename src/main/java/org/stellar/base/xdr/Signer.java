// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct Signer
//  {
//      AccountID pubKey;
//      uint32 weight; // really only need 1byte
//  };

//  ===========================================================================
public class Signer  {
  public Signer () {}
  private AccountID pubKey;
  public AccountID getpubKey() {
    return this.pubKey;
  }
  public void setpubKey(AccountID value) {
    this.pubKey = value;
  }
  private Uint32 weight;
  public Uint32 getweight() {
    return this.weight;
  }
  public void setweight(Uint32 value) {
    this.weight = value;
  }
  public static void encode(XdrDataOutputStream stream, Signer encodedSigner) throws IOException{
    AccountID.encode(stream, encodedSigner.pubKey);
    Uint32.encode(stream, encodedSigner.weight);
  }
  public static Signer decode(XdrDataInputStream stream) throws IOException {
    Signer decodedSigner = new Signer();
    decodedSigner.pubKey = AccountID.decode(stream);
    decodedSigner.weight = Uint32.decode(stream);
    return decodedSigner;
  }
}
