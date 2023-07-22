@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotTestBotAliasSettingsPropertyDsl {
  private val cdkBuilder: CfnBot.TestBotAliasSettingsProperty.Builder =
      CfnBot.TestBotAliasSettingsProperty.builder()

  private val _botAliasLocaleSettings: MutableList<Any> = mutableListOf()

  /**
   * @param botAliasLocaleSettings Specifies settings that are unique to a locale.
   * For example, you can use a different Lambda function depending on the bot's locale.
   */
  public fun botAliasLocaleSettings(vararg botAliasLocaleSettings: Any) {
    _botAliasLocaleSettings.addAll(listOf(*botAliasLocaleSettings))
  }

  /**
   * @param botAliasLocaleSettings Specifies settings that are unique to a locale.
   * For example, you can use a different Lambda function depending on the bot's locale.
   */
  public fun botAliasLocaleSettings(botAliasLocaleSettings: Collection<Any>) {
    _botAliasLocaleSettings.addAll(botAliasLocaleSettings)
  }

  /**
   * @param botAliasLocaleSettings Specifies settings that are unique to a locale.
   * For example, you can use a different Lambda function depending on the bot's locale.
   */
  public fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable) {
    cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings)
  }

  /**
   * @param conversationLogSettings Specifies settings for conversation logs that save audio, text,
   * and metadata information for conversations with your users.
   */
  public fun conversationLogSettings(conversationLogSettings: IResolvable) {
    cdkBuilder.conversationLogSettings(conversationLogSettings)
  }

  /**
   * @param conversationLogSettings Specifies settings for conversation logs that save audio, text,
   * and metadata information for conversations with your users.
   */
  public
      fun conversationLogSettings(conversationLogSettings: CfnBot.ConversationLogSettingsProperty) {
    cdkBuilder.conversationLogSettings(conversationLogSettings)
  }

  /**
   * @param description Specifies a description for the test bot alias.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param sentimentAnalysisSettings Specifies whether Amazon Lex will use Amazon Comprehend to
   * detect the sentiment of user utterances.
   */
  public fun sentimentAnalysisSettings(sentimentAnalysisSettings: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(sentimentAnalysisSettings)
    cdkBuilder.sentimentAnalysisSettings(builder.map)
  }

  /**
   * @param sentimentAnalysisSettings Specifies whether Amazon Lex will use Amazon Comprehend to
   * detect the sentiment of user utterances.
   */
  public fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any) {
    cdkBuilder.sentimentAnalysisSettings(sentimentAnalysisSettings)
  }

  public fun build(): CfnBot.TestBotAliasSettingsProperty {
    if(_botAliasLocaleSettings.isNotEmpty())
        cdkBuilder.botAliasLocaleSettings(_botAliasLocaleSettings)
    return cdkBuilder.build()
  }
}
