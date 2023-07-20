@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.LambdaRuntimeProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class LambdaRuntimePropsDsl {
    private val cdkBuilder: LambdaRuntimeProps.Builder = LambdaRuntimeProps.builder()

    public fun bundlingDockerImage(bundlingDockerImage: String) {
        cdkBuilder.bundlingDockerImage(bundlingDockerImage)
    }

    public fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean) {
        cdkBuilder.supportsCodeGuruProfiling(supportsCodeGuruProfiling)
    }

    public fun supportsInlineCode(supportsInlineCode: Boolean) {
        cdkBuilder.supportsInlineCode(supportsInlineCode)
    }

    public fun build(): LambdaRuntimeProps = cdkBuilder.build()
}
