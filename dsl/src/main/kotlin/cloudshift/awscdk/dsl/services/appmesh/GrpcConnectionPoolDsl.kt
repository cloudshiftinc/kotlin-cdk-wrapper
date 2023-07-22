@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.GrpcConnectionPool

@CdkDslMarker
public class GrpcConnectionPoolDsl {
  private val cdkBuilder: GrpcConnectionPool.Builder = GrpcConnectionPool.builder()

  /**
   * @param maxRequests The maximum requests in the pool. 
   */
  public fun maxRequests(maxRequests: Number) {
    cdkBuilder.maxRequests(maxRequests)
  }

  public fun build(): GrpcConnectionPool = cdkBuilder.build()
}
