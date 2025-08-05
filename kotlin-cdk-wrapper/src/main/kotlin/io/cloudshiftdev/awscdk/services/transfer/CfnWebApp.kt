@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a web app based on specified parameters, and returns the ID for the new web app.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.transfer.*;
 * CfnWebApp cfnWebApp = CfnWebApp.Builder.create(this, "MyCfnWebApp")
 * .identityProviderDetails(IdentityProviderDetailsProperty.builder()
 * .applicationArn("applicationArn")
 * .instanceArn("instanceArn")
 * .role("role")
 * .build())
 * // the properties below are optional
 * .accessEndpoint("accessEndpoint")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .webAppCustomization(WebAppCustomizationProperty.builder()
 * .faviconFile("faviconFile")
 * .logoFile("logoFile")
 * .title("title")
 * .build())
 * .webAppEndpointPolicy("webAppEndpointPolicy")
 * .webAppUnits(WebAppUnitsProperty.builder()
 * .provisioned(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html)
 */
public open class CfnWebApp(
  cdkObject: software.amazon.awscdk.services.transfer.CfnWebApp,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWebAppProps,
  ) :
      this(software.amazon.awscdk.services.transfer.CfnWebApp(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnWebAppProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWebAppProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWebAppProps(props)
  )

  /**
   * The `AccessEndpoint` is the URL that you provide to your users for them to interact with the
   * Transfer Family web app.
   */
  public open fun accessEndpoint(): String? = unwrap(this).getAccessEndpoint()

  /**
   * The `AccessEndpoint` is the URL that you provide to your users for them to interact with the
   * Transfer Family web app.
   */
  public open fun accessEndpoint(`value`: String) {
    unwrap(this).setAccessEndpoint(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the web app.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Amazon Resource Name (ARN) for the IAM Identity Center application: this value is set
   * automatically when you create your web app.
   */
  public open fun attrIdentityProviderDetailsApplicationArn(): String =
      unwrap(this).getAttrIdentityProviderDetailsApplicationArn()

  /**
   * The unique identifier for the web app.
   */
  public open fun attrWebAppId(): String = unwrap(this).getAttrWebAppId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * You can provide a structure that contains the details for the identity provider to use with
   * your web app.
   */
  public open fun identityProviderDetails(): Any = unwrap(this).getIdentityProviderDetails()

  /**
   * You can provide a structure that contains the details for the identity provider to use with
   * your web app.
   */
  public open fun identityProviderDetails(`value`: IResolvable) {
    unwrap(this).setIdentityProviderDetails(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * You can provide a structure that contains the details for the identity provider to use with
   * your web app.
   */
  public open fun identityProviderDetails(`value`: IdentityProviderDetailsProperty) {
    unwrap(this).setIdentityProviderDetails(`value`.let(IdentityProviderDetailsProperty.Companion::unwrap))
  }

  /**
   * You can provide a structure that contains the details for the identity provider to use with
   * your web app.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0060fdebc452c710aca4f985348f7b4839bb00ea20cc5ae42b4cb22acc92cd60")
  public open
      fun identityProviderDetails(`value`: IdentityProviderDetailsProperty.Builder.() -> Unit): Unit
      = identityProviderDetails(IdentityProviderDetailsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Key-value pairs that can be used to group and search for web apps.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Key-value pairs that can be used to group and search for web apps.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Key-value pairs that can be used to group and search for web apps.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A structure that contains the customization fields for the web app.
   */
  public open fun webAppCustomization(): Any? = unwrap(this).getWebAppCustomization()

  /**
   * A structure that contains the customization fields for the web app.
   */
  public open fun webAppCustomization(`value`: IResolvable) {
    unwrap(this).setWebAppCustomization(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A structure that contains the customization fields for the web app.
   */
  public open fun webAppCustomization(`value`: WebAppCustomizationProperty) {
    unwrap(this).setWebAppCustomization(`value`.let(WebAppCustomizationProperty.Companion::unwrap))
  }

  /**
   * A structure that contains the customization fields for the web app.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cb526a85e89c018b6c41270bdd727f195cd660136abd5af9e750b32db0dbb173")
  public open fun webAppCustomization(`value`: WebAppCustomizationProperty.Builder.() -> Unit): Unit
      = webAppCustomization(WebAppCustomizationProperty(`value`))

  /**
   * Setting for the type of endpoint policy for the web app.
   *
   * The default value is `STANDARD` .
   */
  public open fun webAppEndpointPolicy(): String? = unwrap(this).getWebAppEndpointPolicy()

  /**
   * Setting for the type of endpoint policy for the web app.
   *
   * The default value is `STANDARD` .
   */
  public open fun webAppEndpointPolicy(`value`: String) {
    unwrap(this).setWebAppEndpointPolicy(`value`)
  }

  /**
   * A union that contains the value for number of concurrent connections or the user sessions on
   * your web app.
   */
  public open fun webAppUnits(): Any? = unwrap(this).getWebAppUnits()

  /**
   * A union that contains the value for number of concurrent connections or the user sessions on
   * your web app.
   */
  public open fun webAppUnits(`value`: IResolvable) {
    unwrap(this).setWebAppUnits(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A union that contains the value for number of concurrent connections or the user sessions on
   * your web app.
   */
  public open fun webAppUnits(`value`: WebAppUnitsProperty) {
    unwrap(this).setWebAppUnits(`value`.let(WebAppUnitsProperty.Companion::unwrap))
  }

  /**
   * A union that contains the value for number of concurrent connections or the user sessions on
   * your web app.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("70dea98b17f93e49cc00b6159416a8bcab8202b6fefdcc16fda38d5c49ec351e")
  public open fun webAppUnits(`value`: WebAppUnitsProperty.Builder.() -> Unit): Unit =
      webAppUnits(WebAppUnitsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.transfer.CfnWebApp].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The `AccessEndpoint` is the URL that you provide to your users for them to interact with the
     * Transfer Family web app.
     *
     * You can specify a custom URL or use the default value.
     *
     * Before you enter a custom URL for this parameter, follow the steps described in [Update your
     * access endpoint with a custom
     * URL](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-customize.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-accessendpoint)
     * @param accessEndpoint The `AccessEndpoint` is the URL that you provide to your users for them
     * to interact with the Transfer Family web app. 
     */
    public fun accessEndpoint(accessEndpoint: String)

    /**
     * You can provide a structure that contains the details for the identity provider to use with
     * your web app.
     *
     * For more details about this parameter, see [Configure your identity provider for Transfer
     * Family web
     * apps](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-identity-center.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-identityproviderdetails)
     * @param identityProviderDetails You can provide a structure that contains the details for the
     * identity provider to use with your web app. 
     */
    public fun identityProviderDetails(identityProviderDetails: IResolvable)

    /**
     * You can provide a structure that contains the details for the identity provider to use with
     * your web app.
     *
     * For more details about this parameter, see [Configure your identity provider for Transfer
     * Family web
     * apps](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-identity-center.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-identityproviderdetails)
     * @param identityProviderDetails You can provide a structure that contains the details for the
     * identity provider to use with your web app. 
     */
    public fun identityProviderDetails(identityProviderDetails: IdentityProviderDetailsProperty)

    /**
     * You can provide a structure that contains the details for the identity provider to use with
     * your web app.
     *
     * For more details about this parameter, see [Configure your identity provider for Transfer
     * Family web
     * apps](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-identity-center.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-identityproviderdetails)
     * @param identityProviderDetails You can provide a structure that contains the details for the
     * identity provider to use with your web app. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a0bb54f02448346ee7fc91880d895fa805abbf673984269e699f469dc992322")
    public
        fun identityProviderDetails(identityProviderDetails: IdentityProviderDetailsProperty.Builder.() -> Unit)

    /**
     * Key-value pairs that can be used to group and search for web apps.
     *
     * Tags are metadata attached to web apps for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-tags)
     * @param tags Key-value pairs that can be used to group and search for web apps. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Key-value pairs that can be used to group and search for web apps.
     *
     * Tags are metadata attached to web apps for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-tags)
     * @param tags Key-value pairs that can be used to group and search for web apps. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A structure that contains the customization fields for the web app.
     *
     * You can provide a title, logo, and icon to customize the appearance of your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappcustomization)
     * @param webAppCustomization A structure that contains the customization fields for the web
     * app. 
     */
    public fun webAppCustomization(webAppCustomization: IResolvable)

    /**
     * A structure that contains the customization fields for the web app.
     *
     * You can provide a title, logo, and icon to customize the appearance of your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappcustomization)
     * @param webAppCustomization A structure that contains the customization fields for the web
     * app. 
     */
    public fun webAppCustomization(webAppCustomization: WebAppCustomizationProperty)

    /**
     * A structure that contains the customization fields for the web app.
     *
     * You can provide a title, logo, and icon to customize the appearance of your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappcustomization)
     * @param webAppCustomization A structure that contains the customization fields for the web
     * app. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ae03b2fa7b590dc7d2f517dd30dd1c95b49e9f3977001624ae6d4fbcb822a9a")
    public
        fun webAppCustomization(webAppCustomization: WebAppCustomizationProperty.Builder.() -> Unit)

    /**
     * Setting for the type of endpoint policy for the web app. The default value is `STANDARD` .
     *
     * If your web app was created in an AWS GovCloud (US) Region , the value of this parameter can
     * be `FIPS` , which indicates the web app endpoint is FIPS-compliant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappendpointpolicy)
     * @param webAppEndpointPolicy Setting for the type of endpoint policy for the web app. The
     * default value is `STANDARD` . 
     */
    public fun webAppEndpointPolicy(webAppEndpointPolicy: String)

    /**
     * A union that contains the value for number of concurrent connections or the user sessions on
     * your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappunits)
     * @param webAppUnits A union that contains the value for number of concurrent connections or
     * the user sessions on your web app. 
     */
    public fun webAppUnits(webAppUnits: IResolvable)

    /**
     * A union that contains the value for number of concurrent connections or the user sessions on
     * your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappunits)
     * @param webAppUnits A union that contains the value for number of concurrent connections or
     * the user sessions on your web app. 
     */
    public fun webAppUnits(webAppUnits: WebAppUnitsProperty)

    /**
     * A union that contains the value for number of concurrent connections or the user sessions on
     * your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappunits)
     * @param webAppUnits A union that contains the value for number of concurrent connections or
     * the user sessions on your web app. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("498e38dbb5736ae80307e2bb8c52c1fc2191f7c8e0bd0ce114464b2af83a11c8")
    public fun webAppUnits(webAppUnits: WebAppUnitsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnWebApp.Builder =
        software.amazon.awscdk.services.transfer.CfnWebApp.Builder.create(scope, id)

    /**
     * The `AccessEndpoint` is the URL that you provide to your users for them to interact with the
     * Transfer Family web app.
     *
     * You can specify a custom URL or use the default value.
     *
     * Before you enter a custom URL for this parameter, follow the steps described in [Update your
     * access endpoint with a custom
     * URL](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-customize.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-accessendpoint)
     * @param accessEndpoint The `AccessEndpoint` is the URL that you provide to your users for them
     * to interact with the Transfer Family web app. 
     */
    override fun accessEndpoint(accessEndpoint: String) {
      cdkBuilder.accessEndpoint(accessEndpoint)
    }

    /**
     * You can provide a structure that contains the details for the identity provider to use with
     * your web app.
     *
     * For more details about this parameter, see [Configure your identity provider for Transfer
     * Family web
     * apps](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-identity-center.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-identityproviderdetails)
     * @param identityProviderDetails You can provide a structure that contains the details for the
     * identity provider to use with your web app. 
     */
    override fun identityProviderDetails(identityProviderDetails: IResolvable) {
      cdkBuilder.identityProviderDetails(identityProviderDetails.let(IResolvable.Companion::unwrap))
    }

    /**
     * You can provide a structure that contains the details for the identity provider to use with
     * your web app.
     *
     * For more details about this parameter, see [Configure your identity provider for Transfer
     * Family web
     * apps](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-identity-center.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-identityproviderdetails)
     * @param identityProviderDetails You can provide a structure that contains the details for the
     * identity provider to use with your web app. 
     */
    override fun identityProviderDetails(identityProviderDetails: IdentityProviderDetailsProperty) {
      cdkBuilder.identityProviderDetails(identityProviderDetails.let(IdentityProviderDetailsProperty.Companion::unwrap))
    }

    /**
     * You can provide a structure that contains the details for the identity provider to use with
     * your web app.
     *
     * For more details about this parameter, see [Configure your identity provider for Transfer
     * Family web
     * apps](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-identity-center.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-identityproviderdetails)
     * @param identityProviderDetails You can provide a structure that contains the details for the
     * identity provider to use with your web app. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a0bb54f02448346ee7fc91880d895fa805abbf673984269e699f469dc992322")
    override
        fun identityProviderDetails(identityProviderDetails: IdentityProviderDetailsProperty.Builder.() -> Unit):
        Unit = identityProviderDetails(IdentityProviderDetailsProperty(identityProviderDetails))

    /**
     * Key-value pairs that can be used to group and search for web apps.
     *
     * Tags are metadata attached to web apps for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-tags)
     * @param tags Key-value pairs that can be used to group and search for web apps. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Key-value pairs that can be used to group and search for web apps.
     *
     * Tags are metadata attached to web apps for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-tags)
     * @param tags Key-value pairs that can be used to group and search for web apps. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A structure that contains the customization fields for the web app.
     *
     * You can provide a title, logo, and icon to customize the appearance of your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappcustomization)
     * @param webAppCustomization A structure that contains the customization fields for the web
     * app. 
     */
    override fun webAppCustomization(webAppCustomization: IResolvable) {
      cdkBuilder.webAppCustomization(webAppCustomization.let(IResolvable.Companion::unwrap))
    }

    /**
     * A structure that contains the customization fields for the web app.
     *
     * You can provide a title, logo, and icon to customize the appearance of your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappcustomization)
     * @param webAppCustomization A structure that contains the customization fields for the web
     * app. 
     */
    override fun webAppCustomization(webAppCustomization: WebAppCustomizationProperty) {
      cdkBuilder.webAppCustomization(webAppCustomization.let(WebAppCustomizationProperty.Companion::unwrap))
    }

    /**
     * A structure that contains the customization fields for the web app.
     *
     * You can provide a title, logo, and icon to customize the appearance of your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappcustomization)
     * @param webAppCustomization A structure that contains the customization fields for the web
     * app. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ae03b2fa7b590dc7d2f517dd30dd1c95b49e9f3977001624ae6d4fbcb822a9a")
    override
        fun webAppCustomization(webAppCustomization: WebAppCustomizationProperty.Builder.() -> Unit):
        Unit = webAppCustomization(WebAppCustomizationProperty(webAppCustomization))

    /**
     * Setting for the type of endpoint policy for the web app. The default value is `STANDARD` .
     *
     * If your web app was created in an AWS GovCloud (US) Region , the value of this parameter can
     * be `FIPS` , which indicates the web app endpoint is FIPS-compliant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappendpointpolicy)
     * @param webAppEndpointPolicy Setting for the type of endpoint policy for the web app. The
     * default value is `STANDARD` . 
     */
    override fun webAppEndpointPolicy(webAppEndpointPolicy: String) {
      cdkBuilder.webAppEndpointPolicy(webAppEndpointPolicy)
    }

    /**
     * A union that contains the value for number of concurrent connections or the user sessions on
     * your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappunits)
     * @param webAppUnits A union that contains the value for number of concurrent connections or
     * the user sessions on your web app. 
     */
    override fun webAppUnits(webAppUnits: IResolvable) {
      cdkBuilder.webAppUnits(webAppUnits.let(IResolvable.Companion::unwrap))
    }

    /**
     * A union that contains the value for number of concurrent connections or the user sessions on
     * your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappunits)
     * @param webAppUnits A union that contains the value for number of concurrent connections or
     * the user sessions on your web app. 
     */
    override fun webAppUnits(webAppUnits: WebAppUnitsProperty) {
      cdkBuilder.webAppUnits(webAppUnits.let(WebAppUnitsProperty.Companion::unwrap))
    }

    /**
     * A union that contains the value for number of concurrent connections or the user sessions on
     * your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappunits)
     * @param webAppUnits A union that contains the value for number of concurrent connections or
     * the user sessions on your web app. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("498e38dbb5736ae80307e2bb8c52c1fc2191f7c8e0bd0ce114464b2af83a11c8")
    override fun webAppUnits(webAppUnits: WebAppUnitsProperty.Builder.() -> Unit): Unit =
        webAppUnits(WebAppUnitsProperty(webAppUnits))

    public fun build(): software.amazon.awscdk.services.transfer.CfnWebApp = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.transfer.CfnWebApp.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWebApp {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWebApp(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWebApp): CfnWebApp =
        CfnWebApp(cdkObject)

    internal fun unwrap(wrapped: CfnWebApp): software.amazon.awscdk.services.transfer.CfnWebApp =
        wrapped.cdkObject as software.amazon.awscdk.services.transfer.CfnWebApp
  }

  /**
   * A structure that describes the values to use for the IAM Identity Center settings when you
   * create or update a web app.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * IdentityProviderDetailsProperty identityProviderDetailsProperty =
   * IdentityProviderDetailsProperty.builder()
   * .applicationArn("applicationArn")
   * .instanceArn("instanceArn")
   * .role("role")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-identityproviderdetails.html)
   */
  public interface IdentityProviderDetailsProperty {
    /**
     * The Amazon Resource Name (ARN) for the IAM Identity Center application: this value is set
     * automatically when you create your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-identityproviderdetails.html#cfn-transfer-webapp-identityproviderdetails-applicationarn)
     */
    public fun applicationArn(): String? = unwrap(this).getApplicationArn()

    /**
     * The Amazon Resource Name (ARN) for the IAM Identity Center used for the web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-identityproviderdetails.html#cfn-transfer-webapp-identityproviderdetails-instancearn)
     */
    public fun instanceArn(): String? = unwrap(this).getInstanceArn()

    /**
     * The IAM role in IAM Identity Center used for the web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-identityproviderdetails.html#cfn-transfer-webapp-identityproviderdetails-role)
     */
    public fun role(): String? = unwrap(this).getRole()

    /**
     * A builder for [IdentityProviderDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationArn The Amazon Resource Name (ARN) for the IAM Identity Center
       * application: this value is set automatically when you create your web app.
       */
      public fun applicationArn(applicationArn: String)

      /**
       * @param instanceArn The Amazon Resource Name (ARN) for the IAM Identity Center used for the
       * web app.
       */
      public fun instanceArn(instanceArn: String)

      /**
       * @param role The IAM role in IAM Identity Center used for the web app.
       */
      public fun role(role: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWebApp.IdentityProviderDetailsProperty.Builder
          =
          software.amazon.awscdk.services.transfer.CfnWebApp.IdentityProviderDetailsProperty.builder()

      /**
       * @param applicationArn The Amazon Resource Name (ARN) for the IAM Identity Center
       * application: this value is set automatically when you create your web app.
       */
      override fun applicationArn(applicationArn: String) {
        cdkBuilder.applicationArn(applicationArn)
      }

      /**
       * @param instanceArn The Amazon Resource Name (ARN) for the IAM Identity Center used for the
       * web app.
       */
      override fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
      }

      /**
       * @param role The IAM role in IAM Identity Center used for the web app.
       */
      override fun role(role: String) {
        cdkBuilder.role(role)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWebApp.IdentityProviderDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnWebApp.IdentityProviderDetailsProperty,
    ) : CdkObject(cdkObject),
        IdentityProviderDetailsProperty {
      /**
       * The Amazon Resource Name (ARN) for the IAM Identity Center application: this value is set
       * automatically when you create your web app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-identityproviderdetails.html#cfn-transfer-webapp-identityproviderdetails-applicationarn)
       */
      override fun applicationArn(): String? = unwrap(this).getApplicationArn()

      /**
       * The Amazon Resource Name (ARN) for the IAM Identity Center used for the web app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-identityproviderdetails.html#cfn-transfer-webapp-identityproviderdetails-instancearn)
       */
      override fun instanceArn(): String? = unwrap(this).getInstanceArn()

      /**
       * The IAM role in IAM Identity Center used for the web app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-identityproviderdetails.html#cfn-transfer-webapp-identityproviderdetails-role)
       */
      override fun role(): String? = unwrap(this).getRole()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IdentityProviderDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWebApp.IdentityProviderDetailsProperty):
          IdentityProviderDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdentityProviderDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdentityProviderDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnWebApp.IdentityProviderDetailsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnWebApp.IdentityProviderDetailsProperty
    }
  }

  /**
   * A structure that contains the customization fields for the web app.
   *
   * You can provide a title, logo, and icon to customize the appearance of your web app.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * WebAppCustomizationProperty webAppCustomizationProperty = WebAppCustomizationProperty.builder()
   * .faviconFile("faviconFile")
   * .logoFile("logoFile")
   * .title("title")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-webappcustomization.html)
   */
  public interface WebAppCustomizationProperty {
    /**
     * Returns an icon file data string (in base64 encoding).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-webappcustomization.html#cfn-transfer-webapp-webappcustomization-faviconfile)
     */
    public fun faviconFile(): String? = unwrap(this).getFaviconFile()

    /**
     * Returns a logo file data string (in base64 encoding).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-webappcustomization.html#cfn-transfer-webapp-webappcustomization-logofile)
     */
    public fun logoFile(): String? = unwrap(this).getLogoFile()

    /**
     * Returns the page title that you defined for your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-webappcustomization.html#cfn-transfer-webapp-webappcustomization-title)
     */
    public fun title(): String? = unwrap(this).getTitle()

    /**
     * A builder for [WebAppCustomizationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param faviconFile Returns an icon file data string (in base64 encoding).
       */
      public fun faviconFile(faviconFile: String)

      /**
       * @param logoFile Returns a logo file data string (in base64 encoding).
       */
      public fun logoFile(logoFile: String)

      /**
       * @param title Returns the page title that you defined for your web app.
       */
      public fun title(title: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWebApp.WebAppCustomizationProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWebApp.WebAppCustomizationProperty.builder()

      /**
       * @param faviconFile Returns an icon file data string (in base64 encoding).
       */
      override fun faviconFile(faviconFile: String) {
        cdkBuilder.faviconFile(faviconFile)
      }

      /**
       * @param logoFile Returns a logo file data string (in base64 encoding).
       */
      override fun logoFile(logoFile: String) {
        cdkBuilder.logoFile(logoFile)
      }

      /**
       * @param title Returns the page title that you defined for your web app.
       */
      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWebApp.WebAppCustomizationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnWebApp.WebAppCustomizationProperty,
    ) : CdkObject(cdkObject),
        WebAppCustomizationProperty {
      /**
       * Returns an icon file data string (in base64 encoding).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-webappcustomization.html#cfn-transfer-webapp-webappcustomization-faviconfile)
       */
      override fun faviconFile(): String? = unwrap(this).getFaviconFile()

      /**
       * Returns a logo file data string (in base64 encoding).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-webappcustomization.html#cfn-transfer-webapp-webappcustomization-logofile)
       */
      override fun logoFile(): String? = unwrap(this).getLogoFile()

      /**
       * Returns the page title that you defined for your web app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-webappcustomization.html#cfn-transfer-webapp-webappcustomization-title)
       */
      override fun title(): String? = unwrap(this).getTitle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WebAppCustomizationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWebApp.WebAppCustomizationProperty):
          WebAppCustomizationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WebAppCustomizationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebAppCustomizationProperty):
          software.amazon.awscdk.services.transfer.CfnWebApp.WebAppCustomizationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnWebApp.WebAppCustomizationProperty
    }
  }

  /**
   * Contains an integer value that represents the value for number of concurrent connections or the
   * user sessions on your web app.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * WebAppUnitsProperty webAppUnitsProperty = WebAppUnitsProperty.builder()
   * .provisioned(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-webappunits.html)
   */
  public interface WebAppUnitsProperty {
    /**
     * An integer that represents the number of units for your desired number of concurrent
     * connections, or the number of user sessions on your web app at the same time.
     *
     * Each increment allows an additional 250 concurrent sessions: a value of `1` sets the number
     * of concurrent sessions to 250; `2` sets a value of 500, and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-webappunits.html#cfn-transfer-webapp-webappunits-provisioned)
     */
    public fun provisioned(): Number

    /**
     * A builder for [WebAppUnitsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param provisioned An integer that represents the number of units for your desired number
       * of concurrent connections, or the number of user sessions on your web app at the same time. 
       * Each increment allows an additional 250 concurrent sessions: a value of `1` sets the number
       * of concurrent sessions to 250; `2` sets a value of 500, and so on.
       */
      public fun provisioned(provisioned: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWebApp.WebAppUnitsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWebApp.WebAppUnitsProperty.builder()

      /**
       * @param provisioned An integer that represents the number of units for your desired number
       * of concurrent connections, or the number of user sessions on your web app at the same time. 
       * Each increment allows an additional 250 concurrent sessions: a value of `1` sets the number
       * of concurrent sessions to 250; `2` sets a value of 500, and so on.
       */
      override fun provisioned(provisioned: Number) {
        cdkBuilder.provisioned(provisioned)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnWebApp.WebAppUnitsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnWebApp.WebAppUnitsProperty,
    ) : CdkObject(cdkObject),
        WebAppUnitsProperty {
      /**
       * An integer that represents the number of units for your desired number of concurrent
       * connections, or the number of user sessions on your web app at the same time.
       *
       * Each increment allows an additional 250 concurrent sessions: a value of `1` sets the number
       * of concurrent sessions to 250; `2` sets a value of 500, and so on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-webapp-webappunits.html#cfn-transfer-webapp-webappunits-provisioned)
       */
      override fun provisioned(): Number = unwrap(this).getProvisioned()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WebAppUnitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWebApp.WebAppUnitsProperty):
          WebAppUnitsProperty = CdkObjectWrappers.wrap(cdkObject) as? WebAppUnitsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebAppUnitsProperty):
          software.amazon.awscdk.services.transfer.CfnWebApp.WebAppUnitsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnWebApp.WebAppUnitsProperty
    }
  }
}
