@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnTransitGatewayMulticastGroupMemberProps {
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
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps.builder()

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
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayMulticastGroupMemberProps {
    override fun groupIpAddress(): String = unwrap(this).getGroupIpAddress()

    override fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

    override fun transitGatewayMulticastDomainId(): String =
        unwrap(this).getTransitGatewayMulticastDomainId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayMulticastGroupMemberProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps):
        CfnTransitGatewayMulticastGroupMemberProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayMulticastGroupMemberProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps
  }
}
