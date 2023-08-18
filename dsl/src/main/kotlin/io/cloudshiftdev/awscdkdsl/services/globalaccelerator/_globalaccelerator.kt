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

package io.cloudshiftdev.awscdkdsl.services.globalaccelerator

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.Accelerator
import software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes
import software.amazon.awscdk.services.globalaccelerator.AcceleratorProps
import software.amazon.awscdk.services.globalaccelerator.CfnAccelerator
import software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps
import software.amazon.awscdk.services.globalaccelerator.CfnListener
import software.amazon.awscdk.services.globalaccelerator.CfnListenerProps
import software.amazon.awscdk.services.globalaccelerator.EndpointGroup
import software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions
import software.amazon.awscdk.services.globalaccelerator.EndpointGroupProps
import software.amazon.awscdk.services.globalaccelerator.Listener
import software.amazon.awscdk.services.globalaccelerator.ListenerOptions
import software.amazon.awscdk.services.globalaccelerator.ListenerProps
import software.amazon.awscdk.services.globalaccelerator.PortOverride
import software.amazon.awscdk.services.globalaccelerator.PortRange
import software.amazon.awscdk.services.globalaccelerator.RawEndpoint
import software.amazon.awscdk.services.globalaccelerator.RawEndpointProps
import software.constructs.Construct

