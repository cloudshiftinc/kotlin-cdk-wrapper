package io.cloudshiftdev.awscdk.services.apigateway

public enum class ContentHandling(
  private val cdkObject: software.amazon.awscdk.services.apigateway.ContentHandling,
) {
  CONVERT_TO_BINARY(software.amazon.awscdk.services.apigateway.ContentHandling.CONVERT_TO_BINARY),
  CONVERT_TO_TEXT(software.amazon.awscdk.services.apigateway.ContentHandling.CONVERT_TO_TEXT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ContentHandling):
        ContentHandling = when (cdkObject) {
      software.amazon.awscdk.services.apigateway.ContentHandling.CONVERT_TO_BINARY ->
          ContentHandling.CONVERT_TO_BINARY
      software.amazon.awscdk.services.apigateway.ContentHandling.CONVERT_TO_TEXT ->
          ContentHandling.CONVERT_TO_TEXT
    }

    internal fun unwrap(wrapped: ContentHandling):
        software.amazon.awscdk.services.apigateway.ContentHandling = wrapped.cdkObject
  }
}
