@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnStreamingDistributionProps {
  public fun streamingDistributionConfig(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun streamingDistributionConfig(streamingDistributionConfig: IResolvable)

    public
        fun streamingDistributionConfig(streamingDistributionConfig: CfnStreamingDistribution.StreamingDistributionConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94dd962918394e1605c7052dfe34aba62dd793fb67fc2aa1f2b0c97e18585fef")
    public
        fun streamingDistributionConfig(streamingDistributionConfig: CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps.builder()

    override fun streamingDistributionConfig(streamingDistributionConfig: IResolvable) {
      cdkBuilder.streamingDistributionConfig(streamingDistributionConfig.let(IResolvable::unwrap))
    }

    override
        fun streamingDistributionConfig(streamingDistributionConfig: CfnStreamingDistribution.StreamingDistributionConfigProperty) {
      cdkBuilder.streamingDistributionConfig(streamingDistributionConfig.let(CfnStreamingDistribution.StreamingDistributionConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94dd962918394e1605c7052dfe34aba62dd793fb67fc2aa1f2b0c97e18585fef")
    override
        fun streamingDistributionConfig(streamingDistributionConfig: CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.() -> Unit):
        Unit =
        streamingDistributionConfig(CfnStreamingDistribution.StreamingDistributionConfigProperty(streamingDistributionConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps,
  ) : CdkObject(cdkObject), CfnStreamingDistributionProps {
    override fun streamingDistributionConfig(): Any = unwrap(this).getStreamingDistributionConfig()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStreamingDistributionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps):
        CfnStreamingDistributionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStreamingDistributionProps):
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps
  }
}
