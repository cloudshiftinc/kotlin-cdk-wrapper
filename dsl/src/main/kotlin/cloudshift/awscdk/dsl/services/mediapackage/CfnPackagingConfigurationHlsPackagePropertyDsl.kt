@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@CdkDslMarker
public class CfnPackagingConfigurationHlsPackagePropertyDsl {
  private val cdkBuilder: CfnPackagingConfiguration.HlsPackageProperty.Builder =
      CfnPackagingConfiguration.HlsPackageProperty.builder()

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
  public fun encryption(encryption: CfnPackagingConfiguration.HlsEncryptionProperty) {
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
   * @param segmentDurationSeconds Duration (in seconds) of each fragment.
   * Actual fragments are rounded to the nearest multiple of the source fragment duration.
   */
  public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
    cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
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

  public fun build(): CfnPackagingConfiguration.HlsPackageProperty {
    if(_hlsManifests.isNotEmpty()) cdkBuilder.hlsManifests(_hlsManifests)
    return cdkBuilder.build()
  }
}
