@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface EksContainerDefinitionProps {
  public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  public fun cpuLimit(): Number? = unwrap(this).getCpuLimit()

  public fun cpuReservation(): Number? = unwrap(this).getCpuReservation()

  public fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

  public fun gpuLimit(): Number? = unwrap(this).getGpuLimit()

  public fun gpuReservation(): Number? = unwrap(this).getGpuReservation()

  public fun image(): ContainerImage

  public fun imagePullPolicy(): ImagePullPolicy? =
      unwrap(this).getImagePullPolicy()?.let(ImagePullPolicy::wrap)

  public fun memoryLimit(): Size? = unwrap(this).getMemoryLimit()?.let(Size::wrap)

  public fun memoryReservation(): Size? = unwrap(this).getMemoryReservation()?.let(Size::wrap)

  public fun name(): String? = unwrap(this).getName()

  public fun privileged(): Boolean? = unwrap(this).getPrivileged()

  public fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

  public fun runAsGroup(): Number? = unwrap(this).getRunAsGroup()

  public fun runAsRoot(): Boolean? = unwrap(this).getRunAsRoot()

  public fun runAsUser(): Number? = unwrap(this).getRunAsUser()

  public fun volumes(): List<EksVolume> = unwrap(this).getVolumes()?.map(EksVolume::wrap) ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun args(args: List<String>)

    public fun args(vararg args: String)

    public fun command(command: List<String>)

    public fun command(vararg command: String)

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

    public fun volumes(vararg volumes: EksVolume)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.EksContainerDefinitionProps.Builder =
        software.amazon.awscdk.services.batch.EksContainerDefinitionProps.builder()

    override fun args(args: List<String>) {
      cdkBuilder.args(args)
    }

    override fun args(vararg args: String): Unit = args(args.toList())

    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    override fun command(vararg command: String): Unit = command(command.toList())

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

    override fun volumes(vararg volumes: EksVolume): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.batch.EksContainerDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.EksContainerDefinitionProps,
  ) : CdkObject(cdkObject), EksContainerDefinitionProps {
    override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    override fun cpuLimit(): Number? = unwrap(this).getCpuLimit()

    override fun cpuReservation(): Number? = unwrap(this).getCpuReservation()

    override fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

    override fun gpuLimit(): Number? = unwrap(this).getGpuLimit()

    override fun gpuReservation(): Number? = unwrap(this).getGpuReservation()

    override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

    override fun imagePullPolicy(): ImagePullPolicy? =
        unwrap(this).getImagePullPolicy()?.let(ImagePullPolicy::wrap)

    override fun memoryLimit(): Size? = unwrap(this).getMemoryLimit()?.let(Size::wrap)

    override fun memoryReservation(): Size? = unwrap(this).getMemoryReservation()?.let(Size::wrap)

    override fun name(): String? = unwrap(this).getName()

    override fun privileged(): Boolean? = unwrap(this).getPrivileged()

    override fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

    override fun runAsGroup(): Number? = unwrap(this).getRunAsGroup()

    override fun runAsRoot(): Boolean? = unwrap(this).getRunAsRoot()

    override fun runAsUser(): Number? = unwrap(this).getRunAsUser()

    override fun volumes(): List<EksVolume> = unwrap(this).getVolumes()?.map(EksVolume::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EksContainerDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EksContainerDefinitionProps):
        EksContainerDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EksContainerDefinitionProps):
        software.amazon.awscdk.services.batch.EksContainerDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.EksContainerDefinitionProps
  }
}
