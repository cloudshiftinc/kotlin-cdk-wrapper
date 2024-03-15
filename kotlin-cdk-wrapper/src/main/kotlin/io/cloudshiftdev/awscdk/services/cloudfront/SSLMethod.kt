@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

public enum class SSLMethod(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.SSLMethod,
) {
  SNI(software.amazon.awscdk.services.cloudfront.SSLMethod.SNI),
  VIP(software.amazon.awscdk.services.cloudfront.SSLMethod.VIP),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.SSLMethod): SSLMethod =
        when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.SSLMethod.SNI -> SSLMethod.SNI
      software.amazon.awscdk.services.cloudfront.SSLMethod.VIP -> SSLMethod.VIP
    }

    internal fun unwrap(wrapped: SSLMethod): software.amazon.awscdk.services.cloudfront.SSLMethod =
        wrapped.cdkObject
  }
}
