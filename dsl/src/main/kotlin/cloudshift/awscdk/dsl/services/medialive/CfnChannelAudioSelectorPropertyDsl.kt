@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAudioSelectorPropertyDsl {
  private val cdkBuilder: CfnChannel.AudioSelectorProperty.Builder =
      CfnChannel.AudioSelectorProperty.builder()

  /**
   * @param name A name for this AudioSelector.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param selectorSettings Information about the specific audio to extract from the input.
   */
  public fun selectorSettings(selectorSettings: IResolvable) {
    cdkBuilder.selectorSettings(selectorSettings)
  }

  /**
   * @param selectorSettings Information about the specific audio to extract from the input.
   */
  public fun selectorSettings(selectorSettings: CfnChannel.AudioSelectorSettingsProperty) {
    cdkBuilder.selectorSettings(selectorSettings)
  }

  public fun build(): CfnChannel.AudioSelectorProperty = cdkBuilder.build()
}