public object globalaccelerator {
    /**
     * The Accelerator construct.
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
    public inline fun accelerator(
        scope: Construct,
        id: String,
        block: AcceleratorDsl.() -> Unit = {},
    ): Accelerator {
        val builder = AcceleratorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes required to import an existing accelerator to the stack.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * AcceleratorAttributes acceleratorAttributes = AcceleratorAttributes.builder()
     * .acceleratorArn("acceleratorArn")
     * .dnsName("dnsName")
     * .build();
     * ```
     */
    public inline fun acceleratorAttributes(
        block: AcceleratorAttributesDsl.() -> Unit = {}
    ): AcceleratorAttributes {
        val builder = AcceleratorAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construct properties of the Accelerator.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * AcceleratorProps acceleratorProps = AcceleratorProps.builder()
     * .acceleratorName("acceleratorName")
     * .enabled(false)
     * .build();
     * ```
     */
    public inline fun acceleratorProps(
        block: AcceleratorPropsDsl.() -> Unit = {}
    ): AcceleratorProps {
        val builder = AcceleratorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::GlobalAccelerator::Accelerator` resource is a Global Accelerator resource type that
     * contains information about how you create an accelerator.
     *
     * An accelerator includes one or more listeners that process inbound connections and direct
     * traffic to one or more endpoint groups, each of which includes endpoints, such as Application
     * Load Balancers, Network Load Balancers, and Amazon EC2 instances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * CfnAccelerator cfnAccelerator = CfnAccelerator.Builder.create(this, "MyCfnAccelerator")
     * .name("name")
     * // the properties below are optional
     * .enabled(false)
     * .ipAddresses(List.of("ipAddresses"))
     * .ipAddressType("ipAddressType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html)
     */
    public inline fun cfnAccelerator(
        scope: Construct,
        id: String,
        block: CfnAcceleratorDsl.() -> Unit = {},
    ): CfnAccelerator {
        val builder = CfnAcceleratorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAccelerator`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * CfnAcceleratorProps cfnAcceleratorProps = CfnAcceleratorProps.builder()
     * .name("name")
     * // the properties below are optional
     * .enabled(false)
     * .ipAddresses(List.of("ipAddresses"))
     * .ipAddressType("ipAddressType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html)
     */
    public inline fun cfnAcceleratorProps(
        block: CfnAcceleratorPropsDsl.() -> Unit = {}
    ): CfnAcceleratorProps {
        val builder = CfnAcceleratorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::GlobalAccelerator::EndpointGroup` resource is a Global Accelerator resource type
     * that contains information about how you create an endpoint group for the specified listener.
     *
     * An endpoint group is a collection of endpoints in one AWS Region .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * CfnEndpointGroup cfnEndpointGroup = CfnEndpointGroup.Builder.create(this, "MyCfnEndpointGroup")
     * .endpointGroupRegion("endpointGroupRegion")
     * .listenerArn("listenerArn")
     * // the properties below are optional
     * .endpointConfigurations(List.of(EndpointConfigurationProperty.builder()
     * .endpointId("endpointId")
     * // the properties below are optional
     * .clientIpPreservationEnabled(false)
     * .weight(123)
     * .build()))
     * .healthCheckIntervalSeconds(123)
     * .healthCheckPath("healthCheckPath")
     * .healthCheckPort(123)
     * .healthCheckProtocol("healthCheckProtocol")
     * .portOverrides(List.of(PortOverrideProperty.builder()
     * .endpointPort(123)
     * .listenerPort(123)
     * .build()))
     * .thresholdCount(123)
     * .trafficDialPercentage(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html)
     */
    public inline fun cfnEndpointGroup(
        scope: Construct,
        id: String,
        block: CfnEndpointGroupDsl.() -> Unit = {},
    ): CfnEndpointGroup {
        val builder = CfnEndpointGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type for endpoints.
     *
     * A resource must be valid and active when you add it as an endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * EndpointConfigurationProperty endpointConfigurationProperty =
     * EndpointConfigurationProperty.builder()
     * .endpointId("endpointId")
     * // the properties below are optional
     * .clientIpPreservationEnabled(false)
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html)
     */
    public inline fun cfnEndpointGroupEndpointConfigurationProperty(
        block: CfnEndpointGroupEndpointConfigurationPropertyDsl.() -> Unit = {}
    ): CfnEndpointGroup.EndpointConfigurationProperty {
        val builder = CfnEndpointGroupEndpointConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Override specific listener ports used to route traffic to endpoints that are part of an
     * endpoint group.
     *
     * For example, you can create a port override in which the listener receives user traffic on
     * ports 80 and 443, but your accelerator routes that traffic to ports 1080 and 1443,
     * respectively, on the endpoints.
     *
     * For more information, see
     * [Port overrides](https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoint-groups-port-override.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * PortOverrideProperty portOverrideProperty = PortOverrideProperty.builder()
     * .endpointPort(123)
     * .listenerPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-portoverride.html)
     */
    public inline fun cfnEndpointGroupPortOverrideProperty(
        block: CfnEndpointGroupPortOverridePropertyDsl.() -> Unit = {}
    ): CfnEndpointGroup.PortOverrideProperty {
        val builder = CfnEndpointGroupPortOverridePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEndpointGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * CfnEndpointGroupProps cfnEndpointGroupProps = CfnEndpointGroupProps.builder()
     * .endpointGroupRegion("endpointGroupRegion")
     * .listenerArn("listenerArn")
     * // the properties below are optional
     * .endpointConfigurations(List.of(EndpointConfigurationProperty.builder()
     * .endpointId("endpointId")
     * // the properties below are optional
     * .clientIpPreservationEnabled(false)
     * .weight(123)
     * .build()))
     * .healthCheckIntervalSeconds(123)
     * .healthCheckPath("healthCheckPath")
     * .healthCheckPort(123)
     * .healthCheckProtocol("healthCheckProtocol")
     * .portOverrides(List.of(PortOverrideProperty.builder()
     * .endpointPort(123)
     * .listenerPort(123)
     * .build()))
     * .thresholdCount(123)
     * .trafficDialPercentage(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html)
     */
    public inline fun cfnEndpointGroupProps(
        block: CfnEndpointGroupPropsDsl.() -> Unit = {}
    ): CfnEndpointGroupProps {
        val builder = CfnEndpointGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::GlobalAccelerator::Listener` resource is a Global Accelerator resource type that
     * contains information about how you create a listener to process inbound connections from
     * clients to an accelerator.
     *
     * Connections arrive to assigned static IP addresses on a port, port range, or list of port
     * ranges that you specify.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * CfnListener cfnListener = CfnListener.Builder.create(this, "MyCfnListener")
     * .acceleratorArn("acceleratorArn")
     * .portRanges(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .protocol("protocol")
     * // the properties below are optional
     * .clientAffinity("clientAffinity")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html)
     */
    public inline fun cfnListener(
        scope: Construct,
        id: String,
        block: CfnListenerDsl.() -> Unit = {},
    ): CfnListener {
        val builder = CfnListenerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type for a range of ports for a listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * PortRangeProperty portRangeProperty = PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-listener-portrange.html)
     */
    public inline fun cfnListenerPortRangeProperty(
        block: CfnListenerPortRangePropertyDsl.() -> Unit = {}
    ): CfnListener.PortRangeProperty {
        val builder = CfnListenerPortRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnListener`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * CfnListenerProps cfnListenerProps = CfnListenerProps.builder()
     * .acceleratorArn("acceleratorArn")
     * .portRanges(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .protocol("protocol")
     * // the properties below are optional
     * .clientAffinity("clientAffinity")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html)
     */
    public inline fun cfnListenerProps(
        block: CfnListenerPropsDsl.() -> Unit = {}
    ): CfnListenerProps {
        val builder = CfnListenerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * EndpointGroup construct.
     *
     * Example:
     * ```
     * Listener listener;
     * // Non-open ALB
     * ApplicationLoadBalancer alb;
     * // Remember that there is only one AGA security group per VPC.
     * Vpc vpc;
     * EndpointGroup endpointGroup = listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
     * .endpoints(List.of(
     * ApplicationLoadBalancerEndpoint.Builder.create(alb)
     * .preserveClientIp(true)
     * .build()))
     * .build());
     * IPeer agaSg = endpointGroup.connectionsPeer("GlobalAcceleratorSG", vpc);
     * // Allow connections from the AGA to the ALB
     * alb.connections.allowFrom(agaSg, Port.tcp(443));
     * ```
     */
    public inline fun endpointGroup(
        scope: Construct,
        id: String,
        block: EndpointGroupDsl.() -> Unit = {},
    ): EndpointGroup {
        val builder = EndpointGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Basic options for creating a new EndpointGroup.
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
    public inline fun endpointGroupOptions(
        block: EndpointGroupOptionsDsl.() -> Unit = {}
    ): EndpointGroupOptions {
        val builder = EndpointGroupOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Property of the EndpointGroup.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * IEndpoint endpoint;
     * Listener listener;
     * EndpointGroupProps endpointGroupProps = EndpointGroupProps.builder()
     * .listener(listener)
     * // the properties below are optional
     * .endpointGroupName("endpointGroupName")
     * .endpoints(List.of(endpoint))
     * .healthCheckInterval(Duration.minutes(30))
     * .healthCheckPath("healthCheckPath")
     * .healthCheckPort(123)
     * .healthCheckProtocol(HealthCheckProtocol.TCP)
     * .healthCheckThreshold(123)
     * .portOverrides(List.of(PortOverride.builder()
     * .endpointPort(123)
     * .listenerPort(123)
     * .build()))
     * .region("region")
     * .trafficDialPercentage(123)
     * .build();
     * ```
     */
    public inline fun endpointGroupProps(
        block: EndpointGroupPropsDsl.() -> Unit = {}
    ): EndpointGroupProps {
        val builder = EndpointGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The construct for the Listener.
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
    public inline fun listener(
        scope: Construct,
        id: String,
        block: ListenerDsl.() -> Unit = {},
    ): Listener {
        val builder = ListenerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construct options for Listener.
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
    public inline fun listenerOptions(block: ListenerOptionsDsl.() -> Unit = {}): ListenerOptions {
        val builder = ListenerOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construct properties for Listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * Accelerator accelerator;
     * ListenerProps listenerProps = ListenerProps.builder()
     * .accelerator(accelerator)
     * .portRanges(List.of(PortRange.builder()
     * .fromPort(123)
     * // the properties below are optional
     * .toPort(123)
     * .build()))
     * // the properties below are optional
     * .clientAffinity(ClientAffinity.NONE)
     * .listenerName("listenerName")
     * .protocol(ConnectionProtocol.TCP)
     * .build();
     * ```
     */
    public inline fun listenerProps(block: ListenerPropsDsl.() -> Unit = {}): ListenerProps {
        val builder = ListenerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Override specific listener ports used to route traffic to endpoints that are part of an
     * endpoint group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * PortOverride portOverride = PortOverride.builder()
     * .endpointPort(123)
     * .listenerPort(123)
     * .build();
     * ```
     */
    public inline fun portOverride(block: PortOverrideDsl.() -> Unit = {}): PortOverride {
        val builder = PortOverrideDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The list of port ranges for the connections from clients to the accelerator.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * PortRange portRange = PortRange.builder()
     * .fromPort(123)
     * // the properties below are optional
     * .toPort(123)
     * .build();
     * ```
     */
    public inline fun portRange(block: PortRangeDsl.() -> Unit = {}): PortRange {
        val builder = PortRangeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Untyped endpoint implementation.
     *
     * Prefer using the classes in the `aws-globalaccelerator-endpoints` package instead, as they
     * accept typed constructs. You can use this class if you want to use an endpoint type that does
     * not have an appropriate class in that package yet.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * RawEndpoint rawEndpoint = RawEndpoint.Builder.create()
     * .endpointId("endpointId")
     * // the properties below are optional
     * .preserveClientIp(false)
     * .region("region")
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun rawEndpoint(block: RawEndpointDsl.() -> Unit = {}): RawEndpoint {
        val builder = RawEndpointDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for RawEndpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.globalaccelerator.*;
     * RawEndpointProps rawEndpointProps = RawEndpointProps.builder()
     * .endpointId("endpointId")
     * // the properties below are optional
     * .preserveClientIp(false)
     * .region("region")
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun rawEndpointProps(
        block: RawEndpointPropsDsl.() -> Unit = {}
    ): RawEndpointProps {
        val builder = RawEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
