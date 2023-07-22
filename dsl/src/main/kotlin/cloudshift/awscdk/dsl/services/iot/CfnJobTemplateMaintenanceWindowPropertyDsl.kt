@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iot.CfnJobTemplate

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
