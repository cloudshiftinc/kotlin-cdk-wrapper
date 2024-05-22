@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.CpuArchitecture
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.OperatingSystemFamily
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Props to configure an EcsFargateContainerDefinition.
 *
 * Example:
 *
 * ```
 * EcsJobDefinition jobDefn = EcsJobDefinition.Builder.create(this, "JobDefn")
 * .container(EcsFargateContainerDefinition.Builder.create(this, "myFargateContainer")
 * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
 * .memory(Size.mebibytes(2048))
 * .cpu(256)
 * .ephemeralStorageSize(Size.gibibytes(100))
 * .fargateCpuArchitecture(CpuArchitecture.ARM64)
 * .fargateOperatingSystemFamily(OperatingSystemFamily.LINUX)
 * .build())
 * .build();
 * ```
 */
public interface EcsFargateContainerDefinitionProps : EcsContainerDefinitionProps {
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

  /**
   * A builder for [EcsFargateContainerDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assignPublicIp Indicates whether the job has a public IP address.
     * For a job that's running on Fargate resources in a private subnet to send outbound traffic to
     * the internet
     * (for example, to pull container images), the private subnet requires a NAT gateway be
     * attached to route requests to the internet.
     */
    public fun assignPublicIp(assignPublicIp: Boolean)

    /**
     * @param command The command that's passed to the container.
     */
    public fun command(command: List<String>)

    /**
     * @param command The command that's passed to the container.
     */
    public fun command(vararg command: String)

    /**
     * @param cpu The number of vCPUs reserved for the container. 
     * Each vCPU is equivalent to 1,024 CPU shares.
     * For containers running on EC2 resources, you must specify at least one vCPU.
     */
    public fun cpu(cpu: Number)

    /**
     * @param environment The environment variables to pass to a container.
     * Cannot start with `AWS_BATCH`.
     * We don't recommend using plaintext environment variables for sensitive information, such as
     * credential data.
     */
    public fun environment(environment: Map<String, String>)

    /**
     * @param ephemeralStorageSize The size for ephemeral storage.
     */
    public fun ephemeralStorageSize(ephemeralStorageSize: Size)

    /**
     * @param executionRole The role used by Amazon ECS container and AWS Fargate agents to make AWS
     * API calls on your behalf.
     */
    public fun executionRole(executionRole: IRole)

    /**
     * @param fargateCpuArchitecture The vCPU architecture of Fargate Runtime.
     */
    public fun fargateCpuArchitecture(fargateCpuArchitecture: CpuArchitecture)

    /**
     * @param fargateOperatingSystemFamily The operating system for the compute environment.
     */
    public fun fargateOperatingSystemFamily(fargateOperatingSystemFamily: OperatingSystemFamily)

    /**
     * @param fargatePlatformVersion Which version of Fargate to use when running this container.
     */
    public fun fargatePlatformVersion(fargatePlatformVersion: FargatePlatformVersion)

    /**
     * @param image The image that this container will run. 
     */
    public fun image(image: ContainerImage)

    /**
     * @param jobRole The role that the container can assume.
     */
    public fun jobRole(jobRole: IRole)

    /**
     * @param linuxParameters Linux-specific modifications that are applied to the container, such
     * as details for device mappings.
     */
    public fun linuxParameters(linuxParameters: LinuxParameters)

    /**
     * @param logging The loging configuration for this Job.
     */
    public fun logging(logging: LogDriver)

    /**
     * @param memory The memory hard limit present to the container. 
     * If your container attempts to exceed the memory specified, the container is terminated.
     * You must specify at least 4 MiB of memory for a job.
     */
    public fun memory(memory: Size)

    /**
     * @param readonlyRootFilesystem Gives the container readonly access to its root filesystem.
     */
    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

    /**
     * @param secrets A map from environment variable names to the secrets for the container.
     * Allows your job definitions
     * to reference the secret by the environment variable name defined in this property.
     */
    public fun secrets(secrets: Map<String, Secret>)

    /**
     * @param user The user name to use inside the container.
     */
    public fun user(user: String)

    /**
     * @param volumes The volumes to mount to this container.
     * Automatically added to the job definition.
     */
    public fun volumes(volumes: List<EcsVolume>)

    /**
     * @param volumes The volumes to mount to this container.
     * Automatically added to the job definition.
     */
    public fun volumes(vararg volumes: EcsVolume)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps.Builder =
        software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps.builder()

    /**
     * @param assignPublicIp Indicates whether the job has a public IP address.
     * For a job that's running on Fargate resources in a private subnet to send outbound traffic to
     * the internet
     * (for example, to pull container images), the private subnet requires a NAT gateway be
     * attached to route requests to the internet.
     */
    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    /**
     * @param command The command that's passed to the container.
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    /**
     * @param command The command that's passed to the container.
     */
    override fun command(vararg command: String): Unit = command(command.toList())

