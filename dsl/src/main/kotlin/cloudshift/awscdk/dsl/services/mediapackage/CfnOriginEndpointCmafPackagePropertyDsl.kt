@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

@CdkDslMarker
public class CfnOriginEndpointCmafPackagePropertyDsl {
  private val cdkBuilder: CfnOriginEndpoint.CmafPackageProperty.Builder =
      CfnOriginEndpoint.CmafPackageProperty.builder()

  private val _hlsManifests: MutableList<Any> = mutableListOf()

  /**
   * @param encryption Parameters for encrypting content.
   */
  public fun encryption(encryption: IResolvable) {
    cdkBuilder.encryption(encryption)
  }

  /**
   * @param encryption Parameters for encrypting content.
   */
  public fun encryption(encryption: CfnOriginEndpoint.CmafEncryptionProperty) {
    cdkBuilder.encryption(encryption)
  }

  /**
   * @param hlsManifests A list of HLS manifest configurations that are available from this
   * endpoint.
   */
  public fun hlsManifests(vararg hlsManifests: Any) {
    _hlsManifests.addAll(listOf(*hlsManifests))
  }

  /**
   * @param hlsManifests A list of HLS manifest configurations that are available from this
   * endpoint.
   */
  public fun hlsManifests(hlsManifests: Collection<Any>) {
    _hlsManifests.addAll(hlsManifests)
  }

  /**
   * @param hlsManifests A list of HLS manifest configurations that are available from this
   * endpoint.
   */
  public fun hlsManifests(hlsManifests: IResolvable) {
    cdkBuilder.hlsManifests(hlsManifests)
  }

  /**
   * @param segmentDurationSeconds Duration (in seconds) of each segment.
   * Actual segments are rounded to the nearest multiple of the source segment duration.
   */
  public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
    cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
  }

  /**
   * @param segmentPrefix An optional custom string that is prepended to the name of each segment.
   * If not specified, the segment prefix defaults to the ChannelId.
   */
  public fun segmentPrefix(segmentPrefix: String) {
    cdkBuilder.segmentPrefix(segmentPrefix)
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

  public fun build(): CfnOriginEndpoint.CmafPackageProperty {
    if(_hlsManifests.isNotEmpty()) cdkBuilder.hlsManifests(_hlsManifests)
    return cdkBuilder.build()
  }
}
