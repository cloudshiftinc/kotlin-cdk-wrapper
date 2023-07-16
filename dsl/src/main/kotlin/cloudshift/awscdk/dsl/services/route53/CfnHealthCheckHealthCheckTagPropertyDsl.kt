@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnHealthCheck

@CdkDslMarker
public class CfnHealthCheckHealthCheckTagPropertyDsl {
  private val cdkBuilder: CfnHealthCheck.HealthCheckTagProperty.Builder =
      CfnHealthCheck.HealthCheckTagProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnHealthCheck.HealthCheckTagProperty = cdkBuilder.build()
}
