@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.CapacityProviderStrategy
import io.cloudshiftdev.awscdk.services.ecs.CloudMapOptions
import io.cloudshiftdev.awscdk.services.ecs.DeploymentCircuitBreaker
import io.cloudshiftdev.awscdk.services.ecs.DeploymentController
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.FargateService
import io.cloudshiftdev.awscdk.services.ecs.FargateTaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.HealthCheck
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.RuntimePlatform
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IpAddressType
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.SslPolicy
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Fargate service running on an ECS cluster fronted by an application load balancer.
 *
 * Example:
 *
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
 * .build();
 * ScalableTaskCount scalableTarget =
 * loadBalancedFargateService.service.autoScaleTaskCount(EnableScalingProps.builder()
 * .minCapacity(1)
 * .maxCapacity(20)
 * .build());
 * scalableTarget.scaleOnCpuUtilization("CpuScaling", CpuUtilizationScalingProps.builder()
 * .targetUtilizationPercent(50)
 * .build());
 * scalableTarget.scaleOnMemoryUtilization("MemoryScaling", MemoryUtilizationScalingProps.builder()
 * .targetUtilizationPercent(50)
 * .build());
 * ```
 */
public open class ApplicationLoadBalancedFargateService(
  cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService,
) : ApplicationLoadBalancedServiceBase(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ApplicationLoadBalancedFargateServiceProps,
  ) :
      this(software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ApplicationLoadBalancedFargateServiceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ApplicationLoadBalancedFargateServiceProps.Builder.() -> Unit,
  ) : this(scope, id, ApplicationLoadBalancedFargateServiceProps(props)
  )

  /**
   * Determines whether the service will be assigned a public IP address.
   */
  public open fun assignPublicIp(): Boolean = unwrap(this).getAssignPublicIp()

  /**
   * The Fargate service in this construct.
   */
  public open fun service(): FargateService = unwrap(this).getService().let(FargateService::wrap)

  /**
   * The Fargate task definition in this construct.
   */
  public open fun taskDefinition(): FargateTaskDefinition =
      unwrap(this).getTaskDefinition().let(FargateTaskDefinition::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Determines whether the service will be assigned a public IP address.
     *
     * Default: false
     *
     * @param assignPublicIp Determines whether the service will be assigned a public IP address. 
     */
    public fun assignPublicIp(assignPublicIp: Boolean)

    /**
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     *
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service. 
     */
    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>)

    /**
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     *
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service. 
     */
    public fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy)

    /**
     * Certificate Manager certificate to associate with the load balancer.
     *
     * Setting this option will set the load balancer protocol to HTTPS.
     *
     * Default: - No certificate associated with the load balancer, if using
     * the HTTP protocol. For HTTPS, a DNS-validated certificate will be
     * created for the load balancer's specified domain name if a domain name
     * and domain zone are specified.
     *
     * @param certificate Certificate Manager certificate to associate with the load balancer. 
     */
    public fun certificate(certificate: ICertificate)

    /**
     * Whether to enable the deployment circuit breaker.
     *
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     *
     * Default: - disabled
     *
     * @param circuitBreaker Whether to enable the deployment circuit breaker. 
     */
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker)

    /**
     * Whether to enable the deployment circuit breaker.
     *
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     *
     * Default: - disabled
     *
     * @param circuitBreaker Whether to enable the deployment circuit breaker. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53375900e698a89ed6c2a3bd5a02d9e2db2b85bbc1cfef87b3529798504e0e39")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit)

    /**
     * The options for configuring an Amazon ECS service to use service discovery.
     *
     * Default: - AWS Cloud Map service discovery is not enabled.
     *
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery. 
     */
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions)

    /**
     * The options for configuring an Amazon ECS service to use service discovery.
     *
     * Default: - AWS Cloud Map service discovery is not enabled.
     *
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("891500c72276d1da3012f63b867e721424fc40548a70912e67a2bd2010251cd2")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit)

    /**
     * The name of the cluster that hosts the service.
     *
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     *
     * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be
     * created for you.
     *
     * @param cluster The name of the cluster that hosts the service. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * The number of cpu units used by the task.
     *
     * Valid values, which determines your range of valid values for the memory parameter:
     *
     * 256 (.25 vCPU) - Available memory values: 0.5GB, 1GB, 2GB
     *
     * 512 (.5 vCPU) - Available memory values: 1GB, 2GB, 3GB, 4GB
     *
     * 1024 (1 vCPU) - Available memory values: 2GB, 3GB, 4GB, 5GB, 6GB, 7GB, 8GB
     *
     * 2048 (2 vCPU) - Available memory values: Between 4GB and 16GB in 1GB increments
     *
     * 4096 (4 vCPU) - Available memory values: Between 8GB and 30GB in 1GB increments
     *
     * 8192 (8 vCPU) - Available memory values: Between 16GB and 60GB in 4GB increments
     *
     * 16384 (16 vCPU) - Available memory values: Between 32GB and 120GB in 8GB increments
     *
     * This default is set in the underlying FargateTaskDefinition construct.
     *
     * Default: 256
     *
     * @param cpu The number of cpu units used by the task. 
     */
    public fun cpu(cpu: Number)

    /**
     * Specifies which deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     *
     * Default: - Rolling update (ECS)
     *
     * @param deploymentController Specifies which deployment controller to use for the service. 
     */
    public fun deploymentController(deploymentController: DeploymentController)

    /**
     * Specifies which deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     *
     * Default: - Rolling update (ECS)
     *
     * @param deploymentController Specifies which deployment controller to use for the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ac2e1da145e387904c673f4de0d9b7971d2bcda436d17f56f9cc7af75d0e56d")
    public fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit)

    /**
     * The desired number of instantiations of the task definition to keep running on the service.
     *
     * The minimum value is 1
     *
     * Default: - The default is 1 for all new services and uses the existing service's desired
     * count
     * when updating an existing service.
     *
     * @param desiredCount The desired number of instantiations of the task definition to keep
     * running on the service. 
     */
    public fun desiredCount(desiredCount: Number)

    /**
     * The domain name for the service, e.g. "api.example.com.".
     *
     * Default: - No domain name.
     *
     * @param domainName The domain name for the service, e.g. "api.example.com.". 
     */
    public fun domainName(domainName: String)

    /**
     * The Route53 hosted zone for the domain, e.g. "example.com.".
     *
     * Default: - No Route53 hosted domain zone.
     *
     * @param domainZone The Route53 hosted zone for the domain, e.g. "example.com.". 
     */
    public fun domainZone(domainZone: IHostedZone)

    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     *
     * Default: false
     *
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     * within the service. 
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    /**
     * Whether ECS Exec should be enabled.
     *
     * Default: - false
     *
     * @param enableExecuteCommand Whether ECS Exec should be enabled. 
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    /**
     * The amount (in GiB) of ephemeral storage to be allocated to the task.
     *
     * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
     *
     * Only supported in Fargate platform version 1.4.0 or later.
     *
     * Default: Undefined, in which case, the task will receive 20GiB ephemeral storage.
     *
     * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to the
     * task. 
     */
    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number)

    /**
     * The health check command and associated configuration parameters for the container.
     *
     * Default: - Health check configuration from container.
     *
     * @param healthCheck The health check command and associated configuration parameters for the
     * container. 
     */
    public fun healthCheck(healthCheck: HealthCheck)

    /**
     * The health check command and associated configuration parameters for the container.
     *
     * Default: - Health check configuration from container.
     *
     * @param healthCheck The health check command and associated configuration parameters for the
     * container. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7515d26f0a9c0956e510f4f2d5fa34ca3674d4b39f553013be02b3c1559947b")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    /**
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy
     * Elastic Load Balancing target health checks after a task has first started.
     *
     * Default: - defaults to 60 seconds if at least one load balancer is in-use and it is not
     * already set
     *
     * @param healthCheckGracePeriod The period of time, in seconds, that the Amazon ECS service
     * scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first
     * started. 
     */
    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration)

    /**
     * The load balancer idle timeout, in seconds.
     *
     * Can be between 1 and 4000 seconds
     *
     * Default: - CloudFormation sets idle timeout to 60 seconds
     *
     * @param idleTimeout The load balancer idle timeout, in seconds. 
     */
    public fun idleTimeout(idleTimeout: Duration)

    /**
     * The type of IP address to use.
     *
     * Default: - IpAddressType.IPV4
     *
     * @param ipAddressType The type of IP address to use. 
     */
    public fun ipAddressType(ipAddressType: IpAddressType)

    /**
     * Listener port of the application load balancer that will serve traffic to the service.
     *
     * Default: - The default listener port is determined from the protocol (port 80 for HTTP,
     * port 443 for HTTPS). A domain name and zone must be also be specified if using HTTPS.
     *
     * @param listenerPort Listener port of the application load balancer that will serve traffic to
     * the service. 
     */
    public fun listenerPort(listenerPort: Number)

    /**
     * The application load balancer that will serve traffic to the service.
     *
     * The VPC attribute of a load balancer must be specified for it to be used
     * to create a new service with this pattern.
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - a new load balancer will be created.
     *
     * @param loadBalancer The application load balancer that will serve traffic to the service. 
     */
    public fun loadBalancer(loadBalancer: IApplicationLoadBalancer)

    /**
     * Name of the load balancer.
     *
     * Default: - Automatically generated name.
     *
     * @param loadBalancerName Name of the load balancer. 
     */
    public fun loadBalancerName(loadBalancerName: String)

    /**
     * The maximum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that can run in a service during a deployment.
     *
     * Default: - 100 if daemon, otherwise 200
     *
     * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that can run in a service during a deployment. 
     */
    public fun maxHealthyPercent(maxHealthyPercent: Number)

    /**
     * The amount (in MiB) of memory used by the task.
     *
     * This field is required and you must use one of the following values, which determines your
     * range of valid values
     * for the cpu parameter:
     *
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available cpu values: 256 (.25 vCPU)
     *
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available cpu values: 512 (.5 vCPU)
     *
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) -
     * Available cpu values: 1024 (1 vCPU)
     *
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu values:
     * 2048 (2 vCPU)
     *
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu values:
     * 4096 (4 vCPU)
     *
     * Between 16384 (16 GB) and 61440 (60 GB) in increments of 4096 (4 GB) - Available cpu values:
     * 8192 (8 vCPU)
     *
     * Between 32768 (32 GB) and 122880 (120 GB) in increments of 8192 (8 GB) - Available cpu
     * values: 16384 (16 vCPU)
     *
     * This default is set in the underlying FargateTaskDefinition construct.
     *
     * Default: 512
     *
     * @param memoryLimitMiB The amount (in MiB) of memory used by the task. 
     */
    public fun memoryLimitMiB(memoryLimitMiB: Number)

    /**
     * The minimum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that must continue to run and remain healthy during a deployment.
     *
     * Default: - 0 if daemon, otherwise 50
     *
     * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that must continue to run and remain healthy during a
     * deployment. 
     */
    public fun minHealthyPercent(minHealthyPercent: Number)

    /**
     * Determines whether or not the Security Group for the Load Balancer's Listener will be open to
     * all traffic by default.
     *
     * Default: true -- The security group allows ingress from all IP addresses.
     *
     * @param openListener Determines whether or not the Security Group for the Load Balancer's
     * Listener will be open to all traffic by default. 
     */
    public fun openListener(openListener: Boolean)

    /**
     * The platform version on which to run your service.
     *
     * If one is not specified, the LATEST platform version is used by default. For more
     * information, see
     * [AWS Fargate Platform
     * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * in the Amazon Elastic Container Service Developer Guide.
     *
     * Default: Latest
     *
     * @param platformVersion The platform version on which to run your service. 
     */
    public fun platformVersion(platformVersion: FargatePlatformVersion)

    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks
     * in the service.
     *
     * Tags can only be propagated to the tasks within the service during service creation.
     *
     * Default: - none
     *
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service. 
     */
    public fun propagateTags(propagateTags: PropagatedTagSource)

    /**
     * The protocol for connections from clients to the load balancer.
     *
     * The load balancer port is determined from the protocol (port 80 for
     * HTTP, port 443 for HTTPS).  If HTTPS, either a certificate or domain
     * name and domain zone must also be specified.
     *
     * Default: HTTP. If a certificate is specified, the protocol will be
     * set by default to HTTPS.
     *
     * @param protocol The protocol for connections from clients to the load balancer. 
     */
    public fun protocol(protocol: ApplicationProtocol)

    /**
     * The protocol version to use.
     *
     * Default: ApplicationProtocolVersion.HTTP1
     *
     * @param protocolVersion The protocol version to use. 
     */
    public fun protocolVersion(protocolVersion: ApplicationProtocolVersion)

    /**
     * Determines whether the Load Balancer will be internet-facing.
     *
     * Default: true
     *
     * @param publicLoadBalancer Determines whether the Load Balancer will be internet-facing. 
     */
    public fun publicLoadBalancer(publicLoadBalancer: Boolean)

    /**
     * Specifies whether the Route53 record should be a CNAME, an A record using the Alias feature
     * or no record at all.
     *
     * This is useful if you need to work with DNS systems that do not support alias records.
     *
     * Default: ApplicationLoadBalancedServiceRecordType.ALIAS
     *
     * @param recordType Specifies whether the Route53 record should be a CNAME, an A record using
     * the Alias feature or no record at all. 
     */
    public fun recordType(recordType: ApplicationLoadBalancedServiceRecordType)

    /**
     * Specifies whether the load balancer should redirect traffic on port 80 to port 443 to support
     * HTTP-&gt;HTTPS redirects This is only valid if the protocol of the ALB is HTTPS.
     *
     * Default: false
     *
     * @param redirectHttp Specifies whether the load balancer should redirect traffic on port 80 to
     * port 443 to support HTTP-&gt;HTTPS redirects This is only valid if the protocol of the ALB is
     * HTTPS. 
     */
    public fun redirectHttp(redirectHttp: Boolean)

    /**
     * The runtime platform of the task definition.
     *
     * Default: - If the property is undefined, `operatingSystemFamily` is LINUX and
     * `cpuArchitecture` is X86_64
     *
     * @param runtimePlatform The runtime platform of the task definition. 
     */
    public fun runtimePlatform(runtimePlatform: RuntimePlatform)

    /**
     * The runtime platform of the task definition.
     *
     * Default: - If the property is undefined, `operatingSystemFamily` is LINUX and
     * `cpuArchitecture` is X86_64
     *
     * @param runtimePlatform The runtime platform of the task definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e3cc82030ac0709da2b9ee5e07afa65a1eb9cd8c76ba437d462e0e8b12ed6d6")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

    /**
     * The security groups to associate with the service.
     *
     * If you do not specify a security group, a new security group is created.
     *
     * Default: - A new security group is created.
     *
     * @param securityGroups The security groups to associate with the service. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * The security groups to associate with the service.
     *
     * If you do not specify a security group, a new security group is created.
     *
     * Default: - A new security group is created.
     *
     * @param securityGroups The security groups to associate with the service. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * The name of the service.
     *
     * Default: - CloudFormation-generated name.
     *
     * @param serviceName The name of the service. 
     */
    public fun serviceName(serviceName: String)

    /**
     * The security policy that defines which ciphers and protocols are supported by the ALB
     * Listener.
     *
     * Default: - The recommended elastic load balancing security policy
     *
     * @param sslPolicy The security policy that defines which ciphers and protocols are supported
     * by the ALB Listener. 
     */
    public fun sslPolicy(sslPolicy: SslPolicy)

    /**
     * The protocol for connections from the load balancer to the ECS tasks.
     *
     * The default target port is determined from the protocol (port 80 for
     * HTTP, port 443 for HTTPS).
     *
     * Default: HTTP.
     *
     * @param targetProtocol The protocol for connections from the load balancer to the ECS tasks. 
     */
    public fun targetProtocol(targetProtocol: ApplicationProtocol)

    /**
     * The task definition to use for tasks in the service. TaskDefinition or TaskImageOptions must
     * be specified, but not both.
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - none
     *
     * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition or
     * TaskImageOptions must be specified, but not both. 
     */
    public fun taskDefinition(taskDefinition: FargateTaskDefinition)

    /**
     * The properties required to create a new task definition.
     *
     * TaskDefinition or TaskImageOptions must be specified, but not both.
     *
     * Default: none
     *
     * @param taskImageOptions The properties required to create a new task definition. 
     */
    public fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions)

    /**
     * The properties required to create a new task definition.
     *
     * TaskDefinition or TaskImageOptions must be specified, but not both.
     *
     * Default: none
     *
     * @param taskImageOptions The properties required to create a new task definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81c29c64cee2317741251630bc0e81fede33cbe8998ca166fc4147bb8c25f187")
    public
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions.Builder.() -> Unit)

    /**
     * The subnets to associate with the service.
     *
     * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
     * Private, Isolated, Public, in that order.
     *
     * @param taskSubnets The subnets to associate with the service. 
     */
    public fun taskSubnets(taskSubnets: SubnetSelection)

    /**
     * The subnets to associate with the service.
     *
     * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
     * Private, Isolated, Public, in that order.
     *
     * @param taskSubnets The subnets to associate with the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe5899cd4936a8b50473450bbed213967262447ef083039c12af605e35a0088a")
    public fun taskSubnets(taskSubnets: SubnetSelection.Builder.() -> Unit)

    /**
     * The VPC where the container instances will be launched or the elastic network interfaces
     * (ENIs) will be deployed.
     *
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     *
     * Default: - uses the VPC defined in the cluster or creates a new VPC.
     *
     * @param vpc The VPC where the container instances will be launched or the elastic network
     * interfaces (ENIs) will be deployed. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService.Builder =
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService.Builder.create(scope,
        id)

    /**
     * Determines whether the service will be assigned a public IP address.
     *
     * Default: false
     *
     * @param assignPublicIp Determines whether the service will be assigned a public IP address. 
     */
    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    /**
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     *
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service. 
     */
    override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy.Companion::unwrap))
    }

    /**
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     *
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service. 
     */
    override fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy): Unit =
        capacityProviderStrategies(capacityProviderStrategies.toList())

    /**
     * Certificate Manager certificate to associate with the load balancer.
     *
     * Setting this option will set the load balancer protocol to HTTPS.
     *
     * Default: - No certificate associated with the load balancer, if using
     * the HTTP protocol. For HTTPS, a DNS-validated certificate will be
     * created for the load balancer's specified domain name if a domain name
     * and domain zone are specified.
     *
     * @param certificate Certificate Manager certificate to associate with the load balancer. 
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate.Companion::unwrap))
    }

    /**
     * Whether to enable the deployment circuit breaker.
     *
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     *
     * Default: - disabled
     *
     * @param circuitBreaker Whether to enable the deployment circuit breaker. 
     */
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker.Companion::unwrap))
    }

    /**
     * Whether to enable the deployment circuit breaker.
     *
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     *
     * Default: - disabled
     *
     * @param circuitBreaker Whether to enable the deployment circuit breaker. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53375900e698a89ed6c2a3bd5a02d9e2db2b85bbc1cfef87b3529798504e0e39")
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit): Unit =
        circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    /**
     * The options for configuring an Amazon ECS service to use service discovery.
     *
     * Default: - AWS Cloud Map service discovery is not enabled.
     *
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery. 
     */
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions.Companion::unwrap))
    }

    /**
     * The options for configuring an Amazon ECS service to use service discovery.
     *
     * Default: - AWS Cloud Map service discovery is not enabled.
     *
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("891500c72276d1da3012f63b867e721424fc40548a70912e67a2bd2010251cd2")
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    /**
     * The name of the cluster that hosts the service.
     *
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     *
     * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be
     * created for you.
     *
     * @param cluster The name of the cluster that hosts the service. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * The number of cpu units used by the task.
     *
     * Valid values, which determines your range of valid values for the memory parameter:
     *
     * 256 (.25 vCPU) - Available memory values: 0.5GB, 1GB, 2GB
     *
     * 512 (.5 vCPU) - Available memory values: 1GB, 2GB, 3GB, 4GB
     *
     * 1024 (1 vCPU) - Available memory values: 2GB, 3GB, 4GB, 5GB, 6GB, 7GB, 8GB
     *
     * 2048 (2 vCPU) - Available memory values: Between 4GB and 16GB in 1GB increments
     *
     * 4096 (4 vCPU) - Available memory values: Between 8GB and 30GB in 1GB increments
     *
     * 8192 (8 vCPU) - Available memory values: Between 16GB and 60GB in 4GB increments
     *
     * 16384 (16 vCPU) - Available memory values: Between 32GB and 120GB in 8GB increments
     *
     * This default is set in the underlying FargateTaskDefinition construct.
     *
     * Default: 256
     *
     * @param cpu The number of cpu units used by the task. 
     */
    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * Specifies which deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     *
     * Default: - Rolling update (ECS)
     *
     * @param deploymentController Specifies which deployment controller to use for the service. 
     */
    override fun deploymentController(deploymentController: DeploymentController) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController.Companion::unwrap))
    }

    /**
     * Specifies which deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     *
     * Default: - Rolling update (ECS)
     *
     * @param deploymentController Specifies which deployment controller to use for the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ac2e1da145e387904c673f4de0d9b7971d2bcda436d17f56f9cc7af75d0e56d")
    override
        fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit):
        Unit = deploymentController(DeploymentController(deploymentController))

    /**
     * The desired number of instantiations of the task definition to keep running on the service.
     *
     * The minimum value is 1
     *
     * Default: - The default is 1 for all new services and uses the existing service's desired
     * count
     * when updating an existing service.
     *
     * @param desiredCount The desired number of instantiations of the task definition to keep
     * running on the service. 
     */
    override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    /**
     * The domain name for the service, e.g. "api.example.com.".
     *
     * Default: - No domain name.
     *
     * @param domainName The domain name for the service, e.g. "api.example.com.". 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The Route53 hosted zone for the domain, e.g. "example.com.".
     *
     * Default: - No Route53 hosted domain zone.
     *
     * @param domainZone The Route53 hosted zone for the domain, e.g. "example.com.". 
     */
    override fun domainZone(domainZone: IHostedZone) {
      cdkBuilder.domainZone(domainZone.let(IHostedZone.Companion::unwrap))
    }

    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     *
     * Default: false
     *
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     * within the service. 
     */
    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * Whether ECS Exec should be enabled.
     *
     * Default: - false
     *
     * @param enableExecuteCommand Whether ECS Exec should be enabled. 
     */
    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * The amount (in GiB) of ephemeral storage to be allocated to the task.
     *
     * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
     *
     * Only supported in Fargate platform version 1.4.0 or later.
     *
     * Default: Undefined, in which case, the task will receive 20GiB ephemeral storage.
     *
     * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to the
     * task. 
     */
    override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
      cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    /**
     * The health check command and associated configuration parameters for the container.
     *
     * Default: - Health check configuration from container.
     *
     * @param healthCheck The health check command and associated configuration parameters for the
     * container. 
     */
    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck.Companion::unwrap))
    }

    /**
     * The health check command and associated configuration parameters for the container.
     *
     * Default: - Health check configuration from container.
     *
     * @param healthCheck The health check command and associated configuration parameters for the
     * container. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7515d26f0a9c0956e510f4f2d5fa34ca3674d4b39f553013be02b3c1559947b")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    /**
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy
     * Elastic Load Balancing target health checks after a task has first started.
     *
     * Default: - defaults to 60 seconds if at least one load balancer is in-use and it is not
     * already set
     *
     * @param healthCheckGracePeriod The period of time, in seconds, that the Amazon ECS service
     * scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first
     * started. 
     */
    override fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration.Companion::unwrap))
    }

    /**
     * The load balancer idle timeout, in seconds.
     *
     * Can be between 1 and 4000 seconds
     *
     * Default: - CloudFormation sets idle timeout to 60 seconds
     *
     * @param idleTimeout The load balancer idle timeout, in seconds. 
     */
    override fun idleTimeout(idleTimeout: Duration) {
      cdkBuilder.idleTimeout(idleTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * The type of IP address to use.
     *
     * Default: - IpAddressType.IPV4
     *
     * @param ipAddressType The type of IP address to use. 
     */
    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType.Companion::unwrap))
    }

    /**
     * Listener port of the application load balancer that will serve traffic to the service.
     *
     * Default: - The default listener port is determined from the protocol (port 80 for HTTP,
     * port 443 for HTTPS). A domain name and zone must be also be specified if using HTTPS.
     *
     * @param listenerPort Listener port of the application load balancer that will serve traffic to
     * the service. 
     */
    override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    /**
     * The application load balancer that will serve traffic to the service.
     *
     * The VPC attribute of a load balancer must be specified for it to be used
     * to create a new service with this pattern.
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - a new load balancer will be created.
     *
     * @param loadBalancer The application load balancer that will serve traffic to the service. 
     */
    override fun loadBalancer(loadBalancer: IApplicationLoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(IApplicationLoadBalancer.Companion::unwrap))
    }

    /**
     * Name of the load balancer.
     *
     * Default: - Automatically generated name.
     *
     * @param loadBalancerName Name of the load balancer. 
     */
    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /**
     * The maximum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that can run in a service during a deployment.
     *
     * Default: - 100 if daemon, otherwise 200
     *
     * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that can run in a service during a deployment. 
     */
    override fun maxHealthyPercent(maxHealthyPercent: Number) {
      cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    /**
     * The amount (in MiB) of memory used by the task.
     *
     * This field is required and you must use one of the following values, which determines your
     * range of valid values
     * for the cpu parameter:
     *
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available cpu values: 256 (.25 vCPU)
     *
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available cpu values: 512 (.5 vCPU)
     *
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) -
     * Available cpu values: 1024 (1 vCPU)
     *
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu values:
     * 2048 (2 vCPU)
     *
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu values:
     * 4096 (4 vCPU)
     *
     * Between 16384 (16 GB) and 61440 (60 GB) in increments of 4096 (4 GB) - Available cpu values:
     * 8192 (8 vCPU)
     *
     * Between 32768 (32 GB) and 122880 (120 GB) in increments of 8192 (8 GB) - Available cpu
     * values: 16384 (16 vCPU)
     *
     * This default is set in the underlying FargateTaskDefinition construct.
     *
     * Default: 512
     *
     * @param memoryLimitMiB The amount (in MiB) of memory used by the task. 
     */
    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * The minimum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that must continue to run and remain healthy during a deployment.
     *
     * Default: - 0 if daemon, otherwise 50
     *
     * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that must continue to run and remain healthy during a
     * deployment. 
     */
    override fun minHealthyPercent(minHealthyPercent: Number) {
      cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    /**
     * Determines whether or not the Security Group for the Load Balancer's Listener will be open to
     * all traffic by default.
     *
     * Default: true -- The security group allows ingress from all IP addresses.
     *
     * @param openListener Determines whether or not the Security Group for the Load Balancer's
     * Listener will be open to all traffic by default. 
     */
    override fun openListener(openListener: Boolean) {
      cdkBuilder.openListener(openListener)
    }

    /**
     * The platform version on which to run your service.
     *
     * If one is not specified, the LATEST platform version is used by default. For more
     * information, see
     * [AWS Fargate Platform
     * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * in the Amazon Elastic Container Service Developer Guide.
     *
     * Default: Latest
     *
     * @param platformVersion The platform version on which to run your service. 
     */
    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion.Companion::unwrap))
    }

    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks
     * in the service.
     *
     * Tags can only be propagated to the tasks within the service during service creation.
     *
     * Default: - none
     *
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service. 
     */
    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource.Companion::unwrap))
    }

    /**
     * The protocol for connections from clients to the load balancer.
     *
     * The load balancer port is determined from the protocol (port 80 for
     * HTTP, port 443 for HTTPS).  If HTTPS, either a certificate or domain
     * name and domain zone must also be specified.
     *
     * Default: HTTP. If a certificate is specified, the protocol will be
     * set by default to HTTPS.
     *
     * @param protocol The protocol for connections from clients to the load balancer. 
     */
    override fun protocol(protocol: ApplicationProtocol) {
      cdkBuilder.protocol(protocol.let(ApplicationProtocol.Companion::unwrap))
    }

    /**
     * The protocol version to use.
     *
     * Default: ApplicationProtocolVersion.HTTP1
     *
     * @param protocolVersion The protocol version to use. 
     */
    override fun protocolVersion(protocolVersion: ApplicationProtocolVersion) {
      cdkBuilder.protocolVersion(protocolVersion.let(ApplicationProtocolVersion.Companion::unwrap))
    }

    /**
     * Determines whether the Load Balancer will be internet-facing.
     *
     * Default: true
     *
     * @param publicLoadBalancer Determines whether the Load Balancer will be internet-facing. 
     */
    override fun publicLoadBalancer(publicLoadBalancer: Boolean) {
      cdkBuilder.publicLoadBalancer(publicLoadBalancer)
    }

    /**
     * Specifies whether the Route53 record should be a CNAME, an A record using the Alias feature
     * or no record at all.
     *
     * This is useful if you need to work with DNS systems that do not support alias records.
     *
     * Default: ApplicationLoadBalancedServiceRecordType.ALIAS
     *
     * @param recordType Specifies whether the Route53 record should be a CNAME, an A record using
     * the Alias feature or no record at all. 
     */
    override fun recordType(recordType: ApplicationLoadBalancedServiceRecordType) {
      cdkBuilder.recordType(recordType.let(ApplicationLoadBalancedServiceRecordType.Companion::unwrap))
    }

    /**
     * Specifies whether the load balancer should redirect traffic on port 80 to port 443 to support
     * HTTP-&gt;HTTPS redirects This is only valid if the protocol of the ALB is HTTPS.
     *
     * Default: false
     *
     * @param redirectHttp Specifies whether the load balancer should redirect traffic on port 80 to
     * port 443 to support HTTP-&gt;HTTPS redirects This is only valid if the protocol of the ALB is
     * HTTPS. 
     */
    override fun redirectHttp(redirectHttp: Boolean) {
      cdkBuilder.redirectHttp(redirectHttp)
    }

    /**
     * The runtime platform of the task definition.
     *
     * Default: - If the property is undefined, `operatingSystemFamily` is LINUX and
     * `cpuArchitecture` is X86_64
     *
     * @param runtimePlatform The runtime platform of the task definition. 
     */
    override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform.Companion::unwrap))
    }

    /**
     * The runtime platform of the task definition.
     *
     * Default: - If the property is undefined, `operatingSystemFamily` is LINUX and
     * `cpuArchitecture` is X86_64
     *
     * @param runtimePlatform The runtime platform of the task definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e3cc82030ac0709da2b9ee5e07afa65a1eb9cd8c76ba437d462e0e8b12ed6d6")
    override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    /**
     * The security groups to associate with the service.
     *
     * If you do not specify a security group, a new security group is created.
     *
     * Default: - A new security group is created.
     *
     * @param securityGroups The security groups to associate with the service. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * The security groups to associate with the service.
     *
     * If you do not specify a security group, a new security group is created.
     *
     * Default: - A new security group is created.
     *
     * @param securityGroups The security groups to associate with the service. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * The name of the service.
     *
     * Default: - CloudFormation-generated name.
     *
     * @param serviceName The name of the service. 
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * The security policy that defines which ciphers and protocols are supported by the ALB
     * Listener.
     *
     * Default: - The recommended elastic load balancing security policy
     *
     * @param sslPolicy The security policy that defines which ciphers and protocols are supported
     * by the ALB Listener. 
     */
    override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy.Companion::unwrap))
    }

    /**
     * The protocol for connections from the load balancer to the ECS tasks.
     *
     * The default target port is determined from the protocol (port 80 for
     * HTTP, port 443 for HTTPS).
     *
     * Default: HTTP.
     *
     * @param targetProtocol The protocol for connections from the load balancer to the ECS tasks. 
     */
    override fun targetProtocol(targetProtocol: ApplicationProtocol) {
      cdkBuilder.targetProtocol(targetProtocol.let(ApplicationProtocol.Companion::unwrap))
    }

    /**
     * The task definition to use for tasks in the service. TaskDefinition or TaskImageOptions must
     * be specified, but not both.
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - none
     *
     * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition or
     * TaskImageOptions must be specified, but not both. 
     */
    override fun taskDefinition(taskDefinition: FargateTaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(FargateTaskDefinition.Companion::unwrap))
    }

    /**
     * The properties required to create a new task definition.
     *
     * TaskDefinition or TaskImageOptions must be specified, but not both.
     *
     * Default: none
     *
     * @param taskImageOptions The properties required to create a new task definition. 
     */
    override fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions) {
      cdkBuilder.taskImageOptions(taskImageOptions.let(ApplicationLoadBalancedTaskImageOptions.Companion::unwrap))
    }

    /**
     * The properties required to create a new task definition.
     *
     * TaskDefinition or TaskImageOptions must be specified, but not both.
     *
     * Default: none
     *
     * @param taskImageOptions The properties required to create a new task definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81c29c64cee2317741251630bc0e81fede33cbe8998ca166fc4147bb8c25f187")
    override
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions.Builder.() -> Unit):
        Unit = taskImageOptions(ApplicationLoadBalancedTaskImageOptions(taskImageOptions))

    /**
     * The subnets to associate with the service.
     *
     * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
     * Private, Isolated, Public, in that order.
     *
     * @param taskSubnets The subnets to associate with the service. 
     */
    override fun taskSubnets(taskSubnets: SubnetSelection) {
      cdkBuilder.taskSubnets(taskSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * The subnets to associate with the service.
     *
     * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
     * Private, Isolated, Public, in that order.
     *
     * @param taskSubnets The subnets to associate with the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe5899cd4936a8b50473450bbed213967262447ef083039c12af605e35a0088a")
    override fun taskSubnets(taskSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        taskSubnets(SubnetSelection(taskSubnets))

    /**
     * The VPC where the container instances will be launched or the elastic network interfaces
     * (ENIs) will be deployed.
     *
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     *
     * Default: - uses the VPC defined in the cluster or creates a new VPC.
     *
     * @param vpc The VPC where the container instances will be launched or the elastic network
     * interfaces (ENIs) will be deployed. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApplicationLoadBalancedFargateService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApplicationLoadBalancedFargateService(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService):
        ApplicationLoadBalancedFargateService = ApplicationLoadBalancedFargateService(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancedFargateService):
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService =
        wrapped.cdkObject as
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService
  }
}
