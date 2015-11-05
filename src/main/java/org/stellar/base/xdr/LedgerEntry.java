// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct LedgerEntry
//  {
//      uint32 lastModifiedLedgerSeq; // ledger the LedgerEntry was last changed
//  
//      union switch (LedgerEntryType type)
//      {
//      case ACCOUNT:
//          AccountEntry account;
//      case TRUSTLINE:
//          TrustLineEntry trustLine;
//      case OFFER:
//          OfferEntry offer;
//      }
//      data;
//  
//      // reserved for future use
//      union switch (int v)
//      {
//      case 0:
//          void;
//      }
//      ext;
//  };

//  ===========================================================================
public class LedgerEntry  {
  public LedgerEntry () {}
  private Uint32 lastModifiedLedgerSeq;
  public Uint32 getlastModifiedLedgerSeq() {
    return this.lastModifiedLedgerSeq;
  }
  public void setlastModifiedLedgerSeq(Uint32 value) {
    this.lastModifiedLedgerSeq = value;
  }
  private LedgerEntryData data;
  public LedgerEntryData getdata() {
    return this.data;
  }
  public void setdata(LedgerEntryData value) {
    this.data = value;
  }
  private LedgerEntryExt ext;
  public LedgerEntryExt getext() {
    return this.ext;
  }
  public void setext(LedgerEntryExt value) {
    this.ext = value;
  }
  public static void encode(XdrDataOutputStream stream, LedgerEntry encodedLedgerEntry) throws IOException{
    Uint32.encode(stream, encodedLedgerEntry.lastModifiedLedgerSeq);
    LedgerEntryData.encode(stream, encodedLedgerEntry.data);
    LedgerEntryExt.encode(stream, encodedLedgerEntry.ext);
  }
  public static LedgerEntry decode(XdrDataInputStream stream) throws IOException {
    LedgerEntry decodedLedgerEntry = new LedgerEntry();
    decodedLedgerEntry.lastModifiedLedgerSeq = Uint32.decode(stream);
    decodedLedgerEntry.data = LedgerEntryData.decode(stream);
    decodedLedgerEntry.ext = LedgerEntryExt.decode(stream);
    return decodedLedgerEntry;
  }

  public static class LedgerEntryData {
    public LedgerEntryData () {}
    LedgerEntryType type;
    public LedgerEntryType getDiscriminant() {
      return this.type;
    }
    public void setDiscriminant(LedgerEntryType value) {
      this.type = value;
    }
    private AccountEntry account;
    public AccountEntry getaccount() {
      return this.account;
    }
    public void setaccount(AccountEntry value) {
      this.account = value;
    }
    private TrustLineEntry trustLine;
    public TrustLineEntry gettrustLine() {
      return this.trustLine;
    }
    public void settrustLine(TrustLineEntry value) {
      this.trustLine = value;
    }
    private OfferEntry offer;
    public OfferEntry getoffer() {
      return this.offer;
    }
    public void setoffer(OfferEntry value) {
      this.offer = value;
    }
    public static void encode(XdrDataOutputStream stream, LedgerEntryData encodedLedgerEntryData) throws IOException {
    stream.writeInt(encodedLedgerEntryData.getDiscriminant().getValue());
    switch (encodedLedgerEntryData.getDiscriminant()) {
    case ACCOUNT:
    AccountEntry.encode(stream, encodedLedgerEntryData.account);
    break;
    case TRUSTLINE:
    TrustLineEntry.encode(stream, encodedLedgerEntryData.trustLine);
    break;
    case OFFER:
    OfferEntry.encode(stream, encodedLedgerEntryData.offer);
    break;
    }
    }
    public static LedgerEntryData decode(XdrDataInputStream stream) throws IOException {
      LedgerEntryData decodedLedgerEntryData = new LedgerEntryData();
      switch (decodedLedgerEntryData.getDiscriminant()) {
    case ACCOUNT:
    decodedLedgerEntryData.account = AccountEntry.decode(stream);
    break;
    case TRUSTLINE:
    decodedLedgerEntryData.trustLine = TrustLineEntry.decode(stream);
    break;
    case OFFER:
    decodedLedgerEntryData.offer = OfferEntry.decode(stream);
    break;
    }
      return decodedLedgerEntryData;
    }

  }
  public static class LedgerEntryExt {
    public LedgerEntryExt () {}
    Integer v;
    public Integer getDiscriminant() {
      return this.v;
    }
    public void setDiscriminant(Integer value) {
      this.v = value;
    }
    public static void encode(XdrDataOutputStream stream, LedgerEntryExt encodedLedgerEntryExt) throws IOException {
    stream.writeInt(encodedLedgerEntryExt.getDiscriminant().intValue());
    switch (encodedLedgerEntryExt.getDiscriminant()) {
    case 0:
    break;
    }
    }
    public static LedgerEntryExt decode(XdrDataInputStream stream) throws IOException {
      LedgerEntryExt decodedLedgerEntryExt = new LedgerEntryExt();
      switch (decodedLedgerEntryExt.getDiscriminant()) {
    case 0:
    break;
    }
      return decodedLedgerEntryExt;
    }

  }
}
