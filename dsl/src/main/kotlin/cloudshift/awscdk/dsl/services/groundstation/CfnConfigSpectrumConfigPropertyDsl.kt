@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigSpectrumConfigPropertyDsl {
  private val cdkBuilder: CfnConfig.SpectrumConfigProperty.Builder =
      CfnConfig.SpectrumConfigProperty.builder()

  public fun bandwidth(bandwidth: IResolvable) {
    cdkBuilder.bandwidth(bandwidth)
  }

  public fun bandwidth(bandwidth: CfnConfig.FrequencyBandwidthProperty) {
    cdkBuilder.bandwidth(bandwidth)
  }

  public fun centerFrequency(centerFrequency: IResolvable) {
    cdkBuilder.centerFrequency(centerFrequency)
  }

  public fun centerFrequency(centerFrequency: CfnConfig.FrequencyProperty) {
    cdkBuilder.centerFrequency(centerFrequency)
  }

  public fun polarization(polarization: String) {
    cdkBuilder.polarization(polarization)
  }

  public fun build(): CfnConfig.SpectrumConfigProperty = cdkBuilder.build()
}
