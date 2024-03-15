@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

public enum class KeyUsage(
  private val cdkObject: software.amazon.awscdk.services.kms.KeyUsage,
) {
  ENCRYPT_DECRYPT(software.amazon.awscdk.services.kms.KeyUsage.ENCRYPT_DECRYPT),
  SIGN_VERIFY(software.amazon.awscdk.services.kms.KeyUsage.SIGN_VERIFY),
  GENERATE_VERIFY_MAC(software.amazon.awscdk.services.kms.KeyUsage.GENERATE_VERIFY_MAC),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.KeyUsage): KeyUsage = when
        (cdkObject) {
      software.amazon.awscdk.services.kms.KeyUsage.ENCRYPT_DECRYPT -> KeyUsage.ENCRYPT_DECRYPT
      software.amazon.awscdk.services.kms.KeyUsage.SIGN_VERIFY -> KeyUsage.SIGN_VERIFY
      software.amazon.awscdk.services.kms.KeyUsage.GENERATE_VERIFY_MAC ->
          KeyUsage.GENERATE_VERIFY_MAC
    }

    internal fun unwrap(wrapped: KeyUsage): software.amazon.awscdk.services.kms.KeyUsage =
        wrapped.cdkObject
  }
}
