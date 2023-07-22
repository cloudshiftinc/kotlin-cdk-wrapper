@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelMaintenanceUpdateSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.MaintenanceUpdateSettingsProperty.Builder =
      CfnChannel.MaintenanceUpdateSettingsProperty.builder()

  /**
   * @param maintenanceDay the value to be set.
   */
  public fun maintenanceDay(maintenanceDay: String) {
    cdkBuilder.maintenanceDay(maintenanceDay)
  }

  /**
   * @param maintenanceScheduledDate the value to be set.
   */
  public fun maintenanceScheduledDate(maintenanceScheduledDate: String) {
    cdkBuilder.maintenanceScheduledDate(maintenanceScheduledDate)
  }

  /**
   * @param maintenanceStartTime the value to be set.
   */
  public fun maintenanceStartTime(maintenanceStartTime: String) {
    cdkBuilder.maintenanceStartTime(maintenanceStartTime)
  }

  public fun build(): CfnChannel.MaintenanceUpdateSettingsProperty = cdkBuilder.build()
}
