@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

public open class AdotLambdaLayerJavaSdkVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaSdkVersion,
) : CdkObject(cdkObject) {
  public open fun layerArn(scope: IConstruct, architecture: Architecture): String =
      unwrap(this).layerArn(scope.let(IConstruct::unwrap), architecture.let(Architecture::unwrap))

  public companion object {
    public val LATEST: AdotLambdaLayerJavaSdkVersion =
        AdotLambdaLayerJavaSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaSdkVersion.LATEST)

    public val V1_19_0: AdotLambdaLayerJavaSdkVersion =
        AdotLambdaLayerJavaSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaSdkVersion.V1_19_0)

    public val V1_28_1: AdotLambdaLayerJavaSdkVersion =
        AdotLambdaLayerJavaSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaSdkVersion.V1_28_1)

    public val V1_30_0: AdotLambdaLayerJavaSdkVersion =
        AdotLambdaLayerJavaSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaSdkVersion.V1_30_0)

    public val V1_31_0: AdotLambdaLayerJavaSdkVersion =
        AdotLambdaLayerJavaSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaSdkVersion.V1_31_0)

    public val V1_32_0: AdotLambdaLayerJavaSdkVersion =
        AdotLambdaLayerJavaSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaSdkVersion.V1_32_0)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaSdkVersion):
        AdotLambdaLayerJavaSdkVersion = AdotLambdaLayerJavaSdkVersion(cdkObject)

    internal fun unwrap(wrapped: AdotLambdaLayerJavaSdkVersion):
        software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaSdkVersion = wrapped.cdkObject
  }
}