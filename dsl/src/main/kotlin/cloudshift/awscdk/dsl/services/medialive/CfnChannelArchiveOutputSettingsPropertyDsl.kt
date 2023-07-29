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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The archive output settings.
 *
 * The parent of this entity is OutputSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * ArchiveOutputSettingsProperty archiveOutputSettingsProperty =
 * ArchiveOutputSettingsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-archiveoutputsettings.html)
 */
@CdkDslMarker
public class CfnChannelArchiveOutputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.ArchiveOutputSettingsProperty.Builder =
        CfnChannel.ArchiveOutputSettingsProperty.builder()

    /**
     * @param containerSettings The settings that are specific to the container type of the file.
     */
    public fun containerSettings(containerSettings: IResolvable) {
        cdkBuilder.containerSettings(containerSettings)
    }

    /**
     * @param containerSettings The settings that are specific to the container type of the file.
     */
    public fun containerSettings(containerSettings: CfnChannel.ArchiveContainerSettingsProperty) {
        cdkBuilder.containerSettings(containerSettings)
    }

    /**
     * @param extension The output file extension. If excluded, this is auto-selected from the
     *   container type.
     */
    public fun extension(extension: String) {
        cdkBuilder.extension(extension)
    }

    /**
     * @param nameModifier A string that is concatenated to the end of the destination file name.
     *   The string is required for multiple outputs of the same type.
     */
    public fun nameModifier(nameModifier: String) {
        cdkBuilder.nameModifier(nameModifier)
    }

    public fun build(): CfnChannel.ArchiveOutputSettingsProperty = cdkBuilder.build()
}
