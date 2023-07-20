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
import software.amazon.awscdk.services.lex.CfnBotAlias
import software.constructs.Construct

@CdkDslMarker
public class CfnBotAliasDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnBotAlias.Builder = CfnBotAlias.Builder.create(scope, id)

  private val _botAliasLocaleSettings: MutableList<Any> = mutableListOf()

  private val _botAliasTags: MutableList<Any> = mutableListOf()

  public fun botAliasLocaleSettings(vararg botAliasLocaleSettings: Any) {
    _botAliasLocaleSettings.addAll(listOf(*botAliasLocaleSettings))
  }

  public fun botAliasLocaleSettings(botAliasLocaleSettings: Collection<Any>) {
    _botAliasLocaleSettings.addAll(botAliasLocaleSettings)
  }

  public fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable) {
    cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings)
  }

  public fun botAliasName(botAliasName: String) {
    cdkBuilder.botAliasName(botAliasName)
  }

  public fun botAliasTags(vararg botAliasTags: Any) {
    _botAliasTags.addAll(listOf(*botAliasTags))
  }

  public fun botAliasTags(botAliasTags: Collection<Any>) {
    _botAliasTags.addAll(botAliasTags)
  }

  public fun botAliasTags(botAliasTags: IResolvable) {
    cdkBuilder.botAliasTags(botAliasTags)
  }

  public fun botId(botId: String) {
    cdkBuilder.botId(botId)
  }

  public fun botVersion(botVersion: String) {
    cdkBuilder.botVersion(botVersion)
  }

  public fun conversationLogSettings(conversationLogSettings: IResolvable) {
    cdkBuilder.conversationLogSettings(conversationLogSettings)
  }

  public
      fun conversationLogSettings(conversationLogSettings: CfnBotAlias.ConversationLogSettingsProperty) {
    cdkBuilder.conversationLogSettings(conversationLogSettings)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun sentimentAnalysisSettings(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.sentimentAnalysisSettings(builder.map)
  }

  public fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any) {
    cdkBuilder.sentimentAnalysisSettings(sentimentAnalysisSettings)
  }

  public fun build(): CfnBotAlias {
    if(_botAliasLocaleSettings.isNotEmpty())
        cdkBuilder.botAliasLocaleSettings(_botAliasLocaleSettings)
    if(_botAliasTags.isNotEmpty()) cdkBuilder.botAliasTags(_botAliasTags)
    return cdkBuilder.build()
  }
}
