@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAudioTrackSelectionPropertyDsl {
  private val cdkBuilder: CfnChannel.AudioTrackSelectionProperty.Builder =
      CfnChannel.AudioTrackSelectionProperty.builder()

  private val _tracks: MutableList<Any> = mutableListOf()

  public fun dolbyEDecode(dolbyEDecode: IResolvable) {
    cdkBuilder.dolbyEDecode(dolbyEDecode)
  }

  public fun dolbyEDecode(dolbyEDecode: CfnChannel.AudioDolbyEDecodeProperty) {
    cdkBuilder.dolbyEDecode(dolbyEDecode)
  }

  public fun tracks(vararg tracks: Any) {
    _tracks.addAll(listOf(*tracks))
  }

  public fun tracks(tracks: Collection<Any>) {
    _tracks.addAll(tracks)
  }

  public fun tracks(tracks: IResolvable) {
    cdkBuilder.tracks(tracks)
  }

  public fun build(): CfnChannel.AudioTrackSelectionProperty {
    if(_tracks.isNotEmpty()) cdkBuilder.tracks(_tracks)
    return cdkBuilder.build()
  }
}
