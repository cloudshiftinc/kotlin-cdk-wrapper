package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface AddRuleProps {
  public fun conditions(): List<ListenerCondition> =
      unwrap(this).getConditions()?.map(ListenerCondition::wrap) ?: emptyList()

  public fun priority(): Number? = unwrap(this).getPriority()

  public interface Builder {
    public fun conditions(conditions: List<ListenerCondition>)

    public fun conditions(vararg conditions: ListenerCondition)

    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddRuleProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.AddRuleProps.builder()

    override fun conditions(conditions: List<ListenerCondition>) {
      cdkBuilder.conditions(conditions.map(ListenerCondition::unwrap))
    }

    override fun conditions(vararg conditions: ListenerCondition): Unit =
        conditions(conditions.toList())

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.AddRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AddRuleProps,
  ) : AddRuleProps {
    override fun conditions(): List<ListenerCondition> =
        unwrap(this).getConditions()?.map(ListenerCondition::wrap) ?: emptyList()

    override fun priority(): Number? = unwrap(this).getPriority()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AddRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AddRuleProps):
        AddRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddRuleProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.AddRuleProps = (wrapped as
        Wrapper).cdkObject
  }
}
