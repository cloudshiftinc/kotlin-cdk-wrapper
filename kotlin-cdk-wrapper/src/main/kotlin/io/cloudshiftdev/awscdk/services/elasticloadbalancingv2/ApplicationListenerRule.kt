@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a new listener rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * ApplicationListener applicationListener;
 * ApplicationTargetGroup applicationTargetGroup;
 * ListenerAction listenerAction;
 * ListenerCondition listenerCondition;
 * ApplicationListenerRule applicationListenerRule = ApplicationListenerRule.Builder.create(this,
 * "MyApplicationListenerRule")
 * .listener(applicationListener)
 * .priority(123)
 * // the properties below are optional
 * .action(listenerAction)
 * .conditions(List.of(listenerCondition))
 * .targetGroups(List.of(applicationTargetGroup))
 * .build();
 * ```
 */
public open class ApplicationListenerRule internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  /**
   * Add a non-standard condition to this rule.
   *
   * @param condition 
   */
  public open fun addCondition(condition: ListenerCondition) {
    unwrap(this).addCondition(condition.let(ListenerCondition::unwrap))
  }

  /**
   * Configure the action to perform for this rule.
   *
   * @param action 
   */
  public open fun configureAction(action: ListenerAction) {
    unwrap(this).configureAction(action.let(ListenerAction::unwrap))
  }

  /**
   * The ARN of this rule.
   */
  public open fun listenerRuleArn(): String = unwrap(this).getListenerRuleArn()

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Action to perform when requests are received.
     *
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     *
     * Default: - No action
     *
     * @param action Action to perform when requests are received. 
     */
    public fun action(action: ListenerAction)

    /**
     * Rule applies if matches the conditions.
     *
     * Default: - No conditions.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html)
     * @param conditions Rule applies if matches the conditions. 
     */
    public fun conditions(conditions: List<ListenerCondition>)

    /**
     * Rule applies if matches the conditions.
     *
     * Default: - No conditions.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html)
     * @param conditions Rule applies if matches the conditions. 
     */
    public fun conditions(vararg conditions: ListenerCondition)

    /**
     * The listener to attach the rule to.
     *
     * @param listener The listener to attach the rule to. 
     */
    public fun listener(listener: IApplicationListener)

    /**
     * Priority of the rule.
     *
     * The rule with the lowest priority will be used for every request.
     *
     * Priorities must be unique.
     *
     * @param priority Priority of the rule. 
     */
    public fun priority(priority: Number)

    /**
     * Target groups to forward requests to.
     *
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     *
     * Implies a `forward` action.
     *
     * Default: - No target groups.
     *
     * @param targetGroups Target groups to forward requests to. 
     */
    public fun targetGroups(targetGroups: List<IApplicationTargetGroup>)

    /**
     * Target groups to forward requests to.
     *
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     *
     * Implies a `forward` action.
     *
     * Default: - No target groups.
     *
     * @param targetGroups Target groups to forward requests to. 
     */
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

    /**
     * Action to perform when requests are received.
     *
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     *
     * Default: - No action
     *
     * @param action Action to perform when requests are received. 
     */
    override fun action(action: ListenerAction) {
      cdkBuilder.action(action.let(ListenerAction::unwrap))
    }

    /**
     * Rule applies if matches the conditions.
     *
     * Default: - No conditions.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html)
     * @param conditions Rule applies if matches the conditions. 
     */
    override fun conditions(conditions: List<ListenerCondition>) {
      cdkBuilder.conditions(conditions.map(ListenerCondition::unwrap))
    }

    /**
     * Rule applies if matches the conditions.
     *
     * Default: - No conditions.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html)
     * @param conditions Rule applies if matches the conditions. 
     */
    override fun conditions(vararg conditions: ListenerCondition): Unit =
        conditions(conditions.toList())

    /**
     * The listener to attach the rule to.
     *
     * @param listener The listener to attach the rule to. 
     */
    override fun listener(listener: IApplicationListener) {
      cdkBuilder.listener(listener.let(IApplicationListener::unwrap))
    }

    /**
     * Priority of the rule.
     *
     * The rule with the lowest priority will be used for every request.
     *
     * Priorities must be unique.
     *
     * @param priority Priority of the rule. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * Target groups to forward requests to.
     *
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     *
     * Implies a `forward` action.
     *
     * Default: - No target groups.
     *
     * @param targetGroups Target groups to forward requests to. 
     */
    override fun targetGroups(targetGroups: List<IApplicationTargetGroup>) {
      cdkBuilder.targetGroups(targetGroups.map(IApplicationTargetGroup::unwrap))
    }

    /**
     * Target groups to forward requests to.
     *
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     *
     * Implies a `forward` action.
     *
     * Default: - No target groups.
     *
     * @param targetGroups Target groups to forward requests to. 
     */
    override fun targetGroups(vararg targetGroups: IApplicationTargetGroup): Unit =
        targetGroups(targetGroups.toList())

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule =
        cdkBuilder.build()
  }

  public companion object {
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
