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
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ApplicationMultipleTargetGroupsFargateService
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService,
) : ApplicationMultipleTargetGroupsServiceBase(cdkObject) {
    /** Determines whether the service will be assigned a public IP address. */
    public open fun assignPublicIp(): Boolean = unwrap(this).getAssignPublicIp()

    /** The Fargate service in this construct. */
    public open fun service(): FargateService = unwrap(this).getService().let(FargateService::wrap)

    /**
     * (deprecated) The default target group for the service.
     * * Use `targetGroups` instead.
     */
    @Deprecated(message = "deprecated in CDK")
    public open fun targetGroup(): ApplicationTargetGroup =
        unwrap(this).getTargetGroup().let(ApplicationTargetGroup::wrap)

    /** The Fargate task definition in this construct. */
    public open fun taskDefinition(): FargateTaskDefinition =
        unwrap(this).getTaskDefinition().let(FargateTaskDefinition::wrap)

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * Determines whether the service will be assigned a public IP address.
         *
         * Default: false
         *
         * @param assignPublicIp Determines whether the service will be assigned a public IP
         *   address.
         */
        public fun assignPublicIp(assignPublicIp: Boolean)

        /**
         * The options for configuring an Amazon ECS service to use service discovery.
         *
         * Default: - AWS Cloud Map service discovery is not enabled.
         *
         * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
         *   discovery.
         */
        public fun cloudMapOptions(cloudMapOptions: CloudMapOptions)

        /**
         * The options for configuring an Amazon ECS service to use service discovery.
         *
         * Default: - AWS Cloud Map service discovery is not enabled.
         *
         * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
         *   discovery.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("712be5f1e131c638ed95475dff64f13a48c29f44ae442a2119763bf883dd4a94")
        public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit)

        /**
         * The name of the cluster that hosts the service.
         *
         * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can
         * omit both cluster and vpc.
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
         * The desired number of instantiations of the task definition to keep running on the
         * service.
         *
         * Default: - The default is 1 for all new services and uses the existing service's desired
         * count when updating an existing service.
         *
         * @param desiredCount The desired number of instantiations of the task definition to keep
         *   running on the service.
         */
        public fun desiredCount(desiredCount: Number)

        /**
         * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
         *
         * For more information, see
         * [Tagging Your Amazon ECS Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
         *
         * Default: false
         *
         * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the
         *   tasks within the service.
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
         * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to
         *   the task.
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
         *   scheduler ignores unhealthy Elastic Load Balancing target health checks after a task
         *   has first started.
         */
        public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration)

        /**
         * The application load balancer that will serve traffic to the service.
         *
         * Default: - a new load balancer with a listener will be created.
         *
         * @param loadBalancers The application load balancer that will serve traffic to the
         *   service.
         */
        public fun loadBalancers(loadBalancers: List<ApplicationLoadBalancerProps>)

        /**
         * The application load balancer that will serve traffic to the service.
         *
         * Default: - a new load balancer with a listener will be created.
         *
         * @param loadBalancers The application load balancer that will serve traffic to the
         *   service.
         */
        public fun loadBalancers(vararg loadBalancers: ApplicationLoadBalancerProps)

        /**
         * The amount (in MiB) of memory used by the task.
         *
         * This field is required and you must use one of the following values, which determines
         * your range of valid values for the cpu parameter:
         *
         * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available cpu values: 256 (.25 vCPU)
         *
         * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available cpu values: 512 (.5 vCPU)
         *
         * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8
         * GB) - Available cpu values: 1024 (1 vCPU)
         *
         * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu
         * values: 2048 (2 vCPU)
         *
         * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu
         * values: 4096 (4 vCPU)
         *
         * Between 16384 (16 GB) and 61440 (60 GB) in increments of 4096 (4 GB) - Available cpu
         * values: 8192 (8 vCPU)
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
         * [AWS Fargate Platform Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
         * in the Amazon Elastic Container Service Developer Guide.
         *
         * Default: Latest
         *
         * @param platformVersion The platform version on which to run your service.
         */
        public fun platformVersion(platformVersion: FargatePlatformVersion)

        /**
         * Specifies whether to propagate the tags from the task definition or the service to the
         * tasks in the service.
         *
         * Tags can only be propagated to the tasks within the service during service creation.
         *
         * Default: - none
         *
         * @param propagateTags Specifies whether to propagate the tags from the task definition or
         *   the service to the tasks in the service.
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
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("69dcd7c4e3108bf2b069391264b2886743b8a22a489b1401fc95b72caa1bc77a")
        public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

        /**
         * The name of the service.
         *
         * Default: - CloudFormation-generated name.
         *
         * @param serviceName The name of the service.
         */
        public fun serviceName(serviceName: String)

        /**
         * Properties to specify ALB target groups.
         *
         * Default: - default portMapping registered as target group and attached to the first
         * defined listener
         *
         * @param targetGroups Properties to specify ALB target groups.
         */
        public fun targetGroups(targetGroups: List<ApplicationTargetProps>)

        /**
         * Properties to specify ALB target groups.
         *
         * Default: - default portMapping registered as target group and attached to the first
         * defined listener
         *
         * @param targetGroups Properties to specify ALB target groups.
         */
        public fun targetGroups(vararg targetGroups: ApplicationTargetProps)

        /**
         * The task definition to use for tasks in the service. TaskDefinition or TaskImageOptions
         * must be specified, but not both.
         *
         * [disable-awslint:ref-via-interface]
         *
         * Default: - none
         *
         * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition
         *   or TaskImageOptions must be specified, but not both.
         */
        public fun taskDefinition(taskDefinition: FargateTaskDefinition)

        /**
         * The properties required to create a new task definition.
         *
         * Only one of TaskDefinition or TaskImageOptions must be specified.
         *
         * Default: none
         *
         * @param taskImageOptions The properties required to create a new task definition.
         */
        public fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps)

        /**
         * The properties required to create a new task definition.
         *
         * Only one of TaskDefinition or TaskImageOptions must be specified.
         *
         * Default: none
         *
         * @param taskImageOptions The properties required to create a new task definition.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("915c961f86b74e2e76719b9f4270829ced9adc70ea13a7152156d997b3bf6b03")
        public fun taskImageOptions(
            taskImageOptions: ApplicationLoadBalancedTaskImageProps.Builder.() -> Unit
        )

        /**
         * The VPC where the container instances will be launched or the elastic network interfaces
         * (ENIs) will be deployed.
         *
         * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can
         * omit both vpc and cluster.
         *
         * Default: - uses the VPC defined in the cluster or creates a new VPC.
         *
         * @param vpc The VPC where the container instances will be launched or the elastic network
         *   interfaces (ENIs) will be deployed.
         */
        public fun vpc(vpc: IVpc)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService.Builder =
            software.amazon.awscdk.services.ecs.patterns
                .ApplicationMultipleTargetGroupsFargateService
                .Builder
                .create(scope, id)

        /**
         * Determines whether the service will be assigned a public IP address.
         *
         * Default: false
         *
         * @param assignPublicIp Determines whether the service will be assigned a public IP
         *   address.
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
         *   discovery.
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
         *   discovery.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("712be5f1e131c638ed95475dff64f13a48c29f44ae442a2119763bf883dd4a94")
        override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
            cloudMapOptions(CloudMapOptions(cloudMapOptions))

        /**
         * The name of the cluster that hosts the service.
         *
         * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can
         * omit both cluster and vpc.
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
         * The desired number of instantiations of the task definition to keep running on the
         * service.
         *
         * Default: - The default is 1 for all new services and uses the existing service's desired
         * count when updating an existing service.
         *
         * @param desiredCount The desired number of instantiations of the task definition to keep
         *   running on the service.
         */
        override fun desiredCount(desiredCount: Number) {
            cdkBuilder.desiredCount(desiredCount)
        }

        /**
         * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
         *
         * For more information, see
         * [Tagging Your Amazon ECS Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
         *
         * Default: false
         *
         * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the
         *   tasks within the service.
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
         * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to
         *   the task.
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
         *   scheduler ignores unhealthy Elastic Load Balancing target health checks after a task
         *   has first started.
         */
        override fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
            cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration::unwrap))
        }

        /**
         * The application load balancer that will serve traffic to the service.
         *
         * Default: - a new load balancer with a listener will be created.
         *
         * @param loadBalancers The application load balancer that will serve traffic to the
         *   service.
         */
        override fun loadBalancers(loadBalancers: List<ApplicationLoadBalancerProps>) {
            cdkBuilder.loadBalancers(loadBalancers.map(ApplicationLoadBalancerProps::unwrap))
        }

        /**
         * The application load balancer that will serve traffic to the service.
         *
         * Default: - a new load balancer with a listener will be created.
         *
         * @param loadBalancers The application load balancer that will serve traffic to the
         *   service.
         */
        override fun loadBalancers(vararg loadBalancers: ApplicationLoadBalancerProps): Unit =
            loadBalancers(loadBalancers.toList())

        /**
         * The amount (in MiB) of memory used by the task.
         *
         * This field is required and you must use one of the following values, which determines
         * your range of valid values for the cpu parameter:
         *
         * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available cpu values: 256 (.25 vCPU)
         *
         * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available cpu values: 512 (.5 vCPU)
         *
         * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8
         * GB) - Available cpu values: 1024 (1 vCPU)
         *
         * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu
         * values: 2048 (2 vCPU)
         *
         * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu
         * values: 4096 (4 vCPU)
         *
         * Between 16384 (16 GB) and 61440 (60 GB) in increments of 4096 (4 GB) - Available cpu
         * values: 8192 (8 vCPU)
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
         * [AWS Fargate Platform Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
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
         * Specifies whether to propagate the tags from the task definition or the service to the
         * tasks in the service.
         *
         * Tags can only be propagated to the tasks within the service during service creation.
         *
         * Default: - none
         *
         * @param propagateTags Specifies whether to propagate the tags from the task definition or
         *   the service to the tasks in the service.
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
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("69dcd7c4e3108bf2b069391264b2886743b8a22a489b1401fc95b72caa1bc77a")
        override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
            runtimePlatform(RuntimePlatform(runtimePlatform))

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
         * Properties to specify ALB target groups.
         *
         * Default: - default portMapping registered as target group and attached to the first
         * defined listener
         *
         * @param targetGroups Properties to specify ALB target groups.
         */
        override fun targetGroups(targetGroups: List<ApplicationTargetProps>) {
            cdkBuilder.targetGroups(targetGroups.map(ApplicationTargetProps::unwrap))
        }

        /**
         * Properties to specify ALB target groups.
         *
         * Default: - default portMapping registered as target group and attached to the first
         * defined listener
         *
         * @param targetGroups Properties to specify ALB target groups.
         */
        override fun targetGroups(vararg targetGroups: ApplicationTargetProps): Unit =
            targetGroups(targetGroups.toList())

        /**
         * The task definition to use for tasks in the service. TaskDefinition or TaskImageOptions
         * must be specified, but not both.
         *
         * [disable-awslint:ref-via-interface]
         *
         * Default: - none
         *
         * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition
         *   or TaskImageOptions must be specified, but not both.
         */
        override fun taskDefinition(taskDefinition: FargateTaskDefinition) {
            cdkBuilder.taskDefinition(taskDefinition.let(FargateTaskDefinition::unwrap))
        }

        /**
         * The properties required to create a new task definition.
         *
         * Only one of TaskDefinition or TaskImageOptions must be specified.
         *
         * Default: none
         *
         * @param taskImageOptions The properties required to create a new task definition.
         */
        override fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps) {
            cdkBuilder.taskImageOptions(
                taskImageOptions.let(ApplicationLoadBalancedTaskImageProps::unwrap)
            )
        }

        /**
         * The properties required to create a new task definition.
         *
         * Only one of TaskDefinition or TaskImageOptions must be specified.
         *
         * Default: none
         *
         * @param taskImageOptions The properties required to create a new task definition.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("915c961f86b74e2e76719b9f4270829ced9adc70ea13a7152156d997b3bf6b03")
        override fun taskImageOptions(
            taskImageOptions: ApplicationLoadBalancedTaskImageProps.Builder.() -> Unit
        ): Unit = taskImageOptions(ApplicationLoadBalancedTaskImageProps(taskImageOptions))

        /**
         * The VPC where the container instances will be launched or the elastic network interfaces
         * (ENIs) will be deployed.
         *
         * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can
         * omit both vpc and cluster.
         *
         * Default: - uses the VPC defined in the cluster or creates a new VPC.
         *
         * @param vpc The VPC where the container instances will be launched or the elastic network
         *   interfaces (ENIs) will be deployed.
         */
        override fun vpc(vpc: IVpc) {
            cdkBuilder.vpc(vpc.let(IVpc::unwrap))
        }

        public fun build():
            software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): ApplicationMultipleTargetGroupsFargateService {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return ApplicationMultipleTargetGroupsFargateService(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject:
                software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService
        ): ApplicationMultipleTargetGroupsFargateService =
            ApplicationMultipleTargetGroupsFargateService(cdkObject)

        internal fun unwrap(
            wrapped: ApplicationMultipleTargetGroupsFargateService
        ): software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService =
            wrapped.cdkObject
    }
}
