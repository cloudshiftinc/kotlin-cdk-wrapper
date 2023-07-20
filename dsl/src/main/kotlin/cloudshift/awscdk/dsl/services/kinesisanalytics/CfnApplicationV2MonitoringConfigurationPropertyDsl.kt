@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2MonitoringConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.MonitoringConfigurationProperty.Builder =
      CfnApplicationV2.MonitoringConfigurationProperty.builder()

  public fun configurationType(configurationType: String) {
    cdkBuilder.configurationType(configurationType)
  }

  public fun logLevel(logLevel: String) {
    cdkBuilder.logLevel(logLevel)
  }

  public fun metricsLevel(metricsLevel: String) {
    cdkBuilder.metricsLevel(metricsLevel)
  }

  public fun build(): CfnApplicationV2.MonitoringConfigurationProperty = cdkBuilder.build()
}
