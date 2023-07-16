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

  public fun languageCode(languageCode: String) {
    cdkBuilder.languageCode(languageCode)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun selectorSettings(selectorSettings: IResolvable) {
    cdkBuilder.selectorSettings(selectorSettings)
  }

  public fun selectorSettings(selectorSettings: CfnChannel.CaptionSelectorSettingsProperty) {
    cdkBuilder.selectorSettings(selectorSettings)
  }

  public fun build(): CfnChannel.CaptionSelectorProperty = cdkBuilder.build()
}
