package io.cloudshiftdev.awscdk.services.kms

public enum class KeySpec(
  private val cdkObject: software.amazon.awscdk.services.kms.KeySpec,
) {
  SYMMETRIC_DEFAULT(software.amazon.awscdk.services.kms.KeySpec.SYMMETRIC_DEFAULT),
  RSA_2048(software.amazon.awscdk.services.kms.KeySpec.RSA_2048),
  RSA_3072(software.amazon.awscdk.services.kms.KeySpec.RSA_3072),
  RSA_4096(software.amazon.awscdk.services.kms.KeySpec.RSA_4096),
  ECC_NIST_P256(software.amazon.awscdk.services.kms.KeySpec.ECC_NIST_P256),
  ECC_NIST_P384(software.amazon.awscdk.services.kms.KeySpec.ECC_NIST_P384),
  ECC_NIST_P521(software.amazon.awscdk.services.kms.KeySpec.ECC_NIST_P521),
  ECC_SECG_P256K1(software.amazon.awscdk.services.kms.KeySpec.ECC_SECG_P256K1),
  HMAC_224(software.amazon.awscdk.services.kms.KeySpec.HMAC_224),
  HMAC_256(software.amazon.awscdk.services.kms.KeySpec.HMAC_256),
  HMAC_384(software.amazon.awscdk.services.kms.KeySpec.HMAC_384),
  HMAC_512(software.amazon.awscdk.services.kms.KeySpec.HMAC_512),
  SM2(software.amazon.awscdk.services.kms.KeySpec.SM2),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.KeySpec): KeySpec = when
        (cdkObject) {
      software.amazon.awscdk.services.kms.KeySpec.SYMMETRIC_DEFAULT -> KeySpec.SYMMETRIC_DEFAULT
      software.amazon.awscdk.services.kms.KeySpec.RSA_2048 -> KeySpec.RSA_2048
      software.amazon.awscdk.services.kms.KeySpec.RSA_3072 -> KeySpec.RSA_3072
      software.amazon.awscdk.services.kms.KeySpec.RSA_4096 -> KeySpec.RSA_4096
      software.amazon.awscdk.services.kms.KeySpec.ECC_NIST_P256 -> KeySpec.ECC_NIST_P256
      software.amazon.awscdk.services.kms.KeySpec.ECC_NIST_P384 -> KeySpec.ECC_NIST_P384
      software.amazon.awscdk.services.kms.KeySpec.ECC_NIST_P521 -> KeySpec.ECC_NIST_P521
      software.amazon.awscdk.services.kms.KeySpec.ECC_SECG_P256K1 -> KeySpec.ECC_SECG_P256K1
      software.amazon.awscdk.services.kms.KeySpec.HMAC_224 -> KeySpec.HMAC_224
      software.amazon.awscdk.services.kms.KeySpec.HMAC_256 -> KeySpec.HMAC_256
      software.amazon.awscdk.services.kms.KeySpec.HMAC_384 -> KeySpec.HMAC_384
      software.amazon.awscdk.services.kms.KeySpec.HMAC_512 -> KeySpec.HMAC_512
      software.amazon.awscdk.services.kms.KeySpec.SM2 -> KeySpec.SM2
    }

    internal fun unwrap(wrapped: KeySpec): software.amazon.awscdk.services.kms.KeySpec =
        wrapped.cdkObject
  }
}
