@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

public enum class SigningBehavior(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.SigningBehavior,
) {
  ALWAYS(software.amazon.awscdk.services.cloudfront.SigningBehavior.ALWAYS),
  NEVER(software.amazon.awscdk.services.cloudfront.SigningBehavior.NEVER),
  NO_OVERRIDE(software.amazon.awscdk.services.cloudfront.SigningBehavior.NO_OVERRIDE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.SigningBehavior):
        SigningBehavior = when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.SigningBehavior.ALWAYS -> SigningBehavior.ALWAYS
      software.amazon.awscdk.services.cloudfront.SigningBehavior.NEVER -> SigningBehavior.NEVER
      software.amazon.awscdk.services.cloudfront.SigningBehavior.NO_OVERRIDE ->
          SigningBehavior.NO_OVERRIDE
    }

    internal fun unwrap(wrapped: SigningBehavior):
        software.amazon.awscdk.services.cloudfront.SigningBehavior = wrapped.cdkObject
  }
}
