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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps
import software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps
import software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps
import software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps
import software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps
import software.amazon.awscdk.services.elasticloadbalancingv2.AddRuleProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRuleProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerRuleProps
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseNetworkListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition
import software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes
import software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup
import software.constructs.Construct

public object elasticloadbalancingv2 {
    /**
     * Properties for adding a new action to a listener.
     *
     * Example:
     * ```
     * ApplicationListener listener;
     * listener.addAction("Fixed", AddApplicationActionProps.builder()
     * .priority(10)
     * .conditions(List.of(ListenerCondition.pathPatterns(List.of("/ok"))))
     * .action(ListenerAction.fixedResponse(200, FixedResponseOptions.builder()
     * .contentType("text/plain")
     * .messageBody("OK")
     * .build()))
     * .build());
     * ```
     */
    public inline fun addApplicationActionProps(
        block: AddApplicationActionPropsDsl.() -> Unit = {}
    ): AddApplicationActionProps {
        val builder = AddApplicationActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for adding a new target group to a listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ApplicationTargetGroup applicationTargetGroup;
     * ListenerCondition listenerCondition;
     * AddApplicationTargetGroupsProps addApplicationTargetGroupsProps =
     * AddApplicationTargetGroupsProps.builder()
     * .targetGroups(List.of(applicationTargetGroup))
     * // the properties below are optional
     * .conditions(List.of(listenerCondition))
     * .priority(123)
     * .build();
     * ```
     */
    public inline fun addApplicationTargetGroupsProps(
        block: AddApplicationTargetGroupsPropsDsl.() -> Unit = {}
    ): AddApplicationTargetGroupsProps {
        val builder = AddApplicationTargetGroupsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for adding new targets to a listener.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.autoscaling.AutoScalingGroup;
     * AutoScalingGroup asg;
     * Vpc vpc;
     * // Create the load balancer in a VPC. 'internetFacing' is 'false'
     * // by default, which creates an internal load balancer.
     * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this, "LB")
     * .vpc(vpc)
     * .internetFacing(true)
     * .build();
     * // Add a listener and open up the load balancer's security group
     * // to the world.
     * ApplicationListener listener = lb.addListener("Listener",
     * BaseApplicationListenerProps.builder()
     * .port(80)
     * // 'open: true' is the default, you can leave it out if you want. Set it
     * // to 'false' and use `listener.connections` if you want to be selective
     * // about who can access the load balancer.
     * .open(true)
     * .build());
     * // Create an AutoScaling group and add it as a load balancing
     * // target to the listener.
     * listener.addTargets("ApplicationFleet", AddApplicationTargetsProps.builder()
     * .port(8080)
     * .targets(List.of(asg))
     * .build());
     * ```
     */
    public inline fun addApplicationTargetsProps(
        block: AddApplicationTargetsPropsDsl.() -> Unit = {}
    ): AddApplicationTargetsProps {
        val builder = AddApplicationTargetsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for adding a new action to a listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * NetworkListenerAction networkListenerAction;
     * AddNetworkActionProps addNetworkActionProps = AddNetworkActionProps.builder()
     * .action(networkListenerAction)
     * .build();
     * ```
     */
    public inline fun addNetworkActionProps(
        block: AddNetworkActionPropsDsl.() -> Unit = {}
    ): AddNetworkActionProps {
        val builder = AddNetworkActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for adding new network targets to a listener.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.apigatewayv2.integrations.alpha.HttpNlbIntegration;
     * Vpc vpc = new Vpc(this, "VPC");
     * NetworkLoadBalancer lb = NetworkLoadBalancer.Builder.create(this, "lb").vpc(vpc).build();
     * NetworkListener listener = lb.addListener("listener",
     * BaseNetworkListenerProps.builder().port(80).build());
     * listener.addTargets("target", AddNetworkTargetsProps.builder()
     * .port(80)
     * .build());
     * HttpApi httpEndpoint = HttpApi.Builder.create(this, "HttpProxyPrivateApi")
     * .defaultIntegration(new HttpNlbIntegration("DefaultIntegration", listener))
     * .build();
     * ```
     */
    public inline fun addNetworkTargetsProps(
        block: AddNetworkTargetsPropsDsl.() -> Unit = {}
    ): AddNetworkTargetsProps {
        val builder = AddNetworkTargetsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for adding a conditional load balancing rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ListenerCondition listenerCondition;
     * AddRuleProps addRuleProps = AddRuleProps.builder()
     * .conditions(List.of(listenerCondition))
     * .priority(123)
     * .build();
     * ```
     */
    public inline fun addRuleProps(block: AddRulePropsDsl.() -> Unit = {}): AddRuleProps {
        val builder = AddRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define an ApplicationListener.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.apigatewayv2.integrations.alpha.HttpAlbIntegration;
     * ApplicationLoadBalancer lb;
     * ApplicationListener listener = lb.addListener("listener",
     * BaseApplicationListenerProps.builder().port(80).build());
     * listener.addTargets("target", AddApplicationTargetsProps.builder()
     * .port(80)
     * .build());
     * HttpApi httpEndpoint = HttpApi.Builder.create(this, "HttpProxyPrivateApi")
     * .defaultIntegration(HttpAlbIntegration.Builder.create("DefaultIntegration", listener)
     * .parameterMapping(new ParameterMapping().custom("myKey", "myValue"))
     * .build())
     * .build();
     * ```
     */
    public inline fun applicationListener(
        scope: Construct,
        id: String,
        block: ApplicationListenerDsl.() -> Unit = {},
    ): ApplicationListener {
        val builder = ApplicationListenerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to reference an existing listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * SecurityGroup securityGroup;
     * ApplicationListenerAttributes applicationListenerAttributes =
     * ApplicationListenerAttributes.builder()
     * .listenerArn("listenerArn")
     * .securityGroup(securityGroup)
     * // the properties below are optional
     * .defaultPort(123)
     * .build();
     * ```
     */
    public inline fun applicationListenerAttributes(
        block: ApplicationListenerAttributesDsl.() -> Unit = {}
    ): ApplicationListenerAttributes {
        val builder = ApplicationListenerAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Add certificates to a listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ApplicationListener applicationListener;
     * ListenerCertificate listenerCertificate;
     * ApplicationListenerCertificate applicationListenerCertificate =
     * ApplicationListenerCertificate.Builder.create(this, "MyApplicationListenerCertificate")
     * .listener(applicationListener)
     * // the properties below are optional
     * .certificates(List.of(listenerCertificate))
     * .build();
     * ```
     */
    public inline fun applicationListenerCertificate(
        scope: Construct,
        id: String,
        block: ApplicationListenerCertificateDsl.() -> Unit = {},
    ): ApplicationListenerCertificate {
        val builder = ApplicationListenerCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for adding a set of certificates to a listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ApplicationListener applicationListener;
     * ListenerCertificate listenerCertificate;
     * ApplicationListenerCertificateProps applicationListenerCertificateProps =
     * ApplicationListenerCertificateProps.builder()
     * .listener(applicationListener)
     * // the properties below are optional
     * .certificates(List.of(listenerCertificate))
     * .build();
     * ```
     */
    public inline fun applicationListenerCertificateProps(
        block: ApplicationListenerCertificatePropsDsl.() -> Unit = {}
    ): ApplicationListenerCertificateProps {
        val builder = ApplicationListenerCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for ApplicationListener lookup.
     *
     * Example:
     * ```
     * IApplicationListener listener = ApplicationListener.fromLookup(this, "ALBListener",
     * ApplicationListenerLookupOptions.builder()
     * .loadBalancerArn("arn:aws:elasticloadbalancing:us-east-2:123456789012:loadbalancer/app/my-load-balancer/1234567890123456")
     * .listenerProtocol(ApplicationProtocol.HTTPS)
     * .listenerPort(443)
     * .build());
     * ```
     */
    public inline fun applicationListenerLookupOptions(
        block: ApplicationListenerLookupOptionsDsl.() -> Unit = {}
    ): ApplicationListenerLookupOptions {
        val builder = ApplicationListenerLookupOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a standalone ApplicationListener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ApplicationLoadBalancer applicationLoadBalancer;
     * ApplicationTargetGroup applicationTargetGroup;
     * ListenerAction listenerAction;
     * ListenerCertificate listenerCertificate;
     * ApplicationListenerProps applicationListenerProps = ApplicationListenerProps.builder()
     * .loadBalancer(applicationLoadBalancer)
     * // the properties below are optional
     * .certificates(List.of(listenerCertificate))
     * .defaultAction(listenerAction)
     * .defaultTargetGroups(List.of(applicationTargetGroup))
     * .open(false)
     * .port(123)
     * .protocol(ApplicationProtocol.HTTP)
     * .sslPolicy(SslPolicy.RECOMMENDED_TLS)
     * .build();
     * ```
     */
    public inline fun applicationListenerProps(
        block: ApplicationListenerPropsDsl.() -> Unit = {}
    ): ApplicationListenerProps {
        val builder = ApplicationListenerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a new listener rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ApplicationListener applicationListener;
     * ApplicationTargetGroup applicationTargetGroup;
     * ListenerAction listenerAction;
     * ListenerCondition listenerCondition;
     * ApplicationListenerRule applicationListenerRule = ApplicationListenerRule.Builder.create(this,
     * "MyApplicationListenerRule")
     * .listener(applicationListener)
     * .priority(123)
     * // the properties below are optional
     * .action(listenerAction)
     * .conditions(List.of(listenerCondition))
     * .targetGroups(List.of(applicationTargetGroup))
     * .build();
     * ```
     */
    public inline fun applicationListenerRule(
        scope: Construct,
        id: String,
        block: ApplicationListenerRuleDsl.() -> Unit = {},
    ): ApplicationListenerRule {
        val builder = ApplicationListenerRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a listener rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ApplicationListener applicationListener;
     * ApplicationTargetGroup applicationTargetGroup;
     * ListenerAction listenerAction;
     * ListenerCondition listenerCondition;
     * ApplicationListenerRuleProps applicationListenerRuleProps =
     * ApplicationListenerRuleProps.builder()
     * .listener(applicationListener)
     * .priority(123)
     * // the properties below are optional
     * .action(listenerAction)
     * .conditions(List.of(listenerCondition))
     * .targetGroups(List.of(applicationTargetGroup))
     * .build();
     * ```
     */
    public inline fun applicationListenerRuleProps(
        block: ApplicationListenerRulePropsDsl.() -> Unit = {}
    ): ApplicationListenerRuleProps {
        val builder = ApplicationListenerRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define an Application Load Balancer.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.autoscaling.AutoScalingGroup;
     * AutoScalingGroup asg;
     * Vpc vpc;
     * // Create the load balancer in a VPC. 'internetFacing' is 'false'
     * // by default, which creates an internal load balancer.
     * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this, "LB")
     * .vpc(vpc)
     * .internetFacing(true)
     * .build();
     * // Add a listener and open up the load balancer's security group
     * // to the world.
     * ApplicationListener listener = lb.addListener("Listener",
     * BaseApplicationListenerProps.builder()
     * .port(80)
     * // 'open: true' is the default, you can leave it out if you want. Set it
     * // to 'false' and use `listener.connections` if you want to be selective
     * // about who can access the load balancer.
     * .open(true)
     * .build());
     * // Create an AutoScaling group and add it as a load balancing
     * // target to the listener.
     * listener.addTargets("ApplicationFleet", AddApplicationTargetsProps.builder()
     * .port(8080)
     * .targets(List.of(asg))
     * .build());
     * ```
     */
    public inline fun applicationLoadBalancer(
        scope: Construct,
        id: String,
        block: ApplicationLoadBalancerDsl.() -> Unit = {},
    ): ApplicationLoadBalancer {
        val builder = ApplicationLoadBalancerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to reference an existing load balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * Vpc vpc;
     * ApplicationLoadBalancerAttributes applicationLoadBalancerAttributes =
     * ApplicationLoadBalancerAttributes.builder()
     * .loadBalancerArn("loadBalancerArn")
     * .securityGroupId("securityGroupId")
     * // the properties below are optional
     * .loadBalancerCanonicalHostedZoneId("loadBalancerCanonicalHostedZoneId")
     * .loadBalancerDnsName("loadBalancerDnsName")
     * .securityGroupAllowsAllOutbound(false)
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun applicationLoadBalancerAttributes(
        block: ApplicationLoadBalancerAttributesDsl.() -> Unit = {}
    ): ApplicationLoadBalancerAttributes {
        val builder = ApplicationLoadBalancerAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for looking up an ApplicationLoadBalancer.
     *
     * Example:
     * ```
     * IApplicationLoadBalancer loadBalancer = ApplicationLoadBalancer.fromLookup(this, "ALB",
     * ApplicationLoadBalancerLookupOptions.builder()
     * .loadBalancerArn("arn:aws:elasticloadbalancing:us-east-2:123456789012:loadbalancer/app/my-load-balancer/1234567890123456")
     * .build());
     * ```
     */
    public inline fun applicationLoadBalancerLookupOptions(
        block: ApplicationLoadBalancerLookupOptionsDsl.() -> Unit = {}
    ): ApplicationLoadBalancerLookupOptions {
        val builder = ApplicationLoadBalancerLookupOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining an Application Load Balancer.
     *
     * Example:
     * ```
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * Vpc vpc;
     * FargateService service = FargateService.Builder.create(this,
     * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
     * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this,
     * "LB").vpc(vpc).internetFacing(true).build();
     * ApplicationListener listener = lb.addListener("Listener",
     * BaseApplicationListenerProps.builder().port(80).build());
     * service.registerLoadBalancerTargets(EcsTarget.builder()
     * .containerName("web")
     * .containerPort(80)
     * .newTargetGroupId("ECS")
     * .listener(ListenerConfig.applicationListener(listener, AddApplicationTargetsProps.builder()
     * .protocol(ApplicationProtocol.HTTPS)
     * .build()))
     * .build());
     * ```
     */
    public inline fun applicationLoadBalancerProps(
        block: ApplicationLoadBalancerPropsDsl.() -> Unit = {}
    ): ApplicationLoadBalancerProps {
        val builder = ApplicationLoadBalancerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a redirection config.
     *
     * Example:
     * ```
     * ApplicationLoadBalancer lb;
     * lb.addRedirect(ApplicationLoadBalancerRedirectConfig.builder()
     * .sourceProtocol(ApplicationProtocol.HTTPS)
     * .sourcePort(8443)
     * .targetProtocol(ApplicationProtocol.HTTP)
     * .targetPort(8080)
     * .build());
     * ```
     */
    public inline fun applicationLoadBalancerRedirectConfig(
        block: ApplicationLoadBalancerRedirectConfigDsl.() -> Unit = {}
    ): ApplicationLoadBalancerRedirectConfig {
        val builder = ApplicationLoadBalancerRedirectConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define an Application Target Group.
     *
     * Example:
     * ```
     * ApplicationLoadBalancer alb;
     * ApplicationListener listener = alb.addListener("Listener",
     * BaseApplicationListenerProps.builder().port(80).build());
     * ApplicationTargetGroup targetGroup = listener.addTargets("Fleet",
     * AddApplicationTargetsProps.builder().port(80).build());
     * ServerDeploymentGroup deploymentGroup = ServerDeploymentGroup.Builder.create(this,
     * "DeploymentGroup")
     * .loadBalancer(LoadBalancer.application(targetGroup))
     * .build();
     * ```
     */
    public inline fun applicationTargetGroup(
        scope: Construct,
        id: String,
        block: ApplicationTargetGroupDsl.() -> Unit = {},
    ): ApplicationTargetGroup {
        val builder = ApplicationTargetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining an Application Target Group.
     *
     * Example:
     * ```
     * Vpc vpc;
     * // Target group with duration-based stickiness with load-balancer generated cookie
     * ApplicationTargetGroup tg1 = ApplicationTargetGroup.Builder.create(this, "TG1")
     * .targetType(TargetType.INSTANCE)
     * .port(80)
     * .stickinessCookieDuration(Duration.minutes(5))
     * .vpc(vpc)
     * .build();
     * // Target group with application-based stickiness
     * ApplicationTargetGroup tg2 = ApplicationTargetGroup.Builder.create(this, "TG2")
     * .targetType(TargetType.INSTANCE)
     * .port(80)
     * .stickinessCookieDuration(Duration.minutes(5))
     * .stickinessCookieName("MyDeliciousCookie")
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun applicationTargetGroupProps(
        block: ApplicationTargetGroupPropsDsl.() -> Unit = {}
    ): ApplicationTargetGroupProps {
        val builder = ApplicationTargetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for `ListenerAction.authenciateOidc()`.
     *
     * Example:
     * ```
     * ApplicationListener listener;
     * ApplicationTargetGroup myTargetGroup;
     * listener.addAction("DefaultAction", AddApplicationActionProps.builder()
     * .action(ListenerAction.authenticateOidc(AuthenticateOidcOptions.builder()
     * .authorizationEndpoint("https://example.com/openid")
     * // Other OIDC properties here
     * .clientId("...")
     * .clientSecret(SecretValue.secretsManager("..."))
     * .issuer("...")
     * .tokenEndpoint("...")
     * .userInfoEndpoint("...")
     * // Next
     * .next(ListenerAction.forward(List.of(myTargetGroup)))
     * .build()))
     * .build());
     * ```
     */
    public inline fun authenticateOidcOptions(
        block: AuthenticateOidcOptionsDsl.() -> Unit = {}
    ): AuthenticateOidcOptions {
        val builder = AuthenticateOidcOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Basic properties for an ApplicationListener.
     *
     * Example:
     * ```
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * Vpc vpc;
     * FargateService service = FargateService.Builder.create(this,
     * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
     * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this,
     * "LB").vpc(vpc).internetFacing(true).build();
     * ApplicationListener listener = lb.addListener("Listener",
     * BaseApplicationListenerProps.builder().port(80).build());
     * service.registerLoadBalancerTargets(EcsTarget.builder()
     * .containerName("web")
     * .containerPort(80)
     * .newTargetGroupId("ECS")
     * .listener(ListenerConfig.applicationListener(listener, AddApplicationTargetsProps.builder()
     * .protocol(ApplicationProtocol.HTTPS)
     * .build()))
     * .build());
     * ```
     */
    public inline fun baseApplicationListenerProps(
        block: BaseApplicationListenerPropsDsl.() -> Unit = {}
    ): BaseApplicationListenerProps {
        val builder = BaseApplicationListenerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Basic properties for defining a rule on a listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ApplicationTargetGroup applicationTargetGroup;
     * ListenerAction listenerAction;
     * ListenerCondition listenerCondition;
     * BaseApplicationListenerRuleProps baseApplicationListenerRuleProps =
     * BaseApplicationListenerRuleProps.builder()
     * .priority(123)
     * // the properties below are optional
     * .action(listenerAction)
     * .conditions(List.of(listenerCondition))
     * .targetGroups(List.of(applicationTargetGroup))
     * .build();
     * ```
     */
    public inline fun baseApplicationListenerRuleProps(
        block: BaseApplicationListenerRulePropsDsl.() -> Unit = {}
    ): BaseApplicationListenerRuleProps {
        val builder = BaseApplicationListenerRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for listener lookup.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * BaseListenerLookupOptions baseListenerLookupOptions = BaseListenerLookupOptions.builder()
     * .listenerPort(123)
     * .loadBalancerArn("loadBalancerArn")
     * .loadBalancerTags(Map.of(
     * "loadBalancerTagsKey", "loadBalancerTags"))
     * .build();
     * ```
     */
    public inline fun baseListenerLookupOptions(
        block: BaseListenerLookupOptionsDsl.() -> Unit = {}
    ): BaseListenerLookupOptions {
        val builder = BaseListenerLookupOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for looking up load balancers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * BaseLoadBalancerLookupOptions baseLoadBalancerLookupOptions =
     * BaseLoadBalancerLookupOptions.builder()
     * .loadBalancerArn("loadBalancerArn")
     * .loadBalancerTags(Map.of(
     * "loadBalancerTagsKey", "loadBalancerTags"))
     * .build();
     * ```
     */
    public inline fun baseLoadBalancerLookupOptions(
        block: BaseLoadBalancerLookupOptionsDsl.() -> Unit = {}
    ): BaseLoadBalancerLookupOptions {
        val builder = BaseLoadBalancerLookupOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Shared properties of both Application and Network Load Balancers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Vpc vpc;
     * BaseLoadBalancerProps baseLoadBalancerProps = BaseLoadBalancerProps.builder()
     * .vpc(vpc)
     * // the properties below are optional
     * .deletionProtection(false)
     * .internetFacing(false)
     * .loadBalancerName("loadBalancerName")
     * .vpcSubnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun baseLoadBalancerProps(
        block: BaseLoadBalancerPropsDsl.() -> Unit = {}
    ): BaseLoadBalancerProps {
        val builder = BaseLoadBalancerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Basic properties for a Network Listener.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.apigatewayv2.integrations.alpha.HttpNlbIntegration;
     * Vpc vpc = new Vpc(this, "VPC");
     * NetworkLoadBalancer lb = NetworkLoadBalancer.Builder.create(this, "lb").vpc(vpc).build();
     * NetworkListener listener = lb.addListener("listener",
     * BaseNetworkListenerProps.builder().port(80).build());
     * listener.addTargets("target", AddNetworkTargetsProps.builder()
     * .port(80)
     * .build());
     * HttpApi httpEndpoint = HttpApi.Builder.create(this, "HttpProxyPrivateApi")
     * .defaultIntegration(new HttpNlbIntegration("DefaultIntegration", listener))
     * .build();
     * ```
     */
    public inline fun baseNetworkListenerProps(
        block: BaseNetworkListenerPropsDsl.() -> Unit = {}
    ): BaseNetworkListenerProps {
        val builder = BaseNetworkListenerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Basic properties of both Application and Network Target Groups.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * Vpc vpc;
     * BaseTargetGroupProps baseTargetGroupProps = BaseTargetGroupProps.builder()
     * .deregistrationDelay(Duration.minutes(30))
     * .healthCheck(HealthCheck.builder()
     * .enabled(false)
     * .healthyGrpcCodes("healthyGrpcCodes")
     * .healthyHttpCodes("healthyHttpCodes")
     * .healthyThresholdCount(123)
     * .interval(Duration.minutes(30))
     * .path("path")
     * .port("port")
     * .protocol(Protocol.HTTP)
     * .timeout(Duration.minutes(30))
     * .unhealthyThresholdCount(123)
     * .build())
     * .targetGroupName("targetGroupName")
     * .targetType(TargetType.INSTANCE)
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun baseTargetGroupProps(
        block: BaseTargetGroupPropsDsl.() -> Unit = {}
    ): BaseTargetGroupProps {
        val builder = BaseTargetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a listener for an Application Load Balancer, Network Load Balancer, or Gateway Load
     * Balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * CfnListener cfnListener = CfnListener.Builder.create(this, "MyCfnListener")
     * .defaultActions(List.of(ActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .authenticateCognitoConfig(AuthenticateCognitoConfigProperty.builder()
     * .userPoolArn("userPoolArn")
     * .userPoolClientId("userPoolClientId")
     * .userPoolDomain("userPoolDomain")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout("sessionTimeout")
     * .build())
     * .authenticateOidcConfig(AuthenticateOidcConfigProperty.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientId("clientId")
     * .issuer("issuer")
     * .tokenEndpoint("tokenEndpoint")
     * .userInfoEndpoint("userInfoEndpoint")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .clientSecret("clientSecret")
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout("sessionTimeout")
     * .useExistingClientSecret(false)
     * .build())
     * .fixedResponseConfig(FixedResponseConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentType("contentType")
     * .messageBody("messageBody")
     * .build())
     * .forwardConfig(ForwardConfigProperty.builder()
     * .targetGroups(List.of(TargetGroupTupleProperty.builder()
     * .targetGroupArn("targetGroupArn")
     * .weight(123)
     * .build()))
     * .targetGroupStickinessConfig(TargetGroupStickinessConfigProperty.builder()
     * .durationSeconds(123)
     * .enabled(false)
     * .build())
     * .build())
     * .order(123)
     * .redirectConfig(RedirectConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .host("host")
     * .path("path")
     * .port("port")
     * .protocol("protocol")
     * .query("query")
     * .build())
     * .targetGroupArn("targetGroupArn")
     * .build()))
     * .loadBalancerArn("loadBalancerArn")
     * // the properties below are optional
     * .alpnPolicy(List.of("alpnPolicy"))
     * .certificates(List.of(CertificateProperty.builder()
     * .certificateArn("certificateArn")
     * .build()))
     * .port(123)
     * .protocol("protocol")
     * .sslPolicy("sslPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html)
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
     * Specifies an action for a listener rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ActionProperty actionProperty = ActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .authenticateCognitoConfig(AuthenticateCognitoConfigProperty.builder()
     * .userPoolArn("userPoolArn")
     * .userPoolClientId("userPoolClientId")
     * .userPoolDomain("userPoolDomain")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout("sessionTimeout")
     * .build())
     * .authenticateOidcConfig(AuthenticateOidcConfigProperty.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientId("clientId")
     * .issuer("issuer")
     * .tokenEndpoint("tokenEndpoint")
     * .userInfoEndpoint("userInfoEndpoint")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .clientSecret("clientSecret")
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout("sessionTimeout")
     * .useExistingClientSecret(false)
     * .build())
     * .fixedResponseConfig(FixedResponseConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentType("contentType")
     * .messageBody("messageBody")
     * .build())
     * .forwardConfig(ForwardConfigProperty.builder()
     * .targetGroups(List.of(TargetGroupTupleProperty.builder()
     * .targetGroupArn("targetGroupArn")
     * .weight(123)
     * .build()))
     * .targetGroupStickinessConfig(TargetGroupStickinessConfigProperty.builder()
     * .durationSeconds(123)
     * .enabled(false)
     * .build())
     * .build())
     * .order(123)
     * .redirectConfig(RedirectConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .host("host")
     * .path("path")
     * .port("port")
     * .protocol("protocol")
     * .query("query")
     * .build())
     * .targetGroupArn("targetGroupArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html)
     */
    public inline fun cfnListenerActionProperty(
        block: CfnListenerActionPropertyDsl.() -> Unit = {}
    ): CfnListener.ActionProperty {
        val builder = CfnListenerActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies information required when integrating with Amazon Cognito to authenticate users.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * AuthenticateCognitoConfigProperty authenticateCognitoConfigProperty =
     * AuthenticateCognitoConfigProperty.builder()
     * .userPoolArn("userPoolArn")
     * .userPoolClientId("userPoolClientId")
     * .userPoolDomain("userPoolDomain")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout("sessionTimeout")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html)
     */
    public inline fun cfnListenerAuthenticateCognitoConfigProperty(
        block: CfnListenerAuthenticateCognitoConfigPropertyDsl.() -> Unit = {}
    ): CfnListener.AuthenticateCognitoConfigProperty {
        val builder = CfnListenerAuthenticateCognitoConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies information required using an identity provide (IdP) that is compliant with OpenID
     * Connect (OIDC) to authenticate users.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * AuthenticateOidcConfigProperty authenticateOidcConfigProperty =
     * AuthenticateOidcConfigProperty.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientId("clientId")
     * .issuer("issuer")
     * .tokenEndpoint("tokenEndpoint")
     * .userInfoEndpoint("userInfoEndpoint")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .clientSecret("clientSecret")
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout("sessionTimeout")
     * .useExistingClientSecret(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html)
     */
    public inline fun cfnListenerAuthenticateOidcConfigProperty(
        block: CfnListenerAuthenticateOidcConfigPropertyDsl.() -> Unit = {}
    ): CfnListener.AuthenticateOidcConfigProperty {
        val builder = CfnListenerAuthenticateOidcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an SSL server certificate to add to the certificate list for an HTTPS or TLS
     * listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * CfnListenerCertificate cfnListenerCertificate = CfnListenerCertificate.Builder.create(this,
     * "MyCfnListenerCertificate")
     * .certificates(List.of(CertificateProperty.builder()
     * .certificateArn("certificateArn")
     * .build()))
     * .listenerArn("listenerArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
     */
    public inline fun cfnListenerCertificate(
        scope: Construct,
        id: String,
        block: CfnListenerCertificateDsl.() -> Unit = {},
    ): CfnListenerCertificate {
        val builder = CfnListenerCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an SSL server certificate for the certificate list of a secure listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * CertificateProperty certificateProperty = CertificateProperty.builder()
     * .certificateArn("certificateArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenercertificate-certificate.html)
     */
    public inline fun cfnListenerCertificateCertificateProperty(
        block: CfnListenerCertificateCertificatePropertyDsl.() -> Unit = {}
    ): CfnListenerCertificate.CertificateProperty {
        val builder = CfnListenerCertificateCertificatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an SSL server certificate to use as the default certificate for a secure listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * CertificateProperty certificateProperty = CertificateProperty.builder()
     * .certificateArn("certificateArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificate.html)
     */
    public inline fun cfnListenerCertificateProperty(
        block: CfnListenerCertificatePropertyDsl.() -> Unit = {}
    ): CfnListener.CertificateProperty {
        val builder = CfnListenerCertificatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnListenerCertificate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * CfnListenerCertificateProps cfnListenerCertificateProps = CfnListenerCertificateProps.builder()
     * .certificates(List.of(CertificateProperty.builder()
     * .certificateArn("certificateArn")
     * .build()))
     * .listenerArn("listenerArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
     */
    public inline fun cfnListenerCertificateProps(
        block: CfnListenerCertificatePropsDsl.() -> Unit = {}
    ): CfnListenerCertificateProps {
        val builder = CfnListenerCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies information required when returning a custom HTTP response.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * FixedResponseConfigProperty fixedResponseConfigProperty = FixedResponseConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentType("contentType")
     * .messageBody("messageBody")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-fixedresponseconfig.html)
     */
    public inline fun cfnListenerFixedResponseConfigProperty(
        block: CfnListenerFixedResponseConfigPropertyDsl.() -> Unit = {}
    ): CfnListener.FixedResponseConfigProperty {
        val builder = CfnListenerFixedResponseConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information for creating an action that distributes requests among one or more target groups.
     *
     * For Network Load Balancers, you can specify a single target group. Specify only when `Type`
     * is `forward` . If you specify both `ForwardConfig` and `TargetGroupArn` , you can specify
     * only one target group using `ForwardConfig` and it must be the same target group specified in
     * `TargetGroupArn` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ForwardConfigProperty forwardConfigProperty = ForwardConfigProperty.builder()
     * .targetGroups(List.of(TargetGroupTupleProperty.builder()
     * .targetGroupArn("targetGroupArn")
     * .weight(123)
     * .build()))
     * .targetGroupStickinessConfig(TargetGroupStickinessConfigProperty.builder()
     * .durationSeconds(123)
     * .enabled(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-forwardconfig.html)
     */
    public inline fun cfnListenerForwardConfigProperty(
        block: CfnListenerForwardConfigPropertyDsl.() -> Unit = {}
    ): CfnListener.ForwardConfigProperty {
        val builder = CfnListenerForwardConfigPropertyDsl()
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
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * CfnListenerProps cfnListenerProps = CfnListenerProps.builder()
     * .defaultActions(List.of(ActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .authenticateCognitoConfig(AuthenticateCognitoConfigProperty.builder()
     * .userPoolArn("userPoolArn")
     * .userPoolClientId("userPoolClientId")
     * .userPoolDomain("userPoolDomain")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout("sessionTimeout")
     * .build())
     * .authenticateOidcConfig(AuthenticateOidcConfigProperty.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientId("clientId")
     * .issuer("issuer")
     * .tokenEndpoint("tokenEndpoint")
     * .userInfoEndpoint("userInfoEndpoint")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .clientSecret("clientSecret")
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout("sessionTimeout")
     * .useExistingClientSecret(false)
     * .build())
     * .fixedResponseConfig(FixedResponseConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentType("contentType")
     * .messageBody("messageBody")
     * .build())
     * .forwardConfig(ForwardConfigProperty.builder()
     * .targetGroups(List.of(TargetGroupTupleProperty.builder()
     * .targetGroupArn("targetGroupArn")
     * .weight(123)
     * .build()))
     * .targetGroupStickinessConfig(TargetGroupStickinessConfigProperty.builder()
     * .durationSeconds(123)
     * .enabled(false)
     * .build())
     * .build())
     * .order(123)
     * .redirectConfig(RedirectConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .host("host")
     * .path("path")
     * .port("port")
     * .protocol("protocol")
     * .query("query")
     * .build())
     * .targetGroupArn("targetGroupArn")
     * .build()))
     * .loadBalancerArn("loadBalancerArn")
     * // the properties below are optional
     * .alpnPolicy(List.of("alpnPolicy"))
     * .certificates(List.of(CertificateProperty.builder()
     * .certificateArn("certificateArn")
     * .build()))
     * .port(123)
     * .protocol("protocol")
     * .sslPolicy("sslPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html)
     */
    public inline fun cfnListenerProps(
        block: CfnListenerPropsDsl.() -> Unit = {}
    ): CfnListenerProps {
        val builder = CfnListenerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a redirect action.
     *
     * A URI consists of the following components: protocol://hostname:port/path?query. You must
     * modify at least one of the following components to avoid a redirect loop: protocol, hostname,
     * port, or path. Any components that you do not modify retain their original values.
     *
     * You can reuse URI components using the following reserved keywords:
     * * #{protocol}
     * * #{host}
     * * #{port}
     * * #{path} (the leading "/" is removed)
     * * #{query}
     *
     * For example, you can change the path to "/new/#{path}", the hostname to "example.#{host}", or
     * the query to "#{query}&amp;value=xyz".
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * RedirectConfigProperty redirectConfigProperty = RedirectConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .host("host")
     * .path("path")
     * .port("port")
     * .protocol("protocol")
     * .query("query")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html)
     */
    public inline fun cfnListenerRedirectConfigProperty(
        block: CfnListenerRedirectConfigPropertyDsl.() -> Unit = {}
    ): CfnListener.RedirectConfigProperty {
        val builder = CfnListenerRedirectConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a listener rule.
     *
     * The listener must be associated with an Application Load Balancer. Each rule consists of a
     * priority, one or more actions, and one or more conditions.
     *
     * For more information, see
     * [Quotas for your Application Load Balancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-limits.html)
     * in the *User Guide for Application Load Balancers* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * CfnListenerRule cfnListenerRule = CfnListenerRule.Builder.create(this, "MyCfnListenerRule")
     * .actions(List.of(ActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .authenticateCognitoConfig(AuthenticateCognitoConfigProperty.builder()
     * .userPoolArn("userPoolArn")
     * .userPoolClientId("userPoolClientId")
     * .userPoolDomain("userPoolDomain")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout(123)
     * .build())
     * .authenticateOidcConfig(AuthenticateOidcConfigProperty.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientId("clientId")
     * .issuer("issuer")
     * .tokenEndpoint("tokenEndpoint")
     * .userInfoEndpoint("userInfoEndpoint")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .clientSecret("clientSecret")
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout(123)
     * .useExistingClientSecret(false)
     * .build())
     * .fixedResponseConfig(FixedResponseConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentType("contentType")
     * .messageBody("messageBody")
     * .build())
     * .forwardConfig(ForwardConfigProperty.builder()
     * .targetGroups(List.of(TargetGroupTupleProperty.builder()
     * .targetGroupArn("targetGroupArn")
     * .weight(123)
     * .build()))
     * .targetGroupStickinessConfig(TargetGroupStickinessConfigProperty.builder()
     * .durationSeconds(123)
     * .enabled(false)
     * .build())
     * .build())
     * .order(123)
     * .redirectConfig(RedirectConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .host("host")
     * .path("path")
     * .port("port")
     * .protocol("protocol")
     * .query("query")
     * .build())
     * .targetGroupArn("targetGroupArn")
     * .build()))
     * .conditions(List.of(RuleConditionProperty.builder()
     * .field("field")
     * .hostHeaderConfig(HostHeaderConfigProperty.builder()
     * .values(List.of("values"))
     * .build())
     * .httpHeaderConfig(HttpHeaderConfigProperty.builder()
     * .httpHeaderName("httpHeaderName")
     * .values(List.of("values"))
     * .build())
     * .httpRequestMethodConfig(HttpRequestMethodConfigProperty.builder()
     * .values(List.of("values"))
     * .build())
     * .pathPatternConfig(PathPatternConfigProperty.builder()
     * .values(List.of("values"))
     * .build())
     * .queryStringConfig(QueryStringConfigProperty.builder()
     * .values(List.of(QueryStringKeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .sourceIpConfig(SourceIpConfigProperty.builder()
     * .values(List.of("values"))
     * .build())
     * .values(List.of("values"))
     * .build()))
     * .priority(123)
     * // the properties below are optional
     * .listenerArn("listenerArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
     */
    public inline fun cfnListenerRule(
        scope: Construct,
        id: String,
        block: CfnListenerRuleDsl.() -> Unit = {},
    ): CfnListenerRule {
        val builder = CfnListenerRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an action for a listener rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ActionProperty actionProperty = ActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .authenticateCognitoConfig(AuthenticateCognitoConfigProperty.builder()
     * .userPoolArn("userPoolArn")
     * .userPoolClientId("userPoolClientId")
     * .userPoolDomain("userPoolDomain")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout(123)
     * .build())
     * .authenticateOidcConfig(AuthenticateOidcConfigProperty.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientId("clientId")
     * .issuer("issuer")
     * .tokenEndpoint("tokenEndpoint")
     * .userInfoEndpoint("userInfoEndpoint")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .clientSecret("clientSecret")
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout(123)
     * .useExistingClientSecret(false)
     * .build())
     * .fixedResponseConfig(FixedResponseConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentType("contentType")
     * .messageBody("messageBody")
     * .build())
     * .forwardConfig(ForwardConfigProperty.builder()
     * .targetGroups(List.of(TargetGroupTupleProperty.builder()
     * .targetGroupArn("targetGroupArn")
     * .weight(123)
     * .build()))
     * .targetGroupStickinessConfig(TargetGroupStickinessConfigProperty.builder()
     * .durationSeconds(123)
     * .enabled(false)
     * .build())
     * .build())
     * .order(123)
     * .redirectConfig(RedirectConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .host("host")
     * .path("path")
     * .port("port")
     * .protocol("protocol")
     * .query("query")
     * .build())
     * .targetGroupArn("targetGroupArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html)
     */
    public inline fun cfnListenerRuleActionProperty(
        block: CfnListenerRuleActionPropertyDsl.() -> Unit = {}
    ): CfnListenerRule.ActionProperty {
        val builder = CfnListenerRuleActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies information required when integrating with Amazon Cognito to authenticate users.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * AuthenticateCognitoConfigProperty authenticateCognitoConfigProperty =
     * AuthenticateCognitoConfigProperty.builder()
     * .userPoolArn("userPoolArn")
     * .userPoolClientId("userPoolClientId")
     * .userPoolDomain("userPoolDomain")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html)
     */
    public inline fun cfnListenerRuleAuthenticateCognitoConfigProperty(
        block: CfnListenerRuleAuthenticateCognitoConfigPropertyDsl.() -> Unit = {}
    ): CfnListenerRule.AuthenticateCognitoConfigProperty {
        val builder = CfnListenerRuleAuthenticateCognitoConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies information required using an identity provide (IdP) that is compliant with OpenID
     * Connect (OIDC) to authenticate users.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * AuthenticateOidcConfigProperty authenticateOidcConfigProperty =
     * AuthenticateOidcConfigProperty.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientId("clientId")
     * .issuer("issuer")
     * .tokenEndpoint("tokenEndpoint")
     * .userInfoEndpoint("userInfoEndpoint")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .clientSecret("clientSecret")
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout(123)
     * .useExistingClientSecret(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html)
     */
    public inline fun cfnListenerRuleAuthenticateOidcConfigProperty(
        block: CfnListenerRuleAuthenticateOidcConfigPropertyDsl.() -> Unit = {}
    ): CfnListenerRule.AuthenticateOidcConfigProperty {
        val builder = CfnListenerRuleAuthenticateOidcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies information required when returning a custom HTTP response.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * FixedResponseConfigProperty fixedResponseConfigProperty = FixedResponseConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentType("contentType")
     * .messageBody("messageBody")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html)
     */
    public inline fun cfnListenerRuleFixedResponseConfigProperty(
        block: CfnListenerRuleFixedResponseConfigPropertyDsl.() -> Unit = {}
    ): CfnListenerRule.FixedResponseConfigProperty {
        val builder = CfnListenerRuleFixedResponseConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information for creating an action that distributes requests among one or more target groups.
     *
     * For Network Load Balancers, you can specify a single target group. Specify only when `Type`
     * is `forward` . If you specify both `ForwardConfig` and `TargetGroupArn` , you can specify
     * only one target group using `ForwardConfig` and it must be the same target group specified in
     * `TargetGroupArn` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ForwardConfigProperty forwardConfigProperty = ForwardConfigProperty.builder()
     * .targetGroups(List.of(TargetGroupTupleProperty.builder()
     * .targetGroupArn("targetGroupArn")
     * .weight(123)
     * .build()))
     * .targetGroupStickinessConfig(TargetGroupStickinessConfigProperty.builder()
     * .durationSeconds(123)
     * .enabled(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-forwardconfig.html)
     */
    public inline fun cfnListenerRuleForwardConfigProperty(
        block: CfnListenerRuleForwardConfigPropertyDsl.() -> Unit = {}
    ): CfnListenerRule.ForwardConfigProperty {
        val builder = CfnListenerRuleForwardConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a host header condition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * HostHeaderConfigProperty hostHeaderConfigProperty = HostHeaderConfigProperty.builder()
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-hostheaderconfig.html)
     */
    public inline fun cfnListenerRuleHostHeaderConfigProperty(
        block: CfnListenerRuleHostHeaderConfigPropertyDsl.() -> Unit = {}
    ): CfnListenerRule.HostHeaderConfigProperty {
        val builder = CfnListenerRuleHostHeaderConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about an HTTP header condition.
     *
     * There is a set of standard HTTP header fields. You can also define custom HTTP header fields.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * HttpHeaderConfigProperty httpHeaderConfigProperty = HttpHeaderConfigProperty.builder()
     * .httpHeaderName("httpHeaderName")
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httpheaderconfig.html)
     */
    public inline fun cfnListenerRuleHttpHeaderConfigProperty(
        block: CfnListenerRuleHttpHeaderConfigPropertyDsl.() -> Unit = {}
    ): CfnListenerRule.HttpHeaderConfigProperty {
        val builder = CfnListenerRuleHttpHeaderConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about an HTTP method condition.
     *
     * HTTP defines a set of request methods, also referred to as HTTP verbs. For more information,
     * see the
     * [HTTP Method Registry](https://docs.aws.amazon.com/https://www.iana.org/assignments/http-methods/http-methods.xhtml)
     * . You can also define custom HTTP methods.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * HttpRequestMethodConfigProperty httpRequestMethodConfigProperty =
     * HttpRequestMethodConfigProperty.builder()
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httprequestmethodconfig.html)
     */
    public inline fun cfnListenerRuleHttpRequestMethodConfigProperty(
        block: CfnListenerRuleHttpRequestMethodConfigPropertyDsl.() -> Unit = {}
    ): CfnListenerRule.HttpRequestMethodConfigProperty {
        val builder = CfnListenerRuleHttpRequestMethodConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a path pattern condition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * PathPatternConfigProperty pathPatternConfigProperty = PathPatternConfigProperty.builder()
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-pathpatternconfig.html)
     */
    public inline fun cfnListenerRulePathPatternConfigProperty(
        block: CfnListenerRulePathPatternConfigPropertyDsl.() -> Unit = {}
    ): CfnListenerRule.PathPatternConfigProperty {
        val builder = CfnListenerRulePathPatternConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnListenerRule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * CfnListenerRuleProps cfnListenerRuleProps = CfnListenerRuleProps.builder()
     * .actions(List.of(ActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .authenticateCognitoConfig(AuthenticateCognitoConfigProperty.builder()
     * .userPoolArn("userPoolArn")
     * .userPoolClientId("userPoolClientId")
     * .userPoolDomain("userPoolDomain")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout(123)
     * .build())
     * .authenticateOidcConfig(AuthenticateOidcConfigProperty.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientId("clientId")
     * .issuer("issuer")
     * .tokenEndpoint("tokenEndpoint")
     * .userInfoEndpoint("userInfoEndpoint")
     * // the properties below are optional
     * .authenticationRequestExtraParams(Map.of(
     * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
     * .clientSecret("clientSecret")
     * .onUnauthenticatedRequest("onUnauthenticatedRequest")
     * .scope("scope")
     * .sessionCookieName("sessionCookieName")
     * .sessionTimeout(123)
     * .useExistingClientSecret(false)
     * .build())
     * .fixedResponseConfig(FixedResponseConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentType("contentType")
     * .messageBody("messageBody")
     * .build())
     * .forwardConfig(ForwardConfigProperty.builder()
     * .targetGroups(List.of(TargetGroupTupleProperty.builder()
     * .targetGroupArn("targetGroupArn")
     * .weight(123)
     * .build()))
     * .targetGroupStickinessConfig(TargetGroupStickinessConfigProperty.builder()
     * .durationSeconds(123)
     * .enabled(false)
     * .build())
     * .build())
     * .order(123)
     * .redirectConfig(RedirectConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .host("host")
     * .path("path")
     * .port("port")
     * .protocol("protocol")
     * .query("query")
     * .build())
     * .targetGroupArn("targetGroupArn")
     * .build()))
     * .conditions(List.of(RuleConditionProperty.builder()
     * .field("field")
     * .hostHeaderConfig(HostHeaderConfigProperty.builder()
     * .values(List.of("values"))
     * .build())
     * .httpHeaderConfig(HttpHeaderConfigProperty.builder()
     * .httpHeaderName("httpHeaderName")
     * .values(List.of("values"))
     * .build())
     * .httpRequestMethodConfig(HttpRequestMethodConfigProperty.builder()
     * .values(List.of("values"))
     * .build())
     * .pathPatternConfig(PathPatternConfigProperty.builder()
     * .values(List.of("values"))
     * .build())
     * .queryStringConfig(QueryStringConfigProperty.builder()
     * .values(List.of(QueryStringKeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .sourceIpConfig(SourceIpConfigProperty.builder()
     * .values(List.of("values"))
     * .build())
     * .values(List.of("values"))
     * .build()))
     * .priority(123)
     * // the properties below are optional
     * .listenerArn("listenerArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
     */
    public inline fun cfnListenerRuleProps(
        block: CfnListenerRulePropsDsl.() -> Unit = {}
    ): CfnListenerRuleProps {
        val builder = CfnListenerRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a query string condition.
     *
     * The query string component of a URI starts after the first '?' character and is terminated by
     * either a '#' character or the end of the URI. A typical query string contains key/value pairs
     * separated by '&amp;' characters. The allowed characters are specified by RFC 3986. Any
     * character can be percentage encoded.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * QueryStringConfigProperty queryStringConfigProperty = QueryStringConfigProperty.builder()
     * .values(List.of(QueryStringKeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-querystringconfig.html)
     */
    public inline fun cfnListenerRuleQueryStringConfigProperty(
        block: CfnListenerRuleQueryStringConfigPropertyDsl.() -> Unit = {}
    ): CfnListenerRule.QueryStringConfigProperty {
        val builder = CfnListenerRuleQueryStringConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a key/value pair.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * QueryStringKeyValueProperty queryStringKeyValueProperty = QueryStringKeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-querystringkeyvalue.html)
     */
    public inline fun cfnListenerRuleQueryStringKeyValueProperty(
        block: CfnListenerRuleQueryStringKeyValuePropertyDsl.() -> Unit = {}
    ): CfnListenerRule.QueryStringKeyValueProperty {
        val builder = CfnListenerRuleQueryStringKeyValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a redirect action.
     *
     * A URI consists of the following components: protocol://hostname:port/path?query. You must
     * modify at least one of the following components to avoid a redirect loop: protocol, hostname,
     * port, or path. Any components that you do not modify retain their original values.
     *
     * You can reuse URI components using the following reserved keywords:
     * * #{protocol}
     * * #{host}
     * * #{port}
     * * #{path} (the leading "/" is removed)
     * * #{query}
     *
     * For example, you can change the path to "/new/#{path}", the hostname to "example.#{host}", or
     * the query to "#{query}&amp;value=xyz".
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * RedirectConfigProperty redirectConfigProperty = RedirectConfigProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .host("host")
     * .path("path")
     * .port("port")
     * .protocol("protocol")
     * .query("query")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html)
     */
    public inline fun cfnListenerRuleRedirectConfigProperty(
        block: CfnListenerRuleRedirectConfigPropertyDsl.() -> Unit = {}
    ): CfnListenerRule.RedirectConfigProperty {
        val builder = CfnListenerRuleRedirectConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a condition for a listener rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * RuleConditionProperty ruleConditionProperty = RuleConditionProperty.builder()
     * .field("field")
     * .hostHeaderConfig(HostHeaderConfigProperty.builder()
     * .values(List.of("values"))
     * .build())
     * .httpHeaderConfig(HttpHeaderConfigProperty.builder()
     * .httpHeaderName("httpHeaderName")
     * .values(List.of("values"))
     * .build())
     * .httpRequestMethodConfig(HttpRequestMethodConfigProperty.builder()
     * .values(List.of("values"))
     * .build())
     * .pathPatternConfig(PathPatternConfigProperty.builder()
     * .values(List.of("values"))
     * .build())
     * .queryStringConfig(QueryStringConfigProperty.builder()
     * .values(List.of(QueryStringKeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .sourceIpConfig(SourceIpConfigProperty.builder()
     * .values(List.of("values"))
     * .build())
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html)
     */
    public inline fun cfnListenerRuleRuleConditionProperty(
        block: CfnListenerRuleRuleConditionPropertyDsl.() -> Unit = {}
    ): CfnListenerRule.RuleConditionProperty {
        val builder = CfnListenerRuleRuleConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a source IP condition.
     *
     * You can use this condition to route based on the IP address of the source that connects to
     * the load balancer. If a client is behind a proxy, this is the IP address of the proxy not the
     * IP address of the client.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * SourceIpConfigProperty sourceIpConfigProperty = SourceIpConfigProperty.builder()
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-sourceipconfig.html)
     */
    public inline fun cfnListenerRuleSourceIpConfigProperty(
        block: CfnListenerRuleSourceIpConfigPropertyDsl.() -> Unit = {}
    ): CfnListenerRule.SourceIpConfigProperty {
        val builder = CfnListenerRuleSourceIpConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the target group stickiness for a rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * TargetGroupStickinessConfigProperty targetGroupStickinessConfigProperty =
     * TargetGroupStickinessConfigProperty.builder()
     * .durationSeconds(123)
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig.html)
     */
    public inline fun cfnListenerRuleTargetGroupStickinessConfigProperty(
        block: CfnListenerRuleTargetGroupStickinessConfigPropertyDsl.() -> Unit = {}
    ): CfnListenerRule.TargetGroupStickinessConfigProperty {
        val builder = CfnListenerRuleTargetGroupStickinessConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about how traffic will be distributed between multiple target groups in a forward
     * rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * TargetGroupTupleProperty targetGroupTupleProperty = TargetGroupTupleProperty.builder()
     * .targetGroupArn("targetGroupArn")
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgrouptuple.html)
     */
    public inline fun cfnListenerRuleTargetGroupTupleProperty(
        block: CfnListenerRuleTargetGroupTuplePropertyDsl.() -> Unit = {}
    ): CfnListenerRule.TargetGroupTupleProperty {
        val builder = CfnListenerRuleTargetGroupTuplePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the target group stickiness for a rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * TargetGroupStickinessConfigProperty targetGroupStickinessConfigProperty =
     * TargetGroupStickinessConfigProperty.builder()
     * .durationSeconds(123)
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgroupstickinessconfig.html)
     */
    public inline fun cfnListenerTargetGroupStickinessConfigProperty(
        block: CfnListenerTargetGroupStickinessConfigPropertyDsl.() -> Unit = {}
    ): CfnListener.TargetGroupStickinessConfigProperty {
        val builder = CfnListenerTargetGroupStickinessConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about how traffic will be distributed between multiple target groups in a forward
     * rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * TargetGroupTupleProperty targetGroupTupleProperty = TargetGroupTupleProperty.builder()
     * .targetGroupArn("targetGroupArn")
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgrouptuple.html)
     */
    public inline fun cfnListenerTargetGroupTupleProperty(
        block: CfnListenerTargetGroupTuplePropertyDsl.() -> Unit = {}
    ): CfnListener.TargetGroupTupleProperty {
        val builder = CfnListenerTargetGroupTuplePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Application Load Balancer, a Network Load Balancer, or a Gateway Load Balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * CfnLoadBalancer cfnLoadBalancer = CfnLoadBalancer.Builder.create(this, "MyCfnLoadBalancer")
     * .ipAddressType("ipAddressType")
     * .loadBalancerAttributes(List.of(LoadBalancerAttributeProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .name("name")
     * .scheme("scheme")
     * .securityGroups(List.of("securityGroups"))
     * .subnetMappings(List.of(SubnetMappingProperty.builder()
     * .subnetId("subnetId")
     * // the properties below are optional
     * .allocationId("allocationId")
     * .iPv6Address("iPv6Address")
     * .privateIPv4Address("privateIPv4Address")
     * .build()))
     * .subnets(List.of("subnets"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html)
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
     * Specifies an attribute for an Application Load Balancer, a Network Load Balancer, or a
     * Gateway Load Balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * LoadBalancerAttributeProperty loadBalancerAttributeProperty =
     * LoadBalancerAttributeProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-loadbalancerattribute.html)
     */
    public inline fun cfnLoadBalancerLoadBalancerAttributeProperty(
        block: CfnLoadBalancerLoadBalancerAttributePropertyDsl.() -> Unit = {}
    ): CfnLoadBalancer.LoadBalancerAttributeProperty {
        val builder = CfnLoadBalancerLoadBalancerAttributePropertyDsl()
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
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * CfnLoadBalancerProps cfnLoadBalancerProps = CfnLoadBalancerProps.builder()
     * .ipAddressType("ipAddressType")
     * .loadBalancerAttributes(List.of(LoadBalancerAttributeProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .name("name")
     * .scheme("scheme")
     * .securityGroups(List.of("securityGroups"))
     * .subnetMappings(List.of(SubnetMappingProperty.builder()
     * .subnetId("subnetId")
     * // the properties below are optional
     * .allocationId("allocationId")
     * .iPv6Address("iPv6Address")
     * .privateIPv4Address("privateIPv4Address")
     * .build()))
     * .subnets(List.of("subnets"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html)
     */
    public inline fun cfnLoadBalancerProps(
        block: CfnLoadBalancerPropsDsl.() -> Unit = {}
    ): CfnLoadBalancerProps {
        val builder = CfnLoadBalancerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a subnet for a load balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * SubnetMappingProperty subnetMappingProperty = SubnetMappingProperty.builder()
     * .subnetId("subnetId")
     * // the properties below are optional
     * .allocationId("allocationId")
     * .iPv6Address("iPv6Address")
     * .privateIPv4Address("privateIPv4Address")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-subnetmapping.html)
     */
    public inline fun cfnLoadBalancerSubnetMappingProperty(
        block: CfnLoadBalancerSubnetMappingPropertyDsl.() -> Unit = {}
    ): CfnLoadBalancer.SubnetMappingProperty {
        val builder = CfnLoadBalancerSubnetMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a target group for an Application Load Balancer, a Network Load Balancer, or a
     * Gateway Load Balancer.
     *
     * Before you register a Lambda function as a target, you must create a
     * `AWS::Lambda::Permission` resource that grants the Elastic Load Balancing service principal
     * permission to invoke the Lambda function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * CfnTargetGroup cfnTargetGroup = CfnTargetGroup.Builder.create(this, "MyCfnTargetGroup")
     * .healthCheckEnabled(false)
     * .healthCheckIntervalSeconds(123)
     * .healthCheckPath("healthCheckPath")
     * .healthCheckPort("healthCheckPort")
     * .healthCheckProtocol("healthCheckProtocol")
     * .healthCheckTimeoutSeconds(123)
     * .healthyThresholdCount(123)
     * .ipAddressType("ipAddressType")
     * .matcher(MatcherProperty.builder()
     * .grpcCode("grpcCode")
     * .httpCode("httpCode")
     * .build())
     * .name("name")
     * .port(123)
     * .protocol("protocol")
     * .protocolVersion("protocolVersion")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targetGroupAttributes(List.of(TargetGroupAttributeProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targets(List.of(TargetDescriptionProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .availabilityZone("availabilityZone")
     * .port(123)
     * .build()))
     * .targetType("targetType")
     * .unhealthyThresholdCount(123)
     * .vpcId("vpcId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html)
     */
    public inline fun cfnTargetGroup(
        scope: Construct,
        id: String,
        block: CfnTargetGroupDsl.() -> Unit = {},
    ): CfnTargetGroup {
        val builder = CfnTargetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the HTTP codes that healthy targets must use when responding to an HTTP health
     * check.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * MatcherProperty matcherProperty = MatcherProperty.builder()
     * .grpcCode("grpcCode")
     * .httpCode("httpCode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html)
     */
    public inline fun cfnTargetGroupMatcherProperty(
        block: CfnTargetGroupMatcherPropertyDsl.() -> Unit = {}
    ): CfnTargetGroup.MatcherProperty {
        val builder = CfnTargetGroupMatcherPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTargetGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * CfnTargetGroupProps cfnTargetGroupProps = CfnTargetGroupProps.builder()
     * .healthCheckEnabled(false)
     * .healthCheckIntervalSeconds(123)
     * .healthCheckPath("healthCheckPath")
     * .healthCheckPort("healthCheckPort")
     * .healthCheckProtocol("healthCheckProtocol")
     * .healthCheckTimeoutSeconds(123)
     * .healthyThresholdCount(123)
     * .ipAddressType("ipAddressType")
     * .matcher(MatcherProperty.builder()
     * .grpcCode("grpcCode")
     * .httpCode("httpCode")
     * .build())
     * .name("name")
     * .port(123)
     * .protocol("protocol")
     * .protocolVersion("protocolVersion")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targetGroupAttributes(List.of(TargetGroupAttributeProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targets(List.of(TargetDescriptionProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .availabilityZone("availabilityZone")
     * .port(123)
     * .build()))
     * .targetType("targetType")
     * .unhealthyThresholdCount(123)
     * .vpcId("vpcId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html)
     */
    public inline fun cfnTargetGroupProps(
        block: CfnTargetGroupPropsDsl.() -> Unit = {}
    ): CfnTargetGroupProps {
        val builder = CfnTargetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a target to add to a target group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * TargetDescriptionProperty targetDescriptionProperty = TargetDescriptionProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .availabilityZone("availabilityZone")
     * .port(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html)
     */
    public inline fun cfnTargetGroupTargetDescriptionProperty(
        block: CfnTargetGroupTargetDescriptionPropertyDsl.() -> Unit = {}
    ): CfnTargetGroup.TargetDescriptionProperty {
        val builder = CfnTargetGroupTargetDescriptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a target group attribute.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * TargetGroupAttributeProperty targetGroupAttributeProperty =
     * TargetGroupAttributeProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html)
     */
    public inline fun cfnTargetGroupTargetGroupAttributeProperty(
        block: CfnTargetGroupTargetGroupAttributePropertyDsl.() -> Unit = {}
    ): CfnTargetGroup.TargetGroupAttributeProperty {
        val builder = CfnTargetGroupTargetGroupAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for `ListenerAction.fixedResponse()`.
     *
     * Example:
     * ```
     * ApplicationListener listener;
     * listener.addAction("Fixed", AddApplicationActionProps.builder()
     * .priority(10)
     * .conditions(List.of(ListenerCondition.pathPatterns(List.of("/ok"))))
     * .action(ListenerAction.fixedResponse(200, FixedResponseOptions.builder()
     * .contentType("text/plain")
     * .messageBody("OK")
     * .build()))
     * .build());
     * ```
     */
    public inline fun fixedResponseOptions(
        block: FixedResponseOptionsDsl.() -> Unit = {}
    ): FixedResponseOptions {
        val builder = FixedResponseOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for `ListenerAction.forward()`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ForwardOptions forwardOptions = ForwardOptions.builder()
     * .stickinessDuration(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun forwardOptions(block: ForwardOptionsDsl.() -> Unit = {}): ForwardOptions {
        val builder = ForwardOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for configuring a health check.
     *
     * Example:
     * ```
     * Cluster cluster;
     * ApplicationLoadBalancedFargateService loadBalancedFargateService =
     * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .cpu(512)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .command(List.of("command"))
     * .entryPoint(List.of("entry", "point"))
     * .build())
     * .build();
     * loadBalancedFargateService.targetGroup.configureHealthCheck(HealthCheck.builder()
     * .path("/custom-health-path")
     * .build());
     * ```
     */
    public inline fun healthCheck(block: HealthCheckDsl.() -> Unit = {}): HealthCheck {
        val builder = HealthCheckDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Result of attaching a target to load balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * Object targetJson;
     * LoadBalancerTargetProps loadBalancerTargetProps = LoadBalancerTargetProps.builder()
     * .targetType(TargetType.INSTANCE)
     * // the properties below are optional
     * .targetJson(targetJson)
     * .build();
     * ```
     */
    public inline fun loadBalancerTargetProps(
        block: LoadBalancerTargetPropsDsl.() -> Unit = {}
    ): LoadBalancerTargetProps {
        val builder = LoadBalancerTargetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for `NetworkListenerAction.forward()`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * NetworkForwardOptions networkForwardOptions = NetworkForwardOptions.builder()
     * .stickinessDuration(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun networkForwardOptions(
        block: NetworkForwardOptionsDsl.() -> Unit = {}
    ): NetworkForwardOptions {
        val builder = NetworkForwardOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a Network Listener.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.apigatewayv2.integrations.alpha.HttpNlbIntegration;
     * Vpc vpc = new Vpc(this, "VPC");
     * NetworkLoadBalancer lb = NetworkLoadBalancer.Builder.create(this, "lb").vpc(vpc).build();
     * NetworkListener listener = lb.addListener("listener",
     * BaseNetworkListenerProps.builder().port(80).build());
     * listener.addTargets("target", AddNetworkTargetsProps.builder()
     * .port(80)
     * .build());
     * HttpApi httpEndpoint = HttpApi.Builder.create(this, "HttpProxyPrivateApi")
     * .defaultIntegration(new HttpNlbIntegration("DefaultIntegration", listener))
     * .build();
     * ```
     */
    public inline fun networkListener(
        scope: Construct,
        id: String,
        block: NetworkListenerDsl.() -> Unit = {},
    ): NetworkListener {
        val builder = NetworkListenerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for looking up a network listener.
     *
     * Example:
     * ```
     * INetworkListener listener = NetworkListener.fromLookup(this, "ALBListener",
     * NetworkListenerLookupOptions.builder()
     * .loadBalancerTags(Map.of(
     * "Cluster", "MyClusterName"))
     * .listenerProtocol(Protocol.TCP)
     * .listenerPort(12345)
     * .build());
     * ```
     */
    public inline fun networkListenerLookupOptions(
        block: NetworkListenerLookupOptionsDsl.() -> Unit = {}
    ): NetworkListenerLookupOptions {
        val builder = NetworkListenerLookupOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a Network Listener attached to a Load Balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ListenerCertificate listenerCertificate;
     * NetworkListenerAction networkListenerAction;
     * NetworkLoadBalancer networkLoadBalancer;
     * NetworkTargetGroup networkTargetGroup;
     * NetworkListenerProps networkListenerProps = NetworkListenerProps.builder()
     * .loadBalancer(networkLoadBalancer)
     * .port(123)
     * // the properties below are optional
     * .alpnPolicy(AlpnPolicy.HTTP1_ONLY)
     * .certificates(List.of(listenerCertificate))
     * .defaultAction(networkListenerAction)
     * .defaultTargetGroups(List.of(networkTargetGroup))
     * .protocol(Protocol.HTTP)
     * .sslPolicy(SslPolicy.RECOMMENDED_TLS)
     * .build();
     * ```
     */
    public inline fun networkListenerProps(
        block: NetworkListenerPropsDsl.() -> Unit = {}
    ): NetworkListenerProps {
        val builder = NetworkListenerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a new network load balancer.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * Vpc vpc = new Vpc(this, "VPC");
     * NetworkLoadBalancer nlb = NetworkLoadBalancer.Builder.create(this, "NLB")
     * .vpc(vpc)
     * .build();
     * VpcLink link = VpcLink.Builder.create(this, "link")
     * .targets(List.of(nlb))
     * .build();
     * Integration integration = Integration.Builder.create()
     * .type(IntegrationType.HTTP_PROXY)
     * .options(IntegrationOptions.builder()
     * .connectionType(ConnectionType.VPC_LINK)
     * .vpcLink(link)
     * .build())
     * .build();
     * ```
     */
    public inline fun networkLoadBalancer(
        scope: Construct,
        id: String,
        block: NetworkLoadBalancerDsl.() -> Unit = {},
    ): NetworkLoadBalancer {
        val builder = NetworkLoadBalancerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to reference an existing load balancer.
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
    public inline fun networkLoadBalancerAttributes(
        block: NetworkLoadBalancerAttributesDsl.() -> Unit = {}
    ): NetworkLoadBalancerAttributes {
        val builder = NetworkLoadBalancerAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for looking up an NetworkLoadBalancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * NetworkLoadBalancerLookupOptions networkLoadBalancerLookupOptions =
     * NetworkLoadBalancerLookupOptions.builder()
     * .loadBalancerArn("loadBalancerArn")
     * .loadBalancerTags(Map.of(
     * "loadBalancerTagsKey", "loadBalancerTags"))
     * .build();
     * ```
     */
    public inline fun networkLoadBalancerLookupOptions(
        block: NetworkLoadBalancerLookupOptionsDsl.() -> Unit = {}
    ): NetworkLoadBalancerLookupOptions {
        val builder = NetworkLoadBalancerLookupOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a network load balancer.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * Vpc vpc = new Vpc(this, "VPC");
     * NetworkLoadBalancer nlb = NetworkLoadBalancer.Builder.create(this, "NLB")
     * .vpc(vpc)
     * .build();
     * VpcLink link = VpcLink.Builder.create(this, "link")
     * .targets(List.of(nlb))
     * .build();
     * Integration integration = Integration.Builder.create()
     * .type(IntegrationType.HTTP_PROXY)
     * .options(IntegrationOptions.builder()
     * .connectionType(ConnectionType.VPC_LINK)
     * .vpcLink(link)
     * .build())
     * .build();
     * ```
     */
    public inline fun networkLoadBalancerProps(
        block: NetworkLoadBalancerPropsDsl.() -> Unit = {}
    ): NetworkLoadBalancerProps {
        val builder = NetworkLoadBalancerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a Network Target Group.
     *
     * Example:
     * ```
     * NetworkListener listener;
     * AutoScalingGroup asg1;
     * AutoScalingGroup asg2;
     * NetworkTargetGroup group = listener.addTargets("AppFleet", AddNetworkTargetsProps.builder()
     * .port(443)
     * .targets(List.of(asg1))
     * .build());
     * group.addTarget(asg2);
     * ```
     */
    public inline fun networkTargetGroup(
        scope: Construct,
        id: String,
        block: NetworkTargetGroupDsl.() -> Unit = {},
    ): NetworkTargetGroup {
        val builder = NetworkTargetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a new Network Target Group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * INetworkLoadBalancerTarget networkLoadBalancerTarget;
     * Vpc vpc;
     * NetworkTargetGroupProps networkTargetGroupProps = NetworkTargetGroupProps.builder()
     * .port(123)
     * // the properties below are optional
     * .connectionTermination(false)
     * .deregistrationDelay(Duration.minutes(30))
     * .healthCheck(HealthCheck.builder()
     * .enabled(false)
     * .healthyGrpcCodes("healthyGrpcCodes")
     * .healthyHttpCodes("healthyHttpCodes")
     * .healthyThresholdCount(123)
     * .interval(Duration.minutes(30))
     * .path("path")
     * .port("port")
     * .protocol(Protocol.HTTP)
     * .timeout(Duration.minutes(30))
     * .unhealthyThresholdCount(123)
     * .build())
     * .preserveClientIp(false)
     * .protocol(Protocol.HTTP)
     * .proxyProtocolV2(false)
     * .targetGroupName("targetGroupName")
     * .targets(List.of(networkLoadBalancerTarget))
     * .targetType(TargetType.INSTANCE)
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun networkTargetGroupProps(
        block: NetworkTargetGroupPropsDsl.() -> Unit = {}
    ): NetworkTargetGroupProps {
        val builder = NetworkTargetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Target Group and weight combination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * NetworkTargetGroup networkTargetGroup;
     * NetworkWeightedTargetGroup networkWeightedTargetGroup = NetworkWeightedTargetGroup.builder()
     * .targetGroup(networkTargetGroup)
     * // the properties below are optional
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun networkWeightedTargetGroup(
        block: NetworkWeightedTargetGroupDsl.() -> Unit = {}
    ): NetworkWeightedTargetGroup {
        val builder = NetworkWeightedTargetGroupDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the key/value pair of the query string.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * QueryStringCondition queryStringCondition = QueryStringCondition.builder()
     * .value("value")
     * // the properties below are optional
     * .key("key")
     * .build();
     * ```
     */
    public inline fun queryStringCondition(
        block: QueryStringConditionDsl.() -> Unit = {}
    ): QueryStringCondition {
        val builder = QueryStringConditionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for `ListenerAction.redirect()`.
     *
     * A URI consists of the following components: protocol://hostname:port/path?query. You must
     * modify at least one of the following components to avoid a redirect loop: protocol, hostname,
     * port, or path. Any components that you do not modify retain their original values.
     *
     * You can reuse URI components using the following reserved keywords:
     * * `#{protocol}`
     * * `#{host}`
     * * `#{port}`
     * * `#{path}` (the leading "/" is removed)
     * * `#{query}`
     *
     * For example, you can change the path to "/new/#{path}", the hostname to "example.#{host}", or
     * the query to "#{query}&amp;value=xyz".
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * RedirectOptions redirectOptions = RedirectOptions.builder()
     * .host("host")
     * .path("path")
     * .permanent(false)
     * .port("port")
     * .protocol("protocol")
     * .query("query")
     * .build();
     * ```
     */
    public inline fun redirectOptions(block: RedirectOptionsDsl.() -> Unit = {}): RedirectOptions {
        val builder = RedirectOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to reference an existing target group.
     *
     * Example:
     * ```
     * Stack stack;
     * IApplicationTargetGroup targetGroup = ApplicationTargetGroup.fromTargetGroupAttributes(this,
     * "MyTargetGroup", TargetGroupAttributes.builder()
     * .targetGroupArn(Fn.importValue("TargetGroupArn"))
     * .loadBalancerArns(Fn.importValue("LoadBalancerArn"))
     * .build());
     * IApplicationTargetGroupMetrics targetGroupMetrics = targetGroup.getMetrics();
     * ```
     */
    public inline fun targetGroupAttributes(
        block: TargetGroupAttributesDsl.() -> Unit = {}
    ): TargetGroupAttributes {
        val builder = TargetGroupAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Target Group and weight combination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ApplicationTargetGroup applicationTargetGroup;
     * WeightedTargetGroup weightedTargetGroup = WeightedTargetGroup.builder()
     * .targetGroup(applicationTargetGroup)
     * // the properties below are optional
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun weightedTargetGroup(
        block: WeightedTargetGroupDsl.() -> Unit = {}
    ): WeightedTargetGroup {
        val builder = WeightedTargetGroupDsl()
        builder.apply(block)
        return builder.build()
    }
}
