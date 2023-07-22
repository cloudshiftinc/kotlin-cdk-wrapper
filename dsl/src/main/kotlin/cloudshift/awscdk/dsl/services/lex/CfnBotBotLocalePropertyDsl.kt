@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotBotLocalePropertyDsl {
  private val cdkBuilder: CfnBot.BotLocaleProperty.Builder = CfnBot.BotLocaleProperty.builder()

  private val _intents: MutableList<Any> = mutableListOf()

  private val _slotTypes: MutableList<Any> = mutableListOf()

  /**
   * @param customVocabulary Specifies a custom vocabulary to use with a specific locale.
   */
  public fun customVocabulary(customVocabulary: IResolvable) {
    cdkBuilder.customVocabulary(customVocabulary)
  }

  /**
   * @param customVocabulary Specifies a custom vocabulary to use with a specific locale.
   */
  public fun customVocabulary(customVocabulary: CfnBot.CustomVocabularyProperty) {
    cdkBuilder.customVocabulary(customVocabulary)
  }

  /**
   * @param description A description of the bot locale.
   * Use this to help identify the bot locale in lists.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param intents One or more intents defined for the locale.
   */
  public fun intents(vararg intents: Any) {
    _intents.addAll(listOf(*intents))
  }

  /**
   * @param intents One or more intents defined for the locale.
   */
  public fun intents(intents: Collection<Any>) {
    _intents.addAll(intents)
  }

  /**
   * @param intents One or more intents defined for the locale.
   */
  public fun intents(intents: IResolvable) {
    cdkBuilder.intents(intents)
  }

  /**
   * @param localeId The identifier of the language and locale that the bot will be used in. 
   * The string must match one of the supported locales.
   */
  public fun localeId(localeId: String) {
    cdkBuilder.localeId(localeId)
  }

  /**
   * @param nluConfidenceThreshold Determines the threshold where Amazon Lex will insert the
   * `AMAZON.FallbackIntent` , `AMAZON.KendraSearchIntent` , or both when returning alternative
   * intents. You must configure an `AMAZON.FallbackIntent` . `AMAZON.KendraSearchIntent` is only
   * inserted if it is configured for the bot. 
   */
  public fun nluConfidenceThreshold(nluConfidenceThreshold: Number) {
    cdkBuilder.nluConfidenceThreshold(nluConfidenceThreshold)
  }

  /**
   * @param slotTypes One or more slot types defined for the locale.
   */
  public fun slotTypes(vararg slotTypes: Any) {
    _slotTypes.addAll(listOf(*slotTypes))
  }

  /**
   * @param slotTypes One or more slot types defined for the locale.
   */
  public fun slotTypes(slotTypes: Collection<Any>) {
    _slotTypes.addAll(slotTypes)
  }

  /**
   * @param slotTypes One or more slot types defined for the locale.
   */
  public fun slotTypes(slotTypes: IResolvable) {
    cdkBuilder.slotTypes(slotTypes)
  }

  /**
   * @param voiceSettings Defines settings for using an Amazon Polly voice to communicate with a
   * user.
   */
  public fun voiceSettings(voiceSettings: IResolvable) {
    cdkBuilder.voiceSettings(voiceSettings)
  }

  /**
   * @param voiceSettings Defines settings for using an Amazon Polly voice to communicate with a
   * user.
   */
  public fun voiceSettings(voiceSettings: CfnBot.VoiceSettingsProperty) {
    cdkBuilder.voiceSettings(voiceSettings)
  }

  public fun build(): CfnBot.BotLocaleProperty {
    if(_intents.isNotEmpty()) cdkBuilder.intents(_intents)
    if(_slotTypes.isNotEmpty()) cdkBuilder.slotTypes(_slotTypes)
    return cdkBuilder.build()
  }
}
