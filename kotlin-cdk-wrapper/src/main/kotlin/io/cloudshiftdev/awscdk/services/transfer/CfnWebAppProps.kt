@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnWebApp`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.transfer.*;
 * CfnWebAppProps cfnWebAppProps = CfnWebAppProps.builder()
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
public interface CfnWebAppProps {
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
   */
  public fun accessEndpoint(): String? = unwrap(this).getAccessEndpoint()

  /**
   * You can provide a structure that contains the details for the identity provider to use with
   * your web app.
   *
   * For more details about this parameter, see [Configure your identity provider for Transfer
   * Family web
   * apps](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-identity-center.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-identityproviderdetails)
   */
  public fun identityProviderDetails(): Any

  /**
   * Key-value pairs that can be used to group and search for web apps.
   *
   * Tags are metadata attached to web apps for any purpose.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A structure that contains the customization fields for the web app.
   *
   * You can provide a title, logo, and icon to customize the appearance of your web app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappcustomization)
   */
  public fun webAppCustomization(): Any? = unwrap(this).getWebAppCustomization()

  /**
   * Setting for the type of endpoint policy for the web app. The default value is `STANDARD` .
   *
   * If your web app was created in an AWS GovCloud (US) Region , the value of this parameter can be
   * `FIPS` , which indicates the web app endpoint is FIPS-compliant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappendpointpolicy)
   */
  public fun webAppEndpointPolicy(): String? = unwrap(this).getWebAppEndpointPolicy()

  /**
   * A union that contains the value for number of concurrent connections or the user sessions on
   * your web app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappunits)
   */
  public fun webAppUnits(): Any? = unwrap(this).getWebAppUnits()

  /**
   * A builder for [CfnWebAppProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessEndpoint The `AccessEndpoint` is the URL that you provide to your users for them
     * to interact with the Transfer Family web app.
     * You can specify a custom URL or use the default value.
     *
     * Before you enter a custom URL for this parameter, follow the steps described in [Update your
     * access endpoint with a custom
     * URL](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-customize.html) .
     */
    public fun accessEndpoint(accessEndpoint: String)

    /**
     * @param identityProviderDetails You can provide a structure that contains the details for the
     * identity provider to use with your web app. 
     * For more details about this parameter, see [Configure your identity provider for Transfer
     * Family web
     * apps](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-identity-center.html) .
     */
    public fun identityProviderDetails(identityProviderDetails: IResolvable)

    /**
     * @param identityProviderDetails You can provide a structure that contains the details for the
     * identity provider to use with your web app. 
     * For more details about this parameter, see [Configure your identity provider for Transfer
     * Family web
     * apps](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-identity-center.html) .
     */
    public
        fun identityProviderDetails(identityProviderDetails: CfnWebApp.IdentityProviderDetailsProperty)

    /**
     * @param identityProviderDetails You can provide a structure that contains the details for the
     * identity provider to use with your web app. 
     * For more details about this parameter, see [Configure your identity provider for Transfer
     * Family web
     * apps](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-identity-center.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8384cace306ee8166fe85aa19e951fd237553f476b2dfeb6445a39a4173152e6")
    public
        fun identityProviderDetails(identityProviderDetails: CfnWebApp.IdentityProviderDetailsProperty.Builder.() -> Unit)

    /**
     * @param tags Key-value pairs that can be used to group and search for web apps.
     * Tags are metadata attached to web apps for any purpose.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key-value pairs that can be used to group and search for web apps.
     * Tags are metadata attached to web apps for any purpose.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param webAppCustomization A structure that contains the customization fields for the web
     * app.
     * You can provide a title, logo, and icon to customize the appearance of your web app.
     */
    public fun webAppCustomization(webAppCustomization: IResolvable)

    /**
     * @param webAppCustomization A structure that contains the customization fields for the web
     * app.
     * You can provide a title, logo, and icon to customize the appearance of your web app.
     */
    public fun webAppCustomization(webAppCustomization: CfnWebApp.WebAppCustomizationProperty)

    /**
     * @param webAppCustomization A structure that contains the customization fields for the web
     * app.
     * You can provide a title, logo, and icon to customize the appearance of your web app.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a9530d90bac3db0312a93b38e147843c79f8bebcdcd51336e4b5f877de18400")
    public
        fun webAppCustomization(webAppCustomization: CfnWebApp.WebAppCustomizationProperty.Builder.() -> Unit)

    /**
     * @param webAppEndpointPolicy Setting for the type of endpoint policy for the web app. The
     * default value is `STANDARD` .
     * If your web app was created in an AWS GovCloud (US) Region , the value of this parameter can
     * be `FIPS` , which indicates the web app endpoint is FIPS-compliant.
     */
    public fun webAppEndpointPolicy(webAppEndpointPolicy: String)

    /**
     * @param webAppUnits A union that contains the value for number of concurrent connections or
     * the user sessions on your web app.
     */
    public fun webAppUnits(webAppUnits: IResolvable)

    /**
     * @param webAppUnits A union that contains the value for number of concurrent connections or
     * the user sessions on your web app.
     */
    public fun webAppUnits(webAppUnits: CfnWebApp.WebAppUnitsProperty)

    /**
     * @param webAppUnits A union that contains the value for number of concurrent connections or
     * the user sessions on your web app.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d74d53d8e096cb1c33a89f12d5af8b00f46e3daffc97fcfab6af5571d90e028e")
    public fun webAppUnits(webAppUnits: CfnWebApp.WebAppUnitsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnWebAppProps.Builder =
        software.amazon.awscdk.services.transfer.CfnWebAppProps.builder()

    /**
     * @param accessEndpoint The `AccessEndpoint` is the URL that you provide to your users for them
     * to interact with the Transfer Family web app.
     * You can specify a custom URL or use the default value.
     *
     * Before you enter a custom URL for this parameter, follow the steps described in [Update your
     * access endpoint with a custom
     * URL](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-customize.html) .
     */
    override fun accessEndpoint(accessEndpoint: String) {
      cdkBuilder.accessEndpoint(accessEndpoint)
    }

    /**
     * @param identityProviderDetails You can provide a structure that contains the details for the
     * identity provider to use with your web app. 
     * For more details about this parameter, see [Configure your identity provider for Transfer
     * Family web
     * apps](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-identity-center.html) .
     */
    override fun identityProviderDetails(identityProviderDetails: IResolvable) {
      cdkBuilder.identityProviderDetails(identityProviderDetails.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param identityProviderDetails You can provide a structure that contains the details for the
     * identity provider to use with your web app. 
     * For more details about this parameter, see [Configure your identity provider for Transfer
     * Family web
     * apps](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-identity-center.html) .
     */
    override
        fun identityProviderDetails(identityProviderDetails: CfnWebApp.IdentityProviderDetailsProperty) {
      cdkBuilder.identityProviderDetails(identityProviderDetails.let(CfnWebApp.IdentityProviderDetailsProperty.Companion::unwrap))
    }

    /**
     * @param identityProviderDetails You can provide a structure that contains the details for the
     * identity provider to use with your web app. 
     * For more details about this parameter, see [Configure your identity provider for Transfer
     * Family web
     * apps](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-identity-center.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8384cace306ee8166fe85aa19e951fd237553f476b2dfeb6445a39a4173152e6")
    override
        fun identityProviderDetails(identityProviderDetails: CfnWebApp.IdentityProviderDetailsProperty.Builder.() -> Unit):
        Unit =
        identityProviderDetails(CfnWebApp.IdentityProviderDetailsProperty(identityProviderDetails))

    /**
     * @param tags Key-value pairs that can be used to group and search for web apps.
     * Tags are metadata attached to web apps for any purpose.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Key-value pairs that can be used to group and search for web apps.
     * Tags are metadata attached to web apps for any purpose.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param webAppCustomization A structure that contains the customization fields for the web
     * app.
     * You can provide a title, logo, and icon to customize the appearance of your web app.
     */
    override fun webAppCustomization(webAppCustomization: IResolvable) {
      cdkBuilder.webAppCustomization(webAppCustomization.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param webAppCustomization A structure that contains the customization fields for the web
     * app.
     * You can provide a title, logo, and icon to customize the appearance of your web app.
     */
    override fun webAppCustomization(webAppCustomization: CfnWebApp.WebAppCustomizationProperty) {
      cdkBuilder.webAppCustomization(webAppCustomization.let(CfnWebApp.WebAppCustomizationProperty.Companion::unwrap))
    }

    /**
     * @param webAppCustomization A structure that contains the customization fields for the web
     * app.
     * You can provide a title, logo, and icon to customize the appearance of your web app.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a9530d90bac3db0312a93b38e147843c79f8bebcdcd51336e4b5f877de18400")
    override
        fun webAppCustomization(webAppCustomization: CfnWebApp.WebAppCustomizationProperty.Builder.() -> Unit):
        Unit = webAppCustomization(CfnWebApp.WebAppCustomizationProperty(webAppCustomization))

    /**
     * @param webAppEndpointPolicy Setting for the type of endpoint policy for the web app. The
     * default value is `STANDARD` .
     * If your web app was created in an AWS GovCloud (US) Region , the value of this parameter can
     * be `FIPS` , which indicates the web app endpoint is FIPS-compliant.
     */
    override fun webAppEndpointPolicy(webAppEndpointPolicy: String) {
      cdkBuilder.webAppEndpointPolicy(webAppEndpointPolicy)
    }

    /**
     * @param webAppUnits A union that contains the value for number of concurrent connections or
     * the user sessions on your web app.
     */
    override fun webAppUnits(webAppUnits: IResolvable) {
      cdkBuilder.webAppUnits(webAppUnits.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param webAppUnits A union that contains the value for number of concurrent connections or
     * the user sessions on your web app.
     */
    override fun webAppUnits(webAppUnits: CfnWebApp.WebAppUnitsProperty) {
      cdkBuilder.webAppUnits(webAppUnits.let(CfnWebApp.WebAppUnitsProperty.Companion::unwrap))
    }

    /**
     * @param webAppUnits A union that contains the value for number of concurrent connections or
     * the user sessions on your web app.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d74d53d8e096cb1c33a89f12d5af8b00f46e3daffc97fcfab6af5571d90e028e")
    override fun webAppUnits(webAppUnits: CfnWebApp.WebAppUnitsProperty.Builder.() -> Unit): Unit =
        webAppUnits(CfnWebApp.WebAppUnitsProperty(webAppUnits))

    public fun build(): software.amazon.awscdk.services.transfer.CfnWebAppProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.transfer.CfnWebAppProps,
  ) : CdkObject(cdkObject),
      CfnWebAppProps {
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
     */
    override fun accessEndpoint(): String? = unwrap(this).getAccessEndpoint()

    /**
     * You can provide a structure that contains the details for the identity provider to use with
     * your web app.
     *
     * For more details about this parameter, see [Configure your identity provider for Transfer
     * Family web
     * apps](https://docs.aws.amazon.com//transfer/latest/userguide/webapp-identity-center.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-identityproviderdetails)
     */
    override fun identityProviderDetails(): Any = unwrap(this).getIdentityProviderDetails()

    /**
     * Key-value pairs that can be used to group and search for web apps.
     *
     * Tags are metadata attached to web apps for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A structure that contains the customization fields for the web app.
     *
     * You can provide a title, logo, and icon to customize the appearance of your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappcustomization)
     */
    override fun webAppCustomization(): Any? = unwrap(this).getWebAppCustomization()

    /**
     * Setting for the type of endpoint policy for the web app. The default value is `STANDARD` .
     *
     * If your web app was created in an AWS GovCloud (US) Region , the value of this parameter can
     * be `FIPS` , which indicates the web app endpoint is FIPS-compliant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappendpointpolicy)
     */
    override fun webAppEndpointPolicy(): String? = unwrap(this).getWebAppEndpointPolicy()

    /**
     * A union that contains the value for number of concurrent connections or the user sessions on
     * your web app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-webapp.html#cfn-transfer-webapp-webappunits)
     */
    override fun webAppUnits(): Any? = unwrap(this).getWebAppUnits()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWebAppProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWebAppProps):
        CfnWebAppProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWebAppProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWebAppProps):
        software.amazon.awscdk.services.transfer.CfnWebAppProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.transfer.CfnWebAppProps
  }
}
