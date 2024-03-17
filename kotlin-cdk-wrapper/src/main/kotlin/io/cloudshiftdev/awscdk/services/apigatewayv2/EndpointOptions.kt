@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Unit

/**
 * properties for creating a domain name endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * Certificate certificate;
 * EndpointOptions endpointOptions = EndpointOptions.builder()
 * .certificate(certificate)
 * // the properties below are optional
 * .certificateName("certificateName")
 * .endpointType(EndpointType.EDGE)
 * .ownershipCertificate(certificate)
 * .securityPolicy(SecurityPolicy.TLS_1_0)
 * .build();
 * ```
 */
public interface EndpointOptions {
  /**
   * The ACM certificate for this domain name.
   *
   * Certificate can be both ACM issued or imported.
   */
  public fun certificate(): ICertificate

  /**
   * The user-friendly name of the certificate that will be used by the endpoint for this domain
   * name.
   *
   * Default: - No friendly certificate name
   */
  public fun certificateName(): String? = unwrap(this).getCertificateName()

  /**
   * The type of endpoint for this DomainName.
   *
   * Default: EndpointType.REGIONAL
   */
  public fun endpointType(): EndpointType? = unwrap(this).getEndpointType()?.let(EndpointType::wrap)

  /**
   * A public certificate issued by ACM to validate that you own a custom domain.
   *
   * This parameter is required
   * only when you configure mutual TLS authentication and you specify an ACM imported or private CA
   * certificate
   * for `certificate`. The ownership certificate validates that you have permissions to use the
   * domain name.
   *
   * Default: - only required when configuring mTLS
   */
  public fun ownershipCertificate(): ICertificate? =
      unwrap(this).getOwnershipCertificate()?.let(ICertificate::wrap)

  /**
   * The Transport Layer Security (TLS) version + cipher suite for this domain name.
   *
   * Default: SecurityPolicy.TLS_1_2
   */
  public fun securityPolicy(): SecurityPolicy? =
      unwrap(this).getSecurityPolicy()?.let(SecurityPolicy::wrap)

  /**
   * A builder for [EndpointOptions]
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
     * @param endpointType The type of endpoint for this DomainName.
     */
    public fun endpointType(endpointType: EndpointType)

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
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.EndpointOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.EndpointOptions.builder()

    /**
     * @param certificate The ACM certificate for this domain name. 
     * Certificate can be both ACM issued or imported.
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    /**
     * @param certificateName The user-friendly name of the certificate that will be used by the
     * endpoint for this domain name.
     */
    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    /**
     * @param endpointType The type of endpoint for this DomainName.
     */
    override fun endpointType(endpointType: EndpointType) {
      cdkBuilder.endpointType(endpointType.let(EndpointType::unwrap))
    }

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
      cdkBuilder.ownershipCertificate(ownershipCertificate.let(ICertificate::unwrap))
    }

    /**
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * domain name.
     */
    override fun securityPolicy(securityPolicy: SecurityPolicy) {
      cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.EndpointOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.EndpointOptions,
  ) : CdkObject(cdkObject), EndpointOptions {
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
     * The type of endpoint for this DomainName.
     *
     * Default: EndpointType.REGIONAL
     */
    override fun endpointType(): EndpointType? =
        unwrap(this).getEndpointType()?.let(EndpointType::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): EndpointOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.EndpointOptions):
        EndpointOptions = CdkObjectWrappers.wrap(cdkObject) as? EndpointOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EndpointOptions):
        software.amazon.awscdk.services.apigatewayv2.EndpointOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.EndpointOptions
  }
}
