package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
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

public interface IEcsFargateContainerDefinition : IEcsContainerDefinition {
  public fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

  public fun ephemeralStorageSize(): Size? = unwrap(this).getEphemeralStorageSize()?.let(Size::wrap)

  public fun fargateCpuArchitecture(): CpuArchitecture? =
      unwrap(this).getFargateCpuArchitecture()?.let(CpuArchitecture::wrap)

  public fun fargateOperatingSystemFamily(): OperatingSystemFamily? =
      unwrap(this).getFargateOperatingSystemFamily()?.let(OperatingSystemFamily::wrap)

  public fun fargatePlatformVersion(): FargatePlatformVersion? =
      unwrap(this).getFargatePlatformVersion()?.let(FargatePlatformVersion::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.IEcsFargateContainerDefinition,
  ) : IEcsFargateContainerDefinition {
    public override fun addVolume(arg0: EcsVolume) {
      unwrap(this).addVolume(arg0.let(EcsVolume::unwrap))
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

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun readonlyRootFilesystem(): Boolean? =
        unwrap(this).getReadonlyRootFilesystem()

    public override fun secrets(): Map<String, Secret> = unwrap(this).getSecrets()?.mapValues {
        Secret.wrap(it.value)} ?: emptyMap()

    public override fun user(): String? = unwrap(this).getUser()

    public override fun volumes(): List<EcsVolume> = unwrap(this).getVolumes().map(EcsVolume::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.IEcsFargateContainerDefinition):
        IEcsFargateContainerDefinition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsFargateContainerDefinition):
        software.amazon.awscdk.services.batch.IEcsFargateContainerDefinition = (wrapped as
        Wrapper).cdkObject
  }
}
