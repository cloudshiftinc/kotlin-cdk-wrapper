@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * The properties for task definitions.
 *
 * Example:
 *
 * ```
 * IVpc vpc = Vpc.fromLookup(this, "Vpc", VpcLookupOptions.builder()
 * .isDefault(true)
 * .build());
 * Cluster cluster = Cluster.Builder.create(this, "Ec2Cluster").vpc(vpc).build();
 * cluster.addCapacity("DefaultAutoScalingGroup", AddCapacityOptions.builder()
 * .instanceType(new InstanceType("t2.micro"))
 * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
 * .build());
 * TaskDefinition taskDefinition = TaskDefinition.Builder.create(this, "TD")
 * .compatibility(Compatibility.EC2)
 * .build();
 * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("foo/bar"))
 * .memoryLimitMiB(256)
 * .build());
 * EcsRunTask runTask = EcsRunTask.Builder.create(this, "Run")
 * .integrationPattern(IntegrationPattern.RUN_JOB)
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .launchTarget(EcsEc2LaunchTarget.Builder.create()
 * .placementStrategies(List.of(PlacementStrategy.spreadAcrossInstances(),
 * PlacementStrategy.packedByCpu(), PlacementStrategy.randomly()))
 * .placementConstraints(List.of(PlacementConstraint.memberOf("blieptuut")))
 * .build())
 * .propagatedTagSource(PropagatedTagSource.TASK_DEFINITION)
 * .build();
 * ```
 */
public interface TaskDefinitionProps : CommonTaskDefinitionProps {
  /**
   * The task launch type compatiblity requirement.
   */
  public fun compatibility(): Compatibility

  /**
   * The number of cpu units used by the task.
   *
   * If you are using the EC2 launch type, this field is optional and any value can be used.
   * If you are using the Fargate launch type, this field is required and you must use one of the
   * following values,
   * which determines your range of valid values for the memory parameter:
   *
   * 256 (.25 vCPU) - Available memory values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
   *
   * 512 (.5 vCPU) - Available memory values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
   *
   * 1024 (1 vCPU) - Available memory values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB),
   * 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
   *
   * 2048 (2 vCPU) - Available memory values: Between 4096 (4 GB) and 16384 (16 GB) in increments of
   * 1024 (1 GB)
   *
   * 4096 (4 vCPU) - Available memory values: Between 8192 (8 GB) and 30720 (30 GB) in increments of
   * 1024 (1 GB)
   *
   * 8192 (8 vCPU) - Available memory values: Between 16384 (16 GB) and 61440 (60 GB) in increments
   * of 4096 (4 GB)
   *
   * 16384 (16 vCPU) - Available memory values: Between 32768 (32 GB) and 122880 (120 GB) in
   * increments of 8192 (8 GB)
   *
   * Default: - CPU units are not specified.
   */
  public fun cpu(): String? = unwrap(this).getCpu()

  /**
   * The amount (in GiB) of ephemeral storage to be allocated to the task.
   *
   * Only supported in Fargate platform version 1.4.0 or later.
   *
   * Default: - Undefined, in which case, the task will receive 20GiB ephemeral storage.
   */
  public fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

  /**
   * The inference accelerators to use for the containers in the task.
   *
   * Not supported in Fargate.
   *
   * Default: - No inference accelerators.
   */
  public fun inferenceAccelerators(): List<InferenceAccelerator> =
      unwrap(this).getInferenceAccelerators()?.map(InferenceAccelerator::wrap) ?: emptyList()

  /**
   * The IPC resource namespace to use for the containers in the task.
   *
   * Not supported in Fargate and Windows containers.
   *
   * Default: - IpcMode used by the task is not specified
   */
  public fun ipcMode(): IpcMode? = unwrap(this).getIpcMode()?.let(IpcMode::wrap)

  /**
   * The amount (in MiB) of memory used by the task.
   *
   * If using the EC2 launch type, this field is optional and any value can be used.
   * If using the Fargate launch type, this field is required and you must use one of the following
   * values,
   * which determines your range of valid values for the cpu parameter:
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
   * Default: - Memory used by task is not specified.
   */
  public fun memoryMiB(): String? = unwrap(this).getMemoryMiB()

  /**
   * The networking mode to use for the containers in the task.
   *
   * On Fargate, the only supported networking mode is AwsVpc.
   *
   * Default: - NetworkMode.Bridge for EC2 & External tasks, AwsVpc for Fargate tasks.
   */
  public fun networkMode(): NetworkMode? = unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

