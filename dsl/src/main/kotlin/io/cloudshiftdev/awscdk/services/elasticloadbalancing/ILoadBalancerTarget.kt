package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable

public interface ILoadBalancerTarget : IConnectable {
  /**
   * Attach load-balanced target to a classic ELB.
   *
   * @param loadBalancer [disable-awslint:ref-via-interface] The load balancer to attach the target
   * to. 
   */
  public fun attachToClassicLb(loadBalancer: LoadBalancer)

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancing.ILoadBalancerTarget,
  ) : CdkObject(cdkObject), ILoadBalancerTarget {
    /**
     * Attach load-balanced target to a classic ELB.
     *
     * @param loadBalancer [disable-awslint:ref-via-interface] The load balancer to attach the
     * target to. 
     */
    override fun attachToClassicLb(loadBalancer: LoadBalancer) {
      unwrap(this).attachToClassicLB(loadBalancer.let(LoadBalancer::unwrap))
    }

    /**
     * The network connections associated with this resource.
     */
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
