@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new Capacity Reservation Fleet with the specified attributes.
 *
 * For more information, see [Capacity Reservation
 * Fleets](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cr-fleets.html) in the *Amazon EC2 User
 * Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnCapacityReservationFleet cfnCapacityReservationFleet =
 * CfnCapacityReservationFleet.Builder.create(this, "MyCfnCapacityReservationFleet")
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
public open class CfnCapacityReservationFleet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCapacityReservationFleetProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnCapacityReservationFleetProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCapacityReservationFleetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCapacityReservationFleetProps(props)
  )

  /**
   * The strategy used by the Capacity Reservation Fleet to determine which of the specified
   * instance types to use.
   */
  public open fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

  /**
   * The strategy used by the Capacity Reservation Fleet to determine which of the specified
   * instance types to use.
   */
  public open fun allocationStrategy(`value`: String) {
    unwrap(this).setAllocationStrategy(`value`)
  }

  /**
   * The ID of the Capacity Reservation Fleet.
   */
  public open fun attrCapacityReservationFleetId(): String =
      unwrap(this).getAttrCapacityReservationFleetId()

  /**
   * The date and time at which the Capacity Reservation Fleet expires.
   */
  public open fun endDate(): String? = unwrap(this).getEndDate()

  /**
   * The date and time at which the Capacity Reservation Fleet expires.
   */
  public open fun endDate(`value`: String) {
    unwrap(this).setEndDate(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Indicates the type of instance launches that the Capacity Reservation Fleet accepts.
   */
  public open fun instanceMatchCriteria(): String? = unwrap(this).getInstanceMatchCriteria()

  /**
   * Indicates the type of instance launches that the Capacity Reservation Fleet accepts.
   */
  public open fun instanceMatchCriteria(`value`: String) {
    unwrap(this).setInstanceMatchCriteria(`value`)
  }

  /**
   * Information about the instance types for which to reserve the capacity.
   */
  public open fun instanceTypeSpecifications(): Any? = unwrap(this).getInstanceTypeSpecifications()

  /**
   * Information about the instance types for which to reserve the capacity.
   */
  public open fun instanceTypeSpecifications(`value`: IResolvable) {
    unwrap(this).setInstanceTypeSpecifications(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the instance types for which to reserve the capacity.
   */
  public open fun instanceTypeSpecifications(`value`: List<Any>) {
    unwrap(this).setInstanceTypeSpecifications(`value`)
  }

  /**
   * Information about the instance types for which to reserve the capacity.
   */
  public open fun instanceTypeSpecifications(vararg `value`: Any): Unit =
      instanceTypeSpecifications(`value`.toList())

  /**
   * Used to add an end date to a Capacity Reservation Fleet that has no end date and time.
   */
  public open fun noRemoveEndDate(): Any? = unwrap(this).getNoRemoveEndDate()

  /**
   * Used to add an end date to a Capacity Reservation Fleet that has no end date and time.
   */
  public open fun noRemoveEndDate(`value`: Boolean) {
    unwrap(this).setNoRemoveEndDate(`value`)
  }

  /**
   * Used to add an end date to a Capacity Reservation Fleet that has no end date and time.
   */
  public open fun noRemoveEndDate(`value`: IResolvable) {
    unwrap(this).setNoRemoveEndDate(`value`.let(IResolvable::unwrap))
  }

  /**
   * Used to remove an end date from a Capacity Reservation Fleet that is configured to end
   * automatically at a specific date and time.
   */
  public open fun removeEndDate(): Any? = unwrap(this).getRemoveEndDate()

  /**
   * Used to remove an end date from a Capacity Reservation Fleet that is configured to end
   * automatically at a specific date and time.
   */
  public open fun removeEndDate(`value`: Boolean) {
    unwrap(this).setRemoveEndDate(`value`)
  }

  /**
   * Used to remove an end date from a Capacity Reservation Fleet that is configured to end
   * automatically at a specific date and time.
   */
  public open fun removeEndDate(`value`: IResolvable) {
    unwrap(this).setRemoveEndDate(`value`.let(IResolvable::unwrap))
  }

  /**
   * The tags to assign to the Capacity Reservation Fleet.
   */
  public open fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  /**
   * The tags to assign to the Capacity Reservation Fleet.
   */
  public open fun tagSpecifications(`value`: IResolvable) {
    unwrap(this).setTagSpecifications(`value`.let(IResolvable::unwrap))
  }

  /**
   * The tags to assign to the Capacity Reservation Fleet.
   */
  public open fun tagSpecifications(`value`: List<Any>) {
    unwrap(this).setTagSpecifications(`value`)
  }

  /**
   * The tags to assign to the Capacity Reservation Fleet.
   */
  public open fun tagSpecifications(vararg `value`: Any): Unit = tagSpecifications(`value`.toList())

  /**
   * Indicates the tenancy of the Capacity Reservation Fleet.
   */
  public open fun tenancy(): String? = unwrap(this).getTenancy()

  /**
   * Indicates the tenancy of the Capacity Reservation Fleet.
   */
  public open fun tenancy(`value`: String) {
    unwrap(this).setTenancy(`value`)
  }

  /**
   * The total number of capacity units to be reserved by the Capacity Reservation Fleet.
   */
  public open fun totalTargetCapacity(): Number? = unwrap(this).getTotalTargetCapacity()

  /**
   * The total number of capacity units to be reserved by the Capacity Reservation Fleet.
   */
  public open fun totalTargetCapacity(`value`: Number) {
    unwrap(this).setTotalTargetCapacity(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnCapacityReservationFleet].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param allocationStrategy The strategy used by the Capacity Reservation Fleet to determine
     * which of the specified instance types to use. 
     */
    public fun allocationStrategy(allocationStrategy: String)

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
     * @param endDate The date and time at which the Capacity Reservation Fleet expires. 
     */
    public fun endDate(endDate: String)

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
     * @param instanceMatchCriteria Indicates the type of instance launches that the Capacity
     * Reservation Fleet accepts. 
     */
    public fun instanceMatchCriteria(instanceMatchCriteria: String)

    /**
     * Information about the instance types for which to reserve the capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-instancetypespecifications)
     * @param instanceTypeSpecifications Information about the instance types for which to reserve
     * the capacity. 
     */
    public fun instanceTypeSpecifications(instanceTypeSpecifications: IResolvable)

    /**
     * Information about the instance types for which to reserve the capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-instancetypespecifications)
     * @param instanceTypeSpecifications Information about the instance types for which to reserve
     * the capacity. 
     */
    public fun instanceTypeSpecifications(instanceTypeSpecifications: List<Any>)

    /**
     * Information about the instance types for which to reserve the capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-instancetypespecifications)
     * @param instanceTypeSpecifications Information about the instance types for which to reserve
     * the capacity. 
     */
    public fun instanceTypeSpecifications(vararg instanceTypeSpecifications: Any)

    /**
     * Used to add an end date to a Capacity Reservation Fleet that has no end date and time.
     *
     * To add an end date to a Capacity Reservation Fleet, specify `true` for this paramater and
     * specify the end date and time (in UTC time format) for the *EndDate* parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-noremoveenddate)
     * @param noRemoveEndDate Used to add an end date to a Capacity Reservation Fleet that has no
     * end date and time. 
     */
    public fun noRemoveEndDate(noRemoveEndDate: Boolean)

    /**
     * Used to add an end date to a Capacity Reservation Fleet that has no end date and time.
     *
     * To add an end date to a Capacity Reservation Fleet, specify `true` for this paramater and
     * specify the end date and time (in UTC time format) for the *EndDate* parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-noremoveenddate)
     * @param noRemoveEndDate Used to add an end date to a Capacity Reservation Fleet that has no
     * end date and time. 
     */
    public fun noRemoveEndDate(noRemoveEndDate: IResolvable)

    /**
     * Used to remove an end date from a Capacity Reservation Fleet that is configured to end
     * automatically at a specific date and time.
     *
     * To remove the end date from a Capacity Reservation Fleet, specify `true` for this paramater
     * and omit the *EndDate* parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-removeenddate)
     * @param removeEndDate Used to remove an end date from a Capacity Reservation Fleet that is
     * configured to end automatically at a specific date and time. 
     */
    public fun removeEndDate(removeEndDate: Boolean)

    /**
     * Used to remove an end date from a Capacity Reservation Fleet that is configured to end
     * automatically at a specific date and time.
     *
     * To remove the end date from a Capacity Reservation Fleet, specify `true` for this paramater
     * and omit the *EndDate* parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-removeenddate)
     * @param removeEndDate Used to remove an end date from a Capacity Reservation Fleet that is
     * configured to end automatically at a specific date and time. 
     */
    public fun removeEndDate(removeEndDate: IResolvable)

    /**
     * The tags to assign to the Capacity Reservation Fleet.
     *
     * The tags are automatically assigned to the Capacity Reservations in the Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-tagspecifications)
     * @param tagSpecifications The tags to assign to the Capacity Reservation Fleet. 
     */
    public fun tagSpecifications(tagSpecifications: IResolvable)

    /**
     * The tags to assign to the Capacity Reservation Fleet.
     *
     * The tags are automatically assigned to the Capacity Reservations in the Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-tagspecifications)
     * @param tagSpecifications The tags to assign to the Capacity Reservation Fleet. 
     */
    public fun tagSpecifications(tagSpecifications: List<Any>)

    /**
     * The tags to assign to the Capacity Reservation Fleet.
     *
     * The tags are automatically assigned to the Capacity Reservations in the Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-tagspecifications)
     * @param tagSpecifications The tags to assign to the Capacity Reservation Fleet. 
     */
    public fun tagSpecifications(vararg tagSpecifications: Any)

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
     * @param tenancy Indicates the tenancy of the Capacity Reservation Fleet. 
     */
    public fun tenancy(tenancy: String)

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
     * @param totalTargetCapacity The total number of capacity units to be reserved by the Capacity
     * Reservation Fleet. 
     */
    public fun totalTargetCapacity(totalTargetCapacity: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.Builder
        = software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.Builder.create(scope, id)

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
     * @param allocationStrategy The strategy used by the Capacity Reservation Fleet to determine
     * which of the specified instance types to use. 
     */
    override fun allocationStrategy(allocationStrategy: String) {
      cdkBuilder.allocationStrategy(allocationStrategy)
    }

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
     * @param endDate The date and time at which the Capacity Reservation Fleet expires. 
     */
    override fun endDate(endDate: String) {
      cdkBuilder.endDate(endDate)
    }

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
     * @param instanceMatchCriteria Indicates the type of instance launches that the Capacity
     * Reservation Fleet accepts. 
     */
    override fun instanceMatchCriteria(instanceMatchCriteria: String) {
      cdkBuilder.instanceMatchCriteria(instanceMatchCriteria)
    }

    /**
     * Information about the instance types for which to reserve the capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-instancetypespecifications)
     * @param instanceTypeSpecifications Information about the instance types for which to reserve
     * the capacity. 
     */
    override fun instanceTypeSpecifications(instanceTypeSpecifications: IResolvable) {
      cdkBuilder.instanceTypeSpecifications(instanceTypeSpecifications.let(IResolvable::unwrap))
    }

    /**
     * Information about the instance types for which to reserve the capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-instancetypespecifications)
     * @param instanceTypeSpecifications Information about the instance types for which to reserve
     * the capacity. 
     */
    override fun instanceTypeSpecifications(instanceTypeSpecifications: List<Any>) {
      cdkBuilder.instanceTypeSpecifications(instanceTypeSpecifications)
    }

    /**
     * Information about the instance types for which to reserve the capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-instancetypespecifications)
     * @param instanceTypeSpecifications Information about the instance types for which to reserve
     * the capacity. 
     */
    override fun instanceTypeSpecifications(vararg instanceTypeSpecifications: Any): Unit =
        instanceTypeSpecifications(instanceTypeSpecifications.toList())

    /**
     * Used to add an end date to a Capacity Reservation Fleet that has no end date and time.
     *
     * To add an end date to a Capacity Reservation Fleet, specify `true` for this paramater and
     * specify the end date and time (in UTC time format) for the *EndDate* parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-noremoveenddate)
     * @param noRemoveEndDate Used to add an end date to a Capacity Reservation Fleet that has no
     * end date and time. 
     */
    override fun noRemoveEndDate(noRemoveEndDate: Boolean) {
      cdkBuilder.noRemoveEndDate(noRemoveEndDate)
    }

    /**
     * Used to add an end date to a Capacity Reservation Fleet that has no end date and time.
     *
     * To add an end date to a Capacity Reservation Fleet, specify `true` for this paramater and
     * specify the end date and time (in UTC time format) for the *EndDate* parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-noremoveenddate)
     * @param noRemoveEndDate Used to add an end date to a Capacity Reservation Fleet that has no
     * end date and time. 
     */
    override fun noRemoveEndDate(noRemoveEndDate: IResolvable) {
      cdkBuilder.noRemoveEndDate(noRemoveEndDate.let(IResolvable::unwrap))
    }

    /**
     * Used to remove an end date from a Capacity Reservation Fleet that is configured to end
     * automatically at a specific date and time.
     *
     * To remove the end date from a Capacity Reservation Fleet, specify `true` for this paramater
     * and omit the *EndDate* parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-removeenddate)
     * @param removeEndDate Used to remove an end date from a Capacity Reservation Fleet that is
     * configured to end automatically at a specific date and time. 
     */
    override fun removeEndDate(removeEndDate: Boolean) {
      cdkBuilder.removeEndDate(removeEndDate)
    }

    /**
     * Used to remove an end date from a Capacity Reservation Fleet that is configured to end
     * automatically at a specific date and time.
     *
     * To remove the end date from a Capacity Reservation Fleet, specify `true` for this paramater
     * and omit the *EndDate* parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-removeenddate)
     * @param removeEndDate Used to remove an end date from a Capacity Reservation Fleet that is
     * configured to end automatically at a specific date and time. 
     */
    override fun removeEndDate(removeEndDate: IResolvable) {
      cdkBuilder.removeEndDate(removeEndDate.let(IResolvable::unwrap))
    }

    /**
     * The tags to assign to the Capacity Reservation Fleet.
     *
     * The tags are automatically assigned to the Capacity Reservations in the Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-tagspecifications)
     * @param tagSpecifications The tags to assign to the Capacity Reservation Fleet. 
     */
    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
    }

    /**
     * The tags to assign to the Capacity Reservation Fleet.
     *
     * The tags are automatically assigned to the Capacity Reservations in the Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-tagspecifications)
     * @param tagSpecifications The tags to assign to the Capacity Reservation Fleet. 
     */
    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications)
    }

    /**
     * The tags to assign to the Capacity Reservation Fleet.
     *
     * The tags are automatically assigned to the Capacity Reservations in the Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html#cfn-ec2-capacityreservationfleet-tagspecifications)
     * @param tagSpecifications The tags to assign to the Capacity Reservation Fleet. 
     */
    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

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
     * @param tenancy Indicates the tenancy of the Capacity Reservation Fleet. 
     */
    override fun tenancy(tenancy: String) {
      cdkBuilder.tenancy(tenancy)
    }

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
     * @param totalTargetCapacity The total number of capacity units to be reserved by the Capacity
     * Reservation Fleet. 
     */
    override fun totalTargetCapacity(totalTargetCapacity: Number) {
      cdkBuilder.totalTargetCapacity(totalTargetCapacity)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCapacityReservationFleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCapacityReservationFleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet):
        CfnCapacityReservationFleet = CfnCapacityReservationFleet(cdkObject)

    internal fun unwrap(wrapped: CfnCapacityReservationFleet):
        software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet = wrapped.cdkObject
  }

  /**
   * The tags to apply to a resource when the resource is being created.
   *
   * When you specify a tag, you must specify the resource type to tag, otherwise the request will
   * fail.
   *
   *
   * The `Valid Values` lists all the resource types that can be tagged. However, the action you're
   * using might not support tagging all of these resource types. If you try to tag a resource type
   * that is unsupported for the action you're using, you'll get an error.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * TagSpecificationProperty tagSpecificationProperty = TagSpecificationProperty.builder()
   * .resourceType("resourceType")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-tagspecification.html)
   */
  public interface TagSpecificationProperty {
    /**
     * The type of resource to tag on creation. Specify `capacity-reservation-fleet` .
     *
     * To tag a resource after it has been created, see
     * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-tagspecification.html#cfn-ec2-capacityreservationfleet-tagspecification-resourcetype)
     */
    public fun resourceType(): String? = unwrap(this).getResourceType()

    /**
     * The tags to apply to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-tagspecification.html#cfn-ec2-capacityreservationfleet-tagspecification-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A builder for [TagSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceType The type of resource to tag on creation. Specify
       * `capacity-reservation-fleet` .
       * To tag a resource after it has been created, see
       * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
       */
      public fun resourceType(resourceType: String)

      /**
       * @param tags The tags to apply to the resource.
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags The tags to apply to the resource.
       */
      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.TagSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.TagSpecificationProperty.builder()

      /**
       * @param resourceType The type of resource to tag on creation. Specify
       * `capacity-reservation-fleet` .
       * To tag a resource after it has been created, see
       * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
       */
      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      /**
       * @param tags The tags to apply to the resource.
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      /**
       * @param tags The tags to apply to the resource.
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.TagSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.TagSpecificationProperty,
    ) : CdkObject(cdkObject), TagSpecificationProperty {
      /**
       * The type of resource to tag on creation. Specify `capacity-reservation-fleet` .
       *
       * To tag a resource after it has been created, see
       * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-tagspecification.html#cfn-ec2-capacityreservationfleet-tagspecification-resourcetype)
       */
      override fun resourceType(): String? = unwrap(this).getResourceType()

      /**
       * The tags to apply to the resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-tagspecification.html#cfn-ec2-capacityreservationfleet-tagspecification-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.TagSpecificationProperty):
          TagSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as? TagSpecificationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.TagSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.TagSpecificationProperty
    }
  }

  /**
   * Specifies information about an instance type to use in a Capacity Reservation Fleet.
   *
   * `InstanceTypeSpecification` is a property of the
   * [AWS::EC2::CapacityReservationFleet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * InstanceTypeSpecificationProperty instanceTypeSpecificationProperty =
   * InstanceTypeSpecificationProperty.builder()
   * .availabilityZone("availabilityZone")
   * .availabilityZoneId("availabilityZoneId")
   * .ebsOptimized(false)
   * .instancePlatform("instancePlatform")
   * .instanceType("instanceType")
   * .priority(123)
   * .weight(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html)
   */
  public interface InstanceTypeSpecificationProperty {
    /**
     * The Availability Zone in which the Capacity Reservation Fleet reserves the capacity.
     *
     * A Capacity Reservation Fleet can't span Availability Zones. All instance type specifications
     * that you specify for the Fleet must use the same Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html#cfn-ec2-capacityreservationfleet-instancetypespecification-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The ID of the Availability Zone in which the Capacity Reservation Fleet reserves the
     * capacity.
     *
     * A Capacity Reservation Fleet can't span Availability Zones. All instance type specifications
     * that you specify for the Fleet must use the same Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html#cfn-ec2-capacityreservationfleet-instancetypespecification-availabilityzoneid)
     */
    public fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

    /**
     * Indicates whether the Capacity Reservation Fleet supports EBS-optimized instances types.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization isn't available with all instance
     * types. Additional usage charges apply when using EBS-optimized instance types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html#cfn-ec2-capacityreservationfleet-instancetypespecification-ebsoptimized)
     */
    public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    /**
     * The type of operating system for which the Capacity Reservation Fleet reserves capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html#cfn-ec2-capacityreservationfleet-instancetypespecification-instanceplatform)
     */
    public fun instancePlatform(): String? = unwrap(this).getInstancePlatform()

    /**
     * The instance type for which the Capacity Reservation Fleet reserves capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html#cfn-ec2-capacityreservationfleet-instancetypespecification-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * The priority to assign to the instance type.
     *
     * This value is used to determine which of the instance types specified for the Fleet should be
     * prioritized for use. A lower value indicates a high priority. For more information, see
     * [Instance type
     * priority](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority)
     * in the Amazon EC2 User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html#cfn-ec2-capacityreservationfleet-instancetypespecification-priority)
     */
    public fun priority(): Number? = unwrap(this).getPriority()

    /**
     * The number of capacity units provided by the specified instance type.
     *
     * This value, together with the total target capacity that you specify for the Fleet determine
     * the number of instances for which the Fleet reserves capacity. Both values are based on units
     * that make sense for your workload. For more information, see [Total target
     * capacity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity)
     * in the Amazon EC2 User Guide.
     *
     * Valid Range: Minimum value of `0.001` . Maximum value of `99.999` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html#cfn-ec2-capacityreservationfleet-instancetypespecification-weight)
     */
    public fun weight(): Number? = unwrap(this).getWeight()

    /**
     * A builder for [InstanceTypeSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The Availability Zone in which the Capacity Reservation Fleet
       * reserves the capacity.
       * A Capacity Reservation Fleet can't span Availability Zones. All instance type
       * specifications that you specify for the Fleet must use the same Availability Zone.
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param availabilityZoneId The ID of the Availability Zone in which the Capacity Reservation
       * Fleet reserves the capacity.
       * A Capacity Reservation Fleet can't span Availability Zones. All instance type
       * specifications that you specify for the Fleet must use the same Availability Zone.
       */
      public fun availabilityZoneId(availabilityZoneId: String)

      /**
       * @param ebsOptimized Indicates whether the Capacity Reservation Fleet supports EBS-optimized
       * instances types.
       * This optimization provides dedicated throughput to Amazon EBS and an optimized
       * configuration stack to provide optimal I/O performance. This optimization isn't available with
       * all instance types. Additional usage charges apply when using EBS-optimized instance types.
       */
      public fun ebsOptimized(ebsOptimized: Boolean)

      /**
       * @param ebsOptimized Indicates whether the Capacity Reservation Fleet supports EBS-optimized
       * instances types.
       * This optimization provides dedicated throughput to Amazon EBS and an optimized
       * configuration stack to provide optimal I/O performance. This optimization isn't available with
       * all instance types. Additional usage charges apply when using EBS-optimized instance types.
       */
      public fun ebsOptimized(ebsOptimized: IResolvable)

      /**
       * @param instancePlatform The type of operating system for which the Capacity Reservation
       * Fleet reserves capacity.
       */
      public fun instancePlatform(instancePlatform: String)

      /**
       * @param instanceType The instance type for which the Capacity Reservation Fleet reserves
       * capacity.
       */
      public fun instanceType(instanceType: String)

      /**
       * @param priority The priority to assign to the instance type.
       * This value is used to determine which of the instance types specified for the Fleet should
       * be prioritized for use. A lower value indicates a high priority. For more information, see
       * [Instance type
       * priority](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority)
       * in the Amazon EC2 User Guide.
       */
      public fun priority(priority: Number)

      /**
       * @param weight The number of capacity units provided by the specified instance type.
       * This value, together with the total target capacity that you specify for the Fleet
       * determine the number of instances for which the Fleet reserves capacity. Both values are based
       * on units that make sense for your workload. For more information, see [Total target
       * capacity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity)
       * in the Amazon EC2 User Guide.
       *
       * Valid Range: Minimum value of `0.001` . Maximum value of `99.999` .
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty.builder()

      /**
       * @param availabilityZone The Availability Zone in which the Capacity Reservation Fleet
       * reserves the capacity.
       * A Capacity Reservation Fleet can't span Availability Zones. All instance type
       * specifications that you specify for the Fleet must use the same Availability Zone.
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param availabilityZoneId The ID of the Availability Zone in which the Capacity Reservation
       * Fleet reserves the capacity.
       * A Capacity Reservation Fleet can't span Availability Zones. All instance type
       * specifications that you specify for the Fleet must use the same Availability Zone.
       */
      override fun availabilityZoneId(availabilityZoneId: String) {
        cdkBuilder.availabilityZoneId(availabilityZoneId)
      }

      /**
       * @param ebsOptimized Indicates whether the Capacity Reservation Fleet supports EBS-optimized
       * instances types.
       * This optimization provides dedicated throughput to Amazon EBS and an optimized
       * configuration stack to provide optimal I/O performance. This optimization isn't available with
       * all instance types. Additional usage charges apply when using EBS-optimized instance types.
       */
      override fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
      }

      /**
       * @param ebsOptimized Indicates whether the Capacity Reservation Fleet supports EBS-optimized
       * instances types.
       * This optimization provides dedicated throughput to Amazon EBS and an optimized
       * configuration stack to provide optimal I/O performance. This optimization isn't available with
       * all instance types. Additional usage charges apply when using EBS-optimized instance types.
       */
      override fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
      }

      /**
       * @param instancePlatform The type of operating system for which the Capacity Reservation
       * Fleet reserves capacity.
       */
      override fun instancePlatform(instancePlatform: String) {
        cdkBuilder.instancePlatform(instancePlatform)
      }

      /**
       * @param instanceType The instance type for which the Capacity Reservation Fleet reserves
       * capacity.
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param priority The priority to assign to the instance type.
       * This value is used to determine which of the instance types specified for the Fleet should
       * be prioritized for use. A lower value indicates a high priority. For more information, see
       * [Instance type
       * priority](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority)
       * in the Amazon EC2 User Guide.
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param weight The number of capacity units provided by the specified instance type.
       * This value, together with the total target capacity that you specify for the Fleet
       * determine the number of instances for which the Fleet reserves capacity. Both values are based
       * on units that make sense for your workload. For more information, see [Total target
       * capacity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity)
       * in the Amazon EC2 User Guide.
       *
       * Valid Range: Minimum value of `0.001` . Maximum value of `99.999` .
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty,
    ) : CdkObject(cdkObject), InstanceTypeSpecificationProperty {
      /**
       * The Availability Zone in which the Capacity Reservation Fleet reserves the capacity.
       *
       * A Capacity Reservation Fleet can't span Availability Zones. All instance type
       * specifications that you specify for the Fleet must use the same Availability Zone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html#cfn-ec2-capacityreservationfleet-instancetypespecification-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * The ID of the Availability Zone in which the Capacity Reservation Fleet reserves the
       * capacity.
       *
       * A Capacity Reservation Fleet can't span Availability Zones. All instance type
       * specifications that you specify for the Fleet must use the same Availability Zone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html#cfn-ec2-capacityreservationfleet-instancetypespecification-availabilityzoneid)
       */
      override fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

      /**
       * Indicates whether the Capacity Reservation Fleet supports EBS-optimized instances types.
       *
       * This optimization provides dedicated throughput to Amazon EBS and an optimized
       * configuration stack to provide optimal I/O performance. This optimization isn't available with
       * all instance types. Additional usage charges apply when using EBS-optimized instance types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html#cfn-ec2-capacityreservationfleet-instancetypespecification-ebsoptimized)
       */
      override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

      /**
       * The type of operating system for which the Capacity Reservation Fleet reserves capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html#cfn-ec2-capacityreservationfleet-instancetypespecification-instanceplatform)
       */
      override fun instancePlatform(): String? = unwrap(this).getInstancePlatform()

      /**
       * The instance type for which the Capacity Reservation Fleet reserves capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html#cfn-ec2-capacityreservationfleet-instancetypespecification-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      /**
       * The priority to assign to the instance type.
       *
       * This value is used to determine which of the instance types specified for the Fleet should
       * be prioritized for use. A lower value indicates a high priority. For more information, see
       * [Instance type
       * priority](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority)
       * in the Amazon EC2 User Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html#cfn-ec2-capacityreservationfleet-instancetypespecification-priority)
       */
      override fun priority(): Number? = unwrap(this).getPriority()

      /**
       * The number of capacity units provided by the specified instance type.
       *
       * This value, together with the total target capacity that you specify for the Fleet
       * determine the number of instances for which the Fleet reserves capacity. Both values are based
       * on units that make sense for your workload. For more information, see [Total target
       * capacity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity)
       * in the Amazon EC2 User Guide.
       *
       * Valid Range: Minimum value of `0.001` . Maximum value of `99.999` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html#cfn-ec2-capacityreservationfleet-instancetypespecification-weight)
       */
      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceTypeSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty):
          InstanceTypeSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceTypeSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceTypeSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty
    }
  }
}
