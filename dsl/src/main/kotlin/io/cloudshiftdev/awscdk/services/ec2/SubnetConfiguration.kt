package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface SubnetConfiguration {
  /**
   * The number of leading 1 bits in the routing mask.
   *
   * The number of available IP addresses in each subnet of this group
   * will be equal to `2^(32 - cidrMask) - 2`.
   *
   * Valid values are `16--28`.
   *
   * Note this is specific to IPv4 addresses.
   *
   * Default: - Available IP space is evenly divided across subnets.
   */
  public fun cidrMask(): Number? = unwrap(this).getCidrMask()

  /**
   * This property is specific to dual stack VPCs.
   *
   * If set to false, then an IPv6 address will not be automatically assigned.
   *
   * Note this is specific to IPv6 addresses.
   *
   * Default: true
   */
  public fun ipv6AssignAddressOnCreation(): Boolean? = unwrap(this).getIpv6AssignAddressOnCreation()

  /**
   * Controls if a public IPv4 address is associated to an instance at launch.
   *
   * Note this is specific to IPv4 addresses.
   *
   * Default: true in Subnet.Public of IPV4_ONLY VPCs, false otherwise
   */
  public fun mapPublicIpOnLaunch(): Boolean? = unwrap(this).getMapPublicIpOnLaunch()

  /**
   * Logical name for the subnet group.
   *
   * This name can be used when selecting VPC subnets to distinguish
   * between different subnet groups of the same type.
   */
  public fun name(): String

  /**
   * Controls if subnet IP space needs to be reserved.
   *
   * When true, the IP space for the subnet is reserved but no actual
   * resources are provisioned. This space is only dependent on the
   * number of availability zones and on `cidrMask` - all other subnet
   * properties are ignored.
   *
   * Default: false
   */
  public fun reserved(): Boolean? = unwrap(this).getReserved()

  /**
   * The type of Subnet to configure.
   *
   * The Subnet type will control the ability to route and connect to the
   * Internet.
   */
  public fun subnetType(): SubnetType

  /**
   * A builder for [SubnetConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidrMask The number of leading 1 bits in the routing mask.
     * The number of available IP addresses in each subnet of this group
     * will be equal to `2^(32 - cidrMask) - 2`.
     *
     * Valid values are `16--28`.
     *
     * Note this is specific to IPv4 addresses.
     */
    public fun cidrMask(cidrMask: Number)

    /**
     * @param ipv6AssignAddressOnCreation This property is specific to dual stack VPCs.
     * If set to false, then an IPv6 address will not be automatically assigned.
     *
     * Note this is specific to IPv6 addresses.
     */
    public fun ipv6AssignAddressOnCreation(ipv6AssignAddressOnCreation: Boolean)

    /**
     * @param mapPublicIpOnLaunch Controls if a public IPv4 address is associated to an instance at
     * launch.
     * Note this is specific to IPv4 addresses.
     */
    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean)

    /**
     * @param name Logical name for the subnet group. 
     * This name can be used when selecting VPC subnets to distinguish
     * between different subnet groups of the same type.
     */
    public fun name(name: String)

    /**
     * @param reserved Controls if subnet IP space needs to be reserved.
     * When true, the IP space for the subnet is reserved but no actual
     * resources are provisioned. This space is only dependent on the
     * number of availability zones and on `cidrMask` - all other subnet
     * properties are ignored.
     */
    public fun reserved(reserved: Boolean)

    /**
     * @param subnetType The type of Subnet to configure. 
     * The Subnet type will control the ability to route and connect to the
     * Internet.
     */
    public fun subnetType(subnetType: SubnetType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SubnetConfiguration.Builder =
        software.amazon.awscdk.services.ec2.SubnetConfiguration.builder()

    /**
     * @param cidrMask The number of leading 1 bits in the routing mask.
     * The number of available IP addresses in each subnet of this group
     * will be equal to `2^(32 - cidrMask) - 2`.
     *
     * Valid values are `16--28`.
     *
     * Note this is specific to IPv4 addresses.
     */
    override fun cidrMask(cidrMask: Number) {
      cdkBuilder.cidrMask(cidrMask)
    }

    /**
     * @param ipv6AssignAddressOnCreation This property is specific to dual stack VPCs.
     * If set to false, then an IPv6 address will not be automatically assigned.
     *
     * Note this is specific to IPv6 addresses.
     */
    override fun ipv6AssignAddressOnCreation(ipv6AssignAddressOnCreation: Boolean) {
      cdkBuilder.ipv6AssignAddressOnCreation(ipv6AssignAddressOnCreation)
    }

    /**
     * @param mapPublicIpOnLaunch Controls if a public IPv4 address is associated to an instance at
     * launch.
     * Note this is specific to IPv4 addresses.
     */
    override fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
      cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    /**
     * @param name Logical name for the subnet group. 
     * This name can be used when selecting VPC subnets to distinguish
     * between different subnet groups of the same type.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param reserved Controls if subnet IP space needs to be reserved.
     * When true, the IP space for the subnet is reserved but no actual
     * resources are provisioned. This space is only dependent on the
     * number of availability zones and on `cidrMask` - all other subnet
     * properties are ignored.
     */
    override fun reserved(reserved: Boolean) {
      cdkBuilder.reserved(reserved)
    }

    /**
     * @param subnetType The type of Subnet to configure. 
     * The Subnet type will control the ability to route and connect to the
     * Internet.
     */
    override fun subnetType(subnetType: SubnetType) {
      cdkBuilder.subnetType(subnetType.let(SubnetType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.SubnetConfiguration = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.SubnetConfiguration,
  ) : CdkObject(cdkObject), SubnetConfiguration {
    /**
     * The number of leading 1 bits in the routing mask.
     *
     * The number of available IP addresses in each subnet of this group
     * will be equal to `2^(32 - cidrMask) - 2`.
     *
     * Valid values are `16--28`.
     *
     * Note this is specific to IPv4 addresses.
     *
     * Default: - Available IP space is evenly divided across subnets.
     */
    override fun cidrMask(): Number? = unwrap(this).getCidrMask()

    /**
     * This property is specific to dual stack VPCs.
     *
     * If set to false, then an IPv6 address will not be automatically assigned.
     *
     * Note this is specific to IPv6 addresses.
     *
     * Default: true
     */
    override fun ipv6AssignAddressOnCreation(): Boolean? =
        unwrap(this).getIpv6AssignAddressOnCreation()

    /**
     * Controls if a public IPv4 address is associated to an instance at launch.
     *
     * Note this is specific to IPv4 addresses.
     *
     * Default: true in Subnet.Public of IPV4_ONLY VPCs, false otherwise
     */
    override fun mapPublicIpOnLaunch(): Boolean? = unwrap(this).getMapPublicIpOnLaunch()

    /**
     * Logical name for the subnet group.
     *
     * This name can be used when selecting VPC subnets to distinguish
     * between different subnet groups of the same type.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Controls if subnet IP space needs to be reserved.
     *
     * When true, the IP space for the subnet is reserved but no actual
     * resources are provisioned. This space is only dependent on the
     * number of availability zones and on `cidrMask` - all other subnet
     * properties are ignored.
     *
     * Default: false
     */
    override fun reserved(): Boolean? = unwrap(this).getReserved()

    /**
     * The type of Subnet to configure.
     *
     * The Subnet type will control the ability to route and connect to the
     * Internet.
     */
    override fun subnetType(): SubnetType = unwrap(this).getSubnetType().let(SubnetType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SubnetConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SubnetConfiguration):
        SubnetConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubnetConfiguration):
        software.amazon.awscdk.services.ec2.SubnetConfiguration = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.SubnetConfiguration
  }
}
