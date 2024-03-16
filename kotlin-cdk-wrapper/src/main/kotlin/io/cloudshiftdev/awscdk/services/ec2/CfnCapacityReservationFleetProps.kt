@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCapacityReservationFleet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
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
public interface CfnCapacityReservationFleetProps {
  /**
   * The strategy used by the Capacity Reservation Fleet to determine which of the specified
   * instance types to use.
   *
   * Currently, only the `prioritized` allocation strategy is supported. For more information, see
   * [Allocation
   * strategy](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy)
   * in the Amazon EC2 User Guide.
   *
   * Valid values: `prioritized`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-allocationstrategy)
   */
  public fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

  /**
   * The date and time at which the Capacity Reservation Fleet expires.
   *
   * When the Capacity Reservation Fleet expires, its state changes to `expired` and all of the
   * Capacity Reservations in the Fleet expire.
   *
   * The Capacity Reservation Fleet expires within an hour after the specified time. For example, if
   * you specify `5/31/2019` , `13:30:55` , the Capacity Reservation Fleet is guaranteed to expire
   * between `13:30:55` and `14:30:55` on `5/31/2019` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-enddate)
   */
  public fun endDate(): String? = unwrap(this).getEndDate()

  /**
   * Indicates the type of instance launches that the Capacity Reservation Fleet accepts.
   *
   * All Capacity Reservations in the Fleet inherit this instance matching criteria.
   *
   * Currently, Capacity Reservation Fleets support `open` instance matching criteria only. This
   * means that instances that have matching attributes (instance type, platform, and Availability
   * Zone) run in the Capacity Reservations automatically. Instances do not need to explicitly target a
   * Capacity Reservation Fleet to use its reserved capacity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-instancematchcriteria)
   */
  public fun instanceMatchCriteria(): String? = unwrap(this).getInstanceMatchCriteria()

  /**
   * Information about the instance types for which to reserve the capacity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-instancetypespecifications)
   */
  public fun instanceTypeSpecifications(): Any? = unwrap(this).getInstanceTypeSpecifications()

  /**
   * Used to add an end date to a Capacity Reservation Fleet that has no end date and time.
   *
   * To add an end date to a Capacity Reservation Fleet, specify `true` for this paramater and
   * specify the end date and time (in UTC time format) for the *EndDate* parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-noremoveenddate)
   */
  public fun noRemoveEndDate(): Any? = unwrap(this).getNoRemoveEndDate()

  /**
   * Used to remove an end date from a Capacity Reservation Fleet that is configured to end
   * automatically at a specific date and time.
   *
   * To remove the end date from a Capacity Reservation Fleet, specify `true` for this paramater and
   * omit the *EndDate* parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-removeenddate)
   */
  public fun removeEndDate(): Any? = unwrap(this).getRemoveEndDate()

  /**
   * The tags to assign to the Capacity Reservation Fleet.
   *
   * The tags are automatically assigned to the Capacity Reservations in the Fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-tagspecifications)
   */
  public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  /**
   * Indicates the tenancy of the Capacity Reservation Fleet.
   *
   * All Capacity Reservations in the Fleet inherit this tenancy. The Capacity Reservation Fleet can
   * have one of the following tenancy settings:
   *
   * * `default` - The Capacity Reservation Fleet is created on hardware that is shared with other
   * AWS accounts .
   * * `dedicated` - The Capacity Reservations are created on single-tenant hardware that is
   * dedicated to a single AWS account .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-tenancy)
   */
  public fun tenancy(): String? = unwrap(this).getTenancy()

  /**
   * The total number of capacity units to be reserved by the Capacity Reservation Fleet.
   *
   * This value, together with the instance type weights that you assign to each instance type used
   * by the Fleet determine the number of instances for which the Fleet reserves capacity. Both values
   * are based on units that make sense for your workload. For more information, see [Total target
   * capacity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity)
   * in the Amazon EC2 User Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-totaltargetcapacity)
   */
  public fun totalTargetCapacity(): Number? = unwrap(this).getTotalTargetCapacity()

