@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

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
 * Properties for defining a `CfnDomainName`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnDomainNameProps cfnDomainNameProps = CfnDomainNameProps.builder()
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
public interface CfnDomainNameProps {
  /**
   * The reference to an AWS -managed certificate that will be used by edge-optimized endpoint for
   * this domain name.
   *
   * AWS Certificate Manager is the only supported source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn)
   */
  public fun certificateArn(): String? = unwrap(this).getCertificateArn()

  /**
   * The custom domain name as an API host name, for example, `my-api.example.com` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname)
   */
  public fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-endpointconfiguration)
   */
  public fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

  /**
   * The mutual TLS authentication configuration for a custom domain name.
   *
   * If specified, API Gateway performs two-way authentication between the client and the server.
   * Clients must present a trusted certificate to access your API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-mutualtlsauthentication)
   */
  public fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

  /**
   * The ARN of the public certificate issued by ACM to validate ownership of your custom domain.
   *
   * Only required when configuring mutual TLS and using an ACM imported or private CA certificate
   * ARN as the RegionalCertificateArn.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-ownershipverificationcertificatearn)
   */
  public fun ownershipVerificationCertificateArn(): String? =
      unwrap(this).getOwnershipVerificationCertificateArn()

  /**
   * The reference to an AWS -managed certificate that will be used for validating the regional
   * domain name.
   *
   * AWS Certificate Manager is the only supported source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn)
   */
  public fun regionalCertificateArn(): String? = unwrap(this).getRegionalCertificateArn()

  /**
   * The Transport Layer Security (TLS) version + cipher suite for this DomainName.
   *
   * The valid values are `TLS_1_0` and `TLS_1_2` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-securitypolicy)
   */
  public fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

  /**
   * The collection of tags.
   *
   * Each tag element is associated with a given resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDomainNameProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateArn The reference to an AWS -managed certificate that will be used by
     * edge-optimized endpoint for this domain name.
     * AWS Certificate Manager is the only supported source.
     */
    public fun certificateArn(certificateArn: String)

    /**
     * @param domainName The custom domain name as an API host name, for example,
     * `my-api.example.com` .
     */
    public fun domainName(domainName: String)

    /**
     * @param endpointConfiguration The endpoint configuration of this DomainName showing the
     * endpoint types of the domain name.
     */
    public fun endpointConfiguration(endpointConfiguration: IResolvable)

    /**
     * @param endpointConfiguration The endpoint configuration of this DomainName showing the
     * endpoint types of the domain name.
     */
    public
        fun endpointConfiguration(endpointConfiguration: CfnDomainName.EndpointConfigurationProperty)

    /**
     * @param endpointConfiguration The endpoint configuration of this DomainName showing the
     * endpoint types of the domain name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9545139855e9992f03a82cc2b0e5a20d51b5a0111d1d159fad158643616bcc0c")
    public
        fun endpointConfiguration(endpointConfiguration: CfnDomainName.EndpointConfigurationProperty.Builder.() -> Unit)

    /**
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name.
     * If specified, API Gateway performs two-way authentication between the client and the server.
     * Clients must present a trusted certificate to access your API.
     */
    public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable)

    /**
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name.
     * If specified, API Gateway performs two-way authentication between the client and the server.
     * Clients must present a trusted certificate to access your API.
     */
    public
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty)

    /**
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name.
     * If specified, API Gateway performs two-way authentication between the client and the server.
     * Clients must present a trusted certificate to access your API.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("145c4f73fb42d205904d9df209384dc6ce42cd6e966150a4b750af766f36f918")
    public
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty.Builder.() -> Unit)

    /**
     * @param ownershipVerificationCertificateArn The ARN of the public certificate issued by ACM to
     * validate ownership of your custom domain.
     * Only required when configuring mutual TLS and using an ACM imported or private CA certificate
     * ARN as the RegionalCertificateArn.
     */
    public fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String)

    /**
     * @param regionalCertificateArn The reference to an AWS -managed certificate that will be used
     * for validating the regional domain name.
     * AWS Certificate Manager is the only supported source.
     */
    public fun regionalCertificateArn(regionalCertificateArn: String)

    /**
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * DomainName.
     * The valid values are `TLS_1_0` and `TLS_1_2` .
     */
    public fun securityPolicy(securityPolicy: String)

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnDomainNameProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnDomainNameProps.builder()

    /**
     * @param certificateArn The reference to an AWS -managed certificate that will be used by
     * edge-optimized endpoint for this domain name.
     * AWS Certificate Manager is the only supported source.
     */
    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * @param domainName The custom domain name as an API host name, for example,
     * `my-api.example.com` .
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param endpointConfiguration The endpoint configuration of this DomainName showing the
     * endpoint types of the domain name.
     */
    override fun endpointConfiguration(endpointConfiguration: IResolvable) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param endpointConfiguration The endpoint configuration of this DomainName showing the
     * endpoint types of the domain name.
     */
    override
        fun endpointConfiguration(endpointConfiguration: CfnDomainName.EndpointConfigurationProperty) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(CfnDomainName.EndpointConfigurationProperty::unwrap))
    }

    /**
     * @param endpointConfiguration The endpoint configuration of this DomainName showing the
     * endpoint types of the domain name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9545139855e9992f03a82cc2b0e5a20d51b5a0111d1d159fad158643616bcc0c")
    override
        fun endpointConfiguration(endpointConfiguration: CfnDomainName.EndpointConfigurationProperty.Builder.() -> Unit):
        Unit =
        endpointConfiguration(CfnDomainName.EndpointConfigurationProperty(endpointConfiguration))

    /**
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name.
     * If specified, API Gateway performs two-way authentication between the client and the server.
     * Clients must present a trusted certificate to access your API.
     */
    override fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(IResolvable::unwrap))
    }

    /**
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name.
     * If specified, API Gateway performs two-way authentication between the client and the server.
     * Clients must present a trusted certificate to access your API.
     */
    override
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(CfnDomainName.MutualTlsAuthenticationProperty::unwrap))
    }

    /**
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name.
     * If specified, API Gateway performs two-way authentication between the client and the server.
     * Clients must present a trusted certificate to access your API.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("145c4f73fb42d205904d9df209384dc6ce42cd6e966150a4b750af766f36f918")
    override
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty.Builder.() -> Unit):
        Unit =
        mutualTlsAuthentication(CfnDomainName.MutualTlsAuthenticationProperty(mutualTlsAuthentication))

    /**
     * @param ownershipVerificationCertificateArn The ARN of the public certificate issued by ACM to
     * validate ownership of your custom domain.
     * Only required when configuring mutual TLS and using an ACM imported or private CA certificate
     * ARN as the RegionalCertificateArn.
     */
    override fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
      cdkBuilder.ownershipVerificationCertificateArn(ownershipVerificationCertificateArn)
    }

    /**
     * @param regionalCertificateArn The reference to an AWS -managed certificate that will be used
     * for validating the regional domain name.
     * AWS Certificate Manager is the only supported source.
     */
    override fun regionalCertificateArn(regionalCertificateArn: String) {
      cdkBuilder.regionalCertificateArn(regionalCertificateArn)
    }

    /**
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * DomainName.
     * The valid values are `TLS_1_0` and `TLS_1_2` .
     */
    override fun securityPolicy(securityPolicy: String) {
      cdkBuilder.securityPolicy(securityPolicy)
    }

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDomainNameProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainNameProps,
  ) : CdkObject(cdkObject), CfnDomainNameProps {
    /**
     * The reference to an AWS -managed certificate that will be used by edge-optimized endpoint for
     * this domain name.
     *
     * AWS Certificate Manager is the only supported source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn)
     */
    override fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /**
     * The custom domain name as an API host name, for example, `my-api.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname)
     */
    override fun domainName(): String? = unwrap(this).getDomainName()

    /**
     * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-endpointconfiguration)
     */
    override fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * If specified, API Gateway performs two-way authentication between the client and the server.
     * Clients must present a trusted certificate to access your API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-mutualtlsauthentication)
     */
    override fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

    /**
     * The ARN of the public certificate issued by ACM to validate ownership of your custom domain.
     *
     * Only required when configuring mutual TLS and using an ACM imported or private CA certificate
     * ARN as the RegionalCertificateArn.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-ownershipverificationcertificatearn)
     */
    override fun ownershipVerificationCertificateArn(): String? =
        unwrap(this).getOwnershipVerificationCertificateArn()

    /**
     * The reference to an AWS -managed certificate that will be used for validating the regional
     * domain name.
     *
     * AWS Certificate Manager is the only supported source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn)
     */
    override fun regionalCertificateArn(): String? = unwrap(this).getRegionalCertificateArn()

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this DomainName.
     *
     * The valid values are `TLS_1_0` and `TLS_1_2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-securitypolicy)
     */
    override fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainNameProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainNameProps):
        CfnDomainNameProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDomainNameProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainNameProps):
        software.amazon.awscdk.services.apigateway.CfnDomainNameProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnDomainNameProps
  }
}
