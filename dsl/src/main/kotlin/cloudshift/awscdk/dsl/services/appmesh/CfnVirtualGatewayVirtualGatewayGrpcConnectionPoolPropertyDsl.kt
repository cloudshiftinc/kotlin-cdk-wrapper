@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayGrpcConnectionPoolPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty.Builder =
      CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty.builder()

  /**
   * @param maxRequests Maximum number of inflight requests Envoy can concurrently support across
   * hosts in upstream cluster. 
   */
  public fun maxRequests(maxRequests: Number) {
    cdkBuilder.maxRequests(maxRequests)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty =
      cdkBuilder.build()
}
