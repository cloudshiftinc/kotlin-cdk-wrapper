package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface VpcAttributes {
  public fun availabilityZones(): List<String>

  public fun isolatedSubnetIds(): List<String> = unwrap(this).getIsolatedSubnetIds() ?: emptyList()

  public fun isolatedSubnetIpv4CidrBlocks(): List<String> =
      unwrap(this).getIsolatedSubnetIpv4CidrBlocks() ?: emptyList()

  public fun isolatedSubnetNames(): List<String> = unwrap(this).getIsolatedSubnetNames() ?:
      emptyList()

  public fun isolatedSubnetRouteTableIds(): List<String> =
      unwrap(this).getIsolatedSubnetRouteTableIds() ?: emptyList()

  public fun privateSubnetIds(): List<String> = unwrap(this).getPrivateSubnetIds() ?: emptyList()

  public fun privateSubnetIpv4CidrBlocks(): List<String> =
      unwrap(this).getPrivateSubnetIpv4CidrBlocks() ?: emptyList()

  public fun privateSubnetNames(): List<String> = unwrap(this).getPrivateSubnetNames() ?:
      emptyList()

  public fun privateSubnetRouteTableIds(): List<String> =
      unwrap(this).getPrivateSubnetRouteTableIds() ?: emptyList()

  public fun publicSubnetIds(): List<String> = unwrap(this).getPublicSubnetIds() ?: emptyList()

  public fun publicSubnetIpv4CidrBlocks(): List<String> =
      unwrap(this).getPublicSubnetIpv4CidrBlocks() ?: emptyList()

  public fun publicSubnetNames(): List<String> = unwrap(this).getPublicSubnetNames() ?: emptyList()

  public fun publicSubnetRouteTableIds(): List<String> = unwrap(this).getPublicSubnetRouteTableIds()
      ?: emptyList()

  public fun region(): String? = unwrap(this).getRegion()

  public fun vpcCidrBlock(): String? = unwrap(this).getVpcCidrBlock()

  public fun vpcId(): String

  public fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  public interface Builder {
    public fun availabilityZones(availabilityZones: List<String>) {
    }

    public fun isolatedSubnetIds(isolatedSubnetIds: List<String>) {
    }

    public fun isolatedSubnetIpv4CidrBlocks(isolatedSubnetIpv4CidrBlocks: List<String>) {
    }

    public fun isolatedSubnetNames(isolatedSubnetNames: List<String>) {
    }

    public fun isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds: List<String>) {
    }

    public fun privateSubnetIds(privateSubnetIds: List<String>) {
    }

    public fun privateSubnetIpv4CidrBlocks(privateSubnetIpv4CidrBlocks: List<String>) {
    }

    public fun privateSubnetNames(privateSubnetNames: List<String>) {
    }

    public fun privateSubnetRouteTableIds(privateSubnetRouteTableIds: List<String>) {
    }

    public fun publicSubnetIds(publicSubnetIds: List<String>) {
    }

    public fun publicSubnetIpv4CidrBlocks(publicSubnetIpv4CidrBlocks: List<String>) {
    }

    public fun publicSubnetNames(publicSubnetNames: List<String>) {
    }

    public fun publicSubnetRouteTableIds(publicSubnetRouteTableIds: List<String>) {
    }

    public fun region(region: String) {
    }

    public fun vpcCidrBlock(vpcCidrBlock: String) {
    }

    public fun vpcId(vpcId: String) {
    }

    public fun vpnGatewayId(vpnGatewayId: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpcAttributes.Builder =
        software.amazon.awscdk.services.ec2.VpcAttributes.builder()

    public override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    public override fun isolatedSubnetIds(isolatedSubnetIds: List<String>) {
      cdkBuilder.isolatedSubnetIds(isolatedSubnetIds)
    }

    public override fun isolatedSubnetIpv4CidrBlocks(isolatedSubnetIpv4CidrBlocks: List<String>) {
      cdkBuilder.isolatedSubnetIpv4CidrBlocks(isolatedSubnetIpv4CidrBlocks)
    }

    public override fun isolatedSubnetNames(isolatedSubnetNames: List<String>) {
      cdkBuilder.isolatedSubnetNames(isolatedSubnetNames)
    }

    public override fun isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds: List<String>) {
      cdkBuilder.isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds)
    }

    public override fun privateSubnetIds(privateSubnetIds: List<String>) {
      cdkBuilder.privateSubnetIds(privateSubnetIds)
    }

    public override fun privateSubnetIpv4CidrBlocks(privateSubnetIpv4CidrBlocks: List<String>) {
      cdkBuilder.privateSubnetIpv4CidrBlocks(privateSubnetIpv4CidrBlocks)
    }

    public override fun privateSubnetNames(privateSubnetNames: List<String>) {
      cdkBuilder.privateSubnetNames(privateSubnetNames)
    }

    public override fun privateSubnetRouteTableIds(privateSubnetRouteTableIds: List<String>) {
      cdkBuilder.privateSubnetRouteTableIds(privateSubnetRouteTableIds)
    }

    public override fun publicSubnetIds(publicSubnetIds: List<String>) {
      cdkBuilder.publicSubnetIds(publicSubnetIds)
    }

    public override fun publicSubnetIpv4CidrBlocks(publicSubnetIpv4CidrBlocks: List<String>) {
      cdkBuilder.publicSubnetIpv4CidrBlocks(publicSubnetIpv4CidrBlocks)
    }

    public override fun publicSubnetNames(publicSubnetNames: List<String>) {
      cdkBuilder.publicSubnetNames(publicSubnetNames)
    }

    public override fun publicSubnetRouteTableIds(publicSubnetRouteTableIds: List<String>) {
      cdkBuilder.publicSubnetRouteTableIds(publicSubnetRouteTableIds)
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public override fun vpcCidrBlock(vpcCidrBlock: String) {
      cdkBuilder.vpcCidrBlock(vpcCidrBlock)
    }

    public override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpcAttributes = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.VpcAttributes,
  ) : VpcAttributes {
    public override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    public override fun isolatedSubnetIds(): List<String> = unwrap(this).getIsolatedSubnetIds() ?:
        emptyList()

    public override fun isolatedSubnetIpv4CidrBlocks(): List<String> =
        unwrap(this).getIsolatedSubnetIpv4CidrBlocks() ?: emptyList()

    public override fun isolatedSubnetNames(): List<String> = unwrap(this).getIsolatedSubnetNames()
        ?: emptyList()

    public override fun isolatedSubnetRouteTableIds(): List<String> =
        unwrap(this).getIsolatedSubnetRouteTableIds() ?: emptyList()

    public override fun privateSubnetIds(): List<String> = unwrap(this).getPrivateSubnetIds() ?:
        emptyList()

    public override fun privateSubnetIpv4CidrBlocks(): List<String> =
        unwrap(this).getPrivateSubnetIpv4CidrBlocks() ?: emptyList()

    public override fun privateSubnetNames(): List<String> = unwrap(this).getPrivateSubnetNames() ?:
        emptyList()

    public override fun privateSubnetRouteTableIds(): List<String> =
        unwrap(this).getPrivateSubnetRouteTableIds() ?: emptyList()

    public override fun publicSubnetIds(): List<String> = unwrap(this).getPublicSubnetIds() ?:
        emptyList()

    public override fun publicSubnetIpv4CidrBlocks(): List<String> =
        unwrap(this).getPublicSubnetIpv4CidrBlocks() ?: emptyList()

    public override fun publicSubnetNames(): List<String> = unwrap(this).getPublicSubnetNames() ?:
        emptyList()

    public override fun publicSubnetRouteTableIds(): List<String> =
        unwrap(this).getPublicSubnetRouteTableIds() ?: emptyList()

    public override fun region(): String? = unwrap(this).getRegion()

    public override fun vpcCidrBlock(): String? = unwrap(this).getVpcCidrBlock()

    public override fun vpcId(): String = unwrap(this).getVpcId()

    public override fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VpcAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcAttributes): VpcAttributes =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcAttributes): software.amazon.awscdk.services.ec2.VpcAttributes =
        (wrapped as Wrapper).cdkObject
  }
}
