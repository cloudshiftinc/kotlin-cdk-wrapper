@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

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
 * Creates an OAuth 2.0 customer managed application in IAM Identity Center for the given
 * application provider.
 *
 *
 * This API does not support creating SAML 2.0 customer managed applications or AWS managed
 * applications. To learn how to create an AWS managed application, see the application user guide. You
 * can create a SAML 2.0 customer managed application in the AWS Management Console only. See [Setting
 * up customer managed SAML 2.0
 * applications](https://docs.aws.amazon.com/singlesignon/latest/userguide/customermanagedapps-saml2-setup.html)
 * . For more information on these application types, see [AWS managed
 * applications](https://docs.aws.amazon.com/singlesignon/latest/userguide/awsapps.html) .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sso.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .applicationProviderArn("applicationProviderArn")
 * .instanceArn("instanceArn")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .portalOptions(PortalOptionsConfigurationProperty.builder()
 * .signInOptions(SignInOptionsProperty.builder()
 * .origin("origin")
 * // the properties below are optional
 * .applicationUrl("applicationUrl")
 * .build())
 * .visibility("visibility")
 * .build())
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html)
 */
public open class CfnApplication(
  cdkObject: software.amazon.awscdk.services.sso.CfnApplication,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps,
  ) :
      this(software.amazon.awscdk.services.sso.CfnApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationProps(props)
  )

  /**
   * The ARN of the application provider for this application.
   */
  public open fun applicationProviderArn(): String = unwrap(this).getApplicationProviderArn()

  /**
   * The ARN of the application provider for this application.
   */
  public open fun applicationProviderArn(`value`: String) {
    unwrap(this).setApplicationProviderArn(`value`)
  }

  /**
   * The ARN of the application.
   */
  public open fun attrApplicationArn(): String = unwrap(this).getAttrApplicationArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the application.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the application.
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
   * The ARN of the instance of IAM Identity Center that is configured with this application.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The ARN of the instance of IAM Identity Center that is configured with this application.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * The name of the application.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the application.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A structure that describes the options for the access portal associated with this application.
   */
  public open fun portalOptions(): Any? = unwrap(this).getPortalOptions()

  /**
   * A structure that describes the options for the access portal associated with this application.
   */
  public open fun portalOptions(`value`: IResolvable) {
    unwrap(this).setPortalOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A structure that describes the options for the access portal associated with this application.
   */
  public open fun portalOptions(`value`: PortalOptionsConfigurationProperty) {
    unwrap(this).setPortalOptions(`value`.let(PortalOptionsConfigurationProperty.Companion::unwrap))
  }

  /**
   * A structure that describes the options for the access portal associated with this application.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4174d0d037f9fc5cc83e088f06e2f24a46993e6e6d2faa945abdfa818a35f353")
  public open fun portalOptions(`value`: PortalOptionsConfigurationProperty.Builder.() -> Unit):
      Unit = portalOptions(PortalOptionsConfigurationProperty(`value`))

  /**
   * The current status of the application in this instance of IAM Identity Center.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * The current status of the application in this instance of IAM Identity Center.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * Specifies tags to be attached to the application.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies tags to be attached to the application.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Specifies tags to be attached to the application.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sso.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the application provider for this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-applicationproviderarn)
     * @param applicationProviderArn The ARN of the application provider for this application. 
     */
    public fun applicationProviderArn(applicationProviderArn: String)

    /**
     * The description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-description)
     * @param description The description of the application. 
     */
    public fun description(description: String)

    /**
     * The ARN of the instance of IAM Identity Center that is configured with this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-instancearn)
     * @param instanceArn The ARN of the instance of IAM Identity Center that is configured with
     * this application. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-name)
     * @param name The name of the application. 
     */
    public fun name(name: String)

    /**
     * A structure that describes the options for the access portal associated with this
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-portaloptions)
     * @param portalOptions A structure that describes the options for the access portal associated
     * with this application. 
     */
    public fun portalOptions(portalOptions: IResolvable)

    /**
     * A structure that describes the options for the access portal associated with this
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-portaloptions)
     * @param portalOptions A structure that describes the options for the access portal associated
     * with this application. 
     */
    public fun portalOptions(portalOptions: PortalOptionsConfigurationProperty)

    /**
     * A structure that describes the options for the access portal associated with this
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-portaloptions)
     * @param portalOptions A structure that describes the options for the access portal associated
     * with this application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b2ba2144e799e6f44f0bc8cfb4889a8c85e2c047da9fa4a2190bd752fbd896c")
    public fun portalOptions(portalOptions: PortalOptionsConfigurationProperty.Builder.() -> Unit)

    /**
     * The current status of the application in this instance of IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-status)
     * @param status The current status of the application in this instance of IAM Identity Center. 
     */
    public fun status(status: String)

    /**
     * Specifies tags to be attached to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-tags)
     * @param tags Specifies tags to be attached to the application. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies tags to be attached to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-tags)
     * @param tags Specifies tags to be attached to the application. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sso.CfnApplication.Builder =
        software.amazon.awscdk.services.sso.CfnApplication.Builder.create(scope, id)

    /**
     * The ARN of the application provider for this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-applicationproviderarn)
     * @param applicationProviderArn The ARN of the application provider for this application. 
     */
    override fun applicationProviderArn(applicationProviderArn: String) {
      cdkBuilder.applicationProviderArn(applicationProviderArn)
    }

    /**
     * The description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-description)
     * @param description The description of the application. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ARN of the instance of IAM Identity Center that is configured with this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-instancearn)
     * @param instanceArn The ARN of the instance of IAM Identity Center that is configured with
     * this application. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-name)
     * @param name The name of the application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A structure that describes the options for the access portal associated with this
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-portaloptions)
     * @param portalOptions A structure that describes the options for the access portal associated
     * with this application. 
     */
    override fun portalOptions(portalOptions: IResolvable) {
      cdkBuilder.portalOptions(portalOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * A structure that describes the options for the access portal associated with this
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-portaloptions)
     * @param portalOptions A structure that describes the options for the access portal associated
     * with this application. 
     */
    override fun portalOptions(portalOptions: PortalOptionsConfigurationProperty) {
      cdkBuilder.portalOptions(portalOptions.let(PortalOptionsConfigurationProperty.Companion::unwrap))
    }

    /**
     * A structure that describes the options for the access portal associated with this
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-portaloptions)
     * @param portalOptions A structure that describes the options for the access portal associated
     * with this application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b2ba2144e799e6f44f0bc8cfb4889a8c85e2c047da9fa4a2190bd752fbd896c")
    override
        fun portalOptions(portalOptions: PortalOptionsConfigurationProperty.Builder.() -> Unit):
        Unit = portalOptions(PortalOptionsConfigurationProperty(portalOptions))

    /**
     * The current status of the application in this instance of IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-status)
     * @param status The current status of the application in this instance of IAM Identity Center. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * Specifies tags to be attached to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-tags)
     * @param tags Specifies tags to be attached to the application. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Specifies tags to be attached to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-tags)
     * @param tags Specifies tags to be attached to the application. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sso.CfnApplication = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sso.CfnApplication.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnApplication): CfnApplication
        = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication): software.amazon.awscdk.services.sso.CfnApplication
        = wrapped.cdkObject as software.amazon.awscdk.services.sso.CfnApplication
  }

  /**
   * A structure that describes the options for the portal associated with an application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sso.*;
   * PortalOptionsConfigurationProperty portalOptionsConfigurationProperty =
   * PortalOptionsConfigurationProperty.builder()
   * .signInOptions(SignInOptionsProperty.builder()
   * .origin("origin")
   * // the properties below are optional
   * .applicationUrl("applicationUrl")
   * .build())
   * .visibility("visibility")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-application-portaloptionsconfiguration.html)
   */
  public interface PortalOptionsConfigurationProperty {
    /**
     * A structure that describes the sign-in options for the access portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-application-portaloptionsconfiguration.html#cfn-sso-application-portaloptionsconfiguration-signinoptions)
     */
    public fun signInOptions(): Any? = unwrap(this).getSignInOptions()

    /**
     * Indicates whether this application is visible in the access portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-application-portaloptionsconfiguration.html#cfn-sso-application-portaloptionsconfiguration-visibility)
     */
    public fun visibility(): String? = unwrap(this).getVisibility()

    /**
     * A builder for [PortalOptionsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param signInOptions A structure that describes the sign-in options for the access portal.
       */
      public fun signInOptions(signInOptions: IResolvable)

      /**
       * @param signInOptions A structure that describes the sign-in options for the access portal.
       */
      public fun signInOptions(signInOptions: SignInOptionsProperty)

      /**
       * @param signInOptions A structure that describes the sign-in options for the access portal.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f2d01800bc36191365c5f660cc44e767cf666f294fbe85e3ccfd581cd5e1d67")
      public fun signInOptions(signInOptions: SignInOptionsProperty.Builder.() -> Unit)

      /**
       * @param visibility Indicates whether this application is visible in the access portal.
       */
      public fun visibility(visibility: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sso.CfnApplication.PortalOptionsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.sso.CfnApplication.PortalOptionsConfigurationProperty.builder()

      /**
       * @param signInOptions A structure that describes the sign-in options for the access portal.
       */
      override fun signInOptions(signInOptions: IResolvable) {
        cdkBuilder.signInOptions(signInOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param signInOptions A structure that describes the sign-in options for the access portal.
       */
      override fun signInOptions(signInOptions: SignInOptionsProperty) {
        cdkBuilder.signInOptions(signInOptions.let(SignInOptionsProperty.Companion::unwrap))
      }

      /**
       * @param signInOptions A structure that describes the sign-in options for the access portal.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f2d01800bc36191365c5f660cc44e767cf666f294fbe85e3ccfd581cd5e1d67")
      override fun signInOptions(signInOptions: SignInOptionsProperty.Builder.() -> Unit): Unit =
          signInOptions(SignInOptionsProperty(signInOptions))

      /**
       * @param visibility Indicates whether this application is visible in the access portal.
       */
      override fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
      }

      public fun build():
          software.amazon.awscdk.services.sso.CfnApplication.PortalOptionsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sso.CfnApplication.PortalOptionsConfigurationProperty,
    ) : CdkObject(cdkObject),
        PortalOptionsConfigurationProperty {
      /**
       * A structure that describes the sign-in options for the access portal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-application-portaloptionsconfiguration.html#cfn-sso-application-portaloptionsconfiguration-signinoptions)
       */
      override fun signInOptions(): Any? = unwrap(this).getSignInOptions()

      /**
       * Indicates whether this application is visible in the access portal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-application-portaloptionsconfiguration.html#cfn-sso-application-portaloptionsconfiguration-visibility)
       */
      override fun visibility(): String? = unwrap(this).getVisibility()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PortalOptionsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnApplication.PortalOptionsConfigurationProperty):
          PortalOptionsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PortalOptionsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortalOptionsConfigurationProperty):
          software.amazon.awscdk.services.sso.CfnApplication.PortalOptionsConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sso.CfnApplication.PortalOptionsConfigurationProperty
    }
  }

  /**
   * A structure that describes the sign-in options for an application portal.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sso.*;
   * SignInOptionsProperty signInOptionsProperty = SignInOptionsProperty.builder()
   * .origin("origin")
   * // the properties below are optional
   * .applicationUrl("applicationUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-application-signinoptions.html)
   */
  public interface SignInOptionsProperty {
    /**
     * The URL that accepts authentication requests for an application.
     *
     * This is a required parameter if the `Origin` parameter is `APPLICATION` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-application-signinoptions.html#cfn-sso-application-signinoptions-applicationurl)
     */
    public fun applicationUrl(): String? = unwrap(this).getApplicationUrl()

    /**
     * This determines how IAM Identity Center navigates the user to the target application.
     *
     * It can be one of the following values:
     *
     * * `APPLICATION` : IAM Identity Center redirects the customer to the configured
     * `ApplicationUrl` .
     * * `IDENTITY_CENTER` : IAM Identity Center uses SAML identity-provider initiated
     * authentication to sign the customer directly into a SAML-based application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-application-signinoptions.html#cfn-sso-application-signinoptions-origin)
     */
    public fun origin(): String

    /**
     * A builder for [SignInOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationUrl The URL that accepts authentication requests for an application.
       * This is a required parameter if the `Origin` parameter is `APPLICATION` .
       */
      public fun applicationUrl(applicationUrl: String)

      /**
       * @param origin This determines how IAM Identity Center navigates the user to the target
       * application. 
       * It can be one of the following values:
       *
       * * `APPLICATION` : IAM Identity Center redirects the customer to the configured
       * `ApplicationUrl` .
       * * `IDENTITY_CENTER` : IAM Identity Center uses SAML identity-provider initiated
       * authentication to sign the customer directly into a SAML-based application.
       */
      public fun origin(origin: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sso.CfnApplication.SignInOptionsProperty.Builder =
          software.amazon.awscdk.services.sso.CfnApplication.SignInOptionsProperty.builder()

      /**
       * @param applicationUrl The URL that accepts authentication requests for an application.
       * This is a required parameter if the `Origin` parameter is `APPLICATION` .
       */
      override fun applicationUrl(applicationUrl: String) {
        cdkBuilder.applicationUrl(applicationUrl)
      }

      /**
       * @param origin This determines how IAM Identity Center navigates the user to the target
       * application. 
       * It can be one of the following values:
       *
       * * `APPLICATION` : IAM Identity Center redirects the customer to the configured
       * `ApplicationUrl` .
       * * `IDENTITY_CENTER` : IAM Identity Center uses SAML identity-provider initiated
       * authentication to sign the customer directly into a SAML-based application.
       */
      override fun origin(origin: String) {
        cdkBuilder.origin(origin)
      }

      public fun build(): software.amazon.awscdk.services.sso.CfnApplication.SignInOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sso.CfnApplication.SignInOptionsProperty,
    ) : CdkObject(cdkObject),
        SignInOptionsProperty {
      /**
       * The URL that accepts authentication requests for an application.
       *
       * This is a required parameter if the `Origin` parameter is `APPLICATION` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-application-signinoptions.html#cfn-sso-application-signinoptions-applicationurl)
       */
      override fun applicationUrl(): String? = unwrap(this).getApplicationUrl()

      /**
       * This determines how IAM Identity Center navigates the user to the target application.
       *
       * It can be one of the following values:
       *
       * * `APPLICATION` : IAM Identity Center redirects the customer to the configured
       * `ApplicationUrl` .
       * * `IDENTITY_CENTER` : IAM Identity Center uses SAML identity-provider initiated
       * authentication to sign the customer directly into a SAML-based application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-application-signinoptions.html#cfn-sso-application-signinoptions-origin)
       */
      override fun origin(): String = unwrap(this).getOrigin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SignInOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnApplication.SignInOptionsProperty):
          SignInOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? SignInOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SignInOptionsProperty):
          software.amazon.awscdk.services.sso.CfnApplication.SignInOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sso.CfnApplication.SignInOptionsProperty
    }
  }
}
