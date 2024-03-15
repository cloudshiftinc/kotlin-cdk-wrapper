@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkListener
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup
import io.cloudshiftdev.constructs.Construct
import kotlin.Deprecated
import kotlin.Number
import kotlin.collections.List

public abstract class NetworkMultipleTargetGroupsServiceBase internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsServiceBase,
) : Construct(cdkObject) {
  public open fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

  public open fun internalDesiredCount(): Number? = unwrap(this).getInternalDesiredCount()

  @Deprecated(message = "deprecated in CDK")
  public open fun listener(): NetworkListener =
      unwrap(this).getListener().let(NetworkListener::wrap)

  public open fun listeners(): List<NetworkListener> =
      unwrap(this).getListeners().map(NetworkListener::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun loadBalancer(): NetworkLoadBalancer =
      unwrap(this).getLoadBalancer().let(NetworkLoadBalancer::wrap)

  public open fun loadBalancers(): List<NetworkLoadBalancer> =
      unwrap(this).getLoadBalancers().map(NetworkLoadBalancer::wrap)

  public open fun targetGroups(): List<NetworkTargetGroup> =
      unwrap(this).getTargetGroups().map(NetworkTargetGroup::wrap)

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsServiceBase,
  ) : NetworkMultipleTargetGroupsServiceBase(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsServiceBase):
        NetworkMultipleTargetGroupsServiceBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkMultipleTargetGroupsServiceBase):
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsServiceBase =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsServiceBase
  }
}
