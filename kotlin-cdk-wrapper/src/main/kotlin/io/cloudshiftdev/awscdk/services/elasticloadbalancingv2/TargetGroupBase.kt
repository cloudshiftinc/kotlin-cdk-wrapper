@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IDependable
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Define the target of a load balancer.
 */
public abstract class TargetGroupBase(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupBase,
) : Construct(cdkObject), ITargetGroup {
  /**
   * Set a non-standard attribute on the target group.
   *
   * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html#target-group-attributes)
   * @param key 
   * @param value
   */
  public open fun attribute(key: String) {
    unwrap(this).setAttribute(key)
  }

  /**
   * Set a non-standard attribute on the target group.
   *
   * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html#target-group-attributes)
   * @param key 
   * @param value
   */
  public open fun attribute(key: String, `value`: String) {
    unwrap(this).setAttribute(key, `value`)
  }

  /**
   * Set/replace the target group's health check.
   *
   * @param healthCheck 
   */
  public open fun configureHealthCheck(healthCheck: HealthCheck) {
    unwrap(this).configureHealthCheck(healthCheck.let(HealthCheck.Companion::unwrap))
  }

  /**
   * Set/replace the target group's health check.
   *
   * @param healthCheck 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f554491e118e7a54cb37648906be94aee10cc54ff98ade5299197f592d896271")
  public open fun configureHealthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
      configureHealthCheck(HealthCheck(healthCheck))

  /**
   * Full name of first load balancer.
   *
   * This identifier is emitted as a dimensions of the metrics of this target
   * group.
   *
   * Example value: `app/my-load-balancer/123456789`
   */
  public open fun firstLoadBalancerFullName(): String = unwrap(this).getFirstLoadBalancerFullName()

  /**
   * Health check for the members of this target group.
   */
  public open fun healthCheck(): HealthCheck = unwrap(this).getHealthCheck().let(HealthCheck::wrap)

  /**
   * Health check for the members of this target group.
   */
  public open fun healthCheck(`value`: HealthCheck) {
    unwrap(this).setHealthCheck(`value`.let(HealthCheck.Companion::unwrap))
  }

  /**
   * Health check for the members of this target group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e0f33e44948799569485cb1f367fa4ea11fde47dadc1cb6f7a11c775fb22e41")
  public open fun healthCheck(`value`: HealthCheck.Builder.() -> Unit): Unit =
      healthCheck(HealthCheck(`value`))

  /**
   * A token representing a list of ARNs of the load balancers that route traffic to this target
   * group.
   */
  public override fun loadBalancerArns(): String = unwrap(this).getLoadBalancerArns()

  /**
   * List of constructs that need to be depended on to ensure the TargetGroup is associated to a
   * load balancer.
   */
  public override fun loadBalancerAttached(): IDependable =
      unwrap(this).getLoadBalancerAttached().let(IDependable::wrap)

  /**
   * The ARN of the target group.
   */
  public override fun targetGroupArn(): String = unwrap(this).getTargetGroupArn()

  /**
   * The full name of the target group.
   */
  public open fun targetGroupFullName(): String = unwrap(this).getTargetGroupFullName()

  /**
   * ARNs of load balancers load balancing to this TargetGroup.
   */
  public open fun targetGroupLoadBalancerArns(): List<String> =
      unwrap(this).getTargetGroupLoadBalancerArns()

  /**
   * The name of the target group.
   */
  public override fun targetGroupName(): String = unwrap(this).getTargetGroupName()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupBase,
  ) : TargetGroupBase(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupBase):
        TargetGroupBase = CdkObjectWrappers.wrap(cdkObject) as? TargetGroupBase ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TargetGroupBase):
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupBase = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupBase
  }
}
