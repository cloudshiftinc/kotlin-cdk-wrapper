@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * properties used for creating the DomainName.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * Bucket bucket;
 * String certArn = "arn:aws:acm:us-east-1:111111111111:certificate";
 * String domainName = "example.com";
 * DomainName.Builder.create(this, "DomainName")
 * .domainName(domainName)
 * .certificate(Certificate.fromCertificateArn(this, "cert", certArn))
 * .mtls(MTLSConfig.builder()
 * .bucket(bucket)
 * .key("someca.pem")
 * .version("version")
 * .build())
 * .build();
 * ```
 */
public interface DomainNameProps : EndpointOptions {
  /**
   * The custom domain name.
   */
  public fun domainName(): String

  /**
   * The mutual TLS authentication configuration for a custom domain name.
   *
   * Default: - mTLS is not configured.
   */
  public fun mtls(): MTLSConfig? = unwrap(this).getMtls()?.let(MTLSConfig::wrap)

  /**
   * A builder for [DomainNameProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificate The ACM certificate for this domain name. 
     * Certificate can be both ACM issued or imported.
     */
    public fun certificate(certificate: ICertificate)

    /**
     * @param certificateName The user-friendly name of the certificate that will be used by the
     * endpoint for this domain name.
     */
    public fun certificateName(certificateName: String)

    /**
     * @param domainName The custom domain name. 
     */
    public fun domainName(domainName: String)

    /**
     * @param endpointType The type of endpoint for this DomainName.
     */
    public fun endpointType(endpointType: EndpointType)

    /**
     * @param ipAddressType The IP address types that can invoke the API.
     */
    public fun ipAddressType(ipAddressType: IpAddressType)

    /**
     * @param mtls The mutual TLS authentication configuration for a custom domain name.
     */
    public fun mtls(mtls: MTLSConfig)

    /**
     * @param mtls The mutual TLS authentication configuration for a custom domain name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9e45500d6f1a844597f4387a50a77a702e843a8bc7886abd4928ee4bb9e494e")
    public fun mtls(mtls: MTLSConfig.Builder.() -> Unit)

    /**
     * @param ownershipCertificate A public certificate issued by ACM to validate that you own a
     * custom domain.
     * This parameter is required
     * only when you configure mutual TLS authentication and you specify an ACM imported or private
     * CA certificate
     * for `certificate`. The ownership certificate validates that you have permissions to use the
     * domain name.
     */
    public fun ownershipCertificate(ownershipCertificate: ICertificate)

    /**
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * domain name.
     */
    public fun securityPolicy(securityPolicy: SecurityPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.DomainNameProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.DomainNameProps.builder()

    /**
     * @param certificate The ACM certificate for this domain name. 
     * Certificate can be both ACM issued or imported.
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate.Companion::unwrap))
    }

    /**
     * @param certificateName The user-friendly name of the certificate that will be used by the
     * endpoint for this domain name.
     */
    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    /**
     * @param domainName The custom domain name. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param endpointType The type of endpoint for this DomainName.
     */
    override fun endpointType(endpointType: EndpointType) {
      cdkBuilder.endpointType(endpointType.let(EndpointType.Companion::unwrap))
    }

    /**
     * @param ipAddressType The IP address types that can invoke the API.
     */
    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType.Companion::unwrap))
    }

    /**
     * @param mtls The mutual TLS authentication configuration for a custom domain name.
     */
    override fun mtls(mtls: MTLSConfig) {
      cdkBuilder.mtls(mtls.let(MTLSConfig.Companion::unwrap))
    }

    /**
     * @param mtls The mutual TLS authentication configuration for a custom domain name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9e45500d6f1a844597f4387a50a77a702e843a8bc7886abd4928ee4bb9e494e")
    override fun mtls(mtls: MTLSConfig.Builder.() -> Unit): Unit = mtls(MTLSConfig(mtls))

    /**
     * @param ownershipCertificate A public certificate issued by ACM to validate that you own a
     * custom domain.
     * This parameter is required
     * only when you configure mutual TLS authentication and you specify an ACM imported or private
     * CA certificate
     * for `certificate`. The ownership certificate validates that you have permissions to use the
     * domain name.
     */
    override fun ownershipCertificate(ownershipCertificate: ICertificate) {
      cdkBuilder.ownershipCertificate(ownershipCertificate.let(ICertificate.Companion::unwrap))
    }

    /**
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * domain name.
     */
    override fun securityPolicy(securityPolicy: SecurityPolicy) {
      cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicy.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.DomainNameProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainNameProps,
  ) : CdkObject(cdkObject),
      DomainNameProps {
    /**
     * The ACM certificate for this domain name.
     *
     * Certificate can be both ACM issued or imported.
     */
    override fun certificate(): ICertificate = unwrap(this).getCertificate().let(ICertificate::wrap)

    /**
     * The user-friendly name of the certificate that will be used by the endpoint for this domain
     * name.
     *
     * Default: - No friendly certificate name
     */
    override fun certificateName(): String? = unwrap(this).getCertificateName()

    /**
     * The custom domain name.
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The type of endpoint for this DomainName.
     *
     * Default: EndpointType.REGIONAL
     */
    override fun endpointType(): EndpointType? =
        unwrap(this).getEndpointType()?.let(EndpointType::wrap)

    /**
     * The IP address types that can invoke the API.
     *
     * Default: undefined - AWS default is IPV4
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-ip-address-type.html)
     */
    override fun ipAddressType(): IpAddressType? =
        unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * Default: - mTLS is not configured.
     */
    override fun mtls(): MTLSConfig? = unwrap(this).getMtls()?.let(MTLSConfig::wrap)

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
     */
    override fun ownershipCertificate(): ICertificate? =
        unwrap(this).getOwnershipCertificate()?.let(ICertificate::wrap)

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this domain name.
     *
     * Default: SecurityPolicy.TLS_1_2
     */
    override fun securityPolicy(): SecurityPolicy? =
        unwrap(this).getSecurityPolicy()?.let(SecurityPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DomainNameProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainNameProps):
        DomainNameProps = CdkObjectWrappers.wrap(cdkObject) as? DomainNameProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainNameProps):
        software.amazon.awscdk.services.apigatewayv2.DomainNameProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.DomainNameProps
  }
}
