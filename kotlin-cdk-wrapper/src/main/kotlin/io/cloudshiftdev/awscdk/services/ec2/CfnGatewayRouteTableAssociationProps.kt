@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnGatewayRouteTableAssociationProps {
  public fun gatewayId(): String

  public fun routeTableId(): String

  @CdkDslMarker
  public interface Builder {
    public fun gatewayId(gatewayId: String)

    public fun routeTableId(routeTableId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps.builder()

    override fun gatewayId(gatewayId: String) {
      cdkBuilder.gatewayId(gatewayId)
    }

    override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps,
  ) : CdkObject(cdkObject), CfnGatewayRouteTableAssociationProps {
    override fun gatewayId(): String = unwrap(this).getGatewayId()

    override fun routeTableId(): String = unwrap(this).getRouteTableId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnGatewayRouteTableAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps):
        CfnGatewayRouteTableAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGatewayRouteTableAssociationProps):
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps
  }
}
