@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeVirtualNodeConnectionPoolPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.VirtualNodeConnectionPoolProperty.Builder =
      CfnVirtualNode.VirtualNodeConnectionPoolProperty.builder()

  public fun grpc(grpc: IResolvable) {
    cdkBuilder.grpc(grpc)
  }

  public fun grpc(grpc: CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty) {
    cdkBuilder.grpc(grpc)
  }

  public fun http(http: IResolvable) {
    cdkBuilder.http(http)
  }

  public fun http(http: CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty) {
    cdkBuilder.http(http)
  }

  public fun http2(http2: IResolvable) {
    cdkBuilder.http2(http2)
  }

  public fun http2(http2: CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty) {
    cdkBuilder.http2(http2)
  }

  public fun tcp(tcp: IResolvable) {
    cdkBuilder.tcp(tcp)
  }

  public fun tcp(tcp: CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty) {
    cdkBuilder.tcp(tcp)
  }

  public fun build(): CfnVirtualNode.VirtualNodeConnectionPoolProperty = cdkBuilder.build()
}
