package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.services.ec2.IMachineImage
import kotlin.Unit

public interface EksMachineImage {
  public fun image(): IMachineImage? = unwrap(this).getImage()?.let(IMachineImage::wrap)

  public fun imageType(): EksMachineImageType? =
      unwrap(this).getImageType()?.let(EksMachineImageType::wrap)

  public interface Builder {
    public fun image(image: IMachineImage)

    public fun imageType(imageType: EksMachineImageType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EksMachineImage.Builder =
        software.amazon.awscdk.services.batch.EksMachineImage.builder()

    override fun image(image: IMachineImage) {
      cdkBuilder.image(image.let(IMachineImage::unwrap))
    }

    override fun imageType(imageType: EksMachineImageType) {
      cdkBuilder.imageType(imageType.let(EksMachineImageType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.EksMachineImage = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.EksMachineImage,
  ) : EksMachineImage {
    override fun image(): IMachineImage? = unwrap(this).getImage()?.let(IMachineImage::wrap)

    override fun imageType(): EksMachineImageType? =
        unwrap(this).getImageType()?.let(EksMachineImageType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EksMachineImage {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EksMachineImage):
        EksMachineImage = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EksMachineImage):
        software.amazon.awscdk.services.batch.EksMachineImage = (wrapped as Wrapper).cdkObject
  }
}
