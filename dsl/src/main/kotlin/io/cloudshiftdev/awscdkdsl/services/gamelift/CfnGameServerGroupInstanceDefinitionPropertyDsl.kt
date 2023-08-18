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

package io.cloudshiftdev.awscdkdsl.services.gamelift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

/**
 * *This data type is used with the Amazon GameLift FleetIQ and game server groups.*.
 *
 * An allowed instance type for a `GameServerGroup` . All game server groups must have at least two
 * instance types defined for it. GameLift FleetIQ periodically evaluates each defined instance type
 * for viability. It then updates the Auto Scaling group with the list of viable instance types.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * InstanceDefinitionProperty instanceDefinitionProperty = InstanceDefinitionProperty.builder()
 * .instanceType("instanceType")
 * // the properties below are optional
 * .weightedCapacity("weightedCapacity")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-instancedefinition.html)
 */
@CdkDslMarker
public class CfnGameServerGroupInstanceDefinitionPropertyDsl {
    private val cdkBuilder: CfnGameServerGroup.InstanceDefinitionProperty.Builder =
        CfnGameServerGroup.InstanceDefinitionProperty.builder()

    /** @param instanceType An Amazon EC2 instance type designation. */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param weightedCapacity Instance weighting that indicates how much this instance type
     *   contributes to the total capacity of a game server group. Instance weights are used by
     *   Amazon GameLift FleetIQ to calculate the instance type's cost per unit hour and better
     *   identify the most cost-effective options. For detailed information on weighting instance
     *   capacity, see
     *   [Instance Weighting](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html)
     *   in the *Amazon Elastic Compute Cloud Auto Scaling User Guide* . Default value is "1".
     */
    public fun weightedCapacity(weightedCapacity: String) {
        cdkBuilder.weightedCapacity(weightedCapacity)
    }

    public fun build(): CfnGameServerGroup.InstanceDefinitionProperty = cdkBuilder.build()
}
