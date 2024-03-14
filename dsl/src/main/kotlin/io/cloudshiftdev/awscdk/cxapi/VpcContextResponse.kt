package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface VpcContextResponse {
  /**
   * AZs.
   */
  public fun availabilityZones(): List<String>

  /**
   * IDs of all isolated subnets.
   *
   * Element count: #(availabilityZones)   #(isolatedGroups)
   */
  public fun isolatedSubnetIds(): List<String> = unwrap(this).getIsolatedSubnetIds() ?: emptyList()

  /**
   * Name of isolated subnet groups.
   *
   * Element count: #(isolatedGroups)
   */
  public fun isolatedSubnetNames(): List<String> = unwrap(this).getIsolatedSubnetNames() ?:
      emptyList()

  /**
   * Route Table IDs of isolated subnet groups.
   *
   * Element count: #(availabilityZones)   #(isolatedGroups)
   */
  public fun isolatedSubnetRouteTableIds(): List<String> =
      unwrap(this).getIsolatedSubnetRouteTableIds() ?: emptyList()

  /**
   * The ID of the AWS account that owns the VPC.
   *
   * Default: the account id of the parent stack
   */
  public fun ownerAccountId(): String? = unwrap(this).getOwnerAccountId()

  /**
   * IDs of all private subnets.
   *
   * Element count: #(availabilityZones)   #(privateGroups)
   */
  public fun privateSubnetIds(): List<String> = unwrap(this).getPrivateSubnetIds() ?: emptyList()

  /**
   * Name of private subnet groups.
   *
   * Element count: #(privateGroups)
   */
  public fun privateSubnetNames(): List<String> = unwrap(this).getPrivateSubnetNames() ?:
      emptyList()

  /**
   * Route Table IDs of private subnet groups.
   *
   * Element count: #(availabilityZones)   #(privateGroups)
   */
  public fun privateSubnetRouteTableIds(): List<String> =
      unwrap(this).getPrivateSubnetRouteTableIds() ?: emptyList()

  /**
   * IDs of all public subnets.
   *
   * Element count: #(availabilityZones)   #(publicGroups)
   */
  public fun publicSubnetIds(): List<String> = unwrap(this).getPublicSubnetIds() ?: emptyList()

  /**
   * Name of public subnet groups.
   *
   * Element count: #(publicGroups)
   */
  public fun publicSubnetNames(): List<String> = unwrap(this).getPublicSubnetNames() ?: emptyList()

  /**
   * Route Table IDs of public subnet groups.
   *
   * Element count: #(availabilityZones)   #(publicGroups)
   */
  public fun publicSubnetRouteTableIds(): List<String> = unwrap(this).getPublicSubnetRouteTableIds()
      ?: emptyList()

  /**
   * The region in which the VPC is in.
   *
   * Default: - Region of the parent stack
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * The subnet groups discovered for the given VPC.
   *
   * Unlike the above properties, this will include asymmetric subnets,
   * if the VPC has any.
   * This property will only be populated if `VpcContextQuery.returnAsymmetricSubnets`
   * is true.
   *
   * Default: - no subnet groups will be returned unless `VpcContextQuery.returnAsymmetricSubnets`
   * is true
   */
  public fun subnetGroups(): List<VpcSubnetGroup> =
      unwrap(this).getSubnetGroups()?.map(VpcSubnetGroup::wrap) ?: emptyList()

  /**
   * VPC cidr.
   *
   * Default: - CIDR information not available
   */
  public fun vpcCidrBlock(): String? = unwrap(this).getVpcCidrBlock()

  /**
   * VPC id.
   */
  public fun vpcId(): String

  /**
   * The VPN gateway ID.
   */
  public fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  /**
   * A builder for [VpcContextResponse]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZones AZs. 
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * @param availabilityZones AZs. 
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * @param isolatedSubnetIds IDs of all isolated subnets.
     * Element count: #(availabilityZones)   #(isolatedGroups)
     */
    public fun isolatedSubnetIds(isolatedSubnetIds: List<String>)

    /**
     * @param isolatedSubnetIds IDs of all isolated subnets.
     * Element count: #(availabilityZones)   #(isolatedGroups)
     */
    public fun isolatedSubnetIds(vararg isolatedSubnetIds: String)

    /**
     * @param isolatedSubnetNames Name of isolated subnet groups.
     * Element count: #(isolatedGroups)
     */
    public fun isolatedSubnetNames(isolatedSubnetNames: List<String>)

    /**
     * @param isolatedSubnetNames Name of isolated subnet groups.
     * Element count: #(isolatedGroups)
     */
    public fun isolatedSubnetNames(vararg isolatedSubnetNames: String)

    /**
     * @param isolatedSubnetRouteTableIds Route Table IDs of isolated subnet groups.
     * Element count: #(availabilityZones)   #(isolatedGroups)
     */
    public fun isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds: List<String>)

    /**
     * @param isolatedSubnetRouteTableIds Route Table IDs of isolated subnet groups.
     * Element count: #(availabilityZones)   #(isolatedGroups)
     */
    public fun isolatedSubnetRouteTableIds(vararg isolatedSubnetRouteTableIds: String)

    /**
     * @param ownerAccountId The ID of the AWS account that owns the VPC.
     */
    public fun ownerAccountId(ownerAccountId: String)

    /**
     * @param privateSubnetIds IDs of all private subnets.
     * Element count: #(availabilityZones)   #(privateGroups)
     */
    public fun privateSubnetIds(privateSubnetIds: List<String>)

    /**
     * @param privateSubnetIds IDs of all private subnets.
     * Element count: #(availabilityZones)   #(privateGroups)
     */
    public fun privateSubnetIds(vararg privateSubnetIds: String)

    /**
     * @param privateSubnetNames Name of private subnet groups.
     * Element count: #(privateGroups)
     */
    public fun privateSubnetNames(privateSubnetNames: List<String>)

    /**
     * @param privateSubnetNames Name of private subnet groups.
     * Element count: #(privateGroups)
     */
    public fun privateSubnetNames(vararg privateSubnetNames: String)

    /**
     * @param privateSubnetRouteTableIds Route Table IDs of private subnet groups.
     * Element count: #(availabilityZones)   #(privateGroups)
     */
    public fun privateSubnetRouteTableIds(privateSubnetRouteTableIds: List<String>)

    /**
     * @param privateSubnetRouteTableIds Route Table IDs of private subnet groups.
     * Element count: #(availabilityZones)   #(privateGroups)
     */
    public fun privateSubnetRouteTableIds(vararg privateSubnetRouteTableIds: String)

    /**
     * @param publicSubnetIds IDs of all public subnets.
     * Element count: #(availabilityZones)   #(publicGroups)
     */
    public fun publicSubnetIds(publicSubnetIds: List<String>)

    /**
     * @param publicSubnetIds IDs of all public subnets.
     * Element count: #(availabilityZones)   #(publicGroups)
     */
    public fun publicSubnetIds(vararg publicSubnetIds: String)

    /**
     * @param publicSubnetNames Name of public subnet groups.
     * Element count: #(publicGroups)
     */
    public fun publicSubnetNames(publicSubnetNames: List<String>)

    /**
     * @param publicSubnetNames Name of public subnet groups.
     * Element count: #(publicGroups)
     */
    public fun publicSubnetNames(vararg publicSubnetNames: String)

    /**
     * @param publicSubnetRouteTableIds Route Table IDs of public subnet groups.
     * Element count: #(availabilityZones)   #(publicGroups)
     */
    public fun publicSubnetRouteTableIds(publicSubnetRouteTableIds: List<String>)

    /**
     * @param publicSubnetRouteTableIds Route Table IDs of public subnet groups.
     * Element count: #(availabilityZones)   #(publicGroups)
     */
    public fun publicSubnetRouteTableIds(vararg publicSubnetRouteTableIds: String)

    /**
     * @param region The region in which the VPC is in.
     */
    public fun region(region: String)

    /**
     * @param subnetGroups The subnet groups discovered for the given VPC.
     * Unlike the above properties, this will include asymmetric subnets,
     * if the VPC has any.
     * This property will only be populated if `VpcContextQuery.returnAsymmetricSubnets`
     * is true.
     */
    public fun subnetGroups(subnetGroups: List<VpcSubnetGroup>)

    /**
     * @param subnetGroups The subnet groups discovered for the given VPC.
     * Unlike the above properties, this will include asymmetric subnets,
     * if the VPC has any.
     * This property will only be populated if `VpcContextQuery.returnAsymmetricSubnets`
     * is true.
     */
    public fun subnetGroups(vararg subnetGroups: VpcSubnetGroup)

    /**
     * @param vpcCidrBlock VPC cidr.
     */
    public fun vpcCidrBlock(vpcCidrBlock: String)

    /**
     * @param vpcId VPC id. 
     */
    public fun vpcId(vpcId: String)

    /**
     * @param vpnGatewayId The VPN gateway ID.
     */
    public fun vpnGatewayId(vpnGatewayId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.VpcContextResponse.Builder =
        software.amazon.awscdk.cxapi.VpcContextResponse.builder()

    /**
     * @param availabilityZones AZs. 
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * @param availabilityZones AZs. 
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * @param isolatedSubnetIds IDs of all isolated subnets.
     * Element count: #(availabilityZones)   #(isolatedGroups)
     */
    override fun isolatedSubnetIds(isolatedSubnetIds: List<String>) {
      cdkBuilder.isolatedSubnetIds(isolatedSubnetIds)
    }

    /**
     * @param isolatedSubnetIds IDs of all isolated subnets.
     * Element count: #(availabilityZones)   #(isolatedGroups)
     */
    override fun isolatedSubnetIds(vararg isolatedSubnetIds: String): Unit =
        isolatedSubnetIds(isolatedSubnetIds.toList())

    /**
     * @param isolatedSubnetNames Name of isolated subnet groups.
     * Element count: #(isolatedGroups)
     */
    override fun isolatedSubnetNames(isolatedSubnetNames: List<String>) {
      cdkBuilder.isolatedSubnetNames(isolatedSubnetNames)
    }

    /**
     * @param isolatedSubnetNames Name of isolated subnet groups.
     * Element count: #(isolatedGroups)
     */
    override fun isolatedSubnetNames(vararg isolatedSubnetNames: String): Unit =
        isolatedSubnetNames(isolatedSubnetNames.toList())

    /**
     * @param isolatedSubnetRouteTableIds Route Table IDs of isolated subnet groups.
     * Element count: #(availabilityZones)   #(isolatedGroups)
     */
    override fun isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds: List<String>) {
      cdkBuilder.isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds)
    }

    /**
     * @param isolatedSubnetRouteTableIds Route Table IDs of isolated subnet groups.
     * Element count: #(availabilityZones)   #(isolatedGroups)
     */
    override fun isolatedSubnetRouteTableIds(vararg isolatedSubnetRouteTableIds: String): Unit =
        isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds.toList())

    /**
     * @param ownerAccountId The ID of the AWS account that owns the VPC.
     */
    override fun ownerAccountId(ownerAccountId: String) {
      cdkBuilder.ownerAccountId(ownerAccountId)
    }

    /**
     * @param privateSubnetIds IDs of all private subnets.
     * Element count: #(availabilityZones)   #(privateGroups)
     */
    override fun privateSubnetIds(privateSubnetIds: List<String>) {
      cdkBuilder.privateSubnetIds(privateSubnetIds)
    }

    /**
     * @param privateSubnetIds IDs of all private subnets.
     * Element count: #(availabilityZones)   #(privateGroups)
     */
    override fun privateSubnetIds(vararg privateSubnetIds: String): Unit =
        privateSubnetIds(privateSubnetIds.toList())

    /**
     * @param privateSubnetNames Name of private subnet groups.
     * Element count: #(privateGroups)
     */
    override fun privateSubnetNames(privateSubnetNames: List<String>) {
      cdkBuilder.privateSubnetNames(privateSubnetNames)
    }

    /**
     * @param privateSubnetNames Name of private subnet groups.
     * Element count: #(privateGroups)
     */
    override fun privateSubnetNames(vararg privateSubnetNames: String): Unit =
        privateSubnetNames(privateSubnetNames.toList())

    /**
     * @param privateSubnetRouteTableIds Route Table IDs of private subnet groups.
     * Element count: #(availabilityZones)   #(privateGroups)
     */
    override fun privateSubnetRouteTableIds(privateSubnetRouteTableIds: List<String>) {
      cdkBuilder.privateSubnetRouteTableIds(privateSubnetRouteTableIds)
    }

    /**
     * @param privateSubnetRouteTableIds Route Table IDs of private subnet groups.
     * Element count: #(availabilityZones)   #(privateGroups)
     */
    override fun privateSubnetRouteTableIds(vararg privateSubnetRouteTableIds: String): Unit =
        privateSubnetRouteTableIds(privateSubnetRouteTableIds.toList())

    /**
     * @param publicSubnetIds IDs of all public subnets.
     * Element count: #(availabilityZones)   #(publicGroups)
     */
    override fun publicSubnetIds(publicSubnetIds: List<String>) {
      cdkBuilder.publicSubnetIds(publicSubnetIds)
    }

    /**
     * @param publicSubnetIds IDs of all public subnets.
     * Element count: #(availabilityZones)   #(publicGroups)
     */
    override fun publicSubnetIds(vararg publicSubnetIds: String): Unit =
        publicSubnetIds(publicSubnetIds.toList())

    /**
     * @param publicSubnetNames Name of public subnet groups.
     * Element count: #(publicGroups)
     */
    override fun publicSubnetNames(publicSubnetNames: List<String>) {
      cdkBuilder.publicSubnetNames(publicSubnetNames)
    }

    /**
     * @param publicSubnetNames Name of public subnet groups.
     * Element count: #(publicGroups)
     */
    override fun publicSubnetNames(vararg publicSubnetNames: String): Unit =
        publicSubnetNames(publicSubnetNames.toList())

    /**
     * @param publicSubnetRouteTableIds Route Table IDs of public subnet groups.
     * Element count: #(availabilityZones)   #(publicGroups)
     */
    override fun publicSubnetRouteTableIds(publicSubnetRouteTableIds: List<String>) {
      cdkBuilder.publicSubnetRouteTableIds(publicSubnetRouteTableIds)
    }

    /**
     * @param publicSubnetRouteTableIds Route Table IDs of public subnet groups.
     * Element count: #(availabilityZones)   #(publicGroups)
     */
    override fun publicSubnetRouteTableIds(vararg publicSubnetRouteTableIds: String): Unit =
        publicSubnetRouteTableIds(publicSubnetRouteTableIds.toList())

    /**
     * @param region The region in which the VPC is in.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param subnetGroups The subnet groups discovered for the given VPC.
     * Unlike the above properties, this will include asymmetric subnets,
     * if the VPC has any.
     * This property will only be populated if `VpcContextQuery.returnAsymmetricSubnets`
     * is true.
     */
    override fun subnetGroups(subnetGroups: List<VpcSubnetGroup>) {
      cdkBuilder.subnetGroups(subnetGroups.map(VpcSubnetGroup::unwrap))
    }

    /**
     * @param subnetGroups The subnet groups discovered for the given VPC.
     * Unlike the above properties, this will include asymmetric subnets,
     * if the VPC has any.
     * This property will only be populated if `VpcContextQuery.returnAsymmetricSubnets`
     * is true.
     */
    override fun subnetGroups(vararg subnetGroups: VpcSubnetGroup): Unit =
        subnetGroups(subnetGroups.toList())

    /**
     * @param vpcCidrBlock VPC cidr.
     */
    override fun vpcCidrBlock(vpcCidrBlock: String) {
      cdkBuilder.vpcCidrBlock(vpcCidrBlock)
    }

    /**
     * @param vpcId VPC id. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    /**
     * @param vpnGatewayId The VPN gateway ID.
     */
    override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): software.amazon.awscdk.cxapi.VpcContextResponse = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.VpcContextResponse,
  ) : CdkObject(cdkObject), VpcContextResponse {
    /**
     * AZs.
     */
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones()

    /**
     * IDs of all isolated subnets.
     *
     * Element count: #(availabilityZones)   #(isolatedGroups)
     */
    override fun isolatedSubnetIds(): List<String> = unwrap(this).getIsolatedSubnetIds() ?:
        emptyList()

    /**
     * Name of isolated subnet groups.
     *
     * Element count: #(isolatedGroups)
     */
    override fun isolatedSubnetNames(): List<String> = unwrap(this).getIsolatedSubnetNames() ?:
        emptyList()

    /**
     * Route Table IDs of isolated subnet groups.
     *
     * Element count: #(availabilityZones)   #(isolatedGroups)
     */
    override fun isolatedSubnetRouteTableIds(): List<String> =
        unwrap(this).getIsolatedSubnetRouteTableIds() ?: emptyList()

    /**
     * The ID of the AWS account that owns the VPC.
     *
     * Default: the account id of the parent stack
     */
    override fun ownerAccountId(): String? = unwrap(this).getOwnerAccountId()

    /**
     * IDs of all private subnets.
     *
     * Element count: #(availabilityZones)   #(privateGroups)
     */
    override fun privateSubnetIds(): List<String> = unwrap(this).getPrivateSubnetIds() ?:
        emptyList()

    /**
     * Name of private subnet groups.
     *
     * Element count: #(privateGroups)
     */
    override fun privateSubnetNames(): List<String> = unwrap(this).getPrivateSubnetNames() ?:
        emptyList()

    /**
     * Route Table IDs of private subnet groups.
     *
     * Element count: #(availabilityZones)   #(privateGroups)
     */
    override fun privateSubnetRouteTableIds(): List<String> =
        unwrap(this).getPrivateSubnetRouteTableIds() ?: emptyList()

    /**
     * IDs of all public subnets.
     *
     * Element count: #(availabilityZones)   #(publicGroups)
     */
    override fun publicSubnetIds(): List<String> = unwrap(this).getPublicSubnetIds() ?: emptyList()

    /**
     * Name of public subnet groups.
     *
     * Element count: #(publicGroups)
     */
    override fun publicSubnetNames(): List<String> = unwrap(this).getPublicSubnetNames() ?:
        emptyList()

    /**
     * Route Table IDs of public subnet groups.
     *
     * Element count: #(availabilityZones)   #(publicGroups)
     */
    override fun publicSubnetRouteTableIds(): List<String> =
        unwrap(this).getPublicSubnetRouteTableIds() ?: emptyList()

    /**
     * The region in which the VPC is in.
     *
     * Default: - Region of the parent stack
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * The subnet groups discovered for the given VPC.
     *
     * Unlike the above properties, this will include asymmetric subnets,
     * if the VPC has any.
     * This property will only be populated if `VpcContextQuery.returnAsymmetricSubnets`
     * is true.
     *
     * Default: - no subnet groups will be returned unless `VpcContextQuery.returnAsymmetricSubnets`
     * is true
     */
    override fun subnetGroups(): List<VpcSubnetGroup> =
        unwrap(this).getSubnetGroups()?.map(VpcSubnetGroup::wrap) ?: emptyList()

    /**
     * VPC cidr.
     *
     * Default: - CIDR information not available
     */
    override fun vpcCidrBlock(): String? = unwrap(this).getVpcCidrBlock()

    /**
     * VPC id.
     */
    override fun vpcId(): String = unwrap(this).getVpcId()

    /**
     * The VPN gateway ID.
     */
    override fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcContextResponse {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.VpcContextResponse):
        VpcContextResponse = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcContextResponse):
        software.amazon.awscdk.cxapi.VpcContextResponse = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.cxapi.VpcContextResponse
  }
}
