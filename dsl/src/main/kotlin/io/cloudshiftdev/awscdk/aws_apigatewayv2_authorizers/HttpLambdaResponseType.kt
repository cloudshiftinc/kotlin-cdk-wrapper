package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

public enum class HttpLambdaResponseType(
  private val cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaResponseType,
) {
  SIMPLE(software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaResponseType.SIMPLE),
  IAM(software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaResponseType.IAM),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaResponseType):
        HttpLambdaResponseType = when (cdkObject) {
      software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaResponseType.SIMPLE ->
          HttpLambdaResponseType.SIMPLE
      software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaResponseType.IAM ->
          HttpLambdaResponseType.IAM
    }

    internal fun unwrap(wrapped: HttpLambdaResponseType):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaResponseType =
        wrapped.cdkObject
  }
}
