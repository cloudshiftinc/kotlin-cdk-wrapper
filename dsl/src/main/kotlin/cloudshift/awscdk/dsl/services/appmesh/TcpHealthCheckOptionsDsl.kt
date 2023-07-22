@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions

/**
 * Properties used to define TCP Based healthchecks.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.appmesh.*;
 * TcpHealthCheckOptions tcpHealthCheckOptions = TcpHealthCheckOptions.builder()
 * .healthyThreshold(123)
 * .interval(Duration.minutes(30))
 * .timeout(Duration.minutes(30))
 * .unhealthyThreshold(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class TcpHealthCheckOptionsDsl {
  private val cdkBuilder: TcpHealthCheckOptions.Builder = TcpHealthCheckOptions.builder()

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

  public fun build(): TcpHealthCheckOptions = cdkBuilder.build()
}
