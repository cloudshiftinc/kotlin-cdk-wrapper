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
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps

/**
 * Properties for defining a `CfnCapacityReservationFleet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnCapacityReservationFleetProps cfnCapacityReservationFleetProps =
 * CfnCapacityReservationFleetProps.builder()
 * .allocationStrategy("allocationStrategy")
 * .endDate("endDate")
 * .instanceMatchCriteria("instanceMatchCriteria")
 * .instanceTypeSpecifications(List.of(InstanceTypeSpecificationProperty.builder()
 * .availabilityZone("availabilityZone")
 * .availabilityZoneId("availabilityZoneId")
 * .ebsOptimized(false)
 * .instancePlatform("instancePlatform")
 * .instanceType("instanceType")
 * .priority(123)
 * .weight(123)
 * .build()))
 * .noRemoveEndDate(false)
 * .removeEndDate(false)
 * .tagSpecifications(List.of(TagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .tenancy("tenancy")
 * .totalTargetCapacity(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html)
 */
@CdkDslMarker
public class CfnCapacityReservationFleetPropsDsl {
    private val cdkBuilder: CfnCapacityReservationFleetProps.Builder =
        CfnCapacityReservationFleetProps.builder()

    private val _instanceTypeSpecifications: MutableList<Any> = mutableListOf()

    private val _tagSpecifications: MutableList<Any> = mutableListOf()

