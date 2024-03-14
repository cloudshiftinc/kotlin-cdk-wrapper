package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.Instance

public open class InstanceTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancing.InstanceTarget,
) : CdkObject(cdkObject), ILoadBalancerTarget {
  /**
   * Attach load-balanced target to a classic ELB.
   *
   * @param loadBalancer 
   */
  public override fun attachToClassicLb(loadBalancer: LoadBalancer) {
    unwrap(this).attachToClassicLB(loadBalancer.let(LoadBalancer::unwrap))
  }

  /**
   * The network connections associated with this resource.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * Instance to register to.
   */
  public open fun instance(): Instance = unwrap(this).getInstance().let(Instance::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.InstanceTarget):
        InstanceTarget = InstanceTarget(cdkObject)

    internal fun unwrap(wrapped: InstanceTarget):
        software.amazon.awscdk.services.elasticloadbalancing.InstanceTarget = wrapped.cdkObject
  }
}
