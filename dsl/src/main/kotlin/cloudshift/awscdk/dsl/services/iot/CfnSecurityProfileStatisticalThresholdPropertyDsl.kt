@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnSecurityProfile

@CdkDslMarker
public class CfnSecurityProfileStatisticalThresholdPropertyDsl {
  private val cdkBuilder: CfnSecurityProfile.StatisticalThresholdProperty.Builder =
      CfnSecurityProfile.StatisticalThresholdProperty.builder()

  /**
   * @param statistic The percentile that resolves to a threshold value by which compliance with a
   * behavior is determined.
   * Metrics are collected over the specified period ( `durationSeconds` ) from all reporting
   * devices in your account and statistical ranks are calculated. Then, the measurements from a device
   * are collected over the same period. If the accumulated measurements from the device fall above or
   * below ( `comparisonOperator` ) the value associated with the percentile specified, then the device
   * is considered to be in compliance with the behavior, otherwise a violation occurs.
   */
  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  public fun build(): CfnSecurityProfile.StatisticalThresholdProperty = cdkBuilder.build()
}
