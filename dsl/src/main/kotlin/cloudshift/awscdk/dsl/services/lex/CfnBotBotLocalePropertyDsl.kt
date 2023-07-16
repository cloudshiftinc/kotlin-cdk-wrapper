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

  public fun customVocabulary(customVocabulary: IResolvable) {
    cdkBuilder.customVocabulary(customVocabulary)
  }

  public fun customVocabulary(customVocabulary: CfnBot.CustomVocabularyProperty) {
    cdkBuilder.customVocabulary(customVocabulary)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun intents(vararg intents: Any) {
    _intents.addAll(listOf(*intents))
  }

  public fun intents(intents: Collection<Any>) {
    _intents.addAll(intents)
  }

  public fun intents(intents: IResolvable) {
    cdkBuilder.intents(intents)
  }

  public fun localeId(localeId: String) {
    cdkBuilder.localeId(localeId)
  }

  public fun nluConfidenceThreshold(nluConfidenceThreshold: Number) {
    cdkBuilder.nluConfidenceThreshold(nluConfidenceThreshold)
  }

  public fun slotTypes(vararg slotTypes: Any) {
    _slotTypes.addAll(listOf(*slotTypes))
  }

  public fun slotTypes(slotTypes: Collection<Any>) {
    _slotTypes.addAll(slotTypes)
  }

  public fun slotTypes(slotTypes: IResolvable) {
    cdkBuilder.slotTypes(slotTypes)
  }

  public fun voiceSettings(voiceSettings: IResolvable) {
    cdkBuilder.voiceSettings(voiceSettings)
  }

  public fun voiceSettings(voiceSettings: CfnBot.VoiceSettingsProperty) {
    cdkBuilder.voiceSettings(voiceSettings)
  }

  public fun build(): CfnBot.BotLocaleProperty {
    if(_intents.isNotEmpty()) cdkBuilder.intents(_intents)
    if(_slotTypes.isNotEmpty()) cdkBuilder.slotTypes(_slotTypes)
    return cdkBuilder.build()
  }
}
