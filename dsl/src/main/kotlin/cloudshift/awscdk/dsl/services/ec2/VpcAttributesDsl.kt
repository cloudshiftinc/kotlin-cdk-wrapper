@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.VpcAttributes

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
@CdkDslMarker
public class VpcAttributesDsl {
  private val cdkBuilder: VpcAttributes.Builder = VpcAttributes.builder()

  private val _availabilityZones: MutableList<String> = mutableListOf()

  private val _isolatedSubnetIds: MutableList<String> = mutableListOf()

  private val _isolatedSubnetIpv4CidrBlocks: MutableList<String> = mutableListOf()

  private val _isolatedSubnetNames: MutableList<String> = mutableListOf()

  private val _isolatedSubnetRouteTableIds: MutableList<String> = mutableListOf()

  private val _privateSubnetIds: MutableList<String> = mutableListOf()

  private val _privateSubnetIpv4CidrBlocks: MutableList<String> = mutableListOf()

  private val _privateSubnetNames: MutableList<String> = mutableListOf()

  private val _privateSubnetRouteTableIds: MutableList<String> = mutableListOf()

  private val _publicSubnetIds: MutableList<String> = mutableListOf()

  private val _publicSubnetIpv4CidrBlocks: MutableList<String> = mutableListOf()

  private val _publicSubnetNames: MutableList<String> = mutableListOf()

  private val _publicSubnetRouteTableIds: MutableList<String> = mutableListOf()

  /**
   * @param availabilityZones List of availability zones for the subnets in this VPC. 
   */
  public fun availabilityZones(vararg availabilityZones: String) {
    _availabilityZones.addAll(listOf(*availabilityZones))
  }

  /**
   * @param availabilityZones List of availability zones for the subnets in this VPC. 
   */
  public fun availabilityZones(availabilityZones: Collection<String>) {
    _availabilityZones.addAll(availabilityZones)
  }

  /**
   * @param isolatedSubnetIds List of isolated subnet IDs.
   * Must be undefined or match the availability zones in length and order.
   */
  public fun isolatedSubnetIds(vararg isolatedSubnetIds: String) {
    _isolatedSubnetIds.addAll(listOf(*isolatedSubnetIds))
  }

  /**
   * @param isolatedSubnetIds List of isolated subnet IDs.
   * Must be undefined or match the availability zones in length and order.
   */
  public fun isolatedSubnetIds(isolatedSubnetIds: Collection<String>) {
    _isolatedSubnetIds.addAll(isolatedSubnetIds)
  }

  /**
   * @param isolatedSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the isolated subnets.
   * Must be undefined or have an entry for every isolated subnet group.
   */
  public fun isolatedSubnetIpv4CidrBlocks(vararg isolatedSubnetIpv4CidrBlocks: String) {
    _isolatedSubnetIpv4CidrBlocks.addAll(listOf(*isolatedSubnetIpv4CidrBlocks))
  }

  /**
   * @param isolatedSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the isolated subnets.
   * Must be undefined or have an entry for every isolated subnet group.
   */
  public fun isolatedSubnetIpv4CidrBlocks(isolatedSubnetIpv4CidrBlocks: Collection<String>) {
    _isolatedSubnetIpv4CidrBlocks.addAll(isolatedSubnetIpv4CidrBlocks)
  }

  /**
   * @param isolatedSubnetNames List of names for the isolated subnets.
   * Must be undefined or have a name for every isolated subnet group.
   */
  public fun isolatedSubnetNames(vararg isolatedSubnetNames: String) {
    _isolatedSubnetNames.addAll(listOf(*isolatedSubnetNames))
  }

  /**
   * @param isolatedSubnetNames List of names for the isolated subnets.
   * Must be undefined or have a name for every isolated subnet group.
   */
  public fun isolatedSubnetNames(isolatedSubnetNames: Collection<String>) {
    _isolatedSubnetNames.addAll(isolatedSubnetNames)
  }

