// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct LedgerHeader
//  {
//      uint32 ledgerVersion;    // the protocol version of the ledger
//      Hash previousLedgerHash; // hash of the previous ledger header
//      StellarValue scpValue;   // what consensus agreed to
//      Hash txSetResultHash;    // the TransactionResultSet that led to this ledger
//      Hash bucketListHash;     // hash of the ledger state
//  
//      uint32 ledgerSeq; // sequence number of this ledger
//  
//      int64 totalCoins; // total number of stroops in existence.
//                        // 10,000,000 stroops in 1 XLM
//  
//      int64 feePool;       // fees burned since last inflation run
//      uint32 inflationSeq; // inflation sequence number
//  
//      uint64 idPool; // last used global ID, used for generating objects
//  
//      uint32 baseFee;     // base fee per operation in stroops
//      uint32 baseReserve; // account base reserve in stroops
//  
//      uint32 maxTxSetSize; // maximum size a transaction set can be
//  
//      Hash skipList[4]; // hashes of ledgers in the past. allows you to jump back
//                        // in time without walking the chain back ledger by ledger
//                        // each slot contains the oldest ledger that is mod of
//                        // either 50  5000  50000 or 500000 depending on index
//                        // skipList[0] mod(50), skipList[1] mod(5000), etc
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
public class LedgerHeader  {
  public LedgerHeader () {}
  private Uint32 ledgerVersion;
  public Uint32 getledgerVersion() {
    return this.ledgerVersion;
  }
  public void setledgerVersion(Uint32 value) {
    this.ledgerVersion = value;
  }
  private Hash previousLedgerHash;
  public Hash getpreviousLedgerHash() {
    return this.previousLedgerHash;
  }
  public void setpreviousLedgerHash(Hash value) {
    this.previousLedgerHash = value;
  }
  private StellarValue scpValue;
  public StellarValue getscpValue() {
    return this.scpValue;
  }
  public void setscpValue(StellarValue value) {
    this.scpValue = value;
  }
  private Hash txSetResultHash;
  public Hash gettxSetResultHash() {
    return this.txSetResultHash;
  }
  public void settxSetResultHash(Hash value) {
    this.txSetResultHash = value;
  }
  private Hash bucketListHash;
  public Hash getbucketListHash() {
    return this.bucketListHash;
  }
  public void setbucketListHash(Hash value) {
    this.bucketListHash = value;
  }
  private Uint32 ledgerSeq;
  public Uint32 getledgerSeq() {
    return this.ledgerSeq;
  }
  public void setledgerSeq(Uint32 value) {
    this.ledgerSeq = value;
  }
  private Int64 totalCoins;
  public Int64 gettotalCoins() {
    return this.totalCoins;
  }
  public void settotalCoins(Int64 value) {
    this.totalCoins = value;
  }
  private Int64 feePool;
  public Int64 getfeePool() {
    return this.feePool;
  }
  public void setfeePool(Int64 value) {
    this.feePool = value;
  }
  private Uint32 inflationSeq;
  public Uint32 getinflationSeq() {
    return this.inflationSeq;
  }
  public void setinflationSeq(Uint32 value) {
    this.inflationSeq = value;
  }
  private Uint64 idPool;
  public Uint64 getidPool() {
    return this.idPool;
  }
  public void setidPool(Uint64 value) {
    this.idPool = value;
  }
  private Uint32 baseFee;
  public Uint32 getbaseFee() {
    return this.baseFee;
  }
  public void setbaseFee(Uint32 value) {
    this.baseFee = value;
  }
  private Uint32 baseReserve;
  public Uint32 getbaseReserve() {
    return this.baseReserve;
  }
  public void setbaseReserve(Uint32 value) {
    this.baseReserve = value;
  }
  private Uint32 maxTxSetSize;
  public Uint32 getmaxTxSetSize() {
    return this.maxTxSetSize;
  }
  public void setmaxTxSetSize(Uint32 value) {
    this.maxTxSetSize = value;
  }
  private Hash[] skipList;
  public Hash[] getskipList() {
    return this.skipList;
  }
  public void setskipList(Hash[] value) {
    this.skipList = value;
  }
  private LedgerHeaderExt ext;
  public LedgerHeaderExt getext() {
    return this.ext;
  }
  public void setext(LedgerHeaderExt value) {
    this.ext = value;
  }
  public static void encode(XdrDataOutputStream stream, LedgerHeader encodedLedgerHeader) throws IOException{
    Uint32.encode(stream, encodedLedgerHeader.ledgerVersion);
    Hash.encode(stream, encodedLedgerHeader.previousLedgerHash);
    StellarValue.encode(stream, encodedLedgerHeader.scpValue);
    Hash.encode(stream, encodedLedgerHeader.txSetResultHash);
    Hash.encode(stream, encodedLedgerHeader.bucketListHash);
    Uint32.encode(stream, encodedLedgerHeader.ledgerSeq);
    Int64.encode(stream, encodedLedgerHeader.totalCoins);
    Int64.encode(stream, encodedLedgerHeader.feePool);
    Uint32.encode(stream, encodedLedgerHeader.inflationSeq);
    Uint64.encode(stream, encodedLedgerHeader.idPool);
    Uint32.encode(stream, encodedLedgerHeader.baseFee);
    Uint32.encode(stream, encodedLedgerHeader.baseReserve);
    Uint32.encode(stream, encodedLedgerHeader.maxTxSetSize);
    int skipListsize = encodedLedgerHeader.getskipList().length;
    for (int i = 0; i < skipListsize; i++) {
      Hash.encode(stream, encodedLedgerHeader.skipList[i]);
    }
    LedgerHeaderExt.encode(stream, encodedLedgerHeader.ext);
  }
  public static LedgerHeader decode(XdrDataInputStream stream) throws IOException {
    LedgerHeader decodedLedgerHeader = new LedgerHeader();
    decodedLedgerHeader.ledgerVersion = Uint32.decode(stream);
    decodedLedgerHeader.previousLedgerHash = Hash.decode(stream);
    decodedLedgerHeader.scpValue = StellarValue.decode(stream);
    decodedLedgerHeader.txSetResultHash = Hash.decode(stream);
    decodedLedgerHeader.bucketListHash = Hash.decode(stream);
    decodedLedgerHeader.ledgerSeq = Uint32.decode(stream);
    decodedLedgerHeader.totalCoins = Int64.decode(stream);
    decodedLedgerHeader.feePool = Int64.decode(stream);
    decodedLedgerHeader.inflationSeq = Uint32.decode(stream);
    decodedLedgerHeader.idPool = Uint64.decode(stream);
    decodedLedgerHeader.baseFee = Uint32.decode(stream);
    decodedLedgerHeader.baseReserve = Uint32.decode(stream);
    decodedLedgerHeader.maxTxSetSize = Uint32.decode(stream);
    int skipListsize = 4;
    decodedLedgerHeader.skipList = new Hash[skipListsize];
    for (int i = 0; i < skipListsize; i++) {
      decodedLedgerHeader.skipList[i] = Hash.decode(stream);
    }
    decodedLedgerHeader.ext = LedgerHeaderExt.decode(stream);
    return decodedLedgerHeader;
  }

  public static class LedgerHeaderExt {
    public LedgerHeaderExt () {}
    Integer v;
    public Integer getDiscriminant() {
      return this.v;
    }
    public void setDiscriminant(Integer value) {
      this.v = value;
    }
    public static void encode(XdrDataOutputStream stream, LedgerHeaderExt encodedLedgerHeaderExt) throws IOException {
    stream.writeInt(encodedLedgerHeaderExt.getDiscriminant().intValue());
    switch (encodedLedgerHeaderExt.getDiscriminant()) {
    case 0:
    break;
    }
    }
    public static LedgerHeaderExt decode(XdrDataInputStream stream) throws IOException {
      LedgerHeaderExt decodedLedgerHeaderExt = new LedgerHeaderExt();
      switch (decodedLedgerHeaderExt.getDiscriminant()) {
    case 0:
    break;
    }
      return decodedLedgerHeaderExt;
    }

  }
}
