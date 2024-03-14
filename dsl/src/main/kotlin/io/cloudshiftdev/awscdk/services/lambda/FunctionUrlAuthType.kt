package io.cloudshiftdev.awscdk.services.lambda

public enum class FunctionUrlAuthType(
  private val cdkObject: software.amazon.awscdk.services.lambda.FunctionUrlAuthType,
) {
  AWS_IAM(software.amazon.awscdk.services.lambda.FunctionUrlAuthType.AWS_IAM),
  NONE(software.amazon.awscdk.services.lambda.FunctionUrlAuthType.NONE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionUrlAuthType):
        FunctionUrlAuthType = when (cdkObject) {
      software.amazon.awscdk.services.lambda.FunctionUrlAuthType.AWS_IAM ->
          FunctionUrlAuthType.AWS_IAM
      software.amazon.awscdk.services.lambda.FunctionUrlAuthType.NONE -> FunctionUrlAuthType.NONE
    }

    internal fun unwrap(wrapped: FunctionUrlAuthType):
        software.amazon.awscdk.services.lambda.FunctionUrlAuthType = wrapped.cdkObject
  }
}
