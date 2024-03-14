package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class FargateTaskDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.FargateTaskDefinition,
) : TaskDefinition(cdkObject), IFargateTaskDefinition {
  /**
   * The amount (in GiB) of ephemeral storage to be allocated to the task.
   */
  public override fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

  /**
   * The Docker networking mode to use for the containers in the task.
   *
   * Fargate tasks require the awsvpc network mode.
   */
  public override fun networkMode(): NetworkMode =
      unwrap(this).getNetworkMode().let(NetworkMode::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.FargateTaskDefinition].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param cpu The number of cpu units used by the task. 
     */
    public fun cpu(cpu: Number)

    /**
     * The amount (in GiB) of ephemeral storage to be allocated to the task.
     *
     * The maximum supported value is 200 GiB.
     *
     * NOTE: This parameter is only supported for tasks hosted on AWS Fargate using platform version
     * 1.4.0 or later.
     *
     * Default: 20
     *
     * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to the
     * task. 
     */
    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number)

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
     * permission to call AWS APIs on your behalf. 
     */
    public fun executionRole(executionRole: IRole)

    /**
     * The name of a family that this task definition is registered to.
     *
     * A family groups multiple versions of a task definition.
     *
     * Default: - Automatically generated name.
     *
     * @param family The name of a family that this task definition is registered to. 
     */
    public fun family(family: String)

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
     *
     * @param memoryLimitMiB The amount (in MiB) of memory used by the task. 
     */
    public fun memoryLimitMiB(memoryLimitMiB: Number)

    /**
     * The configuration details for the App Mesh proxy.
     *
     * Default: - No proxy configuration.
     *
     * @param proxyConfiguration The configuration details for the App Mesh proxy. 
     */
    public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration)

    /**
     * The operating system that your task definitions are running on.
     *
     * A runtimePlatform is supported only for tasks using the Fargate launch type.
     *
     * Default: - Undefined.
     *
     * @param runtimePlatform The operating system that your task definitions are running on. 
     */
    public fun runtimePlatform(runtimePlatform: RuntimePlatform)

    /**
     * The operating system that your task definitions are running on.
     *
     * A runtimePlatform is supported only for tasks using the Fargate launch type.
     *
     * Default: - Undefined.
     *
     * @param runtimePlatform The operating system that your task definitions are running on. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65289a49e102f663d0c73fa0f299525a30b82c6d93c702eb7f7a68a6aef2dbd7")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

    /**
     * The name of the IAM role that grants containers in the task permission to call AWS APIs on
     * your behalf.
     *
     * Default: - A task role is automatically created for you.
     *
     * @param taskRole The name of the IAM role that grants containers in the task permission to
     * call AWS APIs on your behalf. 
     */
    public fun taskRole(taskRole: IRole)

    /**
     * The list of volume definitions for the task.
     *
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     *
     * Default: - No volumes are passed to the Docker daemon on a container instance.
     *
     * @param volumes The list of volume definitions for the task. 
     */
    public fun volumes(volumes: List<Volume>)

    /**
     * The list of volume definitions for the task.
     *
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     *
     * Default: - No volumes are passed to the Docker daemon on a container instance.
     *
     * @param volumes The list of volume definitions for the task. 
     */
    public fun volumes(vararg volumes: Volume)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FargateTaskDefinition.Builder =
        software.amazon.awscdk.services.ecs.FargateTaskDefinition.Builder.create(scope, id)

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
     *
     * @param cpu The number of cpu units used by the task. 
     */
    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * The amount (in GiB) of ephemeral storage to be allocated to the task.
     *
     * The maximum supported value is 200 GiB.
     *
     * NOTE: This parameter is only supported for tasks hosted on AWS Fargate using platform version
     * 1.4.0 or later.
     *
     * Default: 20
     *
     * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to the
     * task. 
     */
    override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
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
     * permission to call AWS APIs on your behalf. 
     */
    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
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
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

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
     *
     * @param memoryLimitMiB The amount (in MiB) of memory used by the task. 
     */
    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * The configuration details for the App Mesh proxy.
     *
     * Default: - No proxy configuration.
     *
     * @param proxyConfiguration The configuration details for the App Mesh proxy. 
     */
    override fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(ProxyConfiguration::unwrap))
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
    override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65289a49e102f663d0c73fa0f299525a30b82c6d93c702eb7f7a68a6aef2dbd7")
    override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    /**
     * The name of the IAM role that grants containers in the task permission to call AWS APIs on
     * your behalf.
     *
     * Default: - A task role is automatically created for you.
     *
     * @param taskRole The name of the IAM role that grants containers in the task permission to
     * call AWS APIs on your behalf. 
     */
    override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    /**
     * The list of volume definitions for the task.
     *
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     *
     * Default: - No volumes are passed to the Docker daemon on a container instance.
     *
     * @param volumes The list of volume definitions for the task. 
     */
    override fun volumes(volumes: List<Volume>) {
      cdkBuilder.volumes(volumes.map(Volume::unwrap))
    }

    /**
     * The list of volume definitions for the task.
     *
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     *
     * Default: - No volumes are passed to the Docker daemon on a container instance.
     *
     * @param volumes The list of volume definitions for the task. 
     */
    override fun volumes(vararg volumes: Volume): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.ecs.FargateTaskDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromFargateTaskDefinitionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      fargateTaskDefinitionArn: String,
    ): IFargateTaskDefinition =
        software.amazon.awscdk.services.ecs.FargateTaskDefinition.fromFargateTaskDefinitionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, fargateTaskDefinitionArn).let(IFargateTaskDefinition::wrap)

    public fun fromFargateTaskDefinitionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FargateTaskDefinitionAttributes,
    ): IFargateTaskDefinition =
        software.amazon.awscdk.services.ecs.FargateTaskDefinition.fromFargateTaskDefinitionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(FargateTaskDefinitionAttributes::unwrap)).let(IFargateTaskDefinition::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a04252545f1217926f85148bb768fff294d8987397e2ce21b792cf7ae5f7fdcf")
    public fun fromFargateTaskDefinitionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FargateTaskDefinitionAttributes.Builder.() -> Unit,
    ): IFargateTaskDefinition = fromFargateTaskDefinitionAttributes(scope, id,
        FargateTaskDefinitionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FargateTaskDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FargateTaskDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FargateTaskDefinition):
        FargateTaskDefinition = FargateTaskDefinition(cdkObject)

    internal fun unwrap(wrapped: FargateTaskDefinition):
        software.amazon.awscdk.services.ecs.FargateTaskDefinition = wrapped.cdkObject
  }
}
