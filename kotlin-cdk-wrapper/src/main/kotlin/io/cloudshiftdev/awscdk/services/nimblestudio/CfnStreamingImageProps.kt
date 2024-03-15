@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnStreamingImageProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun ec2ImageId(): String

  public fun name(): String

  public fun studioId(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun ec2ImageId(ec2ImageId: String)

    public fun name(name: String)

    public fun studioId(studioId: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ec2ImageId(ec2ImageId: String) {
      cdkBuilder.ec2ImageId(ec2ImageId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps,
  ) : CdkObject(cdkObject), CfnStreamingImageProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun ec2ImageId(): String = unwrap(this).getEc2ImageId()

    override fun name(): String = unwrap(this).getName()

    override fun studioId(): String = unwrap(this).getStudioId()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStreamingImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps):
        CfnStreamingImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStreamingImageProps):
        software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps
  }
}
