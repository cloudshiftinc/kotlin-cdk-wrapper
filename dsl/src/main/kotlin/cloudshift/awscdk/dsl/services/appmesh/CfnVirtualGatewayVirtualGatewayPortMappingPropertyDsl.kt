@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayPortMappingPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayPortMappingProperty.Builder =
      CfnVirtualGateway.VirtualGatewayPortMappingProperty.builder()

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayPortMappingProperty = cdkBuilder.build()
}
