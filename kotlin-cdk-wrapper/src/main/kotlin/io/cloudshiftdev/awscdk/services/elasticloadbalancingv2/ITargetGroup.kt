@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.IDependable
import kotlin.String

/**
 * A target group.
 */
public interface ITargetGroup : IConstruct {
  /**
   * A token representing a list of ARNs of the load balancers that route traffic to this target
   * group.
   */
  public fun loadBalancerArns(): String

  /**
   * Return an object to depend on the listeners added to this target group.
   */
  public fun loadBalancerAttached(): IDependable

  /**
   * ARN of the target group.
   */
  public fun targetGroupArn(): String

  /**
   * The name of the target group.
   */
  public fun targetGroupName(): String

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ITargetGroup):
        ITargetGroup = CdkObjectWrappers.wrap(cdkObject) as ITargetGroup

    internal fun unwrap(wrapped: ITargetGroup):
        software.amazon.awscdk.services.elasticloadbalancingv2.ITargetGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticloadbalancingv2.ITargetGroup
  }
}
