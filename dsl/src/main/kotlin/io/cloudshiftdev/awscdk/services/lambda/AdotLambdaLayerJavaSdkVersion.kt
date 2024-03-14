package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

public open class AdotLambdaLayerJavaSdkVersion
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaSdkVersion,
) {
    /**
     * The ARN of the Lambda layer.
     *
     * @param scope The binding scope.
     * @param architecture The architecture of the Lambda layer (either X86_64 or ARM_64).
     */
    public open fun layerArn(scope: IConstruct, architecture: Architecture): String =
        unwrap(this).layerArn(scope.let(IConstruct::unwrap), architecture.let(Architecture::unwrap))

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaSdkVersion
        ): AdotLambdaLayerJavaSdkVersion = AdotLambdaLayerJavaSdkVersion(cdkObject)

        internal fun unwrap(
            wrapped: AdotLambdaLayerJavaSdkVersion
        ): software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaSdkVersion = wrapped.cdkObject
    }
}
