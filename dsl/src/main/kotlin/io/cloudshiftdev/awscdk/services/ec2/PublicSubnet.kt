package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class PublicSubnet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.PublicSubnet,
) : Subnet(cdkObject), IPublicSubnet {
  /**
   * Creates a new managed NAT gateway attached to this public subnet.
   *
   * Also adds the EIP for the managed NAT.
   *
   * @return A ref to the the NAT Gateway ID
   * @param eipAllocationId
   */
  public open fun addNatGateway(): CfnNatGateway =
      unwrap(this).addNatGateway().let(CfnNatGateway::wrap)

  /**
   * Creates a new managed NAT gateway attached to this public subnet.
   *
   * Also adds the EIP for the managed NAT.
   *
   * @return A ref to the the NAT Gateway ID
   * @param eipAllocationId
   */
  public open fun addNatGateway(eipAllocationId: String): CfnNatGateway =
      unwrap(this).addNatGateway(eipAllocationId).let(CfnNatGateway::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.PublicSubnet].
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
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PublicSubnet.Builder =
        software.amazon.awscdk.services.ec2.PublicSubnet.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.ec2.PublicSubnet = cdkBuilder.build()
  }

  public companion object {
    public fun fromPublicSubnetAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PublicSubnetAttributes,
    ): IPublicSubnet =
        software.amazon.awscdk.services.ec2.PublicSubnet.fromPublicSubnetAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(PublicSubnetAttributes::unwrap)).let(IPublicSubnet::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62d4fc116dffe5100e12879b93f7113e28393ae8f102cf16abe1ca548805c7ef")
    public fun fromPublicSubnetAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PublicSubnetAttributes.Builder.() -> Unit,
    ): IPublicSubnet = fromPublicSubnetAttributes(scope, id, PublicSubnetAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PublicSubnet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PublicSubnet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PublicSubnet): PublicSubnet =
        PublicSubnet(cdkObject)

    internal fun unwrap(wrapped: PublicSubnet): software.amazon.awscdk.services.ec2.PublicSubnet =
        wrapped.cdkObject
  }
}
