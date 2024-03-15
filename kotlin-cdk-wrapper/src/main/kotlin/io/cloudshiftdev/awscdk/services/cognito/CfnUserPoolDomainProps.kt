@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-customdomainconfig)
   */
  public fun customDomainConfig(): Any? = unwrap(this).getCustomDomainConfig()

  /**
   * The domain name for the domain that hosts the sign-up and sign-in pages for your application.
   *
   * For example: `auth.example.com` . If you're using a prefix domain, this field denotes the first
   * part of the domain before `.auth.[region].amazoncognito.com` .
   *
   * This string can include only lowercase letters, numbers, and hyphens. Don't use a hyphen for
   * the first or last character. Use periods to separate subdomain names.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-domain)
   */
  public fun domain(): String

  /**
   * The user pool ID for the user pool where you want to associate a user pool domain.
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
     */
    public fun customDomainConfig(customDomainConfig: IResolvable)

    /**
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application.
     * Use this object to specify an SSL certificate that is managed by ACM.
     */
    public
        fun customDomainConfig(customDomainConfig: CfnUserPoolDomain.CustomDomainConfigTypeProperty)

    /**
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application.
     * Use this object to specify an SSL certificate that is managed by ACM.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9a20ddda83ad93e68e63ad9936a60c77549c4db60df9a6d4ad582a0ede4ad1d")
    public
        fun customDomainConfig(customDomainConfig: CfnUserPoolDomain.CustomDomainConfigTypeProperty.Builder.() -> Unit)

    /**
     * @param domain The domain name for the domain that hosts the sign-up and sign-in pages for
     * your application. 
     * For example: `auth.example.com` . If you're using a prefix domain, this field denotes the
     * first part of the domain before `.auth.[region].amazoncognito.com` .
     *
     * This string can include only lowercase letters, numbers, and hyphens. Don't use a hyphen for
     * the first or last character. Use periods to separate subdomain names.
     */
    public fun domain(domain: String)

    /**
     * @param userPoolId The user pool ID for the user pool where you want to associate a user pool
     * domain. 
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
     */
    override fun customDomainConfig(customDomainConfig: IResolvable) {
      cdkBuilder.customDomainConfig(customDomainConfig.let(IResolvable::unwrap))
    }

    /**
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application.
     * Use this object to specify an SSL certificate that is managed by ACM.
     */
    override
        fun customDomainConfig(customDomainConfig: CfnUserPoolDomain.CustomDomainConfigTypeProperty) {
      cdkBuilder.customDomainConfig(customDomainConfig.let(CfnUserPoolDomain.CustomDomainConfigTypeProperty::unwrap))
    }

    /**
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application.
     * Use this object to specify an SSL certificate that is managed by ACM.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9a20ddda83ad93e68e63ad9936a60c77549c4db60df9a6d4ad582a0ede4ad1d")
    override
        fun customDomainConfig(customDomainConfig: CfnUserPoolDomain.CustomDomainConfigTypeProperty.Builder.() -> Unit):
        Unit =
        customDomainConfig(CfnUserPoolDomain.CustomDomainConfigTypeProperty(customDomainConfig))

    /**
     * @param domain The domain name for the domain that hosts the sign-up and sign-in pages for
     * your application. 
     * For example: `auth.example.com` . If you're using a prefix domain, this field denotes the
     * first part of the domain before `.auth.[region].amazoncognito.com` .
     *
     * This string can include only lowercase letters, numbers, and hyphens. Don't use a hyphen for
     * the first or last character. Use periods to separate subdomain names.
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param userPoolId The user pool ID for the user pool where you want to associate a user pool
     * domain. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps,
  ) : CdkObject(cdkObject), CfnUserPoolDomainProps {
    /**
     * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
     * application.
     *
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-customdomainconfig)
     */
    override fun customDomainConfig(): Any? = unwrap(this).getCustomDomainConfig()

    /**
     * The domain name for the domain that hosts the sign-up and sign-in pages for your application.
     *
     * For example: `auth.example.com` . If you're using a prefix domain, this field denotes the
     * first part of the domain before `.auth.[region].amazoncognito.com` .
     *
     * This string can include only lowercase letters, numbers, and hyphens. Don't use a hyphen for
     * the first or last character. Use periods to separate subdomain names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-domain)
     */
    override fun domain(): String = unwrap(this).getDomain()

    /**
     * The user pool ID for the user pool where you want to associate a user pool domain.
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
        CfnUserPoolDomainProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolDomainProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps
  }
}
