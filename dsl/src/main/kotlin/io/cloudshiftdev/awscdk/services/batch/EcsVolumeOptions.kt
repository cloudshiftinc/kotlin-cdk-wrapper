package io.cloudshiftdev.awscdk.services.batch

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface EcsVolumeOptions {
  public fun containerPath(): String

  public fun name(): String

  public fun readonly(): Boolean? = unwrap(this).getReadonly()

  public interface Builder {
    public fun containerPath(containerPath: String) {
    }

    public fun name(name: String) {
    }

    public fun readonly(readonly: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EcsVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.EcsVolumeOptions.builder()

    public override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    public fun build(): software.amazon.awscdk.services.batch.EcsVolumeOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.EcsVolumeOptions,
  ) : EcsVolumeOptions {
    public override fun containerPath(): String = unwrap(this).getContainerPath()

    public override fun name(): String = unwrap(this).getName()

    public override fun readonly(): Boolean? = unwrap(this).getReadonly()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EcsVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EcsVolumeOptions):
        EcsVolumeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsVolumeOptions):
        software.amazon.awscdk.services.batch.EcsVolumeOptions = (wrapped as Wrapper).cdkObject
  }
}
