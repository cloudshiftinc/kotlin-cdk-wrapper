package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface AddApplicationTargetGroupsProps : AddRuleProps {
  public fun targetGroups(): List<IApplicationTargetGroup>

  public interface Builder {
    public fun conditions(conditions: List<ListenerCondition>)

    public fun conditions(vararg conditions: ListenerCondition)

    public fun priority(priority: Number)

    public fun targetGroups(targetGroups: List<IApplicationTargetGroup>)

    public fun targetGroups(vararg targetGroups: IApplicationTargetGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps.builder()

    override fun conditions(conditions: List<ListenerCondition>) {
      cdkBuilder.conditions(conditions.map(ListenerCondition::unwrap))
    }

    override fun conditions(vararg conditions: ListenerCondition): Unit =
        conditions(conditions.toList())

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun targetGroups(targetGroups: List<IApplicationTargetGroup>) {
      cdkBuilder.targetGroups(targetGroups.map(IApplicationTargetGroup::unwrap))
    }

    override fun targetGroups(vararg targetGroups: IApplicationTargetGroup): Unit =
        targetGroups(targetGroups.toList())

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps,
  ) : AddApplicationTargetGroupsProps {
    override fun conditions(): List<ListenerCondition> =
        unwrap(this).getConditions()?.map(ListenerCondition::wrap) ?: emptyList()

    override fun priority(): Number? = unwrap(this).getPriority()

    override fun targetGroups(): List<IApplicationTargetGroup> =
        unwrap(this).getTargetGroups().map(IApplicationTargetGroup::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AddApplicationTargetGroupsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps):
        AddApplicationTargetGroupsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddApplicationTargetGroupsProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps =
        (wrapped as Wrapper).cdkObject
  }
}
