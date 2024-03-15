@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps
import kotlin.Number
import kotlin.String

/**
 * A single Application Load Balancer as the target for load balancing.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets.*;
 * AlbArnTarget albArnTarget = new AlbArnTarget("albArn", 123);
 * ```
 */
public open class AlbArnTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbArnTarget,
) : CdkObject(cdkObject), INetworkLoadBalancerTarget {
  public constructor(albArn: String, port: Number) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbArnTarget(albArn,
      port))

  /**
   * Register this alb target with a load balancer.
   *
   * Don't call this, it is called automatically when you add the target to a
   * load balancer.
   *
   * @param targetGroup 
   */
  public override fun attachToNetworkTargetGroup(targetGroup: INetworkTargetGroup):
      LoadBalancerTargetProps =
      unwrap(this).attachToNetworkTargetGroup(targetGroup.let(INetworkTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbArnTarget):
        AlbArnTarget = AlbArnTarget(cdkObject)

    internal fun unwrap(wrapped: AlbArnTarget):
        software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbArnTarget =
        wrapped.cdkObject
  }
}