  /**
   * A builder for [CfnCapacityReservationFleetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allocationStrategy The strategy used by the Capacity Reservation Fleet to determine
     * which of the specified instance types to use.
     * Currently, only the `prioritized` allocation strategy is supported. For more information, see
     * [Allocation
     * strategy](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy)
     * in the Amazon EC2 User Guide.
     *
     * Valid values: `prioritized`
     */
    public fun allocationStrategy(allocationStrategy: String)

    /**
     * @param endDate The date and time at which the Capacity Reservation Fleet expires.
     * When the Capacity Reservation Fleet expires, its state changes to `expired` and all of the
     * Capacity Reservations in the Fleet expire.
     *
     * The Capacity Reservation Fleet expires within an hour after the specified time. For example,
     * if you specify `5/31/2019` , `13:30:55` , the Capacity Reservation Fleet is guaranteed to expire
     * between `13:30:55` and `14:30:55` on `5/31/2019` .
     */
    public fun endDate(endDate: String)

    /**
     * @param instanceMatchCriteria Indicates the type of instance launches that the Capacity
     * Reservation Fleet accepts.
     * All Capacity Reservations in the Fleet inherit this instance matching criteria.
     *
     * Currently, Capacity Reservation Fleets support `open` instance matching criteria only. This
     * means that instances that have matching attributes (instance type, platform, and Availability
     * Zone) run in the Capacity Reservations automatically. Instances do not need to explicitly target
     * a Capacity Reservation Fleet to use its reserved capacity.
     */
    public fun instanceMatchCriteria(instanceMatchCriteria: String)

    /**
     * @param instanceTypeSpecifications Information about the instance types for which to reserve
     * the capacity.
     */
    public fun instanceTypeSpecifications(instanceTypeSpecifications: IResolvable)

    /**
     * @param instanceTypeSpecifications Information about the instance types for which to reserve
     * the capacity.
     */
    public fun instanceTypeSpecifications(instanceTypeSpecifications: List<Any>)

    /**
     * @param instanceTypeSpecifications Information about the instance types for which to reserve
     * the capacity.
     */
    public fun instanceTypeSpecifications(vararg instanceTypeSpecifications: Any)

    /**
     * @param noRemoveEndDate Used to add an end date to a Capacity Reservation Fleet that has no
     * end date and time.
     * To add an end date to a Capacity Reservation Fleet, specify `true` for this paramater and
     * specify the end date and time (in UTC time format) for the *EndDate* parameter.
     */
    public fun noRemoveEndDate(noRemoveEndDate: Boolean)

    /**
     * @param noRemoveEndDate Used to add an end date to a Capacity Reservation Fleet that has no
     * end date and time.
     * To add an end date to a Capacity Reservation Fleet, specify `true` for this paramater and
     * specify the end date and time (in UTC time format) for the *EndDate* parameter.
     */
    public fun noRemoveEndDate(noRemoveEndDate: IResolvable)

    /**
     * @param removeEndDate Used to remove an end date from a Capacity Reservation Fleet that is
     * configured to end automatically at a specific date and time.
     * To remove the end date from a Capacity Reservation Fleet, specify `true` for this paramater
     * and omit the *EndDate* parameter.
     */
    public fun removeEndDate(removeEndDate: Boolean)

    /**
     * @param removeEndDate Used to remove an end date from a Capacity Reservation Fleet that is
     * configured to end automatically at a specific date and time.
     * To remove the end date from a Capacity Reservation Fleet, specify `true` for this paramater
     * and omit the *EndDate* parameter.
     */
    public fun removeEndDate(removeEndDate: IResolvable)

    /**
     * @param tagSpecifications The tags to assign to the Capacity Reservation Fleet.
     * The tags are automatically assigned to the Capacity Reservations in the Fleet.
     */
    public fun tagSpecifications(tagSpecifications: IResolvable)

