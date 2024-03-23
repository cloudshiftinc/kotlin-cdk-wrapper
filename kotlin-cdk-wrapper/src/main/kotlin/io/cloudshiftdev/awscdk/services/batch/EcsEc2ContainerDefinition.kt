@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.LogDriverConfig
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A container orchestrated by ECS that uses EC2 resources.
 *
 * Example:
 *
 * ```
 * IVpc vpc;
 * EcsJobDefinition ecsJob = EcsJobDefinition.Builder.create(this, "JobDefn")
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
 * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
 * .memory(Size.mebibytes(2048))
 * .cpu(256)
 * .build())
 * .build();
 * JobQueue queue = JobQueue.Builder.create(this, "JobQueue")
 * .computeEnvironments(List.of(OrderedComputeEnvironment.builder()
 * .computeEnvironment(ManagedEc2EcsComputeEnvironment.Builder.create(this, "managedEc2CE")
 * .vpc(vpc)
 * .build())
 * .order(1)
 * .build()))
 * .priority(10)
 * .build();
 * User user = new User(this, "MyUser");
 * ecsJob.grantSubmitJob(user, queue);
 * ```
 */
public open class EcsEc2ContainerDefinition(
  cdkObject: software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition,
) : CloudshiftdevConstructsConstruct(cdkObject), IEcsEc2ContainerDefinition, IEcsContainerDefinition
    {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EcsEc2ContainerDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(EcsEc2ContainerDefinitionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EcsEc2ContainerDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, EcsEc2ContainerDefinitionProps(props)
  )

  /**
   * Add a ulimit to this container.
   *
   * @param ulimit 
   */
  public override fun addUlimit(ulimit: Ulimit) {
    unwrap(this).addUlimit(ulimit.let(Ulimit::unwrap))
  }

  /**
   * Add a ulimit to this container.
   *
   * @param ulimit 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a0d25fa71c4ef0333f45890e42d61da3c880f3fe8da2e4cc0ad769dfba1854d9")
  public override fun addUlimit(ulimit: Ulimit.Builder.() -> Unit): Unit = addUlimit(Ulimit(ulimit))

  /**
   * Add a Volume to this container.
   *
   * @param volume 
   */
  public override fun addVolume(volume: EcsVolume) {
    unwrap(this).addVolume(volume.let(EcsVolume::unwrap))
  }

  /**
   * The command that's passed to the container.
   */
  public override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  /**
   * The number of vCPUs reserved for the container.
   *
   * Each vCPU is equivalent to 1,024 CPU shares.
   * For containers running on EC2 resources, you must specify at least one vCPU.
   */
  public override fun cpu(): Number = unwrap(this).getCpu()

  /**
   * The environment variables to pass to a container.
   *
   * Cannot start with `AWS_BATCH`.
   * We don't recommend using plaintext environment variables for sensitive information, such as
   * credential data.
   */
  public override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?:
      emptyMap()

  /**
   * The role used by Amazon ECS container and AWS Fargate agents to make AWS API calls on your
   * behalf.
   */
  public override fun executionRole(): IRole = unwrap(this).getExecutionRole().let(IRole::wrap)

  /**
   * The number of physical GPUs to reserve for the container.
   *
   * Make sure that the number of GPUs reserved for all containers in a job doesn't exceed
   * the number of available GPUs on the compute resource that the job is launched on.
   */
  public override fun gpu(): Number? = unwrap(this).getGpu()

  /**
   * The image that this container will run.
   */
  public override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

  /**
   * The role that the container can assume.
   */
  public override fun jobRole(): IRole? = unwrap(this).getJobRole()?.let(IRole::wrap)

  /**
   * Linux-specific modifications that are applied to the container, such as details for device
   * mappings.
   */
  public override fun linuxParameters(): LinuxParameters? =
      unwrap(this).getLinuxParameters()?.let(LinuxParameters::wrap)

  /**
   * The configuration of the log driver.
   */
  public override fun logDriverConfig(): LogDriverConfig? =
      unwrap(this).getLogDriverConfig()?.let(LogDriverConfig::wrap)

  /**
   * The memory hard limit present to the container.
   *
   * If your container attempts to exceed the memory specified, the container is terminated.
   * You must specify at least 4 MiB of memory for a job.
   */
  public override fun memory(): Size = unwrap(this).getMemory().let(Size::wrap)

  /**
   * When this parameter is true, the container is given elevated permissions on the host container
   * instance (similar to the root user).
   */
  public override fun privileged(): Boolean? = unwrap(this).getPrivileged()

  /**
   * Gives the container readonly access to its root filesystem.
   */
  public override fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

  /**
   * A map from environment variable names to the secrets for the container.
   *
   * Allows your job definitions
   * to reference the secret by the environment variable name defined in this property.
   */
  public override fun secrets(): Map<String, Secret> =
      unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  /**
   * Limits to set for the user this docker container will run as.
   */
  public override fun ulimits(): List<Ulimit> = unwrap(this).getUlimits().map(Ulimit::wrap)

  /**
   * The user name to use inside the container.
   */
  public override fun user(): String? = unwrap(this).getUser()

  /**
   * The volumes to mount to this container.
   *
   * Automatically added to the job definition.
   */
  public override fun volumes(): List<EcsVolume> = unwrap(this).getVolumes().map(EcsVolume::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.EcsEc2ContainerDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The command that's passed to the container.
     *
     * Default: - no command
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     * @param command The command that's passed to the container. 
     */
    public fun command(command: List<String>)

    /**
     * The command that's passed to the container.
     *
     * Default: - no command
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     * @param command The command that's passed to the container. 
     */
    public fun command(vararg command: String)

    /**
     * The number of vCPUs reserved for the container.
     *
     * Each vCPU is equivalent to 1,024 CPU shares.
     * For containers running on EC2 resources, you must specify at least one vCPU.
     *
     * @param cpu The number of vCPUs reserved for the container. 
     */
    public fun cpu(cpu: Number)

    /**
     * The environment variables to pass to a container.
     *
     * Cannot start with `AWS_BATCH`.
     * We don't recommend using plaintext environment variables for sensitive information, such as
     * credential data.
     *
     * Default: - no environment variables
     *
     * @param environment The environment variables to pass to a container. 
     */
    public fun environment(environment: Map<String, String>)

    /**
     * The role used by Amazon ECS container and AWS Fargate agents to make AWS API calls on your
     * behalf.
     *
     * Default: - a Role will be created
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html)
     * @param executionRole The role used by Amazon ECS container and AWS Fargate agents to make AWS
     * API calls on your behalf. 
     */
    public fun executionRole(executionRole: IRole)

    /**
     * The number of physical GPUs to reserve for the container.
     *
     * Make sure that the number of GPUs reserved for all containers in a job doesn't exceed
     * the number of available GPUs on the compute resource that the job is launched on.
     *
     * Default: - no gpus
     *
     * @param gpu The number of physical GPUs to reserve for the container. 
     */
    public fun gpu(gpu: Number)

    /**
     * The image that this container will run.
     *
     * @param image The image that this container will run. 
     */
    public fun image(image: ContainerImage)

    /**
     * The role that the container can assume.
     *
     * Default: - no job role
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html)
     * @param jobRole The role that the container can assume. 
     */
    public fun jobRole(jobRole: IRole)

    /**
     * Linux-specific modifications that are applied to the container, such as details for device
     * mappings.
     *
     * Default: none
     *
     * @param linuxParameters Linux-specific modifications that are applied to the container, such
     * as details for device mappings. 
     */
    public fun linuxParameters(linuxParameters: LinuxParameters)

    /**
     * The loging configuration for this Job.
     *
     * Default: - the log configuration of the Docker daemon
     *
     * @param logging The loging configuration for this Job. 
     */
    public fun logging(logging: LogDriver)

    /**
     * The memory hard limit present to the container.
     *
     * If your container attempts to exceed the memory specified, the container is terminated.
     * You must specify at least 4 MiB of memory for a job.
     *
     * @param memory The memory hard limit present to the container. 
     */
    public fun memory(memory: Size)

    /**
     * When this parameter is true, the container is given elevated permissions on the host
     * container instance (similar to the root user).
     *
     * Default: false
     *
     * @param privileged When this parameter is true, the container is given elevated permissions on
     * the host container instance (similar to the root user). 
     */
    public fun privileged(privileged: Boolean)

    /**
     * Gives the container readonly access to its root filesystem.
     *
     * Default: false
     *
     * @param readonlyRootFilesystem Gives the container readonly access to its root filesystem. 
     */
    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

    /**
     * A map from environment variable names to the secrets for the container.
     *
     * Allows your job definitions
     * to reference the secret by the environment variable name defined in this property.
     *
     * Default: - no secrets
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html)
     * @param secrets A map from environment variable names to the secrets for the container. 
     */
    public fun secrets(secrets: Map<String, Secret>)

    /**
     * Limits to set for the user this docker container will run as.
     *
     * Default: - no ulimits
     *
     * @param ulimits Limits to set for the user this docker container will run as. 
     */
    public fun ulimits(ulimits: List<Ulimit>)

    /**
     * Limits to set for the user this docker container will run as.
     *
     * Default: - no ulimits
     *
     * @param ulimits Limits to set for the user this docker container will run as. 
     */
    public fun ulimits(vararg ulimits: Ulimit)

    /**
     * The user name to use inside the container.
     *
     * Default: - no user
     *
     * @param user The user name to use inside the container. 
     */
    public fun user(user: String)

    /**
     * The volumes to mount to this container.
     *
     * Automatically added to the job definition.
     *
     * Default: - no volumes
     *
     * @param volumes The volumes to mount to this container. 
     */
    public fun volumes(volumes: List<EcsVolume>)

    /**
     * The volumes to mount to this container.
     *
     * Automatically added to the job definition.
     *
     * Default: - no volumes
     *
     * @param volumes The volumes to mount to this container. 
     */
    public fun volumes(vararg volumes: EcsVolume)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition.Builder
        = software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition.Builder.create(scope, id)

    /**
     * The command that's passed to the container.
     *
     * Default: - no command
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     * @param command The command that's passed to the container. 
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    /**
     * The command that's passed to the container.
     *
     * Default: - no command
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     * @param command The command that's passed to the container. 
     */
    override fun command(vararg command: String): Unit = command(command.toList())

    /**
     * The number of vCPUs reserved for the container.
     *
     * Each vCPU is equivalent to 1,024 CPU shares.
     * For containers running on EC2 resources, you must specify at least one vCPU.
     *
     * @param cpu The number of vCPUs reserved for the container. 
     */
    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * The environment variables to pass to a container.
     *
     * Cannot start with `AWS_BATCH`.
     * We don't recommend using plaintext environment variables for sensitive information, such as
     * credential data.
     *
     * Default: - no environment variables
     *
     * @param environment The environment variables to pass to a container. 
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * The role used by Amazon ECS container and AWS Fargate agents to make AWS API calls on your
     * behalf.
     *
     * Default: - a Role will be created
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html)
     * @param executionRole The role used by Amazon ECS container and AWS Fargate agents to make AWS
     * API calls on your behalf. 
     */
    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    /**
     * The number of physical GPUs to reserve for the container.
     *
     * Make sure that the number of GPUs reserved for all containers in a job doesn't exceed
     * the number of available GPUs on the compute resource that the job is launched on.
     *
     * Default: - no gpus
     *
     * @param gpu The number of physical GPUs to reserve for the container. 
     */
    override fun gpu(gpu: Number) {
      cdkBuilder.gpu(gpu)
    }

    /**
     * The image that this container will run.
     *
     * @param image The image that this container will run. 
     */
    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    /**
     * The role that the container can assume.
     *
     * Default: - no job role
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html)
     * @param jobRole The role that the container can assume. 
     */
    override fun jobRole(jobRole: IRole) {
      cdkBuilder.jobRole(jobRole.let(IRole::unwrap))
    }

    /**
     * Linux-specific modifications that are applied to the container, such as details for device
     * mappings.
     *
     * Default: none
     *
     * @param linuxParameters Linux-specific modifications that are applied to the container, such
     * as details for device mappings. 
     */
    override fun linuxParameters(linuxParameters: LinuxParameters) {
      cdkBuilder.linuxParameters(linuxParameters.let(LinuxParameters::unwrap))
    }

    /**
     * The loging configuration for this Job.
     *
     * Default: - the log configuration of the Docker daemon
     *
     * @param logging The loging configuration for this Job. 
     */
    override fun logging(logging: LogDriver) {
      cdkBuilder.logging(logging.let(LogDriver::unwrap))
    }

    /**
     * The memory hard limit present to the container.
     *
     * If your container attempts to exceed the memory specified, the container is terminated.
     * You must specify at least 4 MiB of memory for a job.
     *
     * @param memory The memory hard limit present to the container. 
     */
    override fun memory(memory: Size) {
      cdkBuilder.memory(memory.let(Size::unwrap))
    }

    /**
     * When this parameter is true, the container is given elevated permissions on the host
     * container instance (similar to the root user).
     *
     * Default: false
     *
     * @param privileged When this parameter is true, the container is given elevated permissions on
     * the host container instance (similar to the root user). 
     */
    override fun privileged(privileged: Boolean) {
      cdkBuilder.privileged(privileged)
    }

    /**
     * Gives the container readonly access to its root filesystem.
     *
     * Default: false
     *
     * @param readonlyRootFilesystem Gives the container readonly access to its root filesystem. 
     */
    override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
      cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    /**
     * A map from environment variable names to the secrets for the container.
     *
     * Allows your job definitions
     * to reference the secret by the environment variable name defined in this property.
     *
     * Default: - no secrets
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html)
     * @param secrets A map from environment variable names to the secrets for the container. 
     */
    override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues{Secret.unwrap(it.value)})
    }

    /**
     * Limits to set for the user this docker container will run as.
     *
     * Default: - no ulimits
     *
     * @param ulimits Limits to set for the user this docker container will run as. 
     */
    override fun ulimits(ulimits: List<Ulimit>) {
      cdkBuilder.ulimits(ulimits.map(Ulimit::unwrap))
    }

    /**
     * Limits to set for the user this docker container will run as.
     *
     * Default: - no ulimits
     *
     * @param ulimits Limits to set for the user this docker container will run as. 
     */
    override fun ulimits(vararg ulimits: Ulimit): Unit = ulimits(ulimits.toList())

    /**
     * The user name to use inside the container.
     *
     * Default: - no user
     *
     * @param user The user name to use inside the container. 
     */
    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    /**
     * The volumes to mount to this container.
     *
     * Automatically added to the job definition.
     *
     * Default: - no volumes
     *
     * @param volumes The volumes to mount to this container. 
     */
    override fun volumes(volumes: List<EcsVolume>) {
      cdkBuilder.volumes(volumes.map(EcsVolume::unwrap))
    }

    /**
     * The volumes to mount to this container.
     *
     * Automatically added to the job definition.
     *
     * Default: - no volumes
     *
     * @param volumes The volumes to mount to this container. 
     */
    override fun volumes(vararg volumes: EcsVolume): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EcsEc2ContainerDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EcsEc2ContainerDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition):
        EcsEc2ContainerDefinition = EcsEc2ContainerDefinition(cdkObject)

    internal fun unwrap(wrapped: EcsEc2ContainerDefinition):
        software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition
  }
}
