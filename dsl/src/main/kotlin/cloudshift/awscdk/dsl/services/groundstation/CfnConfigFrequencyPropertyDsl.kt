@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnConfig

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
