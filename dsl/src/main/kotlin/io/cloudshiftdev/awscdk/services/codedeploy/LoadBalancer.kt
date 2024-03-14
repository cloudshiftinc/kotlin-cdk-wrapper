package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import kotlin.String

public abstract class LoadBalancer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codedeploy.LoadBalancer,
) {
  /**
   *
   */
  public open fun generation(): LoadBalancerGeneration =
      unwrap(this).getGeneration().let(LoadBalancerGeneration::wrap)

  /**
   *
   */
  public open fun name(): String = unwrap(this).getName()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codedeploy.LoadBalancer,
  ) : LoadBalancer(cdkObject)

  public companion object {
    public fun application(albTargetGroup: IApplicationTargetGroup): LoadBalancer =
        software.amazon.awscdk.services.codedeploy.LoadBalancer.application(albTargetGroup.let(IApplicationTargetGroup::unwrap)).let(LoadBalancer::wrap)

    public
        fun classic(loadBalancer: io.cloudshiftdev.awscdk.services.elasticloadbalancing.LoadBalancer):
        LoadBalancer =
        software.amazon.awscdk.services.codedeploy.LoadBalancer.classic(loadBalancer.let(io.cloudshiftdev.awscdk.services.elasticloadbalancing.LoadBalancer::unwrap)).let(LoadBalancer::wrap)

    public fun network(nlbTargetGroup: INetworkTargetGroup): LoadBalancer =
        software.amazon.awscdk.services.codedeploy.LoadBalancer.network(nlbTargetGroup.let(INetworkTargetGroup::unwrap)).let(LoadBalancer::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LoadBalancer):
        LoadBalancer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancer):
        software.amazon.awscdk.services.codedeploy.LoadBalancer = (wrapped as Wrapper).cdkObject
  }
}
