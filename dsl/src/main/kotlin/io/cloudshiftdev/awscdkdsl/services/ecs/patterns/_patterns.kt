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

package io.cloudshiftdev.awscdkdsl.services.ecs.patterns

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2ServiceProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateServiceProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceBaseProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2Service
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2ServiceProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateServiceProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps
import software.amazon.awscdk.services.ecs.patterns.FargateServiceBaseProps
import software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2ServiceProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateService
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateServiceProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceBaseProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2Service
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2ServiceProps
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateServiceProps
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsServiceBaseProps
import software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2ServiceProps
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateService
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateServiceProps
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBaseProps
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskImageOptions
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps
import software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps
import software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps
import software.constructs.Construct

public object patterns {
    /**
     * Properties to define an application listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.certificatemanager.*;
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * Certificate certificate;
     * ApplicationListenerProps applicationListenerProps = ApplicationListenerProps.builder()
     * .name("name")
     * // the properties below are optional
     * .certificate(certificate)
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
     * An EC2 service running on an ECS cluster fronted by an application load balancer.
     *
     * Example:
     * ```
     * Cluster cluster;
     * ApplicationLoadBalancedEc2Service loadBalancedEcsService =
     * ApplicationLoadBalancedEc2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("test"))
     * .environment(Map.of(
     * "TEST_ENVIRONMENT_VARIABLE1", "test environment variable 1 value",
     * "TEST_ENVIRONMENT_VARIABLE2", "test environment variable 2 value"))
     * .command(List.of("command"))
     * .entryPoint(List.of("entry", "point"))
     * .build())
     * .desiredCount(2)
     * .build();
     * ```
     */
    public inline fun applicationLoadBalancedEc2Service(
        scope: Construct,
        id: String,
        block: ApplicationLoadBalancedEc2ServiceDsl.() -> Unit = {},
    ): ApplicationLoadBalancedEc2Service {
        val builder = ApplicationLoadBalancedEc2ServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the ApplicationLoadBalancedEc2Service service.
     *
     * Example:
     * ```
     * Cluster cluster;
     * ApplicationLoadBalancedEc2Service loadBalancedEcsService =
     * ApplicationLoadBalancedEc2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("test"))
     * .environment(Map.of(
     * "TEST_ENVIRONMENT_VARIABLE1", "test environment variable 1 value",
     * "TEST_ENVIRONMENT_VARIABLE2", "test environment variable 2 value"))
     * .command(List.of("command"))
     * .entryPoint(List.of("entry", "point"))
     * .build())
     * .desiredCount(2)
     * .build();
     * ```
     */
    public inline fun applicationLoadBalancedEc2ServiceProps(
        block: ApplicationLoadBalancedEc2ServicePropsDsl.() -> Unit = {}
    ): ApplicationLoadBalancedEc2ServiceProps {
        val builder = ApplicationLoadBalancedEc2ServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Fargate service running on an ECS cluster fronted by an application load balancer.
     *
     * Example:
     * ```
     * Cluster cluster;
     * ApplicationLoadBalancedFargateService loadBalancedFargateService =
     * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .desiredCount(1)
     * .cpu(512)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .taskSubnets(SubnetSelection.builder()
     * .subnets(List.of(Subnet.fromSubnetId(this, "subnet", "VpcISOLATEDSubnet1Subnet80F07FA0")))
     * .build())
     * .loadBalancerName("application-lb-name")
     * .build();
     * ```
     */
    public inline fun applicationLoadBalancedFargateService(
        scope: Construct,
        id: String,
        block: ApplicationLoadBalancedFargateServiceDsl.() -> Unit = {},
    ): ApplicationLoadBalancedFargateService {
        val builder = ApplicationLoadBalancedFargateServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the ApplicationLoadBalancedFargateService service.
     *
     * Example:
     * ```
     * Cluster cluster;
     * ApplicationLoadBalancedFargateService loadBalancedFargateService =
     * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .desiredCount(1)
     * .cpu(512)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .taskSubnets(SubnetSelection.builder()
     * .subnets(List.of(Subnet.fromSubnetId(this, "subnet", "VpcISOLATEDSubnet1Subnet80F07FA0")))
     * .build())
     * .loadBalancerName("application-lb-name")
     * .build();
     * ```
     */
    public inline fun applicationLoadBalancedFargateServiceProps(
        block: ApplicationLoadBalancedFargateServicePropsDsl.() -> Unit = {}
    ): ApplicationLoadBalancedFargateServiceProps {
        val builder = ApplicationLoadBalancedFargateServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the base ApplicationLoadBalancedEc2Service or
     * ApplicationLoadBalancedFargateService service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.certificatemanager.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.route53.*;
     * import software.amazon.awscdk.services.servicediscovery.*;
     * ApplicationLoadBalancer applicationLoadBalancer;
     * Certificate certificate;
     * Cluster cluster;
     * ContainerDefinition containerDefinition;
     * ContainerImage containerImage;
     * HostedZone hostedZone;
     * LogDriver logDriver;
     * INamespace namespace;
     * Role role;
     * Secret secret;
     * Vpc vpc;
     * ApplicationLoadBalancedServiceBaseProps applicationLoadBalancedServiceBaseProps =
     * ApplicationLoadBalancedServiceBaseProps.builder()
     * .capacityProviderStrategies(List.of(CapacityProviderStrategy.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .certificate(certificate)
     * .circuitBreaker(DeploymentCircuitBreaker.builder()
     * .rollback(false)
     * .build())
     * .cloudMapOptions(CloudMapOptions.builder()
     * .cloudMapNamespace(namespace)
     * .container(containerDefinition)
     * .containerPort(123)
     * .dnsRecordType(DnsRecordType.A)
     * .dnsTtl(Duration.minutes(30))
     * .failureThreshold(123)
     * .name("name")
     * .build())
     * .cluster(cluster)
     * .deploymentController(DeploymentController.builder()
     * .type(DeploymentControllerType.ECS)
     * .build())
     * .desiredCount(123)
     * .domainName("domainName")
     * .domainZone(hostedZone)
     * .enableECSManagedTags(false)
     * .enableExecuteCommand(false)
     * .healthCheckGracePeriod(Duration.minutes(30))
     * .idleTimeout(Duration.minutes(30))
     * .listenerPort(123)
     * .loadBalancer(applicationLoadBalancer)
     * .loadBalancerName("loadBalancerName")
     * .maxHealthyPercent(123)
     * .minHealthyPercent(123)
     * .openListener(false)
     * .propagateTags(PropagatedTagSource.SERVICE)
     * .protocol(ApplicationProtocol.HTTP)
     * .protocolVersion(ApplicationProtocolVersion.GRPC)
     * .publicLoadBalancer(false)
     * .recordType(ApplicationLoadBalancedServiceRecordType.ALIAS)
     * .redirectHTTP(false)
     * .serviceName("serviceName")
     * .sslPolicy(SslPolicy.RECOMMENDED_TLS)
     * .targetProtocol(ApplicationProtocol.HTTP)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
     * .image(containerImage)
     * // the properties below are optional
     * .command(List.of("command"))
     * .containerName("containerName")
     * .containerPort(123)
     * .dockerLabels(Map.of(
     * "dockerLabelsKey", "dockerLabels"))
     * .enableLogging(false)
     * .entryPoint(List.of("entryPoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .executionRole(role)
     * .family("family")
     * .logDriver(logDriver)
     * .secrets(Map.of(
     * "secretsKey", secret))
     * .taskRole(role)
     * .build())
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun applicationLoadBalancedServiceBaseProps(
        block: ApplicationLoadBalancedServiceBasePropsDsl.() -> Unit = {}
    ): ApplicationLoadBalancedServiceBaseProps {
        val builder = ApplicationLoadBalancedServiceBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Cluster cluster;
     * ApplicationLoadBalancedFargateService loadBalancedFargateService =
     * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .desiredCount(1)
     * .cpu(512)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .taskSubnets(SubnetSelection.builder()
     * .subnets(List.of(Subnet.fromSubnetId(this, "subnet", "VpcISOLATEDSubnet1Subnet80F07FA0")))
     * .build())
     * .loadBalancerName("application-lb-name")
     * .build();
     * ```
     */
    public inline fun applicationLoadBalancedTaskImageOptions(
        block: ApplicationLoadBalancedTaskImageOptionsDsl.() -> Unit = {}
    ): ApplicationLoadBalancedTaskImageOptions {
        val builder = ApplicationLoadBalancedTaskImageOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for configuring a new container.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.certificatemanager.Certificate;
     * import software.amazon.awscdk.services.ec2.InstanceType;
     * import software.amazon.awscdk.services.ecs.Cluster;
     * import software.amazon.awscdk.services.ecs.ContainerImage;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy;
     * import software.amazon.awscdk.services.route53.PublicHostedZone;
     * Vpc vpc = Vpc.Builder.create(this, "Vpc").maxAzs(1).build();
     * ApplicationMultipleTargetGroupsFargateService loadBalancedFargateService =
     * ApplicationMultipleTargetGroupsFargateService.Builder.create(this, "myService")
     * .cluster(Cluster.Builder.create(this, "EcsCluster").vpc(vpc).build())
     * .memoryLimitMiB(256)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageProps.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .enableExecuteCommand(true)
     * .loadBalancers(List.of(ApplicationLoadBalancerProps.builder()
     * .name("lb")
     * .idleTimeout(Duration.seconds(400))
     * .domainName("api.example.com")
     * .domainZone(PublicHostedZone.Builder.create(this,
     * "HostedZone").zoneName("example.com").build())
     * .listeners(List.of(ApplicationListenerProps.builder()
     * .name("listener")
     * .protocol(ApplicationProtocol.HTTPS)
     * .certificate(Certificate.fromCertificateArn(this, "Cert", "helloworld"))
     * .sslPolicy(SslPolicy.TLS12_EXT)
     * .build()))
     * .build(), ApplicationLoadBalancerProps.builder()
     * .name("lb2")
     * .idleTimeout(Duration.seconds(120))
     * .domainName("frontend.com")
     * .domainZone(PublicHostedZone.Builder.create(this,
     * "HostedZone").zoneName("frontend.com").build())
     * .listeners(List.of(ApplicationListenerProps.builder()
     * .name("listener2")
     * .protocol(ApplicationProtocol.HTTPS)
     * .certificate(Certificate.fromCertificateArn(this, "Cert2", "helloworld"))
     * .sslPolicy(SslPolicy.TLS12_EXT)
     * .build()))
     * .build()))
     * .targetGroups(List.of(ApplicationTargetProps.builder()
     * .containerPort(80)
     * .listener("listener")
     * .build(), ApplicationTargetProps.builder()
     * .containerPort(90)
     * .pathPattern("a/b/c")
     * .priority(10)
     * .listener("listener")
     * .build(), ApplicationTargetProps.builder()
     * .containerPort(443)
     * .listener("listener2")
     * .build(), ApplicationTargetProps.builder()
     * .containerPort(80)
     * .pathPattern("a/b/c")
     * .priority(10)
     * .listener("listener2")
     * .build()))
     * .build();
     * ```
     */
    public inline fun applicationLoadBalancedTaskImageProps(
        block: ApplicationLoadBalancedTaskImagePropsDsl.() -> Unit = {}
    ): ApplicationLoadBalancedTaskImageProps {
        val builder = ApplicationLoadBalancedTaskImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to define an application load balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.certificatemanager.*;
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * import software.amazon.awscdk.services.route53.*;
     * Certificate certificate;
     * HostedZone hostedZone;
     * ApplicationLoadBalancerProps applicationLoadBalancerProps =
     * ApplicationLoadBalancerProps.builder()
     * .listeners(List.of(ApplicationListenerProps.builder()
     * .name("name")
     * // the properties below are optional
     * .certificate(certificate)
     * .port(123)
     * .protocol(ApplicationProtocol.HTTP)
     * .sslPolicy(SslPolicy.RECOMMENDED_TLS)
     * .build()))
     * .name("name")
     * // the properties below are optional
     * .domainName("domainName")
     * .domainZone(hostedZone)
     * .idleTimeout(Duration.minutes(30))
     * .publicLoadBalancer(false)
     * .build();
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
     * An EC2 service running on an ECS cluster fronted by an application load balancer.
     *
     * Example:
     * ```
     * // One application load balancer with one listener and two target groups.
     * Cluster cluster;
     * ApplicationMultipleTargetGroupsEc2Service loadBalancedEc2Service =
     * ApplicationMultipleTargetGroupsEc2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(256)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageProps.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .targetGroups(List.of(ApplicationTargetProps.builder()
     * .containerPort(80)
     * .build(), ApplicationTargetProps.builder()
     * .containerPort(90)
     * .pathPattern("a/b/c")
     * .priority(10)
     * .build()))
     * .build();
     * ```
     */
    public inline fun applicationMultipleTargetGroupsEc2Service(
        scope: Construct,
        id: String,
        block: ApplicationMultipleTargetGroupsEc2ServiceDsl.() -> Unit = {},
    ): ApplicationMultipleTargetGroupsEc2Service {
        val builder = ApplicationMultipleTargetGroupsEc2ServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the ApplicationMultipleTargetGroupsEc2Service service.
     *
     * Example:
     * ```
     * // One application load balancer with one listener and two target groups.
     * Cluster cluster;
     * ApplicationMultipleTargetGroupsEc2Service loadBalancedEc2Service =
     * ApplicationMultipleTargetGroupsEc2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(256)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageProps.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .targetGroups(List.of(ApplicationTargetProps.builder()
     * .containerPort(80)
     * .build(), ApplicationTargetProps.builder()
     * .containerPort(90)
     * .pathPattern("a/b/c")
     * .priority(10)
     * .build()))
     * .build();
     * ```
     */
    public inline fun applicationMultipleTargetGroupsEc2ServiceProps(
        block: ApplicationMultipleTargetGroupsEc2ServicePropsDsl.() -> Unit = {}
    ): ApplicationMultipleTargetGroupsEc2ServiceProps {
        val builder = ApplicationMultipleTargetGroupsEc2ServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Fargate service running on an ECS cluster fronted by an application load balancer.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.certificatemanager.Certificate;
     * import software.amazon.awscdk.services.ec2.InstanceType;
     * import software.amazon.awscdk.services.ecs.Cluster;
     * import software.amazon.awscdk.services.ecs.ContainerImage;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy;
     * import software.amazon.awscdk.services.route53.PublicHostedZone;
     * Vpc vpc = Vpc.Builder.create(this, "Vpc").maxAzs(1).build();
     * ApplicationMultipleTargetGroupsFargateService loadBalancedFargateService =
     * ApplicationMultipleTargetGroupsFargateService.Builder.create(this, "myService")
     * .cluster(Cluster.Builder.create(this, "EcsCluster").vpc(vpc).build())
     * .memoryLimitMiB(256)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageProps.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .enableExecuteCommand(true)
     * .loadBalancers(List.of(ApplicationLoadBalancerProps.builder()
     * .name("lb")
     * .idleTimeout(Duration.seconds(400))
     * .domainName("api.example.com")
     * .domainZone(PublicHostedZone.Builder.create(this,
     * "HostedZone").zoneName("example.com").build())
     * .listeners(List.of(ApplicationListenerProps.builder()
     * .name("listener")
     * .protocol(ApplicationProtocol.HTTPS)
     * .certificate(Certificate.fromCertificateArn(this, "Cert", "helloworld"))
     * .sslPolicy(SslPolicy.TLS12_EXT)
     * .build()))
     * .build(), ApplicationLoadBalancerProps.builder()
     * .name("lb2")
     * .idleTimeout(Duration.seconds(120))
     * .domainName("frontend.com")
     * .domainZone(PublicHostedZone.Builder.create(this,
     * "HostedZone").zoneName("frontend.com").build())
     * .listeners(List.of(ApplicationListenerProps.builder()
     * .name("listener2")
     * .protocol(ApplicationProtocol.HTTPS)
     * .certificate(Certificate.fromCertificateArn(this, "Cert2", "helloworld"))
     * .sslPolicy(SslPolicy.TLS12_EXT)
     * .build()))
     * .build()))
     * .targetGroups(List.of(ApplicationTargetProps.builder()
     * .containerPort(80)
     * .listener("listener")
     * .build(), ApplicationTargetProps.builder()
     * .containerPort(90)
     * .pathPattern("a/b/c")
     * .priority(10)
     * .listener("listener")
     * .build(), ApplicationTargetProps.builder()
     * .containerPort(443)
     * .listener("listener2")
     * .build(), ApplicationTargetProps.builder()
     * .containerPort(80)
     * .pathPattern("a/b/c")
     * .priority(10)
     * .listener("listener2")
     * .build()))
     * .build();
     * ```
     */
    public inline fun applicationMultipleTargetGroupsFargateService(
        scope: Construct,
        id: String,
        block: ApplicationMultipleTargetGroupsFargateServiceDsl.() -> Unit = {},
    ): ApplicationMultipleTargetGroupsFargateService {
        val builder = ApplicationMultipleTargetGroupsFargateServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the ApplicationMultipleTargetGroupsFargateService service.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.certificatemanager.Certificate;
     * import software.amazon.awscdk.services.ec2.InstanceType;
     * import software.amazon.awscdk.services.ecs.Cluster;
     * import software.amazon.awscdk.services.ecs.ContainerImage;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy;
     * import software.amazon.awscdk.services.route53.PublicHostedZone;
     * Vpc vpc = Vpc.Builder.create(this, "Vpc").maxAzs(1).build();
     * ApplicationMultipleTargetGroupsFargateService loadBalancedFargateService =
     * ApplicationMultipleTargetGroupsFargateService.Builder.create(this, "myService")
     * .cluster(Cluster.Builder.create(this, "EcsCluster").vpc(vpc).build())
     * .memoryLimitMiB(256)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageProps.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .enableExecuteCommand(true)
     * .loadBalancers(List.of(ApplicationLoadBalancerProps.builder()
     * .name("lb")
     * .idleTimeout(Duration.seconds(400))
     * .domainName("api.example.com")
     * .domainZone(PublicHostedZone.Builder.create(this,
     * "HostedZone").zoneName("example.com").build())
     * .listeners(List.of(ApplicationListenerProps.builder()
     * .name("listener")
     * .protocol(ApplicationProtocol.HTTPS)
     * .certificate(Certificate.fromCertificateArn(this, "Cert", "helloworld"))
     * .sslPolicy(SslPolicy.TLS12_EXT)
     * .build()))
     * .build(), ApplicationLoadBalancerProps.builder()
     * .name("lb2")
     * .idleTimeout(Duration.seconds(120))
     * .domainName("frontend.com")
     * .domainZone(PublicHostedZone.Builder.create(this,
     * "HostedZone").zoneName("frontend.com").build())
     * .listeners(List.of(ApplicationListenerProps.builder()
     * .name("listener2")
     * .protocol(ApplicationProtocol.HTTPS)
     * .certificate(Certificate.fromCertificateArn(this, "Cert2", "helloworld"))
     * .sslPolicy(SslPolicy.TLS12_EXT)
     * .build()))
     * .build()))
     * .targetGroups(List.of(ApplicationTargetProps.builder()
     * .containerPort(80)
     * .listener("listener")
     * .build(), ApplicationTargetProps.builder()
     * .containerPort(90)
     * .pathPattern("a/b/c")
     * .priority(10)
     * .listener("listener")
     * .build(), ApplicationTargetProps.builder()
     * .containerPort(443)
     * .listener("listener2")
     * .build(), ApplicationTargetProps.builder()
     * .containerPort(80)
     * .pathPattern("a/b/c")
     * .priority(10)
     * .listener("listener2")
     * .build()))
     * .build();
     * ```
     */
    public inline fun applicationMultipleTargetGroupsFargateServiceProps(
        block: ApplicationMultipleTargetGroupsFargateServicePropsDsl.() -> Unit = {}
    ): ApplicationMultipleTargetGroupsFargateServiceProps {
        val builder = ApplicationMultipleTargetGroupsFargateServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the base ApplicationMultipleTargetGroupsEc2Service or
     * ApplicationMultipleTargetGroupsFargateService service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.certificatemanager.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.route53.*;
     * import software.amazon.awscdk.services.servicediscovery.*;
     * Certificate certificate;
     * Cluster cluster;
     * ContainerDefinition containerDefinition;
     * ContainerImage containerImage;
     * HostedZone hostedZone;
     * LogDriver logDriver;
     * INamespace namespace;
     * Role role;
     * Secret secret;
     * Vpc vpc;
     * ApplicationMultipleTargetGroupsServiceBaseProps applicationMultipleTargetGroupsServiceBaseProps
     * = ApplicationMultipleTargetGroupsServiceBaseProps.builder()
     * .cloudMapOptions(CloudMapOptions.builder()
     * .cloudMapNamespace(namespace)
     * .container(containerDefinition)
     * .containerPort(123)
     * .dnsRecordType(DnsRecordType.A)
     * .dnsTtl(Duration.minutes(30))
     * .failureThreshold(123)
     * .name("name")
     * .build())
     * .cluster(cluster)
     * .desiredCount(123)
     * .enableECSManagedTags(false)
     * .enableExecuteCommand(false)
     * .healthCheckGracePeriod(Duration.minutes(30))
     * .loadBalancers(List.of(ApplicationLoadBalancerProps.builder()
     * .listeners(List.of(ApplicationListenerProps.builder()
     * .name("name")
     * // the properties below are optional
     * .certificate(certificate)
     * .port(123)
     * .protocol(ApplicationProtocol.HTTP)
     * .sslPolicy(SslPolicy.RECOMMENDED_TLS)
     * .build()))
     * .name("name")
     * // the properties below are optional
     * .domainName("domainName")
     * .domainZone(hostedZone)
     * .idleTimeout(Duration.minutes(30))
     * .publicLoadBalancer(false)
     * .build()))
     * .propagateTags(PropagatedTagSource.SERVICE)
     * .serviceName("serviceName")
     * .targetGroups(List.of(ApplicationTargetProps.builder()
     * .containerPort(123)
     * // the properties below are optional
     * .hostHeader("hostHeader")
     * .listener("listener")
     * .pathPattern("pathPattern")
     * .priority(123)
     * .protocol(Protocol.TCP)
     * .build()))
     * .taskImageOptions(ApplicationLoadBalancedTaskImageProps.builder()
     * .image(containerImage)
     * // the properties below are optional
     * .containerName("containerName")
     * .containerPorts(List.of(123))
     * .dockerLabels(Map.of(
     * "dockerLabelsKey", "dockerLabels"))
     * .enableLogging(false)
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .executionRole(role)
     * .family("family")
     * .logDriver(logDriver)
     * .secrets(Map.of(
     * "secretsKey", secret))
     * .taskRole(role)
     * .build())
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun applicationMultipleTargetGroupsServiceBaseProps(
        block: ApplicationMultipleTargetGroupsServiceBasePropsDsl.() -> Unit = {}
    ): ApplicationMultipleTargetGroupsServiceBaseProps {
        val builder = ApplicationMultipleTargetGroupsServiceBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to define an application target group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * ApplicationTargetProps applicationTargetProps = ApplicationTargetProps.builder()
     * .containerPort(123)
     * // the properties below are optional
     * .hostHeader("hostHeader")
     * .listener("listener")
     * .pathPattern("pathPattern")
     * .priority(123)
     * .protocol(Protocol.TCP)
     * .build();
     * ```
     */
    public inline fun applicationTargetProps(
        block: ApplicationTargetPropsDsl.() -> Unit = {}
    ): ApplicationTargetProps {
        val builder = ApplicationTargetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * CpuArchitecture cpuArchitecture;
     * FargateTaskDefinition fargateTaskDefinition;
     * OperatingSystemFamily operatingSystemFamily;
     * FargateServiceBaseProps fargateServiceBaseProps = FargateServiceBaseProps.builder()
     * .cpu(123)
     * .memoryLimitMiB(123)
     * .platformVersion(FargatePlatformVersion.LATEST)
     * .runtimePlatform(RuntimePlatform.builder()
     * .cpuArchitecture(cpuArchitecture)
     * .operatingSystemFamily(operatingSystemFamily)
     * .build())
     * .taskDefinition(fargateTaskDefinition)
     * .build();
     * ```
     */
    public inline fun fargateServiceBaseProps(
        block: FargateServiceBasePropsDsl.() -> Unit = {}
    ): FargateServiceBaseProps {
        val builder = FargateServiceBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to define an network listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * NetworkListenerProps networkListenerProps = NetworkListenerProps.builder()
     * .name("name")
     * // the properties below are optional
     * .port(123)
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
     * An EC2 service running on an ECS cluster fronted by a network load balancer.
     *
     * Example:
     * ```
     * Cluster cluster;
     * NetworkLoadBalancedEc2Service loadBalancedEcsService =
     * NetworkLoadBalancedEc2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .taskImageOptions(NetworkLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("test"))
     * .environment(Map.of(
     * "TEST_ENVIRONMENT_VARIABLE1", "test environment variable 1 value",
     * "TEST_ENVIRONMENT_VARIABLE2", "test environment variable 2 value"))
     * .build())
     * .desiredCount(2)
     * .build();
     * ```
     */
    public inline fun networkLoadBalancedEc2Service(
        scope: Construct,
        id: String,
        block: NetworkLoadBalancedEc2ServiceDsl.() -> Unit = {},
    ): NetworkLoadBalancedEc2Service {
        val builder = NetworkLoadBalancedEc2ServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the NetworkLoadBalancedEc2Service service.
     *
     * Example:
     * ```
     * Cluster cluster;
     * NetworkLoadBalancedEc2Service loadBalancedEcsService =
     * NetworkLoadBalancedEc2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .taskImageOptions(NetworkLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("test"))
     * .environment(Map.of(
     * "TEST_ENVIRONMENT_VARIABLE1", "test environment variable 1 value",
     * "TEST_ENVIRONMENT_VARIABLE2", "test environment variable 2 value"))
     * .build())
     * .desiredCount(2)
     * .build();
     * ```
     */
    public inline fun networkLoadBalancedEc2ServiceProps(
        block: NetworkLoadBalancedEc2ServicePropsDsl.() -> Unit = {}
    ): NetworkLoadBalancedEc2ServiceProps {
        val builder = NetworkLoadBalancedEc2ServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Fargate service running on an ECS cluster fronted by a network load balancer.
     *
     * Example:
     * ```
     * Cluster cluster;
     * NetworkLoadBalancedFargateService loadBalancedFargateService =
     * NetworkLoadBalancedFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .cpu(512)
     * .taskImageOptions(NetworkLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .build();
     * ```
     */
    public inline fun networkLoadBalancedFargateService(
        scope: Construct,
        id: String,
        block: NetworkLoadBalancedFargateServiceDsl.() -> Unit = {},
    ): NetworkLoadBalancedFargateService {
        val builder = NetworkLoadBalancedFargateServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the NetworkLoadBalancedFargateService service.
     *
     * Example:
     * ```
     * Cluster cluster;
     * NetworkLoadBalancedFargateService loadBalancedFargateService =
     * NetworkLoadBalancedFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .cpu(512)
     * .taskImageOptions(NetworkLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .build();
     * ```
     */
    public inline fun networkLoadBalancedFargateServiceProps(
        block: NetworkLoadBalancedFargateServicePropsDsl.() -> Unit = {}
    ): NetworkLoadBalancedFargateServiceProps {
        val builder = NetworkLoadBalancedFargateServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the base NetworkLoadBalancedEc2Service or
     * NetworkLoadBalancedFargateService service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.route53.*;
     * import software.amazon.awscdk.services.servicediscovery.*;
     * Cluster cluster;
     * ContainerDefinition containerDefinition;
     * ContainerImage containerImage;
     * HostedZone hostedZone;
     * LogDriver logDriver;
     * INamespace namespace;
     * NetworkLoadBalancer networkLoadBalancer;
     * Role role;
     * Secret secret;
     * Vpc vpc;
     * NetworkLoadBalancedServiceBaseProps networkLoadBalancedServiceBaseProps =
     * NetworkLoadBalancedServiceBaseProps.builder()
     * .capacityProviderStrategies(List.of(CapacityProviderStrategy.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .circuitBreaker(DeploymentCircuitBreaker.builder()
     * .rollback(false)
     * .build())
     * .cloudMapOptions(CloudMapOptions.builder()
     * .cloudMapNamespace(namespace)
     * .container(containerDefinition)
     * .containerPort(123)
     * .dnsRecordType(DnsRecordType.A)
     * .dnsTtl(Duration.minutes(30))
     * .failureThreshold(123)
     * .name("name")
     * .build())
     * .cluster(cluster)
     * .deploymentController(DeploymentController.builder()
     * .type(DeploymentControllerType.ECS)
     * .build())
     * .desiredCount(123)
     * .domainName("domainName")
     * .domainZone(hostedZone)
     * .enableECSManagedTags(false)
     * .enableExecuteCommand(false)
     * .healthCheckGracePeriod(Duration.minutes(30))
     * .listenerPort(123)
     * .loadBalancer(networkLoadBalancer)
     * .maxHealthyPercent(123)
     * .minHealthyPercent(123)
     * .propagateTags(PropagatedTagSource.SERVICE)
     * .publicLoadBalancer(false)
     * .recordType(NetworkLoadBalancedServiceRecordType.ALIAS)
     * .serviceName("serviceName")
     * .taskImageOptions(NetworkLoadBalancedTaskImageOptions.builder()
     * .image(containerImage)
     * // the properties below are optional
     * .containerName("containerName")
     * .containerPort(123)
     * .dockerLabels(Map.of(
     * "dockerLabelsKey", "dockerLabels"))
     * .enableLogging(false)
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .executionRole(role)
     * .family("family")
     * .logDriver(logDriver)
     * .secrets(Map.of(
     * "secretsKey", secret))
     * .taskRole(role)
     * .build())
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun networkLoadBalancedServiceBaseProps(
        block: NetworkLoadBalancedServiceBasePropsDsl.() -> Unit = {}
    ): NetworkLoadBalancedServiceBaseProps {
        val builder = NetworkLoadBalancedServiceBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Cluster cluster;
     * NetworkLoadBalancedEc2Service loadBalancedEcsService =
     * NetworkLoadBalancedEc2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .taskImageOptions(NetworkLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("test"))
     * .environment(Map.of(
     * "TEST_ENVIRONMENT_VARIABLE1", "test environment variable 1 value",
     * "TEST_ENVIRONMENT_VARIABLE2", "test environment variable 2 value"))
     * .build())
     * .desiredCount(2)
     * .build();
     * ```
     */
    public inline fun networkLoadBalancedTaskImageOptions(
        block: NetworkLoadBalancedTaskImageOptionsDsl.() -> Unit = {}
    ): NetworkLoadBalancedTaskImageOptions {
        val builder = NetworkLoadBalancedTaskImageOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for configuring a new container.
     *
     * Example:
     * ```
     * // Two network load balancers, each with their own listener and target group.
     * Cluster cluster;
     * NetworkMultipleTargetGroupsEc2Service loadBalancedEc2Service =
     * NetworkMultipleTargetGroupsEc2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(256)
     * .taskImageOptions(NetworkLoadBalancedTaskImageProps.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .loadBalancers(List.of(NetworkLoadBalancerProps.builder()
     * .name("lb1")
     * .listeners(List.of(NetworkListenerProps.builder()
     * .name("listener1")
     * .build()))
     * .build(), NetworkLoadBalancerProps.builder()
     * .name("lb2")
     * .listeners(List.of(NetworkListenerProps.builder()
     * .name("listener2")
     * .build()))
     * .build()))
     * .targetGroups(List.of(NetworkTargetProps.builder()
     * .containerPort(80)
     * .listener("listener1")
     * .build(), NetworkTargetProps.builder()
     * .containerPort(90)
     * .listener("listener2")
     * .build()))
     * .build();
     * ```
     */
    public inline fun networkLoadBalancedTaskImageProps(
        block: NetworkLoadBalancedTaskImagePropsDsl.() -> Unit = {}
    ): NetworkLoadBalancedTaskImageProps {
        val builder = NetworkLoadBalancedTaskImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to define an network load balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * import software.amazon.awscdk.services.route53.*;
     * HostedZone hostedZone;
     * NetworkLoadBalancerProps networkLoadBalancerProps = NetworkLoadBalancerProps.builder()
     * .listeners(List.of(NetworkListenerProps.builder()
     * .name("name")
     * // the properties below are optional
     * .port(123)
     * .build()))
     * .name("name")
     * // the properties below are optional
     * .domainName("domainName")
     * .domainZone(hostedZone)
     * .publicLoadBalancer(false)
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
     * An EC2 service running on an ECS cluster fronted by a network load balancer.
     *
     * Example:
     * ```
     * // Two network load balancers, each with their own listener and target group.
     * Cluster cluster;
     * NetworkMultipleTargetGroupsEc2Service loadBalancedEc2Service =
     * NetworkMultipleTargetGroupsEc2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(256)
     * .taskImageOptions(NetworkLoadBalancedTaskImageProps.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .loadBalancers(List.of(NetworkLoadBalancerProps.builder()
     * .name("lb1")
     * .listeners(List.of(NetworkListenerProps.builder()
     * .name("listener1")
     * .build()))
     * .build(), NetworkLoadBalancerProps.builder()
     * .name("lb2")
     * .listeners(List.of(NetworkListenerProps.builder()
     * .name("listener2")
     * .build()))
     * .build()))
     * .targetGroups(List.of(NetworkTargetProps.builder()
     * .containerPort(80)
     * .listener("listener1")
     * .build(), NetworkTargetProps.builder()
     * .containerPort(90)
     * .listener("listener2")
     * .build()))
     * .build();
     * ```
     */
    public inline fun networkMultipleTargetGroupsEc2Service(
        scope: Construct,
        id: String,
        block: NetworkMultipleTargetGroupsEc2ServiceDsl.() -> Unit = {},
    ): NetworkMultipleTargetGroupsEc2Service {
        val builder = NetworkMultipleTargetGroupsEc2ServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the NetworkMultipleTargetGroupsEc2Service service.
     *
     * Example:
     * ```
     * // Two network load balancers, each with their own listener and target group.
     * Cluster cluster;
     * NetworkMultipleTargetGroupsEc2Service loadBalancedEc2Service =
     * NetworkMultipleTargetGroupsEc2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(256)
     * .taskImageOptions(NetworkLoadBalancedTaskImageProps.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .loadBalancers(List.of(NetworkLoadBalancerProps.builder()
     * .name("lb1")
     * .listeners(List.of(NetworkListenerProps.builder()
     * .name("listener1")
     * .build()))
     * .build(), NetworkLoadBalancerProps.builder()
     * .name("lb2")
     * .listeners(List.of(NetworkListenerProps.builder()
     * .name("listener2")
     * .build()))
     * .build()))
     * .targetGroups(List.of(NetworkTargetProps.builder()
     * .containerPort(80)
     * .listener("listener1")
     * .build(), NetworkTargetProps.builder()
     * .containerPort(90)
     * .listener("listener2")
     * .build()))
     * .build();
     * ```
     */
    public inline fun networkMultipleTargetGroupsEc2ServiceProps(
        block: NetworkMultipleTargetGroupsEc2ServicePropsDsl.() -> Unit = {}
    ): NetworkMultipleTargetGroupsEc2ServiceProps {
        val builder = NetworkMultipleTargetGroupsEc2ServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Fargate service running on an ECS cluster fronted by a network load balancer.
     *
     * Example:
     * ```
     * // Two network load balancers, each with their own listener and target group.
     * Cluster cluster;
     * NetworkMultipleTargetGroupsFargateService loadBalancedFargateService =
     * NetworkMultipleTargetGroupsFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(512)
     * .taskImageOptions(NetworkLoadBalancedTaskImageProps.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .loadBalancers(List.of(NetworkLoadBalancerProps.builder()
     * .name("lb1")
     * .listeners(List.of(NetworkListenerProps.builder()
     * .name("listener1")
     * .build()))
     * .build(), NetworkLoadBalancerProps.builder()
     * .name("lb2")
     * .listeners(List.of(NetworkListenerProps.builder()
     * .name("listener2")
     * .build()))
     * .build()))
     * .targetGroups(List.of(NetworkTargetProps.builder()
     * .containerPort(80)
     * .listener("listener1")
     * .build(), NetworkTargetProps.builder()
     * .containerPort(90)
     * .listener("listener2")
     * .build()))
     * .build();
     * ```
     */
    public inline fun networkMultipleTargetGroupsFargateService(
        scope: Construct,
        id: String,
        block: NetworkMultipleTargetGroupsFargateServiceDsl.() -> Unit = {},
    ): NetworkMultipleTargetGroupsFargateService {
        val builder = NetworkMultipleTargetGroupsFargateServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the NetworkMultipleTargetGroupsFargateService service.
     *
     * Example:
     * ```
     * // Two network load balancers, each with their own listener and target group.
     * Cluster cluster;
     * NetworkMultipleTargetGroupsFargateService loadBalancedFargateService =
     * NetworkMultipleTargetGroupsFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(512)
     * .taskImageOptions(NetworkLoadBalancedTaskImageProps.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .loadBalancers(List.of(NetworkLoadBalancerProps.builder()
     * .name("lb1")
     * .listeners(List.of(NetworkListenerProps.builder()
     * .name("listener1")
     * .build()))
     * .build(), NetworkLoadBalancerProps.builder()
     * .name("lb2")
     * .listeners(List.of(NetworkListenerProps.builder()
     * .name("listener2")
     * .build()))
     * .build()))
     * .targetGroups(List.of(NetworkTargetProps.builder()
     * .containerPort(80)
     * .listener("listener1")
     * .build(), NetworkTargetProps.builder()
     * .containerPort(90)
     * .listener("listener2")
     * .build()))
     * .build();
     * ```
     */
    public inline fun networkMultipleTargetGroupsFargateServiceProps(
        block: NetworkMultipleTargetGroupsFargateServicePropsDsl.() -> Unit = {}
    ): NetworkMultipleTargetGroupsFargateServiceProps {
        val builder = NetworkMultipleTargetGroupsFargateServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the base NetworkMultipleTargetGroupsEc2Service or
     * NetworkMultipleTargetGroupsFargateService service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.route53.*;
     * import software.amazon.awscdk.services.servicediscovery.*;
     * Cluster cluster;
     * ContainerDefinition containerDefinition;
     * ContainerImage containerImage;
     * HostedZone hostedZone;
     * LogDriver logDriver;
     * INamespace namespace;
     * Role role;
     * Secret secret;
     * Vpc vpc;
     * NetworkMultipleTargetGroupsServiceBaseProps networkMultipleTargetGroupsServiceBaseProps =
     * NetworkMultipleTargetGroupsServiceBaseProps.builder()
     * .cloudMapOptions(CloudMapOptions.builder()
     * .cloudMapNamespace(namespace)
     * .container(containerDefinition)
     * .containerPort(123)
     * .dnsRecordType(DnsRecordType.A)
     * .dnsTtl(Duration.minutes(30))
     * .failureThreshold(123)
     * .name("name")
     * .build())
     * .cluster(cluster)
     * .desiredCount(123)
     * .enableECSManagedTags(false)
     * .enableExecuteCommand(false)
     * .healthCheckGracePeriod(Duration.minutes(30))
     * .loadBalancers(List.of(NetworkLoadBalancerProps.builder()
     * .listeners(List.of(NetworkListenerProps.builder()
     * .name("name")
     * // the properties below are optional
     * .port(123)
     * .build()))
     * .name("name")
     * // the properties below are optional
     * .domainName("domainName")
     * .domainZone(hostedZone)
     * .publicLoadBalancer(false)
     * .build()))
     * .propagateTags(PropagatedTagSource.SERVICE)
     * .serviceName("serviceName")
     * .targetGroups(List.of(NetworkTargetProps.builder()
     * .containerPort(123)
     * // the properties below are optional
     * .listener("listener")
     * .build()))
     * .taskImageOptions(NetworkLoadBalancedTaskImageProps.builder()
     * .image(containerImage)
     * // the properties below are optional
     * .containerName("containerName")
     * .containerPorts(List.of(123))
     * .dockerLabels(Map.of(
     * "dockerLabelsKey", "dockerLabels"))
     * .enableLogging(false)
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .executionRole(role)
     * .family("family")
     * .logDriver(logDriver)
     * .secrets(Map.of(
     * "secretsKey", secret))
     * .taskRole(role)
     * .build())
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun networkMultipleTargetGroupsServiceBaseProps(
        block: NetworkMultipleTargetGroupsServiceBasePropsDsl.() -> Unit = {}
    ): NetworkMultipleTargetGroupsServiceBaseProps {
        val builder = NetworkMultipleTargetGroupsServiceBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to define a network load balancer target group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * NetworkTargetProps networkTargetProps = NetworkTargetProps.builder()
     * .containerPort(123)
     * // the properties below are optional
     * .listener("listener")
     * .build();
     * ```
     */
    public inline fun networkTargetProps(
        block: NetworkTargetPropsDsl.() -> Unit = {}
    ): NetworkTargetProps {
        val builder = NetworkTargetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Class to create a queue processing EC2 service.
     *
     * Example:
     * ```
     * Cluster cluster;
     * QueueProcessingEc2Service queueProcessingEc2Service =
     * QueueProcessingEc2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .image(ContainerImage.fromRegistry("test"))
     * .command(List.of("-c", "4", "amazon.com"))
     * .enableLogging(false)
     * .desiredTaskCount(2)
     * .environment(Map.of(
     * "TEST_ENVIRONMENT_VARIABLE1", "test environment variable 1 value",
     * "TEST_ENVIRONMENT_VARIABLE2", "test environment variable 2 value"))
     * .maxScalingCapacity(5)
     * .containerName("test")
     * .build();
     * ```
     */
    public inline fun queueProcessingEc2Service(
        scope: Construct,
        id: String,
        block: QueueProcessingEc2ServiceDsl.() -> Unit = {},
    ): QueueProcessingEc2Service {
        val builder = QueueProcessingEc2ServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the QueueProcessingEc2Service service.
     *
     * Example:
     * ```
     * Cluster cluster;
     * QueueProcessingEc2Service queueProcessingEc2Service =
     * QueueProcessingEc2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .image(ContainerImage.fromRegistry("test"))
     * .command(List.of("-c", "4", "amazon.com"))
     * .enableLogging(false)
     * .desiredTaskCount(2)
     * .environment(Map.of(
     * "TEST_ENVIRONMENT_VARIABLE1", "test environment variable 1 value",
     * "TEST_ENVIRONMENT_VARIABLE2", "test environment variable 2 value"))
     * .maxScalingCapacity(5)
     * .containerName("test")
     * .build();
     * ```
     */
    public inline fun queueProcessingEc2ServiceProps(
        block: QueueProcessingEc2ServicePropsDsl.() -> Unit = {}
    ): QueueProcessingEc2ServiceProps {
        val builder = QueueProcessingEc2ServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Class to create a queue processing Fargate service.
     *
     * Example:
     * ```
     * Cluster cluster;
     * cluster.enableFargateCapacityProviders();
     * QueueProcessingFargateService queueProcessingFargateService =
     * QueueProcessingFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(512)
     * .image(ContainerImage.fromRegistry("test"))
     * .capacityProviderStrategies(List.of(CapacityProviderStrategy.builder()
     * .capacityProvider("FARGATE_SPOT")
     * .weight(2)
     * .build(), CapacityProviderStrategy.builder()
     * .capacityProvider("FARGATE")
     * .weight(1)
     * .build()))
     * .build();
     * ```
     */
    public inline fun queueProcessingFargateService(
        scope: Construct,
        id: String,
        block: QueueProcessingFargateServiceDsl.() -> Unit = {},
    ): QueueProcessingFargateService {
        val builder = QueueProcessingFargateServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the QueueProcessingFargateService service.
     *
     * Example:
     * ```
     * Cluster cluster;
     * cluster.enableFargateCapacityProviders();
     * QueueProcessingFargateService queueProcessingFargateService =
     * QueueProcessingFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(512)
     * .image(ContainerImage.fromRegistry("test"))
     * .capacityProviderStrategies(List.of(CapacityProviderStrategy.builder()
     * .capacityProvider("FARGATE_SPOT")
     * .weight(2)
     * .build(), CapacityProviderStrategy.builder()
     * .capacityProvider("FARGATE")
     * .weight(1)
     * .build()))
     * .build();
     * ```
     */
    public inline fun queueProcessingFargateServiceProps(
        block: QueueProcessingFargateServicePropsDsl.() -> Unit = {}
    ): QueueProcessingFargateServiceProps {
        val builder = QueueProcessingFargateServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the base QueueProcessingEc2Service or QueueProcessingFargateService
     * service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * import software.amazon.awscdk.services.sqs.*;
     * Cluster cluster;
     * ContainerImage containerImage;
     * LogDriver logDriver;
     * Queue queue;
     * Secret secret;
     * Vpc vpc;
     * QueueProcessingServiceBaseProps queueProcessingServiceBaseProps =
     * QueueProcessingServiceBaseProps.builder()
     * .image(containerImage)
     * // the properties below are optional
     * .capacityProviderStrategies(List.of(CapacityProviderStrategy.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .circuitBreaker(DeploymentCircuitBreaker.builder()
     * .rollback(false)
     * .build())
     * .cluster(cluster)
     * .command(List.of("command"))
     * .deploymentController(DeploymentController.builder()
     * .type(DeploymentControllerType.ECS)
     * .build())
     * .enableECSManagedTags(false)
     * .enableExecuteCommand(false)
     * .enableLogging(false)
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .family("family")
     * .logDriver(logDriver)
     * .maxHealthyPercent(123)
     * .maxReceiveCount(123)
     * .maxScalingCapacity(123)
     * .minHealthyPercent(123)
     * .minScalingCapacity(123)
     * .propagateTags(PropagatedTagSource.SERVICE)
     * .queue(queue)
     * .retentionPeriod(Duration.minutes(30))
     * .scalingSteps(List.of(ScalingInterval.builder()
     * .change(123)
     * // the properties below are optional
     * .lower(123)
     * .upper(123)
     * .build()))
     * .secrets(Map.of(
     * "secretsKey", secret))
     * .serviceName("serviceName")
     * .visibilityTimeout(Duration.minutes(30))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun queueProcessingServiceBaseProps(
        block: QueueProcessingServiceBasePropsDsl.() -> Unit = {}
    ): QueueProcessingServiceBaseProps {
        val builder = QueueProcessingServiceBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A scheduled EC2 task that will be initiated off of CloudWatch Events.
     *
     * Example:
     * ```
     * // Instantiate an Amazon EC2 Task to run at a scheduled interval
     * Cluster cluster;
     * ScheduledEc2Task ecsScheduledTask = ScheduledEc2Task.Builder.create(this, "ScheduledTask")
     * .cluster(cluster)
     * .scheduledEc2TaskImageOptions(ScheduledEc2TaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .memoryLimitMiB(256)
     * .environment(Map.of("name", "TRIGGER", "value", "CloudWatch Events"))
     * .build())
     * .schedule(Schedule.expression("rate(1 minute)"))
     * .enabled(true)
     * .ruleName("sample-scheduled-task-rule")
     * .build();
     * ```
     */
    public inline fun scheduledEc2Task(
        scope: Construct,
        id: String,
        block: ScheduledEc2TaskDsl.() -> Unit = {},
    ): ScheduledEc2Task {
        val builder = ScheduledEc2TaskDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the ScheduledEc2Task using a task definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * Ec2TaskDefinition ec2TaskDefinition;
     * ScheduledEc2TaskDefinitionOptions scheduledEc2TaskDefinitionOptions =
     * ScheduledEc2TaskDefinitionOptions.builder()
     * .taskDefinition(ec2TaskDefinition)
     * .build();
     * ```
     */
    public inline fun scheduledEc2TaskDefinitionOptions(
        block: ScheduledEc2TaskDefinitionOptionsDsl.() -> Unit = {}
    ): ScheduledEc2TaskDefinitionOptions {
        val builder = ScheduledEc2TaskDefinitionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the ScheduledEc2Task using an image.
     *
     * Example:
     * ```
     * // Instantiate an Amazon EC2 Task to run at a scheduled interval
     * Cluster cluster;
     * ScheduledEc2Task ecsScheduledTask = ScheduledEc2Task.Builder.create(this, "ScheduledTask")
     * .cluster(cluster)
     * .scheduledEc2TaskImageOptions(ScheduledEc2TaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .memoryLimitMiB(256)
     * .environment(Map.of("name", "TRIGGER", "value", "CloudWatch Events"))
     * .build())
     * .schedule(Schedule.expression("rate(1 minute)"))
     * .enabled(true)
     * .ruleName("sample-scheduled-task-rule")
     * .build();
     * ```
     */
    public inline fun scheduledEc2TaskImageOptions(
        block: ScheduledEc2TaskImageOptionsDsl.() -> Unit = {}
    ): ScheduledEc2TaskImageOptions {
        val builder = ScheduledEc2TaskImageOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the ScheduledEc2Task task.
     *
     * Example:
     * ```
     * // Instantiate an Amazon EC2 Task to run at a scheduled interval
     * Cluster cluster;
     * ScheduledEc2Task ecsScheduledTask = ScheduledEc2Task.Builder.create(this, "ScheduledTask")
     * .cluster(cluster)
     * .scheduledEc2TaskImageOptions(ScheduledEc2TaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .memoryLimitMiB(256)
     * .environment(Map.of("name", "TRIGGER", "value", "CloudWatch Events"))
     * .build())
     * .schedule(Schedule.expression("rate(1 minute)"))
     * .enabled(true)
     * .ruleName("sample-scheduled-task-rule")
     * .build();
     * ```
     */
    public inline fun scheduledEc2TaskProps(
        block: ScheduledEc2TaskPropsDsl.() -> Unit = {}
    ): ScheduledEc2TaskProps {
        val builder = ScheduledEc2TaskPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A scheduled Fargate task that will be initiated off of CloudWatch Events.
     *
     * Example:
     * ```
     * Vpc vpc = Vpc.Builder.create(this, "Vpc").maxAzs(1).build();
     * Cluster cluster = Cluster.Builder.create(this, "EcsCluster").vpc(vpc).build();
     * ScheduledFargateTask scheduledFargateTask = ScheduledFargateTask.Builder.create(this,
     * "ScheduledFargateTask")
     * .cluster(cluster)
     * .scheduledFargateTaskImageOptions(ScheduledFargateTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .memoryLimitMiB(512)
     * .build())
     * .schedule(Schedule.expression("rate(1 minute)"))
     * .tags(List.of(Tag.builder()
     * .key("my-tag")
     * .value("my-tag-value")
     * .build()))
     * .build();
     * ```
     */
    public inline fun scheduledFargateTask(
        scope: Construct,
        id: String,
        block: ScheduledFargateTaskDsl.() -> Unit = {},
    ): ScheduledFargateTask {
        val builder = ScheduledFargateTaskDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the ScheduledFargateTask using a task definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * FargateTaskDefinition fargateTaskDefinition;
     * ScheduledFargateTaskDefinitionOptions scheduledFargateTaskDefinitionOptions =
     * ScheduledFargateTaskDefinitionOptions.builder()
     * .taskDefinition(fargateTaskDefinition)
     * .build();
     * ```
     */
    public inline fun scheduledFargateTaskDefinitionOptions(
        block: ScheduledFargateTaskDefinitionOptionsDsl.() -> Unit = {}
    ): ScheduledFargateTaskDefinitionOptions {
        val builder = ScheduledFargateTaskDefinitionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the ScheduledFargateTask using an image.
     *
     * Example:
     * ```
     * Vpc vpc = Vpc.Builder.create(this, "Vpc").maxAzs(1).build();
     * Cluster cluster = Cluster.Builder.create(this, "EcsCluster").vpc(vpc).build();
     * ScheduledFargateTask scheduledFargateTask = ScheduledFargateTask.Builder.create(this,
     * "ScheduledFargateTask")
     * .cluster(cluster)
     * .scheduledFargateTaskImageOptions(ScheduledFargateTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .memoryLimitMiB(512)
     * .build())
     * .schedule(Schedule.expression("rate(1 minute)"))
     * .tags(List.of(Tag.builder()
     * .key("my-tag")
     * .value("my-tag-value")
     * .build()))
     * .build();
     * ```
     */
    public inline fun scheduledFargateTaskImageOptions(
        block: ScheduledFargateTaskImageOptionsDsl.() -> Unit = {}
    ): ScheduledFargateTaskImageOptions {
        val builder = ScheduledFargateTaskImageOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the ScheduledFargateTask task.
     *
     * Example:
     * ```
     * Vpc vpc = Vpc.Builder.create(this, "Vpc").maxAzs(1).build();
     * Cluster cluster = Cluster.Builder.create(this, "EcsCluster").vpc(vpc).build();
     * ScheduledFargateTask scheduledFargateTask = ScheduledFargateTask.Builder.create(this,
     * "ScheduledFargateTask")
     * .cluster(cluster)
     * .scheduledFargateTaskImageOptions(ScheduledFargateTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .memoryLimitMiB(512)
     * .build())
     * .schedule(Schedule.expression("rate(1 minute)"))
     * .tags(List.of(Tag.builder()
     * .key("my-tag")
     * .value("my-tag-value")
     * .build()))
     * .build();
     * ```
     */
    public inline fun scheduledFargateTaskProps(
        block: ScheduledFargateTaskPropsDsl.() -> Unit = {}
    ): ScheduledFargateTaskProps {
        val builder = ScheduledFargateTaskPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the base ScheduledEc2Task or ScheduledFargateTask task.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * Cluster cluster;
     * Schedule schedule;
     * SecurityGroup securityGroup;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Vpc vpc;
     * ScheduledTaskBaseProps scheduledTaskBaseProps = ScheduledTaskBaseProps.builder()
     * .schedule(schedule)
     * // the properties below are optional
     * .cluster(cluster)
     * .desiredTaskCount(123)
     * .enabled(false)
     * .propagateTags(PropagatedTagSource.SERVICE)
     * .ruleName("ruleName")
     * .securityGroups(List.of(securityGroup))
     * .subnetSelection(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .tags(List.of(Tag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun scheduledTaskBaseProps(
        block: ScheduledTaskBasePropsDsl.() -> Unit = {}
    ): ScheduledTaskBaseProps {
        val builder = ScheduledTaskBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * ContainerImage containerImage;
     * LogDriver logDriver;
     * Secret secret;
     * ScheduledTaskImageProps scheduledTaskImageProps = ScheduledTaskImageProps.builder()
     * .image(containerImage)
     * // the properties below are optional
     * .command(List.of("command"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .logDriver(logDriver)
     * .secrets(Map.of(
     * "secretsKey", secret))
     * .build();
     * ```
     */
    public inline fun scheduledTaskImageProps(
        block: ScheduledTaskImagePropsDsl.() -> Unit = {}
    ): ScheduledTaskImageProps {
        val builder = ScheduledTaskImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
