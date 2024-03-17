@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkListener
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup
import io.cloudshiftdev.constructs.Construct
import kotlin.Deprecated
import kotlin.Number
import kotlin.collections.List

/**
 * The base class for NetworkMultipleTargetGroupsEc2Service and
 * NetworkMultipleTargetGroupsFargateService classes.
 */
public abstract class NetworkMultipleTargetGroupsServiceBase internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsServiceBase,
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
   * (deprecated) The listener for the service.
   *
   * * Use `listeners` instead.
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun listener(): NetworkListener =
      unwrap(this).getListener().let(NetworkListener::wrap)

  /**
   * The listeners of the service.
   */
  public open fun listeners(): List<NetworkListener> =
      unwrap(this).getListeners().map(NetworkListener::wrap)

  /**
   * (deprecated) The Network Load Balancer for the service.
   *
   * * Use `loadBalancers` instead.
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun loadBalancer(): NetworkLoadBalancer =
      unwrap(this).getLoadBalancer().let(NetworkLoadBalancer::wrap)

  /**
   * The load balancers of the service.
   */
  public open fun loadBalancers(): List<NetworkLoadBalancer> =
      unwrap(this).getLoadBalancers().map(NetworkLoadBalancer::wrap)

  /**
   * The target groups of the service.
   */
  public open fun targetGroups(): List<NetworkTargetGroup> =
      unwrap(this).getTargetGroups().map(NetworkTargetGroup::wrap)

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsServiceBase,
  ) : NetworkMultipleTargetGroupsServiceBase(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsServiceBase):
        NetworkMultipleTargetGroupsServiceBase = CdkObjectWrappers.wrap(cdkObject) as?
        NetworkMultipleTargetGroupsServiceBase ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkMultipleTargetGroupsServiceBase):
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsServiceBase =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsServiceBase
  }
}
