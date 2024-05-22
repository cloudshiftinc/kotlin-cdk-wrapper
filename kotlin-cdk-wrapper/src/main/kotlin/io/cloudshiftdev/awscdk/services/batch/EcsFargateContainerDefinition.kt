@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.CpuArchitecture
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.LogDriverConfig
import io.cloudshiftdev.awscdk.services.ecs.OperatingSystemFamily
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A container orchestrated by ECS that uses Fargate resources.
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
public open class EcsFargateContainerDefinition(
  cdkObject: software.amazon.awscdk.services.batch.EcsFargateContainerDefinition,
) : CloudshiftdevConstructsConstruct(cdkObject), IEcsFargateContainerDefinition,
    IEcsContainerDefinition {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EcsFargateContainerDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.batch.EcsFargateContainerDefinition(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(EcsFargateContainerDefinitionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EcsFargateContainerDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, EcsFargateContainerDefinitionProps(props)
  )

  /**
   * Add a Volume to this container.
   *
   * @param volume 
   */
  public override fun addVolume(volume: EcsVolume) {
    unwrap(this).addVolume(volume.let(EcsVolume.Companion::unwrap))
  }

  /**
   * Indicates whether the job has a public IP address.
   *
   * For a job that's running on Fargate resources in a private subnet to send outbound traffic to
   * the internet
   * (for example, to pull container images), the private subnet requires a NAT gateway be attached
   * to route requests to the internet.
   */
  public override fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

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
   * The size for ephemeral storage.
   */
  public override fun ephemeralStorageSize(): Size? =
      unwrap(this).getEphemeralStorageSize()?.let(Size::wrap)

  /**
   * The role used by Amazon ECS container and AWS Fargate agents to make AWS API calls on your
   * behalf.
   */
  public override fun executionRole(): IRole = unwrap(this).getExecutionRole().let(IRole::wrap)

  /**
   * The vCPU architecture of Fargate Runtime.
   */
  public override fun fargateCpuArchitecture(): CpuArchitecture? =
      unwrap(this).getFargateCpuArchitecture()?.let(CpuArchitecture::wrap)

  /**
   * The operating system for the compute environment.
   */
  public override fun fargateOperatingSystemFamily(): OperatingSystemFamily? =
      unwrap(this).getFargateOperatingSystemFamily()?.let(OperatingSystemFamily::wrap)

  /**
   * Which version of Fargate to use when running this container.
   */
  public override fun fargatePlatformVersion(): FargatePlatformVersion? =
      unwrap(this).getFargatePlatformVersion()?.let(FargatePlatformVersion::wrap)

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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.EcsFargateContainerDefinition].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param assignPublicIp Indicates whether the job has a public IP address. 
     */
    public fun assignPublicIp(assignPublicIp: Boolean)

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
     * The size for ephemeral storage.
     *
     * Default: - 20 GiB
     *
     * @param ephemeralStorageSize The size for ephemeral storage. 
     */
    public fun ephemeralStorageSize(ephemeralStorageSize: Size)

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
     * The vCPU architecture of Fargate Runtime.
     *
     * Default: - X86_64
     *
     * @param fargateCpuArchitecture The vCPU architecture of Fargate Runtime. 
     */
    public fun fargateCpuArchitecture(fargateCpuArchitecture: CpuArchitecture)

    /**
     * The operating system for the compute environment.
     *
     * Default: - LINUX
     *
     * @param fargateOperatingSystemFamily The operating system for the compute environment. 
     */
    public fun fargateOperatingSystemFamily(fargateOperatingSystemFamily: OperatingSystemFamily)

    /**
     * Which version of Fargate to use when running this container.
     *
     * Default: LATEST
     *
     * @param fargatePlatformVersion Which version of Fargate to use when running this container. 
     */
    public fun fargatePlatformVersion(fargatePlatformVersion: FargatePlatformVersion)

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
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.EcsFargateContainerDefinition.Builder =
        software.amazon.awscdk.services.batch.EcsFargateContainerDefinition.Builder.create(scope,
        id)

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
     * @param assignPublicIp Indicates whether the job has a public IP address. 
     */
    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

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
     * The size for ephemeral storage.
     *
     * Default: - 20 GiB
     *
     * @param ephemeralStorageSize The size for ephemeral storage. 
     */
    override fun ephemeralStorageSize(ephemeralStorageSize: Size) {
      cdkBuilder.ephemeralStorageSize(ephemeralStorageSize.let(Size.Companion::unwrap))
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
      cdkBuilder.executionRole(executionRole.let(IRole.Companion::unwrap))
    }

    /**
     * The vCPU architecture of Fargate Runtime.
     *
     * Default: - X86_64
     *
     * @param fargateCpuArchitecture The vCPU architecture of Fargate Runtime. 
     */
    override fun fargateCpuArchitecture(fargateCpuArchitecture: CpuArchitecture) {
      cdkBuilder.fargateCpuArchitecture(fargateCpuArchitecture.let(CpuArchitecture.Companion::unwrap))
    }

    /**
     * The operating system for the compute environment.
     *
     * Default: - LINUX
     *
     * @param fargateOperatingSystemFamily The operating system for the compute environment. 
     */
    override fun fargateOperatingSystemFamily(fargateOperatingSystemFamily: OperatingSystemFamily) {
      cdkBuilder.fargateOperatingSystemFamily(fargateOperatingSystemFamily.let(OperatingSystemFamily.Companion::unwrap))
    }

    /**
     * Which version of Fargate to use when running this container.
     *
     * Default: LATEST
     *
     * @param fargatePlatformVersion Which version of Fargate to use when running this container. 
     */
    override fun fargatePlatformVersion(fargatePlatformVersion: FargatePlatformVersion) {
      cdkBuilder.fargatePlatformVersion(fargatePlatformVersion.let(FargatePlatformVersion.Companion::unwrap))
    }

    /**
     * The image that this container will run.
     *
     * @param image The image that this container will run. 
     */
    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage.Companion::unwrap))
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
      cdkBuilder.jobRole(jobRole.let(IRole.Companion::unwrap))
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
      cdkBuilder.linuxParameters(linuxParameters.let(LinuxParameters.Companion::unwrap))
    }

    /**
     * The loging configuration for this Job.
     *
     * Default: - the log configuration of the Docker daemon
     *
     * @param logging The loging configuration for this Job. 
     */
    override fun logging(logging: LogDriver) {
      cdkBuilder.logging(logging.let(LogDriver.Companion::unwrap))
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
      cdkBuilder.memory(memory.let(Size.Companion::unwrap))
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
      cdkBuilder.volumes(volumes.map(EcsVolume.Companion::unwrap))
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

    public fun build(): software.amazon.awscdk.services.batch.EcsFargateContainerDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EcsFargateContainerDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EcsFargateContainerDefinition(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.EcsFargateContainerDefinition):
        EcsFargateContainerDefinition = EcsFargateContainerDefinition(cdkObject)

    internal fun unwrap(wrapped: EcsFargateContainerDefinition):
        software.amazon.awscdk.services.batch.EcsFargateContainerDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.batch.EcsFargateContainerDefinition
  }
}
