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
    public override fun addVolume(arg0: EksVolume) {
      unwrap(this).addVolume(arg0.let(EksVolume::unwrap))
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

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun privileged(): Boolean? = unwrap(this).getPrivileged()

    public override fun readonlyRootFilesystem(): Boolean? =
        unwrap(this).getReadonlyRootFilesystem()

    public override fun runAsGroup(): Number? = unwrap(this).getRunAsGroup()

    public override fun runAsRoot(): Boolean? = unwrap(this).getRunAsRoot()

    public override fun runAsUser(): Number? = unwrap(this).getRunAsUser()

    public override fun volumes(): List<EksVolume> = unwrap(this).getVolumes().map(EksVolume::wrap)
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
