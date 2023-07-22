@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The archive container settings.
 *
 * The parent of this entity is ArchiveOutputSettings.
 *
 * Example:
 *
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
@CdkDslMarker
public class CfnChannelArchiveContainerSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.ArchiveContainerSettingsProperty.Builder =
      CfnChannel.ArchiveContainerSettingsProperty.builder()

  /**
   * @param m2TsSettings The settings for the M2TS in the archive output.
   */
  public fun m2TsSettings(m2TsSettings: IResolvable) {
    cdkBuilder.m2TsSettings(m2TsSettings)
  }

  /**
   * @param m2TsSettings The settings for the M2TS in the archive output.
   */
  public fun m2TsSettings(m2TsSettings: CfnChannel.M2tsSettingsProperty) {
    cdkBuilder.m2TsSettings(m2TsSettings)
  }

  /**
   * @param rawSettings The settings for Raw archive output type.
   */
  public fun rawSettings(rawSettings: IResolvable) {
    cdkBuilder.rawSettings(rawSettings)
  }

  /**
   * @param rawSettings The settings for Raw archive output type.
   */
  public fun rawSettings(rawSettings: CfnChannel.RawSettingsProperty) {
    cdkBuilder.rawSettings(rawSettings)
  }

  public fun build(): CfnChannel.ArchiveContainerSettingsProperty = cdkBuilder.build()
}
