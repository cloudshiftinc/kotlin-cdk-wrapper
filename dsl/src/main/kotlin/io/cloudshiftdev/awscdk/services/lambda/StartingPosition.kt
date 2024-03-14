package io.cloudshiftdev.awscdk.services.lambda

public enum class StartingPosition(
  private val cdkObject: software.amazon.awscdk.services.lambda.StartingPosition,
) {
  TRIM_HORIZON(software.amazon.awscdk.services.lambda.StartingPosition.TRIM_HORIZON),
  LATEST(software.amazon.awscdk.services.lambda.StartingPosition.LATEST),
  AT_TIMESTAMP(software.amazon.awscdk.services.lambda.StartingPosition.AT_TIMESTAMP),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.StartingPosition):
        StartingPosition = when (cdkObject) {
      software.amazon.awscdk.services.lambda.StartingPosition.TRIM_HORIZON ->
          StartingPosition.TRIM_HORIZON
      software.amazon.awscdk.services.lambda.StartingPosition.LATEST -> StartingPosition.LATEST
      software.amazon.awscdk.services.lambda.StartingPosition.AT_TIMESTAMP ->
          StartingPosition.AT_TIMESTAMP
    }

    internal fun unwrap(wrapped: StartingPosition):
        software.amazon.awscdk.services.lambda.StartingPosition = wrapped.cdkObject
  }
}
