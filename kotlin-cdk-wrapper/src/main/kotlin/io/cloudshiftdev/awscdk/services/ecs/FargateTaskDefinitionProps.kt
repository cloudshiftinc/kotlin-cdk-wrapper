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
 * The properties for a task definition.
 *
 * Example:
 *
 * ```
 * FargateTaskDefinition fargateTaskDefinition = FargateTaskDefinition.Builder.create(this,
 * "TaskDef")
 * .runtimePlatform(RuntimePlatform.builder()
 * .operatingSystemFamily(OperatingSystemFamily.LINUX)
 * .cpuArchitecture(CpuArchitecture.ARM64)
 * .build())
 * .memoryLimitMiB(512)
 * .cpu(256)
 * .pidMode(PidMode.HOST)
 * .build();
 * ```
 */
public interface FargateTaskDefinitionProps : CommonTaskDefinitionProps {
  /**
   * The number of cpu units used by the task.
   *
   * For tasks using the Fargate launch type,
   * this field is required and you must use one of the following values,
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
   * Default: 256
   */
  public fun cpu(): Number? = unwrap(this).getCpu()

  /**
   * The amount (in GiB) of ephemeral storage to be allocated to the task.
   *
   * The maximum supported value is 200 GiB.
   *
   * NOTE: This parameter is only supported for tasks hosted on AWS Fargate using platform version
   * 1.4.0 or later.
   *
   * Default: 20
   */
  public fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

  /**
   * The amount (in MiB) of memory used by the task.
   *
   * For tasks using the Fargate launch type,
   * this field is required and you must use one of the following values, which determines your
   * range of valid values for the cpu parameter:
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
   * Default: 512
   */
  public fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

  /**
   * The process namespace to use for the containers in the task.
   *
   * Only supported for tasks that are hosted on AWS Fargate if the tasks
   * are using platform version 1.4.0 or later (Linux).
   * Not supported in Windows containers.
   *
   * Default: - PidMode used by the task is not specified
   */
  public fun pidMode(): PidMode? = unwrap(this).getPidMode()?.let(PidMode::wrap)

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
   * A builder for [FargateTaskDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cpu The number of cpu units used by the task.
     * For tasks using the Fargate launch type,
     * this field is required and you must use one of the following values,
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
    public fun cpu(cpu: Number)

    /**
     * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to the
     * task.
     * The maximum supported value is 200 GiB.
     *
     * NOTE: This parameter is only supported for tasks hosted on AWS Fargate using platform version
     * 1.4.0 or later.
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
     * @param memoryLimitMiB The amount (in MiB) of memory used by the task.
     * For tasks using the Fargate launch type,
     * this field is required and you must use one of the following values, which determines your
     * range of valid values for the cpu parameter:
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
    public fun memoryLimitMiB(memoryLimitMiB: Number)

    /**
     * @param pidMode The process namespace to use for the containers in the task.
     * Only supported for tasks that are hosted on AWS Fargate if the tasks
     * are using platform version 1.4.0 or later (Linux).
     * Not supported in Windows containers.
     */
    public fun pidMode(pidMode: PidMode)

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
    @JvmName("155de2a041f71af28c81cda70d395e02590af84689b48fbc9a6b8532c2e085eb")
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
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder =
        software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.builder()

    /**
     * @param cpu The number of cpu units used by the task.
     * For tasks using the Fargate launch type,
     * this field is required and you must use one of the following values,
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
    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to the
     * task.
     * The maximum supported value is 200 GiB.
     *
     * NOTE: This parameter is only supported for tasks hosted on AWS Fargate using platform version
     * 1.4.0 or later.
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
     * @param memoryLimitMiB The amount (in MiB) of memory used by the task.
     * For tasks using the Fargate launch type,
     * this field is required and you must use one of the following values, which determines your
     * range of valid values for the cpu parameter:
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
    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * @param pidMode The process namespace to use for the containers in the task.
     * Only supported for tasks that are hosted on AWS Fargate if the tasks
     * are using platform version 1.4.0 or later (Linux).
     * Not supported in Windows containers.
     */
    override fun pidMode(pidMode: PidMode) {
      cdkBuilder.pidMode(pidMode.let(PidMode::unwrap))
    }

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
    @JvmName("155de2a041f71af28c81cda70d395e02590af84689b48fbc9a6b8532c2e085eb")
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

    public fun build(): software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps,
  ) : CdkObject(cdkObject), FargateTaskDefinitionProps {
    /**
     * The number of cpu units used by the task.
     *
     * For tasks using the Fargate launch type,
     * this field is required and you must use one of the following values,
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
     * Default: 256
     */
    override fun cpu(): Number? = unwrap(this).getCpu()

    /**
     * The amount (in GiB) of ephemeral storage to be allocated to the task.
     *
     * The maximum supported value is 200 GiB.
     *
     * NOTE: This parameter is only supported for tasks hosted on AWS Fargate using platform version
     * 1.4.0 or later.
     *
     * Default: 20
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
     * The amount (in MiB) of memory used by the task.
     *
     * For tasks using the Fargate launch type,
     * this field is required and you must use one of the following values, which determines your
     * range of valid values for the cpu parameter:
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
     * Default: 512
     */
    override fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

    /**
     * The process namespace to use for the containers in the task.
     *
     * Only supported for tasks that are hosted on AWS Fargate if the tasks
     * are using platform version 1.4.0 or later (Linux).
     * Not supported in Windows containers.
     *
     * Default: - PidMode used by the task is not specified
     */
    override fun pidMode(): PidMode? = unwrap(this).getPidMode()?.let(PidMode::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): FargateTaskDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps):
        FargateTaskDefinitionProps = CdkObjectWrappers.wrap(cdkObject) as?
        FargateTaskDefinitionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FargateTaskDefinitionProps):
        software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps
  }
}
