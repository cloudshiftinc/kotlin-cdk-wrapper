@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

public enum class IntegrationType(
  private val cdkObject: software.amazon.awscdk.services.apigateway.IntegrationType,
) {
  AWS(software.amazon.awscdk.services.apigateway.IntegrationType.AWS),
  AWS_PROXY(software.amazon.awscdk.services.apigateway.IntegrationType.AWS_PROXY),
  HTTP(software.amazon.awscdk.services.apigateway.IntegrationType.HTTP),
  HTTP_PROXY(software.amazon.awscdk.services.apigateway.IntegrationType.HTTP_PROXY),
  MOCK(software.amazon.awscdk.services.apigateway.IntegrationType.MOCK),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IntegrationType):
        IntegrationType = when (cdkObject) {
      software.amazon.awscdk.services.apigateway.IntegrationType.AWS -> IntegrationType.AWS
      software.amazon.awscdk.services.apigateway.IntegrationType.AWS_PROXY ->
          IntegrationType.AWS_PROXY
      software.amazon.awscdk.services.apigateway.IntegrationType.HTTP -> IntegrationType.HTTP
      software.amazon.awscdk.services.apigateway.IntegrationType.HTTP_PROXY ->
          IntegrationType.HTTP_PROXY
      software.amazon.awscdk.services.apigateway.IntegrationType.MOCK -> IntegrationType.MOCK
    }

    internal fun unwrap(wrapped: IntegrationType):
        software.amazon.awscdk.services.apigateway.IntegrationType = wrapped.cdkObject
  }
}
