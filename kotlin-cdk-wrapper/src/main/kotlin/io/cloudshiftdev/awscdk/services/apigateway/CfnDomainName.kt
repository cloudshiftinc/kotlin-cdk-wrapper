@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
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
 * The `AWS::ApiGateway::DomainName` resource specifies a custom domain name for your API in API
 * Gateway.
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
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnDomainName cfnDomainName = CfnDomainName.Builder.create(this, "MyCfnDomainName")
 * .certificateArn("certificateArn")
 * .domainName("domainName")
 * .endpointConfiguration(EndpointConfigurationProperty.builder()
 * .types(List.of("types"))
 * .build())
 * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
 * .truststoreUri("truststoreUri")
 * .truststoreVersion("truststoreVersion")
 * .build())
 * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
 * .regionalCertificateArn("regionalCertificateArn")
 * .securityPolicy("securityPolicy")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
 */
public open class CfnDomainName internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainName,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon CloudFront distribution domain name that's mapped to the custom domain name.
   *
   * This is only applicable for endpoints whose type is `EDGE` .
   *
   * Example: `d111111abcdef8.cloudfront.net`
   */
  public open fun attrDistributionDomainName(): String =
      unwrap(this).getAttrDistributionDomainName()

  /**
   * The region-agnostic Amazon Route 53 Hosted Zone ID of the edge-optimized endpoint.
   *
   * The only valid value is `Z2FDTNDATAQYW2` for all regions.
   */
  public open fun attrDistributionHostedZoneId(): String =
      unwrap(this).getAttrDistributionHostedZoneId()

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
   * The reference to an AWS -managed certificate that will be used by edge-optimized endpoint for
   * this domain name.
   */
  public open fun certificateArn(): String? = unwrap(this).getCertificateArn()

  /**
   * The reference to an AWS -managed certificate that will be used by edge-optimized endpoint for
   * this domain name.
   */
  public open fun certificateArn(`value`: String) {
    unwrap(this).setCertificateArn(`value`)
  }

  /**
   * The custom domain name as an API host name, for example, `my-api.example.com` .
   */
  public open fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * The custom domain name as an API host name, for example, `my-api.example.com` .
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
   */
  public open fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

  /**
   * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
   */
  public open fun endpointConfiguration(`value`: IResolvable) {
    unwrap(this).setEndpointConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
   */
  public open fun endpointConfiguration(`value`: EndpointConfigurationProperty) {
    unwrap(this).setEndpointConfiguration(`value`.let(EndpointConfigurationProperty::unwrap))
  }

  /**
   * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("896c8399b94c0c0d9d1335e8895a3932831259d754bbb201b7d7ed1986da51b4")
  public open fun endpointConfiguration(`value`: EndpointConfigurationProperty.Builder.() -> Unit):
      Unit = endpointConfiguration(EndpointConfigurationProperty(`value`))

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
  @JvmName("c14832ea5724bde84d1711c09a4b1d06c16b24a508e4f35ab4dc783664936b71")
  public open
      fun mutualTlsAuthentication(`value`: MutualTlsAuthenticationProperty.Builder.() -> Unit): Unit
      = mutualTlsAuthentication(MutualTlsAuthenticationProperty(`value`))

  /**
   * The ARN of the public certificate issued by ACM to validate ownership of your custom domain.
   */
  public open fun ownershipVerificationCertificateArn(): String? =
      unwrap(this).getOwnershipVerificationCertificateArn()

  /**
   * The ARN of the public certificate issued by ACM to validate ownership of your custom domain.
   */
  public open fun ownershipVerificationCertificateArn(`value`: String) {
    unwrap(this).setOwnershipVerificationCertificateArn(`value`)
  }

  /**
   * The reference to an AWS -managed certificate that will be used for validating the regional
   * domain name.
   */
  public open fun regionalCertificateArn(): String? = unwrap(this).getRegionalCertificateArn()

  /**
   * The reference to an AWS -managed certificate that will be used for validating the regional
   * domain name.
   */
  public open fun regionalCertificateArn(`value`: String) {
    unwrap(this).setRegionalCertificateArn(`value`)
  }

  /**
   * The Transport Layer Security (TLS) version + cipher suite for this DomainName.
   */
  public open fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

  /**
   * The Transport Layer Security (TLS) version + cipher suite for this DomainName.
   */
  public open fun securityPolicy(`value`: String) {
    unwrap(this).setSecurityPolicy(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The collection of tags.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The collection of tags.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The collection of tags.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnDomainName].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The reference to an AWS -managed certificate that will be used by edge-optimized endpoint for
     * this domain name.
     *
     * AWS Certificate Manager is the only supported source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn)
     * @param certificateArn The reference to an AWS -managed certificate that will be used by
     * edge-optimized endpoint for this domain name. 
     */
    public fun certificateArn(certificateArn: String)

    /**
     * The custom domain name as an API host name, for example, `my-api.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname)
     * @param domainName The custom domain name as an API host name, for example,
     * `my-api.example.com` . 
     */
    public fun domainName(domainName: String)

    /**
     * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-endpointconfiguration)
     * @param endpointConfiguration The endpoint configuration of this DomainName showing the
     * endpoint types of the domain name. 
     */
    public fun endpointConfiguration(endpointConfiguration: IResolvable)

    /**
     * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-endpointconfiguration)
     * @param endpointConfiguration The endpoint configuration of this DomainName showing the
     * endpoint types of the domain name. 
     */
    public fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty)

    /**
     * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-endpointconfiguration)
     * @param endpointConfiguration The endpoint configuration of this DomainName showing the
     * endpoint types of the domain name. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ba0f08964b74a867e691b3526f84082d1f0fb5692be8fe83804feb0d341d2f7")
    public
        fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty.Builder.() -> Unit)

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * If specified, API Gateway performs two-way authentication between the client and the server.
     * Clients must present a trusted certificate to access your API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-mutualtlsauthentication)
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name. 
     */
    public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable)

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * If specified, API Gateway performs two-way authentication between the client and the server.
     * Clients must present a trusted certificate to access your API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-mutualtlsauthentication)
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name. 
     */
    public fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty)

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * If specified, API Gateway performs two-way authentication between the client and the server.
     * Clients must present a trusted certificate to access your API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-mutualtlsauthentication)
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5e1696e2ca70133c409015c3dd14f859e386a8457c183e158ca5d866a8b48cd")
    public
        fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit)

    /**
     * The ARN of the public certificate issued by ACM to validate ownership of your custom domain.
     *
     * Only required when configuring mutual TLS and using an ACM imported or private CA certificate
     * ARN as the RegionalCertificateArn.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-ownershipverificationcertificatearn)
     * @param ownershipVerificationCertificateArn The ARN of the public certificate issued by ACM to
     * validate ownership of your custom domain. 
     */
    public fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String)

    /**
     * The reference to an AWS -managed certificate that will be used for validating the regional
     * domain name.
     *
     * AWS Certificate Manager is the only supported source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn)
     * @param regionalCertificateArn The reference to an AWS -managed certificate that will be used
     * for validating the regional domain name. 
     */
    public fun regionalCertificateArn(regionalCertificateArn: String)

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this DomainName.
     *
     * The valid values are `TLS_1_0` and `TLS_1_2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-securitypolicy)
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * DomainName. 
     */
    public fun securityPolicy(securityPolicy: String)

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-tags)
     * @param tags The collection of tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-tags)
     * @param tags The collection of tags. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnDomainName.Builder =
        software.amazon.awscdk.services.apigateway.CfnDomainName.Builder.create(scope, id)

    /**
     * The reference to an AWS -managed certificate that will be used by edge-optimized endpoint for
     * this domain name.
     *
     * AWS Certificate Manager is the only supported source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn)
     * @param certificateArn The reference to an AWS -managed certificate that will be used by
     * edge-optimized endpoint for this domain name. 
     */
    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * The custom domain name as an API host name, for example, `my-api.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname)
     * @param domainName The custom domain name as an API host name, for example,
     * `my-api.example.com` . 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-endpointconfiguration)
     * @param endpointConfiguration The endpoint configuration of this DomainName showing the
     * endpoint types of the domain name. 
     */
    override fun endpointConfiguration(endpointConfiguration: IResolvable) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-endpointconfiguration)
     * @param endpointConfiguration The endpoint configuration of this DomainName showing the
     * endpoint types of the domain name. 
     */
    override fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfigurationProperty::unwrap))
    }

    /**
     * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-endpointconfiguration)
     * @param endpointConfiguration The endpoint configuration of this DomainName showing the
     * endpoint types of the domain name. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ba0f08964b74a867e691b3526f84082d1f0fb5692be8fe83804feb0d341d2f7")
    override
        fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty.Builder.() -> Unit):
        Unit = endpointConfiguration(EndpointConfigurationProperty(endpointConfiguration))

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * If specified, API Gateway performs two-way authentication between the client and the server.
     * Clients must present a trusted certificate to access your API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-mutualtlsauthentication)
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name. 
     */
    override fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(IResolvable::unwrap))
    }

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * If specified, API Gateway performs two-way authentication between the client and the server.
     * Clients must present a trusted certificate to access your API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-mutualtlsauthentication)
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name. 
     */
    override fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(MutualTlsAuthenticationProperty::unwrap))
    }

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * If specified, API Gateway performs two-way authentication between the client and the server.
     * Clients must present a trusted certificate to access your API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-mutualtlsauthentication)
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5e1696e2ca70133c409015c3dd14f859e386a8457c183e158ca5d866a8b48cd")
    override
        fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit):
        Unit = mutualTlsAuthentication(MutualTlsAuthenticationProperty(mutualTlsAuthentication))

    /**
     * The ARN of the public certificate issued by ACM to validate ownership of your custom domain.
     *
     * Only required when configuring mutual TLS and using an ACM imported or private CA certificate
     * ARN as the RegionalCertificateArn.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-ownershipverificationcertificatearn)
     * @param ownershipVerificationCertificateArn The ARN of the public certificate issued by ACM to
     * validate ownership of your custom domain. 
     */
    override fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
      cdkBuilder.ownershipVerificationCertificateArn(ownershipVerificationCertificateArn)
    }

    /**
     * The reference to an AWS -managed certificate that will be used for validating the regional
     * domain name.
     *
     * AWS Certificate Manager is the only supported source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn)
     * @param regionalCertificateArn The reference to an AWS -managed certificate that will be used
     * for validating the regional domain name. 
     */
    override fun regionalCertificateArn(regionalCertificateArn: String) {
      cdkBuilder.regionalCertificateArn(regionalCertificateArn)
    }

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this DomainName.
     *
     * The valid values are `TLS_1_0` and `TLS_1_2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-securitypolicy)
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * DomainName. 
     */
    override fun securityPolicy(securityPolicy: String) {
      cdkBuilder.securityPolicy(securityPolicy)
    }

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-tags)
     * @param tags The collection of tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-tags)
     * @param tags The collection of tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDomainName =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnDomainName.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomainName {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomainName(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainName):
        CfnDomainName = CfnDomainName(cdkObject)

    internal fun unwrap(wrapped: CfnDomainName):
        software.amazon.awscdk.services.apigateway.CfnDomainName = wrapped.cdkObject
  }

  /**
   * The mutual TLS authentication configuration for a custom domain name.
   *
   * If specified, API Gateway performs two-way authentication between the client and the server.
   * Clients must present a trusted certificate to access your API.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * MutualTlsAuthenticationProperty mutualTlsAuthenticationProperty =
   * MutualTlsAuthenticationProperty.builder()
   * .truststoreUri("truststoreUri")
   * .truststoreVersion("truststoreVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-mutualtlsauthentication.html)
   */
  public interface MutualTlsAuthenticationProperty {
    /**
     * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example
     * `s3://bucket-name/key-name` .
     *
     * The truststore can contain certificates from public or private certificate authorities. To
     * update the truststore, upload a new version to S3, and then update your custom domain name to
     * use the new version. To update the truststore, you must have permissions to access the S3
     * object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-mutualtlsauthentication.html#cfn-apigateway-domainname-mutualtlsauthentication-truststoreuri)
     */
    public fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

    /**
     * The version of the S3 object that contains your truststore.
     *
     * To specify a version, you must have versioning enabled for the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-mutualtlsauthentication.html#cfn-apigateway-domainname-mutualtlsauthentication-truststoreversion)
     */
    public fun truststoreVersion(): String? = unwrap(this).getTruststoreVersion()

    /**
     * A builder for [MutualTlsAuthenticationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param truststoreUri An Amazon S3 URL that specifies the truststore for mutual TLS
       * authentication, for example `s3://bucket-name/key-name` .
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
          software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty.Builder
          =
          software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty.builder()

      /**
       * @param truststoreUri An Amazon S3 URL that specifies the truststore for mutual TLS
       * authentication, for example `s3://bucket-name/key-name` .
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
          software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty,
    ) : CdkObject(cdkObject), MutualTlsAuthenticationProperty {
      /**
       * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example
       * `s3://bucket-name/key-name` .
       *
       * The truststore can contain certificates from public or private certificate authorities. To
       * update the truststore, upload a new version to S3, and then update your custom domain name to
       * use the new version. To update the truststore, you must have permissions to access the S3
       * object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-mutualtlsauthentication.html#cfn-apigateway-domainname-mutualtlsauthentication-truststoreuri)
       */
      override fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

      /**
       * The version of the S3 object that contains your truststore.
       *
       * To specify a version, you must have versioning enabled for the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-mutualtlsauthentication.html#cfn-apigateway-domainname-mutualtlsauthentication-truststoreversion)
       */
      override fun truststoreVersion(): String? = unwrap(this).getTruststoreVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MutualTlsAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty):
          MutualTlsAuthenticationProperty = CdkObjectWrappers.wrap(cdkObject) as
          MutualTlsAuthenticationProperty

      internal fun unwrap(wrapped: MutualTlsAuthenticationProperty):
          software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty
    }
  }

  /**
   * The `EndpointConfiguration` property type specifies the endpoint types of an Amazon API Gateway
   * domain name.
   *
   * `EndpointConfiguration` is a property of the
   * [AWS::ApiGateway::DomainName](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * EndpointConfigurationProperty endpointConfigurationProperty =
   * EndpointConfigurationProperty.builder()
   * .types(List.of("types"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html)
   */
  public interface EndpointConfigurationProperty {
    /**
     * A list of endpoint types of an API (RestApi) or its custom domain name (DomainName).
     *
     * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
     * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
     * the endpoint type is `PRIVATE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html#cfn-apigateway-domainname-endpointconfiguration-types)
     */
    public fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

    /**
     * A builder for [EndpointConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param types A list of endpoint types of an API (RestApi) or its custom domain name
       * (DomainName).
       * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
       * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
       * the endpoint type is `PRIVATE` .
       */
      public fun types(types: List<String>)

      /**
       * @param types A list of endpoint types of an API (RestApi) or its custom domain name
       * (DomainName).
       * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
       * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
       * the endpoint type is `PRIVATE` .
       */
      public fun types(vararg types: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty.builder()

      /**
       * @param types A list of endpoint types of an API (RestApi) or its custom domain name
       * (DomainName).
       * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
       * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
       * the endpoint type is `PRIVATE` .
       */
      override fun types(types: List<String>) {
        cdkBuilder.types(types)
      }

      /**
       * @param types A list of endpoint types of an API (RestApi) or its custom domain name
       * (DomainName).
       * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
       * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
       * the endpoint type is `PRIVATE` .
       */
      override fun types(vararg types: String): Unit = types(types.toList())

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty,
    ) : CdkObject(cdkObject), EndpointConfigurationProperty {
      /**
       * A list of endpoint types of an API (RestApi) or its custom domain name (DomainName).
       *
       * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
       * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
       * the endpoint type is `PRIVATE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html#cfn-apigateway-domainname-endpointconfiguration-types)
       */
      override fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty):
          EndpointConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          EndpointConfigurationProperty

      internal fun unwrap(wrapped: EndpointConfigurationProperty):
          software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty
    }
  }
}
