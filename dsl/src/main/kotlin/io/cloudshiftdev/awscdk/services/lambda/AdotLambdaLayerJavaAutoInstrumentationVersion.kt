package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

public open class AdotLambdaLayerJavaAutoInstrumentationVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion,
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
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion):
        AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion(cdkObject)

    internal fun unwrap(wrapped: AdotLambdaLayerJavaAutoInstrumentationVersion):
        software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion =
        wrapped.cdkObject
  }
}
