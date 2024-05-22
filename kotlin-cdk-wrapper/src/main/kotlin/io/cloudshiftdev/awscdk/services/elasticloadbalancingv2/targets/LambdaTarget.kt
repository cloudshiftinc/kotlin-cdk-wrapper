@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps
import io.cloudshiftdev.awscdk.services.lambda.IFunction

/**
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets.*;
 * Function lambdaFunction;
 * ApplicationLoadBalancer lb;
 * ApplicationListener listener = lb.addListener("Listener",
 * BaseApplicationListenerProps.builder().port(80).build());
 * listener.addTargets("Targets", AddApplicationTargetsProps.builder()
 * .targets(List.of(new LambdaTarget(lambdaFunction)))
 * // For Lambda Targets, you need to explicitly enable health checks if you
 * // want them.
 * .healthCheck(HealthCheck.builder()
 * .enabled(true)
 * .build())
 * .build());
 * ```
 */
public open class LambdaTarget(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.targets.LambdaTarget,
) : CdkObject(cdkObject), IApplicationLoadBalancerTarget {
  public constructor(fn: IFunction) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.targets.LambdaTarget(fn.let(IFunction.Companion::unwrap))
  )

  /**
   * Register this instance target with a load balancer.
   *
   * Don't call this, it is called automatically when you add the target to a
   * load balancer.
   *
   * @param targetGroup 
   */
  public override fun attachToApplicationTargetGroup(targetGroup: IApplicationTargetGroup):
      LoadBalancerTargetProps =
      unwrap(this).attachToApplicationTargetGroup(targetGroup.let(IApplicationTargetGroup.Companion::unwrap)).let(LoadBalancerTargetProps::wrap)

  /**
   * Register this instance target with a load balancer.
   *
   * Don't call this, it is called automatically when you add the target to a
   * load balancer.
   *
   * @param targetGroup 
   */
  public open fun attachToNetworkTargetGroup(targetGroup: INetworkTargetGroup):
      LoadBalancerTargetProps =
      unwrap(this).attachToNetworkTargetGroup(targetGroup.let(INetworkTargetGroup.Companion::unwrap)).let(LoadBalancerTargetProps::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.targets.LambdaTarget):
        LambdaTarget = LambdaTarget(cdkObject)

    internal fun unwrap(wrapped: LambdaTarget):
        software.amazon.awscdk.services.elasticloadbalancingv2.targets.LambdaTarget =
        wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.targets.LambdaTarget
  }
}
