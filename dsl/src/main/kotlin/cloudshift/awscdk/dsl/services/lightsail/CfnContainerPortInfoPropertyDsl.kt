@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnContainer

@CdkDslMarker
public class CfnContainerPortInfoPropertyDsl {
  private val cdkBuilder: CfnContainer.PortInfoProperty.Builder =
      CfnContainer.PortInfoProperty.builder()

  /**
   * @param port The open firewall ports of the container.
   */
  public fun port(port: String) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The protocol name for the open ports.
   * *Allowed values* : `HTTP` | `HTTPS` | `TCP` | `UDP`
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): CfnContainer.PortInfoProperty = cdkBuilder.build()
}
