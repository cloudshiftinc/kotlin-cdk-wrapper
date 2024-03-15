@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.collections.List

public interface GatewayVpcEndpointProps : GatewayVpcEndpointOptions {
  public fun vpc(): IVpc

  @CdkDslMarker
  public interface Builder {
    public fun service(service: IGatewayVpcEndpointService)

    public fun subnets(subnets: List<SubnetSelection>)

    public fun subnets(vararg subnets: SubnetSelection)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps.Builder =
        software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps.builder()

    override fun service(service: IGatewayVpcEndpointService) {
      cdkBuilder.service(service.let(IGatewayVpcEndpointService::unwrap))
    }

    override fun subnets(subnets: List<SubnetSelection>) {
      cdkBuilder.subnets(subnets.map(SubnetSelection::unwrap))
    }

    override fun subnets(vararg subnets: SubnetSelection): Unit = subnets(subnets.toList())

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps,
  ) : CdkObject(cdkObject), GatewayVpcEndpointProps {
    override fun service(): IGatewayVpcEndpointService =
        unwrap(this).getService().let(IGatewayVpcEndpointService::wrap)

    override fun subnets(): List<SubnetSelection> =
        unwrap(this).getSubnets()?.map(SubnetSelection::wrap) ?: emptyList()

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayVpcEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps):
        GatewayVpcEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayVpcEndpointProps):
        software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps
  }
}
