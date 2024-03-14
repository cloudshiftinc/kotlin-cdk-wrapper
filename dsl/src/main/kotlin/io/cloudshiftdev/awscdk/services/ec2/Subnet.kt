package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.IDependable
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Subnet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.Subnet,
) : Resource(cdkObject), ISubnet {
  /**
   * Create a default route that points to a passed IGW, with a dependency on the IGW's attachment
   * to the VPC.
   *
   * @param gatewayId the logical ID (ref) of the gateway attached to your VPC. 
   * @param gatewayAttachment the gateway attachment construct to be added as a dependency. 
   */
  public open fun addDefaultInternetRoute(gatewayId: String, gatewayAttachment: IDependable) {
    unwrap(this).addDefaultInternetRoute(gatewayId, gatewayAttachment.let(IDependable::unwrap))
  }

  /**
   * Adds an entry to this subnets route table that points to the passed NATGatewayId.
   *
   * @param natGatewayId The ID of the NAT gateway. 
   */
  public open fun addDefaultNatRoute(natGatewayId: String) {
    unwrap(this).addDefaultNatRoute(natGatewayId)
  }

  /**
   * Create a default IPv6 route that points to a passed EIGW.
   *
   * @param gatewayId the logical ID (ref) of the gateway attached to your VPC. 
   */
  public open fun addIpv6DefaultEgressOnlyInternetRoute(gatewayId: String) {
    unwrap(this).addIpv6DefaultEgressOnlyInternetRoute(gatewayId)
  }

  /**
   * Create a default IPv6 route that points to a passed IGW.
   *
   * @param gatewayId the logical ID (ref) of the gateway attached to your VPC. 
   */
  public open fun addIpv6DefaultInternetRoute(gatewayId: String) {
    unwrap(this).addIpv6DefaultInternetRoute(gatewayId)
  }

  /**
   * Adds an entry to this subnets route table that points to the passed NATGatewayId.
   *
   * Uses the known 64:ff9b::/96 prefix.
   *
   * @param natGatewayId The ID of the NAT gateway. 
   */
  public open fun addIpv6Nat64Route(natGatewayId: String) {
    unwrap(this).addIpv6Nat64Route(natGatewayId)
  }

  /**
   * Adds an entry to this subnets route table.
   *
   * @param id 
   * @param options 
   */
  public open fun addRoute(id: String, options: AddRouteOptions) {
    unwrap(this).addRoute(id, options.let(AddRouteOptions::unwrap))
  }

  /**
   * Adds an entry to this subnets route table.
   *
   * @param id 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f757bda0b591ee6bbf521e80188e9227e74f4fb2a0de374d74ef01ef953eb089")
  public open fun addRoute(id: String, options: AddRouteOptions.Builder.() -> Unit): Unit =
      addRoute(id, AddRouteOptions(options))

  /**
   * Associate a Network ACL with this subnet.
   *
   * @param id 
   * @param networkAcl 
   */
  public override fun associateNetworkAcl(id: String, networkAcl: INetworkAcl) {
    unwrap(this).associateNetworkAcl(id, networkAcl.let(INetworkAcl::unwrap))
  }

  /**
   * The Availability Zone the subnet is located in.
   */
  public override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

  /**
   * Parts of this VPC subnet.
   */
  public open fun dependencyElements(): List<IDependable> =
      unwrap(this).getDependencyElements().map(IDependable::wrap)

  /**
   * Dependable that can be depended upon to force internet connectivity established on the VPC.
   */
  public override fun internetConnectivityEstablished(): IDependable =
      unwrap(this).getInternetConnectivityEstablished().let(IDependable::wrap)

  /**
   * The IPv4 CIDR block for this subnet.
   */
  public override fun ipv4CidrBlock(): String = unwrap(this).getIpv4CidrBlock()

  /**
   * Network ACL associated with this Subnet.
   *
   * Upon creation, this is the default ACL which allows all traffic, except
   * explicit DENY entries that you add.
   *
   * You can replace it with a custom ACL which denies all traffic except
   * the explicit ALLOW entries that you add by creating a `NetworkAcl`
   * object and calling `associateNetworkAcl()`.
   */
  public open fun networkAcl(): INetworkAcl = unwrap(this).getNetworkAcl().let(INetworkAcl::wrap)

  /**
   * The routeTableId attached to this subnet.
   */
  public override fun routeTable(): IRouteTable =
      unwrap(this).getRouteTable().let(IRouteTable::wrap)

  /**
   *
   */
  public open fun subnetAvailabilityZone(): String = unwrap(this).getSubnetAvailabilityZone()

  /**
   * The subnetId for this particular subnet.
   */
  public override fun subnetId(): String = unwrap(this).getSubnetId()

  /**
   *
   */
  public open fun subnetIpv6CidrBlocks(): List<String> = unwrap(this).getSubnetIpv6CidrBlocks()

  /**
   *
   */
  public open fun subnetNetworkAclAssociationId(): String =
      unwrap(this).getSubnetNetworkAclAssociationId()

  /**
   * The Amazon Resource Name (ARN) of the Outpost for this subnet (if one exists).
   */
  public open fun subnetOutpostArn(): String = unwrap(this).getSubnetOutpostArn()

  /**
   *
   */
  public open fun subnetVpcId(): String = unwrap(this).getSubnetVpcId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.Subnet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether a network interface created in this subnet receives an IPv6 address.
     *
     * If you specify AssignIpv6AddressOnCreation, you must also specify Ipv6CidrBlock.
     *
     * Default: false
     *
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     * subnet receives an IPv6 address. 
     */
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean)

    /**
     * The availability zone for the subnet.
     *
     * @param availabilityZone The availability zone for the subnet. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * The CIDR notation for this subnet.
     *
     * @param cidrBlock The CIDR notation for this subnet. 
     */
    public fun cidrBlock(cidrBlock: String)

    /**
     * The IPv6 CIDR block.
     *
     * If you specify AssignIpv6AddressOnCreation, you must also specify Ipv6CidrBlock.
     *
     * Default: - no IPv6 CIDR block.
     *
     * @param ipv6CidrBlock The IPv6 CIDR block. 
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    /**
     * Controls if a public IP is associated to an instance at launch.
     *
     * Default: true in Subnet.Public, false in Subnet.Private or Subnet.Isolated.
     *
     * @param mapPublicIpOnLaunch Controls if a public IP is associated to an instance at launch. 
     */
    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean)

    /**
     * The VPC which this subnet is part of.
     *
     * @param vpcId The VPC which this subnet is part of. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.Subnet.Builder =
        software.amazon.awscdk.services.ec2.Subnet.Builder.create(scope, id)

    /**
     * Indicates whether a network interface created in this subnet receives an IPv6 address.
     *
     * If you specify AssignIpv6AddressOnCreation, you must also specify Ipv6CidrBlock.
     *
     * Default: false
     *
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     * subnet receives an IPv6 address. 
     */
    override fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean) {
      cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation)
    }

    /**
     * The availability zone for the subnet.
     *
     * @param availabilityZone The availability zone for the subnet. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * The CIDR notation for this subnet.
     *
     * @param cidrBlock The CIDR notation for this subnet. 
     */
    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    /**
     * The IPv6 CIDR block.
     *
     * If you specify AssignIpv6AddressOnCreation, you must also specify Ipv6CidrBlock.
     *
     * Default: - no IPv6 CIDR block.
     *
     * @param ipv6CidrBlock The IPv6 CIDR block. 
     */
    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /**
     * Controls if a public IP is associated to an instance at launch.
     *
     * Default: true in Subnet.Public, false in Subnet.Private or Subnet.Isolated.
     *
     * @param mapPublicIpOnLaunch Controls if a public IP is associated to an instance at launch. 
     */
    override fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
      cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    /**
     * The VPC which this subnet is part of.
     *
     * @param vpcId The VPC which this subnet is part of. 
     */
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

    @Suppress("INAPPLICABLE_JVM_NAME")
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
