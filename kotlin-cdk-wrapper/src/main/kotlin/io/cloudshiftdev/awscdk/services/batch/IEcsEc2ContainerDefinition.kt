@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.LogDriverConfig
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * A container orchestrated by ECS that uses EC2 resources.
 */
public interface IEcsEc2ContainerDefinition : IEcsContainerDefinition {
  /**
   * Add a ulimit to this container.
   *
   * @param ulimit 
   */
  public fun addUlimit(ulimit: Ulimit)

  /**
   * Add a ulimit to this container.
   *
   * @param ulimit 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a0d25fa71c4ef0333f45890e42d61da3c880f3fe8da2e4cc0ad769dfba1854d9")
  public fun addUlimit(ulimit: Ulimit.Builder.() -> Unit)

  /**
   * The number of physical GPUs to reserve for the container.
   *
   * Make sure that the number of GPUs reserved for all containers in a job doesn't exceed
   * the number of available GPUs on the compute resource that the job is launched on.
   *
   * Default: - no gpus
   */
  public fun gpu(): Number? = unwrap(this).getGpu()

  /**
   * When this parameter is true, the container is given elevated permissions on the host container
   * instance (similar to the root user).
   *
   * Default: false
   */
  public fun privileged(): Boolean? = unwrap(this).getPrivileged()

  /**
   * Limits to set for the user this docker container will run as.
   */
  public fun ulimits(): List<Ulimit>

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.IEcsEc2ContainerDefinition,
  ) : CdkObject(cdkObject),
      IEcsEc2ContainerDefinition {
    /**
     * Add a ulimit to this container.
     *
     * @param ulimit 
     */
    override fun addUlimit(ulimit: Ulimit) {
      unwrap(this).addUlimit(ulimit.let(Ulimit.Companion::unwrap))
    }

    /**
     * Add a ulimit to this container.
     *
     * @param ulimit 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0d25fa71c4ef0333f45890e42d61da3c880f3fe8da2e4cc0ad769dfba1854d9")
    override fun addUlimit(ulimit: Ulimit.Builder.() -> Unit): Unit = addUlimit(Ulimit(ulimit))

    /**
     * Add a Volume to this container.
     *
     * @param volume 
     */
    override fun addVolume(volume: EcsVolume) {
      unwrap(this).addVolume(volume.let(EcsVolume.Companion::unwrap))
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
     * The number of physical GPUs to reserve for the container.
     *
     * Make sure that the number of GPUs reserved for all containers in a job doesn't exceed
     * the number of available GPUs on the compute resource that the job is launched on.
     *
     * Default: - no gpus
     */
    override fun gpu(): Number? = unwrap(this).getGpu()

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
     * When this parameter is true, the container is given elevated permissions on the host
     * container instance (similar to the root user).
     *
     * Default: false
     */
    override fun privileged(): Boolean? = unwrap(this).getPrivileged()

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
     * Limits to set for the user this docker container will run as.
     */
    override fun ulimits(): List<Ulimit> = unwrap(this).getUlimits().map(Ulimit::wrap)

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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IEcsEc2ContainerDefinition):
        IEcsEc2ContainerDefinition = CdkObjectWrappers.wrap(cdkObject) as?
        IEcsEc2ContainerDefinition ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsEc2ContainerDefinition):
        software.amazon.awscdk.services.batch.IEcsEc2ContainerDefinition = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.IEcsEc2ContainerDefinition
  }
}
