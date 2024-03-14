package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public open class EmptyDirVolume internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.EmptyDirVolume,
) : EksVolume(cdkObject) {
  public open fun medium(): EmptyDirMediumType? =
      unwrap(this).getMedium()?.let(EmptyDirMediumType::wrap)

  public open fun sizeLimit(): Size? = unwrap(this).getSizeLimit()?.let(Size::wrap)

  public interface Builder {
    public fun medium(medium: EmptyDirMediumType) {
    }

    public fun mountPath(mountPath: String) {
    }

    public fun name(name: String) {
    }

    public fun readonly(readonly: Boolean) {
    }

    public fun sizeLimit(sizeLimit: Size) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EmptyDirVolume.Builder =
        software.amazon.awscdk.services.batch.EmptyDirVolume.Builder.create()

    public override fun medium(medium: EmptyDirMediumType) {
      cdkBuilder.medium(medium.let(EmptyDirMediumType::unwrap))
    }

    public override fun mountPath(mountPath: String) {
      cdkBuilder.mountPath(mountPath)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    public override fun sizeLimit(sizeLimit: Size) {
      cdkBuilder.sizeLimit(sizeLimit.let(Size::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.EmptyDirVolume = cdkBuilder.build()
  }

  public companion object {
    public open fun isEmptyDirVolume(x: Any): Boolean =
        software.amazon.awscdk.services.batch.EmptyDirVolume.isEmptyDirVolume(x)

    public operator fun invoke(block: Builder.() -> Unit = {}): EmptyDirVolume {
      val builderImpl = BuilderImpl()
      return EmptyDirVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EmptyDirVolume):
        EmptyDirVolume = EmptyDirVolume(cdkObject)

    internal fun unwrap(wrapped: EmptyDirVolume):
        software.amazon.awscdk.services.batch.EmptyDirVolume = wrapped.cdkObject
  }
}
