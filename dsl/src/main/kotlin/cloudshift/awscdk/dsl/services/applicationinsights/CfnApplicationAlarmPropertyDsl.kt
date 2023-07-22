@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@CdkDslMarker
public class CfnApplicationAlarmPropertyDsl {
  private val cdkBuilder: CfnApplication.AlarmProperty.Builder =
      CfnApplication.AlarmProperty.builder()

  /**
   * @param alarmName The name of the CloudWatch alarm to be monitored for the component. 
   */
  public fun alarmName(alarmName: String) {
    cdkBuilder.alarmName(alarmName)
  }

  /**
   * @param severity Indicates the degree of outage when the alarm goes off.
   */
  public fun severity(severity: String) {
    cdkBuilder.severity(severity)
  }

  public fun build(): CfnApplication.AlarmProperty = cdkBuilder.build()
}
