@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpcEndpoint
import kotlin.Unit
import kotlin.collections.List

public interface EndpointConfiguration {
  public fun types(): List<EndpointType>

  public fun vpcEndpoints(): List<IVpcEndpoint> =
      unwrap(this).getVpcEndpoints()?.map(IVpcEndpoint::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun types(types: List<EndpointType>)

    public fun types(vararg types: EndpointType)

    public fun vpcEndpoints(vpcEndpoints: List<IVpcEndpoint>)

    public fun vpcEndpoints(vararg vpcEndpoints: IVpcEndpoint)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.EndpointConfiguration.Builder
        = software.amazon.awscdk.services.apigateway.EndpointConfiguration.builder()

    override fun types(types: List<EndpointType>) {
      cdkBuilder.types(types.map(EndpointType::unwrap))
    }

    override fun types(vararg types: EndpointType): Unit = types(types.toList())

    override fun vpcEndpoints(vpcEndpoints: List<IVpcEndpoint>) {
      cdkBuilder.vpcEndpoints(vpcEndpoints.map(IVpcEndpoint::unwrap))
    }

    override fun vpcEndpoints(vararg vpcEndpoints: IVpcEndpoint): Unit =
        vpcEndpoints(vpcEndpoints.toList())

    public fun build(): software.amazon.awscdk.services.apigateway.EndpointConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.EndpointConfiguration,
  ) : CdkObject(cdkObject), EndpointConfiguration {
    override fun types(): List<EndpointType> = unwrap(this).getTypes().map(EndpointType::wrap)

    override fun vpcEndpoints(): List<IVpcEndpoint> =
        unwrap(this).getVpcEndpoints()?.map(IVpcEndpoint::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EndpointConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.EndpointConfiguration):
        EndpointConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EndpointConfiguration):
        software.amazon.awscdk.services.apigateway.EndpointConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.EndpointConfiguration
  }
}
