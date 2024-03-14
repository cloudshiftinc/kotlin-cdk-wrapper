package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IMachineImage
import kotlin.Unit

public interface EksMachineImage {
  /**
   * The machine image to use.
   *
   * Default: - chosen by batch
   */
  public fun image(): IMachineImage? = unwrap(this).getImage()?.let(IMachineImage::wrap)

  /**
   * Tells Batch which instance type to launch this image on.
   *
   * Default: - 'EKS_AL2' for non-gpu instances, 'EKS_AL2_NVIDIA' for gpu instances
   */
  public fun imageType(): EksMachineImageType? =
      unwrap(this).getImageType()?.let(EksMachineImageType::wrap)

  /**
   * A builder for [EksMachineImage]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param image The machine image to use.
     */
    public fun image(image: IMachineImage)

    /**
     * @param imageType Tells Batch which instance type to launch this image on.
     */
    public fun imageType(imageType: EksMachineImageType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EksMachineImage.Builder =
        software.amazon.awscdk.services.batch.EksMachineImage.builder()

    /**
     * @param image The machine image to use.
     */
    override fun image(image: IMachineImage) {
      cdkBuilder.image(image.let(IMachineImage::unwrap))
    }

    /**
     * @param imageType Tells Batch which instance type to launch this image on.
     */
    override fun imageType(imageType: EksMachineImageType) {
      cdkBuilder.imageType(imageType.let(EksMachineImageType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.EksMachineImage = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.EksMachineImage,
  ) : CdkObject(cdkObject), EksMachineImage {
    /**
     * The machine image to use.
     *
     * Default: - chosen by batch
     */
    override fun image(): IMachineImage? = unwrap(this).getImage()?.let(IMachineImage::wrap)

    /**
     * Tells Batch which instance type to launch this image on.
     *
     * Default: - 'EKS_AL2' for non-gpu instances, 'EKS_AL2_NVIDIA' for gpu instances
     */
    override fun imageType(): EksMachineImageType? =
        unwrap(this).getImageType()?.let(EksMachineImageType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EksMachineImage {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EksMachineImage):
        EksMachineImage = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EksMachineImage):
        software.amazon.awscdk.services.batch.EksMachineImage = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.EksMachineImage
  }
}
