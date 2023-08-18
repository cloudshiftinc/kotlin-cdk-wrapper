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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot
import software.constructs.Construct

/**
 * Amazon Lex V2 is the only supported version in AWS CloudFormation .
 *
 * Specifies an Amazon Lex conversational bot.
 *
 * You must configure an intent based on the `AMAZON.FallbackIntent` built-in intent. If you don't
 * add one, creating the bot will fail.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html)
 */
@CdkDslMarker
public class CfnBotDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBot.Builder = CfnBot.Builder.create(scope, id)

    private val _botLocales: MutableList<Any> = mutableListOf()

    private val _botTags: MutableList<Any> = mutableListOf()

    private val _testBotAliasTags: MutableList<Any> = mutableListOf()

    /**
     * Indicates whether Amazon Lex V2 should automatically build the locales for the bot after a
     * change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-autobuildbotlocales)
     *
     * @param autoBuildBotLocales Indicates whether Amazon Lex V2 should automatically build the
     *   locales for the bot after a change.
     */
    public fun autoBuildBotLocales(autoBuildBotLocales: Boolean) {
        cdkBuilder.autoBuildBotLocales(autoBuildBotLocales)
    }

    /**
     * Indicates whether Amazon Lex V2 should automatically build the locales for the bot after a
     * change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-autobuildbotlocales)
     *
     * @param autoBuildBotLocales Indicates whether Amazon Lex V2 should automatically build the
     *   locales for the bot after a change.
     */
    public fun autoBuildBotLocales(autoBuildBotLocales: IResolvable) {
        cdkBuilder.autoBuildBotLocales(autoBuildBotLocales)
    }

    /**
     * The Amazon S3 location of files used to import a bot.
     *
     * The files must be in the import format specified in
     * [JSON format for importing and exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html)
     * in the *Amazon Lex developer guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botfiles3location)
     *
     * @param botFileS3Location The Amazon S3 location of files used to import a bot.
     */
    public fun botFileS3Location(botFileS3Location: IResolvable) {
        cdkBuilder.botFileS3Location(botFileS3Location)
    }

    /**
     * The Amazon S3 location of files used to import a bot.
     *
     * The files must be in the import format specified in
     * [JSON format for importing and exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html)
     * in the *Amazon Lex developer guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botfiles3location)
     *
     * @param botFileS3Location The Amazon S3 location of files used to import a bot.
     */
    public fun botFileS3Location(botFileS3Location: CfnBot.S3LocationProperty) {
        cdkBuilder.botFileS3Location(botFileS3Location)
    }

    /**
     * A list of locales for the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botlocales)
     *
     * @param botLocales A list of locales for the bot.
     */
    public fun botLocales(vararg botLocales: Any) {
        _botLocales.addAll(listOf(*botLocales))
    }

    /**
     * A list of locales for the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botlocales)
     *
     * @param botLocales A list of locales for the bot.
     */
    public fun botLocales(botLocales: Collection<Any>) {
        _botLocales.addAll(botLocales)
    }

    /**
     * A list of locales for the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botlocales)
     *
     * @param botLocales A list of locales for the bot.
     */
    public fun botLocales(botLocales: IResolvable) {
        cdkBuilder.botLocales(botLocales)
    }

    /**
     * A list of tags to add to the bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-bottags)
     *
     * @param botTags A list of tags to add to the bot.
     */
    public fun botTags(vararg botTags: Any) {
        _botTags.addAll(listOf(*botTags))
    }

    /**
     * A list of tags to add to the bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-bottags)
     *
     * @param botTags A list of tags to add to the bot.
     */
    public fun botTags(botTags: Collection<Any>) {
        _botTags.addAll(botTags)
    }

    /**
     * A list of tags to add to the bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-bottags)
     *
     * @param botTags A list of tags to add to the bot.
     */
    public fun botTags(botTags: IResolvable) {
        cdkBuilder.botTags(botTags)
    }

    /**
     * By default, data stored by Amazon Lex is encrypted.
     *
     * The `DataPrivacy` structure provides settings that determine how Amazon Lex handles special
     * cases of securing the data for your bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-dataprivacy)
     *
     * @param dataPrivacy By default, data stored by Amazon Lex is encrypted.
     */
    public fun dataPrivacy(dataPrivacy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(dataPrivacy)
        cdkBuilder.dataPrivacy(builder.map)
    }

    /**
     * By default, data stored by Amazon Lex is encrypted.
     *
     * The `DataPrivacy` structure provides settings that determine how Amazon Lex handles special
     * cases of securing the data for your bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-dataprivacy)
     *
     * @param dataPrivacy By default, data stored by Amazon Lex is encrypted.
     */
    public fun dataPrivacy(dataPrivacy: Any) {
        cdkBuilder.dataPrivacy(dataPrivacy)
    }

    /**
     * The description of the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-description)
     *
     * @param description The description of the version.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The time, in seconds, that Amazon Lex should keep information about a user's conversation
     * with the bot.
     *
     * A user interaction remains active for the amount of time specified. If no conversation occurs
     * during this time, the session expires and Amazon Lex deletes any data provided before the
     * timeout.
     *
     * You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-idlesessionttlinseconds)
     *
     * @param idleSessionTtlInSeconds The time, in seconds, that Amazon Lex should keep information
     *   about a user's conversation with the bot.
     */
    public fun idleSessionTtlInSeconds(idleSessionTtlInSeconds: Number) {
        cdkBuilder.idleSessionTtlInSeconds(idleSessionTtlInSeconds)
    }

    /**
     * The name of the bot locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-name)
     *
     * @param name The name of the bot locale.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * Specifies configuration settings for the alias used to test the bot.
     *
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliassettings)
     *
     * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
     *   bot.
     */
    public fun testBotAliasSettings(testBotAliasSettings: IResolvable) {
        cdkBuilder.testBotAliasSettings(testBotAliasSettings)
    }

    /**
     * Specifies configuration settings for the alias used to test the bot.
     *
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliassettings)
     *
     * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
     *   bot.
     */
    public fun testBotAliasSettings(testBotAliasSettings: CfnBot.TestBotAliasSettingsProperty) {
        cdkBuilder.testBotAliasSettings(testBotAliasSettings)
    }

    /**
     * A list of tags to add to the test alias for a bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliastags)
     *
     * @param testBotAliasTags A list of tags to add to the test alias for a bot.
     */
    public fun testBotAliasTags(vararg testBotAliasTags: Any) {
        _testBotAliasTags.addAll(listOf(*testBotAliasTags))
    }

    /**
     * A list of tags to add to the test alias for a bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliastags)
     *
     * @param testBotAliasTags A list of tags to add to the test alias for a bot.
     */
    public fun testBotAliasTags(testBotAliasTags: Collection<Any>) {
        _testBotAliasTags.addAll(testBotAliasTags)
    }

    /**
     * A list of tags to add to the test alias for a bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliastags)
     *
     * @param testBotAliasTags A list of tags to add to the test alias for a bot.
     */
    public fun testBotAliasTags(testBotAliasTags: IResolvable) {
        cdkBuilder.testBotAliasTags(testBotAliasTags)
    }

    public fun build(): CfnBot {
        if (_botLocales.isNotEmpty()) cdkBuilder.botLocales(_botLocales)
        if (_botTags.isNotEmpty()) cdkBuilder.botTags(_botTags)
        if (_testBotAliasTags.isNotEmpty()) cdkBuilder.testBotAliasTags(_testBotAliasTags)
        return cdkBuilder.build()
    }
}
