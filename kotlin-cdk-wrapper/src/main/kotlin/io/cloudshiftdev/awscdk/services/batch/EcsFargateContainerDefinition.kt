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

public open class EcsFargateContainerDefinition internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.batch.EcsFargateContainerDefinition,
) : CloudshiftdevConstructsConstruct(cdkObject), IEcsFargateContainerDefinition,
    IEcsContainerDefinition {
  public override fun addVolume(volume: EcsVolume) {
    unwrap(this).addVolume(volume.let(EcsVolume::unwrap))
  }

  public override fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

  public override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  public override fun cpu(): Number = unwrap(this).getCpu()

  public override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?:
      emptyMap()

  public override fun ephemeralStorageSize(): Size? =
      unwrap(this).getEphemeralStorageSize()?.let(Size::wrap)

  public override fun executionRole(): IRole = unwrap(this).getExecutionRole().let(IRole::wrap)

  public override fun fargateCpuArchitecture(): CpuArchitecture? =
      unwrap(this).getFargateCpuArchitecture()?.let(CpuArchitecture::wrap)

  public override fun fargateOperatingSystemFamily(): OperatingSystemFamily? =
      unwrap(this).getFargateOperatingSystemFamily()?.let(OperatingSystemFamily::wrap)

  public override fun fargatePlatformVersion(): FargatePlatformVersion? =
      unwrap(this).getFargatePlatformVersion()?.let(FargatePlatformVersion::wrap)

  public override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

  public override fun jobRole(): IRole? = unwrap(this).getJobRole()?.let(IRole::wrap)

  public override fun linuxParameters(): LinuxParameters? =
      unwrap(this).getLinuxParameters()?.let(LinuxParameters::wrap)

  public override fun logDriverConfig(): LogDriverConfig? =
      unwrap(this).getLogDriverConfig()?.let(LogDriverConfig::wrap)

  public override fun memory(): Size = unwrap(this).getMemory().let(Size::wrap)

  public override fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

  public override fun secrets(): Map<String, Secret> =
      unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  public override fun user(): String? = unwrap(this).getUser()

  public override fun volumes(): List<EcsVolume> = unwrap(this).getVolumes().map(EcsVolume::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun assignPublicIp(assignPublicIp: Boolean)

    public fun command(command: List<String>)

    public fun command(vararg command: String)

    public fun cpu(cpu: Number)

    public fun environment(environment: Map<String, String>)

    public fun ephemeralStorageSize(ephemeralStorageSize: Size)

    public fun executionRole(executionRole: IRole)

    public fun fargateCpuArchitecture(fargateCpuArchitecture: CpuArchitecture)

    public fun fargateOperatingSystemFamily(fargateOperatingSystemFamily: OperatingSystemFamily)

    public fun fargatePlatformVersion(fargatePlatformVersion: FargatePlatformVersion)

    public fun image(image: ContainerImage)

    public fun jobRole(jobRole: IRole)

    public fun linuxParameters(linuxParameters: LinuxParameters)

    public fun logging(logging: LogDriver)

    public fun memory(memory: Size)

    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

    public fun secrets(secrets: Map<String, Secret>)

    public fun user(user: String)

    public fun volumes(volumes: List<EcsVolume>)

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

    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    override fun command(vararg command: String): Unit = command(command.toList())

    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    override fun ephemeralStorageSize(ephemeralStorageSize: Size) {
      cdkBuilder.ephemeralStorageSize(ephemeralStorageSize.let(Size::unwrap))
    }

    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    override fun fargateCpuArchitecture(fargateCpuArchitecture: CpuArchitecture) {
      cdkBuilder.fargateCpuArchitecture(fargateCpuArchitecture.let(CpuArchitecture::unwrap))
    }

    override fun fargateOperatingSystemFamily(fargateOperatingSystemFamily: OperatingSystemFamily) {
      cdkBuilder.fargateOperatingSystemFamily(fargateOperatingSystemFamily.let(OperatingSystemFamily::unwrap))
    }

    override fun fargatePlatformVersion(fargatePlatformVersion: FargatePlatformVersion) {
      cdkBuilder.fargatePlatformVersion(fargatePlatformVersion.let(FargatePlatformVersion::unwrap))
    }

    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    override fun jobRole(jobRole: IRole) {
      cdkBuilder.jobRole(jobRole.let(IRole::unwrap))
    }

    override fun linuxParameters(linuxParameters: LinuxParameters) {
      cdkBuilder.linuxParameters(linuxParameters.let(LinuxParameters::unwrap))
    }

    override fun logging(logging: LogDriver) {
      cdkBuilder.logging(logging.let(LogDriver::unwrap))
    }

    override fun memory(memory: Size) {
      cdkBuilder.memory(memory.let(Size::unwrap))
    }

    override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
      cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues{Secret.unwrap(it.value)})
    }

    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    override fun volumes(volumes: List<EcsVolume>) {
      cdkBuilder.volumes(volumes.map(EcsVolume::unwrap))
    }

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
        software.amazon.awscdk.services.batch.EcsFargateContainerDefinition = wrapped.cdkObject
  }
}
