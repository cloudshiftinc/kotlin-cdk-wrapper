@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@CdkDslMarker
public class CfnApplicationAlarmMetricPropertyDsl {
  private val cdkBuilder: CfnApplication.AlarmMetricProperty.Builder =
      CfnApplication.AlarmMetricProperty.builder()

  public fun alarmMetricName(alarmMetricName: String) {
    cdkBuilder.alarmMetricName(alarmMetricName)
  }

  public fun build(): CfnApplication.AlarmMetricProperty = cdkBuilder.build()
}
