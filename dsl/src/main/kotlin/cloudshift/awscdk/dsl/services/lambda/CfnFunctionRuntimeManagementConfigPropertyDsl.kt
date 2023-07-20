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
public class CfnFunctionRuntimeManagementConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.RuntimeManagementConfigProperty.Builder =
        CfnFunction.RuntimeManagementConfigProperty.builder()

    public fun runtimeVersionArn(runtimeVersionArn: String) {
        cdkBuilder.runtimeVersionArn(runtimeVersionArn)
    }

    public fun updateRuntimeOn(updateRuntimeOn: String) {
        cdkBuilder.updateRuntimeOn(updateRuntimeOn)
    }

    public fun build(): CfnFunction.RuntimeManagementConfigProperty = cdkBuilder.build()
}
