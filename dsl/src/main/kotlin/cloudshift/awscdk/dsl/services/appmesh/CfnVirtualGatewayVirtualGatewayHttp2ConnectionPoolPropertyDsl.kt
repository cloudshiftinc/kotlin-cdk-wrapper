@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayHttp2ConnectionPoolPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty.Builder =
      CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty.builder()

  public fun maxRequests(maxRequests: Number) {
    cdkBuilder.maxRequests(maxRequests)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty =
      cdkBuilder.build()
}