    /**
     * @param tagSpecifications The tags to assign to the Capacity Reservation Fleet.
     * The tags are automatically assigned to the Capacity Reservations in the Fleet.
     */
    public fun tagSpecifications(tagSpecifications: List<Any>)

    /**
     * @param tagSpecifications The tags to assign to the Capacity Reservation Fleet.
     * The tags are automatically assigned to the Capacity Reservations in the Fleet.
     */
    public fun tagSpecifications(vararg tagSpecifications: Any)

    /**
     * @param tenancy Indicates the tenancy of the Capacity Reservation Fleet.
     * All Capacity Reservations in the Fleet inherit this tenancy. The Capacity Reservation Fleet
     * can have one of the following tenancy settings:
     *
     * * `default` - The Capacity Reservation Fleet is created on hardware that is shared with other
     * AWS accounts .
     * * `dedicated` - The Capacity Reservations are created on single-tenant hardware that is
     * dedicated to a single AWS account .
     */
    public fun tenancy(tenancy: String)

    /**
     * @param totalTargetCapacity The total number of capacity units to be reserved by the Capacity
     * Reservation Fleet.
     * This value, together with the instance type weights that you assign to each instance type
     * used by the Fleet determine the number of instances for which the Fleet reserves capacity. Both
     * values are based on units that make sense for your workload. For more information, see [Total
     * target
     * capacity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity)
     * in the Amazon EC2 User Guide.
     */
    public fun totalTargetCapacity(totalTargetCapacity: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps.Builder =
        software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps.builder()

    /**
     * @param allocationStrategy The strategy used by the Capacity Reservation Fleet to determine
     * which of the specified instance types to use.
     * Currently, only the `prioritized` allocation strategy is supported. For more information, see
     * [Allocation
     * strategy](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy)
     * in the Amazon EC2 User Guide.
     *
     * Valid values: `prioritized`
     */
    override fun allocationStrategy(allocationStrategy: String) {
      cdkBuilder.allocationStrategy(allocationStrategy)
    }

    /**
     * @param endDate The date and time at which the Capacity Reservation Fleet expires.
     * When the Capacity Reservation Fleet expires, its state changes to `expired` and all of the
     * Capacity Reservations in the Fleet expire.
     *
     * The Capacity Reservation Fleet expires within an hour after the specified time. For example,
     * if you specify `5/31/2019` , `13:30:55` , the Capacity Reservation Fleet is guaranteed to expire
     * between `13:30:55` and `14:30:55` on `5/31/2019` .
     */
    override fun endDate(endDate: String) {
      cdkBuilder.endDate(endDate)
    }

    /**
     * @param instanceMatchCriteria Indicates the type of instance launches that the Capacity
     * Reservation Fleet accepts.
     * All Capacity Reservations in the Fleet inherit this instance matching criteria.
     *
     * Currently, Capacity Reservation Fleets support `open` instance matching criteria only. This
     * means that instances that have matching attributes (instance type, platform, and Availability
     * Zone) run in the Capacity Reservations automatically. Instances do not need to explicitly target
     * a Capacity Reservation Fleet to use its reserved capacity.
     */
    override fun instanceMatchCriteria(instanceMatchCriteria: String) {
      cdkBuilder.instanceMatchCriteria(instanceMatchCriteria)
    }

    /**
     * @param instanceTypeSpecifications Information about the instance types for which to reserve
     * the capacity.
     */
    override fun instanceTypeSpecifications(instanceTypeSpecifications: IResolvable) {
      cdkBuilder.instanceTypeSpecifications(instanceTypeSpecifications.let(IResolvable::unwrap))
    }

    /**
     * @param instanceTypeSpecifications Information about the instance types for which to reserve
     * the capacity.
     */
    override fun instanceTypeSpecifications(instanceTypeSpecifications: List<Any>) {
      cdkBuilder.instanceTypeSpecifications(instanceTypeSpecifications)
    }

    /**
     * @param instanceTypeSpecifications Information about the instance types for which to reserve
     * the capacity.
     */
    override fun instanceTypeSpecifications(vararg instanceTypeSpecifications: Any): Unit =
        instanceTypeSpecifications(instanceTypeSpecifications.toList())

    /**
     * @param noRemoveEndDate Used to add an end date to a Capacity Reservation Fleet that has no
     * end date and time.
     * To add an end date to a Capacity Reservation Fleet, specify `true` for this paramater and
     * specify the end date and time (in UTC time format) for the *EndDate* parameter.
     */
    override fun noRemoveEndDate(noRemoveEndDate: Boolean) {
      cdkBuilder.noRemoveEndDate(noRemoveEndDate)
    }

    /**
     * @param noRemoveEndDate Used to add an end date to a Capacity Reservation Fleet that has no
     * end date and time.
     * To add an end date to a Capacity Reservation Fleet, specify `true` for this paramater and
     * specify the end date and time (in UTC time format) for the *EndDate* parameter.
     */
    override fun noRemoveEndDate(noRemoveEndDate: IResolvable) {
      cdkBuilder.noRemoveEndDate(noRemoveEndDate.let(IResolvable::unwrap))
    }

    /**
     * @param removeEndDate Used to remove an end date from a Capacity Reservation Fleet that is
     * configured to end automatically at a specific date and time.
     * To remove the end date from a Capacity Reservation Fleet, specify `true` for this paramater
     * and omit the *EndDate* parameter.
     */
    override fun removeEndDate(removeEndDate: Boolean) {
      cdkBuilder.removeEndDate(removeEndDate)
    }

    /**
     * @param removeEndDate Used to remove an end date from a Capacity Reservation Fleet that is
     * configured to end automatically at a specific date and time.
     * To remove the end date from a Capacity Reservation Fleet, specify `true` for this paramater
     * and omit the *EndDate* parameter.
     */
    override fun removeEndDate(removeEndDate: IResolvable) {
      cdkBuilder.removeEndDate(removeEndDate.let(IResolvable::unwrap))
    }

    /**
     * @param tagSpecifications The tags to assign to the Capacity Reservation Fleet.
     * The tags are automatically assigned to the Capacity Reservations in the Fleet.
     */
    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
    }

