@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a private VPC subnet resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * PrivateSubnet privateSubnet = PrivateSubnet.Builder.create(this, "MyPrivateSubnet")
 * .availabilityZone("availabilityZone")
 * .cidrBlock("cidrBlock")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .assignIpv6AddressOnCreation(false)
 * .ipv6CidrBlock("ipv6CidrBlock")
 * .mapPublicIpOnLaunch(false)
 * .build();
 * ```
 */
public open class PrivateSubnet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.PrivateSubnet,
) : Subnet(cdkObject), IPrivateSubnet {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.PrivateSubnet].
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
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PrivateSubnet.Builder =
        software.amazon.awscdk.services.ec2.PrivateSubnet.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.ec2.PrivateSubnet = cdkBuilder.build()
  }

  public companion object {
    public fun fromPrivateSubnetAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PrivateSubnetAttributes,
    ): IPrivateSubnet =
        software.amazon.awscdk.services.ec2.PrivateSubnet.fromPrivateSubnetAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(PrivateSubnetAttributes::unwrap)).let(IPrivateSubnet::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24d7ca2097dfebaf7ccfe38c8086fab72cd4d0c9e67486c526078a5dfdb71435")
    public fun fromPrivateSubnetAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PrivateSubnetAttributes.Builder.() -> Unit,
    ): IPrivateSubnet = fromPrivateSubnetAttributes(scope, id, PrivateSubnetAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PrivateSubnet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PrivateSubnet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PrivateSubnet): PrivateSubnet =
        PrivateSubnet(cdkObject)

    internal fun unwrap(wrapped: PrivateSubnet): software.amazon.awscdk.services.ec2.PrivateSubnet =
        wrapped.cdkObject
  }
}