  /**
   * The process namespace to use for the containers in the task.
   *
   * Not supported in Fargate and Windows containers.
   *
   * Default: - PidMode used by the task is not specified
   */
  public fun pidMode(): PidMode? = unwrap(this).getPidMode()?.let(PidMode::wrap)

  /**
   * The placement constraints to use for tasks in the service.
   *
   * You can specify a maximum of 10 constraints per task (this limit includes
   * constraints in the task definition and those specified at run time).
   *
   * Not supported in Fargate.
   *
   * Default: - No placement constraints.
   */
  public fun placementConstraints(): List<PlacementConstraint> =
      unwrap(this).getPlacementConstraints()?.map(PlacementConstraint::wrap) ?: emptyList()

  /**
   * The operating system that your task definitions are running on.
   *
   * A runtimePlatform is supported only for tasks using the Fargate launch type.
   *
   * Default: - Undefined.
   */
  public fun runtimePlatform(): RuntimePlatform? =
      unwrap(this).getRuntimePlatform()?.let(RuntimePlatform::wrap)

  /**
   * A builder for [TaskDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param compatibility The task launch type compatiblity requirement. 
     */
    public fun compatibility(compatibility: Compatibility)

    /**
     * @param cpu The number of cpu units used by the task.
     * If you are using the EC2 launch type, this field is optional and any value can be used.
     * If you are using the Fargate launch type, this field is required and you must use one of the
     * following values,
     * which determines your range of valid values for the memory parameter:
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
     */
    public fun cpu(cpu: String)

