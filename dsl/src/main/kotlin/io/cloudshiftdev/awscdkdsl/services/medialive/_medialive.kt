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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel
import software.amazon.awscdk.services.medialive.CfnChannelProps
import software.amazon.awscdk.services.medialive.CfnInput
import software.amazon.awscdk.services.medialive.CfnInputProps
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroup
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps
import software.constructs.Construct

public object medialive {
    /**
     * The AWS::MediaLive::Channel resource is a MediaLive resource type that creates a channel.
     *
     * A MediaLive channel ingests and transcodes (decodes and encodes) source content from the
     * inputs that are attached to that channel, and packages the new content into outputs.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html)
     */
    public inline fun cfnChannel(
        scope: Construct,
        id: String,
        block: CfnChannelDsl.() -> Unit = {},
    ): CfnChannel {
        val builder = CfnChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for an AAC audio encode in the output.
     *
     * The parent of this entity is AudioCodecSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AacSettingsProperty aacSettingsProperty = AacSettingsProperty.builder()
     * .bitrate(123)
     * .codingMode("codingMode")
     * .inputType("inputType")
     * .profile("profile")
     * .rateControlMode("rateControlMode")
     * .rawFormat("rawFormat")
     * .sampleRate(123)
     * .spec("spec")
     * .vbrQuality("vbrQuality")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-aacsettings.html)
     */
    public inline fun cfnChannelAacSettingsProperty(
        block: CfnChannelAacSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.AacSettingsProperty {
        val builder = CfnChannelAacSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for an AC3 audio encode in the output.
     *
     * The parent of this entity is AudioCodecSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Ac3SettingsProperty ac3SettingsProperty = Ac3SettingsProperty.builder()
     * .bitrate(123)
     * .bitstreamMode("bitstreamMode")
     * .codingMode("codingMode")
     * .dialnorm(123)
     * .drcProfile("drcProfile")
     * .lfeFilter("lfeFilter")
     * .metadataControl("metadataControl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-ac3settings.html)
     */
    public inline fun cfnChannelAc3SettingsProperty(
        block: CfnChannelAc3SettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.Ac3SettingsProperty {
        val builder = CfnChannelAc3SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the ancillary captions to extract from the input.
     *
     * The parent of this entity is CaptionSelectorSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AncillarySourceSettingsProperty ancillarySourceSettingsProperty =
     * AncillarySourceSettingsProperty.builder()
     * .sourceAncillaryChannelNumber(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-ancillarysourcesettings.html)
     */
    public inline fun cfnChannelAncillarySourceSettingsProperty(
        block: CfnChannelAncillarySourceSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.AncillarySourceSettingsProperty {
        val builder = CfnChannelAncillarySourceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings to configure the destination of an Archive output.
     *
     * The parent of this entity is ArchiveGroupSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * ArchiveCdnSettingsProperty archiveCdnSettingsProperty = ArchiveCdnSettingsProperty.builder()
     * .archiveS3Settings(ArchiveS3SettingsProperty.builder()
     * .cannedAcl("cannedAcl")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-archivecdnsettings.html)
     */
    public inline fun cfnChannelArchiveCdnSettingsProperty(
        block: CfnChannelArchiveCdnSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.ArchiveCdnSettingsProperty {
        val builder = CfnChannelArchiveCdnSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The archive container settings.
     *
     * The parent of this entity is ArchiveOutputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * ArchiveContainerSettingsProperty archiveContainerSettingsProperty =
     * ArchiveContainerSettingsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-archivecontainersettings.html)
     */
    public inline fun cfnChannelArchiveContainerSettingsProperty(
        block: CfnChannelArchiveContainerSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.ArchiveContainerSettingsProperty {
        val builder = CfnChannelArchiveContainerSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for an archive output group.
     *
     * The parent of this entity is OutputGroupSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * ArchiveGroupSettingsProperty archiveGroupSettingsProperty =
     * ArchiveGroupSettingsProperty.builder()
     * .archiveCdnSettings(ArchiveCdnSettingsProperty.builder()
     * .archiveS3Settings(ArchiveS3SettingsProperty.builder()
     * .cannedAcl("cannedAcl")
     * .build())
     * .build())
     * .destination(OutputLocationRefProperty.builder()
     * .destinationRefId("destinationRefId")
     * .build())
     * .rolloverInterval(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-archivegroupsettings.html)
     */
    public inline fun cfnChannelArchiveGroupSettingsProperty(
        block: CfnChannelArchiveGroupSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.ArchiveGroupSettingsProperty {
        val builder = CfnChannelArchiveGroupSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnChannelArchiveOutputSettingsProperty(
        block: CfnChannelArchiveOutputSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.ArchiveOutputSettingsProperty {
        val builder = CfnChannelArchiveOutputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Sets up Amazon S3 as the destination for this Archive output.
     *
     * The parent of this entity is ArchiveCdnSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * ArchiveS3SettingsProperty archiveS3SettingsProperty = ArchiveS3SettingsProperty.builder()
     * .cannedAcl("cannedAcl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-archives3settings.html)
     */
    public inline fun cfnChannelArchiveS3SettingsProperty(
        block: CfnChannelArchiveS3SettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.ArchiveS3SettingsProperty {
        val builder = CfnChannelArchiveS3SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of ARIB captions in the output.
     *
     * The parent of this entity is CaptionDestinationSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AribDestinationSettingsProperty aribDestinationSettingsProperty =
     * AribDestinationSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-aribdestinationsettings.html)
     */
    public inline fun cfnChannelAribDestinationSettingsProperty(
        block: CfnChannelAribDestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.AribDestinationSettingsProperty {
        val builder = CfnChannelAribDestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the ARIB captions to extract from the input.
     *
     * The parent of this entity is CaptionSelectorSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AribSourceSettingsProperty aribSourceSettingsProperty =
     * AribSourceSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-aribsourcesettings.html)
     */
    public inline fun cfnChannelAribSourceSettingsProperty(
        block: CfnChannelAribSourceSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.AribSourceSettingsProperty {
        val builder = CfnChannelAribSourceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for remixing audio.
     *
     * The parent of this entity is RemixSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AudioChannelMappingProperty audioChannelMappingProperty = AudioChannelMappingProperty.builder()
     * .inputChannelLevels(List.of(InputChannelLevelProperty.builder()
     * .gain(123)
     * .inputChannel(123)
     * .build()))
     * .outputChannel(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiochannelmapping.html)
     */
    public inline fun cfnChannelAudioChannelMappingProperty(
        block: CfnChannelAudioChannelMappingPropertyDsl.() -> Unit = {}
    ): CfnChannel.AudioChannelMappingProperty {
        val builder = CfnChannelAudioChannelMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of the audio codec in the audio output.
     *
     * The parent of this entity is AudioDescription.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AudioCodecSettingsProperty audioCodecSettingsProperty = AudioCodecSettingsProperty.builder()
     * .aacSettings(AacSettingsProperty.builder()
     * .bitrate(123)
     * .codingMode("codingMode")
     * .inputType("inputType")
     * .profile("profile")
     * .rateControlMode("rateControlMode")
     * .rawFormat("rawFormat")
     * .sampleRate(123)
     * .spec("spec")
     * .vbrQuality("vbrQuality")
     * .build())
     * .ac3Settings(Ac3SettingsProperty.builder()
     * .bitrate(123)
     * .bitstreamMode("bitstreamMode")
     * .codingMode("codingMode")
     * .dialnorm(123)
     * .drcProfile("drcProfile")
     * .lfeFilter("lfeFilter")
     * .metadataControl("metadataControl")
     * .build())
     * .eac3AtmosSettings(Eac3AtmosSettingsProperty.builder()
     * .bitrate(123)
     * .codingMode("codingMode")
     * .dialnorm(123)
     * .drcLine("drcLine")
     * .drcRf("drcRf")
     * .heightTrim(123)
     * .surroundTrim(123)
     * .build())
     * .eac3Settings(Eac3SettingsProperty.builder()
     * .attenuationControl("attenuationControl")
     * .bitrate(123)
     * .bitstreamMode("bitstreamMode")
     * .codingMode("codingMode")
     * .dcFilter("dcFilter")
     * .dialnorm(123)
     * .drcLine("drcLine")
     * .drcRf("drcRf")
     * .lfeControl("lfeControl")
     * .lfeFilter("lfeFilter")
     * .loRoCenterMixLevel(123)
     * .loRoSurroundMixLevel(123)
     * .ltRtCenterMixLevel(123)
     * .ltRtSurroundMixLevel(123)
     * .metadataControl("metadataControl")
     * .passthroughControl("passthroughControl")
     * .phaseControl("phaseControl")
     * .stereoDownmix("stereoDownmix")
     * .surroundExMode("surroundExMode")
     * .surroundMode("surroundMode")
     * .build())
     * .mp2Settings(Mp2SettingsProperty.builder()
     * .bitrate(123)
     * .codingMode("codingMode")
     * .sampleRate(123)
     * .build())
     * .passThroughSettings(PassThroughSettingsProperty.builder().build())
     * .wavSettings(WavSettingsProperty.builder()
     * .bitDepth(123)
     * .codingMode("codingMode")
     * .sampleRate(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiocodecsettings.html)
     */
    public inline fun cfnChannelAudioCodecSettingsProperty(
        block: CfnChannelAudioCodecSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.AudioCodecSettingsProperty {
        val builder = CfnChannelAudioCodecSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The encoding information for one output audio.
     *
     * The parent of this entity is EncoderSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AudioDescriptionProperty audioDescriptionProperty = AudioDescriptionProperty.builder()
     * .audioNormalizationSettings(AudioNormalizationSettingsProperty.builder()
     * .algorithm("algorithm")
     * .algorithmControl("algorithmControl")
     * .targetLkfs(123)
     * .build())
     * .audioSelectorName("audioSelectorName")
     * .audioType("audioType")
     * .audioTypeControl("audioTypeControl")
     * .audioWatermarkingSettings(AudioWatermarkSettingsProperty.builder()
     * .nielsenWatermarksSettings(NielsenWatermarksSettingsProperty.builder()
     * .nielsenCbetSettings(NielsenCBETProperty.builder()
     * .cbetCheckDigitString("cbetCheckDigitString")
     * .cbetStepaside("cbetStepaside")
     * .csid("csid")
     * .build())
     * .nielsenDistributionType("nielsenDistributionType")
     * .nielsenNaesIiNwSettings(NielsenNaesIiNwProperty.builder()
     * .checkDigitString("checkDigitString")
     * .sid(123)
     * .timezone("timezone")
     * .build())
     * .build())
     * .build())
     * .codecSettings(AudioCodecSettingsProperty.builder()
     * .aacSettings(AacSettingsProperty.builder()
     * .bitrate(123)
     * .codingMode("codingMode")
     * .inputType("inputType")
     * .profile("profile")
     * .rateControlMode("rateControlMode")
     * .rawFormat("rawFormat")
     * .sampleRate(123)
     * .spec("spec")
     * .vbrQuality("vbrQuality")
     * .build())
     * .ac3Settings(Ac3SettingsProperty.builder()
     * .bitrate(123)
     * .bitstreamMode("bitstreamMode")
     * .codingMode("codingMode")
     * .dialnorm(123)
     * .drcProfile("drcProfile")
     * .lfeFilter("lfeFilter")
     * .metadataControl("metadataControl")
     * .build())
     * .eac3AtmosSettings(Eac3AtmosSettingsProperty.builder()
     * .bitrate(123)
     * .codingMode("codingMode")
     * .dialnorm(123)
     * .drcLine("drcLine")
     * .drcRf("drcRf")
     * .heightTrim(123)
     * .surroundTrim(123)
     * .build())
     * .eac3Settings(Eac3SettingsProperty.builder()
     * .attenuationControl("attenuationControl")
     * .bitrate(123)
     * .bitstreamMode("bitstreamMode")
     * .codingMode("codingMode")
     * .dcFilter("dcFilter")
     * .dialnorm(123)
     * .drcLine("drcLine")
     * .drcRf("drcRf")
     * .lfeControl("lfeControl")
     * .lfeFilter("lfeFilter")
     * .loRoCenterMixLevel(123)
     * .loRoSurroundMixLevel(123)
     * .ltRtCenterMixLevel(123)
     * .ltRtSurroundMixLevel(123)
     * .metadataControl("metadataControl")
     * .passthroughControl("passthroughControl")
     * .phaseControl("phaseControl")
     * .stereoDownmix("stereoDownmix")
     * .surroundExMode("surroundExMode")
     * .surroundMode("surroundMode")
     * .build())
     * .mp2Settings(Mp2SettingsProperty.builder()
     * .bitrate(123)
     * .codingMode("codingMode")
     * .sampleRate(123)
     * .build())
     * .passThroughSettings(PassThroughSettingsProperty.builder().build())
     * .wavSettings(WavSettingsProperty.builder()
     * .bitDepth(123)
     * .codingMode("codingMode")
     * .sampleRate(123)
     * .build())
     * .build())
     * .languageCode("languageCode")
     * .languageCodeControl("languageCodeControl")
     * .name("name")
     * .remixSettings(RemixSettingsProperty.builder()
     * .channelMappings(List.of(AudioChannelMappingProperty.builder()
     * .inputChannelLevels(List.of(InputChannelLevelProperty.builder()
     * .gain(123)
     * .inputChannel(123)
     * .build()))
     * .outputChannel(123)
     * .build()))
     * .channelsIn(123)
     * .channelsOut(123)
     * .build())
     * .streamName("streamName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiodescription.html)
     */
    public inline fun cfnChannelAudioDescriptionProperty(
        block: CfnChannelAudioDescriptionPropertyDsl.() -> Unit = {}
    ): CfnChannel.AudioDescriptionProperty {
        val builder = CfnChannelAudioDescriptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AudioDolbyEDecodeProperty audioDolbyEDecodeProperty = AudioDolbyEDecodeProperty.builder()
     * .programSelection("programSelection")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiodolbyedecode.html)
     */
    public inline fun cfnChannelAudioDolbyEDecodeProperty(
        block: CfnChannelAudioDolbyEDecodePropertyDsl.() -> Unit = {}
    ): CfnChannel.AudioDolbyEDecodeProperty {
        val builder = CfnChannelAudioDolbyEDecodePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Selector for HLS audio rendition.
     *
     * The parent of this entity is AudioSelectorSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AudioHlsRenditionSelectionProperty audioHlsRenditionSelectionProperty =
     * AudioHlsRenditionSelectionProperty.builder()
     * .groupId("groupId")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiohlsrenditionselection.html)
     */
    public inline fun cfnChannelAudioHlsRenditionSelectionProperty(
        block: CfnChannelAudioHlsRenditionSelectionPropertyDsl.() -> Unit = {}
    ): CfnChannel.AudioHlsRenditionSelectionProperty {
        val builder = CfnChannelAudioHlsRenditionSelectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the audio language to extract.
     *
     * The parent of this entity is AudioSelectorSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AudioLanguageSelectionProperty audioLanguageSelectionProperty =
     * AudioLanguageSelectionProperty.builder()
     * .languageCode("languageCode")
     * .languageSelectionPolicy("languageSelectionPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiolanguageselection.html)
     */
    public inline fun cfnChannelAudioLanguageSelectionProperty(
        block: CfnChannelAudioLanguageSelectionPropertyDsl.() -> Unit = {}
    ): CfnChannel.AudioLanguageSelectionProperty {
        val builder = CfnChannelAudioLanguageSelectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for normalizing video.
     *
     * The parent of this entity is AudioDescription.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AudioNormalizationSettingsProperty audioNormalizationSettingsProperty =
     * AudioNormalizationSettingsProperty.builder()
     * .algorithm("algorithm")
     * .algorithmControl("algorithmControl")
     * .targetLkfs(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audionormalizationsettings.html)
     */
    public inline fun cfnChannelAudioNormalizationSettingsProperty(
        block: CfnChannelAudioNormalizationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.AudioNormalizationSettingsProperty {
        val builder = CfnChannelAudioNormalizationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of an audio-only HLS output.
     *
     * The parent of this entity is HlsSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AudioOnlyHlsSettingsProperty audioOnlyHlsSettingsProperty =
     * AudioOnlyHlsSettingsProperty.builder()
     * .audioGroupId("audioGroupId")
     * .audioOnlyImage(InputLocationProperty.builder()
     * .passwordParam("passwordParam")
     * .uri("uri")
     * .username("username")
     * .build())
     * .audioTrackType("audioTrackType")
     * .segmentType("segmentType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audioonlyhlssettings.html)
     */
    public inline fun cfnChannelAudioOnlyHlsSettingsProperty(
        block: CfnChannelAudioOnlyHlsSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.AudioOnlyHlsSettingsProperty {
        val builder = CfnChannelAudioOnlyHlsSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used to extract audio by The PID.
     *
     * The parent of this entity is AudioSelectorSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AudioPidSelectionProperty audioPidSelectionProperty = AudioPidSelectionProperty.builder()
     * .pid(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiopidselection.html)
     */
    public inline fun cfnChannelAudioPidSelectionProperty(
        block: CfnChannelAudioPidSelectionPropertyDsl.() -> Unit = {}
    ): CfnChannel.AudioPidSelectionProperty {
        val builder = CfnChannelAudioPidSelectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about one audio to extract from the input.
     *
     * The parent of this entity is InputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AudioSelectorProperty audioSelectorProperty = AudioSelectorProperty.builder()
     * .name("name")
     * .selectorSettings(AudioSelectorSettingsProperty.builder()
     * .audioHlsRenditionSelection(AudioHlsRenditionSelectionProperty.builder()
     * .groupId("groupId")
     * .name("name")
     * .build())
     * .audioLanguageSelection(AudioLanguageSelectionProperty.builder()
     * .languageCode("languageCode")
     * .languageSelectionPolicy("languageSelectionPolicy")
     * .build())
     * .audioPidSelection(AudioPidSelectionProperty.builder()
     * .pid(123)
     * .build())
     * .audioTrackSelection(AudioTrackSelectionProperty.builder()
     * .dolbyEDecode(AudioDolbyEDecodeProperty.builder()
     * .programSelection("programSelection")
     * .build())
     * .tracks(List.of(AudioTrackProperty.builder()
     * .track(123)
     * .build()))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audioselector.html)
     */
    public inline fun cfnChannelAudioSelectorProperty(
        block: CfnChannelAudioSelectorPropertyDsl.() -> Unit = {}
    ): CfnChannel.AudioSelectorProperty {
        val builder = CfnChannelAudioSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the audio to extract from the input.
     *
     * The parent of this entity is AudioSelector.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AudioSelectorSettingsProperty audioSelectorSettingsProperty =
     * AudioSelectorSettingsProperty.builder()
     * .audioHlsRenditionSelection(AudioHlsRenditionSelectionProperty.builder()
     * .groupId("groupId")
     * .name("name")
     * .build())
     * .audioLanguageSelection(AudioLanguageSelectionProperty.builder()
     * .languageCode("languageCode")
     * .languageSelectionPolicy("languageSelectionPolicy")
     * .build())
     * .audioPidSelection(AudioPidSelectionProperty.builder()
     * .pid(123)
     * .build())
     * .audioTrackSelection(AudioTrackSelectionProperty.builder()
     * .dolbyEDecode(AudioDolbyEDecodeProperty.builder()
     * .programSelection("programSelection")
     * .build())
     * .tracks(List.of(AudioTrackProperty.builder()
     * .track(123)
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audioselectorsettings.html)
     */
    public inline fun cfnChannelAudioSelectorSettingsProperty(
        block: CfnChannelAudioSelectorSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.AudioSelectorSettingsProperty {
        val builder = CfnChannelAudioSelectorSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * MediaLive will perform a failover if audio is not detected in this input for the specified
     * period.
     *
     * The parent of this entity is FailoverConditionSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AudioSilenceFailoverSettingsProperty audioSilenceFailoverSettingsProperty =
     * AudioSilenceFailoverSettingsProperty.builder()
     * .audioSelectorName("audioSelectorName")
     * .audioSilenceThresholdMsec(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiosilencefailoversettings.html)
     */
    public inline fun cfnChannelAudioSilenceFailoverSettingsProperty(
        block: CfnChannelAudioSilenceFailoverSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.AudioSilenceFailoverSettingsProperty {
        val builder = CfnChannelAudioSilenceFailoverSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about one audio track to extract. You can select multiple tracks.
     *
     * The parent of this entity is AudioTrackSelection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AudioTrackProperty audioTrackProperty = AudioTrackProperty.builder()
     * .track(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiotrack.html)
     */
    public inline fun cfnChannelAudioTrackProperty(
        block: CfnChannelAudioTrackPropertyDsl.() -> Unit = {}
    ): CfnChannel.AudioTrackProperty {
        val builder = CfnChannelAudioTrackPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the audio track to extract.
     *
     * The parent of this entity is AudioSelectorSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AudioTrackSelectionProperty audioTrackSelectionProperty = AudioTrackSelectionProperty.builder()
     * .dolbyEDecode(AudioDolbyEDecodeProperty.builder()
     * .programSelection("programSelection")
     * .build())
     * .tracks(List.of(AudioTrackProperty.builder()
     * .track(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiotrackselection.html)
     */
    public inline fun cfnChannelAudioTrackSelectionProperty(
        block: CfnChannelAudioTrackSelectionPropertyDsl.() -> Unit = {}
    ): CfnChannel.AudioTrackSelectionProperty {
        val builder = CfnChannelAudioTrackSelectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Audio Watermark Settings.
     *
     * The parent of this entity is AudioDescription.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AudioWatermarkSettingsProperty audioWatermarkSettingsProperty =
     * AudioWatermarkSettingsProperty.builder()
     * .nielsenWatermarksSettings(NielsenWatermarksSettingsProperty.builder()
     * .nielsenCbetSettings(NielsenCBETProperty.builder()
     * .cbetCheckDigitString("cbetCheckDigitString")
     * .cbetStepaside("cbetStepaside")
     * .csid("csid")
     * .build())
     * .nielsenDistributionType("nielsenDistributionType")
     * .nielsenNaesIiNwSettings(NielsenNaesIiNwProperty.builder()
     * .checkDigitString("checkDigitString")
     * .sid(123)
     * .timezone("timezone")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiowatermarksettings.html)
     */
    public inline fun cfnChannelAudioWatermarkSettingsProperty(
        block: CfnChannelAudioWatermarkSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.AudioWatermarkSettingsProperty {
        val builder = CfnChannelAudioWatermarkSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings to configure the conditions that will define the input as unhealthy and that will
     * make MediaLive fail over to the other input in the input failover pair.
     *
     * The parent of this entity is InputAttachment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AutomaticInputFailoverSettingsProperty automaticInputFailoverSettingsProperty =
     * AutomaticInputFailoverSettingsProperty.builder()
     * .errorClearTimeMsec(123)
     * .failoverConditions(List.of(FailoverConditionProperty.builder()
     * .failoverConditionSettings(FailoverConditionSettingsProperty.builder()
     * .audioSilenceSettings(AudioSilenceFailoverSettingsProperty.builder()
     * .audioSelectorName("audioSelectorName")
     * .audioSilenceThresholdMsec(123)
     * .build())
     * .inputLossSettings(InputLossFailoverSettingsProperty.builder()
     * .inputLossThresholdMsec(123)
     * .build())
     * .videoBlackSettings(VideoBlackFailoverSettingsProperty.builder()
     * .blackDetectThreshold(123)
     * .videoBlackThresholdMsec(123)
     * .build())
     * .build())
     * .build()))
     * .inputPreference("inputPreference")
     * .secondaryInputId("secondaryInputId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-automaticinputfailoversettings.html)
     */
    public inline fun cfnChannelAutomaticInputFailoverSettingsProperty(
        block: CfnChannelAutomaticInputFailoverSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.AutomaticInputFailoverSettingsProperty {
        val builder = CfnChannelAutomaticInputFailoverSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of ad avail blanking in the output.
     *
     * The parent of this entity is EncoderSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AvailBlankingProperty availBlankingProperty = AvailBlankingProperty.builder()
     * .availBlankingImage(InputLocationProperty.builder()
     * .passwordParam("passwordParam")
     * .uri("uri")
     * .username("username")
     * .build())
     * .state("state")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-availblanking.html)
     */
    public inline fun cfnChannelAvailBlankingProperty(
        block: CfnChannelAvailBlankingPropertyDsl.() -> Unit = {}
    ): CfnChannel.AvailBlankingProperty {
        val builder = CfnChannelAvailBlankingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The setup of ad avail handling in the output.
     *
     * The parent of this entity is EncoderSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AvailConfigurationProperty availConfigurationProperty = AvailConfigurationProperty.builder()
     * .availSettings(AvailSettingsProperty.builder()
     * .esam(EsamProperty.builder()
     * .acquisitionPointId("acquisitionPointId")
     * .adAvailOffset(123)
     * .passwordParam("passwordParam")
     * .poisEndpoint("poisEndpoint")
     * .username("username")
     * .zoneIdentity("zoneIdentity")
     * .build())
     * .scte35SpliceInsert(Scte35SpliceInsertProperty.builder()
     * .adAvailOffset(123)
     * .noRegionalBlackoutFlag("noRegionalBlackoutFlag")
     * .webDeliveryAllowedFlag("webDeliveryAllowedFlag")
     * .build())
     * .scte35TimeSignalApos(Scte35TimeSignalAposProperty.builder()
     * .adAvailOffset(123)
     * .noRegionalBlackoutFlag("noRegionalBlackoutFlag")
     * .webDeliveryAllowedFlag("webDeliveryAllowedFlag")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-availconfiguration.html)
     */
    public inline fun cfnChannelAvailConfigurationProperty(
        block: CfnChannelAvailConfigurationPropertyDsl.() -> Unit = {}
    ): CfnChannel.AvailConfigurationProperty {
        val builder = CfnChannelAvailConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for the ad avail setup in the output.
     *
     * The parent of this entity is AvailConfiguration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * AvailSettingsProperty availSettingsProperty = AvailSettingsProperty.builder()
     * .esam(EsamProperty.builder()
     * .acquisitionPointId("acquisitionPointId")
     * .adAvailOffset(123)
     * .passwordParam("passwordParam")
     * .poisEndpoint("poisEndpoint")
     * .username("username")
     * .zoneIdentity("zoneIdentity")
     * .build())
     * .scte35SpliceInsert(Scte35SpliceInsertProperty.builder()
     * .adAvailOffset(123)
     * .noRegionalBlackoutFlag("noRegionalBlackoutFlag")
     * .webDeliveryAllowedFlag("webDeliveryAllowedFlag")
     * .build())
     * .scte35TimeSignalApos(Scte35TimeSignalAposProperty.builder()
     * .adAvailOffset(123)
     * .noRegionalBlackoutFlag("noRegionalBlackoutFlag")
     * .webDeliveryAllowedFlag("webDeliveryAllowedFlag")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-availsettings.html)
     */
    public inline fun cfnChannelAvailSettingsProperty(
        block: CfnChannelAvailSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.AvailSettingsProperty {
        val builder = CfnChannelAvailSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for a blackout slate.
     *
     * The parent of this entity is EncoderSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * BlackoutSlateProperty blackoutSlateProperty = BlackoutSlateProperty.builder()
     * .blackoutSlateImage(InputLocationProperty.builder()
     * .passwordParam("passwordParam")
     * .uri("uri")
     * .username("username")
     * .build())
     * .networkEndBlackout("networkEndBlackout")
     * .networkEndBlackoutImage(InputLocationProperty.builder()
     * .passwordParam("passwordParam")
     * .uri("uri")
     * .username("username")
     * .build())
     * .networkId("networkId")
     * .state("state")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-blackoutslate.html)
     */
    public inline fun cfnChannelBlackoutSlateProperty(
        block: CfnChannelBlackoutSlatePropertyDsl.() -> Unit = {}
    ): CfnChannel.BlackoutSlateProperty {
        val builder = CfnChannelBlackoutSlatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for burn-in captions in the output.
     *
     * The parent of this entity is CaptionDestinationSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * BurnInDestinationSettingsProperty burnInDestinationSettingsProperty =
     * BurnInDestinationSettingsProperty.builder()
     * .alignment("alignment")
     * .backgroundColor("backgroundColor")
     * .backgroundOpacity(123)
     * .font(InputLocationProperty.builder()
     * .passwordParam("passwordParam")
     * .uri("uri")
     * .username("username")
     * .build())
     * .fontColor("fontColor")
     * .fontOpacity(123)
     * .fontResolution(123)
     * .fontSize("fontSize")
     * .outlineColor("outlineColor")
     * .outlineSize(123)
     * .shadowColor("shadowColor")
     * .shadowOpacity(123)
     * .shadowXOffset(123)
     * .shadowYOffset(123)
     * .teletextGridControl("teletextGridControl")
     * .xPosition(123)
     * .yPosition(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-burnindestinationsettings.html)
     */
    public inline fun cfnChannelBurnInDestinationSettingsProperty(
        block: CfnChannelBurnInDestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.BurnInDestinationSettingsProperty {
        val builder = CfnChannelBurnInDestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The encoding information for output captions.
     *
     * The parent of this entity is EncoderSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * CaptionDescriptionProperty captionDescriptionProperty = CaptionDescriptionProperty.builder()
     * .accessibility("accessibility")
     * .captionSelectorName("captionSelectorName")
     * .destinationSettings(CaptionDestinationSettingsProperty.builder()
     * .aribDestinationSettings(AribDestinationSettingsProperty.builder().build())
     * .burnInDestinationSettings(BurnInDestinationSettingsProperty.builder()
     * .alignment("alignment")
     * .backgroundColor("backgroundColor")
     * .backgroundOpacity(123)
     * .font(InputLocationProperty.builder()
     * .passwordParam("passwordParam")
     * .uri("uri")
     * .username("username")
     * .build())
     * .fontColor("fontColor")
     * .fontOpacity(123)
     * .fontResolution(123)
     * .fontSize("fontSize")
     * .outlineColor("outlineColor")
     * .outlineSize(123)
     * .shadowColor("shadowColor")
     * .shadowOpacity(123)
     * .shadowXOffset(123)
     * .shadowYOffset(123)
     * .teletextGridControl("teletextGridControl")
     * .xPosition(123)
     * .yPosition(123)
     * .build())
     * .dvbSubDestinationSettings(DvbSubDestinationSettingsProperty.builder()
     * .alignment("alignment")
     * .backgroundColor("backgroundColor")
     * .backgroundOpacity(123)
     * .font(InputLocationProperty.builder()
     * .passwordParam("passwordParam")
     * .uri("uri")
     * .username("username")
     * .build())
     * .fontColor("fontColor")
     * .fontOpacity(123)
     * .fontResolution(123)
     * .fontSize("fontSize")
     * .outlineColor("outlineColor")
     * .outlineSize(123)
     * .shadowColor("shadowColor")
     * .shadowOpacity(123)
     * .shadowXOffset(123)
     * .shadowYOffset(123)
     * .teletextGridControl("teletextGridControl")
     * .xPosition(123)
     * .yPosition(123)
     * .build())
     * .ebuTtDDestinationSettings(EbuTtDDestinationSettingsProperty.builder()
     * .copyrightHolder("copyrightHolder")
     * .fillLineGap("fillLineGap")
     * .fontFamily("fontFamily")
     * .styleControl("styleControl")
     * .build())
     * .embeddedDestinationSettings(EmbeddedDestinationSettingsProperty.builder().build())
     * .embeddedPlusScte20DestinationSettings(EmbeddedPlusScte20DestinationSettingsProperty.builder().build())
     * .rtmpCaptionInfoDestinationSettings(RtmpCaptionInfoDestinationSettingsProperty.builder().build())
     * .scte20PlusEmbeddedDestinationSettings(Scte20PlusEmbeddedDestinationSettingsProperty.builder().build())
     * .scte27DestinationSettings(Scte27DestinationSettingsProperty.builder().build())
     * .smpteTtDestinationSettings(SmpteTtDestinationSettingsProperty.builder().build())
     * .teletextDestinationSettings(TeletextDestinationSettingsProperty.builder().build())
     * .ttmlDestinationSettings(TtmlDestinationSettingsProperty.builder()
     * .styleControl("styleControl")
     * .build())
     * .webvttDestinationSettings(WebvttDestinationSettingsProperty.builder()
     * .styleControl("styleControl")
     * .build())
     * .build())
     * .languageCode("languageCode")
     * .languageDescription("languageDescription")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captiondescription.html)
     */
    public inline fun cfnChannelCaptionDescriptionProperty(
        block: CfnChannelCaptionDescriptionPropertyDsl.() -> Unit = {}
    ): CfnChannel.CaptionDescriptionProperty {
        val builder = CfnChannelCaptionDescriptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of one captions encode in the output.
     *
     * The parent of this entity is CaptionDescription.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * CaptionDestinationSettingsProperty captionDestinationSettingsProperty =
     * CaptionDestinationSettingsProperty.builder()
     * .aribDestinationSettings(AribDestinationSettingsProperty.builder().build())
     * .burnInDestinationSettings(BurnInDestinationSettingsProperty.builder()
     * .alignment("alignment")
     * .backgroundColor("backgroundColor")
     * .backgroundOpacity(123)
     * .font(InputLocationProperty.builder()
     * .passwordParam("passwordParam")
     * .uri("uri")
     * .username("username")
     * .build())
     * .fontColor("fontColor")
     * .fontOpacity(123)
     * .fontResolution(123)
     * .fontSize("fontSize")
     * .outlineColor("outlineColor")
     * .outlineSize(123)
     * .shadowColor("shadowColor")
     * .shadowOpacity(123)
     * .shadowXOffset(123)
     * .shadowYOffset(123)
     * .teletextGridControl("teletextGridControl")
     * .xPosition(123)
     * .yPosition(123)
     * .build())
     * .dvbSubDestinationSettings(DvbSubDestinationSettingsProperty.builder()
     * .alignment("alignment")
     * .backgroundColor("backgroundColor")
     * .backgroundOpacity(123)
     * .font(InputLocationProperty.builder()
     * .passwordParam("passwordParam")
     * .uri("uri")
     * .username("username")
     * .build())
     * .fontColor("fontColor")
     * .fontOpacity(123)
     * .fontResolution(123)
     * .fontSize("fontSize")
     * .outlineColor("outlineColor")
     * .outlineSize(123)
     * .shadowColor("shadowColor")
     * .shadowOpacity(123)
     * .shadowXOffset(123)
     * .shadowYOffset(123)
     * .teletextGridControl("teletextGridControl")
     * .xPosition(123)
     * .yPosition(123)
     * .build())
     * .ebuTtDDestinationSettings(EbuTtDDestinationSettingsProperty.builder()
     * .copyrightHolder("copyrightHolder")
     * .fillLineGap("fillLineGap")
     * .fontFamily("fontFamily")
     * .styleControl("styleControl")
     * .build())
     * .embeddedDestinationSettings(EmbeddedDestinationSettingsProperty.builder().build())
     * .embeddedPlusScte20DestinationSettings(EmbeddedPlusScte20DestinationSettingsProperty.builder().build())
     * .rtmpCaptionInfoDestinationSettings(RtmpCaptionInfoDestinationSettingsProperty.builder().build())
     * .scte20PlusEmbeddedDestinationSettings(Scte20PlusEmbeddedDestinationSettingsProperty.builder().build())
     * .scte27DestinationSettings(Scte27DestinationSettingsProperty.builder().build())
     * .smpteTtDestinationSettings(SmpteTtDestinationSettingsProperty.builder().build())
     * .teletextDestinationSettings(TeletextDestinationSettingsProperty.builder().build())
     * .ttmlDestinationSettings(TtmlDestinationSettingsProperty.builder()
     * .styleControl("styleControl")
     * .build())
     * .webvttDestinationSettings(WebvttDestinationSettingsProperty.builder()
     * .styleControl("styleControl")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captiondestinationsettings.html)
     */
    public inline fun cfnChannelCaptionDestinationSettingsProperty(
        block: CfnChannelCaptionDestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.CaptionDestinationSettingsProperty {
        val builder = CfnChannelCaptionDestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Maps a captions channel to an ISO 693-2 language code
     * (http://www.loc.gov/standards/iso639-2), with an optional description.
     *
     * The parent of this entity is HlsGroupSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * CaptionLanguageMappingProperty captionLanguageMappingProperty =
     * CaptionLanguageMappingProperty.builder()
     * .captionChannel(123)
     * .languageCode("languageCode")
     * .languageDescription("languageDescription")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionlanguagemapping.html)
     */
    public inline fun cfnChannelCaptionLanguageMappingProperty(
        block: CfnChannelCaptionLanguageMappingPropertyDsl.() -> Unit = {}
    ): CfnChannel.CaptionLanguageMappingProperty {
        val builder = CfnChannelCaptionLanguageMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings to configure the caption rectangle for an output captions that will be created using
     * this Teletext source captions.
     *
     * The parent of this entity is TeletextSourceSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * CaptionRectangleProperty captionRectangleProperty = CaptionRectangleProperty.builder()
     * .height(123)
     * .leftOffset(123)
     * .topOffset(123)
     * .width(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionrectangle.html)
     */
    public inline fun cfnChannelCaptionRectangleProperty(
        block: CfnChannelCaptionRectanglePropertyDsl.() -> Unit = {}
    ): CfnChannel.CaptionRectangleProperty {
        val builder = CfnChannelCaptionRectanglePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about one caption to extract from the input.
     *
     * The parent of this entity is InputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * CaptionSelectorProperty captionSelectorProperty = CaptionSelectorProperty.builder()
     * .languageCode("languageCode")
     * .name("name")
     * .selectorSettings(CaptionSelectorSettingsProperty.builder()
     * .ancillarySourceSettings(AncillarySourceSettingsProperty.builder()
     * .sourceAncillaryChannelNumber(123)
     * .build())
     * .aribSourceSettings(AribSourceSettingsProperty.builder().build())
     * .dvbSubSourceSettings(DvbSubSourceSettingsProperty.builder()
     * .ocrLanguage("ocrLanguage")
     * .pid(123)
     * .build())
     * .embeddedSourceSettings(EmbeddedSourceSettingsProperty.builder()
     * .convert608To708("convert608To708")
     * .scte20Detection("scte20Detection")
     * .source608ChannelNumber(123)
     * .source608TrackNumber(123)
     * .build())
     * .scte20SourceSettings(Scte20SourceSettingsProperty.builder()
     * .convert608To708("convert608To708")
     * .source608ChannelNumber(123)
     * .build())
     * .scte27SourceSettings(Scte27SourceSettingsProperty.builder()
     * .ocrLanguage("ocrLanguage")
     * .pid(123)
     * .build())
     * .teletextSourceSettings(TeletextSourceSettingsProperty.builder()
     * .outputRectangle(CaptionRectangleProperty.builder()
     * .height(123)
     * .leftOffset(123)
     * .topOffset(123)
     * .width(123)
     * .build())
     * .pageNumber("pageNumber")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselector.html)
     */
    public inline fun cfnChannelCaptionSelectorProperty(
        block: CfnChannelCaptionSelectorPropertyDsl.() -> Unit = {}
    ): CfnChannel.CaptionSelectorProperty {
        val builder = CfnChannelCaptionSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Captions Selector Settings.
     *
     * The parent of this entity is CaptionSelector.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * CaptionSelectorSettingsProperty captionSelectorSettingsProperty =
     * CaptionSelectorSettingsProperty.builder()
     * .ancillarySourceSettings(AncillarySourceSettingsProperty.builder()
     * .sourceAncillaryChannelNumber(123)
     * .build())
     * .aribSourceSettings(AribSourceSettingsProperty.builder().build())
     * .dvbSubSourceSettings(DvbSubSourceSettingsProperty.builder()
     * .ocrLanguage("ocrLanguage")
     * .pid(123)
     * .build())
     * .embeddedSourceSettings(EmbeddedSourceSettingsProperty.builder()
     * .convert608To708("convert608To708")
     * .scte20Detection("scte20Detection")
     * .source608ChannelNumber(123)
     * .source608TrackNumber(123)
     * .build())
     * .scte20SourceSettings(Scte20SourceSettingsProperty.builder()
     * .convert608To708("convert608To708")
     * .source608ChannelNumber(123)
     * .build())
     * .scte27SourceSettings(Scte27SourceSettingsProperty.builder()
     * .ocrLanguage("ocrLanguage")
     * .pid(123)
     * .build())
     * .teletextSourceSettings(TeletextSourceSettingsProperty.builder()
     * .outputRectangle(CaptionRectangleProperty.builder()
     * .height(123)
     * .leftOffset(123)
     * .topOffset(123)
     * .width(123)
     * .build())
     * .pageNumber("pageNumber")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselectorsettings.html)
     */
    public inline fun cfnChannelCaptionSelectorSettingsProperty(
        block: CfnChannelCaptionSelectorSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.CaptionSelectorSettingsProperty {
        val builder = CfnChannelCaptionSelectorSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The input specification for this channel.
     *
     * It specifies the key characteristics of CDI inputs for this channel, when those
     * characteristics are different from other inputs.
     *
     * This entity is at the top level in the channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * CdiInputSpecificationProperty cdiInputSpecificationProperty =
     * CdiInputSpecificationProperty.builder()
     * .resolution("resolution")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-cdiinputspecification.html)
     */
    public inline fun cfnChannelCdiInputSpecificationProperty(
        block: CfnChannelCdiInputSpecificationPropertyDsl.() -> Unit = {}
    ): CfnChannel.CdiInputSpecificationProperty {
        val builder = CfnChannelCdiInputSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Passthrough applies no color space conversion to the output.
     *
     * The parents of this entity are H264ColorSpaceSettings and H265ColorSpaceSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * ColorSpacePassthroughSettingsProperty colorSpacePassthroughSettingsProperty =
     * ColorSpacePassthroughSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-colorspacepassthroughsettings.html)
     */
    public inline fun cfnChannelColorSpacePassthroughSettingsProperty(
        block: CfnChannelColorSpacePassthroughSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.ColorSpacePassthroughSettingsProperty {
        val builder = CfnChannelColorSpacePassthroughSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * DolbyVision81SettingsProperty dolbyVision81SettingsProperty =
     * DolbyVision81SettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dolbyvision81settings.html)
     */
    public inline fun cfnChannelDolbyVision81SettingsProperty(
        block: CfnChannelDolbyVision81SettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.DolbyVision81SettingsProperty {
        val builder = CfnChannelDolbyVision81SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of DVB NIT.
     *
     * The parent of this entity is M2tsSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * DvbNitSettingsProperty dvbNitSettingsProperty = DvbNitSettingsProperty.builder()
     * .networkId(123)
     * .networkName("networkName")
     * .repInterval(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbnitsettings.html)
     */
    public inline fun cfnChannelDvbNitSettingsProperty(
        block: CfnChannelDvbNitSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.DvbNitSettingsProperty {
        val builder = CfnChannelDvbNitSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A DVB Service Description Table (SDT).
     *
     * The parent of this entity is M2tsSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * DvbSdtSettingsProperty dvbSdtSettingsProperty = DvbSdtSettingsProperty.builder()
     * .outputSdt("outputSdt")
     * .repInterval(123)
     * .serviceName("serviceName")
     * .serviceProviderName("serviceProviderName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbsdtsettings.html)
     */
    public inline fun cfnChannelDvbSdtSettingsProperty(
        block: CfnChannelDvbSdtSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.DvbSdtSettingsProperty {
        val builder = CfnChannelDvbSdtSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for DVB Sub captions in the output.
     *
     * The parent of this entity is CaptionDestinationSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * DvbSubDestinationSettingsProperty dvbSubDestinationSettingsProperty =
     * DvbSubDestinationSettingsProperty.builder()
     * .alignment("alignment")
     * .backgroundColor("backgroundColor")
     * .backgroundOpacity(123)
     * .font(InputLocationProperty.builder()
     * .passwordParam("passwordParam")
     * .uri("uri")
     * .username("username")
     * .build())
     * .fontColor("fontColor")
     * .fontOpacity(123)
     * .fontResolution(123)
     * .fontSize("fontSize")
     * .outlineColor("outlineColor")
     * .outlineSize(123)
     * .shadowColor("shadowColor")
     * .shadowOpacity(123)
     * .shadowXOffset(123)
     * .shadowYOffset(123)
     * .teletextGridControl("teletextGridControl")
     * .xPosition(123)
     * .yPosition(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbsubdestinationsettings.html)
     */
    public inline fun cfnChannelDvbSubDestinationSettingsProperty(
        block: CfnChannelDvbSubDestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.DvbSubDestinationSettingsProperty {
        val builder = CfnChannelDvbSubDestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the DVB Sub captions to extract from the input.
     *
     * The parent of this entity is CaptionSelectorSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * DvbSubSourceSettingsProperty dvbSubSourceSettingsProperty =
     * DvbSubSourceSettingsProperty.builder()
     * .ocrLanguage("ocrLanguage")
     * .pid(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbsubsourcesettings.html)
     */
    public inline fun cfnChannelDvbSubSourceSettingsProperty(
        block: CfnChannelDvbSubSourceSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.DvbSubSourceSettingsProperty {
        val builder = CfnChannelDvbSubSourceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The DVB Time and Date Table (TDT).
     *
     * The parent of this entity is M2tsSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * DvbTdtSettingsProperty dvbTdtSettingsProperty = DvbTdtSettingsProperty.builder()
     * .repInterval(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbtdtsettings.html)
     */
    public inline fun cfnChannelDvbTdtSettingsProperty(
        block: CfnChannelDvbTdtSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.DvbTdtSettingsProperty {
        val builder = CfnChannelDvbTdtSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Eac3AtmosSettingsProperty eac3AtmosSettingsProperty = Eac3AtmosSettingsProperty.builder()
     * .bitrate(123)
     * .codingMode("codingMode")
     * .dialnorm(123)
     * .drcLine("drcLine")
     * .drcRf("drcRf")
     * .heightTrim(123)
     * .surroundTrim(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-eac3atmossettings.html)
     */
    public inline fun cfnChannelEac3AtmosSettingsProperty(
        block: CfnChannelEac3AtmosSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.Eac3AtmosSettingsProperty {
        val builder = CfnChannelEac3AtmosSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for an EAC3 audio encode in the output.
     *
     * The parent of this entity is AudioCodecSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Eac3SettingsProperty eac3SettingsProperty = Eac3SettingsProperty.builder()
     * .attenuationControl("attenuationControl")
     * .bitrate(123)
     * .bitstreamMode("bitstreamMode")
     * .codingMode("codingMode")
     * .dcFilter("dcFilter")
     * .dialnorm(123)
     * .drcLine("drcLine")
     * .drcRf("drcRf")
     * .lfeControl("lfeControl")
     * .lfeFilter("lfeFilter")
     * .loRoCenterMixLevel(123)
     * .loRoSurroundMixLevel(123)
     * .ltRtCenterMixLevel(123)
     * .ltRtSurroundMixLevel(123)
     * .metadataControl("metadataControl")
     * .passthroughControl("passthroughControl")
     * .phaseControl("phaseControl")
     * .stereoDownmix("stereoDownmix")
     * .surroundExMode("surroundExMode")
     * .surroundMode("surroundMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-eac3settings.html)
     */
    public inline fun cfnChannelEac3SettingsProperty(
        block: CfnChannelEac3SettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.Eac3SettingsProperty {
        val builder = CfnChannelEac3SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for EBU-TT captions in the output.
     *
     * The parent of this entity is CaptionDestinationSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * EbuTtDDestinationSettingsProperty ebuTtDDestinationSettingsProperty =
     * EbuTtDDestinationSettingsProperty.builder()
     * .copyrightHolder("copyrightHolder")
     * .fillLineGap("fillLineGap")
     * .fontFamily("fontFamily")
     * .styleControl("styleControl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-ebuttddestinationsettings.html)
     */
    public inline fun cfnChannelEbuTtDDestinationSettingsProperty(
        block: CfnChannelEbuTtDDestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.EbuTtDDestinationSettingsProperty {
        val builder = CfnChannelEbuTtDDestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of embedded captions in the output.
     *
     * The parent of this entity is CaptionDestinationSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * EmbeddedDestinationSettingsProperty embeddedDestinationSettingsProperty =
     * EmbeddedDestinationSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddeddestinationsettings.html)
     */
    public inline fun cfnChannelEmbeddedDestinationSettingsProperty(
        block: CfnChannelEmbeddedDestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.EmbeddedDestinationSettingsProperty {
        val builder = CfnChannelEmbeddedDestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for embedded plus SCTE-20 captions in the output.
     *
     * The parent of this entity is CaptionDestinationSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * EmbeddedPlusScte20DestinationSettingsProperty embeddedPlusScte20DestinationSettingsProperty =
     * EmbeddedPlusScte20DestinationSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedplusscte20destinationsettings.html)
     */
    public inline fun cfnChannelEmbeddedPlusScte20DestinationSettingsProperty(
        block: CfnChannelEmbeddedPlusScte20DestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty {
        val builder = CfnChannelEmbeddedPlusScte20DestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the embedded captions to extract from the input.
     *
     * The parent of this entity is CaptionSelectorSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * EmbeddedSourceSettingsProperty embeddedSourceSettingsProperty =
     * EmbeddedSourceSettingsProperty.builder()
     * .convert608To708("convert608To708")
     * .scte20Detection("scte20Detection")
     * .source608ChannelNumber(123)
     * .source608TrackNumber(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html)
     */
    public inline fun cfnChannelEmbeddedSourceSettingsProperty(
        block: CfnChannelEmbeddedSourceSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.EmbeddedSourceSettingsProperty {
        val builder = CfnChannelEmbeddedSourceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for the encoding of outputs.
     *
     * This entity is at the top level in the channel.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-encodersettings.html)
     */
    public inline fun cfnChannelEncoderSettingsProperty(
        block: CfnChannelEncoderSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.EncoderSettingsProperty {
        val builder = CfnChannelEncoderSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * EsamProperty esamProperty = EsamProperty.builder()
     * .acquisitionPointId("acquisitionPointId")
     * .adAvailOffset(123)
     * .passwordParam("passwordParam")
     * .poisEndpoint("poisEndpoint")
     * .username("username")
     * .zoneIdentity("zoneIdentity")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-esam.html)
     */
    public inline fun cfnChannelEsamProperty(
        block: CfnChannelEsamPropertyDsl.() -> Unit = {}
    ): CfnChannel.EsamProperty {
        val builder = CfnChannelEsamPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Failover Condition settings. There can be multiple failover conditions inside
     * AutomaticInputFailoverSettings.
     *
     * The parent of this entity is AutomaticInputFailoverSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * FailoverConditionProperty failoverConditionProperty = FailoverConditionProperty.builder()
     * .failoverConditionSettings(FailoverConditionSettingsProperty.builder()
     * .audioSilenceSettings(AudioSilenceFailoverSettingsProperty.builder()
     * .audioSelectorName("audioSelectorName")
     * .audioSilenceThresholdMsec(123)
     * .build())
     * .inputLossSettings(InputLossFailoverSettingsProperty.builder()
     * .inputLossThresholdMsec(123)
     * .build())
     * .videoBlackSettings(VideoBlackFailoverSettingsProperty.builder()
     * .blackDetectThreshold(123)
     * .videoBlackThresholdMsec(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-failovercondition.html)
     */
    public inline fun cfnChannelFailoverConditionProperty(
        block: CfnChannelFailoverConditionPropertyDsl.() -> Unit = {}
    ): CfnChannel.FailoverConditionProperty {
        val builder = CfnChannelFailoverConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for one failover condition.
     *
     * The parent of this entity is FailoverCondition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * FailoverConditionSettingsProperty failoverConditionSettingsProperty =
     * FailoverConditionSettingsProperty.builder()
     * .audioSilenceSettings(AudioSilenceFailoverSettingsProperty.builder()
     * .audioSelectorName("audioSelectorName")
     * .audioSilenceThresholdMsec(123)
     * .build())
     * .inputLossSettings(InputLossFailoverSettingsProperty.builder()
     * .inputLossThresholdMsec(123)
     * .build())
     * .videoBlackSettings(VideoBlackFailoverSettingsProperty.builder()
     * .blackDetectThreshold(123)
     * .videoBlackThresholdMsec(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-failoverconditionsettings.html)
     */
    public inline fun cfnChannelFailoverConditionSettingsProperty(
        block: CfnChannelFailoverConditionSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.FailoverConditionSettingsProperty {
        val builder = CfnChannelFailoverConditionSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings to enable specific features. You can't configure these features until you have
     * enabled them in the channel.
     *
     * The parent of this entity is EncoderSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * FeatureActivationsProperty featureActivationsProperty = FeatureActivationsProperty.builder()
     * .inputPrepareScheduleActions("inputPrepareScheduleActions")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-featureactivations.html)
     */
    public inline fun cfnChannelFeatureActivationsProperty(
        block: CfnChannelFeatureActivationsPropertyDsl.() -> Unit = {}
    ): CfnChannel.FeatureActivationsProperty {
        val builder = CfnChannelFeatureActivationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for FEC.
     *
     * The parent of this entity is UdpOutputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * FecOutputSettingsProperty fecOutputSettingsProperty = FecOutputSettingsProperty.builder()
     * .columnDepth(123)
     * .includeFec("includeFec")
     * .rowLength(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-fecoutputsettings.html)
     */
    public inline fun cfnChannelFecOutputSettingsProperty(
        block: CfnChannelFecOutputSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.FecOutputSettingsProperty {
        val builder = CfnChannelFecOutputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for the fMP4 containers.
     *
     * The parent of this entity is HlsSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Fmp4HlsSettingsProperty fmp4HlsSettingsProperty = Fmp4HlsSettingsProperty.builder()
     * .audioRenditionSets("audioRenditionSets")
     * .nielsenId3Behavior("nielsenId3Behavior")
     * .timedMetadataBehavior("timedMetadataBehavior")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-fmp4hlssettings.html)
     */
    public inline fun cfnChannelFmp4HlsSettingsProperty(
        block: CfnChannelFmp4HlsSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.Fmp4HlsSettingsProperty {
        val builder = CfnChannelFmp4HlsSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings to configure the destination of a Frame Capture output.
     *
     * The parent of this entity is FrameCaptureGroupSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * FrameCaptureCdnSettingsProperty frameCaptureCdnSettingsProperty =
     * FrameCaptureCdnSettingsProperty.builder()
     * .frameCaptureS3Settings(FrameCaptureS3SettingsProperty.builder()
     * .cannedAcl("cannedAcl")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-framecapturecdnsettings.html)
     */
    public inline fun cfnChannelFrameCaptureCdnSettingsProperty(
        block: CfnChannelFrameCaptureCdnSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.FrameCaptureCdnSettingsProperty {
        val builder = CfnChannelFrameCaptureCdnSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for a frame capture output group.
     *
     * The parent of this entity is OutputGroupSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * FrameCaptureGroupSettingsProperty frameCaptureGroupSettingsProperty =
     * FrameCaptureGroupSettingsProperty.builder()
     * .destination(OutputLocationRefProperty.builder()
     * .destinationRefId("destinationRefId")
     * .build())
     * .frameCaptureCdnSettings(FrameCaptureCdnSettingsProperty.builder()
     * .frameCaptureS3Settings(FrameCaptureS3SettingsProperty.builder()
     * .cannedAcl("cannedAcl")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-framecapturegroupsettings.html)
     */
    public inline fun cfnChannelFrameCaptureGroupSettingsProperty(
        block: CfnChannelFrameCaptureGroupSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.FrameCaptureGroupSettingsProperty {
        val builder = CfnChannelFrameCaptureGroupSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for a frame capture output in an HLS output group.
     *
     * The parent of this entity is HlsSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * FrameCaptureHlsSettingsProperty frameCaptureHlsSettingsProperty =
     * FrameCaptureHlsSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-framecapturehlssettings.html)
     */
    public inline fun cfnChannelFrameCaptureHlsSettingsProperty(
        block: CfnChannelFrameCaptureHlsSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.FrameCaptureHlsSettingsProperty {
        val builder = CfnChannelFrameCaptureHlsSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The frame capture output settings.
     *
     * The parent of this entity is OutputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * FrameCaptureOutputSettingsProperty frameCaptureOutputSettingsProperty =
     * FrameCaptureOutputSettingsProperty.builder()
     * .nameModifier("nameModifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-framecaptureoutputsettings.html)
     */
    public inline fun cfnChannelFrameCaptureOutputSettingsProperty(
        block: CfnChannelFrameCaptureOutputSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.FrameCaptureOutputSettingsProperty {
        val builder = CfnChannelFrameCaptureOutputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Sets up Amazon S3 as the destination for this Frame Capture output.
     *
     * The parent of this entity is FrameCaptureCdnSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * FrameCaptureS3SettingsProperty frameCaptureS3SettingsProperty =
     * FrameCaptureS3SettingsProperty.builder()
     * .cannedAcl("cannedAcl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-framecaptures3settings.html)
     */
    public inline fun cfnChannelFrameCaptureS3SettingsProperty(
        block: CfnChannelFrameCaptureS3SettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.FrameCaptureS3SettingsProperty {
        val builder = CfnChannelFrameCaptureS3SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The frame capture settings.
     *
     * The parent of this entity is VideoCodecSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * FrameCaptureSettingsProperty frameCaptureSettingsProperty =
     * FrameCaptureSettingsProperty.builder()
     * .captureInterval(123)
     * .captureIntervalUnits("captureIntervalUnits")
     * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
     * .fontSize("fontSize")
     * .position("position")
     * .prefix("prefix")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-framecapturesettings.html)
     */
    public inline fun cfnChannelFrameCaptureSettingsProperty(
        block: CfnChannelFrameCaptureSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.FrameCaptureSettingsProperty {
        val builder = CfnChannelFrameCaptureSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration settings that apply to the entire channel.
     *
     * The parent of this entity is EncoderSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * GlobalConfigurationProperty globalConfigurationProperty = GlobalConfigurationProperty.builder()
     * .initialAudioGain(123)
     * .inputEndAction("inputEndAction")
     * .inputLossBehavior(InputLossBehaviorProperty.builder()
     * .blackFrameMsec(123)
     * .inputLossImageColor("inputLossImageColor")
     * .inputLossImageSlate(InputLocationProperty.builder()
     * .passwordParam("passwordParam")
     * .uri("uri")
     * .username("username")
     * .build())
     * .inputLossImageType("inputLossImageType")
     * .repeatFrameMsec(123)
     * .build())
     * .outputLockingMode("outputLockingMode")
     * .outputTimingSource("outputTimingSource")
     * .supportLowFramerateInputs("supportLowFramerateInputs")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-globalconfiguration.html)
     */
    public inline fun cfnChannelGlobalConfigurationProperty(
        block: CfnChannelGlobalConfigurationPropertyDsl.() -> Unit = {}
    ): CfnChannel.GlobalConfigurationProperty {
        val builder = CfnChannelGlobalConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for configuring color space in an H264 video encode.
     *
     * The parent of this entity is H264Settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * H264ColorSpaceSettingsProperty h264ColorSpaceSettingsProperty =
     * H264ColorSpaceSettingsProperty.builder()
     * .colorSpacePassthroughSettings(ColorSpacePassthroughSettingsProperty.builder().build())
     * .rec601Settings(Rec601SettingsProperty.builder().build())
     * .rec709Settings(Rec709SettingsProperty.builder().build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-h264colorspacesettings.html)
     */
    public inline fun cfnChannelH264ColorSpaceSettingsProperty(
        block: CfnChannelH264ColorSpaceSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.H264ColorSpaceSettingsProperty {
        val builder = CfnChannelH264ColorSpaceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings to configure video filters that apply to the H264 codec.
     *
     * The parent of this entity is H264Settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * H264FilterSettingsProperty h264FilterSettingsProperty = H264FilterSettingsProperty.builder()
     * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
     * .postFilterSharpening("postFilterSharpening")
     * .strength("strength")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-h264filtersettings.html)
     */
    public inline fun cfnChannelH264FilterSettingsProperty(
        block: CfnChannelH264FilterSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.H264FilterSettingsProperty {
        val builder = CfnChannelH264FilterSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for the H.264 codec in the output.
     *
     * The parent of this entity is VideoCodecSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * H264SettingsProperty h264SettingsProperty = H264SettingsProperty.builder()
     * .adaptiveQuantization("adaptiveQuantization")
     * .afdSignaling("afdSignaling")
     * .bitrate(123)
     * .bufFillPct(123)
     * .bufSize(123)
     * .colorMetadata("colorMetadata")
     * .colorSpaceSettings(H264ColorSpaceSettingsProperty.builder()
     * .colorSpacePassthroughSettings(ColorSpacePassthroughSettingsProperty.builder().build())
     * .rec601Settings(Rec601SettingsProperty.builder().build())
     * .rec709Settings(Rec709SettingsProperty.builder().build())
     * .build())
     * .entropyEncoding("entropyEncoding")
     * .filterSettings(H264FilterSettingsProperty.builder()
     * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
     * .postFilterSharpening("postFilterSharpening")
     * .strength("strength")
     * .build())
     * .build())
     * .fixedAfd("fixedAfd")
     * .flickerAq("flickerAq")
     * .forceFieldPictures("forceFieldPictures")
     * .framerateControl("framerateControl")
     * .framerateDenominator(123)
     * .framerateNumerator(123)
     * .gopBReference("gopBReference")
     * .gopClosedCadence(123)
     * .gopNumBFrames(123)
     * .gopSize(123)
     * .gopSizeUnits("gopSizeUnits")
     * .level("level")
     * .lookAheadRateControl("lookAheadRateControl")
     * .maxBitrate(123)
     * .minIInterval(123)
     * .numRefFrames(123)
     * .parControl("parControl")
     * .parDenominator(123)
     * .parNumerator(123)
     * .profile("profile")
     * .qualityLevel("qualityLevel")
     * .qvbrQualityLevel(123)
     * .rateControlMode("rateControlMode")
     * .scanType("scanType")
     * .sceneChangeDetect("sceneChangeDetect")
     * .slices(123)
     * .softness(123)
     * .spatialAq("spatialAq")
     * .subgopLength("subgopLength")
     * .syntax("syntax")
     * .temporalAq("temporalAq")
     * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
     * .fontSize("fontSize")
     * .position("position")
     * .prefix("prefix")
     * .build())
     * .timecodeInsertion("timecodeInsertion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-h264settings.html)
     */
    public inline fun cfnChannelH264SettingsProperty(
        block: CfnChannelH264SettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.H264SettingsProperty {
        val builder = CfnChannelH264SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * H265 Color Space Settings.
     *
     * The parent of this entity is H265Settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * H265ColorSpaceSettingsProperty h265ColorSpaceSettingsProperty =
     * H265ColorSpaceSettingsProperty.builder()
     * .colorSpacePassthroughSettings(ColorSpacePassthroughSettingsProperty.builder().build())
     * .dolbyVision81Settings(DolbyVision81SettingsProperty.builder().build())
     * .hdr10Settings(Hdr10SettingsProperty.builder()
     * .maxCll(123)
     * .maxFall(123)
     * .build())
     * .rec601Settings(Rec601SettingsProperty.builder().build())
     * .rec709Settings(Rec709SettingsProperty.builder().build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-h265colorspacesettings.html)
     */
    public inline fun cfnChannelH265ColorSpaceSettingsProperty(
        block: CfnChannelH265ColorSpaceSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.H265ColorSpaceSettingsProperty {
        val builder = CfnChannelH265ColorSpaceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings to configure video filters that apply to the H265 codec.
     *
     * The parent of this entity is H265Settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * H265FilterSettingsProperty h265FilterSettingsProperty = H265FilterSettingsProperty.builder()
     * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
     * .postFilterSharpening("postFilterSharpening")
     * .strength("strength")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-h265filtersettings.html)
     */
    public inline fun cfnChannelH265FilterSettingsProperty(
        block: CfnChannelH265FilterSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.H265FilterSettingsProperty {
        val builder = CfnChannelH265FilterSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * H265 Settings.
     *
     * The parent of this entity is VideoCodecSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * H265SettingsProperty h265SettingsProperty = H265SettingsProperty.builder()
     * .adaptiveQuantization("adaptiveQuantization")
     * .afdSignaling("afdSignaling")
     * .alternativeTransferFunction("alternativeTransferFunction")
     * .bitrate(123)
     * .bufSize(123)
     * .colorMetadata("colorMetadata")
     * .colorSpaceSettings(H265ColorSpaceSettingsProperty.builder()
     * .colorSpacePassthroughSettings(ColorSpacePassthroughSettingsProperty.builder().build())
     * .dolbyVision81Settings(DolbyVision81SettingsProperty.builder().build())
     * .hdr10Settings(Hdr10SettingsProperty.builder()
     * .maxCll(123)
     * .maxFall(123)
     * .build())
     * .rec601Settings(Rec601SettingsProperty.builder().build())
     * .rec709Settings(Rec709SettingsProperty.builder().build())
     * .build())
     * .filterSettings(H265FilterSettingsProperty.builder()
     * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
     * .postFilterSharpening("postFilterSharpening")
     * .strength("strength")
     * .build())
     * .build())
     * .fixedAfd("fixedAfd")
     * .flickerAq("flickerAq")
     * .framerateDenominator(123)
     * .framerateNumerator(123)
     * .gopClosedCadence(123)
     * .gopSize(123)
     * .gopSizeUnits("gopSizeUnits")
     * .level("level")
     * .lookAheadRateControl("lookAheadRateControl")
     * .maxBitrate(123)
     * .minIInterval(123)
     * .parDenominator(123)
     * .parNumerator(123)
     * .profile("profile")
     * .qvbrQualityLevel(123)
     * .rateControlMode("rateControlMode")
     * .scanType("scanType")
     * .sceneChangeDetect("sceneChangeDetect")
     * .slices(123)
     * .tier("tier")
     * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
     * .fontSize("fontSize")
     * .position("position")
     * .prefix("prefix")
     * .build())
     * .timecodeInsertion("timecodeInsertion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-h265settings.html)
     */
    public inline fun cfnChannelH265SettingsProperty(
        block: CfnChannelH265SettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.H265SettingsProperty {
        val builder = CfnChannelH265SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Hdr10 Settings.
     *
     * The parents of this entity are H265ColorSpaceSettings (for color space settings in the
     * output) and VideoSelectorColorSpaceSettings (for color space settings in the input).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Hdr10SettingsProperty hdr10SettingsProperty = Hdr10SettingsProperty.builder()
     * .maxCll(123)
     * .maxFall(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hdr10settings.html)
     */
    public inline fun cfnChannelHdr10SettingsProperty(
        block: CfnChannelHdr10SettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.Hdr10SettingsProperty {
        val builder = CfnChannelHdr10SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Akamai settings in an HLS output.
     *
     * The parent of this entity is HlsCdnSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * HlsAkamaiSettingsProperty hlsAkamaiSettingsProperty = HlsAkamaiSettingsProperty.builder()
     * .connectionRetryInterval(123)
     * .filecacheDuration(123)
     * .httpTransferMode("httpTransferMode")
     * .numRetries(123)
     * .restartDelay(123)
     * .salt("salt")
     * .token("token")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsakamaisettings.html)
     */
    public inline fun cfnChannelHlsAkamaiSettingsProperty(
        block: CfnChannelHlsAkamaiSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.HlsAkamaiSettingsProperty {
        val builder = CfnChannelHlsAkamaiSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of HLS Basic Put Settings.
     *
     * The parent of this entity is HlsCdnSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * HlsBasicPutSettingsProperty hlsBasicPutSettingsProperty = HlsBasicPutSettingsProperty.builder()
     * .connectionRetryInterval(123)
     * .filecacheDuration(123)
     * .numRetries(123)
     * .restartDelay(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsbasicputsettings.html)
     */
    public inline fun cfnChannelHlsBasicPutSettingsProperty(
        block: CfnChannelHlsBasicPutSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.HlsBasicPutSettingsProperty {
        val builder = CfnChannelHlsBasicPutSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for the CDN of an HLS output.
     *
     * The parent of this entity is HlsGroupSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * HlsCdnSettingsProperty hlsCdnSettingsProperty = HlsCdnSettingsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlscdnsettings.html)
     */
    public inline fun cfnChannelHlsCdnSettingsProperty(
        block: CfnChannelHlsCdnSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.HlsCdnSettingsProperty {
        val builder = CfnChannelHlsCdnSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for an HLS output group.
     *
     * The parent of this entity is OutputGroupSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * HlsGroupSettingsProperty hlsGroupSettingsProperty = HlsGroupSettingsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsgroupsettings.html)
     */
    public inline fun cfnChannelHlsGroupSettingsProperty(
        block: CfnChannelHlsGroupSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.HlsGroupSettingsProperty {
        val builder = CfnChannelHlsGroupSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about how to connect to the upstream system.
     *
     * The parent of this entity is NetworkInputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * HlsInputSettingsProperty hlsInputSettingsProperty = HlsInputSettingsProperty.builder()
     * .bandwidth(123)
     * .bufferSegments(123)
     * .retries(123)
     * .retryInterval(123)
     * .scte35Source("scte35Source")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html)
     */
    public inline fun cfnChannelHlsInputSettingsProperty(
        block: CfnChannelHlsInputSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.HlsInputSettingsProperty {
        val builder = CfnChannelHlsInputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of a MediaStore container as the destination for an HLS output.
     *
     * The parent of this entity is HlsCdnSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * HlsMediaStoreSettingsProperty hlsMediaStoreSettingsProperty =
     * HlsMediaStoreSettingsProperty.builder()
     * .connectionRetryInterval(123)
     * .filecacheDuration(123)
     * .mediaStoreStorageClass("mediaStoreStorageClass")
     * .numRetries(123)
     * .restartDelay(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsmediastoresettings.html)
     */
    public inline fun cfnChannelHlsMediaStoreSettingsProperty(
        block: CfnChannelHlsMediaStoreSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.HlsMediaStoreSettingsProperty {
        val builder = CfnChannelHlsMediaStoreSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for an HLS output.
     *
     * The parent of this entity is OutputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * HlsOutputSettingsProperty hlsOutputSettingsProperty = HlsOutputSettingsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsoutputsettings.html)
     */
    public inline fun cfnChannelHlsOutputSettingsProperty(
        block: CfnChannelHlsOutputSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.HlsOutputSettingsProperty {
        val builder = CfnChannelHlsOutputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Sets up Amazon S3 as the destination for this HLS output.
     *
     * The parent of this entity is HlsCdnSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * HlsS3SettingsProperty hlsS3SettingsProperty = HlsS3SettingsProperty.builder()
     * .cannedAcl("cannedAcl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlss3settings.html)
     */
    public inline fun cfnChannelHlsS3SettingsProperty(
        block: CfnChannelHlsS3SettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.HlsS3SettingsProperty {
        val builder = CfnChannelHlsS3SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for an HLS output.
     *
     * The parent of this entity is HlsOutputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * HlsSettingsProperty hlsSettingsProperty = HlsSettingsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlssettings.html)
     */
    public inline fun cfnChannelHlsSettingsProperty(
        block: CfnChannelHlsSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.HlsSettingsProperty {
        val builder = CfnChannelHlsSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of a WebDav server as the downstream system for an HLS output.
     *
     * The parent of this entity is HlsCdnSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * HlsWebdavSettingsProperty hlsWebdavSettingsProperty = HlsWebdavSettingsProperty.builder()
     * .connectionRetryInterval(123)
     * .filecacheDuration(123)
     * .httpTransferMode("httpTransferMode")
     * .numRetries(123)
     * .restartDelay(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlswebdavsettings.html)
     */
    public inline fun cfnChannelHlsWebdavSettingsProperty(
        block: CfnChannelHlsWebdavSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.HlsWebdavSettingsProperty {
        val builder = CfnChannelHlsWebdavSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings to configure the motion graphics overlay to use an HTML asset.
     *
     * The parent of this entity is MotionGraphicsSetting.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * HtmlMotionGraphicsSettingsProperty htmlMotionGraphicsSettingsProperty =
     * HtmlMotionGraphicsSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-htmlmotiongraphicssettings.html)
     */
    public inline fun cfnChannelHtmlMotionGraphicsSettingsProperty(
        block: CfnChannelHtmlMotionGraphicsSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.HtmlMotionGraphicsSettingsProperty {
        val builder = CfnChannelHtmlMotionGraphicsSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An input to attach to this channel.
     *
     * This entity is at the top level in the channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * InputAttachmentProperty inputAttachmentProperty = InputAttachmentProperty.builder()
     * .automaticInputFailoverSettings(AutomaticInputFailoverSettingsProperty.builder()
     * .errorClearTimeMsec(123)
     * .failoverConditions(List.of(FailoverConditionProperty.builder()
     * .failoverConditionSettings(FailoverConditionSettingsProperty.builder()
     * .audioSilenceSettings(AudioSilenceFailoverSettingsProperty.builder()
     * .audioSelectorName("audioSelectorName")
     * .audioSilenceThresholdMsec(123)
     * .build())
     * .inputLossSettings(InputLossFailoverSettingsProperty.builder()
     * .inputLossThresholdMsec(123)
     * .build())
     * .videoBlackSettings(VideoBlackFailoverSettingsProperty.builder()
     * .blackDetectThreshold(123)
     * .videoBlackThresholdMsec(123)
     * .build())
     * .build())
     * .build()))
     * .inputPreference("inputPreference")
     * .secondaryInputId("secondaryInputId")
     * .build())
     * .inputAttachmentName("inputAttachmentName")
     * .inputId("inputId")
     * .inputSettings(InputSettingsProperty.builder()
     * .audioSelectors(List.of(AudioSelectorProperty.builder()
     * .name("name")
     * .selectorSettings(AudioSelectorSettingsProperty.builder()
     * .audioHlsRenditionSelection(AudioHlsRenditionSelectionProperty.builder()
     * .groupId("groupId")
     * .name("name")
     * .build())
     * .audioLanguageSelection(AudioLanguageSelectionProperty.builder()
     * .languageCode("languageCode")
     * .languageSelectionPolicy("languageSelectionPolicy")
     * .build())
     * .audioPidSelection(AudioPidSelectionProperty.builder()
     * .pid(123)
     * .build())
     * .audioTrackSelection(AudioTrackSelectionProperty.builder()
     * .dolbyEDecode(AudioDolbyEDecodeProperty.builder()
     * .programSelection("programSelection")
     * .build())
     * .tracks(List.of(AudioTrackProperty.builder()
     * .track(123)
     * .build()))
     * .build())
     * .build())
     * .build()))
     * .captionSelectors(List.of(CaptionSelectorProperty.builder()
     * .languageCode("languageCode")
     * .name("name")
     * .selectorSettings(CaptionSelectorSettingsProperty.builder()
     * .ancillarySourceSettings(AncillarySourceSettingsProperty.builder()
     * .sourceAncillaryChannelNumber(123)
     * .build())
     * .aribSourceSettings(AribSourceSettingsProperty.builder().build())
     * .dvbSubSourceSettings(DvbSubSourceSettingsProperty.builder()
     * .ocrLanguage("ocrLanguage")
     * .pid(123)
     * .build())
     * .embeddedSourceSettings(EmbeddedSourceSettingsProperty.builder()
     * .convert608To708("convert608To708")
     * .scte20Detection("scte20Detection")
     * .source608ChannelNumber(123)
     * .source608TrackNumber(123)
     * .build())
     * .scte20SourceSettings(Scte20SourceSettingsProperty.builder()
     * .convert608To708("convert608To708")
     * .source608ChannelNumber(123)
     * .build())
     * .scte27SourceSettings(Scte27SourceSettingsProperty.builder()
     * .ocrLanguage("ocrLanguage")
     * .pid(123)
     * .build())
     * .teletextSourceSettings(TeletextSourceSettingsProperty.builder()
     * .outputRectangle(CaptionRectangleProperty.builder()
     * .height(123)
     * .leftOffset(123)
     * .topOffset(123)
     * .width(123)
     * .build())
     * .pageNumber("pageNumber")
     * .build())
     * .build())
     * .build()))
     * .deblockFilter("deblockFilter")
     * .denoiseFilter("denoiseFilter")
     * .filterStrength(123)
     * .inputFilter("inputFilter")
     * .networkInputSettings(NetworkInputSettingsProperty.builder()
     * .hlsInputSettings(HlsInputSettingsProperty.builder()
     * .bandwidth(123)
     * .bufferSegments(123)
     * .retries(123)
     * .retryInterval(123)
     * .scte35Source("scte35Source")
     * .build())
     * .serverValidation("serverValidation")
     * .build())
     * .scte35Pid(123)
     * .smpte2038DataPreference("smpte2038DataPreference")
     * .sourceEndBehavior("sourceEndBehavior")
     * .videoSelector(VideoSelectorProperty.builder()
     * .colorSpace("colorSpace")
     * .colorSpaceSettings(VideoSelectorColorSpaceSettingsProperty.builder()
     * .hdr10Settings(Hdr10SettingsProperty.builder()
     * .maxCll(123)
     * .maxFall(123)
     * .build())
     * .build())
     * .colorSpaceUsage("colorSpaceUsage")
     * .selectorSettings(VideoSelectorSettingsProperty.builder()
     * .videoSelectorPid(VideoSelectorPidProperty.builder()
     * .pid(123)
     * .build())
     * .videoSelectorProgramId(VideoSelectorProgramIdProperty.builder()
     * .programId(123)
     * .build())
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputattachment.html)
     */
    public inline fun cfnChannelInputAttachmentProperty(
        block: CfnChannelInputAttachmentPropertyDsl.() -> Unit = {}
    ): CfnChannel.InputAttachmentProperty {
        val builder = CfnChannelInputAttachmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The setting to remix the audio.
     *
     * The parent of this entity is AudioChannelMappings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * InputChannelLevelProperty inputChannelLevelProperty = InputChannelLevelProperty.builder()
     * .gain(123)
     * .inputChannel(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputchannellevel.html)
     */
    public inline fun cfnChannelInputChannelLevelProperty(
        block: CfnChannelInputChannelLevelPropertyDsl.() -> Unit = {}
    ): CfnChannel.InputChannelLevelProperty {
        val builder = CfnChannelInputChannelLevelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The input location.
     *
     * The parent of this entity is InputLossBehavior.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * InputLocationProperty inputLocationProperty = InputLocationProperty.builder()
     * .passwordParam("passwordParam")
     * .uri("uri")
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputlocation.html)
     */
    public inline fun cfnChannelInputLocationProperty(
        block: CfnChannelInputLocationPropertyDsl.() -> Unit = {}
    ): CfnChannel.InputLocationProperty {
        val builder = CfnChannelInputLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of channel behavior when the input is lost.
     *
     * The parent of this entity is GlobalConfiguration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * InputLossBehaviorProperty inputLossBehaviorProperty = InputLossBehaviorProperty.builder()
     * .blackFrameMsec(123)
     * .inputLossImageColor("inputLossImageColor")
     * .inputLossImageSlate(InputLocationProperty.builder()
     * .passwordParam("passwordParam")
     * .uri("uri")
     * .username("username")
     * .build())
     * .inputLossImageType("inputLossImageType")
     * .repeatFrameMsec(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputlossbehavior.html)
     */
    public inline fun cfnChannelInputLossBehaviorProperty(
        block: CfnChannelInputLossBehaviorPropertyDsl.() -> Unit = {}
    ): CfnChannel.InputLossBehaviorProperty {
        val builder = CfnChannelInputLossBehaviorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * MediaLive will perform a failover if content is not detected in this input for the specified
     * period.
     *
     * The parent of this entity is FailoverConditionSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * InputLossFailoverSettingsProperty inputLossFailoverSettingsProperty =
     * InputLossFailoverSettingsProperty.builder()
     * .inputLossThresholdMsec(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputlossfailoversettings.html)
     */
    public inline fun cfnChannelInputLossFailoverSettingsProperty(
        block: CfnChannelInputLossFailoverSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.InputLossFailoverSettingsProperty {
        val builder = CfnChannelInputLossFailoverSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about extracting content from the input and about handling the content.
     *
     * The parent of this entity is InputAttachment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * InputSettingsProperty inputSettingsProperty = InputSettingsProperty.builder()
     * .audioSelectors(List.of(AudioSelectorProperty.builder()
     * .name("name")
     * .selectorSettings(AudioSelectorSettingsProperty.builder()
     * .audioHlsRenditionSelection(AudioHlsRenditionSelectionProperty.builder()
     * .groupId("groupId")
     * .name("name")
     * .build())
     * .audioLanguageSelection(AudioLanguageSelectionProperty.builder()
     * .languageCode("languageCode")
     * .languageSelectionPolicy("languageSelectionPolicy")
     * .build())
     * .audioPidSelection(AudioPidSelectionProperty.builder()
     * .pid(123)
     * .build())
     * .audioTrackSelection(AudioTrackSelectionProperty.builder()
     * .dolbyEDecode(AudioDolbyEDecodeProperty.builder()
     * .programSelection("programSelection")
     * .build())
     * .tracks(List.of(AudioTrackProperty.builder()
     * .track(123)
     * .build()))
     * .build())
     * .build())
     * .build()))
     * .captionSelectors(List.of(CaptionSelectorProperty.builder()
     * .languageCode("languageCode")
     * .name("name")
     * .selectorSettings(CaptionSelectorSettingsProperty.builder()
     * .ancillarySourceSettings(AncillarySourceSettingsProperty.builder()
     * .sourceAncillaryChannelNumber(123)
     * .build())
     * .aribSourceSettings(AribSourceSettingsProperty.builder().build())
     * .dvbSubSourceSettings(DvbSubSourceSettingsProperty.builder()
     * .ocrLanguage("ocrLanguage")
     * .pid(123)
     * .build())
     * .embeddedSourceSettings(EmbeddedSourceSettingsProperty.builder()
     * .convert608To708("convert608To708")
     * .scte20Detection("scte20Detection")
     * .source608ChannelNumber(123)
     * .source608TrackNumber(123)
     * .build())
     * .scte20SourceSettings(Scte20SourceSettingsProperty.builder()
     * .convert608To708("convert608To708")
     * .source608ChannelNumber(123)
     * .build())
     * .scte27SourceSettings(Scte27SourceSettingsProperty.builder()
     * .ocrLanguage("ocrLanguage")
     * .pid(123)
     * .build())
     * .teletextSourceSettings(TeletextSourceSettingsProperty.builder()
     * .outputRectangle(CaptionRectangleProperty.builder()
     * .height(123)
     * .leftOffset(123)
     * .topOffset(123)
     * .width(123)
     * .build())
     * .pageNumber("pageNumber")
     * .build())
     * .build())
     * .build()))
     * .deblockFilter("deblockFilter")
     * .denoiseFilter("denoiseFilter")
     * .filterStrength(123)
     * .inputFilter("inputFilter")
     * .networkInputSettings(NetworkInputSettingsProperty.builder()
     * .hlsInputSettings(HlsInputSettingsProperty.builder()
     * .bandwidth(123)
     * .bufferSegments(123)
     * .retries(123)
     * .retryInterval(123)
     * .scte35Source("scte35Source")
     * .build())
     * .serverValidation("serverValidation")
     * .build())
     * .scte35Pid(123)
     * .smpte2038DataPreference("smpte2038DataPreference")
     * .sourceEndBehavior("sourceEndBehavior")
     * .videoSelector(VideoSelectorProperty.builder()
     * .colorSpace("colorSpace")
     * .colorSpaceSettings(VideoSelectorColorSpaceSettingsProperty.builder()
     * .hdr10Settings(Hdr10SettingsProperty.builder()
     * .maxCll(123)
     * .maxFall(123)
     * .build())
     * .build())
     * .colorSpaceUsage("colorSpaceUsage")
     * .selectorSettings(VideoSelectorSettingsProperty.builder()
     * .videoSelectorPid(VideoSelectorPidProperty.builder()
     * .pid(123)
     * .build())
     * .videoSelectorProgramId(VideoSelectorProgramIdProperty.builder()
     * .programId(123)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html)
     */
    public inline fun cfnChannelInputSettingsProperty(
        block: CfnChannelInputSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.InputSettingsProperty {
        val builder = CfnChannelInputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The input specification for this channel.
     *
     * It specifies the key characteristics of the inputs for this channel: the maximum bitrate, the
     * resolution, and the codec.
     *
     * This entity is at the top level in the channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * InputSpecificationProperty inputSpecificationProperty = InputSpecificationProperty.builder()
     * .codec("codec")
     * .maximumBitrate("maximumBitrate")
     * .resolution("resolution")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html)
     */
    public inline fun cfnChannelInputSpecificationProperty(
        block: CfnChannelInputSpecificationPropertyDsl.() -> Unit = {}
    ): CfnChannel.InputSpecificationProperty {
        val builder = CfnChannelInputSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of key provider settings.
     *
     * The parent of this entity is HlsGroupSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * KeyProviderSettingsProperty keyProviderSettingsProperty = KeyProviderSettingsProperty.builder()
     * .staticKeySettings(StaticKeySettingsProperty.builder()
     * .keyProviderServer(InputLocationProperty.builder()
     * .passwordParam("passwordParam")
     * .uri("uri")
     * .username("username")
     * .build())
     * .staticKeyValue("staticKeyValue")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-keyprovidersettings.html)
     */
    public inline fun cfnChannelKeyProviderSettingsProperty(
        block: CfnChannelKeyProviderSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.KeyProviderSettingsProperty {
        val builder = CfnChannelKeyProviderSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of the M2TS in the output.
     *
     * The parents of this entity are ArchiveContainerSettings and UdpContainerSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * M2tsSettingsProperty m2tsSettingsProperty = M2tsSettingsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-m2tssettings.html)
     */
    public inline fun cfnChannelM2tsSettingsProperty(
        block: CfnChannelM2tsSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.M2tsSettingsProperty {
        val builder = CfnChannelM2tsSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for the M3U8 container.
     *
     * The parent of this entity is StandardHlsSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * M3u8SettingsProperty m3u8SettingsProperty = M3u8SettingsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-m3u8settings.html)
     */
    public inline fun cfnChannelM3u8SettingsProperty(
        block: CfnChannelM3u8SettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.M3u8SettingsProperty {
        val builder = CfnChannelM3u8SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * MaintenanceCreateSettingsProperty maintenanceCreateSettingsProperty =
     * MaintenanceCreateSettingsProperty.builder()
     * .maintenanceDay("maintenanceDay")
     * .maintenanceStartTime("maintenanceStartTime")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-maintenancecreatesettings.html)
     */
    public inline fun cfnChannelMaintenanceCreateSettingsProperty(
        block: CfnChannelMaintenanceCreateSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.MaintenanceCreateSettingsProperty {
        val builder = CfnChannelMaintenanceCreateSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * MaintenanceUpdateSettingsProperty maintenanceUpdateSettingsProperty =
     * MaintenanceUpdateSettingsProperty.builder()
     * .maintenanceDay("maintenanceDay")
     * .maintenanceScheduledDate("maintenanceScheduledDate")
     * .maintenanceStartTime("maintenanceStartTime")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-maintenanceupdatesettings.html)
     */
    public inline fun cfnChannelMaintenanceUpdateSettingsProperty(
        block: CfnChannelMaintenanceUpdateSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.MaintenanceUpdateSettingsProperty {
        val builder = CfnChannelMaintenanceUpdateSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for the MediaPackage group.
     *
     * The parent of this entity is OutputGroupSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * MediaPackageGroupSettingsProperty mediaPackageGroupSettingsProperty =
     * MediaPackageGroupSettingsProperty.builder()
     * .destination(OutputLocationRefProperty.builder()
     * .destinationRefId("destinationRefId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mediapackagegroupsettings.html)
     */
    public inline fun cfnChannelMediaPackageGroupSettingsProperty(
        block: CfnChannelMediaPackageGroupSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.MediaPackageGroupSettingsProperty {
        val builder = CfnChannelMediaPackageGroupSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Destination settings for a MediaPackage output.
     *
     * The parent of this entity is OutputDestination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * MediaPackageOutputDestinationSettingsProperty mediaPackageOutputDestinationSettingsProperty =
     * MediaPackageOutputDestinationSettingsProperty.builder()
     * .channelId("channelId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mediapackageoutputdestinationsettings.html)
     */
    public inline fun cfnChannelMediaPackageOutputDestinationSettingsProperty(
        block: CfnChannelMediaPackageOutputDestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.MediaPackageOutputDestinationSettingsProperty {
        val builder = CfnChannelMediaPackageOutputDestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for a MediaPackage output.
     *
     * The parent of this entity is OutputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * MediaPackageOutputSettingsProperty mediaPackageOutputSettingsProperty =
     * MediaPackageOutputSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mediapackageoutputsettings.html)
     */
    public inline fun cfnChannelMediaPackageOutputSettingsProperty(
        block: CfnChannelMediaPackageOutputSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.MediaPackageOutputSettingsProperty {
        val builder = CfnChannelMediaPackageOutputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings to enable and configure the motion graphics overlay feature in the channel.
     *
     * The parent of this entity is EncoderSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * MotionGraphicsConfigurationProperty motionGraphicsConfigurationProperty =
     * MotionGraphicsConfigurationProperty.builder()
     * .motionGraphicsInsertion("motionGraphicsInsertion")
     * .motionGraphicsSettings(MotionGraphicsSettingsProperty.builder()
     * .htmlMotionGraphicsSettings(HtmlMotionGraphicsSettingsProperty.builder().build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-motiongraphicsconfiguration.html)
     */
    public inline fun cfnChannelMotionGraphicsConfigurationProperty(
        block: CfnChannelMotionGraphicsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnChannel.MotionGraphicsConfigurationProperty {
        val builder = CfnChannelMotionGraphicsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings to enable and configure the motion graphics overlay feature in the channel.
     *
     * The parent of this entity is MotionGraphicsConfiguration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * MotionGraphicsSettingsProperty motionGraphicsSettingsProperty =
     * MotionGraphicsSettingsProperty.builder()
     * .htmlMotionGraphicsSettings(HtmlMotionGraphicsSettingsProperty.builder().build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-motiongraphicssettings.html)
     */
    public inline fun cfnChannelMotionGraphicsSettingsProperty(
        block: CfnChannelMotionGraphicsSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.MotionGraphicsSettingsProperty {
        val builder = CfnChannelMotionGraphicsSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for this MP2 audio.
     *
     * The parent of this entity is AudioCodecSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Mp2SettingsProperty mp2SettingsProperty = Mp2SettingsProperty.builder()
     * .bitrate(123)
     * .codingMode("codingMode")
     * .sampleRate(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mp2settings.html)
     */
    public inline fun cfnChannelMp2SettingsProperty(
        block: CfnChannelMp2SettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.Mp2SettingsProperty {
        val builder = CfnChannelMp2SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings to configure video filters that apply to the MPEG-2 codec.
     *
     * The parent of this entity is Mpeg2FilterSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Mpeg2FilterSettingsProperty mpeg2FilterSettingsProperty = Mpeg2FilterSettingsProperty.builder()
     * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
     * .postFilterSharpening("postFilterSharpening")
     * .strength("strength")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mpeg2filtersettings.html)
     */
    public inline fun cfnChannelMpeg2FilterSettingsProperty(
        block: CfnChannelMpeg2FilterSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.Mpeg2FilterSettingsProperty {
        val builder = CfnChannelMpeg2FilterSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for the MPEG-2 codec in the output.
     *
     * The parent of this entity is VideoCodecSetting.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Mpeg2SettingsProperty mpeg2SettingsProperty = Mpeg2SettingsProperty.builder()
     * .adaptiveQuantization("adaptiveQuantization")
     * .afdSignaling("afdSignaling")
     * .colorMetadata("colorMetadata")
     * .colorSpace("colorSpace")
     * .displayAspectRatio("displayAspectRatio")
     * .filterSettings(Mpeg2FilterSettingsProperty.builder()
     * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
     * .postFilterSharpening("postFilterSharpening")
     * .strength("strength")
     * .build())
     * .build())
     * .fixedAfd("fixedAfd")
     * .framerateDenominator(123)
     * .framerateNumerator(123)
     * .gopClosedCadence(123)
     * .gopNumBFrames(123)
     * .gopSize(123)
     * .gopSizeUnits("gopSizeUnits")
     * .scanType("scanType")
     * .subgopLength("subgopLength")
     * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
     * .fontSize("fontSize")
     * .position("position")
     * .prefix("prefix")
     * .build())
     * .timecodeInsertion("timecodeInsertion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mpeg2settings.html)
     */
    public inline fun cfnChannelMpeg2SettingsProperty(
        block: CfnChannelMpeg2SettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.Mpeg2SettingsProperty {
        val builder = CfnChannelMpeg2SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for a Microsoft Smooth output group.
     *
     * The parent of this entity is OutputGroupSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * MsSmoothGroupSettingsProperty msSmoothGroupSettingsProperty =
     * MsSmoothGroupSettingsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mssmoothgroupsettings.html)
     */
    public inline fun cfnChannelMsSmoothGroupSettingsProperty(
        block: CfnChannelMsSmoothGroupSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.MsSmoothGroupSettingsProperty {
        val builder = CfnChannelMsSmoothGroupSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of a Microsoft Smooth output.
     *
     * The parent of this entity is OutputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * MsSmoothOutputSettingsProperty msSmoothOutputSettingsProperty =
     * MsSmoothOutputSettingsProperty.builder()
     * .h265PackagingType("h265PackagingType")
     * .nameModifier("nameModifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mssmoothoutputsettings.html)
     */
    public inline fun cfnChannelMsSmoothOutputSettingsProperty(
        block: CfnChannelMsSmoothOutputSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.MsSmoothOutputSettingsProperty {
        val builder = CfnChannelMsSmoothOutputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for a Multiplex output group.
     *
     * The parent of this entity is OutputGroupSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * MultiplexGroupSettingsProperty multiplexGroupSettingsProperty =
     * MultiplexGroupSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-multiplexgroupsettings.html)
     */
    public inline fun cfnChannelMultiplexGroupSettingsProperty(
        block: CfnChannelMultiplexGroupSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.MultiplexGroupSettingsProperty {
        val builder = CfnChannelMultiplexGroupSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of a Multiplex output.
     *
     * The parent of this entity is OutputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * MultiplexOutputSettingsProperty multiplexOutputSettingsProperty =
     * MultiplexOutputSettingsProperty.builder()
     * .destination(OutputLocationRefProperty.builder()
     * .destinationRefId("destinationRefId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-multiplexoutputsettings.html)
     */
    public inline fun cfnChannelMultiplexOutputSettingsProperty(
        block: CfnChannelMultiplexOutputSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.MultiplexOutputSettingsProperty {
        val builder = CfnChannelMultiplexOutputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Destination settings for a Multiplex output.
     *
     * The parent of this entity is OutputDestination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * MultiplexProgramChannelDestinationSettingsProperty
     * multiplexProgramChannelDestinationSettingsProperty =
     * MultiplexProgramChannelDestinationSettingsProperty.builder()
     * .multiplexId("multiplexId")
     * .programName("programName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-multiplexprogramchanneldestinationsettings.html)
     */
    public inline fun cfnChannelMultiplexProgramChannelDestinationSettingsProperty(
        block: CfnChannelMultiplexProgramChannelDestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.MultiplexProgramChannelDestinationSettingsProperty {
        val builder = CfnChannelMultiplexProgramChannelDestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about how to connect to the upstream system.
     *
     * The parent of this entity is InputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * NetworkInputSettingsProperty networkInputSettingsProperty =
     * NetworkInputSettingsProperty.builder()
     * .hlsInputSettings(HlsInputSettingsProperty.builder()
     * .bandwidth(123)
     * .bufferSegments(123)
     * .retries(123)
     * .retryInterval(123)
     * .scte35Source("scte35Source")
     * .build())
     * .serverValidation("serverValidation")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-networkinputsettings.html)
     */
    public inline fun cfnChannelNetworkInputSettingsProperty(
        block: CfnChannelNetworkInputSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.NetworkInputSettingsProperty {
        val builder = CfnChannelNetworkInputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Complete these fields only if you want to insert watermarks of type Nielsen CBET.
     *
     * The parent of this entity is NielsenWatermarksSettings
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * NielsenCBETProperty nielsenCBETProperty = NielsenCBETProperty.builder()
     * .cbetCheckDigitString("cbetCheckDigitString")
     * .cbetStepaside("cbetStepaside")
     * .csid("csid")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-nielsencbet.html)
     */
    public inline fun cfnChannelNielsenCBETProperty(
        block: CfnChannelNielsenCBETPropertyDsl.() -> Unit = {}
    ): CfnChannel.NielsenCBETProperty {
        val builder = CfnChannelNielsenCBETPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings to configure Nielsen watermarks.
     *
     * The parent of this entity is EncoderSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * NielsenConfigurationProperty nielsenConfigurationProperty =
     * NielsenConfigurationProperty.builder()
     * .distributorId("distributorId")
     * .nielsenPcmToId3Tagging("nielsenPcmToId3Tagging")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-nielsenconfiguration.html)
     */
    public inline fun cfnChannelNielsenConfigurationProperty(
        block: CfnChannelNielsenConfigurationPropertyDsl.() -> Unit = {}
    ): CfnChannel.NielsenConfigurationProperty {
        val builder = CfnChannelNielsenConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Complete these fields only if you want to insert watermarks of type Nielsen NAES II (N2) and
     * Nielsen NAES VI (NW).
     *
     * The parent of this entity is NielsenWatermarksSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * NielsenNaesIiNwProperty nielsenNaesIiNwProperty = NielsenNaesIiNwProperty.builder()
     * .checkDigitString("checkDigitString")
     * .sid(123)
     * .timezone("timezone")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-nielsennaesiinw.html)
     */
    public inline fun cfnChannelNielsenNaesIiNwProperty(
        block: CfnChannelNielsenNaesIiNwPropertyDsl.() -> Unit = {}
    ): CfnChannel.NielsenNaesIiNwProperty {
        val builder = CfnChannelNielsenNaesIiNwPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings to configure Nielsen Watermarks in the audio encode.
     *
     * The parent of this entity is AudioWatermarkSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * NielsenWatermarksSettingsProperty nielsenWatermarksSettingsProperty =
     * NielsenWatermarksSettingsProperty.builder()
     * .nielsenCbetSettings(NielsenCBETProperty.builder()
     * .cbetCheckDigitString("cbetCheckDigitString")
     * .cbetStepaside("cbetStepaside")
     * .csid("csid")
     * .build())
     * .nielsenDistributionType("nielsenDistributionType")
     * .nielsenNaesIiNwSettings(NielsenNaesIiNwProperty.builder()
     * .checkDigitString("checkDigitString")
     * .sid(123)
     * .timezone("timezone")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-nielsenwatermarkssettings.html)
     */
    public inline fun cfnChannelNielsenWatermarksSettingsProperty(
        block: CfnChannelNielsenWatermarksSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.NielsenWatermarksSettingsProperty {
        val builder = CfnChannelNielsenWatermarksSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration information for an output.
     *
     * This entity is at the top level in the channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * OutputDestinationProperty outputDestinationProperty = OutputDestinationProperty.builder()
     * .id("id")
     * .mediaPackageSettings(List.of(MediaPackageOutputDestinationSettingsProperty.builder()
     * .channelId("channelId")
     * .build()))
     * .multiplexSettings(MultiplexProgramChannelDestinationSettingsProperty.builder()
     * .multiplexId("multiplexId")
     * .programName("programName")
     * .build())
     * .settings(List.of(OutputDestinationSettingsProperty.builder()
     * .passwordParam("passwordParam")
     * .streamName("streamName")
     * .url("url")
     * .username("username")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestination.html)
     */
    public inline fun cfnChannelOutputDestinationProperty(
        block: CfnChannelOutputDestinationPropertyDsl.() -> Unit = {}
    ): CfnChannel.OutputDestinationProperty {
        val builder = CfnChannelOutputDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration information for this output.
     *
     * The parent of this entity is OutputDestination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * OutputDestinationSettingsProperty outputDestinationSettingsProperty =
     * OutputDestinationSettingsProperty.builder()
     * .passwordParam("passwordParam")
     * .streamName("streamName")
     * .url("url")
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestinationsettings.html)
     */
    public inline fun cfnChannelOutputDestinationSettingsProperty(
        block: CfnChannelOutputDestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.OutputDestinationSettingsProperty {
        val builder = CfnChannelOutputDestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for one output group.
     *
     * The parent of this entity is EncoderSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * OutputGroupProperty outputGroupProperty = OutputGroupProperty.builder()
     * .name("name")
     * .outputGroupSettings(OutputGroupSettingsProperty.builder()
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
     * .inputLossAction("inputLossAction")
     * .restartDelay(123)
     * .build())
     * .udpGroupSettings(UdpGroupSettingsProperty.builder()
     * .inputLossAction("inputLossAction")
     * .timedMetadataId3Frame("timedMetadataId3Frame")
     * .timedMetadataId3Period(123)
     * .build())
     * .build())
     * .outputs(List.of(OutputProperty.builder()
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
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputgroup.html)
     */
    public inline fun cfnChannelOutputGroupProperty(
        block: CfnChannelOutputGroupPropertyDsl.() -> Unit = {}
    ): CfnChannel.OutputGroupProperty {
        val builder = CfnChannelOutputGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnChannelOutputGroupSettingsProperty(
        block: CfnChannelOutputGroupSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.OutputGroupSettingsProperty {
        val builder = CfnChannelOutputGroupSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A reference to an OutputDestination ID that is defined in the channel.
     *
     * This entity is used by ArchiveGroupSettings, FrameCaptureGroupSettings, HlsGroupSettings,
     * MediaPackageGroupSettings, MSSmoothGroupSettings, RtmpOutputSettings, and UdpOutputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * OutputLocationRefProperty outputLocationRefProperty = OutputLocationRefProperty.builder()
     * .destinationRefId("destinationRefId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputlocationref.html)
     */
    public inline fun cfnChannelOutputLocationRefProperty(
        block: CfnChannelOutputLocationRefPropertyDsl.() -> Unit = {}
    ): CfnChannel.OutputLocationRefProperty {
        val builder = CfnChannelOutputLocationRefPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnChannelOutputProperty(
        block: CfnChannelOutputPropertyDsl.() -> Unit = {}
    ): CfnChannel.OutputProperty {
        val builder = CfnChannelOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnChannelOutputSettingsProperty(
        block: CfnChannelOutputSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.OutputSettingsProperty {
        val builder = CfnChannelOutputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for passing through audio to the output.
     *
     * The parent of this entity is AudioCodecSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * PassThroughSettingsProperty passThroughSettingsProperty =
     * PassThroughSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-passthroughsettings.html)
     */
    public inline fun cfnChannelPassThroughSettingsProperty(
        block: CfnChannelPassThroughSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.PassThroughSettingsProperty {
        val builder = CfnChannelPassThroughSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnChannel`.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html)
     */
    public inline fun cfnChannelProps(block: CfnChannelPropsDsl.() -> Unit = {}): CfnChannelProps {
        val builder = CfnChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The container for WAV audio in the output group.
     *
     * The parent of this entity is ArchiveContainerSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * RawSettingsProperty rawSettingsProperty = RawSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-rawsettings.html)
     */
    public inline fun cfnChannelRawSettingsProperty(
        block: CfnChannelRawSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.RawSettingsProperty {
        val builder = CfnChannelRawSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Rec601 Settings.
     *
     * The parents of this entity are H264ColorSpaceSettings and H265ColorSpaceSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Rec601SettingsProperty rec601SettingsProperty = Rec601SettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-rec601settings.html)
     */
    public inline fun cfnChannelRec601SettingsProperty(
        block: CfnChannelRec601SettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.Rec601SettingsProperty {
        val builder = CfnChannelRec601SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Rec709 Settings.
     *
     * The parents of this entity are H264ColorSpaceSettings and H265ColorSpaceSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Rec709SettingsProperty rec709SettingsProperty = Rec709SettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-rec709settings.html)
     */
    public inline fun cfnChannelRec709SettingsProperty(
        block: CfnChannelRec709SettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.Rec709SettingsProperty {
        val builder = CfnChannelRec709SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for remixing audio in the output.
     *
     * The parent of this entity is AudioDescription.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * RemixSettingsProperty remixSettingsProperty = RemixSettingsProperty.builder()
     * .channelMappings(List.of(AudioChannelMappingProperty.builder()
     * .inputChannelLevels(List.of(InputChannelLevelProperty.builder()
     * .gain(123)
     * .inputChannel(123)
     * .build()))
     * .outputChannel(123)
     * .build()))
     * .channelsIn(123)
     * .channelsOut(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-remixsettings.html)
     */
    public inline fun cfnChannelRemixSettingsProperty(
        block: CfnChannelRemixSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.RemixSettingsProperty {
        val builder = CfnChannelRemixSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for RTMPCaptionInfo captions encode in the output.
     *
     * The parent of this entity is CaptionDestinationSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * RtmpCaptionInfoDestinationSettingsProperty rtmpCaptionInfoDestinationSettingsProperty =
     * RtmpCaptionInfoDestinationSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-rtmpcaptioninfodestinationsettings.html)
     */
    public inline fun cfnChannelRtmpCaptionInfoDestinationSettingsProperty(
        block: CfnChannelRtmpCaptionInfoDestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.RtmpCaptionInfoDestinationSettingsProperty {
        val builder = CfnChannelRtmpCaptionInfoDestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of an RTMP output group.
     *
     * The parent of this entity is OutputGroupSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * RtmpGroupSettingsProperty rtmpGroupSettingsProperty = RtmpGroupSettingsProperty.builder()
     * .adMarkers(List.of("adMarkers"))
     * .authenticationScheme("authenticationScheme")
     * .cacheFullBehavior("cacheFullBehavior")
     * .cacheLength(123)
     * .captionData("captionData")
     * .inputLossAction("inputLossAction")
     * .restartDelay(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-rtmpgroupsettings.html)
     */
    public inline fun cfnChannelRtmpGroupSettingsProperty(
        block: CfnChannelRtmpGroupSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.RtmpGroupSettingsProperty {
        val builder = CfnChannelRtmpGroupSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for one RTMP output.
     *
     * The parent of this entity is OutputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * RtmpOutputSettingsProperty rtmpOutputSettingsProperty = RtmpOutputSettingsProperty.builder()
     * .certificateMode("certificateMode")
     * .connectionRetryInterval(123)
     * .destination(OutputLocationRefProperty.builder()
     * .destinationRefId("destinationRefId")
     * .build())
     * .numRetries(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-rtmpoutputsettings.html)
     */
    public inline fun cfnChannelRtmpOutputSettingsProperty(
        block: CfnChannelRtmpOutputSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.RtmpOutputSettingsProperty {
        val builder = CfnChannelRtmpOutputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of SCTE-20 plus embedded captions in the output.
     *
     * The parent of this entity is CaptionDestinationSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Scte20PlusEmbeddedDestinationSettingsProperty scte20PlusEmbeddedDestinationSettingsProperty =
     * Scte20PlusEmbeddedDestinationSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20plusembeddeddestinationsettings.html)
     */
    public inline fun cfnChannelScte20PlusEmbeddedDestinationSettingsProperty(
        block: CfnChannelScte20PlusEmbeddedDestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty {
        val builder = CfnChannelScte20PlusEmbeddedDestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the SCTE-20 captions to extract from the input.
     *
     * The parent of this entity is CaptionSelectorSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Scte20SourceSettingsProperty scte20SourceSettingsProperty =
     * Scte20SourceSettingsProperty.builder()
     * .convert608To708("convert608To708")
     * .source608ChannelNumber(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20sourcesettings.html)
     */
    public inline fun cfnChannelScte20SourceSettingsProperty(
        block: CfnChannelScte20SourceSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.Scte20SourceSettingsProperty {
        val builder = CfnChannelScte20SourceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of SCTE-27 captions in the output.
     *
     * The parent of this entity is CaptionDestinationSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Scte27DestinationSettingsProperty scte27DestinationSettingsProperty =
     * Scte27DestinationSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte27destinationsettings.html)
     */
    public inline fun cfnChannelScte27DestinationSettingsProperty(
        block: CfnChannelScte27DestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.Scte27DestinationSettingsProperty {
        val builder = CfnChannelScte27DestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the SCTE-27 captions to extract from the input.
     *
     * The parent of this entity is CaptionSelectorSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Scte27SourceSettingsProperty scte27SourceSettingsProperty =
     * Scte27SourceSettingsProperty.builder()
     * .ocrLanguage("ocrLanguage")
     * .pid(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte27sourcesettings.html)
     */
    public inline fun cfnChannelScte27SourceSettingsProperty(
        block: CfnChannelScte27SourceSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.Scte27SourceSettingsProperty {
        val builder = CfnChannelScte27SourceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The setup of SCTE-35 splice insert handling.
     *
     * The parent of this entity is AvailSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Scte35SpliceInsertProperty scte35SpliceInsertProperty = Scte35SpliceInsertProperty.builder()
     * .adAvailOffset(123)
     * .noRegionalBlackoutFlag("noRegionalBlackoutFlag")
     * .webDeliveryAllowedFlag("webDeliveryAllowedFlag")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte35spliceinsert.html)
     */
    public inline fun cfnChannelScte35SpliceInsertProperty(
        block: CfnChannelScte35SpliceInsertPropertyDsl.() -> Unit = {}
    ): CfnChannel.Scte35SpliceInsertProperty {
        val builder = CfnChannelScte35SpliceInsertPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for the SCTE-35 time signal APOS mode.
     *
     * The parent of this entity is AvailSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Scte35TimeSignalAposProperty scte35TimeSignalAposProperty =
     * Scte35TimeSignalAposProperty.builder()
     * .adAvailOffset(123)
     * .noRegionalBlackoutFlag("noRegionalBlackoutFlag")
     * .webDeliveryAllowedFlag("webDeliveryAllowedFlag")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte35timesignalapos.html)
     */
    public inline fun cfnChannelScte35TimeSignalAposProperty(
        block: CfnChannelScte35TimeSignalAposPropertyDsl.() -> Unit = {}
    ): CfnChannel.Scte35TimeSignalAposProperty {
        val builder = CfnChannelScte35TimeSignalAposPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The setup of SMPTE-TT captions in the output.
     *
     * The parent of this entity is CaptionDestinationSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * SmpteTtDestinationSettingsProperty smpteTtDestinationSettingsProperty =
     * SmpteTtDestinationSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-smptettdestinationsettings.html)
     */
    public inline fun cfnChannelSmpteTtDestinationSettingsProperty(
        block: CfnChannelSmpteTtDestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.SmpteTtDestinationSettingsProperty {
        val builder = CfnChannelSmpteTtDestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of an HLS output that is a standard output (not an audio-only output).
     *
     * The parent of this entity is HlsSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * StandardHlsSettingsProperty standardHlsSettingsProperty = StandardHlsSettingsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-standardhlssettings.html)
     */
    public inline fun cfnChannelStandardHlsSettingsProperty(
        block: CfnChannelStandardHlsSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.StandardHlsSettingsProperty {
        val builder = CfnChannelStandardHlsSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The static key settings.
     *
     * The parent of this entity is KeyProviderSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * StaticKeySettingsProperty staticKeySettingsProperty = StaticKeySettingsProperty.builder()
     * .keyProviderServer(InputLocationProperty.builder()
     * .passwordParam("passwordParam")
     * .uri("uri")
     * .username("username")
     * .build())
     * .staticKeyValue("staticKeyValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-statickeysettings.html)
     */
    public inline fun cfnChannelStaticKeySettingsProperty(
        block: CfnChannelStaticKeySettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.StaticKeySettingsProperty {
        val builder = CfnChannelStaticKeySettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for a Teletext captions output encode.
     *
     * The parent of this entity is CaptionDestinationSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * TeletextDestinationSettingsProperty teletextDestinationSettingsProperty =
     * TeletextDestinationSettingsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-teletextdestinationsettings.html)
     */
    public inline fun cfnChannelTeletextDestinationSettingsProperty(
        block: CfnChannelTeletextDestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.TeletextDestinationSettingsProperty {
        val builder = CfnChannelTeletextDestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the Teletext captions to extract from the input.
     *
     * The parent of this entity is CaptionSelectorSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * TeletextSourceSettingsProperty teletextSourceSettingsProperty =
     * TeletextSourceSettingsProperty.builder()
     * .outputRectangle(CaptionRectangleProperty.builder()
     * .height(123)
     * .leftOffset(123)
     * .topOffset(123)
     * .width(123)
     * .build())
     * .pageNumber("pageNumber")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-teletextsourcesettings.html)
     */
    public inline fun cfnChannelTeletextSourceSettingsProperty(
        block: CfnChannelTeletextSourceSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.TeletextSourceSettingsProperty {
        val builder = CfnChannelTeletextSourceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for the temporal filter to apply to the video.
     *
     * The parents of this entity are H264FilterSettings, H265FilterSettings, and
     * Mpeg2FilterSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * TemporalFilterSettingsProperty temporalFilterSettingsProperty =
     * TemporalFilterSettingsProperty.builder()
     * .postFilterSharpening("postFilterSharpening")
     * .strength("strength")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-temporalfiltersettings.html)
     */
    public inline fun cfnChannelTemporalFilterSettingsProperty(
        block: CfnChannelTemporalFilterSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.TemporalFilterSettingsProperty {
        val builder = CfnChannelTemporalFilterSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * TimecodeBurninSettingsProperty timecodeBurninSettingsProperty =
     * TimecodeBurninSettingsProperty.builder()
     * .fontSize("fontSize")
     * .position("position")
     * .prefix("prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-timecodeburninsettings.html)
     */
    public inline fun cfnChannelTimecodeBurninSettingsProperty(
        block: CfnChannelTimecodeBurninSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.TimecodeBurninSettingsProperty {
        val builder = CfnChannelTimecodeBurninSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of the timecode in the output.
     *
     * The parent of this entity is EncoderSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * TimecodeConfigProperty timecodeConfigProperty = TimecodeConfigProperty.builder()
     * .source("source")
     * .syncThreshold(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-timecodeconfig.html)
     */
    public inline fun cfnChannelTimecodeConfigProperty(
        block: CfnChannelTimecodeConfigPropertyDsl.() -> Unit = {}
    ): CfnChannel.TimecodeConfigProperty {
        val builder = CfnChannelTimecodeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The setup of TTML captions in the output.
     *
     * The parent of this entity is CaptionDestinationSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * TtmlDestinationSettingsProperty ttmlDestinationSettingsProperty =
     * TtmlDestinationSettingsProperty.builder()
     * .styleControl("styleControl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-ttmldestinationsettings.html)
     */
    public inline fun cfnChannelTtmlDestinationSettingsProperty(
        block: CfnChannelTtmlDestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.TtmlDestinationSettingsProperty {
        val builder = CfnChannelTtmlDestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of a UDP output.
     *
     * The parent of this entity is UdpOutputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * UdpContainerSettingsProperty udpContainerSettingsProperty =
     * UdpContainerSettingsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-udpcontainersettings.html)
     */
    public inline fun cfnChannelUdpContainerSettingsProperty(
        block: CfnChannelUdpContainerSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.UdpContainerSettingsProperty {
        val builder = CfnChannelUdpContainerSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of a UDP output group.
     *
     * The parent of this entity is OutputGroupSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * UdpGroupSettingsProperty udpGroupSettingsProperty = UdpGroupSettingsProperty.builder()
     * .inputLossAction("inputLossAction")
     * .timedMetadataId3Frame("timedMetadataId3Frame")
     * .timedMetadataId3Period(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-udpgroupsettings.html)
     */
    public inline fun cfnChannelUdpGroupSettingsProperty(
        block: CfnChannelUdpGroupSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.UdpGroupSettingsProperty {
        val builder = CfnChannelUdpGroupSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnChannelUdpOutputSettingsProperty(
        block: CfnChannelUdpOutputSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.UdpOutputSettingsProperty {
        val builder = CfnChannelUdpOutputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * MediaLive will perform a failover if content is considered black for the specified period.
     *
     * The parent of this entity is FailoverConditionSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * VideoBlackFailoverSettingsProperty videoBlackFailoverSettingsProperty =
     * VideoBlackFailoverSettingsProperty.builder()
     * .blackDetectThreshold(123)
     * .videoBlackThresholdMsec(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoblackfailoversettings.html)
     */
    public inline fun cfnChannelVideoBlackFailoverSettingsProperty(
        block: CfnChannelVideoBlackFailoverSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.VideoBlackFailoverSettingsProperty {
        val builder = CfnChannelVideoBlackFailoverSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for the video codec in the output.
     *
     * The parent of this entity is VideoDescription.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * VideoCodecSettingsProperty videoCodecSettingsProperty = VideoCodecSettingsProperty.builder()
     * .frameCaptureSettings(FrameCaptureSettingsProperty.builder()
     * .captureInterval(123)
     * .captureIntervalUnits("captureIntervalUnits")
     * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
     * .fontSize("fontSize")
     * .position("position")
     * .prefix("prefix")
     * .build())
     * .build())
     * .h264Settings(H264SettingsProperty.builder()
     * .adaptiveQuantization("adaptiveQuantization")
     * .afdSignaling("afdSignaling")
     * .bitrate(123)
     * .bufFillPct(123)
     * .bufSize(123)
     * .colorMetadata("colorMetadata")
     * .colorSpaceSettings(H264ColorSpaceSettingsProperty.builder()
     * .colorSpacePassthroughSettings(ColorSpacePassthroughSettingsProperty.builder().build())
     * .rec601Settings(Rec601SettingsProperty.builder().build())
     * .rec709Settings(Rec709SettingsProperty.builder().build())
     * .build())
     * .entropyEncoding("entropyEncoding")
     * .filterSettings(H264FilterSettingsProperty.builder()
     * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
     * .postFilterSharpening("postFilterSharpening")
     * .strength("strength")
     * .build())
     * .build())
     * .fixedAfd("fixedAfd")
     * .flickerAq("flickerAq")
     * .forceFieldPictures("forceFieldPictures")
     * .framerateControl("framerateControl")
     * .framerateDenominator(123)
     * .framerateNumerator(123)
     * .gopBReference("gopBReference")
     * .gopClosedCadence(123)
     * .gopNumBFrames(123)
     * .gopSize(123)
     * .gopSizeUnits("gopSizeUnits")
     * .level("level")
     * .lookAheadRateControl("lookAheadRateControl")
     * .maxBitrate(123)
     * .minIInterval(123)
     * .numRefFrames(123)
     * .parControl("parControl")
     * .parDenominator(123)
     * .parNumerator(123)
     * .profile("profile")
     * .qualityLevel("qualityLevel")
     * .qvbrQualityLevel(123)
     * .rateControlMode("rateControlMode")
     * .scanType("scanType")
     * .sceneChangeDetect("sceneChangeDetect")
     * .slices(123)
     * .softness(123)
     * .spatialAq("spatialAq")
     * .subgopLength("subgopLength")
     * .syntax("syntax")
     * .temporalAq("temporalAq")
     * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
     * .fontSize("fontSize")
     * .position("position")
     * .prefix("prefix")
     * .build())
     * .timecodeInsertion("timecodeInsertion")
     * .build())
     * .h265Settings(H265SettingsProperty.builder()
     * .adaptiveQuantization("adaptiveQuantization")
     * .afdSignaling("afdSignaling")
     * .alternativeTransferFunction("alternativeTransferFunction")
     * .bitrate(123)
     * .bufSize(123)
     * .colorMetadata("colorMetadata")
     * .colorSpaceSettings(H265ColorSpaceSettingsProperty.builder()
     * .colorSpacePassthroughSettings(ColorSpacePassthroughSettingsProperty.builder().build())
     * .dolbyVision81Settings(DolbyVision81SettingsProperty.builder().build())
     * .hdr10Settings(Hdr10SettingsProperty.builder()
     * .maxCll(123)
     * .maxFall(123)
     * .build())
     * .rec601Settings(Rec601SettingsProperty.builder().build())
     * .rec709Settings(Rec709SettingsProperty.builder().build())
     * .build())
     * .filterSettings(H265FilterSettingsProperty.builder()
     * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
     * .postFilterSharpening("postFilterSharpening")
     * .strength("strength")
     * .build())
     * .build())
     * .fixedAfd("fixedAfd")
     * .flickerAq("flickerAq")
     * .framerateDenominator(123)
     * .framerateNumerator(123)
     * .gopClosedCadence(123)
     * .gopSize(123)
     * .gopSizeUnits("gopSizeUnits")
     * .level("level")
     * .lookAheadRateControl("lookAheadRateControl")
     * .maxBitrate(123)
     * .minIInterval(123)
     * .parDenominator(123)
     * .parNumerator(123)
     * .profile("profile")
     * .qvbrQualityLevel(123)
     * .rateControlMode("rateControlMode")
     * .scanType("scanType")
     * .sceneChangeDetect("sceneChangeDetect")
     * .slices(123)
     * .tier("tier")
     * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
     * .fontSize("fontSize")
     * .position("position")
     * .prefix("prefix")
     * .build())
     * .timecodeInsertion("timecodeInsertion")
     * .build())
     * .mpeg2Settings(Mpeg2SettingsProperty.builder()
     * .adaptiveQuantization("adaptiveQuantization")
     * .afdSignaling("afdSignaling")
     * .colorMetadata("colorMetadata")
     * .colorSpace("colorSpace")
     * .displayAspectRatio("displayAspectRatio")
     * .filterSettings(Mpeg2FilterSettingsProperty.builder()
     * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
     * .postFilterSharpening("postFilterSharpening")
     * .strength("strength")
     * .build())
     * .build())
     * .fixedAfd("fixedAfd")
     * .framerateDenominator(123)
     * .framerateNumerator(123)
     * .gopClosedCadence(123)
     * .gopNumBFrames(123)
     * .gopSize(123)
     * .gopSizeUnits("gopSizeUnits")
     * .scanType("scanType")
     * .subgopLength("subgopLength")
     * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
     * .fontSize("fontSize")
     * .position("position")
     * .prefix("prefix")
     * .build())
     * .timecodeInsertion("timecodeInsertion")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videocodecsettings.html)
     */
    public inline fun cfnChannelVideoCodecSettingsProperty(
        block: CfnChannelVideoCodecSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.VideoCodecSettingsProperty {
        val builder = CfnChannelVideoCodecSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Encoding information for one output video.
     *
     * The parent of this entity is EncoderSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * VideoDescriptionProperty videoDescriptionProperty = VideoDescriptionProperty.builder()
     * .codecSettings(VideoCodecSettingsProperty.builder()
     * .frameCaptureSettings(FrameCaptureSettingsProperty.builder()
     * .captureInterval(123)
     * .captureIntervalUnits("captureIntervalUnits")
     * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
     * .fontSize("fontSize")
     * .position("position")
     * .prefix("prefix")
     * .build())
     * .build())
     * .h264Settings(H264SettingsProperty.builder()
     * .adaptiveQuantization("adaptiveQuantization")
     * .afdSignaling("afdSignaling")
     * .bitrate(123)
     * .bufFillPct(123)
     * .bufSize(123)
     * .colorMetadata("colorMetadata")
     * .colorSpaceSettings(H264ColorSpaceSettingsProperty.builder()
     * .colorSpacePassthroughSettings(ColorSpacePassthroughSettingsProperty.builder().build())
     * .rec601Settings(Rec601SettingsProperty.builder().build())
     * .rec709Settings(Rec709SettingsProperty.builder().build())
     * .build())
     * .entropyEncoding("entropyEncoding")
     * .filterSettings(H264FilterSettingsProperty.builder()
     * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
     * .postFilterSharpening("postFilterSharpening")
     * .strength("strength")
     * .build())
     * .build())
     * .fixedAfd("fixedAfd")
     * .flickerAq("flickerAq")
     * .forceFieldPictures("forceFieldPictures")
     * .framerateControl("framerateControl")
     * .framerateDenominator(123)
     * .framerateNumerator(123)
     * .gopBReference("gopBReference")
     * .gopClosedCadence(123)
     * .gopNumBFrames(123)
     * .gopSize(123)
     * .gopSizeUnits("gopSizeUnits")
     * .level("level")
     * .lookAheadRateControl("lookAheadRateControl")
     * .maxBitrate(123)
     * .minIInterval(123)
     * .numRefFrames(123)
     * .parControl("parControl")
     * .parDenominator(123)
     * .parNumerator(123)
     * .profile("profile")
     * .qualityLevel("qualityLevel")
     * .qvbrQualityLevel(123)
     * .rateControlMode("rateControlMode")
     * .scanType("scanType")
     * .sceneChangeDetect("sceneChangeDetect")
     * .slices(123)
     * .softness(123)
     * .spatialAq("spatialAq")
     * .subgopLength("subgopLength")
     * .syntax("syntax")
     * .temporalAq("temporalAq")
     * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
     * .fontSize("fontSize")
     * .position("position")
     * .prefix("prefix")
     * .build())
     * .timecodeInsertion("timecodeInsertion")
     * .build())
     * .h265Settings(H265SettingsProperty.builder()
     * .adaptiveQuantization("adaptiveQuantization")
     * .afdSignaling("afdSignaling")
     * .alternativeTransferFunction("alternativeTransferFunction")
     * .bitrate(123)
     * .bufSize(123)
     * .colorMetadata("colorMetadata")
     * .colorSpaceSettings(H265ColorSpaceSettingsProperty.builder()
     * .colorSpacePassthroughSettings(ColorSpacePassthroughSettingsProperty.builder().build())
     * .dolbyVision81Settings(DolbyVision81SettingsProperty.builder().build())
     * .hdr10Settings(Hdr10SettingsProperty.builder()
     * .maxCll(123)
     * .maxFall(123)
     * .build())
     * .rec601Settings(Rec601SettingsProperty.builder().build())
     * .rec709Settings(Rec709SettingsProperty.builder().build())
     * .build())
     * .filterSettings(H265FilterSettingsProperty.builder()
     * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
     * .postFilterSharpening("postFilterSharpening")
     * .strength("strength")
     * .build())
     * .build())
     * .fixedAfd("fixedAfd")
     * .flickerAq("flickerAq")
     * .framerateDenominator(123)
     * .framerateNumerator(123)
     * .gopClosedCadence(123)
     * .gopSize(123)
     * .gopSizeUnits("gopSizeUnits")
     * .level("level")
     * .lookAheadRateControl("lookAheadRateControl")
     * .maxBitrate(123)
     * .minIInterval(123)
     * .parDenominator(123)
     * .parNumerator(123)
     * .profile("profile")
     * .qvbrQualityLevel(123)
     * .rateControlMode("rateControlMode")
     * .scanType("scanType")
     * .sceneChangeDetect("sceneChangeDetect")
     * .slices(123)
     * .tier("tier")
     * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
     * .fontSize("fontSize")
     * .position("position")
     * .prefix("prefix")
     * .build())
     * .timecodeInsertion("timecodeInsertion")
     * .build())
     * .mpeg2Settings(Mpeg2SettingsProperty.builder()
     * .adaptiveQuantization("adaptiveQuantization")
     * .afdSignaling("afdSignaling")
     * .colorMetadata("colorMetadata")
     * .colorSpace("colorSpace")
     * .displayAspectRatio("displayAspectRatio")
     * .filterSettings(Mpeg2FilterSettingsProperty.builder()
     * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
     * .postFilterSharpening("postFilterSharpening")
     * .strength("strength")
     * .build())
     * .build())
     * .fixedAfd("fixedAfd")
     * .framerateDenominator(123)
     * .framerateNumerator(123)
     * .gopClosedCadence(123)
     * .gopNumBFrames(123)
     * .gopSize(123)
     * .gopSizeUnits("gopSizeUnits")
     * .scanType("scanType")
     * .subgopLength("subgopLength")
     * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
     * .fontSize("fontSize")
     * .position("position")
     * .prefix("prefix")
     * .build())
     * .timecodeInsertion("timecodeInsertion")
     * .build())
     * .build())
     * .height(123)
     * .name("name")
     * .respondToAfd("respondToAfd")
     * .scalingBehavior("scalingBehavior")
     * .sharpness(123)
     * .width(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videodescription.html)
     */
    public inline fun cfnChannelVideoDescriptionProperty(
        block: CfnChannelVideoDescriptionPropertyDsl.() -> Unit = {}
    ): CfnChannel.VideoDescriptionProperty {
        val builder = CfnChannelVideoDescriptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings to configure color space settings in the incoming video.
     *
     * The parent of this entity is VideoSelector.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * VideoSelectorColorSpaceSettingsProperty videoSelectorColorSpaceSettingsProperty =
     * VideoSelectorColorSpaceSettingsProperty.builder()
     * .hdr10Settings(Hdr10SettingsProperty.builder()
     * .maxCll(123)
     * .maxFall(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorcolorspacesettings.html)
     */
    public inline fun cfnChannelVideoSelectorColorSpaceSettingsProperty(
        block: CfnChannelVideoSelectorColorSpaceSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.VideoSelectorColorSpaceSettingsProperty {
        val builder = CfnChannelVideoSelectorColorSpaceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Selects a specific PID from within a video source.
     *
     * The parent of this entity is VideoSelectorSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * VideoSelectorPidProperty videoSelectorPidProperty = VideoSelectorPidProperty.builder()
     * .pid(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorpid.html)
     */
    public inline fun cfnChannelVideoSelectorPidProperty(
        block: CfnChannelVideoSelectorPidPropertyDsl.() -> Unit = {}
    ): CfnChannel.VideoSelectorPidProperty {
        val builder = CfnChannelVideoSelectorPidPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used to extract video by the program ID.
     *
     * The parent of this entity is VideoSelectorSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * VideoSelectorProgramIdProperty videoSelectorProgramIdProperty =
     * VideoSelectorProgramIdProperty.builder()
     * .programId(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorprogramid.html)
     */
    public inline fun cfnChannelVideoSelectorProgramIdProperty(
        block: CfnChannelVideoSelectorProgramIdPropertyDsl.() -> Unit = {}
    ): CfnChannel.VideoSelectorProgramIdProperty {
        val builder = CfnChannelVideoSelectorProgramIdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the video to extract from the input. An input can contain only one video
     * selector.
     *
     * The parent of this entity is InputSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * VideoSelectorProperty videoSelectorProperty = VideoSelectorProperty.builder()
     * .colorSpace("colorSpace")
     * .colorSpaceSettings(VideoSelectorColorSpaceSettingsProperty.builder()
     * .hdr10Settings(Hdr10SettingsProperty.builder()
     * .maxCll(123)
     * .maxFall(123)
     * .build())
     * .build())
     * .colorSpaceUsage("colorSpaceUsage")
     * .selectorSettings(VideoSelectorSettingsProperty.builder()
     * .videoSelectorPid(VideoSelectorPidProperty.builder()
     * .pid(123)
     * .build())
     * .videoSelectorProgramId(VideoSelectorProgramIdProperty.builder()
     * .programId(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselector.html)
     */
    public inline fun cfnChannelVideoSelectorProperty(
        block: CfnChannelVideoSelectorPropertyDsl.() -> Unit = {}
    ): CfnChannel.VideoSelectorProperty {
        val builder = CfnChannelVideoSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the video to extract from the input.
     *
     * The parent of this entity is VideoSelector.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * VideoSelectorSettingsProperty videoSelectorSettingsProperty =
     * VideoSelectorSettingsProperty.builder()
     * .videoSelectorPid(VideoSelectorPidProperty.builder()
     * .pid(123)
     * .build())
     * .videoSelectorProgramId(VideoSelectorProgramIdProperty.builder()
     * .programId(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorsettings.html)
     */
    public inline fun cfnChannelVideoSelectorSettingsProperty(
        block: CfnChannelVideoSelectorSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.VideoSelectorSettingsProperty {
        val builder = CfnChannelVideoSelectorSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings to enable VPC mode in the channel, so that the endpoints for all outputs are in your
     * VPC.
     *
     * This entity is at the top level in the channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * VpcOutputSettingsProperty vpcOutputSettingsProperty = VpcOutputSettingsProperty.builder()
     * .publicAddressAllocationIds(List.of("publicAddressAllocationIds"))
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-vpcoutputsettings.html)
     */
    public inline fun cfnChannelVpcOutputSettingsProperty(
        block: CfnChannelVpcOutputSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.VpcOutputSettingsProperty {
        val builder = CfnChannelVpcOutputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The setup of WAV audio in the output.
     *
     * The parent of this entity is AudioCodecSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * WavSettingsProperty wavSettingsProperty = WavSettingsProperty.builder()
     * .bitDepth(123)
     * .codingMode("codingMode")
     * .sampleRate(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-wavsettings.html)
     */
    public inline fun cfnChannelWavSettingsProperty(
        block: CfnChannelWavSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.WavSettingsProperty {
        val builder = CfnChannelWavSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of Web VTT captions in the output.
     *
     * The parent of this entity is CaptionDestinationSettings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * WebvttDestinationSettingsProperty webvttDestinationSettingsProperty =
     * WebvttDestinationSettingsProperty.builder()
     * .styleControl("styleControl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-webvttdestinationsettings.html)
     */
    public inline fun cfnChannelWebvttDestinationSettingsProperty(
        block: CfnChannelWebvttDestinationSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.WebvttDestinationSettingsProperty {
        val builder = CfnChannelWebvttDestinationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::MediaLive::Input resource is a MediaLive resource type that creates an input.
     *
     * A MediaLive input holds information that describes how the MediaLive channel is connected to
     * the upstream system that is providing the source content that is to be transcoded.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Object tags;
     * CfnInput cfnInput = CfnInput.Builder.create(this, "MyCfnInput")
     * .destinations(List.of(InputDestinationRequestProperty.builder()
     * .streamName("streamName")
     * .build()))
     * .inputDevices(List.of(InputDeviceSettingsProperty.builder()
     * .id("id")
     * .build()))
     * .inputSecurityGroups(List.of("inputSecurityGroups"))
     * .mediaConnectFlows(List.of(MediaConnectFlowRequestProperty.builder()
     * .flowArn("flowArn")
     * .build()))
     * .name("name")
     * .roleArn("roleArn")
     * .sources(List.of(InputSourceRequestProperty.builder()
     * .passwordParam("passwordParam")
     * .url("url")
     * .username("username")
     * .build()))
     * .tags(tags)
     * .type("type")
     * .vpc(InputVpcRequestProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html)
     */
    public inline fun cfnInput(
        scope: Construct,
        id: String,
        block: CfnInputDsl.() -> Unit = {},
    ): CfnInput {
        val builder = CfnInputDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings that apply only if the input is a push type of input.
     *
     * The parent of this entity is Input.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * InputDestinationRequestProperty inputDestinationRequestProperty =
     * InputDestinationRequestProperty.builder()
     * .streamName("streamName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdestinationrequest.html)
     */
    public inline fun cfnInputInputDestinationRequestProperty(
        block: CfnInputInputDestinationRequestPropertyDsl.() -> Unit = {}
    ): CfnInput.InputDestinationRequestProperty {
        val builder = CfnInputInputDestinationRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This entity is not used.
     *
     * Ignore it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * InputDeviceRequestProperty inputDeviceRequestProperty = InputDeviceRequestProperty.builder()
     * .id("id")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdevicerequest.html)
     */
    public inline fun cfnInputInputDeviceRequestProperty(
        block: CfnInputInputDeviceRequestPropertyDsl.() -> Unit = {}
    ): CfnInput.InputDeviceRequestProperty {
        val builder = CfnInputInputDeviceRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings that apply only if the input is an Elemental Link input.
     *
     * The parent of this entity is Input.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * InputDeviceSettingsProperty inputDeviceSettingsProperty = InputDeviceSettingsProperty.builder()
     * .id("id")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdevicesettings.html)
     */
    public inline fun cfnInputInputDeviceSettingsProperty(
        block: CfnInputInputDeviceSettingsPropertyDsl.() -> Unit = {}
    ): CfnInput.InputDeviceSettingsProperty {
        val builder = CfnInputInputDeviceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings that apply only if the input is a pull type of input.
     *
     * The parent of this entity is Input.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * InputSourceRequestProperty inputSourceRequestProperty = InputSourceRequestProperty.builder()
     * .passwordParam("passwordParam")
     * .url("url")
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputsourcerequest.html)
     */
    public inline fun cfnInputInputSourceRequestProperty(
        block: CfnInputInputSourceRequestPropertyDsl.() -> Unit = {}
    ): CfnInput.InputSourceRequestProperty {
        val builder = CfnInputInputSourceRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings that apply only if the input is an push input where the source is on Amazon VPC.
     *
     * The parent of this entity is Input.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * InputVpcRequestProperty inputVpcRequestProperty = InputVpcRequestProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputvpcrequest.html)
     */
    public inline fun cfnInputInputVpcRequestProperty(
        block: CfnInputInputVpcRequestPropertyDsl.() -> Unit = {}
    ): CfnInput.InputVpcRequestProperty {
        val builder = CfnInputInputVpcRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings that apply only if the input is a MediaConnect input.
     *
     * The parent of this entity is Input.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * MediaConnectFlowRequestProperty mediaConnectFlowRequestProperty =
     * MediaConnectFlowRequestProperty.builder()
     * .flowArn("flowArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-mediaconnectflowrequest.html)
     */
    public inline fun cfnInputMediaConnectFlowRequestProperty(
        block: CfnInputMediaConnectFlowRequestPropertyDsl.() -> Unit = {}
    ): CfnInput.MediaConnectFlowRequestProperty {
        val builder = CfnInputMediaConnectFlowRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInput`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Object tags;
     * CfnInputProps cfnInputProps = CfnInputProps.builder()
     * .destinations(List.of(InputDestinationRequestProperty.builder()
     * .streamName("streamName")
     * .build()))
     * .inputDevices(List.of(InputDeviceSettingsProperty.builder()
     * .id("id")
     * .build()))
     * .inputSecurityGroups(List.of("inputSecurityGroups"))
     * .mediaConnectFlows(List.of(MediaConnectFlowRequestProperty.builder()
     * .flowArn("flowArn")
     * .build()))
     * .name("name")
     * .roleArn("roleArn")
     * .sources(List.of(InputSourceRequestProperty.builder()
     * .passwordParam("passwordParam")
     * .url("url")
     * .username("username")
     * .build()))
     * .tags(tags)
     * .type("type")
     * .vpc(InputVpcRequestProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html)
     */
    public inline fun cfnInputProps(block: CfnInputPropsDsl.() -> Unit = {}): CfnInputProps {
        val builder = CfnInputPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::MediaLive::InputSecurityGroup is a MediaLive resource type that creates an input
     * security group.
     *
     * A MediaLive input security group is associated with a MediaLive input. The input security
     * group is an "allow list" of IP addresses that controls whether an external IP address can
     * push content to the associated MediaLive input.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Object tags;
     * CfnInputSecurityGroup cfnInputSecurityGroup = CfnInputSecurityGroup.Builder.create(this,
     * "MyCfnInputSecurityGroup")
     * .tags(tags)
     * .whitelistRules(List.of(InputWhitelistRuleCidrProperty.builder()
     * .cidr("cidr")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html)
     */
    public inline fun cfnInputSecurityGroup(
        scope: Construct,
        id: String,
        block: CfnInputSecurityGroupDsl.() -> Unit = {},
    ): CfnInputSecurityGroup {
        val builder = CfnInputSecurityGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An IPv4 CIDR range to include in this input security group.
     *
     * The parent of this entity is InputSecurityGroup.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * InputWhitelistRuleCidrProperty inputWhitelistRuleCidrProperty =
     * InputWhitelistRuleCidrProperty.builder()
     * .cidr("cidr")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-inputsecuritygroup-inputwhitelistrulecidr.html)
     */
    public inline fun cfnInputSecurityGroupInputWhitelistRuleCidrProperty(
        block: CfnInputSecurityGroupInputWhitelistRuleCidrPropertyDsl.() -> Unit = {}
    ): CfnInputSecurityGroup.InputWhitelistRuleCidrProperty {
        val builder = CfnInputSecurityGroupInputWhitelistRuleCidrPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInputSecurityGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.medialive.*;
     * Object tags;
     * CfnInputSecurityGroupProps cfnInputSecurityGroupProps = CfnInputSecurityGroupProps.builder()
     * .tags(tags)
     * .whitelistRules(List.of(InputWhitelistRuleCidrProperty.builder()
     * .cidr("cidr")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html)
     */
    public inline fun cfnInputSecurityGroupProps(
        block: CfnInputSecurityGroupPropsDsl.() -> Unit = {}
    ): CfnInputSecurityGroupProps {
        val builder = CfnInputSecurityGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
