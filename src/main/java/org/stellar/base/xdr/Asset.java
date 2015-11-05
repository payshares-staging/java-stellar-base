// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  union Asset switch (AssetType type)
//  {
//  case ASSET_TYPE_NATIVE: // Not credit
//      void;
//  
//  case ASSET_TYPE_CREDIT_ALPHANUM4:
//      struct
//      {
//          opaque assetCode[4]; // 1 to 4 characters
//          AccountID issuer;
//      } alphaNum4;
//  
//  case ASSET_TYPE_CREDIT_ALPHANUM12:
//      struct
//      {
//          opaque assetCode[12]; // 5 to 12 characters
//          AccountID issuer;
//      } alphaNum12;
//  
//      // add other asset types here in the future
//  };

//  ===========================================================================
public class Asset  {
  public Asset () {}
  AssetType type;
  public AssetType getDiscriminant() {
    return this.type;
  }
  public void setDiscriminant(AssetType value) {
    this.type = value;
  }
  private AssetAlphaNum4 alphaNum4;
  public AssetAlphaNum4 getalphaNum4() {
    return this.alphaNum4;
  }
  public void setalphaNum4(AssetAlphaNum4 value) {
    this.alphaNum4 = value;
  }
  private AssetAlphaNum12 alphaNum12;
  public AssetAlphaNum12 getalphaNum12() {
    return this.alphaNum12;
  }
  public void setalphaNum12(AssetAlphaNum12 value) {
    this.alphaNum12 = value;
  }
  public static void encode(XdrDataOutputStream stream, Asset encodedAsset) throws IOException {
  stream.writeInt(encodedAsset.getDiscriminant().getValue());
  switch (encodedAsset.getDiscriminant()) {
  case ASSET_TYPE_NATIVE:
  break;
  case ASSET_TYPE_CREDIT_ALPHANUM4:
  AssetAlphaNum4.encode(stream, encodedAsset.alphaNum4);
  break;
  case ASSET_TYPE_CREDIT_ALPHANUM12:
  AssetAlphaNum12.encode(stream, encodedAsset.alphaNum12);
  break;
  }
  }
  public static Asset decode(XdrDataInputStream stream) throws IOException {
    Asset decodedAsset = new Asset();
    switch (decodedAsset.getDiscriminant()) {
  case ASSET_TYPE_NATIVE:
  break;
  case ASSET_TYPE_CREDIT_ALPHANUM4:
  decodedAsset.alphaNum4 = AssetAlphaNum4.decode(stream);
  break;
  case ASSET_TYPE_CREDIT_ALPHANUM12:
  decodedAsset.alphaNum12 = AssetAlphaNum12.decode(stream);
  break;
  }
    return decodedAsset;
  }

  public static class AssetAlphaNum4 {
    public AssetAlphaNum4 () {}
    private byte[] assetCode;
    public byte[] getassetCode() {
      return this.assetCode;
    }
    public void setassetCode(byte[] value) {
      this.assetCode = value;
    }
    private AccountID issuer;
    public AccountID getissuer() {
      return this.issuer;
    }
    public void setissuer(AccountID value) {
      this.issuer = value;
    }
    public static void encode(XdrDataOutputStream stream, AssetAlphaNum4 encodedAssetAlphaNum4) throws IOException{
      int assetCodesize = encodedAssetAlphaNum4.assetCode.length;
      stream.write(encodedAssetAlphaNum4.getassetCode(), 0, assetCodesize);
      AccountID.encode(stream, encodedAssetAlphaNum4.issuer);
    }
    public static AssetAlphaNum4 decode(XdrDataInputStream stream) throws IOException {
      AssetAlphaNum4 decodedAssetAlphaNum4 = new AssetAlphaNum4();
      int assetCodesize = 4;
      decodedAssetAlphaNum4.assetCode = new byte[assetCodesize];
      stream.read(decodedAssetAlphaNum4.assetCode, 0, assetCodesize);
      decodedAssetAlphaNum4.issuer = AccountID.decode(stream);
      return decodedAssetAlphaNum4;
    }

  }
  public static class AssetAlphaNum12 {
    public AssetAlphaNum12 () {}
    private byte[] assetCode;
    public byte[] getassetCode() {
      return this.assetCode;
    }
    public void setassetCode(byte[] value) {
      this.assetCode = value;
    }
    private AccountID issuer;
    public AccountID getissuer() {
      return this.issuer;
    }
    public void setissuer(AccountID value) {
      this.issuer = value;
    }
    public static void encode(XdrDataOutputStream stream, AssetAlphaNum12 encodedAssetAlphaNum12) throws IOException{
      int assetCodesize = encodedAssetAlphaNum12.assetCode.length;
      stream.write(encodedAssetAlphaNum12.getassetCode(), 0, assetCodesize);
      AccountID.encode(stream, encodedAssetAlphaNum12.issuer);
    }
    public static AssetAlphaNum12 decode(XdrDataInputStream stream) throws IOException {
      AssetAlphaNum12 decodedAssetAlphaNum12 = new AssetAlphaNum12();
      int assetCodesize = 12;
      decodedAssetAlphaNum12.assetCode = new byte[assetCodesize];
      stream.read(decodedAssetAlphaNum12.assetCode, 0, assetCodesize);
      decodedAssetAlphaNum12.issuer = AccountID.decode(stream);
      return decodedAssetAlphaNum12;
    }

  }
}
