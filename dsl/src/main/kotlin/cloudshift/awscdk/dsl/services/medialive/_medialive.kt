@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

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
  public inline fun cfnChannel(
    scope: Construct,
    id: String,
    block: CfnChannelDsl.() -> Unit = {},
  ): CfnChannel {
    val builder = CfnChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnChannelAacSettingsProperty(block: CfnChannelAacSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.AacSettingsProperty {
    val builder = CfnChannelAacSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnChannelAc3SettingsProperty(block: CfnChannelAc3SettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.Ac3SettingsProperty {
    val builder = CfnChannelAc3SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAncillarySourceSettingsProperty(block: CfnChannelAncillarySourceSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.AncillarySourceSettingsProperty {
    val builder = CfnChannelAncillarySourceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelArchiveCdnSettingsProperty(block: CfnChannelArchiveCdnSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.ArchiveCdnSettingsProperty {
    val builder = CfnChannelArchiveCdnSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelArchiveContainerSettingsProperty(block: CfnChannelArchiveContainerSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.ArchiveContainerSettingsProperty {
    val builder = CfnChannelArchiveContainerSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelArchiveGroupSettingsProperty(block: CfnChannelArchiveGroupSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.ArchiveGroupSettingsProperty {
    val builder = CfnChannelArchiveGroupSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelArchiveOutputSettingsProperty(block: CfnChannelArchiveOutputSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.ArchiveOutputSettingsProperty {
    val builder = CfnChannelArchiveOutputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelArchiveS3SettingsProperty(block: CfnChannelArchiveS3SettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.ArchiveS3SettingsProperty {
    val builder = CfnChannelArchiveS3SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAribDestinationSettingsProperty(block: CfnChannelAribDestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.AribDestinationSettingsProperty {
    val builder = CfnChannelAribDestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAribSourceSettingsProperty(block: CfnChannelAribSourceSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.AribSourceSettingsProperty {
    val builder = CfnChannelAribSourceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAudioChannelMappingProperty(block: CfnChannelAudioChannelMappingPropertyDsl.() -> Unit
      = {}): CfnChannel.AudioChannelMappingProperty {
    val builder = CfnChannelAudioChannelMappingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAudioCodecSettingsProperty(block: CfnChannelAudioCodecSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.AudioCodecSettingsProperty {
    val builder = CfnChannelAudioCodecSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAudioDescriptionProperty(block: CfnChannelAudioDescriptionPropertyDsl.() -> Unit
      = {}): CfnChannel.AudioDescriptionProperty {
    val builder = CfnChannelAudioDescriptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAudioDolbyEDecodeProperty(block: CfnChannelAudioDolbyEDecodePropertyDsl.() -> Unit
      = {}): CfnChannel.AudioDolbyEDecodeProperty {
    val builder = CfnChannelAudioDolbyEDecodePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAudioHlsRenditionSelectionProperty(block: CfnChannelAudioHlsRenditionSelectionPropertyDsl.() -> Unit
      = {}): CfnChannel.AudioHlsRenditionSelectionProperty {
    val builder = CfnChannelAudioHlsRenditionSelectionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAudioLanguageSelectionProperty(block: CfnChannelAudioLanguageSelectionPropertyDsl.() -> Unit
      = {}): CfnChannel.AudioLanguageSelectionProperty {
    val builder = CfnChannelAudioLanguageSelectionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAudioNormalizationSettingsProperty(block: CfnChannelAudioNormalizationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.AudioNormalizationSettingsProperty {
    val builder = CfnChannelAudioNormalizationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAudioOnlyHlsSettingsProperty(block: CfnChannelAudioOnlyHlsSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.AudioOnlyHlsSettingsProperty {
    val builder = CfnChannelAudioOnlyHlsSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAudioPidSelectionProperty(block: CfnChannelAudioPidSelectionPropertyDsl.() -> Unit
      = {}): CfnChannel.AudioPidSelectionProperty {
    val builder = CfnChannelAudioPidSelectionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAudioSelectorProperty(block: CfnChannelAudioSelectorPropertyDsl.() -> Unit =
      {}): CfnChannel.AudioSelectorProperty {
    val builder = CfnChannelAudioSelectorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAudioSelectorSettingsProperty(block: CfnChannelAudioSelectorSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.AudioSelectorSettingsProperty {
    val builder = CfnChannelAudioSelectorSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAudioSilenceFailoverSettingsProperty(block: CfnChannelAudioSilenceFailoverSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.AudioSilenceFailoverSettingsProperty {
    val builder = CfnChannelAudioSilenceFailoverSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnChannelAudioTrackProperty(block: CfnChannelAudioTrackPropertyDsl.() -> Unit =
      {}): CfnChannel.AudioTrackProperty {
    val builder = CfnChannelAudioTrackPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAudioTrackSelectionProperty(block: CfnChannelAudioTrackSelectionPropertyDsl.() -> Unit
      = {}): CfnChannel.AudioTrackSelectionProperty {
    val builder = CfnChannelAudioTrackSelectionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAudioWatermarkSettingsProperty(block: CfnChannelAudioWatermarkSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.AudioWatermarkSettingsProperty {
    val builder = CfnChannelAudioWatermarkSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAutomaticInputFailoverSettingsProperty(block: CfnChannelAutomaticInputFailoverSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.AutomaticInputFailoverSettingsProperty {
    val builder = CfnChannelAutomaticInputFailoverSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAvailBlankingProperty(block: CfnChannelAvailBlankingPropertyDsl.() -> Unit =
      {}): CfnChannel.AvailBlankingProperty {
    val builder = CfnChannelAvailBlankingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAvailConfigurationProperty(block: CfnChannelAvailConfigurationPropertyDsl.() -> Unit
      = {}): CfnChannel.AvailConfigurationProperty {
    val builder = CfnChannelAvailConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelAvailSettingsProperty(block: CfnChannelAvailSettingsPropertyDsl.() -> Unit =
      {}): CfnChannel.AvailSettingsProperty {
    val builder = CfnChannelAvailSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelBlackoutSlateProperty(block: CfnChannelBlackoutSlatePropertyDsl.() -> Unit =
      {}): CfnChannel.BlackoutSlateProperty {
    val builder = CfnChannelBlackoutSlatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelBurnInDestinationSettingsProperty(block: CfnChannelBurnInDestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.BurnInDestinationSettingsProperty {
    val builder = CfnChannelBurnInDestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelCaptionDescriptionProperty(block: CfnChannelCaptionDescriptionPropertyDsl.() -> Unit
      = {}): CfnChannel.CaptionDescriptionProperty {
    val builder = CfnChannelCaptionDescriptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelCaptionDestinationSettingsProperty(block: CfnChannelCaptionDestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.CaptionDestinationSettingsProperty {
    val builder = CfnChannelCaptionDestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelCaptionLanguageMappingProperty(block: CfnChannelCaptionLanguageMappingPropertyDsl.() -> Unit
      = {}): CfnChannel.CaptionLanguageMappingProperty {
    val builder = CfnChannelCaptionLanguageMappingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelCaptionRectangleProperty(block: CfnChannelCaptionRectanglePropertyDsl.() -> Unit
      = {}): CfnChannel.CaptionRectangleProperty {
    val builder = CfnChannelCaptionRectanglePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelCaptionSelectorProperty(block: CfnChannelCaptionSelectorPropertyDsl.() -> Unit =
      {}): CfnChannel.CaptionSelectorProperty {
    val builder = CfnChannelCaptionSelectorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelCaptionSelectorSettingsProperty(block: CfnChannelCaptionSelectorSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.CaptionSelectorSettingsProperty {
    val builder = CfnChannelCaptionSelectorSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelCdiInputSpecificationProperty(block: CfnChannelCdiInputSpecificationPropertyDsl.() -> Unit
      = {}): CfnChannel.CdiInputSpecificationProperty {
    val builder = CfnChannelCdiInputSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelColorSpacePassthroughSettingsProperty(block: CfnChannelColorSpacePassthroughSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.ColorSpacePassthroughSettingsProperty {
    val builder = CfnChannelColorSpacePassthroughSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelDolbyVision81SettingsProperty(block: CfnChannelDolbyVision81SettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.DolbyVision81SettingsProperty {
    val builder = CfnChannelDolbyVision81SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelDvbNitSettingsProperty(block: CfnChannelDvbNitSettingsPropertyDsl.() -> Unit =
      {}): CfnChannel.DvbNitSettingsProperty {
    val builder = CfnChannelDvbNitSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelDvbSdtSettingsProperty(block: CfnChannelDvbSdtSettingsPropertyDsl.() -> Unit =
      {}): CfnChannel.DvbSdtSettingsProperty {
    val builder = CfnChannelDvbSdtSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelDvbSubDestinationSettingsProperty(block: CfnChannelDvbSubDestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.DvbSubDestinationSettingsProperty {
    val builder = CfnChannelDvbSubDestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelDvbSubSourceSettingsProperty(block: CfnChannelDvbSubSourceSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.DvbSubSourceSettingsProperty {
    val builder = CfnChannelDvbSubSourceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelDvbTdtSettingsProperty(block: CfnChannelDvbTdtSettingsPropertyDsl.() -> Unit =
      {}): CfnChannel.DvbTdtSettingsProperty {
    val builder = CfnChannelDvbTdtSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelEac3AtmosSettingsProperty(block: CfnChannelEac3AtmosSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.Eac3AtmosSettingsProperty {
    val builder = CfnChannelEac3AtmosSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelEac3SettingsProperty(block: CfnChannelEac3SettingsPropertyDsl.() -> Unit = {}):
      CfnChannel.Eac3SettingsProperty {
    val builder = CfnChannelEac3SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelEbuTtDDestinationSettingsProperty(block: CfnChannelEbuTtDDestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.EbuTtDDestinationSettingsProperty {
    val builder = CfnChannelEbuTtDDestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelEmbeddedDestinationSettingsProperty(block: CfnChannelEmbeddedDestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.EmbeddedDestinationSettingsProperty {
    val builder = CfnChannelEmbeddedDestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelEmbeddedPlusScte20DestinationSettingsProperty(block: CfnChannelEmbeddedPlusScte20DestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty {
    val builder = CfnChannelEmbeddedPlusScte20DestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelEmbeddedSourceSettingsProperty(block: CfnChannelEmbeddedSourceSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.EmbeddedSourceSettingsProperty {
    val builder = CfnChannelEmbeddedSourceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelEncoderSettingsProperty(block: CfnChannelEncoderSettingsPropertyDsl.() -> Unit =
      {}): CfnChannel.EncoderSettingsProperty {
    val builder = CfnChannelEncoderSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnChannelEsamProperty(block: CfnChannelEsamPropertyDsl.() -> Unit = {}):
      CfnChannel.EsamProperty {
    val builder = CfnChannelEsamPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelFailoverConditionProperty(block: CfnChannelFailoverConditionPropertyDsl.() -> Unit
      = {}): CfnChannel.FailoverConditionProperty {
    val builder = CfnChannelFailoverConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelFailoverConditionSettingsProperty(block: CfnChannelFailoverConditionSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.FailoverConditionSettingsProperty {
    val builder = CfnChannelFailoverConditionSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelFeatureActivationsProperty(block: CfnChannelFeatureActivationsPropertyDsl.() -> Unit
      = {}): CfnChannel.FeatureActivationsProperty {
    val builder = CfnChannelFeatureActivationsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelFecOutputSettingsProperty(block: CfnChannelFecOutputSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.FecOutputSettingsProperty {
    val builder = CfnChannelFecOutputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelFmp4HlsSettingsProperty(block: CfnChannelFmp4HlsSettingsPropertyDsl.() -> Unit =
      {}): CfnChannel.Fmp4HlsSettingsProperty {
    val builder = CfnChannelFmp4HlsSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelFrameCaptureCdnSettingsProperty(block: CfnChannelFrameCaptureCdnSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.FrameCaptureCdnSettingsProperty {
    val builder = CfnChannelFrameCaptureCdnSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelFrameCaptureGroupSettingsProperty(block: CfnChannelFrameCaptureGroupSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.FrameCaptureGroupSettingsProperty {
    val builder = CfnChannelFrameCaptureGroupSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelFrameCaptureHlsSettingsProperty(block: CfnChannelFrameCaptureHlsSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.FrameCaptureHlsSettingsProperty {
    val builder = CfnChannelFrameCaptureHlsSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelFrameCaptureOutputSettingsProperty(block: CfnChannelFrameCaptureOutputSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.FrameCaptureOutputSettingsProperty {
    val builder = CfnChannelFrameCaptureOutputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelFrameCaptureS3SettingsProperty(block: CfnChannelFrameCaptureS3SettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.FrameCaptureS3SettingsProperty {
    val builder = CfnChannelFrameCaptureS3SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelFrameCaptureSettingsProperty(block: CfnChannelFrameCaptureSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.FrameCaptureSettingsProperty {
    val builder = CfnChannelFrameCaptureSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelGlobalConfigurationProperty(block: CfnChannelGlobalConfigurationPropertyDsl.() -> Unit
      = {}): CfnChannel.GlobalConfigurationProperty {
    val builder = CfnChannelGlobalConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelH264ColorSpaceSettingsProperty(block: CfnChannelH264ColorSpaceSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.H264ColorSpaceSettingsProperty {
    val builder = CfnChannelH264ColorSpaceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelH264FilterSettingsProperty(block: CfnChannelH264FilterSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.H264FilterSettingsProperty {
    val builder = CfnChannelH264FilterSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelH264SettingsProperty(block: CfnChannelH264SettingsPropertyDsl.() -> Unit = {}):
      CfnChannel.H264SettingsProperty {
    val builder = CfnChannelH264SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelH265ColorSpaceSettingsProperty(block: CfnChannelH265ColorSpaceSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.H265ColorSpaceSettingsProperty {
    val builder = CfnChannelH265ColorSpaceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelH265FilterSettingsProperty(block: CfnChannelH265FilterSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.H265FilterSettingsProperty {
    val builder = CfnChannelH265FilterSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelH265SettingsProperty(block: CfnChannelH265SettingsPropertyDsl.() -> Unit = {}):
      CfnChannel.H265SettingsProperty {
    val builder = CfnChannelH265SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelHdr10SettingsProperty(block: CfnChannelHdr10SettingsPropertyDsl.() -> Unit =
      {}): CfnChannel.Hdr10SettingsProperty {
    val builder = CfnChannelHdr10SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelHlsAkamaiSettingsProperty(block: CfnChannelHlsAkamaiSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.HlsAkamaiSettingsProperty {
    val builder = CfnChannelHlsAkamaiSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelHlsBasicPutSettingsProperty(block: CfnChannelHlsBasicPutSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.HlsBasicPutSettingsProperty {
    val builder = CfnChannelHlsBasicPutSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelHlsCdnSettingsProperty(block: CfnChannelHlsCdnSettingsPropertyDsl.() -> Unit =
      {}): CfnChannel.HlsCdnSettingsProperty {
    val builder = CfnChannelHlsCdnSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelHlsGroupSettingsProperty(block: CfnChannelHlsGroupSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.HlsGroupSettingsProperty {
    val builder = CfnChannelHlsGroupSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelHlsInputSettingsProperty(block: CfnChannelHlsInputSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.HlsInputSettingsProperty {
    val builder = CfnChannelHlsInputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelHlsMediaStoreSettingsProperty(block: CfnChannelHlsMediaStoreSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.HlsMediaStoreSettingsProperty {
    val builder = CfnChannelHlsMediaStoreSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelHlsOutputSettingsProperty(block: CfnChannelHlsOutputSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.HlsOutputSettingsProperty {
    val builder = CfnChannelHlsOutputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelHlsS3SettingsProperty(block: CfnChannelHlsS3SettingsPropertyDsl.() -> Unit =
      {}): CfnChannel.HlsS3SettingsProperty {
    val builder = CfnChannelHlsS3SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnChannelHlsSettingsProperty(block: CfnChannelHlsSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.HlsSettingsProperty {
    val builder = CfnChannelHlsSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelHlsWebdavSettingsProperty(block: CfnChannelHlsWebdavSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.HlsWebdavSettingsProperty {
    val builder = CfnChannelHlsWebdavSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelHtmlMotionGraphicsSettingsProperty(block: CfnChannelHtmlMotionGraphicsSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.HtmlMotionGraphicsSettingsProperty {
    val builder = CfnChannelHtmlMotionGraphicsSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelInputAttachmentProperty(block: CfnChannelInputAttachmentPropertyDsl.() -> Unit =
      {}): CfnChannel.InputAttachmentProperty {
    val builder = CfnChannelInputAttachmentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelInputChannelLevelProperty(block: CfnChannelInputChannelLevelPropertyDsl.() -> Unit
      = {}): CfnChannel.InputChannelLevelProperty {
    val builder = CfnChannelInputChannelLevelPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelInputLocationProperty(block: CfnChannelInputLocationPropertyDsl.() -> Unit =
      {}): CfnChannel.InputLocationProperty {
    val builder = CfnChannelInputLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelInputLossBehaviorProperty(block: CfnChannelInputLossBehaviorPropertyDsl.() -> Unit
      = {}): CfnChannel.InputLossBehaviorProperty {
    val builder = CfnChannelInputLossBehaviorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelInputLossFailoverSettingsProperty(block: CfnChannelInputLossFailoverSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.InputLossFailoverSettingsProperty {
    val builder = CfnChannelInputLossFailoverSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelInputSettingsProperty(block: CfnChannelInputSettingsPropertyDsl.() -> Unit =
      {}): CfnChannel.InputSettingsProperty {
    val builder = CfnChannelInputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelInputSpecificationProperty(block: CfnChannelInputSpecificationPropertyDsl.() -> Unit
      = {}): CfnChannel.InputSpecificationProperty {
    val builder = CfnChannelInputSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelKeyProviderSettingsProperty(block: CfnChannelKeyProviderSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.KeyProviderSettingsProperty {
    val builder = CfnChannelKeyProviderSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelM2tsSettingsProperty(block: CfnChannelM2tsSettingsPropertyDsl.() -> Unit = {}):
      CfnChannel.M2tsSettingsProperty {
    val builder = CfnChannelM2tsSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelM3u8SettingsProperty(block: CfnChannelM3u8SettingsPropertyDsl.() -> Unit = {}):
      CfnChannel.M3u8SettingsProperty {
    val builder = CfnChannelM3u8SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelMaintenanceCreateSettingsProperty(block: CfnChannelMaintenanceCreateSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.MaintenanceCreateSettingsProperty {
    val builder = CfnChannelMaintenanceCreateSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelMaintenanceUpdateSettingsProperty(block: CfnChannelMaintenanceUpdateSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.MaintenanceUpdateSettingsProperty {
    val builder = CfnChannelMaintenanceUpdateSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelMediaPackageGroupSettingsProperty(block: CfnChannelMediaPackageGroupSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.MediaPackageGroupSettingsProperty {
    val builder = CfnChannelMediaPackageGroupSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelMediaPackageOutputDestinationSettingsProperty(block: CfnChannelMediaPackageOutputDestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.MediaPackageOutputDestinationSettingsProperty {
    val builder = CfnChannelMediaPackageOutputDestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelMediaPackageOutputSettingsProperty(block: CfnChannelMediaPackageOutputSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.MediaPackageOutputSettingsProperty {
    val builder = CfnChannelMediaPackageOutputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelMotionGraphicsConfigurationProperty(block: CfnChannelMotionGraphicsConfigurationPropertyDsl.() -> Unit
      = {}): CfnChannel.MotionGraphicsConfigurationProperty {
    val builder = CfnChannelMotionGraphicsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelMotionGraphicsSettingsProperty(block: CfnChannelMotionGraphicsSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.MotionGraphicsSettingsProperty {
    val builder = CfnChannelMotionGraphicsSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnChannelMp2SettingsProperty(block: CfnChannelMp2SettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.Mp2SettingsProperty {
    val builder = CfnChannelMp2SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelMpeg2FilterSettingsProperty(block: CfnChannelMpeg2FilterSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.Mpeg2FilterSettingsProperty {
    val builder = CfnChannelMpeg2FilterSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelMpeg2SettingsProperty(block: CfnChannelMpeg2SettingsPropertyDsl.() -> Unit =
      {}): CfnChannel.Mpeg2SettingsProperty {
    val builder = CfnChannelMpeg2SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelMsSmoothGroupSettingsProperty(block: CfnChannelMsSmoothGroupSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.MsSmoothGroupSettingsProperty {
    val builder = CfnChannelMsSmoothGroupSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelMsSmoothOutputSettingsProperty(block: CfnChannelMsSmoothOutputSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.MsSmoothOutputSettingsProperty {
    val builder = CfnChannelMsSmoothOutputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelMultiplexGroupSettingsProperty(block: CfnChannelMultiplexGroupSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.MultiplexGroupSettingsProperty {
    val builder = CfnChannelMultiplexGroupSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelMultiplexOutputSettingsProperty(block: CfnChannelMultiplexOutputSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.MultiplexOutputSettingsProperty {
    val builder = CfnChannelMultiplexOutputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelMultiplexProgramChannelDestinationSettingsProperty(block: CfnChannelMultiplexProgramChannelDestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.MultiplexProgramChannelDestinationSettingsProperty {
    val builder = CfnChannelMultiplexProgramChannelDestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelNetworkInputSettingsProperty(block: CfnChannelNetworkInputSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.NetworkInputSettingsProperty {
    val builder = CfnChannelNetworkInputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnChannelNielsenCBETProperty(block: CfnChannelNielsenCBETPropertyDsl.() -> Unit
      = {}): CfnChannel.NielsenCBETProperty {
    val builder = CfnChannelNielsenCBETPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelNielsenConfigurationProperty(block: CfnChannelNielsenConfigurationPropertyDsl.() -> Unit
      = {}): CfnChannel.NielsenConfigurationProperty {
    val builder = CfnChannelNielsenConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelNielsenNaesIiNwProperty(block: CfnChannelNielsenNaesIiNwPropertyDsl.() -> Unit =
      {}): CfnChannel.NielsenNaesIiNwProperty {
    val builder = CfnChannelNielsenNaesIiNwPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelNielsenWatermarksSettingsProperty(block: CfnChannelNielsenWatermarksSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.NielsenWatermarksSettingsProperty {
    val builder = CfnChannelNielsenWatermarksSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelOutputDestinationProperty(block: CfnChannelOutputDestinationPropertyDsl.() -> Unit
      = {}): CfnChannel.OutputDestinationProperty {
    val builder = CfnChannelOutputDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelOutputDestinationSettingsProperty(block: CfnChannelOutputDestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.OutputDestinationSettingsProperty {
    val builder = CfnChannelOutputDestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnChannelOutputGroupProperty(block: CfnChannelOutputGroupPropertyDsl.() -> Unit
      = {}): CfnChannel.OutputGroupProperty {
    val builder = CfnChannelOutputGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelOutputGroupSettingsProperty(block: CfnChannelOutputGroupSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.OutputGroupSettingsProperty {
    val builder = CfnChannelOutputGroupSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelOutputLocationRefProperty(block: CfnChannelOutputLocationRefPropertyDsl.() -> Unit
      = {}): CfnChannel.OutputLocationRefProperty {
    val builder = CfnChannelOutputLocationRefPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnChannelOutputProperty(block: CfnChannelOutputPropertyDsl.() -> Unit = {}):
      CfnChannel.OutputProperty {
    val builder = CfnChannelOutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelOutputSettingsProperty(block: CfnChannelOutputSettingsPropertyDsl.() -> Unit =
      {}): CfnChannel.OutputSettingsProperty {
    val builder = CfnChannelOutputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelPassThroughSettingsProperty(block: CfnChannelPassThroughSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.PassThroughSettingsProperty {
    val builder = CfnChannelPassThroughSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnChannelProps(block: CfnChannelPropsDsl.() -> Unit = {}): CfnChannelProps {
    val builder = CfnChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnChannelRawSettingsProperty(block: CfnChannelRawSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.RawSettingsProperty {
    val builder = CfnChannelRawSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelRec601SettingsProperty(block: CfnChannelRec601SettingsPropertyDsl.() -> Unit =
      {}): CfnChannel.Rec601SettingsProperty {
    val builder = CfnChannelRec601SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelRec709SettingsProperty(block: CfnChannelRec709SettingsPropertyDsl.() -> Unit =
      {}): CfnChannel.Rec709SettingsProperty {
    val builder = CfnChannelRec709SettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelRemixSettingsProperty(block: CfnChannelRemixSettingsPropertyDsl.() -> Unit =
      {}): CfnChannel.RemixSettingsProperty {
    val builder = CfnChannelRemixSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelRtmpCaptionInfoDestinationSettingsProperty(block: CfnChannelRtmpCaptionInfoDestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.RtmpCaptionInfoDestinationSettingsProperty {
    val builder = CfnChannelRtmpCaptionInfoDestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelRtmpGroupSettingsProperty(block: CfnChannelRtmpGroupSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.RtmpGroupSettingsProperty {
    val builder = CfnChannelRtmpGroupSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelRtmpOutputSettingsProperty(block: CfnChannelRtmpOutputSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.RtmpOutputSettingsProperty {
    val builder = CfnChannelRtmpOutputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelScte20PlusEmbeddedDestinationSettingsProperty(block: CfnChannelScte20PlusEmbeddedDestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty {
    val builder = CfnChannelScte20PlusEmbeddedDestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelScte20SourceSettingsProperty(block: CfnChannelScte20SourceSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.Scte20SourceSettingsProperty {
    val builder = CfnChannelScte20SourceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelScte27DestinationSettingsProperty(block: CfnChannelScte27DestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.Scte27DestinationSettingsProperty {
    val builder = CfnChannelScte27DestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelScte27SourceSettingsProperty(block: CfnChannelScte27SourceSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.Scte27SourceSettingsProperty {
    val builder = CfnChannelScte27SourceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelScte35SpliceInsertProperty(block: CfnChannelScte35SpliceInsertPropertyDsl.() -> Unit
      = {}): CfnChannel.Scte35SpliceInsertProperty {
    val builder = CfnChannelScte35SpliceInsertPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelScte35TimeSignalAposProperty(block: CfnChannelScte35TimeSignalAposPropertyDsl.() -> Unit
      = {}): CfnChannel.Scte35TimeSignalAposProperty {
    val builder = CfnChannelScte35TimeSignalAposPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelSmpteTtDestinationSettingsProperty(block: CfnChannelSmpteTtDestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.SmpteTtDestinationSettingsProperty {
    val builder = CfnChannelSmpteTtDestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelStandardHlsSettingsProperty(block: CfnChannelStandardHlsSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.StandardHlsSettingsProperty {
    val builder = CfnChannelStandardHlsSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelStaticKeySettingsProperty(block: CfnChannelStaticKeySettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.StaticKeySettingsProperty {
    val builder = CfnChannelStaticKeySettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelTeletextDestinationSettingsProperty(block: CfnChannelTeletextDestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.TeletextDestinationSettingsProperty {
    val builder = CfnChannelTeletextDestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelTeletextSourceSettingsProperty(block: CfnChannelTeletextSourceSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.TeletextSourceSettingsProperty {
    val builder = CfnChannelTeletextSourceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelTemporalFilterSettingsProperty(block: CfnChannelTemporalFilterSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.TemporalFilterSettingsProperty {
    val builder = CfnChannelTemporalFilterSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelTimecodeBurninSettingsProperty(block: CfnChannelTimecodeBurninSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.TimecodeBurninSettingsProperty {
    val builder = CfnChannelTimecodeBurninSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelTimecodeConfigProperty(block: CfnChannelTimecodeConfigPropertyDsl.() -> Unit =
      {}): CfnChannel.TimecodeConfigProperty {
    val builder = CfnChannelTimecodeConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelTtmlDestinationSettingsProperty(block: CfnChannelTtmlDestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.TtmlDestinationSettingsProperty {
    val builder = CfnChannelTtmlDestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelUdpContainerSettingsProperty(block: CfnChannelUdpContainerSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.UdpContainerSettingsProperty {
    val builder = CfnChannelUdpContainerSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelUdpGroupSettingsProperty(block: CfnChannelUdpGroupSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.UdpGroupSettingsProperty {
    val builder = CfnChannelUdpGroupSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelUdpOutputSettingsProperty(block: CfnChannelUdpOutputSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.UdpOutputSettingsProperty {
    val builder = CfnChannelUdpOutputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelVideoBlackFailoverSettingsProperty(block: CfnChannelVideoBlackFailoverSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.VideoBlackFailoverSettingsProperty {
    val builder = CfnChannelVideoBlackFailoverSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelVideoCodecSettingsProperty(block: CfnChannelVideoCodecSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.VideoCodecSettingsProperty {
    val builder = CfnChannelVideoCodecSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelVideoDescriptionProperty(block: CfnChannelVideoDescriptionPropertyDsl.() -> Unit
      = {}): CfnChannel.VideoDescriptionProperty {
    val builder = CfnChannelVideoDescriptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelVideoSelectorColorSpaceSettingsProperty(block: CfnChannelVideoSelectorColorSpaceSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.VideoSelectorColorSpaceSettingsProperty {
    val builder = CfnChannelVideoSelectorColorSpaceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelVideoSelectorPidProperty(block: CfnChannelVideoSelectorPidPropertyDsl.() -> Unit
      = {}): CfnChannel.VideoSelectorPidProperty {
    val builder = CfnChannelVideoSelectorPidPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelVideoSelectorProgramIdProperty(block: CfnChannelVideoSelectorProgramIdPropertyDsl.() -> Unit
      = {}): CfnChannel.VideoSelectorProgramIdProperty {
    val builder = CfnChannelVideoSelectorProgramIdPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelVideoSelectorProperty(block: CfnChannelVideoSelectorPropertyDsl.() -> Unit =
      {}): CfnChannel.VideoSelectorProperty {
    val builder = CfnChannelVideoSelectorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelVideoSelectorSettingsProperty(block: CfnChannelVideoSelectorSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.VideoSelectorSettingsProperty {
    val builder = CfnChannelVideoSelectorSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelVpcOutputSettingsProperty(block: CfnChannelVpcOutputSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.VpcOutputSettingsProperty {
    val builder = CfnChannelVpcOutputSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnChannelWavSettingsProperty(block: CfnChannelWavSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.WavSettingsProperty {
    val builder = CfnChannelWavSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnChannelWebvttDestinationSettingsProperty(block: CfnChannelWebvttDestinationSettingsPropertyDsl.() -> Unit
      = {}): CfnChannel.WebvttDestinationSettingsProperty {
    val builder = CfnChannelWebvttDestinationSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInput(
    scope: Construct,
    id: String,
    block: CfnInputDsl.() -> Unit = {},
  ): CfnInput {
    val builder = CfnInputDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInputInputDestinationRequestProperty(block: CfnInputInputDestinationRequestPropertyDsl.() -> Unit
      = {}): CfnInput.InputDestinationRequestProperty {
    val builder = CfnInputInputDestinationRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInputInputDeviceRequestProperty(block: CfnInputInputDeviceRequestPropertyDsl.() -> Unit
      = {}): CfnInput.InputDeviceRequestProperty {
    val builder = CfnInputInputDeviceRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInputInputDeviceSettingsProperty(block: CfnInputInputDeviceSettingsPropertyDsl.() -> Unit
      = {}): CfnInput.InputDeviceSettingsProperty {
    val builder = CfnInputInputDeviceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInputInputSourceRequestProperty(block: CfnInputInputSourceRequestPropertyDsl.() -> Unit
      = {}): CfnInput.InputSourceRequestProperty {
    val builder = CfnInputInputSourceRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInputInputVpcRequestProperty(block: CfnInputInputVpcRequestPropertyDsl.() -> Unit =
      {}): CfnInput.InputVpcRequestProperty {
    val builder = CfnInputInputVpcRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInputMediaConnectFlowRequestProperty(block: CfnInputMediaConnectFlowRequestPropertyDsl.() -> Unit
      = {}): CfnInput.MediaConnectFlowRequestProperty {
    val builder = CfnInputMediaConnectFlowRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInputProps(block: CfnInputPropsDsl.() -> Unit = {}): CfnInputProps {
    val builder = CfnInputPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInputSecurityGroup(
    scope: Construct,
    id: String,
    block: CfnInputSecurityGroupDsl.() -> Unit = {},
  ): CfnInputSecurityGroup {
    val builder = CfnInputSecurityGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInputSecurityGroupInputWhitelistRuleCidrProperty(block: CfnInputSecurityGroupInputWhitelistRuleCidrPropertyDsl.() -> Unit
      = {}): CfnInputSecurityGroup.InputWhitelistRuleCidrProperty {
    val builder = CfnInputSecurityGroupInputWhitelistRuleCidrPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInputSecurityGroupProps(block: CfnInputSecurityGroupPropsDsl.() -> Unit =
      {}): CfnInputSecurityGroupProps {
    val builder = CfnInputSecurityGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
