@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

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

/**
 * Specifies configuration settings for the alias used to test the bot.
 *
 * If the `TestBotAliasSettings` property is not specified, the settings are configured with default
 * values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * Object sentimentAnalysisSettings;
 * TestBotAliasSettingsProperty testBotAliasSettingsProperty =
 * TestBotAliasSettingsProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-testbotaliassettings.html)
 */
@CdkDslMarker
public class CfnBotTestBotAliasSettingsPropertyDsl {
    private val cdkBuilder: CfnBot.TestBotAliasSettingsProperty.Builder =
        CfnBot.TestBotAliasSettingsProperty.builder()

    private val _botAliasLocaleSettings: MutableList<Any> = mutableListOf()

    /**
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale. For example,
     *   you can use a different Lambda function depending on the bot's locale.
     */
    public fun botAliasLocaleSettings(vararg botAliasLocaleSettings: Any) {
        _botAliasLocaleSettings.addAll(listOf(*botAliasLocaleSettings))
    }

    /**
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale. For example,
     *   you can use a different Lambda function depending on the bot's locale.
     */
    public fun botAliasLocaleSettings(botAliasLocaleSettings: Collection<Any>) {
        _botAliasLocaleSettings.addAll(botAliasLocaleSettings)
    }

    /**
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale. For example,
     *   you can use a different Lambda function depending on the bot's locale.
     */
    public fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable) {
        cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings)
    }

    /**
     * @param conversationLogSettings Specifies settings for conversation logs that save audio,
     *   text, and metadata information for conversations with your users.
     */
    public fun conversationLogSettings(conversationLogSettings: IResolvable) {
        cdkBuilder.conversationLogSettings(conversationLogSettings)
    }

    /**
     * @param conversationLogSettings Specifies settings for conversation logs that save audio,
     *   text, and metadata information for conversations with your users.
     */
    public fun conversationLogSettings(
        conversationLogSettings: CfnBot.ConversationLogSettingsProperty
    ) {
        cdkBuilder.conversationLogSettings(conversationLogSettings)
    }

    /** @param description Specifies a description for the test bot alias. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param sentimentAnalysisSettings Specifies whether Amazon Lex will use Amazon Comprehend to
     *   detect the sentiment of user utterances.
     */
    public fun sentimentAnalysisSettings(sentimentAnalysisSettings: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(sentimentAnalysisSettings)
        cdkBuilder.sentimentAnalysisSettings(builder.map)
    }

    /**
     * @param sentimentAnalysisSettings Specifies whether Amazon Lex will use Amazon Comprehend to
     *   detect the sentiment of user utterances.
     */
    public fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any) {
        cdkBuilder.sentimentAnalysisSettings(sentimentAnalysisSettings)
    }

    public fun build(): CfnBot.TestBotAliasSettingsProperty {
        if (_botAliasLocaleSettings.isNotEmpty())
            cdkBuilder.botAliasLocaleSettings(_botAliasLocaleSettings)
        return cdkBuilder.build()
    }
}
