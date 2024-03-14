package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public interface IEksContainerDefinition : IConstruct {
  public fun addVolume(arg0: EksVolume)

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

  public fun volumes(): List<EksVolume>

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.IEksContainerDefinition,
  ) : IEksContainerDefinition {
    override fun addVolume(arg0: EksVolume) {
      unwrap(this).addVolume(arg0.let(EksVolume::unwrap))
    }

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

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun privileged(): Boolean? = unwrap(this).getPrivileged()

    override fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

    override fun runAsGroup(): Number? = unwrap(this).getRunAsGroup()

    override fun runAsRoot(): Boolean? = unwrap(this).getRunAsRoot()

    override fun runAsUser(): Number? = unwrap(this).getRunAsUser()

    override fun volumes(): List<EksVolume> = unwrap(this).getVolumes().map(EksVolume::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IEksContainerDefinition):
        IEksContainerDefinition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEksContainerDefinition):
        software.amazon.awscdk.services.batch.IEksContainerDefinition = (wrapped as
        Wrapper).cdkObject
  }
}
