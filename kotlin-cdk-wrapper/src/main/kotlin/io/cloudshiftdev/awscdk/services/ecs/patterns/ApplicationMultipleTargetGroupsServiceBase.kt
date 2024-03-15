@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkObject
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
  public open fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

  public open fun internalDesiredCount(): Number? = unwrap(this).getInternalDesiredCount()

  @Deprecated(message = "deprecated in CDK")
  public open fun listener(): ApplicationListener =
      unwrap(this).getListener().let(ApplicationListener::wrap)

  public open fun listeners(): List<ApplicationListener> =
      unwrap(this).getListeners().map(ApplicationListener::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun loadBalancer(): ApplicationLoadBalancer =
      unwrap(this).getLoadBalancer().let(ApplicationLoadBalancer::wrap)

  public open fun loadBalancers(): List<ApplicationLoadBalancer> =
      unwrap(this).getLoadBalancers().map(ApplicationLoadBalancer::wrap)

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
