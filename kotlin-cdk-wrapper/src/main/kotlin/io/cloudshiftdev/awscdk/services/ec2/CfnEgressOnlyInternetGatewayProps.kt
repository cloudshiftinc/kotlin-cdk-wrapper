@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnEgressOnlyInternetGatewayProps {
  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps.Builder =
        software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps.builder()

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps,
  ) : CdkObject(cdkObject), CfnEgressOnlyInternetGatewayProps {
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEgressOnlyInternetGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps):
        CfnEgressOnlyInternetGatewayProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEgressOnlyInternetGatewayProps):
        software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps
  }
}
