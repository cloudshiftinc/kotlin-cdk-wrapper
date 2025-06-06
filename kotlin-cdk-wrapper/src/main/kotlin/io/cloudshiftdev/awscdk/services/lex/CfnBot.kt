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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Amazon Lex V2 is the only supported version in AWS CloudFormation .
 *
 * Specifies an Amazon Lex conversational bot.
 *
 * You must configure an intent based on the `AMAZON.FallbackIntent` built-in intent. If you don't
 * add one, creating the bot will fail.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html)
 */
public open class CfnBot(
  cdkObject: software.amazon.awscdk.services.lex.CfnBot,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBotProps,
  ) :
      this(software.amazon.awscdk.services.lex.CfnBot(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnBotProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBotProps.Builder.() -> Unit,
  ) : this(scope, id, CfnBotProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the bot.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique identifier of the bot.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Indicates whether Amazon Lex V2 should automatically build the locales for the bot after a
   * change.
   */
  public open fun autoBuildBotLocales(): Any? = unwrap(this).getAutoBuildBotLocales()

  /**
   * Indicates whether Amazon Lex V2 should automatically build the locales for the bot after a
   * change.
   */
  public open fun autoBuildBotLocales(`value`: Boolean) {
    unwrap(this).setAutoBuildBotLocales(`value`)
  }

  /**
   * Indicates whether Amazon Lex V2 should automatically build the locales for the bot after a
   * change.
   */
  public open fun autoBuildBotLocales(`value`: IResolvable) {
    unwrap(this).setAutoBuildBotLocales(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon S3 location of files used to import a bot.
   */
  public open fun botFileS3Location(): Any? = unwrap(this).getBotFileS3Location()

  /**
   * The Amazon S3 location of files used to import a bot.
   */
  public open fun botFileS3Location(`value`: IResolvable) {
    unwrap(this).setBotFileS3Location(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon S3 location of files used to import a bot.
   */
  public open fun botFileS3Location(`value`: S3LocationProperty) {
    unwrap(this).setBotFileS3Location(`value`.let(S3LocationProperty.Companion::unwrap))
  }

  /**
   * The Amazon S3 location of files used to import a bot.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9dedb455ad66b89bab72e1af0afaf8265fd7b31bce3a272ba289cb874242f8c3")
  public open fun botFileS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      botFileS3Location(S3LocationProperty(`value`))

  /**
   * A list of locales for the bot.
   */
  public open fun botLocales(): Any? = unwrap(this).getBotLocales()

  /**
   * A list of locales for the bot.
   */
  public open fun botLocales(`value`: IResolvable) {
    unwrap(this).setBotLocales(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of locales for the bot.
   */
  public open fun botLocales(`value`: List<Any>) {
    unwrap(this).setBotLocales(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of locales for the bot.
   */
  public open fun botLocales(vararg `value`: Any): Unit = botLocales(`value`.toList())

  /**
   * A list of tags to add to the bot.
   */
  public open fun botTags(): Any? = unwrap(this).getBotTags()

  /**
   * A list of tags to add to the bot.
   */
  public open fun botTags(`value`: IResolvable) {
    unwrap(this).setBotTags(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of tags to add to the bot.
   */
  public open fun botTags(`value`: List<Any>) {
    unwrap(this).setBotTags(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of tags to add to the bot.
   */
  public open fun botTags(vararg `value`: Any): Unit = botTags(`value`.toList())

  /**
   * By default, data stored by Amazon Lex is encrypted.
   */
  public open fun dataPrivacy(): Any = unwrap(this).getDataPrivacy()

  /**
   * By default, data stored by Amazon Lex is encrypted.
   */
  public open fun dataPrivacy(`value`: Any) {
    unwrap(this).setDataPrivacy(`value`)
  }

  /**
   * The description of the version.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the version.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The time, in seconds, that Amazon Lex should keep information about a user's conversation with
   * the bot.
   */
  public open fun idleSessionTtlInSeconds(): Number = unwrap(this).getIdleSessionTtlInSeconds()

  /**
   * The time, in seconds, that Amazon Lex should keep information about a user's conversation with
   * the bot.
   */
  public open fun idleSessionTtlInSeconds(`value`: Number) {
    unwrap(this).setIdleSessionTtlInSeconds(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the bot locale.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the bot locale.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Specifies configuration settings for the alias used to test the bot.
   */
  public open fun testBotAliasSettings(): Any? = unwrap(this).getTestBotAliasSettings()

  /**
   * Specifies configuration settings for the alias used to test the bot.
   */
  public open fun testBotAliasSettings(`value`: IResolvable) {
    unwrap(this).setTestBotAliasSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies configuration settings for the alias used to test the bot.
   */
  public open fun testBotAliasSettings(`value`: TestBotAliasSettingsProperty) {
    unwrap(this).setTestBotAliasSettings(`value`.let(TestBotAliasSettingsProperty.Companion::unwrap))
  }

  /**
   * Specifies configuration settings for the alias used to test the bot.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fd266229f645c7df1f93b233266132dad019c0bf2ce7d5e631e6beae84e05222")
  public open fun testBotAliasSettings(`value`: TestBotAliasSettingsProperty.Builder.() -> Unit):
      Unit = testBotAliasSettings(TestBotAliasSettingsProperty(`value`))

  /**
   * A list of tags to add to the test alias for a bot.
   */
  public open fun testBotAliasTags(): Any? = unwrap(this).getTestBotAliasTags()

  /**
   * A list of tags to add to the test alias for a bot.
   */
  public open fun testBotAliasTags(`value`: IResolvable) {
    unwrap(this).setTestBotAliasTags(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of tags to add to the test alias for a bot.
   */
  public open fun testBotAliasTags(`value`: List<Any>) {
    unwrap(this).setTestBotAliasTags(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of tags to add to the test alias for a bot.
   */
  public open fun testBotAliasTags(vararg `value`: Any): Unit = testBotAliasTags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lex.CfnBot].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether Amazon Lex V2 should automatically build the locales for the bot after a
     * change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-autobuildbotlocales)
     * @param autoBuildBotLocales Indicates whether Amazon Lex V2 should automatically build the
     * locales for the bot after a change. 
     */
    public fun autoBuildBotLocales(autoBuildBotLocales: Boolean)

    /**
     * Indicates whether Amazon Lex V2 should automatically build the locales for the bot after a
     * change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-autobuildbotlocales)
     * @param autoBuildBotLocales Indicates whether Amazon Lex V2 should automatically build the
     * locales for the bot after a change. 
     */
    public fun autoBuildBotLocales(autoBuildBotLocales: IResolvable)

    /**
     * The Amazon S3 location of files used to import a bot.
     *
     * The files must be in the import format specified in [JSON format for importing and
     * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
     * Lex developer guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botfiles3location)
     * @param botFileS3Location The Amazon S3 location of files used to import a bot. 
     */
    public fun botFileS3Location(botFileS3Location: IResolvable)

    /**
     * The Amazon S3 location of files used to import a bot.
     *
     * The files must be in the import format specified in [JSON format for importing and
     * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
     * Lex developer guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botfiles3location)
     * @param botFileS3Location The Amazon S3 location of files used to import a bot. 
     */
    public fun botFileS3Location(botFileS3Location: S3LocationProperty)

    /**
     * The Amazon S3 location of files used to import a bot.
     *
     * The files must be in the import format specified in [JSON format for importing and
     * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
     * Lex developer guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botfiles3location)
     * @param botFileS3Location The Amazon S3 location of files used to import a bot. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34052ba23ead94866e72b45c3fad98a216e6db2a63472d7ed4727bf546a07b6f")
    public fun botFileS3Location(botFileS3Location: S3LocationProperty.Builder.() -> Unit)

    /**
     * A list of locales for the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botlocales)
     * @param botLocales A list of locales for the bot. 
     */
    public fun botLocales(botLocales: IResolvable)

    /**
     * A list of locales for the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botlocales)
     * @param botLocales A list of locales for the bot. 
     */
    public fun botLocales(botLocales: List<Any>)

    /**
     * A list of locales for the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botlocales)
     * @param botLocales A list of locales for the bot. 
     */
    public fun botLocales(vararg botLocales: Any)

    /**
     * A list of tags to add to the bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-bottags)
     * @param botTags A list of tags to add to the bot. 
     */
    public fun botTags(botTags: IResolvable)

    /**
     * A list of tags to add to the bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-bottags)
     * @param botTags A list of tags to add to the bot. 
     */
    public fun botTags(botTags: List<Any>)

    /**
     * A list of tags to add to the bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-bottags)
     * @param botTags A list of tags to add to the bot. 
     */
    public fun botTags(vararg botTags: Any)

    /**
     * By default, data stored by Amazon Lex is encrypted.
     *
     * The `DataPrivacy` structure provides settings that determine how Amazon Lex handles special
     * cases of securing the data for your bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-dataprivacy)
     * @param dataPrivacy By default, data stored by Amazon Lex is encrypted. 
     */
    public fun dataPrivacy(dataPrivacy: Any)

    /**
     * The description of the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-description)
     * @param description The description of the version. 
     */
    public fun description(description: String)

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
     * @param idleSessionTtlInSeconds The time, in seconds, that Amazon Lex should keep information
     * about a user's conversation with the bot. 
     */
    public fun idleSessionTtlInSeconds(idleSessionTtlInSeconds: Number)

    /**
     * The name of the bot locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-name)
     * @param name The name of the bot locale. 
     */
    public fun name(name: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role used to build and run the bot. 
     */
    public fun roleArn(roleArn: String)

    /**
     * Specifies configuration settings for the alias used to test the bot.
     *
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliassettings)
     * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
     * bot. 
     */
    public fun testBotAliasSettings(testBotAliasSettings: IResolvable)

    /**
     * Specifies configuration settings for the alias used to test the bot.
     *
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliassettings)
     * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
     * bot. 
     */
    public fun testBotAliasSettings(testBotAliasSettings: TestBotAliasSettingsProperty)

    /**
     * Specifies configuration settings for the alias used to test the bot.
     *
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliassettings)
     * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
     * bot. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e76e6aa20450f4bf4936a0e6d1ac9affcf3e65b284d2b5adae3baf7c6c7ace9")
    public
        fun testBotAliasSettings(testBotAliasSettings: TestBotAliasSettingsProperty.Builder.() -> Unit)

    /**
     * A list of tags to add to the test alias for a bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliastags)
     * @param testBotAliasTags A list of tags to add to the test alias for a bot. 
     */
    public fun testBotAliasTags(testBotAliasTags: IResolvable)

    /**
     * A list of tags to add to the test alias for a bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliastags)
     * @param testBotAliasTags A list of tags to add to the test alias for a bot. 
     */
    public fun testBotAliasTags(testBotAliasTags: List<Any>)

    /**
     * A list of tags to add to the test alias for a bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliastags)
     * @param testBotAliasTags A list of tags to add to the test alias for a bot. 
     */
    public fun testBotAliasTags(vararg testBotAliasTags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.Builder =
        software.amazon.awscdk.services.lex.CfnBot.Builder.create(scope, id)

    /**
     * Indicates whether Amazon Lex V2 should automatically build the locales for the bot after a
     * change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-autobuildbotlocales)
     * @param autoBuildBotLocales Indicates whether Amazon Lex V2 should automatically build the
     * locales for the bot after a change. 
     */
    override fun autoBuildBotLocales(autoBuildBotLocales: Boolean) {
      cdkBuilder.autoBuildBotLocales(autoBuildBotLocales)
    }

    /**
     * Indicates whether Amazon Lex V2 should automatically build the locales for the bot after a
     * change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-autobuildbotlocales)
     * @param autoBuildBotLocales Indicates whether Amazon Lex V2 should automatically build the
     * locales for the bot after a change. 
     */
    override fun autoBuildBotLocales(autoBuildBotLocales: IResolvable) {
      cdkBuilder.autoBuildBotLocales(autoBuildBotLocales.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Amazon S3 location of files used to import a bot.
     *
     * The files must be in the import format specified in [JSON format for importing and
     * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
     * Lex developer guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botfiles3location)
     * @param botFileS3Location The Amazon S3 location of files used to import a bot. 
     */
    override fun botFileS3Location(botFileS3Location: IResolvable) {
      cdkBuilder.botFileS3Location(botFileS3Location.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Amazon S3 location of files used to import a bot.
     *
     * The files must be in the import format specified in [JSON format for importing and
     * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
     * Lex developer guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botfiles3location)
     * @param botFileS3Location The Amazon S3 location of files used to import a bot. 
     */
    override fun botFileS3Location(botFileS3Location: S3LocationProperty) {
      cdkBuilder.botFileS3Location(botFileS3Location.let(S3LocationProperty.Companion::unwrap))
    }

    /**
     * The Amazon S3 location of files used to import a bot.
     *
     * The files must be in the import format specified in [JSON format for importing and
     * exporting](https://docs.aws.amazon.com/lexv2/latest/dg/import-export-format.html) in the *Amazon
     * Lex developer guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botfiles3location)
     * @param botFileS3Location The Amazon S3 location of files used to import a bot. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34052ba23ead94866e72b45c3fad98a216e6db2a63472d7ed4727bf546a07b6f")
    override fun botFileS3Location(botFileS3Location: S3LocationProperty.Builder.() -> Unit): Unit =
        botFileS3Location(S3LocationProperty(botFileS3Location))

    /**
     * A list of locales for the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botlocales)
     * @param botLocales A list of locales for the bot. 
     */
    override fun botLocales(botLocales: IResolvable) {
      cdkBuilder.botLocales(botLocales.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of locales for the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botlocales)
     * @param botLocales A list of locales for the bot. 
     */
    override fun botLocales(botLocales: List<Any>) {
      cdkBuilder.botLocales(botLocales.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of locales for the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-botlocales)
     * @param botLocales A list of locales for the bot. 
     */
    override fun botLocales(vararg botLocales: Any): Unit = botLocales(botLocales.toList())

    /**
     * A list of tags to add to the bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-bottags)
     * @param botTags A list of tags to add to the bot. 
     */
    override fun botTags(botTags: IResolvable) {
      cdkBuilder.botTags(botTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of tags to add to the bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-bottags)
     * @param botTags A list of tags to add to the bot. 
     */
    override fun botTags(botTags: List<Any>) {
      cdkBuilder.botTags(botTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of tags to add to the bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateBot` operation to
     * update tags. To update tags, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-bottags)
     * @param botTags A list of tags to add to the bot. 
     */
    override fun botTags(vararg botTags: Any): Unit = botTags(botTags.toList())

    /**
     * By default, data stored by Amazon Lex is encrypted.
     *
     * The `DataPrivacy` structure provides settings that determine how Amazon Lex handles special
     * cases of securing the data for your bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-dataprivacy)
     * @param dataPrivacy By default, data stored by Amazon Lex is encrypted. 
     */
    override fun dataPrivacy(dataPrivacy: Any) {
      cdkBuilder.dataPrivacy(dataPrivacy)
    }

    /**
     * The description of the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-description)
     * @param description The description of the version. 
     */
    override fun description(description: String) {
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
     * @param idleSessionTtlInSeconds The time, in seconds, that Amazon Lex should keep information
     * about a user's conversation with the bot. 
     */
    override fun idleSessionTtlInSeconds(idleSessionTtlInSeconds: Number) {
      cdkBuilder.idleSessionTtlInSeconds(idleSessionTtlInSeconds)
    }

    /**
     * The name of the bot locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-name)
     * @param name The name of the bot locale. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role used to build and run the bot. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * Specifies configuration settings for the alias used to test the bot.
     *
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliassettings)
     * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
     * bot. 
     */
    override fun testBotAliasSettings(testBotAliasSettings: IResolvable) {
      cdkBuilder.testBotAliasSettings(testBotAliasSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies configuration settings for the alias used to test the bot.
     *
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliassettings)
     * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
     * bot. 
     */
    override fun testBotAliasSettings(testBotAliasSettings: TestBotAliasSettingsProperty) {
      cdkBuilder.testBotAliasSettings(testBotAliasSettings.let(TestBotAliasSettingsProperty.Companion::unwrap))
    }

    /**
     * Specifies configuration settings for the alias used to test the bot.
     *
     * If the `TestBotAliasSettings` property is not specified, the settings are configured with
     * default values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliassettings)
     * @param testBotAliasSettings Specifies configuration settings for the alias used to test the
     * bot. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e76e6aa20450f4bf4936a0e6d1ac9affcf3e65b284d2b5adae3baf7c6c7ace9")
    override
        fun testBotAliasSettings(testBotAliasSettings: TestBotAliasSettingsProperty.Builder.() -> Unit):
        Unit = testBotAliasSettings(TestBotAliasSettingsProperty(testBotAliasSettings))

    /**
     * A list of tags to add to the test alias for a bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliastags)
     * @param testBotAliasTags A list of tags to add to the test alias for a bot. 
     */
    override fun testBotAliasTags(testBotAliasTags: IResolvable) {
      cdkBuilder.testBotAliasTags(testBotAliasTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of tags to add to the test alias for a bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliastags)
     * @param testBotAliasTags A list of tags to add to the test alias for a bot. 
     */
    override fun testBotAliasTags(testBotAliasTags: List<Any>) {
      cdkBuilder.testBotAliasTags(testBotAliasTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of tags to add to the test alias for a bot.
     *
     * You can only add tags when you import a bot. You can't use the `UpdateAlias` operation to
     * update tags. To update tags on the test alias, use the `TagResource` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-bot.html#cfn-lex-bot-testbotaliastags)
     * @param testBotAliasTags A list of tags to add to the test alias for a bot. 
     */
    override fun testBotAliasTags(vararg testBotAliasTags: Any): Unit =
        testBotAliasTags(testBotAliasTags.toList())

    public fun build(): software.amazon.awscdk.services.lex.CfnBot = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lex.CfnBot.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBot {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBot(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot): CfnBot =
        CfnBot(cdkObject)

    internal fun unwrap(wrapped: CfnBot): software.amazon.awscdk.services.lex.CfnBot =
        wrapped.cdkObject as software.amazon.awscdk.services.lex.CfnBot
  }

  /**
   * Provides settings that enable advanced recognition settings for slot values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * AdvancedRecognitionSettingProperty advancedRecognitionSettingProperty =
   * AdvancedRecognitionSettingProperty.builder()
   * .audioRecognitionStrategy("audioRecognitionStrategy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-advancedrecognitionsetting.html)
   */
  public interface AdvancedRecognitionSettingProperty {
    /**
     * Enables using the slot values as a custom vocabulary for recognizing user utterances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-advancedrecognitionsetting.html#cfn-lex-bot-advancedrecognitionsetting-audiorecognitionstrategy)
     */
    public fun audioRecognitionStrategy(): String? = unwrap(this).getAudioRecognitionStrategy()

    /**
     * A builder for [AdvancedRecognitionSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param audioRecognitionStrategy Enables using the slot values as a custom vocabulary for
       * recognizing user utterances.
       */
      public fun audioRecognitionStrategy(audioRecognitionStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.AdvancedRecognitionSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.AdvancedRecognitionSettingProperty.builder()

      /**
       * @param audioRecognitionStrategy Enables using the slot values as a custom vocabulary for
       * recognizing user utterances.
       */
      override fun audioRecognitionStrategy(audioRecognitionStrategy: String) {
        cdkBuilder.audioRecognitionStrategy(audioRecognitionStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.AdvancedRecognitionSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.AdvancedRecognitionSettingProperty,
    ) : CdkObject(cdkObject),
        AdvancedRecognitionSettingProperty {
      /**
       * Enables using the slot values as a custom vocabulary for recognizing user utterances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-advancedrecognitionsetting.html#cfn-lex-bot-advancedrecognitionsetting-audiorecognitionstrategy)
       */
      override fun audioRecognitionStrategy(): String? = unwrap(this).getAudioRecognitionStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdvancedRecognitionSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.AdvancedRecognitionSettingProperty):
          AdvancedRecognitionSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AdvancedRecognitionSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedRecognitionSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.AdvancedRecognitionSettingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.AdvancedRecognitionSettingProperty
    }
  }

  /**
   * Specifies the allowed input types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * AllowedInputTypesProperty allowedInputTypesProperty = AllowedInputTypesProperty.builder()
   * .allowAudioInput(false)
   * .allowDtmfInput(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-allowedinputtypes.html)
   */
  public interface AllowedInputTypesProperty {
    /**
     * Indicates whether audio input is allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-allowedinputtypes.html#cfn-lex-bot-allowedinputtypes-allowaudioinput)
     */
    public fun allowAudioInput(): Any

    /**
     * Indicates whether DTMF input is allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-allowedinputtypes.html#cfn-lex-bot-allowedinputtypes-allowdtmfinput)
     */
    public fun allowDtmfInput(): Any

    /**
     * A builder for [AllowedInputTypesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowAudioInput Indicates whether audio input is allowed. 
       */
      public fun allowAudioInput(allowAudioInput: Boolean)

      /**
       * @param allowAudioInput Indicates whether audio input is allowed. 
       */
      public fun allowAudioInput(allowAudioInput: IResolvable)

      /**
       * @param allowDtmfInput Indicates whether DTMF input is allowed. 
       */
      public fun allowDtmfInput(allowDtmfInput: Boolean)

      /**
       * @param allowDtmfInput Indicates whether DTMF input is allowed. 
       */
      public fun allowDtmfInput(allowDtmfInput: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.AllowedInputTypesProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.AllowedInputTypesProperty.builder()

      /**
       * @param allowAudioInput Indicates whether audio input is allowed. 
       */
      override fun allowAudioInput(allowAudioInput: Boolean) {
        cdkBuilder.allowAudioInput(allowAudioInput)
      }

      /**
       * @param allowAudioInput Indicates whether audio input is allowed. 
       */
      override fun allowAudioInput(allowAudioInput: IResolvable) {
        cdkBuilder.allowAudioInput(allowAudioInput.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param allowDtmfInput Indicates whether DTMF input is allowed. 
       */
      override fun allowDtmfInput(allowDtmfInput: Boolean) {
        cdkBuilder.allowDtmfInput(allowDtmfInput)
      }

      /**
       * @param allowDtmfInput Indicates whether DTMF input is allowed. 
       */
      override fun allowDtmfInput(allowDtmfInput: IResolvable) {
        cdkBuilder.allowDtmfInput(allowDtmfInput.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.AllowedInputTypesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.AllowedInputTypesProperty,
    ) : CdkObject(cdkObject),
        AllowedInputTypesProperty {
      /**
       * Indicates whether audio input is allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-allowedinputtypes.html#cfn-lex-bot-allowedinputtypes-allowaudioinput)
       */
      override fun allowAudioInput(): Any = unwrap(this).getAllowAudioInput()

      /**
       * Indicates whether DTMF input is allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-allowedinputtypes.html#cfn-lex-bot-allowedinputtypes-allowdtmfinput)
       */
      override fun allowDtmfInput(): Any = unwrap(this).getAllowDtmfInput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AllowedInputTypesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.AllowedInputTypesProperty):
          AllowedInputTypesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AllowedInputTypesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AllowedInputTypesProperty):
          software.amazon.awscdk.services.lex.CfnBot.AllowedInputTypesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.AllowedInputTypesProperty
    }
  }

  /**
   * Specifies the audio and DTMF input specification.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface AudioAndDTMFInputSpecificationProperty {
    /**
     * Specifies the settings on audio input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audioanddtmfinputspecification.html#cfn-lex-bot-audioanddtmfinputspecification-audiospecification)
     */
    public fun audioSpecification(): Any? = unwrap(this).getAudioSpecification()

    /**
     * Specifies the settings on DTMF input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audioanddtmfinputspecification.html#cfn-lex-bot-audioanddtmfinputspecification-dtmfspecification)
     */
    public fun dtmfSpecification(): Any? = unwrap(this).getDtmfSpecification()

    /**
     * Time for which a bot waits before assuming that the customer isn't going to speak or press a
     * key.
     *
     * This timeout is shared between Audio and DTMF inputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audioanddtmfinputspecification.html#cfn-lex-bot-audioanddtmfinputspecification-starttimeoutms)
     */
    public fun startTimeoutMs(): Number

    /**
     * A builder for [AudioAndDTMFInputSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param audioSpecification Specifies the settings on audio input.
       */
      public fun audioSpecification(audioSpecification: IResolvable)

      /**
       * @param audioSpecification Specifies the settings on audio input.
       */
      public fun audioSpecification(audioSpecification: AudioSpecificationProperty)

      /**
       * @param audioSpecification Specifies the settings on audio input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab63600b5ff2fd4a4b547b226f2d7cce0712986c5bbd8e417b0899ca35837f1f")
      public
          fun audioSpecification(audioSpecification: AudioSpecificationProperty.Builder.() -> Unit)

      /**
       * @param dtmfSpecification Specifies the settings on DTMF input.
       */
      public fun dtmfSpecification(dtmfSpecification: IResolvable)

      /**
       * @param dtmfSpecification Specifies the settings on DTMF input.
       */
      public fun dtmfSpecification(dtmfSpecification: DTMFSpecificationProperty)

      /**
       * @param dtmfSpecification Specifies the settings on DTMF input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76c203d83266832ddbd4dda9b0879cc214f5402efa864e01b232ec1faeec3020")
      public fun dtmfSpecification(dtmfSpecification: DTMFSpecificationProperty.Builder.() -> Unit)

      /**
       * @param startTimeoutMs Time for which a bot waits before assuming that the customer isn't
       * going to speak or press a key. 
       * This timeout is shared between Audio and DTMF inputs.
       */
      public fun startTimeoutMs(startTimeoutMs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.AudioAndDTMFInputSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.AudioAndDTMFInputSpecificationProperty.builder()

      /**
       * @param audioSpecification Specifies the settings on audio input.
       */
      override fun audioSpecification(audioSpecification: IResolvable) {
        cdkBuilder.audioSpecification(audioSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param audioSpecification Specifies the settings on audio input.
       */
      override fun audioSpecification(audioSpecification: AudioSpecificationProperty) {
        cdkBuilder.audioSpecification(audioSpecification.let(AudioSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param audioSpecification Specifies the settings on audio input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab63600b5ff2fd4a4b547b226f2d7cce0712986c5bbd8e417b0899ca35837f1f")
      override
          fun audioSpecification(audioSpecification: AudioSpecificationProperty.Builder.() -> Unit):
          Unit = audioSpecification(AudioSpecificationProperty(audioSpecification))

      /**
       * @param dtmfSpecification Specifies the settings on DTMF input.
       */
      override fun dtmfSpecification(dtmfSpecification: IResolvable) {
        cdkBuilder.dtmfSpecification(dtmfSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dtmfSpecification Specifies the settings on DTMF input.
       */
      override fun dtmfSpecification(dtmfSpecification: DTMFSpecificationProperty) {
        cdkBuilder.dtmfSpecification(dtmfSpecification.let(DTMFSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param dtmfSpecification Specifies the settings on DTMF input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76c203d83266832ddbd4dda9b0879cc214f5402efa864e01b232ec1faeec3020")
      override
          fun dtmfSpecification(dtmfSpecification: DTMFSpecificationProperty.Builder.() -> Unit):
          Unit = dtmfSpecification(DTMFSpecificationProperty(dtmfSpecification))

      /**
       * @param startTimeoutMs Time for which a bot waits before assuming that the customer isn't
       * going to speak or press a key. 
       * This timeout is shared between Audio and DTMF inputs.
       */
      override fun startTimeoutMs(startTimeoutMs: Number) {
        cdkBuilder.startTimeoutMs(startTimeoutMs)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.AudioAndDTMFInputSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.AudioAndDTMFInputSpecificationProperty,
    ) : CdkObject(cdkObject),
        AudioAndDTMFInputSpecificationProperty {
      /**
       * Specifies the settings on audio input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audioanddtmfinputspecification.html#cfn-lex-bot-audioanddtmfinputspecification-audiospecification)
       */
      override fun audioSpecification(): Any? = unwrap(this).getAudioSpecification()

      /**
       * Specifies the settings on DTMF input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audioanddtmfinputspecification.html#cfn-lex-bot-audioanddtmfinputspecification-dtmfspecification)
       */
      override fun dtmfSpecification(): Any? = unwrap(this).getDtmfSpecification()

      /**
       * Time for which a bot waits before assuming that the customer isn't going to speak or press
       * a key.
       *
       * This timeout is shared between Audio and DTMF inputs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audioanddtmfinputspecification.html#cfn-lex-bot-audioanddtmfinputspecification-starttimeoutms)
       */
      override fun startTimeoutMs(): Number = unwrap(this).getStartTimeoutMs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AudioAndDTMFInputSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.AudioAndDTMFInputSpecificationProperty):
          AudioAndDTMFInputSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AudioAndDTMFInputSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioAndDTMFInputSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.AudioAndDTMFInputSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.AudioAndDTMFInputSpecificationProperty
    }
  }

  /**
   * The location of audio log files collected when conversation logging is enabled for a bot.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiologdestination.html)
   */
  public interface AudioLogDestinationProperty {
    /**
     * Specifies the Amazon S3 bucket where the audio files are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiologdestination.html#cfn-lex-bot-audiologdestination-s3bucket)
     */
    public fun s3Bucket(): Any

    /**
     * A builder for [AudioLogDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Bucket Specifies the Amazon S3 bucket where the audio files are stored. 
       */
      public fun s3Bucket(s3Bucket: IResolvable)

      /**
       * @param s3Bucket Specifies the Amazon S3 bucket where the audio files are stored. 
       */
      public fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty)

      /**
       * @param s3Bucket Specifies the Amazon S3 bucket where the audio files are stored. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f023faf47be12eb4518c36ca8b3dfd94a6e8c653081baca56b7a2f01b8bcb5e1")
      public fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.AudioLogDestinationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.AudioLogDestinationProperty.builder()

      /**
       * @param s3Bucket Specifies the Amazon S3 bucket where the audio files are stored. 
       */
      override fun s3Bucket(s3Bucket: IResolvable) {
        cdkBuilder.s3Bucket(s3Bucket.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3Bucket Specifies the Amazon S3 bucket where the audio files are stored. 
       */
      override fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty) {
        cdkBuilder.s3Bucket(s3Bucket.let(S3BucketLogDestinationProperty.Companion::unwrap))
      }

      /**
       * @param s3Bucket Specifies the Amazon S3 bucket where the audio files are stored. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f023faf47be12eb4518c36ca8b3dfd94a6e8c653081baca56b7a2f01b8bcb5e1")
      override fun s3Bucket(s3Bucket: S3BucketLogDestinationProperty.Builder.() -> Unit): Unit =
          s3Bucket(S3BucketLogDestinationProperty(s3Bucket))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.AudioLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.AudioLogDestinationProperty,
    ) : CdkObject(cdkObject),
        AudioLogDestinationProperty {
      /**
       * Specifies the Amazon S3 bucket where the audio files are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiologdestination.html#cfn-lex-bot-audiologdestination-s3bucket)
       */
      override fun s3Bucket(): Any = unwrap(this).getS3Bucket()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.AudioLogDestinationProperty):
          AudioLogDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AudioLogDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBot.AudioLogDestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.AudioLogDestinationProperty
    }
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiologsetting.html)
   */
  public interface AudioLogSettingProperty {
    /**
     * Specifies the location of the audio log files collected when conversation logging is enabled
     * for a bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiologsetting.html#cfn-lex-bot-audiologsetting-destination)
     */
    public fun destination(): Any

    /**
     * Determines whether audio logging in enabled for the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiologsetting.html#cfn-lex-bot-audiologsetting-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [AudioLogSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination Specifies the location of the audio log files collected when
       * conversation logging is enabled for a bot. 
       */
      public fun destination(destination: IResolvable)

      /**
       * @param destination Specifies the location of the audio log files collected when
       * conversation logging is enabled for a bot. 
       */
      public fun destination(destination: AudioLogDestinationProperty)

      /**
       * @param destination Specifies the location of the audio log files collected when
       * conversation logging is enabled for a bot. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a36254686cad8246bfc3f28e1825276b53ad0a8954f57f7dd0b4b801fa9c7328")
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
          software.amazon.awscdk.services.lex.CfnBot.AudioLogSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.AudioLogSettingProperty.builder()

      /**
       * @param destination Specifies the location of the audio log files collected when
       * conversation logging is enabled for a bot. 
       */
      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param destination Specifies the location of the audio log files collected when
       * conversation logging is enabled for a bot. 
       */
      override fun destination(destination: AudioLogDestinationProperty) {
        cdkBuilder.destination(destination.let(AudioLogDestinationProperty.Companion::unwrap))
      }

      /**
       * @param destination Specifies the location of the audio log files collected when
       * conversation logging is enabled for a bot. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a36254686cad8246bfc3f28e1825276b53ad0a8954f57f7dd0b4b801fa9c7328")
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
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.AudioLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.AudioLogSettingProperty,
    ) : CdkObject(cdkObject),
        AudioLogSettingProperty {
      /**
       * Specifies the location of the audio log files collected when conversation logging is
       * enabled for a bot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiologsetting.html#cfn-lex-bot-audiologsetting-destination)
       */
      override fun destination(): Any = unwrap(this).getDestination()

      /**
       * Determines whether audio logging in enabled for the bot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiologsetting.html#cfn-lex-bot-audiologsetting-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioLogSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.AudioLogSettingProperty):
          AudioLogSettingProperty = CdkObjectWrappers.wrap(cdkObject) as? AudioLogSettingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioLogSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.AudioLogSettingProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.AudioLogSettingProperty
    }
  }

  /**
   * Specifies the audio input specifications.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * AudioSpecificationProperty audioSpecificationProperty = AudioSpecificationProperty.builder()
   * .endTimeoutMs(123)
   * .maxLengthMs(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiospecification.html)
   */
  public interface AudioSpecificationProperty {
    /**
     * Time for which a bot waits after the customer stops speaking to assume the utterance is
     * finished.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiospecification.html#cfn-lex-bot-audiospecification-endtimeoutms)
     */
    public fun endTimeoutMs(): Number

    /**
     * Time for how long Amazon Lex waits before speech input is truncated and the speech is
     * returned to application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiospecification.html#cfn-lex-bot-audiospecification-maxlengthms)
     */
    public fun maxLengthMs(): Number

    /**
     * A builder for [AudioSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endTimeoutMs Time for which a bot waits after the customer stops speaking to assume
       * the utterance is finished. 
       */
      public fun endTimeoutMs(endTimeoutMs: Number)

      /**
       * @param maxLengthMs Time for how long Amazon Lex waits before speech input is truncated and
       * the speech is returned to application. 
       */
      public fun maxLengthMs(maxLengthMs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.AudioSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.AudioSpecificationProperty.builder()

      /**
       * @param endTimeoutMs Time for which a bot waits after the customer stops speaking to assume
       * the utterance is finished. 
       */
      override fun endTimeoutMs(endTimeoutMs: Number) {
        cdkBuilder.endTimeoutMs(endTimeoutMs)
      }

      /**
       * @param maxLengthMs Time for how long Amazon Lex waits before speech input is truncated and
       * the speech is returned to application. 
       */
      override fun maxLengthMs(maxLengthMs: Number) {
        cdkBuilder.maxLengthMs(maxLengthMs)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.AudioSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.AudioSpecificationProperty,
    ) : CdkObject(cdkObject),
        AudioSpecificationProperty {
      /**
       * Time for which a bot waits after the customer stops speaking to assume the utterance is
       * finished.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiospecification.html#cfn-lex-bot-audiospecification-endtimeoutms)
       */
      override fun endTimeoutMs(): Number = unwrap(this).getEndTimeoutMs()

      /**
       * Time for how long Amazon Lex waits before speech input is truncated and the speech is
       * returned to application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiospecification.html#cfn-lex-bot-audiospecification-maxlengthms)
       */
      override fun maxLengthMs(): Number = unwrap(this).getMaxLengthMs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.AudioSpecificationProperty):
          AudioSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AudioSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.AudioSpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.AudioSpecificationProperty
    }
  }

  /**
   * Specifies locale settings for a single locale.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botaliaslocalesettingsitem.html)
   */
  public interface BotAliasLocaleSettingsItemProperty {
    /**
     * Specifies locale settings for a locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botaliaslocalesettingsitem.html#cfn-lex-bot-botaliaslocalesettingsitem-botaliaslocalesetting)
     */
    public fun botAliasLocaleSetting(): Any

    /**
     * Specifies the locale that the settings apply to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botaliaslocalesettingsitem.html#cfn-lex-bot-botaliaslocalesettingsitem-localeid)
     */
    public fun localeId(): String

    /**
     * A builder for [BotAliasLocaleSettingsItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param botAliasLocaleSetting Specifies locale settings for a locale. 
       */
      public fun botAliasLocaleSetting(botAliasLocaleSetting: IResolvable)

      /**
       * @param botAliasLocaleSetting Specifies locale settings for a locale. 
       */
      public fun botAliasLocaleSetting(botAliasLocaleSetting: BotAliasLocaleSettingsProperty)

      /**
       * @param botAliasLocaleSetting Specifies locale settings for a locale. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b48b1b9d92d9610281def2c0162f6b1c71ed8f00b794f299fa8ee02e3768522c")
      public
          fun botAliasLocaleSetting(botAliasLocaleSetting: BotAliasLocaleSettingsProperty.Builder.() -> Unit)

      /**
       * @param localeId Specifies the locale that the settings apply to. 
       */
      public fun localeId(localeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsItemProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsItemProperty.builder()

      /**
       * @param botAliasLocaleSetting Specifies locale settings for a locale. 
       */
      override fun botAliasLocaleSetting(botAliasLocaleSetting: IResolvable) {
        cdkBuilder.botAliasLocaleSetting(botAliasLocaleSetting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param botAliasLocaleSetting Specifies locale settings for a locale. 
       */
      override fun botAliasLocaleSetting(botAliasLocaleSetting: BotAliasLocaleSettingsProperty) {
        cdkBuilder.botAliasLocaleSetting(botAliasLocaleSetting.let(BotAliasLocaleSettingsProperty.Companion::unwrap))
      }

      /**
       * @param botAliasLocaleSetting Specifies locale settings for a locale. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b48b1b9d92d9610281def2c0162f6b1c71ed8f00b794f299fa8ee02e3768522c")
      override
          fun botAliasLocaleSetting(botAliasLocaleSetting: BotAliasLocaleSettingsProperty.Builder.() -> Unit):
          Unit = botAliasLocaleSetting(BotAliasLocaleSettingsProperty(botAliasLocaleSetting))

      /**
       * @param localeId Specifies the locale that the settings apply to. 
       */
      override fun localeId(localeId: String) {
        cdkBuilder.localeId(localeId)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsItemProperty,
    ) : CdkObject(cdkObject),
        BotAliasLocaleSettingsItemProperty {
      /**
       * Specifies locale settings for a locale.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botaliaslocalesettingsitem.html#cfn-lex-bot-botaliaslocalesettingsitem-botaliaslocalesetting)
       */
      override fun botAliasLocaleSetting(): Any = unwrap(this).getBotAliasLocaleSetting()

      /**
       * Specifies the locale that the settings apply to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botaliaslocalesettingsitem.html#cfn-lex-bot-botaliaslocalesettingsitem-localeid)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsItemProperty):
          BotAliasLocaleSettingsItemProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BotAliasLocaleSettingsItemProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BotAliasLocaleSettingsItemProperty):
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsItemProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsItemProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botaliaslocalesettings.html)
   */
  public interface BotAliasLocaleSettingsProperty {
    /**
     * Specifies the Lambda function that should be used in the locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botaliaslocalesettings.html#cfn-lex-bot-botaliaslocalesettings-codehookspecification)
     */
    public fun codeHookSpecification(): Any? = unwrap(this).getCodeHookSpecification()

    /**
     * Determines whether the locale is enabled for the bot.
     *
     * If the value is `false` , the locale isn't available for use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botaliaslocalesettings.html#cfn-lex-bot-botaliaslocalesettings-enabled)
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
      @JvmName("061facdb9e1ed7b2656465f4dbb2831111a7baaae36e97d5c8991de19c20ce29")
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
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsProperty.builder()

      /**
       * @param codeHookSpecification Specifies the Lambda function that should be used in the
       * locale.
       */
      override fun codeHookSpecification(codeHookSpecification: IResolvable) {
        cdkBuilder.codeHookSpecification(codeHookSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param codeHookSpecification Specifies the Lambda function that should be used in the
       * locale.
       */
      override fun codeHookSpecification(codeHookSpecification: CodeHookSpecificationProperty) {
        cdkBuilder.codeHookSpecification(codeHookSpecification.let(CodeHookSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param codeHookSpecification Specifies the Lambda function that should be used in the
       * locale.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("061facdb9e1ed7b2656465f4dbb2831111a7baaae36e97d5c8991de19c20ce29")
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
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsProperty,
    ) : CdkObject(cdkObject),
        BotAliasLocaleSettingsProperty {
      /**
       * Specifies the Lambda function that should be used in the locale.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botaliaslocalesettings.html#cfn-lex-bot-botaliaslocalesettings-codehookspecification)
       */
      override fun codeHookSpecification(): Any? = unwrap(this).getCodeHookSpecification()

      /**
       * Determines whether the locale is enabled for the bot.
       *
       * If the value is `false` , the locale isn't available for use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botaliaslocalesettings.html#cfn-lex-bot-botaliaslocalesettings-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BotAliasLocaleSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsProperty):
          BotAliasLocaleSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BotAliasLocaleSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BotAliasLocaleSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.BotAliasLocaleSettingsProperty
    }
  }

  /**
   * Provides configuration information for a locale.
   *
   * Example:
   *
   * ```
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html)
   */
  public interface BotLocaleProperty {
    /**
     * Specifies a custom vocabulary to use with a specific locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html#cfn-lex-bot-botlocale-customvocabulary)
     */
    public fun customVocabulary(): Any? = unwrap(this).getCustomVocabulary()

    /**
     * A description of the bot locale.
     *
     * Use this to help identify the bot locale in lists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html#cfn-lex-bot-botlocale-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * One or more intents defined for the locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html#cfn-lex-bot-botlocale-intents)
     */
    public fun intents(): Any? = unwrap(this).getIntents()

    /**
     * The identifier of the language and locale that the bot will be used in.
     *
     * The string must match one of the supported locales.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html#cfn-lex-bot-botlocale-localeid)
     */
    public fun localeId(): String

    /**
     * Determines the threshold where Amazon Lex will insert the `AMAZON.FallbackIntent` ,
     * `AMAZON.KendraSearchIntent` , or both when returning alternative intents. You must configure an
     * `AMAZON.FallbackIntent` . `AMAZON.KendraSearchIntent` is only inserted if it is configured for
     * the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html#cfn-lex-bot-botlocale-nluconfidencethreshold)
     */
    public fun nluConfidenceThreshold(): Number

    /**
     * One or more slot types defined for the locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html#cfn-lex-bot-botlocale-slottypes)
     */
    public fun slotTypes(): Any? = unwrap(this).getSlotTypes()

    /**
     * Defines settings for using an Amazon Polly voice to communicate with a user.
     *
     * Valid values include:
     *
     * * `standard`
     * * `neural`
     * * `long-form`
     * * `generative`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html#cfn-lex-bot-botlocale-voicesettings)
     */
    public fun voiceSettings(): Any? = unwrap(this).getVoiceSettings()

    /**
     * A builder for [BotLocaleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customVocabulary Specifies a custom vocabulary to use with a specific locale.
       */
      public fun customVocabulary(customVocabulary: IResolvable)

      /**
       * @param customVocabulary Specifies a custom vocabulary to use with a specific locale.
       */
      public fun customVocabulary(customVocabulary: CustomVocabularyProperty)

      /**
       * @param customVocabulary Specifies a custom vocabulary to use with a specific locale.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65dfe13f14c779d54415272b16ac5df48588c99bbd224c3caedc359e73428c1a")
      public fun customVocabulary(customVocabulary: CustomVocabularyProperty.Builder.() -> Unit)

      /**
       * @param description A description of the bot locale.
       * Use this to help identify the bot locale in lists.
       */
      public fun description(description: String)

      /**
       * @param intents One or more intents defined for the locale.
       */
      public fun intents(intents: IResolvable)

      /**
       * @param intents One or more intents defined for the locale.
       */
      public fun intents(intents: List<Any>)

      /**
       * @param intents One or more intents defined for the locale.
       */
      public fun intents(vararg intents: Any)

      /**
       * @param localeId The identifier of the language and locale that the bot will be used in. 
       * The string must match one of the supported locales.
       */
      public fun localeId(localeId: String)

      /**
       * @param nluConfidenceThreshold Determines the threshold where Amazon Lex will insert the
       * `AMAZON.FallbackIntent` , `AMAZON.KendraSearchIntent` , or both when returning alternative
       * intents. You must configure an `AMAZON.FallbackIntent` . `AMAZON.KendraSearchIntent` is only
       * inserted if it is configured for the bot. 
       */
      public fun nluConfidenceThreshold(nluConfidenceThreshold: Number)

      /**
       * @param slotTypes One or more slot types defined for the locale.
       */
      public fun slotTypes(slotTypes: IResolvable)

      /**
       * @param slotTypes One or more slot types defined for the locale.
       */
      public fun slotTypes(slotTypes: List<Any>)

      /**
       * @param slotTypes One or more slot types defined for the locale.
       */
      public fun slotTypes(vararg slotTypes: Any)

      /**
       * @param voiceSettings Defines settings for using an Amazon Polly voice to communicate with a
       * user.
       * Valid values include:
       *
       * * `standard`
       * * `neural`
       * * `long-form`
       * * `generative`
       */
      public fun voiceSettings(voiceSettings: IResolvable)

      /**
       * @param voiceSettings Defines settings for using an Amazon Polly voice to communicate with a
       * user.
       * Valid values include:
       *
       * * `standard`
       * * `neural`
       * * `long-form`
       * * `generative`
       */
      public fun voiceSettings(voiceSettings: VoiceSettingsProperty)

      /**
       * @param voiceSettings Defines settings for using an Amazon Polly voice to communicate with a
       * user.
       * Valid values include:
       *
       * * `standard`
       * * `neural`
       * * `long-form`
       * * `generative`
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f134e87e6455eb7ee5f8d312b4bb55381e0723a5544fd753a59801b52965ded9")
      public fun voiceSettings(voiceSettings: VoiceSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.BotLocaleProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.BotLocaleProperty.builder()

      /**
       * @param customVocabulary Specifies a custom vocabulary to use with a specific locale.
       */
      override fun customVocabulary(customVocabulary: IResolvable) {
        cdkBuilder.customVocabulary(customVocabulary.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customVocabulary Specifies a custom vocabulary to use with a specific locale.
       */
      override fun customVocabulary(customVocabulary: CustomVocabularyProperty) {
        cdkBuilder.customVocabulary(customVocabulary.let(CustomVocabularyProperty.Companion::unwrap))
      }

      /**
       * @param customVocabulary Specifies a custom vocabulary to use with a specific locale.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65dfe13f14c779d54415272b16ac5df48588c99bbd224c3caedc359e73428c1a")
      override fun customVocabulary(customVocabulary: CustomVocabularyProperty.Builder.() -> Unit):
          Unit = customVocabulary(CustomVocabularyProperty(customVocabulary))

      /**
       * @param description A description of the bot locale.
       * Use this to help identify the bot locale in lists.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param intents One or more intents defined for the locale.
       */
      override fun intents(intents: IResolvable) {
        cdkBuilder.intents(intents.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param intents One or more intents defined for the locale.
       */
      override fun intents(intents: List<Any>) {
        cdkBuilder.intents(intents.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param intents One or more intents defined for the locale.
       */
      override fun intents(vararg intents: Any): Unit = intents(intents.toList())

      /**
       * @param localeId The identifier of the language and locale that the bot will be used in. 
       * The string must match one of the supported locales.
       */
      override fun localeId(localeId: String) {
        cdkBuilder.localeId(localeId)
      }

      /**
       * @param nluConfidenceThreshold Determines the threshold where Amazon Lex will insert the
       * `AMAZON.FallbackIntent` , `AMAZON.KendraSearchIntent` , or both when returning alternative
       * intents. You must configure an `AMAZON.FallbackIntent` . `AMAZON.KendraSearchIntent` is only
       * inserted if it is configured for the bot. 
       */
      override fun nluConfidenceThreshold(nluConfidenceThreshold: Number) {
        cdkBuilder.nluConfidenceThreshold(nluConfidenceThreshold)
      }

      /**
       * @param slotTypes One or more slot types defined for the locale.
       */
      override fun slotTypes(slotTypes: IResolvable) {
        cdkBuilder.slotTypes(slotTypes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param slotTypes One or more slot types defined for the locale.
       */
      override fun slotTypes(slotTypes: List<Any>) {
        cdkBuilder.slotTypes(slotTypes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param slotTypes One or more slot types defined for the locale.
       */
      override fun slotTypes(vararg slotTypes: Any): Unit = slotTypes(slotTypes.toList())

      /**
       * @param voiceSettings Defines settings for using an Amazon Polly voice to communicate with a
       * user.
       * Valid values include:
       *
       * * `standard`
       * * `neural`
       * * `long-form`
       * * `generative`
       */
      override fun voiceSettings(voiceSettings: IResolvable) {
        cdkBuilder.voiceSettings(voiceSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param voiceSettings Defines settings for using an Amazon Polly voice to communicate with a
       * user.
       * Valid values include:
       *
       * * `standard`
       * * `neural`
       * * `long-form`
       * * `generative`
       */
      override fun voiceSettings(voiceSettings: VoiceSettingsProperty) {
        cdkBuilder.voiceSettings(voiceSettings.let(VoiceSettingsProperty.Companion::unwrap))
      }

      /**
       * @param voiceSettings Defines settings for using an Amazon Polly voice to communicate with a
       * user.
       * Valid values include:
       *
       * * `standard`
       * * `neural`
       * * `long-form`
       * * `generative`
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f134e87e6455eb7ee5f8d312b4bb55381e0723a5544fd753a59801b52965ded9")
      override fun voiceSettings(voiceSettings: VoiceSettingsProperty.Builder.() -> Unit): Unit =
          voiceSettings(VoiceSettingsProperty(voiceSettings))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.BotLocaleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.BotLocaleProperty,
    ) : CdkObject(cdkObject),
        BotLocaleProperty {
      /**
       * Specifies a custom vocabulary to use with a specific locale.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html#cfn-lex-bot-botlocale-customvocabulary)
       */
      override fun customVocabulary(): Any? = unwrap(this).getCustomVocabulary()

      /**
       * A description of the bot locale.
       *
       * Use this to help identify the bot locale in lists.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html#cfn-lex-bot-botlocale-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * One or more intents defined for the locale.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html#cfn-lex-bot-botlocale-intents)
       */
      override fun intents(): Any? = unwrap(this).getIntents()

      /**
       * The identifier of the language and locale that the bot will be used in.
       *
       * The string must match one of the supported locales.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html#cfn-lex-bot-botlocale-localeid)
       */
      override fun localeId(): String = unwrap(this).getLocaleId()

      /**
       * Determines the threshold where Amazon Lex will insert the `AMAZON.FallbackIntent` ,
       * `AMAZON.KendraSearchIntent` , or both when returning alternative intents. You must configure
       * an `AMAZON.FallbackIntent` . `AMAZON.KendraSearchIntent` is only inserted if it is configured
       * for the bot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html#cfn-lex-bot-botlocale-nluconfidencethreshold)
       */
      override fun nluConfidenceThreshold(): Number = unwrap(this).getNluConfidenceThreshold()

      /**
       * One or more slot types defined for the locale.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html#cfn-lex-bot-botlocale-slottypes)
       */
      override fun slotTypes(): Any? = unwrap(this).getSlotTypes()

      /**
       * Defines settings for using an Amazon Polly voice to communicate with a user.
       *
       * Valid values include:
       *
       * * `standard`
       * * `neural`
       * * `long-form`
       * * `generative`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-botlocale.html#cfn-lex-bot-botlocale-voicesettings)
       */
      override fun voiceSettings(): Any? = unwrap(this).getVoiceSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BotLocaleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.BotLocaleProperty):
          BotLocaleProperty = CdkObjectWrappers.wrap(cdkObject) as? BotLocaleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BotLocaleProperty):
          software.amazon.awscdk.services.lex.CfnBot.BotLocaleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.BotLocaleProperty
    }
  }

  /**
   * Describes a button to use on a response card used to gather slot values from a user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * ButtonProperty buttonProperty = ButtonProperty.builder()
   * .text("text")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-button.html)
   */
  public interface ButtonProperty {
    /**
     * The text that appears on the button.
     *
     * Use this to tell the user what value is returned when they choose this button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-button.html#cfn-lex-bot-button-text)
     */
    public fun text(): String

    /**
     * The value returned to Amazon Lex when the user chooses this button.
     *
     * This must be one of the slot values configured for the slot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-button.html#cfn-lex-bot-button-value)
     */
    public fun `value`(): String

    /**
     * A builder for [ButtonProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param text The text that appears on the button. 
       * Use this to tell the user what value is returned when they choose this button.
       */
      public fun text(text: String)

      /**
       * @param value The value returned to Amazon Lex when the user chooses this button. 
       * This must be one of the slot values configured for the slot.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.ButtonProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ButtonProperty.builder()

      /**
       * @param text The text that appears on the button. 
       * Use this to tell the user what value is returned when they choose this button.
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      /**
       * @param value The value returned to Amazon Lex when the user chooses this button. 
       * This must be one of the slot values configured for the slot.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ButtonProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.ButtonProperty,
    ) : CdkObject(cdkObject),
        ButtonProperty {
      /**
       * The text that appears on the button.
       *
       * Use this to tell the user what value is returned when they choose this button.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-button.html#cfn-lex-bot-button-text)
       */
      override fun text(): String = unwrap(this).getText()

      /**
       * The value returned to Amazon Lex when the user chooses this button.
       *
       * This must be one of the slot values configured for the slot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-button.html#cfn-lex-bot-button-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ButtonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ButtonProperty):
          ButtonProperty = CdkObjectWrappers.wrap(cdkObject) as? ButtonProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ButtonProperty):
          software.amazon.awscdk.services.lex.CfnBot.ButtonProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.ButtonProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-cloudwatchloggrouplogdestination.html)
   */
  public interface CloudWatchLogGroupLogDestinationProperty {
    /**
     * The Amazon Resource Name (ARN) of the log group where text and metadata logs are delivered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-cloudwatchloggrouplogdestination.html#cfn-lex-bot-cloudwatchloggrouplogdestination-cloudwatchloggrouparn)
     */
    public fun cloudWatchLogGroupArn(): String

    /**
     * The prefix of the log stream name within the log group that you specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-cloudwatchloggrouplogdestination.html#cfn-lex-bot-cloudwatchloggrouplogdestination-logprefix)
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
          software.amazon.awscdk.services.lex.CfnBot.CloudWatchLogGroupLogDestinationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.CloudWatchLogGroupLogDestinationProperty.builder()

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
          software.amazon.awscdk.services.lex.CfnBot.CloudWatchLogGroupLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.CloudWatchLogGroupLogDestinationProperty,
    ) : CdkObject(cdkObject),
        CloudWatchLogGroupLogDestinationProperty {
      /**
       * The Amazon Resource Name (ARN) of the log group where text and metadata logs are delivered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-cloudwatchloggrouplogdestination.html#cfn-lex-bot-cloudwatchloggrouplogdestination-cloudwatchloggrouparn)
       */
      override fun cloudWatchLogGroupArn(): String = unwrap(this).getCloudWatchLogGroupArn()

      /**
       * The prefix of the log stream name within the log group that you specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-cloudwatchloggrouplogdestination.html#cfn-lex-bot-cloudwatchloggrouplogdestination-logprefix)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.CloudWatchLogGroupLogDestinationProperty):
          CloudWatchLogGroupLogDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchLogGroupLogDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogGroupLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBot.CloudWatchLogGroupLogDestinationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.CloudWatchLogGroupLogDestinationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-codehookspecification.html)
   */
  public interface CodeHookSpecificationProperty {
    /**
     * Specifies a Lambda function that verifies requests to a bot or fulfills the user's request to
     * a bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-codehookspecification.html#cfn-lex-bot-codehookspecification-lambdacodehook)
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
      @JvmName("f451ff6aa6641cca6cfeb3e15e5f3bf09cf1ac49c765ccc771440fd1aeca55fa")
      public fun lambdaCodeHook(lambdaCodeHook: LambdaCodeHookProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.CodeHookSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.CodeHookSpecificationProperty.builder()

      /**
       * @param lambdaCodeHook Specifies a Lambda function that verifies requests to a bot or
       * fulfills the user's request to a bot. 
       */
      override fun lambdaCodeHook(lambdaCodeHook: IResolvable) {
        cdkBuilder.lambdaCodeHook(lambdaCodeHook.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lambdaCodeHook Specifies a Lambda function that verifies requests to a bot or
       * fulfills the user's request to a bot. 
       */
      override fun lambdaCodeHook(lambdaCodeHook: LambdaCodeHookProperty) {
        cdkBuilder.lambdaCodeHook(lambdaCodeHook.let(LambdaCodeHookProperty.Companion::unwrap))
      }

      /**
       * @param lambdaCodeHook Specifies a Lambda function that verifies requests to a bot or
       * fulfills the user's request to a bot. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f451ff6aa6641cca6cfeb3e15e5f3bf09cf1ac49c765ccc771440fd1aeca55fa")
      override fun lambdaCodeHook(lambdaCodeHook: LambdaCodeHookProperty.Builder.() -> Unit): Unit =
          lambdaCodeHook(LambdaCodeHookProperty(lambdaCodeHook))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.CodeHookSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.CodeHookSpecificationProperty,
    ) : CdkObject(cdkObject),
        CodeHookSpecificationProperty {
      /**
       * Specifies a Lambda function that verifies requests to a bot or fulfills the user's request
       * to a bot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-codehookspecification.html#cfn-lex-bot-codehookspecification-lambdacodehook)
       */
      override fun lambdaCodeHook(): Any = unwrap(this).getLambdaCodeHook()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeHookSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.CodeHookSpecificationProperty):
          CodeHookSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CodeHookSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeHookSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.CodeHookSpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.CodeHookSpecificationProperty
    }
  }

  /**
   * Provides an expression that evaluates to true or false.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * ConditionProperty conditionProperty = ConditionProperty.builder()
   * .expressionString("expressionString")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-condition.html)
   */
  public interface ConditionProperty {
    /**
     * The expression string that is evaluated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-condition.html#cfn-lex-bot-condition-expressionstring)
     */
    public fun expressionString(): String

    /**
     * A builder for [ConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expressionString The expression string that is evaluated. 
       */
      public fun expressionString(expressionString: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.ConditionProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ConditionProperty.builder()

      /**
       * @param expressionString The expression string that is evaluated. 
       */
      override fun expressionString(expressionString: String) {
        cdkBuilder.expressionString(expressionString)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.ConditionProperty,
    ) : CdkObject(cdkObject),
        ConditionProperty {
      /**
       * The expression string that is evaluated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-condition.html#cfn-lex-bot-condition-expressionstring)
       */
      override fun expressionString(): String = unwrap(this).getExpressionString()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ConditionProperty):
          ConditionProperty = CdkObjectWrappers.wrap(cdkObject) as? ConditionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionProperty):
          software.amazon.awscdk.services.lex.CfnBot.ConditionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.ConditionProperty
    }
  }

  /**
   * A set of actions that Amazon Lex should run if the condition is matched.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface ConditionalBranchProperty {
    /**
     * Contains the expression to evaluate.
     *
     * If the condition is true, the branch's actions are taken.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalbranch.html#cfn-lex-bot-conditionalbranch-condition)
     */
    public fun condition(): Any

    /**
     * The name of the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalbranch.html#cfn-lex-bot-conditionalbranch-name)
     */
    public fun name(): String

    /**
     * The next step in the conversation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalbranch.html#cfn-lex-bot-conditionalbranch-nextstep)
     */
    public fun nextStep(): Any

    /**
     * Specifies a list of message groups that Amazon Lex uses to respond the user input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalbranch.html#cfn-lex-bot-conditionalbranch-response)
     */
    public fun response(): Any? = unwrap(this).getResponse()

    /**
     * A builder for [ConditionalBranchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param condition Contains the expression to evaluate. 
       * If the condition is true, the branch's actions are taken.
       */
      public fun condition(condition: IResolvable)

      /**
       * @param condition Contains the expression to evaluate. 
       * If the condition is true, the branch's actions are taken.
       */
      public fun condition(condition: ConditionProperty)

      /**
       * @param condition Contains the expression to evaluate. 
       * If the condition is true, the branch's actions are taken.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11ce9bf7ff9dc60669df35d268f9768de4c00dfce3b203c39509df583433b2c4")
      public fun condition(condition: ConditionProperty.Builder.() -> Unit)

      /**
       * @param name The name of the branch. 
       */
      public fun name(name: String)

      /**
       * @param nextStep The next step in the conversation. 
       */
      public fun nextStep(nextStep: IResolvable)

      /**
       * @param nextStep The next step in the conversation. 
       */
      public fun nextStep(nextStep: DialogStateProperty)

      /**
       * @param nextStep The next step in the conversation. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e18a578d8634652a96d8e92406dcc5ce663c32c52c3b3d7d291d742652ecfc07")
      public fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit)

      /**
       * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
       * input.
       */
      public fun response(response: IResolvable)

      /**
       * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
       * input.
       */
      public fun response(response: ResponseSpecificationProperty)

      /**
       * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
       * input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9065059b85189dc70b86cd4de52d600767d744faec4b049c3c1ad709b6288a4")
      public fun response(response: ResponseSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.ConditionalBranchProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ConditionalBranchProperty.builder()

      /**
       * @param condition Contains the expression to evaluate. 
       * If the condition is true, the branch's actions are taken.
       */
      override fun condition(condition: IResolvable) {
        cdkBuilder.condition(condition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param condition Contains the expression to evaluate. 
       * If the condition is true, the branch's actions are taken.
       */
      override fun condition(condition: ConditionProperty) {
        cdkBuilder.condition(condition.let(ConditionProperty.Companion::unwrap))
      }

      /**
       * @param condition Contains the expression to evaluate. 
       * If the condition is true, the branch's actions are taken.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11ce9bf7ff9dc60669df35d268f9768de4c00dfce3b203c39509df583433b2c4")
      override fun condition(condition: ConditionProperty.Builder.() -> Unit): Unit =
          condition(ConditionProperty(condition))

      /**
       * @param name The name of the branch. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param nextStep The next step in the conversation. 
       */
      override fun nextStep(nextStep: IResolvable) {
        cdkBuilder.nextStep(nextStep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nextStep The next step in the conversation. 
       */
      override fun nextStep(nextStep: DialogStateProperty) {
        cdkBuilder.nextStep(nextStep.let(DialogStateProperty.Companion::unwrap))
      }

      /**
       * @param nextStep The next step in the conversation. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e18a578d8634652a96d8e92406dcc5ce663c32c52c3b3d7d291d742652ecfc07")
      override fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          nextStep(DialogStateProperty(nextStep))

      /**
       * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
       * input.
       */
      override fun response(response: IResolvable) {
        cdkBuilder.response(response.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
       * input.
       */
      override fun response(response: ResponseSpecificationProperty) {
        cdkBuilder.response(response.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
       * input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9065059b85189dc70b86cd4de52d600767d744faec4b049c3c1ad709b6288a4")
      override fun response(response: ResponseSpecificationProperty.Builder.() -> Unit): Unit =
          response(ResponseSpecificationProperty(response))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ConditionalBranchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.ConditionalBranchProperty,
    ) : CdkObject(cdkObject),
        ConditionalBranchProperty {
      /**
       * Contains the expression to evaluate.
       *
       * If the condition is true, the branch's actions are taken.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalbranch.html#cfn-lex-bot-conditionalbranch-condition)
       */
      override fun condition(): Any = unwrap(this).getCondition()

      /**
       * The name of the branch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalbranch.html#cfn-lex-bot-conditionalbranch-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The next step in the conversation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalbranch.html#cfn-lex-bot-conditionalbranch-nextstep)
       */
      override fun nextStep(): Any = unwrap(this).getNextStep()

      /**
       * Specifies a list of message groups that Amazon Lex uses to respond the user input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalbranch.html#cfn-lex-bot-conditionalbranch-response)
       */
      override fun response(): Any? = unwrap(this).getResponse()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionalBranchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ConditionalBranchProperty):
          ConditionalBranchProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConditionalBranchProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionalBranchProperty):
          software.amazon.awscdk.services.lex.CfnBot.ConditionalBranchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.ConditionalBranchProperty
    }
  }

  /**
   * Provides a list of conditional branches.
   *
   * Branches are evaluated in the order that they are entered in the list. The first branch with a
   * condition that evaluates to true is executed. The last branch in the list is the default branch.
   * The default branch should not have any condition expression. The default branch is executed if no
   * other branch has a matching condition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface ConditionalSpecificationProperty {
    /**
     * A list of conditional branches.
     *
     * A conditional branch is made up of a condition, a response and a next step. The response and
     * next step are executed when the condition is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalspecification.html#cfn-lex-bot-conditionalspecification-conditionalbranches)
     */
    public fun conditionalBranches(): Any

    /**
     * The conditional branch that should be followed when the conditions for other branches are not
     * satisfied.
     *
     * A conditional branch is made up of a condition, a response and a next step.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalspecification.html#cfn-lex-bot-conditionalspecification-defaultbranch)
     */
    public fun defaultBranch(): Any

    /**
     * Determines whether a conditional branch is active.
     *
     * When `IsActive` is false, the conditions are not evaluated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalspecification.html#cfn-lex-bot-conditionalspecification-isactive)
     */
    public fun isActive(): Any

    /**
     * A builder for [ConditionalSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditionalBranches A list of conditional branches. 
       * A conditional branch is made up of a condition, a response and a next step. The response
       * and next step are executed when the condition is true.
       */
      public fun conditionalBranches(conditionalBranches: IResolvable)

      /**
       * @param conditionalBranches A list of conditional branches. 
       * A conditional branch is made up of a condition, a response and a next step. The response
       * and next step are executed when the condition is true.
       */
      public fun conditionalBranches(conditionalBranches: List<Any>)

      /**
       * @param conditionalBranches A list of conditional branches. 
       * A conditional branch is made up of a condition, a response and a next step. The response
       * and next step are executed when the condition is true.
       */
      public fun conditionalBranches(vararg conditionalBranches: Any)

      /**
       * @param defaultBranch The conditional branch that should be followed when the conditions for
       * other branches are not satisfied. 
       * A conditional branch is made up of a condition, a response and a next step.
       */
      public fun defaultBranch(defaultBranch: IResolvable)

      /**
       * @param defaultBranch The conditional branch that should be followed when the conditions for
       * other branches are not satisfied. 
       * A conditional branch is made up of a condition, a response and a next step.
       */
      public fun defaultBranch(defaultBranch: DefaultConditionalBranchProperty)

      /**
       * @param defaultBranch The conditional branch that should be followed when the conditions for
       * other branches are not satisfied. 
       * A conditional branch is made up of a condition, a response and a next step.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8465b4eb64780ec7bd22a99567e635215386c79236bff84295669a1035c5e230")
      public fun defaultBranch(defaultBranch: DefaultConditionalBranchProperty.Builder.() -> Unit)

      /**
       * @param isActive Determines whether a conditional branch is active. 
       * When `IsActive` is false, the conditions are not evaluated.
       */
      public fun isActive(isActive: Boolean)

      /**
       * @param isActive Determines whether a conditional branch is active. 
       * When `IsActive` is false, the conditions are not evaluated.
       */
      public fun isActive(isActive: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.ConditionalSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ConditionalSpecificationProperty.builder()

      /**
       * @param conditionalBranches A list of conditional branches. 
       * A conditional branch is made up of a condition, a response and a next step. The response
       * and next step are executed when the condition is true.
       */
      override fun conditionalBranches(conditionalBranches: IResolvable) {
        cdkBuilder.conditionalBranches(conditionalBranches.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conditionalBranches A list of conditional branches. 
       * A conditional branch is made up of a condition, a response and a next step. The response
       * and next step are executed when the condition is true.
       */
      override fun conditionalBranches(conditionalBranches: List<Any>) {
        cdkBuilder.conditionalBranches(conditionalBranches.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param conditionalBranches A list of conditional branches. 
       * A conditional branch is made up of a condition, a response and a next step. The response
       * and next step are executed when the condition is true.
       */
      override fun conditionalBranches(vararg conditionalBranches: Any): Unit =
          conditionalBranches(conditionalBranches.toList())

      /**
       * @param defaultBranch The conditional branch that should be followed when the conditions for
       * other branches are not satisfied. 
       * A conditional branch is made up of a condition, a response and a next step.
       */
      override fun defaultBranch(defaultBranch: IResolvable) {
        cdkBuilder.defaultBranch(defaultBranch.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultBranch The conditional branch that should be followed when the conditions for
       * other branches are not satisfied. 
       * A conditional branch is made up of a condition, a response and a next step.
       */
      override fun defaultBranch(defaultBranch: DefaultConditionalBranchProperty) {
        cdkBuilder.defaultBranch(defaultBranch.let(DefaultConditionalBranchProperty.Companion::unwrap))
      }

      /**
       * @param defaultBranch The conditional branch that should be followed when the conditions for
       * other branches are not satisfied. 
       * A conditional branch is made up of a condition, a response and a next step.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8465b4eb64780ec7bd22a99567e635215386c79236bff84295669a1035c5e230")
      override
          fun defaultBranch(defaultBranch: DefaultConditionalBranchProperty.Builder.() -> Unit):
          Unit = defaultBranch(DefaultConditionalBranchProperty(defaultBranch))

      /**
       * @param isActive Determines whether a conditional branch is active. 
       * When `IsActive` is false, the conditions are not evaluated.
       */
      override fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
      }

      /**
       * @param isActive Determines whether a conditional branch is active. 
       * When `IsActive` is false, the conditions are not evaluated.
       */
      override fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.ConditionalSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.ConditionalSpecificationProperty,
    ) : CdkObject(cdkObject),
        ConditionalSpecificationProperty {
      /**
       * A list of conditional branches.
       *
       * A conditional branch is made up of a condition, a response and a next step. The response
       * and next step are executed when the condition is true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalspecification.html#cfn-lex-bot-conditionalspecification-conditionalbranches)
       */
      override fun conditionalBranches(): Any = unwrap(this).getConditionalBranches()

      /**
       * The conditional branch that should be followed when the conditions for other branches are
       * not satisfied.
       *
       * A conditional branch is made up of a condition, a response and a next step.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalspecification.html#cfn-lex-bot-conditionalspecification-defaultbranch)
       */
      override fun defaultBranch(): Any = unwrap(this).getDefaultBranch()

      /**
       * Determines whether a conditional branch is active.
       *
       * When `IsActive` is false, the conditions are not evaluated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalspecification.html#cfn-lex-bot-conditionalspecification-isactive)
       */
      override fun isActive(): Any = unwrap(this).getIsActive()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionalSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ConditionalSpecificationProperty):
          ConditionalSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConditionalSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionalSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.ConditionalSpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.ConditionalSpecificationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conversationlogsettings.html)
   */
  public interface ConversationLogSettingsProperty {
    /**
     * The Amazon S3 settings for logging audio to an S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conversationlogsettings.html#cfn-lex-bot-conversationlogsettings-audiologsettings)
     */
    public fun audioLogSettings(): Any? = unwrap(this).getAudioLogSettings()

    /**
     * The Amazon CloudWatch Logs settings for logging text and metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conversationlogsettings.html#cfn-lex-bot-conversationlogsettings-textlogsettings)
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
          software.amazon.awscdk.services.lex.CfnBot.ConversationLogSettingsProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ConversationLogSettingsProperty.builder()

      /**
       * @param audioLogSettings The Amazon S3 settings for logging audio to an S3 bucket.
       */
      override fun audioLogSettings(audioLogSettings: IResolvable) {
        cdkBuilder.audioLogSettings(audioLogSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param audioLogSettings The Amazon S3 settings for logging audio to an S3 bucket.
       */
      override fun audioLogSettings(audioLogSettings: List<Any>) {
        cdkBuilder.audioLogSettings(audioLogSettings.map{CdkObjectWrappers.unwrap(it)})
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
        cdkBuilder.textLogSettings(textLogSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param textLogSettings The Amazon CloudWatch Logs settings for logging text and metadata.
       */
      override fun textLogSettings(textLogSettings: List<Any>) {
        cdkBuilder.textLogSettings(textLogSettings.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param textLogSettings The Amazon CloudWatch Logs settings for logging text and metadata.
       */
      override fun textLogSettings(vararg textLogSettings: Any): Unit =
          textLogSettings(textLogSettings.toList())

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ConversationLogSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.ConversationLogSettingsProperty,
    ) : CdkObject(cdkObject),
        ConversationLogSettingsProperty {
      /**
       * The Amazon S3 settings for logging audio to an S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conversationlogsettings.html#cfn-lex-bot-conversationlogsettings-audiologsettings)
       */
      override fun audioLogSettings(): Any? = unwrap(this).getAudioLogSettings()

      /**
       * The Amazon CloudWatch Logs settings for logging text and metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conversationlogsettings.html#cfn-lex-bot-conversationlogsettings-textlogsettings)
       */
      override fun textLogSettings(): Any? = unwrap(this).getTextLogSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConversationLogSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ConversationLogSettingsProperty):
          ConversationLogSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConversationLogSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConversationLogSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBot.ConversationLogSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.ConversationLogSettingsProperty
    }
  }

  /**
   * A custom response string that Amazon Lex sends to your application.
   *
   * You define the content and structure the string.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * CustomPayloadProperty customPayloadProperty = CustomPayloadProperty.builder()
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-custompayload.html)
   */
  public interface CustomPayloadProperty {
    /**
     * The string that is sent to your application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-custompayload.html#cfn-lex-bot-custompayload-value)
     */
    public fun `value`(): String

    /**
     * A builder for [CustomPayloadProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The string that is sent to your application. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.CustomPayloadProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.CustomPayloadProperty.builder()

      /**
       * @param value The string that is sent to your application. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.CustomPayloadProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.CustomPayloadProperty,
    ) : CdkObject(cdkObject),
        CustomPayloadProperty {
      /**
       * The string that is sent to your application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-custompayload.html#cfn-lex-bot-custompayload-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomPayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.CustomPayloadProperty):
          CustomPayloadProperty = CdkObjectWrappers.wrap(cdkObject) as? CustomPayloadProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomPayloadProperty):
          software.amazon.awscdk.services.lex.CfnBot.CustomPayloadProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.CustomPayloadProperty
    }
  }

  /**
   * Specifies an entry in a custom vocabulary.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface CustomVocabularyItemProperty {
    /**
     * The DisplayAs value for the custom vocabulary item from the custom vocabulary list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-customvocabularyitem.html#cfn-lex-bot-customvocabularyitem-displayas)
     */
    public fun displayAs(): String? = unwrap(this).getDisplayAs()

    /**
     * Specifies 1 - 4 words that should be recognized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-customvocabularyitem.html#cfn-lex-bot-customvocabularyitem-phrase)
     */
    public fun phrase(): String

    /**
     * Specifies the degree to which the phrase recognition is boosted.
     *
     * The default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-customvocabularyitem.html#cfn-lex-bot-customvocabularyitem-weight)
     */
    public fun weight(): Number? = unwrap(this).getWeight()

    /**
     * A builder for [CustomVocabularyItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param displayAs The DisplayAs value for the custom vocabulary item from the custom
       * vocabulary list.
       */
      public fun displayAs(displayAs: String)

      /**
       * @param phrase Specifies 1 - 4 words that should be recognized. 
       */
      public fun phrase(phrase: String)

      /**
       * @param weight Specifies the degree to which the phrase recognition is boosted.
       * The default value is 1.
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyItemProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyItemProperty.builder()

      /**
       * @param displayAs The DisplayAs value for the custom vocabulary item from the custom
       * vocabulary list.
       */
      override fun displayAs(displayAs: String) {
        cdkBuilder.displayAs(displayAs)
      }

      /**
       * @param phrase Specifies 1 - 4 words that should be recognized. 
       */
      override fun phrase(phrase: String) {
        cdkBuilder.phrase(phrase)
      }

      /**
       * @param weight Specifies the degree to which the phrase recognition is boosted.
       * The default value is 1.
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyItemProperty,
    ) : CdkObject(cdkObject),
        CustomVocabularyItemProperty {
      /**
       * The DisplayAs value for the custom vocabulary item from the custom vocabulary list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-customvocabularyitem.html#cfn-lex-bot-customvocabularyitem-displayas)
       */
      override fun displayAs(): String? = unwrap(this).getDisplayAs()

      /**
       * Specifies 1 - 4 words that should be recognized.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-customvocabularyitem.html#cfn-lex-bot-customvocabularyitem-phrase)
       */
      override fun phrase(): String = unwrap(this).getPhrase()

      /**
       * Specifies the degree to which the phrase recognition is boosted.
       *
       * The default value is 1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-customvocabularyitem.html#cfn-lex-bot-customvocabularyitem-weight)
       */
      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomVocabularyItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyItemProperty):
          CustomVocabularyItemProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomVocabularyItemProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomVocabularyItemProperty):
          software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyItemProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyItemProperty
    }
  }

  /**
   * Specifies a custom vocabulary.
   *
   * A custom vocabulary is a list of words that you expect to be used during a conversation with
   * your bot.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface CustomVocabularyProperty {
    /**
     * Specifies a list of words that you expect to be used during a conversation with your bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-customvocabulary.html#cfn-lex-bot-customvocabulary-customvocabularyitems)
     */
    public fun customVocabularyItems(): Any

    /**
     * A builder for [CustomVocabularyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customVocabularyItems Specifies a list of words that you expect to be used during a
       * conversation with your bot. 
       */
      public fun customVocabularyItems(customVocabularyItems: IResolvable)

      /**
       * @param customVocabularyItems Specifies a list of words that you expect to be used during a
       * conversation with your bot. 
       */
      public fun customVocabularyItems(customVocabularyItems: List<Any>)

      /**
       * @param customVocabularyItems Specifies a list of words that you expect to be used during a
       * conversation with your bot. 
       */
      public fun customVocabularyItems(vararg customVocabularyItems: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyProperty.builder()

      /**
       * @param customVocabularyItems Specifies a list of words that you expect to be used during a
       * conversation with your bot. 
       */
      override fun customVocabularyItems(customVocabularyItems: IResolvable) {
        cdkBuilder.customVocabularyItems(customVocabularyItems.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customVocabularyItems Specifies a list of words that you expect to be used during a
       * conversation with your bot. 
       */
      override fun customVocabularyItems(customVocabularyItems: List<Any>) {
        cdkBuilder.customVocabularyItems(customVocabularyItems.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param customVocabularyItems Specifies a list of words that you expect to be used during a
       * conversation with your bot. 
       */
      override fun customVocabularyItems(vararg customVocabularyItems: Any): Unit =
          customVocabularyItems(customVocabularyItems.toList())

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyProperty,
    ) : CdkObject(cdkObject),
        CustomVocabularyProperty {
      /**
       * Specifies a list of words that you expect to be used during a conversation with your bot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-customvocabulary.html#cfn-lex-bot-customvocabulary-customvocabularyitems)
       */
      override fun customVocabularyItems(): Any = unwrap(this).getCustomVocabularyItems()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomVocabularyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyProperty):
          CustomVocabularyProperty = CdkObjectWrappers.wrap(cdkObject) as? CustomVocabularyProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomVocabularyProperty):
          software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.CustomVocabularyProperty
    }
  }

  /**
   * Specifies the DTMF input specifications.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface DTMFSpecificationProperty {
    /**
     * The DTMF character that clears the accumulated DTMF digits and immediately ends the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dtmfspecification.html#cfn-lex-bot-dtmfspecification-deletioncharacter)
     */
    public fun deletionCharacter(): String

    /**
     * The DTMF character that immediately ends input.
     *
     * If the user does not press this character, the input ends after the end timeout.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dtmfspecification.html#cfn-lex-bot-dtmfspecification-endcharacter)
     */
    public fun endCharacter(): String

    /**
     * How long the bot should wait after the last DTMF character input before assuming that the
     * input has concluded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dtmfspecification.html#cfn-lex-bot-dtmfspecification-endtimeoutms)
     */
    public fun endTimeoutMs(): Number

    /**
     * The maximum number of DTMF digits allowed in an utterance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dtmfspecification.html#cfn-lex-bot-dtmfspecification-maxlength)
     */
    public fun maxLength(): Number

    /**
     * A builder for [DTMFSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deletionCharacter The DTMF character that clears the accumulated DTMF digits and
       * immediately ends the input. 
       */
      public fun deletionCharacter(deletionCharacter: String)

      /**
       * @param endCharacter The DTMF character that immediately ends input. 
       * If the user does not press this character, the input ends after the end timeout.
       */
      public fun endCharacter(endCharacter: String)

      /**
       * @param endTimeoutMs How long the bot should wait after the last DTMF character input before
       * assuming that the input has concluded. 
       */
      public fun endTimeoutMs(endTimeoutMs: Number)

      /**
       * @param maxLength The maximum number of DTMF digits allowed in an utterance. 
       */
      public fun maxLength(maxLength: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.DTMFSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.DTMFSpecificationProperty.builder()

      /**
       * @param deletionCharacter The DTMF character that clears the accumulated DTMF digits and
       * immediately ends the input. 
       */
      override fun deletionCharacter(deletionCharacter: String) {
        cdkBuilder.deletionCharacter(deletionCharacter)
      }

      /**
       * @param endCharacter The DTMF character that immediately ends input. 
       * If the user does not press this character, the input ends after the end timeout.
       */
      override fun endCharacter(endCharacter: String) {
        cdkBuilder.endCharacter(endCharacter)
      }

      /**
       * @param endTimeoutMs How long the bot should wait after the last DTMF character input before
       * assuming that the input has concluded. 
       */
      override fun endTimeoutMs(endTimeoutMs: Number) {
        cdkBuilder.endTimeoutMs(endTimeoutMs)
      }

      /**
       * @param maxLength The maximum number of DTMF digits allowed in an utterance. 
       */
      override fun maxLength(maxLength: Number) {
        cdkBuilder.maxLength(maxLength)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.DTMFSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.DTMFSpecificationProperty,
    ) : CdkObject(cdkObject),
        DTMFSpecificationProperty {
      /**
       * The DTMF character that clears the accumulated DTMF digits and immediately ends the input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dtmfspecification.html#cfn-lex-bot-dtmfspecification-deletioncharacter)
       */
      override fun deletionCharacter(): String = unwrap(this).getDeletionCharacter()

      /**
       * The DTMF character that immediately ends input.
       *
       * If the user does not press this character, the input ends after the end timeout.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dtmfspecification.html#cfn-lex-bot-dtmfspecification-endcharacter)
       */
      override fun endCharacter(): String = unwrap(this).getEndCharacter()

      /**
       * How long the bot should wait after the last DTMF character input before assuming that the
       * input has concluded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dtmfspecification.html#cfn-lex-bot-dtmfspecification-endtimeoutms)
       */
      override fun endTimeoutMs(): Number = unwrap(this).getEndTimeoutMs()

      /**
       * The maximum number of DTMF digits allowed in an utterance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dtmfspecification.html#cfn-lex-bot-dtmfspecification-maxlength)
       */
      override fun maxLength(): Number = unwrap(this).getMaxLength()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DTMFSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.DTMFSpecificationProperty):
          DTMFSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DTMFSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DTMFSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.DTMFSpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.DTMFSpecificationProperty
    }
  }

  /**
   * By default, data stored by Amazon Lex is encrypted.
   *
   * The `DataPrivacy` structure provides settings that determine how Amazon Lex handles special
   * cases of securing the data for your bot.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * DataPrivacyProperty dataPrivacyProperty = DataPrivacyProperty.builder()
   * .childDirected(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dataprivacy.html)
   */
  public interface DataPrivacyProperty {
    /**
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify
     * whether your use of Amazon Lex is related to a website, program, or other application that is
     * directed or targeted, in whole or in part, to children under age 13 and subject to the
     * Children's Online Privacy Protection Act (COPPA) by specifying `true` or `false` in the
     * `childDirected` field.
     *
     * By specifying `true` in the `childDirected` field, you confirm that your use of Amazon Lex
     * *is* related to a website, program, or other application that is directed or targeted, in whole
     * or in part, to children under age 13 and subject to COPPA. By specifying `false` in the
     * `childDirected` field, you confirm that your use of Amazon Lex *is not* related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children
     * under age 13 and subject to COPPA. You may not specify a default value for the `childDirected`
     * field that does not accurately reflect whether your use of Amazon Lex is related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children
     * under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or
     * other application that is directed in whole or in part, to children under age 13, you must
     * obtain any required verifiable parental consent under COPPA. For information regarding the use
     * of Amazon Lex in connection with websites, programs, or other applications that are directed or
     * targeted, in whole or in part, to children under age 13, see the [Amazon Lex
     * FAQ](https://docs.aws.amazon.com/lex/faqs#data-security) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dataprivacy.html#cfn-lex-bot-dataprivacy-childdirected)
     */
    public fun childDirected(): Any

    /**
     * A builder for [DataPrivacyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param childDirected For each Amazon Lex bot created with the Amazon Lex Model Building
       * Service, you must specify whether your use of Amazon Lex is related to a website, program, or
       * other application that is directed or targeted, in whole or in part, to children under age 13
       * and subject to the Children's Online Privacy Protection Act (COPPA) by specifying `true` or
       * `false` in the `childDirected` field. 
       * By specifying `true` in the `childDirected` field, you confirm that your use of Amazon Lex
       * *is* related to a website, program, or other application that is directed or targeted, in
       * whole or in part, to children under age 13 and subject to COPPA. By specifying `false` in the
       * `childDirected` field, you confirm that your use of Amazon Lex *is not* related to a website,
       * program, or other application that is directed or targeted, in whole or in part, to children
       * under age 13 and subject to COPPA. You may not specify a default value for the `childDirected`
       * field that does not accurately reflect whether your use of Amazon Lex is related to a website,
       * program, or other application that is directed or targeted, in whole or in part, to children
       * under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or
       * other application that is directed in whole or in part, to children under age 13, you must
       * obtain any required verifiable parental consent under COPPA. For information regarding the use
       * of Amazon Lex in connection with websites, programs, or other applications that are directed
       * or targeted, in whole or in part, to children under age 13, see the [Amazon Lex
       * FAQ](https://docs.aws.amazon.com/lex/faqs#data-security) .
       */
      public fun childDirected(childDirected: Boolean)

      /**
       * @param childDirected For each Amazon Lex bot created with the Amazon Lex Model Building
       * Service, you must specify whether your use of Amazon Lex is related to a website, program, or
       * other application that is directed or targeted, in whole or in part, to children under age 13
       * and subject to the Children's Online Privacy Protection Act (COPPA) by specifying `true` or
       * `false` in the `childDirected` field. 
       * By specifying `true` in the `childDirected` field, you confirm that your use of Amazon Lex
       * *is* related to a website, program, or other application that is directed or targeted, in
       * whole or in part, to children under age 13 and subject to COPPA. By specifying `false` in the
       * `childDirected` field, you confirm that your use of Amazon Lex *is not* related to a website,
       * program, or other application that is directed or targeted, in whole or in part, to children
       * under age 13 and subject to COPPA. You may not specify a default value for the `childDirected`
       * field that does not accurately reflect whether your use of Amazon Lex is related to a website,
       * program, or other application that is directed or targeted, in whole or in part, to children
       * under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or
       * other application that is directed in whole or in part, to children under age 13, you must
       * obtain any required verifiable parental consent under COPPA. For information regarding the use
       * of Amazon Lex in connection with websites, programs, or other applications that are directed
       * or targeted, in whole or in part, to children under age 13, see the [Amazon Lex
       * FAQ](https://docs.aws.amazon.com/lex/faqs#data-security) .
       */
      public fun childDirected(childDirected: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.DataPrivacyProperty.Builder
          = software.amazon.awscdk.services.lex.CfnBot.DataPrivacyProperty.builder()

      /**
       * @param childDirected For each Amazon Lex bot created with the Amazon Lex Model Building
       * Service, you must specify whether your use of Amazon Lex is related to a website, program, or
       * other application that is directed or targeted, in whole or in part, to children under age 13
       * and subject to the Children's Online Privacy Protection Act (COPPA) by specifying `true` or
       * `false` in the `childDirected` field. 
       * By specifying `true` in the `childDirected` field, you confirm that your use of Amazon Lex
       * *is* related to a website, program, or other application that is directed or targeted, in
       * whole or in part, to children under age 13 and subject to COPPA. By specifying `false` in the
       * `childDirected` field, you confirm that your use of Amazon Lex *is not* related to a website,
       * program, or other application that is directed or targeted, in whole or in part, to children
       * under age 13 and subject to COPPA. You may not specify a default value for the `childDirected`
       * field that does not accurately reflect whether your use of Amazon Lex is related to a website,
       * program, or other application that is directed or targeted, in whole or in part, to children
       * under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or
       * other application that is directed in whole or in part, to children under age 13, you must
       * obtain any required verifiable parental consent under COPPA. For information regarding the use
       * of Amazon Lex in connection with websites, programs, or other applications that are directed
       * or targeted, in whole or in part, to children under age 13, see the [Amazon Lex
       * FAQ](https://docs.aws.amazon.com/lex/faqs#data-security) .
       */
      override fun childDirected(childDirected: Boolean) {
        cdkBuilder.childDirected(childDirected)
      }

      /**
       * @param childDirected For each Amazon Lex bot created with the Amazon Lex Model Building
       * Service, you must specify whether your use of Amazon Lex is related to a website, program, or
       * other application that is directed or targeted, in whole or in part, to children under age 13
       * and subject to the Children's Online Privacy Protection Act (COPPA) by specifying `true` or
       * `false` in the `childDirected` field. 
       * By specifying `true` in the `childDirected` field, you confirm that your use of Amazon Lex
       * *is* related to a website, program, or other application that is directed or targeted, in
       * whole or in part, to children under age 13 and subject to COPPA. By specifying `false` in the
       * `childDirected` field, you confirm that your use of Amazon Lex *is not* related to a website,
       * program, or other application that is directed or targeted, in whole or in part, to children
       * under age 13 and subject to COPPA. You may not specify a default value for the `childDirected`
       * field that does not accurately reflect whether your use of Amazon Lex is related to a website,
       * program, or other application that is directed or targeted, in whole or in part, to children
       * under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or
       * other application that is directed in whole or in part, to children under age 13, you must
       * obtain any required verifiable parental consent under COPPA. For information regarding the use
       * of Amazon Lex in connection with websites, programs, or other applications that are directed
       * or targeted, in whole or in part, to children under age 13, see the [Amazon Lex
       * FAQ](https://docs.aws.amazon.com/lex/faqs#data-security) .
       */
      override fun childDirected(childDirected: IResolvable) {
        cdkBuilder.childDirected(childDirected.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.DataPrivacyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.DataPrivacyProperty,
    ) : CdkObject(cdkObject),
        DataPrivacyProperty {
      /**
       * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must
       * specify whether your use of Amazon Lex is related to a website, program, or other application
       * that is directed or targeted, in whole or in part, to children under age 13 and subject to the
       * Children's Online Privacy Protection Act (COPPA) by specifying `true` or `false` in the
       * `childDirected` field.
       *
       * By specifying `true` in the `childDirected` field, you confirm that your use of Amazon Lex
       * *is* related to a website, program, or other application that is directed or targeted, in
       * whole or in part, to children under age 13 and subject to COPPA. By specifying `false` in the
       * `childDirected` field, you confirm that your use of Amazon Lex *is not* related to a website,
       * program, or other application that is directed or targeted, in whole or in part, to children
       * under age 13 and subject to COPPA. You may not specify a default value for the `childDirected`
       * field that does not accurately reflect whether your use of Amazon Lex is related to a website,
       * program, or other application that is directed or targeted, in whole or in part, to children
       * under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or
       * other application that is directed in whole or in part, to children under age 13, you must
       * obtain any required verifiable parental consent under COPPA. For information regarding the use
       * of Amazon Lex in connection with websites, programs, or other applications that are directed
       * or targeted, in whole or in part, to children under age 13, see the [Amazon Lex
       * FAQ](https://docs.aws.amazon.com/lex/faqs#data-security) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dataprivacy.html#cfn-lex-bot-dataprivacy-childdirected)
       */
      override fun childDirected(): Any = unwrap(this).getChildDirected()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataPrivacyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.DataPrivacyProperty):
          DataPrivacyProperty = CdkObjectWrappers.wrap(cdkObject) as? DataPrivacyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataPrivacyProperty):
          software.amazon.awscdk.services.lex.CfnBot.DataPrivacyProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.DataPrivacyProperty
    }
  }

  /**
   * A set of actions that Amazon Lex should run if none of the other conditions are met.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface DefaultConditionalBranchProperty {
    /**
     * The next step in the conversation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-defaultconditionalbranch.html#cfn-lex-bot-defaultconditionalbranch-nextstep)
     */
    public fun nextStep(): Any? = unwrap(this).getNextStep()

    /**
     * Specifies a list of message groups that Amazon Lex uses to respond the user input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-defaultconditionalbranch.html#cfn-lex-bot-defaultconditionalbranch-response)
     */
    public fun response(): Any? = unwrap(this).getResponse()

    /**
     * A builder for [DefaultConditionalBranchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param nextStep The next step in the conversation.
       */
      public fun nextStep(nextStep: IResolvable)

      /**
       * @param nextStep The next step in the conversation.
       */
      public fun nextStep(nextStep: DialogStateProperty)

      /**
       * @param nextStep The next step in the conversation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89aceef262d7ed6df781299b5d6cad4eecf33f3ecd8db033597be3cbf6a902e9")
      public fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit)

      /**
       * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
       * input.
       */
      public fun response(response: IResolvable)

      /**
       * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
       * input.
       */
      public fun response(response: ResponseSpecificationProperty)

      /**
       * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
       * input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("985db97b61adca9413449a7b508b3d0e34cdfe8e12320cbb6ad08b2280597470")
      public fun response(response: ResponseSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.DefaultConditionalBranchProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.DefaultConditionalBranchProperty.builder()

      /**
       * @param nextStep The next step in the conversation.
       */
      override fun nextStep(nextStep: IResolvable) {
        cdkBuilder.nextStep(nextStep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nextStep The next step in the conversation.
       */
      override fun nextStep(nextStep: DialogStateProperty) {
        cdkBuilder.nextStep(nextStep.let(DialogStateProperty.Companion::unwrap))
      }

      /**
       * @param nextStep The next step in the conversation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89aceef262d7ed6df781299b5d6cad4eecf33f3ecd8db033597be3cbf6a902e9")
      override fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          nextStep(DialogStateProperty(nextStep))

      /**
       * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
       * input.
       */
      override fun response(response: IResolvable) {
        cdkBuilder.response(response.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
       * input.
       */
      override fun response(response: ResponseSpecificationProperty) {
        cdkBuilder.response(response.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
       * input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("985db97b61adca9413449a7b508b3d0e34cdfe8e12320cbb6ad08b2280597470")
      override fun response(response: ResponseSpecificationProperty.Builder.() -> Unit): Unit =
          response(ResponseSpecificationProperty(response))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.DefaultConditionalBranchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.DefaultConditionalBranchProperty,
    ) : CdkObject(cdkObject),
        DefaultConditionalBranchProperty {
      /**
       * The next step in the conversation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-defaultconditionalbranch.html#cfn-lex-bot-defaultconditionalbranch-nextstep)
       */
      override fun nextStep(): Any? = unwrap(this).getNextStep()

      /**
       * Specifies a list of message groups that Amazon Lex uses to respond the user input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-defaultconditionalbranch.html#cfn-lex-bot-defaultconditionalbranch-response)
       */
      override fun response(): Any? = unwrap(this).getResponse()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultConditionalBranchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.DefaultConditionalBranchProperty):
          DefaultConditionalBranchProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DefaultConditionalBranchProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultConditionalBranchProperty):
          software.amazon.awscdk.services.lex.CfnBot.DefaultConditionalBranchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.DefaultConditionalBranchProperty
    }
  }

  /**
   * Defines the action that the bot executes at runtime when the conversation reaches this step.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface DialogActionProperty {
    /**
     * If the dialog action is `ElicitSlot` , defines the slot to elicit from the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogaction.html#cfn-lex-bot-dialogaction-slottoelicit)
     */
    public fun slotToElicit(): String? = unwrap(this).getSlotToElicit()

    /**
     * When true the next message for the intent is not used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogaction.html#cfn-lex-bot-dialogaction-suppressnextmessage)
     */
    public fun suppressNextMessage(): Any? = unwrap(this).getSuppressNextMessage()

    /**
     * The action that the bot should execute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogaction.html#cfn-lex-bot-dialogaction-type)
     */
    public fun type(): String

    /**
     * A builder for [DialogActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param slotToElicit If the dialog action is `ElicitSlot` , defines the slot to elicit from
       * the user.
       */
      public fun slotToElicit(slotToElicit: String)

      /**
       * @param suppressNextMessage When true the next message for the intent is not used.
       */
      public fun suppressNextMessage(suppressNextMessage: Boolean)

      /**
       * @param suppressNextMessage When true the next message for the intent is not used.
       */
      public fun suppressNextMessage(suppressNextMessage: IResolvable)

      /**
       * @param type The action that the bot should execute. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.DialogActionProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.DialogActionProperty.builder()

      /**
       * @param slotToElicit If the dialog action is `ElicitSlot` , defines the slot to elicit from
       * the user.
       */
      override fun slotToElicit(slotToElicit: String) {
        cdkBuilder.slotToElicit(slotToElicit)
      }

      /**
       * @param suppressNextMessage When true the next message for the intent is not used.
       */
      override fun suppressNextMessage(suppressNextMessage: Boolean) {
        cdkBuilder.suppressNextMessage(suppressNextMessage)
      }

      /**
       * @param suppressNextMessage When true the next message for the intent is not used.
       */
      override fun suppressNextMessage(suppressNextMessage: IResolvable) {
        cdkBuilder.suppressNextMessage(suppressNextMessage.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param type The action that the bot should execute. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.DialogActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.DialogActionProperty,
    ) : CdkObject(cdkObject),
        DialogActionProperty {
      /**
       * If the dialog action is `ElicitSlot` , defines the slot to elicit from the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogaction.html#cfn-lex-bot-dialogaction-slottoelicit)
       */
      override fun slotToElicit(): String? = unwrap(this).getSlotToElicit()

      /**
       * When true the next message for the intent is not used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogaction.html#cfn-lex-bot-dialogaction-suppressnextmessage)
       */
      override fun suppressNextMessage(): Any? = unwrap(this).getSuppressNextMessage()

      /**
       * The action that the bot should execute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogaction.html#cfn-lex-bot-dialogaction-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DialogActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.DialogActionProperty):
          DialogActionProperty = CdkObjectWrappers.wrap(cdkObject) as? DialogActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DialogActionProperty):
          software.amazon.awscdk.services.lex.CfnBot.DialogActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.DialogActionProperty
    }
  }

  /**
   * Settings that specify the dialog code hook that is called by Amazon Lex at a step of the
   * conversation.
   *
   * Example:
   *
   * ```
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehookinvocationsetting.html)
   */
  public interface DialogCodeHookInvocationSettingProperty {
    /**
     * Indicates whether a Lambda function should be invoked for the dialog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehookinvocationsetting.html#cfn-lex-bot-dialogcodehookinvocationsetting-enablecodehookinvocation)
     */
    public fun enableCodeHookInvocation(): Any

    /**
     * A label that indicates the dialog step from which the dialog code hook is happening.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehookinvocationsetting.html#cfn-lex-bot-dialogcodehookinvocationsetting-invocationlabel)
     */
    public fun invocationLabel(): String? = unwrap(this).getInvocationLabel()

    /**
     * Determines whether a dialog code hook is used when the intent is activated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehookinvocationsetting.html#cfn-lex-bot-dialogcodehookinvocationsetting-isactive)
     */
    public fun isActive(): Any

    /**
     * Contains the responses and actions that Amazon Lex takes after the Lambda function is
     * complete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehookinvocationsetting.html#cfn-lex-bot-dialogcodehookinvocationsetting-postcodehookspecification)
     */
    public fun postCodeHookSpecification(): Any

    /**
     * A builder for [DialogCodeHookInvocationSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableCodeHookInvocation Indicates whether a Lambda function should be invoked for
       * the dialog. 
       */
      public fun enableCodeHookInvocation(enableCodeHookInvocation: Boolean)

      /**
       * @param enableCodeHookInvocation Indicates whether a Lambda function should be invoked for
       * the dialog. 
       */
      public fun enableCodeHookInvocation(enableCodeHookInvocation: IResolvable)

      /**
       * @param invocationLabel A label that indicates the dialog step from which the dialog code
       * hook is happening.
       */
      public fun invocationLabel(invocationLabel: String)

      /**
       * @param isActive Determines whether a dialog code hook is used when the intent is activated.
       * 
       */
      public fun isActive(isActive: Boolean)

      /**
       * @param isActive Determines whether a dialog code hook is used when the intent is activated.
       * 
       */
      public fun isActive(isActive: IResolvable)

      /**
       * @param postCodeHookSpecification Contains the responses and actions that Amazon Lex takes
       * after the Lambda function is complete. 
       */
      public fun postCodeHookSpecification(postCodeHookSpecification: IResolvable)

      /**
       * @param postCodeHookSpecification Contains the responses and actions that Amazon Lex takes
       * after the Lambda function is complete. 
       */
      public
          fun postCodeHookSpecification(postCodeHookSpecification: PostDialogCodeHookInvocationSpecificationProperty)

      /**
       * @param postCodeHookSpecification Contains the responses and actions that Amazon Lex takes
       * after the Lambda function is complete. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f548bd943f8161a7481745dffb9e4bc3046823882cb7e2ff881a1e8ee60d24f7")
      public
          fun postCodeHookSpecification(postCodeHookSpecification: PostDialogCodeHookInvocationSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookInvocationSettingProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookInvocationSettingProperty.builder()

      /**
       * @param enableCodeHookInvocation Indicates whether a Lambda function should be invoked for
       * the dialog. 
       */
      override fun enableCodeHookInvocation(enableCodeHookInvocation: Boolean) {
        cdkBuilder.enableCodeHookInvocation(enableCodeHookInvocation)
      }

      /**
       * @param enableCodeHookInvocation Indicates whether a Lambda function should be invoked for
       * the dialog. 
       */
      override fun enableCodeHookInvocation(enableCodeHookInvocation: IResolvable) {
        cdkBuilder.enableCodeHookInvocation(enableCodeHookInvocation.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param invocationLabel A label that indicates the dialog step from which the dialog code
       * hook is happening.
       */
      override fun invocationLabel(invocationLabel: String) {
        cdkBuilder.invocationLabel(invocationLabel)
      }

      /**
       * @param isActive Determines whether a dialog code hook is used when the intent is activated.
       * 
       */
      override fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
      }

      /**
       * @param isActive Determines whether a dialog code hook is used when the intent is activated.
       * 
       */
      override fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param postCodeHookSpecification Contains the responses and actions that Amazon Lex takes
       * after the Lambda function is complete. 
       */
      override fun postCodeHookSpecification(postCodeHookSpecification: IResolvable) {
        cdkBuilder.postCodeHookSpecification(postCodeHookSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param postCodeHookSpecification Contains the responses and actions that Amazon Lex takes
       * after the Lambda function is complete. 
       */
      override
          fun postCodeHookSpecification(postCodeHookSpecification: PostDialogCodeHookInvocationSpecificationProperty) {
        cdkBuilder.postCodeHookSpecification(postCodeHookSpecification.let(PostDialogCodeHookInvocationSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param postCodeHookSpecification Contains the responses and actions that Amazon Lex takes
       * after the Lambda function is complete. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f548bd943f8161a7481745dffb9e4bc3046823882cb7e2ff881a1e8ee60d24f7")
      override
          fun postCodeHookSpecification(postCodeHookSpecification: PostDialogCodeHookInvocationSpecificationProperty.Builder.() -> Unit):
          Unit =
          postCodeHookSpecification(PostDialogCodeHookInvocationSpecificationProperty(postCodeHookSpecification))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookInvocationSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookInvocationSettingProperty,
    ) : CdkObject(cdkObject),
        DialogCodeHookInvocationSettingProperty {
      /**
       * Indicates whether a Lambda function should be invoked for the dialog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehookinvocationsetting.html#cfn-lex-bot-dialogcodehookinvocationsetting-enablecodehookinvocation)
       */
      override fun enableCodeHookInvocation(): Any = unwrap(this).getEnableCodeHookInvocation()

      /**
       * A label that indicates the dialog step from which the dialog code hook is happening.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehookinvocationsetting.html#cfn-lex-bot-dialogcodehookinvocationsetting-invocationlabel)
       */
      override fun invocationLabel(): String? = unwrap(this).getInvocationLabel()

      /**
       * Determines whether a dialog code hook is used when the intent is activated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehookinvocationsetting.html#cfn-lex-bot-dialogcodehookinvocationsetting-isactive)
       */
      override fun isActive(): Any = unwrap(this).getIsActive()

      /**
       * Contains the responses and actions that Amazon Lex takes after the Lambda function is
       * complete.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehookinvocationsetting.html#cfn-lex-bot-dialogcodehookinvocationsetting-postcodehookspecification)
       */
      override fun postCodeHookSpecification(): Any = unwrap(this).getPostCodeHookSpecification()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DialogCodeHookInvocationSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookInvocationSettingProperty):
          DialogCodeHookInvocationSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DialogCodeHookInvocationSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DialogCodeHookInvocationSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookInvocationSettingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookInvocationSettingProperty
    }
  }

  /**
   * Settings that determine the Lambda function that Amazon Lex uses for processing user responses.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * DialogCodeHookSettingProperty dialogCodeHookSettingProperty =
   * DialogCodeHookSettingProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehooksetting.html)
   */
  public interface DialogCodeHookSettingProperty {
    /**
     * Enables the dialog code hook so that it processes user requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehooksetting.html#cfn-lex-bot-dialogcodehooksetting-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [DialogCodeHookSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Enables the dialog code hook so that it processes user requests. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Enables the dialog code hook so that it processes user requests. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookSettingProperty.builder()

      /**
       * @param enabled Enables the dialog code hook so that it processes user requests. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Enables the dialog code hook so that it processes user requests. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookSettingProperty,
    ) : CdkObject(cdkObject),
        DialogCodeHookSettingProperty {
      /**
       * Enables the dialog code hook so that it processes user requests.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehooksetting.html#cfn-lex-bot-dialogcodehooksetting-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DialogCodeHookSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookSettingProperty):
          DialogCodeHookSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DialogCodeHookSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DialogCodeHookSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.DialogCodeHookSettingProperty
    }
  }

  /**
   * The current state of the conversation with the user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface DialogStateProperty {
    /**
     * Defines the action that the bot executes at runtime when the conversation reaches this step.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogstate.html#cfn-lex-bot-dialogstate-dialogaction)
     */
    public fun dialogAction(): Any? = unwrap(this).getDialogAction()

    /**
     * Override settings to configure the intent state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogstate.html#cfn-lex-bot-dialogstate-intent)
     */
    public fun intent(): Any? = unwrap(this).getIntent()

    /**
     * Map of key/value pairs representing session-specific context information.
     *
     * It contains application information passed between Amazon Lex and a client application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogstate.html#cfn-lex-bot-dialogstate-sessionattributes)
     */
    public fun sessionAttributes(): Any? = unwrap(this).getSessionAttributes()

    /**
     * A builder for [DialogStateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dialogAction Defines the action that the bot executes at runtime when the
       * conversation reaches this step.
       */
      public fun dialogAction(dialogAction: IResolvable)

      /**
       * @param dialogAction Defines the action that the bot executes at runtime when the
       * conversation reaches this step.
       */
      public fun dialogAction(dialogAction: DialogActionProperty)

      /**
       * @param dialogAction Defines the action that the bot executes at runtime when the
       * conversation reaches this step.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4fcdebada112a2ccb01e3cd81ec6cf1596a3db4638eae1d4e90277967c9a2b3")
      public fun dialogAction(dialogAction: DialogActionProperty.Builder.() -> Unit)

      /**
       * @param intent Override settings to configure the intent state.
       */
      public fun intent(intent: IResolvable)

      /**
       * @param intent Override settings to configure the intent state.
       */
      public fun intent(intent: IntentOverrideProperty)

      /**
       * @param intent Override settings to configure the intent state.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb047b798c892c9847a9d7b1a51ba4d0d6158868fa16f29a479f8184759fc5d7")
      public fun intent(intent: IntentOverrideProperty.Builder.() -> Unit)

      /**
       * @param sessionAttributes Map of key/value pairs representing session-specific context
       * information.
       * It contains application information passed between Amazon Lex and a client application.
       */
      public fun sessionAttributes(sessionAttributes: IResolvable)

      /**
       * @param sessionAttributes Map of key/value pairs representing session-specific context
       * information.
       * It contains application information passed between Amazon Lex and a client application.
       */
      public fun sessionAttributes(sessionAttributes: List<Any>)

      /**
       * @param sessionAttributes Map of key/value pairs representing session-specific context
       * information.
       * It contains application information passed between Amazon Lex and a client application.
       */
      public fun sessionAttributes(vararg sessionAttributes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.DialogStateProperty.Builder
          = software.amazon.awscdk.services.lex.CfnBot.DialogStateProperty.builder()

      /**
       * @param dialogAction Defines the action that the bot executes at runtime when the
       * conversation reaches this step.
       */
      override fun dialogAction(dialogAction: IResolvable) {
        cdkBuilder.dialogAction(dialogAction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dialogAction Defines the action that the bot executes at runtime when the
       * conversation reaches this step.
       */
      override fun dialogAction(dialogAction: DialogActionProperty) {
        cdkBuilder.dialogAction(dialogAction.let(DialogActionProperty.Companion::unwrap))
      }

      /**
       * @param dialogAction Defines the action that the bot executes at runtime when the
       * conversation reaches this step.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4fcdebada112a2ccb01e3cd81ec6cf1596a3db4638eae1d4e90277967c9a2b3")
      override fun dialogAction(dialogAction: DialogActionProperty.Builder.() -> Unit): Unit =
          dialogAction(DialogActionProperty(dialogAction))

      /**
       * @param intent Override settings to configure the intent state.
       */
      override fun intent(intent: IResolvable) {
        cdkBuilder.intent(intent.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param intent Override settings to configure the intent state.
       */
      override fun intent(intent: IntentOverrideProperty) {
        cdkBuilder.intent(intent.let(IntentOverrideProperty.Companion::unwrap))
      }

      /**
       * @param intent Override settings to configure the intent state.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb047b798c892c9847a9d7b1a51ba4d0d6158868fa16f29a479f8184759fc5d7")
      override fun intent(intent: IntentOverrideProperty.Builder.() -> Unit): Unit =
          intent(IntentOverrideProperty(intent))

      /**
       * @param sessionAttributes Map of key/value pairs representing session-specific context
       * information.
       * It contains application information passed between Amazon Lex and a client application.
       */
      override fun sessionAttributes(sessionAttributes: IResolvable) {
        cdkBuilder.sessionAttributes(sessionAttributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sessionAttributes Map of key/value pairs representing session-specific context
       * information.
       * It contains application information passed between Amazon Lex and a client application.
       */
      override fun sessionAttributes(sessionAttributes: List<Any>) {
        cdkBuilder.sessionAttributes(sessionAttributes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sessionAttributes Map of key/value pairs representing session-specific context
       * information.
       * It contains application information passed between Amazon Lex and a client application.
       */
      override fun sessionAttributes(vararg sessionAttributes: Any): Unit =
          sessionAttributes(sessionAttributes.toList())

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.DialogStateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.DialogStateProperty,
    ) : CdkObject(cdkObject),
        DialogStateProperty {
      /**
       * Defines the action that the bot executes at runtime when the conversation reaches this
       * step.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogstate.html#cfn-lex-bot-dialogstate-dialogaction)
       */
      override fun dialogAction(): Any? = unwrap(this).getDialogAction()

      /**
       * Override settings to configure the intent state.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogstate.html#cfn-lex-bot-dialogstate-intent)
       */
      override fun intent(): Any? = unwrap(this).getIntent()

      /**
       * Map of key/value pairs representing session-specific context information.
       *
       * It contains application information passed between Amazon Lex and a client application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogstate.html#cfn-lex-bot-dialogstate-sessionattributes)
       */
      override fun sessionAttributes(): Any? = unwrap(this).getSessionAttributes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DialogStateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.DialogStateProperty):
          DialogStateProperty = CdkObjectWrappers.wrap(cdkObject) as? DialogStateProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DialogStateProperty):
          software.amazon.awscdk.services.lex.CfnBot.DialogStateProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.DialogStateProperty
    }
  }

  /**
   * Settings that specify the dialog code hook that is called by Amazon Lex between eliciting slot
   * values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface ElicitationCodeHookInvocationSettingProperty {
    /**
     * Indicates whether a Lambda function should be invoked for the dialog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-elicitationcodehookinvocationsetting.html#cfn-lex-bot-elicitationcodehookinvocationsetting-enablecodehookinvocation)
     */
    public fun enableCodeHookInvocation(): Any

    /**
     * A label that indicates the dialog step from which the dialog code hook is happening.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-elicitationcodehookinvocationsetting.html#cfn-lex-bot-elicitationcodehookinvocationsetting-invocationlabel)
     */
    public fun invocationLabel(): String? = unwrap(this).getInvocationLabel()

    /**
     * A builder for [ElicitationCodeHookInvocationSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableCodeHookInvocation Indicates whether a Lambda function should be invoked for
       * the dialog. 
       */
      public fun enableCodeHookInvocation(enableCodeHookInvocation: Boolean)

      /**
       * @param enableCodeHookInvocation Indicates whether a Lambda function should be invoked for
       * the dialog. 
       */
      public fun enableCodeHookInvocation(enableCodeHookInvocation: IResolvable)

      /**
       * @param invocationLabel A label that indicates the dialog step from which the dialog code
       * hook is happening.
       */
      public fun invocationLabel(invocationLabel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.ElicitationCodeHookInvocationSettingProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.ElicitationCodeHookInvocationSettingProperty.builder()

      /**
       * @param enableCodeHookInvocation Indicates whether a Lambda function should be invoked for
       * the dialog. 
       */
      override fun enableCodeHookInvocation(enableCodeHookInvocation: Boolean) {
        cdkBuilder.enableCodeHookInvocation(enableCodeHookInvocation)
      }

      /**
       * @param enableCodeHookInvocation Indicates whether a Lambda function should be invoked for
       * the dialog. 
       */
      override fun enableCodeHookInvocation(enableCodeHookInvocation: IResolvable) {
        cdkBuilder.enableCodeHookInvocation(enableCodeHookInvocation.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param invocationLabel A label that indicates the dialog step from which the dialog code
       * hook is happening.
       */
      override fun invocationLabel(invocationLabel: String) {
        cdkBuilder.invocationLabel(invocationLabel)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.ElicitationCodeHookInvocationSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.ElicitationCodeHookInvocationSettingProperty,
    ) : CdkObject(cdkObject),
        ElicitationCodeHookInvocationSettingProperty {
      /**
       * Indicates whether a Lambda function should be invoked for the dialog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-elicitationcodehookinvocationsetting.html#cfn-lex-bot-elicitationcodehookinvocationsetting-enablecodehookinvocation)
       */
      override fun enableCodeHookInvocation(): Any = unwrap(this).getEnableCodeHookInvocation()

      /**
       * A label that indicates the dialog step from which the dialog code hook is happening.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-elicitationcodehookinvocationsetting.html#cfn-lex-bot-elicitationcodehookinvocationsetting-invocationlabel)
       */
      override fun invocationLabel(): String? = unwrap(this).getInvocationLabel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ElicitationCodeHookInvocationSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ElicitationCodeHookInvocationSettingProperty):
          ElicitationCodeHookInvocationSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ElicitationCodeHookInvocationSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElicitationCodeHookInvocationSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.ElicitationCodeHookInvocationSettingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.ElicitationCodeHookInvocationSettingProperty
    }
  }

  /**
   * Provides information about the external source of the slot type's definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface ExternalSourceSettingProperty {
    /**
     * Settings required for a slot type based on a grammar that you provide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-externalsourcesetting.html#cfn-lex-bot-externalsourcesetting-grammarslottypesetting)
     */
    public fun grammarSlotTypeSetting(): Any? = unwrap(this).getGrammarSlotTypeSetting()

    /**
     * A builder for [ExternalSourceSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param grammarSlotTypeSetting Settings required for a slot type based on a grammar that you
       * provide.
       */
      public fun grammarSlotTypeSetting(grammarSlotTypeSetting: IResolvable)

      /**
       * @param grammarSlotTypeSetting Settings required for a slot type based on a grammar that you
       * provide.
       */
      public fun grammarSlotTypeSetting(grammarSlotTypeSetting: GrammarSlotTypeSettingProperty)

      /**
       * @param grammarSlotTypeSetting Settings required for a slot type based on a grammar that you
       * provide.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67a5bea02d3584199169146146c5d37293a9ab2b277e6718183f8f2c2428f584")
      public
          fun grammarSlotTypeSetting(grammarSlotTypeSetting: GrammarSlotTypeSettingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.ExternalSourceSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ExternalSourceSettingProperty.builder()

      /**
       * @param grammarSlotTypeSetting Settings required for a slot type based on a grammar that you
       * provide.
       */
      override fun grammarSlotTypeSetting(grammarSlotTypeSetting: IResolvable) {
        cdkBuilder.grammarSlotTypeSetting(grammarSlotTypeSetting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param grammarSlotTypeSetting Settings required for a slot type based on a grammar that you
       * provide.
       */
      override fun grammarSlotTypeSetting(grammarSlotTypeSetting: GrammarSlotTypeSettingProperty) {
        cdkBuilder.grammarSlotTypeSetting(grammarSlotTypeSetting.let(GrammarSlotTypeSettingProperty.Companion::unwrap))
      }

      /**
       * @param grammarSlotTypeSetting Settings required for a slot type based on a grammar that you
       * provide.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67a5bea02d3584199169146146c5d37293a9ab2b277e6718183f8f2c2428f584")
      override
          fun grammarSlotTypeSetting(grammarSlotTypeSetting: GrammarSlotTypeSettingProperty.Builder.() -> Unit):
          Unit = grammarSlotTypeSetting(GrammarSlotTypeSettingProperty(grammarSlotTypeSetting))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ExternalSourceSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.ExternalSourceSettingProperty,
    ) : CdkObject(cdkObject),
        ExternalSourceSettingProperty {
      /**
       * Settings required for a slot type based on a grammar that you provide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-externalsourcesetting.html#cfn-lex-bot-externalsourcesetting-grammarslottypesetting)
       */
      override fun grammarSlotTypeSetting(): Any? = unwrap(this).getGrammarSlotTypeSetting()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExternalSourceSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ExternalSourceSettingProperty):
          ExternalSourceSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExternalSourceSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExternalSourceSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.ExternalSourceSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.ExternalSourceSettingProperty
    }
  }

  /**
   * Determines if a Lambda function should be invoked for a specific intent.
   *
   * Example:
   *
   * ```
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentcodehooksetting.html)
   */
  public interface FulfillmentCodeHookSettingProperty {
    /**
     * Indicates whether a Lambda function should be invoked to fulfill a specific intent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentcodehooksetting.html#cfn-lex-bot-fulfillmentcodehooksetting-enabled)
     */
    public fun enabled(): Any

    /**
     * Provides settings for update messages sent to the user for long-running Lambda fulfillment
     * functions.
     *
     * Fulfillment updates can be used only with streaming conversations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentcodehooksetting.html#cfn-lex-bot-fulfillmentcodehooksetting-fulfillmentupdatesspecification)
     */
    public fun fulfillmentUpdatesSpecification(): Any? =
        unwrap(this).getFulfillmentUpdatesSpecification()

    /**
     * Determines whether the fulfillment code hook is used.
     *
     * When `active` is false, the code hook doesn't run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentcodehooksetting.html#cfn-lex-bot-fulfillmentcodehooksetting-isactive)
     */
    public fun isActive(): Any? = unwrap(this).getIsActive()

    /**
     * Provides settings for messages sent to the user for after the Lambda fulfillment function
     * completes.
     *
     * Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentcodehooksetting.html#cfn-lex-bot-fulfillmentcodehooksetting-postfulfillmentstatusspecification)
     */
    public fun postFulfillmentStatusSpecification(): Any? =
        unwrap(this).getPostFulfillmentStatusSpecification()

    /**
     * A builder for [FulfillmentCodeHookSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Indicates whether a Lambda function should be invoked to fulfill a specific
       * intent. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether a Lambda function should be invoked to fulfill a specific
       * intent. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param fulfillmentUpdatesSpecification Provides settings for update messages sent to the
       * user for long-running Lambda fulfillment functions.
       * Fulfillment updates can be used only with streaming conversations.
       */
      public fun fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification: IResolvable)

      /**
       * @param fulfillmentUpdatesSpecification Provides settings for update messages sent to the
       * user for long-running Lambda fulfillment functions.
       * Fulfillment updates can be used only with streaming conversations.
       */
      public
          fun fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification: FulfillmentUpdatesSpecificationProperty)

      /**
       * @param fulfillmentUpdatesSpecification Provides settings for update messages sent to the
       * user for long-running Lambda fulfillment functions.
       * Fulfillment updates can be used only with streaming conversations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0519d9c649c85400115d38b42da54b0f6081970d8b55579f68bfb38c2fee1319")
      public
          fun fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification: FulfillmentUpdatesSpecificationProperty.Builder.() -> Unit)

      /**
       * @param isActive Determines whether the fulfillment code hook is used.
       * When `active` is false, the code hook doesn't run.
       */
      public fun isActive(isActive: Boolean)

      /**
       * @param isActive Determines whether the fulfillment code hook is used.
       * When `active` is false, the code hook doesn't run.
       */
      public fun isActive(isActive: IResolvable)

      /**
       * @param postFulfillmentStatusSpecification Provides settings for messages sent to the user
       * for after the Lambda fulfillment function completes.
       * Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
       */
      public fun postFulfillmentStatusSpecification(postFulfillmentStatusSpecification: IResolvable)

      /**
       * @param postFulfillmentStatusSpecification Provides settings for messages sent to the user
       * for after the Lambda fulfillment function completes.
       * Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
       */
      public
          fun postFulfillmentStatusSpecification(postFulfillmentStatusSpecification: PostFulfillmentStatusSpecificationProperty)

      /**
       * @param postFulfillmentStatusSpecification Provides settings for messages sent to the user
       * for after the Lambda fulfillment function completes.
       * Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5347743b025ca13fd46ac62fcd9161d82e6f120e9b09174d0754b6ace45d79a5")
      public
          fun postFulfillmentStatusSpecification(postFulfillmentStatusSpecification: PostFulfillmentStatusSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentCodeHookSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentCodeHookSettingProperty.builder()

      /**
       * @param enabled Indicates whether a Lambda function should be invoked to fulfill a specific
       * intent. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether a Lambda function should be invoked to fulfill a specific
       * intent. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fulfillmentUpdatesSpecification Provides settings for update messages sent to the
       * user for long-running Lambda fulfillment functions.
       * Fulfillment updates can be used only with streaming conversations.
       */
      override fun fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification: IResolvable) {
        cdkBuilder.fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fulfillmentUpdatesSpecification Provides settings for update messages sent to the
       * user for long-running Lambda fulfillment functions.
       * Fulfillment updates can be used only with streaming conversations.
       */
      override
          fun fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification: FulfillmentUpdatesSpecificationProperty) {
        cdkBuilder.fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification.let(FulfillmentUpdatesSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param fulfillmentUpdatesSpecification Provides settings for update messages sent to the
       * user for long-running Lambda fulfillment functions.
       * Fulfillment updates can be used only with streaming conversations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0519d9c649c85400115d38b42da54b0f6081970d8b55579f68bfb38c2fee1319")
      override
          fun fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification: FulfillmentUpdatesSpecificationProperty.Builder.() -> Unit):
          Unit =
          fulfillmentUpdatesSpecification(FulfillmentUpdatesSpecificationProperty(fulfillmentUpdatesSpecification))

      /**
       * @param isActive Determines whether the fulfillment code hook is used.
       * When `active` is false, the code hook doesn't run.
       */
      override fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
      }

      /**
       * @param isActive Determines whether the fulfillment code hook is used.
       * When `active` is false, the code hook doesn't run.
       */
      override fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param postFulfillmentStatusSpecification Provides settings for messages sent to the user
       * for after the Lambda fulfillment function completes.
       * Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
       */
      override
          fun postFulfillmentStatusSpecification(postFulfillmentStatusSpecification: IResolvable) {
        cdkBuilder.postFulfillmentStatusSpecification(postFulfillmentStatusSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param postFulfillmentStatusSpecification Provides settings for messages sent to the user
       * for after the Lambda fulfillment function completes.
       * Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
       */
      override
          fun postFulfillmentStatusSpecification(postFulfillmentStatusSpecification: PostFulfillmentStatusSpecificationProperty) {
        cdkBuilder.postFulfillmentStatusSpecification(postFulfillmentStatusSpecification.let(PostFulfillmentStatusSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param postFulfillmentStatusSpecification Provides settings for messages sent to the user
       * for after the Lambda fulfillment function completes.
       * Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5347743b025ca13fd46ac62fcd9161d82e6f120e9b09174d0754b6ace45d79a5")
      override
          fun postFulfillmentStatusSpecification(postFulfillmentStatusSpecification: PostFulfillmentStatusSpecificationProperty.Builder.() -> Unit):
          Unit =
          postFulfillmentStatusSpecification(PostFulfillmentStatusSpecificationProperty(postFulfillmentStatusSpecification))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentCodeHookSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.FulfillmentCodeHookSettingProperty,
    ) : CdkObject(cdkObject),
        FulfillmentCodeHookSettingProperty {
      /**
       * Indicates whether a Lambda function should be invoked to fulfill a specific intent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentcodehooksetting.html#cfn-lex-bot-fulfillmentcodehooksetting-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * Provides settings for update messages sent to the user for long-running Lambda fulfillment
       * functions.
       *
       * Fulfillment updates can be used only with streaming conversations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentcodehooksetting.html#cfn-lex-bot-fulfillmentcodehooksetting-fulfillmentupdatesspecification)
       */
      override fun fulfillmentUpdatesSpecification(): Any? =
          unwrap(this).getFulfillmentUpdatesSpecification()

      /**
       * Determines whether the fulfillment code hook is used.
       *
       * When `active` is false, the code hook doesn't run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentcodehooksetting.html#cfn-lex-bot-fulfillmentcodehooksetting-isactive)
       */
      override fun isActive(): Any? = unwrap(this).getIsActive()

      /**
       * Provides settings for messages sent to the user for after the Lambda fulfillment function
       * completes.
       *
       * Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentcodehooksetting.html#cfn-lex-bot-fulfillmentcodehooksetting-postfulfillmentstatusspecification)
       */
      override fun postFulfillmentStatusSpecification(): Any? =
          unwrap(this).getPostFulfillmentStatusSpecification()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FulfillmentCodeHookSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.FulfillmentCodeHookSettingProperty):
          FulfillmentCodeHookSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FulfillmentCodeHookSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FulfillmentCodeHookSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentCodeHookSettingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentCodeHookSettingProperty
    }
  }

  /**
   * Provides settings for a message that is sent to the user when a fulfillment Lambda function
   * starts running.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface FulfillmentStartResponseSpecificationProperty {
    /**
     * Determines whether the user can interrupt the start message while it is playing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentstartresponsespecification.html#cfn-lex-bot-fulfillmentstartresponsespecification-allowinterrupt)
     */
    public fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

    /**
     * The delay between when the Lambda fulfillment function starts running and the start message
     * is played.
     *
     * If the Lambda function returns before the delay is over, the start message isn't played.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentstartresponsespecification.html#cfn-lex-bot-fulfillmentstartresponsespecification-delayinseconds)
     */
    public fun delayInSeconds(): Number

    /**
     * 1 - 5 message groups that contain start messages.
     *
     * Amazon Lex chooses one of the messages to play to the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentstartresponsespecification.html#cfn-lex-bot-fulfillmentstartresponsespecification-messagegroups)
     */
    public fun messageGroups(): Any

    /**
     * A builder for [FulfillmentStartResponseSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowInterrupt Determines whether the user can interrupt the start message while it
       * is playing.
       */
      public fun allowInterrupt(allowInterrupt: Boolean)

      /**
       * @param allowInterrupt Determines whether the user can interrupt the start message while it
       * is playing.
       */
      public fun allowInterrupt(allowInterrupt: IResolvable)

      /**
       * @param delayInSeconds The delay between when the Lambda fulfillment function starts running
       * and the start message is played. 
       * If the Lambda function returns before the delay is over, the start message isn't played.
       */
      public fun delayInSeconds(delayInSeconds: Number)

      /**
       * @param messageGroups 1 - 5 message groups that contain start messages. 
       * Amazon Lex chooses one of the messages to play to the user.
       */
      public fun messageGroups(messageGroups: IResolvable)

      /**
       * @param messageGroups 1 - 5 message groups that contain start messages. 
       * Amazon Lex chooses one of the messages to play to the user.
       */
      public fun messageGroups(messageGroups: List<Any>)

      /**
       * @param messageGroups 1 - 5 message groups that contain start messages. 
       * Amazon Lex chooses one of the messages to play to the user.
       */
      public fun messageGroups(vararg messageGroups: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentStartResponseSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentStartResponseSpecificationProperty.builder()

      /**
       * @param allowInterrupt Determines whether the user can interrupt the start message while it
       * is playing.
       */
      override fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
      }

      /**
       * @param allowInterrupt Determines whether the user can interrupt the start message while it
       * is playing.
       */
      override fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param delayInSeconds The delay between when the Lambda fulfillment function starts running
       * and the start message is played. 
       * If the Lambda function returns before the delay is over, the start message isn't played.
       */
      override fun delayInSeconds(delayInSeconds: Number) {
        cdkBuilder.delayInSeconds(delayInSeconds)
      }

      /**
       * @param messageGroups 1 - 5 message groups that contain start messages. 
       * Amazon Lex chooses one of the messages to play to the user.
       */
      override fun messageGroups(messageGroups: IResolvable) {
        cdkBuilder.messageGroups(messageGroups.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param messageGroups 1 - 5 message groups that contain start messages. 
       * Amazon Lex chooses one of the messages to play to the user.
       */
      override fun messageGroups(messageGroups: List<Any>) {
        cdkBuilder.messageGroups(messageGroups.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param messageGroups 1 - 5 message groups that contain start messages. 
       * Amazon Lex chooses one of the messages to play to the user.
       */
      override fun messageGroups(vararg messageGroups: Any): Unit =
          messageGroups(messageGroups.toList())

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentStartResponseSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.FulfillmentStartResponseSpecificationProperty,
    ) : CdkObject(cdkObject),
        FulfillmentStartResponseSpecificationProperty {
      /**
       * Determines whether the user can interrupt the start message while it is playing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentstartresponsespecification.html#cfn-lex-bot-fulfillmentstartresponsespecification-allowinterrupt)
       */
      override fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

      /**
       * The delay between when the Lambda fulfillment function starts running and the start message
       * is played.
       *
       * If the Lambda function returns before the delay is over, the start message isn't played.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentstartresponsespecification.html#cfn-lex-bot-fulfillmentstartresponsespecification-delayinseconds)
       */
      override fun delayInSeconds(): Number = unwrap(this).getDelayInSeconds()

      /**
       * 1 - 5 message groups that contain start messages.
       *
       * Amazon Lex chooses one of the messages to play to the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentstartresponsespecification.html#cfn-lex-bot-fulfillmentstartresponsespecification-messagegroups)
       */
      override fun messageGroups(): Any = unwrap(this).getMessageGroups()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FulfillmentStartResponseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.FulfillmentStartResponseSpecificationProperty):
          FulfillmentStartResponseSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FulfillmentStartResponseSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FulfillmentStartResponseSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentStartResponseSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentStartResponseSpecificationProperty
    }
  }

  /**
   * Provides settings for a message that is sent periodically to the user while a fulfillment
   * Lambda function is running.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface FulfillmentUpdateResponseSpecificationProperty {
    /**
     * Determines whether the user can interrupt an update message while it is playing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdateresponsespecification.html#cfn-lex-bot-fulfillmentupdateresponsespecification-allowinterrupt)
     */
    public fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

    /**
     * The frequency that a message is sent to the user.
     *
     * When the period ends, Amazon Lex chooses a message from the message groups and plays it to
     * the user. If the fulfillment Lambda returns before the first period ends, an update message is
     * not played to the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdateresponsespecification.html#cfn-lex-bot-fulfillmentupdateresponsespecification-frequencyinseconds)
     */
    public fun frequencyInSeconds(): Number

    /**
     * 1 - 5 message groups that contain update messages.
     *
     * Amazon Lex chooses one of the messages to play to the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdateresponsespecification.html#cfn-lex-bot-fulfillmentupdateresponsespecification-messagegroups)
     */
    public fun messageGroups(): Any

    /**
     * A builder for [FulfillmentUpdateResponseSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowInterrupt Determines whether the user can interrupt an update message while it
       * is playing.
       */
      public fun allowInterrupt(allowInterrupt: Boolean)

      /**
       * @param allowInterrupt Determines whether the user can interrupt an update message while it
       * is playing.
       */
      public fun allowInterrupt(allowInterrupt: IResolvable)

      /**
       * @param frequencyInSeconds The frequency that a message is sent to the user. 
       * When the period ends, Amazon Lex chooses a message from the message groups and plays it to
       * the user. If the fulfillment Lambda returns before the first period ends, an update message is
       * not played to the user.
       */
      public fun frequencyInSeconds(frequencyInSeconds: Number)

      /**
       * @param messageGroups 1 - 5 message groups that contain update messages. 
       * Amazon Lex chooses one of the messages to play to the user.
       */
      public fun messageGroups(messageGroups: IResolvable)

      /**
       * @param messageGroups 1 - 5 message groups that contain update messages. 
       * Amazon Lex chooses one of the messages to play to the user.
       */
      public fun messageGroups(messageGroups: List<Any>)

      /**
       * @param messageGroups 1 - 5 message groups that contain update messages. 
       * Amazon Lex chooses one of the messages to play to the user.
       */
      public fun messageGroups(vararg messageGroups: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdateResponseSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdateResponseSpecificationProperty.builder()

      /**
       * @param allowInterrupt Determines whether the user can interrupt an update message while it
       * is playing.
       */
      override fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
      }

      /**
       * @param allowInterrupt Determines whether the user can interrupt an update message while it
       * is playing.
       */
      override fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param frequencyInSeconds The frequency that a message is sent to the user. 
       * When the period ends, Amazon Lex chooses a message from the message groups and plays it to
       * the user. If the fulfillment Lambda returns before the first period ends, an update message is
       * not played to the user.
       */
      override fun frequencyInSeconds(frequencyInSeconds: Number) {
        cdkBuilder.frequencyInSeconds(frequencyInSeconds)
      }

      /**
       * @param messageGroups 1 - 5 message groups that contain update messages. 
       * Amazon Lex chooses one of the messages to play to the user.
       */
      override fun messageGroups(messageGroups: IResolvable) {
        cdkBuilder.messageGroups(messageGroups.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param messageGroups 1 - 5 message groups that contain update messages. 
       * Amazon Lex chooses one of the messages to play to the user.
       */
      override fun messageGroups(messageGroups: List<Any>) {
        cdkBuilder.messageGroups(messageGroups.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param messageGroups 1 - 5 message groups that contain update messages. 
       * Amazon Lex chooses one of the messages to play to the user.
       */
      override fun messageGroups(vararg messageGroups: Any): Unit =
          messageGroups(messageGroups.toList())

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdateResponseSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdateResponseSpecificationProperty,
    ) : CdkObject(cdkObject),
        FulfillmentUpdateResponseSpecificationProperty {
      /**
       * Determines whether the user can interrupt an update message while it is playing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdateresponsespecification.html#cfn-lex-bot-fulfillmentupdateresponsespecification-allowinterrupt)
       */
      override fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

      /**
       * The frequency that a message is sent to the user.
       *
       * When the period ends, Amazon Lex chooses a message from the message groups and plays it to
       * the user. If the fulfillment Lambda returns before the first period ends, an update message is
       * not played to the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdateresponsespecification.html#cfn-lex-bot-fulfillmentupdateresponsespecification-frequencyinseconds)
       */
      override fun frequencyInSeconds(): Number = unwrap(this).getFrequencyInSeconds()

      /**
       * 1 - 5 message groups that contain update messages.
       *
       * Amazon Lex chooses one of the messages to play to the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdateresponsespecification.html#cfn-lex-bot-fulfillmentupdateresponsespecification-messagegroups)
       */
      override fun messageGroups(): Any = unwrap(this).getMessageGroups()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FulfillmentUpdateResponseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdateResponseSpecificationProperty):
          FulfillmentUpdateResponseSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FulfillmentUpdateResponseSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FulfillmentUpdateResponseSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdateResponseSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdateResponseSpecificationProperty
    }
  }

  /**
   * Provides information for updating the user on the progress of fulfilling an intent.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface FulfillmentUpdatesSpecificationProperty {
    /**
     * Determines whether fulfillment updates are sent to the user. When this field is true, updates
     * are sent.
     *
     * If the `active` field is set to true, the `startResponse` , `updateResponse` , and
     * `timeoutInSeconds` fields are required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdatesspecification.html#cfn-lex-bot-fulfillmentupdatesspecification-active)
     */
    public fun active(): Any

    /**
     * Provides configuration information for the message sent to users when the fulfillment Lambda
     * functions starts running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdatesspecification.html#cfn-lex-bot-fulfillmentupdatesspecification-startresponse)
     */
    public fun startResponse(): Any? = unwrap(this).getStartResponse()

    /**
     * The length of time that the fulfillment Lambda function should run before it times out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdatesspecification.html#cfn-lex-bot-fulfillmentupdatesspecification-timeoutinseconds)
     */
    public fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

    /**
     * Provides configuration information for messages sent periodically to the user while the
     * fulfillment Lambda function is running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdatesspecification.html#cfn-lex-bot-fulfillmentupdatesspecification-updateresponse)
     */
    public fun updateResponse(): Any? = unwrap(this).getUpdateResponse()

    /**
     * A builder for [FulfillmentUpdatesSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param active Determines whether fulfillment updates are sent to the user. When this field
       * is true, updates are sent. 
       * If the `active` field is set to true, the `startResponse` , `updateResponse` , and
       * `timeoutInSeconds` fields are required.
       */
      public fun active(active: Boolean)

      /**
       * @param active Determines whether fulfillment updates are sent to the user. When this field
       * is true, updates are sent. 
       * If the `active` field is set to true, the `startResponse` , `updateResponse` , and
       * `timeoutInSeconds` fields are required.
       */
      public fun active(active: IResolvable)

      /**
       * @param startResponse Provides configuration information for the message sent to users when
       * the fulfillment Lambda functions starts running.
       */
      public fun startResponse(startResponse: IResolvable)

      /**
       * @param startResponse Provides configuration information for the message sent to users when
       * the fulfillment Lambda functions starts running.
       */
      public fun startResponse(startResponse: FulfillmentStartResponseSpecificationProperty)

      /**
       * @param startResponse Provides configuration information for the message sent to users when
       * the fulfillment Lambda functions starts running.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0bbbba34a3a2f02503e9d10af52d5190fe61dc5d0d8064bad1b4a5650e8c38bc")
      public
          fun startResponse(startResponse: FulfillmentStartResponseSpecificationProperty.Builder.() -> Unit)

      /**
       * @param timeoutInSeconds The length of time that the fulfillment Lambda function should run
       * before it times out.
       */
      public fun timeoutInSeconds(timeoutInSeconds: Number)

      /**
       * @param updateResponse Provides configuration information for messages sent periodically to
       * the user while the fulfillment Lambda function is running.
       */
      public fun updateResponse(updateResponse: IResolvable)

      /**
       * @param updateResponse Provides configuration information for messages sent periodically to
       * the user while the fulfillment Lambda function is running.
       */
      public fun updateResponse(updateResponse: FulfillmentUpdateResponseSpecificationProperty)

      /**
       * @param updateResponse Provides configuration information for messages sent periodically to
       * the user while the fulfillment Lambda function is running.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("013c8600cd73879701c843cf269878f6c1a33f3be0bdddb7d13adfa7d7391a18")
      public
          fun updateResponse(updateResponse: FulfillmentUpdateResponseSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdatesSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdatesSpecificationProperty.builder()

      /**
       * @param active Determines whether fulfillment updates are sent to the user. When this field
       * is true, updates are sent. 
       * If the `active` field is set to true, the `startResponse` , `updateResponse` , and
       * `timeoutInSeconds` fields are required.
       */
      override fun active(active: Boolean) {
        cdkBuilder.active(active)
      }

      /**
       * @param active Determines whether fulfillment updates are sent to the user. When this field
       * is true, updates are sent. 
       * If the `active` field is set to true, the `startResponse` , `updateResponse` , and
       * `timeoutInSeconds` fields are required.
       */
      override fun active(active: IResolvable) {
        cdkBuilder.active(active.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param startResponse Provides configuration information for the message sent to users when
       * the fulfillment Lambda functions starts running.
       */
      override fun startResponse(startResponse: IResolvable) {
        cdkBuilder.startResponse(startResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param startResponse Provides configuration information for the message sent to users when
       * the fulfillment Lambda functions starts running.
       */
      override fun startResponse(startResponse: FulfillmentStartResponseSpecificationProperty) {
        cdkBuilder.startResponse(startResponse.let(FulfillmentStartResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param startResponse Provides configuration information for the message sent to users when
       * the fulfillment Lambda functions starts running.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0bbbba34a3a2f02503e9d10af52d5190fe61dc5d0d8064bad1b4a5650e8c38bc")
      override
          fun startResponse(startResponse: FulfillmentStartResponseSpecificationProperty.Builder.() -> Unit):
          Unit = startResponse(FulfillmentStartResponseSpecificationProperty(startResponse))

      /**
       * @param timeoutInSeconds The length of time that the fulfillment Lambda function should run
       * before it times out.
       */
      override fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
      }

      /**
       * @param updateResponse Provides configuration information for messages sent periodically to
       * the user while the fulfillment Lambda function is running.
       */
      override fun updateResponse(updateResponse: IResolvable) {
        cdkBuilder.updateResponse(updateResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param updateResponse Provides configuration information for messages sent periodically to
       * the user while the fulfillment Lambda function is running.
       */
      override fun updateResponse(updateResponse: FulfillmentUpdateResponseSpecificationProperty) {
        cdkBuilder.updateResponse(updateResponse.let(FulfillmentUpdateResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param updateResponse Provides configuration information for messages sent periodically to
       * the user while the fulfillment Lambda function is running.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("013c8600cd73879701c843cf269878f6c1a33f3be0bdddb7d13adfa7d7391a18")
      override
          fun updateResponse(updateResponse: FulfillmentUpdateResponseSpecificationProperty.Builder.() -> Unit):
          Unit = updateResponse(FulfillmentUpdateResponseSpecificationProperty(updateResponse))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdatesSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdatesSpecificationProperty,
    ) : CdkObject(cdkObject),
        FulfillmentUpdatesSpecificationProperty {
      /**
       * Determines whether fulfillment updates are sent to the user. When this field is true,
       * updates are sent.
       *
       * If the `active` field is set to true, the `startResponse` , `updateResponse` , and
       * `timeoutInSeconds` fields are required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdatesspecification.html#cfn-lex-bot-fulfillmentupdatesspecification-active)
       */
      override fun active(): Any = unwrap(this).getActive()

      /**
       * Provides configuration information for the message sent to users when the fulfillment
       * Lambda functions starts running.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdatesspecification.html#cfn-lex-bot-fulfillmentupdatesspecification-startresponse)
       */
      override fun startResponse(): Any? = unwrap(this).getStartResponse()

      /**
       * The length of time that the fulfillment Lambda function should run before it times out.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdatesspecification.html#cfn-lex-bot-fulfillmentupdatesspecification-timeoutinseconds)
       */
      override fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

      /**
       * Provides configuration information for messages sent periodically to the user while the
       * fulfillment Lambda function is running.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdatesspecification.html#cfn-lex-bot-fulfillmentupdatesspecification-updateresponse)
       */
      override fun updateResponse(): Any? = unwrap(this).getUpdateResponse()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FulfillmentUpdatesSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdatesSpecificationProperty):
          FulfillmentUpdatesSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FulfillmentUpdatesSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FulfillmentUpdatesSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdatesSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.FulfillmentUpdatesSpecificationProperty
    }
  }

  /**
   * Settings requried for a slot type based on a grammar that you provide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface GrammarSlotTypeSettingProperty {
    /**
     * The source of the grammar used to create the slot type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-grammarslottypesetting.html#cfn-lex-bot-grammarslottypesetting-source)
     */
    public fun source(): Any? = unwrap(this).getSource()

    /**
     * A builder for [GrammarSlotTypeSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param source The source of the grammar used to create the slot type.
       */
      public fun source(source: IResolvable)

      /**
       * @param source The source of the grammar used to create the slot type.
       */
      public fun source(source: GrammarSlotTypeSourceProperty)

      /**
       * @param source The source of the grammar used to create the slot type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2be8ae3465456d2b12af92efe07363c2ff4f08c749a7d21727ed0849d399e777")
      public fun source(source: GrammarSlotTypeSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSettingProperty.builder()

      /**
       * @param source The source of the grammar used to create the slot type.
       */
      override fun source(source: IResolvable) {
        cdkBuilder.source(source.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param source The source of the grammar used to create the slot type.
       */
      override fun source(source: GrammarSlotTypeSourceProperty) {
        cdkBuilder.source(source.let(GrammarSlotTypeSourceProperty.Companion::unwrap))
      }

      /**
       * @param source The source of the grammar used to create the slot type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2be8ae3465456d2b12af92efe07363c2ff4f08c749a7d21727ed0849d399e777")
      override fun source(source: GrammarSlotTypeSourceProperty.Builder.() -> Unit): Unit =
          source(GrammarSlotTypeSourceProperty(source))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSettingProperty,
    ) : CdkObject(cdkObject),
        GrammarSlotTypeSettingProperty {
      /**
       * The source of the grammar used to create the slot type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-grammarslottypesetting.html#cfn-lex-bot-grammarslottypesetting-source)
       */
      override fun source(): Any? = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrammarSlotTypeSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSettingProperty):
          GrammarSlotTypeSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GrammarSlotTypeSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrammarSlotTypeSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSettingProperty
    }
  }

  /**
   * Describes the Amazon S3 bucket name and location for the grammar that is the source for the
   * slot type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface GrammarSlotTypeSourceProperty {
    /**
     * The AWS KMS key required to decrypt the contents of the grammar, if any.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-grammarslottypesource.html#cfn-lex-bot-grammarslottypesource-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The name of the Amazon S3 bucket that contains the grammar source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-grammarslottypesource.html#cfn-lex-bot-grammarslottypesource-s3bucketname)
     */
    public fun s3BucketName(): String

    /**
     * The path to the grammar in the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-grammarslottypesource.html#cfn-lex-bot-grammarslottypesource-s3objectkey)
     */
    public fun s3ObjectKey(): String

    /**
     * A builder for [GrammarSlotTypeSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyArn The AWS KMS key required to decrypt the contents of the grammar, if any.
       */
      public fun kmsKeyArn(kmsKeyArn: String)

      /**
       * @param s3BucketName The name of the Amazon S3 bucket that contains the grammar source. 
       */
      public fun s3BucketName(s3BucketName: String)

      /**
       * @param s3ObjectKey The path to the grammar in the Amazon S3 bucket. 
       */
      public fun s3ObjectKey(s3ObjectKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSourceProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSourceProperty.builder()

      /**
       * @param kmsKeyArn The AWS KMS key required to decrypt the contents of the grammar, if any.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      /**
       * @param s3BucketName The name of the Amazon S3 bucket that contains the grammar source. 
       */
      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      /**
       * @param s3ObjectKey The path to the grammar in the Amazon S3 bucket. 
       */
      override fun s3ObjectKey(s3ObjectKey: String) {
        cdkBuilder.s3ObjectKey(s3ObjectKey)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSourceProperty,
    ) : CdkObject(cdkObject),
        GrammarSlotTypeSourceProperty {
      /**
       * The AWS KMS key required to decrypt the contents of the grammar, if any.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-grammarslottypesource.html#cfn-lex-bot-grammarslottypesource-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      /**
       * The name of the Amazon S3 bucket that contains the grammar source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-grammarslottypesource.html#cfn-lex-bot-grammarslottypesource-s3bucketname)
       */
      override fun s3BucketName(): String = unwrap(this).getS3BucketName()

      /**
       * The path to the grammar in the Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-grammarslottypesource.html#cfn-lex-bot-grammarslottypesource-s3objectkey)
       */
      override fun s3ObjectKey(): String = unwrap(this).getS3ObjectKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrammarSlotTypeSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSourceProperty):
          GrammarSlotTypeSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GrammarSlotTypeSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrammarSlotTypeSourceProperty):
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.GrammarSlotTypeSourceProperty
    }
  }

  /**
   * A card that is shown to the user by a messaging platform.
   *
   * You define the contents of the card, the card is displayed by the platform.
   *
   * When you use a response card, the response from the user is constrained to the text associated
   * with a button on the card.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface ImageResponseCardProperty {
    /**
     * A list of buttons that should be displayed on the response card.
     *
     * The arrangement of the buttons is determined by the platform that displays the button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-imageresponsecard.html#cfn-lex-bot-imageresponsecard-buttons)
     */
    public fun buttons(): Any? = unwrap(this).getButtons()

    /**
     * The URL of an image to display on the response card.
     *
     * The image URL must be publicly available so that the platform displaying the response card
     * has access to the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-imageresponsecard.html#cfn-lex-bot-imageresponsecard-imageurl)
     */
    public fun imageUrl(): String? = unwrap(this).getImageUrl()

    /**
     * The subtitle to display on the response card.
     *
     * The format of the subtitle is determined by the platform displaying the response card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-imageresponsecard.html#cfn-lex-bot-imageresponsecard-subtitle)
     */
    public fun subtitle(): String? = unwrap(this).getSubtitle()

    /**
     * The title to display on the response card.
     *
     * The format of the title is determined by the platform displaying the response card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-imageresponsecard.html#cfn-lex-bot-imageresponsecard-title)
     */
    public fun title(): String

    /**
     * A builder for [ImageResponseCardProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param buttons A list of buttons that should be displayed on the response card.
       * The arrangement of the buttons is determined by the platform that displays the button.
       */
      public fun buttons(buttons: IResolvable)

      /**
       * @param buttons A list of buttons that should be displayed on the response card.
       * The arrangement of the buttons is determined by the platform that displays the button.
       */
      public fun buttons(buttons: List<Any>)

      /**
       * @param buttons A list of buttons that should be displayed on the response card.
       * The arrangement of the buttons is determined by the platform that displays the button.
       */
      public fun buttons(vararg buttons: Any)

      /**
       * @param imageUrl The URL of an image to display on the response card.
       * The image URL must be publicly available so that the platform displaying the response card
       * has access to the image.
       */
      public fun imageUrl(imageUrl: String)

      /**
       * @param subtitle The subtitle to display on the response card.
       * The format of the subtitle is determined by the platform displaying the response card.
       */
      public fun subtitle(subtitle: String)

      /**
       * @param title The title to display on the response card. 
       * The format of the title is determined by the platform displaying the response card.
       */
      public fun title(title: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.ImageResponseCardProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ImageResponseCardProperty.builder()

      /**
       * @param buttons A list of buttons that should be displayed on the response card.
       * The arrangement of the buttons is determined by the platform that displays the button.
       */
      override fun buttons(buttons: IResolvable) {
        cdkBuilder.buttons(buttons.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param buttons A list of buttons that should be displayed on the response card.
       * The arrangement of the buttons is determined by the platform that displays the button.
       */
      override fun buttons(buttons: List<Any>) {
        cdkBuilder.buttons(buttons.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param buttons A list of buttons that should be displayed on the response card.
       * The arrangement of the buttons is determined by the platform that displays the button.
       */
      override fun buttons(vararg buttons: Any): Unit = buttons(buttons.toList())

      /**
       * @param imageUrl The URL of an image to display on the response card.
       * The image URL must be publicly available so that the platform displaying the response card
       * has access to the image.
       */
      override fun imageUrl(imageUrl: String) {
        cdkBuilder.imageUrl(imageUrl)
      }

      /**
       * @param subtitle The subtitle to display on the response card.
       * The format of the subtitle is determined by the platform displaying the response card.
       */
      override fun subtitle(subtitle: String) {
        cdkBuilder.subtitle(subtitle)
      }

      /**
       * @param title The title to display on the response card. 
       * The format of the title is determined by the platform displaying the response card.
       */
      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ImageResponseCardProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.ImageResponseCardProperty,
    ) : CdkObject(cdkObject),
        ImageResponseCardProperty {
      /**
       * A list of buttons that should be displayed on the response card.
       *
       * The arrangement of the buttons is determined by the platform that displays the button.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-imageresponsecard.html#cfn-lex-bot-imageresponsecard-buttons)
       */
      override fun buttons(): Any? = unwrap(this).getButtons()

      /**
       * The URL of an image to display on the response card.
       *
       * The image URL must be publicly available so that the platform displaying the response card
       * has access to the image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-imageresponsecard.html#cfn-lex-bot-imageresponsecard-imageurl)
       */
      override fun imageUrl(): String? = unwrap(this).getImageUrl()

      /**
       * The subtitle to display on the response card.
       *
       * The format of the subtitle is determined by the platform displaying the response card.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-imageresponsecard.html#cfn-lex-bot-imageresponsecard-subtitle)
       */
      override fun subtitle(): String? = unwrap(this).getSubtitle()

      /**
       * The title to display on the response card.
       *
       * The format of the title is determined by the platform displaying the response card.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-imageresponsecard.html#cfn-lex-bot-imageresponsecard-title)
       */
      override fun title(): String = unwrap(this).getTitle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ImageResponseCardProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ImageResponseCardProperty):
          ImageResponseCardProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ImageResponseCardProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageResponseCardProperty):
          software.amazon.awscdk.services.lex.CfnBot.ImageResponseCardProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.ImageResponseCardProperty
    }
  }

  /**
   * Configuration setting for a response sent to the user before Amazon Lex starts eliciting slots.
   *
   * Example:
   *
   * ```
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-initialresponsesetting.html)
   */
  public interface InitialResponseSettingProperty {
    /**
     * Settings that specify the dialog code hook that is called by Amazon Lex at a step of the
     * conversation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-initialresponsesetting.html#cfn-lex-bot-initialresponsesetting-codehook)
     */
    public fun codeHook(): Any? = unwrap(this).getCodeHook()

    /**
     * Provides a list of conditional branches.
     *
     * Branches are evaluated in the order that they are entered in the list. The first branch with
     * a condition that evaluates to true is executed. The last branch in the list is the default
     * branch. The default branch should not have any condition expression. The default branch is
     * executed if no other branch has a matching condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-initialresponsesetting.html#cfn-lex-bot-initialresponsesetting-conditional)
     */
    public fun conditional(): Any? = unwrap(this).getConditional()

    /**
     * Specifies a list of message groups that Amazon Lex uses to respond the user input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-initialresponsesetting.html#cfn-lex-bot-initialresponsesetting-initialresponse)
     */
    public fun initialResponse(): Any? = unwrap(this).getInitialResponse()

    /**
     * The next step in the conversation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-initialresponsesetting.html#cfn-lex-bot-initialresponsesetting-nextstep)
     */
    public fun nextStep(): Any? = unwrap(this).getNextStep()

    /**
     * A builder for [InitialResponseSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param codeHook Settings that specify the dialog code hook that is called by Amazon Lex at
       * a step of the conversation.
       */
      public fun codeHook(codeHook: IResolvable)

      /**
       * @param codeHook Settings that specify the dialog code hook that is called by Amazon Lex at
       * a step of the conversation.
       */
      public fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty)

      /**
       * @param codeHook Settings that specify the dialog code hook that is called by Amazon Lex at
       * a step of the conversation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("344de88ef5ebe057617fd9346bea784928518b040e4a8fb5d354d22e1fd39361")
      public fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty.Builder.() -> Unit)

      /**
       * @param conditional Provides a list of conditional branches.
       * Branches are evaluated in the order that they are entered in the list. The first branch
       * with a condition that evaluates to true is executed. The last branch in the list is the
       * default branch. The default branch should not have any condition expression. The default
       * branch is executed if no other branch has a matching condition.
       */
      public fun conditional(conditional: IResolvable)

      /**
       * @param conditional Provides a list of conditional branches.
       * Branches are evaluated in the order that they are entered in the list. The first branch
       * with a condition that evaluates to true is executed. The last branch in the list is the
       * default branch. The default branch should not have any condition expression. The default
       * branch is executed if no other branch has a matching condition.
       */
      public fun conditional(conditional: ConditionalSpecificationProperty)

      /**
       * @param conditional Provides a list of conditional branches.
       * Branches are evaluated in the order that they are entered in the list. The first branch
       * with a condition that evaluates to true is executed. The last branch in the list is the
       * default branch. The default branch should not have any condition expression. The default
       * branch is executed if no other branch has a matching condition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7678c4d76f79454e532a8895a1190f4e45769f138b286efdb78c3b773ff2b7b")
      public fun conditional(conditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      /**
       * @param initialResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input.
       */
      public fun initialResponse(initialResponse: IResolvable)

      /**
       * @param initialResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input.
       */
      public fun initialResponse(initialResponse: ResponseSpecificationProperty)

      /**
       * @param initialResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b7ec43483e41bcf878fa51c4940d54fcf094c37d78e8c612829ab78cc9bd30b")
      public fun initialResponse(initialResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      /**
       * @param nextStep The next step in the conversation.
       */
      public fun nextStep(nextStep: IResolvable)

      /**
       * @param nextStep The next step in the conversation.
       */
      public fun nextStep(nextStep: DialogStateProperty)

      /**
       * @param nextStep The next step in the conversation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0444c0fb24ca278f7b72f4426b334e76418254528e24d5fa54ac4120ff441fc")
      public fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.InitialResponseSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.InitialResponseSettingProperty.builder()

      /**
       * @param codeHook Settings that specify the dialog code hook that is called by Amazon Lex at
       * a step of the conversation.
       */
      override fun codeHook(codeHook: IResolvable) {
        cdkBuilder.codeHook(codeHook.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param codeHook Settings that specify the dialog code hook that is called by Amazon Lex at
       * a step of the conversation.
       */
      override fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty) {
        cdkBuilder.codeHook(codeHook.let(DialogCodeHookInvocationSettingProperty.Companion::unwrap))
      }

      /**
       * @param codeHook Settings that specify the dialog code hook that is called by Amazon Lex at
       * a step of the conversation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("344de88ef5ebe057617fd9346bea784928518b040e4a8fb5d354d22e1fd39361")
      override fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty.Builder.() -> Unit):
          Unit = codeHook(DialogCodeHookInvocationSettingProperty(codeHook))

      /**
       * @param conditional Provides a list of conditional branches.
       * Branches are evaluated in the order that they are entered in the list. The first branch
       * with a condition that evaluates to true is executed. The last branch in the list is the
       * default branch. The default branch should not have any condition expression. The default
       * branch is executed if no other branch has a matching condition.
       */
      override fun conditional(conditional: IResolvable) {
        cdkBuilder.conditional(conditional.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conditional Provides a list of conditional branches.
       * Branches are evaluated in the order that they are entered in the list. The first branch
       * with a condition that evaluates to true is executed. The last branch in the list is the
       * default branch. The default branch should not have any condition expression. The default
       * branch is executed if no other branch has a matching condition.
       */
      override fun conditional(conditional: ConditionalSpecificationProperty) {
        cdkBuilder.conditional(conditional.let(ConditionalSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param conditional Provides a list of conditional branches.
       * Branches are evaluated in the order that they are entered in the list. The first branch
       * with a condition that evaluates to true is executed. The last branch in the list is the
       * default branch. The default branch should not have any condition expression. The default
       * branch is executed if no other branch has a matching condition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7678c4d76f79454e532a8895a1190f4e45769f138b286efdb78c3b773ff2b7b")
      override fun conditional(conditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = conditional(ConditionalSpecificationProperty(conditional))

      /**
       * @param initialResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input.
       */
      override fun initialResponse(initialResponse: IResolvable) {
        cdkBuilder.initialResponse(initialResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param initialResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input.
       */
      override fun initialResponse(initialResponse: ResponseSpecificationProperty) {
        cdkBuilder.initialResponse(initialResponse.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param initialResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b7ec43483e41bcf878fa51c4940d54fcf094c37d78e8c612829ab78cc9bd30b")
      override
          fun initialResponse(initialResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = initialResponse(ResponseSpecificationProperty(initialResponse))

      /**
       * @param nextStep The next step in the conversation.
       */
      override fun nextStep(nextStep: IResolvable) {
        cdkBuilder.nextStep(nextStep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nextStep The next step in the conversation.
       */
      override fun nextStep(nextStep: DialogStateProperty) {
        cdkBuilder.nextStep(nextStep.let(DialogStateProperty.Companion::unwrap))
      }

      /**
       * @param nextStep The next step in the conversation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0444c0fb24ca278f7b72f4426b334e76418254528e24d5fa54ac4120ff441fc")
      override fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          nextStep(DialogStateProperty(nextStep))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.InitialResponseSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.InitialResponseSettingProperty,
    ) : CdkObject(cdkObject),
        InitialResponseSettingProperty {
      /**
       * Settings that specify the dialog code hook that is called by Amazon Lex at a step of the
       * conversation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-initialresponsesetting.html#cfn-lex-bot-initialresponsesetting-codehook)
       */
      override fun codeHook(): Any? = unwrap(this).getCodeHook()

      /**
       * Provides a list of conditional branches.
       *
       * Branches are evaluated in the order that they are entered in the list. The first branch
       * with a condition that evaluates to true is executed. The last branch in the list is the
       * default branch. The default branch should not have any condition expression. The default
       * branch is executed if no other branch has a matching condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-initialresponsesetting.html#cfn-lex-bot-initialresponsesetting-conditional)
       */
      override fun conditional(): Any? = unwrap(this).getConditional()

      /**
       * Specifies a list of message groups that Amazon Lex uses to respond the user input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-initialresponsesetting.html#cfn-lex-bot-initialresponsesetting-initialresponse)
       */
      override fun initialResponse(): Any? = unwrap(this).getInitialResponse()

      /**
       * The next step in the conversation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-initialresponsesetting.html#cfn-lex-bot-initialresponsesetting-nextstep)
       */
      override fun nextStep(): Any? = unwrap(this).getNextStep()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InitialResponseSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.InitialResponseSettingProperty):
          InitialResponseSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InitialResponseSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InitialResponseSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.InitialResponseSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.InitialResponseSettingProperty
    }
  }

  /**
   * A context that must be active for an intent to be selected by Amazon Lex.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * InputContextProperty inputContextProperty = InputContextProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-inputcontext.html)
   */
  public interface InputContextProperty {
    /**
     * The name of the context.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-inputcontext.html#cfn-lex-bot-inputcontext-name)
     */
    public fun name(): String

    /**
     * A builder for [InputContextProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the context. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.InputContextProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.InputContextProperty.builder()

      /**
       * @param name The name of the context. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.InputContextProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.InputContextProperty,
    ) : CdkObject(cdkObject),
        InputContextProperty {
      /**
       * The name of the context.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-inputcontext.html#cfn-lex-bot-inputcontext-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.InputContextProperty):
          InputContextProperty = CdkObjectWrappers.wrap(cdkObject) as? InputContextProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputContextProperty):
          software.amazon.awscdk.services.lex.CfnBot.InputContextProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.InputContextProperty
    }
  }

  /**
   * Provides a statement the Amazon Lex conveys to the user when the intent is successfully
   * fulfilled.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface IntentClosingSettingProperty {
    /**
     * The response that Amazon Lex sends to the user when the intent is complete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentclosingsetting.html#cfn-lex-bot-intentclosingsetting-closingresponse)
     */
    public fun closingResponse(): Any? = unwrap(this).getClosingResponse()

    /**
     * A list of conditional branches associated with the intent's closing response.
     *
     * These branches are executed when the `nextStep` attribute is set to `EvalutateConditional` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentclosingsetting.html#cfn-lex-bot-intentclosingsetting-conditional)
     */
    public fun conditional(): Any? = unwrap(this).getConditional()

    /**
     * Specifies whether an intent's closing response is used.
     *
     * When this field is false, the closing response isn't sent to the user. If the `IsActive`
     * field isn't specified, the default is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentclosingsetting.html#cfn-lex-bot-intentclosingsetting-isactive)
     */
    public fun isActive(): Any? = unwrap(this).getIsActive()

    /**
     * Specifies the next step that the bot executes after playing the intent's closing response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentclosingsetting.html#cfn-lex-bot-intentclosingsetting-nextstep)
     */
    public fun nextStep(): Any? = unwrap(this).getNextStep()

    /**
     * A builder for [IntentClosingSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param closingResponse The response that Amazon Lex sends to the user when the intent is
       * complete.
       */
      public fun closingResponse(closingResponse: IResolvable)

      /**
       * @param closingResponse The response that Amazon Lex sends to the user when the intent is
       * complete.
       */
      public fun closingResponse(closingResponse: ResponseSpecificationProperty)

      /**
       * @param closingResponse The response that Amazon Lex sends to the user when the intent is
       * complete.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c3633d12b4e10d44f6f195a822eb8b634d98f0eaac402461a010ba84a51082e")
      public fun closingResponse(closingResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      /**
       * @param conditional A list of conditional branches associated with the intent's closing
       * response.
       * These branches are executed when the `nextStep` attribute is set to `EvalutateConditional`
       * .
       */
      public fun conditional(conditional: IResolvable)

      /**
       * @param conditional A list of conditional branches associated with the intent's closing
       * response.
       * These branches are executed when the `nextStep` attribute is set to `EvalutateConditional`
       * .
       */
      public fun conditional(conditional: ConditionalSpecificationProperty)

      /**
       * @param conditional A list of conditional branches associated with the intent's closing
       * response.
       * These branches are executed when the `nextStep` attribute is set to `EvalutateConditional`
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29c9fb89498a2efedf8a6daa2f7516f87ceed5ad64d8f6040524befb415eb07e")
      public fun conditional(conditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      /**
       * @param isActive Specifies whether an intent's closing response is used.
       * When this field is false, the closing response isn't sent to the user. If the `IsActive`
       * field isn't specified, the default is true.
       */
      public fun isActive(isActive: Boolean)

      /**
       * @param isActive Specifies whether an intent's closing response is used.
       * When this field is false, the closing response isn't sent to the user. If the `IsActive`
       * field isn't specified, the default is true.
       */
      public fun isActive(isActive: IResolvable)

      /**
       * @param nextStep Specifies the next step that the bot executes after playing the intent's
       * closing response.
       */
      public fun nextStep(nextStep: IResolvable)

      /**
       * @param nextStep Specifies the next step that the bot executes after playing the intent's
       * closing response.
       */
      public fun nextStep(nextStep: DialogStateProperty)

      /**
       * @param nextStep Specifies the next step that the bot executes after playing the intent's
       * closing response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e9026b933eb5f24f8c6e95d62325b60695866c88a81fa1b5d27e77b839c87ed")
      public fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.IntentClosingSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.IntentClosingSettingProperty.builder()

      /**
       * @param closingResponse The response that Amazon Lex sends to the user when the intent is
       * complete.
       */
      override fun closingResponse(closingResponse: IResolvable) {
        cdkBuilder.closingResponse(closingResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param closingResponse The response that Amazon Lex sends to the user when the intent is
       * complete.
       */
      override fun closingResponse(closingResponse: ResponseSpecificationProperty) {
        cdkBuilder.closingResponse(closingResponse.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param closingResponse The response that Amazon Lex sends to the user when the intent is
       * complete.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c3633d12b4e10d44f6f195a822eb8b634d98f0eaac402461a010ba84a51082e")
      override
          fun closingResponse(closingResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = closingResponse(ResponseSpecificationProperty(closingResponse))

      /**
       * @param conditional A list of conditional branches associated with the intent's closing
       * response.
       * These branches are executed when the `nextStep` attribute is set to `EvalutateConditional`
       * .
       */
      override fun conditional(conditional: IResolvable) {
        cdkBuilder.conditional(conditional.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conditional A list of conditional branches associated with the intent's closing
       * response.
       * These branches are executed when the `nextStep` attribute is set to `EvalutateConditional`
       * .
       */
      override fun conditional(conditional: ConditionalSpecificationProperty) {
        cdkBuilder.conditional(conditional.let(ConditionalSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param conditional A list of conditional branches associated with the intent's closing
       * response.
       * These branches are executed when the `nextStep` attribute is set to `EvalutateConditional`
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29c9fb89498a2efedf8a6daa2f7516f87ceed5ad64d8f6040524befb415eb07e")
      override fun conditional(conditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = conditional(ConditionalSpecificationProperty(conditional))

      /**
       * @param isActive Specifies whether an intent's closing response is used.
       * When this field is false, the closing response isn't sent to the user. If the `IsActive`
       * field isn't specified, the default is true.
       */
      override fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
      }

      /**
       * @param isActive Specifies whether an intent's closing response is used.
       * When this field is false, the closing response isn't sent to the user. If the `IsActive`
       * field isn't specified, the default is true.
       */
      override fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nextStep Specifies the next step that the bot executes after playing the intent's
       * closing response.
       */
      override fun nextStep(nextStep: IResolvable) {
        cdkBuilder.nextStep(nextStep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nextStep Specifies the next step that the bot executes after playing the intent's
       * closing response.
       */
      override fun nextStep(nextStep: DialogStateProperty) {
        cdkBuilder.nextStep(nextStep.let(DialogStateProperty.Companion::unwrap))
      }

      /**
       * @param nextStep Specifies the next step that the bot executes after playing the intent's
       * closing response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e9026b933eb5f24f8c6e95d62325b60695866c88a81fa1b5d27e77b839c87ed")
      override fun nextStep(nextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          nextStep(DialogStateProperty(nextStep))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.IntentClosingSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.IntentClosingSettingProperty,
    ) : CdkObject(cdkObject),
        IntentClosingSettingProperty {
      /**
       * The response that Amazon Lex sends to the user when the intent is complete.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentclosingsetting.html#cfn-lex-bot-intentclosingsetting-closingresponse)
       */
      override fun closingResponse(): Any? = unwrap(this).getClosingResponse()

      /**
       * A list of conditional branches associated with the intent's closing response.
       *
       * These branches are executed when the `nextStep` attribute is set to `EvalutateConditional`
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentclosingsetting.html#cfn-lex-bot-intentclosingsetting-conditional)
       */
      override fun conditional(): Any? = unwrap(this).getConditional()

      /**
       * Specifies whether an intent's closing response is used.
       *
       * When this field is false, the closing response isn't sent to the user. If the `IsActive`
       * field isn't specified, the default is true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentclosingsetting.html#cfn-lex-bot-intentclosingsetting-isactive)
       */
      override fun isActive(): Any? = unwrap(this).getIsActive()

      /**
       * Specifies the next step that the bot executes after playing the intent's closing response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentclosingsetting.html#cfn-lex-bot-intentclosingsetting-nextstep)
       */
      override fun nextStep(): Any? = unwrap(this).getNextStep()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntentClosingSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.IntentClosingSettingProperty):
          IntentClosingSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IntentClosingSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntentClosingSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.IntentClosingSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.IntentClosingSettingProperty
    }
  }

  /**
   * Provides a prompt for making sure that the user is ready for the intent to be fulfilled.
   *
   * Example:
   *
   * ```
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html)
   */
  public interface IntentConfirmationSettingProperty {
    /**
     * The `DialogCodeHookInvocationSetting` object associated with intent's confirmation step.
     *
     * The dialog code hook is triggered based on these invocation settings when the confirmation
     * next step or declination next step or failure next step is `InvokeDialogCodeHook` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-codehook)
     */
    public fun codeHook(): Any? = unwrap(this).getCodeHook()

    /**
     * A list of conditional branches to evaluate after the intent is closed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-confirmationconditional)
     */
    public fun confirmationConditional(): Any? = unwrap(this).getConfirmationConditional()

    /**
     * Specifies the next step that the bot executes when the customer confirms the intent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-confirmationnextstep)
     */
    public fun confirmationNextStep(): Any? = unwrap(this).getConfirmationNextStep()

    /**
     * Specifies a list of message groups that Amazon Lex uses to respond the user input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-confirmationresponse)
     */
    public fun confirmationResponse(): Any? = unwrap(this).getConfirmationResponse()

    /**
     * A list of conditional branches to evaluate after the intent is declined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-declinationconditional)
     */
    public fun declinationConditional(): Any? = unwrap(this).getDeclinationConditional()

    /**
     * Specifies the next step that the bot executes when the customer declines the intent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-declinationnextstep)
     */
    public fun declinationNextStep(): Any? = unwrap(this).getDeclinationNextStep()

    /**
     * When the user answers "no" to the question defined in `promptSpecification` , Amazon Lex
     * responds with this response to acknowledge that the intent was canceled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-declinationresponse)
     */
    public fun declinationResponse(): Any? = unwrap(this).getDeclinationResponse()

    /**
     * The `DialogCodeHookInvocationSetting` used when the code hook is invoked during confirmation
     * prompt retries.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-elicitationcodehook)
     */
    public fun elicitationCodeHook(): Any? = unwrap(this).getElicitationCodeHook()

    /**
     * Provides a list of conditional branches.
     *
     * Branches are evaluated in the order that they are entered in the list. The first branch with
     * a condition that evaluates to true is executed. The last branch in the list is the default
     * branch. The default branch should not have any condition expression. The default branch is
     * executed if no other branch has a matching condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-failureconditional)
     */
    public fun failureConditional(): Any? = unwrap(this).getFailureConditional()

    /**
     * The next step to take in the conversation if the confirmation step fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-failurenextstep)
     */
    public fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

    /**
     * Specifies a list of message groups that Amazon Lex uses to respond the user input when the
     * intent confirmation fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-failureresponse)
     */
    public fun failureResponse(): Any? = unwrap(this).getFailureResponse()

    /**
     * Specifies whether the intent's confirmation is sent to the user.
     *
     * When this field is false, confirmation and declination responses aren't sent. If the
     * `IsActive` field isn't specified, the default is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-isactive)
     */
    public fun isActive(): Any? = unwrap(this).getIsActive()

    /**
     * Prompts the user to confirm the intent. This question should have a yes or no answer.
     *
     * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for
     * fulfillment. For example, with the `OrderPizza` intent, you might want to confirm that the order
     * is correct before placing it. For other intents, such as intents that simply respond to user
     * questions, you might not need to ask the user for confirmation before providing the information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-promptspecification)
     */
    public fun promptSpecification(): Any

    /**
     * A builder for [IntentConfirmationSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param codeHook The `DialogCodeHookInvocationSetting` object associated with intent's
       * confirmation step.
       * The dialog code hook is triggered based on these invocation settings when the confirmation
       * next step or declination next step or failure next step is `InvokeDialogCodeHook` .
       */
      public fun codeHook(codeHook: IResolvable)

      /**
       * @param codeHook The `DialogCodeHookInvocationSetting` object associated with intent's
       * confirmation step.
       * The dialog code hook is triggered based on these invocation settings when the confirmation
       * next step or declination next step or failure next step is `InvokeDialogCodeHook` .
       */
      public fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty)

      /**
       * @param codeHook The `DialogCodeHookInvocationSetting` object associated with intent's
       * confirmation step.
       * The dialog code hook is triggered based on these invocation settings when the confirmation
       * next step or declination next step or failure next step is `InvokeDialogCodeHook` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7107d5f225da12ceaddae026b72696337e6d0a863969dde0c8a63be776a093a")
      public fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty.Builder.() -> Unit)

      /**
       * @param confirmationConditional A list of conditional branches to evaluate after the intent
       * is closed.
       */
      public fun confirmationConditional(confirmationConditional: IResolvable)

      /**
       * @param confirmationConditional A list of conditional branches to evaluate after the intent
       * is closed.
       */
      public fun confirmationConditional(confirmationConditional: ConditionalSpecificationProperty)

      /**
       * @param confirmationConditional A list of conditional branches to evaluate after the intent
       * is closed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebce763d168bdce2ea5f9704d99122b5391d7b9053ffddd1746e459045f2bf1e")
      public
          fun confirmationConditional(confirmationConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      /**
       * @param confirmationNextStep Specifies the next step that the bot executes when the customer
       * confirms the intent.
       */
      public fun confirmationNextStep(confirmationNextStep: IResolvable)

      /**
       * @param confirmationNextStep Specifies the next step that the bot executes when the customer
       * confirms the intent.
       */
      public fun confirmationNextStep(confirmationNextStep: DialogStateProperty)

      /**
       * @param confirmationNextStep Specifies the next step that the bot executes when the customer
       * confirms the intent.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92252d01a23366c7f5af3fda3130a644232f17ec30b3e26fea5a0344fb0ce7c9")
      public fun confirmationNextStep(confirmationNextStep: DialogStateProperty.Builder.() -> Unit)

      /**
       * @param confirmationResponse Specifies a list of message groups that Amazon Lex uses to
       * respond the user input.
       */
      public fun confirmationResponse(confirmationResponse: IResolvable)

      /**
       * @param confirmationResponse Specifies a list of message groups that Amazon Lex uses to
       * respond the user input.
       */
      public fun confirmationResponse(confirmationResponse: ResponseSpecificationProperty)

      /**
       * @param confirmationResponse Specifies a list of message groups that Amazon Lex uses to
       * respond the user input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab1133f530b5e02ebe17440bf0f63922e57873816cbd60f120151814326e0823")
      public
          fun confirmationResponse(confirmationResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      /**
       * @param declinationConditional A list of conditional branches to evaluate after the intent
       * is declined.
       */
      public fun declinationConditional(declinationConditional: IResolvable)

      /**
       * @param declinationConditional A list of conditional branches to evaluate after the intent
       * is declined.
       */
      public fun declinationConditional(declinationConditional: ConditionalSpecificationProperty)

      /**
       * @param declinationConditional A list of conditional branches to evaluate after the intent
       * is declined.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6dc8338a076e8b84a3bb90983fb81f61d2bbd0c27f9f05b59b17a05b8530221")
      public
          fun declinationConditional(declinationConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      /**
       * @param declinationNextStep Specifies the next step that the bot executes when the customer
       * declines the intent.
       */
      public fun declinationNextStep(declinationNextStep: IResolvable)

      /**
       * @param declinationNextStep Specifies the next step that the bot executes when the customer
       * declines the intent.
       */
      public fun declinationNextStep(declinationNextStep: DialogStateProperty)

      /**
       * @param declinationNextStep Specifies the next step that the bot executes when the customer
       * declines the intent.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("021dd7a73ddf2c8f8f3334cc0134247737ae805738911313c3a670457662721d")
      public fun declinationNextStep(declinationNextStep: DialogStateProperty.Builder.() -> Unit)

      /**
       * @param declinationResponse When the user answers "no" to the question defined in
       * `promptSpecification` , Amazon Lex responds with this response to acknowledge that the intent
       * was canceled.
       */
      public fun declinationResponse(declinationResponse: IResolvable)

      /**
       * @param declinationResponse When the user answers "no" to the question defined in
       * `promptSpecification` , Amazon Lex responds with this response to acknowledge that the intent
       * was canceled.
       */
      public fun declinationResponse(declinationResponse: ResponseSpecificationProperty)

      /**
       * @param declinationResponse When the user answers "no" to the question defined in
       * `promptSpecification` , Amazon Lex responds with this response to acknowledge that the intent
       * was canceled.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63c7c3e99fb1f82251b6c49854a3f7f9b1820b1170412a08b7d2d956ae5c6960")
      public
          fun declinationResponse(declinationResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      /**
       * @param elicitationCodeHook The `DialogCodeHookInvocationSetting` used when the code hook is
       * invoked during confirmation prompt retries.
       */
      public fun elicitationCodeHook(elicitationCodeHook: IResolvable)

      /**
       * @param elicitationCodeHook The `DialogCodeHookInvocationSetting` used when the code hook is
       * invoked during confirmation prompt retries.
       */
      public
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty)

      /**
       * @param elicitationCodeHook The `DialogCodeHookInvocationSetting` used when the code hook is
       * invoked during confirmation prompt retries.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6346ae19c4090e5400a5ec1c8d86cbd011fc6511e3fada66887a0c55b511e29")
      public
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty.Builder.() -> Unit)

      /**
       * @param failureConditional Provides a list of conditional branches.
       * Branches are evaluated in the order that they are entered in the list. The first branch
       * with a condition that evaluates to true is executed. The last branch in the list is the
       * default branch. The default branch should not have any condition expression. The default
       * branch is executed if no other branch has a matching condition.
       */
      public fun failureConditional(failureConditional: IResolvable)

      /**
       * @param failureConditional Provides a list of conditional branches.
       * Branches are evaluated in the order that they are entered in the list. The first branch
       * with a condition that evaluates to true is executed. The last branch in the list is the
       * default branch. The default branch should not have any condition expression. The default
       * branch is executed if no other branch has a matching condition.
       */
      public fun failureConditional(failureConditional: ConditionalSpecificationProperty)

      /**
       * @param failureConditional Provides a list of conditional branches.
       * Branches are evaluated in the order that they are entered in the list. The first branch
       * with a condition that evaluates to true is executed. The last branch in the list is the
       * default branch. The default branch should not have any condition expression. The default
       * branch is executed if no other branch has a matching condition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2ad47ab9541daa21cc17c5035f28b1b4ae211308bc4d9348ecfc2881eddd509")
      public
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      /**
       * @param failureNextStep The next step to take in the conversation if the confirmation step
       * fails.
       */
      public fun failureNextStep(failureNextStep: IResolvable)

      /**
       * @param failureNextStep The next step to take in the conversation if the confirmation step
       * fails.
       */
      public fun failureNextStep(failureNextStep: DialogStateProperty)

      /**
       * @param failureNextStep The next step to take in the conversation if the confirmation step
       * fails.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20982cc55c34a1e521af5b7c64ec6662dc43942599a272e6d0501ff7524d4024")
      public fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit)

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the intent confirmation fails.
       */
      public fun failureResponse(failureResponse: IResolvable)

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the intent confirmation fails.
       */
      public fun failureResponse(failureResponse: ResponseSpecificationProperty)

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the intent confirmation fails.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ffb1d90267fddadbd9f91891428e148068d5ad8b985cc0f02d25a499328253d")
      public fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      /**
       * @param isActive Specifies whether the intent's confirmation is sent to the user.
       * When this field is false, confirmation and declination responses aren't sent. If the
       * `IsActive` field isn't specified, the default is true.
       */
      public fun isActive(isActive: Boolean)

      /**
       * @param isActive Specifies whether the intent's confirmation is sent to the user.
       * When this field is false, confirmation and declination responses aren't sent. If the
       * `IsActive` field isn't specified, the default is true.
       */
      public fun isActive(isActive: IResolvable)

      /**
       * @param promptSpecification Prompts the user to confirm the intent. This question should
       * have a yes or no answer. 
       * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready
       * for fulfillment. For example, with the `OrderPizza` intent, you might want to confirm that the
       * order is correct before placing it. For other intents, such as intents that simply respond to
       * user questions, you might not need to ask the user for confirmation before providing the
       * information.
       */
      public fun promptSpecification(promptSpecification: IResolvable)

      /**
       * @param promptSpecification Prompts the user to confirm the intent. This question should
       * have a yes or no answer. 
       * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready
       * for fulfillment. For example, with the `OrderPizza` intent, you might want to confirm that the
       * order is correct before placing it. For other intents, such as intents that simply respond to
       * user questions, you might not need to ask the user for confirmation before providing the
       * information.
       */
      public fun promptSpecification(promptSpecification: PromptSpecificationProperty)

      /**
       * @param promptSpecification Prompts the user to confirm the intent. This question should
       * have a yes or no answer. 
       * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready
       * for fulfillment. For example, with the `OrderPizza` intent, you might want to confirm that the
       * order is correct before placing it. For other intents, such as intents that simply respond to
       * user questions, you might not need to ask the user for confirmation before providing the
       * information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe263cbd2bd4f3d5018570e2b23e70ac31d7f3ad70a9b4df60008559a99bcd30")
      public
          fun promptSpecification(promptSpecification: PromptSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.IntentConfirmationSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.IntentConfirmationSettingProperty.builder()

      /**
       * @param codeHook The `DialogCodeHookInvocationSetting` object associated with intent's
       * confirmation step.
       * The dialog code hook is triggered based on these invocation settings when the confirmation
       * next step or declination next step or failure next step is `InvokeDialogCodeHook` .
       */
      override fun codeHook(codeHook: IResolvable) {
        cdkBuilder.codeHook(codeHook.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param codeHook The `DialogCodeHookInvocationSetting` object associated with intent's
       * confirmation step.
       * The dialog code hook is triggered based on these invocation settings when the confirmation
       * next step or declination next step or failure next step is `InvokeDialogCodeHook` .
       */
      override fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty) {
        cdkBuilder.codeHook(codeHook.let(DialogCodeHookInvocationSettingProperty.Companion::unwrap))
      }

      /**
       * @param codeHook The `DialogCodeHookInvocationSetting` object associated with intent's
       * confirmation step.
       * The dialog code hook is triggered based on these invocation settings when the confirmation
       * next step or declination next step or failure next step is `InvokeDialogCodeHook` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7107d5f225da12ceaddae026b72696337e6d0a863969dde0c8a63be776a093a")
      override fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty.Builder.() -> Unit):
          Unit = codeHook(DialogCodeHookInvocationSettingProperty(codeHook))

      /**
       * @param confirmationConditional A list of conditional branches to evaluate after the intent
       * is closed.
       */
      override fun confirmationConditional(confirmationConditional: IResolvable) {
        cdkBuilder.confirmationConditional(confirmationConditional.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param confirmationConditional A list of conditional branches to evaluate after the intent
       * is closed.
       */
      override
          fun confirmationConditional(confirmationConditional: ConditionalSpecificationProperty) {
        cdkBuilder.confirmationConditional(confirmationConditional.let(ConditionalSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param confirmationConditional A list of conditional branches to evaluate after the intent
       * is closed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebce763d168bdce2ea5f9704d99122b5391d7b9053ffddd1746e459045f2bf1e")
      override
          fun confirmationConditional(confirmationConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = confirmationConditional(ConditionalSpecificationProperty(confirmationConditional))

      /**
       * @param confirmationNextStep Specifies the next step that the bot executes when the customer
       * confirms the intent.
       */
      override fun confirmationNextStep(confirmationNextStep: IResolvable) {
        cdkBuilder.confirmationNextStep(confirmationNextStep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param confirmationNextStep Specifies the next step that the bot executes when the customer
       * confirms the intent.
       */
      override fun confirmationNextStep(confirmationNextStep: DialogStateProperty) {
        cdkBuilder.confirmationNextStep(confirmationNextStep.let(DialogStateProperty.Companion::unwrap))
      }

      /**
       * @param confirmationNextStep Specifies the next step that the bot executes when the customer
       * confirms the intent.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92252d01a23366c7f5af3fda3130a644232f17ec30b3e26fea5a0344fb0ce7c9")
      override
          fun confirmationNextStep(confirmationNextStep: DialogStateProperty.Builder.() -> Unit):
          Unit = confirmationNextStep(DialogStateProperty(confirmationNextStep))

      /**
       * @param confirmationResponse Specifies a list of message groups that Amazon Lex uses to
       * respond the user input.
       */
      override fun confirmationResponse(confirmationResponse: IResolvable) {
        cdkBuilder.confirmationResponse(confirmationResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param confirmationResponse Specifies a list of message groups that Amazon Lex uses to
       * respond the user input.
       */
      override fun confirmationResponse(confirmationResponse: ResponseSpecificationProperty) {
        cdkBuilder.confirmationResponse(confirmationResponse.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param confirmationResponse Specifies a list of message groups that Amazon Lex uses to
       * respond the user input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab1133f530b5e02ebe17440bf0f63922e57873816cbd60f120151814326e0823")
      override
          fun confirmationResponse(confirmationResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = confirmationResponse(ResponseSpecificationProperty(confirmationResponse))

      /**
       * @param declinationConditional A list of conditional branches to evaluate after the intent
       * is declined.
       */
      override fun declinationConditional(declinationConditional: IResolvable) {
        cdkBuilder.declinationConditional(declinationConditional.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param declinationConditional A list of conditional branches to evaluate after the intent
       * is declined.
       */
      override
          fun declinationConditional(declinationConditional: ConditionalSpecificationProperty) {
        cdkBuilder.declinationConditional(declinationConditional.let(ConditionalSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param declinationConditional A list of conditional branches to evaluate after the intent
       * is declined.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6dc8338a076e8b84a3bb90983fb81f61d2bbd0c27f9f05b59b17a05b8530221")
      override
          fun declinationConditional(declinationConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = declinationConditional(ConditionalSpecificationProperty(declinationConditional))

      /**
       * @param declinationNextStep Specifies the next step that the bot executes when the customer
       * declines the intent.
       */
      override fun declinationNextStep(declinationNextStep: IResolvable) {
        cdkBuilder.declinationNextStep(declinationNextStep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param declinationNextStep Specifies the next step that the bot executes when the customer
       * declines the intent.
       */
      override fun declinationNextStep(declinationNextStep: DialogStateProperty) {
        cdkBuilder.declinationNextStep(declinationNextStep.let(DialogStateProperty.Companion::unwrap))
      }

      /**
       * @param declinationNextStep Specifies the next step that the bot executes when the customer
       * declines the intent.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("021dd7a73ddf2c8f8f3334cc0134247737ae805738911313c3a670457662721d")
      override fun declinationNextStep(declinationNextStep: DialogStateProperty.Builder.() -> Unit):
          Unit = declinationNextStep(DialogStateProperty(declinationNextStep))

      /**
       * @param declinationResponse When the user answers "no" to the question defined in
       * `promptSpecification` , Amazon Lex responds with this response to acknowledge that the intent
       * was canceled.
       */
      override fun declinationResponse(declinationResponse: IResolvable) {
        cdkBuilder.declinationResponse(declinationResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param declinationResponse When the user answers "no" to the question defined in
       * `promptSpecification` , Amazon Lex responds with this response to acknowledge that the intent
       * was canceled.
       */
      override fun declinationResponse(declinationResponse: ResponseSpecificationProperty) {
        cdkBuilder.declinationResponse(declinationResponse.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param declinationResponse When the user answers "no" to the question defined in
       * `promptSpecification` , Amazon Lex responds with this response to acknowledge that the intent
       * was canceled.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63c7c3e99fb1f82251b6c49854a3f7f9b1820b1170412a08b7d2d956ae5c6960")
      override
          fun declinationResponse(declinationResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = declinationResponse(ResponseSpecificationProperty(declinationResponse))

      /**
       * @param elicitationCodeHook The `DialogCodeHookInvocationSetting` used when the code hook is
       * invoked during confirmation prompt retries.
       */
      override fun elicitationCodeHook(elicitationCodeHook: IResolvable) {
        cdkBuilder.elicitationCodeHook(elicitationCodeHook.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param elicitationCodeHook The `DialogCodeHookInvocationSetting` used when the code hook is
       * invoked during confirmation prompt retries.
       */
      override
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty) {
        cdkBuilder.elicitationCodeHook(elicitationCodeHook.let(ElicitationCodeHookInvocationSettingProperty.Companion::unwrap))
      }

      /**
       * @param elicitationCodeHook The `DialogCodeHookInvocationSetting` used when the code hook is
       * invoked during confirmation prompt retries.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6346ae19c4090e5400a5ec1c8d86cbd011fc6511e3fada66887a0c55b511e29")
      override
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty.Builder.() -> Unit):
          Unit =
          elicitationCodeHook(ElicitationCodeHookInvocationSettingProperty(elicitationCodeHook))

      /**
       * @param failureConditional Provides a list of conditional branches.
       * Branches are evaluated in the order that they are entered in the list. The first branch
       * with a condition that evaluates to true is executed. The last branch in the list is the
       * default branch. The default branch should not have any condition expression. The default
       * branch is executed if no other branch has a matching condition.
       */
      override fun failureConditional(failureConditional: IResolvable) {
        cdkBuilder.failureConditional(failureConditional.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param failureConditional Provides a list of conditional branches.
       * Branches are evaluated in the order that they are entered in the list. The first branch
       * with a condition that evaluates to true is executed. The last branch in the list is the
       * default branch. The default branch should not have any condition expression. The default
       * branch is executed if no other branch has a matching condition.
       */
      override fun failureConditional(failureConditional: ConditionalSpecificationProperty) {
        cdkBuilder.failureConditional(failureConditional.let(ConditionalSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param failureConditional Provides a list of conditional branches.
       * Branches are evaluated in the order that they are entered in the list. The first branch
       * with a condition that evaluates to true is executed. The last branch in the list is the
       * default branch. The default branch should not have any condition expression. The default
       * branch is executed if no other branch has a matching condition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2ad47ab9541daa21cc17c5035f28b1b4ae211308bc4d9348ecfc2881eddd509")
      override
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = failureConditional(ConditionalSpecificationProperty(failureConditional))

      /**
       * @param failureNextStep The next step to take in the conversation if the confirmation step
       * fails.
       */
      override fun failureNextStep(failureNextStep: IResolvable) {
        cdkBuilder.failureNextStep(failureNextStep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param failureNextStep The next step to take in the conversation if the confirmation step
       * fails.
       */
      override fun failureNextStep(failureNextStep: DialogStateProperty) {
        cdkBuilder.failureNextStep(failureNextStep.let(DialogStateProperty.Companion::unwrap))
      }

      /**
       * @param failureNextStep The next step to take in the conversation if the confirmation step
       * fails.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20982cc55c34a1e521af5b7c64ec6662dc43942599a272e6d0501ff7524d4024")
      override fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          failureNextStep(DialogStateProperty(failureNextStep))

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the intent confirmation fails.
       */
      override fun failureResponse(failureResponse: IResolvable) {
        cdkBuilder.failureResponse(failureResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the intent confirmation fails.
       */
      override fun failureResponse(failureResponse: ResponseSpecificationProperty) {
        cdkBuilder.failureResponse(failureResponse.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the intent confirmation fails.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ffb1d90267fddadbd9f91891428e148068d5ad8b985cc0f02d25a499328253d")
      override
          fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = failureResponse(ResponseSpecificationProperty(failureResponse))

      /**
       * @param isActive Specifies whether the intent's confirmation is sent to the user.
       * When this field is false, confirmation and declination responses aren't sent. If the
       * `IsActive` field isn't specified, the default is true.
       */
      override fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
      }

      /**
       * @param isActive Specifies whether the intent's confirmation is sent to the user.
       * When this field is false, confirmation and declination responses aren't sent. If the
       * `IsActive` field isn't specified, the default is true.
       */
      override fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param promptSpecification Prompts the user to confirm the intent. This question should
       * have a yes or no answer. 
       * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready
       * for fulfillment. For example, with the `OrderPizza` intent, you might want to confirm that the
       * order is correct before placing it. For other intents, such as intents that simply respond to
       * user questions, you might not need to ask the user for confirmation before providing the
       * information.
       */
      override fun promptSpecification(promptSpecification: IResolvable) {
        cdkBuilder.promptSpecification(promptSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param promptSpecification Prompts the user to confirm the intent. This question should
       * have a yes or no answer. 
       * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready
       * for fulfillment. For example, with the `OrderPizza` intent, you might want to confirm that the
       * order is correct before placing it. For other intents, such as intents that simply respond to
       * user questions, you might not need to ask the user for confirmation before providing the
       * information.
       */
      override fun promptSpecification(promptSpecification: PromptSpecificationProperty) {
        cdkBuilder.promptSpecification(promptSpecification.let(PromptSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param promptSpecification Prompts the user to confirm the intent. This question should
       * have a yes or no answer. 
       * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready
       * for fulfillment. For example, with the `OrderPizza` intent, you might want to confirm that the
       * order is correct before placing it. For other intents, such as intents that simply respond to
       * user questions, you might not need to ask the user for confirmation before providing the
       * information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe263cbd2bd4f3d5018570e2b23e70ac31d7f3ad70a9b4df60008559a99bcd30")
      override
          fun promptSpecification(promptSpecification: PromptSpecificationProperty.Builder.() -> Unit):
          Unit = promptSpecification(PromptSpecificationProperty(promptSpecification))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.IntentConfirmationSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.IntentConfirmationSettingProperty,
    ) : CdkObject(cdkObject),
        IntentConfirmationSettingProperty {
      /**
       * The `DialogCodeHookInvocationSetting` object associated with intent's confirmation step.
       *
       * The dialog code hook is triggered based on these invocation settings when the confirmation
       * next step or declination next step or failure next step is `InvokeDialogCodeHook` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-codehook)
       */
      override fun codeHook(): Any? = unwrap(this).getCodeHook()

      /**
       * A list of conditional branches to evaluate after the intent is closed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-confirmationconditional)
       */
      override fun confirmationConditional(): Any? = unwrap(this).getConfirmationConditional()

      /**
       * Specifies the next step that the bot executes when the customer confirms the intent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-confirmationnextstep)
       */
      override fun confirmationNextStep(): Any? = unwrap(this).getConfirmationNextStep()

      /**
       * Specifies a list of message groups that Amazon Lex uses to respond the user input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-confirmationresponse)
       */
      override fun confirmationResponse(): Any? = unwrap(this).getConfirmationResponse()

      /**
       * A list of conditional branches to evaluate after the intent is declined.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-declinationconditional)
       */
      override fun declinationConditional(): Any? = unwrap(this).getDeclinationConditional()

      /**
       * Specifies the next step that the bot executes when the customer declines the intent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-declinationnextstep)
       */
      override fun declinationNextStep(): Any? = unwrap(this).getDeclinationNextStep()

      /**
       * When the user answers "no" to the question defined in `promptSpecification` , Amazon Lex
       * responds with this response to acknowledge that the intent was canceled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-declinationresponse)
       */
      override fun declinationResponse(): Any? = unwrap(this).getDeclinationResponse()

      /**
       * The `DialogCodeHookInvocationSetting` used when the code hook is invoked during
       * confirmation prompt retries.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-elicitationcodehook)
       */
      override fun elicitationCodeHook(): Any? = unwrap(this).getElicitationCodeHook()

      /**
       * Provides a list of conditional branches.
       *
       * Branches are evaluated in the order that they are entered in the list. The first branch
       * with a condition that evaluates to true is executed. The last branch in the list is the
       * default branch. The default branch should not have any condition expression. The default
       * branch is executed if no other branch has a matching condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-failureconditional)
       */
      override fun failureConditional(): Any? = unwrap(this).getFailureConditional()

      /**
       * The next step to take in the conversation if the confirmation step fails.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-failurenextstep)
       */
      override fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

      /**
       * Specifies a list of message groups that Amazon Lex uses to respond the user input when the
       * intent confirmation fails.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-failureresponse)
       */
      override fun failureResponse(): Any? = unwrap(this).getFailureResponse()

      /**
       * Specifies whether the intent's confirmation is sent to the user.
       *
       * When this field is false, confirmation and declination responses aren't sent. If the
       * `IsActive` field isn't specified, the default is true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-isactive)
       */
      override fun isActive(): Any? = unwrap(this).getIsActive()

      /**
       * Prompts the user to confirm the intent. This question should have a yes or no answer.
       *
       * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready
       * for fulfillment. For example, with the `OrderPizza` intent, you might want to confirm that the
       * order is correct before placing it. For other intents, such as intents that simply respond to
       * user questions, you might not need to ask the user for confirmation before providing the
       * information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentconfirmationsetting.html#cfn-lex-bot-intentconfirmationsetting-promptspecification)
       */
      override fun promptSpecification(): Any = unwrap(this).getPromptSpecification()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IntentConfirmationSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.IntentConfirmationSettingProperty):
          IntentConfirmationSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IntentConfirmationSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntentConfirmationSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.IntentConfirmationSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.IntentConfirmationSettingProperty
    }
  }

  /**
   * Override settings to configure the intent state.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface IntentOverrideProperty {
    /**
     * The name of the intent.
     *
     * Only required when you're switching intents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentoverride.html#cfn-lex-bot-intentoverride-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A map of all of the slot value overrides for the intent.
     *
     * The name of the slot maps to the value of the slot. Slots that are not included in the map
     * aren't overridden.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentoverride.html#cfn-lex-bot-intentoverride-slots)
     */
    public fun slots(): Any? = unwrap(this).getSlots()

    /**
     * A builder for [IntentOverrideProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the intent.
       * Only required when you're switching intents.
       */
      public fun name(name: String)

      /**
       * @param slots A map of all of the slot value overrides for the intent.
       * The name of the slot maps to the value of the slot. Slots that are not included in the map
       * aren't overridden.
       */
      public fun slots(slots: IResolvable)

      /**
       * @param slots A map of all of the slot value overrides for the intent.
       * The name of the slot maps to the value of the slot. Slots that are not included in the map
       * aren't overridden.
       */
      public fun slots(slots: List<Any>)

      /**
       * @param slots A map of all of the slot value overrides for the intent.
       * The name of the slot maps to the value of the slot. Slots that are not included in the map
       * aren't overridden.
       */
      public fun slots(vararg slots: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.IntentOverrideProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.IntentOverrideProperty.builder()

      /**
       * @param name The name of the intent.
       * Only required when you're switching intents.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param slots A map of all of the slot value overrides for the intent.
       * The name of the slot maps to the value of the slot. Slots that are not included in the map
       * aren't overridden.
       */
      override fun slots(slots: IResolvable) {
        cdkBuilder.slots(slots.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param slots A map of all of the slot value overrides for the intent.
       * The name of the slot maps to the value of the slot. Slots that are not included in the map
       * aren't overridden.
       */
      override fun slots(slots: List<Any>) {
        cdkBuilder.slots(slots.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param slots A map of all of the slot value overrides for the intent.
       * The name of the slot maps to the value of the slot. Slots that are not included in the map
       * aren't overridden.
       */
      override fun slots(vararg slots: Any): Unit = slots(slots.toList())

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.IntentOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.IntentOverrideProperty,
    ) : CdkObject(cdkObject),
        IntentOverrideProperty {
      /**
       * The name of the intent.
       *
       * Only required when you're switching intents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentoverride.html#cfn-lex-bot-intentoverride-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * A map of all of the slot value overrides for the intent.
       *
       * The name of the slot maps to the value of the slot. Slots that are not included in the map
       * aren't overridden.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentoverride.html#cfn-lex-bot-intentoverride-slots)
       */
      override fun slots(): Any? = unwrap(this).getSlots()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntentOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.IntentOverrideProperty):
          IntentOverrideProperty = CdkObjectWrappers.wrap(cdkObject) as? IntentOverrideProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntentOverrideProperty):
          software.amazon.awscdk.services.lex.CfnBot.IntentOverrideProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.IntentOverrideProperty
    }
  }

  /**
   * Represents an action that the user wants to perform.
   *
   * Example:
   *
   * ```
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html)
   */
  public interface IntentProperty {
    /**
     * A description of the intent.
     *
     * Use the description to help identify the intent in lists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies that Amazon Lex invokes the alias Lambda function for each user input.
     *
     * You can invoke this Lambda function to personalize user interaction.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-dialogcodehook)
     */
    public fun dialogCodeHook(): Any? = unwrap(this).getDialogCodeHook()

    /**
     * Specifies that Amazon Lex invokes the alias Lambda function when the intent is ready for
     * fulfillment.
     *
     * You can invoke this function to complete the bot's transaction with the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-fulfillmentcodehook)
     */
    public fun fulfillmentCodeHook(): Any? = unwrap(this).getFulfillmentCodeHook()

    /**
     * Configuration setting for a response sent to the user before Amazon Lex starts eliciting
     * slots.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-initialresponsesetting)
     */
    public fun initialResponseSetting(): Any? = unwrap(this).getInitialResponseSetting()

    /**
     * A list of contexts that must be active for this intent to be considered by Amazon Lex .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-inputcontexts)
     */
    public fun inputContexts(): Any? = unwrap(this).getInputContexts()

    /**
     * Sets the response that Amazon Lex sends to the user when the intent is closed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-intentclosingsetting)
     */
    public fun intentClosingSetting(): Any? = unwrap(this).getIntentClosingSetting()

    /**
     * Provides prompts that Amazon Lex sends to the user to confirm the completion of an intent.
     *
     * If the user answers "no," the settings contain a statement that is sent to the user to end
     * the intent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-intentconfirmationsetting)
     */
    public fun intentConfirmationSetting(): Any? = unwrap(this).getIntentConfirmationSetting()

    /**
     * Provides configuration information for the `AMAZON.KendraSearchIntent` intent. When you use
     * this intent, Amazon Lex searches the specified Amazon Kendra index and returns documents from
     * the index that match the user's utterance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-kendraconfiguration)
     */
    public fun kendraConfiguration(): Any? = unwrap(this).getKendraConfiguration()

    /**
     * The name of the intent.
     *
     * Intent names must be unique within the locale that contains the intent and can't match the
     * name of any built-in intent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-name)
     */
    public fun name(): String

    /**
     * A list of contexts that the intent activates when it is fulfilled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-outputcontexts)
     */
    public fun outputContexts(): Any? = unwrap(this).getOutputContexts()

    /**
     * A unique identifier for the built-in intent to base this intent on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-parentintentsignature)
     */
    public fun parentIntentSignature(): String? = unwrap(this).getParentIntentSignature()

    /**
     * A list of utterances that a user might say to signal the intent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-sampleutterances)
     */
    public fun sampleUtterances(): Any? = unwrap(this).getSampleUtterances()

    /**
     * Indicates the priority for slots.
     *
     * Amazon Lex prompts the user for slot values in priority order.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-slotpriorities)
     */
    public fun slotPriorities(): Any? = unwrap(this).getSlotPriorities()

    /**
     * A list of slots that the intent requires for fulfillment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-slots)
     */
    public fun slots(): Any? = unwrap(this).getSlots()

    /**
     * A builder for [IntentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description A description of the intent.
       * Use the description to help identify the intent in lists.
       */
      public fun description(description: String)

      /**
       * @param dialogCodeHook Specifies that Amazon Lex invokes the alias Lambda function for each
       * user input.
       * You can invoke this Lambda function to personalize user interaction.
       */
      public fun dialogCodeHook(dialogCodeHook: IResolvable)

      /**
       * @param dialogCodeHook Specifies that Amazon Lex invokes the alias Lambda function for each
       * user input.
       * You can invoke this Lambda function to personalize user interaction.
       */
      public fun dialogCodeHook(dialogCodeHook: DialogCodeHookSettingProperty)

      /**
       * @param dialogCodeHook Specifies that Amazon Lex invokes the alias Lambda function for each
       * user input.
       * You can invoke this Lambda function to personalize user interaction.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd39ac17fff5db7791f1f714b8f7127ce5150acaf5b3270cc9cc28da6a245466")
      public fun dialogCodeHook(dialogCodeHook: DialogCodeHookSettingProperty.Builder.() -> Unit)

      /**
       * @param fulfillmentCodeHook Specifies that Amazon Lex invokes the alias Lambda function when
       * the intent is ready for fulfillment.
       * You can invoke this function to complete the bot's transaction with the user.
       */
      public fun fulfillmentCodeHook(fulfillmentCodeHook: IResolvable)

      /**
       * @param fulfillmentCodeHook Specifies that Amazon Lex invokes the alias Lambda function when
       * the intent is ready for fulfillment.
       * You can invoke this function to complete the bot's transaction with the user.
       */
      public fun fulfillmentCodeHook(fulfillmentCodeHook: FulfillmentCodeHookSettingProperty)

      /**
       * @param fulfillmentCodeHook Specifies that Amazon Lex invokes the alias Lambda function when
       * the intent is ready for fulfillment.
       * You can invoke this function to complete the bot's transaction with the user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("294e7b64b8f85d1ba4b9669431e5b74665aa29a518b189da5513b351cb690e02")
      public
          fun fulfillmentCodeHook(fulfillmentCodeHook: FulfillmentCodeHookSettingProperty.Builder.() -> Unit)

      /**
       * @param initialResponseSetting Configuration setting for a response sent to the user before
       * Amazon Lex starts eliciting slots.
       */
      public fun initialResponseSetting(initialResponseSetting: IResolvable)

      /**
       * @param initialResponseSetting Configuration setting for a response sent to the user before
       * Amazon Lex starts eliciting slots.
       */
      public fun initialResponseSetting(initialResponseSetting: InitialResponseSettingProperty)

      /**
       * @param initialResponseSetting Configuration setting for a response sent to the user before
       * Amazon Lex starts eliciting slots.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2df798c6f4f7c1a845184570424dc16f459557ed3bdaa829074d984c591a23ec")
      public
          fun initialResponseSetting(initialResponseSetting: InitialResponseSettingProperty.Builder.() -> Unit)

      /**
       * @param inputContexts A list of contexts that must be active for this intent to be
       * considered by Amazon Lex .
       */
      public fun inputContexts(inputContexts: IResolvable)

      /**
       * @param inputContexts A list of contexts that must be active for this intent to be
       * considered by Amazon Lex .
       */
      public fun inputContexts(inputContexts: List<Any>)

      /**
       * @param inputContexts A list of contexts that must be active for this intent to be
       * considered by Amazon Lex .
       */
      public fun inputContexts(vararg inputContexts: Any)

      /**
       * @param intentClosingSetting Sets the response that Amazon Lex sends to the user when the
       * intent is closed.
       */
      public fun intentClosingSetting(intentClosingSetting: IResolvable)

      /**
       * @param intentClosingSetting Sets the response that Amazon Lex sends to the user when the
       * intent is closed.
       */
      public fun intentClosingSetting(intentClosingSetting: IntentClosingSettingProperty)

      /**
       * @param intentClosingSetting Sets the response that Amazon Lex sends to the user when the
       * intent is closed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9816be14646177b7f3cd178fa9c093ac2245d32feca4e0d1787621fe249bd62")
      public
          fun intentClosingSetting(intentClosingSetting: IntentClosingSettingProperty.Builder.() -> Unit)

      /**
       * @param intentConfirmationSetting Provides prompts that Amazon Lex sends to the user to
       * confirm the completion of an intent.
       * If the user answers "no," the settings contain a statement that is sent to the user to end
       * the intent.
       */
      public fun intentConfirmationSetting(intentConfirmationSetting: IResolvable)

      /**
       * @param intentConfirmationSetting Provides prompts that Amazon Lex sends to the user to
       * confirm the completion of an intent.
       * If the user answers "no," the settings contain a statement that is sent to the user to end
       * the intent.
       */
      public
          fun intentConfirmationSetting(intentConfirmationSetting: IntentConfirmationSettingProperty)

      /**
       * @param intentConfirmationSetting Provides prompts that Amazon Lex sends to the user to
       * confirm the completion of an intent.
       * If the user answers "no," the settings contain a statement that is sent to the user to end
       * the intent.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("541e03c3b04b7f06b7b5864b6f77f8f8be389695028a4dacae2ce32c37fc46f2")
      public
          fun intentConfirmationSetting(intentConfirmationSetting: IntentConfirmationSettingProperty.Builder.() -> Unit)

      /**
       * @param kendraConfiguration Provides configuration information for the
       * `AMAZON.KendraSearchIntent` intent. When you use this intent, Amazon Lex searches the
       * specified Amazon Kendra index and returns documents from the index that match the user's
       * utterance.
       */
      public fun kendraConfiguration(kendraConfiguration: IResolvable)

      /**
       * @param kendraConfiguration Provides configuration information for the
       * `AMAZON.KendraSearchIntent` intent. When you use this intent, Amazon Lex searches the
       * specified Amazon Kendra index and returns documents from the index that match the user's
       * utterance.
       */
      public fun kendraConfiguration(kendraConfiguration: KendraConfigurationProperty)

      /**
       * @param kendraConfiguration Provides configuration information for the
       * `AMAZON.KendraSearchIntent` intent. When you use this intent, Amazon Lex searches the
       * specified Amazon Kendra index and returns documents from the index that match the user's
       * utterance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("838e421c92ce42d573ced09a9bc3ca8ad3f8d86a03d2b11bed05ef5dd44b451f")
      public
          fun kendraConfiguration(kendraConfiguration: KendraConfigurationProperty.Builder.() -> Unit)

      /**
       * @param name The name of the intent. 
       * Intent names must be unique within the locale that contains the intent and can't match the
       * name of any built-in intent.
       */
      public fun name(name: String)

      /**
       * @param outputContexts A list of contexts that the intent activates when it is fulfilled.
       */
      public fun outputContexts(outputContexts: IResolvable)

      /**
       * @param outputContexts A list of contexts that the intent activates when it is fulfilled.
       */
      public fun outputContexts(outputContexts: List<Any>)

      /**
       * @param outputContexts A list of contexts that the intent activates when it is fulfilled.
       */
      public fun outputContexts(vararg outputContexts: Any)

      /**
       * @param parentIntentSignature A unique identifier for the built-in intent to base this
       * intent on.
       */
      public fun parentIntentSignature(parentIntentSignature: String)

      /**
       * @param sampleUtterances A list of utterances that a user might say to signal the intent.
       */
      public fun sampleUtterances(sampleUtterances: IResolvable)

      /**
       * @param sampleUtterances A list of utterances that a user might say to signal the intent.
       */
      public fun sampleUtterances(sampleUtterances: List<Any>)

      /**
       * @param sampleUtterances A list of utterances that a user might say to signal the intent.
       */
      public fun sampleUtterances(vararg sampleUtterances: Any)

      /**
       * @param slotPriorities Indicates the priority for slots.
       * Amazon Lex prompts the user for slot values in priority order.
       */
      public fun slotPriorities(slotPriorities: IResolvable)

      /**
       * @param slotPriorities Indicates the priority for slots.
       * Amazon Lex prompts the user for slot values in priority order.
       */
      public fun slotPriorities(slotPriorities: List<Any>)

      /**
       * @param slotPriorities Indicates the priority for slots.
       * Amazon Lex prompts the user for slot values in priority order.
       */
      public fun slotPriorities(vararg slotPriorities: Any)

      /**
       * @param slots A list of slots that the intent requires for fulfillment.
       */
      public fun slots(slots: IResolvable)

      /**
       * @param slots A list of slots that the intent requires for fulfillment.
       */
      public fun slots(slots: List<Any>)

      /**
       * @param slots A list of slots that the intent requires for fulfillment.
       */
      public fun slots(vararg slots: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.IntentProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.IntentProperty.builder()

      /**
       * @param description A description of the intent.
       * Use the description to help identify the intent in lists.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param dialogCodeHook Specifies that Amazon Lex invokes the alias Lambda function for each
       * user input.
       * You can invoke this Lambda function to personalize user interaction.
       */
      override fun dialogCodeHook(dialogCodeHook: IResolvable) {
        cdkBuilder.dialogCodeHook(dialogCodeHook.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dialogCodeHook Specifies that Amazon Lex invokes the alias Lambda function for each
       * user input.
       * You can invoke this Lambda function to personalize user interaction.
       */
      override fun dialogCodeHook(dialogCodeHook: DialogCodeHookSettingProperty) {
        cdkBuilder.dialogCodeHook(dialogCodeHook.let(DialogCodeHookSettingProperty.Companion::unwrap))
      }

      /**
       * @param dialogCodeHook Specifies that Amazon Lex invokes the alias Lambda function for each
       * user input.
       * You can invoke this Lambda function to personalize user interaction.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd39ac17fff5db7791f1f714b8f7127ce5150acaf5b3270cc9cc28da6a245466")
      override fun dialogCodeHook(dialogCodeHook: DialogCodeHookSettingProperty.Builder.() -> Unit):
          Unit = dialogCodeHook(DialogCodeHookSettingProperty(dialogCodeHook))

      /**
       * @param fulfillmentCodeHook Specifies that Amazon Lex invokes the alias Lambda function when
       * the intent is ready for fulfillment.
       * You can invoke this function to complete the bot's transaction with the user.
       */
      override fun fulfillmentCodeHook(fulfillmentCodeHook: IResolvable) {
        cdkBuilder.fulfillmentCodeHook(fulfillmentCodeHook.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fulfillmentCodeHook Specifies that Amazon Lex invokes the alias Lambda function when
       * the intent is ready for fulfillment.
       * You can invoke this function to complete the bot's transaction with the user.
       */
      override fun fulfillmentCodeHook(fulfillmentCodeHook: FulfillmentCodeHookSettingProperty) {
        cdkBuilder.fulfillmentCodeHook(fulfillmentCodeHook.let(FulfillmentCodeHookSettingProperty.Companion::unwrap))
      }

      /**
       * @param fulfillmentCodeHook Specifies that Amazon Lex invokes the alias Lambda function when
       * the intent is ready for fulfillment.
       * You can invoke this function to complete the bot's transaction with the user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("294e7b64b8f85d1ba4b9669431e5b74665aa29a518b189da5513b351cb690e02")
      override
          fun fulfillmentCodeHook(fulfillmentCodeHook: FulfillmentCodeHookSettingProperty.Builder.() -> Unit):
          Unit = fulfillmentCodeHook(FulfillmentCodeHookSettingProperty(fulfillmentCodeHook))

      /**
       * @param initialResponseSetting Configuration setting for a response sent to the user before
       * Amazon Lex starts eliciting slots.
       */
      override fun initialResponseSetting(initialResponseSetting: IResolvable) {
        cdkBuilder.initialResponseSetting(initialResponseSetting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param initialResponseSetting Configuration setting for a response sent to the user before
       * Amazon Lex starts eliciting slots.
       */
      override fun initialResponseSetting(initialResponseSetting: InitialResponseSettingProperty) {
        cdkBuilder.initialResponseSetting(initialResponseSetting.let(InitialResponseSettingProperty.Companion::unwrap))
      }

      /**
       * @param initialResponseSetting Configuration setting for a response sent to the user before
       * Amazon Lex starts eliciting slots.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2df798c6f4f7c1a845184570424dc16f459557ed3bdaa829074d984c591a23ec")
      override
          fun initialResponseSetting(initialResponseSetting: InitialResponseSettingProperty.Builder.() -> Unit):
          Unit = initialResponseSetting(InitialResponseSettingProperty(initialResponseSetting))

      /**
       * @param inputContexts A list of contexts that must be active for this intent to be
       * considered by Amazon Lex .
       */
      override fun inputContexts(inputContexts: IResolvable) {
        cdkBuilder.inputContexts(inputContexts.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inputContexts A list of contexts that must be active for this intent to be
       * considered by Amazon Lex .
       */
      override fun inputContexts(inputContexts: List<Any>) {
        cdkBuilder.inputContexts(inputContexts.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param inputContexts A list of contexts that must be active for this intent to be
       * considered by Amazon Lex .
       */
      override fun inputContexts(vararg inputContexts: Any): Unit =
          inputContexts(inputContexts.toList())

      /**
       * @param intentClosingSetting Sets the response that Amazon Lex sends to the user when the
       * intent is closed.
       */
      override fun intentClosingSetting(intentClosingSetting: IResolvable) {
        cdkBuilder.intentClosingSetting(intentClosingSetting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param intentClosingSetting Sets the response that Amazon Lex sends to the user when the
       * intent is closed.
       */
      override fun intentClosingSetting(intentClosingSetting: IntentClosingSettingProperty) {
        cdkBuilder.intentClosingSetting(intentClosingSetting.let(IntentClosingSettingProperty.Companion::unwrap))
      }

      /**
       * @param intentClosingSetting Sets the response that Amazon Lex sends to the user when the
       * intent is closed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9816be14646177b7f3cd178fa9c093ac2245d32feca4e0d1787621fe249bd62")
      override
          fun intentClosingSetting(intentClosingSetting: IntentClosingSettingProperty.Builder.() -> Unit):
          Unit = intentClosingSetting(IntentClosingSettingProperty(intentClosingSetting))

      /**
       * @param intentConfirmationSetting Provides prompts that Amazon Lex sends to the user to
       * confirm the completion of an intent.
       * If the user answers "no," the settings contain a statement that is sent to the user to end
       * the intent.
       */
      override fun intentConfirmationSetting(intentConfirmationSetting: IResolvable) {
        cdkBuilder.intentConfirmationSetting(intentConfirmationSetting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param intentConfirmationSetting Provides prompts that Amazon Lex sends to the user to
       * confirm the completion of an intent.
       * If the user answers "no," the settings contain a statement that is sent to the user to end
       * the intent.
       */
      override
          fun intentConfirmationSetting(intentConfirmationSetting: IntentConfirmationSettingProperty) {
        cdkBuilder.intentConfirmationSetting(intentConfirmationSetting.let(IntentConfirmationSettingProperty.Companion::unwrap))
      }

      /**
       * @param intentConfirmationSetting Provides prompts that Amazon Lex sends to the user to
       * confirm the completion of an intent.
       * If the user answers "no," the settings contain a statement that is sent to the user to end
       * the intent.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("541e03c3b04b7f06b7b5864b6f77f8f8be389695028a4dacae2ce32c37fc46f2")
      override
          fun intentConfirmationSetting(intentConfirmationSetting: IntentConfirmationSettingProperty.Builder.() -> Unit):
          Unit =
          intentConfirmationSetting(IntentConfirmationSettingProperty(intentConfirmationSetting))

      /**
       * @param kendraConfiguration Provides configuration information for the
       * `AMAZON.KendraSearchIntent` intent. When you use this intent, Amazon Lex searches the
       * specified Amazon Kendra index and returns documents from the index that match the user's
       * utterance.
       */
      override fun kendraConfiguration(kendraConfiguration: IResolvable) {
        cdkBuilder.kendraConfiguration(kendraConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kendraConfiguration Provides configuration information for the
       * `AMAZON.KendraSearchIntent` intent. When you use this intent, Amazon Lex searches the
       * specified Amazon Kendra index and returns documents from the index that match the user's
       * utterance.
       */
      override fun kendraConfiguration(kendraConfiguration: KendraConfigurationProperty) {
        cdkBuilder.kendraConfiguration(kendraConfiguration.let(KendraConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param kendraConfiguration Provides configuration information for the
       * `AMAZON.KendraSearchIntent` intent. When you use this intent, Amazon Lex searches the
       * specified Amazon Kendra index and returns documents from the index that match the user's
       * utterance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("838e421c92ce42d573ced09a9bc3ca8ad3f8d86a03d2b11bed05ef5dd44b451f")
      override
          fun kendraConfiguration(kendraConfiguration: KendraConfigurationProperty.Builder.() -> Unit):
          Unit = kendraConfiguration(KendraConfigurationProperty(kendraConfiguration))

      /**
       * @param name The name of the intent. 
       * Intent names must be unique within the locale that contains the intent and can't match the
       * name of any built-in intent.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param outputContexts A list of contexts that the intent activates when it is fulfilled.
       */
      override fun outputContexts(outputContexts: IResolvable) {
        cdkBuilder.outputContexts(outputContexts.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param outputContexts A list of contexts that the intent activates when it is fulfilled.
       */
      override fun outputContexts(outputContexts: List<Any>) {
        cdkBuilder.outputContexts(outputContexts.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param outputContexts A list of contexts that the intent activates when it is fulfilled.
       */
      override fun outputContexts(vararg outputContexts: Any): Unit =
          outputContexts(outputContexts.toList())

      /**
       * @param parentIntentSignature A unique identifier for the built-in intent to base this
       * intent on.
       */
      override fun parentIntentSignature(parentIntentSignature: String) {
        cdkBuilder.parentIntentSignature(parentIntentSignature)
      }

      /**
       * @param sampleUtterances A list of utterances that a user might say to signal the intent.
       */
      override fun sampleUtterances(sampleUtterances: IResolvable) {
        cdkBuilder.sampleUtterances(sampleUtterances.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sampleUtterances A list of utterances that a user might say to signal the intent.
       */
      override fun sampleUtterances(sampleUtterances: List<Any>) {
        cdkBuilder.sampleUtterances(sampleUtterances.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sampleUtterances A list of utterances that a user might say to signal the intent.
       */
      override fun sampleUtterances(vararg sampleUtterances: Any): Unit =
          sampleUtterances(sampleUtterances.toList())

      /**
       * @param slotPriorities Indicates the priority for slots.
       * Amazon Lex prompts the user for slot values in priority order.
       */
      override fun slotPriorities(slotPriorities: IResolvable) {
        cdkBuilder.slotPriorities(slotPriorities.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param slotPriorities Indicates the priority for slots.
       * Amazon Lex prompts the user for slot values in priority order.
       */
      override fun slotPriorities(slotPriorities: List<Any>) {
        cdkBuilder.slotPriorities(slotPriorities.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param slotPriorities Indicates the priority for slots.
       * Amazon Lex prompts the user for slot values in priority order.
       */
      override fun slotPriorities(vararg slotPriorities: Any): Unit =
          slotPriorities(slotPriorities.toList())

      /**
       * @param slots A list of slots that the intent requires for fulfillment.
       */
      override fun slots(slots: IResolvable) {
        cdkBuilder.slots(slots.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param slots A list of slots that the intent requires for fulfillment.
       */
      override fun slots(slots: List<Any>) {
        cdkBuilder.slots(slots.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param slots A list of slots that the intent requires for fulfillment.
       */
      override fun slots(vararg slots: Any): Unit = slots(slots.toList())

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.IntentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.IntentProperty,
    ) : CdkObject(cdkObject),
        IntentProperty {
      /**
       * A description of the intent.
       *
       * Use the description to help identify the intent in lists.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Specifies that Amazon Lex invokes the alias Lambda function for each user input.
       *
       * You can invoke this Lambda function to personalize user interaction.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-dialogcodehook)
       */
      override fun dialogCodeHook(): Any? = unwrap(this).getDialogCodeHook()

      /**
       * Specifies that Amazon Lex invokes the alias Lambda function when the intent is ready for
       * fulfillment.
       *
       * You can invoke this function to complete the bot's transaction with the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-fulfillmentcodehook)
       */
      override fun fulfillmentCodeHook(): Any? = unwrap(this).getFulfillmentCodeHook()

      /**
       * Configuration setting for a response sent to the user before Amazon Lex starts eliciting
       * slots.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-initialresponsesetting)
       */
      override fun initialResponseSetting(): Any? = unwrap(this).getInitialResponseSetting()

      /**
       * A list of contexts that must be active for this intent to be considered by Amazon Lex .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-inputcontexts)
       */
      override fun inputContexts(): Any? = unwrap(this).getInputContexts()

      /**
       * Sets the response that Amazon Lex sends to the user when the intent is closed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-intentclosingsetting)
       */
      override fun intentClosingSetting(): Any? = unwrap(this).getIntentClosingSetting()

      /**
       * Provides prompts that Amazon Lex sends to the user to confirm the completion of an intent.
       *
       * If the user answers "no," the settings contain a statement that is sent to the user to end
       * the intent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-intentconfirmationsetting)
       */
      override fun intentConfirmationSetting(): Any? = unwrap(this).getIntentConfirmationSetting()

      /**
       * Provides configuration information for the `AMAZON.KendraSearchIntent` intent. When you use
       * this intent, Amazon Lex searches the specified Amazon Kendra index and returns documents from
       * the index that match the user's utterance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-kendraconfiguration)
       */
      override fun kendraConfiguration(): Any? = unwrap(this).getKendraConfiguration()

      /**
       * The name of the intent.
       *
       * Intent names must be unique within the locale that contains the intent and can't match the
       * name of any built-in intent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * A list of contexts that the intent activates when it is fulfilled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-outputcontexts)
       */
      override fun outputContexts(): Any? = unwrap(this).getOutputContexts()

      /**
       * A unique identifier for the built-in intent to base this intent on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-parentintentsignature)
       */
      override fun parentIntentSignature(): String? = unwrap(this).getParentIntentSignature()

      /**
       * A list of utterances that a user might say to signal the intent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-sampleutterances)
       */
      override fun sampleUtterances(): Any? = unwrap(this).getSampleUtterances()

      /**
       * Indicates the priority for slots.
       *
       * Amazon Lex prompts the user for slot values in priority order.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-slotpriorities)
       */
      override fun slotPriorities(): Any? = unwrap(this).getSlotPriorities()

      /**
       * A list of slots that the intent requires for fulfillment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html#cfn-lex-bot-intent-slots)
       */
      override fun slots(): Any? = unwrap(this).getSlots()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.IntentProperty):
          IntentProperty = CdkObjectWrappers.wrap(cdkObject) as? IntentProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntentProperty):
          software.amazon.awscdk.services.lex.CfnBot.IntentProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.IntentProperty
    }
  }

  /**
   * Provides configuration information for the `AMAZON.KendraSearchIntent` intent. When you use
   * this intent, Amazon Lex searches the specified Amazon Kendra index and returns documents from the
   * index that match the user's utterance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface KendraConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the
     * `AMAZON.KendraSearchIntent` intent to search. The index must be in the same account and Region
     * as the Amazon Lex bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-kendraconfiguration.html#cfn-lex-bot-kendraconfiguration-kendraindex)
     */
    public fun kendraIndex(): String

    /**
     * A query filter that Amazon Lex sends to Amazon Kendra to filter the response from a query.
     *
     * The filter is in the format defined by Amazon Kendra. For more information, see [Filtering
     * queries](https://docs.aws.amazon.com/kendra/latest/dg/filtering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-kendraconfiguration.html#cfn-lex-bot-kendraconfiguration-queryfilterstring)
     */
    public fun queryFilterString(): String? = unwrap(this).getQueryFilterString()

    /**
     * Determines whether the `AMAZON.KendraSearchIntent` intent uses a custom query string to query
     * the Amazon Kendra index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-kendraconfiguration.html#cfn-lex-bot-kendraconfiguration-queryfilterstringenabled)
     */
    public fun queryFilterStringEnabled(): Any? = unwrap(this).getQueryFilterStringEnabled()

    /**
     * A builder for [KendraConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kendraIndex The Amazon Resource Name (ARN) of the Amazon Kendra index that you want
       * the `AMAZON.KendraSearchIntent` intent to search. The index must be in the same account and
       * Region as the Amazon Lex bot. 
       */
      public fun kendraIndex(kendraIndex: String)

      /**
       * @param queryFilterString A query filter that Amazon Lex sends to Amazon Kendra to filter
       * the response from a query.
       * The filter is in the format defined by Amazon Kendra. For more information, see [Filtering
       * queries](https://docs.aws.amazon.com/kendra/latest/dg/filtering.html) .
       */
      public fun queryFilterString(queryFilterString: String)

      /**
       * @param queryFilterStringEnabled Determines whether the `AMAZON.KendraSearchIntent` intent
       * uses a custom query string to query the Amazon Kendra index.
       */
      public fun queryFilterStringEnabled(queryFilterStringEnabled: Boolean)

      /**
       * @param queryFilterStringEnabled Determines whether the `AMAZON.KendraSearchIntent` intent
       * uses a custom query string to query the Amazon Kendra index.
       */
      public fun queryFilterStringEnabled(queryFilterStringEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.KendraConfigurationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.KendraConfigurationProperty.builder()

      /**
       * @param kendraIndex The Amazon Resource Name (ARN) of the Amazon Kendra index that you want
       * the `AMAZON.KendraSearchIntent` intent to search. The index must be in the same account and
       * Region as the Amazon Lex bot. 
       */
      override fun kendraIndex(kendraIndex: String) {
        cdkBuilder.kendraIndex(kendraIndex)
      }

      /**
       * @param queryFilterString A query filter that Amazon Lex sends to Amazon Kendra to filter
       * the response from a query.
       * The filter is in the format defined by Amazon Kendra. For more information, see [Filtering
       * queries](https://docs.aws.amazon.com/kendra/latest/dg/filtering.html) .
       */
      override fun queryFilterString(queryFilterString: String) {
        cdkBuilder.queryFilterString(queryFilterString)
      }

      /**
       * @param queryFilterStringEnabled Determines whether the `AMAZON.KendraSearchIntent` intent
       * uses a custom query string to query the Amazon Kendra index.
       */
      override fun queryFilterStringEnabled(queryFilterStringEnabled: Boolean) {
        cdkBuilder.queryFilterStringEnabled(queryFilterStringEnabled)
      }

      /**
       * @param queryFilterStringEnabled Determines whether the `AMAZON.KendraSearchIntent` intent
       * uses a custom query string to query the Amazon Kendra index.
       */
      override fun queryFilterStringEnabled(queryFilterStringEnabled: IResolvable) {
        cdkBuilder.queryFilterStringEnabled(queryFilterStringEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.KendraConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.KendraConfigurationProperty,
    ) : CdkObject(cdkObject),
        KendraConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the
       * `AMAZON.KendraSearchIntent` intent to search. The index must be in the same account and Region
       * as the Amazon Lex bot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-kendraconfiguration.html#cfn-lex-bot-kendraconfiguration-kendraindex)
       */
      override fun kendraIndex(): String = unwrap(this).getKendraIndex()

      /**
       * A query filter that Amazon Lex sends to Amazon Kendra to filter the response from a query.
       *
       * The filter is in the format defined by Amazon Kendra. For more information, see [Filtering
       * queries](https://docs.aws.amazon.com/kendra/latest/dg/filtering.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-kendraconfiguration.html#cfn-lex-bot-kendraconfiguration-queryfilterstring)
       */
      override fun queryFilterString(): String? = unwrap(this).getQueryFilterString()

      /**
       * Determines whether the `AMAZON.KendraSearchIntent` intent uses a custom query string to
       * query the Amazon Kendra index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-kendraconfiguration.html#cfn-lex-bot-kendraconfiguration-queryfilterstringenabled)
       */
      override fun queryFilterStringEnabled(): Any? = unwrap(this).getQueryFilterStringEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KendraConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.KendraConfigurationProperty):
          KendraConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KendraConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KendraConfigurationProperty):
          software.amazon.awscdk.services.lex.CfnBot.KendraConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.KendraConfigurationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-lambdacodehook.html)
   */
  public interface LambdaCodeHookProperty {
    /**
     * The version of the request-response that you want Amazon Lex to use to invoke your Lambda
     * function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-lambdacodehook.html#cfn-lex-bot-lambdacodehook-codehookinterfaceversion)
     */
    public fun codeHookInterfaceVersion(): String

    /**
     * The Amazon Resource Name (ARN) of the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-lambdacodehook.html#cfn-lex-bot-lambdacodehook-lambdaarn)
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
          software.amazon.awscdk.services.lex.CfnBot.LambdaCodeHookProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.LambdaCodeHookProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.LambdaCodeHookProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.LambdaCodeHookProperty,
    ) : CdkObject(cdkObject),
        LambdaCodeHookProperty {
      /**
       * The version of the request-response that you want Amazon Lex to use to invoke your Lambda
       * function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-lambdacodehook.html#cfn-lex-bot-lambdacodehook-codehookinterfaceversion)
       */
      override fun codeHookInterfaceVersion(): String = unwrap(this).getCodeHookInterfaceVersion()

      /**
       * The Amazon Resource Name (ARN) of the Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-lambdacodehook.html#cfn-lex-bot-lambdacodehook-lambdaarn)
       */
      override fun lambdaArn(): String = unwrap(this).getLambdaArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaCodeHookProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.LambdaCodeHookProperty):
          LambdaCodeHookProperty = CdkObjectWrappers.wrap(cdkObject) as? LambdaCodeHookProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaCodeHookProperty):
          software.amazon.awscdk.services.lex.CfnBot.LambdaCodeHookProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.LambdaCodeHookProperty
    }
  }

  /**
   * Provides one or more messages that Amazon Lex should send to the user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface MessageGroupProperty {
    /**
     * The primary message that Amazon Lex should send to the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-messagegroup.html#cfn-lex-bot-messagegroup-message)
     */
    public fun message(): Any

    /**
     * Message variations to send to the user.
     *
     * When variations are defined, Amazon Lex chooses the primary message or one of the variations
     * to send to the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-messagegroup.html#cfn-lex-bot-messagegroup-variations)
     */
    public fun variations(): Any? = unwrap(this).getVariations()

    /**
     * A builder for [MessageGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param message The primary message that Amazon Lex should send to the user. 
       */
      public fun message(message: IResolvable)

      /**
       * @param message The primary message that Amazon Lex should send to the user. 
       */
      public fun message(message: MessageProperty)

      /**
       * @param message The primary message that Amazon Lex should send to the user. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e766903057c90906ecc98545abf907d54c01b35e3c4574973fe46e9ac41b0088")
      public fun message(message: MessageProperty.Builder.() -> Unit)

      /**
       * @param variations Message variations to send to the user.
       * When variations are defined, Amazon Lex chooses the primary message or one of the
       * variations to send to the user.
       */
      public fun variations(variations: IResolvable)

      /**
       * @param variations Message variations to send to the user.
       * When variations are defined, Amazon Lex chooses the primary message or one of the
       * variations to send to the user.
       */
      public fun variations(variations: List<Any>)

      /**
       * @param variations Message variations to send to the user.
       * When variations are defined, Amazon Lex chooses the primary message or one of the
       * variations to send to the user.
       */
      public fun variations(vararg variations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.MessageGroupProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.MessageGroupProperty.builder()

      /**
       * @param message The primary message that Amazon Lex should send to the user. 
       */
      override fun message(message: IResolvable) {
        cdkBuilder.message(message.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param message The primary message that Amazon Lex should send to the user. 
       */
      override fun message(message: MessageProperty) {
        cdkBuilder.message(message.let(MessageProperty.Companion::unwrap))
      }

      /**
       * @param message The primary message that Amazon Lex should send to the user. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e766903057c90906ecc98545abf907d54c01b35e3c4574973fe46e9ac41b0088")
      override fun message(message: MessageProperty.Builder.() -> Unit): Unit =
          message(MessageProperty(message))

      /**
       * @param variations Message variations to send to the user.
       * When variations are defined, Amazon Lex chooses the primary message or one of the
       * variations to send to the user.
       */
      override fun variations(variations: IResolvable) {
        cdkBuilder.variations(variations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param variations Message variations to send to the user.
       * When variations are defined, Amazon Lex chooses the primary message or one of the
       * variations to send to the user.
       */
      override fun variations(variations: List<Any>) {
        cdkBuilder.variations(variations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param variations Message variations to send to the user.
       * When variations are defined, Amazon Lex chooses the primary message or one of the
       * variations to send to the user.
       */
      override fun variations(vararg variations: Any): Unit = variations(variations.toList())

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.MessageGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.MessageGroupProperty,
    ) : CdkObject(cdkObject),
        MessageGroupProperty {
      /**
       * The primary message that Amazon Lex should send to the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-messagegroup.html#cfn-lex-bot-messagegroup-message)
       */
      override fun message(): Any = unwrap(this).getMessage()

      /**
       * Message variations to send to the user.
       *
       * When variations are defined, Amazon Lex chooses the primary message or one of the
       * variations to send to the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-messagegroup.html#cfn-lex-bot-messagegroup-variations)
       */
      override fun variations(): Any? = unwrap(this).getVariations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MessageGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.MessageGroupProperty):
          MessageGroupProperty = CdkObjectWrappers.wrap(cdkObject) as? MessageGroupProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MessageGroupProperty):
          software.amazon.awscdk.services.lex.CfnBot.MessageGroupProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.MessageGroupProperty
    }
  }

  /**
   * The object that provides message text and its type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface MessageProperty {
    /**
     * A message in a custom format defined by the client application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-message.html#cfn-lex-bot-message-custompayload)
     */
    public fun customPayload(): Any? = unwrap(this).getCustomPayload()

    /**
     * A message that defines a response card that the client application can show to the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-message.html#cfn-lex-bot-message-imageresponsecard)
     */
    public fun imageResponseCard(): Any? = unwrap(this).getImageResponseCard()

    /**
     * A message in plain text format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-message.html#cfn-lex-bot-message-plaintextmessage)
     */
    public fun plainTextMessage(): Any? = unwrap(this).getPlainTextMessage()

    /**
     * A message in Speech Synthesis Markup Language (SSML).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-message.html#cfn-lex-bot-message-ssmlmessage)
     */
    public fun ssmlMessage(): Any? = unwrap(this).getSsmlMessage()

    /**
     * A builder for [MessageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customPayload A message in a custom format defined by the client application.
       */
      public fun customPayload(customPayload: IResolvable)

      /**
       * @param customPayload A message in a custom format defined by the client application.
       */
      public fun customPayload(customPayload: CustomPayloadProperty)

      /**
       * @param customPayload A message in a custom format defined by the client application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad015830bece36c3a52b1a923a144b6dd7491f383507066dd16c6bb69ba05c13")
      public fun customPayload(customPayload: CustomPayloadProperty.Builder.() -> Unit)

      /**
       * @param imageResponseCard A message that defines a response card that the client application
       * can show to the user.
       */
      public fun imageResponseCard(imageResponseCard: IResolvable)

      /**
       * @param imageResponseCard A message that defines a response card that the client application
       * can show to the user.
       */
      public fun imageResponseCard(imageResponseCard: ImageResponseCardProperty)

      /**
       * @param imageResponseCard A message that defines a response card that the client application
       * can show to the user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e671065ac1e2e419839b73ba7f95aebf7d9ee6409d3e26f73dc5ef6af1aae1d6")
      public fun imageResponseCard(imageResponseCard: ImageResponseCardProperty.Builder.() -> Unit)

      /**
       * @param plainTextMessage A message in plain text format.
       */
      public fun plainTextMessage(plainTextMessage: IResolvable)

      /**
       * @param plainTextMessage A message in plain text format.
       */
      public fun plainTextMessage(plainTextMessage: PlainTextMessageProperty)

      /**
       * @param plainTextMessage A message in plain text format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8a73fe42984d21f7eb1a975c1c2362430f1eeafc2e42225d1c83944b99bf243")
      public fun plainTextMessage(plainTextMessage: PlainTextMessageProperty.Builder.() -> Unit)

      /**
       * @param ssmlMessage A message in Speech Synthesis Markup Language (SSML).
       */
      public fun ssmlMessage(ssmlMessage: IResolvable)

      /**
       * @param ssmlMessage A message in Speech Synthesis Markup Language (SSML).
       */
      public fun ssmlMessage(ssmlMessage: SSMLMessageProperty)

      /**
       * @param ssmlMessage A message in Speech Synthesis Markup Language (SSML).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6e28d68ec63257dd97c8ef2e4cae6d6fc7f3ead425846e70dc9d73bb37ce21c")
      public fun ssmlMessage(ssmlMessage: SSMLMessageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.MessageProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.MessageProperty.builder()

      /**
       * @param customPayload A message in a custom format defined by the client application.
       */
      override fun customPayload(customPayload: IResolvable) {
        cdkBuilder.customPayload(customPayload.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customPayload A message in a custom format defined by the client application.
       */
      override fun customPayload(customPayload: CustomPayloadProperty) {
        cdkBuilder.customPayload(customPayload.let(CustomPayloadProperty.Companion::unwrap))
      }

      /**
       * @param customPayload A message in a custom format defined by the client application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad015830bece36c3a52b1a923a144b6dd7491f383507066dd16c6bb69ba05c13")
      override fun customPayload(customPayload: CustomPayloadProperty.Builder.() -> Unit): Unit =
          customPayload(CustomPayloadProperty(customPayload))

      /**
       * @param imageResponseCard A message that defines a response card that the client application
       * can show to the user.
       */
      override fun imageResponseCard(imageResponseCard: IResolvable) {
        cdkBuilder.imageResponseCard(imageResponseCard.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param imageResponseCard A message that defines a response card that the client application
       * can show to the user.
       */
      override fun imageResponseCard(imageResponseCard: ImageResponseCardProperty) {
        cdkBuilder.imageResponseCard(imageResponseCard.let(ImageResponseCardProperty.Companion::unwrap))
      }

      /**
       * @param imageResponseCard A message that defines a response card that the client application
       * can show to the user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e671065ac1e2e419839b73ba7f95aebf7d9ee6409d3e26f73dc5ef6af1aae1d6")
      override
          fun imageResponseCard(imageResponseCard: ImageResponseCardProperty.Builder.() -> Unit):
          Unit = imageResponseCard(ImageResponseCardProperty(imageResponseCard))

      /**
       * @param plainTextMessage A message in plain text format.
       */
      override fun plainTextMessage(plainTextMessage: IResolvable) {
        cdkBuilder.plainTextMessage(plainTextMessage.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param plainTextMessage A message in plain text format.
       */
      override fun plainTextMessage(plainTextMessage: PlainTextMessageProperty) {
        cdkBuilder.plainTextMessage(plainTextMessage.let(PlainTextMessageProperty.Companion::unwrap))
      }

      /**
       * @param plainTextMessage A message in plain text format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8a73fe42984d21f7eb1a975c1c2362430f1eeafc2e42225d1c83944b99bf243")
      override fun plainTextMessage(plainTextMessage: PlainTextMessageProperty.Builder.() -> Unit):
          Unit = plainTextMessage(PlainTextMessageProperty(plainTextMessage))

      /**
       * @param ssmlMessage A message in Speech Synthesis Markup Language (SSML).
       */
      override fun ssmlMessage(ssmlMessage: IResolvable) {
        cdkBuilder.ssmlMessage(ssmlMessage.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ssmlMessage A message in Speech Synthesis Markup Language (SSML).
       */
      override fun ssmlMessage(ssmlMessage: SSMLMessageProperty) {
        cdkBuilder.ssmlMessage(ssmlMessage.let(SSMLMessageProperty.Companion::unwrap))
      }

      /**
       * @param ssmlMessage A message in Speech Synthesis Markup Language (SSML).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6e28d68ec63257dd97c8ef2e4cae6d6fc7f3ead425846e70dc9d73bb37ce21c")
      override fun ssmlMessage(ssmlMessage: SSMLMessageProperty.Builder.() -> Unit): Unit =
          ssmlMessage(SSMLMessageProperty(ssmlMessage))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.MessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.MessageProperty,
    ) : CdkObject(cdkObject),
        MessageProperty {
      /**
       * A message in a custom format defined by the client application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-message.html#cfn-lex-bot-message-custompayload)
       */
      override fun customPayload(): Any? = unwrap(this).getCustomPayload()

      /**
       * A message that defines a response card that the client application can show to the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-message.html#cfn-lex-bot-message-imageresponsecard)
       */
      override fun imageResponseCard(): Any? = unwrap(this).getImageResponseCard()

      /**
       * A message in plain text format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-message.html#cfn-lex-bot-message-plaintextmessage)
       */
      override fun plainTextMessage(): Any? = unwrap(this).getPlainTextMessage()

      /**
       * A message in Speech Synthesis Markup Language (SSML).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-message.html#cfn-lex-bot-message-ssmlmessage)
       */
      override fun ssmlMessage(): Any? = unwrap(this).getSsmlMessage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.MessageProperty):
          MessageProperty = CdkObjectWrappers.wrap(cdkObject) as? MessageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MessageProperty):
          software.amazon.awscdk.services.lex.CfnBot.MessageProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.MessageProperty
    }
  }

  /**
   * Indicates whether a slot can return multiple values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * MultipleValuesSettingProperty multipleValuesSettingProperty =
   * MultipleValuesSettingProperty.builder()
   * .allowMultipleValues(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-multiplevaluessetting.html)
   */
  public interface MultipleValuesSettingProperty {
    /**
     * Indicates whether a slot can return multiple values.
     *
     * When `true` , the slot may return more than one value in a response. When `false` , the slot
     * returns only a single value.
     *
     * Multi-value slots are only available in the en-US locale. If you set this value to `true` in
     * any other locale, Amazon Lex throws a `ValidationException` .
     *
     * If the `allowMutlipleValues` is not set, the default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-multiplevaluessetting.html#cfn-lex-bot-multiplevaluessetting-allowmultiplevalues)
     */
    public fun allowMultipleValues(): Any? = unwrap(this).getAllowMultipleValues()

    /**
     * A builder for [MultipleValuesSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowMultipleValues Indicates whether a slot can return multiple values.
       * When `true` , the slot may return more than one value in a response. When `false` , the
       * slot returns only a single value.
       *
       * Multi-value slots are only available in the en-US locale. If you set this value to `true`
       * in any other locale, Amazon Lex throws a `ValidationException` .
       *
       * If the `allowMutlipleValues` is not set, the default value is `false` .
       */
      public fun allowMultipleValues(allowMultipleValues: Boolean)

      /**
       * @param allowMultipleValues Indicates whether a slot can return multiple values.
       * When `true` , the slot may return more than one value in a response. When `false` , the
       * slot returns only a single value.
       *
       * Multi-value slots are only available in the en-US locale. If you set this value to `true`
       * in any other locale, Amazon Lex throws a `ValidationException` .
       *
       * If the `allowMutlipleValues` is not set, the default value is `false` .
       */
      public fun allowMultipleValues(allowMultipleValues: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.MultipleValuesSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.MultipleValuesSettingProperty.builder()

      /**
       * @param allowMultipleValues Indicates whether a slot can return multiple values.
       * When `true` , the slot may return more than one value in a response. When `false` , the
       * slot returns only a single value.
       *
       * Multi-value slots are only available in the en-US locale. If you set this value to `true`
       * in any other locale, Amazon Lex throws a `ValidationException` .
       *
       * If the `allowMutlipleValues` is not set, the default value is `false` .
       */
      override fun allowMultipleValues(allowMultipleValues: Boolean) {
        cdkBuilder.allowMultipleValues(allowMultipleValues)
      }

      /**
       * @param allowMultipleValues Indicates whether a slot can return multiple values.
       * When `true` , the slot may return more than one value in a response. When `false` , the
       * slot returns only a single value.
       *
       * Multi-value slots are only available in the en-US locale. If you set this value to `true`
       * in any other locale, Amazon Lex throws a `ValidationException` .
       *
       * If the `allowMutlipleValues` is not set, the default value is `false` .
       */
      override fun allowMultipleValues(allowMultipleValues: IResolvable) {
        cdkBuilder.allowMultipleValues(allowMultipleValues.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.MultipleValuesSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.MultipleValuesSettingProperty,
    ) : CdkObject(cdkObject),
        MultipleValuesSettingProperty {
      /**
       * Indicates whether a slot can return multiple values.
       *
       * When `true` , the slot may return more than one value in a response. When `false` , the
       * slot returns only a single value.
       *
       * Multi-value slots are only available in the en-US locale. If you set this value to `true`
       * in any other locale, Amazon Lex throws a `ValidationException` .
       *
       * If the `allowMutlipleValues` is not set, the default value is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-multiplevaluessetting.html#cfn-lex-bot-multiplevaluessetting-allowmultiplevalues)
       */
      override fun allowMultipleValues(): Any? = unwrap(this).getAllowMultipleValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MultipleValuesSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.MultipleValuesSettingProperty):
          MultipleValuesSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MultipleValuesSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultipleValuesSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.MultipleValuesSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.MultipleValuesSettingProperty
    }
  }

  /**
   * Determines whether Amazon Lex obscures slot values in conversation logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * ObfuscationSettingProperty obfuscationSettingProperty = ObfuscationSettingProperty.builder()
   * .obfuscationSettingType("obfuscationSettingType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-obfuscationsetting.html)
   */
  public interface ObfuscationSettingProperty {
    /**
     * Value that determines whether Amazon Lex obscures slot values in conversation logs.
     *
     * The default is to obscure the values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-obfuscationsetting.html#cfn-lex-bot-obfuscationsetting-obfuscationsettingtype)
     */
    public fun obfuscationSettingType(): String

    /**
     * A builder for [ObfuscationSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param obfuscationSettingType Value that determines whether Amazon Lex obscures slot values
       * in conversation logs. 
       * The default is to obscure the values.
       */
      public fun obfuscationSettingType(obfuscationSettingType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.ObfuscationSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ObfuscationSettingProperty.builder()

      /**
       * @param obfuscationSettingType Value that determines whether Amazon Lex obscures slot values
       * in conversation logs. 
       * The default is to obscure the values.
       */
      override fun obfuscationSettingType(obfuscationSettingType: String) {
        cdkBuilder.obfuscationSettingType(obfuscationSettingType)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ObfuscationSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.ObfuscationSettingProperty,
    ) : CdkObject(cdkObject),
        ObfuscationSettingProperty {
      /**
       * Value that determines whether Amazon Lex obscures slot values in conversation logs.
       *
       * The default is to obscure the values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-obfuscationsetting.html#cfn-lex-bot-obfuscationsetting-obfuscationsettingtype)
       */
      override fun obfuscationSettingType(): String = unwrap(this).getObfuscationSettingType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ObfuscationSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ObfuscationSettingProperty):
          ObfuscationSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ObfuscationSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObfuscationSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.ObfuscationSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.ObfuscationSettingProperty
    }
  }

  /**
   * Describes a session context that is activated when an intent is fulfilled.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * OutputContextProperty outputContextProperty = OutputContextProperty.builder()
   * .name("name")
   * .timeToLiveInSeconds(123)
   * .turnsToLive(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-outputcontext.html)
   */
  public interface OutputContextProperty {
    /**
     * The name of the output context.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-outputcontext.html#cfn-lex-bot-outputcontext-name)
     */
    public fun name(): String

    /**
     * The amount of time, in seconds, that the output context should remain active.
     *
     * The time is figured from the first time the context is sent to the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-outputcontext.html#cfn-lex-bot-outputcontext-timetoliveinseconds)
     */
    public fun timeToLiveInSeconds(): Number

    /**
     * The number of conversation turns that the output context should remain active.
     *
     * The number of turns is counted from the first time that the context is sent to the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-outputcontext.html#cfn-lex-bot-outputcontext-turnstolive)
     */
    public fun turnsToLive(): Number

    /**
     * A builder for [OutputContextProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the output context. 
       */
      public fun name(name: String)

      /**
       * @param timeToLiveInSeconds The amount of time, in seconds, that the output context should
       * remain active. 
       * The time is figured from the first time the context is sent to the user.
       */
      public fun timeToLiveInSeconds(timeToLiveInSeconds: Number)

      /**
       * @param turnsToLive The number of conversation turns that the output context should remain
       * active. 
       * The number of turns is counted from the first time that the context is sent to the user.
       */
      public fun turnsToLive(turnsToLive: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.OutputContextProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.OutputContextProperty.builder()

      /**
       * @param name The name of the output context. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param timeToLiveInSeconds The amount of time, in seconds, that the output context should
       * remain active. 
       * The time is figured from the first time the context is sent to the user.
       */
      override fun timeToLiveInSeconds(timeToLiveInSeconds: Number) {
        cdkBuilder.timeToLiveInSeconds(timeToLiveInSeconds)
      }

      /**
       * @param turnsToLive The number of conversation turns that the output context should remain
       * active. 
       * The number of turns is counted from the first time that the context is sent to the user.
       */
      override fun turnsToLive(turnsToLive: Number) {
        cdkBuilder.turnsToLive(turnsToLive)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.OutputContextProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.OutputContextProperty,
    ) : CdkObject(cdkObject),
        OutputContextProperty {
      /**
       * The name of the output context.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-outputcontext.html#cfn-lex-bot-outputcontext-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The amount of time, in seconds, that the output context should remain active.
       *
       * The time is figured from the first time the context is sent to the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-outputcontext.html#cfn-lex-bot-outputcontext-timetoliveinseconds)
       */
      override fun timeToLiveInSeconds(): Number = unwrap(this).getTimeToLiveInSeconds()

      /**
       * The number of conversation turns that the output context should remain active.
       *
       * The number of turns is counted from the first time that the context is sent to the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-outputcontext.html#cfn-lex-bot-outputcontext-turnstolive)
       */
      override fun turnsToLive(): Number = unwrap(this).getTurnsToLive()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.OutputContextProperty):
          OutputContextProperty = CdkObjectWrappers.wrap(cdkObject) as? OutputContextProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputContextProperty):
          software.amazon.awscdk.services.lex.CfnBot.OutputContextProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.OutputContextProperty
    }
  }

  /**
   * Defines an ASCII text message to send to the user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * PlainTextMessageProperty plainTextMessageProperty = PlainTextMessageProperty.builder()
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-plaintextmessage.html)
   */
  public interface PlainTextMessageProperty {
    /**
     * The message to send to the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-plaintextmessage.html#cfn-lex-bot-plaintextmessage-value)
     */
    public fun `value`(): String

    /**
     * A builder for [PlainTextMessageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The message to send to the user. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.PlainTextMessageProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.PlainTextMessageProperty.builder()

      /**
       * @param value The message to send to the user. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.PlainTextMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.PlainTextMessageProperty,
    ) : CdkObject(cdkObject),
        PlainTextMessageProperty {
      /**
       * The message to send to the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-plaintextmessage.html#cfn-lex-bot-plaintextmessage-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlainTextMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.PlainTextMessageProperty):
          PlainTextMessageProperty = CdkObjectWrappers.wrap(cdkObject) as? PlainTextMessageProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlainTextMessageProperty):
          software.amazon.awscdk.services.lex.CfnBot.PlainTextMessageProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.PlainTextMessageProperty
    }
  }

  /**
   * Specifies next steps to run after the dialog code hook finishes.
   *
   * Example:
   *
   * ```
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html)
   */
  public interface PostDialogCodeHookInvocationSpecificationProperty {
    /**
     * A list of conditional branches to evaluate after the dialog code hook throws an exception or
     * returns with the `State` field of the `Intent` object set to `Failed` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-failureconditional)
     */
    public fun failureConditional(): Any? = unwrap(this).getFailureConditional()

    /**
     * Specifies the next step the bot runs after the dialog code hook throws an exception or
     * returns with the `State` field of the `Intent` object set to `Failed` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-failurenextstep)
     */
    public fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

    /**
     * Specifies a list of message groups that Amazon Lex uses to respond the user input when the
     * code hook fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-failureresponse)
     */
    public fun failureResponse(): Any? = unwrap(this).getFailureResponse()

    /**
     * A list of conditional branches to evaluate after the dialog code hook finishes successfully.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-successconditional)
     */
    public fun successConditional(): Any? = unwrap(this).getSuccessConditional()

    /**
     * Specifics the next step the bot runs after the dialog code hook finishes successfully.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-successnextstep)
     */
    public fun successNextStep(): Any? = unwrap(this).getSuccessNextStep()

    /**
     * Specifies a list of message groups that Amazon Lex uses to respond when the code hook
     * succeeds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-successresponse)
     */
    public fun successResponse(): Any? = unwrap(this).getSuccessResponse()

    /**
     * A list of conditional branches to evaluate if the code hook times out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-timeoutconditional)
     */
    public fun timeoutConditional(): Any? = unwrap(this).getTimeoutConditional()

    /**
     * Specifies the next step that the bot runs when the code hook times out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-timeoutnextstep)
     */
    public fun timeoutNextStep(): Any? = unwrap(this).getTimeoutNextStep()

    /**
     * Specifies a list of message groups that Amazon Lex uses to respond to the user input when the
     * code hook times out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-timeoutresponse)
     */
    public fun timeoutResponse(): Any? = unwrap(this).getTimeoutResponse()

    /**
     * A builder for [PostDialogCodeHookInvocationSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param failureConditional A list of conditional branches to evaluate after the dialog code
       * hook throws an exception or returns with the `State` field of the `Intent` object set to
       * `Failed` .
       */
      public fun failureConditional(failureConditional: IResolvable)

      /**
       * @param failureConditional A list of conditional branches to evaluate after the dialog code
       * hook throws an exception or returns with the `State` field of the `Intent` object set to
       * `Failed` .
       */
      public fun failureConditional(failureConditional: ConditionalSpecificationProperty)

      /**
       * @param failureConditional A list of conditional branches to evaluate after the dialog code
       * hook throws an exception or returns with the `State` field of the `Intent` object set to
       * `Failed` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a31debbf13eaccf61af0ae05dec5876c7102629b14b86a37324cfb2aa8004eac")
      public
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      /**
       * @param failureNextStep Specifies the next step the bot runs after the dialog code hook
       * throws an exception or returns with the `State` field of the `Intent` object set to `Failed` .
       */
      public fun failureNextStep(failureNextStep: IResolvable)

      /**
       * @param failureNextStep Specifies the next step the bot runs after the dialog code hook
       * throws an exception or returns with the `State` field of the `Intent` object set to `Failed` .
       */
      public fun failureNextStep(failureNextStep: DialogStateProperty)

      /**
       * @param failureNextStep Specifies the next step the bot runs after the dialog code hook
       * throws an exception or returns with the `State` field of the `Intent` object set to `Failed` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c76e3c6d416c507c1565ca27669610b4de0c2c9ea7c496501b30bc5bd42df3d0")
      public fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit)

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the code hook fails.
       */
      public fun failureResponse(failureResponse: IResolvable)

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the code hook fails.
       */
      public fun failureResponse(failureResponse: ResponseSpecificationProperty)

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the code hook fails.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d46d0ef9580a382564eeccce208df2906bda1d480bba65cb04aa04dc3f7d7b08")
      public fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      /**
       * @param successConditional A list of conditional branches to evaluate after the dialog code
       * hook finishes successfully.
       */
      public fun successConditional(successConditional: IResolvable)

      /**
       * @param successConditional A list of conditional branches to evaluate after the dialog code
       * hook finishes successfully.
       */
      public fun successConditional(successConditional: ConditionalSpecificationProperty)

      /**
       * @param successConditional A list of conditional branches to evaluate after the dialog code
       * hook finishes successfully.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8652ce061e95c444bc471ea830ede868e6eb6a215c33e2034cb6c0317e00ac06")
      public
          fun successConditional(successConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      /**
       * @param successNextStep Specifics the next step the bot runs after the dialog code hook
       * finishes successfully.
       */
      public fun successNextStep(successNextStep: IResolvable)

      /**
       * @param successNextStep Specifics the next step the bot runs after the dialog code hook
       * finishes successfully.
       */
      public fun successNextStep(successNextStep: DialogStateProperty)

      /**
       * @param successNextStep Specifics the next step the bot runs after the dialog code hook
       * finishes successfully.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("604288558462ca514861bfe079b03915bc793e00114f12bb81c1d7c7c0c359f2")
      public fun successNextStep(successNextStep: DialogStateProperty.Builder.() -> Unit)

      /**
       * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when the code hook succeeds.
       */
      public fun successResponse(successResponse: IResolvable)

      /**
       * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when the code hook succeeds.
       */
      public fun successResponse(successResponse: ResponseSpecificationProperty)

      /**
       * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when the code hook succeeds.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de9be0044f2964ff57e7660837e4bde93b509b39678def1a5b0f124b88afc99c")
      public fun successResponse(successResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      /**
       * @param timeoutConditional A list of conditional branches to evaluate if the code hook times
       * out.
       */
      public fun timeoutConditional(timeoutConditional: IResolvable)

      /**
       * @param timeoutConditional A list of conditional branches to evaluate if the code hook times
       * out.
       */
      public fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty)

      /**
       * @param timeoutConditional A list of conditional branches to evaluate if the code hook times
       * out.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e32c1d98a3cc912cdb6b9d575535fd4928866b0cc791bb4f78d5437f2dc229a4")
      public
          fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      /**
       * @param timeoutNextStep Specifies the next step that the bot runs when the code hook times
       * out.
       */
      public fun timeoutNextStep(timeoutNextStep: IResolvable)

      /**
       * @param timeoutNextStep Specifies the next step that the bot runs when the code hook times
       * out.
       */
      public fun timeoutNextStep(timeoutNextStep: DialogStateProperty)

      /**
       * @param timeoutNextStep Specifies the next step that the bot runs when the code hook times
       * out.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21c2a6c18595b0accdc91d97af7e561bed26eeb647d6b277b7b48201c119a96d")
      public fun timeoutNextStep(timeoutNextStep: DialogStateProperty.Builder.() -> Unit)

      /**
       * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond
       * to the user input when the code hook times out.
       */
      public fun timeoutResponse(timeoutResponse: IResolvable)

      /**
       * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond
       * to the user input when the code hook times out.
       */
      public fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty)

      /**
       * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond
       * to the user input when the code hook times out.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa27c7ee7bfbbf27abb0484818b27d5407682cfca7d7011a5914fa91583d9429")
      public fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.PostDialogCodeHookInvocationSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.PostDialogCodeHookInvocationSpecificationProperty.builder()

      /**
       * @param failureConditional A list of conditional branches to evaluate after the dialog code
       * hook throws an exception or returns with the `State` field of the `Intent` object set to
       * `Failed` .
       */
      override fun failureConditional(failureConditional: IResolvable) {
        cdkBuilder.failureConditional(failureConditional.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param failureConditional A list of conditional branches to evaluate after the dialog code
       * hook throws an exception or returns with the `State` field of the `Intent` object set to
       * `Failed` .
       */
      override fun failureConditional(failureConditional: ConditionalSpecificationProperty) {
        cdkBuilder.failureConditional(failureConditional.let(ConditionalSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param failureConditional A list of conditional branches to evaluate after the dialog code
       * hook throws an exception or returns with the `State` field of the `Intent` object set to
       * `Failed` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a31debbf13eaccf61af0ae05dec5876c7102629b14b86a37324cfb2aa8004eac")
      override
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = failureConditional(ConditionalSpecificationProperty(failureConditional))

      /**
       * @param failureNextStep Specifies the next step the bot runs after the dialog code hook
       * throws an exception or returns with the `State` field of the `Intent` object set to `Failed` .
       */
      override fun failureNextStep(failureNextStep: IResolvable) {
        cdkBuilder.failureNextStep(failureNextStep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param failureNextStep Specifies the next step the bot runs after the dialog code hook
       * throws an exception or returns with the `State` field of the `Intent` object set to `Failed` .
       */
      override fun failureNextStep(failureNextStep: DialogStateProperty) {
        cdkBuilder.failureNextStep(failureNextStep.let(DialogStateProperty.Companion::unwrap))
      }

      /**
       * @param failureNextStep Specifies the next step the bot runs after the dialog code hook
       * throws an exception or returns with the `State` field of the `Intent` object set to `Failed` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c76e3c6d416c507c1565ca27669610b4de0c2c9ea7c496501b30bc5bd42df3d0")
      override fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          failureNextStep(DialogStateProperty(failureNextStep))

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the code hook fails.
       */
      override fun failureResponse(failureResponse: IResolvable) {
        cdkBuilder.failureResponse(failureResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the code hook fails.
       */
      override fun failureResponse(failureResponse: ResponseSpecificationProperty) {
        cdkBuilder.failureResponse(failureResponse.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the code hook fails.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d46d0ef9580a382564eeccce208df2906bda1d480bba65cb04aa04dc3f7d7b08")
      override
          fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = failureResponse(ResponseSpecificationProperty(failureResponse))

      /**
       * @param successConditional A list of conditional branches to evaluate after the dialog code
       * hook finishes successfully.
       */
      override fun successConditional(successConditional: IResolvable) {
        cdkBuilder.successConditional(successConditional.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param successConditional A list of conditional branches to evaluate after the dialog code
       * hook finishes successfully.
       */
      override fun successConditional(successConditional: ConditionalSpecificationProperty) {
        cdkBuilder.successConditional(successConditional.let(ConditionalSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param successConditional A list of conditional branches to evaluate after the dialog code
       * hook finishes successfully.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8652ce061e95c444bc471ea830ede868e6eb6a215c33e2034cb6c0317e00ac06")
      override
          fun successConditional(successConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = successConditional(ConditionalSpecificationProperty(successConditional))

      /**
       * @param successNextStep Specifics the next step the bot runs after the dialog code hook
       * finishes successfully.
       */
      override fun successNextStep(successNextStep: IResolvable) {
        cdkBuilder.successNextStep(successNextStep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param successNextStep Specifics the next step the bot runs after the dialog code hook
       * finishes successfully.
       */
      override fun successNextStep(successNextStep: DialogStateProperty) {
        cdkBuilder.successNextStep(successNextStep.let(DialogStateProperty.Companion::unwrap))
      }

      /**
       * @param successNextStep Specifics the next step the bot runs after the dialog code hook
       * finishes successfully.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("604288558462ca514861bfe079b03915bc793e00114f12bb81c1d7c7c0c359f2")
      override fun successNextStep(successNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          successNextStep(DialogStateProperty(successNextStep))

      /**
       * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when the code hook succeeds.
       */
      override fun successResponse(successResponse: IResolvable) {
        cdkBuilder.successResponse(successResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when the code hook succeeds.
       */
      override fun successResponse(successResponse: ResponseSpecificationProperty) {
        cdkBuilder.successResponse(successResponse.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when the code hook succeeds.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de9be0044f2964ff57e7660837e4bde93b509b39678def1a5b0f124b88afc99c")
      override
          fun successResponse(successResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = successResponse(ResponseSpecificationProperty(successResponse))

      /**
       * @param timeoutConditional A list of conditional branches to evaluate if the code hook times
       * out.
       */
      override fun timeoutConditional(timeoutConditional: IResolvable) {
        cdkBuilder.timeoutConditional(timeoutConditional.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param timeoutConditional A list of conditional branches to evaluate if the code hook times
       * out.
       */
      override fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty) {
        cdkBuilder.timeoutConditional(timeoutConditional.let(ConditionalSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param timeoutConditional A list of conditional branches to evaluate if the code hook times
       * out.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e32c1d98a3cc912cdb6b9d575535fd4928866b0cc791bb4f78d5437f2dc229a4")
      override
          fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = timeoutConditional(ConditionalSpecificationProperty(timeoutConditional))

      /**
       * @param timeoutNextStep Specifies the next step that the bot runs when the code hook times
       * out.
       */
      override fun timeoutNextStep(timeoutNextStep: IResolvable) {
        cdkBuilder.timeoutNextStep(timeoutNextStep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param timeoutNextStep Specifies the next step that the bot runs when the code hook times
       * out.
       */
      override fun timeoutNextStep(timeoutNextStep: DialogStateProperty) {
        cdkBuilder.timeoutNextStep(timeoutNextStep.let(DialogStateProperty.Companion::unwrap))
      }

      /**
       * @param timeoutNextStep Specifies the next step that the bot runs when the code hook times
       * out.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21c2a6c18595b0accdc91d97af7e561bed26eeb647d6b277b7b48201c119a96d")
      override fun timeoutNextStep(timeoutNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          timeoutNextStep(DialogStateProperty(timeoutNextStep))

      /**
       * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond
       * to the user input when the code hook times out.
       */
      override fun timeoutResponse(timeoutResponse: IResolvable) {
        cdkBuilder.timeoutResponse(timeoutResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond
       * to the user input when the code hook times out.
       */
      override fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty) {
        cdkBuilder.timeoutResponse(timeoutResponse.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond
       * to the user input when the code hook times out.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa27c7ee7bfbbf27abb0484818b27d5407682cfca7d7011a5914fa91583d9429")
      override
          fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = timeoutResponse(ResponseSpecificationProperty(timeoutResponse))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.PostDialogCodeHookInvocationSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.PostDialogCodeHookInvocationSpecificationProperty,
    ) : CdkObject(cdkObject),
        PostDialogCodeHookInvocationSpecificationProperty {
      /**
       * A list of conditional branches to evaluate after the dialog code hook throws an exception
       * or returns with the `State` field of the `Intent` object set to `Failed` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-failureconditional)
       */
      override fun failureConditional(): Any? = unwrap(this).getFailureConditional()

      /**
       * Specifies the next step the bot runs after the dialog code hook throws an exception or
       * returns with the `State` field of the `Intent` object set to `Failed` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-failurenextstep)
       */
      override fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

      /**
       * Specifies a list of message groups that Amazon Lex uses to respond the user input when the
       * code hook fails.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-failureresponse)
       */
      override fun failureResponse(): Any? = unwrap(this).getFailureResponse()

      /**
       * A list of conditional branches to evaluate after the dialog code hook finishes
       * successfully.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-successconditional)
       */
      override fun successConditional(): Any? = unwrap(this).getSuccessConditional()

      /**
       * Specifics the next step the bot runs after the dialog code hook finishes successfully.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-successnextstep)
       */
      override fun successNextStep(): Any? = unwrap(this).getSuccessNextStep()

      /**
       * Specifies a list of message groups that Amazon Lex uses to respond when the code hook
       * succeeds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-successresponse)
       */
      override fun successResponse(): Any? = unwrap(this).getSuccessResponse()

      /**
       * A list of conditional branches to evaluate if the code hook times out.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-timeoutconditional)
       */
      override fun timeoutConditional(): Any? = unwrap(this).getTimeoutConditional()

      /**
       * Specifies the next step that the bot runs when the code hook times out.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-timeoutnextstep)
       */
      override fun timeoutNextStep(): Any? = unwrap(this).getTimeoutNextStep()

      /**
       * Specifies a list of message groups that Amazon Lex uses to respond to the user input when
       * the code hook times out.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html#cfn-lex-bot-postdialogcodehookinvocationspecification-timeoutresponse)
       */
      override fun timeoutResponse(): Any? = unwrap(this).getTimeoutResponse()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PostDialogCodeHookInvocationSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.PostDialogCodeHookInvocationSpecificationProperty):
          PostDialogCodeHookInvocationSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PostDialogCodeHookInvocationSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PostDialogCodeHookInvocationSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.PostDialogCodeHookInvocationSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.PostDialogCodeHookInvocationSpecificationProperty
    }
  }

  /**
   * Provides a setting that determines whether the post-fulfillment response is sent to the user.
   *
   * For more information, see
   * [](https://docs.aws.amazon.com/lexv2/latest/dg/streaming-progress.html#progress-complete)
   *
   * Example:
   *
   * ```
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html)
   */
  public interface PostFulfillmentStatusSpecificationProperty {
    /**
     * A list of conditional branches to evaluate after the fulfillment code hook throws an
     * exception or returns with the `State` field of the `Intent` object set to `Failed` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-failureconditional)
     */
    public fun failureConditional(): Any? = unwrap(this).getFailureConditional()

    /**
     * Specifies the next step the bot runs after the fulfillment code hook throws an exception or
     * returns with the `State` field of the `Intent` object set to `Failed` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-failurenextstep)
     */
    public fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

    /**
     * Specifies a list of message groups that Amazon Lex uses to respond when fulfillment isn't
     * successful.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-failureresponse)
     */
    public fun failureResponse(): Any? = unwrap(this).getFailureResponse()

    /**
     * A list of conditional branches to evaluate after the fulfillment code hook finishes
     * successfully.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-successconditional)
     */
    public fun successConditional(): Any? = unwrap(this).getSuccessConditional()

    /**
     * Specifies the next step in the conversation that Amazon Lex invokes when the fulfillment code
     * hook completes successfully.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-successnextstep)
     */
    public fun successNextStep(): Any? = unwrap(this).getSuccessNextStep()

    /**
     * Specifies a list of message groups that Amazon Lex uses to respond when the fulfillment is
     * successful.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-successresponse)
     */
    public fun successResponse(): Any? = unwrap(this).getSuccessResponse()

    /**
     * A list of conditional branches to evaluate if the fulfillment code hook times out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-timeoutconditional)
     */
    public fun timeoutConditional(): Any? = unwrap(this).getTimeoutConditional()

    /**
     * Specifies the next step that the bot runs when the fulfillment code hook times out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-timeoutnextstep)
     */
    public fun timeoutNextStep(): Any? = unwrap(this).getTimeoutNextStep()

    /**
     * Specifies a list of message groups that Amazon Lex uses to respond when fulfillment isn't
     * completed within the timeout period.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-timeoutresponse)
     */
    public fun timeoutResponse(): Any? = unwrap(this).getTimeoutResponse()

    /**
     * A builder for [PostFulfillmentStatusSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param failureConditional A list of conditional branches to evaluate after the fulfillment
       * code hook throws an exception or returns with the `State` field of the `Intent` object set to
       * `Failed` .
       */
      public fun failureConditional(failureConditional: IResolvable)

      /**
       * @param failureConditional A list of conditional branches to evaluate after the fulfillment
       * code hook throws an exception or returns with the `State` field of the `Intent` object set to
       * `Failed` .
       */
      public fun failureConditional(failureConditional: ConditionalSpecificationProperty)

      /**
       * @param failureConditional A list of conditional branches to evaluate after the fulfillment
       * code hook throws an exception or returns with the `State` field of the `Intent` object set to
       * `Failed` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9f2c2fa3193936c7d04b9f7bb2ec26f2e1da5813671965f7a427fbff3fb184b")
      public
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      /**
       * @param failureNextStep Specifies the next step the bot runs after the fulfillment code hook
       * throws an exception or returns with the `State` field of the `Intent` object set to `Failed` .
       */
      public fun failureNextStep(failureNextStep: IResolvable)

      /**
       * @param failureNextStep Specifies the next step the bot runs after the fulfillment code hook
       * throws an exception or returns with the `State` field of the `Intent` object set to `Failed` .
       */
      public fun failureNextStep(failureNextStep: DialogStateProperty)

      /**
       * @param failureNextStep Specifies the next step the bot runs after the fulfillment code hook
       * throws an exception or returns with the `State` field of the `Intent` object set to `Failed` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac1d1d9c4c8986be4aeeb348470a375d57b290c88f6de753230433aa8b494a4e")
      public fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit)

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when fulfillment isn't successful.
       */
      public fun failureResponse(failureResponse: IResolvable)

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when fulfillment isn't successful.
       */
      public fun failureResponse(failureResponse: ResponseSpecificationProperty)

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when fulfillment isn't successful.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f58efdf979f6bfc40fff414089d6dab81fdf41c9a5f930d9c24d67c8e42b49ab")
      public fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      /**
       * @param successConditional A list of conditional branches to evaluate after the fulfillment
       * code hook finishes successfully.
       */
      public fun successConditional(successConditional: IResolvable)

      /**
       * @param successConditional A list of conditional branches to evaluate after the fulfillment
       * code hook finishes successfully.
       */
      public fun successConditional(successConditional: ConditionalSpecificationProperty)

      /**
       * @param successConditional A list of conditional branches to evaluate after the fulfillment
       * code hook finishes successfully.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a5b91f19aff2d382e3ba0c13d6dfa842db89c8c38f02669d85e4cc30e226f2a")
      public
          fun successConditional(successConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      /**
       * @param successNextStep Specifies the next step in the conversation that Amazon Lex invokes
       * when the fulfillment code hook completes successfully.
       */
      public fun successNextStep(successNextStep: IResolvable)

      /**
       * @param successNextStep Specifies the next step in the conversation that Amazon Lex invokes
       * when the fulfillment code hook completes successfully.
       */
      public fun successNextStep(successNextStep: DialogStateProperty)

      /**
       * @param successNextStep Specifies the next step in the conversation that Amazon Lex invokes
       * when the fulfillment code hook completes successfully.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48e047e93dae3e67b0fc6457445a079e0f822eaf84fd937a3ef97e9f4555a191")
      public fun successNextStep(successNextStep: DialogStateProperty.Builder.() -> Unit)

      /**
       * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when the fulfillment is successful.
       */
      public fun successResponse(successResponse: IResolvable)

      /**
       * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when the fulfillment is successful.
       */
      public fun successResponse(successResponse: ResponseSpecificationProperty)

      /**
       * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when the fulfillment is successful.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ea0b9e14bdbb37f2d82076c93c3c3564991d9070841567ad2d0cd316e0e1686")
      public fun successResponse(successResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      /**
       * @param timeoutConditional A list of conditional branches to evaluate if the fulfillment
       * code hook times out.
       */
      public fun timeoutConditional(timeoutConditional: IResolvable)

      /**
       * @param timeoutConditional A list of conditional branches to evaluate if the fulfillment
       * code hook times out.
       */
      public fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty)

      /**
       * @param timeoutConditional A list of conditional branches to evaluate if the fulfillment
       * code hook times out.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("758462d593c2e9ec8921626f0aa0d0ec85429881a7c75e907291fdeb2784a6df")
      public
          fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      /**
       * @param timeoutNextStep Specifies the next step that the bot runs when the fulfillment code
       * hook times out.
       */
      public fun timeoutNextStep(timeoutNextStep: IResolvable)

      /**
       * @param timeoutNextStep Specifies the next step that the bot runs when the fulfillment code
       * hook times out.
       */
      public fun timeoutNextStep(timeoutNextStep: DialogStateProperty)

      /**
       * @param timeoutNextStep Specifies the next step that the bot runs when the fulfillment code
       * hook times out.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("617991d8e27e5b030c600f2262a1097439e3ada37789c4ccf3184cd029faca79")
      public fun timeoutNextStep(timeoutNextStep: DialogStateProperty.Builder.() -> Unit)

      /**
       * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when fulfillment isn't completed within the timeout period.
       */
      public fun timeoutResponse(timeoutResponse: IResolvable)

      /**
       * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when fulfillment isn't completed within the timeout period.
       */
      public fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty)

      /**
       * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when fulfillment isn't completed within the timeout period.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f2a2936aa12dbed1889dc44047be244197142d999adb47bf3220267c83a2ca4")
      public fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.PostFulfillmentStatusSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.PostFulfillmentStatusSpecificationProperty.builder()

      /**
       * @param failureConditional A list of conditional branches to evaluate after the fulfillment
       * code hook throws an exception or returns with the `State` field of the `Intent` object set to
       * `Failed` .
       */
      override fun failureConditional(failureConditional: IResolvable) {
        cdkBuilder.failureConditional(failureConditional.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param failureConditional A list of conditional branches to evaluate after the fulfillment
       * code hook throws an exception or returns with the `State` field of the `Intent` object set to
       * `Failed` .
       */
      override fun failureConditional(failureConditional: ConditionalSpecificationProperty) {
        cdkBuilder.failureConditional(failureConditional.let(ConditionalSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param failureConditional A list of conditional branches to evaluate after the fulfillment
       * code hook throws an exception or returns with the `State` field of the `Intent` object set to
       * `Failed` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9f2c2fa3193936c7d04b9f7bb2ec26f2e1da5813671965f7a427fbff3fb184b")
      override
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = failureConditional(ConditionalSpecificationProperty(failureConditional))

      /**
       * @param failureNextStep Specifies the next step the bot runs after the fulfillment code hook
       * throws an exception or returns with the `State` field of the `Intent` object set to `Failed` .
       */
      override fun failureNextStep(failureNextStep: IResolvable) {
        cdkBuilder.failureNextStep(failureNextStep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param failureNextStep Specifies the next step the bot runs after the fulfillment code hook
       * throws an exception or returns with the `State` field of the `Intent` object set to `Failed` .
       */
      override fun failureNextStep(failureNextStep: DialogStateProperty) {
        cdkBuilder.failureNextStep(failureNextStep.let(DialogStateProperty.Companion::unwrap))
      }

      /**
       * @param failureNextStep Specifies the next step the bot runs after the fulfillment code hook
       * throws an exception or returns with the `State` field of the `Intent` object set to `Failed` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac1d1d9c4c8986be4aeeb348470a375d57b290c88f6de753230433aa8b494a4e")
      override fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          failureNextStep(DialogStateProperty(failureNextStep))

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when fulfillment isn't successful.
       */
      override fun failureResponse(failureResponse: IResolvable) {
        cdkBuilder.failureResponse(failureResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when fulfillment isn't successful.
       */
      override fun failureResponse(failureResponse: ResponseSpecificationProperty) {
        cdkBuilder.failureResponse(failureResponse.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when fulfillment isn't successful.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f58efdf979f6bfc40fff414089d6dab81fdf41c9a5f930d9c24d67c8e42b49ab")
      override
          fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = failureResponse(ResponseSpecificationProperty(failureResponse))

      /**
       * @param successConditional A list of conditional branches to evaluate after the fulfillment
       * code hook finishes successfully.
       */
      override fun successConditional(successConditional: IResolvable) {
        cdkBuilder.successConditional(successConditional.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param successConditional A list of conditional branches to evaluate after the fulfillment
       * code hook finishes successfully.
       */
      override fun successConditional(successConditional: ConditionalSpecificationProperty) {
        cdkBuilder.successConditional(successConditional.let(ConditionalSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param successConditional A list of conditional branches to evaluate after the fulfillment
       * code hook finishes successfully.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a5b91f19aff2d382e3ba0c13d6dfa842db89c8c38f02669d85e4cc30e226f2a")
      override
          fun successConditional(successConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = successConditional(ConditionalSpecificationProperty(successConditional))

      /**
       * @param successNextStep Specifies the next step in the conversation that Amazon Lex invokes
       * when the fulfillment code hook completes successfully.
       */
      override fun successNextStep(successNextStep: IResolvable) {
        cdkBuilder.successNextStep(successNextStep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param successNextStep Specifies the next step in the conversation that Amazon Lex invokes
       * when the fulfillment code hook completes successfully.
       */
      override fun successNextStep(successNextStep: DialogStateProperty) {
        cdkBuilder.successNextStep(successNextStep.let(DialogStateProperty.Companion::unwrap))
      }

      /**
       * @param successNextStep Specifies the next step in the conversation that Amazon Lex invokes
       * when the fulfillment code hook completes successfully.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48e047e93dae3e67b0fc6457445a079e0f822eaf84fd937a3ef97e9f4555a191")
      override fun successNextStep(successNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          successNextStep(DialogStateProperty(successNextStep))

      /**
       * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when the fulfillment is successful.
       */
      override fun successResponse(successResponse: IResolvable) {
        cdkBuilder.successResponse(successResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when the fulfillment is successful.
       */
      override fun successResponse(successResponse: ResponseSpecificationProperty) {
        cdkBuilder.successResponse(successResponse.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when the fulfillment is successful.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ea0b9e14bdbb37f2d82076c93c3c3564991d9070841567ad2d0cd316e0e1686")
      override
          fun successResponse(successResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = successResponse(ResponseSpecificationProperty(successResponse))

      /**
       * @param timeoutConditional A list of conditional branches to evaluate if the fulfillment
       * code hook times out.
       */
      override fun timeoutConditional(timeoutConditional: IResolvable) {
        cdkBuilder.timeoutConditional(timeoutConditional.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param timeoutConditional A list of conditional branches to evaluate if the fulfillment
       * code hook times out.
       */
      override fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty) {
        cdkBuilder.timeoutConditional(timeoutConditional.let(ConditionalSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param timeoutConditional A list of conditional branches to evaluate if the fulfillment
       * code hook times out.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("758462d593c2e9ec8921626f0aa0d0ec85429881a7c75e907291fdeb2784a6df")
      override
          fun timeoutConditional(timeoutConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = timeoutConditional(ConditionalSpecificationProperty(timeoutConditional))

      /**
       * @param timeoutNextStep Specifies the next step that the bot runs when the fulfillment code
       * hook times out.
       */
      override fun timeoutNextStep(timeoutNextStep: IResolvable) {
        cdkBuilder.timeoutNextStep(timeoutNextStep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param timeoutNextStep Specifies the next step that the bot runs when the fulfillment code
       * hook times out.
       */
      override fun timeoutNextStep(timeoutNextStep: DialogStateProperty) {
        cdkBuilder.timeoutNextStep(timeoutNextStep.let(DialogStateProperty.Companion::unwrap))
      }

      /**
       * @param timeoutNextStep Specifies the next step that the bot runs when the fulfillment code
       * hook times out.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("617991d8e27e5b030c600f2262a1097439e3ada37789c4ccf3184cd029faca79")
      override fun timeoutNextStep(timeoutNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          timeoutNextStep(DialogStateProperty(timeoutNextStep))

      /**
       * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when fulfillment isn't completed within the timeout period.
       */
      override fun timeoutResponse(timeoutResponse: IResolvable) {
        cdkBuilder.timeoutResponse(timeoutResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when fulfillment isn't completed within the timeout period.
       */
      override fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty) {
        cdkBuilder.timeoutResponse(timeoutResponse.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond
       * when fulfillment isn't completed within the timeout period.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f2a2936aa12dbed1889dc44047be244197142d999adb47bf3220267c83a2ca4")
      override
          fun timeoutResponse(timeoutResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = timeoutResponse(ResponseSpecificationProperty(timeoutResponse))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.PostFulfillmentStatusSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.PostFulfillmentStatusSpecificationProperty,
    ) : CdkObject(cdkObject),
        PostFulfillmentStatusSpecificationProperty {
      /**
       * A list of conditional branches to evaluate after the fulfillment code hook throws an
       * exception or returns with the `State` field of the `Intent` object set to `Failed` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-failureconditional)
       */
      override fun failureConditional(): Any? = unwrap(this).getFailureConditional()

      /**
       * Specifies the next step the bot runs after the fulfillment code hook throws an exception or
       * returns with the `State` field of the `Intent` object set to `Failed` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-failurenextstep)
       */
      override fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

      /**
       * Specifies a list of message groups that Amazon Lex uses to respond when fulfillment isn't
       * successful.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-failureresponse)
       */
      override fun failureResponse(): Any? = unwrap(this).getFailureResponse()

      /**
       * A list of conditional branches to evaluate after the fulfillment code hook finishes
       * successfully.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-successconditional)
       */
      override fun successConditional(): Any? = unwrap(this).getSuccessConditional()

      /**
       * Specifies the next step in the conversation that Amazon Lex invokes when the fulfillment
       * code hook completes successfully.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-successnextstep)
       */
      override fun successNextStep(): Any? = unwrap(this).getSuccessNextStep()

      /**
       * Specifies a list of message groups that Amazon Lex uses to respond when the fulfillment is
       * successful.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-successresponse)
       */
      override fun successResponse(): Any? = unwrap(this).getSuccessResponse()

      /**
       * A list of conditional branches to evaluate if the fulfillment code hook times out.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-timeoutconditional)
       */
      override fun timeoutConditional(): Any? = unwrap(this).getTimeoutConditional()

      /**
       * Specifies the next step that the bot runs when the fulfillment code hook times out.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-timeoutnextstep)
       */
      override fun timeoutNextStep(): Any? = unwrap(this).getTimeoutNextStep()

      /**
       * Specifies a list of message groups that Amazon Lex uses to respond when fulfillment isn't
       * completed within the timeout period.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html#cfn-lex-bot-postfulfillmentstatusspecification-timeoutresponse)
       */
      override fun timeoutResponse(): Any? = unwrap(this).getTimeoutResponse()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PostFulfillmentStatusSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.PostFulfillmentStatusSpecificationProperty):
          PostFulfillmentStatusSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PostFulfillmentStatusSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PostFulfillmentStatusSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.PostFulfillmentStatusSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.PostFulfillmentStatusSpecificationProperty
    }
  }

  /**
   * Specifies the settings on a prompt attempt.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface PromptAttemptSpecificationProperty {
    /**
     * Indicates whether the user can interrupt a speech prompt attempt from the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptattemptspecification.html#cfn-lex-bot-promptattemptspecification-allowinterrupt)
     */
    public fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

    /**
     * Indicates the allowed input types of the prompt attempt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptattemptspecification.html#cfn-lex-bot-promptattemptspecification-allowedinputtypes)
     */
    public fun allowedInputTypes(): Any

    /**
     * Specifies the settings on audio and DTMF input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptattemptspecification.html#cfn-lex-bot-promptattemptspecification-audioanddtmfinputspecification)
     */
    public fun audioAndDtmfInputSpecification(): Any? =
        unwrap(this).getAudioAndDtmfInputSpecification()

    /**
     * Specifies the settings on text input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptattemptspecification.html#cfn-lex-bot-promptattemptspecification-textinputspecification)
     */
    public fun textInputSpecification(): Any? = unwrap(this).getTextInputSpecification()

    /**
     * A builder for [PromptAttemptSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowInterrupt Indicates whether the user can interrupt a speech prompt attempt from
       * the bot.
       */
      public fun allowInterrupt(allowInterrupt: Boolean)

      /**
       * @param allowInterrupt Indicates whether the user can interrupt a speech prompt attempt from
       * the bot.
       */
      public fun allowInterrupt(allowInterrupt: IResolvable)

      /**
       * @param allowedInputTypes Indicates the allowed input types of the prompt attempt. 
       */
      public fun allowedInputTypes(allowedInputTypes: IResolvable)

      /**
       * @param allowedInputTypes Indicates the allowed input types of the prompt attempt. 
       */
      public fun allowedInputTypes(allowedInputTypes: AllowedInputTypesProperty)

      /**
       * @param allowedInputTypes Indicates the allowed input types of the prompt attempt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7638351b588b5457789373e88564349da909c2b065e905b7817652deb0a3d43")
      public fun allowedInputTypes(allowedInputTypes: AllowedInputTypesProperty.Builder.() -> Unit)

      /**
       * @param audioAndDtmfInputSpecification Specifies the settings on audio and DTMF input.
       */
      public fun audioAndDtmfInputSpecification(audioAndDtmfInputSpecification: IResolvable)

      /**
       * @param audioAndDtmfInputSpecification Specifies the settings on audio and DTMF input.
       */
      public
          fun audioAndDtmfInputSpecification(audioAndDtmfInputSpecification: AudioAndDTMFInputSpecificationProperty)

      /**
       * @param audioAndDtmfInputSpecification Specifies the settings on audio and DTMF input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf9d845ec670960a02436c31f8417abb328daaf2e68d804169fb3446c33fc7d2")
      public
          fun audioAndDtmfInputSpecification(audioAndDtmfInputSpecification: AudioAndDTMFInputSpecificationProperty.Builder.() -> Unit)

      /**
       * @param textInputSpecification Specifies the settings on text input.
       */
      public fun textInputSpecification(textInputSpecification: IResolvable)

      /**
       * @param textInputSpecification Specifies the settings on text input.
       */
      public fun textInputSpecification(textInputSpecification: TextInputSpecificationProperty)

      /**
       * @param textInputSpecification Specifies the settings on text input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87c4c0f00bb9633904524d221a35cf1cf4326e49d709c3ed5e86c97723186603")
      public
          fun textInputSpecification(textInputSpecification: TextInputSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.PromptAttemptSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.PromptAttemptSpecificationProperty.builder()

      /**
       * @param allowInterrupt Indicates whether the user can interrupt a speech prompt attempt from
       * the bot.
       */
      override fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
      }

      /**
       * @param allowInterrupt Indicates whether the user can interrupt a speech prompt attempt from
       * the bot.
       */
      override fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param allowedInputTypes Indicates the allowed input types of the prompt attempt. 
       */
      override fun allowedInputTypes(allowedInputTypes: IResolvable) {
        cdkBuilder.allowedInputTypes(allowedInputTypes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param allowedInputTypes Indicates the allowed input types of the prompt attempt. 
       */
      override fun allowedInputTypes(allowedInputTypes: AllowedInputTypesProperty) {
        cdkBuilder.allowedInputTypes(allowedInputTypes.let(AllowedInputTypesProperty.Companion::unwrap))
      }

      /**
       * @param allowedInputTypes Indicates the allowed input types of the prompt attempt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7638351b588b5457789373e88564349da909c2b065e905b7817652deb0a3d43")
      override
          fun allowedInputTypes(allowedInputTypes: AllowedInputTypesProperty.Builder.() -> Unit):
          Unit = allowedInputTypes(AllowedInputTypesProperty(allowedInputTypes))

      /**
       * @param audioAndDtmfInputSpecification Specifies the settings on audio and DTMF input.
       */
      override fun audioAndDtmfInputSpecification(audioAndDtmfInputSpecification: IResolvable) {
        cdkBuilder.audioAndDtmfInputSpecification(audioAndDtmfInputSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param audioAndDtmfInputSpecification Specifies the settings on audio and DTMF input.
       */
      override
          fun audioAndDtmfInputSpecification(audioAndDtmfInputSpecification: AudioAndDTMFInputSpecificationProperty) {
        cdkBuilder.audioAndDtmfInputSpecification(audioAndDtmfInputSpecification.let(AudioAndDTMFInputSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param audioAndDtmfInputSpecification Specifies the settings on audio and DTMF input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf9d845ec670960a02436c31f8417abb328daaf2e68d804169fb3446c33fc7d2")
      override
          fun audioAndDtmfInputSpecification(audioAndDtmfInputSpecification: AudioAndDTMFInputSpecificationProperty.Builder.() -> Unit):
          Unit =
          audioAndDtmfInputSpecification(AudioAndDTMFInputSpecificationProperty(audioAndDtmfInputSpecification))

      /**
       * @param textInputSpecification Specifies the settings on text input.
       */
      override fun textInputSpecification(textInputSpecification: IResolvable) {
        cdkBuilder.textInputSpecification(textInputSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param textInputSpecification Specifies the settings on text input.
       */
      override fun textInputSpecification(textInputSpecification: TextInputSpecificationProperty) {
        cdkBuilder.textInputSpecification(textInputSpecification.let(TextInputSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param textInputSpecification Specifies the settings on text input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87c4c0f00bb9633904524d221a35cf1cf4326e49d709c3ed5e86c97723186603")
      override
          fun textInputSpecification(textInputSpecification: TextInputSpecificationProperty.Builder.() -> Unit):
          Unit = textInputSpecification(TextInputSpecificationProperty(textInputSpecification))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.PromptAttemptSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.PromptAttemptSpecificationProperty,
    ) : CdkObject(cdkObject),
        PromptAttemptSpecificationProperty {
      /**
       * Indicates whether the user can interrupt a speech prompt attempt from the bot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptattemptspecification.html#cfn-lex-bot-promptattemptspecification-allowinterrupt)
       */
      override fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

      /**
       * Indicates the allowed input types of the prompt attempt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptattemptspecification.html#cfn-lex-bot-promptattemptspecification-allowedinputtypes)
       */
      override fun allowedInputTypes(): Any = unwrap(this).getAllowedInputTypes()

      /**
       * Specifies the settings on audio and DTMF input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptattemptspecification.html#cfn-lex-bot-promptattemptspecification-audioanddtmfinputspecification)
       */
      override fun audioAndDtmfInputSpecification(): Any? =
          unwrap(this).getAudioAndDtmfInputSpecification()

      /**
       * Specifies the settings on text input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptattemptspecification.html#cfn-lex-bot-promptattemptspecification-textinputspecification)
       */
      override fun textInputSpecification(): Any? = unwrap(this).getTextInputSpecification()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptAttemptSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.PromptAttemptSpecificationProperty):
          PromptAttemptSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptAttemptSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptAttemptSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.PromptAttemptSpecificationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.PromptAttemptSpecificationProperty
    }
  }

  /**
   * Specifies a list of message groups that Amazon Lex sends to a user to elicit a response.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface PromptSpecificationProperty {
    /**
     * Indicates whether the user can interrupt a speech prompt from the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptspecification.html#cfn-lex-bot-promptspecification-allowinterrupt)
     */
    public fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

    /**
     * The maximum number of times the bot tries to elicit a response from the user using this
     * prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptspecification.html#cfn-lex-bot-promptspecification-maxretries)
     */
    public fun maxRetries(): Number

    /**
     * A collection of messages that Amazon Lex can send to the user.
     *
     * Amazon Lex chooses the actual message to send at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptspecification.html#cfn-lex-bot-promptspecification-messagegroupslist)
     */
    public fun messageGroupsList(): Any

    /**
     * Indicates how a message is selected from a message group among retries.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptspecification.html#cfn-lex-bot-promptspecification-messageselectionstrategy)
     */
    public fun messageSelectionStrategy(): String? = unwrap(this).getMessageSelectionStrategy()

    /**
     * Specifies the advanced settings on each attempt of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptspecification.html#cfn-lex-bot-promptspecification-promptattemptsspecification)
     */
    public fun promptAttemptsSpecification(): Any? = unwrap(this).getPromptAttemptsSpecification()

    /**
     * A builder for [PromptSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowInterrupt Indicates whether the user can interrupt a speech prompt from the
       * bot.
       */
      public fun allowInterrupt(allowInterrupt: Boolean)

      /**
       * @param allowInterrupt Indicates whether the user can interrupt a speech prompt from the
       * bot.
       */
      public fun allowInterrupt(allowInterrupt: IResolvable)

      /**
       * @param maxRetries The maximum number of times the bot tries to elicit a response from the
       * user using this prompt. 
       */
      public fun maxRetries(maxRetries: Number)

      /**
       * @param messageGroupsList A collection of messages that Amazon Lex can send to the user. 
       * Amazon Lex chooses the actual message to send at runtime.
       */
      public fun messageGroupsList(messageGroupsList: IResolvable)

      /**
       * @param messageGroupsList A collection of messages that Amazon Lex can send to the user. 
       * Amazon Lex chooses the actual message to send at runtime.
       */
      public fun messageGroupsList(messageGroupsList: List<Any>)

      /**
       * @param messageGroupsList A collection of messages that Amazon Lex can send to the user. 
       * Amazon Lex chooses the actual message to send at runtime.
       */
      public fun messageGroupsList(vararg messageGroupsList: Any)

      /**
       * @param messageSelectionStrategy Indicates how a message is selected from a message group
       * among retries.
       */
      public fun messageSelectionStrategy(messageSelectionStrategy: String)

      /**
       * @param promptAttemptsSpecification Specifies the advanced settings on each attempt of the
       * prompt.
       */
      public fun promptAttemptsSpecification(promptAttemptsSpecification: IResolvable)

      /**
       * @param promptAttemptsSpecification Specifies the advanced settings on each attempt of the
       * prompt.
       */
      public fun promptAttemptsSpecification(promptAttemptsSpecification: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.PromptSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.PromptSpecificationProperty.builder()

      /**
       * @param allowInterrupt Indicates whether the user can interrupt a speech prompt from the
       * bot.
       */
      override fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
      }

      /**
       * @param allowInterrupt Indicates whether the user can interrupt a speech prompt from the
       * bot.
       */
      override fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param maxRetries The maximum number of times the bot tries to elicit a response from the
       * user using this prompt. 
       */
      override fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
      }

      /**
       * @param messageGroupsList A collection of messages that Amazon Lex can send to the user. 
       * Amazon Lex chooses the actual message to send at runtime.
       */
      override fun messageGroupsList(messageGroupsList: IResolvable) {
        cdkBuilder.messageGroupsList(messageGroupsList.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param messageGroupsList A collection of messages that Amazon Lex can send to the user. 
       * Amazon Lex chooses the actual message to send at runtime.
       */
      override fun messageGroupsList(messageGroupsList: List<Any>) {
        cdkBuilder.messageGroupsList(messageGroupsList.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param messageGroupsList A collection of messages that Amazon Lex can send to the user. 
       * Amazon Lex chooses the actual message to send at runtime.
       */
      override fun messageGroupsList(vararg messageGroupsList: Any): Unit =
          messageGroupsList(messageGroupsList.toList())

      /**
       * @param messageSelectionStrategy Indicates how a message is selected from a message group
       * among retries.
       */
      override fun messageSelectionStrategy(messageSelectionStrategy: String) {
        cdkBuilder.messageSelectionStrategy(messageSelectionStrategy)
      }

      /**
       * @param promptAttemptsSpecification Specifies the advanced settings on each attempt of the
       * prompt.
       */
      override fun promptAttemptsSpecification(promptAttemptsSpecification: IResolvable) {
        cdkBuilder.promptAttemptsSpecification(promptAttemptsSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param promptAttemptsSpecification Specifies the advanced settings on each attempt of the
       * prompt.
       */
      override fun promptAttemptsSpecification(promptAttemptsSpecification: Map<String, Any>) {
        cdkBuilder.promptAttemptsSpecification(promptAttemptsSpecification.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.PromptSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.PromptSpecificationProperty,
    ) : CdkObject(cdkObject),
        PromptSpecificationProperty {
      /**
       * Indicates whether the user can interrupt a speech prompt from the bot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptspecification.html#cfn-lex-bot-promptspecification-allowinterrupt)
       */
      override fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

      /**
       * The maximum number of times the bot tries to elicit a response from the user using this
       * prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptspecification.html#cfn-lex-bot-promptspecification-maxretries)
       */
      override fun maxRetries(): Number = unwrap(this).getMaxRetries()

      /**
       * A collection of messages that Amazon Lex can send to the user.
       *
       * Amazon Lex chooses the actual message to send at runtime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptspecification.html#cfn-lex-bot-promptspecification-messagegroupslist)
       */
      override fun messageGroupsList(): Any = unwrap(this).getMessageGroupsList()

      /**
       * Indicates how a message is selected from a message group among retries.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptspecification.html#cfn-lex-bot-promptspecification-messageselectionstrategy)
       */
      override fun messageSelectionStrategy(): String? = unwrap(this).getMessageSelectionStrategy()

      /**
       * Specifies the advanced settings on each attempt of the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptspecification.html#cfn-lex-bot-promptspecification-promptattemptsspecification)
       */
      override fun promptAttemptsSpecification(): Any? =
          unwrap(this).getPromptAttemptsSpecification()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.PromptSpecificationProperty):
          PromptSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.PromptSpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.PromptSpecificationProperty
    }
  }

  /**
   * Specifies a list of message groups that Amazon Lex uses to respond the user input.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface ResponseSpecificationProperty {
    /**
     * Indicates whether the user can interrupt a speech response from Amazon Lex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-responsespecification.html#cfn-lex-bot-responsespecification-allowinterrupt)
     */
    public fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

    /**
     * A collection of responses that Amazon Lex can send to the user.
     *
     * Amazon Lex chooses the actual response to send at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-responsespecification.html#cfn-lex-bot-responsespecification-messagegroupslist)
     */
    public fun messageGroupsList(): Any

    /**
     * A builder for [ResponseSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowInterrupt Indicates whether the user can interrupt a speech response from
       * Amazon Lex.
       */
      public fun allowInterrupt(allowInterrupt: Boolean)

      /**
       * @param allowInterrupt Indicates whether the user can interrupt a speech response from
       * Amazon Lex.
       */
      public fun allowInterrupt(allowInterrupt: IResolvable)

      /**
       * @param messageGroupsList A collection of responses that Amazon Lex can send to the user. 
       * Amazon Lex chooses the actual response to send at runtime.
       */
      public fun messageGroupsList(messageGroupsList: IResolvable)

      /**
       * @param messageGroupsList A collection of responses that Amazon Lex can send to the user. 
       * Amazon Lex chooses the actual response to send at runtime.
       */
      public fun messageGroupsList(messageGroupsList: List<Any>)

      /**
       * @param messageGroupsList A collection of responses that Amazon Lex can send to the user. 
       * Amazon Lex chooses the actual response to send at runtime.
       */
      public fun messageGroupsList(vararg messageGroupsList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.ResponseSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.ResponseSpecificationProperty.builder()

      /**
       * @param allowInterrupt Indicates whether the user can interrupt a speech response from
       * Amazon Lex.
       */
      override fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
      }

      /**
       * @param allowInterrupt Indicates whether the user can interrupt a speech response from
       * Amazon Lex.
       */
      override fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param messageGroupsList A collection of responses that Amazon Lex can send to the user. 
       * Amazon Lex chooses the actual response to send at runtime.
       */
      override fun messageGroupsList(messageGroupsList: IResolvable) {
        cdkBuilder.messageGroupsList(messageGroupsList.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param messageGroupsList A collection of responses that Amazon Lex can send to the user. 
       * Amazon Lex chooses the actual response to send at runtime.
       */
      override fun messageGroupsList(messageGroupsList: List<Any>) {
        cdkBuilder.messageGroupsList(messageGroupsList.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param messageGroupsList A collection of responses that Amazon Lex can send to the user. 
       * Amazon Lex chooses the actual response to send at runtime.
       */
      override fun messageGroupsList(vararg messageGroupsList: Any): Unit =
          messageGroupsList(messageGroupsList.toList())

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.ResponseSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.ResponseSpecificationProperty,
    ) : CdkObject(cdkObject),
        ResponseSpecificationProperty {
      /**
       * Indicates whether the user can interrupt a speech response from Amazon Lex.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-responsespecification.html#cfn-lex-bot-responsespecification-allowinterrupt)
       */
      override fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

      /**
       * A collection of responses that Amazon Lex can send to the user.
       *
       * Amazon Lex chooses the actual response to send at runtime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-responsespecification.html#cfn-lex-bot-responsespecification-messagegroupslist)
       */
      override fun messageGroupsList(): Any = unwrap(this).getMessageGroupsList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResponseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.ResponseSpecificationProperty):
          ResponseSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResponseSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.ResponseSpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.ResponseSpecificationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3bucketlogdestination.html)
   */
  public interface S3BucketLogDestinationProperty {
    /**
     * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting
     * audio log files stored in an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3bucketlogdestination.html#cfn-lex-bot-s3bucketlogdestination-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The S3 prefix to assign to audio log files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3bucketlogdestination.html#cfn-lex-bot-s3bucketlogdestination-logprefix)
     */
    public fun logPrefix(): String

    /**
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3bucketlogdestination.html#cfn-lex-bot-s3bucketlogdestination-s3bucketarn)
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
          software.amazon.awscdk.services.lex.CfnBot.S3BucketLogDestinationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.S3BucketLogDestinationProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.S3BucketLogDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.S3BucketLogDestinationProperty,
    ) : CdkObject(cdkObject),
        S3BucketLogDestinationProperty {
      /**
       * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting
       * audio log files stored in an Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3bucketlogdestination.html#cfn-lex-bot-s3bucketlogdestination-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      /**
       * The S3 prefix to assign to audio log files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3bucketlogdestination.html#cfn-lex-bot-s3bucketlogdestination-logprefix)
       */
      override fun logPrefix(): String = unwrap(this).getLogPrefix()

      /**
       * The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3bucketlogdestination.html#cfn-lex-bot-s3bucketlogdestination-s3bucketarn)
       */
      override fun s3BucketArn(): String = unwrap(this).getS3BucketArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3BucketLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.S3BucketLogDestinationProperty):
          S3BucketLogDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3BucketLogDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3BucketLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBot.S3BucketLogDestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.S3BucketLogDestinationProperty
    }
  }

  /**
   * Defines an Amazon S3 bucket location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface S3LocationProperty {
    /**
     * The S3 bucket name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3location.html#cfn-lex-bot-s3location-s3bucket)
     */
    public fun s3Bucket(): String

    /**
     * The path and file name to the object in the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3location.html#cfn-lex-bot-s3location-s3objectkey)
     */
    public fun s3ObjectKey(): String

    /**
     * The version of the object in the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3location.html#cfn-lex-bot-s3location-s3objectversion)
     */
    public fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Bucket The S3 bucket name. 
       */
      public fun s3Bucket(s3Bucket: String)

      /**
       * @param s3ObjectKey The path and file name to the object in the S3 bucket. 
       */
      public fun s3ObjectKey(s3ObjectKey: String)

      /**
       * @param s3ObjectVersion The version of the object in the S3 bucket.
       */
      public fun s3ObjectVersion(s3ObjectVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.S3LocationProperty.Builder
          = software.amazon.awscdk.services.lex.CfnBot.S3LocationProperty.builder()

      /**
       * @param s3Bucket The S3 bucket name. 
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      /**
       * @param s3ObjectKey The path and file name to the object in the S3 bucket. 
       */
      override fun s3ObjectKey(s3ObjectKey: String) {
        cdkBuilder.s3ObjectKey(s3ObjectKey)
      }

      /**
       * @param s3ObjectVersion The version of the object in the S3 bucket.
       */
      override fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.S3LocationProperty,
    ) : CdkObject(cdkObject),
        S3LocationProperty {
      /**
       * The S3 bucket name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3location.html#cfn-lex-bot-s3location-s3bucket)
       */
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      /**
       * The path and file name to the object in the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3location.html#cfn-lex-bot-s3location-s3objectkey)
       */
      override fun s3ObjectKey(): String = unwrap(this).getS3ObjectKey()

      /**
       * The version of the object in the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3location.html#cfn-lex-bot-s3location-s3objectversion)
       */
      override fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.lex.CfnBot.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.S3LocationProperty
    }
  }

  /**
   * Defines a Speech Synthesis Markup Language (SSML) prompt.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * SSMLMessageProperty sSMLMessageProperty = SSMLMessageProperty.builder()
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-ssmlmessage.html)
   */
  public interface SSMLMessageProperty {
    /**
     * The SSML text that defines the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-ssmlmessage.html#cfn-lex-bot-ssmlmessage-value)
     */
    public fun `value`(): String

    /**
     * A builder for [SSMLMessageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The SSML text that defines the prompt. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.SSMLMessageProperty.Builder
          = software.amazon.awscdk.services.lex.CfnBot.SSMLMessageProperty.builder()

      /**
       * @param value The SSML text that defines the prompt. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SSMLMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SSMLMessageProperty,
    ) : CdkObject(cdkObject),
        SSMLMessageProperty {
      /**
       * The SSML text that defines the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-ssmlmessage.html#cfn-lex-bot-ssmlmessage-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SSMLMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SSMLMessageProperty):
          SSMLMessageProperty = CdkObjectWrappers.wrap(cdkObject) as? SSMLMessageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SSMLMessageProperty):
          software.amazon.awscdk.services.lex.CfnBot.SSMLMessageProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.SSMLMessageProperty
    }
  }

  /**
   * A sample utterance that invokes an intent or respond to a slot elicitation prompt.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * SampleUtteranceProperty sampleUtteranceProperty = SampleUtteranceProperty.builder()
   * .utterance("utterance")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sampleutterance.html)
   */
  public interface SampleUtteranceProperty {
    /**
     * A sample utterance that invokes an intent or respond to a slot elicitation prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sampleutterance.html#cfn-lex-bot-sampleutterance-utterance)
     */
    public fun utterance(): String

    /**
     * A builder for [SampleUtteranceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param utterance A sample utterance that invokes an intent or respond to a slot elicitation
       * prompt. 
       */
      public fun utterance(utterance: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SampleUtteranceProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SampleUtteranceProperty.builder()

      /**
       * @param utterance A sample utterance that invokes an intent or respond to a slot elicitation
       * prompt. 
       */
      override fun utterance(utterance: String) {
        cdkBuilder.utterance(utterance)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SampleUtteranceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SampleUtteranceProperty,
    ) : CdkObject(cdkObject),
        SampleUtteranceProperty {
      /**
       * A sample utterance that invokes an intent or respond to a slot elicitation prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sampleutterance.html#cfn-lex-bot-sampleutterance-utterance)
       */
      override fun utterance(): String = unwrap(this).getUtterance()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SampleUtteranceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SampleUtteranceProperty):
          SampleUtteranceProperty = CdkObjectWrappers.wrap(cdkObject) as? SampleUtteranceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SampleUtteranceProperty):
          software.amazon.awscdk.services.lex.CfnBot.SampleUtteranceProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.SampleUtteranceProperty
    }
  }

  /**
   * Defines one of the values for a slot type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * SampleValueProperty sampleValueProperty = SampleValueProperty.builder()
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-samplevalue.html)
   */
  public interface SampleValueProperty {
    /**
     * The value that can be used for a slot type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-samplevalue.html#cfn-lex-bot-samplevalue-value)
     */
    public fun `value`(): String

    /**
     * A builder for [SampleValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The value that can be used for a slot type. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.SampleValueProperty.Builder
          = software.amazon.awscdk.services.lex.CfnBot.SampleValueProperty.builder()

      /**
       * @param value The value that can be used for a slot type. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SampleValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SampleValueProperty,
    ) : CdkObject(cdkObject),
        SampleValueProperty {
      /**
       * The value that can be used for a slot type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-samplevalue.html#cfn-lex-bot-samplevalue-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SampleValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SampleValueProperty):
          SampleValueProperty = CdkObjectWrappers.wrap(cdkObject) as? SampleValueProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SampleValueProperty):
          software.amazon.awscdk.services.lex.CfnBot.SampleValueProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.SampleValueProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sentimentanalysissettings.html)
   */
  public interface SentimentAnalysisSettingsProperty {
    /**
     * Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment of user utterances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sentimentanalysissettings.html#cfn-lex-bot-sentimentanalysissettings-detectsentiment)
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
          software.amazon.awscdk.services.lex.CfnBot.SentimentAnalysisSettingsProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SentimentAnalysisSettingsProperty.builder()

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
        cdkBuilder.detectSentiment(detectSentiment.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.SentimentAnalysisSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SentimentAnalysisSettingsProperty,
    ) : CdkObject(cdkObject),
        SentimentAnalysisSettingsProperty {
      /**
       * Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment of user utterances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sentimentanalysissettings.html#cfn-lex-bot-sentimentanalysissettings-detectsentiment)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SentimentAnalysisSettingsProperty):
          SentimentAnalysisSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SentimentAnalysisSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SentimentAnalysisSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBot.SentimentAnalysisSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.SentimentAnalysisSettingsProperty
    }
  }

  /**
   * A key/value pair representing session-specific context information.
   *
   * It contains application information passed between Amazon Lex V2 and a client application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * SessionAttributeProperty sessionAttributeProperty = SessionAttributeProperty.builder()
   * .key("key")
   * // the properties below are optional
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sessionattribute.html)
   */
  public interface SessionAttributeProperty {
    /**
     * The name of the session attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sessionattribute.html#cfn-lex-bot-sessionattribute-key)
     */
    public fun key(): String

    /**
     * The session-specific context information for the session attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sessionattribute.html#cfn-lex-bot-sessionattribute-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [SessionAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The name of the session attribute. 
       */
      public fun key(key: String)

      /**
       * @param value The session-specific context information for the session attribute.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SessionAttributeProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SessionAttributeProperty.builder()

      /**
       * @param key The name of the session attribute. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The session-specific context information for the session attribute.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SessionAttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SessionAttributeProperty,
    ) : CdkObject(cdkObject),
        SessionAttributeProperty {
      /**
       * The name of the session attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sessionattribute.html#cfn-lex-bot-sessionattribute-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The session-specific context information for the session attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sessionattribute.html#cfn-lex-bot-sessionattribute-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SessionAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SessionAttributeProperty):
          SessionAttributeProperty = CdkObjectWrappers.wrap(cdkObject) as? SessionAttributeProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SessionAttributeProperty):
          software.amazon.awscdk.services.lex.CfnBot.SessionAttributeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.SessionAttributeProperty
    }
  }

  /**
   * Settings used when Amazon Lex successfully captures a slot value from a user.
   *
   * Example:
   *
   * ```
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html)
   */
  public interface SlotCaptureSettingProperty {
    /**
     * A list of conditional branches to evaluate after the slot value is captured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-captureconditional)
     */
    public fun captureConditional(): Any? = unwrap(this).getCaptureConditional()

    /**
     * Specifies the next step that the bot runs when the slot value is captured before the code
     * hook times out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-capturenextstep)
     */
    public fun captureNextStep(): Any? = unwrap(this).getCaptureNextStep()

    /**
     * Specifies a list of message groups that Amazon Lex uses to respond the user input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-captureresponse)
     */
    public fun captureResponse(): Any? = unwrap(this).getCaptureResponse()

    /**
     * Code hook called after Amazon Lex successfully captures a slot value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-codehook)
     */
    public fun codeHook(): Any? = unwrap(this).getCodeHook()

    /**
     * Code hook called when Amazon Lex doesn't capture a slot value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-elicitationcodehook)
     */
    public fun elicitationCodeHook(): Any? = unwrap(this).getElicitationCodeHook()

    /**
     * A list of conditional branches to evaluate when the slot value isn't captured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-failureconditional)
     */
    public fun failureConditional(): Any? = unwrap(this).getFailureConditional()

    /**
     * Specifies the next step that the bot runs when the slot value code is not recognized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-failurenextstep)
     */
    public fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

    /**
     * Specifies a list of message groups that Amazon Lex uses to respond the user input when the
     * slot fails to be captured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-failureresponse)
     */
    public fun failureResponse(): Any? = unwrap(this).getFailureResponse()

    /**
     * A builder for [SlotCaptureSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param captureConditional A list of conditional branches to evaluate after the slot value
       * is captured.
       */
      public fun captureConditional(captureConditional: IResolvable)

      /**
       * @param captureConditional A list of conditional branches to evaluate after the slot value
       * is captured.
       */
      public fun captureConditional(captureConditional: ConditionalSpecificationProperty)

      /**
       * @param captureConditional A list of conditional branches to evaluate after the slot value
       * is captured.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab778a9743668c9b489e34c54e37e26aafe861c2a38028f3abd075c198c5de4b")
      public
          fun captureConditional(captureConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      /**
       * @param captureNextStep Specifies the next step that the bot runs when the slot value is
       * captured before the code hook times out.
       */
      public fun captureNextStep(captureNextStep: IResolvable)

      /**
       * @param captureNextStep Specifies the next step that the bot runs when the slot value is
       * captured before the code hook times out.
       */
      public fun captureNextStep(captureNextStep: DialogStateProperty)

      /**
       * @param captureNextStep Specifies the next step that the bot runs when the slot value is
       * captured before the code hook times out.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab41fd42e2785717c003a9150dc29f5a1d5ee67b95e91fd396144962d6bf3ec1")
      public fun captureNextStep(captureNextStep: DialogStateProperty.Builder.() -> Unit)

      /**
       * @param captureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input.
       */
      public fun captureResponse(captureResponse: IResolvable)

      /**
       * @param captureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input.
       */
      public fun captureResponse(captureResponse: ResponseSpecificationProperty)

      /**
       * @param captureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b400d46b46cf59c0fb2dcb7e7183a0e8524fb314fe7c0d7269863f19400b9f61")
      public fun captureResponse(captureResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      /**
       * @param codeHook Code hook called after Amazon Lex successfully captures a slot value.
       */
      public fun codeHook(codeHook: IResolvable)

      /**
       * @param codeHook Code hook called after Amazon Lex successfully captures a slot value.
       */
      public fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty)

      /**
       * @param codeHook Code hook called after Amazon Lex successfully captures a slot value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94d702197c0c43ec9f01570afaa570cb86bf321ab8ed2bde4a092ef4d50fdb0e")
      public fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty.Builder.() -> Unit)

      /**
       * @param elicitationCodeHook Code hook called when Amazon Lex doesn't capture a slot value.
       */
      public fun elicitationCodeHook(elicitationCodeHook: IResolvable)

      /**
       * @param elicitationCodeHook Code hook called when Amazon Lex doesn't capture a slot value.
       */
      public
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty)

      /**
       * @param elicitationCodeHook Code hook called when Amazon Lex doesn't capture a slot value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ecbb8fa3a252c59ab75da2f7dc71b60fc765a00ae22f4f9d642b36d737a5be6f")
      public
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty.Builder.() -> Unit)

      /**
       * @param failureConditional A list of conditional branches to evaluate when the slot value
       * isn't captured.
       */
      public fun failureConditional(failureConditional: IResolvable)

      /**
       * @param failureConditional A list of conditional branches to evaluate when the slot value
       * isn't captured.
       */
      public fun failureConditional(failureConditional: ConditionalSpecificationProperty)

      /**
       * @param failureConditional A list of conditional branches to evaluate when the slot value
       * isn't captured.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c379ecef2bd867ec42dcb89c3d6af461135ca5449c366608d273896493c49c9a")
      public
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit)

      /**
       * @param failureNextStep Specifies the next step that the bot runs when the slot value code
       * is not recognized.
       */
      public fun failureNextStep(failureNextStep: IResolvable)

      /**
       * @param failureNextStep Specifies the next step that the bot runs when the slot value code
       * is not recognized.
       */
      public fun failureNextStep(failureNextStep: DialogStateProperty)

      /**
       * @param failureNextStep Specifies the next step that the bot runs when the slot value code
       * is not recognized.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c9d3b218631a6f4b2c8d1e7eef3c6d2d2b6fb238d7a0873cbb4d2b43f80c738")
      public fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit)

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the slot fails to be captured.
       */
      public fun failureResponse(failureResponse: IResolvable)

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the slot fails to be captured.
       */
      public fun failureResponse(failureResponse: ResponseSpecificationProperty)

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the slot fails to be captured.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c8611a775515012c2f5130aa6dab6b6ec571c722dc70b5d8ba3482b015bb8ee")
      public fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotCaptureSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotCaptureSettingProperty.builder()

      /**
       * @param captureConditional A list of conditional branches to evaluate after the slot value
       * is captured.
       */
      override fun captureConditional(captureConditional: IResolvable) {
        cdkBuilder.captureConditional(captureConditional.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param captureConditional A list of conditional branches to evaluate after the slot value
       * is captured.
       */
      override fun captureConditional(captureConditional: ConditionalSpecificationProperty) {
        cdkBuilder.captureConditional(captureConditional.let(ConditionalSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param captureConditional A list of conditional branches to evaluate after the slot value
       * is captured.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab778a9743668c9b489e34c54e37e26aafe861c2a38028f3abd075c198c5de4b")
      override
          fun captureConditional(captureConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = captureConditional(ConditionalSpecificationProperty(captureConditional))

      /**
       * @param captureNextStep Specifies the next step that the bot runs when the slot value is
       * captured before the code hook times out.
       */
      override fun captureNextStep(captureNextStep: IResolvable) {
        cdkBuilder.captureNextStep(captureNextStep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param captureNextStep Specifies the next step that the bot runs when the slot value is
       * captured before the code hook times out.
       */
      override fun captureNextStep(captureNextStep: DialogStateProperty) {
        cdkBuilder.captureNextStep(captureNextStep.let(DialogStateProperty.Companion::unwrap))
      }

      /**
       * @param captureNextStep Specifies the next step that the bot runs when the slot value is
       * captured before the code hook times out.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab41fd42e2785717c003a9150dc29f5a1d5ee67b95e91fd396144962d6bf3ec1")
      override fun captureNextStep(captureNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          captureNextStep(DialogStateProperty(captureNextStep))

      /**
       * @param captureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input.
       */
      override fun captureResponse(captureResponse: IResolvable) {
        cdkBuilder.captureResponse(captureResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param captureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input.
       */
      override fun captureResponse(captureResponse: ResponseSpecificationProperty) {
        cdkBuilder.captureResponse(captureResponse.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param captureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b400d46b46cf59c0fb2dcb7e7183a0e8524fb314fe7c0d7269863f19400b9f61")
      override
          fun captureResponse(captureResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = captureResponse(ResponseSpecificationProperty(captureResponse))

      /**
       * @param codeHook Code hook called after Amazon Lex successfully captures a slot value.
       */
      override fun codeHook(codeHook: IResolvable) {
        cdkBuilder.codeHook(codeHook.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param codeHook Code hook called after Amazon Lex successfully captures a slot value.
       */
      override fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty) {
        cdkBuilder.codeHook(codeHook.let(DialogCodeHookInvocationSettingProperty.Companion::unwrap))
      }

      /**
       * @param codeHook Code hook called after Amazon Lex successfully captures a slot value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94d702197c0c43ec9f01570afaa570cb86bf321ab8ed2bde4a092ef4d50fdb0e")
      override fun codeHook(codeHook: DialogCodeHookInvocationSettingProperty.Builder.() -> Unit):
          Unit = codeHook(DialogCodeHookInvocationSettingProperty(codeHook))

      /**
       * @param elicitationCodeHook Code hook called when Amazon Lex doesn't capture a slot value.
       */
      override fun elicitationCodeHook(elicitationCodeHook: IResolvable) {
        cdkBuilder.elicitationCodeHook(elicitationCodeHook.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param elicitationCodeHook Code hook called when Amazon Lex doesn't capture a slot value.
       */
      override
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty) {
        cdkBuilder.elicitationCodeHook(elicitationCodeHook.let(ElicitationCodeHookInvocationSettingProperty.Companion::unwrap))
      }

      /**
       * @param elicitationCodeHook Code hook called when Amazon Lex doesn't capture a slot value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ecbb8fa3a252c59ab75da2f7dc71b60fc765a00ae22f4f9d642b36d737a5be6f")
      override
          fun elicitationCodeHook(elicitationCodeHook: ElicitationCodeHookInvocationSettingProperty.Builder.() -> Unit):
          Unit =
          elicitationCodeHook(ElicitationCodeHookInvocationSettingProperty(elicitationCodeHook))

      /**
       * @param failureConditional A list of conditional branches to evaluate when the slot value
       * isn't captured.
       */
      override fun failureConditional(failureConditional: IResolvable) {
        cdkBuilder.failureConditional(failureConditional.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param failureConditional A list of conditional branches to evaluate when the slot value
       * isn't captured.
       */
      override fun failureConditional(failureConditional: ConditionalSpecificationProperty) {
        cdkBuilder.failureConditional(failureConditional.let(ConditionalSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param failureConditional A list of conditional branches to evaluate when the slot value
       * isn't captured.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c379ecef2bd867ec42dcb89c3d6af461135ca5449c366608d273896493c49c9a")
      override
          fun failureConditional(failureConditional: ConditionalSpecificationProperty.Builder.() -> Unit):
          Unit = failureConditional(ConditionalSpecificationProperty(failureConditional))

      /**
       * @param failureNextStep Specifies the next step that the bot runs when the slot value code
       * is not recognized.
       */
      override fun failureNextStep(failureNextStep: IResolvable) {
        cdkBuilder.failureNextStep(failureNextStep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param failureNextStep Specifies the next step that the bot runs when the slot value code
       * is not recognized.
       */
      override fun failureNextStep(failureNextStep: DialogStateProperty) {
        cdkBuilder.failureNextStep(failureNextStep.let(DialogStateProperty.Companion::unwrap))
      }

      /**
       * @param failureNextStep Specifies the next step that the bot runs when the slot value code
       * is not recognized.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c9d3b218631a6f4b2c8d1e7eef3c6d2d2b6fb238d7a0873cbb4d2b43f80c738")
      override fun failureNextStep(failureNextStep: DialogStateProperty.Builder.() -> Unit): Unit =
          failureNextStep(DialogStateProperty(failureNextStep))

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the slot fails to be captured.
       */
      override fun failureResponse(failureResponse: IResolvable) {
        cdkBuilder.failureResponse(failureResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the slot fails to be captured.
       */
      override fun failureResponse(failureResponse: ResponseSpecificationProperty) {
        cdkBuilder.failureResponse(failureResponse.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
       * the user input when the slot fails to be captured.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c8611a775515012c2f5130aa6dab6b6ec571c722dc70b5d8ba3482b015bb8ee")
      override
          fun failureResponse(failureResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = failureResponse(ResponseSpecificationProperty(failureResponse))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotCaptureSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotCaptureSettingProperty,
    ) : CdkObject(cdkObject),
        SlotCaptureSettingProperty {
      /**
       * A list of conditional branches to evaluate after the slot value is captured.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-captureconditional)
       */
      override fun captureConditional(): Any? = unwrap(this).getCaptureConditional()

      /**
       * Specifies the next step that the bot runs when the slot value is captured before the code
       * hook times out.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-capturenextstep)
       */
      override fun captureNextStep(): Any? = unwrap(this).getCaptureNextStep()

      /**
       * Specifies a list of message groups that Amazon Lex uses to respond the user input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-captureresponse)
       */
      override fun captureResponse(): Any? = unwrap(this).getCaptureResponse()

      /**
       * Code hook called after Amazon Lex successfully captures a slot value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-codehook)
       */
      override fun codeHook(): Any? = unwrap(this).getCodeHook()

      /**
       * Code hook called when Amazon Lex doesn't capture a slot value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-elicitationcodehook)
       */
      override fun elicitationCodeHook(): Any? = unwrap(this).getElicitationCodeHook()

      /**
       * A list of conditional branches to evaluate when the slot value isn't captured.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-failureconditional)
       */
      override fun failureConditional(): Any? = unwrap(this).getFailureConditional()

      /**
       * Specifies the next step that the bot runs when the slot value code is not recognized.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-failurenextstep)
       */
      override fun failureNextStep(): Any? = unwrap(this).getFailureNextStep()

      /**
       * Specifies a list of message groups that Amazon Lex uses to respond the user input when the
       * slot fails to be captured.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotcapturesetting.html#cfn-lex-bot-slotcapturesetting-failureresponse)
       */
      override fun failureResponse(): Any? = unwrap(this).getFailureResponse()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlotCaptureSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotCaptureSettingProperty):
          SlotCaptureSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SlotCaptureSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotCaptureSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotCaptureSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.SlotCaptureSettingProperty
    }
  }

  /**
   * Specifies the default value to use when a user doesn't provide a value for a slot.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * SlotDefaultValueProperty slotDefaultValueProperty = SlotDefaultValueProperty.builder()
   * .defaultValue("defaultValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotdefaultvalue.html)
   */
  public interface SlotDefaultValueProperty {
    /**
     * The default value to use when a user doesn't provide a value for a slot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotdefaultvalue.html#cfn-lex-bot-slotdefaultvalue-defaultvalue)
     */
    public fun defaultValue(): String

    /**
     * A builder for [SlotDefaultValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultValue The default value to use when a user doesn't provide a value for a
       * slot. 
       */
      public fun defaultValue(defaultValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueProperty.builder()

      /**
       * @param defaultValue The default value to use when a user doesn't provide a value for a
       * slot. 
       */
      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueProperty,
    ) : CdkObject(cdkObject),
        SlotDefaultValueProperty {
      /**
       * The default value to use when a user doesn't provide a value for a slot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotdefaultvalue.html#cfn-lex-bot-slotdefaultvalue-defaultvalue)
       */
      override fun defaultValue(): String = unwrap(this).getDefaultValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlotDefaultValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueProperty):
          SlotDefaultValueProperty = CdkObjectWrappers.wrap(cdkObject) as? SlotDefaultValueProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotDefaultValueProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueProperty
    }
  }

  /**
   * The default value to use when a user doesn't provide a value for a slot.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface SlotDefaultValueSpecificationProperty {
    /**
     * A list of default values.
     *
     * Amazon Lex chooses the default value to use in the order that they are presented in the list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotdefaultvaluespecification.html#cfn-lex-bot-slotdefaultvaluespecification-defaultvaluelist)
     */
    public fun defaultValueList(): Any

    /**
     * A builder for [SlotDefaultValueSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultValueList A list of default values. 
       * Amazon Lex chooses the default value to use in the order that they are presented in the
       * list.
       */
      public fun defaultValueList(defaultValueList: IResolvable)

      /**
       * @param defaultValueList A list of default values. 
       * Amazon Lex chooses the default value to use in the order that they are presented in the
       * list.
       */
      public fun defaultValueList(defaultValueList: List<Any>)

      /**
       * @param defaultValueList A list of default values. 
       * Amazon Lex chooses the default value to use in the order that they are presented in the
       * list.
       */
      public fun defaultValueList(vararg defaultValueList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueSpecificationProperty.builder()

      /**
       * @param defaultValueList A list of default values. 
       * Amazon Lex chooses the default value to use in the order that they are presented in the
       * list.
       */
      override fun defaultValueList(defaultValueList: IResolvable) {
        cdkBuilder.defaultValueList(defaultValueList.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultValueList A list of default values. 
       * Amazon Lex chooses the default value to use in the order that they are presented in the
       * list.
       */
      override fun defaultValueList(defaultValueList: List<Any>) {
        cdkBuilder.defaultValueList(defaultValueList.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param defaultValueList A list of default values. 
       * Amazon Lex chooses the default value to use in the order that they are presented in the
       * list.
       */
      override fun defaultValueList(vararg defaultValueList: Any): Unit =
          defaultValueList(defaultValueList.toList())

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueSpecificationProperty,
    ) : CdkObject(cdkObject),
        SlotDefaultValueSpecificationProperty {
      /**
       * A list of default values.
       *
       * Amazon Lex chooses the default value to use in the order that they are presented in the
       * list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotdefaultvaluespecification.html#cfn-lex-bot-slotdefaultvaluespecification-defaultvaluelist)
       */
      override fun defaultValueList(): Any = unwrap(this).getDefaultValueList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SlotDefaultValueSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueSpecificationProperty):
          SlotDefaultValueSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SlotDefaultValueSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotDefaultValueSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.SlotDefaultValueSpecificationProperty
    }
  }

  /**
   * Sets the priority that Amazon Lex should use when eliciting slot values from a user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * SlotPriorityProperty slotPriorityProperty = SlotPriorityProperty.builder()
   * .priority(123)
   * .slotName("slotName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotpriority.html)
   */
  public interface SlotPriorityProperty {
    /**
     * The priority that Amazon Lex should apply to the slot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotpriority.html#cfn-lex-bot-slotpriority-priority)
     */
    public fun priority(): Number

    /**
     * The name of the slot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotpriority.html#cfn-lex-bot-slotpriority-slotname)
     */
    public fun slotName(): String

    /**
     * A builder for [SlotPriorityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param priority The priority that Amazon Lex should apply to the slot. 
       */
      public fun priority(priority: Number)

      /**
       * @param slotName The name of the slot. 
       */
      public fun slotName(slotName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotPriorityProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotPriorityProperty.builder()

      /**
       * @param priority The priority that Amazon Lex should apply to the slot. 
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param slotName The name of the slot. 
       */
      override fun slotName(slotName: String) {
        cdkBuilder.slotName(slotName)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotPriorityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotPriorityProperty,
    ) : CdkObject(cdkObject),
        SlotPriorityProperty {
      /**
       * The priority that Amazon Lex should apply to the slot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotpriority.html#cfn-lex-bot-slotpriority-priority)
       */
      override fun priority(): Number = unwrap(this).getPriority()

      /**
       * The name of the slot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotpriority.html#cfn-lex-bot-slotpriority-slotname)
       */
      override fun slotName(): String = unwrap(this).getSlotName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlotPriorityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotPriorityProperty):
          SlotPriorityProperty = CdkObjectWrappers.wrap(cdkObject) as? SlotPriorityProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotPriorityProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotPriorityProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.SlotPriorityProperty
    }
  }

  /**
   * Specifies the definition of a slot.
   *
   * Amazon Lex elicits slot values from uses to fulfill the user's intent.
   *
   * Example:
   *
   * ```
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slot.html)
   */
  public interface SlotProperty {
    /**
     * The description of the slot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slot.html#cfn-lex-bot-slot-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Indicates whether a slot can return multiple values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slot.html#cfn-lex-bot-slot-multiplevaluessetting)
     */
    public fun multipleValuesSetting(): Any? = unwrap(this).getMultipleValuesSetting()

    /**
     * The name given to the slot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slot.html#cfn-lex-bot-slot-name)
     */
    public fun name(): String

    /**
     * Determines whether the contents of the slot are obfuscated in Amazon CloudWatch Logs logs.
     *
     * Use obfuscated slots to protect information such as personally identifiable information (PII)
     * in logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slot.html#cfn-lex-bot-slot-obfuscationsetting)
     */
    public fun obfuscationSetting(): Any? = unwrap(this).getObfuscationSetting()

    /**
     * The name of the slot type that this slot is based on.
     *
     * The slot type defines the acceptable values for the slot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slot.html#cfn-lex-bot-slot-slottypename)
     */
    public fun slotTypeName(): String

    /**
     * Determines the slot resolution strategy that Amazon Lex uses to return slot type values.
     *
     * The field can be set to one of the following values:
     *
     * * ORIGINAL_VALUE - Returns the value entered by the user, if the user value is similar to a
     * slot value.
     * * TOP_RESOLUTION - If there is a resolution list for the slot, return the first value in the
     * resolution list as the slot type value. If there is no resolution list, null is returned.
     *
     * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slot.html#cfn-lex-bot-slot-valueelicitationsetting)
     */
    public fun valueElicitationSetting(): Any

    /**
     * A builder for [SlotProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description The description of the slot.
       */
      public fun description(description: String)

      /**
       * @param multipleValuesSetting Indicates whether a slot can return multiple values.
       */
      public fun multipleValuesSetting(multipleValuesSetting: IResolvable)

      /**
       * @param multipleValuesSetting Indicates whether a slot can return multiple values.
       */
      public fun multipleValuesSetting(multipleValuesSetting: MultipleValuesSettingProperty)

      /**
       * @param multipleValuesSetting Indicates whether a slot can return multiple values.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ef612c6d2d1bb5f6394f09a29c3f4387174276c39df0ad78b7d5280ee774697")
      public
          fun multipleValuesSetting(multipleValuesSetting: MultipleValuesSettingProperty.Builder.() -> Unit)

      /**
       * @param name The name given to the slot. 
       */
      public fun name(name: String)

      /**
       * @param obfuscationSetting Determines whether the contents of the slot are obfuscated in
       * Amazon CloudWatch Logs logs.
       * Use obfuscated slots to protect information such as personally identifiable information
       * (PII) in logs.
       */
      public fun obfuscationSetting(obfuscationSetting: IResolvable)

      /**
       * @param obfuscationSetting Determines whether the contents of the slot are obfuscated in
       * Amazon CloudWatch Logs logs.
       * Use obfuscated slots to protect information such as personally identifiable information
       * (PII) in logs.
       */
      public fun obfuscationSetting(obfuscationSetting: ObfuscationSettingProperty)

      /**
       * @param obfuscationSetting Determines whether the contents of the slot are obfuscated in
       * Amazon CloudWatch Logs logs.
       * Use obfuscated slots to protect information such as personally identifiable information
       * (PII) in logs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0f9c90510da76da50a9b4ec81140db04fb28d6ce1e927f86bd4732516a861d8")
      public
          fun obfuscationSetting(obfuscationSetting: ObfuscationSettingProperty.Builder.() -> Unit)

      /**
       * @param slotTypeName The name of the slot type that this slot is based on. 
       * The slot type defines the acceptable values for the slot.
       */
      public fun slotTypeName(slotTypeName: String)

      /**
       * @param valueElicitationSetting Determines the slot resolution strategy that Amazon Lex uses
       * to return slot type values. 
       * The field can be set to one of the following values:
       *
       * * ORIGINAL_VALUE - Returns the value entered by the user, if the user value is similar to a
       * slot value.
       * * TOP_RESOLUTION - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       */
      public fun valueElicitationSetting(valueElicitationSetting: IResolvable)

      /**
       * @param valueElicitationSetting Determines the slot resolution strategy that Amazon Lex uses
       * to return slot type values. 
       * The field can be set to one of the following values:
       *
       * * ORIGINAL_VALUE - Returns the value entered by the user, if the user value is similar to a
       * slot value.
       * * TOP_RESOLUTION - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       */
      public
          fun valueElicitationSetting(valueElicitationSetting: SlotValueElicitationSettingProperty)

      /**
       * @param valueElicitationSetting Determines the slot resolution strategy that Amazon Lex uses
       * to return slot type values. 
       * The field can be set to one of the following values:
       *
       * * ORIGINAL_VALUE - Returns the value entered by the user, if the user value is similar to a
       * slot value.
       * * TOP_RESOLUTION - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5667e6bf1fe4e45df7bdeaae49d8f0b751048d8ac7c80538f2bc1ca0377c68f6")
      public
          fun valueElicitationSetting(valueElicitationSetting: SlotValueElicitationSettingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.SlotProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotProperty.builder()

      /**
       * @param description The description of the slot.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param multipleValuesSetting Indicates whether a slot can return multiple values.
       */
      override fun multipleValuesSetting(multipleValuesSetting: IResolvable) {
        cdkBuilder.multipleValuesSetting(multipleValuesSetting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param multipleValuesSetting Indicates whether a slot can return multiple values.
       */
      override fun multipleValuesSetting(multipleValuesSetting: MultipleValuesSettingProperty) {
        cdkBuilder.multipleValuesSetting(multipleValuesSetting.let(MultipleValuesSettingProperty.Companion::unwrap))
      }

      /**
       * @param multipleValuesSetting Indicates whether a slot can return multiple values.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ef612c6d2d1bb5f6394f09a29c3f4387174276c39df0ad78b7d5280ee774697")
      override
          fun multipleValuesSetting(multipleValuesSetting: MultipleValuesSettingProperty.Builder.() -> Unit):
          Unit = multipleValuesSetting(MultipleValuesSettingProperty(multipleValuesSetting))

      /**
       * @param name The name given to the slot. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param obfuscationSetting Determines whether the contents of the slot are obfuscated in
       * Amazon CloudWatch Logs logs.
       * Use obfuscated slots to protect information such as personally identifiable information
       * (PII) in logs.
       */
      override fun obfuscationSetting(obfuscationSetting: IResolvable) {
        cdkBuilder.obfuscationSetting(obfuscationSetting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param obfuscationSetting Determines whether the contents of the slot are obfuscated in
       * Amazon CloudWatch Logs logs.
       * Use obfuscated slots to protect information such as personally identifiable information
       * (PII) in logs.
       */
      override fun obfuscationSetting(obfuscationSetting: ObfuscationSettingProperty) {
        cdkBuilder.obfuscationSetting(obfuscationSetting.let(ObfuscationSettingProperty.Companion::unwrap))
      }

      /**
       * @param obfuscationSetting Determines whether the contents of the slot are obfuscated in
       * Amazon CloudWatch Logs logs.
       * Use obfuscated slots to protect information such as personally identifiable information
       * (PII) in logs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0f9c90510da76da50a9b4ec81140db04fb28d6ce1e927f86bd4732516a861d8")
      override
          fun obfuscationSetting(obfuscationSetting: ObfuscationSettingProperty.Builder.() -> Unit):
          Unit = obfuscationSetting(ObfuscationSettingProperty(obfuscationSetting))

      /**
       * @param slotTypeName The name of the slot type that this slot is based on. 
       * The slot type defines the acceptable values for the slot.
       */
      override fun slotTypeName(slotTypeName: String) {
        cdkBuilder.slotTypeName(slotTypeName)
      }

      /**
       * @param valueElicitationSetting Determines the slot resolution strategy that Amazon Lex uses
       * to return slot type values. 
       * The field can be set to one of the following values:
       *
       * * ORIGINAL_VALUE - Returns the value entered by the user, if the user value is similar to a
       * slot value.
       * * TOP_RESOLUTION - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       */
      override fun valueElicitationSetting(valueElicitationSetting: IResolvable) {
        cdkBuilder.valueElicitationSetting(valueElicitationSetting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param valueElicitationSetting Determines the slot resolution strategy that Amazon Lex uses
       * to return slot type values. 
       * The field can be set to one of the following values:
       *
       * * ORIGINAL_VALUE - Returns the value entered by the user, if the user value is similar to a
       * slot value.
       * * TOP_RESOLUTION - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       */
      override
          fun valueElicitationSetting(valueElicitationSetting: SlotValueElicitationSettingProperty) {
        cdkBuilder.valueElicitationSetting(valueElicitationSetting.let(SlotValueElicitationSettingProperty.Companion::unwrap))
      }

      /**
       * @param valueElicitationSetting Determines the slot resolution strategy that Amazon Lex uses
       * to return slot type values. 
       * The field can be set to one of the following values:
       *
       * * ORIGINAL_VALUE - Returns the value entered by the user, if the user value is similar to a
       * slot value.
       * * TOP_RESOLUTION - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5667e6bf1fe4e45df7bdeaae49d8f0b751048d8ac7c80538f2bc1ca0377c68f6")
      override
          fun valueElicitationSetting(valueElicitationSetting: SlotValueElicitationSettingProperty.Builder.() -> Unit):
          Unit =
          valueElicitationSetting(SlotValueElicitationSettingProperty(valueElicitationSetting))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotProperty,
    ) : CdkObject(cdkObject),
        SlotProperty {
      /**
       * The description of the slot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slot.html#cfn-lex-bot-slot-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Indicates whether a slot can return multiple values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slot.html#cfn-lex-bot-slot-multiplevaluessetting)
       */
      override fun multipleValuesSetting(): Any? = unwrap(this).getMultipleValuesSetting()

      /**
       * The name given to the slot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slot.html#cfn-lex-bot-slot-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Determines whether the contents of the slot are obfuscated in Amazon CloudWatch Logs logs.
       *
       * Use obfuscated slots to protect information such as personally identifiable information
       * (PII) in logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slot.html#cfn-lex-bot-slot-obfuscationsetting)
       */
      override fun obfuscationSetting(): Any? = unwrap(this).getObfuscationSetting()

      /**
       * The name of the slot type that this slot is based on.
       *
       * The slot type defines the acceptable values for the slot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slot.html#cfn-lex-bot-slot-slottypename)
       */
      override fun slotTypeName(): String = unwrap(this).getSlotTypeName()

      /**
       * Determines the slot resolution strategy that Amazon Lex uses to return slot type values.
       *
       * The field can be set to one of the following values:
       *
       * * ORIGINAL_VALUE - Returns the value entered by the user, if the user value is similar to a
       * slot value.
       * * TOP_RESOLUTION - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slot.html#cfn-lex-bot-slot-valueelicitationsetting)
       */
      override fun valueElicitationSetting(): Any = unwrap(this).getValueElicitationSetting()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlotProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotProperty):
          SlotProperty = CdkObjectWrappers.wrap(cdkObject) as? SlotProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotProperty = (wrapped as CdkObject).cdkObject
          as software.amazon.awscdk.services.lex.CfnBot.SlotProperty
    }
  }

  /**
   * Describes a slot type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface SlotTypeProperty {
    /**
     * A description of the slot type.
     *
     * Use the description to help identify the slot type in lists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottype.html#cfn-lex-bot-slottype-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Sets the type of external information used to create the slot type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottype.html#cfn-lex-bot-slottype-externalsourcesetting)
     */
    public fun externalSourceSetting(): Any? = unwrap(this).getExternalSourceSetting()

    /**
     * The name of the slot type.
     *
     * A slot type name must be unique withing the account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottype.html#cfn-lex-bot-slottype-name)
     */
    public fun name(): String

    /**
     * The built-in slot type used as a parent of this slot type.
     *
     * When you define a parent slot type, the new slot type has the configuration of the parent lot
     * type.
     *
     * Only `AMAZON.AlphaNumeric` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottype.html#cfn-lex-bot-slottype-parentslottypesignature)
     */
    public fun parentSlotTypeSignature(): String? = unwrap(this).getParentSlotTypeSignature()

    /**
     * A list of SlotTypeValue objects that defines the values that the slot type can take.
     *
     * Each value can have a list of synonyms, additional values that help train the machine
     * learning model about the values that it resolves for the slot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottype.html#cfn-lex-bot-slottype-slottypevalues)
     */
    public fun slotTypeValues(): Any? = unwrap(this).getSlotTypeValues()

    /**
     * Determines the slot resolution strategy that Amazon Lex uses to return slot type values.
     *
     * The field can be set to one of the following values:
     *
     * * `ORIGINAL_VALUE` - Returns the value entered by the user, if the user value is similar to
     * the slot value.
     * * `TOP_RESOLUTION` - If there is a resolution list for the slot, return the first value in
     * the resolution list as the slot type value. If there is no resolution list, null is returned.
     *
     * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottype.html#cfn-lex-bot-slottype-valueselectionsetting)
     */
    public fun valueSelectionSetting(): Any? = unwrap(this).getValueSelectionSetting()

    /**
     * A builder for [SlotTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description A description of the slot type.
       * Use the description to help identify the slot type in lists.
       */
      public fun description(description: String)

      /**
       * @param externalSourceSetting Sets the type of external information used to create the slot
       * type.
       */
      public fun externalSourceSetting(externalSourceSetting: IResolvable)

      /**
       * @param externalSourceSetting Sets the type of external information used to create the slot
       * type.
       */
      public fun externalSourceSetting(externalSourceSetting: ExternalSourceSettingProperty)

      /**
       * @param externalSourceSetting Sets the type of external information used to create the slot
       * type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bae3b0ec146c1b40c028a7363c456b512d163d6b3efef175d3c49ad9560432d7")
      public
          fun externalSourceSetting(externalSourceSetting: ExternalSourceSettingProperty.Builder.() -> Unit)

      /**
       * @param name The name of the slot type. 
       * A slot type name must be unique withing the account.
       */
      public fun name(name: String)

      /**
       * @param parentSlotTypeSignature The built-in slot type used as a parent of this slot type.
       * When you define a parent slot type, the new slot type has the configuration of the parent
       * lot type.
       *
       * Only `AMAZON.AlphaNumeric` is supported.
       */
      public fun parentSlotTypeSignature(parentSlotTypeSignature: String)

      /**
       * @param slotTypeValues A list of SlotTypeValue objects that defines the values that the slot
       * type can take.
       * Each value can have a list of synonyms, additional values that help train the machine
       * learning model about the values that it resolves for the slot.
       */
      public fun slotTypeValues(slotTypeValues: IResolvable)

      /**
       * @param slotTypeValues A list of SlotTypeValue objects that defines the values that the slot
       * type can take.
       * Each value can have a list of synonyms, additional values that help train the machine
       * learning model about the values that it resolves for the slot.
       */
      public fun slotTypeValues(slotTypeValues: List<Any>)

      /**
       * @param slotTypeValues A list of SlotTypeValue objects that defines the values that the slot
       * type can take.
       * Each value can have a list of synonyms, additional values that help train the machine
       * learning model about the values that it resolves for the slot.
       */
      public fun slotTypeValues(vararg slotTypeValues: Any)

      /**
       * @param valueSelectionSetting Determines the slot resolution strategy that Amazon Lex uses
       * to return slot type values.
       * The field can be set to one of the following values:
       *
       * * `ORIGINAL_VALUE` - Returns the value entered by the user, if the user value is similar to
       * the slot value.
       * * `TOP_RESOLUTION` - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       */
      public fun valueSelectionSetting(valueSelectionSetting: IResolvable)

      /**
       * @param valueSelectionSetting Determines the slot resolution strategy that Amazon Lex uses
       * to return slot type values.
       * The field can be set to one of the following values:
       *
       * * `ORIGINAL_VALUE` - Returns the value entered by the user, if the user value is similar to
       * the slot value.
       * * `TOP_RESOLUTION` - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       */
      public fun valueSelectionSetting(valueSelectionSetting: SlotValueSelectionSettingProperty)

      /**
       * @param valueSelectionSetting Determines the slot resolution strategy that Amazon Lex uses
       * to return slot type values.
       * The field can be set to one of the following values:
       *
       * * `ORIGINAL_VALUE` - Returns the value entered by the user, if the user value is similar to
       * the slot value.
       * * `TOP_RESOLUTION` - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1109d72ed590bbb19efba3a53e64b0f0c7ec42b4ca830c36126979421aec58a8")
      public
          fun valueSelectionSetting(valueSelectionSetting: SlotValueSelectionSettingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.SlotTypeProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotTypeProperty.builder()

      /**
       * @param description A description of the slot type.
       * Use the description to help identify the slot type in lists.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param externalSourceSetting Sets the type of external information used to create the slot
       * type.
       */
      override fun externalSourceSetting(externalSourceSetting: IResolvable) {
        cdkBuilder.externalSourceSetting(externalSourceSetting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param externalSourceSetting Sets the type of external information used to create the slot
       * type.
       */
      override fun externalSourceSetting(externalSourceSetting: ExternalSourceSettingProperty) {
        cdkBuilder.externalSourceSetting(externalSourceSetting.let(ExternalSourceSettingProperty.Companion::unwrap))
      }

      /**
       * @param externalSourceSetting Sets the type of external information used to create the slot
       * type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bae3b0ec146c1b40c028a7363c456b512d163d6b3efef175d3c49ad9560432d7")
      override
          fun externalSourceSetting(externalSourceSetting: ExternalSourceSettingProperty.Builder.() -> Unit):
          Unit = externalSourceSetting(ExternalSourceSettingProperty(externalSourceSetting))

      /**
       * @param name The name of the slot type. 
       * A slot type name must be unique withing the account.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param parentSlotTypeSignature The built-in slot type used as a parent of this slot type.
       * When you define a parent slot type, the new slot type has the configuration of the parent
       * lot type.
       *
       * Only `AMAZON.AlphaNumeric` is supported.
       */
      override fun parentSlotTypeSignature(parentSlotTypeSignature: String) {
        cdkBuilder.parentSlotTypeSignature(parentSlotTypeSignature)
      }

      /**
       * @param slotTypeValues A list of SlotTypeValue objects that defines the values that the slot
       * type can take.
       * Each value can have a list of synonyms, additional values that help train the machine
       * learning model about the values that it resolves for the slot.
       */
      override fun slotTypeValues(slotTypeValues: IResolvable) {
        cdkBuilder.slotTypeValues(slotTypeValues.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param slotTypeValues A list of SlotTypeValue objects that defines the values that the slot
       * type can take.
       * Each value can have a list of synonyms, additional values that help train the machine
       * learning model about the values that it resolves for the slot.
       */
      override fun slotTypeValues(slotTypeValues: List<Any>) {
        cdkBuilder.slotTypeValues(slotTypeValues.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param slotTypeValues A list of SlotTypeValue objects that defines the values that the slot
       * type can take.
       * Each value can have a list of synonyms, additional values that help train the machine
       * learning model about the values that it resolves for the slot.
       */
      override fun slotTypeValues(vararg slotTypeValues: Any): Unit =
          slotTypeValues(slotTypeValues.toList())

      /**
       * @param valueSelectionSetting Determines the slot resolution strategy that Amazon Lex uses
       * to return slot type values.
       * The field can be set to one of the following values:
       *
       * * `ORIGINAL_VALUE` - Returns the value entered by the user, if the user value is similar to
       * the slot value.
       * * `TOP_RESOLUTION` - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       */
      override fun valueSelectionSetting(valueSelectionSetting: IResolvable) {
        cdkBuilder.valueSelectionSetting(valueSelectionSetting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param valueSelectionSetting Determines the slot resolution strategy that Amazon Lex uses
       * to return slot type values.
       * The field can be set to one of the following values:
       *
       * * `ORIGINAL_VALUE` - Returns the value entered by the user, if the user value is similar to
       * the slot value.
       * * `TOP_RESOLUTION` - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       */
      override fun valueSelectionSetting(valueSelectionSetting: SlotValueSelectionSettingProperty) {
        cdkBuilder.valueSelectionSetting(valueSelectionSetting.let(SlotValueSelectionSettingProperty.Companion::unwrap))
      }

      /**
       * @param valueSelectionSetting Determines the slot resolution strategy that Amazon Lex uses
       * to return slot type values.
       * The field can be set to one of the following values:
       *
       * * `ORIGINAL_VALUE` - Returns the value entered by the user, if the user value is similar to
       * the slot value.
       * * `TOP_RESOLUTION` - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1109d72ed590bbb19efba3a53e64b0f0c7ec42b4ca830c36126979421aec58a8")
      override
          fun valueSelectionSetting(valueSelectionSetting: SlotValueSelectionSettingProperty.Builder.() -> Unit):
          Unit = valueSelectionSetting(SlotValueSelectionSettingProperty(valueSelectionSetting))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotTypeProperty,
    ) : CdkObject(cdkObject),
        SlotTypeProperty {
      /**
       * A description of the slot type.
       *
       * Use the description to help identify the slot type in lists.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottype.html#cfn-lex-bot-slottype-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Sets the type of external information used to create the slot type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottype.html#cfn-lex-bot-slottype-externalsourcesetting)
       */
      override fun externalSourceSetting(): Any? = unwrap(this).getExternalSourceSetting()

      /**
       * The name of the slot type.
       *
       * A slot type name must be unique withing the account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottype.html#cfn-lex-bot-slottype-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The built-in slot type used as a parent of this slot type.
       *
       * When you define a parent slot type, the new slot type has the configuration of the parent
       * lot type.
       *
       * Only `AMAZON.AlphaNumeric` is supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottype.html#cfn-lex-bot-slottype-parentslottypesignature)
       */
      override fun parentSlotTypeSignature(): String? = unwrap(this).getParentSlotTypeSignature()

      /**
       * A list of SlotTypeValue objects that defines the values that the slot type can take.
       *
       * Each value can have a list of synonyms, additional values that help train the machine
       * learning model about the values that it resolves for the slot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottype.html#cfn-lex-bot-slottype-slottypevalues)
       */
      override fun slotTypeValues(): Any? = unwrap(this).getSlotTypeValues()

      /**
       * Determines the slot resolution strategy that Amazon Lex uses to return slot type values.
       *
       * The field can be set to one of the following values:
       *
       * * `ORIGINAL_VALUE` - Returns the value entered by the user, if the user value is similar to
       * the slot value.
       * * `TOP_RESOLUTION` - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottype.html#cfn-lex-bot-slottype-valueselectionsetting)
       */
      override fun valueSelectionSetting(): Any? = unwrap(this).getValueSelectionSetting()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlotTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotTypeProperty):
          SlotTypeProperty = CdkObjectWrappers.wrap(cdkObject) as? SlotTypeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotTypeProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotTypeProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.SlotTypeProperty
    }
  }

  /**
   * Each slot type can have a set of values.
   *
   * Each `SlotTypeValue` represents a value that the slot type can take.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface SlotTypeValueProperty {
    /**
     * The value of the slot type entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottypevalue.html#cfn-lex-bot-slottypevalue-samplevalue)
     */
    public fun sampleValue(): Any

    /**
     * Additional values related to the slot type entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottypevalue.html#cfn-lex-bot-slottypevalue-synonyms)
     */
    public fun synonyms(): Any? = unwrap(this).getSynonyms()

    /**
     * A builder for [SlotTypeValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sampleValue The value of the slot type entry. 
       */
      public fun sampleValue(sampleValue: IResolvable)

      /**
       * @param sampleValue The value of the slot type entry. 
       */
      public fun sampleValue(sampleValue: SampleValueProperty)

      /**
       * @param sampleValue The value of the slot type entry. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f64f1a21fcbab008dc39908066f977fbb3c585d14768223bc9674dceff9f3e09")
      public fun sampleValue(sampleValue: SampleValueProperty.Builder.() -> Unit)

      /**
       * @param synonyms Additional values related to the slot type entry.
       */
      public fun synonyms(synonyms: IResolvable)

      /**
       * @param synonyms Additional values related to the slot type entry.
       */
      public fun synonyms(synonyms: List<Any>)

      /**
       * @param synonyms Additional values related to the slot type entry.
       */
      public fun synonyms(vararg synonyms: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotTypeValueProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotTypeValueProperty.builder()

      /**
       * @param sampleValue The value of the slot type entry. 
       */
      override fun sampleValue(sampleValue: IResolvable) {
        cdkBuilder.sampleValue(sampleValue.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sampleValue The value of the slot type entry. 
       */
      override fun sampleValue(sampleValue: SampleValueProperty) {
        cdkBuilder.sampleValue(sampleValue.let(SampleValueProperty.Companion::unwrap))
      }

      /**
       * @param sampleValue The value of the slot type entry. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f64f1a21fcbab008dc39908066f977fbb3c585d14768223bc9674dceff9f3e09")
      override fun sampleValue(sampleValue: SampleValueProperty.Builder.() -> Unit): Unit =
          sampleValue(SampleValueProperty(sampleValue))

      /**
       * @param synonyms Additional values related to the slot type entry.
       */
      override fun synonyms(synonyms: IResolvable) {
        cdkBuilder.synonyms(synonyms.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param synonyms Additional values related to the slot type entry.
       */
      override fun synonyms(synonyms: List<Any>) {
        cdkBuilder.synonyms(synonyms.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param synonyms Additional values related to the slot type entry.
       */
      override fun synonyms(vararg synonyms: Any): Unit = synonyms(synonyms.toList())

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotTypeValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotTypeValueProperty,
    ) : CdkObject(cdkObject),
        SlotTypeValueProperty {
      /**
       * The value of the slot type entry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottypevalue.html#cfn-lex-bot-slottypevalue-samplevalue)
       */
      override fun sampleValue(): Any = unwrap(this).getSampleValue()

      /**
       * Additional values related to the slot type entry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottypevalue.html#cfn-lex-bot-slottypevalue-synonyms)
       */
      override fun synonyms(): Any? = unwrap(this).getSynonyms()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlotTypeValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotTypeValueProperty):
          SlotTypeValueProperty = CdkObjectWrappers.wrap(cdkObject) as? SlotTypeValueProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotTypeValueProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotTypeValueProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.SlotTypeValueProperty
    }
  }

  /**
   * Specifies the elicitation setting details eliciting a slot.
   *
   * Example:
   *
   * ```
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueelicitationsetting.html)
   */
  public interface SlotValueElicitationSettingProperty {
    /**
     * A list of default values for a slot.
     *
     * Default values are used when Amazon Lex hasn't determined a value for a slot. You can specify
     * default values from context variables, session attributes, and defined values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueelicitationsetting.html#cfn-lex-bot-slotvalueelicitationsetting-defaultvaluespecification)
     */
    public fun defaultValueSpecification(): Any? = unwrap(this).getDefaultValueSpecification()

    /**
     * The prompt that Amazon Lex uses to elicit the slot value from the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueelicitationsetting.html#cfn-lex-bot-slotvalueelicitationsetting-promptspecification)
     */
    public fun promptSpecification(): Any? = unwrap(this).getPromptSpecification()

    /**
     * If you know a specific pattern that users might respond to an Amazon Lex request for a slot
     * value, you can provide those utterances to improve accuracy.
     *
     * This is optional. In most cases, Amazon Lex is capable of understanding user utterances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueelicitationsetting.html#cfn-lex-bot-slotvalueelicitationsetting-sampleutterances)
     */
    public fun sampleUtterances(): Any? = unwrap(this).getSampleUtterances()

    /**
     * Specifies the settings that Amazon Lex uses when a slot value is successfully entered by a
     * user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueelicitationsetting.html#cfn-lex-bot-slotvalueelicitationsetting-slotcapturesetting)
     */
    public fun slotCaptureSetting(): Any? = unwrap(this).getSlotCaptureSetting()

    /**
     * Specifies whether the slot is required or optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueelicitationsetting.html#cfn-lex-bot-slotvalueelicitationsetting-slotconstraint)
     */
    public fun slotConstraint(): String

    /**
     * Specifies the prompts that Amazon Lex uses while a bot is waiting for customer input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueelicitationsetting.html#cfn-lex-bot-slotvalueelicitationsetting-waitandcontinuespecification)
     */
    public fun waitAndContinueSpecification(): Any? = unwrap(this).getWaitAndContinueSpecification()

    /**
     * A builder for [SlotValueElicitationSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultValueSpecification A list of default values for a slot.
       * Default values are used when Amazon Lex hasn't determined a value for a slot. You can
       * specify default values from context variables, session attributes, and defined values.
       */
      public fun defaultValueSpecification(defaultValueSpecification: IResolvable)

      /**
       * @param defaultValueSpecification A list of default values for a slot.
       * Default values are used when Amazon Lex hasn't determined a value for a slot. You can
       * specify default values from context variables, session attributes, and defined values.
       */
      public
          fun defaultValueSpecification(defaultValueSpecification: SlotDefaultValueSpecificationProperty)

      /**
       * @param defaultValueSpecification A list of default values for a slot.
       * Default values are used when Amazon Lex hasn't determined a value for a slot. You can
       * specify default values from context variables, session attributes, and defined values.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("697eaca2a6a75568406081d678f16d93f06c6f9d68ac2849ea8ef4148f07f1f3")
      public
          fun defaultValueSpecification(defaultValueSpecification: SlotDefaultValueSpecificationProperty.Builder.() -> Unit)

      /**
       * @param promptSpecification The prompt that Amazon Lex uses to elicit the slot value from
       * the user.
       */
      public fun promptSpecification(promptSpecification: IResolvable)

      /**
       * @param promptSpecification The prompt that Amazon Lex uses to elicit the slot value from
       * the user.
       */
      public fun promptSpecification(promptSpecification: PromptSpecificationProperty)

      /**
       * @param promptSpecification The prompt that Amazon Lex uses to elicit the slot value from
       * the user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31322ebebe47545b9d5b8144de0ecebac5954a5207d6a72aaaf34f73b3884ddc")
      public
          fun promptSpecification(promptSpecification: PromptSpecificationProperty.Builder.() -> Unit)

      /**
       * @param sampleUtterances If you know a specific pattern that users might respond to an
       * Amazon Lex request for a slot value, you can provide those utterances to improve accuracy.
       * This is optional. In most cases, Amazon Lex is capable of understanding user utterances.
       */
      public fun sampleUtterances(sampleUtterances: IResolvable)

      /**
       * @param sampleUtterances If you know a specific pattern that users might respond to an
       * Amazon Lex request for a slot value, you can provide those utterances to improve accuracy.
       * This is optional. In most cases, Amazon Lex is capable of understanding user utterances.
       */
      public fun sampleUtterances(sampleUtterances: List<Any>)

      /**
       * @param sampleUtterances If you know a specific pattern that users might respond to an
       * Amazon Lex request for a slot value, you can provide those utterances to improve accuracy.
       * This is optional. In most cases, Amazon Lex is capable of understanding user utterances.
       */
      public fun sampleUtterances(vararg sampleUtterances: Any)

      /**
       * @param slotCaptureSetting Specifies the settings that Amazon Lex uses when a slot value is
       * successfully entered by a user.
       */
      public fun slotCaptureSetting(slotCaptureSetting: IResolvable)

      /**
       * @param slotCaptureSetting Specifies the settings that Amazon Lex uses when a slot value is
       * successfully entered by a user.
       */
      public fun slotCaptureSetting(slotCaptureSetting: SlotCaptureSettingProperty)

      /**
       * @param slotCaptureSetting Specifies the settings that Amazon Lex uses when a slot value is
       * successfully entered by a user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e690e43f7045723e4f837b25c37a81fc36ccbc7f32da93896c9cbc9f1ba9ae1")
      public
          fun slotCaptureSetting(slotCaptureSetting: SlotCaptureSettingProperty.Builder.() -> Unit)

      /**
       * @param slotConstraint Specifies whether the slot is required or optional. 
       */
      public fun slotConstraint(slotConstraint: String)

      /**
       * @param waitAndContinueSpecification Specifies the prompts that Amazon Lex uses while a bot
       * is waiting for customer input.
       */
      public fun waitAndContinueSpecification(waitAndContinueSpecification: IResolvable)

      /**
       * @param waitAndContinueSpecification Specifies the prompts that Amazon Lex uses while a bot
       * is waiting for customer input.
       */
      public
          fun waitAndContinueSpecification(waitAndContinueSpecification: WaitAndContinueSpecificationProperty)

      /**
       * @param waitAndContinueSpecification Specifies the prompts that Amazon Lex uses while a bot
       * is waiting for customer input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("982180578aba7450d801c54264ec3d1e57b7a8472fe64ff7a3fcf84ff1486ba6")
      public
          fun waitAndContinueSpecification(waitAndContinueSpecification: WaitAndContinueSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotValueElicitationSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotValueElicitationSettingProperty.builder()

      /**
       * @param defaultValueSpecification A list of default values for a slot.
       * Default values are used when Amazon Lex hasn't determined a value for a slot. You can
       * specify default values from context variables, session attributes, and defined values.
       */
      override fun defaultValueSpecification(defaultValueSpecification: IResolvable) {
        cdkBuilder.defaultValueSpecification(defaultValueSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultValueSpecification A list of default values for a slot.
       * Default values are used when Amazon Lex hasn't determined a value for a slot. You can
       * specify default values from context variables, session attributes, and defined values.
       */
      override
          fun defaultValueSpecification(defaultValueSpecification: SlotDefaultValueSpecificationProperty) {
        cdkBuilder.defaultValueSpecification(defaultValueSpecification.let(SlotDefaultValueSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param defaultValueSpecification A list of default values for a slot.
       * Default values are used when Amazon Lex hasn't determined a value for a slot. You can
       * specify default values from context variables, session attributes, and defined values.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("697eaca2a6a75568406081d678f16d93f06c6f9d68ac2849ea8ef4148f07f1f3")
      override
          fun defaultValueSpecification(defaultValueSpecification: SlotDefaultValueSpecificationProperty.Builder.() -> Unit):
          Unit =
          defaultValueSpecification(SlotDefaultValueSpecificationProperty(defaultValueSpecification))

      /**
       * @param promptSpecification The prompt that Amazon Lex uses to elicit the slot value from
       * the user.
       */
      override fun promptSpecification(promptSpecification: IResolvable) {
        cdkBuilder.promptSpecification(promptSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param promptSpecification The prompt that Amazon Lex uses to elicit the slot value from
       * the user.
       */
      override fun promptSpecification(promptSpecification: PromptSpecificationProperty) {
        cdkBuilder.promptSpecification(promptSpecification.let(PromptSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param promptSpecification The prompt that Amazon Lex uses to elicit the slot value from
       * the user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31322ebebe47545b9d5b8144de0ecebac5954a5207d6a72aaaf34f73b3884ddc")
      override
          fun promptSpecification(promptSpecification: PromptSpecificationProperty.Builder.() -> Unit):
          Unit = promptSpecification(PromptSpecificationProperty(promptSpecification))

      /**
       * @param sampleUtterances If you know a specific pattern that users might respond to an
       * Amazon Lex request for a slot value, you can provide those utterances to improve accuracy.
       * This is optional. In most cases, Amazon Lex is capable of understanding user utterances.
       */
      override fun sampleUtterances(sampleUtterances: IResolvable) {
        cdkBuilder.sampleUtterances(sampleUtterances.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sampleUtterances If you know a specific pattern that users might respond to an
       * Amazon Lex request for a slot value, you can provide those utterances to improve accuracy.
       * This is optional. In most cases, Amazon Lex is capable of understanding user utterances.
       */
      override fun sampleUtterances(sampleUtterances: List<Any>) {
        cdkBuilder.sampleUtterances(sampleUtterances.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sampleUtterances If you know a specific pattern that users might respond to an
       * Amazon Lex request for a slot value, you can provide those utterances to improve accuracy.
       * This is optional. In most cases, Amazon Lex is capable of understanding user utterances.
       */
      override fun sampleUtterances(vararg sampleUtterances: Any): Unit =
          sampleUtterances(sampleUtterances.toList())

      /**
       * @param slotCaptureSetting Specifies the settings that Amazon Lex uses when a slot value is
       * successfully entered by a user.
       */
      override fun slotCaptureSetting(slotCaptureSetting: IResolvable) {
        cdkBuilder.slotCaptureSetting(slotCaptureSetting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param slotCaptureSetting Specifies the settings that Amazon Lex uses when a slot value is
       * successfully entered by a user.
       */
      override fun slotCaptureSetting(slotCaptureSetting: SlotCaptureSettingProperty) {
        cdkBuilder.slotCaptureSetting(slotCaptureSetting.let(SlotCaptureSettingProperty.Companion::unwrap))
      }

      /**
       * @param slotCaptureSetting Specifies the settings that Amazon Lex uses when a slot value is
       * successfully entered by a user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e690e43f7045723e4f837b25c37a81fc36ccbc7f32da93896c9cbc9f1ba9ae1")
      override
          fun slotCaptureSetting(slotCaptureSetting: SlotCaptureSettingProperty.Builder.() -> Unit):
          Unit = slotCaptureSetting(SlotCaptureSettingProperty(slotCaptureSetting))

      /**
       * @param slotConstraint Specifies whether the slot is required or optional. 
       */
      override fun slotConstraint(slotConstraint: String) {
        cdkBuilder.slotConstraint(slotConstraint)
      }

      /**
       * @param waitAndContinueSpecification Specifies the prompts that Amazon Lex uses while a bot
       * is waiting for customer input.
       */
      override fun waitAndContinueSpecification(waitAndContinueSpecification: IResolvable) {
        cdkBuilder.waitAndContinueSpecification(waitAndContinueSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param waitAndContinueSpecification Specifies the prompts that Amazon Lex uses while a bot
       * is waiting for customer input.
       */
      override
          fun waitAndContinueSpecification(waitAndContinueSpecification: WaitAndContinueSpecificationProperty) {
        cdkBuilder.waitAndContinueSpecification(waitAndContinueSpecification.let(WaitAndContinueSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param waitAndContinueSpecification Specifies the prompts that Amazon Lex uses while a bot
       * is waiting for customer input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("982180578aba7450d801c54264ec3d1e57b7a8472fe64ff7a3fcf84ff1486ba6")
      override
          fun waitAndContinueSpecification(waitAndContinueSpecification: WaitAndContinueSpecificationProperty.Builder.() -> Unit):
          Unit =
          waitAndContinueSpecification(WaitAndContinueSpecificationProperty(waitAndContinueSpecification))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.SlotValueElicitationSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueElicitationSettingProperty,
    ) : CdkObject(cdkObject),
        SlotValueElicitationSettingProperty {
      /**
       * A list of default values for a slot.
       *
       * Default values are used when Amazon Lex hasn't determined a value for a slot. You can
       * specify default values from context variables, session attributes, and defined values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueelicitationsetting.html#cfn-lex-bot-slotvalueelicitationsetting-defaultvaluespecification)
       */
      override fun defaultValueSpecification(): Any? = unwrap(this).getDefaultValueSpecification()

      /**
       * The prompt that Amazon Lex uses to elicit the slot value from the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueelicitationsetting.html#cfn-lex-bot-slotvalueelicitationsetting-promptspecification)
       */
      override fun promptSpecification(): Any? = unwrap(this).getPromptSpecification()

      /**
       * If you know a specific pattern that users might respond to an Amazon Lex request for a slot
       * value, you can provide those utterances to improve accuracy.
       *
       * This is optional. In most cases, Amazon Lex is capable of understanding user utterances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueelicitationsetting.html#cfn-lex-bot-slotvalueelicitationsetting-sampleutterances)
       */
      override fun sampleUtterances(): Any? = unwrap(this).getSampleUtterances()

      /**
       * Specifies the settings that Amazon Lex uses when a slot value is successfully entered by a
       * user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueelicitationsetting.html#cfn-lex-bot-slotvalueelicitationsetting-slotcapturesetting)
       */
      override fun slotCaptureSetting(): Any? = unwrap(this).getSlotCaptureSetting()

      /**
       * Specifies whether the slot is required or optional.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueelicitationsetting.html#cfn-lex-bot-slotvalueelicitationsetting-slotconstraint)
       */
      override fun slotConstraint(): String = unwrap(this).getSlotConstraint()

      /**
       * Specifies the prompts that Amazon Lex uses while a bot is waiting for customer input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueelicitationsetting.html#cfn-lex-bot-slotvalueelicitationsetting-waitandcontinuespecification)
       */
      override fun waitAndContinueSpecification(): Any? =
          unwrap(this).getWaitAndContinueSpecification()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SlotValueElicitationSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueElicitationSettingProperty):
          SlotValueElicitationSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SlotValueElicitationSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotValueElicitationSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotValueElicitationSettingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.SlotValueElicitationSettingProperty
    }
  }

  /**
   * Maps a slot name to the
   * [SlotValueOverride](https://docs.aws.amazon.com/lexv2/latest/APIReference/API_SlotValueOverride.html)
   * object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface SlotValueOverrideMapProperty {
    /**
     * The name of the slot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueoverridemap.html#cfn-lex-bot-slotvalueoverridemap-slotname)
     */
    public fun slotName(): String? = unwrap(this).getSlotName()

    /**
     * The SlotValueOverride object to which the slot name will be mapped.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueoverridemap.html#cfn-lex-bot-slotvalueoverridemap-slotvalueoverride)
     */
    public fun slotValueOverride(): Any? = unwrap(this).getSlotValueOverride()

    /**
     * A builder for [SlotValueOverrideMapProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param slotName The name of the slot.
       */
      public fun slotName(slotName: String)

      /**
       * @param slotValueOverride The SlotValueOverride object to which the slot name will be
       * mapped.
       */
      public fun slotValueOverride(slotValueOverride: IResolvable)

      /**
       * @param slotValueOverride The SlotValueOverride object to which the slot name will be
       * mapped.
       */
      public fun slotValueOverride(slotValueOverride: SlotValueOverrideProperty)

      /**
       * @param slotValueOverride The SlotValueOverride object to which the slot name will be
       * mapped.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18bcfcb045a12a068f9d397ffce2a90823560b8e34d97fe22890ccbc028ff039")
      public fun slotValueOverride(slotValueOverride: SlotValueOverrideProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideMapProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideMapProperty.builder()

      /**
       * @param slotName The name of the slot.
       */
      override fun slotName(slotName: String) {
        cdkBuilder.slotName(slotName)
      }

      /**
       * @param slotValueOverride The SlotValueOverride object to which the slot name will be
       * mapped.
       */
      override fun slotValueOverride(slotValueOverride: IResolvable) {
        cdkBuilder.slotValueOverride(slotValueOverride.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param slotValueOverride The SlotValueOverride object to which the slot name will be
       * mapped.
       */
      override fun slotValueOverride(slotValueOverride: SlotValueOverrideProperty) {
        cdkBuilder.slotValueOverride(slotValueOverride.let(SlotValueOverrideProperty.Companion::unwrap))
      }

      /**
       * @param slotValueOverride The SlotValueOverride object to which the slot name will be
       * mapped.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18bcfcb045a12a068f9d397ffce2a90823560b8e34d97fe22890ccbc028ff039")
      override
          fun slotValueOverride(slotValueOverride: SlotValueOverrideProperty.Builder.() -> Unit):
          Unit = slotValueOverride(SlotValueOverrideProperty(slotValueOverride))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideMapProperty,
    ) : CdkObject(cdkObject),
        SlotValueOverrideMapProperty {
      /**
       * The name of the slot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueoverridemap.html#cfn-lex-bot-slotvalueoverridemap-slotname)
       */
      override fun slotName(): String? = unwrap(this).getSlotName()

      /**
       * The SlotValueOverride object to which the slot name will be mapped.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueoverridemap.html#cfn-lex-bot-slotvalueoverridemap-slotvalueoverride)
       */
      override fun slotValueOverride(): Any? = unwrap(this).getSlotValueOverride()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlotValueOverrideMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideMapProperty):
          SlotValueOverrideMapProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SlotValueOverrideMapProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotValueOverrideMapProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideMapProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideMapProperty
    }
  }

  /**
   * The slot values that Amazon Lex uses when it sets slot values in a dialog step.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface SlotValueOverrideProperty {
    /**
     * When the shape value is `List` , it indicates that the `values` field contains a list of slot
     * values.
     *
     * When the value is `Scalar` , it indicates that the `value` field contains a single value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueoverride.html#cfn-lex-bot-slotvalueoverride-shape)
     */
    public fun shape(): String? = unwrap(this).getShape()

    /**
     * The current value of the slot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueoverride.html#cfn-lex-bot-slotvalueoverride-value)
     */
    public fun `value`(): Any? = unwrap(this).getValue()

    /**
     * A list of one or more values that the user provided for the slot.
     *
     * For example, for a slot that elicits pizza toppings, the values might be "pepperoni" and
     * "pineapple."
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueoverride.html#cfn-lex-bot-slotvalueoverride-values)
     */
    public fun values(): Any? = unwrap(this).getValues()

    /**
     * A builder for [SlotValueOverrideProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param shape When the shape value is `List` , it indicates that the `values` field contains
       * a list of slot values.
       * When the value is `Scalar` , it indicates that the `value` field contains a single value.
       */
      public fun shape(shape: String)

      /**
       * @param value The current value of the slot.
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The current value of the slot.
       */
      public fun `value`(`value`: SlotValueProperty)

      /**
       * @param value The current value of the slot.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5eba9499fe0181585f9878c91689846158d974fb7b0f3017bdd15a6fb361876")
      public fun `value`(`value`: SlotValueProperty.Builder.() -> Unit)

      /**
       * @param values A list of one or more values that the user provided for the slot.
       * For example, for a slot that elicits pizza toppings, the values might be "pepperoni" and
       * "pineapple."
       */
      public fun values(values: IResolvable)

      /**
       * @param values A list of one or more values that the user provided for the slot.
       * For example, for a slot that elicits pizza toppings, the values might be "pepperoni" and
       * "pineapple."
       */
      public fun values(values: List<Any>)

      /**
       * @param values A list of one or more values that the user provided for the slot.
       * For example, for a slot that elicits pizza toppings, the values might be "pepperoni" and
       * "pineapple."
       */
      public fun values(vararg values: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideProperty.builder()

      /**
       * @param shape When the shape value is `List` , it indicates that the `values` field contains
       * a list of slot values.
       * When the value is `Scalar` , it indicates that the `value` field contains a single value.
       */
      override fun shape(shape: String) {
        cdkBuilder.shape(shape)
      }

      /**
       * @param value The current value of the slot.
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param value The current value of the slot.
       */
      override fun `value`(`value`: SlotValueProperty) {
        cdkBuilder.`value`(`value`.let(SlotValueProperty.Companion::unwrap))
      }

      /**
       * @param value The current value of the slot.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5eba9499fe0181585f9878c91689846158d974fb7b0f3017bdd15a6fb361876")
      override fun `value`(`value`: SlotValueProperty.Builder.() -> Unit): Unit =
          `value`(SlotValueProperty(`value`))

      /**
       * @param values A list of one or more values that the user provided for the slot.
       * For example, for a slot that elicits pizza toppings, the values might be "pepperoni" and
       * "pineapple."
       */
      override fun values(values: IResolvable) {
        cdkBuilder.values(values.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param values A list of one or more values that the user provided for the slot.
       * For example, for a slot that elicits pizza toppings, the values might be "pepperoni" and
       * "pineapple."
       */
      override fun values(values: List<Any>) {
        cdkBuilder.values(values.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param values A list of one or more values that the user provided for the slot.
       * For example, for a slot that elicits pizza toppings, the values might be "pepperoni" and
       * "pineapple."
       */
      override fun values(vararg values: Any): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideProperty,
    ) : CdkObject(cdkObject),
        SlotValueOverrideProperty {
      /**
       * When the shape value is `List` , it indicates that the `values` field contains a list of
       * slot values.
       *
       * When the value is `Scalar` , it indicates that the `value` field contains a single value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueoverride.html#cfn-lex-bot-slotvalueoverride-shape)
       */
      override fun shape(): String? = unwrap(this).getShape()

      /**
       * The current value of the slot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueoverride.html#cfn-lex-bot-slotvalueoverride-value)
       */
      override fun `value`(): Any? = unwrap(this).getValue()

      /**
       * A list of one or more values that the user provided for the slot.
       *
       * For example, for a slot that elicits pizza toppings, the values might be "pepperoni" and
       * "pineapple."
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueoverride.html#cfn-lex-bot-slotvalueoverride-values)
       */
      override fun values(): Any? = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlotValueOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideProperty):
          SlotValueOverrideProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SlotValueOverrideProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotValueOverrideProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.SlotValueOverrideProperty
    }
  }

  /**
   * The value to set in a slot.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * SlotValueProperty slotValueProperty = SlotValueProperty.builder()
   * .interpretedValue("interpretedValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalue.html)
   */
  public interface SlotValueProperty {
    /**
     * The value that Amazon Lex determines for the slot.
     *
     * The actual value depends on the setting of the value selection strategy for the bot. You can
     * choose to use the value entered by the user, or you can have Amazon Lex choose the first value
     * in the `resolvedValues` list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalue.html#cfn-lex-bot-slotvalue-interpretedvalue)
     */
    public fun interpretedValue(): String? = unwrap(this).getInterpretedValue()

    /**
     * A builder for [SlotValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param interpretedValue The value that Amazon Lex determines for the slot.
       * The actual value depends on the setting of the value selection strategy for the bot. You
       * can choose to use the value entered by the user, or you can have Amazon Lex choose the first
       * value in the `resolvedValues` list.
       */
      public fun interpretedValue(interpretedValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBot.SlotValueProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotValueProperty.builder()

      /**
       * @param interpretedValue The value that Amazon Lex determines for the slot.
       * The actual value depends on the setting of the value selection strategy for the bot. You
       * can choose to use the value entered by the user, or you can have Amazon Lex choose the first
       * value in the `resolvedValues` list.
       */
      override fun interpretedValue(interpretedValue: String) {
        cdkBuilder.interpretedValue(interpretedValue)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueProperty,
    ) : CdkObject(cdkObject),
        SlotValueProperty {
      /**
       * The value that Amazon Lex determines for the slot.
       *
       * The actual value depends on the setting of the value selection strategy for the bot. You
       * can choose to use the value entered by the user, or you can have Amazon Lex choose the first
       * value in the `resolvedValues` list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalue.html#cfn-lex-bot-slotvalue-interpretedvalue)
       */
      override fun interpretedValue(): String? = unwrap(this).getInterpretedValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlotValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueProperty):
          SlotValueProperty = CdkObjectWrappers.wrap(cdkObject) as? SlotValueProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotValueProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotValueProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.SlotValueProperty
    }
  }

  /**
   * Provides a regular expression used to validate the value of a slot.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * SlotValueRegexFilterProperty slotValueRegexFilterProperty =
   * SlotValueRegexFilterProperty.builder()
   * .pattern("pattern")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueregexfilter.html)
   */
  public interface SlotValueRegexFilterProperty {
    /**
     * A regular expression used to validate the value of a slot.
     *
     * Use a standard regular expression. Amazon Lex supports the following characters in the
     * regular expression:
     *
     * * A-Z, a-z
     * * 0-9
     * * Unicode characters ("\⁠u<Unicode>")
     *
     * Represent Unicode characters with four digits, for example "\⁠u0041" or "\⁠u005A".
     *
     * The following regular expression operators are not supported:
     *
     * * Infinite repeaters: *, +, or {x,} with no upper bound.
     * * Wild card (.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueregexfilter.html#cfn-lex-bot-slotvalueregexfilter-pattern)
     */
    public fun pattern(): String

    /**
     * A builder for [SlotValueRegexFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pattern A regular expression used to validate the value of a slot. 
       * Use a standard regular expression. Amazon Lex supports the following characters in the
       * regular expression:
       *
       * * A-Z, a-z
       * * 0-9
       * * Unicode characters ("\⁠u<Unicode>")
       *
       * Represent Unicode characters with four digits, for example "\⁠u0041" or "\⁠u005A".
       *
       * The following regular expression operators are not supported:
       *
       * * Infinite repeaters: *, +, or {x,} with no upper bound.
       * * Wild card (.)
       */
      public fun pattern(pattern: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotValueRegexFilterProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotValueRegexFilterProperty.builder()

      /**
       * @param pattern A regular expression used to validate the value of a slot. 
       * Use a standard regular expression. Amazon Lex supports the following characters in the
       * regular expression:
       *
       * * A-Z, a-z
       * * 0-9
       * * Unicode characters ("\⁠u<Unicode>")
       *
       * Represent Unicode characters with four digits, for example "\⁠u0041" or "\⁠u005A".
       *
       * The following regular expression operators are not supported:
       *
       * * Infinite repeaters: *, +, or {x,} with no upper bound.
       * * Wild card (.)
       */
      override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.SlotValueRegexFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueRegexFilterProperty,
    ) : CdkObject(cdkObject),
        SlotValueRegexFilterProperty {
      /**
       * A regular expression used to validate the value of a slot.
       *
       * Use a standard regular expression. Amazon Lex supports the following characters in the
       * regular expression:
       *
       * * A-Z, a-z
       * * 0-9
       * * Unicode characters ("\⁠u<Unicode>")
       *
       * Represent Unicode characters with four digits, for example "\⁠u0041" or "\⁠u005A".
       *
       * The following regular expression operators are not supported:
       *
       * * Infinite repeaters: *, +, or {x,} with no upper bound.
       * * Wild card (.)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueregexfilter.html#cfn-lex-bot-slotvalueregexfilter-pattern)
       */
      override fun pattern(): String = unwrap(this).getPattern()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlotValueRegexFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueRegexFilterProperty):
          SlotValueRegexFilterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SlotValueRegexFilterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotValueRegexFilterProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotValueRegexFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.SlotValueRegexFilterProperty
    }
  }

  /**
   * Contains settings used by Amazon Lex to select a slot value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface SlotValueSelectionSettingProperty {
    /**
     * Provides settings that enable advanced recognition settings for slot values.
     *
     * You can use this to enable using slot values as a custom vocabulary for recognizing user
     * utterances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueselectionsetting.html#cfn-lex-bot-slotvalueselectionsetting-advancedrecognitionsetting)
     */
    public fun advancedRecognitionSetting(): Any? = unwrap(this).getAdvancedRecognitionSetting()

    /**
     * A regular expression used to validate the value of a slot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueselectionsetting.html#cfn-lex-bot-slotvalueselectionsetting-regexfilter)
     */
    public fun regexFilter(): Any? = unwrap(this).getRegexFilter()

    /**
     * Determines the slot resolution strategy that Amazon Lex uses to return slot type values.
     *
     * The field can be set to one of the following values:
     *
     * * `ORIGINAL_VALUE` - Returns the value entered by the user, if the user value is similar to
     * the slot value.
     * * `TOP_RESOLUTION` - If there is a resolution list for the slot, return the first value in
     * the resolution list as the slot type value. If there is no resolution list, null is returned.
     *
     * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueselectionsetting.html#cfn-lex-bot-slotvalueselectionsetting-resolutionstrategy)
     */
    public fun resolutionStrategy(): String

    /**
     * A builder for [SlotValueSelectionSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param advancedRecognitionSetting Provides settings that enable advanced recognition
       * settings for slot values.
       * You can use this to enable using slot values as a custom vocabulary for recognizing user
       * utterances.
       */
      public fun advancedRecognitionSetting(advancedRecognitionSetting: IResolvable)

      /**
       * @param advancedRecognitionSetting Provides settings that enable advanced recognition
       * settings for slot values.
       * You can use this to enable using slot values as a custom vocabulary for recognizing user
       * utterances.
       */
      public
          fun advancedRecognitionSetting(advancedRecognitionSetting: AdvancedRecognitionSettingProperty)

      /**
       * @param advancedRecognitionSetting Provides settings that enable advanced recognition
       * settings for slot values.
       * You can use this to enable using slot values as a custom vocabulary for recognizing user
       * utterances.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25322fb1374a8e4758774d328e6ab7067e49ba7b8835140e8a42238f614f5784")
      public
          fun advancedRecognitionSetting(advancedRecognitionSetting: AdvancedRecognitionSettingProperty.Builder.() -> Unit)

      /**
       * @param regexFilter A regular expression used to validate the value of a slot.
       */
      public fun regexFilter(regexFilter: IResolvable)

      /**
       * @param regexFilter A regular expression used to validate the value of a slot.
       */
      public fun regexFilter(regexFilter: SlotValueRegexFilterProperty)

      /**
       * @param regexFilter A regular expression used to validate the value of a slot.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6e3e08624093d84f455b1e09b302ce537b99a0a539e30686943abbebc82091d")
      public fun regexFilter(regexFilter: SlotValueRegexFilterProperty.Builder.() -> Unit)

      /**
       * @param resolutionStrategy Determines the slot resolution strategy that Amazon Lex uses to
       * return slot type values. 
       * The field can be set to one of the following values:
       *
       * * `ORIGINAL_VALUE` - Returns the value entered by the user, if the user value is similar to
       * the slot value.
       * * `TOP_RESOLUTION` - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       */
      public fun resolutionStrategy(resolutionStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.SlotValueSelectionSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.SlotValueSelectionSettingProperty.builder()

      /**
       * @param advancedRecognitionSetting Provides settings that enable advanced recognition
       * settings for slot values.
       * You can use this to enable using slot values as a custom vocabulary for recognizing user
       * utterances.
       */
      override fun advancedRecognitionSetting(advancedRecognitionSetting: IResolvable) {
        cdkBuilder.advancedRecognitionSetting(advancedRecognitionSetting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param advancedRecognitionSetting Provides settings that enable advanced recognition
       * settings for slot values.
       * You can use this to enable using slot values as a custom vocabulary for recognizing user
       * utterances.
       */
      override
          fun advancedRecognitionSetting(advancedRecognitionSetting: AdvancedRecognitionSettingProperty) {
        cdkBuilder.advancedRecognitionSetting(advancedRecognitionSetting.let(AdvancedRecognitionSettingProperty.Companion::unwrap))
      }

      /**
       * @param advancedRecognitionSetting Provides settings that enable advanced recognition
       * settings for slot values.
       * You can use this to enable using slot values as a custom vocabulary for recognizing user
       * utterances.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25322fb1374a8e4758774d328e6ab7067e49ba7b8835140e8a42238f614f5784")
      override
          fun advancedRecognitionSetting(advancedRecognitionSetting: AdvancedRecognitionSettingProperty.Builder.() -> Unit):
          Unit =
          advancedRecognitionSetting(AdvancedRecognitionSettingProperty(advancedRecognitionSetting))

      /**
       * @param regexFilter A regular expression used to validate the value of a slot.
       */
      override fun regexFilter(regexFilter: IResolvable) {
        cdkBuilder.regexFilter(regexFilter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param regexFilter A regular expression used to validate the value of a slot.
       */
      override fun regexFilter(regexFilter: SlotValueRegexFilterProperty) {
        cdkBuilder.regexFilter(regexFilter.let(SlotValueRegexFilterProperty.Companion::unwrap))
      }

      /**
       * @param regexFilter A regular expression used to validate the value of a slot.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6e3e08624093d84f455b1e09b302ce537b99a0a539e30686943abbebc82091d")
      override fun regexFilter(regexFilter: SlotValueRegexFilterProperty.Builder.() -> Unit): Unit =
          regexFilter(SlotValueRegexFilterProperty(regexFilter))

      /**
       * @param resolutionStrategy Determines the slot resolution strategy that Amazon Lex uses to
       * return slot type values. 
       * The field can be set to one of the following values:
       *
       * * `ORIGINAL_VALUE` - Returns the value entered by the user, if the user value is similar to
       * the slot value.
       * * `TOP_RESOLUTION` - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       */
      override fun resolutionStrategy(resolutionStrategy: String) {
        cdkBuilder.resolutionStrategy(resolutionStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.SlotValueSelectionSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueSelectionSettingProperty,
    ) : CdkObject(cdkObject),
        SlotValueSelectionSettingProperty {
      /**
       * Provides settings that enable advanced recognition settings for slot values.
       *
       * You can use this to enable using slot values as a custom vocabulary for recognizing user
       * utterances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueselectionsetting.html#cfn-lex-bot-slotvalueselectionsetting-advancedrecognitionsetting)
       */
      override fun advancedRecognitionSetting(): Any? = unwrap(this).getAdvancedRecognitionSetting()

      /**
       * A regular expression used to validate the value of a slot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueselectionsetting.html#cfn-lex-bot-slotvalueselectionsetting-regexfilter)
       */
      override fun regexFilter(): Any? = unwrap(this).getRegexFilter()

      /**
       * Determines the slot resolution strategy that Amazon Lex uses to return slot type values.
       *
       * The field can be set to one of the following values:
       *
       * * `ORIGINAL_VALUE` - Returns the value entered by the user, if the user value is similar to
       * the slot value.
       * * `TOP_RESOLUTION` - If there is a resolution list for the slot, return the first value in
       * the resolution list as the slot type value. If there is no resolution list, null is returned.
       *
       * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueselectionsetting.html#cfn-lex-bot-slotvalueselectionsetting-resolutionstrategy)
       */
      override fun resolutionStrategy(): String = unwrap(this).getResolutionStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SlotValueSelectionSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.SlotValueSelectionSettingProperty):
          SlotValueSelectionSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SlotValueSelectionSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlotValueSelectionSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.SlotValueSelectionSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.SlotValueSelectionSettingProperty
    }
  }

  /**
   * Defines the messages that Amazon Lex sends to a user to remind them that the bot is waiting for
   * a response.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface StillWaitingResponseSpecificationProperty {
    /**
     * Indicates that the user can interrupt the response by speaking while the message is being
     * played.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-stillwaitingresponsespecification.html#cfn-lex-bot-stillwaitingresponsespecification-allowinterrupt)
     */
    public fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

    /**
     * How often a message should be sent to the user.
     *
     * Minimum of 1 second, maximum of 5 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-stillwaitingresponsespecification.html#cfn-lex-bot-stillwaitingresponsespecification-frequencyinseconds)
     */
    public fun frequencyInSeconds(): Number

    /**
     * One or more message groups, each containing one or more messages, that define the prompts
     * that Amazon Lex sends to the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-stillwaitingresponsespecification.html#cfn-lex-bot-stillwaitingresponsespecification-messagegroupslist)
     */
    public fun messageGroupsList(): Any

    /**
     * If Amazon Lex waits longer than this length of time for a response, it will stop sending
     * messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-stillwaitingresponsespecification.html#cfn-lex-bot-stillwaitingresponsespecification-timeoutinseconds)
     */
    public fun timeoutInSeconds(): Number

    /**
     * A builder for [StillWaitingResponseSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowInterrupt Indicates that the user can interrupt the response by speaking while
       * the message is being played.
       */
      public fun allowInterrupt(allowInterrupt: Boolean)

      /**
       * @param allowInterrupt Indicates that the user can interrupt the response by speaking while
       * the message is being played.
       */
      public fun allowInterrupt(allowInterrupt: IResolvable)

      /**
       * @param frequencyInSeconds How often a message should be sent to the user. 
       * Minimum of 1 second, maximum of 5 minutes.
       */
      public fun frequencyInSeconds(frequencyInSeconds: Number)

      /**
       * @param messageGroupsList One or more message groups, each containing one or more messages,
       * that define the prompts that Amazon Lex sends to the user. 
       */
      public fun messageGroupsList(messageGroupsList: IResolvable)

      /**
       * @param messageGroupsList One or more message groups, each containing one or more messages,
       * that define the prompts that Amazon Lex sends to the user. 
       */
      public fun messageGroupsList(messageGroupsList: List<Any>)

      /**
       * @param messageGroupsList One or more message groups, each containing one or more messages,
       * that define the prompts that Amazon Lex sends to the user. 
       */
      public fun messageGroupsList(vararg messageGroupsList: Any)

      /**
       * @param timeoutInSeconds If Amazon Lex waits longer than this length of time for a response,
       * it will stop sending messages. 
       */
      public fun timeoutInSeconds(timeoutInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.StillWaitingResponseSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBot.StillWaitingResponseSpecificationProperty.builder()

      /**
       * @param allowInterrupt Indicates that the user can interrupt the response by speaking while
       * the message is being played.
       */
      override fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
      }

      /**
       * @param allowInterrupt Indicates that the user can interrupt the response by speaking while
       * the message is being played.
       */
      override fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param frequencyInSeconds How often a message should be sent to the user. 
       * Minimum of 1 second, maximum of 5 minutes.
       */
      override fun frequencyInSeconds(frequencyInSeconds: Number) {
        cdkBuilder.frequencyInSeconds(frequencyInSeconds)
      }

      /**
       * @param messageGroupsList One or more message groups, each containing one or more messages,
       * that define the prompts that Amazon Lex sends to the user. 
       */
      override fun messageGroupsList(messageGroupsList: IResolvable) {
        cdkBuilder.messageGroupsList(messageGroupsList.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param messageGroupsList One or more message groups, each containing one or more messages,
       * that define the prompts that Amazon Lex sends to the user. 
       */
      override fun messageGroupsList(messageGroupsList: List<Any>) {
        cdkBuilder.messageGroupsList(messageGroupsList.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param messageGroupsList One or more message groups, each containing one or more messages,
       * that define the prompts that Amazon Lex sends to the user. 
       */
      override fun messageGroupsList(vararg messageGroupsList: Any): Unit =
          messageGroupsList(messageGroupsList.toList())

      /**
       * @param timeoutInSeconds If Amazon Lex waits longer than this length of time for a response,
       * it will stop sending messages. 
       */
      override fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.StillWaitingResponseSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.StillWaitingResponseSpecificationProperty,
    ) : CdkObject(cdkObject),
        StillWaitingResponseSpecificationProperty {
      /**
       * Indicates that the user can interrupt the response by speaking while the message is being
       * played.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-stillwaitingresponsespecification.html#cfn-lex-bot-stillwaitingresponsespecification-allowinterrupt)
       */
      override fun allowInterrupt(): Any? = unwrap(this).getAllowInterrupt()

      /**
       * How often a message should be sent to the user.
       *
       * Minimum of 1 second, maximum of 5 minutes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-stillwaitingresponsespecification.html#cfn-lex-bot-stillwaitingresponsespecification-frequencyinseconds)
       */
      override fun frequencyInSeconds(): Number = unwrap(this).getFrequencyInSeconds()

      /**
       * One or more message groups, each containing one or more messages, that define the prompts
       * that Amazon Lex sends to the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-stillwaitingresponsespecification.html#cfn-lex-bot-stillwaitingresponsespecification-messagegroupslist)
       */
      override fun messageGroupsList(): Any = unwrap(this).getMessageGroupsList()

      /**
       * If Amazon Lex waits longer than this length of time for a response, it will stop sending
       * messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-stillwaitingresponsespecification.html#cfn-lex-bot-stillwaitingresponsespecification-timeoutinseconds)
       */
      override fun timeoutInSeconds(): Number = unwrap(this).getTimeoutInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StillWaitingResponseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.StillWaitingResponseSpecificationProperty):
          StillWaitingResponseSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StillWaitingResponseSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StillWaitingResponseSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.StillWaitingResponseSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.StillWaitingResponseSpecificationProperty
    }
  }

  /**
   * Specifies configuration settings for the alias used to test the bot.
   *
   * If the `TestBotAliasSettings` property is not specified, the settings are configured with
   * default values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface TestBotAliasSettingsProperty {
    /**
     * Specifies settings that are unique to a locale.
     *
     * For example, you can use a different Lambda function depending on the bot's locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-testbotaliassettings.html#cfn-lex-bot-testbotaliassettings-botaliaslocalesettings)
     */
    public fun botAliasLocaleSettings(): Any? = unwrap(this).getBotAliasLocaleSettings()

    /**
     * Specifies settings for conversation logs that save audio, text, and metadata information for
     * conversations with your users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-testbotaliassettings.html#cfn-lex-bot-testbotaliassettings-conversationlogsettings)
     */
    public fun conversationLogSettings(): Any? = unwrap(this).getConversationLogSettings()

    /**
     * Specifies a description for the test bot alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-testbotaliassettings.html#cfn-lex-bot-testbotaliassettings-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user
     * utterances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-testbotaliassettings.html#cfn-lex-bot-testbotaliassettings-sentimentanalysissettings)
     */
    public fun sentimentAnalysisSettings(): Any? = unwrap(this).getSentimentAnalysisSettings()

    /**
     * A builder for [TestBotAliasSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param botAliasLocaleSettings Specifies settings that are unique to a locale.
       * For example, you can use a different Lambda function depending on the bot's locale.
       */
      public fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable)

      /**
       * @param botAliasLocaleSettings Specifies settings that are unique to a locale.
       * For example, you can use a different Lambda function depending on the bot's locale.
       */
      public fun botAliasLocaleSettings(botAliasLocaleSettings: List<Any>)

      /**
       * @param botAliasLocaleSettings Specifies settings that are unique to a locale.
       * For example, you can use a different Lambda function depending on the bot's locale.
       */
      public fun botAliasLocaleSettings(vararg botAliasLocaleSettings: Any)

      /**
       * @param conversationLogSettings Specifies settings for conversation logs that save audio,
       * text, and metadata information for conversations with your users.
       */
      public fun conversationLogSettings(conversationLogSettings: IResolvable)

      /**
       * @param conversationLogSettings Specifies settings for conversation logs that save audio,
       * text, and metadata information for conversations with your users.
       */
      public fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty)

      /**
       * @param conversationLogSettings Specifies settings for conversation logs that save audio,
       * text, and metadata information for conversations with your users.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfb3fdc687ddb49dec082c9376e4ede1bee806399ccc3b22e8166a011a2c1b07")
      public
          fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty.Builder.() -> Unit)

      /**
       * @param description Specifies a description for the test bot alias.
       */
      public fun description(description: String)

      /**
       * @param sentimentAnalysisSettings Specifies whether Amazon Lex will use Amazon Comprehend to
       * detect the sentiment of user utterances.
       */
      public fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.TestBotAliasSettingsProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.TestBotAliasSettingsProperty.builder()

      /**
       * @param botAliasLocaleSettings Specifies settings that are unique to a locale.
       * For example, you can use a different Lambda function depending on the bot's locale.
       */
      override fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable) {
        cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param botAliasLocaleSettings Specifies settings that are unique to a locale.
       * For example, you can use a different Lambda function depending on the bot's locale.
       */
      override fun botAliasLocaleSettings(botAliasLocaleSettings: List<Any>) {
        cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param botAliasLocaleSettings Specifies settings that are unique to a locale.
       * For example, you can use a different Lambda function depending on the bot's locale.
       */
      override fun botAliasLocaleSettings(vararg botAliasLocaleSettings: Any): Unit =
          botAliasLocaleSettings(botAliasLocaleSettings.toList())

      /**
       * @param conversationLogSettings Specifies settings for conversation logs that save audio,
       * text, and metadata information for conversations with your users.
       */
      override fun conversationLogSettings(conversationLogSettings: IResolvable) {
        cdkBuilder.conversationLogSettings(conversationLogSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conversationLogSettings Specifies settings for conversation logs that save audio,
       * text, and metadata information for conversations with your users.
       */
      override
          fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty) {
        cdkBuilder.conversationLogSettings(conversationLogSettings.let(ConversationLogSettingsProperty.Companion::unwrap))
      }

      /**
       * @param conversationLogSettings Specifies settings for conversation logs that save audio,
       * text, and metadata information for conversations with your users.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfb3fdc687ddb49dec082c9376e4ede1bee806399ccc3b22e8166a011a2c1b07")
      override
          fun conversationLogSettings(conversationLogSettings: ConversationLogSettingsProperty.Builder.() -> Unit):
          Unit = conversationLogSettings(ConversationLogSettingsProperty(conversationLogSettings))

      /**
       * @param description Specifies a description for the test bot alias.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param sentimentAnalysisSettings Specifies whether Amazon Lex will use Amazon Comprehend to
       * detect the sentiment of user utterances.
       */
      override fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any) {
        cdkBuilder.sentimentAnalysisSettings(sentimentAnalysisSettings)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.TestBotAliasSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.TestBotAliasSettingsProperty,
    ) : CdkObject(cdkObject),
        TestBotAliasSettingsProperty {
      /**
       * Specifies settings that are unique to a locale.
       *
       * For example, you can use a different Lambda function depending on the bot's locale.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-testbotaliassettings.html#cfn-lex-bot-testbotaliassettings-botaliaslocalesettings)
       */
      override fun botAliasLocaleSettings(): Any? = unwrap(this).getBotAliasLocaleSettings()

      /**
       * Specifies settings for conversation logs that save audio, text, and metadata information
       * for conversations with your users.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-testbotaliassettings.html#cfn-lex-bot-testbotaliassettings-conversationlogsettings)
       */
      override fun conversationLogSettings(): Any? = unwrap(this).getConversationLogSettings()

      /**
       * Specifies a description for the test bot alias.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-testbotaliassettings.html#cfn-lex-bot-testbotaliassettings-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Specifies whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user
       * utterances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-testbotaliassettings.html#cfn-lex-bot-testbotaliassettings-sentimentanalysissettings)
       */
      override fun sentimentAnalysisSettings(): Any? = unwrap(this).getSentimentAnalysisSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TestBotAliasSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.TestBotAliasSettingsProperty):
          TestBotAliasSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TestBotAliasSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TestBotAliasSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBot.TestBotAliasSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.TestBotAliasSettingsProperty
    }
  }

  /**
   * Specifies the text input specifications.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * TextInputSpecificationProperty textInputSpecificationProperty =
   * TextInputSpecificationProperty.builder()
   * .startTimeoutMs(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textinputspecification.html)
   */
  public interface TextInputSpecificationProperty {
    /**
     * Time for which a bot waits before re-prompting a customer for text input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textinputspecification.html#cfn-lex-bot-textinputspecification-starttimeoutms)
     */
    public fun startTimeoutMs(): Number

    /**
     * A builder for [TextInputSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param startTimeoutMs Time for which a bot waits before re-prompting a customer for text
       * input. 
       */
      public fun startTimeoutMs(startTimeoutMs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.TextInputSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.TextInputSpecificationProperty.builder()

      /**
       * @param startTimeoutMs Time for which a bot waits before re-prompting a customer for text
       * input. 
       */
      override fun startTimeoutMs(startTimeoutMs: Number) {
        cdkBuilder.startTimeoutMs(startTimeoutMs)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.TextInputSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.TextInputSpecificationProperty,
    ) : CdkObject(cdkObject),
        TextInputSpecificationProperty {
      /**
       * Time for which a bot waits before re-prompting a customer for text input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textinputspecification.html#cfn-lex-bot-textinputspecification-starttimeoutms)
       */
      override fun startTimeoutMs(): Number = unwrap(this).getStartTimeoutMs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TextInputSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.TextInputSpecificationProperty):
          TextInputSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TextInputSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextInputSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.TextInputSpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.TextInputSpecificationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textlogdestination.html)
   */
  public interface TextLogDestinationProperty {
    /**
     * Defines the Amazon CloudWatch Logs log group where text and metadata logs are delivered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textlogdestination.html#cfn-lex-bot-textlogdestination-cloudwatch)
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
      @JvmName("be64bac3de00d01346f54f60a4e21c356bc520e4c6fad6a2a6e5260900b67a85")
      public fun cloudWatch(cloudWatch: CloudWatchLogGroupLogDestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.TextLogDestinationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.TextLogDestinationProperty.builder()

      /**
       * @param cloudWatch Defines the Amazon CloudWatch Logs log group where text and metadata logs
       * are delivered. 
       */
      override fun cloudWatch(cloudWatch: IResolvable) {
        cdkBuilder.cloudWatch(cloudWatch.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cloudWatch Defines the Amazon CloudWatch Logs log group where text and metadata logs
       * are delivered. 
       */
      override fun cloudWatch(cloudWatch: CloudWatchLogGroupLogDestinationProperty) {
        cdkBuilder.cloudWatch(cloudWatch.let(CloudWatchLogGroupLogDestinationProperty.Companion::unwrap))
      }

      /**
       * @param cloudWatch Defines the Amazon CloudWatch Logs log group where text and metadata logs
       * are delivered. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be64bac3de00d01346f54f60a4e21c356bc520e4c6fad6a2a6e5260900b67a85")
      override
          fun cloudWatch(cloudWatch: CloudWatchLogGroupLogDestinationProperty.Builder.() -> Unit):
          Unit = cloudWatch(CloudWatchLogGroupLogDestinationProperty(cloudWatch))

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.TextLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.TextLogDestinationProperty,
    ) : CdkObject(cdkObject),
        TextLogDestinationProperty {
      /**
       * Defines the Amazon CloudWatch Logs log group where text and metadata logs are delivered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textlogdestination.html#cfn-lex-bot-textlogdestination-cloudwatch)
       */
      override fun cloudWatch(): Any = unwrap(this).getCloudWatch()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TextLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.TextLogDestinationProperty):
          TextLogDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TextLogDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextLogDestinationProperty):
          software.amazon.awscdk.services.lex.CfnBot.TextLogDestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.TextLogDestinationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textlogsetting.html)
   */
  public interface TextLogSettingProperty {
    /**
     * Specifies the Amazon CloudWatch Logs destination log group for conversation text logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textlogsetting.html#cfn-lex-bot-textlogsetting-destination)
     */
    public fun destination(): Any

    /**
     * Determines whether conversation logs should be stored for an alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textlogsetting.html#cfn-lex-bot-textlogsetting-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [TextLogSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination Specifies the Amazon CloudWatch Logs destination log group for
       * conversation text logs. 
       */
      public fun destination(destination: IResolvable)

      /**
       * @param destination Specifies the Amazon CloudWatch Logs destination log group for
       * conversation text logs. 
       */
      public fun destination(destination: TextLogDestinationProperty)

      /**
       * @param destination Specifies the Amazon CloudWatch Logs destination log group for
       * conversation text logs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76758a948ce825f15d7379f98141cbe9803573bf44ddb18a34bf3a8d24a8a515")
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
          software.amazon.awscdk.services.lex.CfnBot.TextLogSettingProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.TextLogSettingProperty.builder()

      /**
       * @param destination Specifies the Amazon CloudWatch Logs destination log group for
       * conversation text logs. 
       */
      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param destination Specifies the Amazon CloudWatch Logs destination log group for
       * conversation text logs. 
       */
      override fun destination(destination: TextLogDestinationProperty) {
        cdkBuilder.destination(destination.let(TextLogDestinationProperty.Companion::unwrap))
      }

      /**
       * @param destination Specifies the Amazon CloudWatch Logs destination log group for
       * conversation text logs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76758a948ce825f15d7379f98141cbe9803573bf44ddb18a34bf3a8d24a8a515")
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
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.TextLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.TextLogSettingProperty,
    ) : CdkObject(cdkObject),
        TextLogSettingProperty {
      /**
       * Specifies the Amazon CloudWatch Logs destination log group for conversation text logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textlogsetting.html#cfn-lex-bot-textlogsetting-destination)
       */
      override fun destination(): Any = unwrap(this).getDestination()

      /**
       * Determines whether conversation logs should be stored for an alias.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textlogsetting.html#cfn-lex-bot-textlogsetting-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TextLogSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.TextLogSettingProperty):
          TextLogSettingProperty = CdkObjectWrappers.wrap(cdkObject) as? TextLogSettingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextLogSettingProperty):
          software.amazon.awscdk.services.lex.CfnBot.TextLogSettingProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.TextLogSettingProperty
    }
  }

  /**
   * Defines settings for using an Amazon Polly voice to communicate with a user.
   *
   * Valid values include:
   *
   * * `standard`
   * * `neural`
   * * `long-form`
   * * `generative`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * VoiceSettingsProperty voiceSettingsProperty = VoiceSettingsProperty.builder()
   * .voiceId("voiceId")
   * // the properties below are optional
   * .engine("engine")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-voicesettings.html)
   */
  public interface VoiceSettingsProperty {
    /**
     * Indicates the type of Amazon Polly voice that Amazon Lex should use for voice interaction
     * with the user.
     *
     * For more information, see the [`engine` parameter of the `SynthesizeSpeech`
     * operation](https://docs.aws.amazon.com/polly/latest/dg/API_SynthesizeSpeech.html#polly-SynthesizeSpeech-request-Engine)
     * in the *Amazon Polly developer guide* .
     *
     * If you do not specify a value, the default is `standard` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-voicesettings.html#cfn-lex-bot-voicesettings-engine)
     */
    public fun engine(): String? = unwrap(this).getEngine()

    /**
     * The identifier of the Amazon Polly voice to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-voicesettings.html#cfn-lex-bot-voicesettings-voiceid)
     */
    public fun voiceId(): String

    /**
     * A builder for [VoiceSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param engine Indicates the type of Amazon Polly voice that Amazon Lex should use for voice
       * interaction with the user.
       * For more information, see the [`engine` parameter of the `SynthesizeSpeech`
       * operation](https://docs.aws.amazon.com/polly/latest/dg/API_SynthesizeSpeech.html#polly-SynthesizeSpeech-request-Engine)
       * in the *Amazon Polly developer guide* .
       *
       * If you do not specify a value, the default is `standard` .
       */
      public fun engine(engine: String)

      /**
       * @param voiceId The identifier of the Amazon Polly voice to use. 
       */
      public fun voiceId(voiceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.VoiceSettingsProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.VoiceSettingsProperty.builder()

      /**
       * @param engine Indicates the type of Amazon Polly voice that Amazon Lex should use for voice
       * interaction with the user.
       * For more information, see the [`engine` parameter of the `SynthesizeSpeech`
       * operation](https://docs.aws.amazon.com/polly/latest/dg/API_SynthesizeSpeech.html#polly-SynthesizeSpeech-request-Engine)
       * in the *Amazon Polly developer guide* .
       *
       * If you do not specify a value, the default is `standard` .
       */
      override fun engine(engine: String) {
        cdkBuilder.engine(engine)
      }

      /**
       * @param voiceId The identifier of the Amazon Polly voice to use. 
       */
      override fun voiceId(voiceId: String) {
        cdkBuilder.voiceId(voiceId)
      }

      public fun build(): software.amazon.awscdk.services.lex.CfnBot.VoiceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.VoiceSettingsProperty,
    ) : CdkObject(cdkObject),
        VoiceSettingsProperty {
      /**
       * Indicates the type of Amazon Polly voice that Amazon Lex should use for voice interaction
       * with the user.
       *
       * For more information, see the [`engine` parameter of the `SynthesizeSpeech`
       * operation](https://docs.aws.amazon.com/polly/latest/dg/API_SynthesizeSpeech.html#polly-SynthesizeSpeech-request-Engine)
       * in the *Amazon Polly developer guide* .
       *
       * If you do not specify a value, the default is `standard` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-voicesettings.html#cfn-lex-bot-voicesettings-engine)
       */
      override fun engine(): String? = unwrap(this).getEngine()

      /**
       * The identifier of the Amazon Polly voice to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-voicesettings.html#cfn-lex-bot-voicesettings-voiceid)
       */
      override fun voiceId(): String = unwrap(this).getVoiceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VoiceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.VoiceSettingsProperty):
          VoiceSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? VoiceSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VoiceSettingsProperty):
          software.amazon.awscdk.services.lex.CfnBot.VoiceSettingsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBot.VoiceSettingsProperty
    }
  }

  /**
   * Specifies the prompts that Amazon Lex uses while a bot is waiting for customer input.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface WaitAndContinueSpecificationProperty {
    /**
     * The response that Amazon Lex sends to indicate that the bot is ready to continue the
     * conversation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-waitandcontinuespecification.html#cfn-lex-bot-waitandcontinuespecification-continueresponse)
     */
    public fun continueResponse(): Any

    /**
     * Specifies whether the bot will wait for a user to respond.
     *
     * When this field is false, wait and continue responses for a slot aren't used. If the
     * `IsActive` field isn't specified, the default is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-waitandcontinuespecification.html#cfn-lex-bot-waitandcontinuespecification-isactive)
     */
    public fun isActive(): Any? = unwrap(this).getIsActive()

    /**
     * A response that Amazon Lex sends periodically to the user to indicate that the bot is still
     * waiting for input from the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-waitandcontinuespecification.html#cfn-lex-bot-waitandcontinuespecification-stillwaitingresponse)
     */
    public fun stillWaitingResponse(): Any? = unwrap(this).getStillWaitingResponse()

    /**
     * The response that Amazon Lex sends to indicate that the bot is waiting for the conversation
     * to continue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-waitandcontinuespecification.html#cfn-lex-bot-waitandcontinuespecification-waitingresponse)
     */
    public fun waitingResponse(): Any

    /**
     * A builder for [WaitAndContinueSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param continueResponse The response that Amazon Lex sends to indicate that the bot is
       * ready to continue the conversation. 
       */
      public fun continueResponse(continueResponse: IResolvable)

      /**
       * @param continueResponse The response that Amazon Lex sends to indicate that the bot is
       * ready to continue the conversation. 
       */
      public fun continueResponse(continueResponse: ResponseSpecificationProperty)

      /**
       * @param continueResponse The response that Amazon Lex sends to indicate that the bot is
       * ready to continue the conversation. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5889c5819b57f84259e233c3acfa19ce049fe8aec310ccf64e2c4a64c23895b")
      public
          fun continueResponse(continueResponse: ResponseSpecificationProperty.Builder.() -> Unit)

      /**
       * @param isActive Specifies whether the bot will wait for a user to respond.
       * When this field is false, wait and continue responses for a slot aren't used. If the
       * `IsActive` field isn't specified, the default is true.
       */
      public fun isActive(isActive: Boolean)

      /**
       * @param isActive Specifies whether the bot will wait for a user to respond.
       * When this field is false, wait and continue responses for a slot aren't used. If the
       * `IsActive` field isn't specified, the default is true.
       */
      public fun isActive(isActive: IResolvable)

      /**
       * @param stillWaitingResponse A response that Amazon Lex sends periodically to the user to
       * indicate that the bot is still waiting for input from the user.
       */
      public fun stillWaitingResponse(stillWaitingResponse: IResolvable)

      /**
       * @param stillWaitingResponse A response that Amazon Lex sends periodically to the user to
       * indicate that the bot is still waiting for input from the user.
       */
      public
          fun stillWaitingResponse(stillWaitingResponse: StillWaitingResponseSpecificationProperty)

      /**
       * @param stillWaitingResponse A response that Amazon Lex sends periodically to the user to
       * indicate that the bot is still waiting for input from the user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50e76f045a54d99765858bed013f11ff7b39075f791515aca7024e1e1cb30367")
      public
          fun stillWaitingResponse(stillWaitingResponse: StillWaitingResponseSpecificationProperty.Builder.() -> Unit)

      /**
       * @param waitingResponse The response that Amazon Lex sends to indicate that the bot is
       * waiting for the conversation to continue. 
       */
      public fun waitingResponse(waitingResponse: IResolvable)

      /**
       * @param waitingResponse The response that Amazon Lex sends to indicate that the bot is
       * waiting for the conversation to continue. 
       */
      public fun waitingResponse(waitingResponse: ResponseSpecificationProperty)

      /**
       * @param waitingResponse The response that Amazon Lex sends to indicate that the bot is
       * waiting for the conversation to continue. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc7ecb8f0705c40dd467ed09530661cd0971b0a4c725df17c83354ed6611243e")
      public fun waitingResponse(waitingResponse: ResponseSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBot.WaitAndContinueSpecificationProperty.Builder =
          software.amazon.awscdk.services.lex.CfnBot.WaitAndContinueSpecificationProperty.builder()

      /**
       * @param continueResponse The response that Amazon Lex sends to indicate that the bot is
       * ready to continue the conversation. 
       */
      override fun continueResponse(continueResponse: IResolvable) {
        cdkBuilder.continueResponse(continueResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param continueResponse The response that Amazon Lex sends to indicate that the bot is
       * ready to continue the conversation. 
       */
      override fun continueResponse(continueResponse: ResponseSpecificationProperty) {
        cdkBuilder.continueResponse(continueResponse.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param continueResponse The response that Amazon Lex sends to indicate that the bot is
       * ready to continue the conversation. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5889c5819b57f84259e233c3acfa19ce049fe8aec310ccf64e2c4a64c23895b")
      override
          fun continueResponse(continueResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = continueResponse(ResponseSpecificationProperty(continueResponse))

      /**
       * @param isActive Specifies whether the bot will wait for a user to respond.
       * When this field is false, wait and continue responses for a slot aren't used. If the
       * `IsActive` field isn't specified, the default is true.
       */
      override fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
      }

      /**
       * @param isActive Specifies whether the bot will wait for a user to respond.
       * When this field is false, wait and continue responses for a slot aren't used. If the
       * `IsActive` field isn't specified, the default is true.
       */
      override fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param stillWaitingResponse A response that Amazon Lex sends periodically to the user to
       * indicate that the bot is still waiting for input from the user.
       */
      override fun stillWaitingResponse(stillWaitingResponse: IResolvable) {
        cdkBuilder.stillWaitingResponse(stillWaitingResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param stillWaitingResponse A response that Amazon Lex sends periodically to the user to
       * indicate that the bot is still waiting for input from the user.
       */
      override
          fun stillWaitingResponse(stillWaitingResponse: StillWaitingResponseSpecificationProperty) {
        cdkBuilder.stillWaitingResponse(stillWaitingResponse.let(StillWaitingResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param stillWaitingResponse A response that Amazon Lex sends periodically to the user to
       * indicate that the bot is still waiting for input from the user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50e76f045a54d99765858bed013f11ff7b39075f791515aca7024e1e1cb30367")
      override
          fun stillWaitingResponse(stillWaitingResponse: StillWaitingResponseSpecificationProperty.Builder.() -> Unit):
          Unit =
          stillWaitingResponse(StillWaitingResponseSpecificationProperty(stillWaitingResponse))

      /**
       * @param waitingResponse The response that Amazon Lex sends to indicate that the bot is
       * waiting for the conversation to continue. 
       */
      override fun waitingResponse(waitingResponse: IResolvable) {
        cdkBuilder.waitingResponse(waitingResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param waitingResponse The response that Amazon Lex sends to indicate that the bot is
       * waiting for the conversation to continue. 
       */
      override fun waitingResponse(waitingResponse: ResponseSpecificationProperty) {
        cdkBuilder.waitingResponse(waitingResponse.let(ResponseSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param waitingResponse The response that Amazon Lex sends to indicate that the bot is
       * waiting for the conversation to continue. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc7ecb8f0705c40dd467ed09530661cd0971b0a4c725df17c83354ed6611243e")
      override
          fun waitingResponse(waitingResponse: ResponseSpecificationProperty.Builder.() -> Unit):
          Unit = waitingResponse(ResponseSpecificationProperty(waitingResponse))

      public fun build():
          software.amazon.awscdk.services.lex.CfnBot.WaitAndContinueSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBot.WaitAndContinueSpecificationProperty,
    ) : CdkObject(cdkObject),
        WaitAndContinueSpecificationProperty {
      /**
       * The response that Amazon Lex sends to indicate that the bot is ready to continue the
       * conversation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-waitandcontinuespecification.html#cfn-lex-bot-waitandcontinuespecification-continueresponse)
       */
      override fun continueResponse(): Any = unwrap(this).getContinueResponse()

      /**
       * Specifies whether the bot will wait for a user to respond.
       *
       * When this field is false, wait and continue responses for a slot aren't used. If the
       * `IsActive` field isn't specified, the default is true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-waitandcontinuespecification.html#cfn-lex-bot-waitandcontinuespecification-isactive)
       */
      override fun isActive(): Any? = unwrap(this).getIsActive()

      /**
       * A response that Amazon Lex sends periodically to the user to indicate that the bot is still
       * waiting for input from the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-waitandcontinuespecification.html#cfn-lex-bot-waitandcontinuespecification-stillwaitingresponse)
       */
      override fun stillWaitingResponse(): Any? = unwrap(this).getStillWaitingResponse()

      /**
       * The response that Amazon Lex sends to indicate that the bot is waiting for the conversation
       * to continue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-waitandcontinuespecification.html#cfn-lex-bot-waitandcontinuespecification-waitingresponse)
       */
      override fun waitingResponse(): Any = unwrap(this).getWaitingResponse()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          WaitAndContinueSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBot.WaitAndContinueSpecificationProperty):
          WaitAndContinueSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WaitAndContinueSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WaitAndContinueSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBot.WaitAndContinueSpecificationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBot.WaitAndContinueSpecificationProperty
    }
  }
}
