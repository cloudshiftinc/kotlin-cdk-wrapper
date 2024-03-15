@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

public enum class WebSocketAuthorizerType(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerType,
) {
  LAMBDA(software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerType.LAMBDA),
  IAM(software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerType.IAM),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerType):
        WebSocketAuthorizerType = when (cdkObject) {
      software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerType.LAMBDA ->
          WebSocketAuthorizerType.LAMBDA
      software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerType.IAM ->
          WebSocketAuthorizerType.IAM
    }

    internal fun unwrap(wrapped: WebSocketAuthorizerType):
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerType = wrapped.cdkObject
  }
}
