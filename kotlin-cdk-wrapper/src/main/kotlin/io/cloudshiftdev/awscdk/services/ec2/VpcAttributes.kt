@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties that reference an external Vpc.
 *
 * Example:
 *
 * ```
 * IVpc vpc = Vpc.fromVpcAttributes(this, "VPC", VpcAttributes.builder()
 * .vpcId("vpc-1234")
 * .availabilityZones(List.of("us-east-1a", "us-east-1b"))
 * // Either pass literals for all IDs
 * .publicSubnetIds(List.of("s-12345", "s-67890"))
 * // OR: import a list of known length
 * .privateSubnetIds(Fn.importListValue("PrivateSubnetIds", 2))
 * // OR: split an imported string to a list of known length
 * .isolatedSubnetIds(Fn.split(",", StringParameter.valueForStringParameter(this, "MyParameter"),
 * 2))
 * .build());
 * ```
 */
public interface VpcAttributes {
  /**
   * List of availability zones for the subnets in this VPC.
   */
  public fun availabilityZones(): List<String>

  /**
   * List of isolated subnet IDs.
   *
   * Must be undefined or match the availability zones in length and order.
   *
   * Default: - The VPC does not have any isolated subnets
   */
  public fun isolatedSubnetIds(): List<String> = unwrap(this).getIsolatedSubnetIds() ?: emptyList()

  /**
   * List of IPv4 CIDR blocks for the isolated subnets.
   *
   * Must be undefined or have an entry for every isolated subnet group.
   *
   * Default: - Retrieving the IPv4 CIDR block of any isolated subnet will fail
   */
  public fun isolatedSubnetIpv4CidrBlocks(): List<String> =
      unwrap(this).getIsolatedSubnetIpv4CidrBlocks() ?: emptyList()

  /**
   * List of names for the isolated subnets.
   *
   * Must be undefined or have a name for every isolated subnet group.
   *
   * Default: - All isolated subnets will have the name `Isolated`
   */
  public fun isolatedSubnetNames(): List<String> = unwrap(this).getIsolatedSubnetNames() ?:
      emptyList()

  /**
   * List of IDs of route tables for the isolated subnets.
   *
   * Must be undefined or have a name for every isolated subnet group.
   *
   * Default: - Retrieving the route table ID of any isolated subnet will fail
   */
  public fun isolatedSubnetRouteTableIds(): List<String> =
      unwrap(this).getIsolatedSubnetRouteTableIds() ?: emptyList()

  /**
   * List of private subnet IDs.
   *
   * Must be undefined or match the availability zones in length and order.
   *
   * Default: - The VPC does not have any private subnets
   */
  public fun privateSubnetIds(): List<String> = unwrap(this).getPrivateSubnetIds() ?: emptyList()

  /**
   * List of IPv4 CIDR blocks for the private subnets.
   *
   * Must be undefined or have an entry for every private subnet group.
   *
   * Default: - Retrieving the IPv4 CIDR block of any private subnet will fail
   */
  public fun privateSubnetIpv4CidrBlocks(): List<String> =
      unwrap(this).getPrivateSubnetIpv4CidrBlocks() ?: emptyList()

  /**
   * List of names for the private subnets.
   *
   * Must be undefined or have a name for every private subnet group.
   *
   * Default: - All private subnets will have the name `Private`
   */
  public fun privateSubnetNames(): List<String> = unwrap(this).getPrivateSubnetNames() ?:
      emptyList()

  /**
   * List of IDs of route tables for the private subnets.
   *
   * Must be undefined or have a name for every private subnet group.
   *
   * Default: - Retrieving the route table ID of any private subnet will fail
   */
  public fun privateSubnetRouteTableIds(): List<String> =
      unwrap(this).getPrivateSubnetRouteTableIds() ?: emptyList()

  /**
   * List of public subnet IDs.
   *
   * Must be undefined or match the availability zones in length and order.
   *
   * Default: - The VPC does not have any public subnets
   */
  public fun publicSubnetIds(): List<String> = unwrap(this).getPublicSubnetIds() ?: emptyList()

