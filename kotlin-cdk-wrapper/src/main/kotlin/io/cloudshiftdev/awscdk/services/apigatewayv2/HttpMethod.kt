@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

public enum class HttpMethod(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpMethod,
) {
  ANY(software.amazon.awscdk.services.apigatewayv2.HttpMethod.ANY),
  DELETE(software.amazon.awscdk.services.apigatewayv2.HttpMethod.DELETE),
  GET(software.amazon.awscdk.services.apigatewayv2.HttpMethod.GET),
  HEAD(software.amazon.awscdk.services.apigatewayv2.HttpMethod.HEAD),
  OPTIONS(software.amazon.awscdk.services.apigatewayv2.HttpMethod.OPTIONS),
  PATCH(software.amazon.awscdk.services.apigatewayv2.HttpMethod.PATCH),
  POST(software.amazon.awscdk.services.apigatewayv2.HttpMethod.POST),
  PUT(software.amazon.awscdk.services.apigatewayv2.HttpMethod.PUT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpMethod):
        HttpMethod = when (cdkObject) {
      software.amazon.awscdk.services.apigatewayv2.HttpMethod.ANY -> HttpMethod.ANY
      software.amazon.awscdk.services.apigatewayv2.HttpMethod.DELETE -> HttpMethod.DELETE
      software.amazon.awscdk.services.apigatewayv2.HttpMethod.GET -> HttpMethod.GET
      software.amazon.awscdk.services.apigatewayv2.HttpMethod.HEAD -> HttpMethod.HEAD
      software.amazon.awscdk.services.apigatewayv2.HttpMethod.OPTIONS -> HttpMethod.OPTIONS
      software.amazon.awscdk.services.apigatewayv2.HttpMethod.PATCH -> HttpMethod.PATCH
      software.amazon.awscdk.services.apigatewayv2.HttpMethod.POST -> HttpMethod.POST
      software.amazon.awscdk.services.apigatewayv2.HttpMethod.PUT -> HttpMethod.PUT
    }

    internal fun unwrap(wrapped: HttpMethod):
        software.amazon.awscdk.services.apigatewayv2.HttpMethod = wrapped.cdkObject
  }
}
