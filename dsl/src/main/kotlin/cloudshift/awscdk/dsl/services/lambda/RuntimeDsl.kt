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
import software.amazon.awscdk.services.lambda.Runtime
import software.amazon.awscdk.services.lambda.RuntimeFamily
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class RuntimeDsl(
    name: String,
    family: RuntimeFamily,
) {
    private val cdkBuilder: Runtime.Builder = Runtime.Builder.create(name, family)

    public fun bundlingDockerImage(bundlingDockerImage: String) {
        cdkBuilder.bundlingDockerImage(bundlingDockerImage)
    }

    public fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean) {
        cdkBuilder.supportsCodeGuruProfiling(supportsCodeGuruProfiling)
    }

    public fun supportsInlineCode(supportsInlineCode: Boolean) {
        cdkBuilder.supportsInlineCode(supportsInlineCode)
    }

    public fun build(): Runtime = cdkBuilder.build()
}
