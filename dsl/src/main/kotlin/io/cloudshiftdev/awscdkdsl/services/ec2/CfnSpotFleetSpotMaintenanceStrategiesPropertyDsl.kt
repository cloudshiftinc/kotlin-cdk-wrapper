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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * The strategies for managing your Spot Instances that are at an elevated risk of being
 * interrupted.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * SpotMaintenanceStrategiesProperty spotMaintenanceStrategiesProperty =
 * SpotMaintenanceStrategiesProperty.builder()
 * .capacityRebalance(SpotCapacityRebalanceProperty.builder()
 * .replacementStrategy("replacementStrategy")
 * .terminationDelay(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotmaintenancestrategies.html)
 */
@CdkDslMarker
public class CfnSpotFleetSpotMaintenanceStrategiesPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.SpotMaintenanceStrategiesProperty.Builder =
        CfnSpotFleet.SpotMaintenanceStrategiesProperty.builder()

    /**
     * @param capacityRebalance The Spot Instance replacement strategy to use when Amazon EC2 emits
     *   a signal that your Spot Instance is at an elevated risk of being interrupted. For more
     *   information, see
     *   [Capacity rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html)
     *   in the *Amazon EC2 User Guide for Linux Instances* .
     */
    public fun capacityRebalance(capacityRebalance: IResolvable) {
        cdkBuilder.capacityRebalance(capacityRebalance)
    }

    /**
     * @param capacityRebalance The Spot Instance replacement strategy to use when Amazon EC2 emits
     *   a signal that your Spot Instance is at an elevated risk of being interrupted. For more
     *   information, see
     *   [Capacity rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html)
     *   in the *Amazon EC2 User Guide for Linux Instances* .
     */
    public fun capacityRebalance(capacityRebalance: CfnSpotFleet.SpotCapacityRebalanceProperty) {
        cdkBuilder.capacityRebalance(capacityRebalance)
    }

    public fun build(): CfnSpotFleet.SpotMaintenanceStrategiesProperty = cdkBuilder.build()
}
