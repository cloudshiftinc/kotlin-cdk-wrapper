@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.ecs.CapacityProviderStrategyDsl
import cloudshift.awscdk.dsl.services.ecs.CloudMapOptionsDsl
import cloudshift.awscdk.dsl.services.ecs.DeploymentCircuitBreakerDsl
import cloudshift.awscdk.dsl.services.ecs.DeploymentControllerDsl
import cloudshift.awscdk.dsl.services.ecs.RuntimePlatformDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy
import software.amazon.awscdk.services.ecs.CloudMapOptions
import software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker
import software.amazon.awscdk.services.ecs.DeploymentController
import software.amazon.awscdk.services.ecs.FargatePlatformVersion
import software.amazon.awscdk.services.ecs.FargateTaskDefinition
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.RuntimePlatform
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateService
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import software.amazon.awscdk.services.route53.IHostedZone
import software.constructs.Construct

/**
 * A Fargate service running on an ECS cluster fronted by a network load balancer.
 *
 * Example:
 *
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
@CdkDslMarker
public class NetworkLoadBalancedFargateServiceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: NetworkLoadBalancedFargateService.Builder =
      NetworkLoadBalancedFargateService.Builder.create(scope, id)

  private val _capacityProviderStrategies: MutableList<CapacityProviderStrategy> = mutableListOf()

  /**
   * Determines whether the service will be assigned a public IP address.
   *
   * Default: false
   *
   * @param assignPublicIp Determines whether the service will be assigned a public IP address. 
   */
  public fun assignPublicIp(assignPublicIp: Boolean) {
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
  public
      fun capacityProviderStrategies(capacityProviderStrategies: CapacityProviderStrategyDsl.() -> Unit) {
    _capacityProviderStrategies.add(CapacityProviderStrategyDsl().apply(capacityProviderStrategies).build())
  }

  /**
   * A list of Capacity Provider strategies used to place a service.
   *
   * Default: - undefined
   *
   * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
   * service. 
   */
  public
      fun capacityProviderStrategies(capacityProviderStrategies: Collection<CapacityProviderStrategy>) {
    _capacityProviderStrategies.addAll(capacityProviderStrategies)
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
  public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreakerDsl.() -> Unit = {}) {
    val builder = DeploymentCircuitBreakerDsl()
    builder.apply(circuitBreaker)
    cdkBuilder.circuitBreaker(builder.build())
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
  public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
    cdkBuilder.circuitBreaker(circuitBreaker)
  }

  /**
   * The options for configuring an Amazon ECS service to use service discovery.
   *
   * Default: - AWS Cloud Map service discovery is not enabled.
   *
   * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
   * discovery. 
   */
  public fun cloudMapOptions(cloudMapOptions: CloudMapOptionsDsl.() -> Unit = {}) {
    val builder = CloudMapOptionsDsl()
    builder.apply(cloudMapOptions)
    cdkBuilder.cloudMapOptions(builder.build())
  }

  /**
   * The options for configuring an Amazon ECS service to use service discovery.
   *
   * Default: - AWS Cloud Map service discovery is not enabled.
   *
   * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
   * discovery. 
   */
  public fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
    cdkBuilder.cloudMapOptions(cloudMapOptions)
  }

  /**
   * The name of the cluster that hosts the service.
   *
   * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
   * both cluster and vpc.
   *
   * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be created
   * for you.
   *
   * @param cluster The name of the cluster that hosts the service. 
   */
  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
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
  public fun cpu(cpu: Number) {
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
  public fun deploymentController(deploymentController: DeploymentControllerDsl.() -> Unit = {}) {
    val builder = DeploymentControllerDsl()
    builder.apply(deploymentController)
    cdkBuilder.deploymentController(builder.build())
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
  public fun deploymentController(deploymentController: DeploymentController) {
    cdkBuilder.deploymentController(deploymentController)
  }

  /**
   * The desired number of instantiations of the task definition to keep running on the service.
   *
   * The minimum value is 1
   *
   * Default: - If the feature flag, ECS_REMOVE_DEFAULT_DESIRED_COUNT is false, the default is 1;
   * if true, the default is 1 for all new services and uses the existing services desired count
   * when updating an existing service.
   *
   * @param desiredCount The desired number of instantiations of the task definition to keep running
   * on the service. 
   */
  public fun desiredCount(desiredCount: Number) {
    cdkBuilder.desiredCount(desiredCount)
  }

  /**
   * The domain name for the service, e.g. "api.example.com.".
   *
   * Default: - No domain name.
   *
   * @param domainName The domain name for the service, e.g. "api.example.com.". 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * The Route53 hosted zone for the domain, e.g. "example.com.".
   *
   * Default: - No Route53 hosted domain zone.
   *
   * @param domainZone The Route53 hosted zone for the domain, e.g. "example.com.". 
   */
  public fun domainZone(domainZone: IHostedZone) {
    cdkBuilder.domainZone(domainZone)
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
  public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
    cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
  }

  /**
   * Whether ECS Exec should be enabled.
   *
   * Default: - false
   *
   * @param enableExecuteCommand Whether ECS Exec should be enabled. 
   */
  public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
    cdkBuilder.enableExecuteCommand(enableExecuteCommand)
  }

  /**
   * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic
   * Load Balancing target health checks after a task has first started.
   *
   * Default: - defaults to 60 seconds if at least one load balancer is in-use and it is not already
   * set
   *
   * @param healthCheckGracePeriod The period of time, in seconds, that the Amazon ECS service
   * scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first
   * started. 
   */
  public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
    cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
  }

  /**
   * Listener port of the network load balancer that will serve traffic to the service.
   *
   * Default: 80
   *
   * @param listenerPort Listener port of the network load balancer that will serve traffic to the
   * service. 
   */
  public fun listenerPort(listenerPort: Number) {
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
  public fun loadBalancer(loadBalancer: INetworkLoadBalancer) {
    cdkBuilder.loadBalancer(loadBalancer)
  }

  /**
   * The maximum number of tasks, specified as a percentage of the Amazon ECS service's DesiredCount
   * value, that can run in a service during a deployment.
   *
   * Default: - 100 if daemon, otherwise 200
   *
   * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
   * ECS service's DesiredCount value, that can run in a service during a deployment. 
   */
  public fun maxHealthyPercent(maxHealthyPercent: Number) {
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
   * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu values: 2048
   * (2 vCPU)
   *
   * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu values: 4096
   * (4 vCPU)
   *
   * Between 16384 (16 GB) and 61440 (60 GB) in increments of 4096 (4 GB) - Available cpu values:
   * 8192 (8 vCPU)
   *
   * Between 32768 (32 GB) and 122880 (120 GB) in increments of 8192 (8 GB) - Available cpu values:
   * 16384 (16 vCPU)
   *
   * This default is set in the underlying FargateTaskDefinition construct.
   *
   * Default: 512
   *
   * @param memoryLimitMiB The amount (in MiB) of memory used by the task. 
   */
  public fun memoryLimitMiB(memoryLimitMiB: Number) {
    cdkBuilder.memoryLimitMiB(memoryLimitMiB)
  }

  /**
   * The minimum number of tasks, specified as a percentage of the Amazon ECS service's DesiredCount
   * value, that must continue to run and remain healthy during a deployment.
   *
   * Default: - 0 if daemon, otherwise 50
   *
   * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
   * ECS service's DesiredCount value, that must continue to run and remain healthy during a
   * deployment. 
   */
  public fun minHealthyPercent(minHealthyPercent: Number) {
    cdkBuilder.minHealthyPercent(minHealthyPercent)
  }

  /**
   * The platform version on which to run your service.
   *
   * If one is not specified, the LATEST platform version is used by default. For more information,
   * see
   * [AWS Fargate Platform
   * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
   * in the Amazon Elastic Container Service Developer Guide.
   *
   * Default: Latest
   *
   * @param platformVersion The platform version on which to run your service. 
   */
  public fun platformVersion(platformVersion: FargatePlatformVersion) {
    cdkBuilder.platformVersion(platformVersion)
  }

  /**
   * Specifies whether to propagate the tags from the task definition or the service to the tasks in
   * the service.
   *
   * Tags can only be propagated to the tasks within the service during service creation.
   *
   * Default: - none
   *
   * @param propagateTags Specifies whether to propagate the tags from the task definition or the
   * service to the tasks in the service. 
   */
  public fun propagateTags(propagateTags: PropagatedTagSource) {
    cdkBuilder.propagateTags(propagateTags)
  }

  /**
   * Determines whether the Load Balancer will be internet-facing.
   *
   * Default: true
   *
   * @param publicLoadBalancer Determines whether the Load Balancer will be internet-facing. 
   */
  public fun publicLoadBalancer(publicLoadBalancer: Boolean) {
    cdkBuilder.publicLoadBalancer(publicLoadBalancer)
  }

  /**
   * Specifies whether the Route53 record should be a CNAME, an A record using the Alias feature or
   * no record at all.
   *
   * This is useful if you need to work with DNS systems that do not support alias records.
   *
   * Default: NetworkLoadBalancedServiceRecordType.ALIAS
   *
   * @param recordType Specifies whether the Route53 record should be a CNAME, an A record using the
   * Alias feature or no record at all. 
   */
  public fun recordType(recordType: NetworkLoadBalancedServiceRecordType) {
    cdkBuilder.recordType(recordType)
  }

  /**
   * The runtime platform of the task definition.
   *
   * Default: - If the property is undefined, `operatingSystemFamily` is LINUX and `cpuArchitecture`
   * is X86_64
   *
   * @param runtimePlatform The runtime platform of the task definition. 
   */
  public fun runtimePlatform(runtimePlatform: RuntimePlatformDsl.() -> Unit = {}) {
    val builder = RuntimePlatformDsl()
    builder.apply(runtimePlatform)
    cdkBuilder.runtimePlatform(builder.build())
  }

  /**
   * The runtime platform of the task definition.
   *
   * Default: - If the property is undefined, `operatingSystemFamily` is LINUX and `cpuArchitecture`
   * is X86_64
   *
   * @param runtimePlatform The runtime platform of the task definition. 
   */
  public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
    cdkBuilder.runtimePlatform(runtimePlatform)
  }

  /**
   * The name of the service.
   *
   * Default: - CloudFormation-generated name.
   *
   * @param serviceName The name of the service. 
   */
  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  /**
   * The task definition to use for tasks in the service. TaskDefinition or TaskImageOptions must be
   * specified, but not both.
   *
   * [disable-awslint:ref-via-interface]
   *
   * Default: - none
   *
   * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition or
   * TaskImageOptions must be specified, but not both. 
   */
  public fun taskDefinition(taskDefinition: FargateTaskDefinition) {
    cdkBuilder.taskDefinition(taskDefinition)
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
  public fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageOptionsDsl.() -> Unit =
      {}) {
    val builder = NetworkLoadBalancedTaskImageOptionsDsl()
    builder.apply(taskImageOptions)
    cdkBuilder.taskImageOptions(builder.build())
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
  public fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageOptions) {
    cdkBuilder.taskImageOptions(taskImageOptions)
  }

  /**
   * The subnets to associate with the service.
   *
   * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
   * Private, Isolated, Public, in that order.
   *
   * @param taskSubnets The subnets to associate with the service. 
   */
  public fun taskSubnets(taskSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(taskSubnets)
    cdkBuilder.taskSubnets(builder.build())
  }

  /**
   * The subnets to associate with the service.
   *
   * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
   * Private, Isolated, Public, in that order.
   *
   * @param taskSubnets The subnets to associate with the service. 
   */
  public fun taskSubnets(taskSubnets: SubnetSelection) {
    cdkBuilder.taskSubnets(taskSubnets)
  }

  /**
   * The VPC where the container instances will be launched or the elastic network interfaces (ENIs)
   * will be deployed.
   *
   * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
   * both vpc and cluster.
   *
   * Default: - uses the VPC defined in the cluster or creates a new VPC.
   *
   * @param vpc The VPC where the container instances will be launched or the elastic network
   * interfaces (ENIs) will be deployed. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): NetworkLoadBalancedFargateService {
    if(_capacityProviderStrategies.isNotEmpty())
        cdkBuilder.capacityProviderStrategies(_capacityProviderStrategies)
    return cdkBuilder.build()
  }
}
