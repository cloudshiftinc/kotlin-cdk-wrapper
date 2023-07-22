@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationMonitoringConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.MonitoringConfigurationProperty.Builder =
      CfnApplication.MonitoringConfigurationProperty.builder()

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

  public fun build(): CfnApplication.MonitoringConfigurationProperty = cdkBuilder.build()
}
