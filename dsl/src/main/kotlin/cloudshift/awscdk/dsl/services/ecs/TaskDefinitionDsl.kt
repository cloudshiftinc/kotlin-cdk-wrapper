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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.Compatibility
import software.amazon.awscdk.services.ecs.InferenceAccelerator
import software.amazon.awscdk.services.ecs.IpcMode
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.ecs.PidMode
import software.amazon.awscdk.services.ecs.PlacementConstraint
import software.amazon.awscdk.services.ecs.ProxyConfiguration
import software.amazon.awscdk.services.ecs.RuntimePlatform
import software.amazon.awscdk.services.ecs.TaskDefinition
import software.amazon.awscdk.services.ecs.Volume
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * The base class for all task definitions.
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
@CdkDslMarker
public class TaskDefinitionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: TaskDefinition.Builder = TaskDefinition.Builder.create(scope, id)

    private val _inferenceAccelerators: MutableList<InferenceAccelerator> = mutableListOf()

    private val _placementConstraints: MutableList<PlacementConstraint> = mutableListOf()

    private val _volumes: MutableList<Volume> = mutableListOf()

    /**
     * The task launch type compatiblity requirement.
     *
     * @param compatibility The task launch type compatiblity requirement.
     */
    public fun compatibility(compatibility: Compatibility) {
        cdkBuilder.compatibility(compatibility)
    }

    /**
     * The number of cpu units used by the task.
     *
     * If you are using the EC2 launch type, this field is optional and any value can be used. If
     * you are using the Fargate launch type, this field is required and you must use one of the
     * following values, which determines your range of valid values for the memory parameter:
     *
     * 256 (.25 vCPU) - Available memory values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     *
     * 512 (.5 vCPU) - Available memory values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     *
     * 1024 (1 vCPU) - Available memory values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB),
     * 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     *
     * 2048 (2 vCPU) - Available memory values: Between 4096 (4 GB) and 16384 (16 GB) in increments
     * of 1024 (1 GB)
     *
     * 4096 (4 vCPU) - Available memory values: Between 8192 (8 GB) and 30720 (30 GB) in increments
     * of 1024 (1 GB)
     *
     * 8192 (8 vCPU) - Available memory values: Between 16384 (16 GB) and 61440 (60 GB) in
     * increments of 4096 (4 GB)
     *
     * 16384 (16 vCPU) - Available memory values: Between 32768 (32 GB) and 122880 (120 GB) in
     * increments of 8192 (8 GB)
     *
     * Default: - CPU units are not specified.
     *
     * @param cpu The number of cpu units used by the task.
     */
    public fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
    }

    /**
     * The amount (in GiB) of ephemeral storage to be allocated to the task.
     *
     * Only supported in Fargate platform version 1.4.0 or later.
     *
     * Default: - Undefined, in which case, the task will receive 20GiB ephemeral storage.
     *
     * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to the
     *   task.
     */
    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
        cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    /**
     * The name of the IAM task execution role that grants the ECS agent permission to call AWS APIs
     * on your behalf.
     *
     * The role will be used to retrieve container images from ECR and create CloudWatch log groups.
     *
     * Default: - An execution role will be automatically created if you use ECR images in your task
     * definition.
     *
     * @param executionRole The name of the IAM task execution role that grants the ECS agent
     *   permission to call AWS APIs on your behalf.
     */
    public fun executionRole(executionRole: IRole) {
        cdkBuilder.executionRole(executionRole)
    }

    /**
     * The name of a family that this task definition is registered to.
     *
     * A family groups multiple versions of a task definition.
     *
     * Default: - Automatically generated name.
     *
     * @param family The name of a family that this task definition is registered to.
     */
    public fun family(family: String) {
        cdkBuilder.family(family)
    }

    /**
     * The inference accelerators to use for the containers in the task.
     *
     * Not supported in Fargate.
     *
     * Default: - No inference accelerators.
     *
     * @param inferenceAccelerators The inference accelerators to use for the containers in the
     *   task.
     */
    public fun inferenceAccelerators(inferenceAccelerators: InferenceAcceleratorDsl.() -> Unit) {
        _inferenceAccelerators.add(InferenceAcceleratorDsl().apply(inferenceAccelerators).build())
    }

    /**
     * The inference accelerators to use for the containers in the task.
     *
     * Not supported in Fargate.
     *
     * Default: - No inference accelerators.
     *
     * @param inferenceAccelerators The inference accelerators to use for the containers in the
     *   task.
     */
    public fun inferenceAccelerators(inferenceAccelerators: Collection<InferenceAccelerator>) {
        _inferenceAccelerators.addAll(inferenceAccelerators)
    }

    /**
     * The IPC resource namespace to use for the containers in the task.
     *
     * Not supported in Fargate and Windows containers.
     *
     * Default: - IpcMode used by the task is not specified
     *
     * @param ipcMode The IPC resource namespace to use for the containers in the task.
     */
    public fun ipcMode(ipcMode: IpcMode) {
        cdkBuilder.ipcMode(ipcMode)
    }

    /**
     * The amount (in MiB) of memory used by the task.
     *
     * If using the EC2 launch type, this field is optional and any value can be used. If using the
     * Fargate launch type, this field is required and you must use one of the following values,
     * which determines your range of valid values for the cpu parameter:
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
     * Default: - Memory used by task is not specified.
     *
     * @param memoryMiB The amount (in MiB) of memory used by the task.
     */
    public fun memoryMiB(memoryMiB: String) {
        cdkBuilder.memoryMiB(memoryMiB)
    }

    /**
     * The networking mode to use for the containers in the task.
     *
     * On Fargate, the only supported networking mode is AwsVpc.
     *
     * Default: - NetworkMode.Bridge for EC2 & External tasks, AwsVpc for Fargate tasks.
     *
     * @param networkMode The networking mode to use for the containers in the task.
     */
    public fun networkMode(networkMode: NetworkMode) {
        cdkBuilder.networkMode(networkMode)
    }

    /**
     * The process namespace to use for the containers in the task.
     *
     * Not supported in Fargate and Windows containers.
     *
     * Default: - PidMode used by the task is not specified
     *
     * @param pidMode The process namespace to use for the containers in the task.
     */
    public fun pidMode(pidMode: PidMode) {
        cdkBuilder.pidMode(pidMode)
    }

    /**
     * The placement constraints to use for tasks in the service.
     *
     * You can specify a maximum of 10 constraints per task (this limit includes constraints in the
     * task definition and those specified at run time).
     *
     * Not supported in Fargate.
     *
     * Default: - No placement constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service.
     */
    public fun placementConstraints(vararg placementConstraints: PlacementConstraint) {
        _placementConstraints.addAll(listOf(*placementConstraints))
    }

    /**
     * The placement constraints to use for tasks in the service.
     *
     * You can specify a maximum of 10 constraints per task (this limit includes constraints in the
     * task definition and those specified at run time).
     *
     * Not supported in Fargate.
     *
     * Default: - No placement constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service.
     */
    public fun placementConstraints(placementConstraints: Collection<PlacementConstraint>) {
        _placementConstraints.addAll(placementConstraints)
    }

    /**
     * The configuration details for the App Mesh proxy.
     *
     * Default: - No proxy configuration.
     *
     * @param proxyConfiguration The configuration details for the App Mesh proxy.
     */
    public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
        cdkBuilder.proxyConfiguration(proxyConfiguration)
    }

    /**
     * The operating system that your task definitions are running on.
     *
     * A runtimePlatform is supported only for tasks using the Fargate launch type.
     *
     * Default: - Undefined.
     *
     * @param runtimePlatform The operating system that your task definitions are running on.
     */
    public fun runtimePlatform(runtimePlatform: RuntimePlatformDsl.() -> Unit = {}) {
        val builder = RuntimePlatformDsl()
        builder.apply(runtimePlatform)
        cdkBuilder.runtimePlatform(builder.build())
    }

    /**
     * The operating system that your task definitions are running on.
     *
     * A runtimePlatform is supported only for tasks using the Fargate launch type.
     *
     * Default: - Undefined.
     *
     * @param runtimePlatform The operating system that your task definitions are running on.
     */
    public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
        cdkBuilder.runtimePlatform(runtimePlatform)
    }

    /**
     * The name of the IAM role that grants containers in the task permission to call AWS APIs on
     * your behalf.
     *
     * Default: - A task role is automatically created for you.
     *
     * @param taskRole The name of the IAM role that grants containers in the task permission to
     *   call AWS APIs on your behalf.
     */
    public fun taskRole(taskRole: IRole) {
        cdkBuilder.taskRole(taskRole)
    }

    /**
     * The list of volume definitions for the task.
     *
     * For more information, see
     * [Task Definition Parameter Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     *
     * Default: - No volumes are passed to the Docker daemon on a container instance.
     *
     * @param volumes The list of volume definitions for the task.
     */
    public fun volumes(volumes: VolumeDsl.() -> Unit) {
        _volumes.add(VolumeDsl().apply(volumes).build())
    }

    /**
     * The list of volume definitions for the task.
     *
     * For more information, see
     * [Task Definition Parameter Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     *
     * Default: - No volumes are passed to the Docker daemon on a container instance.
     *
     * @param volumes The list of volume definitions for the task.
     */
    public fun volumes(volumes: Collection<Volume>) {
        _volumes.addAll(volumes)
    }

    public fun build(): TaskDefinition {
        if (_inferenceAccelerators.isNotEmpty())
            cdkBuilder.inferenceAccelerators(_inferenceAccelerators)
        if (_placementConstraints.isNotEmpty())
            cdkBuilder.placementConstraints(_placementConstraints)
        if (_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
        return cdkBuilder.build()
    }
}
