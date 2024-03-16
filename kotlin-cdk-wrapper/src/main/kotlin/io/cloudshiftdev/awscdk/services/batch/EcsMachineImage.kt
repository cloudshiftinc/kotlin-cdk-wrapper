@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IMachineImage
import kotlin.Unit

/**
 * A Batch MachineImage that is compatible with ECS.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * IMachineImage machineImage;
 * EcsMachineImage ecsMachineImage = EcsMachineImage.builder()
 * .image(machineImage)
 * .imageType(EcsMachineImageType.ECS_AL2)
 * .build();
 * ```
 */
public interface EcsMachineImage {
  /**
   * The machine image to use.
   *
   * Default: - chosen by batch
   */
  public fun image(): IMachineImage? = unwrap(this).getImage()?.let(IMachineImage::wrap)

  /**
   * Tells Batch which instance type to launch this image on.
   *
   * Default: - 'ECS_AL2' for non-gpu instances, 'ECS_AL2_NVIDIA' for gpu instances
   */
  public fun imageType(): EcsMachineImageType? =
      unwrap(this).getImageType()?.let(EcsMachineImageType::wrap)

  /**
   * A builder for [EcsMachineImage]
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
    public fun imageType(imageType: EcsMachineImageType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EcsMachineImage.Builder =
        software.amazon.awscdk.services.batch.EcsMachineImage.builder()

    /**
     * @param image The machine image to use.
     */
    override fun image(image: IMachineImage) {
      cdkBuilder.image(image.let(IMachineImage::unwrap))
    }

    /**
     * @param imageType Tells Batch which instance type to launch this image on.
     */
    override fun imageType(imageType: EcsMachineImageType) {
      cdkBuilder.imageType(imageType.let(EcsMachineImageType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.EcsMachineImage = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.EcsMachineImage,
  ) : CdkObject(cdkObject), EcsMachineImage {
    /**
     * The machine image to use.
     *
     * Default: - chosen by batch
     */
    override fun image(): IMachineImage? = unwrap(this).getImage()?.let(IMachineImage::wrap)

    /**
     * Tells Batch which instance type to launch this image on.
     *
     * Default: - 'ECS_AL2' for non-gpu instances, 'ECS_AL2_NVIDIA' for gpu instances
     */
    override fun imageType(): EcsMachineImageType? =
        unwrap(this).getImageType()?.let(EcsMachineImageType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsMachineImage {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EcsMachineImage):
        EcsMachineImage = CdkObjectWrappers.wrap(cdkObject) as EcsMachineImage

    internal fun unwrap(wrapped: EcsMachineImage):
        software.amazon.awscdk.services.batch.EcsMachineImage = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.EcsMachineImage
  }
}
