@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGatewayV2::DomainName` resource specifies a custom domain name for your API in
 * Amazon API Gateway (API Gateway).
 *
 * You can use a custom domain name to provide a URL that's more intuitive and easier to recall. For
 * more information about using custom domain names, see [Set up Custom Domain Name for an API in API
 * Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html) in
 * the *API Gateway Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * CfnDomainName cfnDomainName = CfnDomainName.Builder.create(this, "MyCfnDomainName")
 * .domainName("domainName")
 * // the properties below are optional
 * .domainNameConfigurations(List.of(DomainNameConfigurationProperty.builder()
 * .certificateArn("certificateArn")
 * .certificateName("certificateName")
 * .endpointType("endpointType")
 * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
 * .securityPolicy("securityPolicy")
 * .build()))
 * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
 * .truststoreUri("truststoreUri")
 * .truststoreVersion("truststoreVersion")
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html)
 */
public open class CfnDomainName internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnDomainName,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The domain name associated with the regional endpoint for this custom domain name.
   *
   * You set up this association by adding a DNS record that points the custom domain name to this
   * regional domain name.
   */
  public open fun attrRegionalDomainName(): String = unwrap(this).getAttrRegionalDomainName()

  /**
   * The region-specific Amazon Route 53 Hosted Zone ID of the regional endpoint.
   */
  public open fun attrRegionalHostedZoneId(): String = unwrap(this).getAttrRegionalHostedZoneId()

  /**
   * The custom domain name for your API in Amazon API Gateway.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The custom domain name for your API in Amazon API Gateway.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * The domain name configurations.
   */
  public open fun domainNameConfigurations(): Any? = unwrap(this).getDomainNameConfigurations()

  /**
   * The domain name configurations.
   */
  public open fun domainNameConfigurations(`value`: IResolvable) {
    unwrap(this).setDomainNameConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * The domain name configurations.
   */
  public open fun domainNameConfigurations(_idx_ac66f0: List<Any>) {
    unwrap(this).setDomainNameConfigurations(_idx_ac66f0)
  }

  /**
   * The domain name configurations.
   */
  public open fun domainNameConfigurations(vararg _idx_ac66f0: Any): Unit =
      domainNameConfigurations(_idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The mutual TLS authentication configuration for a custom domain name.
   */
  public open fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

  /**
   * The mutual TLS authentication configuration for a custom domain name.
   */
  public open fun mutualTlsAuthentication(`value`: IResolvable) {
    unwrap(this).setMutualTlsAuthentication(`value`.let(IResolvable::unwrap))
  }

  /**
   * The mutual TLS authentication configuration for a custom domain name.
   */
  public open fun mutualTlsAuthentication(`value`: MutualTlsAuthenticationProperty) {
    unwrap(this).setMutualTlsAuthentication(`value`.let(MutualTlsAuthenticationProperty::unwrap))
  }

  /**
   * The mutual TLS authentication configuration for a custom domain name.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cb0d8d5ba3c842a7d34f6e2327f39e5e77bc744fdc701a2ce9260d922a5236db")
  public open
      fun mutualTlsAuthentication(`value`: MutualTlsAuthenticationProperty.Builder.() -> Unit): Unit
      = mutualTlsAuthentication(MutualTlsAuthenticationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The collection of tags associated with a domain name.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The collection of tags associated with a domain name.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.CfnDomainName].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The custom domain name for your API in Amazon API Gateway.
     *
     * Uppercase letters are not supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainname)
     * @param domainName The custom domain name for your API in Amazon API Gateway. 
     */
    public fun domainName(domainName: String)

    /**
     * The domain name configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainnameconfigurations)
     * @param domainNameConfigurations The domain name configurations. 
     */
    public fun domainNameConfigurations(domainNameConfigurations: IResolvable)

    /**
     * The domain name configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainnameconfigurations)
     * @param domainNameConfigurations The domain name configurations. 
     */
    public fun domainNameConfigurations(domainNameConfigurations: List<Any>)

    /**
     * The domain name configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainnameconfigurations)
     * @param domainNameConfigurations The domain name configurations. 
     */
    public fun domainNameConfigurations(vararg domainNameConfigurations: Any)

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-mutualtlsauthentication)
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name. 
     */
    public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable)

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-mutualtlsauthentication)
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name. 
     */
    public fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty)

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-mutualtlsauthentication)
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54b3f93f1f07c6288dc8128a5b41417be3e6cd17c1990fb447a874e975ae6ac0")
    public
        fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit)

    /**
     * The collection of tags associated with a domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-tags)
     * @param tags The collection of tags associated with a domain name. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnDomainName.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnDomainName.Builder.create(scope, id)

    /**
     * The custom domain name for your API in Amazon API Gateway.
     *
     * Uppercase letters are not supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainname)
     * @param domainName The custom domain name for your API in Amazon API Gateway. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The domain name configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainnameconfigurations)
     * @param domainNameConfigurations The domain name configurations. 
     */
    override fun domainNameConfigurations(domainNameConfigurations: IResolvable) {
      cdkBuilder.domainNameConfigurations(domainNameConfigurations.let(IResolvable::unwrap))
    }

    /**
     * The domain name configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainnameconfigurations)
     * @param domainNameConfigurations The domain name configurations. 
     */
    override fun domainNameConfigurations(domainNameConfigurations: List<Any>) {
      cdkBuilder.domainNameConfigurations(domainNameConfigurations)
    }

    /**
     * The domain name configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainnameconfigurations)
     * @param domainNameConfigurations The domain name configurations. 
     */
    override fun domainNameConfigurations(vararg domainNameConfigurations: Any): Unit =
        domainNameConfigurations(domainNameConfigurations.toList())

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-mutualtlsauthentication)
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name. 
     */
    override fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(IResolvable::unwrap))
    }

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-mutualtlsauthentication)
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name. 
     */
    override fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(MutualTlsAuthenticationProperty::unwrap))
    }

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-mutualtlsauthentication)
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54b3f93f1f07c6288dc8128a5b41417be3e6cd17c1990fb447a874e975ae6ac0")
    override
        fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit):
        Unit = mutualTlsAuthentication(MutualTlsAuthenticationProperty(mutualTlsAuthentication))

    /**
     * The collection of tags associated with a domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-tags)
     * @param tags The collection of tags associated with a domain name. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnDomainName =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigatewayv2.CfnDomainName.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomainName {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomainName(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnDomainName):
        CfnDomainName = CfnDomainName(cdkObject)

    internal fun unwrap(wrapped: CfnDomainName):
        software.amazon.awscdk.services.apigatewayv2.CfnDomainName = wrapped.cdkObject
  }

  /**
   * The `DomainNameConfiguration` property type specifies the configuration for an API's domain
   * name.
   *
   * `DomainNameConfiguration` is a property of the
   * [AWS::ApiGatewayV2::DomainName](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * DomainNameConfigurationProperty domainNameConfigurationProperty =
   * DomainNameConfigurationProperty.builder()
   * .certificateArn("certificateArn")
   * .certificateName("certificateName")
   * .endpointType("endpointType")
   * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
   * .securityPolicy("securityPolicy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-domainnameconfiguration.html)
   */
  public interface DomainNameConfigurationProperty {
    /**
     * An AWS -managed certificate that will be used by the edge-optimized endpoint for this domain
     * name.
     *
     * AWS Certificate Manager is the only supported source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-domainnameconfiguration.html#cfn-apigatewayv2-domainname-domainnameconfiguration-certificatearn)
     */
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /**
     * The user-friendly name of the certificate that will be used by the edge-optimized endpoint
     * for this domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-domainnameconfiguration.html#cfn-apigatewayv2-domainname-domainnameconfiguration-certificatename)
     */
    public fun certificateName(): String? = unwrap(this).getCertificateName()

    /**
     * The endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-domainnameconfiguration.html#cfn-apigatewayv2-domainname-domainnameconfiguration-endpointtype)
     */
    public fun endpointType(): String? = unwrap(this).getEndpointType()

    /**
     * The Amazon resource name (ARN) for the public certificate issued by AWS Certificate Manager .
     *
     * This ARN is used to validate custom domain ownership. It's required only if you configure
     * mutual TLS and use either an ACM-imported or a private CA certificate ARN as the
     * regionalCertificateArn.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-domainnameconfiguration.html#cfn-apigatewayv2-domainname-domainnameconfiguration-ownershipverificationcertificatearn)
     */
    public fun ownershipVerificationCertificateArn(): String? =
        unwrap(this).getOwnershipVerificationCertificateArn()

    /**
     * The Transport Layer Security (TLS) version of the security policy for this domain name.
     *
     * The valid values are `TLS_1_0` and `TLS_1_2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-domainnameconfiguration.html#cfn-apigatewayv2-domainname-domainnameconfiguration-securitypolicy)
     */
    public fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

    /**
     * A builder for [DomainNameConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateArn An AWS -managed certificate that will be used by the edge-optimized
       * endpoint for this domain name.
       * AWS Certificate Manager is the only supported source.
       */
      public fun certificateArn(certificateArn: String)

      /**
       * @param certificateName The user-friendly name of the certificate that will be used by the
       * edge-optimized endpoint for this domain name.
       */
      public fun certificateName(certificateName: String)

      /**
       * @param endpointType The endpoint type.
       */
      public fun endpointType(endpointType: String)

      /**
       * @param ownershipVerificationCertificateArn The Amazon resource name (ARN) for the public
       * certificate issued by AWS Certificate Manager .
       * This ARN is used to validate custom domain ownership. It's required only if you configure
       * mutual TLS and use either an ACM-imported or a private CA certificate ARN as the
       * regionalCertificateArn.
       */
      public fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String)

      /**
       * @param securityPolicy The Transport Layer Security (TLS) version of the security policy for
       * this domain name.
       * The valid values are `TLS_1_0` and `TLS_1_2` .
       */
      public fun securityPolicy(securityPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.DomainNameConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.DomainNameConfigurationProperty.builder()

      /**
       * @param certificateArn An AWS -managed certificate that will be used by the edge-optimized
       * endpoint for this domain name.
       * AWS Certificate Manager is the only supported source.
       */
      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      /**
       * @param certificateName The user-friendly name of the certificate that will be used by the
       * edge-optimized endpoint for this domain name.
       */
      override fun certificateName(certificateName: String) {
        cdkBuilder.certificateName(certificateName)
      }

      /**
       * @param endpointType The endpoint type.
       */
      override fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
      }

      /**
       * @param ownershipVerificationCertificateArn The Amazon resource name (ARN) for the public
       * certificate issued by AWS Certificate Manager .
       * This ARN is used to validate custom domain ownership. It's required only if you configure
       * mutual TLS and use either an ACM-imported or a private CA certificate ARN as the
       * regionalCertificateArn.
       */
      override
          fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
        cdkBuilder.ownershipVerificationCertificateArn(ownershipVerificationCertificateArn)
      }

      /**
       * @param securityPolicy The Transport Layer Security (TLS) version of the security policy for
       * this domain name.
       * The valid values are `TLS_1_0` and `TLS_1_2` .
       */
      override fun securityPolicy(securityPolicy: String) {
        cdkBuilder.securityPolicy(securityPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.DomainNameConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.DomainNameConfigurationProperty,
    ) : CdkObject(cdkObject), DomainNameConfigurationProperty {
      /**
       * An AWS -managed certificate that will be used by the edge-optimized endpoint for this
       * domain name.
       *
       * AWS Certificate Manager is the only supported source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-domainnameconfiguration.html#cfn-apigatewayv2-domainname-domainnameconfiguration-certificatearn)
       */
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()

      /**
       * The user-friendly name of the certificate that will be used by the edge-optimized endpoint
       * for this domain name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-domainnameconfiguration.html#cfn-apigatewayv2-domainname-domainnameconfiguration-certificatename)
       */
      override fun certificateName(): String? = unwrap(this).getCertificateName()

      /**
       * The endpoint type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-domainnameconfiguration.html#cfn-apigatewayv2-domainname-domainnameconfiguration-endpointtype)
       */
      override fun endpointType(): String? = unwrap(this).getEndpointType()

      /**
       * The Amazon resource name (ARN) for the public certificate issued by AWS Certificate Manager
       * .
       *
       * This ARN is used to validate custom domain ownership. It's required only if you configure
       * mutual TLS and use either an ACM-imported or a private CA certificate ARN as the
       * regionalCertificateArn.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-domainnameconfiguration.html#cfn-apigatewayv2-domainname-domainnameconfiguration-ownershipverificationcertificatearn)
       */
      override fun ownershipVerificationCertificateArn(): String? =
          unwrap(this).getOwnershipVerificationCertificateArn()

      /**
       * The Transport Layer Security (TLS) version of the security policy for this domain name.
       *
       * The valid values are `TLS_1_0` and `TLS_1_2` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-domainnameconfiguration.html#cfn-apigatewayv2-domainname-domainnameconfiguration-securitypolicy)
       */
      override fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DomainNameConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnDomainName.DomainNameConfigurationProperty):
          DomainNameConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainNameConfigurationProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.DomainNameConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.DomainNameConfigurationProperty
    }
  }

  /**
   * If specified, API Gateway performs two-way authentication between the client and the server.
   *
   * Clients must present a trusted certificate to access your API.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * MutualTlsAuthenticationProperty mutualTlsAuthenticationProperty =
   * MutualTlsAuthenticationProperty.builder()
   * .truststoreUri("truststoreUri")
   * .truststoreVersion("truststoreVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-mutualtlsauthentication.html)
   */
  public interface MutualTlsAuthenticationProperty {
    /**
     * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example,
     * `s3:// bucket-name / key-name` .
     *
     * The truststore can contain certificates from public or private certificate authorities. To
     * update the truststore, upload a new version to S3, and then update your custom domain name to
     * use the new version. To update the truststore, you must have permissions to access the S3
     * object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-mutualtlsauthentication.html#cfn-apigatewayv2-domainname-mutualtlsauthentication-truststoreuri)
     */
    public fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

    /**
     * The version of the S3 object that contains your truststore.
     *
     * To specify a version, you must have versioning enabled for the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-mutualtlsauthentication.html#cfn-apigatewayv2-domainname-mutualtlsauthentication-truststoreversion)
     */
    public fun truststoreVersion(): String? = unwrap(this).getTruststoreVersion()

    /**
     * A builder for [MutualTlsAuthenticationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param truststoreUri An Amazon S3 URL that specifies the truststore for mutual TLS
       * authentication, for example, `s3:// bucket-name / key-name` .
       * The truststore can contain certificates from public or private certificate authorities. To
       * update the truststore, upload a new version to S3, and then update your custom domain name to
       * use the new version. To update the truststore, you must have permissions to access the S3
       * object.
       */
      public fun truststoreUri(truststoreUri: String)

      /**
       * @param truststoreVersion The version of the S3 object that contains your truststore.
       * To specify a version, you must have versioning enabled for the S3 bucket.
       */
      public fun truststoreVersion(truststoreVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty.builder()

      /**
       * @param truststoreUri An Amazon S3 URL that specifies the truststore for mutual TLS
       * authentication, for example, `s3:// bucket-name / key-name` .
       * The truststore can contain certificates from public or private certificate authorities. To
       * update the truststore, upload a new version to S3, and then update your custom domain name to
       * use the new version. To update the truststore, you must have permissions to access the S3
       * object.
       */
      override fun truststoreUri(truststoreUri: String) {
        cdkBuilder.truststoreUri(truststoreUri)
      }

      /**
       * @param truststoreVersion The version of the S3 object that contains your truststore.
       * To specify a version, you must have versioning enabled for the S3 bucket.
       */
      override fun truststoreVersion(truststoreVersion: String) {
        cdkBuilder.truststoreVersion(truststoreVersion)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty,
    ) : CdkObject(cdkObject), MutualTlsAuthenticationProperty {
      /**
       * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example,
       * `s3:// bucket-name / key-name` .
       *
       * The truststore can contain certificates from public or private certificate authorities. To
       * update the truststore, upload a new version to S3, and then update your custom domain name to
       * use the new version. To update the truststore, you must have permissions to access the S3
       * object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-mutualtlsauthentication.html#cfn-apigatewayv2-domainname-mutualtlsauthentication-truststoreuri)
       */
      override fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

      /**
       * The version of the S3 object that contains your truststore.
       *
       * To specify a version, you must have versioning enabled for the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-mutualtlsauthentication.html#cfn-apigatewayv2-domainname-mutualtlsauthentication-truststoreversion)
       */
      override fun truststoreVersion(): String? = unwrap(this).getTruststoreVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MutualTlsAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty):
          MutualTlsAuthenticationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MutualTlsAuthenticationProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty
    }
  }
}
