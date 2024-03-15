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
 * An IP address that is a target for load balancing.
 *
 * Specify IP addresses from the subnets of the virtual private cloud (VPC) for
 * the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and
 * 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can't specify
 * publicly routable IP addresses.
 *
 * If you register a target of this type, you are responsible for making
 * sure the load balancer's security group can send packets to the IP address.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets.*;
 * IpTarget ipTarget = new IpTarget("ipAddress", 123, "availabilityZone");
 * ```
 */
public open class IpTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.targets.IpTarget,
) : CdkObject(cdkObject), IApplicationLoadBalancerTarget, INetworkLoadBalancerTarget {
  public constructor(
    ipAddress: String,
    port: Number,
    availabilityZone: String,
  ) : this(software.amazon.awscdk.services.elasticloadbalancingv2.targets.IpTarget(ipAddress, port,
      availabilityZone))

  public constructor(ipAddress: String, port: Number) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.targets.IpTarget(ipAddress, port))

  public constructor(ipAddress: String) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.targets.IpTarget(ipAddress))

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
