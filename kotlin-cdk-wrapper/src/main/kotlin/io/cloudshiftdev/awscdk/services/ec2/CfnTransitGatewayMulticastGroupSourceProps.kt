@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnTransitGatewayMulticastGroupSourceProps {
  public fun groupIpAddress(): String

  public fun networkInterfaceId(): String

  public fun transitGatewayMulticastDomainId(): String

  @CdkDslMarker
  public interface Builder {
    public fun groupIpAddress(groupIpAddress: String)

    public fun networkInterfaceId(networkInterfaceId: String)

    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps.builder()

    override fun groupIpAddress(groupIpAddress: String) {
      cdkBuilder.groupIpAddress(groupIpAddress)
    }

    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    override fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
      cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayMulticastGroupSourceProps {
    override fun groupIpAddress(): String = unwrap(this).getGroupIpAddress()

    override fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

    override fun transitGatewayMulticastDomainId(): String =
        unwrap(this).getTransitGatewayMulticastDomainId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayMulticastGroupSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps):
        CfnTransitGatewayMulticastGroupSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayMulticastGroupSourceProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps
  }
}
