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
 * The configuration of the output group.
 *
 * The parent of this entity is OutputGroup.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * OutputGroupSettingsProperty outputGroupSettingsProperty = OutputGroupSettingsProperty.builder()
 * .archiveGroupSettings(ArchiveGroupSettingsProperty.builder()
 * .archiveCdnSettings(ArchiveCdnSettingsProperty.builder()
 * .archiveS3Settings(ArchiveS3SettingsProperty.builder()
 * .cannedAcl("cannedAcl")
 * .build())
 * .build())
 * .destination(OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build())
 * .rolloverInterval(123)
 * .build())
 * .frameCaptureGroupSettings(FrameCaptureGroupSettingsProperty.builder()
 * .destination(OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build())
 * .frameCaptureCdnSettings(FrameCaptureCdnSettingsProperty.builder()
 * .frameCaptureS3Settings(FrameCaptureS3SettingsProperty.builder()
 * .cannedAcl("cannedAcl")
 * .build())
 * .build())
 * .build())
 * .hlsGroupSettings(HlsGroupSettingsProperty.builder()
 * .adMarkers(List.of("adMarkers"))
 * .baseUrlContent("baseUrlContent")
 * .baseUrlContent1("baseUrlContent1")
 * .baseUrlManifest("baseUrlManifest")
 * .baseUrlManifest1("baseUrlManifest1")
 * .captionLanguageMappings(List.of(CaptionLanguageMappingProperty.builder()
 * .captionChannel(123)
 * .languageCode("languageCode")
 * .languageDescription("languageDescription")
 * .build()))
 * .captionLanguageSetting("captionLanguageSetting")
 * .clientCache("clientCache")
 * .codecSpecification("codecSpecification")
 * .constantIv("constantIv")
 * .destination(OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build())
 * .directoryStructure("directoryStructure")
 * .discontinuityTags("discontinuityTags")
 * .encryptionType("encryptionType")
 * .hlsCdnSettings(HlsCdnSettingsProperty.builder()
 * .hlsAkamaiSettings(HlsAkamaiSettingsProperty.builder()
 * .connectionRetryInterval(123)
 * .filecacheDuration(123)
 * .httpTransferMode("httpTransferMode")
 * .numRetries(123)
 * .restartDelay(123)
 * .salt("salt")
 * .token("token")
 * .build())
 * .hlsBasicPutSettings(HlsBasicPutSettingsProperty.builder()
 * .connectionRetryInterval(123)
 * .filecacheDuration(123)
 * .numRetries(123)
 * .restartDelay(123)
 * .build())
 * .hlsMediaStoreSettings(HlsMediaStoreSettingsProperty.builder()
 * .connectionRetryInterval(123)
 * .filecacheDuration(123)
 * .mediaStoreStorageClass("mediaStoreStorageClass")
 * .numRetries(123)
 * .restartDelay(123)
 * .build())
 * .hlsS3Settings(HlsS3SettingsProperty.builder()
 * .cannedAcl("cannedAcl")
 * .build())
 * .hlsWebdavSettings(HlsWebdavSettingsProperty.builder()
 * .connectionRetryInterval(123)
 * .filecacheDuration(123)
 * .httpTransferMode("httpTransferMode")
 * .numRetries(123)
 * .restartDelay(123)
 * .build())
 * .build())
 * .hlsId3SegmentTagging("hlsId3SegmentTagging")
 * .iFrameOnlyPlaylists("iFrameOnlyPlaylists")
 * .incompleteSegmentBehavior("incompleteSegmentBehavior")
 * .indexNSegments(123)
 * .inputLossAction("inputLossAction")
 * .ivInManifest("ivInManifest")
 * .ivSource("ivSource")
 * .keepSegments(123)
 * .keyFormat("keyFormat")
 * .keyFormatVersions("keyFormatVersions")
 * .keyProviderSettings(KeyProviderSettingsProperty.builder()
 * .staticKeySettings(StaticKeySettingsProperty.builder()
 * .keyProviderServer(InputLocationProperty.builder()
 * .passwordParam("passwordParam")
 * .uri("uri")
 * .username("username")
 * .build())
 * .staticKeyValue("staticKeyValue")
 * .build())
 * .build())
 * .manifestCompression("manifestCompression")
 * .manifestDurationFormat("manifestDurationFormat")
 * .minSegmentLength(123)
 * .mode("mode")
 * .outputSelection("outputSelection")
 * .programDateTime("programDateTime")
 * .programDateTimeClock("programDateTimeClock")
 * .programDateTimePeriod(123)
 * .redundantManifest("redundantManifest")
 * .segmentationMode("segmentationMode")
 * .segmentLength(123)
 * .segmentsPerSubdirectory(123)
 * .streamInfResolution("streamInfResolution")
 * .timedMetadataId3Frame("timedMetadataId3Frame")
 * .timedMetadataId3Period(123)
 * .timestampDeltaMilliseconds(123)
 * .tsFileMode("tsFileMode")
 * .build())
 * .mediaPackageGroupSettings(MediaPackageGroupSettingsProperty.builder()
 * .destination(OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build())
 * .build())
 * .msSmoothGroupSettings(MsSmoothGroupSettingsProperty.builder()
 * .acquisitionPointId("acquisitionPointId")
 * .audioOnlyTimecodeControl("audioOnlyTimecodeControl")
 * .certificateMode("certificateMode")
 * .connectionRetryInterval(123)
 * .destination(OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build())
 * .eventId("eventId")
 * .eventIdMode("eventIdMode")
 * .eventStopBehavior("eventStopBehavior")
 * .filecacheDuration(123)
 * .fragmentLength(123)
 * .inputLossAction("inputLossAction")
 * .numRetries(123)
 * .restartDelay(123)
 * .segmentationMode("segmentationMode")
 * .sendDelayMs(123)
 * .sparseTrackType("sparseTrackType")
 * .streamManifestBehavior("streamManifestBehavior")
 * .timestampOffset("timestampOffset")
 * .timestampOffsetMode("timestampOffsetMode")
 * .build())
 * .multiplexGroupSettings(MultiplexGroupSettingsProperty.builder().build())
 * .rtmpGroupSettings(RtmpGroupSettingsProperty.builder()
 * .adMarkers(List.of("adMarkers"))
 * .authenticationScheme("authenticationScheme")
 * .cacheFullBehavior("cacheFullBehavior")
 * .cacheLength(123)
 * .captionData("captionData")
 * .includeFillerNalUnits("includeFillerNalUnits")
 * .inputLossAction("inputLossAction")
 * .restartDelay(123)
 * .build())
 * .udpGroupSettings(UdpGroupSettingsProperty.builder()
 * .inputLossAction("inputLossAction")
 * .timedMetadataId3Frame("timedMetadataId3Frame")
 * .timedMetadataId3Period(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputgroupsettings.html)
 */
@CdkDslMarker
public class CfnChannelOutputGroupSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.OutputGroupSettingsProperty.Builder =
        CfnChannel.OutputGroupSettingsProperty.builder()

    /**
     * @param archiveGroupSettings The configuration of an archive output group. The parent of this
     *   entity is OutputGroupSettings.
     */
    public fun archiveGroupSettings(archiveGroupSettings: IResolvable) {
        cdkBuilder.archiveGroupSettings(archiveGroupSettings)
    }

    /**
     * @param archiveGroupSettings The configuration of an archive output group. The parent of this
     *   entity is OutputGroupSettings.
     */
    public fun archiveGroupSettings(archiveGroupSettings: CfnChannel.ArchiveGroupSettingsProperty) {
        cdkBuilder.archiveGroupSettings(archiveGroupSettings)
    }

    /** @param frameCaptureGroupSettings The configuration of a frame capture output group. */
    public fun frameCaptureGroupSettings(frameCaptureGroupSettings: IResolvable) {
        cdkBuilder.frameCaptureGroupSettings(frameCaptureGroupSettings)
    }

    /** @param frameCaptureGroupSettings The configuration of a frame capture output group. */
    public fun frameCaptureGroupSettings(
        frameCaptureGroupSettings: CfnChannel.FrameCaptureGroupSettingsProperty
    ) {
        cdkBuilder.frameCaptureGroupSettings(frameCaptureGroupSettings)
    }

    /** @param hlsGroupSettings The configuration of an HLS output group. */
    public fun hlsGroupSettings(hlsGroupSettings: IResolvable) {
        cdkBuilder.hlsGroupSettings(hlsGroupSettings)
    }

    /** @param hlsGroupSettings The configuration of an HLS output group. */
    public fun hlsGroupSettings(hlsGroupSettings: CfnChannel.HlsGroupSettingsProperty) {
        cdkBuilder.hlsGroupSettings(hlsGroupSettings)
    }

    /** @param mediaPackageGroupSettings The configuration of a MediaPackage output group. */
    public fun mediaPackageGroupSettings(mediaPackageGroupSettings: IResolvable) {
        cdkBuilder.mediaPackageGroupSettings(mediaPackageGroupSettings)
    }

    /** @param mediaPackageGroupSettings The configuration of a MediaPackage output group. */
    public fun mediaPackageGroupSettings(
        mediaPackageGroupSettings: CfnChannel.MediaPackageGroupSettingsProperty
    ) {
        cdkBuilder.mediaPackageGroupSettings(mediaPackageGroupSettings)
    }

    /** @param msSmoothGroupSettings The configuration of a Microsoft Smooth output group. */
    public fun msSmoothGroupSettings(msSmoothGroupSettings: IResolvable) {
        cdkBuilder.msSmoothGroupSettings(msSmoothGroupSettings)
    }

    /** @param msSmoothGroupSettings The configuration of a Microsoft Smooth output group. */
    public fun msSmoothGroupSettings(
        msSmoothGroupSettings: CfnChannel.MsSmoothGroupSettingsProperty
    ) {
        cdkBuilder.msSmoothGroupSettings(msSmoothGroupSettings)
    }

    /** @param multiplexGroupSettings The settings for a Multiplex output group. */
    public fun multiplexGroupSettings(multiplexGroupSettings: IResolvable) {
        cdkBuilder.multiplexGroupSettings(multiplexGroupSettings)
    }

    /** @param multiplexGroupSettings The settings for a Multiplex output group. */
    public fun multiplexGroupSettings(
        multiplexGroupSettings: CfnChannel.MultiplexGroupSettingsProperty
    ) {
        cdkBuilder.multiplexGroupSettings(multiplexGroupSettings)
    }

    /** @param rtmpGroupSettings The configuration of an RTMP output group. */
    public fun rtmpGroupSettings(rtmpGroupSettings: IResolvable) {
        cdkBuilder.rtmpGroupSettings(rtmpGroupSettings)
    }

    /** @param rtmpGroupSettings The configuration of an RTMP output group. */
    public fun rtmpGroupSettings(rtmpGroupSettings: CfnChannel.RtmpGroupSettingsProperty) {
        cdkBuilder.rtmpGroupSettings(rtmpGroupSettings)
    }

    /** @param udpGroupSettings The configuration of a UDP output group. */
    public fun udpGroupSettings(udpGroupSettings: IResolvable) {
        cdkBuilder.udpGroupSettings(udpGroupSettings)
    }

    /** @param udpGroupSettings The configuration of a UDP output group. */
    public fun udpGroupSettings(udpGroupSettings: CfnChannel.UdpGroupSettingsProperty) {
        cdkBuilder.udpGroupSettings(udpGroupSettings)
    }

    public fun build(): CfnChannel.OutputGroupSettingsProperty = cdkBuilder.build()
}