    /**
     * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to the
     * task.
     * Only supported in Fargate platform version 1.4.0 or later.
     */
    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number)

    /**
     * @param executionRole The name of the IAM task execution role that grants the ECS agent
     * permission to call AWS APIs on your behalf.
     * The role will be used to retrieve container images from ECR and create CloudWatch log groups.
     */
    public fun executionRole(executionRole: IRole)

    /**
     * @param family The name of a family that this task definition is registered to.
     * A family groups multiple versions of a task definition.
     */
    public fun family(family: String)

    /**
     * @param inferenceAccelerators The inference accelerators to use for the containers in the
     * task.
     * Not supported in Fargate.
     */
    public fun inferenceAccelerators(inferenceAccelerators: List<InferenceAccelerator>)

    /**
     * @param inferenceAccelerators The inference accelerators to use for the containers in the
     * task.
     * Not supported in Fargate.
     */
    public fun inferenceAccelerators(vararg inferenceAccelerators: InferenceAccelerator)

    /**
     * @param ipcMode The IPC resource namespace to use for the containers in the task.
     * Not supported in Fargate and Windows containers.
     */
    public fun ipcMode(ipcMode: IpcMode)

    /**
     * @param memoryMiB The amount (in MiB) of memory used by the task.
     * If using the EC2 launch type, this field is optional and any value can be used.
     * If using the Fargate launch type, this field is required and you must use one of the
     * following values,
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
     */
    public fun memoryMiB(memoryMiB: String)

    /**
     * @param networkMode The networking mode to use for the containers in the task.
     * On Fargate, the only supported networking mode is AwsVpc.
     */
    public fun networkMode(networkMode: NetworkMode)

    /**
     * @param pidMode The process namespace to use for the containers in the task.
     * Not supported in Fargate and Windows containers.
     */
    public fun pidMode(pidMode: PidMode)

    /**
     * @param placementConstraints The placement constraints to use for tasks in the service.
     * You can specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at run time).
     *
     * Not supported in Fargate.
     */
    public fun placementConstraints(placementConstraints: List<PlacementConstraint>)

    /**
     * @param placementConstraints The placement constraints to use for tasks in the service.
     * You can specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at run time).
     *
     * Not supported in Fargate.
     */
    public fun placementConstraints(vararg placementConstraints: PlacementConstraint)

    /**
     * @param proxyConfiguration The configuration details for the App Mesh proxy.
     */
    public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration)

    /**
     * @param runtimePlatform The operating system that your task definitions are running on.
     * A runtimePlatform is supported only for tasks using the Fargate launch type.
     */
    public fun runtimePlatform(runtimePlatform: RuntimePlatform)

    /**
     * @param runtimePlatform The operating system that your task definitions are running on.
     * A runtimePlatform is supported only for tasks using the Fargate launch type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6091f02e39cd6a1f9669dcae4891b236fb3c526a92fe4722fd4f31dce3ad872")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

    /**
     * @param taskRole The name of the IAM role that grants containers in the task permission to
     * call AWS APIs on your behalf.
     */
    public fun taskRole(taskRole: IRole)

    /**
     * @param volumes The list of volume definitions for the task.
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     */
    public fun volumes(volumes: List<Volume>)

    /**
     * @param volumes The list of volume definitions for the task.
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     */
    public fun volumes(vararg volumes: Volume)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder =
        software.amazon.awscdk.services.ecs.TaskDefinitionProps.builder()

    /**
     * @param compatibility The task launch type compatiblity requirement. 
     */
    override fun compatibility(compatibility: Compatibility) {
      cdkBuilder.compatibility(compatibility.let(Compatibility::unwrap))
    }

    /**
     * @param cpu The number of cpu units used by the task.
     * If you are using the EC2 launch type, this field is optional and any value can be used.
     * If you are using the Fargate launch type, this field is required and you must use one of the
     * following values,
     * which determines your range of valid values for the memory parameter:
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
     */
    override fun cpu(cpu: String) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to the
     * task.
     * Only supported in Fargate platform version 1.4.0 or later.
     */
    override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
      cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    /**
     * @param executionRole The name of the IAM task execution role that grants the ECS agent
     * permission to call AWS APIs on your behalf.
     * The role will be used to retrieve container images from ECR and create CloudWatch log groups.
     */
    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    /**
     * @param family The name of a family that this task definition is registered to.
     * A family groups multiple versions of a task definition.
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * @param inferenceAccelerators The inference accelerators to use for the containers in the
     * task.
     * Not supported in Fargate.
     */
    override fun inferenceAccelerators(inferenceAccelerators: List<InferenceAccelerator>) {
      cdkBuilder.inferenceAccelerators(inferenceAccelerators.map(InferenceAccelerator::unwrap))
    }

    /**
     * @param inferenceAccelerators The inference accelerators to use for the containers in the
     * task.
     * Not supported in Fargate.
     */
    override fun inferenceAccelerators(vararg inferenceAccelerators: InferenceAccelerator): Unit =
        inferenceAccelerators(inferenceAccelerators.toList())

    /**
     * @param ipcMode The IPC resource namespace to use for the containers in the task.
     * Not supported in Fargate and Windows containers.
     */
    override fun ipcMode(ipcMode: IpcMode) {
      cdkBuilder.ipcMode(ipcMode.let(IpcMode::unwrap))
    }

    /**
     * @param memoryMiB The amount (in MiB) of memory used by the task.
     * If using the EC2 launch type, this field is optional and any value can be used.
     * If using the Fargate launch type, this field is required and you must use one of the
     * following values,
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
     */
    override fun memoryMiB(memoryMiB: String) {
      cdkBuilder.memoryMiB(memoryMiB)
    }

    /**
     * @param networkMode The networking mode to use for the containers in the task.
     * On Fargate, the only supported networking mode is AwsVpc.
     */
    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
    }

    /**
     * @param pidMode The process namespace to use for the containers in the task.
     * Not supported in Fargate and Windows containers.
     */
    override fun pidMode(pidMode: PidMode) {
      cdkBuilder.pidMode(pidMode.let(PidMode::unwrap))
    }

    /**
     * @param placementConstraints The placement constraints to use for tasks in the service.
     * You can specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at run time).
     *
     * Not supported in Fargate.
     */
    override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    /**
     * @param placementConstraints The placement constraints to use for tasks in the service.
     * You can specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at run time).
     *
     * Not supported in Fargate.
     */
    override fun placementConstraints(vararg placementConstraints: PlacementConstraint): Unit =
        placementConstraints(placementConstraints.toList())

    /**
     * @param proxyConfiguration The configuration details for the App Mesh proxy.
     */
    override fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(ProxyConfiguration::unwrap))
    }

    /**
     * @param runtimePlatform The operating system that your task definitions are running on.
     * A runtimePlatform is supported only for tasks using the Fargate launch type.
     */
    override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
    }

    /**
     * @param runtimePlatform The operating system that your task definitions are running on.
     * A runtimePlatform is supported only for tasks using the Fargate launch type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6091f02e39cd6a1f9669dcae4891b236fb3c526a92fe4722fd4f31dce3ad872")
    override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    /**
     * @param taskRole The name of the IAM role that grants containers in the task permission to
     * call AWS APIs on your behalf.
     */
    override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    /**
     * @param volumes The list of volume definitions for the task.
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     */
    override fun volumes(volumes: List<Volume>) {
      cdkBuilder.volumes(volumes.map(Volume::unwrap))
    }

    /**
     * @param volumes The list of volume definitions for the task.
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     */
    override fun volumes(vararg volumes: Volume): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.ecs.TaskDefinitionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.TaskDefinitionProps,
  ) : CdkObject(cdkObject), TaskDefinitionProps {
    /**
     * The task launch type compatiblity requirement.
     */
    override fun compatibility(): Compatibility =
        unwrap(this).getCompatibility().let(Compatibility::wrap)

    /**
     * The number of cpu units used by the task.
     *
     * If you are using the EC2 launch type, this field is optional and any value can be used.
     * If you are using the Fargate launch type, this field is required and you must use one of the
     * following values,
     * which determines your range of valid values for the memory parameter:
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
     */
    override fun cpu(): String? = unwrap(this).getCpu()

    /**
     * The amount (in GiB) of ephemeral storage to be allocated to the task.
     *
     * Only supported in Fargate platform version 1.4.0 or later.
     *
     * Default: - Undefined, in which case, the task will receive 20GiB ephemeral storage.
     */
    override fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

    /**
     * The name of the IAM task execution role that grants the ECS agent permission to call AWS APIs
     * on your behalf.
     *
     * The role will be used to retrieve container images from ECR and create CloudWatch log groups.
     *
     * Default: - An execution role will be automatically created if you use ECR images in your task
     * definition.
     */
    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    /**
     * The name of a family that this task definition is registered to.
     *
     * A family groups multiple versions of a task definition.
     *
     * Default: - Automatically generated name.
     */
    override fun family(): String? = unwrap(this).getFamily()

    /**
     * The inference accelerators to use for the containers in the task.
     *
     * Not supported in Fargate.
     *
     * Default: - No inference accelerators.
     */
    override fun inferenceAccelerators(): List<InferenceAccelerator> =
        unwrap(this).getInferenceAccelerators()?.map(InferenceAccelerator::wrap) ?: emptyList()

    /**
     * The IPC resource namespace to use for the containers in the task.
     *
     * Not supported in Fargate and Windows containers.
     *
     * Default: - IpcMode used by the task is not specified
     */
    override fun ipcMode(): IpcMode? = unwrap(this).getIpcMode()?.let(IpcMode::wrap)

    /**
     * The amount (in MiB) of memory used by the task.
     *
     * If using the EC2 launch type, this field is optional and any value can be used.
     * If using the Fargate launch type, this field is required and you must use one of the
     * following values,
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
     */
    override fun memoryMiB(): String? = unwrap(this).getMemoryMiB()

    /**
     * The networking mode to use for the containers in the task.
     *
     * On Fargate, the only supported networking mode is AwsVpc.
     *
     * Default: - NetworkMode.Bridge for EC2 & External tasks, AwsVpc for Fargate tasks.
     */
    override fun networkMode(): NetworkMode? = unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

    /**
     * The process namespace to use for the containers in the task.
     *
     * Not supported in Fargate and Windows containers.
     *
     * Default: - PidMode used by the task is not specified
     */
    override fun pidMode(): PidMode? = unwrap(this).getPidMode()?.let(PidMode::wrap)

    /**
     * The placement constraints to use for tasks in the service.
     *
     * You can specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at run time).
     *
     * Not supported in Fargate.
     *
     * Default: - No placement constraints.
     */
    override fun placementConstraints(): List<PlacementConstraint> =
        unwrap(this).getPlacementConstraints()?.map(PlacementConstraint::wrap) ?: emptyList()

    /**
     * The configuration details for the App Mesh proxy.
     *
     * Default: - No proxy configuration.
     */
    override fun proxyConfiguration(): ProxyConfiguration? =
        unwrap(this).getProxyConfiguration()?.let(ProxyConfiguration::wrap)

    /**
     * The operating system that your task definitions are running on.
     *
     * A runtimePlatform is supported only for tasks using the Fargate launch type.
     *
     * Default: - Undefined.
     */
    override fun runtimePlatform(): RuntimePlatform? =
        unwrap(this).getRuntimePlatform()?.let(RuntimePlatform::wrap)

    /**
     * The name of the IAM role that grants containers in the task permission to call AWS APIs on
     * your behalf.
     *
     * Default: - A task role is automatically created for you.
     */
    override fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)

    /**
     * The list of volume definitions for the task.
     *
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     *
     * Default: - No volumes are passed to the Docker daemon on a container instance.
     */
    override fun volumes(): List<Volume> = unwrap(this).getVolumes()?.map(Volume::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TaskDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.TaskDefinitionProps):
        TaskDefinitionProps = CdkObjectWrappers.wrap(cdkObject) as? TaskDefinitionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TaskDefinitionProps):
        software.amazon.awscdk.services.ecs.TaskDefinitionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.TaskDefinitionProps
  }
}
