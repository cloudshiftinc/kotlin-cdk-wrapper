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

  public fun audioDescriptionNames(vararg audioDescriptionNames: String) {
    _audioDescriptionNames.addAll(listOf(*audioDescriptionNames))
  }

  public fun audioDescriptionNames(audioDescriptionNames: Collection<String>) {
    _audioDescriptionNames.addAll(audioDescriptionNames)
  }

  public fun captionDescriptionNames(vararg captionDescriptionNames: String) {
    _captionDescriptionNames.addAll(listOf(*captionDescriptionNames))
  }

  public fun captionDescriptionNames(captionDescriptionNames: Collection<String>) {
    _captionDescriptionNames.addAll(captionDescriptionNames)
  }

  public fun outputName(outputName: String) {
    cdkBuilder.outputName(outputName)
  }

  public fun outputSettings(outputSettings: IResolvable) {
    cdkBuilder.outputSettings(outputSettings)
  }

  public fun outputSettings(outputSettings: CfnChannel.OutputSettingsProperty) {
    cdkBuilder.outputSettings(outputSettings)
  }

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
