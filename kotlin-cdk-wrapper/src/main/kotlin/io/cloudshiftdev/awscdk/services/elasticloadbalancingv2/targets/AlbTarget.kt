@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets

import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import kotlin.Number

/**
 * A single Application Load Balancer as the target for load balancing.
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
 * .targets(List.of(new AlbTarget(svc.getLoadBalancer(), 80)))
 * .port(80)
 * .build());
 * CfnOutput.Builder.create(this, "NlbEndpoint").value(String.format("http://%s",
 * nlb.getLoadBalancerDnsName())).build();
 * ```
 */
public open class AlbTarget(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbTarget,
) : AlbArnTarget(cdkObject) {
  public constructor(alb: IApplicationLoadBalancer, port: Number) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbTarget(alb.let(IApplicationLoadBalancer::unwrap),
      port)
  )

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbTarget):
        AlbTarget = AlbTarget(cdkObject)

    internal fun unwrap(wrapped: AlbTarget):
        software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbTarget = wrapped.cdkObject
        as software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbTarget
  }
}
