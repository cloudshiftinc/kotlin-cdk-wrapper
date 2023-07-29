@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnConfig

/**
 * Provides information about how AWS Ground Station should configure an antenna for downlink during
 * a contact.
 *
 * Use an antenna downlink config in a mission profile to receive the downlink data in raw DigIF
 * format.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * AntennaDownlinkConfigProperty antennaDownlinkConfigProperty =
 * AntennaDownlinkConfigProperty.builder()
 * .spectrumConfig(SpectrumConfigProperty.builder()
 * .bandwidth(FrequencyBandwidthProperty.builder()
 * .units("units")
 * .value(123)
 * .build())
 * .centerFrequency(FrequencyProperty.builder()
 * .units("units")
 * .value(123)
 * .build())
 * .polarization("polarization")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennadownlinkconfig.html)
 */
@CdkDslMarker
public class CfnConfigAntennaDownlinkConfigPropertyDsl {
    private val cdkBuilder: CfnConfig.AntennaDownlinkConfigProperty.Builder =
        CfnConfig.AntennaDownlinkConfigProperty.builder()

    /** @param spectrumConfig Defines the spectrum configuration. */
    public fun spectrumConfig(spectrumConfig: IResolvable) {
        cdkBuilder.spectrumConfig(spectrumConfig)
    }

    /** @param spectrumConfig Defines the spectrum configuration. */
    public fun spectrumConfig(spectrumConfig: CfnConfig.SpectrumConfigProperty) {
        cdkBuilder.spectrumConfig(spectrumConfig)
    }

    public fun build(): CfnConfig.AntennaDownlinkConfigProperty = cdkBuilder.build()
}
