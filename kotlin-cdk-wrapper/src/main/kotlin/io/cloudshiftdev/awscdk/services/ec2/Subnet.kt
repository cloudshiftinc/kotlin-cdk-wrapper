@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.IDependable
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Subnet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.Subnet,
) : Resource(cdkObject), ISubnet {
  public open fun addDefaultInternetRoute(gatewayId: String, gatewayAttachment: IDependable) {
    unwrap(this).addDefaultInternetRoute(gatewayId, gatewayAttachment.let(IDependable::unwrap))
  }

  public open fun addDefaultNatRoute(natGatewayId: String) {
    unwrap(this).addDefaultNatRoute(natGatewayId)
  }

  public open fun addIpv6DefaultEgressOnlyInternetRoute(gatewayId: String) {
    unwrap(this).addIpv6DefaultEgressOnlyInternetRoute(gatewayId)
  }

  public open fun addIpv6DefaultInternetRoute(gatewayId: String) {
    unwrap(this).addIpv6DefaultInternetRoute(gatewayId)
  }

  public open fun addIpv6Nat64Route(natGatewayId: String) {
    unwrap(this).addIpv6Nat64Route(natGatewayId)
  }

  public open fun addRoute(id: String, options: AddRouteOptions) {
    unwrap(this).addRoute(id, options.let(AddRouteOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f757bda0b591ee6bbf521e80188e9227e74f4fb2a0de374d74ef01ef953eb089")
  public open fun addRoute(id: String, options: AddRouteOptions.Builder.() -> Unit): Unit =
      addRoute(id, AddRouteOptions(options))

  public override fun associateNetworkAcl(id: String, networkAcl: INetworkAcl) {
    unwrap(this).associateNetworkAcl(id, networkAcl.let(INetworkAcl::unwrap))
  }

  public override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

  public open fun dependencyElements(): List<IDependable> =
      unwrap(this).getDependencyElements().map(IDependable::wrap)

  public override fun internetConnectivityEstablished(): IDependable =
      unwrap(this).getInternetConnectivityEstablished().let(IDependable::wrap)

  public override fun ipv4CidrBlock(): String = unwrap(this).getIpv4CidrBlock()

  public open fun networkAcl(): INetworkAcl = unwrap(this).getNetworkAcl().let(INetworkAcl::wrap)

  public override fun routeTable(): IRouteTable =
      unwrap(this).getRouteTable().let(IRouteTable::wrap)

  public open fun subnetAvailabilityZone(): String = unwrap(this).getSubnetAvailabilityZone()

  public override fun subnetId(): String = unwrap(this).getSubnetId()

  public open fun subnetIpv6CidrBlocks(): List<String> = unwrap(this).getSubnetIpv6CidrBlocks()

  public open fun subnetNetworkAclAssociationId(): String =
      unwrap(this).getSubnetNetworkAclAssociationId()

  public open fun subnetOutpostArn(): String = unwrap(this).getSubnetOutpostArn()

  public open fun subnetVpcId(): String = unwrap(this).getSubnetVpcId()

  @CdkDslMarker
  public interface Builder {
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean)

    public fun availabilityZone(availabilityZone: String)

    public fun cidrBlock(cidrBlock: String)

    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.Subnet.Builder =
        software.amazon.awscdk.services.ec2.Subnet.Builder.create(scope, id)

    override fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean) {
      cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation)
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    override fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
      cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.Subnet = cdkBuilder.build()
  }

  public companion object {
    public fun fromSubnetAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: SubnetAttributes,
    ): ISubnet =
        software.amazon.awscdk.services.ec2.Subnet.fromSubnetAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(SubnetAttributes::unwrap)).let(ISubnet::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bcd31c29478f827dbff002348d295e16e925bd47775558a2a43fd936e9c4133e")
    public fun fromSubnetAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: SubnetAttributes.Builder.() -> Unit,
    ): ISubnet = fromSubnetAttributes(scope, id, SubnetAttributes(attrs))

    public fun fromSubnetId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      subnetId: String,
    ): ISubnet =
        software.amazon.awscdk.services.ec2.Subnet.fromSubnetId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, subnetId).let(ISubnet::wrap)

    public fun isVpcSubnet(x: Any): Boolean =
        software.amazon.awscdk.services.ec2.Subnet.isVpcSubnet(x)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Subnet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Subnet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.Subnet): Subnet =
        Subnet(cdkObject)

    internal fun unwrap(wrapped: Subnet): software.amazon.awscdk.services.ec2.Subnet =
        wrapped.cdkObject
  }
}
