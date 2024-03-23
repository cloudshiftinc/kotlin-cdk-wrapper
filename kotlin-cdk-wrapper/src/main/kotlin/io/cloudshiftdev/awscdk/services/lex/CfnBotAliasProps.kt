@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lex

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnBotAlias`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lex.*;
 * Object sentimentAnalysisSettings;
 * CfnBotAliasProps cfnBotAliasProps = CfnBotAliasProps.builder()
 * .botAliasName("botAliasName")
 * .botId("botId")
 * // the properties below are optional
 * .botAliasLocaleSettings(List.of(BotAliasLocaleSettingsItemProperty.builder()
 * .botAliasLocaleSetting(BotAliasLocaleSettingsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .codeHookSpecification(CodeHookSpecificationProperty.builder()
 * .lambdaCodeHook(LambdaCodeHookProperty.builder()
 * .codeHookInterfaceVersion("codeHookInterfaceVersion")
 * .lambdaArn("lambdaArn")
 * .build())
 * .build())
 * .build())
 * .localeId("localeId")
 * .build()))
 * .botAliasTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .botVersion("botVersion")
 * .conversationLogSettings(ConversationLogSettingsProperty.builder()
 * .audioLogSettings(List.of(AudioLogSettingProperty.builder()
 * .destination(AudioLogDestinationProperty.builder()
 * .s3Bucket(S3BucketLogDestinationProperty.builder()
 * .logPrefix("logPrefix")
 * .s3BucketArn("s3BucketArn")
 * // the properties below are optional
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .build())
 * .enabled(false)
 * .build()))
 * .textLogSettings(List.of(TextLogSettingProperty.builder()
 * .destination(TextLogDestinationProperty.builder()
 * .cloudWatch(CloudWatchLogGroupLogDestinationProperty.builder()
 * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
 * .logPrefix("logPrefix")
 * .build())
 * .build())
 * .enabled(false)
 * .build()))
 * .build())
 * .description("description")
 * .sentimentAnalysisSettings(sentimentAnalysisSettings)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html)
 */
public interface CfnBotAliasProps {
  /**
   * Specifies settings that are unique to a locale.
   *
   * For example, you can use different Lambda function depending on the bot's locale.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliaslocalesettings)
   */
  public fun botAliasLocaleSettings(): Any? = unwrap(this).getBotAliasLocaleSettings()

  /**
   * The name of the bot alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliasname)
   */
  public fun botAliasName(): String

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
   */
  public fun botAliasTags(): Any? = unwrap(this).getBotAliasTags()

  /**
   * The unique identifier of the bot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botid)
   */
  public fun botId(): String

  /**
   * The version of the bot that the bot alias references.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botversion)
   */
  public fun botVersion(): String? = unwrap(this).getBotVersion()

  /**
   * Specifies whether Amazon Lex logs text and audio for conversations with the bot.
   *
   * When you enable conversation logs, text logs store text input, transcripts of audio input, and
   * associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-conversationlogsettings)
   */
  public fun conversationLogSettings(): Any? = unwrap(this).getConversationLogSettings()

  /**
   * The description of the bot alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user
   * utterances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-sentimentanalysissettings)
   */
  public fun sentimentAnalysisSettings(): Any? = unwrap(this).getSentimentAnalysisSettings()

  /**
   * A builder for [CfnBotAliasProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale.
     * For example, you can use different Lambda function depending on the bot's locale.
     */
    public fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable)

    /**
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale.
     * For example, you can use different Lambda function depending on the bot's locale.
     */
    public fun botAliasLocaleSettings(botAliasLocaleSettings: List<Any>)

    /**
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale.
     * For example, you can use different Lambda function depending on the bot's locale.
     */
    public fun botAliasLocaleSettings(vararg botAliasLocaleSettings: Any)

    /**
     * @param botAliasName The name of the bot alias. 
     */
    public fun botAliasName(botAliasName: String)

    /**
     * @param botAliasTags An array of key-value pairs to apply to this resource.
     * You can only add tags when you specify an alias.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun botAliasTags(botAliasTags: IResolvable)

    /**
     * @param botAliasTags An array of key-value pairs to apply to this resource.
     * You can only add tags when you specify an alias.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun botAliasTags(botAliasTags: List<Any>)

    /**
     * @param botAliasTags An array of key-value pairs to apply to this resource.
     * You can only add tags when you specify an alias.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun botAliasTags(vararg botAliasTags: Any)

    /**
     * @param botId The unique identifier of the bot. 
     */
    public fun botId(botId: String)

    /**
     * @param botVersion The version of the bot that the bot alias references.
     */
    public fun botVersion(botVersion: String)

    /**
     * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
     * conversations with the bot.
     * When you enable conversation logs, text logs store text input, transcripts of audio input,
     * and associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
     */
    public fun conversationLogSettings(conversationLogSettings: IResolvable)

    /**
     * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
     * conversations with the bot.
     * When you enable conversation logs, text logs store text input, transcripts of audio input,
     * and associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
     */
    public
        fun conversationLogSettings(conversationLogSettings: CfnBotAlias.ConversationLogSettingsProperty)

    /**
     * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
     * conversations with the bot.
     * When you enable conversation logs, text logs store text input, transcripts of audio input,
     * and associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f13fc95d0fe171e8981ee1328f52109fb9a21b9feee318571942e65a5443efe")
    public
        fun conversationLogSettings(conversationLogSettings: CfnBotAlias.ConversationLogSettingsProperty.Builder.() -> Unit)

    /**
     * @param description The description of the bot alias.
     */
    public fun description(description: String)

    /**
     * @param sentimentAnalysisSettings Determines whether Amazon Lex will use Amazon Comprehend to
     * detect the sentiment of user utterances.
     */
    public fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBotAliasProps.Builder =
        software.amazon.awscdk.services.lex.CfnBotAliasProps.builder()

    /**
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale.
     * For example, you can use different Lambda function depending on the bot's locale.
     */
    override fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable) {
      cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings.let(IResolvable::unwrap))
    }

    /**
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale.
     * For example, you can use different Lambda function depending on the bot's locale.
     */
    override fun botAliasLocaleSettings(botAliasLocaleSettings: List<Any>) {
      cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings)
    }

    /**
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale.
     * For example, you can use different Lambda function depending on the bot's locale.
     */
    override fun botAliasLocaleSettings(vararg botAliasLocaleSettings: Any): Unit =
        botAliasLocaleSettings(botAliasLocaleSettings.toList())

    /**
     * @param botAliasName The name of the bot alias. 
     */
    override fun botAliasName(botAliasName: String) {
      cdkBuilder.botAliasName(botAliasName)
    }

    /**
     * @param botAliasTags An array of key-value pairs to apply to this resource.
     * You can only add tags when you specify an alias.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun botAliasTags(botAliasTags: IResolvable) {
      cdkBuilder.botAliasTags(botAliasTags.let(IResolvable::unwrap))
    }

    /**
     * @param botAliasTags An array of key-value pairs to apply to this resource.
     * You can only add tags when you specify an alias.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun botAliasTags(botAliasTags: List<Any>) {
      cdkBuilder.botAliasTags(botAliasTags)
    }

    /**
     * @param botAliasTags An array of key-value pairs to apply to this resource.
     * You can only add tags when you specify an alias.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun botAliasTags(vararg botAliasTags: Any): Unit = botAliasTags(botAliasTags.toList())

    /**
     * @param botId The unique identifier of the bot. 
     */
    override fun botId(botId: String) {
      cdkBuilder.botId(botId)
    }

    /**
     * @param botVersion The version of the bot that the bot alias references.
     */
    override fun botVersion(botVersion: String) {
      cdkBuilder.botVersion(botVersion)
    }

    /**
     * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
     * conversations with the bot.
     * When you enable conversation logs, text logs store text input, transcripts of audio input,
     * and associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
     */
    override fun conversationLogSettings(conversationLogSettings: IResolvable) {
      cdkBuilder.conversationLogSettings(conversationLogSettings.let(IResolvable::unwrap))
    }

    /**
     * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
     * conversations with the bot.
     * When you enable conversation logs, text logs store text input, transcripts of audio input,
     * and associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
     */
    override
        fun conversationLogSettings(conversationLogSettings: CfnBotAlias.ConversationLogSettingsProperty) {
      cdkBuilder.conversationLogSettings(conversationLogSettings.let(CfnBotAlias.ConversationLogSettingsProperty::unwrap))
    }

    /**
     * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
     * conversations with the bot.
     * When you enable conversation logs, text logs store text input, transcripts of audio input,
     * and associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f13fc95d0fe171e8981ee1328f52109fb9a21b9feee318571942e65a5443efe")
    override
        fun conversationLogSettings(conversationLogSettings: CfnBotAlias.ConversationLogSettingsProperty.Builder.() -> Unit):
        Unit =
        conversationLogSettings(CfnBotAlias.ConversationLogSettingsProperty(conversationLogSettings))

    /**
     * @param description The description of the bot alias.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param sentimentAnalysisSettings Determines whether Amazon Lex will use Amazon Comprehend to
     * detect the sentiment of user utterances.
     */
    override fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any) {
      cdkBuilder.sentimentAnalysisSettings(sentimentAnalysisSettings)
    }

    public fun build(): software.amazon.awscdk.services.lex.CfnBotAliasProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lex.CfnBotAliasProps,
  ) : CdkObject(cdkObject), CfnBotAliasProps {
    /**
     * Specifies settings that are unique to a locale.
     *
     * For example, you can use different Lambda function depending on the bot's locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliaslocalesettings)
     */
    override fun botAliasLocaleSettings(): Any? = unwrap(this).getBotAliasLocaleSettings()

    /**
     * The name of the bot alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliasname)
     */
    override fun botAliasName(): String = unwrap(this).getBotAliasName()

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
     */
    override fun botAliasTags(): Any? = unwrap(this).getBotAliasTags()

    /**
     * The unique identifier of the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botid)
     */
    override fun botId(): String = unwrap(this).getBotId()

    /**
     * The version of the bot that the bot alias references.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botversion)
     */
    override fun botVersion(): String? = unwrap(this).getBotVersion()

    /**
     * Specifies whether Amazon Lex logs text and audio for conversations with the bot.
     *
     * When you enable conversation logs, text logs store text input, transcripts of audio input,
     * and associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-conversationlogsettings)
     */
    override fun conversationLogSettings(): Any? = unwrap(this).getConversationLogSettings()

    /**
     * The description of the bot alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user
     * utterances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-sentimentanalysissettings)
     */
    override fun sentimentAnalysisSettings(): Any? = unwrap(this).getSentimentAnalysisSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBotAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAliasProps):
        CfnBotAliasProps = CdkObjectWrappers.wrap(cdkObject) as? CfnBotAliasProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBotAliasProps):
        software.amazon.awscdk.services.lex.CfnBotAliasProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lex.CfnBotAliasProps
  }
}
