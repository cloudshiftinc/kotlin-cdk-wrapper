@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps
import kotlin.Number
import kotlin.String

/**
 * An EC2 instance that is the target for load balancing.
 *
 * If you register a target of this type, you are responsible for making
 * sure the load balancer's security group can connect to the instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets.*;
 * InstanceIdTarget instanceIdTarget = new InstanceIdTarget("instanceId", 123);
 * ```
 */
public open class InstanceIdTarget(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.targets.InstanceIdTarget,
) : CdkObject(cdkObject),
    IApplicationLoadBalancerTarget,
    INetworkLoadBalancerTarget {
  public constructor(instanceId: String) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.targets.InstanceIdTarget(instanceId)
  )

  public constructor(instanceId: String, port: Number) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.targets.InstanceIdTarget(instanceId,
      port)
  )

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
      unwrap(this).attachToApplicationTargetGroup(targetGroup.let(IApplicationTargetGroup.Companion::unwrap)).let(LoadBalancerTargetProps::wrap)

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
      unwrap(this).attachToNetworkTargetGroup(targetGroup.let(INetworkTargetGroup.Companion::unwrap)).let(LoadBalancerTargetProps::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.targets.InstanceIdTarget):
        InstanceIdTarget = InstanceIdTarget(cdkObject)

    internal fun unwrap(wrapped: InstanceIdTarget):
        software.amazon.awscdk.services.elasticloadbalancingv2.targets.InstanceIdTarget =
        wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.targets.InstanceIdTarget
  }
}
