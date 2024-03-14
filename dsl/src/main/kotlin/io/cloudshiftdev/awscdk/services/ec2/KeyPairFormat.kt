package io.cloudshiftdev.awscdk.services.ec2

public enum class KeyPairFormat(
  private val cdkObject: software.amazon.awscdk.services.ec2.KeyPairFormat,
) {
  PPK(software.amazon.awscdk.services.ec2.KeyPairFormat.PPK),
  PEM(software.amazon.awscdk.services.ec2.KeyPairFormat.PEM),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.KeyPairFormat): KeyPairFormat =
        when (cdkObject) {
      software.amazon.awscdk.services.ec2.KeyPairFormat.PPK -> KeyPairFormat.PPK
      software.amazon.awscdk.services.ec2.KeyPairFormat.PEM -> KeyPairFormat.PEM
    }

    internal fun unwrap(wrapped: KeyPairFormat): software.amazon.awscdk.services.ec2.KeyPairFormat =
        wrapped.cdkObject
  }
}
