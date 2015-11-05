// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct SCPStatement
//  {
//      NodeID nodeID;    // v
//      uint64 slotIndex; // i
//  
//      union switch (SCPStatementType type)
//      {
//      case SCP_ST_PREPARE:
//          struct
//          {
//              Hash quorumSetHash;       // D
//              SCPBallot ballot;         // b
//              SCPBallot* prepared;      // p
//              SCPBallot* preparedPrime; // p'
//              uint32 nC;                // n_c
//              uint32 nP;                // n_P
//          } prepare;
//      case SCP_ST_CONFIRM:
//          struct
//          {
//              Hash quorumSetHash; // D
//              uint32 nPrepared;   // n_p
//              SCPBallot commit;   // c
//              uint32 nP;          // n_P
//          } confirm;
//      case SCP_ST_EXTERNALIZE:
//          struct
//          {
//              SCPBallot commit; // c
//              uint32 nP;        // n_P
//              // not from the paper, but useful to build tooling to
//              // traverse the graph based off only the latest statement
//              Hash commitQuorumSetHash; // D used before EXTERNALIZE
//          } externalize;
//      case SCP_ST_NOMINATE:
//          SCPNomination nominate;
//      }
//      pledges;
//  };

//  ===========================================================================
public class SCPStatement  {
  public SCPStatement () {}
  private NodeID nodeID;
  public NodeID getnodeID() {
    return this.nodeID;
  }
  public void setnodeID(NodeID value) {
    this.nodeID = value;
  }
  private Uint64 slotIndex;
  public Uint64 getslotIndex() {
    return this.slotIndex;
  }
  public void setslotIndex(Uint64 value) {
    this.slotIndex = value;
  }
  private SCPStatementPledges pledges;
  public SCPStatementPledges getpledges() {
    return this.pledges;
  }
  public void setpledges(SCPStatementPledges value) {
    this.pledges = value;
  }
  public static void encode(XdrDataOutputStream stream, SCPStatement encodedSCPStatement) throws IOException{
    NodeID.encode(stream, encodedSCPStatement.nodeID);
    Uint64.encode(stream, encodedSCPStatement.slotIndex);
    SCPStatementPledges.encode(stream, encodedSCPStatement.pledges);
  }
  public static SCPStatement decode(XdrDataInputStream stream) throws IOException {
    SCPStatement decodedSCPStatement = new SCPStatement();
    decodedSCPStatement.nodeID = NodeID.decode(stream);
    decodedSCPStatement.slotIndex = Uint64.decode(stream);
    decodedSCPStatement.pledges = SCPStatementPledges.decode(stream);
    return decodedSCPStatement;
  }

