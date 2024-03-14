package io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.globalaccelerator.IEndpoint
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer as CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer as AmazonAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer

public open class NetworkLoadBalancerEndpoint internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint,
) : CdkObject(cdkObject), IEndpoint {
  /**
   * The region where the endpoint is located.
   *
   * If the region cannot be determined, `undefined` is returned
   */
  public override fun region(): String? = unwrap(this).getRegion()

  /**
   * Render the endpoint to an endpoint configuration.
   */
  public override fun renderEndpointConfiguration(): Any =
      unwrap(this).renderEndpointConfiguration()

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Endpoint weight across all endpoints in the group.
     *
     * Must be a value between 0 and 255.
     *
     * Default: 128
     *
     * @param weight Endpoint weight across all endpoints in the group. 
     */
    public fun weight(weight: Number)
  }

  private class BuilderImpl(
    loadBalancer: AmazonAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint.Builder
        =
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint.Builder.create(loadBalancer)

    /**
     * Endpoint weight across all endpoints in the group.
     *
     * Must be a value between 0 and 255.
     *
     * Default: 128
     *
     * @param weight Endpoint weight across all endpoints in the group. 
     */
    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build():
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public operator
        fun invoke(loadBalancer: CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer,
        block: Builder.() -> Unit = {}): NetworkLoadBalancerEndpoint {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer.unwrap(loadBalancer))
      return NetworkLoadBalancerEndpoint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint):
        NetworkLoadBalancerEndpoint = NetworkLoadBalancerEndpoint(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancerEndpoint):
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint =
        wrapped.cdkObject
  }
}
