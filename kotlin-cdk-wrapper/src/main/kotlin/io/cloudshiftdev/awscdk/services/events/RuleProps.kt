@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface RuleProps : EventCommonOptions {
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun eventBus(): IEventBus? = unwrap(this).getEventBus()?.let(IEventBus::wrap)

  public fun schedule(): Schedule? = unwrap(this).getSchedule()?.let(Schedule::wrap)

  public fun targets(): List<IRuleTarget> = unwrap(this).getTargets()?.map(IRuleTarget::wrap) ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun crossStackScope(crossStackScope: Construct)

    public fun description(description: String)

    public fun enabled(enabled: Boolean)

    public fun eventBus(eventBus: IEventBus)

    public fun eventPattern(eventPattern: EventPattern)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ab104f4a3c722682a4e6ee29c6b84abd481a6aa2221ac103ed943ba770e5b91")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    public fun ruleName(ruleName: String)

    public fun schedule(schedule: Schedule)

    public fun targets(targets: List<IRuleTarget>)

    public fun targets(vararg targets: IRuleTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.RuleProps.Builder =
        software.amazon.awscdk.services.events.RuleProps.builder()

    override fun crossStackScope(crossStackScope: Construct) {
      cdkBuilder.crossStackScope(crossStackScope.let(Construct::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus::unwrap))
    }

    override fun eventPattern(eventPattern: EventPattern) {
      cdkBuilder.eventPattern(eventPattern.let(EventPattern::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ab104f4a3c722682a4e6ee29c6b84abd481a6aa2221ac103ed943ba770e5b91")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule::unwrap))
    }

    override fun targets(targets: List<IRuleTarget>) {
      cdkBuilder.targets(targets.map(IRuleTarget::unwrap))
    }

    override fun targets(vararg targets: IRuleTarget): Unit = targets(targets.toList())

    public fun build(): software.amazon.awscdk.services.events.RuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.RuleProps,
  ) : CdkObject(cdkObject), RuleProps {
    override fun crossStackScope(): Construct? =
        unwrap(this).getCrossStackScope()?.let(Construct::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun eventBus(): IEventBus? = unwrap(this).getEventBus()?.let(IEventBus::wrap)

    override fun eventPattern(): EventPattern? =
        unwrap(this).getEventPattern()?.let(EventPattern::wrap)

    override fun ruleName(): String? = unwrap(this).getRuleName()

    override fun schedule(): Schedule? = unwrap(this).getSchedule()?.let(Schedule::wrap)

    override fun targets(): List<IRuleTarget> = unwrap(this).getTargets()?.map(IRuleTarget::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.RuleProps): RuleProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuleProps): software.amazon.awscdk.services.events.RuleProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.events.RuleProps
  }
}
