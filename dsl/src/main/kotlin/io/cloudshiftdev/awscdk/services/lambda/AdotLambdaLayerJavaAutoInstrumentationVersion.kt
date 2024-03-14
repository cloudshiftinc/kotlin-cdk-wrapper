package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

public open class AdotLambdaLayerJavaAutoInstrumentationVersion internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion,
) {
  public open fun layerArn(scope: IConstruct, architecture: Architecture): String =
      unwrap(this).layerArn(scope.let(IConstruct::unwrap), architecture.let(Architecture::unwrap))

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion):
        AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion(cdkObject)

    internal fun unwrap(wrapped: AdotLambdaLayerJavaAutoInstrumentationVersion):
        software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion =
        wrapped.cdkObject
  }
}
