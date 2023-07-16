@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotVoiceSettingsPropertyDsl {
  private val cdkBuilder: CfnBot.VoiceSettingsProperty.Builder =
      CfnBot.VoiceSettingsProperty.builder()

  public fun engine(engine: String) {
    cdkBuilder.engine(engine)
  }

  public fun voiceId(voiceId: String) {
    cdkBuilder.voiceId(voiceId)
  }

  public fun build(): CfnBot.VoiceSettingsProperty = cdkBuilder.build()
}
