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
 * Config objects provide information to Ground Station about how to configure the antenna and how
 * data flows during a contact.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * ConfigDataProperty configDataProperty = ConfigDataProperty.builder()
 * .antennaDownlinkConfig(AntennaDownlinkConfigProperty.builder()
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
 * .build())
 * .antennaDownlinkDemodDecodeConfig(AntennaDownlinkDemodDecodeConfigProperty.builder()
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
 * .build())
 * .antennaUplinkConfig(AntennaUplinkConfigProperty.builder()
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
 * .build())
 * .dataflowEndpointConfig(DataflowEndpointConfigProperty.builder()
 * .dataflowEndpointName("dataflowEndpointName")
 * .dataflowEndpointRegion("dataflowEndpointRegion")
 * .build())
 * .s3RecordingConfig(S3RecordingConfigProperty.builder()
 * .bucketArn("bucketArn")
 * .prefix("prefix")
 * .roleArn("roleArn")
 * .build())
 * .trackingConfig(TrackingConfigProperty.builder()
 * .autotrack("autotrack")
 * .build())
 * .uplinkEchoConfig(UplinkEchoConfigProperty.builder()
 * .antennaUplinkConfigArn("antennaUplinkConfigArn")
 * .enabled(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html)
 */
@CdkDslMarker
public class CfnConfigConfigDataPropertyDsl {
    private val cdkBuilder: CfnConfig.ConfigDataProperty.Builder =
        CfnConfig.ConfigDataProperty.builder()

    /**
     * @param antennaDownlinkConfig Provides information for an antenna downlink config object.
     *   Antenna downlink config objects are used to provide parameters for downlinks where no
     *   demodulation or decoding is performed by Ground Station (RF over IP downlinks).
     */
    public fun antennaDownlinkConfig(antennaDownlinkConfig: IResolvable) {
        cdkBuilder.antennaDownlinkConfig(antennaDownlinkConfig)
    }

    /**
     * @param antennaDownlinkConfig Provides information for an antenna downlink config object.
     *   Antenna downlink config objects are used to provide parameters for downlinks where no
     *   demodulation or decoding is performed by Ground Station (RF over IP downlinks).
     */
    public fun antennaDownlinkConfig(
        antennaDownlinkConfig: CfnConfig.AntennaDownlinkConfigProperty
    ) {
        cdkBuilder.antennaDownlinkConfig(antennaDownlinkConfig)
    }

    /**
     * @param antennaDownlinkDemodDecodeConfig Provides information for a downlink demod decode
     *   config object. Downlink demod decode config objects are used to provide parameters for
     *   downlinks where the Ground Station service will demodulate and decode the downlinked data.
     */
    public fun antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig: IResolvable) {
        cdkBuilder.antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig)
    }

    /**
     * @param antennaDownlinkDemodDecodeConfig Provides information for a downlink demod decode
     *   config object. Downlink demod decode config objects are used to provide parameters for
     *   downlinks where the Ground Station service will demodulate and decode the downlinked data.
     */
    public fun antennaDownlinkDemodDecodeConfig(
        antennaDownlinkDemodDecodeConfig: CfnConfig.AntennaDownlinkDemodDecodeConfigProperty
    ) {
        cdkBuilder.antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig)
    }

    /**
     * @param antennaUplinkConfig Provides information for an uplink config object. Uplink config
     *   objects are used to provide parameters for uplink contacts.
     */
    public fun antennaUplinkConfig(antennaUplinkConfig: IResolvable) {
        cdkBuilder.antennaUplinkConfig(antennaUplinkConfig)
    }

    /**
     * @param antennaUplinkConfig Provides information for an uplink config object. Uplink config
     *   objects are used to provide parameters for uplink contacts.
     */
    public fun antennaUplinkConfig(antennaUplinkConfig: CfnConfig.AntennaUplinkConfigProperty) {
        cdkBuilder.antennaUplinkConfig(antennaUplinkConfig)
    }

    /**
     * @param dataflowEndpointConfig Provides information for a dataflow endpoint config object.
     *   Dataflow endpoint config objects are used to provide parameters about which IP endpoint(s)
     *   to use during a contact. Dataflow endpoints are where Ground Station sends data during a
     *   downlink contact and where Ground Station receives data to send to the satellite during an
     *   uplink contact.
     */
    public fun dataflowEndpointConfig(dataflowEndpointConfig: IResolvable) {
        cdkBuilder.dataflowEndpointConfig(dataflowEndpointConfig)
    }

    /**
     * @param dataflowEndpointConfig Provides information for a dataflow endpoint config object.
     *   Dataflow endpoint config objects are used to provide parameters about which IP endpoint(s)
     *   to use during a contact. Dataflow endpoints are where Ground Station sends data during a
     *   downlink contact and where Ground Station receives data to send to the satellite during an
     *   uplink contact.
     */
    public fun dataflowEndpointConfig(
        dataflowEndpointConfig: CfnConfig.DataflowEndpointConfigProperty
    ) {
        cdkBuilder.dataflowEndpointConfig(dataflowEndpointConfig)
    }

    /**
     * @param s3RecordingConfig Provides information for an S3 recording config object. S3 recording
     *   config objects are used to provide parameters for S3 recording during downlink contacts.
     */
    public fun s3RecordingConfig(s3RecordingConfig: IResolvable) {
        cdkBuilder.s3RecordingConfig(s3RecordingConfig)
    }

    /**
     * @param s3RecordingConfig Provides information for an S3 recording config object. S3 recording
     *   config objects are used to provide parameters for S3 recording during downlink contacts.
     */
    public fun s3RecordingConfig(s3RecordingConfig: CfnConfig.S3RecordingConfigProperty) {
        cdkBuilder.s3RecordingConfig(s3RecordingConfig)
    }

    /**
     * @param trackingConfig Provides information for a tracking config object. Tracking config
     *   objects are used to provide parameters about how to track the satellite through the sky
     *   during a contact.
     */
    public fun trackingConfig(trackingConfig: IResolvable) {
        cdkBuilder.trackingConfig(trackingConfig)
    }

    /**
     * @param trackingConfig Provides information for a tracking config object. Tracking config
     *   objects are used to provide parameters about how to track the satellite through the sky
     *   during a contact.
     */
    public fun trackingConfig(trackingConfig: CfnConfig.TrackingConfigProperty) {
        cdkBuilder.trackingConfig(trackingConfig)
    }

    /**
     * @param uplinkEchoConfig Provides information for an uplink echo config object. Uplink echo
     *   config objects are used to provide parameters for uplink echo during uplink contacts.
     */
    public fun uplinkEchoConfig(uplinkEchoConfig: IResolvable) {
        cdkBuilder.uplinkEchoConfig(uplinkEchoConfig)
    }

    /**
     * @param uplinkEchoConfig Provides information for an uplink echo config object. Uplink echo
     *   config objects are used to provide parameters for uplink echo during uplink contacts.
     */
    public fun uplinkEchoConfig(uplinkEchoConfig: CfnConfig.UplinkEchoConfigProperty) {
        cdkBuilder.uplinkEchoConfig(uplinkEchoConfig)
    }

    public fun build(): CfnConfig.ConfigDataProperty = cdkBuilder.build()
}
