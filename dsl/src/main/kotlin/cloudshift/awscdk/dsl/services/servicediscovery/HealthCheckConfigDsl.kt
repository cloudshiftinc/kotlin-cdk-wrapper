@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.servicediscovery.HealthCheckConfig
import software.amazon.awscdk.services.servicediscovery.HealthCheckType

@CdkDslMarker
public class HealthCheckConfigDsl {
  private val cdkBuilder: HealthCheckConfig.Builder = HealthCheckConfig.builder()

  /**
   * @param failureThreshold The number of consecutive health checks that an endpoint must pass or
   * fail for Route 53 to change the current status of the endpoint from unhealthy to healthy or vice
   * versa.
   */
  public fun failureThreshold(failureThreshold: Number) {
    cdkBuilder.failureThreshold(failureThreshold)
  }

  /**
   * @param resourcePath The path that you want Route 53 to request when performing health checks.
   * Do not use when health check type is TCP.
   */
  public fun resourcePath(resourcePath: String) {
    cdkBuilder.resourcePath(resourcePath)
  }

  /**
   * @param type The type of health check that you want to create, which indicates how Route 53
   * determines whether an endpoint is healthy.
   * Cannot be modified once created. Supported values are HTTP, HTTPS, and TCP.
   */
  public fun type(type: HealthCheckType) {
    cdkBuilder.type(type)
  }

  public fun build(): HealthCheckConfig = cdkBuilder.build()
}
