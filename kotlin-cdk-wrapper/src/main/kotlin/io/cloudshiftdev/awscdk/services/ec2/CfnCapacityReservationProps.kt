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
 * .instanceCount(123)
 * .instancePlatform("instancePlatform")
 * .instanceType("instanceType")
 * // the properties below are optional
 * .availabilityZone("availabilityZone")
 * .availabilityZoneId("availabilityZoneId")
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
 * .unusedReservationBillingOwnerId("unusedReservationBillingOwnerId")
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
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The Availability Zone ID of the Capacity Reservation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-availabilityzoneid)
   */
  public fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

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
   * If you are requesting a future-dated Capacity Reservation, you can't specify an end date and
   * time that is within the commitment duration.
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
   *
   * You can request future-dated Capacity Reservations for an instance count with a minimum of 64
   * vCPUs. For example, if you request a future-dated Capacity Reservation for `m5.xlarge` instances,
   * you must request at least 25 instances ( *16 * m5.xlarge = 64 vCPUs* ).
   *
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
   *
   * If you are requesting a future-dated Capacity Reservation, you must specify `targeted` .
   *
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
   *
   * You can request future-dated Capacity Reservations for instance types in the C, M, R, I, T, and
   * G instance families only.
   *
   *
   * For more information, see [Instance
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon EC2
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancetype)
   */
  public fun instanceType(): String

  /**
   * Not supported for future-dated Capacity Reservations.
   *
   * The Amazon Resource Name (ARN) of the Outpost on which to create the Capacity Reservation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-outpostarn)
   */
  public fun outPostArn(): String? = unwrap(this).getOutPostArn()

  /**
   * Not supported for future-dated Capacity Reservations.
   *
   * The Amazon Resource Name (ARN) of the cluster placement group in which to create the Capacity
   * Reservation. For more information, see [Capacity Reservations for cluster placement
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
  public fun tagSpecifications(): List<CfnCapacityReservation.TagSpecificationProperty> =
      unwrap(this).getTagSpecifications()?.map(CfnCapacityReservation.TagSpecificationProperty::wrap)
      ?: emptyList()

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
   * The ID of the AWS account to which to assign billing of the unused capacity of the Capacity
   * Reservation.
   *
   * A request will be sent to the specified account. That account must accept the request for the
   * billing to be assigned to their account. For more information, see [Billing assignment for shared
   * Amazon EC2 Capacity
   * Reservations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/assign-billing.html) .
   *
   * You can assign billing only for shared Capacity Reservations. To share a Capacity Reservation,
   * you must add it to a resource share. For more information, see
   * [AWS::RAM::ResourceShare](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-unusedreservationbillingownerid)
   */
  public fun unusedReservationBillingOwnerId(): String? =
      unwrap(this).getUnusedReservationBillingOwnerId()

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
     * @param availabilityZoneId The Availability Zone ID of the Capacity Reservation.
     */
    public fun availabilityZoneId(availabilityZoneId: String)

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
     *
     * If you are requesting a future-dated Capacity Reservation, you can't specify an end date and
     * time that is within the commitment duration.
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
     *
     * You can request future-dated Capacity Reservations for an instance count with a minimum of 64
     * vCPUs. For example, if you request a future-dated Capacity Reservation for `m5.xlarge`
     * instances, you must request at least 25 instances ( *16 * m5.xlarge = 64 vCPUs* ).
     *
     *
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
     *
     * If you are requesting a future-dated Capacity Reservation, you must specify `targeted` .
     *
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
     *
     * You can request future-dated Capacity Reservations for instance types in the C, M, R, I, T,
     * and G instance families only.
     *
     *
     * For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* .
     */
    public fun instanceType(instanceType: String)

    /**
     * @param outPostArn Not supported for future-dated Capacity Reservations.
     * The Amazon Resource Name (ARN) of the Outpost on which to create the Capacity Reservation.
     */
    public fun outPostArn(outPostArn: String)

    /**
     * @param placementGroupArn Not supported for future-dated Capacity Reservations.
     * The Amazon Resource Name (ARN) of the cluster placement group in which to create the Capacity
     * Reservation. For more information, see [Capacity Reservations for cluster placement
     * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cr-cpg.html) in the *Amazon EC2 User
     * Guide* .
     */
    public fun placementGroupArn(placementGroupArn: String)

    /**
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch.
     */
    public
        fun tagSpecifications(tagSpecifications: List<CfnCapacityReservation.TagSpecificationProperty>)

    /**
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch.
     */
    public fun tagSpecifications(vararg
        tagSpecifications: CfnCapacityReservation.TagSpecificationProperty)

    /**
     * @param tenancy Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can
     * have one of the following tenancy settings:.
     * * `default` - The Capacity Reservation is created on hardware that is shared with other AWS
     * accounts .
     * * `dedicated` - The Capacity Reservation is created on single-tenant hardware that is
     * dedicated to a single AWS account .
     */
    public fun tenancy(tenancy: String)

    /**
     * @param unusedReservationBillingOwnerId The ID of the AWS account to which to assign billing
     * of the unused capacity of the Capacity Reservation.
     * A request will be sent to the specified account. That account must accept the request for the
     * billing to be assigned to their account. For more information, see [Billing assignment for
     * shared Amazon EC2 Capacity
     * Reservations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/assign-billing.html) .
     *
     * You can assign billing only for shared Capacity Reservations. To share a Capacity
     * Reservation, you must add it to a resource share. For more information, see
     * [AWS::RAM::ResourceShare](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html)
     * .
     */
    public fun unusedReservationBillingOwnerId(unusedReservationBillingOwnerId: String)
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
     * @param availabilityZoneId The Availability Zone ID of the Capacity Reservation.
     */
    override fun availabilityZoneId(availabilityZoneId: String) {
      cdkBuilder.availabilityZoneId(availabilityZoneId)
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
     *
     * If you are requesting a future-dated Capacity Reservation, you can't specify an end date and
     * time that is within the commitment duration.
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
     *
     * You can request future-dated Capacity Reservations for an instance count with a minimum of 64
     * vCPUs. For example, if you request a future-dated Capacity Reservation for `m5.xlarge`
     * instances, you must request at least 25 instances ( *16 * m5.xlarge = 64 vCPUs* ).
     *
     *
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
     *
     * If you are requesting a future-dated Capacity Reservation, you must specify `targeted` .
     *
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
     *
     * You can request future-dated Capacity Reservations for instance types in the C, M, R, I, T,
     * and G instance families only.
     *
     *
     * For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* .
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param outPostArn Not supported for future-dated Capacity Reservations.
     * The Amazon Resource Name (ARN) of the Outpost on which to create the Capacity Reservation.
     */
    override fun outPostArn(outPostArn: String) {
      cdkBuilder.outPostArn(outPostArn)
    }

    /**
     * @param placementGroupArn Not supported for future-dated Capacity Reservations.
     * The Amazon Resource Name (ARN) of the cluster placement group in which to create the Capacity
     * Reservation. For more information, see [Capacity Reservations for cluster placement
     * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cr-cpg.html) in the *Amazon EC2 User
     * Guide* .
     */
    override fun placementGroupArn(placementGroupArn: String) {
      cdkBuilder.placementGroupArn(placementGroupArn)
    }

    /**
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch.
     */
    override
        fun tagSpecifications(tagSpecifications: List<CfnCapacityReservation.TagSpecificationProperty>) {
      cdkBuilder.tagSpecifications(tagSpecifications.map(CfnCapacityReservation.TagSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch.
     */
    override fun tagSpecifications(vararg
        tagSpecifications: CfnCapacityReservation.TagSpecificationProperty): Unit =
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

    /**
     * @param unusedReservationBillingOwnerId The ID of the AWS account to which to assign billing
     * of the unused capacity of the Capacity Reservation.
     * A request will be sent to the specified account. That account must accept the request for the
     * billing to be assigned to their account. For more information, see [Billing assignment for
     * shared Amazon EC2 Capacity
     * Reservations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/assign-billing.html) .
     *
     * You can assign billing only for shared Capacity Reservations. To share a Capacity
     * Reservation, you must add it to a resource share. For more information, see
     * [AWS::RAM::ResourceShare](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html)
     * .
     */
    override fun unusedReservationBillingOwnerId(unusedReservationBillingOwnerId: String) {
      cdkBuilder.unusedReservationBillingOwnerId(unusedReservationBillingOwnerId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnCapacityReservationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationProps,
  ) : CdkObject(cdkObject),
      CfnCapacityReservationProps {
    /**
     * The Availability Zone in which to create the Capacity Reservation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The Availability Zone ID of the Capacity Reservation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-availabilityzoneid)
     */
    override fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

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
     * If you are requesting a future-dated Capacity Reservation, you can't specify an end date and
     * time that is within the commitment duration.
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
     *
     * You can request future-dated Capacity Reservations for an instance count with a minimum of 64
     * vCPUs. For example, if you request a future-dated Capacity Reservation for `m5.xlarge`
     * instances, you must request at least 25 instances ( *16 * m5.xlarge = 64 vCPUs* ).
     *
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
     *
     * If you are requesting a future-dated Capacity Reservation, you must specify `targeted` .
     *
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
     *
     * You can request future-dated Capacity Reservations for instance types in the C, M, R, I, T,
     * and G instance families only.
     *
     *
     * For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancetype)
     */
    override fun instanceType(): String = unwrap(this).getInstanceType()

    /**
     * Not supported for future-dated Capacity Reservations.
     *
     * The Amazon Resource Name (ARN) of the Outpost on which to create the Capacity Reservation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-outpostarn)
     */
    override fun outPostArn(): String? = unwrap(this).getOutPostArn()

    /**
     * Not supported for future-dated Capacity Reservations.
     *
     * The Amazon Resource Name (ARN) of the cluster placement group in which to create the Capacity
     * Reservation. For more information, see [Capacity Reservations for cluster placement
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
    override fun tagSpecifications(): List<CfnCapacityReservation.TagSpecificationProperty> =
        unwrap(this).getTagSpecifications()?.map(CfnCapacityReservation.TagSpecificationProperty::wrap)
        ?: emptyList()

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

    /**
     * The ID of the AWS account to which to assign billing of the unused capacity of the Capacity
     * Reservation.
     *
     * A request will be sent to the specified account. That account must accept the request for the
     * billing to be assigned to their account. For more information, see [Billing assignment for
     * shared Amazon EC2 Capacity
     * Reservations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/assign-billing.html) .
     *
     * You can assign billing only for shared Capacity Reservations. To share a Capacity
     * Reservation, you must add it to a resource share. For more information, see
     * [AWS::RAM::ResourceShare](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-unusedreservationbillingownerid)
     */
    override fun unusedReservationBillingOwnerId(): String? =
        unwrap(this).getUnusedReservationBillingOwnerId()
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
