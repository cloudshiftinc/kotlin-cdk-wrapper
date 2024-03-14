package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpcEndpoint
import kotlin.Unit
import kotlin.collections.List

public interface EndpointConfiguration {
  /**
   * A list of endpoint types of an API or its custom domain name.
   *
   * Default: EndpointType.EDGE
   */
  public fun types(): List<EndpointType>

  /**
   * A list of VPC Endpoints against which to create Route53 ALIASes.
   *
   * Default: - no ALIASes are created for the endpoint.
   */
  public fun vpcEndpoints(): List<IVpcEndpoint> =
      unwrap(this).getVpcEndpoints()?.map(IVpcEndpoint::wrap) ?: emptyList()

  /**
   * A builder for [EndpointConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param types A list of endpoint types of an API or its custom domain name. 
     */
    public fun types(types: List<EndpointType>)

    /**
     * @param types A list of endpoint types of an API or its custom domain name. 
     */
    public fun types(vararg types: EndpointType)

    /**
     * @param vpcEndpoints A list of VPC Endpoints against which to create Route53 ALIASes.
     */
    public fun vpcEndpoints(vpcEndpoints: List<IVpcEndpoint>)

    /**
     * @param vpcEndpoints A list of VPC Endpoints against which to create Route53 ALIASes.
     */
    public fun vpcEndpoints(vararg vpcEndpoints: IVpcEndpoint)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.EndpointConfiguration.Builder
        = software.amazon.awscdk.services.apigateway.EndpointConfiguration.builder()

    /**
     * @param types A list of endpoint types of an API or its custom domain name. 
     */
    override fun types(types: List<EndpointType>) {
      cdkBuilder.types(types.map(EndpointType::unwrap))
    }

    /**
     * @param types A list of endpoint types of an API or its custom domain name. 
     */
    override fun types(vararg types: EndpointType): Unit = types(types.toList())

    /**
     * @param vpcEndpoints A list of VPC Endpoints against which to create Route53 ALIASes.
     */
    override fun vpcEndpoints(vpcEndpoints: List<IVpcEndpoint>) {
      cdkBuilder.vpcEndpoints(vpcEndpoints.map(IVpcEndpoint::unwrap))
    }

    /**
     * @param vpcEndpoints A list of VPC Endpoints against which to create Route53 ALIASes.
     */
    override fun vpcEndpoints(vararg vpcEndpoints: IVpcEndpoint): Unit =
        vpcEndpoints(vpcEndpoints.toList())

    public fun build(): software.amazon.awscdk.services.apigateway.EndpointConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.EndpointConfiguration,
  ) : CdkObject(cdkObject), EndpointConfiguration {
    /**
     * A list of endpoint types of an API or its custom domain name.
     *
     * Default: EndpointType.EDGE
     */
    override fun types(): List<EndpointType> = unwrap(this).getTypes().map(EndpointType::wrap)

    /**
     * A list of VPC Endpoints against which to create Route53 ALIASes.
     *
     * Default: - no ALIASes are created for the endpoint.
     */
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
