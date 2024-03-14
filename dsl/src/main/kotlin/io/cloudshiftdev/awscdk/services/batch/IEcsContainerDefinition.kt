package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.LogDriverConfig
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public interface IEcsContainerDefinition : IConstruct {
  /**
   * Add a Volume to this container.
   *
   * @param volume 
   */
  public fun addVolume(volume: EcsVolume)

  /**
   * The command that's passed to the container.
   *
   * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
   */
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  /**
   * The number of vCPUs reserved for the container.
   *
   * Each vCPU is equivalent to 1,024 CPU shares.
   * For containers running on EC2 resources, you must specify at least one vCPU.
   */
  public fun cpu(): Number

  /**
   * The environment variables to pass to a container.
   *
   * Cannot start with `AWS_BATCH`.
   * We don't recommend using plaintext environment variables for sensitive information, such as
   * credential data.
   *
   * Default: - no environment variables
   */
  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  /**
   * The role used by Amazon ECS container and AWS Fargate agents to make AWS API calls on your
   * behalf.
   *
   * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html)
   */
  public fun executionRole(): IRole

  /**
   * The image that this container will run.
   */
  public fun image(): ContainerImage

  /**
   * The role that the container can assume.
   *
   * Default: - no jobRole
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html)
   */
  public fun jobRole(): IRole? = unwrap(this).getJobRole()?.let(IRole::wrap)

  /**
   * Linux-specific modifications that are applied to the container, such as details for device
   * mappings.
   *
   * Default: none
   */
  public fun linuxParameters(): LinuxParameters? =
      unwrap(this).getLinuxParameters()?.let(LinuxParameters::wrap)

  /**
   * The configuration of the log driver.
   */
  public fun logDriverConfig(): LogDriverConfig? =
      unwrap(this).getLogDriverConfig()?.let(LogDriverConfig::wrap)

  /**
   * The memory hard limit present to the container.
   *
   * If your container attempts to exceed the memory specified, the container is terminated.
   * You must specify at least 4 MiB of memory for a job.
   */
  public fun memory(): Size

  /**
   * Gives the container readonly access to its root filesystem.
   *
   * Default: false
   */
  public fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

  /**
   * A map from environment variable names to the secrets for the container.
   *
   * Allows your job definitions
   * to reference the secret by the environment variable name defined in this property.
   *
   * Default: - no secrets
   *
   * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html)
   */
  public fun secrets(): Map<String, Secret> =
      unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  /**
   * The user name to use inside the container.
   *
   * Default: - no user
   */
  public fun user(): String? = unwrap(this).getUser()

  /**
   * The volumes to mount to this container.
   *
   * Automatically added to the job definition.
   *
   * Default: - no volumes
   */
  public fun volumes(): List<EcsVolume>

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.IEcsContainerDefinition,
  ) : CdkObject(cdkObject), IEcsContainerDefinition {
    /**
     * Add a Volume to this container.
     *
     * @param volume 
     */
    override fun addVolume(volume: EcsVolume) {
      unwrap(this).addVolume(volume.let(EcsVolume::unwrap))
    }

    /**
     * The command that's passed to the container.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     */
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The number of vCPUs reserved for the container.
     *
     * Each vCPU is equivalent to 1,024 CPU shares.
     * For containers running on EC2 resources, you must specify at least one vCPU.
     */
    override fun cpu(): Number = unwrap(this).getCpu()

    /**
     * The environment variables to pass to a container.
     *
     * Cannot start with `AWS_BATCH`.
     * We don't recommend using plaintext environment variables for sensitive information, such as
     * credential data.
     *
     * Default: - no environment variables
     */
    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    /**
     * The role used by Amazon ECS container and AWS Fargate agents to make AWS API calls on your
     * behalf.
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html)
     */
    override fun executionRole(): IRole = unwrap(this).getExecutionRole().let(IRole::wrap)

    /**
     * The image that this container will run.
     */
    override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

    /**
     * The role that the container can assume.
     *
     * Default: - no jobRole
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html)
     */
    override fun jobRole(): IRole? = unwrap(this).getJobRole()?.let(IRole::wrap)

    /**
     * Linux-specific modifications that are applied to the container, such as details for device
     * mappings.
     *
     * Default: none
     */
    override fun linuxParameters(): LinuxParameters? =
        unwrap(this).getLinuxParameters()?.let(LinuxParameters::wrap)

    /**
     * The configuration of the log driver.
     */
    override fun logDriverConfig(): LogDriverConfig? =
        unwrap(this).getLogDriverConfig()?.let(LogDriverConfig::wrap)

    /**
     * The memory hard limit present to the container.
     *
     * If your container attempts to exceed the memory specified, the container is terminated.
     * You must specify at least 4 MiB of memory for a job.
     */
    override fun memory(): Size = unwrap(this).getMemory().let(Size::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * Gives the container readonly access to its root filesystem.
     *
     * Default: false
     */
    override fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

    /**
     * A map from environment variable names to the secrets for the container.
     *
     * Allows your job definitions
     * to reference the secret by the environment variable name defined in this property.
     *
     * Default: - no secrets
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html)
     */
    override fun secrets(): Map<String, Secret> =
        unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

    /**
     * The user name to use inside the container.
     *
     * Default: - no user
     */
    override fun user(): String? = unwrap(this).getUser()

    /**
     * The volumes to mount to this container.
     *
     * Automatically added to the job definition.
     *
     * Default: - no volumes
     */
    override fun volumes(): List<EcsVolume> = unwrap(this).getVolumes().map(EcsVolume::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IEcsContainerDefinition):
        IEcsContainerDefinition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsContainerDefinition):
        software.amazon.awscdk.services.batch.IEcsContainerDefinition = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.IEcsContainerDefinition
  }
}
