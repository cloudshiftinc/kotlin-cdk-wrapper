@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigAntennaDownlinkDemodDecodeConfigPropertyDsl {
  private val cdkBuilder: CfnConfig.AntennaDownlinkDemodDecodeConfigProperty.Builder =
      CfnConfig.AntennaDownlinkDemodDecodeConfigProperty.builder()

  public fun decodeConfig(decodeConfig: IResolvable) {
    cdkBuilder.decodeConfig(decodeConfig)
  }

  public fun decodeConfig(decodeConfig: CfnConfig.DecodeConfigProperty) {
    cdkBuilder.decodeConfig(decodeConfig)
  }

  public fun demodulationConfig(demodulationConfig: IResolvable) {
    cdkBuilder.demodulationConfig(demodulationConfig)
  }

  public fun demodulationConfig(demodulationConfig: CfnConfig.DemodulationConfigProperty) {
    cdkBuilder.demodulationConfig(demodulationConfig)
  }

  public fun spectrumConfig(spectrumConfig: IResolvable) {
    cdkBuilder.spectrumConfig(spectrumConfig)
  }

  public fun spectrumConfig(spectrumConfig: CfnConfig.SpectrumConfigProperty) {
    cdkBuilder.spectrumConfig(spectrumConfig)
  }

  public fun build(): CfnConfig.AntennaDownlinkDemodDecodeConfigProperty = cdkBuilder.build()
}
