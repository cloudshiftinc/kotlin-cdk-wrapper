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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The output settings.
 *
 * The parent of this entity is Output.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * OutputSettingsProperty outputSettingsProperty = OutputSettingsProperty.builder()
 * .archiveOutputSettings(ArchiveOutputSettingsProperty.builder()
 * .containerSettings(ArchiveContainerSettingsProperty.builder()
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
 * .rawSettings(RawSettingsProperty.builder().build())
 * .build())
 * .extension("extension")
 * .nameModifier("nameModifier")
 * .build())
 * .frameCaptureOutputSettings(FrameCaptureOutputSettingsProperty.builder()
 * .nameModifier("nameModifier")
 * .build())
 * .hlsOutputSettings(HlsOutputSettingsProperty.builder()
 * .h265PackagingType("h265PackagingType")
 * .hlsSettings(HlsSettingsProperty.builder()
 * .audioOnlyHlsSettings(AudioOnlyHlsSettingsProperty.builder()
 * .audioGroupId("audioGroupId")
 * .audioOnlyImage(InputLocationProperty.builder()
 * .passwordParam("passwordParam")
 * .uri("uri")
 * .username("username")
 * .build())
 * .audioTrackType("audioTrackType")
 * .segmentType("segmentType")
 * .build())
 * .fmp4HlsSettings(Fmp4HlsSettingsProperty.builder()
 * .audioRenditionSets("audioRenditionSets")
 * .nielsenId3Behavior("nielsenId3Behavior")
 * .timedMetadataBehavior("timedMetadataBehavior")
 * .build())
 * .frameCaptureHlsSettings(FrameCaptureHlsSettingsProperty.builder().build())
 * .standardHlsSettings(StandardHlsSettingsProperty.builder()
 * .audioRenditionSets("audioRenditionSets")
 * .m3U8Settings(M3u8SettingsProperty.builder()
 * .audioFramesPerPes(123)
 * .audioPids("audioPids")
 * .ecmPid("ecmPid")
 * .nielsenId3Behavior("nielsenId3Behavior")
 * .patInterval(123)
 * .pcrControl("pcrControl")
 * .pcrPeriod(123)
 * .pcrPid("pcrPid")
 * .pmtInterval(123)
 * .pmtPid("pmtPid")
 * .programNum(123)
 * .scte35Behavior("scte35Behavior")
 * .scte35Pid("scte35Pid")
 * .timedMetadataBehavior("timedMetadataBehavior")
 * .timedMetadataPid("timedMetadataPid")
 * .transportStreamId(123)
 * .videoPid("videoPid")
 * .build())
 * .build())
 * .build())
 * .nameModifier("nameModifier")
 * .segmentModifier("segmentModifier")
 * .build())
 * .mediaPackageOutputSettings(MediaPackageOutputSettingsProperty.builder().build())
 * .msSmoothOutputSettings(MsSmoothOutputSettingsProperty.builder()
 * .h265PackagingType("h265PackagingType")
 * .nameModifier("nameModifier")
 * .build())
 * .multiplexOutputSettings(MultiplexOutputSettingsProperty.builder()
 * .destination(OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build())
 * .build())
 * .rtmpOutputSettings(RtmpOutputSettingsProperty.builder()
 * .certificateMode("certificateMode")
 * .connectionRetryInterval(123)
 * .destination(OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build())
 * .numRetries(123)
 * .build())
 * .udpOutputSettings(UdpOutputSettingsProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputsettings.html)
 */
