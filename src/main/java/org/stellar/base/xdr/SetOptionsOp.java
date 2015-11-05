// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct SetOptionsOp
//  {
//      AccountID* inflationDest; // sets the inflation destination
//  
//      uint32* clearFlags; // which flags to clear
//      uint32* setFlags;   // which flags to set
//  
//      // account threshold manipulation
//      uint32* masterWeight; // weight of the master account
//      uint32* lowThreshold;
//      uint32* medThreshold;
//      uint32* highThreshold;
//  
//      string32* homeDomain; // sets the home domain
//  
//      // Add, update or remove a signer for the account
//      // signer is deleted if the weight is 0
//      Signer* signer;
//  };

//  ===========================================================================
public class SetOptionsOp  {
  public SetOptionsOp () {}
  private AccountID inflationDest;
  public AccountID getinflationDest() {
    return this.inflationDest;
  }
  public void setinflationDest(AccountID value) {
    this.inflationDest = value;
  }
  private Uint32 clearFlags;
  public Uint32 getclearFlags() {
    return this.clearFlags;
  }
  public void setclearFlags(Uint32 value) {
    this.clearFlags = value;
  }
  private Uint32 setFlags;
  public Uint32 getsetFlags() {
    return this.setFlags;
  }
  public void setsetFlags(Uint32 value) {
    this.setFlags = value;
  }
  private Uint32 masterWeight;
  public Uint32 getmasterWeight() {
    return this.masterWeight;
  }
  public void setmasterWeight(Uint32 value) {
    this.masterWeight = value;
  }
  private Uint32 lowThreshold;
  public Uint32 getlowThreshold() {
    return this.lowThreshold;
  }
  public void setlowThreshold(Uint32 value) {
    this.lowThreshold = value;
  }
  private Uint32 medThreshold;
  public Uint32 getmedThreshold() {
    return this.medThreshold;
  }
  public void setmedThreshold(Uint32 value) {
    this.medThreshold = value;
  }
  private Uint32 highThreshold;
  public Uint32 gethighThreshold() {
    return this.highThreshold;
  }
  public void sethighThreshold(Uint32 value) {
    this.highThreshold = value;
  }
  private String32 homeDomain;
  public String32 gethomeDomain() {
    return this.homeDomain;
  }
  public void sethomeDomain(String32 value) {
    this.homeDomain = value;
  }
  private Signer signer;
  public Signer getsigner() {
    return this.signer;
  }
  public void setsigner(Signer value) {
    this.signer = value;
  }
  public static void encode(XdrDataOutputStream stream, SetOptionsOp encodedSetOptionsOp) throws IOException{
    if (encodedSetOptionsOp.inflationDest != null) {
    stream.writeInt(1);
    AccountID.encode(stream, encodedSetOptionsOp.inflationDest);
    } else {
    stream.writeInt(0);
    }
    if (encodedSetOptionsOp.clearFlags != null) {
    stream.writeInt(1);
    Uint32.encode(stream, encodedSetOptionsOp.clearFlags);
    } else {
    stream.writeInt(0);
    }
    if (encodedSetOptionsOp.setFlags != null) {
    stream.writeInt(1);
    Uint32.encode(stream, encodedSetOptionsOp.setFlags);
    } else {
    stream.writeInt(0);
    }
    if (encodedSetOptionsOp.masterWeight != null) {
    stream.writeInt(1);
    Uint32.encode(stream, encodedSetOptionsOp.masterWeight);
    } else {
    stream.writeInt(0);
    }
    if (encodedSetOptionsOp.lowThreshold != null) {
    stream.writeInt(1);
    Uint32.encode(stream, encodedSetOptionsOp.lowThreshold);
    } else {
    stream.writeInt(0);
    }
    if (encodedSetOptionsOp.medThreshold != null) {
    stream.writeInt(1);
    Uint32.encode(stream, encodedSetOptionsOp.medThreshold);
    } else {
    stream.writeInt(0);
    }
    if (encodedSetOptionsOp.highThreshold != null) {
    stream.writeInt(1);
    Uint32.encode(stream, encodedSetOptionsOp.highThreshold);
    } else {
    stream.writeInt(0);
    }
    if (encodedSetOptionsOp.homeDomain != null) {
    stream.writeInt(1);
    String32.encode(stream, encodedSetOptionsOp.homeDomain);
    } else {
    stream.writeInt(0);
    }
    if (encodedSetOptionsOp.signer != null) {
    stream.writeInt(1);
    Signer.encode(stream, encodedSetOptionsOp.signer);
    } else {
    stream.writeInt(0);
    }
  }
  public static SetOptionsOp decode(XdrDataInputStream stream) throws IOException {
    SetOptionsOp decodedSetOptionsOp = new SetOptionsOp();
    int inflationDestPresent = stream.readInt();
    if (inflationDestPresent != 0) {
    decodedSetOptionsOp.inflationDest = AccountID.decode(stream);
    }
    int clearFlagsPresent = stream.readInt();
    if (clearFlagsPresent != 0) {
    decodedSetOptionsOp.clearFlags = Uint32.decode(stream);
    }
    int setFlagsPresent = stream.readInt();
    if (setFlagsPresent != 0) {
    decodedSetOptionsOp.setFlags = Uint32.decode(stream);
    }
    int masterWeightPresent = stream.readInt();
    if (masterWeightPresent != 0) {
    decodedSetOptionsOp.masterWeight = Uint32.decode(stream);
    }
    int lowThresholdPresent = stream.readInt();
    if (lowThresholdPresent != 0) {
    decodedSetOptionsOp.lowThreshold = Uint32.decode(stream);
    }
    int medThresholdPresent = stream.readInt();
    if (medThresholdPresent != 0) {
    decodedSetOptionsOp.medThreshold = Uint32.decode(stream);
    }
    int highThresholdPresent = stream.readInt();
    if (highThresholdPresent != 0) {
    decodedSetOptionsOp.highThreshold = Uint32.decode(stream);
    }
    int homeDomainPresent = stream.readInt();
    if (homeDomainPresent != 0) {
    decodedSetOptionsOp.homeDomain = String32.decode(stream);
    }
    int signerPresent = stream.readInt();
    if (signerPresent != 0) {
    decodedSetOptionsOp.signer = Signer.decode(stream);
    }
    return decodedSetOptionsOp;
  }
}
