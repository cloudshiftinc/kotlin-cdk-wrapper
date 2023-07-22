@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigUplinkSpectrumConfigPropertyDsl {
  private val cdkBuilder: CfnConfig.UplinkSpectrumConfigProperty.Builder =
      CfnConfig.UplinkSpectrumConfigProperty.builder()

  /**
   * @param centerFrequency The center frequency of the spectrum.
   * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to 2120
   * MHz for uplink.
   */
  public fun centerFrequency(centerFrequency: IResolvable) {
    cdkBuilder.centerFrequency(centerFrequency)
  }

  /**
   * @param centerFrequency The center frequency of the spectrum.
   * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to 2120
   * MHz for uplink.
   */
  public fun centerFrequency(centerFrequency: CfnConfig.FrequencyProperty) {
    cdkBuilder.centerFrequency(centerFrequency)
  }

  /**
   * @param polarization The polarization of the spectrum.
   * Valid values are `"RIGHT_HAND"` and `"LEFT_HAND"` .
   */
  public fun polarization(polarization: String) {
    cdkBuilder.polarization(polarization)
  }

  public fun build(): CfnConfig.UplinkSpectrumConfigProperty = cdkBuilder.build()
}
