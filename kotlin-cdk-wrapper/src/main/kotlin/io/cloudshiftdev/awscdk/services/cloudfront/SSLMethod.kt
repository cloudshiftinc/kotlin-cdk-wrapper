@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

public enum class SSLMethod(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.SSLMethod,
) {
  SNI(software.amazon.awscdk.services.cloudfront.SSLMethod.SNI),
  VIP(software.amazon.awscdk.services.cloudfront.SSLMethod.VIP),
  STATIC_IP(software.amazon.awscdk.services.cloudfront.SSLMethod.STATIC_IP),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.SSLMethod): SSLMethod =
        when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.SSLMethod.SNI -> SSLMethod.SNI
      software.amazon.awscdk.services.cloudfront.SSLMethod.VIP -> SSLMethod.VIP
      software.amazon.awscdk.services.cloudfront.SSLMethod.STATIC_IP -> SSLMethod.STATIC_IP
    }

    internal fun unwrap(wrapped: SSLMethod): software.amazon.awscdk.services.cloudfront.SSLMethod =
        wrapped.cdkObject
  }
}
