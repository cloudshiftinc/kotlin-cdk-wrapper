@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

public open class AdotLambdaLayerJavaScriptSdkVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion,
) : CdkObject(cdkObject) {
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
        wrapped.cdkObject
  }
}
