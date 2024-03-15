@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnTransitGatewayRouteTablePropagationProps {
  public fun transitGatewayAttachmentId(): String

  public fun transitGatewayRouteTableId(): String

  @CdkDslMarker
  public interface Builder {
    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String)

    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps.builder()

    override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
      cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    override fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
      cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayRouteTablePropagationProps {
    override fun transitGatewayAttachmentId(): String = unwrap(this).getTransitGatewayAttachmentId()

    override fun transitGatewayRouteTableId(): String = unwrap(this).getTransitGatewayRouteTableId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayRouteTablePropagationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps):
        CfnTransitGatewayRouteTablePropagationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRouteTablePropagationProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps
  }
}
