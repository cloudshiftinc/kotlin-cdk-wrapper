@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

public enum class HttpMethod(
  private val cdkObject: software.amazon.awscdk.services.events.HttpMethod,
) {
  POST(software.amazon.awscdk.services.events.HttpMethod.POST),
  GET(software.amazon.awscdk.services.events.HttpMethod.GET),
  HEAD(software.amazon.awscdk.services.events.HttpMethod.HEAD),
  OPTIONS(software.amazon.awscdk.services.events.HttpMethod.OPTIONS),
  PUT(software.amazon.awscdk.services.events.HttpMethod.PUT),
  PATCH(software.amazon.awscdk.services.events.HttpMethod.PATCH),
  DELETE(software.amazon.awscdk.services.events.HttpMethod.DELETE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.HttpMethod): HttpMethod =
        when (cdkObject) {
      software.amazon.awscdk.services.events.HttpMethod.POST -> HttpMethod.POST
      software.amazon.awscdk.services.events.HttpMethod.GET -> HttpMethod.GET
      software.amazon.awscdk.services.events.HttpMethod.HEAD -> HttpMethod.HEAD
      software.amazon.awscdk.services.events.HttpMethod.OPTIONS -> HttpMethod.OPTIONS
      software.amazon.awscdk.services.events.HttpMethod.PUT -> HttpMethod.PUT
      software.amazon.awscdk.services.events.HttpMethod.PATCH -> HttpMethod.PATCH
      software.amazon.awscdk.services.events.HttpMethod.DELETE -> HttpMethod.DELETE
    }

    internal fun unwrap(wrapped: HttpMethod): software.amazon.awscdk.services.events.HttpMethod =
        wrapped.cdkObject
  }
}
