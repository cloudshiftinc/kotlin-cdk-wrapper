@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot
import software.amazon.awscdk.services.lex.CfnBotProps

/**
 * Properties for defining a `CfnBot`.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html)
 */
@CdkDslMarker
public class CfnBotPropsDsl {
  private val cdkBuilder: CfnBotProps.Builder = CfnBotProps.builder()

  private val _botLocales: MutableList<Any> = mutableListOf()

  private val _botTags: MutableList<Any> = mutableListOf()

  private val _testBotAliasTags: MutableList<Any> = mutableListOf()

  /**
   * @param autoBuildBotLocales Indicates whether Amazon Lex V2 should automatically build the
   * locales for the bot after a change.
   */
  public fun autoBuildBotLocales(autoBuildBotLocales: Boolean) {
    cdkBuilder.autoBuildBotLocales(autoBuildBotLocales)
  }

  /**
   * @param autoBuildBotLocales Indicates whether Amazon Lex V2 should automatically build the
   * locales for the bot after a change.
   */
  public fun autoBuildBotLocales(autoBuildBotLocales: IResolvable) {
    cdkBuilder.autoBuildBotLocales(autoBuildBotLocales)
  }

  /**
   * @param botFileS3Location The Amazon S3 location of files used to import a bot.
   * The files must be in the import format specified in [JSON format for importing and
   * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
   * Lex developer guide.*
   */
  public fun botFileS3Location(botFileS3Location: IResolvable) {
    cdkBuilder.botFileS3Location(botFileS3Location)
  }

  /**
   * @param botFileS3Location The Amazon S3 location of files used to import a bot.
   * The files must be in the import format specified in [JSON format for importing and
   * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
   * Lex developer guide.*
   */
  public fun botFileS3Location(botFileS3Location: CfnBot.S3LocationProperty) {
    cdkBuilder.botFileS3Location(botFileS3Location)
  }

  /**
   * @param botLocales A list of locales for the bot.
   */
  public fun botLocales(vararg botLocales: Any) {
    _botLocales.addAll(listOf(*botLocales))
  }

  /**
   * @param botLocales A list of locales for the bot.
   */
  public fun botLocales(botLocales: Collection<Any>) {
    _botLocales.addAll(botLocales)
  }

  /**
   * @param botLocales A list of locales for the bot.
   */
  public fun botLocales(botLocales: IResolvable) {
    cdkBuilder.botLocales(botLocales)
  }

  /**
   * @param botTags A list of tags to add to the bot.
   * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to update
   * tags. To update tags, use the `TagResource` operation.
   */
  public fun botTags(vararg botTags: Any) {
    _botTags.addAll(listOf(*botTags))
  }

  /**
   * @param botTags A list of tags to add to the bot.
   * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to update
   * tags. To update tags, use the `TagResource` operation.
   */
  public fun botTags(botTags: Collection<Any>) {
    _botTags.addAll(botTags)
  }

  /**
   * @param botTags A list of tags to add to the bot.
   * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to update
   * tags. To update tags, use the `TagResource` operation.
   */
  public fun botTags(botTags: IResolvable) {
    cdkBuilder.botTags(botTags)
  }

  /**
   * @param dataPrivacy By default, data stored by Amazon Lex is encrypted. 
   * The `DataPrivacy` structure provides settings that determine how Amazon Lex handles special
   * cases of securing the data for your bot.
   */
  public fun dataPrivacy(dataPrivacy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(dataPrivacy)
    cdkBuilder.dataPrivacy(builder.map)
  }

  /**
   * @param dataPrivacy By default, data stored by Amazon Lex is encrypted. 
   * The `DataPrivacy` structure provides settings that determine how Amazon Lex handles special
   * cases of securing the data for your bot.
   */
  public fun dataPrivacy(dataPrivacy: Any) {
    cdkBuilder.dataPrivacy(dataPrivacy)
  }

  /**
   * @param description The description of the version.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param idleSessionTtlInSeconds The time, in seconds, that Amazon Lex should keep information
   * about a user's conversation with the bot. 
   * A user interaction remains active for the amount of time specified. If no conversation occurs
   * during this time, the session expires and Amazon Lex deletes any data provided before the timeout.
   *
   * You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
   */
  public fun idleSessionTtlInSeconds(idleSessionTtlInSeconds: Number) {
    cdkBuilder.idleSessionTtlInSeconds(idleSessionTtlInSeconds)
  }

  /**
   * @param name The name of the bot locale. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of the IAM role used to build and run the bot. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
   * bot.
   * If the `TestBotAliasSettings` property is not specified, the settings are configured with
   * default values.
   */
  public fun testBotAliasSettings(testBotAliasSettings: IResolvable) {
    cdkBuilder.testBotAliasSettings(testBotAliasSettings)
  }

  /**
   * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
   * bot.
   * If the `TestBotAliasSettings` property is not specified, the settings are configured with
   * default values.
   */
  public fun testBotAliasSettings(testBotAliasSettings: CfnBot.TestBotAliasSettingsProperty) {
    cdkBuilder.testBotAliasSettings(testBotAliasSettings)
  }

  /**
   * @param testBotAliasTags A list of tags to add to the test alias for a bot.
   * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
   * update tags. To update tags on the test alias, use the `TagResource` operation.
   */
  public fun testBotAliasTags(vararg testBotAliasTags: Any) {
    _testBotAliasTags.addAll(listOf(*testBotAliasTags))
  }

  /**
   * @param testBotAliasTags A list of tags to add to the test alias for a bot.
   * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
   * update tags. To update tags on the test alias, use the `TagResource` operation.
   */
  public fun testBotAliasTags(testBotAliasTags: Collection<Any>) {
    _testBotAliasTags.addAll(testBotAliasTags)
  }

  /**
   * @param testBotAliasTags A list of tags to add to the test alias for a bot.
   * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
   * update tags. To update tags on the test alias, use the `TagResource` operation.
   */
  public fun testBotAliasTags(testBotAliasTags: IResolvable) {
    cdkBuilder.testBotAliasTags(testBotAliasTags)
  }

  public fun build(): CfnBotProps {
    if(_botLocales.isNotEmpty()) cdkBuilder.botLocales(_botLocales)
    if(_botTags.isNotEmpty()) cdkBuilder.botTags(_botTags)
    if(_testBotAliasTags.isNotEmpty()) cdkBuilder.testBotAliasTags(_testBotAliasTags)
    return cdkBuilder.build()
  }
}
