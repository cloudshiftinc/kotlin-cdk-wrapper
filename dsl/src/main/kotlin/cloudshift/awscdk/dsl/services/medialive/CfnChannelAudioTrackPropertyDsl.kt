@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Information about one audio track to extract. You can select multiple tracks.
 *
 * The parent of this entity is AudioTrackSelection.
 *
 * Example:
 *
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
@CdkDslMarker
public class CfnChannelAudioTrackPropertyDsl {
  private val cdkBuilder: CfnChannel.AudioTrackProperty.Builder =
      CfnChannel.AudioTrackProperty.builder()

  /**
   * @param track 1-based integer value that maps to a specific audio track.
   */
  public fun track(track: Number) {
    cdkBuilder.track(track)
  }

  public fun build(): CfnChannel.AudioTrackProperty = cdkBuilder.build()
}
