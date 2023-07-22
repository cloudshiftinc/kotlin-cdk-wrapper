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

  /**
   * Specifies settings that are unique to a locale.
   *
   * For example, you can use different Lambda function depending on the bot's locale.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliaslocalesettings)
   * @param botAliasLocaleSettings Specifies settings that are unique to a locale. 
   */
  public fun botAliasLocaleSettings(vararg botAliasLocaleSettings: Any) {
    _botAliasLocaleSettings.addAll(listOf(*botAliasLocaleSettings))
  }

  /**
   * Specifies settings that are unique to a locale.
   *
   * For example, you can use different Lambda function depending on the bot's locale.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliaslocalesettings)
   * @param botAliasLocaleSettings Specifies settings that are unique to a locale. 
   */
  public fun botAliasLocaleSettings(botAliasLocaleSettings: Collection<Any>) {
    _botAliasLocaleSettings.addAll(botAliasLocaleSettings)
  }

  /**
   * Specifies settings that are unique to a locale.
   *
   * For example, you can use different Lambda function depending on the bot's locale.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliaslocalesettings)
   * @param botAliasLocaleSettings Specifies settings that are unique to a locale. 
   */
  public fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable) {
    cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings)
  }

  /**
   * The name of the bot alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliasname)
   * @param botAliasName The name of the bot alias. 
   */
  public fun botAliasName(botAliasName: String) {
    cdkBuilder.botAliasName(botAliasName)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * You can only add tags when you specify an alias.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliastags)
   * @param botAliasTags An array of key-value pairs to apply to this resource. 
   */
  public fun botAliasTags(vararg botAliasTags: Any) {
    _botAliasTags.addAll(listOf(*botAliasTags))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * You can only add tags when you specify an alias.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliastags)
   * @param botAliasTags An array of key-value pairs to apply to this resource. 
   */
  public fun botAliasTags(botAliasTags: Collection<Any>) {
    _botAliasTags.addAll(botAliasTags)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * You can only add tags when you specify an alias.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliastags)
   * @param botAliasTags An array of key-value pairs to apply to this resource. 
   */
  public fun botAliasTags(botAliasTags: IResolvable) {
    cdkBuilder.botAliasTags(botAliasTags)
  }

  /**
   * The unique identifier of the bot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botid)
   * @param botId The unique identifier of the bot. 
   */
  public fun botId(botId: String) {
    cdkBuilder.botId(botId)
  }

  /**
   * The version of the bot that the bot alias references.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botversion)
   * @param botVersion The version of the bot that the bot alias references. 
   */
  public fun botVersion(botVersion: String) {
    cdkBuilder.botVersion(botVersion)
  }

  /**
   * Specifies whether Amazon Lex logs text and audio for conversations with the bot.
   *
   * When you enable conversation logs, text logs store text input, transcripts of audio input, and
   * associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-conversationlogsettings)
   * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
   * conversations with the bot. 
   */
  public fun conversationLogSettings(conversationLogSettings: IResolvable) {
    cdkBuilder.conversationLogSettings(conversationLogSettings)
  }

  /**
   * Specifies whether Amazon Lex logs text and audio for conversations with the bot.
   *
   * When you enable conversation logs, text logs store text input, transcripts of audio input, and
   * associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-conversationlogsettings)
   * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
   * conversations with the bot. 
   */
  public
      fun conversationLogSettings(conversationLogSettings: CfnBotAlias.ConversationLogSettingsProperty) {
    cdkBuilder.conversationLogSettings(conversationLogSettings)
  }

  /**
   * The description of the bot alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-description)
   * @param description The description of the bot alias. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user
   * utterances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-sentimentanalysissettings)
   * @param sentimentAnalysisSettings Determines whether Amazon Lex will use Amazon Comprehend to
   * detect the sentiment of user utterances. 
   */
  public fun sentimentAnalysisSettings(sentimentAnalysisSettings: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(sentimentAnalysisSettings)
    cdkBuilder.sentimentAnalysisSettings(builder.map)
  }

  /**
   * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user
   * utterances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-sentimentanalysissettings)
   * @param sentimentAnalysisSettings Determines whether Amazon Lex will use Amazon Comprehend to
   * detect the sentiment of user utterances. 
   */
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
