package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface PrivateSubnetProps : SubnetProps {
  /**
   * A builder for [PrivateSubnetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     * subnet receives an IPv6 address.
     * If you specify AssignIpv6AddressOnCreation, you must also specify Ipv6CidrBlock.
     */
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean)

    /**
     * @param availabilityZone The availability zone for the subnet. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param cidrBlock The CIDR notation for this subnet. 
     */
    public fun cidrBlock(cidrBlock: String)

    /**
     * @param ipv6CidrBlock The IPv6 CIDR block.
     * If you specify AssignIpv6AddressOnCreation, you must also specify Ipv6CidrBlock.
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    /**
     * @param mapPublicIpOnLaunch Controls if a public IP is associated to an instance at launch.
     */
    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean)

    /**
     * @param vpcId The VPC which this subnet is part of. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PrivateSubnetProps.Builder =
        software.amazon.awscdk.services.ec2.PrivateSubnetProps.builder()

    /**
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     * subnet receives an IPv6 address.
     * If you specify AssignIpv6AddressOnCreation, you must also specify Ipv6CidrBlock.
     */
    override fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean) {
      cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation)
    }

    /**
     * @param availabilityZone The availability zone for the subnet. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param cidrBlock The CIDR notation for this subnet. 
     */
    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    /**
     * @param ipv6CidrBlock The IPv6 CIDR block.
     * If you specify AssignIpv6AddressOnCreation, you must also specify Ipv6CidrBlock.
     */
    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /**
     * @param mapPublicIpOnLaunch Controls if a public IP is associated to an instance at launch.
     */
    override fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
      cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    /**
     * @param vpcId The VPC which this subnet is part of. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.PrivateSubnetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.PrivateSubnetProps,
  ) : CdkObject(cdkObject), PrivateSubnetProps {
    /**
     * Indicates whether a network interface created in this subnet receives an IPv6 address.
     *
     * If you specify AssignIpv6AddressOnCreation, you must also specify Ipv6CidrBlock.
     *
     * Default: false
     */
    override fun assignIpv6AddressOnCreation(): Boolean? =
        unwrap(this).getAssignIpv6AddressOnCreation()

    /**
     * The availability zone for the subnet.
     */
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    /**
     * The CIDR notation for this subnet.
     */
    override fun cidrBlock(): String = unwrap(this).getCidrBlock()

    /**
     * The IPv6 CIDR block.
     *
     * If you specify AssignIpv6AddressOnCreation, you must also specify Ipv6CidrBlock.
     *
     * Default: - no IPv6 CIDR block.
     */
    override fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

    /**
     * Controls if a public IP is associated to an instance at launch.
     *
     * Default: true in Subnet.Public, false in Subnet.Private or Subnet.Isolated.
     */
    override fun mapPublicIpOnLaunch(): Boolean? = unwrap(this).getMapPublicIpOnLaunch()

    /**
     * The VPC which this subnet is part of.
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PrivateSubnetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PrivateSubnetProps):
        PrivateSubnetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PrivateSubnetProps):
        software.amazon.awscdk.services.ec2.PrivateSubnetProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.PrivateSubnetProps
  }
}
