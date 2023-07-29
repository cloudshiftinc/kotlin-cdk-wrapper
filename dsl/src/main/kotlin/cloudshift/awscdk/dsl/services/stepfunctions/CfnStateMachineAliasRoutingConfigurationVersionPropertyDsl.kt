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

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias

/**
 * The state machine version to which you want to route the execution traffic.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * RoutingConfigurationVersionProperty routingConfigurationVersionProperty =
 * RoutingConfigurationVersionProperty.builder()
 * .stateMachineVersionArn("stateMachineVersionArn")
 * .weight(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-routingconfigurationversion.html)
 */
@CdkDslMarker
public class CfnStateMachineAliasRoutingConfigurationVersionPropertyDsl {
    private val cdkBuilder: CfnStateMachineAlias.RoutingConfigurationVersionProperty.Builder =
        CfnStateMachineAlias.RoutingConfigurationVersionProperty.builder()

    /**
     * @param stateMachineVersionArn The Amazon Resource Name (ARN) that identifies one or two state
     *   machine versions defined in the routing configuration. If you specify the ARN of a second
     *   version, it must belong to the same state machine as the first version.
     */
    public fun stateMachineVersionArn(stateMachineVersionArn: String) {
        cdkBuilder.stateMachineVersionArn(stateMachineVersionArn)
    }

    /**
     * @param weight The percentage of traffic you want to route to the state machine version. The
     *   sum of the weights in the routing configuration must be equal to 100.
     */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnStateMachineAlias.RoutingConfigurationVersionProperty =
        cdkBuilder.build()
}
