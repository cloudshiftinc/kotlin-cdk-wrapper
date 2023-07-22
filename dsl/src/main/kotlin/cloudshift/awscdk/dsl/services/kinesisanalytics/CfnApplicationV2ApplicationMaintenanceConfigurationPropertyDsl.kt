@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2ApplicationMaintenanceConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.ApplicationMaintenanceConfigurationProperty.Builder =
      CfnApplicationV2.ApplicationMaintenanceConfigurationProperty.builder()

  /**
   * @param applicationMaintenanceWindowStartTime Specifies the start time of the maintence window. 
   */
  public fun applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime: String) {
    cdkBuilder.applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime)
  }

  public fun build(): CfnApplicationV2.ApplicationMaintenanceConfigurationProperty =
      cdkBuilder.build()
}
