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
public class CfnFunctionStateMachineSAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.StateMachineSAMPTProperty.Builder =
        CfnFunction.StateMachineSAMPTProperty.builder()

    public fun stateMachineName(stateMachineName: String) {
        cdkBuilder.stateMachineName(stateMachineName)
    }

    public fun build(): CfnFunction.StateMachineSAMPTProperty = cdkBuilder.build()
}
