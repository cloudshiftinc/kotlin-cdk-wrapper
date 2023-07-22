@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.Http2ConnectionPool

@CdkDslMarker
public class Http2ConnectionPoolDsl {
  private val cdkBuilder: Http2ConnectionPool.Builder = Http2ConnectionPool.builder()

  /**
   * @param maxRequests The maximum requests in the pool. 
   */
  public fun maxRequests(maxRequests: Number) {
    cdkBuilder.maxRequests(maxRequests)
  }

  public fun build(): Http2ConnectionPool = cdkBuilder.build()
}
