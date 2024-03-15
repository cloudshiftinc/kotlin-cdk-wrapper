@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVPNGatewayRoutePropagationProps {
  public fun routeTableIds(): List<String>

  public fun vpnGatewayId(): String

  @CdkDslMarker
  public interface Builder {
    public fun routeTableIds(routeTableIds: List<String>)

    public fun routeTableIds(vararg routeTableIds: String)

    public fun vpnGatewayId(vpnGatewayId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps.builder()

    override fun routeTableIds(routeTableIds: List<String>) {
      cdkBuilder.routeTableIds(routeTableIds)
    }

    override fun routeTableIds(vararg routeTableIds: String): Unit =
        routeTableIds(routeTableIds.toList())

    override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps,
  ) : CdkObject(cdkObject), CfnVPNGatewayRoutePropagationProps {
    override fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds()

    override fun vpnGatewayId(): String = unwrap(this).getVpnGatewayId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPNGatewayRoutePropagationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps):
        CfnVPNGatewayRoutePropagationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPNGatewayRoutePropagationProps):
        software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps
  }
}
