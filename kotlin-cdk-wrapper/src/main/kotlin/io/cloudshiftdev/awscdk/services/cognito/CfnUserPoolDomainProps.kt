@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnUserPoolDomain`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnUserPoolDomainProps cfnUserPoolDomainProps = CfnUserPoolDomainProps.builder()
 * .domain("domain")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .customDomainConfig(CustomDomainConfigTypeProperty.builder()
 * .certificateArn("certificateArn")
 * .build())
 * .managedLoginVersion(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html)
 */
public interface CfnUserPoolDomainProps {
  /**
   * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
   * application.
   *
   * Use this object to specify an SSL certificate that is managed by ACM.
   *
   * When you create a custom domain, the passkey RP ID defaults to the custom domain. If you had a
   * prefix domain active, this will cause passkey integration for your prefix domain to stop working
   * due to a mismatch in RP ID. To keep the prefix domain passkey integration working, you can
   * explicitly set RP ID to the prefix domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-customdomainconfig)
   */
  public fun customDomainConfig(): Any? = unwrap(this).getCustomDomainConfig()

  /**
   * The name of the domain that you want to update.
   *
   * For custom domains, this is the fully-qualified domain name, for example `auth.example.com` .
   * For prefix domains, this is the prefix alone, such as `myprefix` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-domain)
   */
  public fun domain(): String

  /**
   * A version number that indicates the state of managed login for your domain.
   *
   * Version `1` is hosted UI (classic). Version `2` is the newer managed login with the branding
   * editor. For more information, see [Managed
   * login](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-managed-login.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-managedloginversion)
   */
  public fun managedLoginVersion(): Number? = unwrap(this).getManagedLoginVersion()

  /**
   * The ID of the user pool that is associated with the domain you're updating.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-userpoolid)
   */
  public fun userPoolId(): String

  /**
   * A builder for [CfnUserPoolDomainProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application.
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * When you create a custom domain, the passkey RP ID defaults to the custom domain. If you had
     * a prefix domain active, this will cause passkey integration for your prefix domain to stop
     * working due to a mismatch in RP ID. To keep the prefix domain passkey integration working, you
     * can explicitly set RP ID to the prefix domain.
     */
    public fun customDomainConfig(customDomainConfig: IResolvable)

    /**
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application.
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * When you create a custom domain, the passkey RP ID defaults to the custom domain. If you had
     * a prefix domain active, this will cause passkey integration for your prefix domain to stop
     * working due to a mismatch in RP ID. To keep the prefix domain passkey integration working, you
     * can explicitly set RP ID to the prefix domain.
     */
    public
        fun customDomainConfig(customDomainConfig: CfnUserPoolDomain.CustomDomainConfigTypeProperty)

    /**
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application.
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * When you create a custom domain, the passkey RP ID defaults to the custom domain. If you had
     * a prefix domain active, this will cause passkey integration for your prefix domain to stop
     * working due to a mismatch in RP ID. To keep the prefix domain passkey integration working, you
     * can explicitly set RP ID to the prefix domain.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9a20ddda83ad93e68e63ad9936a60c77549c4db60df9a6d4ad582a0ede4ad1d")
    public
        fun customDomainConfig(customDomainConfig: CfnUserPoolDomain.CustomDomainConfigTypeProperty.Builder.() -> Unit)

    /**
     * @param domain The name of the domain that you want to update. 
     * For custom domains, this is the fully-qualified domain name, for example `auth.example.com` .
     * For prefix domains, this is the prefix alone, such as `myprefix` .
     */
    public fun domain(domain: String)

    /**
     * @param managedLoginVersion A version number that indicates the state of managed login for
     * your domain.
     * Version `1` is hosted UI (classic). Version `2` is the newer managed login with the branding
     * editor. For more information, see [Managed
     * login](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-managed-login.html)
     * .
     */
    public fun managedLoginVersion(managedLoginVersion: Number)

    /**
     * @param userPoolId The ID of the user pool that is associated with the domain you're updating.
     * 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps.builder()

    /**
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application.
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * When you create a custom domain, the passkey RP ID defaults to the custom domain. If you had
     * a prefix domain active, this will cause passkey integration for your prefix domain to stop
     * working due to a mismatch in RP ID. To keep the prefix domain passkey integration working, you
     * can explicitly set RP ID to the prefix domain.
     */
    override fun customDomainConfig(customDomainConfig: IResolvable) {
      cdkBuilder.customDomainConfig(customDomainConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application.
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * When you create a custom domain, the passkey RP ID defaults to the custom domain. If you had
     * a prefix domain active, this will cause passkey integration for your prefix domain to stop
     * working due to a mismatch in RP ID. To keep the prefix domain passkey integration working, you
     * can explicitly set RP ID to the prefix domain.
     */
    override
        fun customDomainConfig(customDomainConfig: CfnUserPoolDomain.CustomDomainConfigTypeProperty) {
      cdkBuilder.customDomainConfig(customDomainConfig.let(CfnUserPoolDomain.CustomDomainConfigTypeProperty.Companion::unwrap))
    }

    /**
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application.
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * When you create a custom domain, the passkey RP ID defaults to the custom domain. If you had
     * a prefix domain active, this will cause passkey integration for your prefix domain to stop
     * working due to a mismatch in RP ID. To keep the prefix domain passkey integration working, you
     * can explicitly set RP ID to the prefix domain.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9a20ddda83ad93e68e63ad9936a60c77549c4db60df9a6d4ad582a0ede4ad1d")
    override
        fun customDomainConfig(customDomainConfig: CfnUserPoolDomain.CustomDomainConfigTypeProperty.Builder.() -> Unit):
        Unit =
        customDomainConfig(CfnUserPoolDomain.CustomDomainConfigTypeProperty(customDomainConfig))

    /**
     * @param domain The name of the domain that you want to update. 
     * For custom domains, this is the fully-qualified domain name, for example `auth.example.com` .
     * For prefix domains, this is the prefix alone, such as `myprefix` .
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param managedLoginVersion A version number that indicates the state of managed login for
     * your domain.
     * Version `1` is hosted UI (classic). Version `2` is the newer managed login with the branding
     * editor. For more information, see [Managed
     * login](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-managed-login.html)
     * .
     */
    override fun managedLoginVersion(managedLoginVersion: Number) {
      cdkBuilder.managedLoginVersion(managedLoginVersion)
    }

    /**
     * @param userPoolId The ID of the user pool that is associated with the domain you're updating.
     * 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps,
  ) : CdkObject(cdkObject),
      CfnUserPoolDomainProps {
    /**
     * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
     * application.
     *
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * When you create a custom domain, the passkey RP ID defaults to the custom domain. If you had
     * a prefix domain active, this will cause passkey integration for your prefix domain to stop
     * working due to a mismatch in RP ID. To keep the prefix domain passkey integration working, you
     * can explicitly set RP ID to the prefix domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-customdomainconfig)
     */
    override fun customDomainConfig(): Any? = unwrap(this).getCustomDomainConfig()

    /**
     * The name of the domain that you want to update.
     *
     * For custom domains, this is the fully-qualified domain name, for example `auth.example.com` .
     * For prefix domains, this is the prefix alone, such as `myprefix` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-domain)
     */
    override fun domain(): String = unwrap(this).getDomain()

    /**
     * A version number that indicates the state of managed login for your domain.
     *
     * Version `1` is hosted UI (classic). Version `2` is the newer managed login with the branding
     * editor. For more information, see [Managed
     * login](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-managed-login.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-managedloginversion)
     */
    override fun managedLoginVersion(): Number? = unwrap(this).getManagedLoginVersion()

    /**
     * The ID of the user pool that is associated with the domain you're updating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-userpoolid)
     */
    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserPoolDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps):
        CfnUserPoolDomainProps = CdkObjectWrappers.wrap(cdkObject) as? CfnUserPoolDomainProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolDomainProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps
  }
}