@CdkDslMarker
public class CfnChannelOutputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.OutputSettingsProperty.Builder =
        CfnChannel.OutputSettingsProperty.builder()

    /** @param archiveOutputSettings The settings for an archive output. */
    public fun archiveOutputSettings(archiveOutputSettings: IResolvable) {
        cdkBuilder.archiveOutputSettings(archiveOutputSettings)
    }

    /** @param archiveOutputSettings The settings for an archive output. */
    public fun archiveOutputSettings(
        archiveOutputSettings: CfnChannel.ArchiveOutputSettingsProperty
    ) {
        cdkBuilder.archiveOutputSettings(archiveOutputSettings)
    }

    /**
     * @param frameCaptureOutputSettings The settings for a frame capture output. The parent of this
     *   entity is OutputGroupSettings.
     */
    public fun frameCaptureOutputSettings(frameCaptureOutputSettings: IResolvable) {
        cdkBuilder.frameCaptureOutputSettings(frameCaptureOutputSettings)
    }

    /**
     * @param frameCaptureOutputSettings The settings for a frame capture output. The parent of this
     *   entity is OutputGroupSettings.
     */
    public fun frameCaptureOutputSettings(
        frameCaptureOutputSettings: CfnChannel.FrameCaptureOutputSettingsProperty
    ) {
        cdkBuilder.frameCaptureOutputSettings(frameCaptureOutputSettings)
    }

    /**
     * @param hlsOutputSettings The settings for an HLS output. The parent of this entity is
     *   OutputGroupSettings.
     */
    public fun hlsOutputSettings(hlsOutputSettings: IResolvable) {
        cdkBuilder.hlsOutputSettings(hlsOutputSettings)
    }

    /**
     * @param hlsOutputSettings The settings for an HLS output. The parent of this entity is
     *   OutputGroupSettings.
     */
    public fun hlsOutputSettings(hlsOutputSettings: CfnChannel.HlsOutputSettingsProperty) {
        cdkBuilder.hlsOutputSettings(hlsOutputSettings)
    }

    /**
     * @param mediaPackageOutputSettings The settings for a MediaPackage output. The parent of this
     *   entity is OutputGroupSettings.
     */
    public fun mediaPackageOutputSettings(mediaPackageOutputSettings: IResolvable) {
        cdkBuilder.mediaPackageOutputSettings(mediaPackageOutputSettings)
    }

    /**
     * @param mediaPackageOutputSettings The settings for a MediaPackage output. The parent of this
     *   entity is OutputGroupSettings.
     */
    public fun mediaPackageOutputSettings(
        mediaPackageOutputSettings: CfnChannel.MediaPackageOutputSettingsProperty
    ) {
        cdkBuilder.mediaPackageOutputSettings(mediaPackageOutputSettings)
    }

    /** @param msSmoothOutputSettings The settings for a Microsoft Smooth output. */
    public fun msSmoothOutputSettings(msSmoothOutputSettings: IResolvable) {
        cdkBuilder.msSmoothOutputSettings(msSmoothOutputSettings)
    }

    /** @param msSmoothOutputSettings The settings for a Microsoft Smooth output. */
    public fun msSmoothOutputSettings(
        msSmoothOutputSettings: CfnChannel.MsSmoothOutputSettingsProperty
    ) {
        cdkBuilder.msSmoothOutputSettings(msSmoothOutputSettings)
    }

    /** @param multiplexOutputSettings Configuration of a Multiplex output. */
    public fun multiplexOutputSettings(multiplexOutputSettings: IResolvable) {
        cdkBuilder.multiplexOutputSettings(multiplexOutputSettings)
    }

    /** @param multiplexOutputSettings Configuration of a Multiplex output. */
    public fun multiplexOutputSettings(
        multiplexOutputSettings: CfnChannel.MultiplexOutputSettingsProperty
    ) {
        cdkBuilder.multiplexOutputSettings(multiplexOutputSettings)
    }

    /**
     * @param rtmpOutputSettings The settings for an RTMP output. The parent of this entity is
     *   OutputGroupSettings.
     */
    public fun rtmpOutputSettings(rtmpOutputSettings: IResolvable) {
        cdkBuilder.rtmpOutputSettings(rtmpOutputSettings)
    }

    /**
     * @param rtmpOutputSettings The settings for an RTMP output. The parent of this entity is
     *   OutputGroupSettings.
     */
    public fun rtmpOutputSettings(rtmpOutputSettings: CfnChannel.RtmpOutputSettingsProperty) {
        cdkBuilder.rtmpOutputSettings(rtmpOutputSettings)
    }

    /**
     * @param udpOutputSettings The settings for a UDP output. The parent of this entity is
     *   OutputGroupSettings.
     */
    public fun udpOutputSettings(udpOutputSettings: IResolvable) {
        cdkBuilder.udpOutputSettings(udpOutputSettings)
    }

    /**
     * @param udpOutputSettings The settings for a UDP output. The parent of this entity is
     *   OutputGroupSettings.
     */
    public fun udpOutputSettings(udpOutputSettings: CfnChannel.UdpOutputSettingsProperty) {
        cdkBuilder.udpOutputSettings(udpOutputSettings)
    }

    public fun build(): CfnChannel.OutputSettingsProperty = cdkBuilder.build()
}
