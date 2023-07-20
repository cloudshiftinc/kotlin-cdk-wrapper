@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeGrpcTimeoutPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.GrpcTimeoutProperty.Builder =
      CfnVirtualNode.GrpcTimeoutProperty.builder()

  public fun idle(idle: IResolvable) {
    cdkBuilder.idle(idle)
  }

  public fun idle(idle: CfnVirtualNode.DurationProperty) {
    cdkBuilder.idle(idle)
  }

  public fun perRequest(perRequest: IResolvable) {
    cdkBuilder.perRequest(perRequest)
  }

  public fun perRequest(perRequest: CfnVirtualNode.DurationProperty) {
    cdkBuilder.perRequest(perRequest)
  }

  public fun build(): CfnVirtualNode.GrpcTimeoutProperty = cdkBuilder.build()
}
