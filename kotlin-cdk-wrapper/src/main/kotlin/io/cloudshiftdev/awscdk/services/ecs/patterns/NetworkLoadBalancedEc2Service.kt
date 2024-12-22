@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IListenerCertificate
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IpAddressType
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
 * An EC2 service running on an ECS cluster fronted by a network load balancer.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.certificatemanager.Certificate;
 * Cluster cluster;
 * ICertificate certificate = Certificate.fromCertificateArn(this, "Cert",
 * "arn:aws:acm:us-east-1:123456:certificate/abcdefg");
 * NetworkLoadBalancedEc2Service loadBalancedEcsService =
 * NetworkLoadBalancedEc2Service.Builder.create(this, "Service")
 * .cluster(cluster)
 * .memoryLimitMiB(1024)
 * // The default value of listenerPort is 443 if you pass in listenerCertificate
 * // It is configured to port 4443 here
 * .listenerPort(4443)
 * .listenerCertificate(certificate)
 * .taskImageOptions(NetworkLoadBalancedTaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("test"))
 * // The default value of containerPort is 443 if you pass in listenerCertificate
 * // It is configured to port 8443 here
 * .containerPort(8443)
 * .environment(Map.of(
 * "TEST_ENVIRONMENT_VARIABLE1", "test environment variable 1 value",
 * "TEST_ENVIRONMENT_VARIABLE2", "test environment variable 2 value"))
 * .build())
 * .desiredCount(2)
 * .build();
 * ```
 */
public open class NetworkLoadBalancedEc2Service(
  cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service,
) : NetworkLoadBalancedServiceBase(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NetworkLoadBalancedEc2ServiceProps,
  ) :
      this(software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(NetworkLoadBalancedEc2ServiceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NetworkLoadBalancedEc2ServiceProps.Builder.() -> Unit,
  ) : this(scope, id, NetworkLoadBalancedEc2ServiceProps(props)
  )

  /**
   * The ECS service in this construct.
   */
  public open fun service(): Ec2Service = unwrap(this).getService().let(Ec2Service::wrap)

  /**
   * The EC2 Task Definition in this construct.
   */
  public open fun taskDefinition(): Ec2TaskDefinition =
      unwrap(this).getTaskDefinition().let(Ec2TaskDefinition::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service].
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
    @JvmName("170033e3d8e03f5757b83493a8490c1c2a467af1925a4ef72fedfca98baa7476")
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
    @JvmName("fe9658ba9892d9a82ad9332467f23d0f7755cb4f620f053e433abd67e42a8b1c")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81d88c7410fb5357671c170ecf5343cd6dbc7ab2d6c41f07d5357704e57d9786")
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
     * The type of IP addresses to use.
     *
     * If you want to add a UDP or TCP_UDP listener to the load balancer,
     * you must choose IPv4.
     *
     * Default: IpAddressType.IPV4
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-ip-address-type.html)
     * @param ipAddressType The type of IP addresses to use. 
     */
    public fun ipAddressType(ipAddressType: IpAddressType)

    /**
     * Listener certificate list of ACM cert ARNs.
     *
     * If you provide a certificate, the listener's protocol will be TLS.
     * If not, the listener's protocol will be TCP.
     *
     * Default: - none
     *
     * @param listenerCertificate Listener certificate list of ACM cert ARNs. 
     */
    public fun listenerCertificate(listenerCertificate: IListenerCertificate)

    /**
     * Listener port of the network load balancer that will serve traffic to the service.
     *
     * Default: 80 or 443 with listenerCertificate provided
     *
     * @param listenerPort Listener port of the network load balancer that will serve traffic to the
     * service. 
     */
    public fun listenerPort(listenerPort: Number)

    /**
     * The network load balancer that will serve traffic to the service.
     *
     * If the load balancer has been imported, the vpc attribute must be specified
     * in the call to fromNetworkLoadBalancerAttributes().
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - a new load balancer will be created.
     *
     * @param loadBalancer The network load balancer that will serve traffic to the service. 
     */
    public fun loadBalancer(loadBalancer: INetworkLoadBalancer)

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
     * Default: NetworkLoadBalancedServiceRecordType.ALIAS
     *
     * @param recordType Specifies whether the Route53 record should be a CNAME, an A record using
     * the Alias feature or no record at all. 
     */
    public fun recordType(recordType: NetworkLoadBalancedServiceRecordType)

    /**
     * The name of the service.
     *
     * Default: - CloudFormation-generated name.
     *
     * @param serviceName The name of the service. 
     */
    public fun serviceName(serviceName: String)

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
     * One of taskImageOptions or taskDefinition must be specified.
     *
     * Default: - none
     *
     * @param taskImageOptions The properties required to create a new task definition. 
     */
    public fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageOptions)

    /**
     * The properties required to create a new task definition.
     *
     * One of taskImageOptions or taskDefinition must be specified.
     *
     * Default: - none
     *
     * @param taskImageOptions The properties required to create a new task definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("492fbd0d17da10f1f9925db997929dd51e2d7440fb91db976aeea5f603d3956b")
    public
        fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageOptions.Builder.() -> Unit)

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
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service.Builder =
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service.Builder.create(scope,
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
    @JvmName("170033e3d8e03f5757b83493a8490c1c2a467af1925a4ef72fedfca98baa7476")
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
    @JvmName("fe9658ba9892d9a82ad9332467f23d0f7755cb4f620f053e433abd67e42a8b1c")
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
    @JvmName("81d88c7410fb5357671c170ecf5343cd6dbc7ab2d6c41f07d5357704e57d9786")
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
     * The type of IP addresses to use.
     *
     * If you want to add a UDP or TCP_UDP listener to the load balancer,
     * you must choose IPv4.
     *
     * Default: IpAddressType.IPV4
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-ip-address-type.html)
     * @param ipAddressType The type of IP addresses to use. 
     */
    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType.Companion::unwrap))
    }

    /**
     * Listener certificate list of ACM cert ARNs.
     *
     * If you provide a certificate, the listener's protocol will be TLS.
     * If not, the listener's protocol will be TCP.
     *
     * Default: - none
     *
     * @param listenerCertificate Listener certificate list of ACM cert ARNs. 
     */
    override fun listenerCertificate(listenerCertificate: IListenerCertificate) {
      cdkBuilder.listenerCertificate(listenerCertificate.let(IListenerCertificate.Companion::unwrap))
    }

    /**
     * Listener port of the network load balancer that will serve traffic to the service.
     *
     * Default: 80 or 443 with listenerCertificate provided
     *
     * @param listenerPort Listener port of the network load balancer that will serve traffic to the
     * service. 
     */
    override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    /**
     * The network load balancer that will serve traffic to the service.
     *
     * If the load balancer has been imported, the vpc attribute must be specified
     * in the call to fromNetworkLoadBalancerAttributes().
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - a new load balancer will be created.
     *
     * @param loadBalancer The network load balancer that will serve traffic to the service. 
     */
    override fun loadBalancer(loadBalancer: INetworkLoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(INetworkLoadBalancer.Companion::unwrap))
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
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint.Companion::unwrap))
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
      cdkBuilder.placementStrategies(placementStrategies.map(PlacementStrategy.Companion::unwrap))
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
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource.Companion::unwrap))
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
     * Default: NetworkLoadBalancedServiceRecordType.ALIAS
     *
     * @param recordType Specifies whether the Route53 record should be a CNAME, an A record using
     * the Alias feature or no record at all. 
     */
    override fun recordType(recordType: NetworkLoadBalancedServiceRecordType) {
      cdkBuilder.recordType(recordType.let(NetworkLoadBalancedServiceRecordType.Companion::unwrap))
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
      cdkBuilder.taskDefinition(taskDefinition.let(Ec2TaskDefinition.Companion::unwrap))
    }

    /**
     * The properties required to create a new task definition.
     *
     * One of taskImageOptions or taskDefinition must be specified.
     *
     * Default: - none
     *
     * @param taskImageOptions The properties required to create a new task definition. 
     */
    override fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageOptions) {
      cdkBuilder.taskImageOptions(taskImageOptions.let(NetworkLoadBalancedTaskImageOptions.Companion::unwrap))
    }

    /**
     * The properties required to create a new task definition.
     *
     * One of taskImageOptions or taskDefinition must be specified.
     *
     * Default: - none
     *
     * @param taskImageOptions The properties required to create a new task definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("492fbd0d17da10f1f9925db997929dd51e2d7440fb91db976aeea5f603d3956b")
    override
        fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageOptions.Builder.() -> Unit):
        Unit = taskImageOptions(NetworkLoadBalancedTaskImageOptions(taskImageOptions))

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

    public fun build(): software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NetworkLoadBalancedEc2Service {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NetworkLoadBalancedEc2Service(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service):
        NetworkLoadBalancedEc2Service = NetworkLoadBalancedEc2Service(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancedEc2Service):
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service =
        wrapped.cdkObject as
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service
  }
}
