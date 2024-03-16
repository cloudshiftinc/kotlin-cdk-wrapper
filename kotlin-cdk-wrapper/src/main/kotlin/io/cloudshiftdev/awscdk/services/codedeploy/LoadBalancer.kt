@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import kotlin.String

/**
 * An interface of an abstract load balancer, as needed by CodeDeploy.
 *
 * Create instances using the static factory methods:
 * `#classic`, `#application` and `#network`.
 *
 * Example:
 *
 * ```
 * ApplicationLoadBalancer alb;
 * ApplicationListener listener = alb.addListener("Listener",
 * BaseApplicationListenerProps.builder().port(80).build());
 * ApplicationTargetGroup targetGroup = listener.addTargets("Fleet",
 * AddApplicationTargetsProps.builder().port(80).build());
 * ServerDeploymentGroup deploymentGroup = ServerDeploymentGroup.Builder.create(this,
 * "DeploymentGroup")
 * .loadBalancer(LoadBalancer.application(targetGroup))
 * .build();
 * ```
 */
public abstract class LoadBalancer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codedeploy.LoadBalancer,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun generation(): LoadBalancerGeneration =
      unwrap(this).getGeneration().let(LoadBalancerGeneration::wrap)

  /**
   *
   */
  public open fun name(): String = unwrap(this).getName()

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
        LoadBalancer = CdkObjectWrappers.wrap(cdkObject) as LoadBalancer

    internal fun unwrap(wrapped: LoadBalancer):
        software.amazon.awscdk.services.codedeploy.LoadBalancer = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codedeploy.LoadBalancer
  }
}
