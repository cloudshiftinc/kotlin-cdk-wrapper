@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnTransitGatewayMulticastDomainAssociationProps {
  public fun subnetId(): String

  public fun transitGatewayAttachmentId(): String

  public fun transitGatewayMulticastDomainId(): String

  @CdkDslMarker
  public interface Builder {
    public fun subnetId(subnetId: String)

    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String)

    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps.Builder
        =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps.builder()

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
      cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    override fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
      cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayMulticastDomainAssociationProps {
    override fun subnetId(): String = unwrap(this).getSubnetId()

    override fun transitGatewayAttachmentId(): String = unwrap(this).getTransitGatewayAttachmentId()

    override fun transitGatewayMulticastDomainId(): String =
        unwrap(this).getTransitGatewayMulticastDomainId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayMulticastDomainAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps):
        CfnTransitGatewayMulticastDomainAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayMulticastDomainAssociationProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps
  }
}
