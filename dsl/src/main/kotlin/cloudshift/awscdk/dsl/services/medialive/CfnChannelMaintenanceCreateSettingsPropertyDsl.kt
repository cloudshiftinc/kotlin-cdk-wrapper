@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelMaintenanceCreateSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.MaintenanceCreateSettingsProperty.Builder =
      CfnChannel.MaintenanceCreateSettingsProperty.builder()

  /**
   * @param maintenanceDay the value to be set.
   */
  public fun maintenanceDay(maintenanceDay: String) {
    cdkBuilder.maintenanceDay(maintenanceDay)
  }

  /**
   * @param maintenanceStartTime the value to be set.
   */
  public fun maintenanceStartTime(maintenanceStartTime: String) {
    cdkBuilder.maintenanceStartTime(maintenanceStartTime)
  }

  public fun build(): CfnChannel.MaintenanceCreateSettingsProperty = cdkBuilder.build()
}
