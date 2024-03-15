@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkListener
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup
import io.cloudshiftdev.constructs.Construct
import kotlin.Number

public abstract class NetworkLoadBalancedServiceBase internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceBase,
) : Construct(cdkObject) {
  public open fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

  public open fun internalDesiredCount(): Number? = unwrap(this).getInternalDesiredCount()

  public open fun listener(): NetworkListener =
      unwrap(this).getListener().let(NetworkListener::wrap)

  public open fun loadBalancer(): NetworkLoadBalancer =
      unwrap(this).getLoadBalancer().let(NetworkLoadBalancer::wrap)

  public open fun targetGroup(): NetworkTargetGroup =
      unwrap(this).getTargetGroup().let(NetworkTargetGroup::wrap)

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceBase,
  ) : NetworkLoadBalancedServiceBase(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceBase):
        NetworkLoadBalancedServiceBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancedServiceBase):
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceBase = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceBase
  }
}
