package io.cloudshiftdev.awscdk.services.cloudfront

public enum class ViewerProtocolPolicy(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy,
) {
  HTTPS_ONLY(software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy.HTTPS_ONLY),
  REDIRECT_TO_HTTPS(software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy.REDIRECT_TO_HTTPS),
  ALLOW_ALL(software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy.ALLOW_ALL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy):
        ViewerProtocolPolicy = when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy.HTTPS_ONLY ->
          ViewerProtocolPolicy.HTTPS_ONLY
      software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy.REDIRECT_TO_HTTPS ->
          ViewerProtocolPolicy.REDIRECT_TO_HTTPS
      software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy.ALLOW_ALL ->
          ViewerProtocolPolicy.ALLOW_ALL
    }

    internal fun unwrap(wrapped: ViewerProtocolPolicy):
        software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy = wrapped.cdkObject
  }
}
