@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lex

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Amazon Lex V2 is the only supported version in AWS CloudFormation .
 *
 * Specifies an alias for the specified version of a bot. Use an alias to enable you to change the
 * version of a bot without updating applications that use the bot.
 *
 * For example, you can specify an alias called "PROD" that your applications use to call the Amazon
 * Lex bot.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lex.*;
 * Object sentimentAnalysisSettings;
 * CfnBotAlias cfnBotAlias = CfnBotAlias.Builder.create(this, "MyCfnBotAlias")
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
public open class CfnBotAlias internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Name (ARN) of the bot alias.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique identifier of the bot alias.
   */
  public open fun attrBotAliasId(): String = unwrap(this).getAttrBotAliasId()

  /**
   * The current status of the bot alias.
   *
   * When the status is Available the alias is ready for use with your bot.
   */
  public open fun attrBotAliasStatus(): String = unwrap(this).getAttrBotAliasStatus()

  /**
   * Specifies settings that are unique to a locale.
   */
  public open fun botAliasLocaleSettings(): Any? = unwrap(this).getBotAliasLocaleSettings()

  /**
   * Specifies settings that are unique to a locale.
   */
  public open fun botAliasLocaleSettings(`value`: IResolvable) {
    unwrap(this).setBotAliasLocaleSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies settings that are unique to a locale.
   */
  public open fun botAliasLocaleSettings(`value`: List<Any>) {
    unwrap(this).setBotAliasLocaleSettings(`value`)
  }

  /**
   * Specifies settings that are unique to a locale.
   */
  public open fun botAliasLocaleSettings(vararg `value`: Any): Unit =
      botAliasLocaleSettings(`value`.toList())

  /**
   * The name of the bot alias.
   */
  public open fun botAliasName(): String = unwrap(this).getBotAliasName()

  /**
   * The name of the bot alias.
   */
  public open fun botAliasName(`value`: String) {
    unwrap(this).setBotAliasName(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun botAliasTags(): Any? = unwrap(this).getBotAliasTags()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun botAliasTags(`value`: IResolvable) {
    unwrap(this).setBotAliasTags(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun botAliasTags(`value`: List<Any>) {
    unwrap(this).setBotAliasTags(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun botAliasTags(vararg `value`: Any): Unit = botAliasTags(`value`.toList())

  /**
   * The unique identifier of the bot.
   */
  public open fun botId(): String = unwrap(this).getBotId()

  /**
   * The unique identifier of the bot.
   */
  public open fun botId(`value`: String) {
    unwrap(this).setBotId(`value`)
  }

  /**
   * The version of the bot that the bot alias references.
   */
  public open fun botVersion(): String? = unwrap(this).getBotVersion()

  /**
   * The version of the bot that the bot alias references.
   */
  public open fun botVersion(`value`: String) {
    unwrap(this).setBotVersion(`value`)
  }

  /**
   * Specifies whether Amazon Lex logs text and audio for conversations with the bot.
   */
  public open fun conversationLogSettings(): Any? = unwrap(this).getConversationLogSettings()

  /**
   * Specifies whether Amazon Lex logs text and audio for conversations with the bot.
   */
  public open fun conversationLogSettings(`value`: IResolvable) {
    unwrap(this).setConversationLogSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies whether Amazon Lex logs text and audio for conversations with the bot.
   */
  public open fun conversationLogSettings(`value`: ConversationLogSettingsProperty) {
    unwrap(this).setConversationLogSettings(`value`.let(ConversationLogSettingsProperty::unwrap))
  }

  /**
   * Specifies whether Amazon Lex logs text and audio for conversations with the bot.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("406eeb95044ee1072891c8cfe76b189e134878c2dc5587152587b42b870cde0a")
  public open
      fun conversationLogSettings(`value`: ConversationLogSettingsProperty.Builder.() -> Unit): Unit
      = conversationLogSettings(ConversationLogSettingsProperty(`value`))

  /**
   * The description of the bot alias.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the bot alias.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user
   * utterances.
   */
  public open fun sentimentAnalysisSettings(): Any? = unwrap(this).getSentimentAnalysisSettings()

  /**
   * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user
   * utterances.
   */
  public open fun sentimentAnalysisSettings(`value`: Any) {
    unwrap(this).setSentimentAnalysisSettings(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lex.CfnBotAlias].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies settings that are unique to a locale.
     *
     * For example, you can use different Lambda function depending on the bot's locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliaslocalesettings)
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale. 
     */
    public fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable)

    /**
     * Specifies settings that are unique to a locale.
     *
     * For example, you can use different Lambda function depending on the bot's locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliaslocalesettings)
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale. 
     */
    public fun botAliasLocaleSettings(botAliasLocaleSettings: List<Any>)

    /**
     * Specifies settings that are unique to a locale.
     *
     * For example, you can use different Lambda function depending on the bot's locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliaslocalesettings)
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale. 
     */
    public fun botAliasLocaleSettings(vararg botAliasLocaleSettings: Any)

    /**
     * The name of the bot alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliasname)
     * @param botAliasName The name of the bot alias. 
     */
    public fun botAliasName(botAliasName: String)

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
    public fun botAliasTags(botAliasTags: IResolvable)

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
    public fun botAliasTags(botAliasTags: List<Any>)

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
    public fun botAliasTags(vararg botAliasTags: Any)

    /**
     * The unique identifier of the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botid)
     * @param botId The unique identifier of the bot. 
     */
    public fun botId(botId: String)

    /**
     * The version of the bot that the bot alias references.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botversion)
     * @param botVersion The version of the bot that the bot alias references. 
     */
    public fun botVersion(botVersion: String)

    /**
     * Specifies whether Amazon Lex logs text and audio for conversations with the bot.
     *
     * When you enable conversation logs, text logs store text input, transcripts of audio input,
     * and associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-conversationlogsettings)
     * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
     * conversations with the bot. 
     */
    public fun conversationLogSettings(conversationLogSettings: IResolvable)

    /**
     * Specifies whether Amazon Lex logs text and audio for conversations with the bot.
     *
     * When you enable conversation logs, text logs store text input, transcripts of audio input,
     * and associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-conversationlogsettings)
     * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
     * conversations with the bot. 
     */
    public fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty)

    /**
     * Specifies whether Amazon Lex logs text and audio for conversations with the bot.
     *
     * When you enable conversation logs, text logs store text input, transcripts of audio input,
     * and associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-conversationlogsettings)
     * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
     * conversations with the bot. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("196b16d3549d326e0b26c2eb003d401fc79f45fbb219cc0d0f5e2877d43ca582")
    public
        fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty.Builder.() -> Unit)

    /**
     * The description of the bot alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-description)
     * @param description The description of the bot alias. 
     */
    public fun description(description: String)

    /**
     * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user
     * utterances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-sentimentanalysissettings)
     * @param sentimentAnalysisSettings Determines whether Amazon Lex will use Amazon Comprehend to
     * detect the sentiment of user utterances. 
     */
    public fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBotAlias.Builder =
        software.amazon.awscdk.services.lex.CfnBotAlias.Builder.create(scope, id)

    /**
     * Specifies settings that are unique to a locale.
     *
     * For example, you can use different Lambda function depending on the bot's locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliaslocalesettings)
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale. 
     */
    override fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable) {
      cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings.let(IResolvable::unwrap))
    }

    /**
     * Specifies settings that are unique to a locale.
     *
     * For example, you can use different Lambda function depending on the bot's locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliaslocalesettings)
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale. 
     */
    override fun botAliasLocaleSettings(botAliasLocaleSettings: List<Any>) {
      cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings)
    }

    /**
     * Specifies settings that are unique to a locale.
     *
     * For example, you can use different Lambda function depending on the bot's locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliaslocalesettings)
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale. 
     */
    override fun botAliasLocaleSettings(vararg botAliasLocaleSettings: Any): Unit =
        botAliasLocaleSettings(botAliasLocaleSettings.toList())

    /**
     * The name of the bot alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botaliasname)
     * @param botAliasName The name of the bot alias. 
     */
    override fun botAliasName(botAliasName: String) {
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
    override fun botAliasTags(botAliasTags: IResolvable) {
      cdkBuilder.botAliasTags(botAliasTags.let(IResolvable::unwrap))
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
    override fun botAliasTags(botAliasTags: List<Any>) {
      cdkBuilder.botAliasTags(botAliasTags)
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
    override fun botAliasTags(vararg botAliasTags: Any): Unit = botAliasTags(botAliasTags.toList())

    /**
     * The unique identifier of the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botid)
     * @param botId The unique identifier of the bot. 
     */
    override fun botId(botId: String) {
      cdkBuilder.botId(botId)
    }

    /**
     * The version of the bot that the bot alias references.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-botversion)
     * @param botVersion The version of the bot that the bot alias references. 
     */
    override fun botVersion(botVersion: String) {
      cdkBuilder.botVersion(botVersion)
    }

    /**
     * Specifies whether Amazon Lex logs text and audio for conversations with the bot.
     *
     * When you enable conversation logs, text logs store text input, transcripts of audio input,
     * and associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-conversationlogsettings)
     * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
     * conversations with the bot. 
     */
    override fun conversationLogSettings(conversationLogSettings: IResolvable) {
      cdkBuilder.conversationLogSettings(conversationLogSettings.let(IResolvable::unwrap))
    }

    /**
     * Specifies whether Amazon Lex logs text and audio for conversations with the bot.
     *
     * When you enable conversation logs, text logs store text input, transcripts of audio input,
     * and associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-conversationlogsettings)
     * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
     * conversations with the bot. 
     */
    override fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty) {
      cdkBuilder.conversationLogSettings(conversationLogSettings.let(ConversationLogSettingsProperty::unwrap))
    }

    /**
     * Specifies whether Amazon Lex logs text and audio for conversations with the bot.
     *
     * When you enable conversation logs, text logs store text input, transcripts of audio input,
     * and associated metadata in Amazon CloudWatch logs. Audio logs store input in Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-conversationlogsettings)
     * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
     * conversations with the bot. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("196b16d3549d326e0b26c2eb003d401fc79f45fbb219cc0d0f5e2877d43ca582")
    override
        fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty.Builder.() -> Unit):
        Unit = conversationLogSettings(ConversationLogSettingsProperty(conversationLogSettings))

    /**
     * The description of the bot alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html#cfn-lex-botalias-description)
     * @param description The description of the bot alias. 
     */
    override fun description(description: String) {
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
    override fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any) {
      cdkBuilder.sentimentAnalysisSettings(sentimentAnalysisSettings)
    }

    public fun build(): software.amazon.awscdk.services.lex.CfnBotAlias = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lex.CfnBotAlias.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBotAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBotAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias): CfnBotAlias =
        CfnBotAlias(cdkObject)

    internal fun unwrap(wrapped: CfnBotAlias): software.amazon.awscdk.services.lex.CfnBotAlias =
        wrapped.cdkObject
  }

  /**
   * Settings for logging audio of conversations between Amazon Lex and a user.
   *
   * You specify whether to log audio and the Amazon S3 bucket where the audio file is stored.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * AudioLogSettingProperty audioLogSettingProperty = AudioLogSettingProperty.builder()
   * .destination(AudioLogDestinationProperty.builder()
   * .s3Bucket(S3BucketLogDestinationProperty.builder()
   * .logPrefix("logPrefix")
   * .s3BucketArn("s3BucketArn")
   * // the properties below are optional
   * .kmsKeyArn("kmsKeyArn")
   * .build())
   * .build())
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-audiologsetting.html)
   */
  public interface AudioLogSettingProperty {
    /**
     * The location of audio log files collected when conversation logging is enabled for a bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-audiologsetting.html#cfn-lex-botalias-audiologsetting-destination)
     */
    public fun destination(): Any

    /**
     * Determines whether audio logging in enabled for the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-audiologsetting.html#cfn-lex-botalias-audiologsetting-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [AudioLogSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination The location of audio log files collected when conversation logging is
       * enabled for a bot. 
       */
      public fun destination(destination: IResolvable)

      /**
       * @param destination The location of audio log files collected when conversation logging is
       * enabled for a bot. 
       */
      public fun destination(destination: AudioLogDestinationProperty)

      /**
       * @param destination The location of audio log files collected when conversation logging is
       * enabled for a bot. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91167c4637e32b60700a8c5a293b9930e735916da683cd738b3c2050cb48754a")
      public fun destination(destination: AudioLogDestinationProperty.Builder.() -> Unit)

      /**
       * @param enabled Determines whether audio logging in enabled for the bot. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Determines whether audio logging in enabled for the bot. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogSettingProperty.builder()

      /**
       * @param destination The location of audio log files collected when conversation logging is
       * enabled for a bot. 
       */
      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      /**
       * @param destination The location of audio log files collected when conversation logging is
       * enabled for a bot. 
       */
      override fun destination(destination: AudioLogDestinationProperty) {
        cdkBuilder.destination(destination.let(AudioLogDestinationProperty::unwrap))
      }

      /**
       * @param destination The location of audio log files collected when conversation logging is
       * enabled for a bot. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91167c4637e32b60700a8c5a293b9930e735916da683cd738b3c2050cb48754a")
      override fun destination(destination: AudioLogDestinationProperty.Builder.() -> Unit): Unit =
          destination(AudioLogDestinationProperty(destination))

      /**
       * @param enabled Determines whether audio logging in enabled for the bot. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Determines whether audio logging in enabled for the bot. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogSettingProperty,
    ) : CdkObject(cdkObject), AudioLogSettingProperty {
      /**
       * The location of audio log files collected when conversation logging is enabled for a bot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-audiologsetting.html#cfn-lex-botalias-audiologsetting-destination)
       */
      override fun destination(): Any = unwrap(this).getDestination()

      /**
       * Determines whether audio logging in enabled for the bot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-audiologsetting.html#cfn-lex-botalias-audiologsetting-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioLogSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogSettingProperty):
          AudioLogSettingProperty = CdkObjectWrappers.wrap(cdkObject) as? AudioLogSettingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioLogSettingProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogSettingProperty
    }
  }

  /**
   * Specifies settings that are unique to a locale.
   *
   * For example, you can use different Lambda function depending on the bot's locale.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * BotAliasLocaleSettingsProperty botAliasLocaleSettingsProperty =
   * BotAliasLocaleSettingsProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .codeHookSpecification(CodeHookSpecificationProperty.builder()
   * .lambdaCodeHook(LambdaCodeHookProperty.builder()
   * .codeHookInterfaceVersion("codeHookInterfaceVersion")
   * .lambdaArn("lambdaArn")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-botaliaslocalesettings.html)
   */
  public interface BotAliasLocaleSettingsProperty {
    /**
     * Specifies the Lambda function that should be used in the locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-botaliaslocalesettings.html#cfn-lex-botalias-botaliaslocalesettings-codehookspecification)
     */
    public fun codeHookSpecification(): Any? = unwrap(this).getCodeHookSpecification()

    /**
     * Determines whether the locale is enabled for the bot.
     *
     * If the value is `false` , the locale isn't available for use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-botaliaslocalesettings.html#cfn-lex-botalias-botaliaslocalesettings-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [BotAliasLocaleSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param codeHookSpecification Specifies the Lambda function that should be used in the
       * locale.
       */
      public fun codeHookSpecification(codeHookSpecification: IResolvable)

      /**
       * @param codeHookSpecification Specifies the Lambda function that should be used in the
       * locale.
       */
      public fun codeHookSpecification(codeHookSpecification: CodeHookSpecificationProperty)

      /**
       * @param codeHookSpecification Specifies the Lambda function that should be used in the
       * locale.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0dc9b405e10908791a6c8b4fbef7a2966eee97b8bb4cd3da101d70dee9914164")
      public
          fun codeHookSpecification(codeHookSpecification: CodeHookSpecificationProperty.Builder.() -> Unit)

      /**
       * @param enabled Determines whether the locale is enabled for the bot. 
       * If the value is `false` , the locale isn't available for use.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Determines whether the locale is enabled for the bot. 
       * If the value is `false` , the locale isn't available for use.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsProperty.builder()

      /**
       * @param codeHookSpecification Specifies the Lambda function that should be used in the
       * locale.
       */
      override fun codeHookSpecification(codeHookSpecification: IResolvable) {
        cdkBuilder.codeHookSpecification(codeHookSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param codeHookSpecification Specifies the Lambda function that should be used in the
       * locale.
       */
      override fun codeHookSpecification(codeHookSpecification: CodeHookSpecificationProperty) {
        cdkBuilder.codeHookSpecification(codeHookSpecification.let(CodeHookSpecificationProperty::unwrap))
      }

      /**
       * @param codeHookSpecification Specifies the Lambda function that should be used in the
       * locale.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0dc9b405e10908791a6c8b4fbef7a2966eee97b8bb4cd3da101d70dee9914164")
      override
          fun codeHookSpecification(codeHookSpecification: CodeHookSpecificationProperty.Builder.() -> Unit):
          Unit = codeHookSpecification(CodeHookSpecificationProperty(codeHookSpecification))

      /**
       * @param enabled Determines whether the locale is enabled for the bot. 
       * If the value is `false` , the locale isn't available for use.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Determines whether the locale is enabled for the bot. 
       * If the value is `false` , the locale isn't available for use.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsProperty,
    ) : CdkObject(cdkObject), BotAliasLocaleSettingsProperty {
      /**
       * Specifies the Lambda function that should be used in the locale.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-botaliaslocalesettings.html#cfn-lex-botalias-botaliaslocalesettings-codehookspecification)
       */
      override fun codeHookSpecification(): Any? = unwrap(this).getCodeHookSpecification()

      /**
       * Determines whether the locale is enabled for the bot.
       *
       * If the value is `false` , the locale isn't available for use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-botaliaslocalesettings.html#cfn-lex-botalias-botaliaslocalesettings-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BotAliasLocaleSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsProperty):
          BotAliasLocaleSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BotAliasLocaleSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BotAliasLocaleSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsProperty
    }
  }

  /**
   * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user
   * utterances.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * SentimentAnalysisSettingsProperty sentimentAnalysisSettingsProperty =
   * SentimentAnalysisSettingsProperty.builder()
   * .detectSentiment(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-sentimentanalysissettings.html)
   */
  public interface SentimentAnalysisSettingsProperty {
    /**
     * Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment of user utterances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-sentimentanalysissettings.html#cfn-lex-botalias-sentimentanalysissettings-detectsentiment)
     */
    public fun detectSentiment(): Any

    /**
     * A builder for [SentimentAnalysisSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param detectSentiment Sets whether Amazon Lex uses Amazon Comprehend to detect the
       * sentiment of user utterances. 
       */
      public fun detectSentiment(detectSentiment: Boolean)

      /**
       * @param detectSentiment Sets whether Amazon Lex uses Amazon Comprehend to detect the
       * sentiment of user utterances. 
       */
      public fun detectSentiment(detectSentiment: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.SentimentAnalysisSettingsProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBotAlias.SentimentAnalysisSettingsProperty.builder()

      /**
       * @param detectSentiment Sets whether Amazon Lex uses Amazon Comprehend to detect the
       * sentiment of user utterances. 
       */
      override fun detectSentiment(detectSentiment: Boolean) {
        cdkBuilder.detectSentiment(detectSentiment)
      }

      /**
       * @param detectSentiment Sets whether Amazon Lex uses Amazon Comprehend to detect the
       * sentiment of user utterances. 
       */
      override fun detectSentiment(detectSentiment: IResolvable) {
        cdkBuilder.detectSentiment(detectSentiment.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.SentimentAnalysisSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.SentimentAnalysisSettingsProperty,
    ) : CdkObject(cdkObject), SentimentAnalysisSettingsProperty {
      /**
       * Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment of user utterances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-sentimentanalysissettings.html#cfn-lex-botalias-sentimentanalysissettings-detectsentiment)
       */
      override fun detectSentiment(): Any = unwrap(this).getDetectSentiment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SentimentAnalysisSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.SentimentAnalysisSettingsProperty):
          SentimentAnalysisSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SentimentAnalysisSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SentimentAnalysisSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.SentimentAnalysisSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotAlias.SentimentAnalysisSettingsProperty
    }
  }

  /**
   * Contains information about code hooks that Amazon Lex calls during a conversation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * CodeHookSpecificationProperty codeHookSpecificationProperty =
   * CodeHookSpecificationProperty.builder()
   * .lambdaCodeHook(LambdaCodeHookProperty.builder()
   * .codeHookInterfaceVersion("codeHookInterfaceVersion")
   * .lambdaArn("lambdaArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-codehookspecification.html)
   */
  public interface CodeHookSpecificationProperty {
    /**
     * Specifies a Lambda function that verifies requests to a bot or fulfills the user's request to
     * a bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-codehookspecification.html#cfn-lex-botalias-codehookspecification-lambdacodehook)
     */
    public fun lambdaCodeHook(): Any

    /**
     * A builder for [CodeHookSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambdaCodeHook Specifies a Lambda function that verifies requests to a bot or
       * fulfills the user's request to a bot. 
       */
      public fun lambdaCodeHook(lambdaCodeHook: IResolvable)

      /**
       * @param lambdaCodeHook Specifies a Lambda function that verifies requests to a bot or
       * fulfills the user's request to a bot. 
       */
      public fun lambdaCodeHook(lambdaCodeHook: LambdaCodeHookProperty)

      /**
       * @param lambdaCodeHook Specifies a Lambda function that verifies requests to a bot or
       * fulfills the user's request to a bot. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7c53cd7386022c7f7d781befd8f70e8f48cec699259d08cd545b9e2c258e4e19")
      public fun lambdaCodeHook(lambdaCodeHook: LambdaCodeHookProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.CodeHookSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.CodeHookSpecificationProperty.builder()

      /**
       * @param lambdaCodeHook Specifies a Lambda function that verifies requests to a bot or
       * fulfills the user's request to a bot. 
       */
      override fun lambdaCodeHook(lambdaCodeHook: IResolvable) {
        cdkBuilder.lambdaCodeHook(lambdaCodeHook.let(IResolvable::unwrap))
      }

      /**
       * @param lambdaCodeHook Specifies a Lambda function that verifies requests to a bot or
       * fulfills the user's request to a bot. 
       */
      override fun lambdaCodeHook(lambdaCodeHook: LambdaCodeHookProperty) {
        cdkBuilder.lambdaCodeHook(lambdaCodeHook.let(LambdaCodeHookProperty::unwrap))
      }

      /**
       * @param lambdaCodeHook Specifies a Lambda function that verifies requests to a bot or
       * fulfills the user's request to a bot. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7c53cd7386022c7f7d781befd8f70e8f48cec699259d08cd545b9e2c258e4e19")
      override fun lambdaCodeHook(lambdaCodeHook: LambdaCodeHookProperty.Builder.() -> Unit): Unit =
          lambdaCodeHook(LambdaCodeHookProperty(lambdaCodeHook))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.CodeHookSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.CodeHookSpecificationProperty,
    ) : CdkObject(cdkObject), CodeHookSpecificationProperty {
      /**
       * Specifies a Lambda function that verifies requests to a bot or fulfills the user's request
       * to a bot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-codehookspecification.html#cfn-lex-botalias-codehookspecification-lambdacodehook)
       */
      override fun lambdaCodeHook(): Any = unwrap(this).getLambdaCodeHook()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeHookSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.CodeHookSpecificationProperty):
          CodeHookSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CodeHookSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeHookSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.CodeHookSpecificationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotAlias.CodeHookSpecificationProperty
    }
  }

  /**
   * Specifies a Lambda function that verifies requests to a bot or fulfills the user's request to a
   * bot.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * LambdaCodeHookProperty lambdaCodeHookProperty = LambdaCodeHookProperty.builder()
   * .codeHookInterfaceVersion("codeHookInterfaceVersion")
   * .lambdaArn("lambdaArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-lambdacodehook.html)
   */
  public interface LambdaCodeHookProperty {
    /**
     * The version of the request-response that you want Amazon Lex to use to invoke your Lambda
     * function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-lambdacodehook.html#cfn-lex-botalias-lambdacodehook-codehookinterfaceversion)
     */
    public fun codeHookInterfaceVersion(): String

    /**
     * The Amazon Resource Name (ARN) of the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-lambdacodehook.html#cfn-lex-botalias-lambdacodehook-lambdaarn)
     */
    public fun lambdaArn(): String

    /**
     * A builder for [LambdaCodeHookProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param codeHookInterfaceVersion The version of the request-response that you want Amazon
       * Lex to use to invoke your Lambda function. 
       */
      public fun codeHookInterfaceVersion(codeHookInterfaceVersion: String)

      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of the Lambda function. 
       */
      public fun lambdaArn(lambdaArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.LambdaCodeHookProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.LambdaCodeHookProperty.builder()

      /**
       * @param codeHookInterfaceVersion The version of the request-response that you want Amazon
       * Lex to use to invoke your Lambda function. 
       */
      override fun codeHookInterfaceVersion(codeHookInterfaceVersion: String) {
        cdkBuilder.codeHookInterfaceVersion(codeHookInterfaceVersion)
      }

      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of the Lambda function. 
       */
      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBotAlias.LambdaCodeHookProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.LambdaCodeHookProperty,
    ) : CdkObject(cdkObject), LambdaCodeHookProperty {
      /**
       * The version of the request-response that you want Amazon Lex to use to invoke your Lambda
       * function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-lambdacodehook.html#cfn-lex-botalias-lambdacodehook-codehookinterfaceversion)
       */
      override fun codeHookInterfaceVersion(): String = unwrap(this).getCodeHookInterfaceVersion()

      /**
       * The Amazon Resource Name (ARN) of the Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-lambdacodehook.html#cfn-lex-botalias-lambdacodehook-lambdaarn)
       */
      override fun lambdaArn(): String = unwrap(this).getLambdaArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaCodeHookProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.LambdaCodeHookProperty):
          LambdaCodeHookProperty = CdkObjectWrappers.wrap(cdkObject) as? LambdaCodeHookProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaCodeHookProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.LambdaCodeHookProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotAlias.LambdaCodeHookProperty
    }
  }

  /**
   * Specifies settings that are unique to a locale.
   *
   * For example, you can use different Lambda function depending on the bot's locale.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * BotAliasLocaleSettingsItemProperty botAliasLocaleSettingsItemProperty =
   * BotAliasLocaleSettingsItemProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-botaliaslocalesettingsitem.html)
   */
  public interface BotAliasLocaleSettingsItemProperty {
    /**
     * Specifies settings that are unique to a locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-botaliaslocalesettingsitem.html#cfn-lex-botalias-botaliaslocalesettingsitem-botaliaslocalesetting)
     */
    public fun botAliasLocaleSetting(): Any

    /**
     * The unique identifier of the locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-botaliaslocalesettingsitem.html#cfn-lex-botalias-botaliaslocalesettingsitem-localeid)
     */
    public fun localeId(): String

    /**
     * A builder for [BotAliasLocaleSettingsItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param botAliasLocaleSetting Specifies settings that are unique to a locale. 
       */
      public fun botAliasLocaleSetting(botAliasLocaleSetting: IResolvable)

      /**
       * @param botAliasLocaleSetting Specifies settings that are unique to a locale. 
       */
      public fun botAliasLocaleSetting(botAliasLocaleSetting: BotAliasLocaleSettingsProperty)

      /**
       * @param botAliasLocaleSetting Specifies settings that are unique to a locale. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40e7307211638298925ef64f94a772d3f0a29670df6319215ef6ec37c2a7bbf3")
      public
          fun botAliasLocaleSetting(botAliasLocaleSetting: BotAliasLocaleSettingsProperty.Builder.() -> Unit)

      /**
       * @param localeId The unique identifier of the locale. 
       */
      public fun localeId(localeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsItemProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsItemProperty.builder()

      /**
       * @param botAliasLocaleSetting Specifies settings that are unique to a locale. 
       */
      override fun botAliasLocaleSetting(botAliasLocaleSetting: IResolvable) {
        cdkBuilder.botAliasLocaleSetting(botAliasLocaleSetting.let(IResolvable::unwrap))
      }

      /**
       * @param botAliasLocaleSetting Specifies settings that are unique to a locale. 
       */
      override fun botAliasLocaleSetting(botAliasLocaleSetting: BotAliasLocaleSettingsProperty) {
        cdkBuilder.botAliasLocaleSetting(botAliasLocaleSetting.let(BotAliasLocaleSettingsProperty::unwrap))
      }

      /**
       * @param botAliasLocaleSetting Specifies settings that are unique to a locale. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40e7307211638298925ef64f94a772d3f0a29670df6319215ef6ec37c2a7bbf3")
      override
          fun botAliasLocaleSetting(botAliasLocaleSetting: BotAliasLocaleSettingsProperty.Builder.() -> Unit):
          Unit = botAliasLocaleSetting(BotAliasLocaleSettingsProperty(botAliasLocaleSetting))

      /**
       * @param localeId The unique identifier of the locale. 
       */
      override fun localeId(localeId: String) {
        cdkBuilder.localeId(localeId)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsItemProperty,
    ) : CdkObject(cdkObject), BotAliasLocaleSettingsItemProperty {
      /**
       * Specifies settings that are unique to a locale.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-botaliaslocalesettingsitem.html#cfn-lex-botalias-botaliaslocalesettingsitem-botaliaslocalesetting)
       */
      override fun botAliasLocaleSetting(): Any = unwrap(this).getBotAliasLocaleSetting()

      /**
       * The unique identifier of the locale.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-botaliaslocalesettingsitem.html#cfn-lex-botalias-botaliaslocalesettingsitem-localeid)
       */
      override fun localeId(): String = unwrap(this).getLocaleId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BotAliasLocaleSettingsItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsItemProperty):
          BotAliasLocaleSettingsItemProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BotAliasLocaleSettingsItemProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BotAliasLocaleSettingsItemProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotAlias.BotAliasLocaleSettingsItemProperty
    }
  }

  /**
   * Specifies an Amazon S3 bucket for logging audio conversations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * S3BucketLogDestinationProperty s3BucketLogDestinationProperty =
   * S3BucketLogDestinationProperty.builder()
   * .logPrefix("logPrefix")
   * .s3BucketArn("s3BucketArn")
   * // the properties below are optional
   * .kmsKeyArn("kmsKeyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-s3bucketlogdestination.html)
   */
  public interface S3BucketLogDestinationProperty {
    /**
     * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting
     * audio log files stored in an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-s3bucketlogdestination.html#cfn-lex-botalias-s3bucketlogdestination-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The S3 prefix to assign to audio log files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-s3bucketlogdestination.html#cfn-lex-botalias-s3bucketlogdestination-logprefix)
     */
    public fun logPrefix(): String

    /**
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-s3bucketlogdestination.html#cfn-lex-botalias-s3bucketlogdestination-s3bucketarn)
     */
    public fun s3BucketArn(): String

    /**
     * A builder for [S3BucketLogDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyArn The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key
       * for encrypting audio log files stored in an Amazon S3 bucket.
       */
      public fun kmsKeyArn(kmsKeyArn: String)

      /**
       * @param logPrefix The S3 prefix to assign to audio log files. 
       */
      public fun logPrefix(logPrefix: String)

      /**
       * @param s3BucketArn The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log
       * files are stored. 
       */
      public fun s3BucketArn(s3BucketArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.S3BucketLogDestinationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.S3BucketLogDestinationProperty.builder()

      /**
       * @param kmsKeyArn The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key
       * for encrypting audio log files stored in an Amazon S3 bucket.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      /**
       * @param logPrefix The S3 prefix to assign to audio log files. 
       */
      override fun logPrefix(logPrefix: String) {
        cdkBuilder.logPrefix(logPrefix)
      }

      /**
       * @param s3BucketArn The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log
       * files are stored. 
       */
      override fun s3BucketArn(s3BucketArn: String) {
        cdkBuilder.s3BucketArn(s3BucketArn)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.S3BucketLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.S3BucketLogDestinationProperty,
    ) : CdkObject(cdkObject), S3BucketLogDestinationProperty {
      /**
       * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting
       * audio log files stored in an Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-s3bucketlogdestination.html#cfn-lex-botalias-s3bucketlogdestination-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      /**
       * The S3 prefix to assign to audio log files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-s3bucketlogdestination.html#cfn-lex-botalias-s3bucketlogdestination-logprefix)
       */
      override fun logPrefix(): String = unwrap(this).getLogPrefix()

      /**
       * The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-s3bucketlogdestination.html#cfn-lex-botalias-s3bucketlogdestination-s3bucketarn)
       */
      override fun s3BucketArn(): String = unwrap(this).getS3BucketArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3BucketLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.S3BucketLogDestinationProperty):
          S3BucketLogDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3BucketLogDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3BucketLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.S3BucketLogDestinationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotAlias.S3BucketLogDestinationProperty
    }
  }

  /**
   * Specifies the S3 bucket location where audio logs are stored.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * AudioLogDestinationProperty audioLogDestinationProperty = AudioLogDestinationProperty.builder()
   * .s3Bucket(S3BucketLogDestinationProperty.builder()
   * .logPrefix("logPrefix")
   * .s3BucketArn("s3BucketArn")
   * // the properties below are optional
   * .kmsKeyArn("kmsKeyArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-audiologdestination.html)
   */
  public interface AudioLogDestinationProperty {
    /**
     * The S3 bucket location where audio logs are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-audiologdestination.html#cfn-lex-botalias-audiologdestination-s3bucket)
     */
    public fun s3Bucket(): Any

    /**
     * A builder for [AudioLogDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Bucket The S3 bucket location where audio logs are stored. 
       */
      public fun s3Bucket(s3Bucket: IResolvable)

      /**
       * @param s3Bucket The S3 bucket location where audio logs are stored. 
       */
      public fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty)

      /**
       * @param s3Bucket The S3 bucket location where audio logs are stored. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f8f1defb0eed06484c23d307f6271c407c94ce540e0efade59a31f34da430b1")
      public fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogDestinationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogDestinationProperty.builder()

      /**
       * @param s3Bucket The S3 bucket location where audio logs are stored. 
       */
      override fun s3Bucket(s3Bucket: IResolvable) {
        cdkBuilder.s3Bucket(s3Bucket.let(IResolvable::unwrap))
      }

      /**
       * @param s3Bucket The S3 bucket location where audio logs are stored. 
       */
      override fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty) {
        cdkBuilder.s3Bucket(s3Bucket.let(S3BucketLogDestinationProperty::unwrap))
      }

      /**
       * @param s3Bucket The S3 bucket location where audio logs are stored. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f8f1defb0eed06484c23d307f6271c407c94ce540e0efade59a31f34da430b1")
      override fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty.Builder.() -> Unit): Unit =
          s3Bucket(S3BucketLogDestinationProperty(s3Bucket))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogDestinationProperty,
    ) : CdkObject(cdkObject), AudioLogDestinationProperty {
      /**
       * The S3 bucket location where audio logs are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-audiologdestination.html#cfn-lex-botalias-audiologdestination-s3bucket)
       */
      override fun s3Bucket(): Any = unwrap(this).getS3Bucket()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogDestinationProperty):
          AudioLogDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AudioLogDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogDestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotAlias.AudioLogDestinationProperty
    }
  }

  /**
   * Defines the Amazon CloudWatch Logs destination log group for conversation text logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * TextLogDestinationProperty textLogDestinationProperty = TextLogDestinationProperty.builder()
   * .cloudWatch(CloudWatchLogGroupLogDestinationProperty.builder()
   * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
   * .logPrefix("logPrefix")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-textlogdestination.html)
   */
  public interface TextLogDestinationProperty {
    /**
     * Defines the Amazon CloudWatch Logs log group where text and metadata logs are delivered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-textlogdestination.html#cfn-lex-botalias-textlogdestination-cloudwatch)
     */
    public fun cloudWatch(): Any

    /**
     * A builder for [TextLogDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatch Defines the Amazon CloudWatch Logs log group where text and metadata logs
       * are delivered. 
       */
      public fun cloudWatch(cloudWatch: IResolvable)

      /**
       * @param cloudWatch Defines the Amazon CloudWatch Logs log group where text and metadata logs
       * are delivered. 
       */
      public fun cloudWatch(cloudWatch: CloudWatchLogGroupLogDestinationProperty)

      /**
       * @param cloudWatch Defines the Amazon CloudWatch Logs log group where text and metadata logs
       * are delivered. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b3dfd722502e06c769bfb4b3823bd10dbcfae037729b1fbf993f7aad35170d8")
      public fun cloudWatch(cloudWatch: CloudWatchLogGroupLogDestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogDestinationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogDestinationProperty.builder()

      /**
       * @param cloudWatch Defines the Amazon CloudWatch Logs log group where text and metadata logs
       * are delivered. 
       */
      override fun cloudWatch(cloudWatch: IResolvable) {
        cdkBuilder.cloudWatch(cloudWatch.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatch Defines the Amazon CloudWatch Logs log group where text and metadata logs
       * are delivered. 
       */
      override fun cloudWatch(cloudWatch: CloudWatchLogGroupLogDestinationProperty) {
        cdkBuilder.cloudWatch(cloudWatch.let(CloudWatchLogGroupLogDestinationProperty::unwrap))
      }

      /**
       * @param cloudWatch Defines the Amazon CloudWatch Logs log group where text and metadata logs
       * are delivered. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b3dfd722502e06c769bfb4b3823bd10dbcfae037729b1fbf993f7aad35170d8")
      override
          fun cloudWatch(cloudWatch: CloudWatchLogGroupLogDestinationProperty.Builder.() -> Unit):
          Unit = cloudWatch(CloudWatchLogGroupLogDestinationProperty(cloudWatch))

      public fun build(): software.amazon.awscdk.services.lex.CfnBotAlias.TextLogDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogDestinationProperty,
    ) : CdkObject(cdkObject), TextLogDestinationProperty {
      /**
       * Defines the Amazon CloudWatch Logs log group where text and metadata logs are delivered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-textlogdestination.html#cfn-lex-botalias-textlogdestination-cloudwatch)
       */
      override fun cloudWatch(): Any = unwrap(this).getCloudWatch()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TextLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.TextLogDestinationProperty):
          TextLogDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TextLogDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogDestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogDestinationProperty
    }
  }

  /**
   * Defines settings to enable text conversation logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * TextLogSettingProperty textLogSettingProperty = TextLogSettingProperty.builder()
   * .destination(TextLogDestinationProperty.builder()
   * .cloudWatch(CloudWatchLogGroupLogDestinationProperty.builder()
   * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
   * .logPrefix("logPrefix")
   * .build())
   * .build())
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-textlogsetting.html)
   */
  public interface TextLogSettingProperty {
    /**
     * Defines the Amazon CloudWatch Logs destination log group for conversation text logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-textlogsetting.html#cfn-lex-botalias-textlogsetting-destination)
     */
    public fun destination(): Any

    /**
     * Determines whether conversation logs should be stored for an alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-textlogsetting.html#cfn-lex-botalias-textlogsetting-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [TextLogSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination Defines the Amazon CloudWatch Logs destination log group for
       * conversation text logs. 
       */
      public fun destination(destination: IResolvable)

      /**
       * @param destination Defines the Amazon CloudWatch Logs destination log group for
       * conversation text logs. 
       */
      public fun destination(destination: TextLogDestinationProperty)

      /**
       * @param destination Defines the Amazon CloudWatch Logs destination log group for
       * conversation text logs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("449a0c43418e184284c7ee809fd458e4f30a39d4b88999b684291d5986c6d4b7")
      public fun destination(destination: TextLogDestinationProperty.Builder.() -> Unit)

      /**
       * @param enabled Determines whether conversation logs should be stored for an alias. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Determines whether conversation logs should be stored for an alias. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogSettingProperty.builder()

      /**
       * @param destination Defines the Amazon CloudWatch Logs destination log group for
       * conversation text logs. 
       */
      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      /**
       * @param destination Defines the Amazon CloudWatch Logs destination log group for
       * conversation text logs. 
       */
      override fun destination(destination: TextLogDestinationProperty) {
        cdkBuilder.destination(destination.let(TextLogDestinationProperty::unwrap))
      }

      /**
       * @param destination Defines the Amazon CloudWatch Logs destination log group for
       * conversation text logs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("449a0c43418e184284c7ee809fd458e4f30a39d4b88999b684291d5986c6d4b7")
      override fun destination(destination: TextLogDestinationProperty.Builder.() -> Unit): Unit =
          destination(TextLogDestinationProperty(destination))

      /**
       * @param enabled Determines whether conversation logs should be stored for an alias. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Determines whether conversation logs should be stored for an alias. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBotAlias.TextLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogSettingProperty,
    ) : CdkObject(cdkObject), TextLogSettingProperty {
      /**
       * Defines the Amazon CloudWatch Logs destination log group for conversation text logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-textlogsetting.html#cfn-lex-botalias-textlogsetting-destination)
       */
      override fun destination(): Any = unwrap(this).getDestination()

      /**
       * Determines whether conversation logs should be stored for an alias.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-textlogsetting.html#cfn-lex-botalias-textlogsetting-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TextLogSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.TextLogSettingProperty):
          TextLogSettingProperty = CdkObjectWrappers.wrap(cdkObject) as? TextLogSettingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextLogSettingProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotAlias.TextLogSettingProperty
    }
  }

  /**
   * The Amazon CloudWatch Logs log group where the text and metadata logs are delivered.
   *
   * The log group must exist before you enable logging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * CloudWatchLogGroupLogDestinationProperty cloudWatchLogGroupLogDestinationProperty =
   * CloudWatchLogGroupLogDestinationProperty.builder()
   * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
   * .logPrefix("logPrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-cloudwatchloggrouplogdestination.html)
   */
  public interface CloudWatchLogGroupLogDestinationProperty {
    /**
     * The Amazon Resource Name (ARN) of the log group where text and metadata logs are delivered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-cloudwatchloggrouplogdestination.html#cfn-lex-botalias-cloudwatchloggrouplogdestination-cloudwatchloggrouparn)
     */
    public fun cloudWatchLogGroupArn(): String

    /**
     * The prefix of the log stream name within the log group that you specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-cloudwatchloggrouplogdestination.html#cfn-lex-botalias-cloudwatchloggrouplogdestination-logprefix)
     */
    public fun logPrefix(): String

    /**
     * A builder for [CloudWatchLogGroupLogDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogGroupArn The Amazon Resource Name (ARN) of the log group where text and
       * metadata logs are delivered. 
       */
      public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String)

      /**
       * @param logPrefix The prefix of the log stream name within the log group that you specified.
       * 
       */
      public fun logPrefix(logPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.CloudWatchLogGroupLogDestinationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBotAlias.CloudWatchLogGroupLogDestinationProperty.builder()

      /**
       * @param cloudWatchLogGroupArn The Amazon Resource Name (ARN) of the log group where text and
       * metadata logs are delivered. 
       */
      override fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
        cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
      }

      /**
       * @param logPrefix The prefix of the log stream name within the log group that you specified.
       * 
       */
      override fun logPrefix(logPrefix: String) {
        cdkBuilder.logPrefix(logPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.CloudWatchLogGroupLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.CloudWatchLogGroupLogDestinationProperty,
    ) : CdkObject(cdkObject), CloudWatchLogGroupLogDestinationProperty {
      /**
       * The Amazon Resource Name (ARN) of the log group where text and metadata logs are delivered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-cloudwatchloggrouplogdestination.html#cfn-lex-botalias-cloudwatchloggrouplogdestination-cloudwatchloggrouparn)
       */
      override fun cloudWatchLogGroupArn(): String = unwrap(this).getCloudWatchLogGroupArn()

      /**
       * The prefix of the log stream name within the log group that you specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-cloudwatchloggrouplogdestination.html#cfn-lex-botalias-cloudwatchloggrouplogdestination-logprefix)
       */
      override fun logPrefix(): String = unwrap(this).getLogPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchLogGroupLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.CloudWatchLogGroupLogDestinationProperty):
          CloudWatchLogGroupLogDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchLogGroupLogDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogGroupLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.CloudWatchLogGroupLogDestinationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotAlias.CloudWatchLogGroupLogDestinationProperty
    }
  }

  /**
   * Configures conversation logging that saves audio, text, and metadata for the conversations with
   * your users.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * ConversationLogSettingsProperty conversationLogSettingsProperty =
   * ConversationLogSettingsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-conversationlogsettings.html)
   */
  public interface ConversationLogSettingsProperty {
    /**
     * The Amazon S3 settings for logging audio to an S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-conversationlogsettings.html#cfn-lex-botalias-conversationlogsettings-audiologsettings)
     */
    public fun audioLogSettings(): Any? = unwrap(this).getAudioLogSettings()

    /**
     * The Amazon CloudWatch Logs settings for logging text and metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-conversationlogsettings.html#cfn-lex-botalias-conversationlogsettings-textlogsettings)
     */
    public fun textLogSettings(): Any? = unwrap(this).getTextLogSettings()

    /**
     * A builder for [ConversationLogSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param audioLogSettings The Amazon S3 settings for logging audio to an S3 bucket.
       */
      public fun audioLogSettings(audioLogSettings: IResolvable)

      /**
       * @param audioLogSettings The Amazon S3 settings for logging audio to an S3 bucket.
       */
      public fun audioLogSettings(audioLogSettings: List<Any>)

      /**
       * @param audioLogSettings The Amazon S3 settings for logging audio to an S3 bucket.
       */
      public fun audioLogSettings(vararg audioLogSettings: Any)

      /**
       * @param textLogSettings The Amazon CloudWatch Logs settings for logging text and metadata.
       */
      public fun textLogSettings(textLogSettings: IResolvable)

      /**
       * @param textLogSettings The Amazon CloudWatch Logs settings for logging text and metadata.
       */
      public fun textLogSettings(textLogSettings: List<Any>)

      /**
       * @param textLogSettings The Amazon CloudWatch Logs settings for logging text and metadata.
       */
      public fun textLogSettings(vararg textLogSettings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotAlias.ConversationLogSettingsProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBotAlias.ConversationLogSettingsProperty.builder()

      /**
       * @param audioLogSettings The Amazon S3 settings for logging audio to an S3 bucket.
       */
      override fun audioLogSettings(audioLogSettings: IResolvable) {
        cdkBuilder.audioLogSettings(audioLogSettings.let(IResolvable::unwrap))
      }

      /**
       * @param audioLogSettings The Amazon S3 settings for logging audio to an S3 bucket.
       */
      override fun audioLogSettings(audioLogSettings: List<Any>) {
        cdkBuilder.audioLogSettings(audioLogSettings)
      }

      /**
       * @param audioLogSettings The Amazon S3 settings for logging audio to an S3 bucket.
       */
      override fun audioLogSettings(vararg audioLogSettings: Any): Unit =
          audioLogSettings(audioLogSettings.toList())

      /**
       * @param textLogSettings The Amazon CloudWatch Logs settings for logging text and metadata.
       */
      override fun textLogSettings(textLogSettings: IResolvable) {
        cdkBuilder.textLogSettings(textLogSettings.let(IResolvable::unwrap))
      }

      /**
       * @param textLogSettings The Amazon CloudWatch Logs settings for logging text and metadata.
       */
      override fun textLogSettings(textLogSettings: List<Any>) {
        cdkBuilder.textLogSettings(textLogSettings)
      }

      /**
       * @param textLogSettings The Amazon CloudWatch Logs settings for logging text and metadata.
       */
      override fun textLogSettings(vararg textLogSettings: Any): Unit =
          textLogSettings(textLogSettings.toList())

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotAlias.ConversationLogSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotAlias.ConversationLogSettingsProperty,
    ) : CdkObject(cdkObject), ConversationLogSettingsProperty {
      /**
       * The Amazon S3 settings for logging audio to an S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-conversationlogsettings.html#cfn-lex-botalias-conversationlogsettings-audiologsettings)
       */
      override fun audioLogSettings(): Any? = unwrap(this).getAudioLogSettings()

      /**
       * The Amazon CloudWatch Logs settings for logging text and metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-conversationlogsettings.html#cfn-lex-botalias-conversationlogsettings-textlogsettings)
       */
      override fun textLogSettings(): Any? = unwrap(this).getTextLogSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConversationLogSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotAlias.ConversationLogSettingsProperty):
          ConversationLogSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConversationLogSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConversationLogSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBotAlias.ConversationLogSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotAlias.ConversationLogSettingsProperty
    }
  }
}
