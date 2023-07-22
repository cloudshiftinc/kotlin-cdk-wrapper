@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * Specifies the maintence window parameters for a Kinesis Data Analytics application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * ApplicationMaintenanceConfigurationProperty applicationMaintenanceConfigurationProperty =
 * ApplicationMaintenanceConfigurationProperty.builder()
 * .applicationMaintenanceWindowStartTime("applicationMaintenanceWindowStartTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationmaintenanceconfiguration.html)
 */
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