    /**
     * @param allocationStrategy The strategy used by the Capacity Reservation Fleet to determine
     *   which of the specified instance types to use. Currently, only the `prioritized` allocation
     *   strategy is supported. For more information, see
     *   [Allocation strategy](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy)
     *   in the Amazon EC2 User Guide.
     *
     * Valid values: `prioritized`
     */
    public fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
    }

    /**
     * @param endDate The date and time at which the Capacity Reservation Fleet expires. When the
     *   Capacity Reservation Fleet expires, its state changes to `expired` and all of the Capacity
     *   Reservations in the Fleet expire.
     *
     * The Capacity Reservation Fleet expires within an hour after the specified time. For example,
     * if you specify `5/31/2019` , `13:30:55` , the Capacity Reservation Fleet is guaranteed to
     * expire between `13:30:55` and `14:30:55` on `5/31/2019` .
     */
    public fun endDate(endDate: String) {
        cdkBuilder.endDate(endDate)
    }

    /**
     * @param instanceMatchCriteria Indicates the type of instance launches that the Capacity
     *   Reservation Fleet accepts. All Capacity Reservations in the Fleet inherit this instance
     *   matching criteria.
     *
     * Currently, Capacity Reservation Fleets support `open` instance matching criteria only. This
     * means that instances that have matching attributes (instance type, platform, and Availability
     * Zone) run in the Capacity Reservations automatically. Instances do not need to explicitly
     * target a Capacity Reservation Fleet to use its reserved capacity.
     */
    public fun instanceMatchCriteria(instanceMatchCriteria: String) {
        cdkBuilder.instanceMatchCriteria(instanceMatchCriteria)
    }

    /**
     * @param instanceTypeSpecifications Information about the instance types for which to reserve
     *   the capacity.
     */
    public fun instanceTypeSpecifications(vararg instanceTypeSpecifications: Any) {
        _instanceTypeSpecifications.addAll(listOf(*instanceTypeSpecifications))
    }

    /**
     * @param instanceTypeSpecifications Information about the instance types for which to reserve
     *   the capacity.
     */
    public fun instanceTypeSpecifications(instanceTypeSpecifications: Collection<Any>) {
        _instanceTypeSpecifications.addAll(instanceTypeSpecifications)
    }

    /**
     * @param instanceTypeSpecifications Information about the instance types for which to reserve
     *   the capacity.
     */
    public fun instanceTypeSpecifications(instanceTypeSpecifications: IResolvable) {
        cdkBuilder.instanceTypeSpecifications(instanceTypeSpecifications)
    }

    /**
     * @param noRemoveEndDate Used to add an end date to a Capacity Reservation Fleet that has no
     *   end date and time. To add an end date to a Capacity Reservation Fleet, specify `true` for
     *   this paramater and specify the end date and time (in UTC time format) for the *EndDate*
     *   parameter.
     */
    public fun noRemoveEndDate(noRemoveEndDate: Boolean) {
        cdkBuilder.noRemoveEndDate(noRemoveEndDate)
    }

    /**
     * @param noRemoveEndDate Used to add an end date to a Capacity Reservation Fleet that has no
     *   end date and time. To add an end date to a Capacity Reservation Fleet, specify `true` for
     *   this paramater and specify the end date and time (in UTC time format) for the *EndDate*
     *   parameter.
     */
    public fun noRemoveEndDate(noRemoveEndDate: IResolvable) {
        cdkBuilder.noRemoveEndDate(noRemoveEndDate)
    }

    /**
     * @param removeEndDate Used to remove an end date from a Capacity Reservation Fleet that is
     *   configured to end automatically at a specific date and time. To remove the end date from a
     *   Capacity Reservation Fleet, specify `true` for this paramater and omit the *EndDate*
     *   parameter.
     */
    public fun removeEndDate(removeEndDate: Boolean) {
        cdkBuilder.removeEndDate(removeEndDate)
    }

    /**
     * @param removeEndDate Used to remove an end date from a Capacity Reservation Fleet that is
     *   configured to end automatically at a specific date and time. To remove the end date from a
     *   Capacity Reservation Fleet, specify `true` for this paramater and omit the *EndDate*
     *   parameter.
     */
    public fun removeEndDate(removeEndDate: IResolvable) {
        cdkBuilder.removeEndDate(removeEndDate)
    }

    /**
     * @param tagSpecifications The tags to assign to the Capacity Reservation Fleet. The tags are
     *   automatically assigned to the Capacity Reservations in the Fleet.
     */
    public fun tagSpecifications(vararg tagSpecifications: Any) {
        _tagSpecifications.addAll(listOf(*tagSpecifications))
    }

    /**
     * @param tagSpecifications The tags to assign to the Capacity Reservation Fleet. The tags are
     *   automatically assigned to the Capacity Reservations in the Fleet.
     */
    public fun tagSpecifications(tagSpecifications: Collection<Any>) {
        _tagSpecifications.addAll(tagSpecifications)
    }

    /**
     * @param tagSpecifications The tags to assign to the Capacity Reservation Fleet. The tags are
     *   automatically assigned to the Capacity Reservations in the Fleet.
     */
    public fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications)
    }

    /**
     * @param tenancy Indicates the tenancy of the Capacity Reservation Fleet. All Capacity
     *   Reservations in the Fleet inherit this tenancy. The Capacity Reservation Fleet can have one
     *   of the following tenancy settings:
     * * `default` - The Capacity Reservation Fleet is created on hardware that is shared with other
     *   AWS accounts .
     * * `dedicated` - The Capacity Reservations are created on single-tenant hardware that is
     *   dedicated to a single AWS account .
     */
    public fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
    }

    /**
     * @param totalTargetCapacity The total number of capacity units to be reserved by the Capacity
     *   Reservation Fleet. This value, together with the instance type weights that you assign to
     *   each instance type used by the Fleet determine the number of instances for which the Fleet
     *   reserves capacity. Both values are based on units that make sense for your workload. For
     *   more information, see
     *   [Total target capacity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity)
     *   in the Amazon EC2 User Guide.
     */
    public fun totalTargetCapacity(totalTargetCapacity: Number) {
        cdkBuilder.totalTargetCapacity(totalTargetCapacity)
    }

    public fun build(): CfnCapacityReservationFleetProps {
        if (_instanceTypeSpecifications.isNotEmpty())
            cdkBuilder.instanceTypeSpecifications(_instanceTypeSpecifications)
        if (_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
        return cdkBuilder.build()
    }
}
