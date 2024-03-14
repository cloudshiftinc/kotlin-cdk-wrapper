package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface EmptyDirVolumeOptions : EksVolumeOptions {
  public fun medium(): EmptyDirMediumType? = unwrap(this).getMedium()?.let(EmptyDirMediumType::wrap)

  public fun sizeLimit(): Size? = unwrap(this).getSizeLimit()?.let(Size::wrap)

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
    private val cdkBuilder: software.amazon.awscdk.services.batch.EmptyDirVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.EmptyDirVolumeOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.batch.EmptyDirVolumeOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.EmptyDirVolumeOptions,
  ) : EmptyDirVolumeOptions {
    public override fun medium(): EmptyDirMediumType? =
        unwrap(this).getMedium()?.let(EmptyDirMediumType::wrap)

    public override fun mountPath(): String? = unwrap(this).getMountPath()

    public override fun name(): String = unwrap(this).getName()

    public override fun readonly(): Boolean? = unwrap(this).getReadonly()

    public override fun sizeLimit(): Size? = unwrap(this).getSizeLimit()?.let(Size::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EmptyDirVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EmptyDirVolumeOptions):
        EmptyDirVolumeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EmptyDirVolumeOptions):
        software.amazon.awscdk.services.batch.EmptyDirVolumeOptions = (wrapped as Wrapper).cdkObject
  }
}
