@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import kotlin.String

public abstract class LoadBalancer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codedeploy.LoadBalancer,
) : CdkObject(cdkObject) {
  public open fun generation(): LoadBalancerGeneration =
      unwrap(this).getGeneration().let(LoadBalancerGeneration::wrap)

  public open fun name(): String = unwrap(this).getName()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.LoadBalancer,
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
        software.amazon.awscdk.services.codedeploy.LoadBalancer = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codedeploy.LoadBalancer
  }
}
