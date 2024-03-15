@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable

public interface ILoadBalancerTarget : IConnectable {
  public fun attachToClassicLb(arg0: LoadBalancer)

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancing.ILoadBalancerTarget,
  ) : CdkObject(cdkObject), ILoadBalancerTarget {
    override fun attachToClassicLb(arg0: LoadBalancer) {
      unwrap(this).attachToClassicLB(arg0.let(LoadBalancer::unwrap))
    }

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.ILoadBalancerTarget):
        ILoadBalancerTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILoadBalancerTarget):
        software.amazon.awscdk.services.elasticloadbalancing.ILoadBalancerTarget = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancing.ILoadBalancerTarget
  }
}
