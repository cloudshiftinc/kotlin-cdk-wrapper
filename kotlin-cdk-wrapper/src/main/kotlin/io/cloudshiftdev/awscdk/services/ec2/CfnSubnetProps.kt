@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSubnetProps {
  public fun assignIpv6AddressOnCreation(): Any? = unwrap(this).getAssignIpv6AddressOnCreation()

  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

  public fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  public fun enableDns64(): Any? = unwrap(this).getEnableDns64()

  public fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

  public fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

  public fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  public fun ipv6CidrBlocks(): List<String> = unwrap(this).getIpv6CidrBlocks() ?: emptyList()

  public fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

  public fun ipv6Native(): Any? = unwrap(this).getIpv6Native()

  public fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

  public fun mapPublicIpOnLaunch(): Any? = unwrap(this).getMapPublicIpOnLaunch()

  public fun outpostArn(): String? = unwrap(this).getOutpostArn()

  public fun privateDnsNameOptionsOnLaunch(): Any? = unwrap(this).getPrivateDnsNameOptionsOnLaunch()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean)

    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: IResolvable)

    public fun availabilityZone(availabilityZone: String)

    public fun availabilityZoneId(availabilityZoneId: String)

    public fun cidrBlock(cidrBlock: String)

    public fun enableDns64(enableDns64: Boolean)

    public fun enableDns64(enableDns64: IResolvable)

    public fun ipv4IpamPoolId(ipv4IpamPoolId: String)

    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number)

    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    public fun ipv6CidrBlocks(ipv6CidrBlocks: List<String>)

    public fun ipv6CidrBlocks(vararg ipv6CidrBlocks: String)

    public fun ipv6IpamPoolId(ipv6IpamPoolId: String)

    public fun ipv6Native(ipv6Native: Boolean)

    public fun ipv6Native(ipv6Native: IResolvable)

    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number)

    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean)

    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: IResolvable)

    public fun outpostArn(outpostArn: String)

    public fun privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSubnetProps.Builder =
        software.amazon.awscdk.services.ec2.CfnSubnetProps.builder()

    override fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean) {
      cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation)
    }

    override fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: IResolvable) {
      cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation.let(IResolvable::unwrap))
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun availabilityZoneId(availabilityZoneId: String) {
      cdkBuilder.availabilityZoneId(availabilityZoneId)
    }

    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    override fun enableDns64(enableDns64: Boolean) {
      cdkBuilder.enableDns64(enableDns64)
    }

    override fun enableDns64(enableDns64: IResolvable) {
      cdkBuilder.enableDns64(enableDns64.let(IResolvable::unwrap))
    }

    override fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
      cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    override fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
      cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    override fun ipv6CidrBlocks(ipv6CidrBlocks: List<String>) {
      cdkBuilder.ipv6CidrBlocks(ipv6CidrBlocks)
    }

    override fun ipv6CidrBlocks(vararg ipv6CidrBlocks: String): Unit =
        ipv6CidrBlocks(ipv6CidrBlocks.toList())

    override fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
      cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
    }

    override fun ipv6Native(ipv6Native: Boolean) {
      cdkBuilder.ipv6Native(ipv6Native)
    }

    override fun ipv6Native(ipv6Native: IResolvable) {
      cdkBuilder.ipv6Native(ipv6Native.let(IResolvable::unwrap))
    }

    override fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
      cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    override fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
      cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    override fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: IResolvable) {
      cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch.let(IResolvable::unwrap))
    }

    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    override fun privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch: Any) {
      cdkBuilder.privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSubnetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetProps,
  ) : CdkObject(cdkObject), CfnSubnetProps {
    override fun assignIpv6AddressOnCreation(): Any? = unwrap(this).getAssignIpv6AddressOnCreation()

    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

    override fun cidrBlock(): String? = unwrap(this).getCidrBlock()

    override fun enableDns64(): Any? = unwrap(this).getEnableDns64()

    override fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

    override fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

    override fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

    override fun ipv6CidrBlocks(): List<String> = unwrap(this).getIpv6CidrBlocks() ?: emptyList()

    override fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

    override fun ipv6Native(): Any? = unwrap(this).getIpv6Native()

    override fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

    override fun mapPublicIpOnLaunch(): Any? = unwrap(this).getMapPublicIpOnLaunch()

    override fun outpostArn(): String? = unwrap(this).getOutpostArn()

    override fun privateDnsNameOptionsOnLaunch(): Any? =
        unwrap(this).getPrivateDnsNameOptionsOnLaunch()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubnetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetProps): CfnSubnetProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetProps): software.amazon.awscdk.services.ec2.CfnSubnetProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnSubnetProps
  }
}
