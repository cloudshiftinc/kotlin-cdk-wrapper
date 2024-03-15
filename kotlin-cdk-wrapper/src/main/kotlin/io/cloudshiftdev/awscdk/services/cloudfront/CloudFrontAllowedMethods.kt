@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

public enum class CloudFrontAllowedMethods(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods,
) {
  GET_HEAD(software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods.GET_HEAD),
  GET_HEAD_OPTIONS(software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods.GET_HEAD_OPTIONS),
  ALL(software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods.ALL),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods):
        CloudFrontAllowedMethods = when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods.GET_HEAD ->
          CloudFrontAllowedMethods.GET_HEAD
      software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods.GET_HEAD_OPTIONS ->
          CloudFrontAllowedMethods.GET_HEAD_OPTIONS
      software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods.ALL ->
          CloudFrontAllowedMethods.ALL
    }

    internal fun unwrap(wrapped: CloudFrontAllowedMethods):
        software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods = wrapped.cdkObject
  }
}
