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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Amazon Lex V2 is the only supported version in AWS CloudFormation .
 *
 * Specifies a new version of the bot based on the `DRAFT` version. If the `DRAFT` version of this
 * resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version,
 * it returns the last created version.
 *
 * When you specify the first version of a bot, Amazon Lex sets the version to 1. Subsequent
 * versions increment by 1.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lex.*;
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
public open class CfnBotVersion(
  cdkObject: software.amazon.awscdk.services.lex.CfnBotVersion,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBotVersionProps,
  ) :
      this(software.amazon.awscdk.services.lex.CfnBotVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnBotVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBotVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnBotVersionProps(props)
  )

  /**
   * The version of the bot.
   */
  public open fun attrBotVersion(): String = unwrap(this).getAttrBotVersion()

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
   * Specifies the locales that Amazon Lex adds to this version.
   */
  public open fun botVersionLocaleSpecification(): Any =
      unwrap(this).getBotVersionLocaleSpecification()

  /**
   * Specifies the locales that Amazon Lex adds to this version.
   */
  public open fun botVersionLocaleSpecification(`value`: IResolvable) {
    unwrap(this).setBotVersionLocaleSpecification(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the locales that Amazon Lex adds to this version.
   */
  public open fun botVersionLocaleSpecification(`value`: List<Any>) {
    unwrap(this).setBotVersionLocaleSpecification(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Specifies the locales that Amazon Lex adds to this version.
   */
  public open fun botVersionLocaleSpecification(vararg `value`: Any): Unit =
      botVersionLocaleSpecification(`value`.toList())

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
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lex.CfnBotVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier of the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botid)
     * @param botId The unique identifier of the bot. 
     */
    public fun botId(botId: String)

    /**
     * Specifies the locales that Amazon Lex adds to this version.
     *
     * You can choose the Draft version or any other previously published version for each locale.
     * When you specify a source version, the locale data is copied from the source version to the new
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botversionlocalespecification)
     * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
     * version. 
     */
    public fun botVersionLocaleSpecification(botVersionLocaleSpecification: IResolvable)

    /**
     * Specifies the locales that Amazon Lex adds to this version.
     *
     * You can choose the Draft version or any other previously published version for each locale.
     * When you specify a source version, the locale data is copied from the source version to the new
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botversionlocalespecification)
     * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
     * version. 
     */
    public fun botVersionLocaleSpecification(botVersionLocaleSpecification: List<Any>)

    /**
     * Specifies the locales that Amazon Lex adds to this version.
     *
     * You can choose the Draft version or any other previously published version for each locale.
     * When you specify a source version, the locale data is copied from the source version to the new
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botversionlocalespecification)
     * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
     * version. 
     */
    public fun botVersionLocaleSpecification(vararg botVersionLocaleSpecification: Any)

    /**
     * The description of the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-description)
     * @param description The description of the version. 
     */
    public fun description(description: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBotVersion.Builder =
        software.amazon.awscdk.services.lex.CfnBotVersion.Builder.create(scope, id)

    /**
     * The unique identifier of the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botid)
     * @param botId The unique identifier of the bot. 
     */
    override fun botId(botId: String) {
      cdkBuilder.botId(botId)
    }

    /**
     * Specifies the locales that Amazon Lex adds to this version.
     *
     * You can choose the Draft version or any other previously published version for each locale.
     * When you specify a source version, the locale data is copied from the source version to the new
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botversionlocalespecification)
     * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
     * version. 
     */
    override fun botVersionLocaleSpecification(botVersionLocaleSpecification: IResolvable) {
      cdkBuilder.botVersionLocaleSpecification(botVersionLocaleSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the locales that Amazon Lex adds to this version.
     *
     * You can choose the Draft version or any other previously published version for each locale.
     * When you specify a source version, the locale data is copied from the source version to the new
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botversionlocalespecification)
     * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
     * version. 
     */
    override fun botVersionLocaleSpecification(botVersionLocaleSpecification: List<Any>) {
      cdkBuilder.botVersionLocaleSpecification(botVersionLocaleSpecification.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Specifies the locales that Amazon Lex adds to this version.
     *
     * You can choose the Draft version or any other previously published version for each locale.
     * When you specify a source version, the locale data is copied from the source version to the new
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botversionlocalespecification)
     * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
     * version. 
     */
    override fun botVersionLocaleSpecification(vararg botVersionLocaleSpecification: Any): Unit =
        botVersionLocaleSpecification(botVersionLocaleSpecification.toList())

    /**
     * The description of the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-description)
     * @param description The description of the version. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.lex.CfnBotVersion = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lex.CfnBotVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBotVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBotVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotVersion): CfnBotVersion =
        CfnBotVersion(cdkObject)

    internal fun unwrap(wrapped: CfnBotVersion): software.amazon.awscdk.services.lex.CfnBotVersion =
        wrapped.cdkObject as software.amazon.awscdk.services.lex.CfnBotVersion
  }

  /**
   * The version of a bot used for a bot locale.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
   * BotVersionLocaleDetailsProperty botVersionLocaleDetailsProperty =
   * BotVersionLocaleDetailsProperty.builder()
   * .sourceBotVersion("sourceBotVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botversion-botversionlocaledetails.html)
   */
  public interface BotVersionLocaleDetailsProperty {
    /**
     * The version of a bot used for a bot locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botversion-botversionlocaledetails.html#cfn-lex-botversion-botversionlocaledetails-sourcebotversion)
     */
    public fun sourceBotVersion(): String

    /**
     * A builder for [BotVersionLocaleDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceBotVersion The version of a bot used for a bot locale. 
       */
      public fun sourceBotVersion(sourceBotVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleDetailsProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleDetailsProperty.builder()

      /**
       * @param sourceBotVersion The version of a bot used for a bot locale. 
       */
      override fun sourceBotVersion(sourceBotVersion: String) {
        cdkBuilder.sourceBotVersion(sourceBotVersion)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleDetailsProperty,
    ) : CdkObject(cdkObject),
        BotVersionLocaleDetailsProperty {
      /**
       * The version of a bot used for a bot locale.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botversion-botversionlocaledetails.html#cfn-lex-botversion-botversionlocaledetails-sourcebotversion)
       */
      override fun sourceBotVersion(): String = unwrap(this).getSourceBotVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BotVersionLocaleDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleDetailsProperty):
          BotVersionLocaleDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BotVersionLocaleDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BotVersionLocaleDetailsProperty):
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleDetailsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleDetailsProperty
    }
  }

  /**
   * Specifies the locale that Amazon Lex adds to this version.
   *
   * You can choose the Draft version or any other previously published version for each locale.
   * When you specify a source version, the locale data is copied from the source version to the new
   * version.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lex.*;
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
  public interface BotVersionLocaleSpecificationProperty {
    /**
     * The version of a bot used for a bot locale.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botversion-botversionlocalespecification.html#cfn-lex-botversion-botversionlocalespecification-botversionlocaledetails)
     */
    public fun botVersionLocaleDetails(): Any

    /**
     * The identifier of the locale to add to the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botversion-botversionlocalespecification.html#cfn-lex-botversion-botversionlocalespecification-localeid)
     */
    public fun localeId(): String

    /**
     * A builder for [BotVersionLocaleSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param botVersionLocaleDetails The version of a bot used for a bot locale. 
       */
      public fun botVersionLocaleDetails(botVersionLocaleDetails: IResolvable)

      /**
       * @param botVersionLocaleDetails The version of a bot used for a bot locale. 
       */
      public fun botVersionLocaleDetails(botVersionLocaleDetails: BotVersionLocaleDetailsProperty)

      /**
       * @param botVersionLocaleDetails The version of a bot used for a bot locale. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86d58c78ffe488c4ee3550cb7a85c66edcf765197baeb36ebbc9f8ac86dfee63")
      public
          fun botVersionLocaleDetails(botVersionLocaleDetails: BotVersionLocaleDetailsProperty.Builder.() -> Unit)

      /**
       * @param localeId The identifier of the locale to add to the version. 
       */
      public fun localeId(localeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleSpecificationProperty.builder()

      /**
       * @param botVersionLocaleDetails The version of a bot used for a bot locale. 
       */
      override fun botVersionLocaleDetails(botVersionLocaleDetails: IResolvable) {
        cdkBuilder.botVersionLocaleDetails(botVersionLocaleDetails.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param botVersionLocaleDetails The version of a bot used for a bot locale. 
       */
      override
          fun botVersionLocaleDetails(botVersionLocaleDetails: BotVersionLocaleDetailsProperty) {
        cdkBuilder.botVersionLocaleDetails(botVersionLocaleDetails.let(BotVersionLocaleDetailsProperty.Companion::unwrap))
      }

      /**
       * @param botVersionLocaleDetails The version of a bot used for a bot locale. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86d58c78ffe488c4ee3550cb7a85c66edcf765197baeb36ebbc9f8ac86dfee63")
      override
          fun botVersionLocaleDetails(botVersionLocaleDetails: BotVersionLocaleDetailsProperty.Builder.() -> Unit):
          Unit = botVersionLocaleDetails(BotVersionLocaleDetailsProperty(botVersionLocaleDetails))

      /**
       * @param localeId The identifier of the locale to add to the version. 
       */
      override fun localeId(localeId: String) {
        cdkBuilder.localeId(localeId)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleSpecificationProperty,
    ) : CdkObject(cdkObject),
        BotVersionLocaleSpecificationProperty {
      /**
       * The version of a bot used for a bot locale.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botversion-botversionlocalespecification.html#cfn-lex-botversion-botversionlocalespecification-botversionlocaledetails)
       */
      override fun botVersionLocaleDetails(): Any = unwrap(this).getBotVersionLocaleDetails()

      /**
       * The identifier of the locale to add to the version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botversion-botversionlocalespecification.html#cfn-lex-botversion-botversionlocalespecification-localeid)
       */
      override fun localeId(): String = unwrap(this).getLocaleId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BotVersionLocaleSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleSpecificationProperty):
          BotVersionLocaleSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BotVersionLocaleSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BotVersionLocaleSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleSpecificationProperty
    }
  }
}
