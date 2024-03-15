@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.CpuArchitecture
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.LogDriverConfig
import io.cloudshiftdev.awscdk.services.ecs.OperatingSystemFamily
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * A container orchestrated by ECS that uses Fargate resources and is orchestrated by ECS.
 */
public interface IEcsFargateContainerDefinition : IEcsContainerDefinition {
  /**
   * Indicates whether the job has a public IP address.
   *
   * For a job that's running on Fargate resources in a private subnet to send outbound traffic to
   * the internet
   * (for example, to pull container images), the private subnet requires a NAT gateway be attached
   * to route requests to the internet.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html)
   */
  public fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

  /**
   * The size for ephemeral storage.
   *
   * Default: - 20 GiB
   */
  public fun ephemeralStorageSize(): Size? = unwrap(this).getEphemeralStorageSize()?.let(Size::wrap)

  /**
   * The vCPU architecture of Fargate Runtime.
   *
   * Default: - X86_64
   */
  public fun fargateCpuArchitecture(): CpuArchitecture? =
      unwrap(this).getFargateCpuArchitecture()?.let(CpuArchitecture::wrap)

  /**
   * The operating system for the compute environment.
   *
   * Default: - LINUX
   */
  public fun fargateOperatingSystemFamily(): OperatingSystemFamily? =
      unwrap(this).getFargateOperatingSystemFamily()?.let(OperatingSystemFamily::wrap)

  /**
   * Which version of Fargate to use when running this container.
   *
   * Default: LATEST
   */
  public fun fargatePlatformVersion(): FargatePlatformVersion? =
      unwrap(this).getFargatePlatformVersion()?.let(FargatePlatformVersion::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.IEcsFargateContainerDefinition,
  ) : CdkObject(cdkObject), IEcsFargateContainerDefinition {
    /**
     * Add a Volume to this container.
     *
     * @param volume 
     */
    override fun addVolume(volume: EcsVolume) {
      unwrap(this).addVolume(volume.let(EcsVolume::unwrap))
    }

    /**
     * Indicates whether the job has a public IP address.
     *
     * For a job that's running on Fargate resources in a private subnet to send outbound traffic to
     * the internet
     * (for example, to pull container images), the private subnet requires a NAT gateway be
     * attached to route requests to the internet.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html)
     */
    override fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

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
     * The size for ephemeral storage.
     *
     * Default: - 20 GiB
     */
    override fun ephemeralStorageSize(): Size? =
        unwrap(this).getEphemeralStorageSize()?.let(Size::wrap)

    /**
     * The role used by Amazon ECS container and AWS Fargate agents to make AWS API calls on your
     * behalf.
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html)
     */
    override fun executionRole(): IRole = unwrap(this).getExecutionRole().let(IRole::wrap)

    /**
     * The vCPU architecture of Fargate Runtime.
     *
     * Default: - X86_64
     */
    override fun fargateCpuArchitecture(): CpuArchitecture? =
        unwrap(this).getFargateCpuArchitecture()?.let(CpuArchitecture::wrap)

    /**
     * The operating system for the compute environment.
     *
     * Default: - LINUX
     */
    override fun fargateOperatingSystemFamily(): OperatingSystemFamily? =
        unwrap(this).getFargateOperatingSystemFamily()?.let(OperatingSystemFamily::wrap)

    /**
     * Which version of Fargate to use when running this container.
     *
     * Default: LATEST
     */
    override fun fargatePlatformVersion(): FargatePlatformVersion? =
        unwrap(this).getFargatePlatformVersion()?.let(FargatePlatformVersion::wrap)

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
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.IEcsFargateContainerDefinition):
        IEcsFargateContainerDefinition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsFargateContainerDefinition):
        software.amazon.awscdk.services.batch.IEcsFargateContainerDefinition = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.IEcsFargateContainerDefinition
  }
}
