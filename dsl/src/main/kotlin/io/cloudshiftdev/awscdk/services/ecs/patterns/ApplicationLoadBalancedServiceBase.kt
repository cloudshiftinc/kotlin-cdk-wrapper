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
  public open fun certificate(): ICertificate? =
      unwrap(this).getCertificate()?.let(ICertificate::wrap)

  public open fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

  public open fun internalDesiredCount(): Number? = unwrap(this).getInternalDesiredCount()

  public open fun listener(): ApplicationListener =
      unwrap(this).getListener().let(ApplicationListener::wrap)

  public open fun loadBalancer(): ApplicationLoadBalancer =
      unwrap(this).getLoadBalancer().let(ApplicationLoadBalancer::wrap)

  public open fun redirectListener(): ApplicationListener? =
      unwrap(this).getRedirectListener()?.let(ApplicationListener::wrap)

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
