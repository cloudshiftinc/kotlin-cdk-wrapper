@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnLocalGatewayRouteProps {
  public fun destinationCidrBlock(): String

  public fun localGatewayRouteTableId(): String

  public fun localGatewayVirtualInterfaceGroupId(): String? =
      unwrap(this).getLocalGatewayVirtualInterfaceGroupId()

  public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  @CdkDslMarker
  public interface Builder {
    public fun destinationCidrBlock(destinationCidrBlock: String)

    public fun localGatewayRouteTableId(localGatewayRouteTableId: String)

    public fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String)

    public fun networkInterfaceId(networkInterfaceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps.Builder =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps.builder()

    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    override fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
      cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
    }

    override fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String) {
      cdkBuilder.localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId)
    }

    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps,
  ) : CdkObject(cdkObject), CfnLocalGatewayRouteProps {
    override fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

    override fun localGatewayRouteTableId(): String = unwrap(this).getLocalGatewayRouteTableId()

    override fun localGatewayVirtualInterfaceGroupId(): String? =
        unwrap(this).getLocalGatewayVirtualInterfaceGroupId()

    override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocalGatewayRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps):
        CfnLocalGatewayRouteProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocalGatewayRouteProps):
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps
  }
}
