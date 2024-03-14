package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface RuleProps : EventCommonOptions {
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun eventBus(): IEventBus? = unwrap(this).getEventBus()?.let(IEventBus::wrap)

  public fun schedule(): Schedule? = unwrap(this).getSchedule()?.let(Schedule::wrap)

  public fun targets(): List<IRuleTarget> = unwrap(this).getTargets()?.map(IRuleTarget::wrap) ?:
      emptyList()

  public interface Builder {
    public fun crossStackScope(crossStackScope: Construct) {
    }

    public fun description(description: String) {
    }

    public fun enabled(enabled: Boolean) {
    }

    public fun eventBus(eventBus: IEventBus) {
    }

    public fun eventPattern(eventPattern: EventPattern) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ab104f4a3c722682a4e6ee29c6b84abd481a6aa2221ac103ed943ba770e5b91")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit) {
    }

    public fun ruleName(ruleName: String) {
    }

    public fun schedule(schedule: Schedule) {
    }

    public fun targets(targets: List<IRuleTarget>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.RuleProps.Builder =
        software.amazon.awscdk.services.events.RuleProps.builder()

    public override fun crossStackScope(crossStackScope: Construct) {
      cdkBuilder.crossStackScope(crossStackScope.let(Construct::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus::unwrap))
    }

    public override fun eventPattern(eventPattern: EventPattern) {
      cdkBuilder.eventPattern(eventPattern.let(EventPattern::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ab104f4a3c722682a4e6ee29c6b84abd481a6aa2221ac103ed943ba770e5b91")
    public override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    public override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    public override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule::unwrap))
    }

    public override fun targets(targets: List<IRuleTarget>) {
      cdkBuilder.targets(targets.map(IRuleTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.RuleProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.RuleProps,
  ) : RuleProps {
    public override fun crossStackScope(): Construct? =
        unwrap(this).getCrossStackScope()?.let(Construct::wrap)

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun enabled(): Boolean? = unwrap(this).getEnabled()

    public override fun eventBus(): IEventBus? = unwrap(this).getEventBus()?.let(IEventBus::wrap)

    public override fun eventPattern(): EventPattern? =
        unwrap(this).getEventPattern()?.let(EventPattern::wrap)

    public override fun ruleName(): String? = unwrap(this).getRuleName()

    public override fun schedule(): Schedule? = unwrap(this).getSchedule()?.let(Schedule::wrap)

    public override fun targets(): List<IRuleTarget> =
        unwrap(this).getTargets()?.map(IRuleTarget::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.RuleProps): RuleProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuleProps): software.amazon.awscdk.services.events.RuleProps =
        (wrapped as Wrapper).cdkObject
  }
}
