@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IConnectable

/**
 * Interface that is going to be implemented by constructs that you can load balance to.
 */
public interface ILoadBalancerTarget : IConnectable {
  /**
   * Attach load-balanced target to a classic ELB.
   *
   * @param loadBalancer [disable-awslint:ref-via-interface] The load balancer to attach the target
   * to. 
   */
  public fun attachToClassicLb(loadBalancer: LoadBalancer)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.ILoadBalancerTarget):
        ILoadBalancerTarget = CdkObjectWrappers.wrap(cdkObject) as ILoadBalancerTarget

    internal fun unwrap(wrapped: ILoadBalancerTarget):
        software.amazon.awscdk.services.elasticloadbalancing.ILoadBalancerTarget = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancing.ILoadBalancerTarget
  }
}
