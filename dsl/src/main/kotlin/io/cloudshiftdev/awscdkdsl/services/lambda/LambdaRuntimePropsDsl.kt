@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.lambda.LambdaRuntimeProps

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * LambdaRuntimeProps lambdaRuntimeProps = LambdaRuntimeProps.builder()
 * .bundlingDockerImage("bundlingDockerImage")
 * .isVariable(false)
 * .supportsCodeGuruProfiling(false)
 * .supportsInlineCode(false)
 * .supportsSnapStart(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class LambdaRuntimePropsDsl {
    private val cdkBuilder: LambdaRuntimeProps.Builder = LambdaRuntimeProps.builder()

    /** @param bundlingDockerImage The Docker image name to be used for bundling in this runtime. */
    public fun bundlingDockerImage(bundlingDockerImage: String) {
        cdkBuilder.bundlingDockerImage(bundlingDockerImage)
    }

    /**
     * @param isVariable Whether the runtime enum is meant to change over time, IE NODEJS_LATEST.
     */
    public fun isVariable(isVariable: Boolean) {
        cdkBuilder.isVariable(isVariable)
    }

    /**
     * @param supportsCodeGuruProfiling Whether this runtime is integrated with and supported for
     *   profiling using Amazon CodeGuru Profiler.
     */
    public fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean) {
        cdkBuilder.supportsCodeGuruProfiling(supportsCodeGuruProfiling)
    }

    /**
     * @param supportsInlineCode Whether the `ZipFile` (aka inline code) property can be used with
     *   this runtime.
     */
    public fun supportsInlineCode(supportsInlineCode: Boolean) {
        cdkBuilder.supportsInlineCode(supportsInlineCode)
    }

    /** @param supportsSnapStart Whether this runtime supports SnapStart. */
    public fun supportsSnapStart(supportsSnapStart: Boolean) {
        cdkBuilder.supportsSnapStart(supportsSnapStart)
    }

    public fun build(): LambdaRuntimeProps = cdkBuilder.build()
}
