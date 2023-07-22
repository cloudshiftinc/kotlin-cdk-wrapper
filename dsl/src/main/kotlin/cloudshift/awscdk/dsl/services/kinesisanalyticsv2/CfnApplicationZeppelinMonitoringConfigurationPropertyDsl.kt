@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationZeppelinMonitoringConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.ZeppelinMonitoringConfigurationProperty.Builder =
      CfnApplication.ZeppelinMonitoringConfigurationProperty.builder()

  /**
   * @param logLevel The verbosity of the CloudWatch Logs for an application.
   * You can set it to `INFO` , `WARN` , `ERROR` , or `DEBUG` .
   */
  public fun logLevel(logLevel: String) {
    cdkBuilder.logLevel(logLevel)
  }

  public fun build(): CfnApplication.ZeppelinMonitoringConfigurationProperty = cdkBuilder.build()
}
