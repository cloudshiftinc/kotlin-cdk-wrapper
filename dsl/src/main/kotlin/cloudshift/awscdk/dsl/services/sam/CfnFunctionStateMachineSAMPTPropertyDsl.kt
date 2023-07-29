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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-statemachinesampt.html)
 */
@CdkDslMarker
public class CfnFunctionStateMachineSAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.StateMachineSAMPTProperty.Builder =
        CfnFunction.StateMachineSAMPTProperty.builder()

    /** @param stateMachineName the value to be set. */
    public fun stateMachineName(stateMachineName: String) {
        cdkBuilder.stateMachineName(stateMachineName)
    }

    public fun build(): CfnFunction.StateMachineSAMPTProperty = cdkBuilder.build()
}
