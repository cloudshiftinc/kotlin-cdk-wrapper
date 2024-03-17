@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * Object acmCertificateForExampleCom;
 * RestApi restApi;
 * DomainName.Builder.create(this, "custom-domain")
 * .domainName("example.com")
 * .certificate(acmCertificateForExampleCom)
 * .mapping(restApi)
 * .basePath("orders/v1/api")
 * .build();
 * ```
 */
public interface DomainNameProps : DomainNameOptions {
  /**
   * If specified, all requests to this domain will be mapped to the production deployment of this
   * API.
   *
   * If you wish to map this domain to multiple APIs
   * with different base paths, use `addBasePathMapping` or `addApiMapping`.
   *
   * Default: - you will have to call `addBasePathMapping` to map this domain to
   * API endpoints.
   */
  public fun mapping(): IRestApi? = unwrap(this).getMapping()?.let(IRestApi::wrap)

  /**
   * A builder for [DomainNameProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param basePath The base path name that callers of the API must provide in the URL after the
     * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
     * string.
     */
    public fun basePath(basePath: String)

    /**
     * @param certificate The reference to an AWS-managed certificate for use by the edge-optimized
     * endpoint for the domain name. 
     * For "EDGE" domain names, the certificate
     * needs to be in the US East (N. Virginia) region.
     */
    public fun certificate(certificate: ICertificate)

    /**
     * @param domainName The custom domain name for your API. 
     * Uppercase letters are not supported.
     */
    public fun domainName(domainName: String)

    /**
     * @param endpointType The type of endpoint for this DomainName.
     */
    public fun endpointType(endpointType: EndpointType)

    /**
     * @param mapping If specified, all requests to this domain will be mapped to the production
     * deployment of this API.
     * If you wish to map this domain to multiple APIs
     * with different base paths, use `addBasePathMapping` or `addApiMapping`.
     */
    public fun mapping(mapping: IRestApi)

    /**
     * @param mtls The mutual TLS authentication configuration for a custom domain name.
     */
    public fun mtls(mtls: MTLSConfig)

    /**
     * @param mtls The mutual TLS authentication configuration for a custom domain name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34ee6d37573f7a8663e05ba9c26dba0add485babfbdbda97037ce9e82318e0a1")
    public fun mtls(mtls: MTLSConfig.Builder.() -> Unit)

    /**
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * domain name.
     */
    public fun securityPolicy(securityPolicy: SecurityPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.DomainNameProps.Builder =
        software.amazon.awscdk.services.apigateway.DomainNameProps.builder()

    /**
     * @param basePath The base path name that callers of the API must provide in the URL after the
     * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
     * string.
     */
    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    /**
     * @param certificate The reference to an AWS-managed certificate for use by the edge-optimized
     * endpoint for the domain name. 
     * For "EDGE" domain names, the certificate
     * needs to be in the US East (N. Virginia) region.
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    /**
     * @param domainName The custom domain name for your API. 
     * Uppercase letters are not supported.
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param endpointType The type of endpoint for this DomainName.
     */
    override fun endpointType(endpointType: EndpointType) {
      cdkBuilder.endpointType(endpointType.let(EndpointType::unwrap))
    }

    /**
     * @param mapping If specified, all requests to this domain will be mapped to the production
     * deployment of this API.
     * If you wish to map this domain to multiple APIs
     * with different base paths, use `addBasePathMapping` or `addApiMapping`.
     */
    override fun mapping(mapping: IRestApi) {
      cdkBuilder.mapping(mapping.let(IRestApi::unwrap))
    }

    /**
     * @param mtls The mutual TLS authentication configuration for a custom domain name.
     */
    override fun mtls(mtls: MTLSConfig) {
      cdkBuilder.mtls(mtls.let(MTLSConfig::unwrap))
    }

    /**
     * @param mtls The mutual TLS authentication configuration for a custom domain name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34ee6d37573f7a8663e05ba9c26dba0add485babfbdbda97037ce9e82318e0a1")
    override fun mtls(mtls: MTLSConfig.Builder.() -> Unit): Unit = mtls(MTLSConfig(mtls))

    /**
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * domain name.
     */
    override fun securityPolicy(securityPolicy: SecurityPolicy) {
      cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.DomainNameProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.DomainNameProps,
  ) : CdkObject(cdkObject), DomainNameProps {
    /**
     * The base path name that callers of the API must provide in the URL after the domain name
     * (e.g. `example.com/base-path`). If you specify this property, it can't be an empty string.
     *
     * Default: - map requests from the domain root (e.g. `example.com`).
     */
    override fun basePath(): String? = unwrap(this).getBasePath()

    /**
     * The reference to an AWS-managed certificate for use by the edge-optimized endpoint for the
     * domain name.
     *
     * For "EDGE" domain names, the certificate
     * needs to be in the US East (N. Virginia) region.
     */
    override fun certificate(): ICertificate = unwrap(this).getCertificate().let(ICertificate::wrap)

    /**
     * The custom domain name for your API.
     *
     * Uppercase letters are not supported.
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The type of endpoint for this DomainName.
     *
     * Default: REGIONAL
     */
    override fun endpointType(): EndpointType? =
        unwrap(this).getEndpointType()?.let(EndpointType::wrap)

    /**
     * If specified, all requests to this domain will be mapped to the production deployment of this
     * API.
     *
     * If you wish to map this domain to multiple APIs
     * with different base paths, use `addBasePathMapping` or `addApiMapping`.
     *
     * Default: - you will have to call `addBasePathMapping` to map this domain to
     * API endpoints.
     */
    override fun mapping(): IRestApi? = unwrap(this).getMapping()?.let(IRestApi::wrap)

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * Default: - mTLS is not configured.
     */
    override fun mtls(): MTLSConfig? = unwrap(this).getMtls()?.let(MTLSConfig::wrap)

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this domain name.
     *
     * Default: SecurityPolicy.TLS_1_2
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
     */
    override fun securityPolicy(): SecurityPolicy? =
        unwrap(this).getSecurityPolicy()?.let(SecurityPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DomainNameProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.DomainNameProps):
        DomainNameProps = CdkObjectWrappers.wrap(cdkObject) as? DomainNameProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainNameProps):
        software.amazon.awscdk.services.apigateway.DomainNameProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.DomainNameProps
  }
}
