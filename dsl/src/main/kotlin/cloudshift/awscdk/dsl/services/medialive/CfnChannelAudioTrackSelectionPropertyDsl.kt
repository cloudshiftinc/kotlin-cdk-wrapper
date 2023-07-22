@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Information about the audio track to extract.
 *
 * The parent of this entity is AudioSelectorSettings.
 *
 * Example:
 *
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
@CdkDslMarker
public class CfnChannelAudioTrackSelectionPropertyDsl {
  private val cdkBuilder: CfnChannel.AudioTrackSelectionProperty.Builder =
      CfnChannel.AudioTrackSelectionProperty.builder()

  private val _tracks: MutableList<Any> = mutableListOf()

  /**
   * @param dolbyEDecode the value to be set.
   */
  public fun dolbyEDecode(dolbyEDecode: IResolvable) {
    cdkBuilder.dolbyEDecode(dolbyEDecode)
  }

  /**
   * @param dolbyEDecode the value to be set.
   */
  public fun dolbyEDecode(dolbyEDecode: CfnChannel.AudioDolbyEDecodeProperty) {
    cdkBuilder.dolbyEDecode(dolbyEDecode)
  }

  /**
   * @param tracks Selects one or more unique audio tracks from within a source.
   */
  public fun tracks(vararg tracks: Any) {
    _tracks.addAll(listOf(*tracks))
  }

  /**
   * @param tracks Selects one or more unique audio tracks from within a source.
   */
  public fun tracks(tracks: Collection<Any>) {
    _tracks.addAll(tracks)
  }

  /**
   * @param tracks Selects one or more unique audio tracks from within a source.
   */
  public fun tracks(tracks: IResolvable) {
    cdkBuilder.tracks(tracks)
  }

  public fun build(): CfnChannel.AudioTrackSelectionProperty {
    if(_tracks.isNotEmpty()) cdkBuilder.tracks(_tracks)
    return cdkBuilder.build()
  }
}
