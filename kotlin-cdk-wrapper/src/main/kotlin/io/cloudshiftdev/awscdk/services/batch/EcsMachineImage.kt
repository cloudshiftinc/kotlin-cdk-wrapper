@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IMachineImage
import kotlin.Unit

public interface EcsMachineImage {
  public fun image(): IMachineImage? = unwrap(this).getImage()?.let(IMachineImage::wrap)

  public fun imageType(): EcsMachineImageType? =
      unwrap(this).getImageType()?.let(EcsMachineImageType::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun image(image: IMachineImage)

    public fun imageType(imageType: EcsMachineImageType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EcsMachineImage.Builder =
        software.amazon.awscdk.services.batch.EcsMachineImage.builder()

    override fun image(image: IMachineImage) {
      cdkBuilder.image(image.let(IMachineImage::unwrap))
    }

    override fun imageType(imageType: EcsMachineImageType) {
      cdkBuilder.imageType(imageType.let(EcsMachineImageType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.EcsMachineImage = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.EcsMachineImage,
  ) : CdkObject(cdkObject), EcsMachineImage {
    override fun image(): IMachineImage? = unwrap(this).getImage()?.let(IMachineImage::wrap)

    override fun imageType(): EcsMachineImageType? =
        unwrap(this).getImageType()?.let(EcsMachineImageType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsMachineImage {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EcsMachineImage):
        EcsMachineImage = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsMachineImage):
        software.amazon.awscdk.services.batch.EcsMachineImage = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.EcsMachineImage
  }
}
