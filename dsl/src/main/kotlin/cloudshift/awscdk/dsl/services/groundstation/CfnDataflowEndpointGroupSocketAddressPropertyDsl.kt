@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

@CdkDslMarker
public class CfnDataflowEndpointGroupSocketAddressPropertyDsl {
  private val cdkBuilder: CfnDataflowEndpointGroup.SocketAddressProperty.Builder =
      CfnDataflowEndpointGroup.SocketAddressProperty.builder()

  /**
   * @param name The name of the endpoint, such as `Endpoint 1` .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param port The port of the endpoint, such as `55888` .
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnDataflowEndpointGroup.SocketAddressProperty = cdkBuilder.build()
}
