@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lex

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

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
public interface CfnBotProps {
  /**
   * Indicates whether Amazon Lex V2 should automatically build the locales for the bot after a
   * change.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-autobuildbotlocales)
   */
  public fun autoBuildBotLocales(): Any? = unwrap(this).getAutoBuildBotLocales()

  /**
   * The Amazon S3 location of files used to import a bot.
   *
   * The files must be in the import format specified in [JSON format for importing and
   * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
   * Lex developer guide.*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botfiles3location)
   */
  public fun botFileS3Location(): Any? = unwrap(this).getBotFileS3Location()

  /**
   * A list of locales for the bot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botlocales)
   */
  public fun botLocales(): Any? = unwrap(this).getBotLocales()

  /**
   * A list of tags to add to the bot.
   *
   * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to update
   * tags. To update tags, use the `TagResource` operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-bottags)
   */
  public fun botTags(): Any? = unwrap(this).getBotTags()

  /**
   * By default, data stored by Amazon Lex is encrypted.
   *
   * The `DataPrivacy` structure provides settings that determine how Amazon Lex handles special
   * cases of securing the data for your bot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-dataprivacy)
   */
  public fun dataPrivacy(): Any

  /**
   * The description of the version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The time, in seconds, that Amazon Lex should keep information about a user's conversation with
   * the bot.
   *
   * A user interaction remains active for the amount of time specified. If no conversation occurs
   * during this time, the session expires and Amazon Lex deletes any data provided before the timeout.
   *
   * You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-idlesessionttlinseconds)
   */
  public fun idleSessionTtlInSeconds(): Number

  /**
   * The name of the bot locale.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-name)
   */
  public fun name(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-replication)
   */
  public fun replication(): Any? = unwrap(this).getReplication()

  /**
   * The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-rolearn)
   */
  public fun roleArn(): String

  /**
   * Specifies configuration settings for the alias used to test the bot.
   *
   * If the `TestBotAliasSettings` property is not specified, the settings are configured with
   * default values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliassettings)
   */
  public fun testBotAliasSettings(): Any? = unwrap(this).getTestBotAliasSettings()

  /**
   * A list of tags to add to the test alias for a bot.
   *
   * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
   * update tags. To update tags on the test alias, use the `TagResource` operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliastags)
   */
  public fun testBotAliasTags(): Any? = unwrap(this).getTestBotAliasTags()

  /**
   * A builder for [CfnBotProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoBuildBotLocales Indicates whether Amazon Lex V2 should automatically build the
     * locales for the bot after a change.
     */
    public fun autoBuildBotLocales(autoBuildBotLocales: Boolean)

    /**
     * @param autoBuildBotLocales Indicates whether Amazon Lex V2 should automatically build the
     * locales for the bot after a change.
     */
    public fun autoBuildBotLocales(autoBuildBotLocales: IResolvable)

    /**
     * @param botFileS3Location The Amazon S3 location of files used to import a bot.
     * The files must be in the import format specified in [JSON format for importing and
     * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
     * Lex developer guide.*
     */
    public fun botFileS3Location(botFileS3Location: IResolvable)

    /**
     * @param botFileS3Location The Amazon S3 location of files used to import a bot.
     * The files must be in the import format specified in [JSON format for importing and
     * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
     * Lex developer guide.*
     */
    public fun botFileS3Location(botFileS3Location: CfnBot.S3LocationProperty)

    /**
     * @param botFileS3Location The Amazon S3 location of files used to import a bot.
     * The files must be in the import format specified in [JSON format for importing and
     * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
     * Lex developer guide.*
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c23a3aca0464bbb24762140b4a4cea5220bb7e3ec304556d4be0132601c8b16")
    public fun botFileS3Location(botFileS3Location: CfnBot.S3LocationProperty.Builder.() -> Unit)

    /**
     * @param botLocales A list of locales for the bot.
     */
    public fun botLocales(botLocales: IResolvable)

    /**
     * @param botLocales A list of locales for the bot.
     */
    public fun botLocales(botLocales: List<Any>)

    /**
     * @param botLocales A list of locales for the bot.
     */
    public fun botLocales(vararg botLocales: Any)

    /**
     * @param botTags A list of tags to add to the bot.
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     */
    public fun botTags(botTags: IResolvable)

    /**
     * @param botTags A list of tags to add to the bot.
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     */
    public fun botTags(botTags: List<Any>)

    /**
     * @param botTags A list of tags to add to the bot.
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     */
    public fun botTags(vararg botTags: Any)

    /**
     * @param dataPrivacy By default, data stored by Amazon Lex is encrypted. 
     * The `DataPrivacy` structure provides settings that determine how Amazon Lex handles special
     * cases of securing the data for your bot.
     */
    public fun dataPrivacy(dataPrivacy: Any)

    /**
     * @param description The description of the version.
     */
    public fun description(description: String)

