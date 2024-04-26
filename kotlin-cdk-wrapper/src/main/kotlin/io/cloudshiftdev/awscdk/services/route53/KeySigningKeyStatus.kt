@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

public enum class KeySigningKeyStatus(
  private val cdkObject: software.amazon.awscdk.services.route53.KeySigningKeyStatus,
) {
  ACTIVE(software.amazon.awscdk.services.route53.KeySigningKeyStatus.ACTIVE),
  INACTIVE(software.amazon.awscdk.services.route53.KeySigningKeyStatus.INACTIVE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.KeySigningKeyStatus):
        KeySigningKeyStatus = when (cdkObject) {
      software.amazon.awscdk.services.route53.KeySigningKeyStatus.ACTIVE ->
          KeySigningKeyStatus.ACTIVE
      software.amazon.awscdk.services.route53.KeySigningKeyStatus.INACTIVE ->
          KeySigningKeyStatus.INACTIVE
    }

    internal fun unwrap(wrapped: KeySigningKeyStatus):
        software.amazon.awscdk.services.route53.KeySigningKeyStatus = wrapped.cdkObject
  }
}
