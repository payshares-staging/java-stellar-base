// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  enum MessageType
//  {
//      ERROR_MSG = 0,
//      HELLO = 1,
//      AUTH = 2,
//      DONT_HAVE = 3,
//  
//      GET_PEERS = 4, // gets a list of peers this guy knows about
//      PEERS = 5,
//  
//      GET_TX_SET = 6, // gets a particular txset by hash
//      TX_SET = 7,
//  
//      TRANSACTION = 8, // pass on a tx you have heard about
//  
//      // SCP
//      GET_SCP_QUORUMSET = 9,
//      SCP_QUORUMSET = 10,
//      SCP_MESSAGE = 11
//  };

//  ===========================================================================
public enum MessageType  {
  ERROR_MSG(0),
  HELLO(1),
  AUTH(2),
  DONT_HAVE(3),
  GET_PEERS(4),
  PEERS(5),
  GET_TX_SET(6),
  TX_SET(7),
  TRANSACTION(8),
  GET_SCP_QUORUMSET(9),
  SCP_QUORUMSET(10),
  SCP_MESSAGE(11),
  ;
  private int mValue;

  MessageType(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  static MessageType decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0: return ERROR_MSG;
      case 1: return HELLO;
      case 2: return AUTH;
      case 3: return DONT_HAVE;
      case 4: return GET_PEERS;
      case 5: return PEERS;
      case 6: return GET_TX_SET;
      case 7: return TX_SET;
      case 8: return TRANSACTION;
      case 9: return GET_SCP_QUORUMSET;
      case 10: return SCP_QUORUMSET;
      case 11: return SCP_MESSAGE;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  static void encode(XdrDataOutputStream stream, MessageType value) throws IOException {
    stream.writeInt(value.getValue());
  }
}
