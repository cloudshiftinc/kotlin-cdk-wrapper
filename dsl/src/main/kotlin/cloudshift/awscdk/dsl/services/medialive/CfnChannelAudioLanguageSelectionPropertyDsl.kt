@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAudioLanguageSelectionPropertyDsl {
  private val cdkBuilder: CfnChannel.AudioLanguageSelectionProperty.Builder =
      CfnChannel.AudioLanguageSelectionProperty.builder()

  public fun languageCode(languageCode: String) {
    cdkBuilder.languageCode(languageCode)
  }

  public fun languageSelectionPolicy(languageSelectionPolicy: String) {
    cdkBuilder.languageSelectionPolicy(languageSelectionPolicy)
  }

  public fun build(): CfnChannel.AudioLanguageSelectionProperty = cdkBuilder.build()
}
