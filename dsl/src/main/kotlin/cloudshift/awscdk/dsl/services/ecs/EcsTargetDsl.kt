@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.EcsTarget
import software.amazon.awscdk.services.ecs.ListenerConfig
import software.amazon.awscdk.services.ecs.Protocol

/**
 * Example:
 *
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * Vpc vpc;
 * FargateService service = FargateService.Builder.create(this,
 * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
 * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this,
 * "LB").vpc(vpc).internetFacing(true).build();
 * ApplicationListener listener = lb.addListener("Listener",
 * BaseApplicationListenerProps.builder().port(80).build());
 * service.registerLoadBalancerTargets(EcsTarget.builder()
 * .containerName("web")
 * .containerPort(80)
 * .newTargetGroupId("ECS")
 * .listener(ListenerConfig.applicationListener(listener, AddApplicationTargetsProps.builder()
 * .protocol(ApplicationProtocol.HTTPS)
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class EcsTargetDsl {
  private val cdkBuilder: EcsTarget.Builder = EcsTarget.builder()

  /**
   * @param containerName The name of the container. 
   */
  public fun containerName(containerName: String) {
    cdkBuilder.containerName(containerName)
  }

  /**
   * @param containerPort The port number of the container.
   * Only applicable when using application/network load balancers.
   */
  public fun containerPort(containerPort: Number) {
    cdkBuilder.containerPort(containerPort)
  }

  /**
   * @param listener Listener and properties for adding target group to the listener. 
   */
  public fun listener(listener: ListenerConfig) {
    cdkBuilder.listener(listener)
  }

  /**
   * @param newTargetGroupId ID for a target group to be created. 
   */
  public fun newTargetGroupId(newTargetGroupId: String) {
    cdkBuilder.newTargetGroupId(newTargetGroupId)
  }

  /**
   * @param protocol The protocol used for the port mapping.
   * Only applicable when using application load balancers.
   */
  public fun protocol(protocol: Protocol) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): EcsTarget = cdkBuilder.build()
}
