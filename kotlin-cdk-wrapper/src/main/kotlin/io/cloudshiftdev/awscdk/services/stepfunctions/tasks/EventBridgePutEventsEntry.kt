@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import kotlin.String
import kotlin.Unit

public interface EventBridgePutEventsEntry {
  public fun detail(): TaskInput

  public fun detailType(): String

  public fun eventBus(): IEventBus? = unwrap(this).getEventBus()?.let(IEventBus::wrap)

  public fun source(): String

  @CdkDslMarker
  public interface Builder {
    public fun detail(detail: TaskInput)

    public fun detailType(detailType: String)

    public fun eventBus(eventBus: IEventBus)

    public fun source(source: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry.builder()

    override fun detail(detail: TaskInput) {
      cdkBuilder.detail(detail.let(TaskInput::unwrap))
    }

    override fun detailType(detailType: String) {
      cdkBuilder.detailType(detailType)
    }

    override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus::unwrap))
    }

    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry,
  ) : CdkObject(cdkObject), EventBridgePutEventsEntry {
    override fun detail(): TaskInput = unwrap(this).getDetail().let(TaskInput::wrap)

    override fun detailType(): String = unwrap(this).getDetailType()

    override fun eventBus(): IEventBus? = unwrap(this).getEventBus()?.let(IEventBus::wrap)

    override fun source(): String = unwrap(this).getSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgePutEventsEntry {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry):
        EventBridgePutEventsEntry = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBridgePutEventsEntry):
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry
  }
}
