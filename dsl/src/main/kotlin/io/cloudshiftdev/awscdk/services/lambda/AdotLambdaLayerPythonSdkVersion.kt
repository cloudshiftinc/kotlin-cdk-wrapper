package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

public open class AdotLambdaLayerPythonSdkVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion,
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
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion):
        AdotLambdaLayerPythonSdkVersion = AdotLambdaLayerPythonSdkVersion(cdkObject)

    internal fun unwrap(wrapped: AdotLambdaLayerPythonSdkVersion):
        software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion = wrapped.cdkObject
  }
}
