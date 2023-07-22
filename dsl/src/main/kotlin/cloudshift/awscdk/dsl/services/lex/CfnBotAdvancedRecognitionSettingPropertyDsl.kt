@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotAdvancedRecognitionSettingPropertyDsl {
  private val cdkBuilder: CfnBot.AdvancedRecognitionSettingProperty.Builder =
      CfnBot.AdvancedRecognitionSettingProperty.builder()

  /**
   * @param audioRecognitionStrategy Enables using the slot values as a custom vocabulary for
   * recognizing user utterances.
   */
  public fun audioRecognitionStrategy(audioRecognitionStrategy: String) {
    cdkBuilder.audioRecognitionStrategy(audioRecognitionStrategy)
  }

  public fun build(): CfnBot.AdvancedRecognitionSettingProperty = cdkBuilder.build()
}
