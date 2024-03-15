@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.collections.List

public interface GatewayVpcEndpointOptions {
  public fun service(): IGatewayVpcEndpointService

  public fun subnets(): List<SubnetSelection> =
      unwrap(this).getSubnets()?.map(SubnetSelection::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun service(service: IGatewayVpcEndpointService)

    public fun subnets(subnets: List<SubnetSelection>)

    public fun subnets(vararg subnets: SubnetSelection)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions.Builder =
        software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions.builder()

    override fun service(service: IGatewayVpcEndpointService) {
      cdkBuilder.service(service.let(IGatewayVpcEndpointService::unwrap))
    }

    override fun subnets(subnets: List<SubnetSelection>) {
      cdkBuilder.subnets(subnets.map(SubnetSelection::unwrap))
    }

    override fun subnets(vararg subnets: SubnetSelection): Unit = subnets(subnets.toList())

    public fun build(): software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions,
  ) : CdkObject(cdkObject), GatewayVpcEndpointOptions {
    override fun service(): IGatewayVpcEndpointService =
        unwrap(this).getService().let(IGatewayVpcEndpointService::wrap)

    override fun subnets(): List<SubnetSelection> =
        unwrap(this).getSubnets()?.map(SubnetSelection::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayVpcEndpointOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions):
        GatewayVpcEndpointOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayVpcEndpointOptions):
        software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions
  }
}
