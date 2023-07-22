@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.HealthCheckBindOptions

/**
 * Options used for creating the Health Check object.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HealthCheckBindOptions healthCheckBindOptions = HealthCheckBindOptions.builder()
 * .defaultPort(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class HealthCheckBindOptionsDsl {
  private val cdkBuilder: HealthCheckBindOptions.Builder = HealthCheckBindOptions.builder()

  /**
   * @param defaultPort Port for Health Check interface.
   */
  public fun defaultPort(defaultPort: Number) {
    cdkBuilder.defaultPort(defaultPort)
  }

  public fun build(): HealthCheckBindOptions = cdkBuilder.build()
}
