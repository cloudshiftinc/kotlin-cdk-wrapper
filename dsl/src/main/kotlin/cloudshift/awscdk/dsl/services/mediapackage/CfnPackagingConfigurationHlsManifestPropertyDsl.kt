@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

/**
 * Parameters for an HLS manifest.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * HlsManifestProperty hlsManifestProperty = HlsManifestProperty.builder()
 * .adMarkers("adMarkers")
 * .includeIframeOnlyStream(false)
 * .manifestName("manifestName")
 * .programDateTimeIntervalSeconds(123)
 * .repeatExtXKey(false)
 * .streamSelection(StreamSelectionProperty.builder()
 * .maxVideoBitsPerSecond(123)
 * .minVideoBitsPerSecond(123)
 * .streamOrder("streamOrder")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsmanifest.html)
 */
@CdkDslMarker
public class CfnPackagingConfigurationHlsManifestPropertyDsl {
  private val cdkBuilder: CfnPackagingConfiguration.HlsManifestProperty.Builder =
      CfnPackagingConfiguration.HlsManifestProperty.builder()

  /**
   * @param adMarkers This setting controls ad markers in the packaged content.
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
   * @param includeIframeOnlyStream Applies to stream sets with a single video track only.
   * When enabled, the output includes an additional I-frame only stream, along with the other
   * tracks.
   */
  public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
    cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
  }

  /**
   * @param includeIframeOnlyStream Applies to stream sets with a single video track only.
   * When enabled, the output includes an additional I-frame only stream, along with the other
   * tracks.
   */
  public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
    cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
  }

  /**
   * @param manifestName A short string that's appended to the end of the endpoint URL to create a
   * unique path to this packaging configuration.
   */
  public fun manifestName(manifestName: String) {
    cdkBuilder.manifestName(manifestName)
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
   * @param repeatExtXKey Repeat the `EXT-X-KEY` directive for every media segment.
   * This might result in an increase in client requests to the DRM server.
   */
  public fun repeatExtXKey(repeatExtXKey: Boolean) {
    cdkBuilder.repeatExtXKey(repeatExtXKey)
  }

  /**
   * @param repeatExtXKey Repeat the `EXT-X-KEY` directive for every media segment.
   * This might result in an increase in client requests to the DRM server.
   */
  public fun repeatExtXKey(repeatExtXKey: IResolvable) {
    cdkBuilder.repeatExtXKey(repeatExtXKey)
  }

  /**
   * @param streamSelection Video bitrate limitations for outputs from this packaging configuration.
   */
  public fun streamSelection(streamSelection: IResolvable) {
    cdkBuilder.streamSelection(streamSelection)
  }

  /**
   * @param streamSelection Video bitrate limitations for outputs from this packaging configuration.
   */
  public fun streamSelection(streamSelection: CfnPackagingConfiguration.StreamSelectionProperty) {
    cdkBuilder.streamSelection(streamSelection)
  }

  public fun build(): CfnPackagingConfiguration.HlsManifestProperty = cdkBuilder.build()
}
