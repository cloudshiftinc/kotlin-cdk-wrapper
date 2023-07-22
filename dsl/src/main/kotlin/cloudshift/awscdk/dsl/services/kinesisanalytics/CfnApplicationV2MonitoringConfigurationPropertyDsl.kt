@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * Describes configuration parameters for Amazon CloudWatch logging for a Java-based Kinesis Data
 * Analytics application.
 *
 * For more information about CloudWatch logging, see
 * [Monitoring](https://docs.aws.amazon.com/kinesisanalytics/latest/java/monitoring-overview) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * MonitoringConfigurationProperty monitoringConfigurationProperty =
 * MonitoringConfigurationProperty.builder()
 * .configurationType("configurationType")
 * // the properties below are optional
 * .logLevel("logLevel")
 * .metricsLevel("metricsLevel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationV2MonitoringConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.MonitoringConfigurationProperty.Builder =
      CfnApplicationV2.MonitoringConfigurationProperty.builder()

  /**
   * @param configurationType Describes whether to use the default CloudWatch logging configuration
   * for an application. 
   * You must set this property to `CUSTOM` in order to set the `LogLevel` or `MetricsLevel`
   * parameters.
   */
  public fun configurationType(configurationType: String) {
    cdkBuilder.configurationType(configurationType)
  }

  /**
   * @param logLevel Describes the verbosity of the CloudWatch Logs for an application.
   */
  public fun logLevel(logLevel: String) {
    cdkBuilder.logLevel(logLevel)
  }

  /**
   * @param metricsLevel Describes the granularity of the CloudWatch Logs for an application.
   * The `Parallelism` level is not recommended for applications with a Parallelism over 64 due to
   * excessive costs.
   */
  public fun metricsLevel(metricsLevel: String) {
    cdkBuilder.metricsLevel(metricsLevel)
  }

  public fun build(): CfnApplicationV2.MonitoringConfigurationProperty = cdkBuilder.build()
}
