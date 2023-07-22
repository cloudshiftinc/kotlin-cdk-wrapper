@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnConfig

/**
 * Provides information about how AWS Ground Station should configure an antenna for uplink during a
 * contact.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * AntennaUplinkConfigProperty antennaUplinkConfigProperty = AntennaUplinkConfigProperty.builder()
 * .spectrumConfig(UplinkSpectrumConfigProperty.builder()
 * .centerFrequency(FrequencyProperty.builder()
 * .units("units")
 * .value(123)
 * .build())
 * .polarization("polarization")
 * .build())
 * .targetEirp(EirpProperty.builder()
 * .units("units")
 * .value(123)
 * .build())
 * .transmitDisabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennauplinkconfig.html)
 */
@CdkDslMarker
public class CfnConfigAntennaUplinkConfigPropertyDsl {
  private val cdkBuilder: CfnConfig.AntennaUplinkConfigProperty.Builder =
      CfnConfig.AntennaUplinkConfigProperty.builder()

  /**
   * @param spectrumConfig Defines the spectrum configuration.
   */
  public fun spectrumConfig(spectrumConfig: IResolvable) {
    cdkBuilder.spectrumConfig(spectrumConfig)
  }

  /**
   * @param spectrumConfig Defines the spectrum configuration.
   */
  public fun spectrumConfig(spectrumConfig: CfnConfig.UplinkSpectrumConfigProperty) {
    cdkBuilder.spectrumConfig(spectrumConfig)
  }

  /**
   * @param targetEirp The equivalent isotropically radiated power (EIRP) to use for uplink
   * transmissions.
   * Valid values are between 20.0 to 50.0 dBW.
   */
  public fun targetEirp(targetEirp: IResolvable) {
    cdkBuilder.targetEirp(targetEirp)
  }

  /**
   * @param targetEirp The equivalent isotropically radiated power (EIRP) to use for uplink
   * transmissions.
   * Valid values are between 20.0 to 50.0 dBW.
   */
  public fun targetEirp(targetEirp: CfnConfig.EirpProperty) {
    cdkBuilder.targetEirp(targetEirp)
  }

  /**
   * @param transmitDisabled Whether or not uplink transmit is disabled.
   */
  public fun transmitDisabled(transmitDisabled: Boolean) {
    cdkBuilder.transmitDisabled(transmitDisabled)
  }

  /**
   * @param transmitDisabled Whether or not uplink transmit is disabled.
   */
  public fun transmitDisabled(transmitDisabled: IResolvable) {
    cdkBuilder.transmitDisabled(transmitDisabled)
  }

  public fun build(): CfnConfig.AntennaUplinkConfigProperty = cdkBuilder.build()
}
