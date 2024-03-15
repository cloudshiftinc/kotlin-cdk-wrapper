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

public interface CfnVPCProps {
  public fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  public fun enableDnsHostnames(): Any? = unwrap(this).getEnableDnsHostnames()

  public fun enableDnsSupport(): Any? = unwrap(this).getEnableDnsSupport()

  public fun instanceTenancy(): String? = unwrap(this).getInstanceTenancy()

  public fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

  public fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun cidrBlock(cidrBlock: String)

    public fun enableDnsHostnames(enableDnsHostnames: Boolean)

    public fun enableDnsHostnames(enableDnsHostnames: IResolvable)

    public fun enableDnsSupport(enableDnsSupport: Boolean)

    public fun enableDnsSupport(enableDnsSupport: IResolvable)

    public fun instanceTenancy(instanceTenancy: String)

    public fun ipv4IpamPoolId(ipv4IpamPoolId: String)

    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCProps.builder()

    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    override fun enableDnsHostnames(enableDnsHostnames: Boolean) {
      cdkBuilder.enableDnsHostnames(enableDnsHostnames)
    }

    override fun enableDnsHostnames(enableDnsHostnames: IResolvable) {
      cdkBuilder.enableDnsHostnames(enableDnsHostnames.let(IResolvable::unwrap))
    }

    override fun enableDnsSupport(enableDnsSupport: Boolean) {
      cdkBuilder.enableDnsSupport(enableDnsSupport)
    }

    override fun enableDnsSupport(enableDnsSupport: IResolvable) {
      cdkBuilder.enableDnsSupport(enableDnsSupport.let(IResolvable::unwrap))
    }

    override fun instanceTenancy(instanceTenancy: String) {
      cdkBuilder.instanceTenancy(instanceTenancy)
    }

    override fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
      cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    override fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
      cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCProps,
  ) : CdkObject(cdkObject), CfnVPCProps {
    override fun cidrBlock(): String? = unwrap(this).getCidrBlock()

    override fun enableDnsHostnames(): Any? = unwrap(this).getEnableDnsHostnames()

    override fun enableDnsSupport(): Any? = unwrap(this).getEnableDnsSupport()

    override fun instanceTenancy(): String? = unwrap(this).getInstanceTenancy()

    override fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

    override fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCProps): CfnVPCProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCProps): software.amazon.awscdk.services.ec2.CfnVPCProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVPCProps
  }
}
