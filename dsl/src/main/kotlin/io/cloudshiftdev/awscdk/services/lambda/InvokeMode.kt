package io.cloudshiftdev.awscdk.services.lambda

public enum class InvokeMode(
  private val cdkObject: software.amazon.awscdk.services.lambda.InvokeMode,
) {
  BUFFERED(software.amazon.awscdk.services.lambda.InvokeMode.BUFFERED),
  RESPONSE_STREAM(software.amazon.awscdk.services.lambda.InvokeMode.RESPONSE_STREAM),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.InvokeMode): InvokeMode =
        when (cdkObject) {
      software.amazon.awscdk.services.lambda.InvokeMode.BUFFERED -> InvokeMode.BUFFERED
      software.amazon.awscdk.services.lambda.InvokeMode.RESPONSE_STREAM ->
          InvokeMode.RESPONSE_STREAM
    }

    internal fun unwrap(wrapped: InvokeMode): software.amazon.awscdk.services.lambda.InvokeMode =
        wrapped.cdkObject
  }
}
