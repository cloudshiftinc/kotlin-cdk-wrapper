package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Rule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.events.Rule,
) : Resource(cdkObject), IRule {
  public open fun addEventPattern() {
    unwrap(this).addEventPattern()
  }

  public open fun addEventPattern(eventPattern: EventPattern) {
    unwrap(this).addEventPattern(eventPattern.let(EventPattern::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1aacddab944920841d7d2aea054a2768b6270f2beeecb913d08ef326324505b")
  public open fun addEventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
      addEventPattern(EventPattern(eventPattern))

  public open fun addTarget() {
    unwrap(this).addTarget()
  }

  public open fun addTarget(target: IRuleTarget) {
    unwrap(this).addTarget(target.let(IRuleTarget::unwrap))
  }

  public override fun ruleArn(): String = unwrap(this).getRuleArn()

  public override fun ruleName(): String = unwrap(this).getRuleName()

  public interface Builder {
    public fun crossStackScope(crossStackScope: CloudshiftdevConstructsConstruct)

    public fun description(description: String)

    public fun enabled(enabled: Boolean)

    public fun eventBus(eventBus: IEventBus)

    public fun eventPattern(eventPattern: EventPattern)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("994ae001b9447828d08dd212be4705a3b78bdf5259daaf02800345a35fa9ad3d")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    public fun ruleName(ruleName: String)

    public fun schedule(schedule: Schedule)

    public fun targets(targets: List<IRuleTarget>)

    public fun targets(vararg targets: IRuleTarget)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.Rule.Builder =
        software.amazon.awscdk.services.events.Rule.Builder.create(scope, id)

    override fun crossStackScope(crossStackScope: CloudshiftdevConstructsConstruct) {
      cdkBuilder.crossStackScope(crossStackScope.let(CloudshiftdevConstructsConstruct::unwrap))
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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("994ae001b9447828d08dd212be4705a3b78bdf5259daaf02800345a35fa9ad3d")
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

    public fun build(): software.amazon.awscdk.services.events.Rule = cdkBuilder.build()
  }

  public companion object {
    public open fun fromEventRuleArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      eventRuleArn: String,
    ): IRule =
        software.amazon.awscdk.services.events.Rule.fromEventRuleArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, eventRuleArn).let(IRule::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Rule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Rule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.Rule): Rule =
        Rule(cdkObject)

    internal fun unwrap(wrapped: Rule): software.amazon.awscdk.services.events.Rule =
        wrapped.cdkObject
  }
}
