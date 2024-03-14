package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserPoolDomain internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolDomain,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon CloudFront endpoint that you use as the target of the alias that you set up with
   * your Domain Name Service (DNS) provider.
   */
  public open fun attrCloudFrontDistribution(): String =
      unwrap(this).getAttrCloudFrontDistribution()

  /**
   * The resource ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
   * application.
   */
  public open fun customDomainConfig(): Any? = unwrap(this).getCustomDomainConfig()

  /**
   * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
   * application.
   */
  public open fun customDomainConfig(`value`: IResolvable) {
    unwrap(this).setCustomDomainConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
   * application.
   */
  public open fun customDomainConfig(`value`: CustomDomainConfigTypeProperty) {
    unwrap(this).setCustomDomainConfig(`value`.let(CustomDomainConfigTypeProperty::unwrap))
  }

  /**
   * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
   * application.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1932f678847ff4299bca23a5d423a85459cd42342059083e2bf00dfea8c6e3e6")
  public open fun customDomainConfig(`value`: CustomDomainConfigTypeProperty.Builder.() -> Unit):
      Unit = customDomainConfig(CustomDomainConfigTypeProperty(`value`))

  /**
   * The domain name for the domain that hosts the sign-up and sign-in pages for your application.
   */
  public open fun domain(): String = unwrap(this).getDomain()

  /**
   * The domain name for the domain that hosts the sign-up and sign-in pages for your application.
   */
  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The user pool ID for the user pool where you want to associate a user pool domain.
   */
  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * The user pool ID for the user pool where you want to associate a user pool domain.
   */
  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.CfnUserPoolDomain].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
     * application.
     *
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-customdomainconfig)
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application. 
     */
    public fun customDomainConfig(customDomainConfig: IResolvable)

    /**
     * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
     * application.
     *
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-customdomainconfig)
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application. 
     */
    public fun customDomainConfig(customDomainConfig: CustomDomainConfigTypeProperty)

    /**
     * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
     * application.
     *
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-customdomainconfig)
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cf6387ed90ec3bbfadd8ec8bba7bed73b53ba81c79e21cfa5ebaf2158605e86")
    public
        fun customDomainConfig(customDomainConfig: CustomDomainConfigTypeProperty.Builder.() -> Unit)

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
     * @param domain The domain name for the domain that hosts the sign-up and sign-in pages for
     * your application. 
     */
    public fun domain(domain: String)

    /**
     * The user pool ID for the user pool where you want to associate a user pool domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-userpoolid)
     * @param userPoolId The user pool ID for the user pool where you want to associate a user pool
     * domain. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolDomain.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolDomain.Builder.create(scope, id)

    /**
     * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
     * application.
     *
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-customdomainconfig)
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application. 
     */
    override fun customDomainConfig(customDomainConfig: IResolvable) {
      cdkBuilder.customDomainConfig(customDomainConfig.let(IResolvable::unwrap))
    }

    /**
     * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
     * application.
     *
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-customdomainconfig)
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application. 
     */
    override fun customDomainConfig(customDomainConfig: CustomDomainConfigTypeProperty) {
      cdkBuilder.customDomainConfig(customDomainConfig.let(CustomDomainConfigTypeProperty::unwrap))
    }

    /**
     * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
     * application.
     *
     * Use this object to specify an SSL certificate that is managed by ACM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-customdomainconfig)
     * @param customDomainConfig The configuration for a custom domain that hosts the sign-up and
     * sign-in pages for your application. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cf6387ed90ec3bbfadd8ec8bba7bed73b53ba81c79e21cfa5ebaf2158605e86")
    override
        fun customDomainConfig(customDomainConfig: CustomDomainConfigTypeProperty.Builder.() -> Unit):
        Unit = customDomainConfig(CustomDomainConfigTypeProperty(customDomainConfig))

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
     * @param domain The domain name for the domain that hosts the sign-up and sign-in pages for
     * your application. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * The user pool ID for the user pool where you want to associate a user pool domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-userpoolid)
     * @param userPoolId The user pool ID for the user pool where you want to associate a user pool
     * domain. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolDomain =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolDomain):
        CfnUserPoolDomain = CfnUserPoolDomain(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolDomain):
        software.amazon.awscdk.services.cognito.CfnUserPoolDomain = wrapped.cdkObject
  }

  public interface CustomDomainConfigTypeProperty {
    /**
     * The Amazon Resource Name (ARN) of an AWS Certificate Manager SSL certificate.
     *
     * You use this certificate for the subdomain of your custom domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooldomain-customdomainconfigtype.html#cfn-cognito-userpooldomain-customdomainconfigtype-certificatearn)
     */
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /**
     * A builder for [CustomDomainConfigTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateArn The Amazon Resource Name (ARN) of an AWS Certificate Manager SSL
       * certificate.
       * You use this certificate for the subdomain of your custom domain.
       */
      public fun certificateArn(certificateArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty.builder()

      /**
       * @param certificateArn The Amazon Resource Name (ARN) of an AWS Certificate Manager SSL
       * certificate.
       * You use this certificate for the subdomain of your custom domain.
       */
      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty,
    ) : CdkObject(cdkObject), CustomDomainConfigTypeProperty {
      /**
       * The Amazon Resource Name (ARN) of an AWS Certificate Manager SSL certificate.
       *
       * You use this certificate for the subdomain of your custom domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooldomain-customdomainconfigtype.html#cfn-cognito-userpooldomain-customdomainconfigtype-certificatearn)
       */
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomDomainConfigTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty):
          CustomDomainConfigTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomDomainConfigTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty
    }
  }
}
