@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeListenerTimeoutPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.ListenerTimeoutProperty.Builder =
      CfnVirtualNode.ListenerTimeoutProperty.builder()

  /**
   * @param grpc An object that represents types of timeouts.
   */
  public fun grpc(grpc: IResolvable) {
    cdkBuilder.grpc(grpc)
  }

  /**
   * @param grpc An object that represents types of timeouts.
   */
  public fun grpc(grpc: CfnVirtualNode.GrpcTimeoutProperty) {
    cdkBuilder.grpc(grpc)
  }

  /**
   * @param http An object that represents types of timeouts.
   */
  public fun http(http: IResolvable) {
    cdkBuilder.http(http)
  }

  /**
   * @param http An object that represents types of timeouts.
   */
  public fun http(http: CfnVirtualNode.HttpTimeoutProperty) {
    cdkBuilder.http(http)
  }

  /**
   * @param http2 An object that represents types of timeouts.
   */
  public fun http2(http2: IResolvable) {
    cdkBuilder.http2(http2)
  }

  /**
   * @param http2 An object that represents types of timeouts.
   */
  public fun http2(http2: CfnVirtualNode.HttpTimeoutProperty) {
    cdkBuilder.http2(http2)
  }

  /**
   * @param tcp An object that represents types of timeouts.
   */
  public fun tcp(tcp: IResolvable) {
    cdkBuilder.tcp(tcp)
  }

  /**
   * @param tcp An object that represents types of timeouts.
   */
  public fun tcp(tcp: CfnVirtualNode.TcpTimeoutProperty) {
    cdkBuilder.tcp(tcp)
  }

  public fun build(): CfnVirtualNode.ListenerTimeoutProperty = cdkBuilder.build()
}