  /**
   * List of IPv4 CIDR blocks for the public subnets.
   *
   * Must be undefined or have an entry for every public subnet group.
   *
   * Default: - Retrieving the IPv4 CIDR block of any public subnet will fail
   */
  public fun publicSubnetIpv4CidrBlocks(): List<String> =
      unwrap(this).getPublicSubnetIpv4CidrBlocks() ?: emptyList()

  /**
   * List of names for the public subnets.
   *
   * Must be undefined or have a name for every public subnet group.
   *
   * Default: - All public subnets will have the name `Public`
   */
  public fun publicSubnetNames(): List<String> = unwrap(this).getPublicSubnetNames() ?: emptyList()

  /**
   * List of IDs of route tables for the public subnets.
   *
   * Must be undefined or have a name for every public subnet group.
   *
   * Default: - Retrieving the route table ID of any public subnet will fail
   */
  public fun publicSubnetRouteTableIds(): List<String> = unwrap(this).getPublicSubnetRouteTableIds()
      ?: emptyList()

  /**
   * The region the VPC is in.
   *
   * Default: - The region of the stack where the VPC belongs to
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * VPC's CIDR range.
   *
   * Default: - Retrieving the CIDR from the VPC will fail
   */
  public fun vpcCidrBlock(): String? = unwrap(this).getVpcCidrBlock()

  /**
   * VPC's identifier.
   */
  public fun vpcId(): String

  /**
   * VPN gateway's identifier.
   */
  public fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  /**
   * A builder for [VpcAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZones List of availability zones for the subnets in this VPC. 
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * @param availabilityZones List of availability zones for the subnets in this VPC. 
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * @param isolatedSubnetIds List of isolated subnet IDs.
     * Must be undefined or match the availability zones in length and order.
     */
    public fun isolatedSubnetIds(isolatedSubnetIds: List<String>)

    /**
     * @param isolatedSubnetIds List of isolated subnet IDs.
     * Must be undefined or match the availability zones in length and order.
     */
    public fun isolatedSubnetIds(vararg isolatedSubnetIds: String)

    /**
     * @param isolatedSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the isolated subnets.
     * Must be undefined or have an entry for every isolated subnet group.
     */
    public fun isolatedSubnetIpv4CidrBlocks(isolatedSubnetIpv4CidrBlocks: List<String>)

    /**
     * @param isolatedSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the isolated subnets.
     * Must be undefined or have an entry for every isolated subnet group.
     */
    public fun isolatedSubnetIpv4CidrBlocks(vararg isolatedSubnetIpv4CidrBlocks: String)

    /**
     * @param isolatedSubnetNames List of names for the isolated subnets.
     * Must be undefined or have a name for every isolated subnet group.
     */
    public fun isolatedSubnetNames(isolatedSubnetNames: List<String>)

    /**
     * @param isolatedSubnetNames List of names for the isolated subnets.
     * Must be undefined or have a name for every isolated subnet group.
     */
    public fun isolatedSubnetNames(vararg isolatedSubnetNames: String)

