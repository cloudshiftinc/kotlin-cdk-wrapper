@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface EventBusProps {
  public fun eventBusName(): String? = unwrap(this).getEventBusName()

  public fun eventSourceName(): String? = unwrap(this).getEventSourceName()

  @CdkDslMarker
  public interface Builder {
    public fun eventBusName(eventBusName: String)

    public fun eventSourceName(eventSourceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventBusProps.Builder =
        software.amazon.awscdk.services.events.EventBusProps.builder()

    override fun eventBusName(eventBusName: String) {
      cdkBuilder.eventBusName(eventBusName)
    }

    override fun eventSourceName(eventSourceName: String) {
      cdkBuilder.eventSourceName(eventSourceName)
    }

    public fun build(): software.amazon.awscdk.services.events.EventBusProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.EventBusProps,
  ) : CdkObject(cdkObject), EventBusProps {
    override fun eventBusName(): String? = unwrap(this).getEventBusName()

    override fun eventSourceName(): String? = unwrap(this).getEventSourceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventBusProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.EventBusProps):
        EventBusProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBusProps):
        software.amazon.awscdk.services.events.EventBusProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.EventBusProps
  }
}
