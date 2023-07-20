@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeListenerTimeoutPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.ListenerTimeoutProperty.Builder =
      CfnVirtualNode.ListenerTimeoutProperty.builder()

  public fun grpc(grpc: IResolvable) {
    cdkBuilder.grpc(grpc)
  }

  public fun grpc(grpc: CfnVirtualNode.GrpcTimeoutProperty) {
    cdkBuilder.grpc(grpc)
  }

  public fun http(http: IResolvable) {
    cdkBuilder.http(http)
  }

  public fun http(http: CfnVirtualNode.HttpTimeoutProperty) {
    cdkBuilder.http(http)
  }

  public fun http2(http2: IResolvable) {
    cdkBuilder.http2(http2)
  }

  public fun http2(http2: CfnVirtualNode.HttpTimeoutProperty) {
    cdkBuilder.http2(http2)
  }

  public fun tcp(tcp: IResolvable) {
    cdkBuilder.tcp(tcp)
  }

  public fun tcp(tcp: CfnVirtualNode.TcpTimeoutProperty) {
    cdkBuilder.tcp(tcp)
  }

  public fun build(): CfnVirtualNode.ListenerTimeoutProperty = cdkBuilder.build()
}
