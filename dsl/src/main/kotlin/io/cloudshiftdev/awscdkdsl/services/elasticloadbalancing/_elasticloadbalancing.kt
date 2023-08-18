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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancing

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancing.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps
import software.constructs.Construct

public object elasticloadbalancing {
    /**
     * Specifies a Classic Load Balancer.
     *
     * You can specify the `AvailabilityZones` or `Subnets` property, but not both.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the
     * [DependsOn attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancing.*;
     * Object attributes;
     * CfnLoadBalancer cfnLoadBalancer = CfnLoadBalancer.Builder.create(this, "MyCfnLoadBalancer")
     * .listeners(List.of(ListenersProperty.builder()
     * .instancePort("instancePort")
     * .loadBalancerPort("loadBalancerPort")
     * .protocol("protocol")
     * // the properties below are optional
     * .instanceProtocol("instanceProtocol")
     * .policyNames(List.of("policyNames"))
     * .sslCertificateId("sslCertificateId")
     * .build()))
     * // the properties below are optional
     * .accessLoggingPolicy(AccessLoggingPolicyProperty.builder()
     * .enabled(false)
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .emitInterval(123)
     * .s3BucketPrefix("s3BucketPrefix")
     * .build())
     * .appCookieStickinessPolicy(List.of(AppCookieStickinessPolicyProperty.builder()
     * .cookieName("cookieName")
     * .policyName("policyName")
     * .build()))
     * .availabilityZones(List.of("availabilityZones"))
     * .connectionDrainingPolicy(ConnectionDrainingPolicyProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .timeout(123)
     * .build())
     * .connectionSettings(ConnectionSettingsProperty.builder()
     * .idleTimeout(123)
     * .build())
     * .crossZone(false)
     * .healthCheck(HealthCheckProperty.builder()
     * .healthyThreshold("healthyThreshold")
     * .interval("interval")
     * .target("target")
     * .timeout("timeout")
     * .unhealthyThreshold("unhealthyThreshold")
     * .build())
     * .instances(List.of("instances"))
     * .lbCookieStickinessPolicy(List.of(LBCookieStickinessPolicyProperty.builder()
     * .cookieExpirationPeriod("cookieExpirationPeriod")
     * .policyName("policyName")
     * .build()))
     * .loadBalancerName("loadBalancerName")
     * .policies(List.of(PoliciesProperty.builder()
     * .attributes(List.of(attributes))
     * .policyName("policyName")
     * .policyType("policyType")
     * // the properties below are optional
     * .instancePorts(List.of("instancePorts"))
     * .loadBalancerPorts(List.of("loadBalancerPorts"))
     * .build()))
     * .scheme("scheme")
     * .securityGroups(List.of("securityGroups"))
     * .subnets(List.of("subnets"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html)
     */
    public inline fun cfnLoadBalancer(
        scope: Construct,
        id: String,
        block: CfnLoadBalancerDsl.() -> Unit = {},
    ): CfnLoadBalancer {
        val builder = CfnLoadBalancerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies where and how access logs are stored for your Classic Load Balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancing.*;
     * AccessLoggingPolicyProperty accessLoggingPolicyProperty = AccessLoggingPolicyProperty.builder()
     * .enabled(false)
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .emitInterval(123)
     * .s3BucketPrefix("s3BucketPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-accessloggingpolicy.html)
     */
    public inline fun cfnLoadBalancerAccessLoggingPolicyProperty(
        block: CfnLoadBalancerAccessLoggingPolicyPropertyDsl.() -> Unit = {}
    ): CfnLoadBalancer.AccessLoggingPolicyProperty {
        val builder = CfnLoadBalancerAccessLoggingPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a policy for application-controlled session stickiness for your Classic Load
     * Balancer.
     *
     * To associate a policy with a listener, use the
     * [PolicyNames](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-policynames)
     * property for the listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancing.*;
     * AppCookieStickinessPolicyProperty appCookieStickinessPolicyProperty =
     * AppCookieStickinessPolicyProperty.builder()
     * .cookieName("cookieName")
     * .policyName("policyName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy.html)
     */
    public inline fun cfnLoadBalancerAppCookieStickinessPolicyProperty(
        block: CfnLoadBalancerAppCookieStickinessPolicyPropertyDsl.() -> Unit = {}
    ): CfnLoadBalancer.AppCookieStickinessPolicyProperty {
        val builder = CfnLoadBalancerAppCookieStickinessPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the connection draining settings for your Classic Load Balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancing.*;
     * ConnectionDrainingPolicyProperty connectionDrainingPolicyProperty =
     * ConnectionDrainingPolicyProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .timeout(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-connectiondrainingpolicy.html)
     */
    public inline fun cfnLoadBalancerConnectionDrainingPolicyProperty(
        block: CfnLoadBalancerConnectionDrainingPolicyPropertyDsl.() -> Unit = {}
    ): CfnLoadBalancer.ConnectionDrainingPolicyProperty {
        val builder = CfnLoadBalancerConnectionDrainingPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the idle timeout value for your Classic Load Balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancing.*;
     * ConnectionSettingsProperty connectionSettingsProperty = ConnectionSettingsProperty.builder()
     * .idleTimeout(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-connectionsettings.html)
     */
    public inline fun cfnLoadBalancerConnectionSettingsProperty(
        block: CfnLoadBalancerConnectionSettingsPropertyDsl.() -> Unit = {}
    ): CfnLoadBalancer.ConnectionSettingsProperty {
        val builder = CfnLoadBalancerConnectionSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies health check settings for your Classic Load Balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancing.*;
     * HealthCheckProperty healthCheckProperty = HealthCheckProperty.builder()
     * .healthyThreshold("healthyThreshold")
     * .interval("interval")
     * .target("target")
     * .timeout("timeout")
     * .unhealthyThreshold("unhealthyThreshold")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-healthcheck.html)
     */
    public inline fun cfnLoadBalancerHealthCheckProperty(
        block: CfnLoadBalancerHealthCheckPropertyDsl.() -> Unit = {}
    ): CfnLoadBalancer.HealthCheckProperty {
        val builder = CfnLoadBalancerHealthCheckPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a policy for duration-based session stickiness for your Classic Load Balancer.
     *
     * To associate a policy with a listener, use the
     * [PolicyNames](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-policynames)
     * property for the listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancing.*;
     * LBCookieStickinessPolicyProperty lBCookieStickinessPolicyProperty =
     * LBCookieStickinessPolicyProperty.builder()
     * .cookieExpirationPeriod("cookieExpirationPeriod")
     * .policyName("policyName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy.html)
     */
    public inline fun cfnLoadBalancerLBCookieStickinessPolicyProperty(
        block: CfnLoadBalancerLBCookieStickinessPolicyPropertyDsl.() -> Unit = {}
    ): CfnLoadBalancer.LBCookieStickinessPolicyProperty {
        val builder = CfnLoadBalancerLBCookieStickinessPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a listener for your Classic Load Balancer.
     *
     * Modifying any property replaces the listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancing.*;
     * ListenersProperty listenersProperty = ListenersProperty.builder()
     * .instancePort("instancePort")
     * .loadBalancerPort("loadBalancerPort")
     * .protocol("protocol")
     * // the properties below are optional
     * .instanceProtocol("instanceProtocol")
     * .policyNames(List.of("policyNames"))
     * .sslCertificateId("sslCertificateId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-listeners.html)
     */
    public inline fun cfnLoadBalancerListenersProperty(
        block: CfnLoadBalancerListenersPropertyDsl.() -> Unit = {}
    ): CfnLoadBalancer.ListenersProperty {
        val builder = CfnLoadBalancerListenersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies policies for your Classic Load Balancer.
     *
     * To associate policies with a listener, use the
     * [PolicyNames](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-policynames)
     * property for the listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancing.*;
     * Object attributes;
     * PoliciesProperty policiesProperty = PoliciesProperty.builder()
     * .attributes(List.of(attributes))
     * .policyName("policyName")
     * .policyType("policyType")
     * // the properties below are optional
     * .instancePorts(List.of("instancePorts"))
     * .loadBalancerPorts(List.of("loadBalancerPorts"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-policies.html)
     */
    public inline fun cfnLoadBalancerPoliciesProperty(
        block: CfnLoadBalancerPoliciesPropertyDsl.() -> Unit = {}
    ): CfnLoadBalancer.PoliciesProperty {
        val builder = CfnLoadBalancerPoliciesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLoadBalancer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancing.*;
     * Object attributes;
     * CfnLoadBalancerProps cfnLoadBalancerProps = CfnLoadBalancerProps.builder()
     * .listeners(List.of(ListenersProperty.builder()
     * .instancePort("instancePort")
     * .loadBalancerPort("loadBalancerPort")
     * .protocol("protocol")
     * // the properties below are optional
     * .instanceProtocol("instanceProtocol")
     * .policyNames(List.of("policyNames"))
     * .sslCertificateId("sslCertificateId")
     * .build()))
     * // the properties below are optional
     * .accessLoggingPolicy(AccessLoggingPolicyProperty.builder()
     * .enabled(false)
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .emitInterval(123)
     * .s3BucketPrefix("s3BucketPrefix")
     * .build())
     * .appCookieStickinessPolicy(List.of(AppCookieStickinessPolicyProperty.builder()
     * .cookieName("cookieName")
     * .policyName("policyName")
     * .build()))
     * .availabilityZones(List.of("availabilityZones"))
     * .connectionDrainingPolicy(ConnectionDrainingPolicyProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .timeout(123)
     * .build())
     * .connectionSettings(ConnectionSettingsProperty.builder()
     * .idleTimeout(123)
     * .build())
     * .crossZone(false)
     * .healthCheck(HealthCheckProperty.builder()
     * .healthyThreshold("healthyThreshold")
     * .interval("interval")
     * .target("target")
     * .timeout("timeout")
     * .unhealthyThreshold("unhealthyThreshold")
     * .build())
     * .instances(List.of("instances"))
     * .lbCookieStickinessPolicy(List.of(LBCookieStickinessPolicyProperty.builder()
     * .cookieExpirationPeriod("cookieExpirationPeriod")
     * .policyName("policyName")
     * .build()))
     * .loadBalancerName("loadBalancerName")
     * .policies(List.of(PoliciesProperty.builder()
     * .attributes(List.of(attributes))
     * .policyName("policyName")
     * .policyType("policyType")
     * // the properties below are optional
     * .instancePorts(List.of("instancePorts"))
     * .loadBalancerPorts(List.of("loadBalancerPorts"))
     * .build()))
     * .scheme("scheme")
     * .securityGroups(List.of("securityGroups"))
     * .subnets(List.of("subnets"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html)
     */
    public inline fun cfnLoadBalancerProps(
        block: CfnLoadBalancerPropsDsl.() -> Unit = {}
    ): CfnLoadBalancerProps {
        val builder = CfnLoadBalancerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describe the health check to a load balancer.
     *
     * Example:
     * ```
     * IVpc vpc;
     * AutoScalingGroup myAutoScalingGroup;
     * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB")
     * .vpc(vpc)
     * .internetFacing(true)
     * .healthCheck(HealthCheck.builder()
     * .port(80)
     * .build())
     * .build();
     * lb.addTarget(myAutoScalingGroup);
     * lb.addListener(LoadBalancerListener.builder()
     * .externalPort(80)
     * .build());
     * ```
     */
    public inline fun healthCheck(block: HealthCheckDsl.() -> Unit = {}): HealthCheck {
        val builder = HealthCheckDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A load balancer with a single listener.
     *
     * Routes to a fleet of of instances in a VPC.
     *
     * Example:
     * ```
     * IVpc vpc;
     * AutoScalingGroup myAutoScalingGroup;
     * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB")
     * .vpc(vpc)
     * .internetFacing(true)
     * .healthCheck(HealthCheck.builder()
     * .port(80)
     * .build())
     * .build();
     * lb.addTarget(myAutoScalingGroup);
     * lb.addListener(LoadBalancerListener.builder()
     * .externalPort(80)
     * .build());
     * ```
     */
    public inline fun loadBalancer(
        scope: Construct,
        id: String,
        block: LoadBalancerDsl.() -> Unit = {},
    ): LoadBalancer {
        val builder = LoadBalancerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Add a backend to the load balancer.
     *
     * Example:
     * ```
     * IVpc vpc;
     * AutoScalingGroup myAutoScalingGroup;
     * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB")
     * .vpc(vpc)
     * .internetFacing(true)
     * .healthCheck(HealthCheck.builder()
     * .port(80)
     * .build())
     * .build();
     * lb.addTarget(myAutoScalingGroup);
     * lb.addListener(LoadBalancerListener.builder()
     * .externalPort(80)
     * .build());
     * ```
     */
    public inline fun loadBalancerListener(
        block: LoadBalancerListenerDsl.() -> Unit = {}
    ): LoadBalancerListener {
        val builder = LoadBalancerListenerDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a LoadBalancer.
     *
     * Example:
     * ```
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * Vpc vpc;
     * Ec2Service service = Ec2Service.Builder.create(this,
     * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
     * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB").vpc(vpc).build();
     * lb.addListener(LoadBalancerListener.builder().externalPort(80).build());
     * lb.addTarget(service.loadBalancerTarget(LoadBalancerTargetOptions.builder()
     * .containerName("MyContainer")
     * .containerPort(80)
     * .build()));
     * ```
     */
    public inline fun loadBalancerProps(
        block: LoadBalancerPropsDsl.() -> Unit = {}
    ): LoadBalancerProps {
        val builder = LoadBalancerPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
