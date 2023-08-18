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

package io.cloudshiftdev.awscdkdsl.services.groundstation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnConfig

/**
 * Provides information about how AWS Ground Station should configure an antenna for downlink during
 * a contact.
 *
 * Use an antenna downlink demod decode config in a mission profile to receive the downlink data
 * that has been demodulated and decoded.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * AntennaDownlinkDemodDecodeConfigProperty antennaDownlinkDemodDecodeConfigProperty =
 * AntennaDownlinkDemodDecodeConfigProperty.builder()
 * .decodeConfig(DecodeConfigProperty.builder()
 * .unvalidatedJson("unvalidatedJson")
 * .build())
 * .demodulationConfig(DemodulationConfigProperty.builder()
 * .unvalidatedJson("unvalidatedJson")
 * .build())
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennadownlinkdemoddecodeconfig.html)
 */
@CdkDslMarker
public class CfnConfigAntennaDownlinkDemodDecodeConfigPropertyDsl {
    private val cdkBuilder: CfnConfig.AntennaDownlinkDemodDecodeConfigProperty.Builder =
        CfnConfig.AntennaDownlinkDemodDecodeConfigProperty.builder()

    /** @param decodeConfig Defines how the RF signal will be decoded. */
    public fun decodeConfig(decodeConfig: IResolvable) {
        cdkBuilder.decodeConfig(decodeConfig)
    }

    /** @param decodeConfig Defines how the RF signal will be decoded. */
    public fun decodeConfig(decodeConfig: CfnConfig.DecodeConfigProperty) {
        cdkBuilder.decodeConfig(decodeConfig)
    }

    /** @param demodulationConfig Defines how the RF signal will be demodulated. */
    public fun demodulationConfig(demodulationConfig: IResolvable) {
        cdkBuilder.demodulationConfig(demodulationConfig)
    }

    /** @param demodulationConfig Defines how the RF signal will be demodulated. */
    public fun demodulationConfig(demodulationConfig: CfnConfig.DemodulationConfigProperty) {
        cdkBuilder.demodulationConfig(demodulationConfig)
    }

    /** @param spectrumConfig Defines the spectrum configuration. */
    public fun spectrumConfig(spectrumConfig: IResolvable) {
        cdkBuilder.spectrumConfig(spectrumConfig)
    }

    /** @param spectrumConfig Defines the spectrum configuration. */
    public fun spectrumConfig(spectrumConfig: CfnConfig.SpectrumConfigProperty) {
        cdkBuilder.spectrumConfig(spectrumConfig)
    }

    public fun build(): CfnConfig.AntennaDownlinkDemodDecodeConfigProperty = cdkBuilder.build()
}
