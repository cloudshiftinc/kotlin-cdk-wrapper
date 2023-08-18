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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnConfig
import software.amazon.awscdk.services.groundstation.CfnConfigProps

/**
 * Properties for defining a `CfnConfig`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * CfnConfigProps cfnConfigProps = CfnConfigProps.builder()
 * .configData(ConfigDataProperty.builder()
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
 * .build())
 * .name("name")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html)
 */
@CdkDslMarker
public class CfnConfigPropsDsl {
    private val cdkBuilder: CfnConfigProps.Builder = CfnConfigProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param configData Object containing the parameters of a config. Only one subtype may be
     *   specified per config. See the subtype definitions for a description of each config subtype.
     */
    public fun configData(configData: IResolvable) {
        cdkBuilder.configData(configData)
    }

    /**
     * @param configData Object containing the parameters of a config. Only one subtype may be
     *   specified per config. See the subtype definitions for a description of each config subtype.
     */
    public fun configData(configData: CfnConfig.ConfigDataProperty) {
        cdkBuilder.configData(configData)
    }

    /** @param name The name of the config object. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags Tags assigned to a resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Tags assigned to a resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnConfigProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
