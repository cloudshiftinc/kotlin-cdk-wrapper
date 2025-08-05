@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon Q Business web experience.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * CfnWebExperience cfnWebExperience = CfnWebExperience.Builder.create(this, "MyCfnWebExperience")
 * .applicationId("applicationId")
 * // the properties below are optional
 * .browserExtensionConfiguration(BrowserExtensionConfigurationProperty.builder()
 * .enabledBrowserExtensions(List.of("enabledBrowserExtensions"))
 * .build())
 * .customizationConfiguration(CustomizationConfigurationProperty.builder()
 * .customCssUrl("customCssUrl")
 * .faviconUrl("faviconUrl")
 * .fontUrl("fontUrl")
 * .logoUrl("logoUrl")
 * .build())
 * .identityProviderConfiguration(IdentityProviderConfigurationProperty.builder()
 * .openIdConnectConfiguration(OpenIDConnectProviderConfigurationProperty.builder()
 * .secretsArn("secretsArn")
 * .secretsRole("secretsRole")
 * .build())
 * .samlConfiguration(SamlProviderConfigurationProperty.builder()
 * .authenticationUrl("authenticationUrl")
 * .build())
 * .build())
 * .origins(List.of("origins"))
 * .roleArn("roleArn")
 * .samplePromptsControlMode("samplePromptsControlMode")
 * .subtitle("subtitle")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .title("title")
 * .welcomeMessage("welcomeMessage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html)
 */
public open class CfnWebExperience(
  cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperience,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWebExperienceProps,
  ) :
      this(software.amazon.awscdk.services.qbusiness.CfnWebExperience(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnWebExperienceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWebExperienceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWebExperienceProps(props)
  )

  /**
   * The identifier of the Amazon Q Business web experience.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The identifier of the Amazon Q Business web experience.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * The Unix timestamp when the Amazon Q Business application was last updated.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The endpoint URLs for your Amazon Q Business web experience.
   *
   * The URLs are unique and fully hosted by AWS .
   */
  public open fun attrDefaultEndpoint(): String = unwrap(this).getAttrDefaultEndpoint()

  /**
   * The status of your Amazon Q Business web experience.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Unix timestamp when your Amazon Q Business web experience was updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The Amazon Resource Name (ARN) of an Amazon Q Business web experience.
   */
  public open fun attrWebExperienceArn(): String = unwrap(this).getAttrWebExperienceArn()

  /**
   * The identifier of your Amazon Q Business web experience.
   */
  public open fun attrWebExperienceId(): String = unwrap(this).getAttrWebExperienceId()

  /**
   * The container for browser extension configuration for an Amazon Q Business web experience.
   */
  public open fun browserExtensionConfiguration(): Any? =
      unwrap(this).getBrowserExtensionConfiguration()

  /**
   * The container for browser extension configuration for an Amazon Q Business web experience.
   */
  public open fun browserExtensionConfiguration(`value`: IResolvable) {
    unwrap(this).setBrowserExtensionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The container for browser extension configuration for an Amazon Q Business web experience.
   */
  public open fun browserExtensionConfiguration(`value`: BrowserExtensionConfigurationProperty) {
    unwrap(this).setBrowserExtensionConfiguration(`value`.let(BrowserExtensionConfigurationProperty.Companion::unwrap))
  }

  /**
   * The container for browser extension configuration for an Amazon Q Business web experience.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a50ee576a82d3cec2a60e85afd6b7f31f3443f613b98afca837e26b12b93c46e")
  public open
      fun browserExtensionConfiguration(`value`: BrowserExtensionConfigurationProperty.Builder.() -> Unit):
      Unit = browserExtensionConfiguration(BrowserExtensionConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Contains the configuration information to customize the logo, font, and color of an Amazon Q
   * Business web experience with individual files for each property or a CSS file for them all.
   */
  public open fun customizationConfiguration(): Any? = unwrap(this).getCustomizationConfiguration()

  /**
   * Contains the configuration information to customize the logo, font, and color of an Amazon Q
   * Business web experience with individual files for each property or a CSS file for them all.
   */
  public open fun customizationConfiguration(`value`: IResolvable) {
    unwrap(this).setCustomizationConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains the configuration information to customize the logo, font, and color of an Amazon Q
   * Business web experience with individual files for each property or a CSS file for them all.
   */
  public open fun customizationConfiguration(`value`: CustomizationConfigurationProperty) {
    unwrap(this).setCustomizationConfiguration(`value`.let(CustomizationConfigurationProperty.Companion::unwrap))
  }

  /**
   * Contains the configuration information to customize the logo, font, and color of an Amazon Q
   * Business web experience with individual files for each property or a CSS file for them all.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cd438925c058fb89b57a1002e11dd96013916d4e20da8cc90a9451bd77858c2d")
  public open
      fun customizationConfiguration(`value`: CustomizationConfigurationProperty.Builder.() -> Unit):
      Unit = customizationConfiguration(CustomizationConfigurationProperty(`value`))

  /**
   * Provides information about the identity provider (IdP) used to authenticate end users of an
   * Amazon Q Business web experience.
   */
  public open fun identityProviderConfiguration(): Any? =
      unwrap(this).getIdentityProviderConfiguration()

  /**
   * Provides information about the identity provider (IdP) used to authenticate end users of an
   * Amazon Q Business web experience.
   */
  public open fun identityProviderConfiguration(`value`: IResolvable) {
    unwrap(this).setIdentityProviderConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Provides information about the identity provider (IdP) used to authenticate end users of an
   * Amazon Q Business web experience.
   */
  public open fun identityProviderConfiguration(`value`: IdentityProviderConfigurationProperty) {
    unwrap(this).setIdentityProviderConfiguration(`value`.let(IdentityProviderConfigurationProperty.Companion::unwrap))
  }

  /**
   * Provides information about the identity provider (IdP) used to authenticate end users of an
   * Amazon Q Business web experience.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("903cfc8bf4232863db0899fbdb71d7c0cee5d2124d73f67f9ffa315b1e8134dc")
  public open
      fun identityProviderConfiguration(`value`: IdentityProviderConfigurationProperty.Builder.() -> Unit):
      Unit = identityProviderConfiguration(IdentityProviderConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Sets the website domain origins that are allowed to embed the Amazon Q Business web experience.
   */
  public open fun origins(): List<String> = unwrap(this).getOrigins() ?: emptyList()

  /**
   * Sets the website domain origins that are allowed to embed the Amazon Q Business web experience.
   */
  public open fun origins(`value`: List<String>) {
    unwrap(this).setOrigins(`value`)
  }

  /**
   * Sets the website domain origins that are allowed to embed the Amazon Q Business web experience.
   */
  public open fun origins(vararg `value`: String): Unit = origins(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the service role attached to your web experience.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the service role attached to your web experience.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Determines whether sample prompts are enabled in the web experience for an end user.
   */
  public open fun samplePromptsControlMode(): String? = unwrap(this).getSamplePromptsControlMode()

  /**
   * Determines whether sample prompts are enabled in the web experience for an end user.
   */
  public open fun samplePromptsControlMode(`value`: String) {
    unwrap(this).setSamplePromptsControlMode(`value`)
  }

  /**
   * A subtitle to personalize your Amazon Q Business web experience.
   */
  public open fun subtitle(): String? = unwrap(this).getSubtitle()

  /**
   * A subtitle to personalize your Amazon Q Business web experience.
   */
  public open fun subtitle(`value`: String) {
    unwrap(this).setSubtitle(`value`)
  }

  /**
   * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The title for your Amazon Q Business web experience.
   */
  public open fun title(): String? = unwrap(this).getTitle()

  /**
   * The title for your Amazon Q Business web experience.
   */
  public open fun title(`value`: String) {
    unwrap(this).setTitle(`value`)
  }

  /**
   * A message in an Amazon Q Business web experience.
   */
  public open fun welcomeMessage(): String? = unwrap(this).getWelcomeMessage()

  /**
   * A message in an Amazon Q Business web experience.
   */
  public open fun welcomeMessage(`value`: String) {
    unwrap(this).setWelcomeMessage(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.qbusiness.CfnWebExperience].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-applicationid)
     * @param applicationId The identifier of the Amazon Q Business web experience. 
     */
    public fun applicationId(applicationId: String)

    /**
     * The container for browser extension configuration for an Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-browserextensionconfiguration)
     * @param browserExtensionConfiguration The container for browser extension configuration for an
     * Amazon Q Business web experience. 
     */
    public fun browserExtensionConfiguration(browserExtensionConfiguration: IResolvable)

    /**
     * The container for browser extension configuration for an Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-browserextensionconfiguration)
     * @param browserExtensionConfiguration The container for browser extension configuration for an
     * Amazon Q Business web experience. 
     */
    public
        fun browserExtensionConfiguration(browserExtensionConfiguration: BrowserExtensionConfigurationProperty)

    /**
     * The container for browser extension configuration for an Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-browserextensionconfiguration)
     * @param browserExtensionConfiguration The container for browser extension configuration for an
     * Amazon Q Business web experience. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e845ddd776caadfa2dfddc4bf239ef1bc46fcece2a55b462c8ecd81b2b01b702")
    public
        fun browserExtensionConfiguration(browserExtensionConfiguration: BrowserExtensionConfigurationProperty.Builder.() -> Unit)

    /**
     * Contains the configuration information to customize the logo, font, and color of an Amazon Q
     * Business web experience with individual files for each property or a CSS file for them all.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-customizationconfiguration)
     * @param customizationConfiguration Contains the configuration information to customize the
     * logo, font, and color of an Amazon Q Business web experience with individual files for each
     * property or a CSS file for them all. 
     */
    public fun customizationConfiguration(customizationConfiguration: IResolvable)

    /**
     * Contains the configuration information to customize the logo, font, and color of an Amazon Q
     * Business web experience with individual files for each property or a CSS file for them all.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-customizationconfiguration)
     * @param customizationConfiguration Contains the configuration information to customize the
     * logo, font, and color of an Amazon Q Business web experience with individual files for each
     * property or a CSS file for them all. 
     */
    public
        fun customizationConfiguration(customizationConfiguration: CustomizationConfigurationProperty)

    /**
     * Contains the configuration information to customize the logo, font, and color of an Amazon Q
     * Business web experience with individual files for each property or a CSS file for them all.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-customizationconfiguration)
     * @param customizationConfiguration Contains the configuration information to customize the
     * logo, font, and color of an Amazon Q Business web experience with individual files for each
     * property or a CSS file for them all. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e091b886c1d83980f87f168f9f54ac61e4317268adf9472b32d5730d4dffa1b")
    public
        fun customizationConfiguration(customizationConfiguration: CustomizationConfigurationProperty.Builder.() -> Unit)

    /**
     * Provides information about the identity provider (IdP) used to authenticate end users of an
     * Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-identityproviderconfiguration)
     * @param identityProviderConfiguration Provides information about the identity provider (IdP)
     * used to authenticate end users of an Amazon Q Business web experience. 
     */
    public fun identityProviderConfiguration(identityProviderConfiguration: IResolvable)

    /**
     * Provides information about the identity provider (IdP) used to authenticate end users of an
     * Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-identityproviderconfiguration)
     * @param identityProviderConfiguration Provides information about the identity provider (IdP)
     * used to authenticate end users of an Amazon Q Business web experience. 
     */
    public
        fun identityProviderConfiguration(identityProviderConfiguration: IdentityProviderConfigurationProperty)

    /**
     * Provides information about the identity provider (IdP) used to authenticate end users of an
     * Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-identityproviderconfiguration)
     * @param identityProviderConfiguration Provides information about the identity provider (IdP)
     * used to authenticate end users of an Amazon Q Business web experience. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57f86501bd3b16088abd77fc6c5d3047e5b55983ed4dc477068e2d0ad803b46f")
    public
        fun identityProviderConfiguration(identityProviderConfiguration: IdentityProviderConfigurationProperty.Builder.() -> Unit)

    /**
     * Sets the website domain origins that are allowed to embed the Amazon Q Business web
     * experience.
     *
     * The *domain origin* refers to the base URL for accessing a website including the protocol (
     * `http/https` ), the domain name, and the port number (if specified).
     *
     *
     * You must only submit a *base URL* and not a full path. For example,
     * `https://docs.aws.amazon.com` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-origins)
     * @param origins Sets the website domain origins that are allowed to embed the Amazon Q
     * Business web experience. 
     */
    public fun origins(origins: List<String>)

    /**
     * Sets the website domain origins that are allowed to embed the Amazon Q Business web
     * experience.
     *
     * The *domain origin* refers to the base URL for accessing a website including the protocol (
     * `http/https` ), the domain name, and the port number (if specified).
     *
     *
     * You must only submit a *base URL* and not a full path. For example,
     * `https://docs.aws.amazon.com` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-origins)
     * @param origins Sets the website domain origins that are allowed to embed the Amazon Q
     * Business web experience. 
     */
    public fun origins(vararg origins: String)

    /**
     * The Amazon Resource Name (ARN) of the service role attached to your web experience.
     *
     *
     * You must provide this value if you're using IAM Identity Center to manage end user access to
     * your application. If you're using legacy identity management to manage user access, you don't
     * need to provide this value.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the service role attached to your web
     * experience. 
     */
    public fun roleArn(roleArn: String)

    /**
     * Determines whether sample prompts are enabled in the web experience for an end user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-samplepromptscontrolmode)
     * @param samplePromptsControlMode Determines whether sample prompts are enabled in the web
     * experience for an end user. 
     */
    public fun samplePromptsControlMode(samplePromptsControlMode: String)

    /**
     * A subtitle to personalize your Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-subtitle)
     * @param subtitle A subtitle to personalize your Amazon Q Business web experience. 
     */
    public fun subtitle(subtitle: String)

    /**
     * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
     *
     * You can also use tags to help control access to the web experience. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-tags)
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business web
     * experience. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
     *
     * You can also use tags to help control access to the web experience. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-tags)
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business web
     * experience. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The title for your Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-title)
     * @param title The title for your Amazon Q Business web experience. 
     */
    public fun title(title: String)

    /**
     * A message in an Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-welcomemessage)
     * @param welcomeMessage A message in an Amazon Q Business web experience. 
     */
    public fun welcomeMessage(welcomeMessage: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnWebExperience.Builder =
        software.amazon.awscdk.services.qbusiness.CfnWebExperience.Builder.create(scope, id)

    /**
     * The identifier of the Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-applicationid)
     * @param applicationId The identifier of the Amazon Q Business web experience. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * The container for browser extension configuration for an Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-browserextensionconfiguration)
     * @param browserExtensionConfiguration The container for browser extension configuration for an
     * Amazon Q Business web experience. 
     */
    override fun browserExtensionConfiguration(browserExtensionConfiguration: IResolvable) {
      cdkBuilder.browserExtensionConfiguration(browserExtensionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The container for browser extension configuration for an Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-browserextensionconfiguration)
     * @param browserExtensionConfiguration The container for browser extension configuration for an
     * Amazon Q Business web experience. 
     */
    override
        fun browserExtensionConfiguration(browserExtensionConfiguration: BrowserExtensionConfigurationProperty) {
      cdkBuilder.browserExtensionConfiguration(browserExtensionConfiguration.let(BrowserExtensionConfigurationProperty.Companion::unwrap))
    }

    /**
     * The container for browser extension configuration for an Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-browserextensionconfiguration)
     * @param browserExtensionConfiguration The container for browser extension configuration for an
     * Amazon Q Business web experience. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e845ddd776caadfa2dfddc4bf239ef1bc46fcece2a55b462c8ecd81b2b01b702")
    override
        fun browserExtensionConfiguration(browserExtensionConfiguration: BrowserExtensionConfigurationProperty.Builder.() -> Unit):
        Unit =
        browserExtensionConfiguration(BrowserExtensionConfigurationProperty(browserExtensionConfiguration))

    /**
     * Contains the configuration information to customize the logo, font, and color of an Amazon Q
     * Business web experience with individual files for each property or a CSS file for them all.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-customizationconfiguration)
     * @param customizationConfiguration Contains the configuration information to customize the
     * logo, font, and color of an Amazon Q Business web experience with individual files for each
     * property or a CSS file for them all. 
     */
    override fun customizationConfiguration(customizationConfiguration: IResolvable) {
      cdkBuilder.customizationConfiguration(customizationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains the configuration information to customize the logo, font, and color of an Amazon Q
     * Business web experience with individual files for each property or a CSS file for them all.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-customizationconfiguration)
     * @param customizationConfiguration Contains the configuration information to customize the
     * logo, font, and color of an Amazon Q Business web experience with individual files for each
     * property or a CSS file for them all. 
     */
    override
        fun customizationConfiguration(customizationConfiguration: CustomizationConfigurationProperty) {
      cdkBuilder.customizationConfiguration(customizationConfiguration.let(CustomizationConfigurationProperty.Companion::unwrap))
    }

    /**
     * Contains the configuration information to customize the logo, font, and color of an Amazon Q
     * Business web experience with individual files for each property or a CSS file for them all.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-customizationconfiguration)
     * @param customizationConfiguration Contains the configuration information to customize the
     * logo, font, and color of an Amazon Q Business web experience with individual files for each
     * property or a CSS file for them all. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e091b886c1d83980f87f168f9f54ac61e4317268adf9472b32d5730d4dffa1b")
    override
        fun customizationConfiguration(customizationConfiguration: CustomizationConfigurationProperty.Builder.() -> Unit):
        Unit =
        customizationConfiguration(CustomizationConfigurationProperty(customizationConfiguration))

    /**
     * Provides information about the identity provider (IdP) used to authenticate end users of an
     * Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-identityproviderconfiguration)
     * @param identityProviderConfiguration Provides information about the identity provider (IdP)
     * used to authenticate end users of an Amazon Q Business web experience. 
     */
    override fun identityProviderConfiguration(identityProviderConfiguration: IResolvable) {
      cdkBuilder.identityProviderConfiguration(identityProviderConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Provides information about the identity provider (IdP) used to authenticate end users of an
     * Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-identityproviderconfiguration)
     * @param identityProviderConfiguration Provides information about the identity provider (IdP)
     * used to authenticate end users of an Amazon Q Business web experience. 
     */
    override
        fun identityProviderConfiguration(identityProviderConfiguration: IdentityProviderConfigurationProperty) {
      cdkBuilder.identityProviderConfiguration(identityProviderConfiguration.let(IdentityProviderConfigurationProperty.Companion::unwrap))
    }

    /**
     * Provides information about the identity provider (IdP) used to authenticate end users of an
     * Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-identityproviderconfiguration)
     * @param identityProviderConfiguration Provides information about the identity provider (IdP)
     * used to authenticate end users of an Amazon Q Business web experience. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57f86501bd3b16088abd77fc6c5d3047e5b55983ed4dc477068e2d0ad803b46f")
    override
        fun identityProviderConfiguration(identityProviderConfiguration: IdentityProviderConfigurationProperty.Builder.() -> Unit):
        Unit =
        identityProviderConfiguration(IdentityProviderConfigurationProperty(identityProviderConfiguration))

    /**
     * Sets the website domain origins that are allowed to embed the Amazon Q Business web
     * experience.
     *
     * The *domain origin* refers to the base URL for accessing a website including the protocol (
     * `http/https` ), the domain name, and the port number (if specified).
     *
     *
     * You must only submit a *base URL* and not a full path. For example,
     * `https://docs.aws.amazon.com` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-origins)
     * @param origins Sets the website domain origins that are allowed to embed the Amazon Q
     * Business web experience. 
     */
    override fun origins(origins: List<String>) {
      cdkBuilder.origins(origins)
    }

    /**
     * Sets the website domain origins that are allowed to embed the Amazon Q Business web
     * experience.
     *
     * The *domain origin* refers to the base URL for accessing a website including the protocol (
     * `http/https` ), the domain name, and the port number (if specified).
     *
     *
     * You must only submit a *base URL* and not a full path. For example,
     * `https://docs.aws.amazon.com` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-origins)
     * @param origins Sets the website domain origins that are allowed to embed the Amazon Q
     * Business web experience. 
     */
    override fun origins(vararg origins: String): Unit = origins(origins.toList())

    /**
     * The Amazon Resource Name (ARN) of the service role attached to your web experience.
     *
     *
     * You must provide this value if you're using IAM Identity Center to manage end user access to
     * your application. If you're using legacy identity management to manage user access, you don't
     * need to provide this value.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the service role attached to your web
     * experience. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * Determines whether sample prompts are enabled in the web experience for an end user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-samplepromptscontrolmode)
     * @param samplePromptsControlMode Determines whether sample prompts are enabled in the web
     * experience for an end user. 
     */
    override fun samplePromptsControlMode(samplePromptsControlMode: String) {
      cdkBuilder.samplePromptsControlMode(samplePromptsControlMode)
    }

    /**
     * A subtitle to personalize your Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-subtitle)
     * @param subtitle A subtitle to personalize your Amazon Q Business web experience. 
     */
    override fun subtitle(subtitle: String) {
      cdkBuilder.subtitle(subtitle)
    }

    /**
     * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
     *
     * You can also use tags to help control access to the web experience. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-tags)
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business web
     * experience. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
     *
     * You can also use tags to help control access to the web experience. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-tags)
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business web
     * experience. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The title for your Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-title)
     * @param title The title for your Amazon Q Business web experience. 
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    /**
     * A message in an Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-welcomemessage)
     * @param welcomeMessage A message in an Amazon Q Business web experience. 
     */
    override fun welcomeMessage(welcomeMessage: String) {
      cdkBuilder.welcomeMessage(welcomeMessage)
    }

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnWebExperience =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.qbusiness.CfnWebExperience.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWebExperience {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWebExperience(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperience):
        CfnWebExperience = CfnWebExperience(cdkObject)

    internal fun unwrap(wrapped: CfnWebExperience):
        software.amazon.awscdk.services.qbusiness.CfnWebExperience = wrapped.cdkObject as
        software.amazon.awscdk.services.qbusiness.CfnWebExperience
  }

  /**
   * The container for browser extension configuration for an Amazon Q Business web experience.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * BrowserExtensionConfigurationProperty browserExtensionConfigurationProperty =
   * BrowserExtensionConfigurationProperty.builder()
   * .enabledBrowserExtensions(List.of("enabledBrowserExtensions"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-browserextensionconfiguration.html)
   */
  public interface BrowserExtensionConfigurationProperty {
    /**
     * Specify the browser extensions allowed for your Amazon Q web experience.
     *
     * * `CHROME` — Enables the extension for Chromium-based browsers (Google Chrome, Microsoft
     * Edge, Opera, etc.).
     * * `FIREFOX` — Enables the extension for Mozilla Firefox.
     * * `CHROME` and `FIREFOX` — Enable the extension for Chromium-based browsers and Mozilla
     * Firefox.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-browserextensionconfiguration.html#cfn-qbusiness-webexperience-browserextensionconfiguration-enabledbrowserextensions)
     */
    public fun enabledBrowserExtensions(): List<String>

    /**
     * A builder for [BrowserExtensionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabledBrowserExtensions Specify the browser extensions allowed for your Amazon Q
       * web experience. 
       * * `CHROME` — Enables the extension for Chromium-based browsers (Google Chrome, Microsoft
       * Edge, Opera, etc.).
       * * `FIREFOX` — Enables the extension for Mozilla Firefox.
       * * `CHROME` and `FIREFOX` — Enable the extension for Chromium-based browsers and Mozilla
       * Firefox.
       */
      public fun enabledBrowserExtensions(enabledBrowserExtensions: List<String>)

      /**
       * @param enabledBrowserExtensions Specify the browser extensions allowed for your Amazon Q
       * web experience. 
       * * `CHROME` — Enables the extension for Chromium-based browsers (Google Chrome, Microsoft
       * Edge, Opera, etc.).
       * * `FIREFOX` — Enables the extension for Mozilla Firefox.
       * * `CHROME` and `FIREFOX` — Enable the extension for Chromium-based browsers and Mozilla
       * Firefox.
       */
      public fun enabledBrowserExtensions(vararg enabledBrowserExtensions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.BrowserExtensionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.BrowserExtensionConfigurationProperty.builder()

      /**
       * @param enabledBrowserExtensions Specify the browser extensions allowed for your Amazon Q
       * web experience. 
       * * `CHROME` — Enables the extension for Chromium-based browsers (Google Chrome, Microsoft
       * Edge, Opera, etc.).
       * * `FIREFOX` — Enables the extension for Mozilla Firefox.
       * * `CHROME` and `FIREFOX` — Enable the extension for Chromium-based browsers and Mozilla
       * Firefox.
       */
      override fun enabledBrowserExtensions(enabledBrowserExtensions: List<String>) {
        cdkBuilder.enabledBrowserExtensions(enabledBrowserExtensions)
      }

      /**
       * @param enabledBrowserExtensions Specify the browser extensions allowed for your Amazon Q
       * web experience. 
       * * `CHROME` — Enables the extension for Chromium-based browsers (Google Chrome, Microsoft
       * Edge, Opera, etc.).
       * * `FIREFOX` — Enables the extension for Mozilla Firefox.
       * * `CHROME` and `FIREFOX` — Enable the extension for Chromium-based browsers and Mozilla
       * Firefox.
       */
      override fun enabledBrowserExtensions(vararg enabledBrowserExtensions: String): Unit =
          enabledBrowserExtensions(enabledBrowserExtensions.toList())

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.BrowserExtensionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperience.BrowserExtensionConfigurationProperty,
    ) : CdkObject(cdkObject),
        BrowserExtensionConfigurationProperty {
      /**
       * Specify the browser extensions allowed for your Amazon Q web experience.
       *
       * * `CHROME` — Enables the extension for Chromium-based browsers (Google Chrome, Microsoft
       * Edge, Opera, etc.).
       * * `FIREFOX` — Enables the extension for Mozilla Firefox.
       * * `CHROME` and `FIREFOX` — Enable the extension for Chromium-based browsers and Mozilla
       * Firefox.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-browserextensionconfiguration.html#cfn-qbusiness-webexperience-browserextensionconfiguration-enabledbrowserextensions)
       */
      override fun enabledBrowserExtensions(): List<String> =
          unwrap(this).getEnabledBrowserExtensions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BrowserExtensionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperience.BrowserExtensionConfigurationProperty):
          BrowserExtensionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BrowserExtensionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BrowserExtensionConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.BrowserExtensionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.BrowserExtensionConfigurationProperty
    }
  }

  /**
   * Contains the configuration information to customize the logo, font, and color of an Amazon Q
   * Business web experience with individual files for each property or a CSS file for them all.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * CustomizationConfigurationProperty customizationConfigurationProperty =
   * CustomizationConfigurationProperty.builder()
   * .customCssUrl("customCssUrl")
   * .faviconUrl("faviconUrl")
   * .fontUrl("fontUrl")
   * .logoUrl("logoUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-customizationconfiguration.html)
   */
  public interface CustomizationConfigurationProperty {
    /**
     * Provides the URL where the custom CSS file is hosted for an Amazon Q web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-customizationconfiguration.html#cfn-qbusiness-webexperience-customizationconfiguration-customcssurl)
     */
    public fun customCssUrl(): String? = unwrap(this).getCustomCssUrl()

    /**
     * Provides the URL where the custom favicon file is hosted for an Amazon Q web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-customizationconfiguration.html#cfn-qbusiness-webexperience-customizationconfiguration-faviconurl)
     */
    public fun faviconUrl(): String? = unwrap(this).getFaviconUrl()

    /**
     * Provides the URL where the custom font file is hosted for an Amazon Q web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-customizationconfiguration.html#cfn-qbusiness-webexperience-customizationconfiguration-fonturl)
     */
    public fun fontUrl(): String? = unwrap(this).getFontUrl()

    /**
     * Provides the URL where the custom logo file is hosted for an Amazon Q web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-customizationconfiguration.html#cfn-qbusiness-webexperience-customizationconfiguration-logourl)
     */
    public fun logoUrl(): String? = unwrap(this).getLogoUrl()

    /**
     * A builder for [CustomizationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customCssUrl Provides the URL where the custom CSS file is hosted for an Amazon Q
       * web experience.
       */
      public fun customCssUrl(customCssUrl: String)

      /**
       * @param faviconUrl Provides the URL where the custom favicon file is hosted for an Amazon Q
       * web experience.
       */
      public fun faviconUrl(faviconUrl: String)

      /**
       * @param fontUrl Provides the URL where the custom font file is hosted for an Amazon Q web
       * experience.
       */
      public fun fontUrl(fontUrl: String)

      /**
       * @param logoUrl Provides the URL where the custom logo file is hosted for an Amazon Q web
       * experience.
       */
      public fun logoUrl(logoUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.CustomizationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.CustomizationConfigurationProperty.builder()

      /**
       * @param customCssUrl Provides the URL where the custom CSS file is hosted for an Amazon Q
       * web experience.
       */
      override fun customCssUrl(customCssUrl: String) {
        cdkBuilder.customCssUrl(customCssUrl)
      }

      /**
       * @param faviconUrl Provides the URL where the custom favicon file is hosted for an Amazon Q
       * web experience.
       */
      override fun faviconUrl(faviconUrl: String) {
        cdkBuilder.faviconUrl(faviconUrl)
      }

      /**
       * @param fontUrl Provides the URL where the custom font file is hosted for an Amazon Q web
       * experience.
       */
      override fun fontUrl(fontUrl: String) {
        cdkBuilder.fontUrl(fontUrl)
      }

      /**
       * @param logoUrl Provides the URL where the custom logo file is hosted for an Amazon Q web
       * experience.
       */
      override fun logoUrl(logoUrl: String) {
        cdkBuilder.logoUrl(logoUrl)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.CustomizationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperience.CustomizationConfigurationProperty,
    ) : CdkObject(cdkObject),
        CustomizationConfigurationProperty {
      /**
       * Provides the URL where the custom CSS file is hosted for an Amazon Q web experience.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-customizationconfiguration.html#cfn-qbusiness-webexperience-customizationconfiguration-customcssurl)
       */
      override fun customCssUrl(): String? = unwrap(this).getCustomCssUrl()

      /**
       * Provides the URL where the custom favicon file is hosted for an Amazon Q web experience.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-customizationconfiguration.html#cfn-qbusiness-webexperience-customizationconfiguration-faviconurl)
       */
      override fun faviconUrl(): String? = unwrap(this).getFaviconUrl()

      /**
       * Provides the URL where the custom font file is hosted for an Amazon Q web experience.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-customizationconfiguration.html#cfn-qbusiness-webexperience-customizationconfiguration-fonturl)
       */
      override fun fontUrl(): String? = unwrap(this).getFontUrl()

      /**
       * Provides the URL where the custom logo file is hosted for an Amazon Q web experience.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-customizationconfiguration.html#cfn-qbusiness-webexperience-customizationconfiguration-logourl)
       */
      override fun logoUrl(): String? = unwrap(this).getLogoUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomizationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperience.CustomizationConfigurationProperty):
          CustomizationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomizationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomizationConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.CustomizationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.CustomizationConfigurationProperty
    }
  }

  /**
   * Provides information about the identity provider (IdP) used to authenticate end users of an
   * Amazon Q Business web experience.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * IdentityProviderConfigurationProperty identityProviderConfigurationProperty =
   * IdentityProviderConfigurationProperty.builder()
   * .openIdConnectConfiguration(OpenIDConnectProviderConfigurationProperty.builder()
   * .secretsArn("secretsArn")
   * .secretsRole("secretsRole")
   * .build())
   * .samlConfiguration(SamlProviderConfigurationProperty.builder()
   * .authenticationUrl("authenticationUrl")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-identityproviderconfiguration.html)
   */
  public interface IdentityProviderConfigurationProperty {
    /**
     * The OIDC-compliant identity provider (IdP) used to authenticate end users of an Amazon Q
     * Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-identityproviderconfiguration.html#cfn-qbusiness-webexperience-identityproviderconfiguration-openidconnectconfiguration)
     */
    public fun openIdConnectConfiguration(): Any? = unwrap(this).getOpenIdConnectConfiguration()

    /**
     * The SAML 2.0-compliant identity provider (IdP) used to authenticate end users of an Amazon Q
     * Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-identityproviderconfiguration.html#cfn-qbusiness-webexperience-identityproviderconfiguration-samlconfiguration)
     */
    public fun samlConfiguration(): Any? = unwrap(this).getSamlConfiguration()

    /**
     * A builder for [IdentityProviderConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param openIdConnectConfiguration The OIDC-compliant identity provider (IdP) used to
       * authenticate end users of an Amazon Q Business web experience.
       */
      public fun openIdConnectConfiguration(openIdConnectConfiguration: IResolvable)

      /**
       * @param openIdConnectConfiguration The OIDC-compliant identity provider (IdP) used to
       * authenticate end users of an Amazon Q Business web experience.
       */
      public
          fun openIdConnectConfiguration(openIdConnectConfiguration: OpenIDConnectProviderConfigurationProperty)

      /**
       * @param openIdConnectConfiguration The OIDC-compliant identity provider (IdP) used to
       * authenticate end users of an Amazon Q Business web experience.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a5e15aacb6e057d775f92d0dea96c2517fb15bad90a175296f59f1b6e7d293c")
      public
          fun openIdConnectConfiguration(openIdConnectConfiguration: OpenIDConnectProviderConfigurationProperty.Builder.() -> Unit)

      /**
       * @param samlConfiguration The SAML 2.0-compliant identity provider (IdP) used to
       * authenticate end users of an Amazon Q Business web experience.
       */
      public fun samlConfiguration(samlConfiguration: IResolvable)

      /**
       * @param samlConfiguration The SAML 2.0-compliant identity provider (IdP) used to
       * authenticate end users of an Amazon Q Business web experience.
       */
      public fun samlConfiguration(samlConfiguration: SamlProviderConfigurationProperty)

      /**
       * @param samlConfiguration The SAML 2.0-compliant identity provider (IdP) used to
       * authenticate end users of an Amazon Q Business web experience.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a6826baa48b87c9780151c121965349b66056e067eb48f76d86201bd065e3909")
      public
          fun samlConfiguration(samlConfiguration: SamlProviderConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.IdentityProviderConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.IdentityProviderConfigurationProperty.builder()

      /**
       * @param openIdConnectConfiguration The OIDC-compliant identity provider (IdP) used to
       * authenticate end users of an Amazon Q Business web experience.
       */
      override fun openIdConnectConfiguration(openIdConnectConfiguration: IResolvable) {
        cdkBuilder.openIdConnectConfiguration(openIdConnectConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param openIdConnectConfiguration The OIDC-compliant identity provider (IdP) used to
       * authenticate end users of an Amazon Q Business web experience.
       */
      override
          fun openIdConnectConfiguration(openIdConnectConfiguration: OpenIDConnectProviderConfigurationProperty) {
        cdkBuilder.openIdConnectConfiguration(openIdConnectConfiguration.let(OpenIDConnectProviderConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param openIdConnectConfiguration The OIDC-compliant identity provider (IdP) used to
       * authenticate end users of an Amazon Q Business web experience.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a5e15aacb6e057d775f92d0dea96c2517fb15bad90a175296f59f1b6e7d293c")
      override
          fun openIdConnectConfiguration(openIdConnectConfiguration: OpenIDConnectProviderConfigurationProperty.Builder.() -> Unit):
          Unit =
          openIdConnectConfiguration(OpenIDConnectProviderConfigurationProperty(openIdConnectConfiguration))

      /**
       * @param samlConfiguration The SAML 2.0-compliant identity provider (IdP) used to
       * authenticate end users of an Amazon Q Business web experience.
       */
      override fun samlConfiguration(samlConfiguration: IResolvable) {
        cdkBuilder.samlConfiguration(samlConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param samlConfiguration The SAML 2.0-compliant identity provider (IdP) used to
       * authenticate end users of an Amazon Q Business web experience.
       */
      override fun samlConfiguration(samlConfiguration: SamlProviderConfigurationProperty) {
        cdkBuilder.samlConfiguration(samlConfiguration.let(SamlProviderConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param samlConfiguration The SAML 2.0-compliant identity provider (IdP) used to
       * authenticate end users of an Amazon Q Business web experience.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a6826baa48b87c9780151c121965349b66056e067eb48f76d86201bd065e3909")
      override
          fun samlConfiguration(samlConfiguration: SamlProviderConfigurationProperty.Builder.() -> Unit):
          Unit = samlConfiguration(SamlProviderConfigurationProperty(samlConfiguration))

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.IdentityProviderConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperience.IdentityProviderConfigurationProperty,
    ) : CdkObject(cdkObject),
        IdentityProviderConfigurationProperty {
      /**
       * The OIDC-compliant identity provider (IdP) used to authenticate end users of an Amazon Q
       * Business web experience.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-identityproviderconfiguration.html#cfn-qbusiness-webexperience-identityproviderconfiguration-openidconnectconfiguration)
       */
      override fun openIdConnectConfiguration(): Any? = unwrap(this).getOpenIdConnectConfiguration()

      /**
       * The SAML 2.0-compliant identity provider (IdP) used to authenticate end users of an Amazon
       * Q Business web experience.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-identityproviderconfiguration.html#cfn-qbusiness-webexperience-identityproviderconfiguration-samlconfiguration)
       */
      override fun samlConfiguration(): Any? = unwrap(this).getSamlConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdentityProviderConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperience.IdentityProviderConfigurationProperty):
          IdentityProviderConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdentityProviderConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdentityProviderConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.IdentityProviderConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.IdentityProviderConfigurationProperty
    }
  }

  /**
   * Information about the OIDC-compliant identity provider (IdP) used to authenticate end users of
   * an Amazon Q Business web experience.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * OpenIDConnectProviderConfigurationProperty openIDConnectProviderConfigurationProperty =
   * OpenIDConnectProviderConfigurationProperty.builder()
   * .secretsArn("secretsArn")
   * .secretsRole("secretsRole")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-openidconnectproviderconfiguration.html)
   */
  public interface OpenIDConnectProviderConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of a Secrets Manager secret containing the OIDC client secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-openidconnectproviderconfiguration.html#cfn-qbusiness-webexperience-openidconnectproviderconfiguration-secretsarn)
     */
    public fun secretsArn(): String

    /**
     * An IAM role with permissions to access AWS KMS to decrypt the Secrets Manager secret
     * containing your OIDC client secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-openidconnectproviderconfiguration.html#cfn-qbusiness-webexperience-openidconnectproviderconfiguration-secretsrole)
     */
    public fun secretsRole(): String

    /**
     * A builder for [OpenIDConnectProviderConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param secretsArn The Amazon Resource Name (ARN) of a Secrets Manager secret containing the
       * OIDC client secret. 
       */
      public fun secretsArn(secretsArn: String)

      /**
       * @param secretsRole An IAM role with permissions to access AWS KMS to decrypt the Secrets
       * Manager secret containing your OIDC client secret. 
       */
      public fun secretsRole(secretsRole: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.OpenIDConnectProviderConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.OpenIDConnectProviderConfigurationProperty.builder()

      /**
       * @param secretsArn The Amazon Resource Name (ARN) of a Secrets Manager secret containing the
       * OIDC client secret. 
       */
      override fun secretsArn(secretsArn: String) {
        cdkBuilder.secretsArn(secretsArn)
      }

      /**
       * @param secretsRole An IAM role with permissions to access AWS KMS to decrypt the Secrets
       * Manager secret containing your OIDC client secret. 
       */
      override fun secretsRole(secretsRole: String) {
        cdkBuilder.secretsRole(secretsRole)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.OpenIDConnectProviderConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperience.OpenIDConnectProviderConfigurationProperty,
    ) : CdkObject(cdkObject),
        OpenIDConnectProviderConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of a Secrets Manager secret containing the OIDC client
       * secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-openidconnectproviderconfiguration.html#cfn-qbusiness-webexperience-openidconnectproviderconfiguration-secretsarn)
       */
      override fun secretsArn(): String = unwrap(this).getSecretsArn()

      /**
       * An IAM role with permissions to access AWS KMS to decrypt the Secrets Manager secret
       * containing your OIDC client secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-openidconnectproviderconfiguration.html#cfn-qbusiness-webexperience-openidconnectproviderconfiguration-secretsrole)
       */
      override fun secretsRole(): String = unwrap(this).getSecretsRole()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OpenIDConnectProviderConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperience.OpenIDConnectProviderConfigurationProperty):
          OpenIDConnectProviderConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenIDConnectProviderConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenIDConnectProviderConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.OpenIDConnectProviderConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.OpenIDConnectProviderConfigurationProperty
    }
  }

  /**
   * Information about the SAML 2.0-compliant identity provider (IdP) used to authenticate end users
   * of an Amazon Q Business web experience.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * SamlProviderConfigurationProperty samlProviderConfigurationProperty =
   * SamlProviderConfigurationProperty.builder()
   * .authenticationUrl("authenticationUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-samlproviderconfiguration.html)
   */
  public interface SamlProviderConfigurationProperty {
    /**
     * The URL where Amazon Q Business end users will be redirected for authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-samlproviderconfiguration.html#cfn-qbusiness-webexperience-samlproviderconfiguration-authenticationurl)
     */
    public fun authenticationUrl(): String

    /**
     * A builder for [SamlProviderConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authenticationUrl The URL where Amazon Q Business end users will be redirected for
       * authentication. 
       */
      public fun authenticationUrl(authenticationUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.SamlProviderConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.SamlProviderConfigurationProperty.builder()

      /**
       * @param authenticationUrl The URL where Amazon Q Business end users will be redirected for
       * authentication. 
       */
      override fun authenticationUrl(authenticationUrl: String) {
        cdkBuilder.authenticationUrl(authenticationUrl)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.SamlProviderConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperience.SamlProviderConfigurationProperty,
    ) : CdkObject(cdkObject),
        SamlProviderConfigurationProperty {
      /**
       * The URL where Amazon Q Business end users will be redirected for authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-webexperience-samlproviderconfiguration.html#cfn-qbusiness-webexperience-samlproviderconfiguration-authenticationurl)
       */
      override fun authenticationUrl(): String = unwrap(this).getAuthenticationUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SamlProviderConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperience.SamlProviderConfigurationProperty):
          SamlProviderConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SamlProviderConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SamlProviderConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.SamlProviderConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnWebExperience.SamlProviderConfigurationProperty
    }
  }
}