    /**
     * @param cpu The number of vCPUs reserved for the container. 
     * Each vCPU is equivalent to 1,024 CPU shares.
     * For containers running on EC2 resources, you must specify at least one vCPU.
     */
    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * @param environment The environment variables to pass to a container.
     * Cannot start with `AWS_BATCH`.
     * We don't recommend using plaintext environment variables for sensitive information, such as
     * credential data.
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param ephemeralStorageSize The size for ephemeral storage.
     */
    override fun ephemeralStorageSize(ephemeralStorageSize: Size) {
      cdkBuilder.ephemeralStorageSize(ephemeralStorageSize.let(Size.Companion::unwrap))
    }

    /**
     * @param executionRole The role used by Amazon ECS container and AWS Fargate agents to make AWS
     * API calls on your behalf.
     */
    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param fargateCpuArchitecture The vCPU architecture of Fargate Runtime.
     */
    override fun fargateCpuArchitecture(fargateCpuArchitecture: CpuArchitecture) {
      cdkBuilder.fargateCpuArchitecture(fargateCpuArchitecture.let(CpuArchitecture.Companion::unwrap))
    }

    /**
     * @param fargateOperatingSystemFamily The operating system for the compute environment.
     */
    override fun fargateOperatingSystemFamily(fargateOperatingSystemFamily: OperatingSystemFamily) {
      cdkBuilder.fargateOperatingSystemFamily(fargateOperatingSystemFamily.let(OperatingSystemFamily.Companion::unwrap))
    }

    /**
     * @param fargatePlatformVersion Which version of Fargate to use when running this container.
     */
    override fun fargatePlatformVersion(fargatePlatformVersion: FargatePlatformVersion) {
      cdkBuilder.fargatePlatformVersion(fargatePlatformVersion.let(FargatePlatformVersion.Companion::unwrap))
    }

    /**
     * @param image The image that this container will run. 
     */
    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage.Companion::unwrap))
    }

    /**
     * @param jobRole The role that the container can assume.
     */
    override fun jobRole(jobRole: IRole) {
      cdkBuilder.jobRole(jobRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param linuxParameters Linux-specific modifications that are applied to the container, such
     * as details for device mappings.
     */
    override fun linuxParameters(linuxParameters: LinuxParameters) {
      cdkBuilder.linuxParameters(linuxParameters.let(LinuxParameters.Companion::unwrap))
    }

    /**
     * @param logging The loging configuration for this Job.
     */
    override fun logging(logging: LogDriver) {
      cdkBuilder.logging(logging.let(LogDriver.Companion::unwrap))
    }

    /**
     * @param memory The memory hard limit present to the container. 
     * If your container attempts to exceed the memory specified, the container is terminated.
     * You must specify at least 4 MiB of memory for a job.
     */
    override fun memory(memory: Size) {
      cdkBuilder.memory(memory.let(Size.Companion::unwrap))
    }

    /**
     * @param readonlyRootFilesystem Gives the container readonly access to its root filesystem.
     */
    override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
      cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    /**
     * @param secrets A map from environment variable names to the secrets for the container.
     * Allows your job definitions
     * to reference the secret by the environment variable name defined in this property.
     */
    override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues{Secret.unwrap(it.value)})
    }

    /**
     * @param user The user name to use inside the container.
     */
    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    /**
     * @param volumes The volumes to mount to this container.
     * Automatically added to the job definition.
     */
    override fun volumes(volumes: List<EcsVolume>) {
      cdkBuilder.volumes(volumes.map(EcsVolume.Companion::unwrap))
    }

    /**
     * @param volumes The volumes to mount to this container.
     * Automatically added to the job definition.
     */
    override fun volumes(vararg volumes: EcsVolume): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps,
  ) : CdkObject(cdkObject), EcsFargateContainerDefinitionProps {
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
     * Default: - no command
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
     * Default: - a Role will be created
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html)
     */
    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

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
     * Default: - no job role
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
     * The loging configuration for this Job.
     *
     * Default: - the log configuration of the Docker daemon
     */
    override fun logging(): LogDriver? = unwrap(this).getLogging()?.let(LogDriver::wrap)

    /**
     * The memory hard limit present to the container.
     *
     * If your container attempts to exceed the memory specified, the container is terminated.
     * You must specify at least 4 MiB of memory for a job.
     */
    override fun memory(): Size = unwrap(this).getMemory().let(Size::wrap)

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
    override fun volumes(): List<EcsVolume> = unwrap(this).getVolumes()?.map(EcsVolume::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsFargateContainerDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps):
        EcsFargateContainerDefinitionProps = CdkObjectWrappers.wrap(cdkObject) as?
        EcsFargateContainerDefinitionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsFargateContainerDefinitionProps):
        software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps
  }
}
