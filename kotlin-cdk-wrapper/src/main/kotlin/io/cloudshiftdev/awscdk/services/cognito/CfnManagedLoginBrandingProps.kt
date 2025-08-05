@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnManagedLoginBranding`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * Object settings;
 * CfnManagedLoginBrandingProps cfnManagedLoginBrandingProps =
 * CfnManagedLoginBrandingProps.builder()
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
public interface CfnManagedLoginBrandingProps {
  /**
   * An array of image files that you want to apply to roles like backgrounds, logos, and icons.
   *
   * Each object must also indicate whether it is for dark mode, light mode, or browser-adaptive
   * mode.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-assets)
   */
  public fun assets(): Any? = unwrap(this).getAssets()

  /**
   * The app client that you want to assign the branding style to.
   *
   * Each style is linked to an app client until you delete it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-clientid)
   */
  public fun clientId(): String? = unwrap(this).getClientId()

  /**
   * When `true` , returns values for branding options that are unchanged from Amazon Cognito
   * defaults.
   *
   * When `false` or when you omit this parameter, returns only values that you customized in your
   * branding style.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-returnmergedresources)
   */
  public fun returnMergedResources(): Any? = unwrap(this).getReturnMergedResources()

  /**
   * A JSON file, encoded as a `Document` type, with the the settings that you want to apply to your
   * style.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-settings)
   */
  public fun settings(): Any? = unwrap(this).getSettings()

  /**
   * When true, applies the default branding style options.
   *
   * This option reverts to default style options that are managed by Amazon Cognito. You can modify
   * them later in the branding editor.
   *
   * When you specify `true` for this option, you must also omit values for `Settings` and `Assets`
   * in the request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-usecognitoprovidedvalues)
   */
  public fun useCognitoProvidedValues(): Any? = unwrap(this).getUseCognitoProvidedValues()

  /**
   * The user pool where the branding style is assigned.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-userpoolid)
   */
  public fun userPoolId(): String

  /**
   * A builder for [CfnManagedLoginBrandingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assets An array of image files that you want to apply to roles like backgrounds,
     * logos, and icons.
     * Each object must also indicate whether it is for dark mode, light mode, or browser-adaptive
     * mode.
     */
    public fun assets(assets: IResolvable)

    /**
     * @param assets An array of image files that you want to apply to roles like backgrounds,
     * logos, and icons.
     * Each object must also indicate whether it is for dark mode, light mode, or browser-adaptive
     * mode.
     */
    public fun assets(assets: List<Any>)

    /**
     * @param assets An array of image files that you want to apply to roles like backgrounds,
     * logos, and icons.
     * Each object must also indicate whether it is for dark mode, light mode, or browser-adaptive
     * mode.
     */
    public fun assets(vararg assets: Any)

    /**
     * @param clientId The app client that you want to assign the branding style to.
     * Each style is linked to an app client until you delete it.
     */
    public fun clientId(clientId: String)

    /**
     * @param returnMergedResources When `true` , returns values for branding options that are
     * unchanged from Amazon Cognito defaults.
     * When `false` or when you omit this parameter, returns only values that you customized in your
     * branding style.
     */
    public fun returnMergedResources(returnMergedResources: Boolean)

    /**
     * @param returnMergedResources When `true` , returns values for branding options that are
     * unchanged from Amazon Cognito defaults.
     * When `false` or when you omit this parameter, returns only values that you customized in your
     * branding style.
     */
    public fun returnMergedResources(returnMergedResources: IResolvable)

    /**
     * @param settings A JSON file, encoded as a `Document` type, with the the settings that you
     * want to apply to your style.
     */
    public fun settings(settings: Any)

    /**
     * @param useCognitoProvidedValues When true, applies the default branding style options.
     * This option reverts to default style options that are managed by Amazon Cognito. You can
     * modify them later in the branding editor.
     *
     * When you specify `true` for this option, you must also omit values for `Settings` and
     * `Assets` in the request.
     */
    public fun useCognitoProvidedValues(useCognitoProvidedValues: Boolean)

    /**
     * @param useCognitoProvidedValues When true, applies the default branding style options.
     * This option reverts to default style options that are managed by Amazon Cognito. You can
     * modify them later in the branding editor.
     *
     * When you specify `true` for this option, you must also omit values for `Settings` and
     * `Assets` in the request.
     */
    public fun useCognitoProvidedValues(useCognitoProvidedValues: IResolvable)

    /**
     * @param userPoolId The user pool where the branding style is assigned. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnManagedLoginBrandingProps.Builder =
        software.amazon.awscdk.services.cognito.CfnManagedLoginBrandingProps.builder()

    /**
     * @param assets An array of image files that you want to apply to roles like backgrounds,
     * logos, and icons.
     * Each object must also indicate whether it is for dark mode, light mode, or browser-adaptive
     * mode.
     */
    override fun assets(assets: IResolvable) {
      cdkBuilder.assets(assets.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param assets An array of image files that you want to apply to roles like backgrounds,
     * logos, and icons.
     * Each object must also indicate whether it is for dark mode, light mode, or browser-adaptive
     * mode.
     */
    override fun assets(assets: List<Any>) {
      cdkBuilder.assets(assets.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param assets An array of image files that you want to apply to roles like backgrounds,
     * logos, and icons.
     * Each object must also indicate whether it is for dark mode, light mode, or browser-adaptive
     * mode.
     */
    override fun assets(vararg assets: Any): Unit = assets(assets.toList())

    /**
     * @param clientId The app client that you want to assign the branding style to.
     * Each style is linked to an app client until you delete it.
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * @param returnMergedResources When `true` , returns values for branding options that are
     * unchanged from Amazon Cognito defaults.
     * When `false` or when you omit this parameter, returns only values that you customized in your
     * branding style.
     */
    override fun returnMergedResources(returnMergedResources: Boolean) {
      cdkBuilder.returnMergedResources(returnMergedResources)
    }

    /**
     * @param returnMergedResources When `true` , returns values for branding options that are
     * unchanged from Amazon Cognito defaults.
     * When `false` or when you omit this parameter, returns only values that you customized in your
     * branding style.
     */
    override fun returnMergedResources(returnMergedResources: IResolvable) {
      cdkBuilder.returnMergedResources(returnMergedResources.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param settings A JSON file, encoded as a `Document` type, with the the settings that you
     * want to apply to your style.
     */
    override fun settings(settings: Any) {
      cdkBuilder.settings(settings)
    }

    /**
     * @param useCognitoProvidedValues When true, applies the default branding style options.
     * This option reverts to default style options that are managed by Amazon Cognito. You can
     * modify them later in the branding editor.
     *
     * When you specify `true` for this option, you must also omit values for `Settings` and
     * `Assets` in the request.
     */
    override fun useCognitoProvidedValues(useCognitoProvidedValues: Boolean) {
      cdkBuilder.useCognitoProvidedValues(useCognitoProvidedValues)
    }

    /**
     * @param useCognitoProvidedValues When true, applies the default branding style options.
     * This option reverts to default style options that are managed by Amazon Cognito. You can
     * modify them later in the branding editor.
     *
     * When you specify `true` for this option, you must also omit values for `Settings` and
     * `Assets` in the request.
     */
    override fun useCognitoProvidedValues(useCognitoProvidedValues: IResolvable) {
      cdkBuilder.useCognitoProvidedValues(useCognitoProvidedValues.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param userPoolId The user pool where the branding style is assigned. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnManagedLoginBrandingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.CfnManagedLoginBrandingProps,
  ) : CdkObject(cdkObject),
      CfnManagedLoginBrandingProps {
    /**
     * An array of image files that you want to apply to roles like backgrounds, logos, and icons.
     *
     * Each object must also indicate whether it is for dark mode, light mode, or browser-adaptive
     * mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-assets)
     */
    override fun assets(): Any? = unwrap(this).getAssets()

    /**
     * The app client that you want to assign the branding style to.
     *
     * Each style is linked to an app client until you delete it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-clientid)
     */
    override fun clientId(): String? = unwrap(this).getClientId()

    /**
     * When `true` , returns values for branding options that are unchanged from Amazon Cognito
     * defaults.
     *
     * When `false` or when you omit this parameter, returns only values that you customized in your
     * branding style.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-returnmergedresources)
     */
    override fun returnMergedResources(): Any? = unwrap(this).getReturnMergedResources()

    /**
     * A JSON file, encoded as a `Document` type, with the the settings that you want to apply to
     * your style.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-settings)
     */
    override fun settings(): Any? = unwrap(this).getSettings()

    /**
     * When true, applies the default branding style options.
     *
     * This option reverts to default style options that are managed by Amazon Cognito. You can
     * modify them later in the branding editor.
     *
     * When you specify `true` for this option, you must also omit values for `Settings` and
     * `Assets` in the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-usecognitoprovidedvalues)
     */
    override fun useCognitoProvidedValues(): Any? = unwrap(this).getUseCognitoProvidedValues()

    /**
     * The user pool where the branding style is assigned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-managedloginbranding.html#cfn-cognito-managedloginbranding-userpoolid)
     */
    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnManagedLoginBrandingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnManagedLoginBrandingProps):
        CfnManagedLoginBrandingProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnManagedLoginBrandingProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnManagedLoginBrandingProps):
        software.amazon.awscdk.services.cognito.CfnManagedLoginBrandingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CfnManagedLoginBrandingProps
  }
}
