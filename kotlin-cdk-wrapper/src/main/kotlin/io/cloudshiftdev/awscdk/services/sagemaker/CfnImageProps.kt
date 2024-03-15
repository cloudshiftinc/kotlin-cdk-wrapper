@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnImageProps {
  public fun imageDescription(): String? = unwrap(this).getImageDescription()

  public fun imageDisplayName(): String? = unwrap(this).getImageDisplayName()

  public fun imageName(): String

  public fun imageRoleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun imageDescription(imageDescription: String)

    public fun imageDisplayName(imageDisplayName: String)

    public fun imageName(imageName: String)

    public fun imageRoleArn(imageRoleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnImageProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnImageProps.builder()

    override fun imageDescription(imageDescription: String) {
      cdkBuilder.imageDescription(imageDescription)
    }

    override fun imageDisplayName(imageDisplayName: String) {
      cdkBuilder.imageDisplayName(imageDisplayName)
    }

    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

    override fun imageRoleArn(imageRoleArn: String) {
      cdkBuilder.imageRoleArn(imageRoleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnImageProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnImageProps,
  ) : CdkObject(cdkObject), CfnImageProps {
    override fun imageDescription(): String? = unwrap(this).getImageDescription()

    override fun imageDisplayName(): String? = unwrap(this).getImageDisplayName()

    override fun imageName(): String = unwrap(this).getImageName()

    override fun imageRoleArn(): String = unwrap(this).getImageRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnImageProps):
        CfnImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnImageProps):
        software.amazon.awscdk.services.sagemaker.CfnImageProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sagemaker.CfnImageProps
  }
}
