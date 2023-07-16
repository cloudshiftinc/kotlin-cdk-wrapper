@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeVirtualNodeHttp2ConnectionPoolPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty.Builder =
      CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty.builder()

  public fun maxRequests(maxRequests: Number) {
    cdkBuilder.maxRequests(maxRequests)
  }

  public fun build(): CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty = cdkBuilder.build()
}
