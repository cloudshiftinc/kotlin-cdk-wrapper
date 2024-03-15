@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for adding a new target group to a listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * ApplicationTargetGroup applicationTargetGroup;
 * ListenerCondition listenerCondition;
 * AddApplicationTargetGroupsProps addApplicationTargetGroupsProps =
 * AddApplicationTargetGroupsProps.builder()
 * .targetGroups(List.of(applicationTargetGroup))
 * // the properties below are optional
 * .conditions(List.of(listenerCondition))
 * .priority(123)
 * .build();
 * ```
 */
public interface AddApplicationTargetGroupsProps : AddRuleProps {
  /**
   * Target groups to forward requests to.
   */
  public fun targetGroups(): List<IApplicationTargetGroup>

  /**
   * A builder for [AddApplicationTargetGroupsProps]
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param targetGroups Target groups to forward requests to. 
     */
    public fun targetGroups(targetGroups: List<IApplicationTargetGroup>)

    /**
     * @param targetGroups Target groups to forward requests to. 
     */
    public fun targetGroups(vararg targetGroups: IApplicationTargetGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps.builder()

    /**
     * @param conditions Rule applies if matches the conditions.
     */
    override fun conditions(conditions: List<ListenerCondition>) {
      cdkBuilder.conditions(conditions.map(ListenerCondition::unwrap))
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
     * @param targetGroups Target groups to forward requests to. 
     */
    override fun targetGroups(targetGroups: List<IApplicationTargetGroup>) {
      cdkBuilder.targetGroups(targetGroups.map(IApplicationTargetGroup::unwrap))
    }

    /**
     * @param targetGroups Target groups to forward requests to. 
     */
    override fun targetGroups(vararg targetGroups: IApplicationTargetGroup): Unit =
        targetGroups(targetGroups.toList())

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps,
  ) : CdkObject(cdkObject), AddApplicationTargetGroupsProps {
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
     * Target groups to forward requests to.
     */
    override fun targetGroups(): List<IApplicationTargetGroup> =
        unwrap(this).getTargetGroups().map(IApplicationTargetGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddApplicationTargetGroupsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps):
        AddApplicationTargetGroupsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddApplicationTargetGroupsProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps
  }
}
