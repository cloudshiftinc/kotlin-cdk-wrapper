@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigFrequencyBandwidthPropertyDsl {
  private val cdkBuilder: CfnConfig.FrequencyBandwidthProperty.Builder =
      CfnConfig.FrequencyBandwidthProperty.builder()

  /**
   * @param units The units of the bandwidth.
   */
  public fun units(units: String) {
    cdkBuilder.units(units)
  }

  /**
   * @param value The value of the bandwidth. AWS Ground Station currently has the following
   * bandwidth limitations:.
   * * For `AntennaDownlinkDemodDecodeconfig` , valid values are between 125 kHz to 650 MHz.
   * * For `AntennaDownlinkconfig` , valid values are between 10 kHz to 54 MHz.
   * * For `AntennaUplinkConfig` , valid values are between 10 kHz to 54 MHz.
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnConfig.FrequencyBandwidthProperty = cdkBuilder.build()
}
