package io.cloudshiftdev.awscdk.services.batch

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public open class HostVolume internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.HostVolume,
) : EcsVolume(cdkObject) {
  public open fun hostPath(): String? = unwrap(this).getHostPath()

  public interface Builder {
    public fun containerPath(containerPath: String)

    public fun hostPath(hostPath: String)

    public fun name(name: String)

    public fun readonly(readonly: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.HostVolume.Builder =
        software.amazon.awscdk.services.batch.HostVolume.Builder.create()

    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    override fun hostPath(hostPath: String) {
      cdkBuilder.hostPath(hostPath)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    public fun build(): software.amazon.awscdk.services.batch.HostVolume = cdkBuilder.build()
  }

  public companion object {
    public open fun isHostVolume(x: Any): Boolean =
        software.amazon.awscdk.services.batch.HostVolume.isHostVolume(x)

    public operator fun invoke(block: Builder.() -> Unit = {}): HostVolume {
      val builderImpl = BuilderImpl()
      return HostVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.HostVolume): HostVolume =
        HostVolume(cdkObject)

    internal fun unwrap(wrapped: HostVolume): software.amazon.awscdk.services.batch.HostVolume =
        wrapped.cdkObject
  }
}
