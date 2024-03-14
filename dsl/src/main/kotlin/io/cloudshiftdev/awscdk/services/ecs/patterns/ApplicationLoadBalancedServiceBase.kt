package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationListener
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import io.cloudshiftdev.constructs.Construct
import kotlin.Number

public abstract class ApplicationLoadBalancedServiceBase internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceBase,
) : Construct(cdkObject) {
  /**
   * Certificate Manager certificate to associate with the load balancer.
   */
  public open fun certificate(): ICertificate? =
      unwrap(this).getCertificate()?.let(ICertificate::wrap)

  /**
   * The cluster that hosts the service.
   */
  public open fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

  /**
   * The desired number of instantiations of the task definition to keep running on the service.
   *
   * The default is 1 for all new services and uses the existing services desired count
   * when updating an existing service if one is not provided.
   */
  public open fun internalDesiredCount(): Number? = unwrap(this).getInternalDesiredCount()

  /**
   * The listener for the service.
   */
  public open fun listener(): ApplicationListener =
      unwrap(this).getListener().let(ApplicationListener::wrap)

  /**
   * The Application Load Balancer for the service.
   */
  public open fun loadBalancer(): ApplicationLoadBalancer =
      unwrap(this).getLoadBalancer().let(ApplicationLoadBalancer::wrap)

  /**
   * The redirect listener for the service if redirectHTTP is enabled.
   */
  public open fun redirectListener(): ApplicationListener? =
      unwrap(this).getRedirectListener()?.let(ApplicationListener::wrap)

  /**
   * The target group for the service.
   */
  public open fun targetGroup(): ApplicationTargetGroup =
      unwrap(this).getTargetGroup().let(ApplicationTargetGroup::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceBase,
  ) : ApplicationLoadBalancedServiceBase(cdkObject)

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceBase):
        ApplicationLoadBalancedServiceBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancedServiceBase):
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceBase = (wrapped
        as Wrapper).cdkObject
  }
}
