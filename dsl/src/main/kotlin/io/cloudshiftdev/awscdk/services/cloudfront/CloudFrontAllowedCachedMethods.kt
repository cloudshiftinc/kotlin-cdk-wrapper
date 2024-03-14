package io.cloudshiftdev.awscdk.services.cloudfront

public enum class CloudFrontAllowedCachedMethods(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods,
) {
  GET_HEAD(software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods.GET_HEAD),
  GET_HEAD_OPTIONS(software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods.GET_HEAD_OPTIONS),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods):
        CloudFrontAllowedCachedMethods = when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods.GET_HEAD ->
          CloudFrontAllowedCachedMethods.GET_HEAD
      software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods.GET_HEAD_OPTIONS ->
          CloudFrontAllowedCachedMethods.GET_HEAD_OPTIONS
    }

    internal fun unwrap(wrapped: CloudFrontAllowedCachedMethods):
        software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods =
        wrapped.cdkObject
  }
}
