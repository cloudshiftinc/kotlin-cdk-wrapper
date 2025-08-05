@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

/**
 * The collection of versions of the ADOT Lambda Layer for Java auto-instrumentation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * AdotLambdaLayerJavaAutoInstrumentationVersion adotLambdaLayerJavaAutoInstrumentationVersion =
 * AdotLambdaLayerJavaAutoInstrumentationVersion.LATEST;
 * ```
 */
public open class AdotLambdaLayerJavaAutoInstrumentationVersion(
  cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion,
) : CdkObject(cdkObject) {
  /**
   * The ARN of the Lambda layer.
   *
   * @param scope The binding scope. 
   * @param architecture The architecture of the Lambda layer (either X86_64 or ARM_64). 
   */
  public open fun layerArn(scope: IConstruct, architecture: Architecture): String =
      unwrap(this).layerArn(scope.let(IConstruct.Companion::unwrap),
      architecture.let(Architecture.Companion::unwrap))

  public companion object {
    public val LATEST: AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion.LATEST)

    public val V1_19_2: AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion.V1_19_2)

    public val V1_28_1: AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion.V1_28_1)

    public val V1_30_0: AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion.V1_30_0)

    public val V1_31_0: AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion.V1_31_0)

    public val V1_32_0: AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion.V1_32_0)

    public val V1_32_0_1: AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion.V1_32_0_1)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion):
        AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion(cdkObject)

    internal fun unwrap(wrapped: AdotLambdaLayerJavaAutoInstrumentationVersion):
        software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion =
        wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion
  }
}
