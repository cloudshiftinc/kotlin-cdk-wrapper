@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.globalaccelerator.endpoints

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint

/**
 * Use a Network Load Balancer as a Global Accelerator Endpoint.
 *
 * Example:
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
@CdkDslMarker
public class NetworkLoadBalancerEndpointDsl(
    loadBalancer: INetworkLoadBalancer,
) {
    private val cdkBuilder: NetworkLoadBalancerEndpoint.Builder =
        NetworkLoadBalancerEndpoint.Builder.create(loadBalancer)

    /**
     * Endpoint weight across all endpoints in the group.
     *
     * Must be a value between 0 and 255.
     *
     * Default: 128
     *
     * @param weight Endpoint weight across all endpoints in the group.
     */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): NetworkLoadBalancerEndpoint = cdkBuilder.build()
}
