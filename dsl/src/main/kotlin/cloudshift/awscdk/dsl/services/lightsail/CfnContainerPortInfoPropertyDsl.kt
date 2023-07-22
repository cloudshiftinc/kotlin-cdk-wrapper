@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnContainer

/**
 * `PortInfo` is a property of the
 * [Container](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html)
 * property. It describes the ports to open and the protocols to use for a container on a Amazon
 * Lightsail container service.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * PortInfoProperty portInfoProperty = PortInfoProperty.builder()
 * .port("port")
 * .protocol("protocol")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-portinfo.html)
 */
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
