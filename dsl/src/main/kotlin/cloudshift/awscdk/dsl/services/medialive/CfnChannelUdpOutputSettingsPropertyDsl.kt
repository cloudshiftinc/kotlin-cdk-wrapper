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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for one UDP output.
 *
 * The parent of this entity is OutputSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * UdpOutputSettingsProperty udpOutputSettingsProperty = UdpOutputSettingsProperty.builder()
 * .bufferMsec(123)
 * .containerSettings(UdpContainerSettingsProperty.builder()
 * .m2TsSettings(M2tsSettingsProperty.builder()
 * .absentInputAudioBehavior("absentInputAudioBehavior")
 * .arib("arib")
 * .aribCaptionsPid("aribCaptionsPid")
 * .aribCaptionsPidControl("aribCaptionsPidControl")
 * .audioBufferModel("audioBufferModel")
 * .audioFramesPerPes(123)
 * .audioPids("audioPids")
 * .audioStreamType("audioStreamType")
 * .bitrate(123)
 * .bufferModel("bufferModel")
 * .ccDescriptor("ccDescriptor")
 * .dvbNitSettings(DvbNitSettingsProperty.builder()
 * .networkId(123)
 * .networkName("networkName")
 * .repInterval(123)
 * .build())
 * .dvbSdtSettings(DvbSdtSettingsProperty.builder()
 * .outputSdt("outputSdt")
 * .repInterval(123)
 * .serviceName("serviceName")
 * .serviceProviderName("serviceProviderName")
 * .build())
 * .dvbSubPids("dvbSubPids")
 * .dvbTdtSettings(DvbTdtSettingsProperty.builder()
 * .repInterval(123)
 * .build())
 * .dvbTeletextPid("dvbTeletextPid")
 * .ebif("ebif")
 * .ebpAudioInterval("ebpAudioInterval")
 * .ebpLookaheadMs(123)
 * .ebpPlacement("ebpPlacement")
 * .ecmPid("ecmPid")
 * .esRateInPes("esRateInPes")
 * .etvPlatformPid("etvPlatformPid")
 * .etvSignalPid("etvSignalPid")
 * .fragmentTime(123)
 * .klv("klv")
 * .klvDataPids("klvDataPids")
 * .nielsenId3Behavior("nielsenId3Behavior")
 * .nullPacketBitrate(123)
 * .patInterval(123)
 * .pcrControl("pcrControl")
 * .pcrPeriod(123)
 * .pcrPid("pcrPid")
 * .pmtInterval(123)
 * .pmtPid("pmtPid")
 * .programNum(123)
 * .rateMode("rateMode")
 * .scte27Pids("scte27Pids")
 * .scte35Control("scte35Control")
 * .scte35Pid("scte35Pid")
 * .scte35PrerollPullupMilliseconds(123)
 * .segmentationMarkers("segmentationMarkers")
 * .segmentationStyle("segmentationStyle")
 * .segmentationTime(123)
 * .timedMetadataBehavior("timedMetadataBehavior")
 * .timedMetadataPid("timedMetadataPid")
 * .transportStreamId(123)
 * .videoPid("videoPid")
 * .build())
 * .build())
 * .destination(OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build())
 * .fecOutputSettings(FecOutputSettingsProperty.builder()
 * .columnDepth(123)
 * .includeFec("includeFec")
 * .rowLength(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-udpoutputsettings.html)
 */
@CdkDslMarker
public class CfnChannelUdpOutputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.UdpOutputSettingsProperty.Builder =
        CfnChannel.UdpOutputSettingsProperty.builder()

    /**
     * @param bufferMsec The UDP output buffering in milliseconds. Larger values increase latency
     *   through the transcoder but simultaneously assist the transcoder in maintaining a constant,
     *   low-jitter UDP/RTP output while accommodating clock recovery, input switching, input
     *   disruptions, picture reordering, and so on.
     */
    public fun bufferMsec(bufferMsec: Number) {
        cdkBuilder.bufferMsec(bufferMsec)
    }

    /** @param containerSettings The settings for the UDP output. */
    public fun containerSettings(containerSettings: IResolvable) {
        cdkBuilder.containerSettings(containerSettings)
    }

    /** @param containerSettings The settings for the UDP output. */
    public fun containerSettings(containerSettings: CfnChannel.UdpContainerSettingsProperty) {
        cdkBuilder.containerSettings(containerSettings)
    }

    /**
     * @param destination The destination address and port number for RTP or UDP packets. These can
     *   be unicast or multicast RTP or UDP (for example, rtp://239.10.10.10:5001 or
     *   udp://10.100.100.100:5002).
     */
    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    /**
     * @param destination The destination address and port number for RTP or UDP packets. These can
     *   be unicast or multicast RTP or UDP (for example, rtp://239.10.10.10:5001 or
     *   udp://10.100.100.100:5002).
     */
    public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
        cdkBuilder.destination(destination)
    }

    /**
     * @param fecOutputSettings The settings for enabling and adjusting Forward Error Correction on
     *   UDP outputs.
     */
    public fun fecOutputSettings(fecOutputSettings: IResolvable) {
        cdkBuilder.fecOutputSettings(fecOutputSettings)
    }

    /**
     * @param fecOutputSettings The settings for enabling and adjusting Forward Error Correction on
     *   UDP outputs.
     */
    public fun fecOutputSettings(fecOutputSettings: CfnChannel.FecOutputSettingsProperty) {
        cdkBuilder.fecOutputSettings(fecOutputSettings)
    }

    public fun build(): CfnChannel.UdpOutputSettingsProperty = cdkBuilder.build()
}
