package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ecs.CapacityProviderStrategy
import io.cloudshiftdev.awscdk.services.ecs.CloudMapOptions
import io.cloudshiftdev.awscdk.services.ecs.DeploymentCircuitBreaker
import io.cloudshiftdev.awscdk.services.ecs.DeploymentController
import io.cloudshiftdev.awscdk.services.ecs.Ec2Service
import io.cloudshiftdev.awscdk.services.ecs.Ec2TaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PlacementConstraint
import io.cloudshiftdev.awscdk.services.ecs.PlacementStrategy
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.SslPolicy
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ApplicationLoadBalancedEc2Service internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service,
) : ApplicationLoadBalancedServiceBase(cdkObject) {
  /**
   * The EC2 service in this construct.
   */
  public open fun service(): Ec2Service = unwrap(this).getService().let(Ec2Service::wrap)

  /**
   * The EC2 Task Definition in this construct.
   */
  public open fun taskDefinition(): Ec2TaskDefinition =
      unwrap(this).getTaskDefinition().let(Ec2TaskDefinition::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service].
   */
  @CdkDslMarker
  public interface Builder {
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10fc607083a037dc7ec01db13219b492bc154729222e2b53fe636491435e641b")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e4e413a0412f83a2292e49e025145ab40fa59d499afeccb6e840e6735154f31")
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
     * This default is set in the underlying FargateTaskDefinition construct.
     *
     * Default: none
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a08a85e2c468ad5b38fa1b056b1624f26d42a104eb07346cf1d24d6ec940bbd2")
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
     * The hard limit (in MiB) of memory to present to the container.
     *
     * If your container attempts to exceed the allocated memory, the container
     * is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required.
     *
     * Default: - No memory limit.
     *
     * @param memoryLimitMiB The hard limit (in MiB) of memory to present to the container. 
     */
    public fun memoryLimitMiB(memoryLimitMiB: Number)

    /**
     * The soft limit (in MiB) of memory to reserve for the container.
     *
     * When system memory is under contention, Docker attempts to keep the
     * container memory within the limit. If the container requires more memory,
     * it can consume up to the value specified by the Memory property or all of
     * the available memory on the container instance—whichever comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required.
     *
     * Default: - No memory reserved.
     *
     * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container. 
     */
    public fun memoryReservationMiB(memoryReservationMiB: Number)

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
     * The placement constraints to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     *
     * Default: - No constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service. 
     */
    public fun placementConstraints(placementConstraints: List<PlacementConstraint>)

    /**
     * The placement constraints to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     *
     * Default: - No constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service. 
     */
    public fun placementConstraints(vararg placementConstraints: PlacementConstraint)

    /**
     * The placement strategies to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     *
     * Default: - No strategies.
     *
     * @param placementStrategies The placement strategies to use for tasks in the service. 
     */
    public fun placementStrategies(placementStrategies: List<PlacementStrategy>)

    /**
     * The placement strategies to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     *
     * Default: - No strategies.
     *
     * @param placementStrategies The placement strategies to use for tasks in the service. 
     */
    public fun placementStrategies(vararg placementStrategies: PlacementStrategy)

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
     * be specified, but not both..
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - none
     *
     * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition or
     * TaskImageOptions must be specified, but not both.. 
     */
    public fun taskDefinition(taskDefinition: Ec2TaskDefinition)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91615b6dc8e9961ce73bccf342b514a0d888a094c81fb61aa66b06d473035e70")
    public
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions.Builder.() -> Unit)

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
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service.Builder =
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service.Builder.create(scope,
        id)

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
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy::unwrap))
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
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
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
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10fc607083a037dc7ec01db13219b492bc154729222e2b53fe636491435e641b")
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
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions::unwrap))
    }

    /**
     * The options for configuring an Amazon ECS service to use service discovery.
     *
     * Default: - AWS Cloud Map service discovery is not enabled.
     *
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e4e413a0412f83a2292e49e025145ab40fa59d499afeccb6e840e6735154f31")
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
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
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
     * This default is set in the underlying FargateTaskDefinition construct.
     *
     * Default: none
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
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a08a85e2c468ad5b38fa1b056b1624f26d42a104eb07346cf1d24d6ec940bbd2")
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
      cdkBuilder.domainZone(domainZone.let(IHostedZone::unwrap))
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
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration::unwrap))
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
      cdkBuilder.idleTimeout(idleTimeout.let(Duration::unwrap))
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
      cdkBuilder.loadBalancer(loadBalancer.let(IApplicationLoadBalancer::unwrap))
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
     * The hard limit (in MiB) of memory to present to the container.
     *
     * If your container attempts to exceed the allocated memory, the container
     * is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required.
     *
     * Default: - No memory limit.
     *
     * @param memoryLimitMiB The hard limit (in MiB) of memory to present to the container. 
     */
    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * The soft limit (in MiB) of memory to reserve for the container.
     *
     * When system memory is under contention, Docker attempts to keep the
     * container memory within the limit. If the container requires more memory,
     * it can consume up to the value specified by the Memory property or all of
     * the available memory on the container instance—whichever comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required.
     *
     * Default: - No memory reserved.
     *
     * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container. 
     */
    override fun memoryReservationMiB(memoryReservationMiB: Number) {
      cdkBuilder.memoryReservationMiB(memoryReservationMiB)
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
     * The placement constraints to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     *
     * Default: - No constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service. 
     */
    override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    /**
     * The placement constraints to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     *
     * Default: - No constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service. 
     */
    override fun placementConstraints(vararg placementConstraints: PlacementConstraint): Unit =
        placementConstraints(placementConstraints.toList())

    /**
     * The placement strategies to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     *
     * Default: - No strategies.
     *
     * @param placementStrategies The placement strategies to use for tasks in the service. 
     */
    override fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
      cdkBuilder.placementStrategies(placementStrategies.map(PlacementStrategy::unwrap))
    }

    /**
     * The placement strategies to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     *
     * Default: - No strategies.
     *
     * @param placementStrategies The placement strategies to use for tasks in the service. 
     */
    override fun placementStrategies(vararg placementStrategies: PlacementStrategy): Unit =
        placementStrategies(placementStrategies.toList())

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
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
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
      cdkBuilder.protocol(protocol.let(ApplicationProtocol::unwrap))
    }

    /**
     * The protocol version to use.
     *
     * Default: ApplicationProtocolVersion.HTTP1
     *
     * @param protocolVersion The protocol version to use. 
     */
    override fun protocolVersion(protocolVersion: ApplicationProtocolVersion) {
      cdkBuilder.protocolVersion(protocolVersion.let(ApplicationProtocolVersion::unwrap))
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
      cdkBuilder.recordType(recordType.let(ApplicationLoadBalancedServiceRecordType::unwrap))
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
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy::unwrap))
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
      cdkBuilder.targetProtocol(targetProtocol.let(ApplicationProtocol::unwrap))
    }

    /**
     * The task definition to use for tasks in the service. TaskDefinition or TaskImageOptions must
     * be specified, but not both..
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - none
     *
     * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition or
     * TaskImageOptions must be specified, but not both.. 
     */
    override fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(Ec2TaskDefinition::unwrap))
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
      cdkBuilder.taskImageOptions(taskImageOptions.let(ApplicationLoadBalancedTaskImageOptions::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91615b6dc8e9961ce73bccf342b514a0d888a094c81fb61aa66b06d473035e70")
    override
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions.Builder.() -> Unit):
        Unit = taskImageOptions(ApplicationLoadBalancedTaskImageOptions(taskImageOptions))

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
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApplicationLoadBalancedEc2Service {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApplicationLoadBalancedEc2Service(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service):
        ApplicationLoadBalancedEc2Service = ApplicationLoadBalancedEc2Service(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancedEc2Service):
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service =
        wrapped.cdkObject
  }
}
