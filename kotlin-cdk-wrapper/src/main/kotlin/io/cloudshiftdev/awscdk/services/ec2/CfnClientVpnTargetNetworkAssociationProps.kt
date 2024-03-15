@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnClientVpnTargetNetworkAssociationProps {
  public fun clientVpnEndpointId(): String

  public fun subnetId(): String

  @CdkDslMarker
  public interface Builder {
    public fun clientVpnEndpointId(clientVpnEndpointId: String)

    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps.builder()

    override fun clientVpnEndpointId(clientVpnEndpointId: String) {
      cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
    }

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps,
  ) : CdkObject(cdkObject), CfnClientVpnTargetNetworkAssociationProps {
    override fun clientVpnEndpointId(): String = unwrap(this).getClientVpnEndpointId()

    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnClientVpnTargetNetworkAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps):
        CfnClientVpnTargetNetworkAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClientVpnTargetNetworkAssociationProps):
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps
  }
}
