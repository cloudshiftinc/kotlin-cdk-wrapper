@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.globalaccelerator.IEndpoint
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer as CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer as AmazonAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer

/**
 * Use a Network Load Balancer as a Global Accelerator Endpoint.
 *
 * Example:
 *
 * ```
 * // Create an Accelerator
 * Accelerator accelerator = new Accelerator(this, "Accelerator");
 * // Create a Listener
 * Listener listener = accelerator.addListener("Listener", ListenerOptions.builder()
 * .portRanges(List.of(PortRange.builder().fromPort(80).build(),
 * PortRange.builder().fromPort(443).build()))
 * .build());
 * // Import the Load Balancers
 * INetworkLoadBalancer nlb1 = NetworkLoadBalancer.fromNetworkLoadBalancerAttributes(this, "NLB1",
 * NetworkLoadBalancerAttributes.builder()
 * .loadBalancerArn("arn:aws:elasticloadbalancing:us-west-2:111111111111:loadbalancer/app/my-load-balancer1/e16bef66805b")
 * .build());
 * INetworkLoadBalancer nlb2 = NetworkLoadBalancer.fromNetworkLoadBalancerAttributes(this, "NLB2",
 * NetworkLoadBalancerAttributes.builder()
 * .loadBalancerArn("arn:aws:elasticloadbalancing:ap-south-1:111111111111:loadbalancer/app/my-load-balancer2/5513dc2ea8a1")
 * .build());
 * // Add one EndpointGroup for each Region we are targeting
 * listener.addEndpointGroup("Group1", EndpointGroupOptions.builder()
 * .endpoints(List.of(new NetworkLoadBalancerEndpoint(nlb1)))
 * .build());
 * listener.addEndpointGroup("Group2", EndpointGroupOptions.builder()
 * // Imported load balancers automatically calculate their Region from the ARN.
 * // If you are load balancing to other resources, you must also pass a `region`
 * // parameter here.
 * .endpoints(List.of(new NetworkLoadBalancerEndpoint(nlb2)))
 * .build());
 * ```
 */
public open class NetworkLoadBalancerEndpoint internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint,
) : CdkObject(cdkObject), IEndpoint {
  public
      constructor(loadBalancer: CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer)
      :
      this(software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint(loadBalancer.let(CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer::unwrap))
  )

  public
      constructor(loadBalancer: CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer,
      options: NetworkLoadBalancerEndpointProps) :
      this(software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint(loadBalancer.let(CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer::unwrap),
      options.let(NetworkLoadBalancerEndpointProps::unwrap))
  )

  public
      constructor(loadBalancer: CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer,
      options: NetworkLoadBalancerEndpointProps.Builder.() -> Unit) : this(loadBalancer,
      NetworkLoadBalancerEndpointProps(options)
  )

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
