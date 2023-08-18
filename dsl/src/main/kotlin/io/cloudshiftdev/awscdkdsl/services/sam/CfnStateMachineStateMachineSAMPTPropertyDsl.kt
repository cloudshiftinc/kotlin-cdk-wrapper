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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnStateMachine

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * StateMachineSAMPTProperty stateMachineSAMPTProperty = StateMachineSAMPTProperty.builder()
 * .stateMachineName("stateMachineName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-statemachinesampt.html)
 */
@CdkDslMarker
public class CfnStateMachineStateMachineSAMPTPropertyDsl {
    private val cdkBuilder: CfnStateMachine.StateMachineSAMPTProperty.Builder =
        CfnStateMachine.StateMachineSAMPTProperty.builder()

    /** @param stateMachineName the value to be set. */
    public fun stateMachineName(stateMachineName: String) {
        cdkBuilder.stateMachineName(stateMachineName)
    }

    public fun build(): CfnStateMachine.StateMachineSAMPTProperty = cdkBuilder.build()
}
