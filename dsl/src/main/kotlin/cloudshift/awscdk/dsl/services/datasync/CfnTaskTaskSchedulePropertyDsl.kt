@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnTask

/**
 * Specifies the schedule you want your task to use for repeated executions.
 *
 * For more information, see [Schedule Expressions for
 * Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * TaskScheduleProperty taskScheduleProperty = TaskScheduleProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskschedule.html)
 */
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
