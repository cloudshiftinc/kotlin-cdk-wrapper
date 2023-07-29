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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBotAlias

/**
 * Configures conversation logging that saves audio, text, and metadata for the conversations with
 * your users.
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
@CdkDslMarker
public class CfnBotAliasConversationLogSettingsPropertyDsl {
    private val cdkBuilder: CfnBotAlias.ConversationLogSettingsProperty.Builder =
        CfnBotAlias.ConversationLogSettingsProperty.builder()

    private val _audioLogSettings: MutableList<Any> = mutableListOf()

    private val _textLogSettings: MutableList<Any> = mutableListOf()

    /** @param audioLogSettings The Amazon S3 settings for logging audio to an S3 bucket. */
    public fun audioLogSettings(vararg audioLogSettings: Any) {
        _audioLogSettings.addAll(listOf(*audioLogSettings))
    }

    /** @param audioLogSettings The Amazon S3 settings for logging audio to an S3 bucket. */
    public fun audioLogSettings(audioLogSettings: Collection<Any>) {
        _audioLogSettings.addAll(audioLogSettings)
    }

    /** @param audioLogSettings The Amazon S3 settings for logging audio to an S3 bucket. */
    public fun audioLogSettings(audioLogSettings: IResolvable) {
        cdkBuilder.audioLogSettings(audioLogSettings)
    }

    /** @param textLogSettings The Amazon CloudWatch Logs settings for logging text and metadata. */
    public fun textLogSettings(vararg textLogSettings: Any) {
        _textLogSettings.addAll(listOf(*textLogSettings))
    }

    /** @param textLogSettings The Amazon CloudWatch Logs settings for logging text and metadata. */
    public fun textLogSettings(textLogSettings: Collection<Any>) {
        _textLogSettings.addAll(textLogSettings)
    }

    /** @param textLogSettings The Amazon CloudWatch Logs settings for logging text and metadata. */
    public fun textLogSettings(textLogSettings: IResolvable) {
        cdkBuilder.textLogSettings(textLogSettings)
    }

    public fun build(): CfnBotAlias.ConversationLogSettingsProperty {
        if (_audioLogSettings.isNotEmpty()) cdkBuilder.audioLogSettings(_audioLogSettings)
        if (_textLogSettings.isNotEmpty()) cdkBuilder.textLogSettings(_textLogSettings)
        return cdkBuilder.build()
    }
}
