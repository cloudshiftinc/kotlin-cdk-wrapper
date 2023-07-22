@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents a port mapping.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualGatewayPortMappingProperty virtualGatewayPortMappingProperty =
 * VirtualGatewayPortMappingProperty.builder()
 * .port(123)
 * .protocol("protocol")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayportmapping.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayPortMappingPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayPortMappingProperty.Builder =
      CfnVirtualGateway.VirtualGatewayPortMappingProperty.builder()

  /**
   * @param port The port used for the port mapping. 
   * Specify one protocol.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The protocol used for the port mapping. 
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayPortMappingProperty = cdkBuilder.build()
}
