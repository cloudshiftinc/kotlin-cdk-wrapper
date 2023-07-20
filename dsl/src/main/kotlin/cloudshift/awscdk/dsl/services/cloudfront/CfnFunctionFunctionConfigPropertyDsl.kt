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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionFunctionConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.FunctionConfigProperty.Builder =
        CfnFunction.FunctionConfigProperty.builder()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
    }

    public fun build(): CfnFunction.FunctionConfigProperty = cdkBuilder.build()
}
