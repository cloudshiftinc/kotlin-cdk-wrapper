@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ecs.CloudMapOptions
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.FargateTaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.RuntimePlatform
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * The properties for the ApplicationMultipleTargetGroupsFargateService service.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.certificatemanager.Certificate;
 * import io.cloudshiftdev.awscdk.services.ec2.InstanceType;
 * import io.cloudshiftdev.awscdk.services.ecs.Cluster;
 * import io.cloudshiftdev.awscdk.services.ecs.ContainerImage;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationProtocol;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.SslPolicy;
 * import io.cloudshiftdev.awscdk.services.route53.PublicHostedZone;
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
 * .domainZone(PublicHostedZone.Builder.create(this, "HostedZone").zoneName("example.com").build())
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
 * .domainZone(PublicHostedZone.Builder.create(this, "HostedZone").zoneName("frontend.com").build())
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
public interface ApplicationMultipleTargetGroupsFargateServiceProps :
    ApplicationMultipleTargetGroupsServiceBaseProps, FargateServiceBaseProps {
  /**
   * Determines whether the service will be assigned a public IP address.
   *
   * Default: false
   */
  public fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

  /**
   * A builder for [ApplicationMultipleTargetGroupsFargateServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assignPublicIp Determines whether the service will be assigned a public IP address.
     */
    public fun assignPublicIp(assignPublicIp: Boolean)

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery.
     */
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions)

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91962bd1512f0c43b2e15010c5357f527cd8b5a1807a240846ff975d149ab881")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit)

    /**
     * @param cluster The name of the cluster that hosts the service.
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param cpu The number of cpu units used by the task.
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
     */
    public fun cpu(cpu: Number)

    /**
     * @param desiredCount The desired number of instantiations of the task definition to keep
     * running on the service.
     */
    public fun desiredCount(desiredCount: Number)

    /**
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     * within the service.
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    /**
     * @param enableExecuteCommand Whether ECS Exec should be enabled.
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    /**
     * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to the
     * task.
     * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
     *
     * Only supported in Fargate platform version 1.4.0 or later.
     */
    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number)

    /**
     * @param healthCheckGracePeriod The period of time, in seconds, that the Amazon ECS service
     * scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first
     * started.
     */
    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration)

    /**
     * @param loadBalancers The application load balancer that will serve traffic to the service.
     */
    public fun loadBalancers(loadBalancers: List<ApplicationLoadBalancerProps>)

    /**
     * @param loadBalancers The application load balancer that will serve traffic to the service.
     */
    public fun loadBalancers(vararg loadBalancers: ApplicationLoadBalancerProps)

    /**
     * @param memoryLimitMiB The amount (in MiB) of memory used by the task.
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
     */
    public fun memoryLimitMiB(memoryLimitMiB: Number)

    /**
     * @param platformVersion The platform version on which to run your service.
     * If one is not specified, the LATEST platform version is used by default. For more
     * information, see
     * [AWS Fargate Platform
     * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * in the Amazon Elastic Container Service Developer Guide.
     */
    public fun platformVersion(platformVersion: FargatePlatformVersion)

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service.
     * Tags can only be propagated to the tasks within the service during service creation.
     */
    public fun propagateTags(propagateTags: PropagatedTagSource)

    /**
     * @param runtimePlatform The runtime platform of the task definition.
     */
    public fun runtimePlatform(runtimePlatform: RuntimePlatform)

    /**
     * @param runtimePlatform The runtime platform of the task definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4b9fea9e6015ed6799ad8f4e24c79c9cabff2fe020dc5fd16863c63f9ceebfa")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

    /**
     * @param serviceName The name of the service.
     */
    public fun serviceName(serviceName: String)

    /**
     * @param targetGroups Properties to specify ALB target groups.
     */
    public fun targetGroups(targetGroups: List<ApplicationTargetProps>)

    /**
     * @param targetGroups Properties to specify ALB target groups.
     */
    public fun targetGroups(vararg targetGroups: ApplicationTargetProps)

    /**
     * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition or
     * TaskImageOptions must be specified, but not both.
     * [disable-awslint:ref-via-interface]
     */
    public fun taskDefinition(taskDefinition: FargateTaskDefinition)

    /**
     * @param taskImageOptions The properties required to create a new task definition.
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     */
    public fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps)

    /**
     * @param taskImageOptions The properties required to create a new task definition.
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95ca58de1029fd7d8372e0a7f9b820587efe0405062a2c3ed2b06a99351542eb")
    public
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps.Builder.() -> Unit)

    /**
     * @param vpc The VPC where the container instances will be launched or the elastic network
     * interfaces (ENIs) will be deployed.
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateServiceProps.Builder
        =
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateServiceProps.builder()

    /**
     * @param assignPublicIp Determines whether the service will be assigned a public IP address.
     */
    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery.
     */
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions.Companion::unwrap))
    }

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91962bd1512f0c43b2e15010c5357f527cd8b5a1807a240846ff975d149ab881")
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    /**
     * @param cluster The name of the cluster that hosts the service.
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * @param cpu The number of cpu units used by the task.
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
     */
    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * @param desiredCount The desired number of instantiations of the task definition to keep
     * running on the service.
     */
    override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    /**
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     * within the service.
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     */
    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * @param enableExecuteCommand Whether ECS Exec should be enabled.
     */
    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to the
     * task.
     * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
     *
     * Only supported in Fargate platform version 1.4.0 or later.
     */
    override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
      cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    /**
     * @param healthCheckGracePeriod The period of time, in seconds, that the Amazon ECS service
     * scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first
     * started.
     */
    override fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration.Companion::unwrap))
    }

    /**
     * @param loadBalancers The application load balancer that will serve traffic to the service.
     */
    override fun loadBalancers(loadBalancers: List<ApplicationLoadBalancerProps>) {
      cdkBuilder.loadBalancers(loadBalancers.map(ApplicationLoadBalancerProps.Companion::unwrap))
    }

    /**
     * @param loadBalancers The application load balancer that will serve traffic to the service.
     */
    override fun loadBalancers(vararg loadBalancers: ApplicationLoadBalancerProps): Unit =
        loadBalancers(loadBalancers.toList())

    /**
     * @param memoryLimitMiB The amount (in MiB) of memory used by the task.
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
     */
    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * @param platformVersion The platform version on which to run your service.
     * If one is not specified, the LATEST platform version is used by default. For more
     * information, see
     * [AWS Fargate Platform
     * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * in the Amazon Elastic Container Service Developer Guide.
     */
    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion.Companion::unwrap))
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service.
     * Tags can only be propagated to the tasks within the service during service creation.
     */
    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource.Companion::unwrap))
    }

    /**
     * @param runtimePlatform The runtime platform of the task definition.
     */
    override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform.Companion::unwrap))
    }

    /**
     * @param runtimePlatform The runtime platform of the task definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4b9fea9e6015ed6799ad8f4e24c79c9cabff2fe020dc5fd16863c63f9ceebfa")
    override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    /**
     * @param serviceName The name of the service.
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param targetGroups Properties to specify ALB target groups.
     */
    override fun targetGroups(targetGroups: List<ApplicationTargetProps>) {
      cdkBuilder.targetGroups(targetGroups.map(ApplicationTargetProps.Companion::unwrap))
    }

    /**
     * @param targetGroups Properties to specify ALB target groups.
     */
    override fun targetGroups(vararg targetGroups: ApplicationTargetProps): Unit =
        targetGroups(targetGroups.toList())

    /**
     * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition or
     * TaskImageOptions must be specified, but not both.
     * [disable-awslint:ref-via-interface]
     */
    override fun taskDefinition(taskDefinition: FargateTaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(FargateTaskDefinition.Companion::unwrap))
    }

    /**
     * @param taskImageOptions The properties required to create a new task definition.
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     */
    override fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps) {
      cdkBuilder.taskImageOptions(taskImageOptions.let(ApplicationLoadBalancedTaskImageProps.Companion::unwrap))
    }

    /**
     * @param taskImageOptions The properties required to create a new task definition.
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95ca58de1029fd7d8372e0a7f9b820587efe0405062a2c3ed2b06a99351542eb")
    override
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps.Builder.() -> Unit):
        Unit = taskImageOptions(ApplicationLoadBalancedTaskImageProps(taskImageOptions))

    /**
     * @param vpc The VPC where the container instances will be launched or the elastic network
     * interfaces (ENIs) will be deployed.
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateServiceProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateServiceProps,
  ) : CdkObject(cdkObject),
      ApplicationMultipleTargetGroupsFargateServiceProps {
    /**
     * Determines whether the service will be assigned a public IP address.
     *
     * Default: false
     */
    override fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

    /**
     * The options for configuring an Amazon ECS service to use service discovery.
     *
     * Default: - AWS Cloud Map service discovery is not enabled.
     */
    override fun cloudMapOptions(): CloudMapOptions? =
        unwrap(this).getCloudMapOptions()?.let(CloudMapOptions::wrap)

    /**
     * The name of the cluster that hosts the service.
     *
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     *
     * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be
     * created for you.
     */
    override fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

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
     */
    override fun cpu(): Number? = unwrap(this).getCpu()

    /**
     * The desired number of instantiations of the task definition to keep running on the service.
     *
     * Default: - The default is 1 for all new services and uses the existing service's desired
     * count
     * when updating an existing service.
     */
    override fun desiredCount(): Number? = unwrap(this).getDesiredCount()

    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     *
     * Default: false
     */
    override fun enableECSManagedTags(): Boolean? = unwrap(this).getEnableECSManagedTags()

    /**
     * Whether ECS Exec should be enabled.
     *
     * Default: - false
     */
    override fun enableExecuteCommand(): Boolean? = unwrap(this).getEnableExecuteCommand()

    /**
     * The amount (in GiB) of ephemeral storage to be allocated to the task.
     *
     * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
     *
     * Only supported in Fargate platform version 1.4.0 or later.
     *
     * Default: Undefined, in which case, the task will receive 20GiB ephemeral storage.
     */
    override fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

    /**
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy
     * Elastic Load Balancing target health checks after a task has first started.
     *
     * Default: - defaults to 60 seconds if at least one load balancer is in-use and it is not
     * already set
     */
    override fun healthCheckGracePeriod(): Duration? =
        unwrap(this).getHealthCheckGracePeriod()?.let(Duration::wrap)

    /**
     * The application load balancer that will serve traffic to the service.
     *
     * Default: - a new load balancer with a listener will be created.
     */
    override fun loadBalancers(): List<ApplicationLoadBalancerProps> =
        unwrap(this).getLoadBalancers()?.map(ApplicationLoadBalancerProps::wrap) ?: emptyList()

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
     */
    override fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

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
     */
    override fun platformVersion(): FargatePlatformVersion? =
        unwrap(this).getPlatformVersion()?.let(FargatePlatformVersion::wrap)

    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks
     * in the service.
     *
     * Tags can only be propagated to the tasks within the service during service creation.
     *
     * Default: - none
     */
    override fun propagateTags(): PropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

    /**
     * The runtime platform of the task definition.
     *
     * Default: - If the property is undefined, `operatingSystemFamily` is LINUX and
     * `cpuArchitecture` is X86_64
     */
    override fun runtimePlatform(): RuntimePlatform? =
        unwrap(this).getRuntimePlatform()?.let(RuntimePlatform::wrap)

    /**
     * The name of the service.
     *
     * Default: - CloudFormation-generated name.
     */
    override fun serviceName(): String? = unwrap(this).getServiceName()

    /**
     * Properties to specify ALB target groups.
     *
     * Default: - default portMapping registered as target group and attached to the first defined
     * listener
     */
    override fun targetGroups(): List<ApplicationTargetProps> =
        unwrap(this).getTargetGroups()?.map(ApplicationTargetProps::wrap) ?: emptyList()

    /**
     * The task definition to use for tasks in the service. TaskDefinition or TaskImageOptions must
     * be specified, but not both.
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - none
     */
    override fun taskDefinition(): FargateTaskDefinition? =
        unwrap(this).getTaskDefinition()?.let(FargateTaskDefinition::wrap)

    /**
     * The properties required to create a new task definition.
     *
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     *
     * Default: none
     */
    override fun taskImageOptions(): ApplicationLoadBalancedTaskImageProps? =
        unwrap(this).getTaskImageOptions()?.let(ApplicationLoadBalancedTaskImageProps::wrap)

    /**
     * The VPC where the container instances will be launched or the elastic network interfaces
     * (ENIs) will be deployed.
     *
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     *
     * Default: - uses the VPC defined in the cluster or creates a new VPC.
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ApplicationMultipleTargetGroupsFargateServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateServiceProps):
        ApplicationMultipleTargetGroupsFargateServiceProps = CdkObjectWrappers.wrap(cdkObject) as?
        ApplicationMultipleTargetGroupsFargateServiceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationMultipleTargetGroupsFargateServiceProps):
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateServiceProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateServiceProps
  }
}
