package io.cloudshiftdev.awscdk.services.cognito

public enum class LambdaVersion(
  private val cdkObject: software.amazon.awscdk.services.cognito.LambdaVersion,
) {
  V1_0(software.amazon.awscdk.services.cognito.LambdaVersion.V1_0),
  V2_0(software.amazon.awscdk.services.cognito.LambdaVersion.V2_0),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.LambdaVersion):
        LambdaVersion = when (cdkObject) {
      software.amazon.awscdk.services.cognito.LambdaVersion.V1_0 -> LambdaVersion.V1_0
      software.amazon.awscdk.services.cognito.LambdaVersion.V2_0 -> LambdaVersion.V2_0
    }

    internal fun unwrap(wrapped: LambdaVersion):
        software.amazon.awscdk.services.cognito.LambdaVersion = wrapped.cdkObject
  }
}
