@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

public enum class SigningProtocol(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.SigningProtocol,
) {
  SIGV4(software.amazon.awscdk.services.cloudfront.SigningProtocol.SIGV4),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.SigningProtocol):
        SigningProtocol = when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.SigningProtocol.SIGV4 -> SigningProtocol.SIGV4
    }

    internal fun unwrap(wrapped: SigningProtocol):
        software.amazon.awscdk.services.cloudfront.SigningProtocol = wrapped.cdkObject
  }
}
