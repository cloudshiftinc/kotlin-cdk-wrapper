@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.HttpConnectionPool

@CdkDslMarker
public class HttpConnectionPoolDsl {
  private val cdkBuilder: HttpConnectionPool.Builder = HttpConnectionPool.builder()

  /**
   * @param maxConnections The maximum connections in the pool. 
   */
  public fun maxConnections(maxConnections: Number) {
    cdkBuilder.maxConnections(maxConnections)
  }

  /**
   * @param maxPendingRequests The maximum pending requests in the pool. 
   */
  public fun maxPendingRequests(maxPendingRequests: Number) {
    cdkBuilder.maxPendingRequests(maxPendingRequests)
  }

  public fun build(): HttpConnectionPool = cdkBuilder.build()
}
