@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

/**
 * Parameters for Apple HLS packaging.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * HlsPackageProperty hlsPackageProperty = HlsPackageProperty.builder()
 * .adMarkers("adMarkers")
 * .adsOnDeliveryRestrictions("adsOnDeliveryRestrictions")
 * .adTriggers(List.of("adTriggers"))
 * .encryption(HlsEncryptionProperty.builder()
 * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
 * .resourceId("resourceId")
 * .roleArn("roleArn")
 * .systemIds(List.of("systemIds"))
 * .url("url")
 * // the properties below are optional
 * .certificateArn("certificateArn")
 * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build())
 * .build())
 * // the properties below are optional
 * .constantInitializationVector("constantInitializationVector")
 * .encryptionMethod("encryptionMethod")
 * .keyRotationIntervalSeconds(123)
 * .repeatExtXKey(false)
 * .build())
 * .includeDvbSubtitles(false)
 * .includeIframeOnlyStream(false)
 * .playlistType("playlistType")
 * .playlistWindowSeconds(123)
 * .programDateTimeIntervalSeconds(123)
 * .segmentDurationSeconds(123)
 * .streamSelection(StreamSelectionProperty.builder()
 * .maxVideoBitsPerSecond(123)
 * .minVideoBitsPerSecond(123)
 * .streamOrder("streamOrder")
 * .build())
 * .useAudioRenditionGroup(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html)
 */
@CdkDslMarker
public class CfnOriginEndpointHlsPackagePropertyDsl {
  private val cdkBuilder: CfnOriginEndpoint.HlsPackageProperty.Builder =
      CfnOriginEndpoint.HlsPackageProperty.builder()

  private val _adTriggers: MutableList<String> = mutableListOf()

  /**
   * @param adMarkers Controls how ad markers are included in the packaged endpoint.
   * Valid values:
   *
   * * `NONE` - Omits all SCTE-35 ad markers from the output.
   * * `PASSTHROUGH` - Creates a copy in the output of the SCTE-35 ad markers (comments) taken
   * directly from the input manifest.
   * * `SCTE35_ENHANCED` - Generates ad markers and blackout tags in the output based on the SCTE-35
   * messages from the input manifest.
   */
  public fun adMarkers(adMarkers: String) {
    cdkBuilder.adMarkers(adMarkers)
  }

  /**
   * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage treats as
   * ad markers in the output manifest.
   * Valid values:
   *
   * * `BREAK`
   * * `DISTRIBUTOR_ADVERTISEMENT`
   * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
   * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
   * * `PROVIDER_ADVERTISEMENT`
   * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
   * * `PROVIDER_PLACEMENT_OPPORTUNITY`
   * * `SPLICE_INSERT`
   */
  public fun adTriggers(vararg adTriggers: String) {
    _adTriggers.addAll(listOf(*adTriggers))
  }

  /**
   * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage treats as
   * ad markers in the output manifest.
   * Valid values:
   *
   * * `BREAK`
   * * `DISTRIBUTOR_ADVERTISEMENT`
   * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
   * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
   * * `PROVIDER_ADVERTISEMENT`
   * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
   * * `PROVIDER_PLACEMENT_OPPORTUNITY`
   * * `SPLICE_INSERT`
   */
  public fun adTriggers(adTriggers: Collection<String>) {
    _adTriggers.addAll(adTriggers)
  }

