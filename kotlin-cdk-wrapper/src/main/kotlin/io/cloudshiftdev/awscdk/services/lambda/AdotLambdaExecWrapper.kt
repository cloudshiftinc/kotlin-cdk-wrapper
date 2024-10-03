@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

public enum class AdotLambdaExecWrapper(
  private val cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper,
) {
  REGULAR_HANDLER(software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper.REGULAR_HANDLER),
  PROXY_HANDLER(software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper.PROXY_HANDLER),
  STREAM_HANDLER(software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper.STREAM_HANDLER),
  INSTRUMENT_HANDLER(software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper.INSTRUMENT_HANDLER),
  SQS_HANDLER(software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper.SQS_HANDLER),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper):
        AdotLambdaExecWrapper = when (cdkObject) {
      software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper.REGULAR_HANDLER ->
          AdotLambdaExecWrapper.REGULAR_HANDLER
      software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper.PROXY_HANDLER ->
          AdotLambdaExecWrapper.PROXY_HANDLER
      software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper.STREAM_HANDLER ->
          AdotLambdaExecWrapper.STREAM_HANDLER
      software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper.INSTRUMENT_HANDLER ->
          AdotLambdaExecWrapper.INSTRUMENT_HANDLER
      software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper.SQS_HANDLER ->
          AdotLambdaExecWrapper.SQS_HANDLER
    }

    internal fun unwrap(wrapped: AdotLambdaExecWrapper):
        software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper = wrapped.cdkObject
  }
}
