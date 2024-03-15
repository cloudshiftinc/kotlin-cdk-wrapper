@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class HttpMethods(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods,
) {
  GET(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.GET),
  POST(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.POST),
  PUT(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.PUT),
  DELETE(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.DELETE),
  PATCH(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.PATCH),
  HEAD(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.HEAD),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods):
        HttpMethods = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.GET -> HttpMethods.GET
      software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.POST -> HttpMethods.POST
      software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.PUT -> HttpMethods.PUT
      software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.DELETE -> HttpMethods.DELETE
      software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.PATCH -> HttpMethods.PATCH
      software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.HEAD -> HttpMethods.HEAD
    }

    internal fun unwrap(wrapped: HttpMethods):
        software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods = wrapped.cdkObject
  }
}
