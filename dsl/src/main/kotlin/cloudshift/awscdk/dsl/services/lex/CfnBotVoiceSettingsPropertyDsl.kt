@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Defines settings for using an Amazon Polly voice to communicate with a user.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * VoiceSettingsProperty voiceSettingsProperty = VoiceSettingsProperty.builder()
 * .voiceId("voiceId")
 * // the properties below are optional
 * .engine("engine")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-voicesettings.html)
 */
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
