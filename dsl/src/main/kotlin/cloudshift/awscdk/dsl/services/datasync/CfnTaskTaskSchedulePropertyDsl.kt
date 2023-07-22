@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnTask

@CdkDslMarker
public class CfnTaskTaskSchedulePropertyDsl {
  private val cdkBuilder: CfnTask.TaskScheduleProperty.Builder =
      CfnTask.TaskScheduleProperty.builder()

  /**
   * @param scheduleExpression A cron expression that specifies when AWS DataSync initiates a
   * scheduled transfer from a source to a destination location. 
   */
  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  public fun build(): CfnTask.TaskScheduleProperty = cdkBuilder.build()
}
