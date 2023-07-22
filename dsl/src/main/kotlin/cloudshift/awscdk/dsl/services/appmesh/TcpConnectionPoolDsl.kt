@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.TcpConnectionPool

@CdkDslMarker
public class TcpConnectionPoolDsl {
  private val cdkBuilder: TcpConnectionPool.Builder = TcpConnectionPool.builder()

  /**
   * @param maxConnections The maximum connections in the pool. 
   */
  public fun maxConnections(maxConnections: Number) {
    cdkBuilder.maxConnections(maxConnections)
  }

  public fun build(): TcpConnectionPool = cdkBuilder.build()
}