    /**
     * @param idleSessionTtlInSeconds The time, in seconds, that Amazon Lex should keep information
     * about a user's conversation with the bot. 
     * A user interaction remains active for the amount of time specified. If no conversation occurs
     * during this time, the session expires and Amazon Lex deletes any data provided before the
     * timeout.
     *
     * You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     */
    public fun idleSessionTtlInSeconds(idleSessionTtlInSeconds: Number)

    /**
     * @param name The name of the bot locale. 
     */
    public fun name(name: String)

    /**
     * @param replication the value to be set.
     */
    public fun replication(replication: IResolvable)

    /**
     * @param replication the value to be set.
     */
    public fun replication(replication: CfnBot.ReplicationProperty)

    /**
     * @param replication the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23e941ec6432c4d5fe33e925d70f3e5a5e0b5b78437c84ea0c2ce19211069075")
    public fun replication(replication: CfnBot.ReplicationProperty.Builder.() -> Unit)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role used to build and run the bot. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
     * bot.
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
     */
    public fun testBotAliasSettings(testBotAliasSettings: IResolvable)

    /**
     * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
     * bot.
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
     */
    public fun testBotAliasSettings(testBotAliasSettings: CfnBot.TestBotAliasSettingsProperty)

    /**
     * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
     * bot.
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("280b2f11508ec906f28d882eb773178aedc59680df21e8d2929f6b3f8de65389")
    public
        fun testBotAliasSettings(testBotAliasSettings: CfnBot.TestBotAliasSettingsProperty.Builder.() -> Unit)

    /**
     * @param testBotAliasTags A list of tags to add to the test alias for a bot.
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     */
    public fun testBotAliasTags(testBotAliasTags: IResolvable)

    /**
     * @param testBotAliasTags A list of tags to add to the test alias for a bot.
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     */
    public fun testBotAliasTags(testBotAliasTags: List<Any>)

