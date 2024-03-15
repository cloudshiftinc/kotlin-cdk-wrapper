@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVPNConnectionProps {
  public fun customerGatewayId(): String

  public fun staticRoutesOnly(): Any? = unwrap(this).getStaticRoutesOnly()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

  public fun type(): String

  public fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  public fun vpnTunnelOptionsSpecifications(): Any? =
      unwrap(this).getVpnTunnelOptionsSpecifications()

  @CdkDslMarker
  public interface Builder {
    public fun customerGatewayId(customerGatewayId: String)

    public fun staticRoutesOnly(staticRoutesOnly: Boolean)

    public fun staticRoutesOnly(staticRoutesOnly: IResolvable)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun transitGatewayId(transitGatewayId: String)

    public fun type(type: String)

    public fun vpnGatewayId(vpnGatewayId: String)

    public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: IResolvable)

    public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: List<Any>)

    public fun vpnTunnelOptionsSpecifications(vararg vpnTunnelOptionsSpecifications: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPNConnectionProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPNConnectionProps.builder()

    override fun customerGatewayId(customerGatewayId: String) {
      cdkBuilder.customerGatewayId(customerGatewayId)
    }

    override fun staticRoutesOnly(staticRoutesOnly: Boolean) {
      cdkBuilder.staticRoutesOnly(staticRoutesOnly)
    }

    override fun staticRoutesOnly(staticRoutesOnly: IResolvable) {
      cdkBuilder.staticRoutesOnly(staticRoutesOnly.let(IResolvable::unwrap))
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    override fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: IResolvable) {
      cdkBuilder.vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications.let(IResolvable::unwrap))
    }

    override fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: List<Any>) {
      cdkBuilder.vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications)
    }

    override fun vpnTunnelOptionsSpecifications(vararg vpnTunnelOptionsSpecifications: Any): Unit =
        vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPNConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnectionProps,
  ) : CdkObject(cdkObject), CfnVPNConnectionProps {
    override fun customerGatewayId(): String = unwrap(this).getCustomerGatewayId()

    override fun staticRoutesOnly(): Any? = unwrap(this).getStaticRoutesOnly()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

    override fun type(): String = unwrap(this).getType()

    override fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

    override fun vpnTunnelOptionsSpecifications(): Any? =
        unwrap(this).getVpnTunnelOptionsSpecifications()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPNConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnectionProps):
        CfnVPNConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPNConnectionProps):
        software.amazon.awscdk.services.ec2.CfnVPNConnectionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.CfnVPNConnectionProps
  }
}
