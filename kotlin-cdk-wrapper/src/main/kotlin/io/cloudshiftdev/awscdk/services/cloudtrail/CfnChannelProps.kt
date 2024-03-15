@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnChannelProps {
  public fun destinations(): Any? = unwrap(this).getDestinations()

  public fun name(): String? = unwrap(this).getName()

  public fun source(): String? = unwrap(this).getSource()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun destinations(destinations: IResolvable)

    public fun destinations(destinations: List<Any>)

    public fun destinations(vararg destinations: Any)

    public fun name(name: String)

    public fun source(source: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.CfnChannelProps.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnChannelProps.builder()

    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations)
    }

    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudtrail.CfnChannelProps,
  ) : CdkObject(cdkObject), CfnChannelProps {
    override fun destinations(): Any? = unwrap(this).getDestinations()

    override fun name(): String? = unwrap(this).getName()

    override fun source(): String? = unwrap(this).getSource()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnChannelProps):
        CfnChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelProps):
        software.amazon.awscdk.services.cloudtrail.CfnChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudtrail.CfnChannelProps
  }
}
