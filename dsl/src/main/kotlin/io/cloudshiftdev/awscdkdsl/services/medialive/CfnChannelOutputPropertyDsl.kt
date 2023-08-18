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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The output settings.
 *
 * The parent of this entity is OutputGroup.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * OutputProperty outputProperty = OutputProperty.builder()
 * .audioDescriptionNames(List.of("audioDescriptionNames"))
 * .captionDescriptionNames(List.of("captionDescriptionNames"))
 * .outputName("outputName")
 * .outputSettings(OutputSettingsProperty.builder()
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
 * .build())
 * .videoDescriptionName("videoDescriptionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-output.html)
 */
@CdkDslMarker
public class CfnChannelOutputPropertyDsl {
    private val cdkBuilder: CfnChannel.OutputProperty.Builder = CfnChannel.OutputProperty.builder()

    private val _audioDescriptionNames: MutableList<String> = mutableListOf()

    private val _captionDescriptionNames: MutableList<String> = mutableListOf()

    /**
     * @param audioDescriptionNames The names of the audio descriptions that are used as audio
     *   sources for this output.
     */
    public fun audioDescriptionNames(vararg audioDescriptionNames: String) {
        _audioDescriptionNames.addAll(listOf(*audioDescriptionNames))
    }

    /**
     * @param audioDescriptionNames The names of the audio descriptions that are used as audio
     *   sources for this output.
     */
    public fun audioDescriptionNames(audioDescriptionNames: Collection<String>) {
        _audioDescriptionNames.addAll(audioDescriptionNames)
    }

    /**
     * @param captionDescriptionNames The names of the caption descriptions that are used as
     *   captions sources for this output.
     */
    public fun captionDescriptionNames(vararg captionDescriptionNames: String) {
        _captionDescriptionNames.addAll(listOf(*captionDescriptionNames))
    }

    /**
     * @param captionDescriptionNames The names of the caption descriptions that are used as
     *   captions sources for this output.
     */
    public fun captionDescriptionNames(captionDescriptionNames: Collection<String>) {
        _captionDescriptionNames.addAll(captionDescriptionNames)
    }

    /** @param outputName The name that is used to identify an output. */
    public fun outputName(outputName: String) {
        cdkBuilder.outputName(outputName)
    }

    /** @param outputSettings The output type-specific settings. */
    public fun outputSettings(outputSettings: IResolvable) {
        cdkBuilder.outputSettings(outputSettings)
    }

    /** @param outputSettings The output type-specific settings. */
    public fun outputSettings(outputSettings: CfnChannel.OutputSettingsProperty) {
        cdkBuilder.outputSettings(outputSettings)
    }

    /**
     * @param videoDescriptionName The name of the VideoDescription that is used as the source for
     *   this output.
     */
    public fun videoDescriptionName(videoDescriptionName: String) {
        cdkBuilder.videoDescriptionName(videoDescriptionName)
    }

    public fun build(): CfnChannel.OutputProperty {
        if (_audioDescriptionNames.isNotEmpty())
            cdkBuilder.audioDescriptionNames(_audioDescriptionNames)
        if (_captionDescriptionNames.isNotEmpty())
            cdkBuilder.captionDescriptionNames(_captionDescriptionNames)
        return cdkBuilder.build()
    }
}
