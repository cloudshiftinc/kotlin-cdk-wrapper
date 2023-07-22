@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iot.CfnJobTemplate

/**
 * An optional configuration within the `SchedulingConfig` to setup a recurring maintenance window
 * with a predetermined start time and duration for the rollout of a job document to all devices in a
 * target group for a job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * MaintenanceWindowProperty maintenanceWindowProperty = MaintenanceWindowProperty.builder()
 * .durationInMinutes(123)
 * .startTime("startTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-maintenancewindow.html)
 */
@CdkDslMarker
public class CfnJobTemplateMaintenanceWindowPropertyDsl {
  private val cdkBuilder: CfnJobTemplate.MaintenanceWindowProperty.Builder =
      CfnJobTemplate.MaintenanceWindowProperty.builder()

  /**
   * @param durationInMinutes Displays the duration of the next maintenance window.
   */
  public fun durationInMinutes(durationInMinutes: Number) {
    cdkBuilder.durationInMinutes(durationInMinutes)
  }

  /**
   * @param startTime Displays the start time of the next maintenance window.
   */
  public fun startTime(startTime: String) {
    cdkBuilder.startTime(startTime)
  }

  public fun build(): CfnJobTemplate.MaintenanceWindowProperty = cdkBuilder.build()
}
