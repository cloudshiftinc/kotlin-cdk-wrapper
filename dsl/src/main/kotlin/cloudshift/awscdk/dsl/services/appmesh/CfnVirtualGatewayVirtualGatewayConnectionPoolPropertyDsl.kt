@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayConnectionPoolPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayConnectionPoolProperty.Builder =
      CfnVirtualGateway.VirtualGatewayConnectionPoolProperty.builder()

  public fun grpc(grpc: IResolvable) {
    cdkBuilder.grpc(grpc)
  }

  public fun grpc(grpc: CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty) {
    cdkBuilder.grpc(grpc)
  }

  public fun http(http: IResolvable) {
    cdkBuilder.http(http)
  }

  public fun http(http: CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty) {
    cdkBuilder.http(http)
  }

  public fun http2(http2: IResolvable) {
    cdkBuilder.http2(http2)
  }

  public fun http2(http2: CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty) {
    cdkBuilder.http2(http2)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayConnectionPoolProperty = cdkBuilder.build()
}
