@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

@CdkDslMarker
public class CfnPlaybackConfigurationManifestProcessingRulesPropertyDsl {
  private val cdkBuilder: CfnPlaybackConfiguration.ManifestProcessingRulesProperty.Builder =
      CfnPlaybackConfiguration.ManifestProcessingRulesProperty.builder()

  /**
   * @param adMarkerPassthrough For HLS, when set to true, MediaTailor passes through EXT-X-CUE-IN,
   * EXT-X-CUE-OUT, and EXT-X-SPLICEPOINT-SCTE35 ad markers from the origin manifest to the MediaTailor
   * personalized manifest.
   * No logic is applied to these ad markers. For example, if EXT-X-CUE-OUT has a value of 60, but
   * no ads are filled for that ad break, MediaTailor will not set the value to 0.
   */
  public fun adMarkerPassthrough(adMarkerPassthrough: IResolvable) {
    cdkBuilder.adMarkerPassthrough(adMarkerPassthrough)
  }

  /**
   * @param adMarkerPassthrough For HLS, when set to true, MediaTailor passes through EXT-X-CUE-IN,
   * EXT-X-CUE-OUT, and EXT-X-SPLICEPOINT-SCTE35 ad markers from the origin manifest to the MediaTailor
   * personalized manifest.
   * No logic is applied to these ad markers. For example, if EXT-X-CUE-OUT has a value of 60, but
   * no ads are filled for that ad break, MediaTailor will not set the value to 0.
   */
  public
      fun adMarkerPassthrough(adMarkerPassthrough: CfnPlaybackConfiguration.AdMarkerPassthroughProperty) {
    cdkBuilder.adMarkerPassthrough(adMarkerPassthrough)
  }

  public fun build(): CfnPlaybackConfiguration.ManifestProcessingRulesProperty = cdkBuilder.build()
}
