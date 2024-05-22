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
 * Properties for defining a `CfnCapacityReservation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnCapacityReservationProps cfnCapacityReservationProps = CfnCapacityReservationProps.builder()
 * .availabilityZone("availabilityZone")
 * .instanceCount(123)
 * .instancePlatform("instancePlatform")
 * .instanceType("instanceType")
 * // the properties below are optional
 * .ebsOptimized(false)
 * .endDate("endDate")
 * .endDateType("endDateType")
 * .ephemeralStorage(false)
 * .instanceMatchCriteria("instanceMatchCriteria")
 * .outPostArn("outPostArn")
 * .placementGroupArn("placementGroupArn")
 * .tagSpecifications(List.of(TagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .tenancy("tenancy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html)
 */
public interface CfnCapacityReservationProps {
  /**
   * The Availability Zone in which to create the Capacity Reservation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-availabilityzone)
   */
  public fun availabilityZone(): String

  /**
   * Indicates whether the Capacity Reservation supports EBS-optimized instances.
   *
   * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
   * stack to provide optimal I/O performance. This optimization isn't available with all instance
   * types. Additional usage charges apply when using an EBS- optimized instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ebsoptimized)
   */
  public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

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
   */
  public fun endDate(): String? = unwrap(this).getEndDate()

  /**
   * Indicates the way in which the Capacity Reservation ends.
   *
   * A Capacity Reservation can have one of the following end types:
   *
   * * `unlimited` - The Capacity Reservation remains active until you explicitly cancel it. Do not
   * provide an `EndDate` if the `EndDateType` is `unlimited` .
   * * `limited` - The Capacity Reservation expires automatically at a specified date and time. You
   * must provide an `EndDate` value if the `EndDateType` value is `limited` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-enddatetype)
   */
  public fun endDateType(): String? = unwrap(this).getEndDateType()

  /**
   * *Deprecated.*.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ephemeralstorage)
   */
  public fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

  /**
   * The number of instances for which to reserve capacity.
   *
   * Valid range: 1 - 1000
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancecount)
   */
  public fun instanceCount(): Number

  /**
   * Indicates the type of instance launches that the Capacity Reservation accepts. The options
   * include:.
   *
   * * `open` - The Capacity Reservation automatically matches all instances that have matching
   * attributes (instance type, platform, and Availability Zone). Instances that have matching
   * attributes run in the Capacity Reservation automatically without specifying any additional
   * parameters.
   * * `targeted` - The Capacity Reservation only accepts instances that have matching attributes
   * (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation.
   * This ensures that only permitted instances can use the reserved capacity.
   *
   * Default: `open`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancematchcriteria)
   */
  public fun instanceMatchCriteria(): String? = unwrap(this).getInstanceMatchCriteria()

  /**
   * The type of operating system for which to reserve capacity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instanceplatform)
   */
  public fun instancePlatform(): String

  /**
   * The instance type for which to reserve capacity.
   *
   * For more information, see [Instance
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon EC2
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancetype)
   */
  public fun instanceType(): String

  /**
   * The Amazon Resource Name (ARN) of the Outpost on which to create the Capacity Reservation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-outpostarn)
   */
  public fun outPostArn(): String? = unwrap(this).getOutPostArn()

  /**
   * The Amazon Resource Name (ARN) of the cluster placement group in which to create the Capacity
   * Reservation.
   *
   * For more information, see [Capacity Reservations for cluster placement
   * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cr-cpg.html) in the *Amazon EC2 User
   * Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-placementgrouparn)
   */
  public fun placementGroupArn(): String? = unwrap(this).getPlacementGroupArn()

  /**
   * The tags to apply to the Capacity Reservation during launch.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tagspecifications)
   */
  public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  /**
   * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the
   * following tenancy settings:.
   *
   * * `default` - The Capacity Reservation is created on hardware that is shared with other AWS
   * accounts .
   * * `dedicated` - The Capacity Reservation is created on single-tenant hardware that is dedicated
   * to a single AWS account .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tenancy)
   */
  public fun tenancy(): String? = unwrap(this).getTenancy()

  /**
   * A builder for [CfnCapacityReservationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZone The Availability Zone in which to create the Capacity Reservation. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param ebsOptimized Indicates whether the Capacity Reservation supports EBS-optimized
     * instances.
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization isn't available with all instance
     * types. Additional usage charges apply when using an EBS- optimized instance.
     */
    public fun ebsOptimized(ebsOptimized: Boolean)

    /**
     * @param ebsOptimized Indicates whether the Capacity Reservation supports EBS-optimized
     * instances.
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization isn't available with all instance
     * types. Additional usage charges apply when using an EBS- optimized instance.
     */
    public fun ebsOptimized(ebsOptimized: IResolvable)

    /**
     * @param endDate The date and time at which the Capacity Reservation expires.
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
     */
    public fun endDate(endDate: String)

    /**
     * @param endDateType Indicates the way in which the Capacity Reservation ends.
     * A Capacity Reservation can have one of the following end types:
     *
     * * `unlimited` - The Capacity Reservation remains active until you explicitly cancel it. Do
     * not provide an `EndDate` if the `EndDateType` is `unlimited` .
     * * `limited` - The Capacity Reservation expires automatically at a specified date and time.
     * You must provide an `EndDate` value if the `EndDateType` value is `limited` .
     */
    public fun endDateType(endDateType: String)

    /**
     * @param ephemeralStorage *Deprecated.*.
     */
    public fun ephemeralStorage(ephemeralStorage: Boolean)

    /**
     * @param ephemeralStorage *Deprecated.*.
     */
    public fun ephemeralStorage(ephemeralStorage: IResolvable)

    /**
     * @param instanceCount The number of instances for which to reserve capacity. 
     * Valid range: 1 - 1000
     */
    public fun instanceCount(instanceCount: Number)

    /**
     * @param instanceMatchCriteria Indicates the type of instance launches that the Capacity
     * Reservation accepts. The options include:.
     * * `open` - The Capacity Reservation automatically matches all instances that have matching
     * attributes (instance type, platform, and Availability Zone). Instances that have matching
     * attributes run in the Capacity Reservation automatically without specifying any additional
     * parameters.
     * * `targeted` - The Capacity Reservation only accepts instances that have matching attributes
     * (instance type, platform, and Availability Zone), and explicitly target the Capacity
     * Reservation. This ensures that only permitted instances can use the reserved capacity.
     *
     * Default: `open`
     */
    public fun instanceMatchCriteria(instanceMatchCriteria: String)

    /**
     * @param instancePlatform The type of operating system for which to reserve capacity. 
     */
    public fun instancePlatform(instancePlatform: String)

    /**
     * @param instanceType The instance type for which to reserve capacity. 
     * For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* .
     */
    public fun instanceType(instanceType: String)

    /**
     * @param outPostArn The Amazon Resource Name (ARN) of the Outpost on which to create the
     * Capacity Reservation.
     */
    public fun outPostArn(outPostArn: String)

    /**
     * @param placementGroupArn The Amazon Resource Name (ARN) of the cluster placement group in
     * which to create the Capacity Reservation.
     * For more information, see [Capacity Reservations for cluster placement
     * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cr-cpg.html) in the *Amazon EC2 User
     * Guide* .
     */
    public fun placementGroupArn(placementGroupArn: String)

    /**
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch.
     */
    public fun tagSpecifications(tagSpecifications: IResolvable)

    /**
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch.
     */
    public fun tagSpecifications(tagSpecifications: List<Any>)

    /**
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch.
     */
    public fun tagSpecifications(vararg tagSpecifications: Any)

    /**
     * @param tenancy Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can
     * have one of the following tenancy settings:.
     * * `default` - The Capacity Reservation is created on hardware that is shared with other AWS
     * accounts .
     * * `dedicated` - The Capacity Reservation is created on single-tenant hardware that is
     * dedicated to a single AWS account .
     */
    public fun tenancy(tenancy: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnCapacityReservationProps.Builder
        = software.amazon.awscdk.services.ec2.CfnCapacityReservationProps.builder()

    /**
     * @param availabilityZone The Availability Zone in which to create the Capacity Reservation. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param ebsOptimized Indicates whether the Capacity Reservation supports EBS-optimized
     * instances.
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization isn't available with all instance
     * types. Additional usage charges apply when using an EBS- optimized instance.
     */
    override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * @param ebsOptimized Indicates whether the Capacity Reservation supports EBS-optimized
     * instances.
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization isn't available with all instance
     * types. Additional usage charges apply when using an EBS- optimized instance.
     */
    override fun ebsOptimized(ebsOptimized: IResolvable) {
      cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param endDate The date and time at which the Capacity Reservation expires.
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
     */
    override fun endDate(endDate: String) {
      cdkBuilder.endDate(endDate)
    }

    /**
     * @param endDateType Indicates the way in which the Capacity Reservation ends.
     * A Capacity Reservation can have one of the following end types:
     *
     * * `unlimited` - The Capacity Reservation remains active until you explicitly cancel it. Do
     * not provide an `EndDate` if the `EndDateType` is `unlimited` .
     * * `limited` - The Capacity Reservation expires automatically at a specified date and time.
     * You must provide an `EndDate` value if the `EndDateType` value is `limited` .
     */
    override fun endDateType(endDateType: String) {
      cdkBuilder.endDateType(endDateType)
    }

    /**
     * @param ephemeralStorage *Deprecated.*.
     */
    override fun ephemeralStorage(ephemeralStorage: Boolean) {
      cdkBuilder.ephemeralStorage(ephemeralStorage)
    }

    /**
     * @param ephemeralStorage *Deprecated.*.
     */
    override fun ephemeralStorage(ephemeralStorage: IResolvable) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param instanceCount The number of instances for which to reserve capacity. 
     * Valid range: 1 - 1000
     */
    override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * @param instanceMatchCriteria Indicates the type of instance launches that the Capacity
     * Reservation accepts. The options include:.
     * * `open` - The Capacity Reservation automatically matches all instances that have matching
     * attributes (instance type, platform, and Availability Zone). Instances that have matching
     * attributes run in the Capacity Reservation automatically without specifying any additional
     * parameters.
     * * `targeted` - The Capacity Reservation only accepts instances that have matching attributes
     * (instance type, platform, and Availability Zone), and explicitly target the Capacity
     * Reservation. This ensures that only permitted instances can use the reserved capacity.
     *
     * Default: `open`
     */
    override fun instanceMatchCriteria(instanceMatchCriteria: String) {
      cdkBuilder.instanceMatchCriteria(instanceMatchCriteria)
    }

    /**
     * @param instancePlatform The type of operating system for which to reserve capacity. 
     */
    override fun instancePlatform(instancePlatform: String) {
      cdkBuilder.instancePlatform(instancePlatform)
    }

    /**
     * @param instanceType The instance type for which to reserve capacity. 
     * For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* .
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param outPostArn The Amazon Resource Name (ARN) of the Outpost on which to create the
     * Capacity Reservation.
     */
    override fun outPostArn(outPostArn: String) {
      cdkBuilder.outPostArn(outPostArn)
    }

    /**
     * @param placementGroupArn The Amazon Resource Name (ARN) of the cluster placement group in
     * which to create the Capacity Reservation.
     * For more information, see [Capacity Reservations for cluster placement
     * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cr-cpg.html) in the *Amazon EC2 User
     * Guide* .
     */
    override fun placementGroupArn(placementGroupArn: String) {
      cdkBuilder.placementGroupArn(placementGroupArn)
    }

    /**
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch.
     */
    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch.
     */
    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch.
     */
    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    /**
     * @param tenancy Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can
     * have one of the following tenancy settings:.
     * * `default` - The Capacity Reservation is created on hardware that is shared with other AWS
     * accounts .
     * * `dedicated` - The Capacity Reservation is created on single-tenant hardware that is
     * dedicated to a single AWS account .
     */
    override fun tenancy(tenancy: String) {
      cdkBuilder.tenancy(tenancy)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnCapacityReservationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationProps,
  ) : CdkObject(cdkObject), CfnCapacityReservationProps {
    /**
     * The Availability Zone in which to create the Capacity Reservation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-availabilityzone)
     */
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    /**
     * Indicates whether the Capacity Reservation supports EBS-optimized instances.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization isn't available with all instance
     * types. Additional usage charges apply when using an EBS- optimized instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ebsoptimized)
     */
    override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

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
     */
    override fun endDate(): String? = unwrap(this).getEndDate()

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
     */
    override fun endDateType(): String? = unwrap(this).getEndDateType()

    /**
     * *Deprecated.*.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ephemeralstorage)
     */
    override fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

    /**
     * The number of instances for which to reserve capacity.
     *
     * Valid range: 1 - 1000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancecount)
     */
    override fun instanceCount(): Number = unwrap(this).getInstanceCount()

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
     */
    override fun instanceMatchCriteria(): String? = unwrap(this).getInstanceMatchCriteria()

    /**
     * The type of operating system for which to reserve capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instanceplatform)
     */
    override fun instancePlatform(): String = unwrap(this).getInstancePlatform()

    /**
     * The instance type for which to reserve capacity.
     *
     * For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancetype)
     */
    override fun instanceType(): String = unwrap(this).getInstanceType()

    /**
     * The Amazon Resource Name (ARN) of the Outpost on which to create the Capacity Reservation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-outpostarn)
     */
    override fun outPostArn(): String? = unwrap(this).getOutPostArn()

    /**
     * The Amazon Resource Name (ARN) of the cluster placement group in which to create the Capacity
     * Reservation.
     *
     * For more information, see [Capacity Reservations for cluster placement
     * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cr-cpg.html) in the *Amazon EC2 User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-placementgrouparn)
     */
    override fun placementGroupArn(): String? = unwrap(this).getPlacementGroupArn()

    /**
     * The tags to apply to the Capacity Reservation during launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tagspecifications)
     */
    override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

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
     */
    override fun tenancy(): String? = unwrap(this).getTenancy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCapacityReservationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationProps):
        CfnCapacityReservationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCapacityReservationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCapacityReservationProps):
        software.amazon.awscdk.services.ec2.CfnCapacityReservationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnCapacityReservationProps
  }
}