    /**
     * @param testBotAliasTags A list of tags to add to the test alias for a bot.
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     */
    public fun testBotAliasTags(vararg testBotAliasTags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBotProps.Builder =
        software.amazon.awscdk.services.lex.CfnBotProps.builder()

    /**
     * @param autoBuildBotLocales Indicates whether Amazon Lex V2 should automatically build the
     * locales for the bot after a change.
     */
    override fun autoBuildBotLocales(autoBuildBotLocales: Boolean) {
      cdkBuilder.autoBuildBotLocales(autoBuildBotLocales)
    }

    /**
     * @param autoBuildBotLocales Indicates whether Amazon Lex V2 should automatically build the
     * locales for the bot after a change.
     */
    override fun autoBuildBotLocales(autoBuildBotLocales: IResolvable) {
      cdkBuilder.autoBuildBotLocales(autoBuildBotLocales.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param botFileS3Location The Amazon S3 location of files used to import a bot.
     * The files must be in the import format specified in [JSON format for importing and
     * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
     * Lex developer guide.*
     */
    override fun botFileS3Location(botFileS3Location: IResolvable) {
      cdkBuilder.botFileS3Location(botFileS3Location.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param botFileS3Location The Amazon S3 location of files used to import a bot.
     * The files must be in the import format specified in [JSON format for importing and
     * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
     * Lex developer guide.*
     */
    override fun botFileS3Location(botFileS3Location: CfnBot.S3LocationProperty) {
      cdkBuilder.botFileS3Location(botFileS3Location.let(CfnBot.S3LocationProperty.Companion::unwrap))
    }

    /**
     * @param botFileS3Location The Amazon S3 location of files used to import a bot.
     * The files must be in the import format specified in [JSON format for importing and
     * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
     * Lex developer guide.*
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c23a3aca0464bbb24762140b4a4cea5220bb7e3ec304556d4be0132601c8b16")
    override fun botFileS3Location(botFileS3Location: CfnBot.S3LocationProperty.Builder.() -> Unit):
        Unit = botFileS3Location(CfnBot.S3LocationProperty(botFileS3Location))

    /**
     * @param botLocales A list of locales for the bot.
     */
    override fun botLocales(botLocales: IResolvable) {
      cdkBuilder.botLocales(botLocales.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param botLocales A list of locales for the bot.
     */
    override fun botLocales(botLocales: List<Any>) {
      cdkBuilder.botLocales(botLocales.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param botLocales A list of locales for the bot.
     */
    override fun botLocales(vararg botLocales: Any): Unit = botLocales(botLocales.toList())

    /**
     * @param botTags A list of tags to add to the bot.
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     */
    override fun botTags(botTags: IResolvable) {
      cdkBuilder.botTags(botTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param botTags A list of tags to add to the bot.
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     */
    override fun botTags(botTags: List<Any>) {
      cdkBuilder.botTags(botTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param botTags A list of tags to add to the bot.
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     */
    override fun botTags(vararg botTags: Any): Unit = botTags(botTags.toList())

    /**
     * @param dataPrivacy By default, data stored by Amazon Lex is encrypted. 
     * The `DataPrivacy` structure provides settings that determine how Amazon Lex handles special
     * cases of securing the data for your bot.
     */
    override fun dataPrivacy(dataPrivacy: Any) {
      cdkBuilder.dataPrivacy(dataPrivacy)
    }

    /**
     * @param description The description of the version.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param idleSessionTtlInSeconds The time, in seconds, that Amazon Lex should keep information
     * about a user's conversation with the bot. 
     * A user interaction remains active for the amount of time specified. If no conversation occurs
     * during this time, the session expires and Amazon Lex deletes any data provided before the
     * timeout.
     *
     * You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     */
    override fun idleSessionTtlInSeconds(idleSessionTtlInSeconds: Number) {
      cdkBuilder.idleSessionTtlInSeconds(idleSessionTtlInSeconds)
    }

    /**
     * @param name The name of the bot locale. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param replication the value to be set.
     */
    override fun replication(replication: IResolvable) {
      cdkBuilder.replication(replication.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param replication the value to be set.
     */
    override fun replication(replication: CfnBot.ReplicationProperty) {
      cdkBuilder.replication(replication.let(CfnBot.ReplicationProperty.Companion::unwrap))
    }

    /**
     * @param replication the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23e941ec6432c4d5fe33e925d70f3e5a5e0b5b78437c84ea0c2ce19211069075")
    override fun replication(replication: CfnBot.ReplicationProperty.Builder.() -> Unit): Unit =
        replication(CfnBot.ReplicationProperty(replication))

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role used to build and run the bot. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
     * bot.
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
     */
    override fun testBotAliasSettings(testBotAliasSettings: IResolvable) {
      cdkBuilder.testBotAliasSettings(testBotAliasSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
     * bot.
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
     */
    override fun testBotAliasSettings(testBotAliasSettings: CfnBot.TestBotAliasSettingsProperty) {
      cdkBuilder.testBotAliasSettings(testBotAliasSettings.let(CfnBot.TestBotAliasSettingsProperty.Companion::unwrap))
    }

    /**
     * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
     * bot.
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("280b2f11508ec906f28d882eb773178aedc59680df21e8d2929f6b3f8de65389")
    override
        fun testBotAliasSettings(testBotAliasSettings: CfnBot.TestBotAliasSettingsProperty.Builder.() -> Unit):
        Unit = testBotAliasSettings(CfnBot.TestBotAliasSettingsProperty(testBotAliasSettings))

    /**
     * @param testBotAliasTags A list of tags to add to the test alias for a bot.
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     */
    override fun testBotAliasTags(testBotAliasTags: IResolvable) {
      cdkBuilder.testBotAliasTags(testBotAliasTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param testBotAliasTags A list of tags to add to the test alias for a bot.
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     */
    override fun testBotAliasTags(testBotAliasTags: List<Any>) {
      cdkBuilder.testBotAliasTags(testBotAliasTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param testBotAliasTags A list of tags to add to the test alias for a bot.
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     */
    override fun testBotAliasTags(vararg testBotAliasTags: Any): Unit =
        testBotAliasTags(testBotAliasTags.toList())

    public fun build(): software.amazon.awscdk.services.lex.CfnBotProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lex.CfnBotProps,
  ) : CdkObject(cdkObject),
      CfnBotProps {
    /**
     * Indicates whether Amazon Lex V2 should automatically build the locales for the bot after a
     * change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-autobuildbotlocales)
     */
    override fun autoBuildBotLocales(): Any? = unwrap(this).getAutoBuildBotLocales()

    /**
     * The Amazon S3 location of files used to import a bot.
     *
     * The files must be in the import format specified in [JSON format for importing and
     * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
     * Lex developer guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botfiles3location)
     */
    override fun botFileS3Location(): Any? = unwrap(this).getBotFileS3Location()

    /**
     * A list of locales for the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botlocales)
     */
    override fun botLocales(): Any? = unwrap(this).getBotLocales()

    /**
     * A list of tags to add to the bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-bottags)
     */
    override fun botTags(): Any? = unwrap(this).getBotTags()

    /**
     * By default, data stored by Amazon Lex is encrypted.
     *
     * The `DataPrivacy` structure provides settings that determine how Amazon Lex handles special
     * cases of securing the data for your bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-dataprivacy)
     */
    override fun dataPrivacy(): Any = unwrap(this).getDataPrivacy()

    /**
     * The description of the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun idleSessionTtlInSeconds(): Number = unwrap(this).getIdleSessionTtlInSeconds()

    /**
     * The name of the bot locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-replication)
     */
    override fun replication(): Any? = unwrap(this).getReplication()

    /**
     * The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * Specifies configuration settings for the alias used to test the bot.
     *
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliassettings)
     */
    override fun testBotAliasSettings(): Any? = unwrap(this).getTestBotAliasSettings()

    /**
     * A list of tags to add to the test alias for a bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliastags)
     */
    override fun testBotAliasTags(): Any? = unwrap(this).getTestBotAliasTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBotProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotProps): CfnBotProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnBotProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBotProps): software.amazon.awscdk.services.lex.CfnBotProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBotProps
  }
}
