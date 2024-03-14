package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import kotlin.String
import kotlin.Unit

public interface EventBridgePutEventsEntry {
  public fun detail(): TaskInput

  public fun detailType(): String

  public fun eventBus(): IEventBus? = unwrap(this).getEventBus()?.let(IEventBus::wrap)

  public fun source(): String

  public interface Builder {
    public fun detail(detail: TaskInput) {
    }

    public fun detailType(detailType: String) {
    }

    public fun eventBus(eventBus: IEventBus) {
    }

    public fun source(source: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry.builder()

    public override fun detail(detail: TaskInput) {
      cdkBuilder.detail(detail.let(TaskInput::unwrap))
    }

    public override fun detailType(detailType: String) {
      cdkBuilder.detailType(detailType)
    }

    public override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus::unwrap))
    }

    public override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry,
  ) : EventBridgePutEventsEntry {
    public override fun detail(): TaskInput = unwrap(this).getDetail().let(TaskInput::wrap)

    public override fun detailType(): String = unwrap(this).getDetailType()

    public override fun eventBus(): IEventBus? = unwrap(this).getEventBus()?.let(IEventBus::wrap)

    public override fun source(): String = unwrap(this).getSource()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgePutEventsEntry {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry):
        EventBridgePutEventsEntry = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBridgePutEventsEntry):
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry = (wrapped as
        Wrapper).cdkObject
  }
}
