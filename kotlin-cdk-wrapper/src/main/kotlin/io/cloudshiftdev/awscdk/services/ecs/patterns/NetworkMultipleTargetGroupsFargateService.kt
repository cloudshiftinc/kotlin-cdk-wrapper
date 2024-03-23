@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ecs.CloudMapOptions
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.FargateService
import io.cloudshiftdev.awscdk.services.ecs.FargateTaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.RuntimePlatform
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Fargate service running on an ECS cluster fronted by a network load balancer.
 *
 * Example:
 *
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
public open class NetworkMultipleTargetGroupsFargateService(
  cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService,
) : NetworkMultipleTargetGroupsServiceBase(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NetworkMultipleTargetGroupsFargateServiceProps,
  ) :
      this(software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(NetworkMultipleTargetGroupsFargateServiceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NetworkMultipleTargetGroupsFargateServiceProps.Builder.() -> Unit,
  ) : this(scope, id, NetworkMultipleTargetGroupsFargateServiceProps(props)
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
   * (deprecated) The default target group for the service.
   *
   * * Use `targetGroups` instead.
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun targetGroup(): NetworkTargetGroup =
      unwrap(this).getTargetGroup().let(NetworkTargetGroup::wrap)

  /**
   * The Fargate task definition in this construct.
   */
  public open fun taskDefinition(): FargateTaskDefinition =
      unwrap(this).getTaskDefinition().let(FargateTaskDefinition::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService].
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
    @JvmName("e0761d3396a1bb7593b4abfbfbff2578c68311b4e741661efa869a4109961f83")
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
     * The network load balancer that will serve traffic to the service.
     *
     * Default: - a new load balancer with a listener will be created.
     *
     * @param loadBalancers The network load balancer that will serve traffic to the service. 
     */
    public fun loadBalancers(loadBalancers: List<NetworkLoadBalancerProps>)

    /**
     * The network load balancer that will serve traffic to the service.
     *
     * Default: - a new load balancer with a listener will be created.
     *
     * @param loadBalancers The network load balancer that will serve traffic to the service. 
     */
    public fun loadBalancers(vararg loadBalancers: NetworkLoadBalancerProps)

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
    @JvmName("c36fac3ddf8e2370b9348cfbce2fafabfc9c870624d8e79d384c1e22697fcba9")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

    /**
     * Name of the service.
     *
     * Default: - CloudFormation-generated name.
     *
     * @param serviceName Name of the service. 
     */
    public fun serviceName(serviceName: String)

    /**
     * Properties to specify NLB target groups.
     *
     * Default: - default portMapping registered as target group and attached to the first defined
     * listener
     *
     * @param targetGroups Properties to specify NLB target groups. 
     */
    public fun targetGroups(targetGroups: List<NetworkTargetProps>)

    /**
     * Properties to specify NLB target groups.
     *
     * Default: - default portMapping registered as target group and attached to the first defined
     * listener
     *
     * @param targetGroups Properties to specify NLB target groups. 
     */
    public fun targetGroups(vararg targetGroups: NetworkTargetProps)

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
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     *
     * Default: - none
     *
     * @param taskImageOptions The properties required to create a new task definition. 
     */
    public fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageProps)

    /**
     * The properties required to create a new task definition.
     *
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     *
     * Default: - none
     *
     * @param taskImageOptions The properties required to create a new task definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b19f2ae88adb24d5c883d69d91f1f3c5590b006c7333b0ecf8d42d073d75455")
    public
        fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageProps.Builder.() -> Unit)

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
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService.Builder
        =
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService.Builder.create(scope,
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0761d3396a1bb7593b4abfbfbff2578c68311b4e741661efa869a4109961f83")
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
     * The network load balancer that will serve traffic to the service.
     *
     * Default: - a new load balancer with a listener will be created.
     *
     * @param loadBalancers The network load balancer that will serve traffic to the service. 
     */
    override fun loadBalancers(loadBalancers: List<NetworkLoadBalancerProps>) {
      cdkBuilder.loadBalancers(loadBalancers.map(NetworkLoadBalancerProps::unwrap))
    }

    /**
     * The network load balancer that will serve traffic to the service.
     *
     * Default: - a new load balancer with a listener will be created.
     *
     * @param loadBalancers The network load balancer that will serve traffic to the service. 
     */
    override fun loadBalancers(vararg loadBalancers: NetworkLoadBalancerProps): Unit =
        loadBalancers(loadBalancers.toList())

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
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion::unwrap))
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
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
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
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
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
    @JvmName("c36fac3ddf8e2370b9348cfbce2fafabfc9c870624d8e79d384c1e22697fcba9")
    override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    /**
     * Name of the service.
     *
     * Default: - CloudFormation-generated name.
     *
     * @param serviceName Name of the service. 
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * Properties to specify NLB target groups.
     *
     * Default: - default portMapping registered as target group and attached to the first defined
     * listener
     *
     * @param targetGroups Properties to specify NLB target groups. 
     */
    override fun targetGroups(targetGroups: List<NetworkTargetProps>) {
      cdkBuilder.targetGroups(targetGroups.map(NetworkTargetProps::unwrap))
    }

    /**
     * Properties to specify NLB target groups.
     *
     * Default: - default portMapping registered as target group and attached to the first defined
     * listener
     *
     * @param targetGroups Properties to specify NLB target groups. 
     */
    override fun targetGroups(vararg targetGroups: NetworkTargetProps): Unit =
        targetGroups(targetGroups.toList())

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
      cdkBuilder.taskDefinition(taskDefinition.let(FargateTaskDefinition::unwrap))
    }

    /**
     * The properties required to create a new task definition.
     *
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     *
     * Default: - none
     *
     * @param taskImageOptions The properties required to create a new task definition. 
     */
    override fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageProps) {
      cdkBuilder.taskImageOptions(taskImageOptions.let(NetworkLoadBalancedTaskImageProps::unwrap))
    }

    /**
     * The properties required to create a new task definition.
     *
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     *
     * Default: - none
     *
     * @param taskImageOptions The properties required to create a new task definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b19f2ae88adb24d5c883d69d91f1f3c5590b006c7333b0ecf8d42d073d75455")
    override
        fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageProps.Builder.() -> Unit):
        Unit = taskImageOptions(NetworkLoadBalancedTaskImageProps(taskImageOptions))

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
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NetworkMultipleTargetGroupsFargateService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NetworkMultipleTargetGroupsFargateService(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService):
        NetworkMultipleTargetGroupsFargateService =
        NetworkMultipleTargetGroupsFargateService(cdkObject)

    internal fun unwrap(wrapped: NetworkMultipleTargetGroupsFargateService):
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService =
        wrapped.cdkObject as
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService
  }
}
