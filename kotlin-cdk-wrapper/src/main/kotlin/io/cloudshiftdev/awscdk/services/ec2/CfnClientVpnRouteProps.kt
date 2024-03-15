@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnClientVpnRouteProps {
  public fun clientVpnEndpointId(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun destinationCidrBlock(): String

  public fun targetVpcSubnetId(): String

  @CdkDslMarker
  public interface Builder {
    public fun clientVpnEndpointId(clientVpnEndpointId: String)

    public fun description(description: String)

    public fun destinationCidrBlock(destinationCidrBlock: String)

    public fun targetVpcSubnetId(targetVpcSubnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps.builder()

    override fun clientVpnEndpointId(clientVpnEndpointId: String) {
      cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    override fun targetVpcSubnetId(targetVpcSubnetId: String) {
      cdkBuilder.targetVpcSubnetId(targetVpcSubnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps,
  ) : CdkObject(cdkObject), CfnClientVpnRouteProps {
    override fun clientVpnEndpointId(): String = unwrap(this).getClientVpnEndpointId()

    override fun description(): String? = unwrap(this).getDescription()

    override fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

    override fun targetVpcSubnetId(): String = unwrap(this).getTargetVpcSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClientVpnRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps):
        CfnClientVpnRouteProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClientVpnRouteProps):
        software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps
  }
}