  public static class SCPStatementPledges {
    public SCPStatementPledges () {}
    SCPStatementType type;
    public SCPStatementType getDiscriminant() {
      return this.type;
    }
    public void setDiscriminant(SCPStatementType value) {
      this.type = value;
    }
    private SCPStatementPrepare prepare;
    public SCPStatementPrepare getprepare() {
      return this.prepare;
    }
    public void setprepare(SCPStatementPrepare value) {
      this.prepare = value;
    }
    private SCPStatementConfirm confirm;
    public SCPStatementConfirm getconfirm() {
      return this.confirm;
    }
    public void setconfirm(SCPStatementConfirm value) {
      this.confirm = value;
    }
    private SCPStatementExternalize externalize;
    public SCPStatementExternalize getexternalize() {
      return this.externalize;
    }
    public void setexternalize(SCPStatementExternalize value) {
      this.externalize = value;
    }
    private SCPNomination nominate;
    public SCPNomination getnominate() {
      return this.nominate;
    }
    public void setnominate(SCPNomination value) {
      this.nominate = value;
    }
    public static void encode(XdrDataOutputStream stream, SCPStatementPledges encodedSCPStatementPledges) throws IOException {
    stream.writeInt(encodedSCPStatementPledges.getDiscriminant().getValue());
    switch (encodedSCPStatementPledges.getDiscriminant()) {
    case SCP_ST_PREPARE:
    SCPStatementPrepare.encode(stream, encodedSCPStatementPledges.prepare);
    break;
    case SCP_ST_CONFIRM:
    SCPStatementConfirm.encode(stream, encodedSCPStatementPledges.confirm);
    break;
    case SCP_ST_EXTERNALIZE:
    SCPStatementExternalize.encode(stream, encodedSCPStatementPledges.externalize);
    break;
    case SCP_ST_NOMINATE:
    SCPNomination.encode(stream, encodedSCPStatementPledges.nominate);
    break;
    }
    }
    public static SCPStatementPledges decode(XdrDataInputStream stream) throws IOException {
      SCPStatementPledges decodedSCPStatementPledges = new SCPStatementPledges();
      switch (decodedSCPStatementPledges.getDiscriminant()) {
    case SCP_ST_PREPARE:
    decodedSCPStatementPledges.prepare = SCPStatementPrepare.decode(stream);
    break;
    case SCP_ST_CONFIRM:
    decodedSCPStatementPledges.confirm = SCPStatementConfirm.decode(stream);
    break;
    case SCP_ST_EXTERNALIZE:
    decodedSCPStatementPledges.externalize = SCPStatementExternalize.decode(stream);
    break;
    case SCP_ST_NOMINATE:
    decodedSCPStatementPledges.nominate = SCPNomination.decode(stream);
    break;
    }
      return decodedSCPStatementPledges;
    }

