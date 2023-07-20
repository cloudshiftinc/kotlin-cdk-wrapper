@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigAntennaUplinkConfigPropertyDsl {
  private val cdkBuilder: CfnConfig.AntennaUplinkConfigProperty.Builder =
      CfnConfig.AntennaUplinkConfigProperty.builder()

  public fun spectrumConfig(spectrumConfig: IResolvable) {
    cdkBuilder.spectrumConfig(spectrumConfig)
  }

  public fun spectrumConfig(spectrumConfig: CfnConfig.UplinkSpectrumConfigProperty) {
    cdkBuilder.spectrumConfig(spectrumConfig)
  }

  public fun targetEirp(targetEirp: IResolvable) {
    cdkBuilder.targetEirp(targetEirp)
  }

  public fun targetEirp(targetEirp: CfnConfig.EirpProperty) {
    cdkBuilder.targetEirp(targetEirp)
  }

  public fun transmitDisabled(transmitDisabled: Boolean) {
    cdkBuilder.transmitDisabled(transmitDisabled)
  }

  public fun transmitDisabled(transmitDisabled: IResolvable) {
    cdkBuilder.transmitDisabled(transmitDisabled)
  }

  public fun build(): CfnConfig.AntennaUplinkConfigProperty = cdkBuilder.build()
}
