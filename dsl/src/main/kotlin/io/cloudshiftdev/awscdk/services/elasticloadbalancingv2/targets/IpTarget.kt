package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps

public open class IpTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.targets.IpTarget,
) : CdkObject(cdkObject), IApplicationLoadBalancerTarget, INetworkLoadBalancerTarget {
  /**
   * Register this instance target with a load balancer.
   *
   * Don't call this, it is called automatically when you add the target to a
   * load balancer.
   *
   * @param targetGroup 
   */
  public override fun attachToApplicationTargetGroup(targetGroup: IApplicationTargetGroup):
      LoadBalancerTargetProps =
      unwrap(this).attachToApplicationTargetGroup(targetGroup.let(IApplicationTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)

  /**
   * Register this instance target with a load balancer.
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
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.targets.IpTarget):
        IpTarget = IpTarget(cdkObject)

    internal fun unwrap(wrapped: IpTarget):
        software.amazon.awscdk.services.elasticloadbalancingv2.targets.IpTarget = wrapped.cdkObject
  }
}
