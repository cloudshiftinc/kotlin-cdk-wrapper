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
import software.amazon.awscdk.services.sam.CfnStateMachine
import kotlin.String

@CdkDslMarker
public class CfnStateMachineFunctionSAMPTPropertyDsl {
    private val cdkBuilder: CfnStateMachine.FunctionSAMPTProperty.Builder =
        CfnStateMachine.FunctionSAMPTProperty.builder()

    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    public fun build(): CfnStateMachine.FunctionSAMPTProperty = cdkBuilder.build()
}
