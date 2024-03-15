@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface VpcContextResponse {
  public fun availabilityZones(): List<String>

  public fun isolatedSubnetIds(): List<String> = unwrap(this).getIsolatedSubnetIds() ?: emptyList()

  public fun isolatedSubnetNames(): List<String> = unwrap(this).getIsolatedSubnetNames() ?:
      emptyList()

  public fun isolatedSubnetRouteTableIds(): List<String> =
      unwrap(this).getIsolatedSubnetRouteTableIds() ?: emptyList()

  public fun ownerAccountId(): String? = unwrap(this).getOwnerAccountId()

  public fun privateSubnetIds(): List<String> = unwrap(this).getPrivateSubnetIds() ?: emptyList()

  public fun privateSubnetNames(): List<String> = unwrap(this).getPrivateSubnetNames() ?:
      emptyList()

  public fun privateSubnetRouteTableIds(): List<String> =
      unwrap(this).getPrivateSubnetRouteTableIds() ?: emptyList()

  public fun publicSubnetIds(): List<String> = unwrap(this).getPublicSubnetIds() ?: emptyList()

  public fun publicSubnetNames(): List<String> = unwrap(this).getPublicSubnetNames() ?: emptyList()

  public fun publicSubnetRouteTableIds(): List<String> = unwrap(this).getPublicSubnetRouteTableIds()
      ?: emptyList()

  public fun region(): String? = unwrap(this).getRegion()

  public fun subnetGroups(): List<VpcSubnetGroup> =
      unwrap(this).getSubnetGroups()?.map(VpcSubnetGroup::wrap) ?: emptyList()

  public fun vpcCidrBlock(): String? = unwrap(this).getVpcCidrBlock()

  public fun vpcId(): String

  public fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZones(availabilityZones: List<String>)

    public fun availabilityZones(vararg availabilityZones: String)

    public fun isolatedSubnetIds(isolatedSubnetIds: List<String>)

    public fun isolatedSubnetIds(vararg isolatedSubnetIds: String)

    public fun isolatedSubnetNames(isolatedSubnetNames: List<String>)

    public fun isolatedSubnetNames(vararg isolatedSubnetNames: String)

    public fun isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds: List<String>)

    public fun isolatedSubnetRouteTableIds(vararg isolatedSubnetRouteTableIds: String)

    public fun ownerAccountId(ownerAccountId: String)

    public fun privateSubnetIds(privateSubnetIds: List<String>)

    public fun privateSubnetIds(vararg privateSubnetIds: String)

    public fun privateSubnetNames(privateSubnetNames: List<String>)

    public fun privateSubnetNames(vararg privateSubnetNames: String)

    public fun privateSubnetRouteTableIds(privateSubnetRouteTableIds: List<String>)

    public fun privateSubnetRouteTableIds(vararg privateSubnetRouteTableIds: String)

    public fun publicSubnetIds(publicSubnetIds: List<String>)

    public fun publicSubnetIds(vararg publicSubnetIds: String)

    public fun publicSubnetNames(publicSubnetNames: List<String>)

    public fun publicSubnetNames(vararg publicSubnetNames: String)

    public fun publicSubnetRouteTableIds(publicSubnetRouteTableIds: List<String>)

    public fun publicSubnetRouteTableIds(vararg publicSubnetRouteTableIds: String)

    public fun region(region: String)

    public fun subnetGroups(subnetGroups: List<VpcSubnetGroup>)

    public fun subnetGroups(vararg subnetGroups: VpcSubnetGroup)

    public fun vpcCidrBlock(vpcCidrBlock: String)

    public fun vpcId(vpcId: String)

    public fun vpnGatewayId(vpnGatewayId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.VpcContextResponse.Builder =
        software.amazon.awscdk.cxapi.VpcContextResponse.builder()

    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    override fun isolatedSubnetIds(isolatedSubnetIds: List<String>) {
      cdkBuilder.isolatedSubnetIds(isolatedSubnetIds)
    }

    override fun isolatedSubnetIds(vararg isolatedSubnetIds: String): Unit =
        isolatedSubnetIds(isolatedSubnetIds.toList())

    override fun isolatedSubnetNames(isolatedSubnetNames: List<String>) {
      cdkBuilder.isolatedSubnetNames(isolatedSubnetNames)
    }

    override fun isolatedSubnetNames(vararg isolatedSubnetNames: String): Unit =
        isolatedSubnetNames(isolatedSubnetNames.toList())

    override fun isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds: List<String>) {
      cdkBuilder.isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds)
    }

    override fun isolatedSubnetRouteTableIds(vararg isolatedSubnetRouteTableIds: String): Unit =
        isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds.toList())

    override fun ownerAccountId(ownerAccountId: String) {
      cdkBuilder.ownerAccountId(ownerAccountId)
    }

    override fun privateSubnetIds(privateSubnetIds: List<String>) {
      cdkBuilder.privateSubnetIds(privateSubnetIds)
    }

    override fun privateSubnetIds(vararg privateSubnetIds: String): Unit =
        privateSubnetIds(privateSubnetIds.toList())

    override fun privateSubnetNames(privateSubnetNames: List<String>) {
      cdkBuilder.privateSubnetNames(privateSubnetNames)
    }

    override fun privateSubnetNames(vararg privateSubnetNames: String): Unit =
        privateSubnetNames(privateSubnetNames.toList())

    override fun privateSubnetRouteTableIds(privateSubnetRouteTableIds: List<String>) {
      cdkBuilder.privateSubnetRouteTableIds(privateSubnetRouteTableIds)
    }

    override fun privateSubnetRouteTableIds(vararg privateSubnetRouteTableIds: String): Unit =
        privateSubnetRouteTableIds(privateSubnetRouteTableIds.toList())

    override fun publicSubnetIds(publicSubnetIds: List<String>) {
      cdkBuilder.publicSubnetIds(publicSubnetIds)
    }

    override fun publicSubnetIds(vararg publicSubnetIds: String): Unit =
        publicSubnetIds(publicSubnetIds.toList())

    override fun publicSubnetNames(publicSubnetNames: List<String>) {
      cdkBuilder.publicSubnetNames(publicSubnetNames)
    }

    override fun publicSubnetNames(vararg publicSubnetNames: String): Unit =
        publicSubnetNames(publicSubnetNames.toList())

    override fun publicSubnetRouteTableIds(publicSubnetRouteTableIds: List<String>) {
      cdkBuilder.publicSubnetRouteTableIds(publicSubnetRouteTableIds)
    }

    override fun publicSubnetRouteTableIds(vararg publicSubnetRouteTableIds: String): Unit =
        publicSubnetRouteTableIds(publicSubnetRouteTableIds.toList())

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun subnetGroups(subnetGroups: List<VpcSubnetGroup>) {
      cdkBuilder.subnetGroups(subnetGroups.map(VpcSubnetGroup::unwrap))
    }

    override fun subnetGroups(vararg subnetGroups: VpcSubnetGroup): Unit =
        subnetGroups(subnetGroups.toList())

    override fun vpcCidrBlock(vpcCidrBlock: String) {
      cdkBuilder.vpcCidrBlock(vpcCidrBlock)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): software.amazon.awscdk.cxapi.VpcContextResponse = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.VpcContextResponse,
  ) : CdkObject(cdkObject), VpcContextResponse {
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones()

    override fun isolatedSubnetIds(): List<String> = unwrap(this).getIsolatedSubnetIds() ?:
        emptyList()

    override fun isolatedSubnetNames(): List<String> = unwrap(this).getIsolatedSubnetNames() ?:
        emptyList()

    override fun isolatedSubnetRouteTableIds(): List<String> =
        unwrap(this).getIsolatedSubnetRouteTableIds() ?: emptyList()

    override fun ownerAccountId(): String? = unwrap(this).getOwnerAccountId()

    override fun privateSubnetIds(): List<String> = unwrap(this).getPrivateSubnetIds() ?:
        emptyList()

    override fun privateSubnetNames(): List<String> = unwrap(this).getPrivateSubnetNames() ?:
        emptyList()

    override fun privateSubnetRouteTableIds(): List<String> =
        unwrap(this).getPrivateSubnetRouteTableIds() ?: emptyList()

    override fun publicSubnetIds(): List<String> = unwrap(this).getPublicSubnetIds() ?: emptyList()

    override fun publicSubnetNames(): List<String> = unwrap(this).getPublicSubnetNames() ?:
        emptyList()

    override fun publicSubnetRouteTableIds(): List<String> =
        unwrap(this).getPublicSubnetRouteTableIds() ?: emptyList()

    override fun region(): String? = unwrap(this).getRegion()

    override fun subnetGroups(): List<VpcSubnetGroup> =
        unwrap(this).getSubnetGroups()?.map(VpcSubnetGroup::wrap) ?: emptyList()

    override fun vpcCidrBlock(): String? = unwrap(this).getVpcCidrBlock()

    override fun vpcId(): String = unwrap(this).getVpcId()

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
