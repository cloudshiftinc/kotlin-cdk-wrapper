package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

public open class AdotLambdaLayerJavaScriptSdkVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion,
) {
  public open fun layerArn(scope: IConstruct, architecture: Architecture): String =
      unwrap(this).layerArn(scope.let(IConstruct::unwrap), architecture.let(Architecture::unwrap))

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion):
        AdotLambdaLayerJavaScriptSdkVersion = AdotLambdaLayerJavaScriptSdkVersion(cdkObject)

    internal fun unwrap(wrapped: AdotLambdaLayerJavaScriptSdkVersion):
        software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion =
        wrapped.cdkObject
  }
}
