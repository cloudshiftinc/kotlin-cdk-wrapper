package io.cloudshiftdev.awscdk.services.ec2

public enum class KeyPairType(
  private val cdkObject: software.amazon.awscdk.services.ec2.KeyPairType,
) {
  RSA(software.amazon.awscdk.services.ec2.KeyPairType.RSA),
  ED25519(software.amazon.awscdk.services.ec2.KeyPairType.ED25519),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.KeyPairType): KeyPairType =
        when (cdkObject) {
      software.amazon.awscdk.services.ec2.KeyPairType.RSA -> KeyPairType.RSA
      software.amazon.awscdk.services.ec2.KeyPairType.ED25519 -> KeyPairType.ED25519
    }

    internal fun unwrap(wrapped: KeyPairType): software.amazon.awscdk.services.ec2.KeyPairType =
        wrapped.cdkObject
  }
}
