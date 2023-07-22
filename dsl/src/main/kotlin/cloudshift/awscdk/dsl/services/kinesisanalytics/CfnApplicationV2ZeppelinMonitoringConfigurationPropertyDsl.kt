@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2ZeppelinMonitoringConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.ZeppelinMonitoringConfigurationProperty.Builder =
      CfnApplicationV2.ZeppelinMonitoringConfigurationProperty.builder()

  /**
   * @param logLevel The verbosity of the CloudWatch Logs for an application.
   * You can set it to `INFO` , `WARN` , `ERROR` , or `DEBUG` .
   */
  public fun logLevel(logLevel: String) {
    cdkBuilder.logLevel(logLevel)
  }

  public fun build(): CfnApplicationV2.ZeppelinMonitoringConfigurationProperty = cdkBuilder.build()
}
