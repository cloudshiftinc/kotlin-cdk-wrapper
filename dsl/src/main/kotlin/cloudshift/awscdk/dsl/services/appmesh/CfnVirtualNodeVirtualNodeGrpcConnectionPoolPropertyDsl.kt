@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeVirtualNodeGrpcConnectionPoolPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty.Builder =
      CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty.builder()

  public fun maxRequests(maxRequests: Number) {
    cdkBuilder.maxRequests(maxRequests)
  }

  public fun build(): CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty = cdkBuilder.build()
}
