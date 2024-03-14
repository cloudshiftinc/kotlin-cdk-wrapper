package io.cloudshiftdev.awscdk.services.batch

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface EksVolumeOptions {
  public fun mountPath(): String? = unwrap(this).getMountPath()

  public fun name(): String

  public fun readonly(): Boolean? = unwrap(this).getReadonly()

  public interface Builder {
    public fun mountPath(mountPath: String)

    public fun name(name: String)

    public fun readonly(readonly: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EksVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.EksVolumeOptions.builder()

    override fun mountPath(mountPath: String) {
      cdkBuilder.mountPath(mountPath)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    public fun build(): software.amazon.awscdk.services.batch.EksVolumeOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.EksVolumeOptions,
  ) : EksVolumeOptions {
    override fun mountPath(): String? = unwrap(this).getMountPath()

    override fun name(): String = unwrap(this).getName()

    override fun readonly(): Boolean? = unwrap(this).getReadonly()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EksVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EksVolumeOptions):
        EksVolumeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EksVolumeOptions):
        software.amazon.awscdk.services.batch.EksVolumeOptions = (wrapped as Wrapper).cdkObject
  }
}
