@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appmesh.GrpcTimeout

@CdkDslMarker
public class GrpcTimeoutDsl {
  private val cdkBuilder: GrpcTimeout.Builder = GrpcTimeout.builder()

  public fun idle(idle: Duration) {
    cdkBuilder.idle(idle)
  }

  public fun perRequest(perRequest: Duration) {
    cdkBuilder.perRequest(perRequest)
  }

  public fun build(): GrpcTimeout = cdkBuilder.build()
}
