@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

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
