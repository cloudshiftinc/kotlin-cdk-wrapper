@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.acmpca.ICertificateAuthority
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for your private certificate.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.acmpca.*;
 * PrivateCertificate.Builder.create(this, "PrivateCertificate")
 * .domainName("test.example.com")
 * .subjectAlternativeNames(List.of("cool.example.com", "test.example.net")) // optional
 * .certificateAuthority(CertificateAuthority.fromCertificateAuthorityArn(this, "CA",
 * "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/023077d8-2bfa-4eb0-8f22-05c96deade77"))
 * .keyAlgorithm(KeyAlgorithm.RSA_2048)
 * .build();
 * ```
 */
public interface PrivateCertificateProps {
  /**
   * Private certificate authority (CA) that will be used to issue the certificate.
   */
  public fun certificateAuthority(): ICertificateAuthority

  /**
   * Fully-qualified domain name to request a private certificate for.
   *
   * May contain wildcards, such as `*.domain.com`.
   */
  public fun domainName(): String

  /**
   * Specifies the algorithm of the public and private key pair that your certificate uses to
   * encrypt data.
   *
   * When you request a private PKI certificate signed by a CA from AWS Private CA, the specified
   * signing algorithm family
   * (RSA or ECDSA) must match the algorithm family of the CA's secret key.
   *
   * Default: KeyAlgorithm.RSA_2048
   *
   * [Documentation](https://docs.aws.amazon.com/acm/latest/userguide/acm-certificate.html#algorithms.title)
   */
  public fun keyAlgorithm(): KeyAlgorithm? = unwrap(this).getKeyAlgorithm()?.let(KeyAlgorithm::wrap)

  /**
   * Alternative domain names on your private certificate.
   *
   * Use this to register alternative domain names that represent the same site.
   *
   * Default: - No additional FQDNs will be included as alternative domain names.
   */
  public fun subjectAlternativeNames(): List<String> = unwrap(this).getSubjectAlternativeNames() ?:
      emptyList()

  /**
   * A builder for [PrivateCertificateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateAuthority Private certificate authority (CA) that will be used to issue the
     * certificate. 
     */
    public fun certificateAuthority(certificateAuthority: ICertificateAuthority)

    /**
     * @param domainName Fully-qualified domain name to request a private certificate for. 
     * May contain wildcards, such as `*.domain.com`.
     */
    public fun domainName(domainName: String)

    /**
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     * certificate uses to encrypt data.
     * When you request a private PKI certificate signed by a CA from AWS Private CA, the specified
     * signing algorithm family
     * (RSA or ECDSA) must match the algorithm family of the CA's secret key.
     */
    public fun keyAlgorithm(keyAlgorithm: KeyAlgorithm)

    /**
     * @param subjectAlternativeNames Alternative domain names on your private certificate.
     * Use this to register alternative domain names that represent the same site.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

    /**
     * @param subjectAlternativeNames Alternative domain names on your private certificate.
     * Use this to register alternative domain names that represent the same site.
     */
    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps.Builder =
        software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps.builder()

    /**
     * @param certificateAuthority Private certificate authority (CA) that will be used to issue the
     * certificate. 
     */
    override fun certificateAuthority(certificateAuthority: ICertificateAuthority) {
      cdkBuilder.certificateAuthority(certificateAuthority.let(ICertificateAuthority::unwrap))
    }

    /**
     * @param domainName Fully-qualified domain name to request a private certificate for. 
     * May contain wildcards, such as `*.domain.com`.
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     * certificate uses to encrypt data.
     * When you request a private PKI certificate signed by a CA from AWS Private CA, the specified
     * signing algorithm family
     * (RSA or ECDSA) must match the algorithm family of the CA's secret key.
     */
    override fun keyAlgorithm(keyAlgorithm: KeyAlgorithm) {
      cdkBuilder.keyAlgorithm(keyAlgorithm.let(KeyAlgorithm::unwrap))
    }

    /**
     * @param subjectAlternativeNames Alternative domain names on your private certificate.
     * Use this to register alternative domain names that represent the same site.
     */
    override fun subjectAlternativeNames(subjectAlternativeNames: List<String>) {
      cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    /**
     * @param subjectAlternativeNames Alternative domain names on your private certificate.
     * Use this to register alternative domain names that represent the same site.
     */
    override fun subjectAlternativeNames(vararg subjectAlternativeNames: String): Unit =
        subjectAlternativeNames(subjectAlternativeNames.toList())

    public fun build(): software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps,
  ) : CdkObject(cdkObject), PrivateCertificateProps {
    /**
     * Private certificate authority (CA) that will be used to issue the certificate.
     */
    override fun certificateAuthority(): ICertificateAuthority =
        unwrap(this).getCertificateAuthority().let(ICertificateAuthority::wrap)

    /**
     * Fully-qualified domain name to request a private certificate for.
     *
     * May contain wildcards, such as `*.domain.com`.
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * Specifies the algorithm of the public and private key pair that your certificate uses to
     * encrypt data.
     *
     * When you request a private PKI certificate signed by a CA from AWS Private CA, the specified
     * signing algorithm family
     * (RSA or ECDSA) must match the algorithm family of the CA's secret key.
     *
     * Default: KeyAlgorithm.RSA_2048
     *
     * [Documentation](https://docs.aws.amazon.com/acm/latest/userguide/acm-certificate.html#algorithms.title)
     */
    override fun keyAlgorithm(): KeyAlgorithm? =
        unwrap(this).getKeyAlgorithm()?.let(KeyAlgorithm::wrap)

    /**
     * Alternative domain names on your private certificate.
     *
     * Use this to register alternative domain names that represent the same site.
     *
     * Default: - No additional FQDNs will be included as alternative domain names.
     */
    override fun subjectAlternativeNames(): List<String> = unwrap(this).getSubjectAlternativeNames()
        ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PrivateCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps):
        PrivateCertificateProps = CdkObjectWrappers.wrap(cdkObject) as? PrivateCertificateProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PrivateCertificateProps):
        software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps
  }
}
