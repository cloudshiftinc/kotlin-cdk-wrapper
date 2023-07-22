@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationApplicationMaintenanceConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.ApplicationMaintenanceConfigurationProperty.Builder =
      CfnApplication.ApplicationMaintenanceConfigurationProperty.builder()

  /**
   * @param applicationMaintenanceWindowStartTime Specifies the start time of the maintence window. 
   */
  public fun applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime: String) {
    cdkBuilder.applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime)
  }

  public fun build(): CfnApplication.ApplicationMaintenanceConfigurationProperty =
      cdkBuilder.build()
}