    /**
     * @param isolatedSubnetRouteTableIds List of IDs of route tables for the isolated subnets.
     * Must be undefined or have a name for every isolated subnet group.
     */
    public fun isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds: List<String>)

    /**
     * @param isolatedSubnetRouteTableIds List of IDs of route tables for the isolated subnets.
     * Must be undefined or have a name for every isolated subnet group.
     */
    public fun isolatedSubnetRouteTableIds(vararg isolatedSubnetRouteTableIds: String)

    /**
     * @param privateSubnetIds List of private subnet IDs.
     * Must be undefined or match the availability zones in length and order.
     */
    public fun privateSubnetIds(privateSubnetIds: List<String>)

    /**
     * @param privateSubnetIds List of private subnet IDs.
     * Must be undefined or match the availability zones in length and order.
     */
    public fun privateSubnetIds(vararg privateSubnetIds: String)

    /**
     * @param privateSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the private subnets.
     * Must be undefined or have an entry for every private subnet group.
     */
    public fun privateSubnetIpv4CidrBlocks(privateSubnetIpv4CidrBlocks: List<String>)

    /**
     * @param privateSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the private subnets.
     * Must be undefined or have an entry for every private subnet group.
     */
    public fun privateSubnetIpv4CidrBlocks(vararg privateSubnetIpv4CidrBlocks: String)

    /**
     * @param privateSubnetNames List of names for the private subnets.
     * Must be undefined or have a name for every private subnet group.
     */
    public fun privateSubnetNames(privateSubnetNames: List<String>)

    /**
     * @param privateSubnetNames List of names for the private subnets.
     * Must be undefined or have a name for every private subnet group.
     */
    public fun privateSubnetNames(vararg privateSubnetNames: String)

    /**
     * @param privateSubnetRouteTableIds List of IDs of route tables for the private subnets.
     * Must be undefined or have a name for every private subnet group.
     */
    public fun privateSubnetRouteTableIds(privateSubnetRouteTableIds: List<String>)

    /**
     * @param privateSubnetRouteTableIds List of IDs of route tables for the private subnets.
     * Must be undefined or have a name for every private subnet group.
     */
    public fun privateSubnetRouteTableIds(vararg privateSubnetRouteTableIds: String)

    /**
     * @param publicSubnetIds List of public subnet IDs.
     * Must be undefined or match the availability zones in length and order.
     */
    public fun publicSubnetIds(publicSubnetIds: List<String>)

    /**
     * @param publicSubnetIds List of public subnet IDs.
     * Must be undefined or match the availability zones in length and order.
     */
    public fun publicSubnetIds(vararg publicSubnetIds: String)

    /**
     * @param publicSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the public subnets.
     * Must be undefined or have an entry for every public subnet group.
     */
    public fun publicSubnetIpv4CidrBlocks(publicSubnetIpv4CidrBlocks: List<String>)

    /**
     * @param publicSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the public subnets.
     * Must be undefined or have an entry for every public subnet group.
     */
    public fun publicSubnetIpv4CidrBlocks(vararg publicSubnetIpv4CidrBlocks: String)

    /**
     * @param publicSubnetNames List of names for the public subnets.
     * Must be undefined or have a name for every public subnet group.
     */
    public fun publicSubnetNames(publicSubnetNames: List<String>)

    /**
     * @param publicSubnetNames List of names for the public subnets.
     * Must be undefined or have a name for every public subnet group.
     */
    public fun publicSubnetNames(vararg publicSubnetNames: String)

    /**
     * @param publicSubnetRouteTableIds List of IDs of route tables for the public subnets.
     * Must be undefined or have a name for every public subnet group.
     */
    public fun publicSubnetRouteTableIds(publicSubnetRouteTableIds: List<String>)

    /**
     * @param publicSubnetRouteTableIds List of IDs of route tables for the public subnets.
     * Must be undefined or have a name for every public subnet group.
     */
    public fun publicSubnetRouteTableIds(vararg publicSubnetRouteTableIds: String)

    /**
     * @param region The region the VPC is in.
     */
    public fun region(region: String)

    /**
     * @param vpcCidrBlock VPC's CIDR range.
     */
    public fun vpcCidrBlock(vpcCidrBlock: String)

    /**
     * @param vpcId VPC's identifier. 
     */
    public fun vpcId(vpcId: String)

    /**
     * @param vpnGatewayId VPN gateway's identifier.
     */
    public fun vpnGatewayId(vpnGatewayId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpcAttributes.Builder =
        software.amazon.awscdk.services.ec2.VpcAttributes.builder()

    /**
     * @param availabilityZones List of availability zones for the subnets in this VPC. 
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * @param availabilityZones List of availability zones for the subnets in this VPC. 
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * @param isolatedSubnetIds List of isolated subnet IDs.
     * Must be undefined or match the availability zones in length and order.
     */
    override fun isolatedSubnetIds(isolatedSubnetIds: List<String>) {
      cdkBuilder.isolatedSubnetIds(isolatedSubnetIds)
    }

    /**
     * @param isolatedSubnetIds List of isolated subnet IDs.
     * Must be undefined or match the availability zones in length and order.
     */
    override fun isolatedSubnetIds(vararg isolatedSubnetIds: String): Unit =
        isolatedSubnetIds(isolatedSubnetIds.toList())

    /**
     * @param isolatedSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the isolated subnets.
     * Must be undefined or have an entry for every isolated subnet group.
     */
    override fun isolatedSubnetIpv4CidrBlocks(isolatedSubnetIpv4CidrBlocks: List<String>) {
      cdkBuilder.isolatedSubnetIpv4CidrBlocks(isolatedSubnetIpv4CidrBlocks)
    }

    /**
     * @param isolatedSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the isolated subnets.
     * Must be undefined or have an entry for every isolated subnet group.
     */
    override fun isolatedSubnetIpv4CidrBlocks(vararg isolatedSubnetIpv4CidrBlocks: String): Unit =
        isolatedSubnetIpv4CidrBlocks(isolatedSubnetIpv4CidrBlocks.toList())

    /**
     * @param isolatedSubnetNames List of names for the isolated subnets.
     * Must be undefined or have a name for every isolated subnet group.
     */
    override fun isolatedSubnetNames(isolatedSubnetNames: List<String>) {
      cdkBuilder.isolatedSubnetNames(isolatedSubnetNames)
    }

    /**
     * @param isolatedSubnetNames List of names for the isolated subnets.
     * Must be undefined or have a name for every isolated subnet group.
     */
    override fun isolatedSubnetNames(vararg isolatedSubnetNames: String): Unit =
        isolatedSubnetNames(isolatedSubnetNames.toList())

    /**
     * @param isolatedSubnetRouteTableIds List of IDs of route tables for the isolated subnets.
     * Must be undefined or have a name for every isolated subnet group.
     */
    override fun isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds: List<String>) {
      cdkBuilder.isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds)
    }

    /**
     * @param isolatedSubnetRouteTableIds List of IDs of route tables for the isolated subnets.
     * Must be undefined or have a name for every isolated subnet group.
     */
    override fun isolatedSubnetRouteTableIds(vararg isolatedSubnetRouteTableIds: String): Unit =
        isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds.toList())

    /**
     * @param privateSubnetIds List of private subnet IDs.
     * Must be undefined or match the availability zones in length and order.
     */
    override fun privateSubnetIds(privateSubnetIds: List<String>) {
      cdkBuilder.privateSubnetIds(privateSubnetIds)
    }

    /**
     * @param privateSubnetIds List of private subnet IDs.
     * Must be undefined or match the availability zones in length and order.
     */
    override fun privateSubnetIds(vararg privateSubnetIds: String): Unit =
        privateSubnetIds(privateSubnetIds.toList())

    /**
     * @param privateSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the private subnets.
     * Must be undefined or have an entry for every private subnet group.
     */
    override fun privateSubnetIpv4CidrBlocks(privateSubnetIpv4CidrBlocks: List<String>) {
      cdkBuilder.privateSubnetIpv4CidrBlocks(privateSubnetIpv4CidrBlocks)
    }

    /**
     * @param privateSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the private subnets.
     * Must be undefined or have an entry for every private subnet group.
     */
    override fun privateSubnetIpv4CidrBlocks(vararg privateSubnetIpv4CidrBlocks: String): Unit =
        privateSubnetIpv4CidrBlocks(privateSubnetIpv4CidrBlocks.toList())

    /**
     * @param privateSubnetNames List of names for the private subnets.
     * Must be undefined or have a name for every private subnet group.
     */
    override fun privateSubnetNames(privateSubnetNames: List<String>) {
      cdkBuilder.privateSubnetNames(privateSubnetNames)
    }

    /**
     * @param privateSubnetNames List of names for the private subnets.
     * Must be undefined or have a name for every private subnet group.
     */
    override fun privateSubnetNames(vararg privateSubnetNames: String): Unit =
        privateSubnetNames(privateSubnetNames.toList())

    /**
     * @param privateSubnetRouteTableIds List of IDs of route tables for the private subnets.
     * Must be undefined or have a name for every private subnet group.
     */
    override fun privateSubnetRouteTableIds(privateSubnetRouteTableIds: List<String>) {
      cdkBuilder.privateSubnetRouteTableIds(privateSubnetRouteTableIds)
    }

    /**
     * @param privateSubnetRouteTableIds List of IDs of route tables for the private subnets.
     * Must be undefined or have a name for every private subnet group.
     */
    override fun privateSubnetRouteTableIds(vararg privateSubnetRouteTableIds: String): Unit =
        privateSubnetRouteTableIds(privateSubnetRouteTableIds.toList())

    /**
     * @param publicSubnetIds List of public subnet IDs.
     * Must be undefined or match the availability zones in length and order.
     */
    override fun publicSubnetIds(publicSubnetIds: List<String>) {
      cdkBuilder.publicSubnetIds(publicSubnetIds)
    }

    /**
     * @param publicSubnetIds List of public subnet IDs.
     * Must be undefined or match the availability zones in length and order.
     */
    override fun publicSubnetIds(vararg publicSubnetIds: String): Unit =
        publicSubnetIds(publicSubnetIds.toList())

    /**
     * @param publicSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the public subnets.
     * Must be undefined or have an entry for every public subnet group.
     */
    override fun publicSubnetIpv4CidrBlocks(publicSubnetIpv4CidrBlocks: List<String>) {
      cdkBuilder.publicSubnetIpv4CidrBlocks(publicSubnetIpv4CidrBlocks)
    }

    /**
     * @param publicSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the public subnets.
     * Must be undefined or have an entry for every public subnet group.
     */
    override fun publicSubnetIpv4CidrBlocks(vararg publicSubnetIpv4CidrBlocks: String): Unit =
        publicSubnetIpv4CidrBlocks(publicSubnetIpv4CidrBlocks.toList())

    /**
     * @param publicSubnetNames List of names for the public subnets.
     * Must be undefined or have a name for every public subnet group.
     */
    override fun publicSubnetNames(publicSubnetNames: List<String>) {
      cdkBuilder.publicSubnetNames(publicSubnetNames)
    }

    /**
     * @param publicSubnetNames List of names for the public subnets.
     * Must be undefined or have a name for every public subnet group.
     */
    override fun publicSubnetNames(vararg publicSubnetNames: String): Unit =
        publicSubnetNames(publicSubnetNames.toList())

    /**
     * @param publicSubnetRouteTableIds List of IDs of route tables for the public subnets.
     * Must be undefined or have a name for every public subnet group.
     */
    override fun publicSubnetRouteTableIds(publicSubnetRouteTableIds: List<String>) {
      cdkBuilder.publicSubnetRouteTableIds(publicSubnetRouteTableIds)
    }

    /**
     * @param publicSubnetRouteTableIds List of IDs of route tables for the public subnets.
     * Must be undefined or have a name for every public subnet group.
     */
    override fun publicSubnetRouteTableIds(vararg publicSubnetRouteTableIds: String): Unit =
        publicSubnetRouteTableIds(publicSubnetRouteTableIds.toList())

    /**
     * @param region The region the VPC is in.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param vpcCidrBlock VPC's CIDR range.
     */
    override fun vpcCidrBlock(vpcCidrBlock: String) {
      cdkBuilder.vpcCidrBlock(vpcCidrBlock)
    }

    /**
     * @param vpcId VPC's identifier. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    /**
     * @param vpnGatewayId VPN gateway's identifier.
     */
    override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpcAttributes = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.VpcAttributes,
  ) : CdkObject(cdkObject), VpcAttributes {
    /**
     * List of availability zones for the subnets in this VPC.
     */
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones()

    /**
     * List of isolated subnet IDs.
     *
     * Must be undefined or match the availability zones in length and order.
     *
     * Default: - The VPC does not have any isolated subnets
     */
    override fun isolatedSubnetIds(): List<String> = unwrap(this).getIsolatedSubnetIds() ?:
        emptyList()

    /**
     * List of IPv4 CIDR blocks for the isolated subnets.
     *
     * Must be undefined or have an entry for every isolated subnet group.
     *
     * Default: - Retrieving the IPv4 CIDR block of any isolated subnet will fail
     */
    override fun isolatedSubnetIpv4CidrBlocks(): List<String> =
        unwrap(this).getIsolatedSubnetIpv4CidrBlocks() ?: emptyList()

    /**
     * List of names for the isolated subnets.
     *
     * Must be undefined or have a name for every isolated subnet group.
     *
     * Default: - All isolated subnets will have the name `Isolated`
     */
    override fun isolatedSubnetNames(): List<String> = unwrap(this).getIsolatedSubnetNames() ?:
        emptyList()

    /**
     * List of IDs of route tables for the isolated subnets.
     *
     * Must be undefined or have a name for every isolated subnet group.
     *
     * Default: - Retrieving the route table ID of any isolated subnet will fail
     */
    override fun isolatedSubnetRouteTableIds(): List<String> =
        unwrap(this).getIsolatedSubnetRouteTableIds() ?: emptyList()

    /**
     * List of private subnet IDs.
     *
     * Must be undefined or match the availability zones in length and order.
     *
     * Default: - The VPC does not have any private subnets
     */
    override fun privateSubnetIds(): List<String> = unwrap(this).getPrivateSubnetIds() ?:
        emptyList()

    /**
     * List of IPv4 CIDR blocks for the private subnets.
     *
     * Must be undefined or have an entry for every private subnet group.
     *
     * Default: - Retrieving the IPv4 CIDR block of any private subnet will fail
     */
    override fun privateSubnetIpv4CidrBlocks(): List<String> =
        unwrap(this).getPrivateSubnetIpv4CidrBlocks() ?: emptyList()

    /**
     * List of names for the private subnets.
     *
     * Must be undefined or have a name for every private subnet group.
     *
     * Default: - All private subnets will have the name `Private`
     */
    override fun privateSubnetNames(): List<String> = unwrap(this).getPrivateSubnetNames() ?:
        emptyList()

    /**
     * List of IDs of route tables for the private subnets.
     *
     * Must be undefined or have a name for every private subnet group.
     *
     * Default: - Retrieving the route table ID of any private subnet will fail
     */
    override fun privateSubnetRouteTableIds(): List<String> =
        unwrap(this).getPrivateSubnetRouteTableIds() ?: emptyList()

    /**
     * List of public subnet IDs.
     *
     * Must be undefined or match the availability zones in length and order.
     *
     * Default: - The VPC does not have any public subnets
     */
    override fun publicSubnetIds(): List<String> = unwrap(this).getPublicSubnetIds() ?: emptyList()

    /**
     * List of IPv4 CIDR blocks for the public subnets.
     *
     * Must be undefined or have an entry for every public subnet group.
     *
     * Default: - Retrieving the IPv4 CIDR block of any public subnet will fail
     */
    override fun publicSubnetIpv4CidrBlocks(): List<String> =
        unwrap(this).getPublicSubnetIpv4CidrBlocks() ?: emptyList()

    /**
     * List of names for the public subnets.
     *
     * Must be undefined or have a name for every public subnet group.
     *
     * Default: - All public subnets will have the name `Public`
     */
    override fun publicSubnetNames(): List<String> = unwrap(this).getPublicSubnetNames() ?:
        emptyList()

    /**
     * List of IDs of route tables for the public subnets.
     *
     * Must be undefined or have a name for every public subnet group.
     *
     * Default: - Retrieving the route table ID of any public subnet will fail
     */
    override fun publicSubnetRouteTableIds(): List<String> =
        unwrap(this).getPublicSubnetRouteTableIds() ?: emptyList()

    /**
     * The region the VPC is in.
     *
     * Default: - The region of the stack where the VPC belongs to
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * VPC's CIDR range.
     *
     * Default: - Retrieving the CIDR from the VPC will fail
     */
    override fun vpcCidrBlock(): String? = unwrap(this).getVpcCidrBlock()

    /**
     * VPC's identifier.
     */
    override fun vpcId(): String = unwrap(this).getVpcId()

    /**
     * VPN gateway's identifier.
     */
    override fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcAttributes): VpcAttributes =
        CdkObjectWrappers.wrap(cdkObject) as VpcAttributes

    internal fun unwrap(wrapped: VpcAttributes): software.amazon.awscdk.services.ec2.VpcAttributes =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.VpcAttributes
  }
}
