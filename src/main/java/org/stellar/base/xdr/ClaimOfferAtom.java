// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct ClaimOfferAtom
//  {
//      // emited to identify the offer
//      AccountID sellerID; // Account that owns the offer
//      uint64 offerID;
//  
//      // amount and asset taken from the owner
//      Asset assetSold;
//      int64 amountSold;
//  
//      // amount and asset sent to the owner
//      Asset assetBought;
//      int64 amountBought;
//  };

//  ===========================================================================
public class ClaimOfferAtom  {
  public ClaimOfferAtom () {}
  private AccountID sellerID;
  public AccountID getsellerID() {
    return this.sellerID;
  }
  public void setsellerID(AccountID value) {
    this.sellerID = value;
  }
  private Uint64 offerID;
  public Uint64 getofferID() {
    return this.offerID;
  }
  public void setofferID(Uint64 value) {
    this.offerID = value;
  }
  private Asset assetSold;
  public Asset getassetSold() {
    return this.assetSold;
  }
  public void setassetSold(Asset value) {
    this.assetSold = value;
  }
  private Int64 amountSold;
  public Int64 getamountSold() {
    return this.amountSold;
  }
  public void setamountSold(Int64 value) {
    this.amountSold = value;
  }
  private Asset assetBought;
  public Asset getassetBought() {
    return this.assetBought;
  }
  public void setassetBought(Asset value) {
    this.assetBought = value;
  }
  private Int64 amountBought;
  public Int64 getamountBought() {
    return this.amountBought;
  }
  public void setamountBought(Int64 value) {
    this.amountBought = value;
  }
  public static void encode(XdrDataOutputStream stream, ClaimOfferAtom encodedClaimOfferAtom) throws IOException{
    AccountID.encode(stream, encodedClaimOfferAtom.sellerID);
    Uint64.encode(stream, encodedClaimOfferAtom.offerID);
    Asset.encode(stream, encodedClaimOfferAtom.assetSold);
    Int64.encode(stream, encodedClaimOfferAtom.amountSold);
    Asset.encode(stream, encodedClaimOfferAtom.assetBought);
    Int64.encode(stream, encodedClaimOfferAtom.amountBought);
  }
  public static ClaimOfferAtom decode(XdrDataInputStream stream) throws IOException {
    ClaimOfferAtom decodedClaimOfferAtom = new ClaimOfferAtom();
    decodedClaimOfferAtom.sellerID = AccountID.decode(stream);
    decodedClaimOfferAtom.offerID = Uint64.decode(stream);
    decodedClaimOfferAtom.assetSold = Asset.decode(stream);
    decodedClaimOfferAtom.amountSold = Int64.decode(stream);
    decodedClaimOfferAtom.assetBought = Asset.decode(stream);
    decodedClaimOfferAtom.amountBought = Int64.decode(stream);
    return decodedClaimOfferAtom;
  }
}
