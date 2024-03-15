@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnListenerRuleProps {
  public fun actions(): Any

  public fun conditions(): Any

  public fun listenerArn(): String? = unwrap(this).getListenerArn()

  public fun priority(): Number

  @CdkDslMarker
  public interface Builder {
    public fun actions(actions: IResolvable)

    public fun actions(actions: List<Any>)

    public fun actions(vararg actions: Any)

    public fun conditions(conditions: IResolvable)

    public fun conditions(conditions: List<Any>)

    public fun conditions(vararg conditions: Any)

    public fun listenerArn(listenerArn: String)

    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps.builder()

    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    override fun conditions(conditions: IResolvable) {
      cdkBuilder.conditions(conditions.let(IResolvable::unwrap))
    }

    override fun conditions(conditions: List<Any>) {
      cdkBuilder.conditions(conditions)
    }

    override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps,
  ) : CdkObject(cdkObject), CfnListenerRuleProps {
    override fun actions(): Any = unwrap(this).getActions()

    override fun conditions(): Any = unwrap(this).getConditions()

    override fun listenerArn(): String? = unwrap(this).getListenerArn()

    override fun priority(): Number = unwrap(this).getPriority()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnListenerRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps):
        CfnListenerRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnListenerRuleProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps
  }
}
