@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions

@CdkDslMarker
public class HttpHealthCheckOptionsDsl {
  private val cdkBuilder: HttpHealthCheckOptions.Builder = HttpHealthCheckOptions.builder()

  /**
   * @param healthyThreshold The number of consecutive successful health checks that must occur
   * before declaring listener healthy.
   */
  public fun healthyThreshold(healthyThreshold: Number) {
    cdkBuilder.healthyThreshold(healthyThreshold)
  }

  /**
   * @param interval The time period between each health check execution.
   */
  public fun interval(interval: Duration) {
    cdkBuilder.interval(interval)
  }

  /**
   * @param path The destination path for the health check request.
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  /**
   * @param timeout The amount of time to wait when receiving a response from the health check.
   */
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * @param unhealthyThreshold The number of consecutive failed health checks that must occur before
   * declaring a listener unhealthy.
   */
  public fun unhealthyThreshold(unhealthyThreshold: Number) {
    cdkBuilder.unhealthyThreshold(unhealthyThreshold)
  }

  public fun build(): HttpHealthCheckOptions = cdkBuilder.build()
}
