@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelOutputPropertyDsl {
  private val cdkBuilder: CfnChannel.OutputProperty.Builder = CfnChannel.OutputProperty.builder()

  private val _audioDescriptionNames: MutableList<String> = mutableListOf()

  private val _captionDescriptionNames: MutableList<String> = mutableListOf()

  /**
   * @param audioDescriptionNames The names of the audio descriptions that are used as audio sources
   * for this output.
   */
  public fun audioDescriptionNames(vararg audioDescriptionNames: String) {
    _audioDescriptionNames.addAll(listOf(*audioDescriptionNames))
  }

  /**
   * @param audioDescriptionNames The names of the audio descriptions that are used as audio sources
   * for this output.
   */
  public fun audioDescriptionNames(audioDescriptionNames: Collection<String>) {
    _audioDescriptionNames.addAll(audioDescriptionNames)
  }

  /**
   * @param captionDescriptionNames The names of the caption descriptions that are used as captions
   * sources for this output.
   */
  public fun captionDescriptionNames(vararg captionDescriptionNames: String) {
    _captionDescriptionNames.addAll(listOf(*captionDescriptionNames))
  }

  /**
   * @param captionDescriptionNames The names of the caption descriptions that are used as captions
   * sources for this output.
   */
  public fun captionDescriptionNames(captionDescriptionNames: Collection<String>) {
    _captionDescriptionNames.addAll(captionDescriptionNames)
  }

  /**
   * @param outputName The name that is used to identify an output.
   */
  public fun outputName(outputName: String) {
    cdkBuilder.outputName(outputName)
  }

  /**
   * @param outputSettings The output type-specific settings.
   */
  public fun outputSettings(outputSettings: IResolvable) {
    cdkBuilder.outputSettings(outputSettings)
  }

  /**
   * @param outputSettings The output type-specific settings.
   */
  public fun outputSettings(outputSettings: CfnChannel.OutputSettingsProperty) {
    cdkBuilder.outputSettings(outputSettings)
  }

  /**
   * @param videoDescriptionName The name of the VideoDescription that is used as the source for
   * this output.
   */
  public fun videoDescriptionName(videoDescriptionName: String) {
    cdkBuilder.videoDescriptionName(videoDescriptionName)
  }

  public fun build(): CfnChannel.OutputProperty {
    if(_audioDescriptionNames.isNotEmpty()) cdkBuilder.audioDescriptionNames(_audioDescriptionNames)
    if(_captionDescriptionNames.isNotEmpty())
        cdkBuilder.captionDescriptionNames(_captionDescriptionNames)
    return cdkBuilder.build()
  }
}
