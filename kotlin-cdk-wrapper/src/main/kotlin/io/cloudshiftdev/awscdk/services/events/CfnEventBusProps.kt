@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEventBusProps {
  public fun eventSourceName(): String? = unwrap(this).getEventSourceName()

  public fun name(): String

  public fun policy(): Any? = unwrap(this).getPolicy()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun eventSourceName(eventSourceName: String)

    public fun name(name: String)

    public fun policy(policy: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnEventBusProps.Builder =
        software.amazon.awscdk.services.events.CfnEventBusProps.builder()

    override fun eventSourceName(eventSourceName: String) {
      cdkBuilder.eventSourceName(eventSourceName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.events.CfnEventBusProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.CfnEventBusProps,
  ) : CdkObject(cdkObject), CfnEventBusProps {
    override fun eventSourceName(): String? = unwrap(this).getEventSourceName()

    override fun name(): String = unwrap(this).getName()

    override fun policy(): Any? = unwrap(this).getPolicy()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventBusProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEventBusProps):
        CfnEventBusProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventBusProps):
        software.amazon.awscdk.services.events.CfnEventBusProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.events.CfnEventBusProps
  }
}
