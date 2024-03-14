package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

public open class AdotLambdaLayerPythonSdkVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion,
) {
  public open fun layerArn(scope: IConstruct, architecture: Architecture): String =
      unwrap(this).layerArn(scope.let(IConstruct::unwrap), architecture.let(Architecture::unwrap))

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion):
        AdotLambdaLayerPythonSdkVersion = AdotLambdaLayerPythonSdkVersion(cdkObject)

    internal fun unwrap(wrapped: AdotLambdaLayerPythonSdkVersion):
        software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion = wrapped.cdkObject
  }
}
