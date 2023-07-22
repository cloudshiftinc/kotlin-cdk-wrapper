@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigAntennaDownlinkConfigPropertyDsl {
  private val cdkBuilder: CfnConfig.AntennaDownlinkConfigProperty.Builder =
      CfnConfig.AntennaDownlinkConfigProperty.builder()

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

  public fun build(): CfnConfig.AntennaDownlinkConfigProperty = cdkBuilder.build()
}
