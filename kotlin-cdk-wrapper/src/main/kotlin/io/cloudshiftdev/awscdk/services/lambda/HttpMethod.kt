@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

public enum class HttpMethod(
  private val cdkObject: software.amazon.awscdk.services.lambda.HttpMethod,
) {
  GET(software.amazon.awscdk.services.lambda.HttpMethod.GET),
  PUT(software.amazon.awscdk.services.lambda.HttpMethod.PUT),
  HEAD(software.amazon.awscdk.services.lambda.HttpMethod.HEAD),
  POST(software.amazon.awscdk.services.lambda.HttpMethod.POST),
  DELETE(software.amazon.awscdk.services.lambda.HttpMethod.DELETE),
  PATCH(software.amazon.awscdk.services.lambda.HttpMethod.PATCH),
  OPTIONS(software.amazon.awscdk.services.lambda.HttpMethod.OPTIONS),
  ALL(software.amazon.awscdk.services.lambda.HttpMethod.ALL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.HttpMethod): HttpMethod =
        when (cdkObject) {
      software.amazon.awscdk.services.lambda.HttpMethod.GET -> HttpMethod.GET
      software.amazon.awscdk.services.lambda.HttpMethod.PUT -> HttpMethod.PUT
      software.amazon.awscdk.services.lambda.HttpMethod.HEAD -> HttpMethod.HEAD
      software.amazon.awscdk.services.lambda.HttpMethod.POST -> HttpMethod.POST
      software.amazon.awscdk.services.lambda.HttpMethod.DELETE -> HttpMethod.DELETE
      software.amazon.awscdk.services.lambda.HttpMethod.PATCH -> HttpMethod.PATCH
      software.amazon.awscdk.services.lambda.HttpMethod.OPTIONS -> HttpMethod.OPTIONS
      software.amazon.awscdk.services.lambda.HttpMethod.ALL -> HttpMethod.ALL
    }

    internal fun unwrap(wrapped: HttpMethod): software.amazon.awscdk.services.lambda.HttpMethod =
        wrapped.cdkObject
  }
}
