package io.cloudshiftdev.awscdk.services.appsync

public enum class FunctionRuntimeFamily(
  private val cdkObject: software.amazon.awscdk.services.appsync.FunctionRuntimeFamily,
) {
  JS(software.amazon.awscdk.services.appsync.FunctionRuntimeFamily.JS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.FunctionRuntimeFamily):
        FunctionRuntimeFamily = when (cdkObject) {
      software.amazon.awscdk.services.appsync.FunctionRuntimeFamily.JS -> FunctionRuntimeFamily.JS
    }

    internal fun unwrap(wrapped: FunctionRuntimeFamily):
        software.amazon.awscdk.services.appsync.FunctionRuntimeFamily = wrapped.cdkObject
  }
}
