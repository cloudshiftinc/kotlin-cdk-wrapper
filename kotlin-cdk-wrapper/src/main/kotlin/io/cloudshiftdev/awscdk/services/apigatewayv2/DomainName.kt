@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Custom domain resource for the API.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration;
 * Function handler;
 * String certArn = "arn:aws:acm:us-east-1:111111111111:certificate";
 * String domainName = "example.com";
 * DomainName dn = DomainName.Builder.create(this, "DN")
 * .domainName(domainName)
 * .certificate(Certificate.fromCertificateArn(this, "cert", certArn))
 * .build();
 * HttpApi api = HttpApi.Builder.create(this, "HttpProxyProdApi")
 * .defaultIntegration(new HttpLambdaIntegration("DefaultIntegration", handler))
 * // https://${dn.domainName}/foo goes to prodApi $default stage
 * .defaultDomainMapping(DomainMappingOptions.builder()
 * .domainName(dn)
 * .mappingKey("foo")
 * .build())
 * .build();
 * ```
 */
public open class DomainName internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainName,
) : Resource(cdkObject), IDomainName {
  /**
   * Adds an endpoint to a domain name.
   *
   * @param options domain name endpoint properties to be set. 
   */
  public open fun addEndpoint(options: EndpointOptions) {
    unwrap(this).addEndpoint(options.let(EndpointOptions::unwrap))
  }

  /**
   * Adds an endpoint to a domain name.
   *
   * @param options domain name endpoint properties to be set. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0eea7761dc222ea7b9c120dc4157ca7e7b265c36814cd6a541fc94d9535ecbe6")
  public open fun addEndpoint(options: EndpointOptions.Builder.() -> Unit): Unit =
      addEndpoint(EndpointOptions(options))

  /**
   * The custom domain name.
   */
  public override fun name(): String = unwrap(this).getName()

  /**
   * The domain name associated with the regional endpoint for this custom domain name.
   */
  public override fun regionalDomainName(): String = unwrap(this).getRegionalDomainName()

  /**
   * The region-specific Amazon Route 53 Hosted Zone ID of the regional endpoint.
   */
  public override fun regionalHostedZoneId(): String = unwrap(this).getRegionalHostedZoneId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.DomainName].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ACM certificate for this domain name.
     *
     * Certificate can be both ACM issued or imported.
     *
     * @param certificate The ACM certificate for this domain name. 
     */
    public fun certificate(certificate: ICertificate)

    /**
     * The user-friendly name of the certificate that will be used by the endpoint for this domain
     * name.
     *
     * Default: - No friendly certificate name
     *
     * @param certificateName The user-friendly name of the certificate that will be used by the
     * endpoint for this domain name. 
     */
    public fun certificateName(certificateName: String)

    /**
     * The custom domain name.
     *
     * @param domainName The custom domain name. 
     */
    public fun domainName(domainName: String)

    /**
     * The type of endpoint for this DomainName.
     *
     * Default: EndpointType.REGIONAL
     *
     * @param endpointType The type of endpoint for this DomainName. 
     */
    public fun endpointType(endpointType: EndpointType)

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * Default: - mTLS is not configured.
     *
     * @param mtls The mutual TLS authentication configuration for a custom domain name. 
     */
    public fun mtls(mtls: MTLSConfig)

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * Default: - mTLS is not configured.
     *
     * @param mtls The mutual TLS authentication configuration for a custom domain name. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2780e80b9beb119f553ed8d77943d149862d54b836d3fd01f019d272aa4e5f18")
    public fun mtls(mtls: MTLSConfig.Builder.() -> Unit)

    /**
     * A public certificate issued by ACM to validate that you own a custom domain.
     *
     * This parameter is required
     * only when you configure mutual TLS authentication and you specify an ACM imported or private
     * CA certificate
     * for `certificate`. The ownership certificate validates that you have permissions to use the
     * domain name.
     *
     * Default: - only required when configuring mTLS
     *
     * @param ownershipCertificate A public certificate issued by ACM to validate that you own a
     * custom domain. 
     */
    public fun ownershipCertificate(ownershipCertificate: ICertificate)

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this domain name.
     *
     * Default: SecurityPolicy.TLS_1_2
     *
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * domain name. 
     */
    public fun securityPolicy(securityPolicy: SecurityPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.DomainName.Builder =
        software.amazon.awscdk.services.apigatewayv2.DomainName.Builder.create(scope, id)

    /**
     * The ACM certificate for this domain name.
     *
     * Certificate can be both ACM issued or imported.
     *
     * @param certificate The ACM certificate for this domain name. 
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    /**
     * The user-friendly name of the certificate that will be used by the endpoint for this domain
     * name.
     *
     * Default: - No friendly certificate name
     *
     * @param certificateName The user-friendly name of the certificate that will be used by the
     * endpoint for this domain name. 
     */
    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    /**
     * The custom domain name.
     *
     * @param domainName The custom domain name. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The type of endpoint for this DomainName.
     *
     * Default: EndpointType.REGIONAL
     *
     * @param endpointType The type of endpoint for this DomainName. 
     */
    override fun endpointType(endpointType: EndpointType) {
      cdkBuilder.endpointType(endpointType.let(EndpointType::unwrap))
    }

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * Default: - mTLS is not configured.
     *
     * @param mtls The mutual TLS authentication configuration for a custom domain name. 
     */
    override fun mtls(mtls: MTLSConfig) {
      cdkBuilder.mtls(mtls.let(MTLSConfig::unwrap))
    }

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * Default: - mTLS is not configured.
     *
     * @param mtls The mutual TLS authentication configuration for a custom domain name. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2780e80b9beb119f553ed8d77943d149862d54b836d3fd01f019d272aa4e5f18")
    override fun mtls(mtls: MTLSConfig.Builder.() -> Unit): Unit = mtls(MTLSConfig(mtls))

    /**
     * A public certificate issued by ACM to validate that you own a custom domain.
     *
     * This parameter is required
     * only when you configure mutual TLS authentication and you specify an ACM imported or private
     * CA certificate
     * for `certificate`. The ownership certificate validates that you have permissions to use the
     * domain name.
     *
     * Default: - only required when configuring mTLS
     *
     * @param ownershipCertificate A public certificate issued by ACM to validate that you own a
     * custom domain. 
     */
    override fun ownershipCertificate(ownershipCertificate: ICertificate) {
      cdkBuilder.ownershipCertificate(ownershipCertificate.let(ICertificate::unwrap))
    }

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this domain name.
     *
     * Default: SecurityPolicy.TLS_1_2
     *
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * domain name. 
     */
    override fun securityPolicy(securityPolicy: SecurityPolicy) {
      cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.DomainName = cdkBuilder.build()
  }

  public companion object {
    public fun fromDomainNameAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DomainNameAttributes,
    ): IDomainName =
        software.amazon.awscdk.services.apigatewayv2.DomainName.fromDomainNameAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(DomainNameAttributes::unwrap)).let(IDomainName::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c56095f22c2c0873774339a1b537e195551eeb9d2e33592f72cef7d78b8bc1b")
    public fun fromDomainNameAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DomainNameAttributes.Builder.() -> Unit,
    ): IDomainName = fromDomainNameAttributes(scope, id, DomainNameAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DomainName {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DomainName(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainName):
        DomainName = DomainName(cdkObject)

    internal fun unwrap(wrapped: DomainName):
        software.amazon.awscdk.services.apigatewayv2.DomainName = wrapped.cdkObject
  }
}
