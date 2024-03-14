package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ApplicationListenerRule internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun addCondition(condition: ListenerCondition) {
    unwrap(this).addCondition(condition.let(ListenerCondition::unwrap))
  }

  public open fun configureAction(action: ListenerAction) {
    unwrap(this).configureAction(action.let(ListenerAction::unwrap))
  }

  public open fun listenerRuleArn(): String = unwrap(this).getListenerRuleArn()

  public interface Builder {
    public fun action(action: ListenerAction)

    public fun conditions(conditions: List<ListenerCondition>)

    public fun conditions(vararg conditions: ListenerCondition)

    public fun listener(listener: IApplicationListener)

    public fun priority(priority: Number)

    public fun targetGroups(targetGroups: List<IApplicationTargetGroup>)

    public fun targetGroups(vararg targetGroups: IApplicationTargetGroup)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule.Builder.create(scope,
        id)

    override fun action(action: ListenerAction) {
      cdkBuilder.action(action.let(ListenerAction::unwrap))
    }

    override fun conditions(conditions: List<ListenerCondition>) {
      cdkBuilder.conditions(conditions.map(ListenerCondition::unwrap))
    }

    override fun conditions(vararg conditions: ListenerCondition): Unit =
        conditions(conditions.toList())

    override fun listener(listener: IApplicationListener) {
      cdkBuilder.listener(listener.let(IApplicationListener::unwrap))
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun targetGroups(targetGroups: List<IApplicationTargetGroup>) {
      cdkBuilder.targetGroups(targetGroups.map(IApplicationTargetGroup::unwrap))
    }

    override fun targetGroups(vararg targetGroups: IApplicationTargetGroup): Unit =
        targetGroups(targetGroups.toList())

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApplicationListenerRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApplicationListenerRule(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule):
        ApplicationListenerRule = ApplicationListenerRule(cdkObject)

    internal fun unwrap(wrapped: ApplicationListenerRule):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule =
        wrapped.cdkObject
  }
}
