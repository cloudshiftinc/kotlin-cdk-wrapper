@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps

@CdkDslMarker
public class NetworkListenerPropsDsl {
  private val cdkBuilder: NetworkListenerProps.Builder = NetworkListenerProps.builder()

  /**
   * @param name Name of the listener. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param port The port on which the listener listens for requests.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): NetworkListenerProps = cdkBuilder.build()
}
