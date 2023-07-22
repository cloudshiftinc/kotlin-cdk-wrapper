@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * Describes configuration parameters for Amazon CloudWatch logging for a Kinesis Data Analytics
 * Studio notebook.
 *
 * For more information about CloudWatch logging, see
 * [Monitoring](https://docs.aws.amazon.com/kinesisanalytics/latest/java/monitoring-overview.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * ZeppelinMonitoringConfigurationProperty zeppelinMonitoringConfigurationProperty =
 * ZeppelinMonitoringConfigurationProperty.builder()
 * .logLevel("logLevel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinmonitoringconfiguration.html)
 */
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
