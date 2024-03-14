package io.cloudshiftdev.awscdk.services.apigatewayv2

public enum class HttpConnectionType(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpConnectionType,
) {
  VPC_LINK(software.amazon.awscdk.services.apigatewayv2.HttpConnectionType.VPC_LINK),
  INTERNET(software.amazon.awscdk.services.apigatewayv2.HttpConnectionType.INTERNET),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpConnectionType):
        HttpConnectionType = when (cdkObject) {
      software.amazon.awscdk.services.apigatewayv2.HttpConnectionType.VPC_LINK ->
          HttpConnectionType.VPC_LINK
      software.amazon.awscdk.services.apigatewayv2.HttpConnectionType.INTERNET ->
          HttpConnectionType.INTERNET
    }

    internal fun unwrap(wrapped: HttpConnectionType):
        software.amazon.awscdk.services.apigatewayv2.HttpConnectionType = wrapped.cdkObject
  }
}
