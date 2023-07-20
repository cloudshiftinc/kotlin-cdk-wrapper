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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionFunctionSAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.FunctionSAMPTProperty.Builder =
        CfnFunction.FunctionSAMPTProperty.builder()

    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    public fun build(): CfnFunction.FunctionSAMPTProperty = cdkBuilder.build()
}
