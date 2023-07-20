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
import software.amazon.awscdk.services.lambda.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionTracingConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.TracingConfigProperty.Builder =
        CfnFunction.TracingConfigProperty.builder()

    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun build(): CfnFunction.TracingConfigProperty = cdkBuilder.build()
}
