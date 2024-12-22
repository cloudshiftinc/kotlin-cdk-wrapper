@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new set of branding settings for a user pool style and associates it with an app
 * client.
 *
 * This operation is the programmatic option for the creation of a new style in the branding
 * designer.
 *
 * Provides values for UI customization in a `Settings` JSON object and image files in an `Assets`
 * array. To send the JSON object `Document` type parameter in `Settings` , you might need to update to
 * the most recent version of your AWS SDK.
 *
 * This operation has a 2-megabyte request-size limit and include the CSS settings and image assets
 * for your app client. Your branding settings might exceed 2MB in size. Amazon Cognito doesn't require
 * that you pass all parameters in one request and preserves existing style settings that you don't
 * specify. If your request is larger than 2MB, separate it into multiple requests, each with a size
 * smaller than the limit.
 *
 * As a best practice, modify the output of
 * [DescribeManagedLoginBrandingByClient](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeManagedLoginBrandingByClient.html)
 * into the request parameters for this operation. To get all settings, set `ReturnMergedResources` to
 * `true` . For more information, see [API and SDK operations for managed login
 * branding](https://docs.aws.amazon.com/cognito/latest/developerguide/managed-login-brandingdesigner.html#branding-designer-api)
 *
 *
 * Amazon Cognito evaluates AWS Identity and Access Management (IAM) policies in requests for this
 * API operation. For this operation, you must use IAM credentials to authorize requests, and you must
 * grant yourself the corresponding IAM permission in a policy.
 *
 * **Learn more** - [Signing AWS API
 * Requests](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html)
 *
 * * [Using the Amazon Cognito user pools API and user pool
 * endpoints](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html)
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * Object settings;
 * CfnManagedLoginBranding cfnManagedLoginBranding = CfnManagedLoginBranding.Builder.create(this,
 * "MyCfnManagedLoginBranding")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .assets(List.of(AssetTypeProperty.builder()
 * .category("category")
 * .colorMode("colorMode")
 * .extension("extension")
 * // the properties below are optional
 * .bytes("bytes")
 * .resourceId("resourceId")
 * .build()))
 * .clientId("clientId")
 * .returnMergedResources(false)
 * .settings(settings)
 * .useCognitoProvidedValues(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html)
 */
public open class CfnManagedLoginBranding(
  cdkObject: software.amazon.awscdk.services.cognito.CfnManagedLoginBranding,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnManagedLoginBrandingProps,
  ) :
      this(software.amazon.awscdk.services.cognito.CfnManagedLoginBranding(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnManagedLoginBrandingProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnManagedLoginBrandingProps.Builder.() -> Unit,
  ) : this(scope, id, CfnManagedLoginBrandingProps(props)
  )

  /**
   * An array of image files that you want to apply to roles like backgrounds, logos, and icons.
   */
  public open fun assets(): Any? = unwrap(this).getAssets()

  /**
   * An array of image files that you want to apply to roles like backgrounds, logos, and icons.
   */
  public open fun assets(`value`: IResolvable) {
    unwrap(this).setAssets(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An array of image files that you want to apply to roles like backgrounds, logos, and icons.
   */
  public open fun assets(`value`: List<Any>) {
    unwrap(this).setAssets(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of image files that you want to apply to roles like backgrounds, logos, and icons.
   */
  public open fun assets(vararg `value`: Any): Unit = assets(`value`.toList())

  /**
   * The ID of the managed login branding style.
   */
  public open fun attrManagedLoginBrandingId(): String =
      unwrap(this).getAttrManagedLoginBrandingId()

  /**
   *
   */
  public open fun clientId(): String? = unwrap(this).getClientId()

  /**
   *
   */
  public open fun clientId(`value`: String) {
    unwrap(this).setClientId(`value`)
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
   *
   */
  public open fun returnMergedResources(): Any? = unwrap(this).getReturnMergedResources()

  /**
   *
   */
  public open fun returnMergedResources(`value`: Boolean) {
    unwrap(this).setReturnMergedResources(`value`)
  }

  /**
   *
   */
  public open fun returnMergedResources(`value`: IResolvable) {
    unwrap(this).setReturnMergedResources(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A JSON file, encoded as a `Document` type, with the the settings that you want to apply to your
   * style.
   */
  public open fun settings(): Any? = unwrap(this).getSettings()

  /**
   * A JSON file, encoded as a `Document` type, with the the settings that you want to apply to your
   * style.
   */
  public open fun settings(`value`: Any) {
    unwrap(this).setSettings(`value`)
  }

  /**
   * When true, applies the default branding style options.
   */
  public open fun useCognitoProvidedValues(): Any? = unwrap(this).getUseCognitoProvidedValues()

  /**
   * When true, applies the default branding style options.
   */
  public open fun useCognitoProvidedValues(`value`: Boolean) {
    unwrap(this).setUseCognitoProvidedValues(`value`)
  }

  /**
   * When true, applies the default branding style options.
   */
  public open fun useCognitoProvidedValues(`value`: IResolvable) {
    unwrap(this).setUseCognitoProvidedValues(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The user pool where the branding style is assigned.
   */
  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * The user pool where the branding style is assigned.
   */
  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.CfnManagedLoginBranding].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An array of image files that you want to apply to roles like backgrounds, logos, and icons.
     *
     * Each object must also indicate whether it is for dark mode, light mode, or browser-adaptive
     * mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-assets)
     * @param assets An array of image files that you want to apply to roles like backgrounds,
     * logos, and icons. 
     */
    public fun assets(assets: IResolvable)

    /**
     * An array of image files that you want to apply to roles like backgrounds, logos, and icons.
     *
     * Each object must also indicate whether it is for dark mode, light mode, or browser-adaptive
     * mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-assets)
     * @param assets An array of image files that you want to apply to roles like backgrounds,
     * logos, and icons. 
     */
    public fun assets(assets: List<Any>)

    /**
     * An array of image files that you want to apply to roles like backgrounds, logos, and icons.
     *
     * Each object must also indicate whether it is for dark mode, light mode, or browser-adaptive
     * mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-assets)
     * @param assets An array of image files that you want to apply to roles like backgrounds,
     * logos, and icons. 
     */
    public fun assets(vararg assets: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-clientid)
     * @param clientId 
     */
    public fun clientId(clientId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-returnmergedresources)
     * @param returnMergedResources 
     */
    public fun returnMergedResources(returnMergedResources: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-returnmergedresources)
     * @param returnMergedResources 
     */
    public fun returnMergedResources(returnMergedResources: IResolvable)

    /**
     * A JSON file, encoded as a `Document` type, with the the settings that you want to apply to
     * your style.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-settings)
     * @param settings A JSON file, encoded as a `Document` type, with the the settings that you
     * want to apply to your style. 
     */
    public fun settings(settings: Any)

    /**
     * When true, applies the default branding style options.
     *
     * This option reverts to a "blank" style that you can modify later in the branding designer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-usecognitoprovidedvalues)
     * @param useCognitoProvidedValues When true, applies the default branding style options. 
     */
    public fun useCognitoProvidedValues(useCognitoProvidedValues: Boolean)

    /**
     * When true, applies the default branding style options.
     *
     * This option reverts to a "blank" style that you can modify later in the branding designer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-usecognitoprovidedvalues)
     * @param useCognitoProvidedValues When true, applies the default branding style options. 
     */
    public fun useCognitoProvidedValues(useCognitoProvidedValues: IResolvable)

    /**
     * The user pool where the branding style is assigned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-userpoolid)
     * @param userPoolId The user pool where the branding style is assigned. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnManagedLoginBranding.Builder
        = software.amazon.awscdk.services.cognito.CfnManagedLoginBranding.Builder.create(scope, id)

    /**
     * An array of image files that you want to apply to roles like backgrounds, logos, and icons.
     *
     * Each object must also indicate whether it is for dark mode, light mode, or browser-adaptive
     * mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-assets)
     * @param assets An array of image files that you want to apply to roles like backgrounds,
     * logos, and icons. 
     */
    override fun assets(assets: IResolvable) {
      cdkBuilder.assets(assets.let(IResolvable.Companion::unwrap))
    }

    /**
     * An array of image files that you want to apply to roles like backgrounds, logos, and icons.
     *
     * Each object must also indicate whether it is for dark mode, light mode, or browser-adaptive
     * mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-assets)
     * @param assets An array of image files that you want to apply to roles like backgrounds,
     * logos, and icons. 
     */
    override fun assets(assets: List<Any>) {
      cdkBuilder.assets(assets.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array of image files that you want to apply to roles like backgrounds, logos, and icons.
     *
     * Each object must also indicate whether it is for dark mode, light mode, or browser-adaptive
     * mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-assets)
     * @param assets An array of image files that you want to apply to roles like backgrounds,
     * logos, and icons. 
     */
    override fun assets(vararg assets: Any): Unit = assets(assets.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-clientid)
     * @param clientId 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-returnmergedresources)
     * @param returnMergedResources 
     */
    override fun returnMergedResources(returnMergedResources: Boolean) {
      cdkBuilder.returnMergedResources(returnMergedResources)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-returnmergedresources)
     * @param returnMergedResources 
     */
    override fun returnMergedResources(returnMergedResources: IResolvable) {
      cdkBuilder.returnMergedResources(returnMergedResources.let(IResolvable.Companion::unwrap))
    }

    /**
     * A JSON file, encoded as a `Document` type, with the the settings that you want to apply to
     * your style.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-settings)
     * @param settings A JSON file, encoded as a `Document` type, with the the settings that you
     * want to apply to your style. 
     */
    override fun settings(settings: Any) {
      cdkBuilder.settings(settings)
    }

    /**
     * When true, applies the default branding style options.
     *
     * This option reverts to a "blank" style that you can modify later in the branding designer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-usecognitoprovidedvalues)
     * @param useCognitoProvidedValues When true, applies the default branding style options. 
     */
    override fun useCognitoProvidedValues(useCognitoProvidedValues: Boolean) {
      cdkBuilder.useCognitoProvidedValues(useCognitoProvidedValues)
    }

    /**
     * When true, applies the default branding style options.
     *
     * This option reverts to a "blank" style that you can modify later in the branding designer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-usecognitoprovidedvalues)
     * @param useCognitoProvidedValues When true, applies the default branding style options. 
     */
    override fun useCognitoProvidedValues(useCognitoProvidedValues: IResolvable) {
      cdkBuilder.useCognitoProvidedValues(useCognitoProvidedValues.let(IResolvable.Companion::unwrap))
    }

    /**
     * The user pool where the branding style is assigned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-userpoolid)
     * @param userPoolId The user pool where the branding style is assigned. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnManagedLoginBranding =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnManagedLoginBranding.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnManagedLoginBranding {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnManagedLoginBranding(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnManagedLoginBranding):
        CfnManagedLoginBranding = CfnManagedLoginBranding(cdkObject)

    internal fun unwrap(wrapped: CfnManagedLoginBranding):
        software.amazon.awscdk.services.cognito.CfnManagedLoginBranding = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.CfnManagedLoginBranding
  }

  /**
   * An image file from a managed login branding style in a user pool.
   *
   * This data type is a request parameter of
   * [CreateManagedLoginBranding](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateManagedLoginBranding.html)
   * and
   * [UpdateManagedLoginBranding](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateManagedLoginBranding.html)
   * , and a response parameter of
   * [DescribeManagedLoginBranding](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeManagedLoginBranding.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * AssetTypeProperty assetTypeProperty = AssetTypeProperty.builder()
   * .category("category")
   * .colorMode("colorMode")
   * .extension("extension")
   * // the properties below are optional
   * .bytes("bytes")
   * .resourceId("resourceId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-managedloginbranding-assettype.html)
   */
  public interface AssetTypeProperty {
    /**
     * The image file, in Base64-encoded binary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-managedloginbranding-assettype.html#cfn-cognito-managedloginbranding-assettype-bytes)
     */
    public fun bytes(): String? = unwrap(this).getBytes()

    /**
     * The category that the image corresponds to in your managed login configuration.
     *
     * Managed login has asset categories for different types of logos, backgrounds, and icons.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-managedloginbranding-assettype.html#cfn-cognito-managedloginbranding-assettype-category)
     */
    public fun category(): String

    /**
     * The display-mode target of the asset: light, dark, or browser-adaptive.
     *
     * For example, Amazon Cognito displays a dark-mode image only when the browser or application
     * is in dark mode, but displays a browser-adaptive file in all contexts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-managedloginbranding-assettype.html#cfn-cognito-managedloginbranding-assettype-colormode)
     */
    public fun colorMode(): String

    /**
     * The file type of the image file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-managedloginbranding-assettype.html#cfn-cognito-managedloginbranding-assettype-extension)
     */
    public fun extension(): String

    /**
     * The ID of the asset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-managedloginbranding-assettype.html#cfn-cognito-managedloginbranding-assettype-resourceid)
     */
    public fun resourceId(): String? = unwrap(this).getResourceId()

    /**
     * A builder for [AssetTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bytes The image file, in Base64-encoded binary.
       */
      public fun bytes(bytes: String)

      /**
       * @param category The category that the image corresponds to in your managed login
       * configuration. 
       * Managed login has asset categories for different types of logos, backgrounds, and icons.
       */
      public fun category(category: String)

      /**
       * @param colorMode The display-mode target of the asset: light, dark, or browser-adaptive. 
       * For example, Amazon Cognito displays a dark-mode image only when the browser or application
       * is in dark mode, but displays a browser-adaptive file in all contexts.
       */
      public fun colorMode(colorMode: String)

      /**
       * @param extension The file type of the image file. 
       */
      public fun extension(extension: String)

      /**
       * @param resourceId The ID of the asset.
       */
      public fun resourceId(resourceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnManagedLoginBranding.AssetTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnManagedLoginBranding.AssetTypeProperty.builder()

      /**
       * @param bytes The image file, in Base64-encoded binary.
       */
      override fun bytes(bytes: String) {
        cdkBuilder.bytes(bytes)
      }

      /**
       * @param category The category that the image corresponds to in your managed login
       * configuration. 
       * Managed login has asset categories for different types of logos, backgrounds, and icons.
       */
      override fun category(category: String) {
        cdkBuilder.category(category)
      }

      /**
       * @param colorMode The display-mode target of the asset: light, dark, or browser-adaptive. 
       * For example, Amazon Cognito displays a dark-mode image only when the browser or application
       * is in dark mode, but displays a browser-adaptive file in all contexts.
       */
      override fun colorMode(colorMode: String) {
        cdkBuilder.colorMode(colorMode)
      }

      /**
       * @param extension The file type of the image file. 
       */
      override fun extension(extension: String) {
        cdkBuilder.extension(extension)
      }

      /**
       * @param resourceId The ID of the asset.
       */
      override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnManagedLoginBranding.AssetTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnManagedLoginBranding.AssetTypeProperty,
    ) : CdkObject(cdkObject),
        AssetTypeProperty {
      /**
       * The image file, in Base64-encoded binary.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-managedloginbranding-assettype.html#cfn-cognito-managedloginbranding-assettype-bytes)
       */
      override fun bytes(): String? = unwrap(this).getBytes()

      /**
       * The category that the image corresponds to in your managed login configuration.
       *
       * Managed login has asset categories for different types of logos, backgrounds, and icons.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-managedloginbranding-assettype.html#cfn-cognito-managedloginbranding-assettype-category)
       */
      override fun category(): String = unwrap(this).getCategory()

      /**
       * The display-mode target of the asset: light, dark, or browser-adaptive.
       *
       * For example, Amazon Cognito displays a dark-mode image only when the browser or application
       * is in dark mode, but displays a browser-adaptive file in all contexts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-managedloginbranding-assettype.html#cfn-cognito-managedloginbranding-assettype-colormode)
       */
      override fun colorMode(): String = unwrap(this).getColorMode()

      /**
       * The file type of the image file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-managedloginbranding-assettype.html#cfn-cognito-managedloginbranding-assettype-extension)
       */
      override fun extension(): String = unwrap(this).getExtension()

      /**
       * The ID of the asset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-managedloginbranding-assettype.html#cfn-cognito-managedloginbranding-assettype-resourceid)
       */
      override fun resourceId(): String? = unwrap(this).getResourceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnManagedLoginBranding.AssetTypeProperty):
          AssetTypeProperty = CdkObjectWrappers.wrap(cdkObject) as? AssetTypeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetTypeProperty):
          software.amazon.awscdk.services.cognito.CfnManagedLoginBranding.AssetTypeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnManagedLoginBranding.AssetTypeProperty
    }
  }
}
