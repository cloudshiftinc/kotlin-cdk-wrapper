@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

/**
 * Basic properties for defining a rule on a listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * ApplicationTargetGroup applicationTargetGroup;
 * ListenerAction listenerAction;
 * ListenerCondition listenerCondition;
 * BaseApplicationListenerRuleProps baseApplicationListenerRuleProps =
 * BaseApplicationListenerRuleProps.builder()
 * .priority(123)
 * // the properties below are optional
 * .action(listenerAction)
 * .conditions(List.of(listenerCondition))
 * .targetGroups(List.of(applicationTargetGroup))
 * .build();
 * ```
 */
public interface BaseApplicationListenerRuleProps {
  /**
   * Action to perform when requests are received.
   *
   * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
   *
   * Default: - No action
   */
  public fun action(): ListenerAction? = unwrap(this).getAction()?.let(ListenerAction::wrap)

  /**
   * Rule applies if matches the conditions.
   *
   * Default: - No conditions.
   *
   * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html)
   */
  public fun conditions(): List<ListenerCondition> =
      unwrap(this).getConditions()?.map(ListenerCondition::wrap) ?: emptyList()

  /**
   * Priority of the rule.
   *
   * The rule with the lowest priority will be used for every request.
   *
   * Priorities must be unique.
   */
  public fun priority(): Number

  /**
   * Target groups to forward requests to.
   *
   * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
   *
   * Implies a `forward` action.
   *
   * Default: - No target groups.
   */
  public fun targetGroups(): List<IApplicationTargetGroup> =
      unwrap(this).getTargetGroups()?.map(IApplicationTargetGroup::wrap) ?: emptyList()

  /**
   * A builder for [BaseApplicationListenerRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action Action to perform when requests are received.
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     */
    public fun action(action: ListenerAction)

    /**
     * @param conditions Rule applies if matches the conditions.
     */
    public fun conditions(conditions: List<ListenerCondition>)

    /**
     * @param conditions Rule applies if matches the conditions.
     */
    public fun conditions(vararg conditions: ListenerCondition)

    /**
     * @param priority Priority of the rule. 
     * The rule with the lowest priority will be used for every request.
     *
     * Priorities must be unique.
     */
    public fun priority(priority: Number)

    /**
     * @param targetGroups Target groups to forward requests to.
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     *
     * Implies a `forward` action.
     */
    public fun targetGroups(targetGroups: List<IApplicationTargetGroup>)

    /**
     * @param targetGroups Target groups to forward requests to.
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     *
     * Implies a `forward` action.
     */
    public fun targetGroups(vararg targetGroups: IApplicationTargetGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerRuleProps.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerRuleProps.builder()

    /**
     * @param action Action to perform when requests are received.
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     */
    override fun action(action: ListenerAction) {
      cdkBuilder.action(action.let(ListenerAction.Companion::unwrap))
    }

    /**
     * @param conditions Rule applies if matches the conditions.
     */
    override fun conditions(conditions: List<ListenerCondition>) {
      cdkBuilder.conditions(conditions.map(ListenerCondition.Companion::unwrap))
    }

    /**
     * @param conditions Rule applies if matches the conditions.
     */
    override fun conditions(vararg conditions: ListenerCondition): Unit =
        conditions(conditions.toList())

    /**
     * @param priority Priority of the rule. 
     * The rule with the lowest priority will be used for every request.
     *
     * Priorities must be unique.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param targetGroups Target groups to forward requests to.
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     *
     * Implies a `forward` action.
     */
    override fun targetGroups(targetGroups: List<IApplicationTargetGroup>) {
      cdkBuilder.targetGroups(targetGroups.map(IApplicationTargetGroup.Companion::unwrap))
    }

    /**
     * @param targetGroups Target groups to forward requests to.
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     *
     * Implies a `forward` action.
     */
    override fun targetGroups(vararg targetGroups: IApplicationTargetGroup): Unit =
        targetGroups(targetGroups.toList())

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerRuleProps,
  ) : CdkObject(cdkObject), BaseApplicationListenerRuleProps {
    /**
     * Action to perform when requests are received.
     *
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     *
     * Default: - No action
     */
    override fun action(): ListenerAction? = unwrap(this).getAction()?.let(ListenerAction::wrap)

    /**
     * Rule applies if matches the conditions.
     *
     * Default: - No conditions.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html)
     */
    override fun conditions(): List<ListenerCondition> =
        unwrap(this).getConditions()?.map(ListenerCondition::wrap) ?: emptyList()

    /**
     * Priority of the rule.
     *
     * The rule with the lowest priority will be used for every request.
     *
     * Priorities must be unique.
     */
    override fun priority(): Number = unwrap(this).getPriority()

    /**
     * Target groups to forward requests to.
     *
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     *
     * Implies a `forward` action.
     *
     * Default: - No target groups.
     */
    override fun targetGroups(): List<IApplicationTargetGroup> =
        unwrap(this).getTargetGroups()?.map(IApplicationTargetGroup::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseApplicationListenerRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerRuleProps):
        BaseApplicationListenerRuleProps = CdkObjectWrappers.wrap(cdkObject) as?
        BaseApplicationListenerRuleProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseApplicationListenerRuleProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerRuleProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerRuleProps
  }
}
