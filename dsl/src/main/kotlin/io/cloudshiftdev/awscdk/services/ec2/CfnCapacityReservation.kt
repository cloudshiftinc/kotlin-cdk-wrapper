package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCapacityReservation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservation,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Returns the Availability Zone in which the capacity is reserved.
   *
   * For example: `us-east-1a` .
   */
  public open fun attrAvailabilityZone(): String = unwrap(this).getAttrAvailabilityZone()

  /**
   * Returns the remaining capacity, which indicates the number of instances that can be launched in
   * the Capacity Reservation.
   *
   * For example: `9` .
   */
  public open fun attrAvailableInstanceCount(): Number =
      unwrap(this).getAttrAvailableInstanceCount()

  /**
   * The ID of the Capacity Reservation.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Returns the type of instance for which the capacity is reserved.
   *
   * For example: `m4.large` .
   */
  public open fun attrInstanceType(): String = unwrap(this).getAttrInstanceType()

  /**
   * Returns the tenancy of the Capacity Reservation.
   *
   * For example: `dedicated` .
   */
  public open fun attrTenancy(): String = unwrap(this).getAttrTenancy()

  /**
   * Returns the total number of instances for which the Capacity Reservation reserves capacity.
   *
   * For example: `15` .
   */
  public open fun attrTotalInstanceCount(): Number = unwrap(this).getAttrTotalInstanceCount()

  /**
   * The Availability Zone in which to create the Capacity Reservation.
   */
  public open fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

  /**
   * The Availability Zone in which to create the Capacity Reservation.
   */
  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  /**
   * Indicates whether the Capacity Reservation supports EBS-optimized instances.
   */
  public open fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

  /**
   * Indicates whether the Capacity Reservation supports EBS-optimized instances.
   */
  public open fun ebsOptimized(`value`: Boolean) {
    unwrap(this).setEbsOptimized(`value`)
  }

  /**
   * Indicates whether the Capacity Reservation supports EBS-optimized instances.
   */
  public open fun ebsOptimized(`value`: IResolvable) {
    unwrap(this).setEbsOptimized(`value`.let(IResolvable::unwrap))
  }

  /**
   * The date and time at which the Capacity Reservation expires.
   */
  public open fun endDate(): String? = unwrap(this).getEndDate()

  /**
   * The date and time at which the Capacity Reservation expires.
   */
  public open fun endDate(`value`: String) {
    unwrap(this).setEndDate(`value`)
  }

  /**
   * Indicates the way in which the Capacity Reservation ends.
   */
  public open fun endDateType(): String? = unwrap(this).getEndDateType()

  /**
   * Indicates the way in which the Capacity Reservation ends.
   */
  public open fun endDateType(`value`: String) {
    unwrap(this).setEndDateType(`value`)
  }

  /**
   * *Deprecated.*.
   */
  public open fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

  /**
   * *Deprecated.*.
   */
  public open fun ephemeralStorage(`value`: Boolean) {
    unwrap(this).setEphemeralStorage(`value`)
  }

  /**
   * *Deprecated.*.
   */
  public open fun ephemeralStorage(`value`: IResolvable) {
    unwrap(this).setEphemeralStorage(`value`.let(IResolvable::unwrap))
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
   * The number of instances for which to reserve capacity.
   */
  public open fun instanceCount(): Number = unwrap(this).getInstanceCount()

  /**
   * The number of instances for which to reserve capacity.
   */
  public open fun instanceCount(`value`: Number) {
    unwrap(this).setInstanceCount(`value`)
  }

  /**
   * Indicates the type of instance launches that the Capacity Reservation accepts.
   *
   * The options include:.
   */
  public open fun instanceMatchCriteria(): String? = unwrap(this).getInstanceMatchCriteria()

  /**
   * Indicates the type of instance launches that the Capacity Reservation accepts.
   *
   * The options include:.
   */
  public open fun instanceMatchCriteria(`value`: String) {
    unwrap(this).setInstanceMatchCriteria(`value`)
  }

  /**
   * The type of operating system for which to reserve capacity.
   */
  public open fun instancePlatform(): String = unwrap(this).getInstancePlatform()

  /**
   * The type of operating system for which to reserve capacity.
   */
  public open fun instancePlatform(`value`: String) {
    unwrap(this).setInstancePlatform(`value`)
  }

  /**
   * The instance type for which to reserve capacity.
   */
  public open fun instanceType(): String = unwrap(this).getInstanceType()

  /**
   * The instance type for which to reserve capacity.
   */
  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the Outpost on which to create the Capacity Reservation.
   */
  public open fun outPostArn(): String? = unwrap(this).getOutPostArn()

  /**
   * The Amazon Resource Name (ARN) of the Outpost on which to create the Capacity Reservation.
   */
  public open fun outPostArn(`value`: String) {
    unwrap(this).setOutPostArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the cluster placement group in which to create the Capacity
   * Reservation.
   */
  public open fun placementGroupArn(): String? = unwrap(this).getPlacementGroupArn()

  /**
   * The Amazon Resource Name (ARN) of the cluster placement group in which to create the Capacity
   * Reservation.
   */
  public open fun placementGroupArn(`value`: String) {
    unwrap(this).setPlacementGroupArn(`value`)
  }

  /**
   * The tags to apply to the Capacity Reservation during launch.
   */
  public open fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  /**
   * The tags to apply to the Capacity Reservation during launch.
   */
  public open fun tagSpecifications(`value`: IResolvable) {
    unwrap(this).setTagSpecifications(`value`.let(IResolvable::unwrap))
  }

  /**
   * The tags to apply to the Capacity Reservation during launch.
   */
  public open fun tagSpecifications(__idx_ac66f0: List<Any>) {
    unwrap(this).setTagSpecifications(__idx_ac66f0)
  }

  /**
   * The tags to apply to the Capacity Reservation during launch.
   */
  public open fun tagSpecifications(vararg __idx_ac66f0: Any): Unit =
      tagSpecifications(__idx_ac66f0.toList())

  /**
   * Indicates the tenancy of the Capacity Reservation.
   *
   * A Capacity Reservation can have one of the following tenancy settings:.
   */
  public open fun tenancy(): String? = unwrap(this).getTenancy()

  /**
   * Indicates the tenancy of the Capacity Reservation.
   *
   * A Capacity Reservation can have one of the following tenancy settings:.
   */
  public open fun tenancy(`value`: String) {
    unwrap(this).setTenancy(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnCapacityReservation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Availability Zone in which to create the Capacity Reservation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-availabilityzone)
     * @param availabilityZone The Availability Zone in which to create the Capacity Reservation. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * Indicates whether the Capacity Reservation supports EBS-optimized instances.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization isn't available with all instance
     * types. Additional usage charges apply when using an EBS- optimized instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ebsoptimized)
     * @param ebsOptimized Indicates whether the Capacity Reservation supports EBS-optimized
     * instances. 
     */
    public fun ebsOptimized(ebsOptimized: Boolean)

    /**
     * Indicates whether the Capacity Reservation supports EBS-optimized instances.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization isn't available with all instance
     * types. Additional usage charges apply when using an EBS- optimized instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ebsoptimized)
     * @param ebsOptimized Indicates whether the Capacity Reservation supports EBS-optimized
     * instances. 
     */
    public fun ebsOptimized(ebsOptimized: IResolvable)

    /**
     * The date and time at which the Capacity Reservation expires.
     *
     * When a Capacity Reservation expires, the reserved capacity is released and you can no longer
     * launch instances into it. The Capacity Reservation's state changes to `expired` when it reaches
     * its end date and time.
     *
     * You must provide an `EndDate` value if `EndDateType` is `limited` . Omit `EndDate` if
     * `EndDateType` is `unlimited` .
     *
     * If the `EndDateType` is `limited` , the Capacity Reservation is cancelled within an hour from
     * the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is
     * guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-enddate)
     * @param endDate The date and time at which the Capacity Reservation expires. 
     */
    public fun endDate(endDate: String)

    /**
     * Indicates the way in which the Capacity Reservation ends.
     *
     * A Capacity Reservation can have one of the following end types:
     *
     * * `unlimited` - The Capacity Reservation remains active until you explicitly cancel it. Do
     * not provide an `EndDate` if the `EndDateType` is `unlimited` .
     * * `limited` - The Capacity Reservation expires automatically at a specified date and time.
     * You must provide an `EndDate` value if the `EndDateType` value is `limited` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-enddatetype)
     * @param endDateType Indicates the way in which the Capacity Reservation ends. 
     */
    public fun endDateType(endDateType: String)

    /**
     * *Deprecated.*.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ephemeralstorage)
     * @param ephemeralStorage *Deprecated.*. 
     */
    public fun ephemeralStorage(ephemeralStorage: Boolean)

    /**
     * *Deprecated.*.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ephemeralstorage)
     * @param ephemeralStorage *Deprecated.*. 
     */
    public fun ephemeralStorage(ephemeralStorage: IResolvable)

    /**
     * The number of instances for which to reserve capacity.
     *
     * Valid range: 1 - 1000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancecount)
     * @param instanceCount The number of instances for which to reserve capacity. 
     */
    public fun instanceCount(instanceCount: Number)

    /**
     * Indicates the type of instance launches that the Capacity Reservation accepts. The options
     * include:.
     *
     * * `open` - The Capacity Reservation automatically matches all instances that have matching
     * attributes (instance type, platform, and Availability Zone). Instances that have matching
     * attributes run in the Capacity Reservation automatically without specifying any additional
     * parameters.
     * * `targeted` - The Capacity Reservation only accepts instances that have matching attributes
     * (instance type, platform, and Availability Zone), and explicitly target the Capacity
     * Reservation. This ensures that only permitted instances can use the reserved capacity.
     *
     * Default: `open`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancematchcriteria)
     * @param instanceMatchCriteria Indicates the type of instance launches that the Capacity
     * Reservation accepts. The options include:. 
     */
    public fun instanceMatchCriteria(instanceMatchCriteria: String)

    /**
     * The type of operating system for which to reserve capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instanceplatform)
     * @param instancePlatform The type of operating system for which to reserve capacity. 
     */
    public fun instancePlatform(instancePlatform: String)

    /**
     * The instance type for which to reserve capacity.
     *
     * For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancetype)
     * @param instanceType The instance type for which to reserve capacity. 
     */
    public fun instanceType(instanceType: String)

    /**
     * The Amazon Resource Name (ARN) of the Outpost on which to create the Capacity Reservation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-outpostarn)
     * @param outPostArn The Amazon Resource Name (ARN) of the Outpost on which to create the
     * Capacity Reservation. 
     */
    public fun outPostArn(outPostArn: String)

    /**
     * The Amazon Resource Name (ARN) of the cluster placement group in which to create the Capacity
     * Reservation.
     *
     * For more information, see [Capacity Reservations for cluster placement
     * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cr-cpg.html) in the *Amazon EC2 User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-placementgrouparn)
     * @param placementGroupArn The Amazon Resource Name (ARN) of the cluster placement group in
     * which to create the Capacity Reservation. 
     */
    public fun placementGroupArn(placementGroupArn: String)

    /**
     * The tags to apply to the Capacity Reservation during launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tagspecifications)
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch. 
     */
    public fun tagSpecifications(tagSpecifications: IResolvable)

    /**
     * The tags to apply to the Capacity Reservation during launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tagspecifications)
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch. 
     */
    public fun tagSpecifications(tagSpecifications: List<Any>)

    /**
     * The tags to apply to the Capacity Reservation during launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tagspecifications)
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch. 
     */
    public fun tagSpecifications(vararg tagSpecifications: Any)

    /**
     * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the
     * following tenancy settings:.
     *
     * * `default` - The Capacity Reservation is created on hardware that is shared with other AWS
     * accounts .
     * * `dedicated` - The Capacity Reservation is created on single-tenant hardware that is
     * dedicated to a single AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tenancy)
     * @param tenancy Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can
     * have one of the following tenancy settings:. 
     */
    public fun tenancy(tenancy: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnCapacityReservation.Builder =
        software.amazon.awscdk.services.ec2.CfnCapacityReservation.Builder.create(scope, id)

    /**
     * The Availability Zone in which to create the Capacity Reservation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-availabilityzone)
     * @param availabilityZone The Availability Zone in which to create the Capacity Reservation. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * Indicates whether the Capacity Reservation supports EBS-optimized instances.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization isn't available with all instance
     * types. Additional usage charges apply when using an EBS- optimized instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ebsoptimized)
     * @param ebsOptimized Indicates whether the Capacity Reservation supports EBS-optimized
     * instances. 
     */
    override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * Indicates whether the Capacity Reservation supports EBS-optimized instances.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization isn't available with all instance
     * types. Additional usage charges apply when using an EBS- optimized instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ebsoptimized)
     * @param ebsOptimized Indicates whether the Capacity Reservation supports EBS-optimized
     * instances. 
     */
    override fun ebsOptimized(ebsOptimized: IResolvable) {
      cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
    }

    /**
     * The date and time at which the Capacity Reservation expires.
     *
     * When a Capacity Reservation expires, the reserved capacity is released and you can no longer
     * launch instances into it. The Capacity Reservation's state changes to `expired` when it reaches
     * its end date and time.
     *
     * You must provide an `EndDate` value if `EndDateType` is `limited` . Omit `EndDate` if
     * `EndDateType` is `unlimited` .
     *
     * If the `EndDateType` is `limited` , the Capacity Reservation is cancelled within an hour from
     * the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is
     * guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-enddate)
     * @param endDate The date and time at which the Capacity Reservation expires. 
     */
    override fun endDate(endDate: String) {
      cdkBuilder.endDate(endDate)
    }

    /**
     * Indicates the way in which the Capacity Reservation ends.
     *
     * A Capacity Reservation can have one of the following end types:
     *
     * * `unlimited` - The Capacity Reservation remains active until you explicitly cancel it. Do
     * not provide an `EndDate` if the `EndDateType` is `unlimited` .
     * * `limited` - The Capacity Reservation expires automatically at a specified date and time.
     * You must provide an `EndDate` value if the `EndDateType` value is `limited` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-enddatetype)
     * @param endDateType Indicates the way in which the Capacity Reservation ends. 
     */
    override fun endDateType(endDateType: String) {
      cdkBuilder.endDateType(endDateType)
    }

    /**
     * *Deprecated.*.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ephemeralstorage)
     * @param ephemeralStorage *Deprecated.*. 
     */
    override fun ephemeralStorage(ephemeralStorage: Boolean) {
      cdkBuilder.ephemeralStorage(ephemeralStorage)
    }

    /**
     * *Deprecated.*.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ephemeralstorage)
     * @param ephemeralStorage *Deprecated.*. 
     */
    override fun ephemeralStorage(ephemeralStorage: IResolvable) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
    }

    /**
     * The number of instances for which to reserve capacity.
     *
     * Valid range: 1 - 1000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancecount)
     * @param instanceCount The number of instances for which to reserve capacity. 
     */
    override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * Indicates the type of instance launches that the Capacity Reservation accepts. The options
     * include:.
     *
     * * `open` - The Capacity Reservation automatically matches all instances that have matching
     * attributes (instance type, platform, and Availability Zone). Instances that have matching
     * attributes run in the Capacity Reservation automatically without specifying any additional
     * parameters.
     * * `targeted` - The Capacity Reservation only accepts instances that have matching attributes
     * (instance type, platform, and Availability Zone), and explicitly target the Capacity
     * Reservation. This ensures that only permitted instances can use the reserved capacity.
     *
     * Default: `open`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancematchcriteria)
     * @param instanceMatchCriteria Indicates the type of instance launches that the Capacity
     * Reservation accepts. The options include:. 
     */
    override fun instanceMatchCriteria(instanceMatchCriteria: String) {
      cdkBuilder.instanceMatchCriteria(instanceMatchCriteria)
    }

    /**
     * The type of operating system for which to reserve capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instanceplatform)
     * @param instancePlatform The type of operating system for which to reserve capacity. 
     */
    override fun instancePlatform(instancePlatform: String) {
      cdkBuilder.instancePlatform(instancePlatform)
    }

    /**
     * The instance type for which to reserve capacity.
     *
     * For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancetype)
     * @param instanceType The instance type for which to reserve capacity. 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * The Amazon Resource Name (ARN) of the Outpost on which to create the Capacity Reservation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-outpostarn)
     * @param outPostArn The Amazon Resource Name (ARN) of the Outpost on which to create the
     * Capacity Reservation. 
     */
    override fun outPostArn(outPostArn: String) {
      cdkBuilder.outPostArn(outPostArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the cluster placement group in which to create the Capacity
     * Reservation.
     *
     * For more information, see [Capacity Reservations for cluster placement
     * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cr-cpg.html) in the *Amazon EC2 User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-placementgrouparn)
     * @param placementGroupArn The Amazon Resource Name (ARN) of the cluster placement group in
     * which to create the Capacity Reservation. 
     */
    override fun placementGroupArn(placementGroupArn: String) {
      cdkBuilder.placementGroupArn(placementGroupArn)
    }

    /**
     * The tags to apply to the Capacity Reservation during launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tagspecifications)
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch. 
     */
    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
    }

    /**
     * The tags to apply to the Capacity Reservation during launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tagspecifications)
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch. 
     */
    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications)
    }

    /**
     * The tags to apply to the Capacity Reservation during launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tagspecifications)
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch. 
     */
    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    /**
     * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the
     * following tenancy settings:.
     *
     * * `default` - The Capacity Reservation is created on hardware that is shared with other AWS
     * accounts .
     * * `dedicated` - The Capacity Reservation is created on single-tenant hardware that is
     * dedicated to a single AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tenancy)
     * @param tenancy Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can
     * have one of the following tenancy settings:. 
     */
    override fun tenancy(tenancy: String) {
      cdkBuilder.tenancy(tenancy)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnCapacityReservation =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCapacityReservation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCapacityReservation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservation):
        CfnCapacityReservation = CfnCapacityReservation(cdkObject)

    internal fun unwrap(wrapped: CfnCapacityReservation):
        software.amazon.awscdk.services.ec2.CfnCapacityReservation = wrapped.cdkObject
  }

  public interface TagSpecificationProperty {
    /**
     * The type of resource to tag.
     *
     * Specify `capacity-reservation` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservation-tagspecification.html#cfn-ec2-capacityreservation-tagspecification-resourcetype)
     */
    public fun resourceType(): String? = unwrap(this).getResourceType()

    /**
     * The tags to apply to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservation-tagspecification.html#cfn-ec2-capacityreservation-tagspecification-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A builder for [TagSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceType The type of resource to tag.
       * Specify `capacity-reservation` .
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
          software.amazon.awscdk.services.ec2.CfnCapacityReservation.TagSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnCapacityReservation.TagSpecificationProperty.builder()

      /**
       * @param resourceType The type of resource to tag.
       * Specify `capacity-reservation` .
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
          software.amazon.awscdk.services.ec2.CfnCapacityReservation.TagSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnCapacityReservation.TagSpecificationProperty,
    ) : CdkObject(cdkObject), TagSpecificationProperty {
      /**
       * The type of resource to tag.
       *
       * Specify `capacity-reservation` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservation-tagspecification.html#cfn-ec2-capacityreservation-tagspecification-resourcetype)
       */
      override fun resourceType(): String? = unwrap(this).getResourceType()

      /**
       * The tags to apply to the resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservation-tagspecification.html#cfn-ec2-capacityreservation-tagspecification-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservation.TagSpecificationProperty):
          TagSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnCapacityReservation.TagSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnCapacityReservation.TagSpecificationProperty
    }
  }
}
