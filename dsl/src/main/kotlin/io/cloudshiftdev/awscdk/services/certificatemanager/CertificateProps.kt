package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CertificateProps {
  /**
   * The Certificate name.
   *
   * Since the Certificate resource doesn't support providing a physical name, the value provided
   * here will be recorded in the `Name` tag
   *
   * Default: the full, absolute path of this construct
   */
  public fun certificateName(): String? = unwrap(this).getCertificateName()

  /**
   * Fully-qualified domain name to request a certificate for.
   *
   * May contain wildcards, such as `*.domain.com`.
   */
  public fun domainName(): String

  /**
   * Specifies the algorithm of the public and private key pair that your certificate uses to
   * encrypt data.
   *
   * Default: KeyAlgorithm.RSA_2048
   *
   * [Documentation](https://docs.aws.amazon.com/acm/latest/userguide/acm-certificate.html#algorithms.title)
   */
  public fun keyAlgorithm(): KeyAlgorithm? = unwrap(this).getKeyAlgorithm()?.let(KeyAlgorithm::wrap)

  /**
   * Alternative domain names on your certificate.
   *
   * Use this to register alternative domain names that represent the same site.
   *
   * Default: - No additional FQDNs will be included as alternative domain names.
   */
  public fun subjectAlternativeNames(): List<String> = unwrap(this).getSubjectAlternativeNames() ?:
      emptyList()

  /**
   * Enable or disable transparency logging for this certificate.
   *
   * Once a certificate has been logged, it cannot be removed from the log.
   * Opting out at that point will have no effect. If you opt out of logging
   * when you request a certificate and then choose later to opt back in,
   * your certificate will not be logged until it is renewed.
   * If you want the certificate to be logged immediately, we recommend that you issue a new one.
   *
   * Default: true
   *
   * [Documentation](https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency)
   */
  public fun transparencyLoggingEnabled(): Boolean? = unwrap(this).getTransparencyLoggingEnabled()

  /**
   * How to validate this certificate.
   *
   * Default: CertificateValidation.fromEmail()
   */
  public fun validation(): CertificateValidation? =
      unwrap(this).getValidation()?.let(CertificateValidation::wrap)

  /**
   * A builder for [CertificateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateName The Certificate name.
     * Since the Certificate resource doesn't support providing a physical name, the value provided
     * here will be recorded in the `Name` tag
     */
    public fun certificateName(certificateName: String)

    /**
     * @param domainName Fully-qualified domain name to request a certificate for. 
     * May contain wildcards, such as `*.domain.com`.
     */
    public fun domainName(domainName: String)

    /**
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     * certificate uses to encrypt data.
     */
    public fun keyAlgorithm(keyAlgorithm: KeyAlgorithm)

    /**
     * @param subjectAlternativeNames Alternative domain names on your certificate.
     * Use this to register alternative domain names that represent the same site.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

    /**
     * @param subjectAlternativeNames Alternative domain names on your certificate.
     * Use this to register alternative domain names that represent the same site.
     */
    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)

    /**
     * @param transparencyLoggingEnabled Enable or disable transparency logging for this
     * certificate.
     * Once a certificate has been logged, it cannot be removed from the log.
     * Opting out at that point will have no effect. If you opt out of logging
     * when you request a certificate and then choose later to opt back in,
     * your certificate will not be logged until it is renewed.
     * If you want the certificate to be logged immediately, we recommend that you issue a new one.
     */
    public fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean)

    /**
     * @param validation How to validate this certificate.
     */
    public fun validation(validation: CertificateValidation)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.CertificateProps.Builder =
        software.amazon.awscdk.services.certificatemanager.CertificateProps.builder()

    /**
     * @param certificateName The Certificate name.
     * Since the Certificate resource doesn't support providing a physical name, the value provided
     * here will be recorded in the `Name` tag
     */
    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    /**
     * @param domainName Fully-qualified domain name to request a certificate for. 
     * May contain wildcards, such as `*.domain.com`.
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     * certificate uses to encrypt data.
     */
    override fun keyAlgorithm(keyAlgorithm: KeyAlgorithm) {
      cdkBuilder.keyAlgorithm(keyAlgorithm.let(KeyAlgorithm::unwrap))
    }

    /**
     * @param subjectAlternativeNames Alternative domain names on your certificate.
     * Use this to register alternative domain names that represent the same site.
     */
    override fun subjectAlternativeNames(subjectAlternativeNames: List<String>) {
      cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    /**
     * @param subjectAlternativeNames Alternative domain names on your certificate.
     * Use this to register alternative domain names that represent the same site.
     */
    override fun subjectAlternativeNames(vararg subjectAlternativeNames: String): Unit =
        subjectAlternativeNames(subjectAlternativeNames.toList())

    /**
     * @param transparencyLoggingEnabled Enable or disable transparency logging for this
     * certificate.
     * Once a certificate has been logged, it cannot be removed from the log.
     * Opting out at that point will have no effect. If you opt out of logging
     * when you request a certificate and then choose later to opt back in,
     * your certificate will not be logged until it is renewed.
     * If you want the certificate to be logged immediately, we recommend that you issue a new one.
     */
    override fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean) {
      cdkBuilder.transparencyLoggingEnabled(transparencyLoggingEnabled)
    }

    /**
     * @param validation How to validate this certificate.
     */
    override fun validation(validation: CertificateValidation) {
      cdkBuilder.validation(validation.let(CertificateValidation::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.certificatemanager.CertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.certificatemanager.CertificateProps,
  ) : CdkObject(cdkObject), CertificateProps {
    /**
     * The Certificate name.
     *
     * Since the Certificate resource doesn't support providing a physical name, the value provided
     * here will be recorded in the `Name` tag
     *
     * Default: the full, absolute path of this construct
     */
    override fun certificateName(): String? = unwrap(this).getCertificateName()

    /**
     * Fully-qualified domain name to request a certificate for.
     *
     * May contain wildcards, such as `*.domain.com`.
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * Specifies the algorithm of the public and private key pair that your certificate uses to
     * encrypt data.
     *
     * Default: KeyAlgorithm.RSA_2048
     *
     * [Documentation](https://docs.aws.amazon.com/acm/latest/userguide/acm-certificate.html#algorithms.title)
     */
    override fun keyAlgorithm(): KeyAlgorithm? =
        unwrap(this).getKeyAlgorithm()?.let(KeyAlgorithm::wrap)

    /**
     * Alternative domain names on your certificate.
     *
     * Use this to register alternative domain names that represent the same site.
     *
     * Default: - No additional FQDNs will be included as alternative domain names.
     */
    override fun subjectAlternativeNames(): List<String> = unwrap(this).getSubjectAlternativeNames()
        ?: emptyList()

    /**
     * Enable or disable transparency logging for this certificate.
     *
     * Once a certificate has been logged, it cannot be removed from the log.
     * Opting out at that point will have no effect. If you opt out of logging
     * when you request a certificate and then choose later to opt back in,
     * your certificate will not be logged until it is renewed.
     * If you want the certificate to be logged immediately, we recommend that you issue a new one.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency)
     */
    override fun transparencyLoggingEnabled(): Boolean? =
        unwrap(this).getTransparencyLoggingEnabled()

    /**
     * How to validate this certificate.
     *
     * Default: CertificateValidation.fromEmail()
     */
    override fun validation(): CertificateValidation? =
        unwrap(this).getValidation()?.let(CertificateValidation::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.CertificateProps):
        CertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CertificateProps):
        software.amazon.awscdk.services.certificatemanager.CertificateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.certificatemanager.CertificateProps
  }
}
