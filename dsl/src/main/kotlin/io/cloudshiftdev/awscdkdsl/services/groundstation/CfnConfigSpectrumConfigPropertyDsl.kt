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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnConfig

/**
 * Defines a spectrum.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * SpectrumConfigProperty spectrumConfigProperty = SpectrumConfigProperty.builder()
 * .bandwidth(FrequencyBandwidthProperty.builder()
 * .units("units")
 * .value(123)
 * .build())
 * .centerFrequency(FrequencyProperty.builder()
 * .units("units")
 * .value(123)
 * .build())
 * .polarization("polarization")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-spectrumconfig.html)
 */
@CdkDslMarker
public class CfnConfigSpectrumConfigPropertyDsl {
    private val cdkBuilder: CfnConfig.SpectrumConfigProperty.Builder =
        CfnConfig.SpectrumConfigProperty.builder()

    /**
     * @param bandwidth The bandwidth of the spectrum. AWS Ground Station currently has the
     *   following bandwidth limitations:.
     * * For `AntennaDownlinkDemodDecodeconfig` , valid values are between 125 kHz to 650 MHz.
     * * For `AntennaDownlinkconfig` , valid values are between 10 kHz to 54 MHz.
     * * For `AntennaUplinkConfig` , valid values are between 10 kHz to 54 MHz.
     */
    public fun bandwidth(bandwidth: IResolvable) {
        cdkBuilder.bandwidth(bandwidth)
    }

    /**
     * @param bandwidth The bandwidth of the spectrum. AWS Ground Station currently has the
     *   following bandwidth limitations:.
     * * For `AntennaDownlinkDemodDecodeconfig` , valid values are between 125 kHz to 650 MHz.
     * * For `AntennaDownlinkconfig` , valid values are between 10 kHz to 54 MHz.
     * * For `AntennaUplinkConfig` , valid values are between 10 kHz to 54 MHz.
     */
    public fun bandwidth(bandwidth: CfnConfig.FrequencyBandwidthProperty) {
        cdkBuilder.bandwidth(bandwidth)
    }

    /**
     * @param centerFrequency The center frequency of the spectrum. Valid values are between 2200 to
     *   2300 MHz and 7750 to 8400 MHz for downlink and 2025 to 2120 MHz for uplink.
     */
    public fun centerFrequency(centerFrequency: IResolvable) {
        cdkBuilder.centerFrequency(centerFrequency)
    }

    /**
     * @param centerFrequency The center frequency of the spectrum. Valid values are between 2200 to
     *   2300 MHz and 7750 to 8400 MHz for downlink and 2025 to 2120 MHz for uplink.
     */
    public fun centerFrequency(centerFrequency: CfnConfig.FrequencyProperty) {
        cdkBuilder.centerFrequency(centerFrequency)
    }

    /**
     * @param polarization The polarization of the spectrum. Valid values are `"RIGHT_HAND"` and
     *   `"LEFT_HAND"` . Capturing both `"RIGHT_HAND"` and `"LEFT_HAND"` polarization requires two
     *   separate configs.
     */
    public fun polarization(polarization: String) {
        cdkBuilder.polarization(polarization)
    }

    public fun build(): CfnConfig.SpectrumConfigProperty = cdkBuilder.build()
}
