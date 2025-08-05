@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::EFS::MountTarget` resource is an Amazon EFS resource that creates a mount target for an
 * EFS file system.
 *
 * You can then mount the file system on Amazon EC2 instances or other resources by using the mount
 * target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.efs.*;
 * CfnMountTarget cfnMountTarget = CfnMountTarget.Builder.create(this, "MyCfnMountTarget")
 * .fileSystemId("fileSystemId")
 * .securityGroups(List.of("securityGroups"))
 * .subnetId("subnetId")
 * // the properties below are optional
 * .ipAddress("ipAddress")
 * .ipAddressType("ipAddressType")
 * .ipv6Address("ipv6Address")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
 */
public open class CfnMountTarget(
  cdkObject: software.amazon.awscdk.services.efs.CfnMountTarget,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMountTargetProps,
  ) :
      this(software.amazon.awscdk.services.efs.CfnMountTarget(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMountTargetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMountTargetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMountTargetProps(props)
  )

  /**
   * The ID of the Amazon EFS file system that the mount target provides access to.
   *
   * Example: `fs-0123456789111222a`
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The IPv4 address of the mount target.
   *
   * Example: 192.0.2.0
   */
  public open fun attrIpAddress(): String = unwrap(this).getAttrIpAddress()

  /**
   * The ID of the file system for which to create the mount target.
   */
  public open fun fileSystemId(): String = unwrap(this).getFileSystemId()

  /**
   * The ID of the file system for which to create the mount target.
   */
  public open fun fileSystemId(`value`: String) {
    unwrap(this).setFileSystemId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * If the `IpAddressType` for the mount target is IPv4 ( `IPV4_ONLY` or `DUAL_STACK` ), then
   * specify the IPv4 address to use.
   */
  public open fun ipAddress(): String? = unwrap(this).getIpAddress()

  /**
   * If the `IpAddressType` for the mount target is IPv4 ( `IPV4_ONLY` or `DUAL_STACK` ), then
   * specify the IPv4 address to use.
   */
  public open fun ipAddress(`value`: String) {
    unwrap(this).setIpAddress(`value`)
  }

  /**
   * The IP address type for the mount target.
   */
  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * The IP address type for the mount target.
   */
  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  /**
   * If the `IPAddressType` for the mount target is IPv6 ( `IPV6_ONLY` or `DUAL_STACK` ), then
   * specify the IPv6 address to use.
   */
  public open fun ipv6Address(): String? = unwrap(this).getIpv6Address()

  /**
   * If the `IPAddressType` for the mount target is IPv6 ( `IPV6_ONLY` or `DUAL_STACK` ), then
   * specify the IPv6 address to use.
   */
  public open fun ipv6Address(`value`: String) {
    unwrap(this).setIpv6Address(`value`)
  }

  /**
   * VPC security group IDs, of the form `sg-xxxxxxxx` .
   */
  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups()

  /**
   * VPC security group IDs, of the form `sg-xxxxxxxx` .
   */
  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  /**
   * VPC security group IDs, of the form `sg-xxxxxxxx` .
   */
  public open fun securityGroups(vararg `value`: String): Unit = securityGroups(`value`.toList())

  /**
   * The ID of the subnet to add the mount target in.
   */
  public open fun subnetId(): String = unwrap(this).getSubnetId()

  /**
   * The ID of the subnet to add the mount target in.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.efs.CfnMountTarget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the file system for which to create the mount target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid)
     * @param fileSystemId The ID of the file system for which to create the mount target. 
     */
    public fun fileSystemId(fileSystemId: String)

    /**
     * If the `IpAddressType` for the mount target is IPv4 ( `IPV4_ONLY` or `DUAL_STACK` ), then
     * specify the IPv4 address to use.
     *
     * If you do not specify an `IpAddress` , then Amazon EFS selects an unused IP address from the
     * subnet specified for `SubnetId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress)
     * @param ipAddress If the `IpAddressType` for the mount target is IPv4 ( `IPV4_ONLY` or
     * `DUAL_STACK` ), then specify the IPv4 address to use. 
     */
    public fun ipAddress(ipAddress: String)

    /**
     * The IP address type for the mount target.
     *
     * The possible values are `IPV4_ONLY` (only IPv4 addresses), `IPV6_ONLY` (only IPv6 addresses),
     * and `DUAL_STACK` (dual-stack, both IPv4 and IPv6 addresses). If you don’t specify an
     * `IpAddressType` , then `IPV4_ONLY` is used.
     *
     *
     * The `IPAddressType` must match the IP type of the subnet. Additionally, the `IPAddressType`
     * parameter overrides the value set as the default IP address for the subnet in the VPC. For
     * example, if the `IPAddressType` is `IPV4_ONLY` and `AssignIpv6AddressOnCreation` is `true` ,
     * then IPv4 is used for the mount target. For more information, see [Modify the IP addressing
     * attributes of your
     * subnet](https://docs.aws.amazon.com/vpc/latest/userguide/subnet-public-ip.html) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddresstype)
     * @param ipAddressType The IP address type for the mount target. 
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * If the `IPAddressType` for the mount target is IPv6 ( `IPV6_ONLY` or `DUAL_STACK` ), then
     * specify the IPv6 address to use.
     *
     * If you do not specify an `Ipv6Address` , then Amazon EFS selects an unused IP address from
     * the subnet specified for `SubnetId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipv6address)
     * @param ipv6Address If the `IPAddressType` for the mount target is IPv6 ( `IPV6_ONLY` or
     * `DUAL_STACK` ), then specify the IPv6 address to use. 
     */
    public fun ipv6Address(ipv6Address: String)

    /**
     * VPC security group IDs, of the form `sg-xxxxxxxx` .
     *
     * These must be for the same VPC as the subnet specified. The maximum number of security groups
     * depends on account quota. For more information, see [Amazon VPC
     * Quotas](https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html) in the *Amazon
     * VPC User Guide* (see the *Security Groups* table). If you don't specify a security group, then
     * Amazon EFS uses the default security group for the subnet's VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups)
     * @param securityGroups VPC security group IDs, of the form `sg-xxxxxxxx` . 
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * VPC security group IDs, of the form `sg-xxxxxxxx` .
     *
     * These must be for the same VPC as the subnet specified. The maximum number of security groups
     * depends on account quota. For more information, see [Amazon VPC
     * Quotas](https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html) in the *Amazon
     * VPC User Guide* (see the *Security Groups* table). If you don't specify a security group, then
     * Amazon EFS uses the default security group for the subnet's VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups)
     * @param securityGroups VPC security group IDs, of the form `sg-xxxxxxxx` . 
     */
    public fun securityGroups(vararg securityGroups: String)

    /**
     * The ID of the subnet to add the mount target in.
     *
     * For One Zone file systems, use the subnet that is associated with the file system's
     * Availability Zone. The subnet type must be the same type as the `IpAddressType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid)
     * @param subnetId The ID of the subnet to add the mount target in. 
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.CfnMountTarget.Builder =
        software.amazon.awscdk.services.efs.CfnMountTarget.Builder.create(scope, id)

    /**
     * The ID of the file system for which to create the mount target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid)
     * @param fileSystemId The ID of the file system for which to create the mount target. 
     */
    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * If the `IpAddressType` for the mount target is IPv4 ( `IPV4_ONLY` or `DUAL_STACK` ), then
     * specify the IPv4 address to use.
     *
     * If you do not specify an `IpAddress` , then Amazon EFS selects an unused IP address from the
     * subnet specified for `SubnetId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress)
     * @param ipAddress If the `IpAddressType` for the mount target is IPv4 ( `IPV4_ONLY` or
     * `DUAL_STACK` ), then specify the IPv4 address to use. 
     */
    override fun ipAddress(ipAddress: String) {
      cdkBuilder.ipAddress(ipAddress)
    }

    /**
     * The IP address type for the mount target.
     *
     * The possible values are `IPV4_ONLY` (only IPv4 addresses), `IPV6_ONLY` (only IPv6 addresses),
     * and `DUAL_STACK` (dual-stack, both IPv4 and IPv6 addresses). If you don’t specify an
     * `IpAddressType` , then `IPV4_ONLY` is used.
     *
     *
     * The `IPAddressType` must match the IP type of the subnet. Additionally, the `IPAddressType`
     * parameter overrides the value set as the default IP address for the subnet in the VPC. For
     * example, if the `IPAddressType` is `IPV4_ONLY` and `AssignIpv6AddressOnCreation` is `true` ,
     * then IPv4 is used for the mount target. For more information, see [Modify the IP addressing
     * attributes of your
     * subnet](https://docs.aws.amazon.com/vpc/latest/userguide/subnet-public-ip.html) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddresstype)
     * @param ipAddressType The IP address type for the mount target. 
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * If the `IPAddressType` for the mount target is IPv6 ( `IPV6_ONLY` or `DUAL_STACK` ), then
     * specify the IPv6 address to use.
     *
     * If you do not specify an `Ipv6Address` , then Amazon EFS selects an unused IP address from
     * the subnet specified for `SubnetId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipv6address)
     * @param ipv6Address If the `IPAddressType` for the mount target is IPv6 ( `IPV6_ONLY` or
     * `DUAL_STACK` ), then specify the IPv6 address to use. 
     */
    override fun ipv6Address(ipv6Address: String) {
      cdkBuilder.ipv6Address(ipv6Address)
    }

    /**
     * VPC security group IDs, of the form `sg-xxxxxxxx` .
     *
     * These must be for the same VPC as the subnet specified. The maximum number of security groups
     * depends on account quota. For more information, see [Amazon VPC
     * Quotas](https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html) in the *Amazon
     * VPC User Guide* (see the *Security Groups* table). If you don't specify a security group, then
     * Amazon EFS uses the default security group for the subnet's VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups)
     * @param securityGroups VPC security group IDs, of the form `sg-xxxxxxxx` . 
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * VPC security group IDs, of the form `sg-xxxxxxxx` .
     *
     * These must be for the same VPC as the subnet specified. The maximum number of security groups
     * depends on account quota. For more information, see [Amazon VPC
     * Quotas](https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html) in the *Amazon
     * VPC User Guide* (see the *Security Groups* table). If you don't specify a security group, then
     * Amazon EFS uses the default security group for the subnet's VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups)
     * @param securityGroups VPC security group IDs, of the form `sg-xxxxxxxx` . 
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    /**
     * The ID of the subnet to add the mount target in.
     *
     * For One Zone file systems, use the subnet that is associated with the file system's
     * Availability Zone. The subnet type must be the same type as the `IpAddressType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid)
     * @param subnetId The ID of the subnet to add the mount target in. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.efs.CfnMountTarget = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.efs.CfnMountTarget.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMountTarget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMountTarget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnMountTarget): CfnMountTarget
        = CfnMountTarget(cdkObject)

    internal fun unwrap(wrapped: CfnMountTarget): software.amazon.awscdk.services.efs.CfnMountTarget
        = wrapped.cdkObject as software.amazon.awscdk.services.efs.CfnMountTarget
  }
}
