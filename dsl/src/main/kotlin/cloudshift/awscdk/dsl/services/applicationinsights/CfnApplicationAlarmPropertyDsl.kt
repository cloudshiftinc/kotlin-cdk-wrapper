@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@CdkDslMarker
public class CfnApplicationAlarmPropertyDsl {
  private val cdkBuilder: CfnApplication.AlarmProperty.Builder =
      CfnApplication.AlarmProperty.builder()

  public fun alarmName(alarmName: String) {
    cdkBuilder.alarmName(alarmName)
  }

  public fun severity(severity: String) {
    cdkBuilder.severity(severity)
  }

  public fun build(): CfnApplication.AlarmProperty = cdkBuilder.build()
}