  /**
   * @param isolatedSubnetRouteTableIds List of IDs of route tables for the isolated subnets.
   * Must be undefined or have a name for every isolated subnet group.
   */
  public fun isolatedSubnetRouteTableIds(vararg isolatedSubnetRouteTableIds: String) {
    _isolatedSubnetRouteTableIds.addAll(listOf(*isolatedSubnetRouteTableIds))
  }

  /**
   * @param isolatedSubnetRouteTableIds List of IDs of route tables for the isolated subnets.
   * Must be undefined or have a name for every isolated subnet group.
   */
  public fun isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds: Collection<String>) {
    _isolatedSubnetRouteTableIds.addAll(isolatedSubnetRouteTableIds)
  }

  /**
   * @param privateSubnetIds List of private subnet IDs.
   * Must be undefined or match the availability zones in length and order.
   */
  public fun privateSubnetIds(vararg privateSubnetIds: String) {
    _privateSubnetIds.addAll(listOf(*privateSubnetIds))
  }

  /**
   * @param privateSubnetIds List of private subnet IDs.
   * Must be undefined or match the availability zones in length and order.
   */
  public fun privateSubnetIds(privateSubnetIds: Collection<String>) {
    _privateSubnetIds.addAll(privateSubnetIds)
  }

  /**
   * @param privateSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the private subnets.
   * Must be undefined or have an entry for every private subnet group.
   */
  public fun privateSubnetIpv4CidrBlocks(vararg privateSubnetIpv4CidrBlocks: String) {
    _privateSubnetIpv4CidrBlocks.addAll(listOf(*privateSubnetIpv4CidrBlocks))
  }

  /**
   * @param privateSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the private subnets.
   * Must be undefined or have an entry for every private subnet group.
   */
  public fun privateSubnetIpv4CidrBlocks(privateSubnetIpv4CidrBlocks: Collection<String>) {
    _privateSubnetIpv4CidrBlocks.addAll(privateSubnetIpv4CidrBlocks)
  }

  /**
   * @param privateSubnetNames List of names for the private subnets.
   * Must be undefined or have a name for every private subnet group.
   */
  public fun privateSubnetNames(vararg privateSubnetNames: String) {
    _privateSubnetNames.addAll(listOf(*privateSubnetNames))
  }

  /**
   * @param privateSubnetNames List of names for the private subnets.
   * Must be undefined or have a name for every private subnet group.
   */
  public fun privateSubnetNames(privateSubnetNames: Collection<String>) {
    _privateSubnetNames.addAll(privateSubnetNames)
  }

  /**
   * @param privateSubnetRouteTableIds List of IDs of route tables for the private subnets.
   * Must be undefined or have a name for every private subnet group.
   */
  public fun privateSubnetRouteTableIds(vararg privateSubnetRouteTableIds: String) {
    _privateSubnetRouteTableIds.addAll(listOf(*privateSubnetRouteTableIds))
  }

  /**
   * @param privateSubnetRouteTableIds List of IDs of route tables for the private subnets.
   * Must be undefined or have a name for every private subnet group.
   */
  public fun privateSubnetRouteTableIds(privateSubnetRouteTableIds: Collection<String>) {
    _privateSubnetRouteTableIds.addAll(privateSubnetRouteTableIds)
  }

  /**
   * @param publicSubnetIds List of public subnet IDs.
   * Must be undefined or match the availability zones in length and order.
   */
  public fun publicSubnetIds(vararg publicSubnetIds: String) {
    _publicSubnetIds.addAll(listOf(*publicSubnetIds))
  }

  /**
   * @param publicSubnetIds List of public subnet IDs.
   * Must be undefined or match the availability zones in length and order.
   */
  public fun publicSubnetIds(publicSubnetIds: Collection<String>) {
    _publicSubnetIds.addAll(publicSubnetIds)
  }

  /**
   * @param publicSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the public subnets.
   * Must be undefined or have an entry for every public subnet group.
   */
  public fun publicSubnetIpv4CidrBlocks(vararg publicSubnetIpv4CidrBlocks: String) {
    _publicSubnetIpv4CidrBlocks.addAll(listOf(*publicSubnetIpv4CidrBlocks))
  }

  /**
   * @param publicSubnetIpv4CidrBlocks List of IPv4 CIDR blocks for the public subnets.
   * Must be undefined or have an entry for every public subnet group.
   */
  public fun publicSubnetIpv4CidrBlocks(publicSubnetIpv4CidrBlocks: Collection<String>) {
    _publicSubnetIpv4CidrBlocks.addAll(publicSubnetIpv4CidrBlocks)
  }

  /**
   * @param publicSubnetNames List of names for the public subnets.
   * Must be undefined or have a name for every public subnet group.
   */
  public fun publicSubnetNames(vararg publicSubnetNames: String) {
    _publicSubnetNames.addAll(listOf(*publicSubnetNames))
  }

  /**
   * @param publicSubnetNames List of names for the public subnets.
   * Must be undefined or have a name for every public subnet group.
   */
  public fun publicSubnetNames(publicSubnetNames: Collection<String>) {
    _publicSubnetNames.addAll(publicSubnetNames)
  }

  /**
   * @param publicSubnetRouteTableIds List of IDs of route tables for the public subnets.
   * Must be undefined or have a name for every public subnet group.
   */
  public fun publicSubnetRouteTableIds(vararg publicSubnetRouteTableIds: String) {
    _publicSubnetRouteTableIds.addAll(listOf(*publicSubnetRouteTableIds))
  }

  /**
   * @param publicSubnetRouteTableIds List of IDs of route tables for the public subnets.
   * Must be undefined or have a name for every public subnet group.
   */
  public fun publicSubnetRouteTableIds(publicSubnetRouteTableIds: Collection<String>) {
    _publicSubnetRouteTableIds.addAll(publicSubnetRouteTableIds)
  }

  /**
   * @param region The region the VPC is in.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param vpcCidrBlock VPC's CIDR range.
   */
  public fun vpcCidrBlock(vpcCidrBlock: String) {
    cdkBuilder.vpcCidrBlock(vpcCidrBlock)
  }

  /**
   * @param vpcId VPC's identifier. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  /**
   * @param vpnGatewayId VPN gateway's identifier.
   */
  public fun vpnGatewayId(vpnGatewayId: String) {
    cdkBuilder.vpnGatewayId(vpnGatewayId)
  }

  public fun build(): VpcAttributes {
    if(_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
    if(_isolatedSubnetIds.isNotEmpty()) cdkBuilder.isolatedSubnetIds(_isolatedSubnetIds)
    if(_isolatedSubnetIpv4CidrBlocks.isNotEmpty())
        cdkBuilder.isolatedSubnetIpv4CidrBlocks(_isolatedSubnetIpv4CidrBlocks)
    if(_isolatedSubnetNames.isNotEmpty()) cdkBuilder.isolatedSubnetNames(_isolatedSubnetNames)
    if(_isolatedSubnetRouteTableIds.isNotEmpty())
        cdkBuilder.isolatedSubnetRouteTableIds(_isolatedSubnetRouteTableIds)
    if(_privateSubnetIds.isNotEmpty()) cdkBuilder.privateSubnetIds(_privateSubnetIds)
    if(_privateSubnetIpv4CidrBlocks.isNotEmpty())
        cdkBuilder.privateSubnetIpv4CidrBlocks(_privateSubnetIpv4CidrBlocks)
    if(_privateSubnetNames.isNotEmpty()) cdkBuilder.privateSubnetNames(_privateSubnetNames)
    if(_privateSubnetRouteTableIds.isNotEmpty())
        cdkBuilder.privateSubnetRouteTableIds(_privateSubnetRouteTableIds)
    if(_publicSubnetIds.isNotEmpty()) cdkBuilder.publicSubnetIds(_publicSubnetIds)
    if(_publicSubnetIpv4CidrBlocks.isNotEmpty())
        cdkBuilder.publicSubnetIpv4CidrBlocks(_publicSubnetIpv4CidrBlocks)
    if(_publicSubnetNames.isNotEmpty()) cdkBuilder.publicSubnetNames(_publicSubnetNames)
    if(_publicSubnetRouteTableIds.isNotEmpty())
        cdkBuilder.publicSubnetRouteTableIds(_publicSubnetRouteTableIds)
    return cdkBuilder.build()
  }
}
