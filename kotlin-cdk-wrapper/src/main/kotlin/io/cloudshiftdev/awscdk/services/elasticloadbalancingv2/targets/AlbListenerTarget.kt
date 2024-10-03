@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets

import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationListener
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps

/**
 * A single Application Load Balancer's listener as the target for load balancing.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets.*;
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.ecs.patterns.*;
 * Vpc vpc;
 * FargateTaskDefinition task = FargateTaskDefinition.Builder.create(this,
 * "Task").cpu(256).memoryLimitMiB(512).build();
 * task.addContainer("nginx", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("public.ecr.aws/nginx/nginx:latest"))
 * .portMappings(List.of(PortMapping.builder().containerPort(80).build()))
 * .build());
 * ApplicationLoadBalancedFargateService svc =
 * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
 * .vpc(vpc)
 * .taskDefinition(task)
 * .publicLoadBalancer(false)
 * .build();
 * NetworkLoadBalancer nlb = NetworkLoadBalancer.Builder.create(this, "Nlb")
 * .vpc(vpc)
 * .crossZoneEnabled(true)
 * .internetFacing(true)
 * .build();
 * NetworkListener listener = nlb.addListener("listener",
 * BaseNetworkListenerProps.builder().port(80).build());
 * listener.addTargets("Targets", AddNetworkTargetsProps.builder()
 * .targets(List.of(new AlbListenerTarget(svc.getListener())))
 * .port(80)
 * .build());
 * CfnOutput.Builder.create(this, "NlbEndpoint").value(String.format("http://%s",
 * nlb.getLoadBalancerDnsName())).build();
 * ```
 */
public open class AlbListenerTarget(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbListenerTarget,
) : AlbArnTarget(cdkObject) {
  public constructor(albListener: ApplicationListener) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbListenerTarget(albListener.let(ApplicationListener.Companion::unwrap))
  )

  /**
   * Register this ALB target with a load balancer.
   *
   * Don't call this, it is called automatically when you add the target to a
   * load balancer.
   *
   * This adds dependency on albListener because creation of ALB listener and NLB can vary during
   * runtime.
   * More Details on - https://github.com/aws/aws-cdk/issues/17208
   *
   * @param targetGroup 
   */
  public override fun attachToNetworkTargetGroup(targetGroup: INetworkTargetGroup):
      LoadBalancerTargetProps =
      unwrap(this).attachToNetworkTargetGroup(targetGroup.let(INetworkTargetGroup.Companion::unwrap)).let(LoadBalancerTargetProps::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbListenerTarget):
        AlbListenerTarget = AlbListenerTarget(cdkObject)

    internal fun unwrap(wrapped: AlbListenerTarget):
        software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbListenerTarget =
        wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbListenerTarget
  }
}
