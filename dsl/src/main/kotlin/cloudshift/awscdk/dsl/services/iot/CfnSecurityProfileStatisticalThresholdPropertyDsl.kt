@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnSecurityProfile

/**
 * A statistical ranking (percentile) that indicates a threshold value by which a behavior is
 * determined to be in compliance or in violation of the behavior.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * StatisticalThresholdProperty statisticalThresholdProperty =
 * StatisticalThresholdProperty.builder()
 * .statistic("statistic")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-statisticalthreshold.html)
 */
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
