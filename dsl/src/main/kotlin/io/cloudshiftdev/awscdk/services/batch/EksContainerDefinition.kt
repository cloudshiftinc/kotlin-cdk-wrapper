package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EksContainerDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.EksContainerDefinition,
) : CloudshiftdevConstructsConstruct(cdkObject), IEksContainerDefinition {
  public override fun addVolume(volume: EksVolume) {
    unwrap(this).addVolume(volume.let(EksVolume::unwrap))
  }

  public override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

  public override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  public override fun cpuLimit(): Number? = unwrap(this).getCpuLimit()

  public override fun cpuReservation(): Number? = unwrap(this).getCpuReservation()

  public override fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

  public override fun gpuLimit(): Number? = unwrap(this).getGpuLimit()

  public override fun gpuReservation(): Number? = unwrap(this).getGpuReservation()

  public override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

  public override fun imagePullPolicy(): ImagePullPolicy? =
      unwrap(this).getImagePullPolicy()?.let(ImagePullPolicy::wrap)

  public override fun memoryLimit(): Size? = unwrap(this).getMemoryLimit()?.let(Size::wrap)

  public override fun memoryReservation(): Size? =
      unwrap(this).getMemoryReservation()?.let(Size::wrap)

  public override fun name(): String? = unwrap(this).getName()

  public override fun privileged(): Boolean? = unwrap(this).getPrivileged()

  public override fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

  public override fun runAsGroup(): Number? = unwrap(this).getRunAsGroup()

  public override fun runAsRoot(): Boolean? = unwrap(this).getRunAsRoot()

  public override fun runAsUser(): Number? = unwrap(this).getRunAsUser()

  public override fun volumes(): List<EksVolume> = unwrap(this).getVolumes().map(EksVolume::wrap)

  public interface Builder {
    public fun args(args: List<String>)

    public fun command(command: List<String>)

    public fun cpuLimit(cpuLimit: Number)

    public fun cpuReservation(cpuReservation: Number)

    public fun env(env: Map<String, String>)

    public fun gpuLimit(gpuLimit: Number)

    public fun gpuReservation(gpuReservation: Number)

    public fun image(image: ContainerImage)

    public fun imagePullPolicy(imagePullPolicy: ImagePullPolicy)

    public fun memoryLimit(memoryLimit: Size)

    public fun memoryReservation(memoryReservation: Size)

    public fun name(name: String)

    public fun privileged(privileged: Boolean)

    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

    public fun runAsGroup(runAsGroup: Number)

    public fun runAsRoot(runAsRoot: Boolean)

    public fun runAsUser(runAsUser: Number)

    public fun volumes(volumes: List<EksVolume>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EksContainerDefinition.Builder =
        software.amazon.awscdk.services.batch.EksContainerDefinition.Builder.create(scope, id)

    override fun args(args: List<String>) {
      cdkBuilder.args(args)
    }

    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    override fun cpuLimit(cpuLimit: Number) {
      cdkBuilder.cpuLimit(cpuLimit)
    }

    override fun cpuReservation(cpuReservation: Number) {
      cdkBuilder.cpuReservation(cpuReservation)
    }

    override fun env(env: Map<String, String>) {
      cdkBuilder.env(env)
    }

    override fun gpuLimit(gpuLimit: Number) {
      cdkBuilder.gpuLimit(gpuLimit)
    }

    override fun gpuReservation(gpuReservation: Number) {
      cdkBuilder.gpuReservation(gpuReservation)
    }

    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    override fun imagePullPolicy(imagePullPolicy: ImagePullPolicy) {
      cdkBuilder.imagePullPolicy(imagePullPolicy.let(ImagePullPolicy::unwrap))
    }

    override fun memoryLimit(memoryLimit: Size) {
      cdkBuilder.memoryLimit(memoryLimit.let(Size::unwrap))
    }

    override fun memoryReservation(memoryReservation: Size) {
      cdkBuilder.memoryReservation(memoryReservation.let(Size::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun privileged(privileged: Boolean) {
      cdkBuilder.privileged(privileged)
    }

    override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
      cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    override fun runAsGroup(runAsGroup: Number) {
      cdkBuilder.runAsGroup(runAsGroup)
    }

    override fun runAsRoot(runAsRoot: Boolean) {
      cdkBuilder.runAsRoot(runAsRoot)
    }

    override fun runAsUser(runAsUser: Number) {
      cdkBuilder.runAsUser(runAsUser)
    }

    override fun volumes(volumes: List<EksVolume>) {
      cdkBuilder.volumes(volumes.map(EksVolume::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.EksContainerDefinition =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EksContainerDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EksContainerDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EksContainerDefinition):
        EksContainerDefinition = EksContainerDefinition(cdkObject)

    internal fun unwrap(wrapped: EksContainerDefinition):
        software.amazon.awscdk.services.batch.EksContainerDefinition = wrapped.cdkObject
  }
}