    public static class SCPStatementPrepare {
      public SCPStatementPrepare () {}
      private Hash quorumSetHash;
      public Hash getquorumSetHash() {
        return this.quorumSetHash;
      }
      public void setquorumSetHash(Hash value) {
        this.quorumSetHash = value;
      }
      private SCPBallot ballot;
      public SCPBallot getballot() {
        return this.ballot;
      }
      public void setballot(SCPBallot value) {
        this.ballot = value;
      }
      private SCPBallot prepared;
      public SCPBallot getprepared() {
        return this.prepared;
      }
      public void setprepared(SCPBallot value) {
        this.prepared = value;
      }
      private SCPBallot preparedPrime;
      public SCPBallot getpreparedPrime() {
        return this.preparedPrime;
      }
      public void setpreparedPrime(SCPBallot value) {
        this.preparedPrime = value;
      }
      private Uint32 nC;
      public Uint32 getnC() {
        return this.nC;
      }
      public void setnC(Uint32 value) {
        this.nC = value;
      }
      private Uint32 nP;
      public Uint32 getnP() {
        return this.nP;
      }
      public void setnP(Uint32 value) {
        this.nP = value;
      }
      public static void encode(XdrDataOutputStream stream, SCPStatementPrepare encodedSCPStatementPrepare) throws IOException{
        Hash.encode(stream, encodedSCPStatementPrepare.quorumSetHash);
        SCPBallot.encode(stream, encodedSCPStatementPrepare.ballot);
        if (encodedSCPStatementPrepare.prepared != null) {
        stream.writeInt(1);
        SCPBallot.encode(stream, encodedSCPStatementPrepare.prepared);
        } else {
        stream.writeInt(0);
        }
        if (encodedSCPStatementPrepare.preparedPrime != null) {
        stream.writeInt(1);
        SCPBallot.encode(stream, encodedSCPStatementPrepare.preparedPrime);
        } else {
        stream.writeInt(0);
        }
        Uint32.encode(stream, encodedSCPStatementPrepare.nC);
        Uint32.encode(stream, encodedSCPStatementPrepare.nP);
      }
      public static SCPStatementPrepare decode(XdrDataInputStream stream) throws IOException {
        SCPStatementPrepare decodedSCPStatementPrepare = new SCPStatementPrepare();
        decodedSCPStatementPrepare.quorumSetHash = Hash.decode(stream);
        decodedSCPStatementPrepare.ballot = SCPBallot.decode(stream);
        int preparedPresent = stream.readInt();
        if (preparedPresent != 0) {
        decodedSCPStatementPrepare.prepared = SCPBallot.decode(stream);
        }
        int preparedPrimePresent = stream.readInt();
        if (preparedPrimePresent != 0) {
        decodedSCPStatementPrepare.preparedPrime = SCPBallot.decode(stream);
        }
        decodedSCPStatementPrepare.nC = Uint32.decode(stream);
        decodedSCPStatementPrepare.nP = Uint32.decode(stream);
        return decodedSCPStatementPrepare;
      }

    }
    public static class SCPStatementConfirm {
      public SCPStatementConfirm () {}
      private Hash quorumSetHash;
      public Hash getquorumSetHash() {
        return this.quorumSetHash;
      }
      public void setquorumSetHash(Hash value) {
        this.quorumSetHash = value;
      }
      private Uint32 nPrepared;
      public Uint32 getnPrepared() {
        return this.nPrepared;
      }
      public void setnPrepared(Uint32 value) {
        this.nPrepared = value;
      }
      private SCPBallot commit;
      public SCPBallot getcommit() {
        return this.commit;
      }
      public void setcommit(SCPBallot value) {
        this.commit = value;
      }
      private Uint32 nP;
      public Uint32 getnP() {
        return this.nP;
      }
      public void setnP(Uint32 value) {
        this.nP = value;
      }
      public static void encode(XdrDataOutputStream stream, SCPStatementConfirm encodedSCPStatementConfirm) throws IOException{
        Hash.encode(stream, encodedSCPStatementConfirm.quorumSetHash);
        Uint32.encode(stream, encodedSCPStatementConfirm.nPrepared);
        SCPBallot.encode(stream, encodedSCPStatementConfirm.commit);
        Uint32.encode(stream, encodedSCPStatementConfirm.nP);
      }
      public static SCPStatementConfirm decode(XdrDataInputStream stream) throws IOException {
        SCPStatementConfirm decodedSCPStatementConfirm = new SCPStatementConfirm();
        decodedSCPStatementConfirm.quorumSetHash = Hash.decode(stream);
        decodedSCPStatementConfirm.nPrepared = Uint32.decode(stream);
        decodedSCPStatementConfirm.commit = SCPBallot.decode(stream);
        decodedSCPStatementConfirm.nP = Uint32.decode(stream);
        return decodedSCPStatementConfirm;
      }

    }
    public static class SCPStatementExternalize {
      public SCPStatementExternalize () {}
      private SCPBallot commit;
      public SCPBallot getcommit() {
        return this.commit;
      }
      public void setcommit(SCPBallot value) {
        this.commit = value;
      }
      private Uint32 nP;
      public Uint32 getnP() {
        return this.nP;
      }
      public void setnP(Uint32 value) {
        this.nP = value;
      }
      private Hash commitQuorumSetHash;
      public Hash getcommitQuorumSetHash() {
        return this.commitQuorumSetHash;
      }
      public void setcommitQuorumSetHash(Hash value) {
        this.commitQuorumSetHash = value;
      }
      public static void encode(XdrDataOutputStream stream, SCPStatementExternalize encodedSCPStatementExternalize) throws IOException{
        SCPBallot.encode(stream, encodedSCPStatementExternalize.commit);
        Uint32.encode(stream, encodedSCPStatementExternalize.nP);
        Hash.encode(stream, encodedSCPStatementExternalize.commitQuorumSetHash);
      }
      public static SCPStatementExternalize decode(XdrDataInputStream stream) throws IOException {
        SCPStatementExternalize decodedSCPStatementExternalize = new SCPStatementExternalize();
        decodedSCPStatementExternalize.commit = SCPBallot.decode(stream);
        decodedSCPStatementExternalize.nP = Uint32.decode(stream);
        decodedSCPStatementExternalize.commitQuorumSetHash = Hash.decode(stream);
        return decodedSCPStatementExternalize;
      }

    }
  }
}
