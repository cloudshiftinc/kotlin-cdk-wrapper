@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 *
 */
public interface ILoadBalancerV2 : IResource {
  /**
   * The canonical hosted zone ID of this load balancer.
   *
   * Example value: `Z2P70J7EXAMPLE`
   */
  public fun loadBalancerCanonicalHostedZoneId(): String

  /**
   * The DNS name of this load balancer.
   *
   * Example value: `my-load-balancer-424835706.us-west-2.elb.amazonaws.com`
   */
  public fun loadBalancerDnsName(): String

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2):
        ILoadBalancerV2 = CdkObjectWrappers.wrap(cdkObject) as ILoadBalancerV2

    internal fun unwrap(wrapped: ILoadBalancerV2):
        software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2 = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2
  }
}
