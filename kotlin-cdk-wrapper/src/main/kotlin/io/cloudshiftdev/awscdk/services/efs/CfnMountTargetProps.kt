@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnMountTarget`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.efs.*;
 * CfnMountTargetProps cfnMountTargetProps = CfnMountTargetProps.builder()
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
public interface CfnMountTargetProps {
  /**
   * The ID of the file system for which to create the mount target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid)
   */
  public fun fileSystemId(): String

  /**
   * If the `IpAddressType` for the mount target is IPv4 ( `IPV4_ONLY` or `DUAL_STACK` ), then
   * specify the IPv4 address to use.
   *
   * If you do not specify an `IpAddress` , then Amazon EFS selects an unused IP address from the
   * subnet specified for `SubnetId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress)
   */
  public fun ipAddress(): String? = unwrap(this).getIpAddress()

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
   * example, if the `IPAddressType` is `IPV4_ONLY` and `AssignIpv6AddressOnCreation` is `true` , then
   * IPv4 is used for the mount target. For more information, see [Modify the IP addressing attributes
   * of your subnet](https://docs.aws.amazon.com/vpc/latest/userguide/subnet-public-ip.html) .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddresstype)
   */
  public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * If the `IPAddressType` for the mount target is IPv6 ( `IPV6_ONLY` or `DUAL_STACK` ), then
   * specify the IPv6 address to use.
   *
   * If you do not specify an `Ipv6Address` , then Amazon EFS selects an unused IP address from the
   * subnet specified for `SubnetId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipv6address)
   */
  public fun ipv6Address(): String? = unwrap(this).getIpv6Address()

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
   */
  public fun securityGroups(): List<String>

  /**
   * The ID of the subnet to add the mount target in.
   *
   * For One Zone file systems, use the subnet that is associated with the file system's
   * Availability Zone. The subnet type must be the same type as the `IpAddressType` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid)
   */
  public fun subnetId(): String

  /**
   * A builder for [CfnMountTargetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fileSystemId The ID of the file system for which to create the mount target. 
     */
    public fun fileSystemId(fileSystemId: String)

    /**
     * @param ipAddress If the `IpAddressType` for the mount target is IPv4 ( `IPV4_ONLY` or
     * `DUAL_STACK` ), then specify the IPv4 address to use.
     * If you do not specify an `IpAddress` , then Amazon EFS selects an unused IP address from the
     * subnet specified for `SubnetId` .
     */
    public fun ipAddress(ipAddress: String)

    /**
     * @param ipAddressType The IP address type for the mount target.
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
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * @param ipv6Address If the `IPAddressType` for the mount target is IPv6 ( `IPV6_ONLY` or
     * `DUAL_STACK` ), then specify the IPv6 address to use.
     * If you do not specify an `Ipv6Address` , then Amazon EFS selects an unused IP address from
     * the subnet specified for `SubnetId` .
     */
    public fun ipv6Address(ipv6Address: String)

    /**
     * @param securityGroups VPC security group IDs, of the form `sg-xxxxxxxx` . 
     * These must be for the same VPC as the subnet specified. The maximum number of security groups
     * depends on account quota. For more information, see [Amazon VPC
     * Quotas](https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html) in the *Amazon
     * VPC User Guide* (see the *Security Groups* table). If you don't specify a security group, then
     * Amazon EFS uses the default security group for the subnet's VPC.
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * @param securityGroups VPC security group IDs, of the form `sg-xxxxxxxx` . 
     * These must be for the same VPC as the subnet specified. The maximum number of security groups
     * depends on account quota. For more information, see [Amazon VPC
     * Quotas](https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html) in the *Amazon
     * VPC User Guide* (see the *Security Groups* table). If you don't specify a security group, then
     * Amazon EFS uses the default security group for the subnet's VPC.
     */
    public fun securityGroups(vararg securityGroups: String)

    /**
     * @param subnetId The ID of the subnet to add the mount target in. 
     * For One Zone file systems, use the subnet that is associated with the file system's
     * Availability Zone. The subnet type must be the same type as the `IpAddressType` .
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.CfnMountTargetProps.Builder =
        software.amazon.awscdk.services.efs.CfnMountTargetProps.builder()

    /**
     * @param fileSystemId The ID of the file system for which to create the mount target. 
     */
    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * @param ipAddress If the `IpAddressType` for the mount target is IPv4 ( `IPV4_ONLY` or
     * `DUAL_STACK` ), then specify the IPv4 address to use.
     * If you do not specify an `IpAddress` , then Amazon EFS selects an unused IP address from the
     * subnet specified for `SubnetId` .
     */
    override fun ipAddress(ipAddress: String) {
      cdkBuilder.ipAddress(ipAddress)
    }

    /**
     * @param ipAddressType The IP address type for the mount target.
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
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * @param ipv6Address If the `IPAddressType` for the mount target is IPv6 ( `IPV6_ONLY` or
     * `DUAL_STACK` ), then specify the IPv6 address to use.
     * If you do not specify an `Ipv6Address` , then Amazon EFS selects an unused IP address from
     * the subnet specified for `SubnetId` .
     */
    override fun ipv6Address(ipv6Address: String) {
      cdkBuilder.ipv6Address(ipv6Address)
    }

    /**
     * @param securityGroups VPC security group IDs, of the form `sg-xxxxxxxx` . 
     * These must be for the same VPC as the subnet specified. The maximum number of security groups
     * depends on account quota. For more information, see [Amazon VPC
     * Quotas](https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html) in the *Amazon
     * VPC User Guide* (see the *Security Groups* table). If you don't specify a security group, then
     * Amazon EFS uses the default security group for the subnet's VPC.
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * @param securityGroups VPC security group IDs, of the form `sg-xxxxxxxx` . 
     * These must be for the same VPC as the subnet specified. The maximum number of security groups
     * depends on account quota. For more information, see [Amazon VPC
     * Quotas](https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html) in the *Amazon
     * VPC User Guide* (see the *Security Groups* table). If you don't specify a security group, then
     * Amazon EFS uses the default security group for the subnet's VPC.
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param subnetId The ID of the subnet to add the mount target in. 
     * For One Zone file systems, use the subnet that is associated with the file system's
     * Availability Zone. The subnet type must be the same type as the `IpAddressType` .
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.efs.CfnMountTargetProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.efs.CfnMountTargetProps,
  ) : CdkObject(cdkObject),
      CfnMountTargetProps {
    /**
     * The ID of the file system for which to create the mount target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid)
     */
    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    /**
     * If the `IpAddressType` for the mount target is IPv4 ( `IPV4_ONLY` or `DUAL_STACK` ), then
     * specify the IPv4 address to use.
     *
     * If you do not specify an `IpAddress` , then Amazon EFS selects an unused IP address from the
     * subnet specified for `SubnetId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress)
     */
    override fun ipAddress(): String? = unwrap(this).getIpAddress()

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
     */
    override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    /**
     * If the `IPAddressType` for the mount target is IPv6 ( `IPV6_ONLY` or `DUAL_STACK` ), then
     * specify the IPv6 address to use.
     *
     * If you do not specify an `Ipv6Address` , then Amazon EFS selects an unused IP address from
     * the subnet specified for `SubnetId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipv6address)
     */
    override fun ipv6Address(): String? = unwrap(this).getIpv6Address()

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
     */
    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups()

    /**
     * The ID of the subnet to add the mount target in.
     *
     * For One Zone file systems, use the subnet that is associated with the file system's
     * Availability Zone. The subnet type must be the same type as the `IpAddressType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid)
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMountTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnMountTargetProps):
        CfnMountTargetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnMountTargetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMountTargetProps):
        software.amazon.awscdk.services.efs.CfnMountTargetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.efs.CfnMountTargetProps
  }
}