    /**
     * @param tagSpecifications The tags to assign to the Capacity Reservation Fleet.
     * The tags are automatically assigned to the Capacity Reservations in the Fleet.
     */
    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications)
    }

    /**
     * @param tagSpecifications The tags to assign to the Capacity Reservation Fleet.
     * The tags are automatically assigned to the Capacity Reservations in the Fleet.
     */
    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    /**
     * @param tenancy Indicates the tenancy of the Capacity Reservation Fleet.
     * All Capacity Reservations in the Fleet inherit this tenancy. The Capacity Reservation Fleet
     * can have one of the following tenancy settings:
     *
     * * `default` - The Capacity Reservation Fleet is created on hardware that is shared with other
     * AWS accounts .
     * * `dedicated` - The Capacity Reservations are created on single-tenant hardware that is
     * dedicated to a single AWS account .
     */
    override fun tenancy(tenancy: String) {
      cdkBuilder.tenancy(tenancy)
    }

    /**
     * @param totalTargetCapacity The total number of capacity units to be reserved by the Capacity
     * Reservation Fleet.
     * This value, together with the instance type weights that you assign to each instance type
     * used by the Fleet determine the number of instances for which the Fleet reserves capacity. Both
     * values are based on units that make sense for your workload. For more information, see [Total
     * target
     * capacity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity)
     * in the Amazon EC2 User Guide.
     */
    override fun totalTargetCapacity(totalTargetCapacity: Number) {
      cdkBuilder.totalTargetCapacity(totalTargetCapacity)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps,
  ) : CdkObject(cdkObject), CfnCapacityReservationFleetProps {
    /**
     * The strategy used by the Capacity Reservation Fleet to determine which of the specified
     * instance types to use.
     *
     * Currently, only the `prioritized` allocation strategy is supported. For more information, see
     * [Allocation
     * strategy](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy)
     * in the Amazon EC2 User Guide.
     *
     * Valid values: `prioritized`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-allocationstrategy)
     */
    override fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

    /**
     * The date and time at which the Capacity Reservation Fleet expires.
     *
     * When the Capacity Reservation Fleet expires, its state changes to `expired` and all of the
     * Capacity Reservations in the Fleet expire.
     *
     * The Capacity Reservation Fleet expires within an hour after the specified time. For example,
     * if you specify `5/31/2019` , `13:30:55` , the Capacity Reservation Fleet is guaranteed to expire
     * between `13:30:55` and `14:30:55` on `5/31/2019` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-enddate)
     */
    override fun endDate(): String? = unwrap(this).getEndDate()

    /**
     * Indicates the type of instance launches that the Capacity Reservation Fleet accepts.
     *
     * All Capacity Reservations in the Fleet inherit this instance matching criteria.
     *
     * Currently, Capacity Reservation Fleets support `open` instance matching criteria only. This
     * means that instances that have matching attributes (instance type, platform, and Availability
     * Zone) run in the Capacity Reservations automatically. Instances do not need to explicitly target
     * a Capacity Reservation Fleet to use its reserved capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-instancematchcriteria)
     */
    override fun instanceMatchCriteria(): String? = unwrap(this).getInstanceMatchCriteria()

    /**
     * Information about the instance types for which to reserve the capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-instancetypespecifications)
     */
    override fun instanceTypeSpecifications(): Any? = unwrap(this).getInstanceTypeSpecifications()

    /**
     * Used to add an end date to a Capacity Reservation Fleet that has no end date and time.
     *
     * To add an end date to a Capacity Reservation Fleet, specify `true` for this paramater and
     * specify the end date and time (in UTC time format) for the *EndDate* parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-noremoveenddate)
     */
    override fun noRemoveEndDate(): Any? = unwrap(this).getNoRemoveEndDate()

    /**
     * Used to remove an end date from a Capacity Reservation Fleet that is configured to end
     * automatically at a specific date and time.
     *
     * To remove the end date from a Capacity Reservation Fleet, specify `true` for this paramater
     * and omit the *EndDate* parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-removeenddate)
     */
    override fun removeEndDate(): Any? = unwrap(this).getRemoveEndDate()

    /**
     * The tags to assign to the Capacity Reservation Fleet.
     *
     * The tags are automatically assigned to the Capacity Reservations in the Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-tagspecifications)
     */
    override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    /**
     * Indicates the tenancy of the Capacity Reservation Fleet.
     *
     * All Capacity Reservations in the Fleet inherit this tenancy. The Capacity Reservation Fleet
     * can have one of the following tenancy settings:
     *
     * * `default` - The Capacity Reservation Fleet is created on hardware that is shared with other
     * AWS accounts .
     * * `dedicated` - The Capacity Reservations are created on single-tenant hardware that is
     * dedicated to a single AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-tenancy)
     */
    override fun tenancy(): String? = unwrap(this).getTenancy()

    /**
     * The total number of capacity units to be reserved by the Capacity Reservation Fleet.
     *
     * This value, together with the instance type weights that you assign to each instance type
     * used by the Fleet determine the number of instances for which the Fleet reserves capacity. Both
     * values are based on units that make sense for your workload. For more information, see [Total
     * target
     * capacity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity)
     * in the Amazon EC2 User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-totaltargetcapacity)
     */
    override fun totalTargetCapacity(): Number? = unwrap(this).getTotalTargetCapacity()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCapacityReservationFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps):
        CfnCapacityReservationFleetProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnCapacityReservationFleetProps

    internal fun unwrap(wrapped: CfnCapacityReservationFleetProps):
        software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps
  }
}
