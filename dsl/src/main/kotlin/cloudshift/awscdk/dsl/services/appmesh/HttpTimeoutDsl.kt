@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appmesh.HttpTimeout

@CdkDslMarker
public class HttpTimeoutDsl {
  private val cdkBuilder: HttpTimeout.Builder = HttpTimeout.builder()

  /**
   * @param idle Represents an idle timeout.
   * The amount of time that a connection may be idle.
   */
  public fun idle(idle: Duration) {
    cdkBuilder.idle(idle)
  }

  /**
   * @param perRequest Represents per request timeout.
   */
  public fun perRequest(perRequest: Duration) {
    cdkBuilder.perRequest(perRequest)
  }

  public fun build(): HttpTimeout = cdkBuilder.build()
}
