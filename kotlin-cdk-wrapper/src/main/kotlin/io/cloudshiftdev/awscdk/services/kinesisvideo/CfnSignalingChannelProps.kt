@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisvideo

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSignalingChannelProps {
  public fun messageTtlSeconds(): Number? = unwrap(this).getMessageTtlSeconds()

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String? = unwrap(this).getType()

  @CdkDslMarker
  public interface Builder {
    public fun messageTtlSeconds(messageTtlSeconds: Number)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps.Builder =
        software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps.builder()

    override fun messageTtlSeconds(messageTtlSeconds: Number) {
      cdkBuilder.messageTtlSeconds(messageTtlSeconds)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps,
  ) : CdkObject(cdkObject), CfnSignalingChannelProps {
    override fun messageTtlSeconds(): Number? = unwrap(this).getMessageTtlSeconds()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSignalingChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps):
        CfnSignalingChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSignalingChannelProps):
        software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps
  }
}
