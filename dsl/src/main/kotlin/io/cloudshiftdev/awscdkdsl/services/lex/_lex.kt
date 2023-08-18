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

package io.cloudshiftdev.awscdkdsl.services.lex

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot
import software.amazon.awscdk.services.lex.CfnBotAlias
import software.amazon.awscdk.services.lex.CfnBotAliasProps
import software.amazon.awscdk.services.lex.CfnBotProps
import software.amazon.awscdk.services.lex.CfnBotVersion
import software.amazon.awscdk.services.lex.CfnBotVersionProps
import software.amazon.awscdk.services.lex.CfnResourcePolicy
import software.amazon.awscdk.services.lex.CfnResourcePolicyProps
import software.constructs.Construct

public object lex {
    /**
     * Amazon Lex V2 is the only supported version in AWS CloudFormation .
     *
     * Specifies an Amazon Lex conversational bot.
     *
     * You must configure an intent based on the `AMAZON.FallbackIntent` built-in intent. If you
     * don't add one, creating the bot will fail.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html)
     */
    public inline fun cfnBot(
        scope: Construct,
        id: String,
        block: CfnBotDsl.() -> Unit = {},
    ): CfnBot {
        val builder = CfnBotDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides settings that enable advanced recognition settings for slot values.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * AdvancedRecognitionSettingProperty advancedRecognitionSettingProperty =
     * AdvancedRecognitionSettingProperty.builder()
     * .audioRecognitionStrategy("audioRecognitionStrategy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-advancedrecognitionsetting.html)
     */
    public inline fun cfnBotAdvancedRecognitionSettingProperty(
        block: CfnBotAdvancedRecognitionSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.AdvancedRecognitionSettingProperty {
        val builder = CfnBotAdvancedRecognitionSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Amazon Lex V2 is the only supported version in AWS CloudFormation .
     *
     * Specifies an alias for the specified version of a bot. Use an alias to enable you to change
     * the version of a bot without updating applications that use the bot.
     *
     * For example, you can specify an alias called "PROD" that your applications use to call the
     * Amazon Lex bot.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
    public inline fun cfnBotAlias(
        scope: Construct,
        id: String,
        block: CfnBotAliasDsl.() -> Unit = {},
    ): CfnBotAlias {
        val builder = CfnBotAliasDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the S3 bucket location where audio logs are stored.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
    public inline fun cfnBotAliasAudioLogDestinationProperty(
        block: CfnBotAliasAudioLogDestinationPropertyDsl.() -> Unit = {}
    ): CfnBotAlias.AudioLogDestinationProperty {
        val builder = CfnBotAliasAudioLogDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for logging audio of conversations between Amazon Lex and a user.
     *
     * You specify whether to log audio and the Amazon S3 bucket where the audio file is stored.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
    public inline fun cfnBotAliasAudioLogSettingProperty(
        block: CfnBotAliasAudioLogSettingPropertyDsl.() -> Unit = {}
    ): CfnBotAlias.AudioLogSettingProperty {
        val builder = CfnBotAliasAudioLogSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies settings that are unique to a locale.
     *
     * For example, you can use different Lambda function depending on the bot's locale.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
    public inline fun cfnBotAliasBotAliasLocaleSettingsItemProperty(
        block: CfnBotAliasBotAliasLocaleSettingsItemPropertyDsl.() -> Unit = {}
    ): CfnBotAlias.BotAliasLocaleSettingsItemProperty {
        val builder = CfnBotAliasBotAliasLocaleSettingsItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies settings that are unique to a locale.
     *
     * For example, you can use different Lambda function depending on the bot's locale.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
    public inline fun cfnBotAliasBotAliasLocaleSettingsProperty(
        block: CfnBotAliasBotAliasLocaleSettingsPropertyDsl.() -> Unit = {}
    ): CfnBotAlias.BotAliasLocaleSettingsProperty {
        val builder = CfnBotAliasBotAliasLocaleSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon CloudWatch Logs log group where the text and metadata logs are delivered.
     *
     * The log group must exist before you enable logging.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * CloudWatchLogGroupLogDestinationProperty cloudWatchLogGroupLogDestinationProperty =
     * CloudWatchLogGroupLogDestinationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .logPrefix("logPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-cloudwatchloggrouplogdestination.html)
     */
    public inline fun cfnBotAliasCloudWatchLogGroupLogDestinationProperty(
        block: CfnBotAliasCloudWatchLogGroupLogDestinationPropertyDsl.() -> Unit = {}
    ): CfnBotAlias.CloudWatchLogGroupLogDestinationProperty {
        val builder = CfnBotAliasCloudWatchLogGroupLogDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about code hooks that Amazon Lex calls during a conversation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
    public inline fun cfnBotAliasCodeHookSpecificationProperty(
        block: CfnBotAliasCodeHookSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBotAlias.CodeHookSpecificationProperty {
        val builder = CfnBotAliasCodeHookSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures conversation logging that saves audio, text, and metadata for the conversations
     * with your users.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
    public inline fun cfnBotAliasConversationLogSettingsProperty(
        block: CfnBotAliasConversationLogSettingsPropertyDsl.() -> Unit = {}
    ): CfnBotAlias.ConversationLogSettingsProperty {
        val builder = CfnBotAliasConversationLogSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a Lambda function that verifies requests to a bot or fulfills the user's request to
     * a bot.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * LambdaCodeHookProperty lambdaCodeHookProperty = LambdaCodeHookProperty.builder()
     * .codeHookInterfaceVersion("codeHookInterfaceVersion")
     * .lambdaArn("lambdaArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-lambdacodehook.html)
     */
    public inline fun cfnBotAliasLambdaCodeHookProperty(
        block: CfnBotAliasLambdaCodeHookPropertyDsl.() -> Unit = {}
    ): CfnBotAlias.LambdaCodeHookProperty {
        val builder = CfnBotAliasLambdaCodeHookPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBotAlias`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
    public inline fun cfnBotAliasProps(
        block: CfnBotAliasPropsDsl.() -> Unit = {}
    ): CfnBotAliasProps {
        val builder = CfnBotAliasPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Amazon S3 bucket for logging audio conversations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
    public inline fun cfnBotAliasS3BucketLogDestinationProperty(
        block: CfnBotAliasS3BucketLogDestinationPropertyDsl.() -> Unit = {}
    ): CfnBotAlias.S3BucketLogDestinationProperty {
        val builder = CfnBotAliasS3BucketLogDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user
     * utterances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SentimentAnalysisSettingsProperty sentimentAnalysisSettingsProperty =
     * SentimentAnalysisSettingsProperty.builder()
     * .detectSentiment(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-sentimentanalysissettings.html)
     */
    public inline fun cfnBotAliasSentimentAnalysisSettingsProperty(
        block: CfnBotAliasSentimentAnalysisSettingsPropertyDsl.() -> Unit = {}
    ): CfnBotAlias.SentimentAnalysisSettingsProperty {
        val builder = CfnBotAliasSentimentAnalysisSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the Amazon CloudWatch Logs destination log group for conversation text logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
    public inline fun cfnBotAliasTextLogDestinationProperty(
        block: CfnBotAliasTextLogDestinationPropertyDsl.() -> Unit = {}
    ): CfnBotAlias.TextLogDestinationProperty {
        val builder = CfnBotAliasTextLogDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines settings to enable text conversation logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
    public inline fun cfnBotAliasTextLogSettingProperty(
        block: CfnBotAliasTextLogSettingPropertyDsl.() -> Unit = {}
    ): CfnBotAlias.TextLogSettingProperty {
        val builder = CfnBotAliasTextLogSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the allowed input types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * AllowedInputTypesProperty allowedInputTypesProperty = AllowedInputTypesProperty.builder()
     * .allowAudioInput(false)
     * .allowDtmfInput(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-allowedinputtypes.html)
     */
    public inline fun cfnBotAllowedInputTypesProperty(
        block: CfnBotAllowedInputTypesPropertyDsl.() -> Unit = {}
    ): CfnBot.AllowedInputTypesProperty {
        val builder = CfnBotAllowedInputTypesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the audio and DTMF input specification.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * AudioAndDTMFInputSpecificationProperty audioAndDTMFInputSpecificationProperty =
     * AudioAndDTMFInputSpecificationProperty.builder()
     * .startTimeoutMs(123)
     * // the properties below are optional
     * .audioSpecification(AudioSpecificationProperty.builder()
     * .endTimeoutMs(123)
     * .maxLengthMs(123)
     * .build())
     * .dtmfSpecification(DTMFSpecificationProperty.builder()
     * .deletionCharacter("deletionCharacter")
     * .endCharacter("endCharacter")
     * .endTimeoutMs(123)
     * .maxLength(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audioanddtmfinputspecification.html)
     */
    public inline fun cfnBotAudioAndDTMFInputSpecificationProperty(
        block: CfnBotAudioAndDTMFInputSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.AudioAndDTMFInputSpecificationProperty {
        val builder = CfnBotAudioAndDTMFInputSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The location of audio log files collected when conversation logging is enabled for a bot.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiologdestination.html)
     */
    public inline fun cfnBotAudioLogDestinationProperty(
        block: CfnBotAudioLogDestinationPropertyDsl.() -> Unit = {}
    ): CfnBot.AudioLogDestinationProperty {
        val builder = CfnBotAudioLogDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for logging audio of conversations between Amazon Lex and a user.
     *
     * You specify whether to log audio and the Amazon S3 bucket where the audio file is stored.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiologsetting.html)
     */
    public inline fun cfnBotAudioLogSettingProperty(
        block: CfnBotAudioLogSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.AudioLogSettingProperty {
        val builder = CfnBotAudioLogSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the audio input specifications.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * AudioSpecificationProperty audioSpecificationProperty = AudioSpecificationProperty.builder()
     * .endTimeoutMs(123)
     * .maxLengthMs(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiospecification.html)
     */
    public inline fun cfnBotAudioSpecificationProperty(
        block: CfnBotAudioSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.AudioSpecificationProperty {
        val builder = CfnBotAudioSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies locale settings for a single locale.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botaliaslocalesettingsitem.html)
     */
    public inline fun cfnBotBotAliasLocaleSettingsItemProperty(
        block: CfnBotBotAliasLocaleSettingsItemPropertyDsl.() -> Unit = {}
    ): CfnBot.BotAliasLocaleSettingsItemProperty {
        val builder = CfnBotBotAliasLocaleSettingsItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies settings that are unique to a locale.
     *
     * For example, you can use different Lambda function depending on the bot's locale.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botaliaslocalesettings.html)
     */
    public inline fun cfnBotBotAliasLocaleSettingsProperty(
        block: CfnBotBotAliasLocaleSettingsPropertyDsl.() -> Unit = {}
    ): CfnBot.BotAliasLocaleSettingsProperty {
        val builder = CfnBotBotAliasLocaleSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides configuration information for a locale.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html)
     */
    public inline fun cfnBotBotLocaleProperty(
        block: CfnBotBotLocalePropertyDsl.() -> Unit = {}
    ): CfnBot.BotLocaleProperty {
        val builder = CfnBotBotLocalePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a button to use on a response card used to gather slot values from a user.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * ButtonProperty buttonProperty = ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-button.html)
     */
    public inline fun cfnBotButtonProperty(
        block: CfnBotButtonPropertyDsl.() -> Unit = {}
    ): CfnBot.ButtonProperty {
        val builder = CfnBotButtonPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon CloudWatch Logs log group where the text and metadata logs are delivered.
     *
     * The log group must exist before you enable logging.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * CloudWatchLogGroupLogDestinationProperty cloudWatchLogGroupLogDestinationProperty =
     * CloudWatchLogGroupLogDestinationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .logPrefix("logPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-cloudwatchloggrouplogdestination.html)
     */
    public inline fun cfnBotCloudWatchLogGroupLogDestinationProperty(
        block: CfnBotCloudWatchLogGroupLogDestinationPropertyDsl.() -> Unit = {}
    ): CfnBot.CloudWatchLogGroupLogDestinationProperty {
        val builder = CfnBotCloudWatchLogGroupLogDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about code hooks that Amazon Lex calls during a conversation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * CodeHookSpecificationProperty codeHookSpecificationProperty =
     * CodeHookSpecificationProperty.builder()
     * .lambdaCodeHook(LambdaCodeHookProperty.builder()
     * .codeHookInterfaceVersion("codeHookInterfaceVersion")
     * .lambdaArn("lambdaArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-codehookspecification.html)
     */
    public inline fun cfnBotCodeHookSpecificationProperty(
        block: CfnBotCodeHookSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.CodeHookSpecificationProperty {
        val builder = CfnBotCodeHookSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides an expression that evaluates to true or false.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * ConditionProperty conditionProperty = ConditionProperty.builder()
     * .expressionString("expressionString")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-condition.html)
     */
    public inline fun cfnBotConditionProperty(
        block: CfnBotConditionPropertyDsl.() -> Unit = {}
    ): CfnBot.ConditionProperty {
        val builder = CfnBotConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A set of actions that Amazon Lex should run if the condition is matched.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotValueOverrideProperty slotValueOverrideProperty_;
     * ConditionalBranchProperty conditionalBranchProperty = ConditionalBranchProperty.builder()
     * .condition(ConditionProperty.builder()
     * .expressionString("expressionString")
     * .build())
     * .name("name")
     * .nextStep(DialogStateProperty.builder()
     * .dialogAction(DialogActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .slotToElicit("slotToElicit")
     * .suppressNextMessage(false)
     * .build())
     * .intent(IntentOverrideProperty.builder()
     * .name("name")
     * .slots(List.of(SlotValueOverrideMapProperty.builder()
     * .slotName("slotName")
     * .slotValueOverride(SlotValueOverrideProperty.builder()
     * .shape("shape")
     * .value(SlotValueProperty.builder()
     * .interpretedValue("interpretedValue")
     * .build())
     * .values(List.of(slotValueOverrideProperty_))
     * .build())
     * .build()))
     * .build())
     * .sessionAttributes(List.of(SessionAttributeProperty.builder()
     * .key("key")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .build())
     * // the properties below are optional
     * .response(ResponseSpecificationProperty.builder()
     * .messageGroupsList(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalbranch.html)
     */
    public inline fun cfnBotConditionalBranchProperty(
        block: CfnBotConditionalBranchPropertyDsl.() -> Unit = {}
    ): CfnBot.ConditionalBranchProperty {
        val builder = CfnBotConditionalBranchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides a list of conditional branches.
     *
     * Branches are evaluated in the order that they are entered in the list. The first branch with
     * a condition that evaluates to true is executed. The last branch in the list is the default
     * branch. The default branch should not have any condition expression. The default branch is
     * executed if no other branch has a matching condition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotValueOverrideProperty slotValueOverrideProperty_;
     * ConditionalSpecificationProperty conditionalSpecificationProperty =
     * ConditionalSpecificationProperty.builder()
     * .conditionalBranches(List.of(ConditionalBranchProperty.builder()
     * .condition(ConditionProperty.builder()
     * .expressionString("expressionString")
     * .build())
     * .name("name")
     * .nextStep(DialogStateProperty.builder()
     * .dialogAction(DialogActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .slotToElicit("slotToElicit")
     * .suppressNextMessage(false)
     * .build())
     * .intent(IntentOverrideProperty.builder()
     * .name("name")
     * .slots(List.of(SlotValueOverrideMapProperty.builder()
     * .slotName("slotName")
     * .slotValueOverride(SlotValueOverrideProperty.builder()
     * .shape("shape")
     * .value(SlotValueProperty.builder()
     * .interpretedValue("interpretedValue")
     * .build())
     * .values(List.of(slotValueOverrideProperty_))
     * .build())
     * .build()))
     * .build())
     * .sessionAttributes(List.of(SessionAttributeProperty.builder()
     * .key("key")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .build())
     * // the properties below are optional
     * .response(ResponseSpecificationProperty.builder()
     * .messageGroupsList(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build())
     * .build()))
     * .defaultBranch(DefaultConditionalBranchProperty.builder()
     * .nextStep(DialogStateProperty.builder()
     * .dialogAction(DialogActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .slotToElicit("slotToElicit")
     * .suppressNextMessage(false)
     * .build())
     * .intent(IntentOverrideProperty.builder()
     * .name("name")
     * .slots(List.of(SlotValueOverrideMapProperty.builder()
     * .slotName("slotName")
     * .slotValueOverride(SlotValueOverrideProperty.builder()
     * .shape("shape")
     * .value(SlotValueProperty.builder()
     * .interpretedValue("interpretedValue")
     * .build())
     * .values(List.of(slotValueOverrideProperty_))
     * .build())
     * .build()))
     * .build())
     * .sessionAttributes(List.of(SessionAttributeProperty.builder()
     * .key("key")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .build())
     * .response(ResponseSpecificationProperty.builder()
     * .messageGroupsList(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build())
     * .build())
     * .isActive(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalspecification.html)
     */
    public inline fun cfnBotConditionalSpecificationProperty(
        block: CfnBotConditionalSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.ConditionalSpecificationProperty {
        val builder = CfnBotConditionalSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures conversation logging that saves audio, text, and metadata for the conversations
     * with your users.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conversationlogsettings.html)
     */
    public inline fun cfnBotConversationLogSettingsProperty(
        block: CfnBotConversationLogSettingsPropertyDsl.() -> Unit = {}
    ): CfnBot.ConversationLogSettingsProperty {
        val builder = CfnBotConversationLogSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom response string that Amazon Lex sends to your application.
     *
     * You define the content and structure the string.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * CustomPayloadProperty customPayloadProperty = CustomPayloadProperty.builder()
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-custompayload.html)
     */
    public inline fun cfnBotCustomPayloadProperty(
        block: CfnBotCustomPayloadPropertyDsl.() -> Unit = {}
    ): CfnBot.CustomPayloadProperty {
        val builder = CfnBotCustomPayloadPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an entry in a custom vocabulary.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * CustomVocabularyItemProperty customVocabularyItemProperty =
     * CustomVocabularyItemProperty.builder()
     * .phrase("phrase")
     * // the properties below are optional
     * .displayAs("displayAs")
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-customvocabularyitem.html)
     */
    public inline fun cfnBotCustomVocabularyItemProperty(
        block: CfnBotCustomVocabularyItemPropertyDsl.() -> Unit = {}
    ): CfnBot.CustomVocabularyItemProperty {
        val builder = CfnBotCustomVocabularyItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a custom vocabulary.
     *
     * A custom vocabulary is a list of words that you expect to be used during a conversation with
     * your bot.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * CustomVocabularyProperty customVocabularyProperty = CustomVocabularyProperty.builder()
     * .customVocabularyItems(List.of(CustomVocabularyItemProperty.builder()
     * .phrase("phrase")
     * // the properties below are optional
     * .displayAs("displayAs")
     * .weight(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-customvocabulary.html)
     */
    public inline fun cfnBotCustomVocabularyProperty(
        block: CfnBotCustomVocabularyPropertyDsl.() -> Unit = {}
    ): CfnBot.CustomVocabularyProperty {
        val builder = CfnBotCustomVocabularyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the DTMF input specifications.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * DTMFSpecificationProperty dTMFSpecificationProperty = DTMFSpecificationProperty.builder()
     * .deletionCharacter("deletionCharacter")
     * .endCharacter("endCharacter")
     * .endTimeoutMs(123)
     * .maxLength(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dtmfspecification.html)
     */
    public inline fun cfnBotDTMFSpecificationProperty(
        block: CfnBotDTMFSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.DTMFSpecificationProperty {
        val builder = CfnBotDTMFSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * By default, data stored by Amazon Lex is encrypted.
     *
     * The `DataPrivacy` structure provides settings that determine how Amazon Lex handles special
     * cases of securing the data for your bot.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * DataPrivacyProperty dataPrivacyProperty = DataPrivacyProperty.builder()
     * .childDirected(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dataprivacy.html)
     */
    public inline fun cfnBotDataPrivacyProperty(
        block: CfnBotDataPrivacyPropertyDsl.() -> Unit = {}
    ): CfnBot.DataPrivacyProperty {
        val builder = CfnBotDataPrivacyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A set of actions that Amazon Lex should run if none of the other conditions are met.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotValueOverrideProperty slotValueOverrideProperty_;
     * DefaultConditionalBranchProperty defaultConditionalBranchProperty =
     * DefaultConditionalBranchProperty.builder()
     * .nextStep(DialogStateProperty.builder()
     * .dialogAction(DialogActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .slotToElicit("slotToElicit")
     * .suppressNextMessage(false)
     * .build())
     * .intent(IntentOverrideProperty.builder()
     * .name("name")
     * .slots(List.of(SlotValueOverrideMapProperty.builder()
     * .slotName("slotName")
     * .slotValueOverride(SlotValueOverrideProperty.builder()
     * .shape("shape")
     * .value(SlotValueProperty.builder()
     * .interpretedValue("interpretedValue")
     * .build())
     * .values(List.of(slotValueOverrideProperty_))
     * .build())
     * .build()))
     * .build())
     * .sessionAttributes(List.of(SessionAttributeProperty.builder()
     * .key("key")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .build())
     * .response(ResponseSpecificationProperty.builder()
     * .messageGroupsList(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-defaultconditionalbranch.html)
     */
    public inline fun cfnBotDefaultConditionalBranchProperty(
        block: CfnBotDefaultConditionalBranchPropertyDsl.() -> Unit = {}
    ): CfnBot.DefaultConditionalBranchProperty {
        val builder = CfnBotDefaultConditionalBranchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the action that the bot executes at runtime when the conversation reaches this step.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * DialogActionProperty dialogActionProperty = DialogActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .slotToElicit("slotToElicit")
     * .suppressNextMessage(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogaction.html)
     */
    public inline fun cfnBotDialogActionProperty(
        block: CfnBotDialogActionPropertyDsl.() -> Unit = {}
    ): CfnBot.DialogActionProperty {
        val builder = CfnBotDialogActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings that specify the dialog code hook that is called by Amazon Lex at a step of the
     * conversation.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehookinvocationsetting.html)
     */
    public inline fun cfnBotDialogCodeHookInvocationSettingProperty(
        block: CfnBotDialogCodeHookInvocationSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.DialogCodeHookInvocationSettingProperty {
        val builder = CfnBotDialogCodeHookInvocationSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings that determine the Lambda function that Amazon Lex uses for processing user
     * responses.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * DialogCodeHookSettingProperty dialogCodeHookSettingProperty =
     * DialogCodeHookSettingProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehooksetting.html)
     */
    public inline fun cfnBotDialogCodeHookSettingProperty(
        block: CfnBotDialogCodeHookSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.DialogCodeHookSettingProperty {
        val builder = CfnBotDialogCodeHookSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The current state of the conversation with the user.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotValueOverrideProperty slotValueOverrideProperty_;
     * DialogStateProperty dialogStateProperty = DialogStateProperty.builder()
     * .dialogAction(DialogActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .slotToElicit("slotToElicit")
     * .suppressNextMessage(false)
     * .build())
     * .intent(IntentOverrideProperty.builder()
     * .name("name")
     * .slots(List.of(SlotValueOverrideMapProperty.builder()
     * .slotName("slotName")
     * .slotValueOverride(SlotValueOverrideProperty.builder()
     * .shape("shape")
     * .value(SlotValueProperty.builder()
     * .interpretedValue("interpretedValue")
     * .build())
     * .values(List.of(slotValueOverrideProperty_))
     * .build())
     * .build()))
     * .build())
     * .sessionAttributes(List.of(SessionAttributeProperty.builder()
     * .key("key")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogstate.html)
     */
    public inline fun cfnBotDialogStateProperty(
        block: CfnBotDialogStatePropertyDsl.() -> Unit = {}
    ): CfnBot.DialogStateProperty {
        val builder = CfnBotDialogStatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings that specify the dialog code hook that is called by Amazon Lex between eliciting
     * slot values.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * ElicitationCodeHookInvocationSettingProperty elicitationCodeHookInvocationSettingProperty =
     * ElicitationCodeHookInvocationSettingProperty.builder()
     * .enableCodeHookInvocation(false)
     * // the properties below are optional
     * .invocationLabel("invocationLabel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-elicitationcodehookinvocationsetting.html)
     */
    public inline fun cfnBotElicitationCodeHookInvocationSettingProperty(
        block: CfnBotElicitationCodeHookInvocationSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.ElicitationCodeHookInvocationSettingProperty {
        val builder = CfnBotElicitationCodeHookInvocationSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information about the external source of the slot type's definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * ExternalSourceSettingProperty externalSourceSettingProperty =
     * ExternalSourceSettingProperty.builder()
     * .grammarSlotTypeSetting(GrammarSlotTypeSettingProperty.builder()
     * .source(GrammarSlotTypeSourceProperty.builder()
     * .s3BucketName("s3BucketName")
     * .s3ObjectKey("s3ObjectKey")
     * // the properties below are optional
     * .kmsKeyArn("kmsKeyArn")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-externalsourcesetting.html)
     */
    public inline fun cfnBotExternalSourceSettingProperty(
        block: CfnBotExternalSourceSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.ExternalSourceSettingProperty {
        val builder = CfnBotExternalSourceSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines if a Lambda function should be invoked for a specific intent.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentcodehooksetting.html)
     */
    public inline fun cfnBotFulfillmentCodeHookSettingProperty(
        block: CfnBotFulfillmentCodeHookSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.FulfillmentCodeHookSettingProperty {
        val builder = CfnBotFulfillmentCodeHookSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides settings for a message that is sent to the user when a fulfillment Lambda function
     * starts running.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * FulfillmentStartResponseSpecificationProperty fulfillmentStartResponseSpecificationProperty =
     * FulfillmentStartResponseSpecificationProperty.builder()
     * .delayInSeconds(123)
     * .messageGroups(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentstartresponsespecification.html)
     */
    public inline fun cfnBotFulfillmentStartResponseSpecificationProperty(
        block: CfnBotFulfillmentStartResponseSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.FulfillmentStartResponseSpecificationProperty {
        val builder = CfnBotFulfillmentStartResponseSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides settings for a message that is sent periodically to the user while a fulfillment
     * Lambda function is running.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * FulfillmentUpdateResponseSpecificationProperty fulfillmentUpdateResponseSpecificationProperty =
     * FulfillmentUpdateResponseSpecificationProperty.builder()
     * .frequencyInSeconds(123)
     * .messageGroups(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdateresponsespecification.html)
     */
    public inline fun cfnBotFulfillmentUpdateResponseSpecificationProperty(
        block: CfnBotFulfillmentUpdateResponseSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.FulfillmentUpdateResponseSpecificationProperty {
        val builder = CfnBotFulfillmentUpdateResponseSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information for updating the user on the progress of fulfilling an intent.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * FulfillmentUpdatesSpecificationProperty fulfillmentUpdatesSpecificationProperty =
     * FulfillmentUpdatesSpecificationProperty.builder()
     * .active(false)
     * // the properties below are optional
     * .startResponse(FulfillmentStartResponseSpecificationProperty.builder()
     * .delayInSeconds(123)
     * .messageGroups(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build())
     * .timeoutInSeconds(123)
     * .updateResponse(FulfillmentUpdateResponseSpecificationProperty.builder()
     * .frequencyInSeconds(123)
     * .messageGroups(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdatesspecification.html)
     */
    public inline fun cfnBotFulfillmentUpdatesSpecificationProperty(
        block: CfnBotFulfillmentUpdatesSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.FulfillmentUpdatesSpecificationProperty {
        val builder = CfnBotFulfillmentUpdatesSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings requried for a slot type based on a grammar that you provide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * GrammarSlotTypeSettingProperty grammarSlotTypeSettingProperty =
     * GrammarSlotTypeSettingProperty.builder()
     * .source(GrammarSlotTypeSourceProperty.builder()
     * .s3BucketName("s3BucketName")
     * .s3ObjectKey("s3ObjectKey")
     * // the properties below are optional
     * .kmsKeyArn("kmsKeyArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-grammarslottypesetting.html)
     */
    public inline fun cfnBotGrammarSlotTypeSettingProperty(
        block: CfnBotGrammarSlotTypeSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.GrammarSlotTypeSettingProperty {
        val builder = CfnBotGrammarSlotTypeSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the Amazon S3 bucket name and location for the grammar that is the source for the
     * slot type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * GrammarSlotTypeSourceProperty grammarSlotTypeSourceProperty =
     * GrammarSlotTypeSourceProperty.builder()
     * .s3BucketName("s3BucketName")
     * .s3ObjectKey("s3ObjectKey")
     * // the properties below are optional
     * .kmsKeyArn("kmsKeyArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-grammarslottypesource.html)
     */
    public inline fun cfnBotGrammarSlotTypeSourceProperty(
        block: CfnBotGrammarSlotTypeSourcePropertyDsl.() -> Unit = {}
    ): CfnBot.GrammarSlotTypeSourceProperty {
        val builder = CfnBotGrammarSlotTypeSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A card that is shown to the user by a messaging platform.
     *
     * You define the contents of the card, the card is displayed by the platform.
     *
     * When you use a response card, the response from the user is constrained to the text
     * associated with a button on the card.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * ImageResponseCardProperty imageResponseCardProperty = ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-imageresponsecard.html)
     */
    public inline fun cfnBotImageResponseCardProperty(
        block: CfnBotImageResponseCardPropertyDsl.() -> Unit = {}
    ): CfnBot.ImageResponseCardProperty {
        val builder = CfnBotImageResponseCardPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration setting for a response sent to the user before Amazon Lex starts eliciting
     * slots.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-initialresponsesetting.html)
     */
    public inline fun cfnBotInitialResponseSettingProperty(
        block: CfnBotInitialResponseSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.InitialResponseSettingProperty {
        val builder = CfnBotInitialResponseSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A context that must be active for an intent to be selected by Amazon Lex.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * InputContextProperty inputContextProperty = InputContextProperty.builder()
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-inputcontext.html)
     */
    public inline fun cfnBotInputContextProperty(
        block: CfnBotInputContextPropertyDsl.() -> Unit = {}
    ): CfnBot.InputContextProperty {
        val builder = CfnBotInputContextPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides a statement the Amazon Lex conveys to the user when the intent is successfully
     * fulfilled.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotValueOverrideProperty slotValueOverrideProperty_;
     * IntentClosingSettingProperty intentClosingSettingProperty =
     * IntentClosingSettingProperty.builder()
     * .closingResponse(ResponseSpecificationProperty.builder()
     * .messageGroupsList(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build())
     * .conditional(ConditionalSpecificationProperty.builder()
     * .conditionalBranches(List.of(ConditionalBranchProperty.builder()
     * .condition(ConditionProperty.builder()
     * .expressionString("expressionString")
     * .build())
     * .name("name")
     * .nextStep(DialogStateProperty.builder()
     * .dialogAction(DialogActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .slotToElicit("slotToElicit")
     * .suppressNextMessage(false)
     * .build())
     * .intent(IntentOverrideProperty.builder()
     * .name("name")
     * .slots(List.of(SlotValueOverrideMapProperty.builder()
     * .slotName("slotName")
     * .slotValueOverride(SlotValueOverrideProperty.builder()
     * .shape("shape")
     * .value(SlotValueProperty.builder()
     * .interpretedValue("interpretedValue")
     * .build())
     * .values(List.of(slotValueOverrideProperty_))
     * .build())
     * .build()))
     * .build())
     * .sessionAttributes(List.of(SessionAttributeProperty.builder()
     * .key("key")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .build())
     * // the properties below are optional
     * .response(ResponseSpecificationProperty.builder()
     * .messageGroupsList(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build())
     * .build()))
     * .defaultBranch(DefaultConditionalBranchProperty.builder()
     * .nextStep(DialogStateProperty.builder()
     * .dialogAction(DialogActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .slotToElicit("slotToElicit")
     * .suppressNextMessage(false)
     * .build())
     * .intent(IntentOverrideProperty.builder()
     * .name("name")
     * .slots(List.of(SlotValueOverrideMapProperty.builder()
     * .slotName("slotName")
     * .slotValueOverride(SlotValueOverrideProperty.builder()
     * .shape("shape")
     * .value(SlotValueProperty.builder()
     * .interpretedValue("interpretedValue")
     * .build())
     * .values(List.of(slotValueOverrideProperty_))
     * .build())
     * .build()))
     * .build())
     * .sessionAttributes(List.of(SessionAttributeProperty.builder()
     * .key("key")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .build())
     * .response(ResponseSpecificationProperty.builder()
     * .messageGroupsList(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build())
     * .build())
     * .isActive(false)
     * .build())
     * .isActive(false)
     * .nextStep(DialogStateProperty.builder()
     * .dialogAction(DialogActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .slotToElicit("slotToElicit")
     * .suppressNextMessage(false)
     * .build())
     * .intent(IntentOverrideProperty.builder()
     * .name("name")
     * .slots(List.of(SlotValueOverrideMapProperty.builder()
     * .slotName("slotName")
     * .slotValueOverride(SlotValueOverrideProperty.builder()
     * .shape("shape")
     * .value(SlotValueProperty.builder()
     * .interpretedValue("interpretedValue")
     * .build())
     * .values(List.of(slotValueOverrideProperty_))
     * .build())
     * .build()))
     * .build())
     * .sessionAttributes(List.of(SessionAttributeProperty.builder()
     * .key("key")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentclosingsetting.html)
     */
    public inline fun cfnBotIntentClosingSettingProperty(
        block: CfnBotIntentClosingSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.IntentClosingSettingProperty {
        val builder = CfnBotIntentClosingSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides a prompt for making sure that the user is ready for the intent to be fulfilled.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html)
     */
    public inline fun cfnBotIntentConfirmationSettingProperty(
        block: CfnBotIntentConfirmationSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.IntentConfirmationSettingProperty {
        val builder = CfnBotIntentConfirmationSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Override settings to configure the intent state.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotValueOverrideProperty slotValueOverrideProperty_;
     * IntentOverrideProperty intentOverrideProperty = IntentOverrideProperty.builder()
     * .name("name")
     * .slots(List.of(SlotValueOverrideMapProperty.builder()
     * .slotName("slotName")
     * .slotValueOverride(SlotValueOverrideProperty.builder()
     * .shape("shape")
     * .value(SlotValueProperty.builder()
     * .interpretedValue("interpretedValue")
     * .build())
     * .values(List.of(slotValueOverrideProperty_))
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentoverride.html)
     */
    public inline fun cfnBotIntentOverrideProperty(
        block: CfnBotIntentOverridePropertyDsl.() -> Unit = {}
    ): CfnBot.IntentOverrideProperty {
        val builder = CfnBotIntentOverridePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents an action that the user wants to perform.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html)
     */
    public inline fun cfnBotIntentProperty(
        block: CfnBotIntentPropertyDsl.() -> Unit = {}
    ): CfnBot.IntentProperty {
        val builder = CfnBotIntentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides configuration information for the `AMAZON.KendraSearchIntent` intent. When you use
     * this intent, Amazon Lex searches the specified Amazon Kendra index and returns documents from
     * the index that match the user's utterance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * KendraConfigurationProperty kendraConfigurationProperty = KendraConfigurationProperty.builder()
     * .kendraIndex("kendraIndex")
     * // the properties below are optional
     * .queryFilterString("queryFilterString")
     * .queryFilterStringEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-kendraconfiguration.html)
     */
    public inline fun cfnBotKendraConfigurationProperty(
        block: CfnBotKendraConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBot.KendraConfigurationProperty {
        val builder = CfnBotKendraConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a Lambda function that verifies requests to a bot or fulfills the user's request to
     * a bot.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * LambdaCodeHookProperty lambdaCodeHookProperty = LambdaCodeHookProperty.builder()
     * .codeHookInterfaceVersion("codeHookInterfaceVersion")
     * .lambdaArn("lambdaArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-lambdacodehook.html)
     */
    public inline fun cfnBotLambdaCodeHookProperty(
        block: CfnBotLambdaCodeHookPropertyDsl.() -> Unit = {}
    ): CfnBot.LambdaCodeHookProperty {
        val builder = CfnBotLambdaCodeHookPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides one or more messages that Amazon Lex should send to the user.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * MessageGroupProperty messageGroupProperty = MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-messagegroup.html)
     */
    public inline fun cfnBotMessageGroupProperty(
        block: CfnBotMessageGroupPropertyDsl.() -> Unit = {}
    ): CfnBot.MessageGroupProperty {
        val builder = CfnBotMessageGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The object that provides message text and its type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * MessageProperty messageProperty = MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-message.html)
     */
    public inline fun cfnBotMessageProperty(
        block: CfnBotMessagePropertyDsl.() -> Unit = {}
    ): CfnBot.MessageProperty {
        val builder = CfnBotMessagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Indicates whether a slot can return multiple values.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * MultipleValuesSettingProperty multipleValuesSettingProperty =
     * MultipleValuesSettingProperty.builder()
     * .allowMultipleValues(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-multiplevaluessetting.html)
     */
    public inline fun cfnBotMultipleValuesSettingProperty(
        block: CfnBotMultipleValuesSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.MultipleValuesSettingProperty {
        val builder = CfnBotMultipleValuesSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines whether Amazon Lex obscures slot values in conversation logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * ObfuscationSettingProperty obfuscationSettingProperty = ObfuscationSettingProperty.builder()
     * .obfuscationSettingType("obfuscationSettingType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-obfuscationsetting.html)
     */
    public inline fun cfnBotObfuscationSettingProperty(
        block: CfnBotObfuscationSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.ObfuscationSettingProperty {
        val builder = CfnBotObfuscationSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a session context that is activated when an intent is fulfilled.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * OutputContextProperty outputContextProperty = OutputContextProperty.builder()
     * .name("name")
     * .timeToLiveInSeconds(123)
     * .turnsToLive(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-outputcontext.html)
     */
    public inline fun cfnBotOutputContextProperty(
        block: CfnBotOutputContextPropertyDsl.() -> Unit = {}
    ): CfnBot.OutputContextProperty {
        val builder = CfnBotOutputContextPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines an ASCII text message to send to the user.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * PlainTextMessageProperty plainTextMessageProperty = PlainTextMessageProperty.builder()
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-plaintextmessage.html)
     */
    public inline fun cfnBotPlainTextMessageProperty(
        block: CfnBotPlainTextMessagePropertyDsl.() -> Unit = {}
    ): CfnBot.PlainTextMessageProperty {
        val builder = CfnBotPlainTextMessagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies next steps to run after the dialog code hook finishes.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html)
     */
    public inline fun cfnBotPostDialogCodeHookInvocationSpecificationProperty(
        block: CfnBotPostDialogCodeHookInvocationSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.PostDialogCodeHookInvocationSpecificationProperty {
        val builder = CfnBotPostDialogCodeHookInvocationSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides a setting that determines whether the post-fulfillment response is sent to the user.
     *
     * For more information, see
     * [](https://docs.aws.amazon.com/lexv2/latest/dg/streaming-progress.html#progress-complete)
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html)
     */
    public inline fun cfnBotPostFulfillmentStatusSpecificationProperty(
        block: CfnBotPostFulfillmentStatusSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.PostFulfillmentStatusSpecificationProperty {
        val builder = CfnBotPostFulfillmentStatusSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the settings on a prompt attempt.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * PromptAttemptSpecificationProperty promptAttemptSpecificationProperty =
     * PromptAttemptSpecificationProperty.builder()
     * .allowedInputTypes(AllowedInputTypesProperty.builder()
     * .allowAudioInput(false)
     * .allowDtmfInput(false)
     * .build())
     * // the properties below are optional
     * .allowInterrupt(false)
     * .audioAndDtmfInputSpecification(AudioAndDTMFInputSpecificationProperty.builder()
     * .startTimeoutMs(123)
     * // the properties below are optional
     * .audioSpecification(AudioSpecificationProperty.builder()
     * .endTimeoutMs(123)
     * .maxLengthMs(123)
     * .build())
     * .dtmfSpecification(DTMFSpecificationProperty.builder()
     * .deletionCharacter("deletionCharacter")
     * .endCharacter("endCharacter")
     * .endTimeoutMs(123)
     * .maxLength(123)
     * .build())
     * .build())
     * .textInputSpecification(TextInputSpecificationProperty.builder()
     * .startTimeoutMs(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptattemptspecification.html)
     */
    public inline fun cfnBotPromptAttemptSpecificationProperty(
        block: CfnBotPromptAttemptSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.PromptAttemptSpecificationProperty {
        val builder = CfnBotPromptAttemptSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a list of message groups that Amazon Lex sends to a user to elicit a response.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * PromptSpecificationProperty promptSpecificationProperty = PromptSpecificationProperty.builder()
     * .maxRetries(123)
     * .messageGroupsList(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * // the properties below are optional
     * .allowInterrupt(false)
     * .messageSelectionStrategy("messageSelectionStrategy")
     * .promptAttemptsSpecification(Map.of(
     * "promptAttemptsSpecificationKey", PromptAttemptSpecificationProperty.builder()
     * .allowedInputTypes(AllowedInputTypesProperty.builder()
     * .allowAudioInput(false)
     * .allowDtmfInput(false)
     * .build())
     * // the properties below are optional
     * .allowInterrupt(false)
     * .audioAndDtmfInputSpecification(AudioAndDTMFInputSpecificationProperty.builder()
     * .startTimeoutMs(123)
     * // the properties below are optional
     * .audioSpecification(AudioSpecificationProperty.builder()
     * .endTimeoutMs(123)
     * .maxLengthMs(123)
     * .build())
     * .dtmfSpecification(DTMFSpecificationProperty.builder()
     * .deletionCharacter("deletionCharacter")
     * .endCharacter("endCharacter")
     * .endTimeoutMs(123)
     * .maxLength(123)
     * .build())
     * .build())
     * .textInputSpecification(TextInputSpecificationProperty.builder()
     * .startTimeoutMs(123)
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptspecification.html)
     */
    public inline fun cfnBotPromptSpecificationProperty(
        block: CfnBotPromptSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.PromptSpecificationProperty {
        val builder = CfnBotPromptSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBot`.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html)
     */
    public inline fun cfnBotProps(block: CfnBotPropsDsl.() -> Unit = {}): CfnBotProps {
        val builder = CfnBotPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a list of message groups that Amazon Lex uses to respond the user input.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * ResponseSpecificationProperty responseSpecificationProperty =
     * ResponseSpecificationProperty.builder()
     * .messageGroupsList(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-responsespecification.html)
     */
    public inline fun cfnBotResponseSpecificationProperty(
        block: CfnBotResponseSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.ResponseSpecificationProperty {
        val builder = CfnBotResponseSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Amazon S3 bucket for logging audio conversations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * S3BucketLogDestinationProperty s3BucketLogDestinationProperty =
     * S3BucketLogDestinationProperty.builder()
     * .logPrefix("logPrefix")
     * .s3BucketArn("s3BucketArn")
     * // the properties below are optional
     * .kmsKeyArn("kmsKeyArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3bucketlogdestination.html)
     */
    public inline fun cfnBotS3BucketLogDestinationProperty(
        block: CfnBotS3BucketLogDestinationPropertyDsl.() -> Unit = {}
    ): CfnBot.S3BucketLogDestinationProperty {
        val builder = CfnBotS3BucketLogDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines an Amazon S3 bucket location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .s3Bucket("s3Bucket")
     * .s3ObjectKey("s3ObjectKey")
     * // the properties below are optional
     * .s3ObjectVersion("s3ObjectVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3location.html)
     */
    public inline fun cfnBotS3LocationProperty(
        block: CfnBotS3LocationPropertyDsl.() -> Unit = {}
    ): CfnBot.S3LocationProperty {
        val builder = CfnBotS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a Speech Synthesis Markup Language (SSML) prompt.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SSMLMessageProperty sSMLMessageProperty = SSMLMessageProperty.builder()
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-ssmlmessage.html)
     */
    public inline fun cfnBotSSMLMessageProperty(
        block: CfnBotSSMLMessagePropertyDsl.() -> Unit = {}
    ): CfnBot.SSMLMessageProperty {
        val builder = CfnBotSSMLMessagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A sample utterance that invokes an intent or respond to a slot elicitation prompt.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SampleUtteranceProperty sampleUtteranceProperty = SampleUtteranceProperty.builder()
     * .utterance("utterance")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sampleutterance.html)
     */
    public inline fun cfnBotSampleUtteranceProperty(
        block: CfnBotSampleUtterancePropertyDsl.() -> Unit = {}
    ): CfnBot.SampleUtteranceProperty {
        val builder = CfnBotSampleUtterancePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines one of the values for a slot type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SampleValueProperty sampleValueProperty = SampleValueProperty.builder()
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-samplevalue.html)
     */
    public inline fun cfnBotSampleValueProperty(
        block: CfnBotSampleValuePropertyDsl.() -> Unit = {}
    ): CfnBot.SampleValueProperty {
        val builder = CfnBotSampleValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user
     * utterances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SentimentAnalysisSettingsProperty sentimentAnalysisSettingsProperty =
     * SentimentAnalysisSettingsProperty.builder()
     * .detectSentiment(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sentimentanalysissettings.html)
     */
    public inline fun cfnBotSentimentAnalysisSettingsProperty(
        block: CfnBotSentimentAnalysisSettingsPropertyDsl.() -> Unit = {}
    ): CfnBot.SentimentAnalysisSettingsProperty {
        val builder = CfnBotSentimentAnalysisSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A key/value pair representing session-specific context information.
     *
     * It contains application information passed between Amazon Lex V2 and a client application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SessionAttributeProperty sessionAttributeProperty = SessionAttributeProperty.builder()
     * .key("key")
     * // the properties below are optional
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sessionattribute.html)
     */
    public inline fun cfnBotSessionAttributeProperty(
        block: CfnBotSessionAttributePropertyDsl.() -> Unit = {}
    ): CfnBot.SessionAttributeProperty {
        val builder = CfnBotSessionAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings used when Amazon Lex successfully captures a slot value from a user.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html)
     */
    public inline fun cfnBotSlotCaptureSettingProperty(
        block: CfnBotSlotCaptureSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.SlotCaptureSettingProperty {
        val builder = CfnBotSlotCaptureSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the default value to use when a user doesn't provide a value for a slot.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotDefaultValueProperty slotDefaultValueProperty = SlotDefaultValueProperty.builder()
     * .defaultValue("defaultValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotdefaultvalue.html)
     */
    public inline fun cfnBotSlotDefaultValueProperty(
        block: CfnBotSlotDefaultValuePropertyDsl.() -> Unit = {}
    ): CfnBot.SlotDefaultValueProperty {
        val builder = CfnBotSlotDefaultValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The default value to use when a user doesn't provide a value for a slot.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotDefaultValueSpecificationProperty slotDefaultValueSpecificationProperty =
     * SlotDefaultValueSpecificationProperty.builder()
     * .defaultValueList(List.of(SlotDefaultValueProperty.builder()
     * .defaultValue("defaultValue")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotdefaultvaluespecification.html)
     */
    public inline fun cfnBotSlotDefaultValueSpecificationProperty(
        block: CfnBotSlotDefaultValueSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.SlotDefaultValueSpecificationProperty {
        val builder = CfnBotSlotDefaultValueSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Sets the priority that Amazon Lex should use when eliciting slot values from a user.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotPriorityProperty slotPriorityProperty = SlotPriorityProperty.builder()
     * .priority(123)
     * .slotName("slotName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotpriority.html)
     */
    public inline fun cfnBotSlotPriorityProperty(
        block: CfnBotSlotPriorityPropertyDsl.() -> Unit = {}
    ): CfnBot.SlotPriorityProperty {
        val builder = CfnBotSlotPriorityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the definition of a slot.
     *
     * Amazon Lex elicits slot values from uses to fulfill the user's intent.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slot.html)
     */
    public inline fun cfnBotSlotProperty(
        block: CfnBotSlotPropertyDsl.() -> Unit = {}
    ): CfnBot.SlotProperty {
        val builder = CfnBotSlotPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a slot type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotTypeProperty slotTypeProperty = SlotTypeProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .externalSourceSetting(ExternalSourceSettingProperty.builder()
     * .grammarSlotTypeSetting(GrammarSlotTypeSettingProperty.builder()
     * .source(GrammarSlotTypeSourceProperty.builder()
     * .s3BucketName("s3BucketName")
     * .s3ObjectKey("s3ObjectKey")
     * // the properties below are optional
     * .kmsKeyArn("kmsKeyArn")
     * .build())
     * .build())
     * .build())
     * .parentSlotTypeSignature("parentSlotTypeSignature")
     * .slotTypeValues(List.of(SlotTypeValueProperty.builder()
     * .sampleValue(SampleValueProperty.builder()
     * .value("value")
     * .build())
     * // the properties below are optional
     * .synonyms(List.of(SampleValueProperty.builder()
     * .value("value")
     * .build()))
     * .build()))
     * .valueSelectionSetting(SlotValueSelectionSettingProperty.builder()
     * .resolutionStrategy("resolutionStrategy")
     * // the properties below are optional
     * .advancedRecognitionSetting(AdvancedRecognitionSettingProperty.builder()
     * .audioRecognitionStrategy("audioRecognitionStrategy")
     * .build())
     * .regexFilter(SlotValueRegexFilterProperty.builder()
     * .pattern("pattern")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottype.html)
     */
    public inline fun cfnBotSlotTypeProperty(
        block: CfnBotSlotTypePropertyDsl.() -> Unit = {}
    ): CfnBot.SlotTypeProperty {
        val builder = CfnBotSlotTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Each slot type can have a set of values.
     *
     * Each `SlotTypeValue` represents a value that the slot type can take.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotTypeValueProperty slotTypeValueProperty = SlotTypeValueProperty.builder()
     * .sampleValue(SampleValueProperty.builder()
     * .value("value")
     * .build())
     * // the properties below are optional
     * .synonyms(List.of(SampleValueProperty.builder()
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottypevalue.html)
     */
    public inline fun cfnBotSlotTypeValueProperty(
        block: CfnBotSlotTypeValuePropertyDsl.() -> Unit = {}
    ): CfnBot.SlotTypeValueProperty {
        val builder = CfnBotSlotTypeValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the elicitation setting details eliciting a slot.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueelicitationsetting.html)
     */
    public inline fun cfnBotSlotValueElicitationSettingProperty(
        block: CfnBotSlotValueElicitationSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.SlotValueElicitationSettingProperty {
        val builder = CfnBotSlotValueElicitationSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Maps a slot name to the
     * [SlotValueOverride](https://docs.aws.amazon.com/lexv2/latest/APIReference/API_SlotValueOverride.html)
     * object.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotValueOverrideProperty slotValueOverrideProperty_;
     * SlotValueOverrideMapProperty slotValueOverrideMapProperty =
     * SlotValueOverrideMapProperty.builder()
     * .slotName("slotName")
     * .slotValueOverride(SlotValueOverrideProperty.builder()
     * .shape("shape")
     * .value(SlotValueProperty.builder()
     * .interpretedValue("interpretedValue")
     * .build())
     * .values(List.of(slotValueOverrideProperty_))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueoverridemap.html)
     */
    public inline fun cfnBotSlotValueOverrideMapProperty(
        block: CfnBotSlotValueOverrideMapPropertyDsl.() -> Unit = {}
    ): CfnBot.SlotValueOverrideMapProperty {
        val builder = CfnBotSlotValueOverrideMapPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The slot values that Amazon Lex uses when it sets slot values in a dialog step.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotValueOverrideProperty slotValueOverrideProperty_;
     * SlotValueOverrideProperty slotValueOverrideProperty = SlotValueOverrideProperty.builder()
     * .shape("shape")
     * .value(SlotValueProperty.builder()
     * .interpretedValue("interpretedValue")
     * .build())
     * .values(List.of(slotValueOverrideProperty_))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueoverride.html)
     */
    public inline fun cfnBotSlotValueOverrideProperty(
        block: CfnBotSlotValueOverridePropertyDsl.() -> Unit = {}
    ): CfnBot.SlotValueOverrideProperty {
        val builder = CfnBotSlotValueOverridePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The value to set in a slot.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotValueProperty slotValueProperty = SlotValueProperty.builder()
     * .interpretedValue("interpretedValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalue.html)
     */
    public inline fun cfnBotSlotValueProperty(
        block: CfnBotSlotValuePropertyDsl.() -> Unit = {}
    ): CfnBot.SlotValueProperty {
        val builder = CfnBotSlotValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides a regular expression used to validate the value of a slot.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotValueRegexFilterProperty slotValueRegexFilterProperty =
     * SlotValueRegexFilterProperty.builder()
     * .pattern("pattern")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueregexfilter.html)
     */
    public inline fun cfnBotSlotValueRegexFilterProperty(
        block: CfnBotSlotValueRegexFilterPropertyDsl.() -> Unit = {}
    ): CfnBot.SlotValueRegexFilterProperty {
        val builder = CfnBotSlotValueRegexFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains settings used by Amazon Lex to select a slot value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * SlotValueSelectionSettingProperty slotValueSelectionSettingProperty =
     * SlotValueSelectionSettingProperty.builder()
     * .resolutionStrategy("resolutionStrategy")
     * // the properties below are optional
     * .advancedRecognitionSetting(AdvancedRecognitionSettingProperty.builder()
     * .audioRecognitionStrategy("audioRecognitionStrategy")
     * .build())
     * .regexFilter(SlotValueRegexFilterProperty.builder()
     * .pattern("pattern")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueselectionsetting.html)
     */
    public inline fun cfnBotSlotValueSelectionSettingProperty(
        block: CfnBotSlotValueSelectionSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.SlotValueSelectionSettingProperty {
        val builder = CfnBotSlotValueSelectionSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the messages that Amazon Lex sends to a user to remind them that the bot is waiting
     * for a response.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * StillWaitingResponseSpecificationProperty stillWaitingResponseSpecificationProperty =
     * StillWaitingResponseSpecificationProperty.builder()
     * .frequencyInSeconds(123)
     * .messageGroupsList(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * .timeoutInSeconds(123)
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-stillwaitingresponsespecification.html)
     */
    public inline fun cfnBotStillWaitingResponseSpecificationProperty(
        block: CfnBotStillWaitingResponseSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.StillWaitingResponseSpecificationProperty {
        val builder = CfnBotStillWaitingResponseSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies configuration settings for the alias used to test the bot.
     *
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
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
    public inline fun cfnBotTestBotAliasSettingsProperty(
        block: CfnBotTestBotAliasSettingsPropertyDsl.() -> Unit = {}
    ): CfnBot.TestBotAliasSettingsProperty {
        val builder = CfnBotTestBotAliasSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the text input specifications.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * TextInputSpecificationProperty textInputSpecificationProperty =
     * TextInputSpecificationProperty.builder()
     * .startTimeoutMs(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textinputspecification.html)
     */
    public inline fun cfnBotTextInputSpecificationProperty(
        block: CfnBotTextInputSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.TextInputSpecificationProperty {
        val builder = CfnBotTextInputSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the Amazon CloudWatch Logs destination log group for conversation text logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * TextLogDestinationProperty textLogDestinationProperty = TextLogDestinationProperty.builder()
     * .cloudWatch(CloudWatchLogGroupLogDestinationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .logPrefix("logPrefix")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textlogdestination.html)
     */
    public inline fun cfnBotTextLogDestinationProperty(
        block: CfnBotTextLogDestinationPropertyDsl.() -> Unit = {}
    ): CfnBot.TextLogDestinationProperty {
        val builder = CfnBotTextLogDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines settings to enable text conversation logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textlogsetting.html)
     */
    public inline fun cfnBotTextLogSettingProperty(
        block: CfnBotTextLogSettingPropertyDsl.() -> Unit = {}
    ): CfnBot.TextLogSettingProperty {
        val builder = CfnBotTextLogSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Amazon Lex V2 is the only supported version in AWS CloudFormation .
     *
     * Specifies a new version of the bot based on the `DRAFT` version. If the `DRAFT` version of
     * this resource hasn't changed since you created the last version, Amazon Lex doesn't create a
     * new version, it returns the last created version.
     *
     * When you specify the first version of a bot, Amazon Lex sets the version to 1. Subsequent
     * versions increment by 1.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * CfnBotVersion cfnBotVersion = CfnBotVersion.Builder.create(this, "MyCfnBotVersion")
     * .botId("botId")
     * .botVersionLocaleSpecification(List.of(BotVersionLocaleSpecificationProperty.builder()
     * .botVersionLocaleDetails(BotVersionLocaleDetailsProperty.builder()
     * .sourceBotVersion("sourceBotVersion")
     * .build())
     * .localeId("localeId")
     * .build()))
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html)
     */
    public inline fun cfnBotVersion(
        scope: Construct,
        id: String,
        block: CfnBotVersionDsl.() -> Unit = {},
    ): CfnBotVersion {
        val builder = CfnBotVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The version of a bot used for a bot locale.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * BotVersionLocaleDetailsProperty botVersionLocaleDetailsProperty =
     * BotVersionLocaleDetailsProperty.builder()
     * .sourceBotVersion("sourceBotVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botversion-botversionlocaledetails.html)
     */
    public inline fun cfnBotVersionBotVersionLocaleDetailsProperty(
        block: CfnBotVersionBotVersionLocaleDetailsPropertyDsl.() -> Unit = {}
    ): CfnBotVersion.BotVersionLocaleDetailsProperty {
        val builder = CfnBotVersionBotVersionLocaleDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the locale that Amazon Lex adds to this version.
     *
     * You can choose the Draft version or any other previously published version for each locale.
     * When you specify a source version, the locale data is copied from the source version to the
     * new version.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * BotVersionLocaleSpecificationProperty botVersionLocaleSpecificationProperty =
     * BotVersionLocaleSpecificationProperty.builder()
     * .botVersionLocaleDetails(BotVersionLocaleDetailsProperty.builder()
     * .sourceBotVersion("sourceBotVersion")
     * .build())
     * .localeId("localeId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botversion-botversionlocalespecification.html)
     */
    public inline fun cfnBotVersionBotVersionLocaleSpecificationProperty(
        block: CfnBotVersionBotVersionLocaleSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBotVersion.BotVersionLocaleSpecificationProperty {
        val builder = CfnBotVersionBotVersionLocaleSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBotVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * CfnBotVersionProps cfnBotVersionProps = CfnBotVersionProps.builder()
     * .botId("botId")
     * .botVersionLocaleSpecification(List.of(BotVersionLocaleSpecificationProperty.builder()
     * .botVersionLocaleDetails(BotVersionLocaleDetailsProperty.builder()
     * .sourceBotVersion("sourceBotVersion")
     * .build())
     * .localeId("localeId")
     * .build()))
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html)
     */
    public inline fun cfnBotVersionProps(
        block: CfnBotVersionPropsDsl.() -> Unit = {}
    ): CfnBotVersionProps {
        val builder = CfnBotVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines settings for using an Amazon Polly voice to communicate with a user.
     *
     * Example:
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
    public inline fun cfnBotVoiceSettingsProperty(
        block: CfnBotVoiceSettingsPropertyDsl.() -> Unit = {}
    ): CfnBot.VoiceSettingsProperty {
        val builder = CfnBotVoiceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the prompts that Amazon Lex uses while a bot is waiting for customer input.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * WaitAndContinueSpecificationProperty waitAndContinueSpecificationProperty =
     * WaitAndContinueSpecificationProperty.builder()
     * .continueResponse(ResponseSpecificationProperty.builder()
     * .messageGroupsList(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build())
     * .waitingResponse(ResponseSpecificationProperty.builder()
     * .messageGroupsList(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build())
     * // the properties below are optional
     * .isActive(false)
     * .stillWaitingResponse(StillWaitingResponseSpecificationProperty.builder()
     * .frequencyInSeconds(123)
     * .messageGroupsList(List.of(MessageGroupProperty.builder()
     * .message(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build())
     * // the properties below are optional
     * .variations(List.of(MessageProperty.builder()
     * .customPayload(CustomPayloadProperty.builder()
     * .value("value")
     * .build())
     * .imageResponseCard(ImageResponseCardProperty.builder()
     * .title("title")
     * // the properties below are optional
     * .buttons(List.of(ButtonProperty.builder()
     * .text("text")
     * .value("value")
     * .build()))
     * .imageUrl("imageUrl")
     * .subtitle("subtitle")
     * .build())
     * .plainTextMessage(PlainTextMessageProperty.builder()
     * .value("value")
     * .build())
     * .ssmlMessage(SSMLMessageProperty.builder()
     * .value("value")
     * .build())
     * .build()))
     * .build()))
     * .timeoutInSeconds(123)
     * // the properties below are optional
     * .allowInterrupt(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-waitandcontinuespecification.html)
     */
    public inline fun cfnBotWaitAndContinueSpecificationProperty(
        block: CfnBotWaitAndContinueSpecificationPropertyDsl.() -> Unit = {}
    ): CfnBot.WaitAndContinueSpecificationProperty {
        val builder = CfnBotWaitAndContinueSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Amazon Lex V2 is the only supported version in AWS CloudFormation .
     *
     * Specifies a new resource policy with the specified policy statements.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * Object policy;
     * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
     * "MyCfnResourcePolicy")
     * .policy(policy)
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-resourcepolicy.html)
     */
    public inline fun cfnResourcePolicy(
        scope: Construct,
        id: String,
        block: CfnResourcePolicyDsl.() -> Unit = {},
    ): CfnResourcePolicy {
        val builder = CfnResourcePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A resource policy to add to the resource.
     *
     * The policy is a JSON structure following the IAM syntax that contains one or more statements
     * that define the policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * PolicyProperty policyProperty = PolicyProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-resourcepolicy-policy.html)
     */
    public inline fun cfnResourcePolicyPolicyProperty(
        block: CfnResourcePolicyPolicyPropertyDsl.() -> Unit = {}
    ): CfnResourcePolicy.PolicyProperty {
        val builder = CfnResourcePolicyPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourcePolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lex.*;
     * Object policy;
     * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
     * .policy(policy)
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-resourcepolicy.html)
     */
    public inline fun cfnResourcePolicyProps(
        block: CfnResourcePolicyPropsDsl.() -> Unit = {}
    ): CfnResourcePolicyProps {
        val builder = CfnResourcePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
