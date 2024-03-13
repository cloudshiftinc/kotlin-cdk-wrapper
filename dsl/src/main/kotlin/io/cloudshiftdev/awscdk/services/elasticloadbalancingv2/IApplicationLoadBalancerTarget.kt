package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public interface IApplicationLoadBalancerTarget {
  public fun attachToApplicationTargetGroup(arg0: IApplicationTargetGroup): LoadBalancerTargetProps

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget,
  ) : IApplicationLoadBalancerTarget {
    public override fun attachToApplicationTargetGroup(arg0: IApplicationTargetGroup):
        LoadBalancerTargetProps =
        unwrap(this).attachToApplicationTargetGroup(arg0.let(IApplicationTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget):
        IApplicationLoadBalancerTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApplicationLoadBalancerTarget):
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget =
        (wrapped as Wrapper).cdkObject
  }
}
