@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

/**
 * The collection of versions of the ADOT Lambda Layer for JavaScript SDK.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.AdotLambdaExecWrapper;
 * import io.cloudshiftdev.awscdk.services.lambda.AdotLayerVersion;
 * import io.cloudshiftdev.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion;
 * Function fn = Function.Builder.create(this, "MyFunction")
 * .runtime(Runtime.NODEJS_18_X)
 * .handler("index.handler")
 * .code(Code.fromInline("exports.handler = function(event, ctx, cb) { return cb(null, \"hi\"); }"))
 * .adotInstrumentation(AdotInstrumentationConfig.builder()
 * .layerVersion(AdotLayerVersion.fromJavaScriptSdkLayerVersion(AdotLambdaLayerJavaScriptSdkVersion.LATEST))
 * .execWrapper(AdotLambdaExecWrapper.REGULAR_HANDLER)
 * .build())
 * .build();
 * ```
 */
public open class AdotLambdaLayerJavaScriptSdkVersion(
  cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion,
) : CdkObject(cdkObject) {
  /**
   * The ARN of the Lambda layer.
   *
   * @param scope The binding scope. 
   * @param architecture The architecture of the Lambda layer (either X86_64 or ARM_64). 
   */
  public open fun layerArn(scope: IConstruct, architecture: Architecture): String =
      unwrap(this).layerArn(scope.let(IConstruct::unwrap), architecture.let(Architecture::unwrap))

  public companion object {
    public val LATEST: AdotLambdaLayerJavaScriptSdkVersion =
        AdotLambdaLayerJavaScriptSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion.LATEST)

    public val V1_15_0_1: AdotLambdaLayerJavaScriptSdkVersion =
        AdotLambdaLayerJavaScriptSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion.V1_15_0_1)

    public val V1_16_0: AdotLambdaLayerJavaScriptSdkVersion =
        AdotLambdaLayerJavaScriptSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion.V1_16_0)

    public val V1_17_1: AdotLambdaLayerJavaScriptSdkVersion =
        AdotLambdaLayerJavaScriptSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion.V1_17_1)

    public val V1_18_1: AdotLambdaLayerJavaScriptSdkVersion =
        AdotLambdaLayerJavaScriptSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion.V1_18_1)

    public val V1_7_0: AdotLambdaLayerJavaScriptSdkVersion =
        AdotLambdaLayerJavaScriptSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion.V1_7_0)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion):
        AdotLambdaLayerJavaScriptSdkVersion = AdotLambdaLayerJavaScriptSdkVersion(cdkObject)

    internal fun unwrap(wrapped: AdotLambdaLayerJavaScriptSdkVersion):
        software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion =
        wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion
  }
}
