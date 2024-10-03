@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

public enum class OriginAccessControlOriginType(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.OriginAccessControlOriginType,
) {
  S3(software.amazon.awscdk.services.cloudfront.OriginAccessControlOriginType.S3),
  LAMBDA(software.amazon.awscdk.services.cloudfront.OriginAccessControlOriginType.LAMBDA),
  MEDIASTORE(software.amazon.awscdk.services.cloudfront.OriginAccessControlOriginType.MEDIASTORE),
  MEDIAPACKAGEV2(software.amazon.awscdk.services.cloudfront.OriginAccessControlOriginType.MEDIAPACKAGEV2),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginAccessControlOriginType):
        OriginAccessControlOriginType = when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.OriginAccessControlOriginType.S3 ->
          OriginAccessControlOriginType.S3
      software.amazon.awscdk.services.cloudfront.OriginAccessControlOriginType.LAMBDA ->
          OriginAccessControlOriginType.LAMBDA
      software.amazon.awscdk.services.cloudfront.OriginAccessControlOriginType.MEDIASTORE ->
          OriginAccessControlOriginType.MEDIASTORE
      software.amazon.awscdk.services.cloudfront.OriginAccessControlOriginType.MEDIAPACKAGEV2 ->
          OriginAccessControlOriginType.MEDIAPACKAGEV2
    }

    internal fun unwrap(wrapped: OriginAccessControlOriginType):
        software.amazon.awscdk.services.cloudfront.OriginAccessControlOriginType = wrapped.cdkObject
  }
}
