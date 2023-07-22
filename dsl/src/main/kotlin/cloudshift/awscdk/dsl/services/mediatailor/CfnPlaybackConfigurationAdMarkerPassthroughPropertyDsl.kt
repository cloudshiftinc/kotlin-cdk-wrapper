@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

/**
 * For HLS, when set to true, MediaTailor passes through EXT-X-CUE-IN, EXT-X-CUE-OUT, and
 * EXT-X-SPLICEPOINT-SCTE35 ad markers from the origin manifest to the MediaTailor personalized
 * manifest.
 *
 * No logic is applied to these ad markers. For example, if EXT-X-CUE-OUT has a value of 60, but no
 * ads are filled for that ad break, MediaTailor will not set the value to 0.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * AdMarkerPassthroughProperty adMarkerPassthroughProperty = AdMarkerPassthroughProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-playbackconfiguration-admarkerpassthrough.html)
 */
@CdkDslMarker
public class CfnPlaybackConfigurationAdMarkerPassthroughPropertyDsl {
  private val cdkBuilder: CfnPlaybackConfiguration.AdMarkerPassthroughProperty.Builder =
      CfnPlaybackConfiguration.AdMarkerPassthroughProperty.builder()

  /**
   * @param enabled Enables ad marker passthrough for your configuration.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Enables ad marker passthrough for your configuration.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnPlaybackConfiguration.AdMarkerPassthroughProperty = cdkBuilder.build()
}
