@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigAntennaDownlinkDemodDecodeConfigPropertyDsl {
  private val cdkBuilder: CfnConfig.AntennaDownlinkDemodDecodeConfigProperty.Builder =
      CfnConfig.AntennaDownlinkDemodDecodeConfigProperty.builder()

  /**
   * @param decodeConfig Defines how the RF signal will be decoded.
   */
  public fun decodeConfig(decodeConfig: IResolvable) {
    cdkBuilder.decodeConfig(decodeConfig)
  }

  /**
   * @param decodeConfig Defines how the RF signal will be decoded.
   */
  public fun decodeConfig(decodeConfig: CfnConfig.DecodeConfigProperty) {
    cdkBuilder.decodeConfig(decodeConfig)
  }

  /**
   * @param demodulationConfig Defines how the RF signal will be demodulated.
   */
  public fun demodulationConfig(demodulationConfig: IResolvable) {
    cdkBuilder.demodulationConfig(demodulationConfig)
  }

  /**
   * @param demodulationConfig Defines how the RF signal will be demodulated.
   */
  public fun demodulationConfig(demodulationConfig: CfnConfig.DemodulationConfigProperty) {
    cdkBuilder.demodulationConfig(demodulationConfig)
  }

  /**
   * @param spectrumConfig Defines the spectrum configuration.
   */
  public fun spectrumConfig(spectrumConfig: IResolvable) {
    cdkBuilder.spectrumConfig(spectrumConfig)
  }

  /**
   * @param spectrumConfig Defines the spectrum configuration.
   */
  public fun spectrumConfig(spectrumConfig: CfnConfig.SpectrumConfigProperty) {
    cdkBuilder.spectrumConfig(spectrumConfig)
  }

  public fun build(): CfnConfig.AntennaDownlinkDemodDecodeConfigProperty = cdkBuilder.build()
}
