// Automatically generated on 2015-11-05T11:21:06-08:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  typedef opaque Thresholds[4];

//  ===========================================================================
public class Thresholds  {
  private byte[] Thresholds;
  public byte[] getThresholds() {
    return this.Thresholds;
  }
  public void setThresholds(byte[] value) {
    this.Thresholds = value;
  }
  public static void encode(XdrDataOutputStream stream, Thresholds  encodedThresholds) throws IOException {
  int Thresholdssize = encodedThresholds.Thresholds.length;
  stream.write(encodedThresholds.getThresholds(), 0, Thresholdssize);
  }
  public static Thresholds decode(XdrDataInputStream stream) throws IOException {
    Thresholds decodedThresholds = new Thresholds();
  int Thresholdssize = 4;
  decodedThresholds.Thresholds = new byte[Thresholdssize];
  stream.read(decodedThresholds.Thresholds, 0, Thresholdssize);
    return decodedThresholds;
  }
}
