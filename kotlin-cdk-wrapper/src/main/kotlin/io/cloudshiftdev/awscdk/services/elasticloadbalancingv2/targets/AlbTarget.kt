@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets

import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import kotlin.Deprecated
import kotlin.Number

/**
 * (deprecated) A single Application Load Balancer as the target for load balancing.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets.*;
 * ApplicationLoadBalancer applicationLoadBalancer;
 * AlbTarget albTarget = new AlbTarget(applicationLoadBalancer, 123);
 * ```
 *
 * @deprecated Use `AlbListenerTarget` instead or
 * `AlbArnTarget` for an imported load balancer. This target does not automatically
 * add a dependency between the ALB listener and resulting NLB target group,
 * without which may cause stack deployments to fail if the NLB target group is provisioned
 * before the listener has been fully created.
 */
public open class AlbTarget(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbTarget,
) : AlbArnTarget(cdkObject) {
  @Deprecated(message = "deprecated in CDK")
  public constructor(alb: IApplicationLoadBalancer, port: Number) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbTarget(alb.let(IApplicationLoadBalancer.Companion::unwrap),
      port)
  )

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbTarget):
        AlbTarget = AlbTarget(cdkObject)

    internal fun unwrap(wrapped: AlbTarget):
        software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbTarget = wrapped.cdkObject
        as software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbTarget
  }
}
