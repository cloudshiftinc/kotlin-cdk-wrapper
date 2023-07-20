@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.groundstation

import software.amazon.awscdk.services.groundstation.CfnConfig
import software.amazon.awscdk.services.groundstation.CfnConfigProps
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps
import software.amazon.awscdk.services.groundstation.CfnMissionProfile
import software.amazon.awscdk.services.groundstation.CfnMissionProfileProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object groundstation {
    public inline fun cfnConfig(
        scope: Construct,
        id: String,
        block: CfnConfigDsl.() -> Unit = {},
    ): CfnConfig {
        val builder = CfnConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigAntennaDownlinkConfigProperty(
        block: CfnConfigAntennaDownlinkConfigPropertyDsl.() -> Unit =
            {},
    ): CfnConfig.AntennaDownlinkConfigProperty {
        val builder = CfnConfigAntennaDownlinkConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigAntennaDownlinkDemodDecodeConfigProperty(
        block: CfnConfigAntennaDownlinkDemodDecodeConfigPropertyDsl.() -> Unit =
            {},
    ): CfnConfig.AntennaDownlinkDemodDecodeConfigProperty {
        val builder = CfnConfigAntennaDownlinkDemodDecodeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigAntennaUplinkConfigProperty(
        block: CfnConfigAntennaUplinkConfigPropertyDsl.() -> Unit =
            {},
    ): CfnConfig.AntennaUplinkConfigProperty {
        val builder = CfnConfigAntennaUplinkConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigConfigDataProperty(
        block: CfnConfigConfigDataPropertyDsl.() -> Unit =
            {},
    ): CfnConfig.ConfigDataProperty {
        val builder = CfnConfigConfigDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigDataflowEndpointConfigProperty(
        block: CfnConfigDataflowEndpointConfigPropertyDsl.() -> Unit =
            {},
    ): CfnConfig.DataflowEndpointConfigProperty {
        val builder = CfnConfigDataflowEndpointConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigDecodeConfigProperty(
        block: CfnConfigDecodeConfigPropertyDsl.() -> Unit =
            {},
    ): CfnConfig.DecodeConfigProperty {
        val builder = CfnConfigDecodeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigDemodulationConfigProperty(
        block: CfnConfigDemodulationConfigPropertyDsl.() -> Unit =
            {},
    ): CfnConfig.DemodulationConfigProperty {
        val builder = CfnConfigDemodulationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigEirpProperty(block: CfnConfigEirpPropertyDsl.() -> Unit = {}): CfnConfig.EirpProperty {
        val builder = CfnConfigEirpPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigFrequencyBandwidthProperty(
        block: CfnConfigFrequencyBandwidthPropertyDsl.() -> Unit =
            {},
    ): CfnConfig.FrequencyBandwidthProperty {
        val builder = CfnConfigFrequencyBandwidthPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigFrequencyProperty(
        block: CfnConfigFrequencyPropertyDsl.() -> Unit =
            {},
    ): CfnConfig.FrequencyProperty {
        val builder = CfnConfigFrequencyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigProps(block: CfnConfigPropsDsl.() -> Unit = {}): CfnConfigProps {
        val builder = CfnConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigS3RecordingConfigProperty(
        block: CfnConfigS3RecordingConfigPropertyDsl.() -> Unit =
            {},
    ): CfnConfig.S3RecordingConfigProperty {
        val builder = CfnConfigS3RecordingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigSpectrumConfigProperty(
        block: CfnConfigSpectrumConfigPropertyDsl.() -> Unit =
            {},
    ): CfnConfig.SpectrumConfigProperty {
        val builder = CfnConfigSpectrumConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigTrackingConfigProperty(
        block: CfnConfigTrackingConfigPropertyDsl.() -> Unit =
            {},
    ): CfnConfig.TrackingConfigProperty {
        val builder = CfnConfigTrackingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigUplinkEchoConfigProperty(
        block: CfnConfigUplinkEchoConfigPropertyDsl.() -> Unit =
            {},
    ): CfnConfig.UplinkEchoConfigProperty {
        val builder = CfnConfigUplinkEchoConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigUplinkSpectrumConfigProperty(
        block: CfnConfigUplinkSpectrumConfigPropertyDsl.() -> Unit =
            {},
    ): CfnConfig.UplinkSpectrumConfigProperty {
        val builder = CfnConfigUplinkSpectrumConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataflowEndpointGroup(
        scope: Construct,
        id: String,
        block: CfnDataflowEndpointGroupDsl.() -> Unit = {},
    ): CfnDataflowEndpointGroup {
        val builder = CfnDataflowEndpointGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataflowEndpointGroupAwsGroundStationAgentEndpointProperty(
        block: CfnDataflowEndpointGroupAwsGroundStationAgentEndpointPropertyDsl.() -> Unit =
            {},
    ): CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty {
        val builder = CfnDataflowEndpointGroupAwsGroundStationAgentEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataflowEndpointGroupConnectionDetailsProperty(
        block: CfnDataflowEndpointGroupConnectionDetailsPropertyDsl.() -> Unit =
            {},
    ): CfnDataflowEndpointGroup.ConnectionDetailsProperty {
        val builder = CfnDataflowEndpointGroupConnectionDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataflowEndpointGroupDataflowEndpointProperty(
        block: CfnDataflowEndpointGroupDataflowEndpointPropertyDsl.() -> Unit =
            {},
    ): CfnDataflowEndpointGroup.DataflowEndpointProperty {
        val builder = CfnDataflowEndpointGroupDataflowEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataflowEndpointGroupEndpointDetailsProperty(
        block: CfnDataflowEndpointGroupEndpointDetailsPropertyDsl.() -> Unit =
            {},
    ): CfnDataflowEndpointGroup.EndpointDetailsProperty {
        val builder = CfnDataflowEndpointGroupEndpointDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataflowEndpointGroupIntegerRangeProperty(
        block: CfnDataflowEndpointGroupIntegerRangePropertyDsl.() -> Unit =
            {},
    ): CfnDataflowEndpointGroup.IntegerRangeProperty {
        val builder = CfnDataflowEndpointGroupIntegerRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataflowEndpointGroupProps(
        block: CfnDataflowEndpointGroupPropsDsl.() -> Unit =
            {},
    ): CfnDataflowEndpointGroupProps {
        val builder = CfnDataflowEndpointGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataflowEndpointGroupRangedConnectionDetailsProperty(
        block: CfnDataflowEndpointGroupRangedConnectionDetailsPropertyDsl.() -> Unit =
            {},
    ): CfnDataflowEndpointGroup.RangedConnectionDetailsProperty {
        val builder = CfnDataflowEndpointGroupRangedConnectionDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataflowEndpointGroupRangedSocketAddressProperty(
        block: CfnDataflowEndpointGroupRangedSocketAddressPropertyDsl.() -> Unit =
            {},
    ): CfnDataflowEndpointGroup.RangedSocketAddressProperty {
        val builder = CfnDataflowEndpointGroupRangedSocketAddressPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataflowEndpointGroupSecurityDetailsProperty(
        block: CfnDataflowEndpointGroupSecurityDetailsPropertyDsl.() -> Unit =
            {},
    ): CfnDataflowEndpointGroup.SecurityDetailsProperty {
        val builder = CfnDataflowEndpointGroupSecurityDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataflowEndpointGroupSocketAddressProperty(
        block: CfnDataflowEndpointGroupSocketAddressPropertyDsl.() -> Unit =
            {},
    ): CfnDataflowEndpointGroup.SocketAddressProperty {
        val builder = CfnDataflowEndpointGroupSocketAddressPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMissionProfile(
        scope: Construct,
        id: String,
        block: CfnMissionProfileDsl.() -> Unit = {},
    ): CfnMissionProfile {
        val builder = CfnMissionProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMissionProfileDataflowEdgeProperty(
        block: CfnMissionProfileDataflowEdgePropertyDsl.() -> Unit =
            {},
    ): CfnMissionProfile.DataflowEdgeProperty {
        val builder = CfnMissionProfileDataflowEdgePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMissionProfileProps(block: CfnMissionProfilePropsDsl.() -> Unit = {}): CfnMissionProfileProps {
        val builder = CfnMissionProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMissionProfileStreamsKmsKeyProperty(
        block: CfnMissionProfileStreamsKmsKeyPropertyDsl.() -> Unit =
            {},
    ): CfnMissionProfile.StreamsKmsKeyProperty {
        val builder = CfnMissionProfileStreamsKmsKeyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