  /**
   * @param adsOnDeliveryRestrictions The flags on SCTE-35 segmentation descriptors that have to be
   * present for AWS Elemental MediaPackage to insert ad markers in the output manifest.
   * For information about SCTE-35 in AWS Elemental MediaPackage , see [SCTE-35 Message Options in
   * AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/scte.html) .
   */
  public fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String) {
    cdkBuilder.adsOnDeliveryRestrictions(adsOnDeliveryRestrictions)
  }

  /**
   * @param encryption Parameters for encrypting content.
   */
  public fun encryption(encryption: IResolvable) {
    cdkBuilder.encryption(encryption)
  }

  /**
   * @param encryption Parameters for encrypting content.
   */
  public fun encryption(encryption: CfnOriginEndpoint.HlsEncryptionProperty) {
    cdkBuilder.encryption(encryption)
  }

  /**
   * @param includeDvbSubtitles When enabled, MediaPackage passes through digital video broadcasting
   * (DVB) subtitles into the output.
   */
  public fun includeDvbSubtitles(includeDvbSubtitles: Boolean) {
    cdkBuilder.includeDvbSubtitles(includeDvbSubtitles)
  }

  /**
   * @param includeDvbSubtitles When enabled, MediaPackage passes through digital video broadcasting
   * (DVB) subtitles into the output.
   */
  public fun includeDvbSubtitles(includeDvbSubtitles: IResolvable) {
    cdkBuilder.includeDvbSubtitles(includeDvbSubtitles)
  }

  /**
   * @param includeIframeOnlyStream Only applies to stream sets with a single video track.
   * When true, the stream set includes an additional I-frame only stream, along with the other
   * tracks. If false, this extra stream is not included.
   */
  public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
    cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
  }

  /**
   * @param includeIframeOnlyStream Only applies to stream sets with a single video track.
   * When true, the stream set includes an additional I-frame only stream, along with the other
   * tracks. If false, this extra stream is not included.
   */
  public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
    cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
  }

  /**
   * @param playlistType When specified as either `event` or `vod` , a corresponding
   * `EXT-X-PLAYLIST-TYPE` entry is included in the media playlist.
   * Indicates if the playlist is live-to-VOD content.
   */
  public fun playlistType(playlistType: String) {
    cdkBuilder.playlistType(playlistType)
  }

  /**
   * @param playlistWindowSeconds Time window (in seconds) contained in each parent manifest.
   */
  public fun playlistWindowSeconds(playlistWindowSeconds: Number) {
    cdkBuilder.playlistWindowSeconds(playlistWindowSeconds)
  }

  /**
   * @param programDateTimeIntervalSeconds Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output
   * manifest at the interval that you specify.
   * Additionally, ID3Timed metadata messages are generated every 5 seconds starting when the
   * content was ingested.
   *
   * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed
   * through to the HLS output.
   *
   * Omit this attribute or enter `0` to indicate that the `EXT-X-PROGRAM-DATE-TIME` tags are not
   * included in the manifest.
   */
  public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
    cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
  }

  /**
   * @param segmentDurationSeconds Duration (in seconds) of each fragment.
   * Actual fragments are rounded to the nearest multiple of the source fragment duration.
   */
  public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
    cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
  }

  /**
   * @param streamSelection Limitations for outputs from the endpoint, based on the video bitrate.
   */
  public fun streamSelection(streamSelection: IResolvable) {
    cdkBuilder.streamSelection(streamSelection)
  }

  /**
   * @param streamSelection Limitations for outputs from the endpoint, based on the video bitrate.
   */
  public fun streamSelection(streamSelection: CfnOriginEndpoint.StreamSelectionProperty) {
    cdkBuilder.streamSelection(streamSelection)
  }

  /**
   * @param useAudioRenditionGroup When true, AWS Elemental MediaPackage bundles all audio tracks in
   * a rendition group.
   * All other tracks in the stream can be used with any audio rendition from the group.
   */
  public fun useAudioRenditionGroup(useAudioRenditionGroup: Boolean) {
    cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup)
  }

  /**
   * @param useAudioRenditionGroup When true, AWS Elemental MediaPackage bundles all audio tracks in
   * a rendition group.
   * All other tracks in the stream can be used with any audio rendition from the group.
   */
  public fun useAudioRenditionGroup(useAudioRenditionGroup: IResolvable) {
    cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup)
  }

  public fun build(): CfnOriginEndpoint.HlsPackageProperty {
    if(_adTriggers.isNotEmpty()) cdkBuilder.adTriggers(_adTriggers)
    return cdkBuilder.build()
  }
}
