@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelCaptionSelectorPropertyDsl {
  private val cdkBuilder: CfnChannel.CaptionSelectorProperty.Builder =
      CfnChannel.CaptionSelectorProperty.builder()

  /**
   * @param languageCode When specified, this field indicates the three-letter language code of the
   * captions track to extract from the source.
   */
  public fun languageCode(languageCode: String) {
    cdkBuilder.languageCode(languageCode)
  }

  /**
   * @param name The name identifier for a captions selector.
   * This name is used to associate this captions selector with one or more captions descriptions.
   * Names must be unique within a channel.
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
  public fun selectorSettings(selectorSettings: CfnChannel.CaptionSelectorSettingsProperty) {
    cdkBuilder.selectorSettings(selectorSettings)
  }

  public fun build(): CfnChannel.CaptionSelectorProperty = cdkBuilder.build()
}
