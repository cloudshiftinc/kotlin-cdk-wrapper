@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@CdkDslMarker
public class CfnMonitoringScheduleScheduleConfigPropertyDsl {
  private val cdkBuilder: CfnMonitoringSchedule.ScheduleConfigProperty.Builder =
      CfnMonitoringSchedule.ScheduleConfigProperty.builder()

  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  public fun build(): CfnMonitoringSchedule.ScheduleConfigProperty = cdkBuilder.build()
}
