package io.cloudshiftdev.awscdk.services.lambda

import kotlin.String

public abstract class LambdaInsightsVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.LambdaInsightsVersion,
) {
  public open fun layerVersionArn(): String = unwrap(this).getLayerVersionArn()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.LambdaInsightsVersion,
  ) : LambdaInsightsVersion(cdkObject)

  public companion object {
    public open fun fromInsightVersionArn(arn: String): LambdaInsightsVersion =
        software.amazon.awscdk.services.lambda.LambdaInsightsVersion.fromInsightVersionArn(arn).let(LambdaInsightsVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LambdaInsightsVersion):
        LambdaInsightsVersion = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaInsightsVersion):
        software.amazon.awscdk.services.lambda.LambdaInsightsVersion = (wrapped as
        Wrapper).cdkObject
  }
}
