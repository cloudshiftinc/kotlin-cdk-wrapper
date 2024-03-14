package io.cloudshiftdev.awscdk.services.batch

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface HostPathVolumeOptions : EksVolumeOptions {
  public fun hostPath(): String

  public interface Builder {
    public fun hostPath(hostPath: String)

    public fun mountPath(mountPath: String)

    public fun name(name: String)

    public fun readonly(readonly: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.HostPathVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.HostPathVolumeOptions.builder()

    override fun hostPath(hostPath: String) {
      cdkBuilder.hostPath(hostPath)
    }

    override fun mountPath(mountPath: String) {
      cdkBuilder.mountPath(mountPath)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    public fun build(): software.amazon.awscdk.services.batch.HostPathVolumeOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.HostPathVolumeOptions,
  ) : HostPathVolumeOptions {
    override fun hostPath(): String = unwrap(this).getHostPath()

    override fun mountPath(): String? = unwrap(this).getMountPath()

    override fun name(): String = unwrap(this).getName()

    override fun readonly(): Boolean? = unwrap(this).getReadonly()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HostPathVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.HostPathVolumeOptions):
        HostPathVolumeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostPathVolumeOptions):
        software.amazon.awscdk.services.batch.HostPathVolumeOptions = (wrapped as Wrapper).cdkObject
  }
}
