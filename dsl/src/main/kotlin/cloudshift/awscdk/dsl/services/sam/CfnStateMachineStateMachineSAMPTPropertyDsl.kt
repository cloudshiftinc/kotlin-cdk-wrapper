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
public class CfnStateMachineStateMachineSAMPTPropertyDsl {
    private val cdkBuilder: CfnStateMachine.StateMachineSAMPTProperty.Builder =
        CfnStateMachine.StateMachineSAMPTProperty.builder()

    public fun stateMachineName(stateMachineName: String) {
        cdkBuilder.stateMachineName(stateMachineName)
    }

    public fun build(): CfnStateMachine.StateMachineSAMPTProperty = cdkBuilder.build()
}
