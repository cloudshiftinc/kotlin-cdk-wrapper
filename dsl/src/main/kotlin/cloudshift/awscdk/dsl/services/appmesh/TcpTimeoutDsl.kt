@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appmesh.TcpTimeout

@CdkDslMarker
public class TcpTimeoutDsl {
  private val cdkBuilder: TcpTimeout.Builder = TcpTimeout.builder()

  /**
   * @param idle Represents an idle timeout.
   * The amount of time that a connection may be idle.
   */
  public fun idle(idle: Duration) {
    cdkBuilder.idle(idle)
  }

  public fun build(): TcpTimeout = cdkBuilder.build()
}
