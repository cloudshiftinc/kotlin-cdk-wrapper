@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotVoiceSettingsPropertyDsl {
  private val cdkBuilder: CfnBot.VoiceSettingsProperty.Builder =
      CfnBot.VoiceSettingsProperty.builder()

  /**
   * @param engine Indicates the type of Amazon Polly voice that Amazon Lex should use for voice
   * interaction with the user.
   * For more information, see the [`engine` parameter of the `SynthesizeSpeech`
   * operation](https://docs.aws.amazon.com/polly/latest/dg/API_SynthesizeSpeech.html#polly-SynthesizeSpeech-request-Engine)
   * in the *Amazon Polly developer guide* .
   *
   * If you do not specify a value, the default is `standard` .
   */
  public fun engine(engine: String) {
    cdkBuilder.engine(engine)
  }

  /**
   * @param voiceId The identifier of the Amazon Polly voice to use. 
   */
  public fun voiceId(voiceId: String) {
    cdkBuilder.voiceId(voiceId)
  }

  public fun build(): CfnBot.VoiceSettingsProperty = cdkBuilder.build()
}
