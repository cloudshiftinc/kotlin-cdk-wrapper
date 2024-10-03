@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for adding a new action to a listener.
 *
 * Example:
 *
 * ```
 * ApplicationListener listener;
 * listener.addAction("Fixed", AddApplicationActionProps.builder()
 * .priority(10)
 * .conditions(List.of(ListenerCondition.pathPatterns(List.of("/ok"))))
 * .action(ListenerAction.fixedResponse(200, FixedResponseOptions.builder()
 * .contentType("text/plain")
 * .messageBody("OK")
 * .build()))
 * .build());
 * ```
 */
public interface AddApplicationActionProps : AddRuleProps {
  /**
   * Action to perform.
   */
  public fun action(): ListenerAction

  /**
   * `ListenerRule`s have a `Rule` suffix on their logicalId by default. This allows you to remove
   * that suffix.
   *
   * Legacy behavior of the `addTargetGroups()` convenience method did not include the `Rule` suffix
   * on the logicalId of the generated `ListenerRule`.
   * At some point, increasing complexity of requirements can require users to switch from the
   * `addTargetGroups()` method
   * to the `addAction()` method.
   * When migrating `ListenerRule`s deployed by a legacy version of `addTargetGroups()`,
   * you will need to enable this flag to avoid changing the logicalId of your resource.
   * Otherwise Cfn will attempt to replace the `ListenerRule` and fail.
   *
   * Default: - use standard logicalId with the `Rule` suffix
   */
  public fun removeSuffix(): Boolean? = unwrap(this).getRemoveSuffix()

  /**
   * A builder for [AddApplicationActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action Action to perform. 
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
     * @param priority Priority of this target group.
     * The rule with the lowest priority will be used for every request.
     * If priority is not given, these target groups will be added as
     * defaults, and must not have conditions.
     *
     * Priorities must be unique.
     */
    public fun priority(priority: Number)

    /**
     * @param removeSuffix `ListenerRule`s have a `Rule` suffix on their logicalId by default. This
     * allows you to remove that suffix.
     * Legacy behavior of the `addTargetGroups()` convenience method did not include the `Rule`
     * suffix on the logicalId of the generated `ListenerRule`.
     * At some point, increasing complexity of requirements can require users to switch from the
     * `addTargetGroups()` method
     * to the `addAction()` method.
     * When migrating `ListenerRule`s deployed by a legacy version of `addTargetGroups()`,
     * you will need to enable this flag to avoid changing the logicalId of your resource.
     * Otherwise Cfn will attempt to replace the `ListenerRule` and fail.
     */
    public fun removeSuffix(removeSuffix: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps.builder()

    /**
     * @param action Action to perform. 
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
     * @param priority Priority of this target group.
     * The rule with the lowest priority will be used for every request.
     * If priority is not given, these target groups will be added as
     * defaults, and must not have conditions.
     *
     * Priorities must be unique.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param removeSuffix `ListenerRule`s have a `Rule` suffix on their logicalId by default. This
     * allows you to remove that suffix.
     * Legacy behavior of the `addTargetGroups()` convenience method did not include the `Rule`
     * suffix on the logicalId of the generated `ListenerRule`.
     * At some point, increasing complexity of requirements can require users to switch from the
     * `addTargetGroups()` method
     * to the `addAction()` method.
     * When migrating `ListenerRule`s deployed by a legacy version of `addTargetGroups()`,
     * you will need to enable this flag to avoid changing the logicalId of your resource.
     * Otherwise Cfn will attempt to replace the `ListenerRule` and fail.
     */
    override fun removeSuffix(removeSuffix: Boolean) {
      cdkBuilder.removeSuffix(removeSuffix)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps,
  ) : CdkObject(cdkObject),
      AddApplicationActionProps {
    /**
     * Action to perform.
     */
    override fun action(): ListenerAction = unwrap(this).getAction().let(ListenerAction::wrap)

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
     * Priority of this target group.
     *
     * The rule with the lowest priority will be used for every request.
     * If priority is not given, these target groups will be added as
     * defaults, and must not have conditions.
     *
     * Priorities must be unique.
     *
     * Default: Target groups are used as defaults
     */
    override fun priority(): Number? = unwrap(this).getPriority()

    /**
     * `ListenerRule`s have a `Rule` suffix on their logicalId by default. This allows you to remove
     * that suffix.
     *
     * Legacy behavior of the `addTargetGroups()` convenience method did not include the `Rule`
     * suffix on the logicalId of the generated `ListenerRule`.
     * At some point, increasing complexity of requirements can require users to switch from the
     * `addTargetGroups()` method
     * to the `addAction()` method.
     * When migrating `ListenerRule`s deployed by a legacy version of `addTargetGroups()`,
     * you will need to enable this flag to avoid changing the logicalId of your resource.
     * Otherwise Cfn will attempt to replace the `ListenerRule` and fail.
     *
     * Default: - use standard logicalId with the `Rule` suffix
     */
    override fun removeSuffix(): Boolean? = unwrap(this).getRemoveSuffix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddApplicationActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps):
        AddApplicationActionProps = CdkObjectWrappers.wrap(cdkObject) as? AddApplicationActionProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddApplicationActionProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps
  }
}
