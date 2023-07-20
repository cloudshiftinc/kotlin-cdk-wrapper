@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnService

@CdkDslMarker
public class CfnServiceHealthCheckConfigurationPropertyDsl {
  private val cdkBuilder: CfnService.HealthCheckConfigurationProperty.Builder =
      CfnService.HealthCheckConfigurationProperty.builder()

  public fun healthyThreshold(healthyThreshold: Number) {
    cdkBuilder.healthyThreshold(healthyThreshold)
  }

  public fun interval(interval: Number) {
    cdkBuilder.interval(interval)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun timeout(timeout: Number) {
    cdkBuilder.timeout(timeout)
  }

  public fun unhealthyThreshold(unhealthyThreshold: Number) {
    cdkBuilder.unhealthyThreshold(unhealthyThreshold)
  }

  public fun build(): CfnService.HealthCheckConfigurationProperty = cdkBuilder.build()
}
