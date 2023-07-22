@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnConfig

/**
 * Defines a frequency.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * FrequencyProperty frequencyProperty = FrequencyProperty.builder()
 * .units("units")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-frequency.html)
 */
@CdkDslMarker
public class CfnConfigFrequencyPropertyDsl {
  private val cdkBuilder: CfnConfig.FrequencyProperty.Builder =
      CfnConfig.FrequencyProperty.builder()

  /**
   * @param units The units of the frequency.
   */
  public fun units(units: String) {
    cdkBuilder.units(units)
  }

  /**
   * @param value The value of the frequency.
   * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to 2120
   * MHz for uplink.
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnConfig.FrequencyProperty = cdkBuilder.build()
}
