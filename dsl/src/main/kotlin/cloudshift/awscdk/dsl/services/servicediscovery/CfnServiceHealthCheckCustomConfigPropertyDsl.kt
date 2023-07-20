@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.servicediscovery.CfnService

@CdkDslMarker
public class CfnServiceHealthCheckCustomConfigPropertyDsl {
  private val cdkBuilder: CfnService.HealthCheckCustomConfigProperty.Builder =
      CfnService.HealthCheckCustomConfigProperty.builder()

  public fun failureThreshold(failureThreshold: Number) {
    cdkBuilder.failureThreshold(failureThreshold)
  }

  public fun build(): CfnService.HealthCheckCustomConfigProperty = cdkBuilder.build()
}
