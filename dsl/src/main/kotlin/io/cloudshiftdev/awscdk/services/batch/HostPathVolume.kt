package io.cloudshiftdev.awscdk.services.batch

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public open class HostPathVolume internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.HostPathVolume,
) : EksVolume(cdkObject) {
  public open fun path(): String = unwrap(this).getPath()

  public interface Builder {
    public fun hostPath(hostPath: String)

    public fun mountPath(mountPath: String)

    public fun name(name: String)

    public fun readonly(readonly: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.HostPathVolume.Builder =
        software.amazon.awscdk.services.batch.HostPathVolume.Builder.create()

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

    public fun build(): software.amazon.awscdk.services.batch.HostPathVolume = cdkBuilder.build()
  }

  public companion object {
    public open fun isHostPathVolume(x: Any): Boolean =
        software.amazon.awscdk.services.batch.HostPathVolume.isHostPathVolume(x)

    public operator fun invoke(block: Builder.() -> Unit = {}): HostPathVolume {
      val builderImpl = BuilderImpl()
      return HostPathVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.HostPathVolume):
        HostPathVolume = HostPathVolume(cdkObject)

    internal fun unwrap(wrapped: HostPathVolume):
        software.amazon.awscdk.services.batch.HostPathVolume = wrapped.cdkObject
  }
}
