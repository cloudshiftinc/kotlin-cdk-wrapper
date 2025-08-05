@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The data protection settings resource that can be associated with a web portal.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
 * CfnDataProtectionSettings cfnDataProtectionSettings =
 * CfnDataProtectionSettings.Builder.create(this, "MyCfnDataProtectionSettings")
 * .additionalEncryptionContext(Map.of(
 * "additionalEncryptionContextKey", "additionalEncryptionContext"))
 * .customerManagedKey("customerManagedKey")
 * .description("description")
 * .displayName("displayName")
 * .inlineRedactionConfiguration(InlineRedactionConfigurationProperty.builder()
 * .inlineRedactionPatterns(List.of(InlineRedactionPatternProperty.builder()
 * .redactionPlaceHolder(RedactionPlaceHolderProperty.builder()
 * .redactionPlaceHolderType("redactionPlaceHolderType")
 * // the properties below are optional
 * .redactionPlaceHolderText("redactionPlaceHolderText")
 * .build())
 * // the properties below are optional
 * .builtInPatternId("builtInPatternId")
 * .confidenceLevel(123)
 * .customPattern(CustomPatternProperty.builder()
 * .patternName("patternName")
 * .patternRegex("patternRegex")
 * // the properties below are optional
 * .keywordRegex("keywordRegex")
 * .patternDescription("patternDescription")
 * .build())
 * .enforcedUrls(List.of("enforcedUrls"))
 * .exemptUrls(List.of("exemptUrls"))
 * .build()))
 * // the properties below are optional
 * .globalConfidenceLevel(123)
 * .globalEnforcedUrls(List.of("globalEnforcedUrls"))
 * .globalExemptUrls(List.of("globalExemptUrls"))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html)
 */
