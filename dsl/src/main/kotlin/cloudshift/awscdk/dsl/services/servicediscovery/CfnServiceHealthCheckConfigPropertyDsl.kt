@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.servicediscovery.CfnService

@CdkDslMarker
public class CfnServiceHealthCheckConfigPropertyDsl {
  private val cdkBuilder: CfnService.HealthCheckConfigProperty.Builder =
      CfnService.HealthCheckConfigProperty.builder()

  public fun failureThreshold(failureThreshold: Number) {
    cdkBuilder.failureThreshold(failureThreshold)
  }

  public fun resourcePath(resourcePath: String) {
    cdkBuilder.resourcePath(resourcePath)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnService.HealthCheckConfigProperty = cdkBuilder.build()
}
