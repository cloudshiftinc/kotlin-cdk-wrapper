@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkListener
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup
import io.cloudshiftdev.constructs.Construct
import kotlin.Number

/**
 * The base class for NetworkLoadBalancedEc2Service and NetworkLoadBalancedFargateService services.
 */
public abstract class NetworkLoadBalancedServiceBase(
  cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceBase,
) : Construct(cdkObject) {
  /**
   * The cluster that hosts the service.
   */
  public open fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

  /**
   * The desired number of instantiations of the task definition to keep running on the service.
   *
   * The default is 1 for all new services and uses the existing services desired count
   * when updating an existing service, if one is not provided.
   */
  public open fun internalDesiredCount(): Number? = unwrap(this).getInternalDesiredCount()

  /**
   * The listener for the service.
   */
  public open fun listener(): NetworkListener =
      unwrap(this).getListener().let(NetworkListener::wrap)

  /**
   * The Network Load Balancer for the service.
   */
  public open fun loadBalancer(): NetworkLoadBalancer =
      unwrap(this).getLoadBalancer().let(NetworkLoadBalancer::wrap)

  /**
   * The target group for the service.
   */
  public open fun targetGroup(): NetworkTargetGroup =
      unwrap(this).getTargetGroup().let(NetworkTargetGroup::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceBase,
  ) : NetworkLoadBalancedServiceBase(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceBase):
        NetworkLoadBalancedServiceBase = CdkObjectWrappers.wrap(cdkObject) as?
        NetworkLoadBalancedServiceBase ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancedServiceBase):
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceBase = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceBase
  }
}
