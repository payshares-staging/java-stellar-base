// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  union SetOptionsResult switch (SetOptionsResultCode code)
//  {
//  case SET_OPTIONS_SUCCESS:
//      void;
//  default:
//      void;
//  };

//  ===========================================================================
public class SetOptionsResult  {
  public SetOptionsResult () {}
  SetOptionsResultCode code;
  public SetOptionsResultCode getDiscriminant() {
    return this.code;
  }
  public void setDiscriminant(SetOptionsResultCode value) {
    this.code = value;
  }
  public static void encode(XdrDataOutputStream stream, SetOptionsResult encodedSetOptionsResult) throws IOException {
  stream.writeInt(encodedSetOptionsResult.getDiscriminant().getValue());
  switch (encodedSetOptionsResult.getDiscriminant()) {
  case SET_OPTIONS_SUCCESS:
  break;
  default:
  break;
  }
  }
  public static SetOptionsResult decode(XdrDataInputStream stream) throws IOException {
    SetOptionsResult decodedSetOptionsResult = new SetOptionsResult();
    switch (decodedSetOptionsResult.getDiscriminant()) {
  case SET_OPTIONS_SUCCESS:
  break;
  default:
  break;
  }
    return decodedSetOptionsResult;
  }
}
