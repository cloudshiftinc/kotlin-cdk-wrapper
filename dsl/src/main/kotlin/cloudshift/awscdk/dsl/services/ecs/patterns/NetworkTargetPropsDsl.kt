@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps

@CdkDslMarker
public class NetworkTargetPropsDsl {
  private val cdkBuilder: NetworkTargetProps.Builder = NetworkTargetProps.builder()

  /**
   * @param containerPort The port number of the container. 
   * Only applicable when using application/network load balancers.
   */
  public fun containerPort(containerPort: Number) {
    cdkBuilder.containerPort(containerPort)
  }

  /**
   * @param listener Name of the listener the target group attached to.
   */
  public fun listener(listener: String) {
    cdkBuilder.listener(listener)
  }

  public fun build(): NetworkTargetProps = cdkBuilder.build()
}
