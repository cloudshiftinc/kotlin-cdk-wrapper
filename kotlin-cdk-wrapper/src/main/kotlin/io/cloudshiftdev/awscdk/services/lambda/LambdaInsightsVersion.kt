@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Version of CloudWatch Lambda Insights.
 *
 * Example:
 *
 * ```
 * String layerArn = "arn:aws:lambda:us-east-1:580247275435:layer:LambdaInsightsExtension:14";
 * Function.Builder.create(this, "MyFunction")
 * .runtime(Runtime.NODEJS_18_X)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * .insightsVersion(LambdaInsightsVersion.fromInsightVersionArn(layerArn))
 * .build();
 * ```
 */
public abstract class LambdaInsightsVersion(
  cdkObject: software.amazon.awscdk.services.lambda.LambdaInsightsVersion,
) : CdkObject(cdkObject) {
  /**
   * The arn of the Lambda Insights extension.
   */
  public open fun layerVersionArn(): String = unwrap(this).getLayerVersionArn()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.LambdaInsightsVersion,
  ) : LambdaInsightsVersion(cdkObject)

  public companion object {
    public val VERSION_1_0_119_0: LambdaInsightsVersion =
        LambdaInsightsVersion.wrap(software.amazon.awscdk.services.lambda.LambdaInsightsVersion.VERSION_1_0_119_0)

    public val VERSION_1_0_135_0: LambdaInsightsVersion =
        LambdaInsightsVersion.wrap(software.amazon.awscdk.services.lambda.LambdaInsightsVersion.VERSION_1_0_135_0)

    public val VERSION_1_0_143_0: LambdaInsightsVersion =
        LambdaInsightsVersion.wrap(software.amazon.awscdk.services.lambda.LambdaInsightsVersion.VERSION_1_0_143_0)

    public val VERSION_1_0_178_0: LambdaInsightsVersion =
        LambdaInsightsVersion.wrap(software.amazon.awscdk.services.lambda.LambdaInsightsVersion.VERSION_1_0_178_0)

    public val VERSION_1_0_229_0: LambdaInsightsVersion =
        LambdaInsightsVersion.wrap(software.amazon.awscdk.services.lambda.LambdaInsightsVersion.VERSION_1_0_229_0)

    public val VERSION_1_0_273_0: LambdaInsightsVersion =
        LambdaInsightsVersion.wrap(software.amazon.awscdk.services.lambda.LambdaInsightsVersion.VERSION_1_0_273_0)

    public val VERSION_1_0_275_0: LambdaInsightsVersion =
        LambdaInsightsVersion.wrap(software.amazon.awscdk.services.lambda.LambdaInsightsVersion.VERSION_1_0_275_0)

    public val VERSION_1_0_295_0: LambdaInsightsVersion =
        LambdaInsightsVersion.wrap(software.amazon.awscdk.services.lambda.LambdaInsightsVersion.VERSION_1_0_295_0)

    public val VERSION_1_0_317_0: LambdaInsightsVersion =
        LambdaInsightsVersion.wrap(software.amazon.awscdk.services.lambda.LambdaInsightsVersion.VERSION_1_0_317_0)

    public val VERSION_1_0_333_0: LambdaInsightsVersion =
        LambdaInsightsVersion.wrap(software.amazon.awscdk.services.lambda.LambdaInsightsVersion.VERSION_1_0_333_0)

    public val VERSION_1_0_54_0: LambdaInsightsVersion =
        LambdaInsightsVersion.wrap(software.amazon.awscdk.services.lambda.LambdaInsightsVersion.VERSION_1_0_54_0)

    public val VERSION_1_0_86_0: LambdaInsightsVersion =
        LambdaInsightsVersion.wrap(software.amazon.awscdk.services.lambda.LambdaInsightsVersion.VERSION_1_0_86_0)

    public val VERSION_1_0_89_0: LambdaInsightsVersion =
        LambdaInsightsVersion.wrap(software.amazon.awscdk.services.lambda.LambdaInsightsVersion.VERSION_1_0_89_0)

    public val VERSION_1_0_98_0: LambdaInsightsVersion =
        LambdaInsightsVersion.wrap(software.amazon.awscdk.services.lambda.LambdaInsightsVersion.VERSION_1_0_98_0)

    public fun fromInsightVersionArn(arn: String): LambdaInsightsVersion =
        software.amazon.awscdk.services.lambda.LambdaInsightsVersion.fromInsightVersionArn(arn).let(LambdaInsightsVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LambdaInsightsVersion):
        LambdaInsightsVersion = CdkObjectWrappers.wrap(cdkObject) as? LambdaInsightsVersion ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaInsightsVersion):
        software.amazon.awscdk.services.lambda.LambdaInsightsVersion = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.LambdaInsightsVersion
  }
}
