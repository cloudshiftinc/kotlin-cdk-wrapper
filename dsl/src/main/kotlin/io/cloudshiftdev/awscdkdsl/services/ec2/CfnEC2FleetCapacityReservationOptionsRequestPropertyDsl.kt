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
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

/**
 * Describes the strategy for using unused Capacity Reservations for fulfilling On-Demand capacity.
 *
 * This strategy can only be used if the EC2 Fleet is of type `instant` .
 *
 * For more information about Capacity Reservations, see
 * [On-Demand Capacity Reservations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-capacity-reservations.html)
 * in the *Amazon EC2 User Guide* . For examples of using Capacity Reservations in an EC2 Fleet, see
 * [EC2 Fleet example configurations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-examples.html)
 * in the *Amazon EC2 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CapacityReservationOptionsRequestProperty capacityReservationOptionsRequestProperty =
 * CapacityReservationOptionsRequestProperty.builder()
 * .usageStrategy("usageStrategy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityreservationoptionsrequest.html)
 */
@CdkDslMarker
public class CfnEC2FleetCapacityReservationOptionsRequestPropertyDsl {
    private val cdkBuilder: CfnEC2Fleet.CapacityReservationOptionsRequestProperty.Builder =
        CfnEC2Fleet.CapacityReservationOptionsRequestProperty.builder()

    /**
     * @param usageStrategy Indicates whether to use unused Capacity Reservations for fulfilling
     *   On-Demand capacity. If you specify `use-capacity-reservations-first` , the fleet uses
     *   unused Capacity Reservations to fulfill On-Demand capacity up to the target On-Demand
     *   capacity. If multiple instance pools have unused Capacity Reservations, the On-Demand
     *   allocation strategy ( `lowest-price` or `prioritized` ) is applied. If the number of unused
     *   Capacity Reservations is less than the On-Demand target capacity, the remaining On-Demand
     *   target capacity is launched according to the On-Demand allocation strategy ( `lowest-price`
     *   or `prioritized` ).
     *
     * If you do not specify a value, the fleet fulfils the On-Demand capacity according to the
     * chosen On-Demand allocation strategy.
     */
    public fun usageStrategy(usageStrategy: String) {
        cdkBuilder.usageStrategy(usageStrategy)
    }

    public fun build(): CfnEC2Fleet.CapacityReservationOptionsRequestProperty = cdkBuilder.build()
}
