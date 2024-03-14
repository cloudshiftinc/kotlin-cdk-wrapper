package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public abstract class LambdaInsightsVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.LambdaInsightsVersion,
) : CdkObject(cdkObject) {
  /**
   * The arn of the Lambda Insights extension.
   */
  public open fun layerVersionArn(): String = unwrap(this).getLayerVersionArn()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.LambdaInsightsVersion,
  ) : LambdaInsightsVersion(cdkObject)

  public companion object {
    public fun fromInsightVersionArn(arn: String): LambdaInsightsVersion =
        software.amazon.awscdk.services.lambda.LambdaInsightsVersion.fromInsightVersionArn(arn).let(LambdaInsightsVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LambdaInsightsVersion):
        LambdaInsightsVersion = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaInsightsVersion):
        software.amazon.awscdk.services.lambda.LambdaInsightsVersion = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.LambdaInsightsVersion
  }
}
