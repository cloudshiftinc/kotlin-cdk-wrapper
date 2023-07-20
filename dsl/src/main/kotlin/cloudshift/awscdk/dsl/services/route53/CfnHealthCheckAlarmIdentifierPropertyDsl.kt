@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnHealthCheck

@CdkDslMarker
public class CfnHealthCheckAlarmIdentifierPropertyDsl {
  private val cdkBuilder: CfnHealthCheck.AlarmIdentifierProperty.Builder =
      CfnHealthCheck.AlarmIdentifierProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): CfnHealthCheck.AlarmIdentifierProperty = cdkBuilder.build()
}
