@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnTransitGatewayRouteProps {
  public fun blackhole(): Any? = unwrap(this).getBlackhole()

  public fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

  public fun transitGatewayAttachmentId(): String? = unwrap(this).getTransitGatewayAttachmentId()

  public fun transitGatewayRouteTableId(): String

  @CdkDslMarker
  public interface Builder {
    public fun blackhole(blackhole: Boolean)

    public fun blackhole(blackhole: IResolvable)

    public fun destinationCidrBlock(destinationCidrBlock: String)

    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String)

    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps.Builder
        = software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps.builder()

    override fun blackhole(blackhole: Boolean) {
      cdkBuilder.blackhole(blackhole)
    }

    override fun blackhole(blackhole: IResolvable) {
      cdkBuilder.blackhole(blackhole.let(IResolvable::unwrap))
    }

    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
      cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    override fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
      cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayRouteProps {
    override fun blackhole(): Any? = unwrap(this).getBlackhole()

    override fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

    override fun transitGatewayAttachmentId(): String? =
        unwrap(this).getTransitGatewayAttachmentId()

    override fun transitGatewayRouteTableId(): String = unwrap(this).getTransitGatewayRouteTableId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransitGatewayRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps):
        CfnTransitGatewayRouteProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRouteProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps
  }
}
