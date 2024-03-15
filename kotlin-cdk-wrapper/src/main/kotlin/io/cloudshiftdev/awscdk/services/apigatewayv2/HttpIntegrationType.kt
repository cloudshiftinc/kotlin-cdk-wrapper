@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

public enum class HttpIntegrationType(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpIntegrationType,
) {
  HTTP_PROXY(software.amazon.awscdk.services.apigatewayv2.HttpIntegrationType.HTTP_PROXY),
  AWS_PROXY(software.amazon.awscdk.services.apigatewayv2.HttpIntegrationType.AWS_PROXY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpIntegrationType):
        HttpIntegrationType = when (cdkObject) {
      software.amazon.awscdk.services.apigatewayv2.HttpIntegrationType.HTTP_PROXY ->
          HttpIntegrationType.HTTP_PROXY
      software.amazon.awscdk.services.apigatewayv2.HttpIntegrationType.AWS_PROXY ->
          HttpIntegrationType.AWS_PROXY
    }

    internal fun unwrap(wrapped: HttpIntegrationType):
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationType = wrapped.cdkObject
  }
}
