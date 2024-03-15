@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnVPCGatewayAttachmentProps {
  public fun internetGatewayId(): String? = unwrap(this).getInternetGatewayId()

  public fun vpcId(): String

  public fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  @CdkDslMarker
  public interface Builder {
    public fun internetGatewayId(internetGatewayId: String)

    public fun vpcId(vpcId: String)

    public fun vpnGatewayId(vpnGatewayId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps.Builder
        = software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps.builder()

    override fun internetGatewayId(internetGatewayId: String) {
      cdkBuilder.internetGatewayId(internetGatewayId)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps,
  ) : CdkObject(cdkObject), CfnVPCGatewayAttachmentProps {
    override fun internetGatewayId(): String? = unwrap(this).getInternetGatewayId()

    override fun vpcId(): String = unwrap(this).getVpcId()

    override fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCGatewayAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps):
        CfnVPCGatewayAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCGatewayAttachmentProps):
        software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps
  }
}
