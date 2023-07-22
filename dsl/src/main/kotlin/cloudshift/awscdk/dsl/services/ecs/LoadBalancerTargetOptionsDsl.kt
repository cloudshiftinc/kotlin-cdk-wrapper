@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions
import software.amazon.awscdk.services.ecs.Protocol

@CdkDslMarker
public class LoadBalancerTargetOptionsDsl {
  private val cdkBuilder: LoadBalancerTargetOptions.Builder = LoadBalancerTargetOptions.builder()

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
   * @param protocol The protocol used for the port mapping.
   * Only applicable when using application load balancers.
   */
  public fun protocol(protocol: Protocol) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): LoadBalancerTargetOptions = cdkBuilder.build()
}
