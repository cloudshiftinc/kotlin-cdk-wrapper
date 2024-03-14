package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationListener
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import io.cloudshiftdev.constructs.Construct
import kotlin.Deprecated
import kotlin.Number
import kotlin.collections.List

public abstract class ApplicationMultipleTargetGroupsServiceBase internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBase,
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
   * (deprecated) The default listener for the service (first added listener).
   *
   * * Use `listeners` instead.
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun listener(): ApplicationListener =
      unwrap(this).getListener().let(ApplicationListener::wrap)

  /**
   * The listeners of the service.
   */
  public open fun listeners(): List<ApplicationListener> =
      unwrap(this).getListeners().map(ApplicationListener::wrap)

  /**
   * (deprecated) The default Application Load Balancer for the service (first added load balancer).
   *
   * * Use `loadBalancers` instead.
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun loadBalancer(): ApplicationLoadBalancer =
      unwrap(this).getLoadBalancer().let(ApplicationLoadBalancer::wrap)

  /**
   * The load balancers of the service.
   */
  public open fun loadBalancers(): List<ApplicationLoadBalancer> =
      unwrap(this).getLoadBalancers().map(ApplicationLoadBalancer::wrap)

  /**
   * The target groups of the service.
   */
  public open fun targetGroups(): List<ApplicationTargetGroup> =
      unwrap(this).getTargetGroups().map(ApplicationTargetGroup::wrap)

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBase,
  ) : ApplicationMultipleTargetGroupsServiceBase(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBase):
        ApplicationMultipleTargetGroupsServiceBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationMultipleTargetGroupsServiceBase):
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBase =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBase
  }
}
