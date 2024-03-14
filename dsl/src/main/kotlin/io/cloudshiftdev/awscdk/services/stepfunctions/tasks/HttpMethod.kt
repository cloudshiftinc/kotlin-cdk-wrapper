package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class HttpMethod(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod,
) {
  GET(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.GET),
  POST(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.POST),
  PUT(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.PUT),
  DELETE(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.DELETE),
  PATCH(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.PATCH),
  HEAD(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.HEAD),
  OPTIONS(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.OPTIONS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod):
        HttpMethod = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.GET -> HttpMethod.GET
      software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.POST -> HttpMethod.POST
      software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.PUT -> HttpMethod.PUT
      software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.DELETE -> HttpMethod.DELETE
      software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.PATCH -> HttpMethod.PATCH
      software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.HEAD -> HttpMethod.HEAD
      software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.OPTIONS -> HttpMethod.OPTIONS
    }

    internal fun unwrap(wrapped: HttpMethod):
        software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod = wrapped.cdkObject
  }
}
