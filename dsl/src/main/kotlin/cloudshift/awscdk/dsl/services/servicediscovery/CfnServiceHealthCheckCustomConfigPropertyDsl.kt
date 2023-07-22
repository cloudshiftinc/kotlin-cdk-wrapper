@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.servicediscovery.CfnService

@CdkDslMarker
public class CfnServiceHealthCheckCustomConfigPropertyDsl {
  private val cdkBuilder: CfnService.HealthCheckCustomConfigProperty.Builder =
      CfnService.HealthCheckCustomConfigProperty.builder()

  /**
   * @param failureThreshold This parameter is no longer supported and is always set to 1.
   * AWS Cloud Map waits for approximately 30 seconds after receiving an
   * `UpdateInstanceCustomHealthStatus` request before changing the status of the service instance.
   *
   * The number of 30-second intervals that you want AWS Cloud Map to wait after receiving an
   * `UpdateInstanceCustomHealthStatus` request before it changes the health status of a service
   * instance.
   *
   * Sending a second or subsequent `UpdateInstanceCustomHealthStatus` request with the same value
   * before 30 seconds has passed doesn't accelerate the change. AWS Cloud Map still waits `30` seconds
   * after the first request to make the change.
   */
  public fun failureThreshold(failureThreshold: Number) {
    cdkBuilder.failureThreshold(failureThreshold)
  }

  public fun build(): CfnService.HealthCheckCustomConfigProperty = cdkBuilder.build()
}
