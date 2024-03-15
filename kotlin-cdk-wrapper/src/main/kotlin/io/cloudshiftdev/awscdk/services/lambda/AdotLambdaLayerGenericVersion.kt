@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

public open class AdotLambdaLayerGenericVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.AdotLambdaLayerGenericVersion,
) : CdkObject(cdkObject) {
  public open fun layerArn(scope: IConstruct, architecture: Architecture): String =
      unwrap(this).layerArn(scope.let(IConstruct::unwrap), architecture.let(Architecture::unwrap))

  public companion object {
    public val LATEST: AdotLambdaLayerGenericVersion =
        AdotLambdaLayerGenericVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerGenericVersion.LATEST)

    public val V0_62_1: AdotLambdaLayerGenericVersion =
        AdotLambdaLayerGenericVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerGenericVersion.V0_62_1)

    public val V0_82_0: AdotLambdaLayerGenericVersion =
        AdotLambdaLayerGenericVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerGenericVersion.V0_82_0)

    public val V0_84_0: AdotLambdaLayerGenericVersion =
        AdotLambdaLayerGenericVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerGenericVersion.V0_84_0)

    public val V0_88_0: AdotLambdaLayerGenericVersion =
        AdotLambdaLayerGenericVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerGenericVersion.V0_88_0)

    public val V0_90_1: AdotLambdaLayerGenericVersion =
        AdotLambdaLayerGenericVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerGenericVersion.V0_90_1)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerGenericVersion):
        AdotLambdaLayerGenericVersion = AdotLambdaLayerGenericVersion(cdkObject)

    internal fun unwrap(wrapped: AdotLambdaLayerGenericVersion):
        software.amazon.awscdk.services.lambda.AdotLambdaLayerGenericVersion = wrapped.cdkObject
  }
}
