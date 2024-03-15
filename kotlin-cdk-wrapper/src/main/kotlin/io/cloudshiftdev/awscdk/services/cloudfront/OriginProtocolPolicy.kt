@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

public enum class OriginProtocolPolicy(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy,
) {
  HTTP_ONLY(software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy.HTTP_ONLY),
  MATCH_VIEWER(software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy.MATCH_VIEWER),
  HTTPS_ONLY(software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy.HTTPS_ONLY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy):
        OriginProtocolPolicy = when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy.HTTP_ONLY ->
          OriginProtocolPolicy.HTTP_ONLY
      software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy.MATCH_VIEWER ->
          OriginProtocolPolicy.MATCH_VIEWER
      software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy.HTTPS_ONLY ->
          OriginProtocolPolicy.HTTPS_ONLY
    }

    internal fun unwrap(wrapped: OriginProtocolPolicy):
        software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy = wrapped.cdkObject
  }
}
