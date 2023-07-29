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

package cloudshift.awscdk.dsl.services.globalaccelerator.endpoints

import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEIP
import software.amazon.awscdk.services.ec2.IInstance
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint
import software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpointOptions
import software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint
import software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpointProps
import software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint
import software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpointProps
import software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint
import software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps

public object endpoints {
    /**
     * Use an Application Load Balancer as a Global Accelerator Endpoint.
     *
     * Example:
     * ```
     * ApplicationLoadBalancer alb;
     * Listener listener;
     * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
     * .endpoints(List.of(
     * ApplicationLoadBalancerEndpoint.Builder.create(alb)
     * .weight(128)
     * .preserveClientIp(true)
     * .build()))
     * .build());
     * ```
     */
    public inline fun applicationLoadBalancerEndpoint(
        loadBalancer: IApplicationLoadBalancer,
        block: ApplicationLoadBalancerEndpointDsl.() -> Unit = {}
    ): ApplicationLoadBalancerEndpoint {
        val builder = ApplicationLoadBalancerEndpointDsl(loadBalancer)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a ApplicationLoadBalancerEndpoint.
     *
     * Example:
     * ```
     * ApplicationLoadBalancer alb;
     * Listener listener;
     * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
     * .endpoints(List.of(
     * ApplicationLoadBalancerEndpoint.Builder.create(alb)
     * .weight(128)
     * .preserveClientIp(true)
     * .build()))
     * .build());
     * ```
     */
    public inline fun applicationLoadBalancerEndpointOptions(
        block: ApplicationLoadBalancerEndpointOptionsDsl.() -> Unit = {}
    ): ApplicationLoadBalancerEndpointOptions {
        val builder = ApplicationLoadBalancerEndpointOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use an EC2 Instance as a Global Accelerator Endpoint.
     *
     * Example:
     * ```
     * Listener listener;
     * CfnEIP eip;
     * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
     * .endpoints(List.of(
     * CfnEipEndpoint.Builder.create(eip)
     * .weight(128)
     * .build()))
     * .build());
     * ```
     */
    public inline fun cfnEipEndpoint(
        eip: CfnEIP,
        block: CfnEipEndpointDsl.() -> Unit = {}
    ): CfnEipEndpoint {
        val builder = CfnEipEndpointDsl(eip)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a NetworkLoadBalancerEndpoint.
     *
     * Example:
     * ```
     * Listener listener;
     * CfnEIP eip;
     * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
     * .endpoints(List.of(
     * CfnEipEndpoint.Builder.create(eip)
     * .weight(128)
     * .build()))
     * .build());
     * ```
     */
    public inline fun cfnEipEndpointProps(
        block: CfnEipEndpointPropsDsl.() -> Unit = {}
    ): CfnEipEndpointProps {
        val builder = CfnEipEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use an EC2 Instance as a Global Accelerator Endpoint.
     *
     * Example:
     * ```
     * Listener listener;
     * Instance instance;
     * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
     * .endpoints(List.of(
     * InstanceEndpoint.Builder.create(instance)
     * .weight(128)
     * .preserveClientIp(true)
     * .build()))
     * .build());
     * ```
     */
    public inline fun instanceEndpoint(
        instance: IInstance,
        block: InstanceEndpointDsl.() -> Unit = {}
    ): InstanceEndpoint {
        val builder = InstanceEndpointDsl(instance)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a NetworkLoadBalancerEndpoint.
     *
     * Example:
     * ```
     * Listener listener;
     * Instance instance;
     * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
     * .endpoints(List.of(
     * InstanceEndpoint.Builder.create(instance)
     * .weight(128)
     * .preserveClientIp(true)
     * .build()))
     * .build());
     * ```
     */
    public inline fun instanceEndpointProps(
        block: InstanceEndpointPropsDsl.() -> Unit = {}
    ): InstanceEndpointProps {
        val builder = InstanceEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun networkLoadBalancerEndpoint(
        loadBalancer: INetworkLoadBalancer,
        block: NetworkLoadBalancerEndpointDsl.() -> Unit = {}
    ): NetworkLoadBalancerEndpoint {
        val builder = NetworkLoadBalancerEndpointDsl(loadBalancer)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a NetworkLoadBalancerEndpoint.
     *
     * Example:
     * ```
     * NetworkLoadBalancer nlb;
     * Listener listener;
     * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
     * .endpoints(List.of(
     * NetworkLoadBalancerEndpoint.Builder.create(nlb)
     * .weight(128)
     * .build()))
     * .build());
     * ```
     */
    public inline fun networkLoadBalancerEndpointProps(
        block: NetworkLoadBalancerEndpointPropsDsl.() -> Unit = {}
    ): NetworkLoadBalancerEndpointProps {
        val builder = NetworkLoadBalancerEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