public open class CfnDataProtectionSettings(
  cdkObject: software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataProtectionSettingsProps,
  ) :
      this(software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDataProtectionSettingsProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataProtectionSettingsProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDataProtectionSettingsProps(props)
  )

  /**
   * The additional encryption context of the data protection settings.
   */
  public open fun additionalEncryptionContext(): Any? =
      unwrap(this).getAdditionalEncryptionContext()

  /**
   * The additional encryption context of the data protection settings.
   */
  public open fun additionalEncryptionContext(`value`: Map<String, String>) {
    unwrap(this).setAdditionalEncryptionContext(`value`)
  }

  /**
   * The additional encryption context of the data protection settings.
   */
  public open fun additionalEncryptionContext(`value`: IResolvable) {
    unwrap(this).setAdditionalEncryptionContext(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of web portal ARNs that this data protection settings resource is associated with.
   */
  public open fun attrAssociatedPortalArns(): List<String> =
      unwrap(this).getAttrAssociatedPortalArns()

  /**
   * The creation date timestamp of the data protection settings.
   */
  public open fun attrCreationDate(): String = unwrap(this).getAttrCreationDate()

  /**
   * The ARN of the data protection settings resource.
   */
  public open fun attrDataProtectionSettingsArn(): String =
      unwrap(this).getAttrDataProtectionSettingsArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The customer managed key used to encrypt sensitive information in the data protection settings.
   */
  public open fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  /**
   * The customer managed key used to encrypt sensitive information in the data protection settings.
   */
  public open fun customerManagedKey(`value`: String) {
    unwrap(this).setCustomerManagedKey(`value`)
  }

  /**
   * The description of the data protection settings.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the data protection settings.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The display name of the data protection settings.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The display name of the data protection settings.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The inline redaction configuration for the data protection settings.
   */
  public open fun inlineRedactionConfiguration(): Any? =
      unwrap(this).getInlineRedactionConfiguration()

  /**
   * The inline redaction configuration for the data protection settings.
   */
  public open fun inlineRedactionConfiguration(`value`: IResolvable) {
    unwrap(this).setInlineRedactionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The inline redaction configuration for the data protection settings.
   */
  public open fun inlineRedactionConfiguration(`value`: InlineRedactionConfigurationProperty) {
    unwrap(this).setInlineRedactionConfiguration(`value`.let(InlineRedactionConfigurationProperty.Companion::unwrap))
  }

  /**
   * The inline redaction configuration for the data protection settings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7c759ea6f56aa5811eb6b1020160e9ef01d69cf2b9394010dfb80c7fe89a658")
  public open
      fun inlineRedactionConfiguration(`value`: InlineRedactionConfigurationProperty.Builder.() -> Unit):
      Unit = inlineRedactionConfiguration(InlineRedactionConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The tags of the data protection settings.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags of the data protection settings.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags of the data protection settings.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.workspacesweb.CfnDataProtectionSettings].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The additional encryption context of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-additionalencryptioncontext)
     * @param additionalEncryptionContext The additional encryption context of the data protection
     * settings. 
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    /**
     * The additional encryption context of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-additionalencryptioncontext)
     * @param additionalEncryptionContext The additional encryption context of the data protection
     * settings. 
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    /**
     * The customer managed key used to encrypt sensitive information in the data protection
     * settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-customermanagedkey)
     * @param customerManagedKey The customer managed key used to encrypt sensitive information in
     * the data protection settings. 
     */
    public fun customerManagedKey(customerManagedKey: String)

    /**
     * The description of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-description)
     * @param description The description of the data protection settings. 
     */
    public fun description(description: String)

    /**
     * The display name of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-displayname)
     * @param displayName The display name of the data protection settings. 
     */
    public fun displayName(displayName: String)

    /**
     * The inline redaction configuration for the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration)
     * @param inlineRedactionConfiguration The inline redaction configuration for the data
     * protection settings. 
     */
    public fun inlineRedactionConfiguration(inlineRedactionConfiguration: IResolvable)

    /**
     * The inline redaction configuration for the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration)
     * @param inlineRedactionConfiguration The inline redaction configuration for the data
     * protection settings. 
     */
    public
        fun inlineRedactionConfiguration(inlineRedactionConfiguration: InlineRedactionConfigurationProperty)

    /**
     * The inline redaction configuration for the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration)
     * @param inlineRedactionConfiguration The inline redaction configuration for the data
     * protection settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b888edbcba3349846f57670c7cf314366a1081b5397885e6afcd957f91f90984")
    public
        fun inlineRedactionConfiguration(inlineRedactionConfiguration: InlineRedactionConfigurationProperty.Builder.() -> Unit)

    /**
     * The tags of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-tags)
     * @param tags The tags of the data protection settings. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-tags)
     * @param tags The tags of the data protection settings. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.Builder.create(scope,
        id)

    /**
     * The additional encryption context of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-additionalencryptioncontext)
     * @param additionalEncryptionContext The additional encryption context of the data protection
     * settings. 
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * The additional encryption context of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-additionalencryptioncontext)
     * @param additionalEncryptionContext The additional encryption context of the data protection
     * settings. 
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable.Companion::unwrap))
    }

    /**
     * The customer managed key used to encrypt sensitive information in the data protection
     * settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-customermanagedkey)
     * @param customerManagedKey The customer managed key used to encrypt sensitive information in
     * the data protection settings. 
     */
    override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /**
     * The description of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-description)
     * @param description The description of the data protection settings. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The display name of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-displayname)
     * @param displayName The display name of the data protection settings. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The inline redaction configuration for the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration)
     * @param inlineRedactionConfiguration The inline redaction configuration for the data
     * protection settings. 
     */
    override fun inlineRedactionConfiguration(inlineRedactionConfiguration: IResolvable) {
      cdkBuilder.inlineRedactionConfiguration(inlineRedactionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The inline redaction configuration for the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration)
     * @param inlineRedactionConfiguration The inline redaction configuration for the data
     * protection settings. 
     */
    override
        fun inlineRedactionConfiguration(inlineRedactionConfiguration: InlineRedactionConfigurationProperty) {
      cdkBuilder.inlineRedactionConfiguration(inlineRedactionConfiguration.let(InlineRedactionConfigurationProperty.Companion::unwrap))
    }

    /**
     * The inline redaction configuration for the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration)
     * @param inlineRedactionConfiguration The inline redaction configuration for the data
     * protection settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b888edbcba3349846f57670c7cf314366a1081b5397885e6afcd957f91f90984")
    override
        fun inlineRedactionConfiguration(inlineRedactionConfiguration: InlineRedactionConfigurationProperty.Builder.() -> Unit):
        Unit =
        inlineRedactionConfiguration(InlineRedactionConfigurationProperty(inlineRedactionConfiguration))

    /**
     * The tags of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-tags)
     * @param tags The tags of the data protection settings. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-dataprotectionsettings.html#cfn-workspacesweb-dataprotectionsettings-tags)
     * @param tags The tags of the data protection settings. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataProtectionSettings {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataProtectionSettings(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings):
        CfnDataProtectionSettings = CfnDataProtectionSettings(cdkObject)

    internal fun unwrap(wrapped: CfnDataProtectionSettings):
        software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings = wrapped.cdkObject
        as software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings
  }

  /**
   * The pattern configuration for redacting custom data types in session.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
   * CustomPatternProperty customPatternProperty = CustomPatternProperty.builder()
   * .patternName("patternName")
   * .patternRegex("patternRegex")
   * // the properties below are optional
   * .keywordRegex("keywordRegex")
   * .patternDescription("patternDescription")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-custompattern.html)
   */
  public interface CustomPatternProperty {
    /**
     * The keyword regex for the customer pattern.
     *
     * After there is a match to the pattern regex, the keyword regex is used to search within the
     * proximity of the match. If there is a keyword match, then the match is confirmed. If no keyword
     * regex is provided, the pattern regex match will automatically be confirmed. The format must
     * follow JavaScript regex format. The pattern must be enclosed between slashes, and can have flags
     * behind the second slash. For example, “/ab+c/gi”
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-custompattern.html#cfn-workspacesweb-dataprotectionsettings-custompattern-keywordregex)
     */
    public fun keywordRegex(): String? = unwrap(this).getKeywordRegex()

    /**
     * The pattern description for the customer pattern.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-custompattern.html#cfn-workspacesweb-dataprotectionsettings-custompattern-patterndescription)
     */
    public fun patternDescription(): String? = unwrap(this).getPatternDescription()

    /**
     * The pattern name for the custom pattern.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-custompattern.html#cfn-workspacesweb-dataprotectionsettings-custompattern-patternname)
     */
    public fun patternName(): String

    /**
     * The pattern regex for the customer pattern.
     *
     * The format must follow JavaScript regex format. The pattern must be enclosed between slashes,
     * and can have flags behind the second slash. For example: “/ab+c/gi”.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-custompattern.html#cfn-workspacesweb-dataprotectionsettings-custompattern-patternregex)
     */
    public fun patternRegex(): String

    /**
     * A builder for [CustomPatternProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keywordRegex The keyword regex for the customer pattern.
       * After there is a match to the pattern regex, the keyword regex is used to search within the
       * proximity of the match. If there is a keyword match, then the match is confirmed. If no
       * keyword regex is provided, the pattern regex match will automatically be confirmed. The format
       * must follow JavaScript regex format. The pattern must be enclosed between slashes, and can
       * have flags behind the second slash. For example, “/ab+c/gi”
       */
      public fun keywordRegex(keywordRegex: String)

      /**
       * @param patternDescription The pattern description for the customer pattern.
       */
      public fun patternDescription(patternDescription: String)

      /**
       * @param patternName The pattern name for the custom pattern. 
       */
      public fun patternName(patternName: String)

      /**
       * @param patternRegex The pattern regex for the customer pattern. 
       * The format must follow JavaScript regex format. The pattern must be enclosed between
       * slashes, and can have flags behind the second slash. For example: “/ab+c/gi”.
       */
      public fun patternRegex(patternRegex: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.CustomPatternProperty.Builder
          =
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.CustomPatternProperty.builder()

      /**
       * @param keywordRegex The keyword regex for the customer pattern.
       * After there is a match to the pattern regex, the keyword regex is used to search within the
       * proximity of the match. If there is a keyword match, then the match is confirmed. If no
       * keyword regex is provided, the pattern regex match will automatically be confirmed. The format
       * must follow JavaScript regex format. The pattern must be enclosed between slashes, and can
       * have flags behind the second slash. For example, “/ab+c/gi”
       */
      override fun keywordRegex(keywordRegex: String) {
        cdkBuilder.keywordRegex(keywordRegex)
      }

      /**
       * @param patternDescription The pattern description for the customer pattern.
       */
      override fun patternDescription(patternDescription: String) {
        cdkBuilder.patternDescription(patternDescription)
      }

      /**
       * @param patternName The pattern name for the custom pattern. 
       */
      override fun patternName(patternName: String) {
        cdkBuilder.patternName(patternName)
      }

      /**
       * @param patternRegex The pattern regex for the customer pattern. 
       * The format must follow JavaScript regex format. The pattern must be enclosed between
       * slashes, and can have flags behind the second slash. For example: “/ab+c/gi”.
       */
      override fun patternRegex(patternRegex: String) {
        cdkBuilder.patternRegex(patternRegex)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.CustomPatternProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.CustomPatternProperty,
    ) : CdkObject(cdkObject),
        CustomPatternProperty {
      /**
       * The keyword regex for the customer pattern.
       *
       * After there is a match to the pattern regex, the keyword regex is used to search within the
       * proximity of the match. If there is a keyword match, then the match is confirmed. If no
       * keyword regex is provided, the pattern regex match will automatically be confirmed. The format
       * must follow JavaScript regex format. The pattern must be enclosed between slashes, and can
       * have flags behind the second slash. For example, “/ab+c/gi”
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-custompattern.html#cfn-workspacesweb-dataprotectionsettings-custompattern-keywordregex)
       */
      override fun keywordRegex(): String? = unwrap(this).getKeywordRegex()

      /**
       * The pattern description for the customer pattern.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-custompattern.html#cfn-workspacesweb-dataprotectionsettings-custompattern-patterndescription)
       */
      override fun patternDescription(): String? = unwrap(this).getPatternDescription()

      /**
       * The pattern name for the custom pattern.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-custompattern.html#cfn-workspacesweb-dataprotectionsettings-custompattern-patternname)
       */
      override fun patternName(): String = unwrap(this).getPatternName()

      /**
       * The pattern regex for the customer pattern.
       *
       * The format must follow JavaScript regex format. The pattern must be enclosed between
       * slashes, and can have flags behind the second slash. For example: “/ab+c/gi”.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-custompattern.html#cfn-workspacesweb-dataprotectionsettings-custompattern-patternregex)
       */
      override fun patternRegex(): String = unwrap(this).getPatternRegex()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.CustomPatternProperty):
          CustomPatternProperty = CdkObjectWrappers.wrap(cdkObject) as? CustomPatternProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomPatternProperty):
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.CustomPatternProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.CustomPatternProperty
    }
  }

  /**
   * The configuration for in-session inline redaction.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
   * InlineRedactionConfigurationProperty inlineRedactionConfigurationProperty =
   * InlineRedactionConfigurationProperty.builder()
   * .inlineRedactionPatterns(List.of(InlineRedactionPatternProperty.builder()
   * .redactionPlaceHolder(RedactionPlaceHolderProperty.builder()
   * .redactionPlaceHolderType("redactionPlaceHolderType")
   * // the properties below are optional
   * .redactionPlaceHolderText("redactionPlaceHolderText")
   * .build())
   * // the properties below are optional
   * .builtInPatternId("builtInPatternId")
   * .confidenceLevel(123)
   * .customPattern(CustomPatternProperty.builder()
   * .patternName("patternName")
   * .patternRegex("patternRegex")
   * // the properties below are optional
   * .keywordRegex("keywordRegex")
   * .patternDescription("patternDescription")
   * .build())
   * .enforcedUrls(List.of("enforcedUrls"))
   * .exemptUrls(List.of("exemptUrls"))
   * .build()))
   * // the properties below are optional
   * .globalConfidenceLevel(123)
   * .globalEnforcedUrls(List.of("globalEnforcedUrls"))
   * .globalExemptUrls(List.of("globalExemptUrls"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionconfiguration.html)
   */
  public interface InlineRedactionConfigurationProperty {
    /**
     * The global confidence level for the inline redaction configuration.
     *
     * This indicates the certainty of data type matches in the redaction process. Confidence level
     * 3 means high confidence, and requires a formatted text pattern match in order for content to be
     * redacted. Confidence level 2 means medium confidence, and redaction considers both formatted and
     * unformatted text, and adds keyword associate to the logic. Confidence level 1 means low
     * confidence, and redaction is enforced for both formatted pattern + unformatted pattern without
     * keyword. This is applied to patterns that do not have a pattern-level confidence level. Defaults
     * to confidence level 2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionconfiguration.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration-globalconfidencelevel)
     */
    public fun globalConfidenceLevel(): Number? = unwrap(this).getGlobalConfidenceLevel()

    /**
     * The global enforced URL configuration for the inline redaction configuration.
     *
     * This is applied to patterns that do not have a pattern-level enforced URL list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionconfiguration.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration-globalenforcedurls)
     */
    public fun globalEnforcedUrls(): List<String> = unwrap(this).getGlobalEnforcedUrls() ?:
        emptyList()

    /**
     * The global exempt URL configuration for the inline redaction configuration.
     *
     * This is applied to patterns that do not have a pattern-level exempt URL list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionconfiguration.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration-globalexempturls)
     */
    public fun globalExemptUrls(): List<String> = unwrap(this).getGlobalExemptUrls() ?: emptyList()

    /**
     * The inline redaction patterns to be enabled for the inline redaction configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionconfiguration.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration-inlineredactionpatterns)
     */
    public fun inlineRedactionPatterns(): Any

    /**
     * A builder for [InlineRedactionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param globalConfidenceLevel The global confidence level for the inline redaction
       * configuration.
       * This indicates the certainty of data type matches in the redaction process. Confidence
       * level 3 means high confidence, and requires a formatted text pattern match in order for
       * content to be redacted. Confidence level 2 means medium confidence, and redaction considers
       * both formatted and unformatted text, and adds keyword associate to the logic. Confidence level
       * 1 means low confidence, and redaction is enforced for both formatted pattern + unformatted
       * pattern without keyword. This is applied to patterns that do not have a pattern-level
       * confidence level. Defaults to confidence level 2.
       */
      public fun globalConfidenceLevel(globalConfidenceLevel: Number)

      /**
       * @param globalEnforcedUrls The global enforced URL configuration for the inline redaction
       * configuration.
       * This is applied to patterns that do not have a pattern-level enforced URL list.
       */
      public fun globalEnforcedUrls(globalEnforcedUrls: List<String>)

      /**
       * @param globalEnforcedUrls The global enforced URL configuration for the inline redaction
       * configuration.
       * This is applied to patterns that do not have a pattern-level enforced URL list.
       */
      public fun globalEnforcedUrls(vararg globalEnforcedUrls: String)

      /**
       * @param globalExemptUrls The global exempt URL configuration for the inline redaction
       * configuration.
       * This is applied to patterns that do not have a pattern-level exempt URL list.
       */
      public fun globalExemptUrls(globalExemptUrls: List<String>)

      /**
       * @param globalExemptUrls The global exempt URL configuration for the inline redaction
       * configuration.
       * This is applied to patterns that do not have a pattern-level exempt URL list.
       */
      public fun globalExemptUrls(vararg globalExemptUrls: String)

      /**
       * @param inlineRedactionPatterns The inline redaction patterns to be enabled for the inline
       * redaction configuration. 
       */
      public fun inlineRedactionPatterns(inlineRedactionPatterns: IResolvable)

      /**
       * @param inlineRedactionPatterns The inline redaction patterns to be enabled for the inline
       * redaction configuration. 
       */
      public fun inlineRedactionPatterns(inlineRedactionPatterns: List<Any>)

      /**
       * @param inlineRedactionPatterns The inline redaction patterns to be enabled for the inline
       * redaction configuration. 
       */
      public fun inlineRedactionPatterns(vararg inlineRedactionPatterns: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.InlineRedactionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.InlineRedactionConfigurationProperty.builder()

      /**
       * @param globalConfidenceLevel The global confidence level for the inline redaction
       * configuration.
       * This indicates the certainty of data type matches in the redaction process. Confidence
       * level 3 means high confidence, and requires a formatted text pattern match in order for
       * content to be redacted. Confidence level 2 means medium confidence, and redaction considers
       * both formatted and unformatted text, and adds keyword associate to the logic. Confidence level
       * 1 means low confidence, and redaction is enforced for both formatted pattern + unformatted
       * pattern without keyword. This is applied to patterns that do not have a pattern-level
       * confidence level. Defaults to confidence level 2.
       */
      override fun globalConfidenceLevel(globalConfidenceLevel: Number) {
        cdkBuilder.globalConfidenceLevel(globalConfidenceLevel)
      }

      /**
       * @param globalEnforcedUrls The global enforced URL configuration for the inline redaction
       * configuration.
       * This is applied to patterns that do not have a pattern-level enforced URL list.
       */
      override fun globalEnforcedUrls(globalEnforcedUrls: List<String>) {
        cdkBuilder.globalEnforcedUrls(globalEnforcedUrls)
      }

      /**
       * @param globalEnforcedUrls The global enforced URL configuration for the inline redaction
       * configuration.
       * This is applied to patterns that do not have a pattern-level enforced URL list.
       */
      override fun globalEnforcedUrls(vararg globalEnforcedUrls: String): Unit =
          globalEnforcedUrls(globalEnforcedUrls.toList())

      /**
       * @param globalExemptUrls The global exempt URL configuration for the inline redaction
       * configuration.
       * This is applied to patterns that do not have a pattern-level exempt URL list.
       */
      override fun globalExemptUrls(globalExemptUrls: List<String>) {
        cdkBuilder.globalExemptUrls(globalExemptUrls)
      }

      /**
       * @param globalExemptUrls The global exempt URL configuration for the inline redaction
       * configuration.
       * This is applied to patterns that do not have a pattern-level exempt URL list.
       */
      override fun globalExemptUrls(vararg globalExemptUrls: String): Unit =
          globalExemptUrls(globalExemptUrls.toList())

      /**
       * @param inlineRedactionPatterns The inline redaction patterns to be enabled for the inline
       * redaction configuration. 
       */
      override fun inlineRedactionPatterns(inlineRedactionPatterns: IResolvable) {
        cdkBuilder.inlineRedactionPatterns(inlineRedactionPatterns.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inlineRedactionPatterns The inline redaction patterns to be enabled for the inline
       * redaction configuration. 
       */
      override fun inlineRedactionPatterns(inlineRedactionPatterns: List<Any>) {
        cdkBuilder.inlineRedactionPatterns(inlineRedactionPatterns.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param inlineRedactionPatterns The inline redaction patterns to be enabled for the inline
       * redaction configuration. 
       */
      override fun inlineRedactionPatterns(vararg inlineRedactionPatterns: Any): Unit =
          inlineRedactionPatterns(inlineRedactionPatterns.toList())

      public fun build():
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.InlineRedactionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.InlineRedactionConfigurationProperty,
    ) : CdkObject(cdkObject),
        InlineRedactionConfigurationProperty {
      /**
       * The global confidence level for the inline redaction configuration.
       *
       * This indicates the certainty of data type matches in the redaction process. Confidence
       * level 3 means high confidence, and requires a formatted text pattern match in order for
       * content to be redacted. Confidence level 2 means medium confidence, and redaction considers
       * both formatted and unformatted text, and adds keyword associate to the logic. Confidence level
       * 1 means low confidence, and redaction is enforced for both formatted pattern + unformatted
       * pattern without keyword. This is applied to patterns that do not have a pattern-level
       * confidence level. Defaults to confidence level 2.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionconfiguration.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration-globalconfidencelevel)
       */
      override fun globalConfidenceLevel(): Number? = unwrap(this).getGlobalConfidenceLevel()

      /**
       * The global enforced URL configuration for the inline redaction configuration.
       *
       * This is applied to patterns that do not have a pattern-level enforced URL list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionconfiguration.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration-globalenforcedurls)
       */
      override fun globalEnforcedUrls(): List<String> = unwrap(this).getGlobalEnforcedUrls() ?:
          emptyList()

      /**
       * The global exempt URL configuration for the inline redaction configuration.
       *
       * This is applied to patterns that do not have a pattern-level exempt URL list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionconfiguration.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration-globalexempturls)
       */
      override fun globalExemptUrls(): List<String> = unwrap(this).getGlobalExemptUrls() ?:
          emptyList()

      /**
       * The inline redaction patterns to be enabled for the inline redaction configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionconfiguration.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionconfiguration-inlineredactionpatterns)
       */
      override fun inlineRedactionPatterns(): Any = unwrap(this).getInlineRedactionPatterns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InlineRedactionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.InlineRedactionConfigurationProperty):
          InlineRedactionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InlineRedactionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InlineRedactionConfigurationProperty):
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.InlineRedactionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.InlineRedactionConfigurationProperty
    }
  }

  /**
   * The set of patterns that determine the data types redacted in session.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
   * InlineRedactionPatternProperty inlineRedactionPatternProperty =
   * InlineRedactionPatternProperty.builder()
   * .redactionPlaceHolder(RedactionPlaceHolderProperty.builder()
   * .redactionPlaceHolderType("redactionPlaceHolderType")
   * // the properties below are optional
   * .redactionPlaceHolderText("redactionPlaceHolderText")
   * .build())
   * // the properties below are optional
   * .builtInPatternId("builtInPatternId")
   * .confidenceLevel(123)
   * .customPattern(CustomPatternProperty.builder()
   * .patternName("patternName")
   * .patternRegex("patternRegex")
   * // the properties below are optional
   * .keywordRegex("keywordRegex")
   * .patternDescription("patternDescription")
   * .build())
   * .enforcedUrls(List.of("enforcedUrls"))
   * .exemptUrls(List.of("exemptUrls"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionpattern.html)
   */
  public interface InlineRedactionPatternProperty {
    /**
     * The built-in pattern from the list of preconfigured patterns.
     *
     * Either a customPattern or builtInPatternId is required. To view the entire list of data types
     * and their corresponding built-in pattern IDs, see [Base inline
     * redaction](https://docs.aws.amazon.com/workspaces-web/latest/adminguide/base-inline-redaction.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionpattern.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionpattern-builtinpatternid)
     */
    public fun builtInPatternId(): String? = unwrap(this).getBuiltInPatternId()

    /**
     * The confidence level for inline redaction pattern.
     *
     * This indicates the certainty of data type matches in the redaction process. Confidence level
     * 3 means high confidence, and requires a formatted text pattern match in order for content to be
     * redacted. Confidence level 2 means medium confidence, and redaction considers both formatted and
     * unformatted text, and adds keyword associate to the logic. Confidence level 1 means low
     * confidence, and redaction is enforced for both formatted pattern + unformatted pattern without
     * keyword. This overrides the global confidence level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionpattern.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionpattern-confidencelevel)
     */
    public fun confidenceLevel(): Number? = unwrap(this).getConfidenceLevel()

    /**
     * The configuration for a custom pattern.
     *
     * Either a customPattern or builtInPatternId is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionpattern.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionpattern-custompattern)
     */
    public fun customPattern(): Any? = unwrap(this).getCustomPattern()

    /**
     * The enforced URL configuration for the inline redaction pattern.
     *
     * This will override the global enforced URL configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionpattern.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionpattern-enforcedurls)
     */
    public fun enforcedUrls(): List<String> = unwrap(this).getEnforcedUrls() ?: emptyList()

    /**
     * The exempt URL configuration for the inline redaction pattern.
     *
     * This will override the global exempt URL configuration for the inline redaction pattern.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionpattern.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionpattern-exempturls)
     */
    public fun exemptUrls(): List<String> = unwrap(this).getExemptUrls() ?: emptyList()

    /**
     * The redaction placeholder that will replace the redacted text in session for the inline
     * redaction pattern.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionpattern.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionpattern-redactionplaceholder)
     */
    public fun redactionPlaceHolder(): Any

    /**
     * A builder for [InlineRedactionPatternProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param builtInPatternId The built-in pattern from the list of preconfigured patterns.
       * Either a customPattern or builtInPatternId is required. To view the entire list of data
       * types and their corresponding built-in pattern IDs, see [Base inline
       * redaction](https://docs.aws.amazon.com/workspaces-web/latest/adminguide/base-inline-redaction.html)
       * .
       */
      public fun builtInPatternId(builtInPatternId: String)

      /**
       * @param confidenceLevel The confidence level for inline redaction pattern.
       * This indicates the certainty of data type matches in the redaction process. Confidence
       * level 3 means high confidence, and requires a formatted text pattern match in order for
       * content to be redacted. Confidence level 2 means medium confidence, and redaction considers
       * both formatted and unformatted text, and adds keyword associate to the logic. Confidence level
       * 1 means low confidence, and redaction is enforced for both formatted pattern + unformatted
       * pattern without keyword. This overrides the global confidence level.
       */
      public fun confidenceLevel(confidenceLevel: Number)

      /**
       * @param customPattern The configuration for a custom pattern.
       * Either a customPattern or builtInPatternId is required.
       */
      public fun customPattern(customPattern: IResolvable)

      /**
       * @param customPattern The configuration for a custom pattern.
       * Either a customPattern or builtInPatternId is required.
       */
      public fun customPattern(customPattern: CustomPatternProperty)

      /**
       * @param customPattern The configuration for a custom pattern.
       * Either a customPattern or builtInPatternId is required.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5166378f982155d6959c38c303f797c8253eb11be2673c5c84a028915e58c7b6")
      public fun customPattern(customPattern: CustomPatternProperty.Builder.() -> Unit)

      /**
       * @param enforcedUrls The enforced URL configuration for the inline redaction pattern.
       * This will override the global enforced URL configuration.
       */
      public fun enforcedUrls(enforcedUrls: List<String>)

      /**
       * @param enforcedUrls The enforced URL configuration for the inline redaction pattern.
       * This will override the global enforced URL configuration.
       */
      public fun enforcedUrls(vararg enforcedUrls: String)

      /**
       * @param exemptUrls The exempt URL configuration for the inline redaction pattern.
       * This will override the global exempt URL configuration for the inline redaction pattern.
       */
      public fun exemptUrls(exemptUrls: List<String>)

      /**
       * @param exemptUrls The exempt URL configuration for the inline redaction pattern.
       * This will override the global exempt URL configuration for the inline redaction pattern.
       */
      public fun exemptUrls(vararg exemptUrls: String)

      /**
       * @param redactionPlaceHolder The redaction placeholder that will replace the redacted text
       * in session for the inline redaction pattern. 
       */
      public fun redactionPlaceHolder(redactionPlaceHolder: IResolvable)

      /**
       * @param redactionPlaceHolder The redaction placeholder that will replace the redacted text
       * in session for the inline redaction pattern. 
       */
      public fun redactionPlaceHolder(redactionPlaceHolder: RedactionPlaceHolderProperty)

      /**
       * @param redactionPlaceHolder The redaction placeholder that will replace the redacted text
       * in session for the inline redaction pattern. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3aa27d14cf02b25bdc3f0058dff8e09b4b98383c8d886353d339af9f45e0223f")
      public
          fun redactionPlaceHolder(redactionPlaceHolder: RedactionPlaceHolderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.InlineRedactionPatternProperty.Builder
          =
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.InlineRedactionPatternProperty.builder()

      /**
       * @param builtInPatternId The built-in pattern from the list of preconfigured patterns.
       * Either a customPattern or builtInPatternId is required. To view the entire list of data
       * types and their corresponding built-in pattern IDs, see [Base inline
       * redaction](https://docs.aws.amazon.com/workspaces-web/latest/adminguide/base-inline-redaction.html)
       * .
       */
      override fun builtInPatternId(builtInPatternId: String) {
        cdkBuilder.builtInPatternId(builtInPatternId)
      }

      /**
       * @param confidenceLevel The confidence level for inline redaction pattern.
       * This indicates the certainty of data type matches in the redaction process. Confidence
       * level 3 means high confidence, and requires a formatted text pattern match in order for
       * content to be redacted. Confidence level 2 means medium confidence, and redaction considers
       * both formatted and unformatted text, and adds keyword associate to the logic. Confidence level
       * 1 means low confidence, and redaction is enforced for both formatted pattern + unformatted
       * pattern without keyword. This overrides the global confidence level.
       */
      override fun confidenceLevel(confidenceLevel: Number) {
        cdkBuilder.confidenceLevel(confidenceLevel)
      }

      /**
       * @param customPattern The configuration for a custom pattern.
       * Either a customPattern or builtInPatternId is required.
       */
      override fun customPattern(customPattern: IResolvable) {
        cdkBuilder.customPattern(customPattern.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customPattern The configuration for a custom pattern.
       * Either a customPattern or builtInPatternId is required.
       */
      override fun customPattern(customPattern: CustomPatternProperty) {
        cdkBuilder.customPattern(customPattern.let(CustomPatternProperty.Companion::unwrap))
      }

      /**
       * @param customPattern The configuration for a custom pattern.
       * Either a customPattern or builtInPatternId is required.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5166378f982155d6959c38c303f797c8253eb11be2673c5c84a028915e58c7b6")
      override fun customPattern(customPattern: CustomPatternProperty.Builder.() -> Unit): Unit =
          customPattern(CustomPatternProperty(customPattern))

      /**
       * @param enforcedUrls The enforced URL configuration for the inline redaction pattern.
       * This will override the global enforced URL configuration.
       */
      override fun enforcedUrls(enforcedUrls: List<String>) {
        cdkBuilder.enforcedUrls(enforcedUrls)
      }

      /**
       * @param enforcedUrls The enforced URL configuration for the inline redaction pattern.
       * This will override the global enforced URL configuration.
       */
      override fun enforcedUrls(vararg enforcedUrls: String): Unit =
          enforcedUrls(enforcedUrls.toList())

      /**
       * @param exemptUrls The exempt URL configuration for the inline redaction pattern.
       * This will override the global exempt URL configuration for the inline redaction pattern.
       */
      override fun exemptUrls(exemptUrls: List<String>) {
        cdkBuilder.exemptUrls(exemptUrls)
      }

      /**
       * @param exemptUrls The exempt URL configuration for the inline redaction pattern.
       * This will override the global exempt URL configuration for the inline redaction pattern.
       */
      override fun exemptUrls(vararg exemptUrls: String): Unit = exemptUrls(exemptUrls.toList())

      /**
       * @param redactionPlaceHolder The redaction placeholder that will replace the redacted text
       * in session for the inline redaction pattern. 
       */
      override fun redactionPlaceHolder(redactionPlaceHolder: IResolvable) {
        cdkBuilder.redactionPlaceHolder(redactionPlaceHolder.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param redactionPlaceHolder The redaction placeholder that will replace the redacted text
       * in session for the inline redaction pattern. 
       */
      override fun redactionPlaceHolder(redactionPlaceHolder: RedactionPlaceHolderProperty) {
        cdkBuilder.redactionPlaceHolder(redactionPlaceHolder.let(RedactionPlaceHolderProperty.Companion::unwrap))
      }

      /**
       * @param redactionPlaceHolder The redaction placeholder that will replace the redacted text
       * in session for the inline redaction pattern. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3aa27d14cf02b25bdc3f0058dff8e09b4b98383c8d886353d339af9f45e0223f")
      override
          fun redactionPlaceHolder(redactionPlaceHolder: RedactionPlaceHolderProperty.Builder.() -> Unit):
          Unit = redactionPlaceHolder(RedactionPlaceHolderProperty(redactionPlaceHolder))

      public fun build():
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.InlineRedactionPatternProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.InlineRedactionPatternProperty,
    ) : CdkObject(cdkObject),
        InlineRedactionPatternProperty {
      /**
       * The built-in pattern from the list of preconfigured patterns.
       *
       * Either a customPattern or builtInPatternId is required. To view the entire list of data
       * types and their corresponding built-in pattern IDs, see [Base inline
       * redaction](https://docs.aws.amazon.com/workspaces-web/latest/adminguide/base-inline-redaction.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionpattern.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionpattern-builtinpatternid)
       */
      override fun builtInPatternId(): String? = unwrap(this).getBuiltInPatternId()

      /**
       * The confidence level for inline redaction pattern.
       *
       * This indicates the certainty of data type matches in the redaction process. Confidence
       * level 3 means high confidence, and requires a formatted text pattern match in order for
       * content to be redacted. Confidence level 2 means medium confidence, and redaction considers
       * both formatted and unformatted text, and adds keyword associate to the logic. Confidence level
       * 1 means low confidence, and redaction is enforced for both formatted pattern + unformatted
       * pattern without keyword. This overrides the global confidence level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionpattern.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionpattern-confidencelevel)
       */
      override fun confidenceLevel(): Number? = unwrap(this).getConfidenceLevel()

      /**
       * The configuration for a custom pattern.
       *
       * Either a customPattern or builtInPatternId is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionpattern.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionpattern-custompattern)
       */
      override fun customPattern(): Any? = unwrap(this).getCustomPattern()

      /**
       * The enforced URL configuration for the inline redaction pattern.
       *
       * This will override the global enforced URL configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionpattern.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionpattern-enforcedurls)
       */
      override fun enforcedUrls(): List<String> = unwrap(this).getEnforcedUrls() ?: emptyList()

      /**
       * The exempt URL configuration for the inline redaction pattern.
       *
       * This will override the global exempt URL configuration for the inline redaction pattern.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionpattern.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionpattern-exempturls)
       */
      override fun exemptUrls(): List<String> = unwrap(this).getExemptUrls() ?: emptyList()

      /**
       * The redaction placeholder that will replace the redacted text in session for the inline
       * redaction pattern.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-inlineredactionpattern.html#cfn-workspacesweb-dataprotectionsettings-inlineredactionpattern-redactionplaceholder)
       */
      override fun redactionPlaceHolder(): Any = unwrap(this).getRedactionPlaceHolder()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InlineRedactionPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.InlineRedactionPatternProperty):
          InlineRedactionPatternProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InlineRedactionPatternProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InlineRedactionPatternProperty):
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.InlineRedactionPatternProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.InlineRedactionPatternProperty
    }
  }

  /**
   * The redaction placeholder that will replace the redacted text in session.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
   * RedactionPlaceHolderProperty redactionPlaceHolderProperty =
   * RedactionPlaceHolderProperty.builder()
   * .redactionPlaceHolderType("redactionPlaceHolderType")
   * // the properties below are optional
   * .redactionPlaceHolderText("redactionPlaceHolderText")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-redactionplaceholder.html)
   */
  public interface RedactionPlaceHolderProperty {
    /**
     * The redaction placeholder text that will replace the redacted text in session for the custom
     * text redaction placeholder type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-redactionplaceholder.html#cfn-workspacesweb-dataprotectionsettings-redactionplaceholder-redactionplaceholdertext)
     */
    public fun redactionPlaceHolderText(): String? = unwrap(this).getRedactionPlaceHolderText()

    /**
     * The redaction placeholder type that will replace the redacted text in session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-redactionplaceholder.html#cfn-workspacesweb-dataprotectionsettings-redactionplaceholder-redactionplaceholdertype)
     */
    public fun redactionPlaceHolderType(): String

    /**
     * A builder for [RedactionPlaceHolderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param redactionPlaceHolderText The redaction placeholder text that will replace the
       * redacted text in session for the custom text redaction placeholder type.
       */
      public fun redactionPlaceHolderText(redactionPlaceHolderText: String)

      /**
       * @param redactionPlaceHolderType The redaction placeholder type that will replace the
       * redacted text in session. 
       */
      public fun redactionPlaceHolderType(redactionPlaceHolderType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.RedactionPlaceHolderProperty.Builder
          =
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.RedactionPlaceHolderProperty.builder()

      /**
       * @param redactionPlaceHolderText The redaction placeholder text that will replace the
       * redacted text in session for the custom text redaction placeholder type.
       */
      override fun redactionPlaceHolderText(redactionPlaceHolderText: String) {
        cdkBuilder.redactionPlaceHolderText(redactionPlaceHolderText)
      }

      /**
       * @param redactionPlaceHolderType The redaction placeholder type that will replace the
       * redacted text in session. 
       */
      override fun redactionPlaceHolderType(redactionPlaceHolderType: String) {
        cdkBuilder.redactionPlaceHolderType(redactionPlaceHolderType)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.RedactionPlaceHolderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.RedactionPlaceHolderProperty,
    ) : CdkObject(cdkObject),
        RedactionPlaceHolderProperty {
      /**
       * The redaction placeholder text that will replace the redacted text in session for the
       * custom text redaction placeholder type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-redactionplaceholder.html#cfn-workspacesweb-dataprotectionsettings-redactionplaceholder-redactionplaceholdertext)
       */
      override fun redactionPlaceHolderText(): String? = unwrap(this).getRedactionPlaceHolderText()

      /**
       * The redaction placeholder type that will replace the redacted text in session.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-dataprotectionsettings-redactionplaceholder.html#cfn-workspacesweb-dataprotectionsettings-redactionplaceholder-redactionplaceholdertype)
       */
      override fun redactionPlaceHolderType(): String = unwrap(this).getRedactionPlaceHolderType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedactionPlaceHolderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.RedactionPlaceHolderProperty):
          RedactionPlaceHolderProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RedactionPlaceHolderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedactionPlaceHolderProperty):
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.RedactionPlaceHolderProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings.RedactionPlaceHolderProperty
    }
  }
}
