@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.acmpca.ICertificateAuthority
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A private certificate managed by AWS Certificate Manager.
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
public open class PrivateCertificate(
  cdkObject: software.amazon.awscdk.services.certificatemanager.PrivateCertificate,
) : Resource(cdkObject),
    ICertificate {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PrivateCertificateProps,
  ) :
      this(software.amazon.awscdk.services.certificatemanager.PrivateCertificate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(PrivateCertificateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PrivateCertificateProps.Builder.() -> Unit,
  ) : this(scope, id, PrivateCertificateProps(props)
  )

  /**
   * The certificate's ARN.
   */
  public override fun certificateArn(): String = unwrap(this).getCertificateArn()

  /**
   * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this
   * is the minimum value over 1 day.
   *
   * This metric is no longer emitted once the certificate has effectively
   * expired, so alarms configured on this metric should probably treat missing
   * data as "breaching".
   *
   * @param props
   */
  public override fun metricDaysToExpiry(): Metric =
      unwrap(this).metricDaysToExpiry().let(Metric::wrap)

  /**
   * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this
   * is the minimum value over 1 day.
   *
   * This metric is no longer emitted once the certificate has effectively
   * expired, so alarms configured on this metric should probably treat missing
   * data as "breaching".
   *
   * @param props
   */
  public override fun metricDaysToExpiry(props: MetricOptions): Metric =
      unwrap(this).metricDaysToExpiry(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this
   * is the minimum value over 1 day.
   *
   * This metric is no longer emitted once the certificate has effectively
   * expired, so alarms configured on this metric should probably treat missing
   * data as "breaching".
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ad895c8ac7bc6d03bba3058600c1021b398f352b3a3b16493165686a37bd590")
  public override fun metricDaysToExpiry(props: MetricOptions.Builder.() -> Unit): Metric =
      metricDaysToExpiry(MetricOptions(props))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.certificatemanager.PrivateCertificate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Private certificate authority (CA) that will be used to issue the certificate.
     *
     * @param certificateAuthority Private certificate authority (CA) that will be used to issue the
     * certificate. 
     */
    public fun certificateAuthority(certificateAuthority: ICertificateAuthority)

    /**
     * Fully-qualified domain name to request a private certificate for.
     *
     * May contain wildcards, such as `*.domain.com`.
     *
     * @param domainName Fully-qualified domain name to request a private certificate for. 
     */
    public fun domainName(domainName: String)

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
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     * certificate uses to encrypt data. 
     */
    public fun keyAlgorithm(keyAlgorithm: KeyAlgorithm)

    /**
     * Alternative domain names on your private certificate.
     *
     * Use this to register alternative domain names that represent the same site.
     *
     * Default: - No additional FQDNs will be included as alternative domain names.
     *
     * @param subjectAlternativeNames Alternative domain names on your private certificate. 
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

    /**
     * Alternative domain names on your private certificate.
     *
     * Use this to register alternative domain names that represent the same site.
     *
     * Default: - No additional FQDNs will be included as alternative domain names.
     *
     * @param subjectAlternativeNames Alternative domain names on your private certificate. 
     */
    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.PrivateCertificate.Builder =
        software.amazon.awscdk.services.certificatemanager.PrivateCertificate.Builder.create(scope,
        id)

    /**
     * Private certificate authority (CA) that will be used to issue the certificate.
     *
     * @param certificateAuthority Private certificate authority (CA) that will be used to issue the
     * certificate. 
     */
    override fun certificateAuthority(certificateAuthority: ICertificateAuthority) {
      cdkBuilder.certificateAuthority(certificateAuthority.let(ICertificateAuthority.Companion::unwrap))
    }

    /**
     * Fully-qualified domain name to request a private certificate for.
     *
     * May contain wildcards, such as `*.domain.com`.
     *
     * @param domainName Fully-qualified domain name to request a private certificate for. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

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
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     * certificate uses to encrypt data. 
     */
    override fun keyAlgorithm(keyAlgorithm: KeyAlgorithm) {
      cdkBuilder.keyAlgorithm(keyAlgorithm.let(KeyAlgorithm.Companion::unwrap))
    }

    /**
     * Alternative domain names on your private certificate.
     *
     * Use this to register alternative domain names that represent the same site.
     *
     * Default: - No additional FQDNs will be included as alternative domain names.
     *
     * @param subjectAlternativeNames Alternative domain names on your private certificate. 
     */
    override fun subjectAlternativeNames(subjectAlternativeNames: List<String>) {
      cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    /**
     * Alternative domain names on your private certificate.
     *
     * Use this to register alternative domain names that represent the same site.
     *
     * Default: - No additional FQDNs will be included as alternative domain names.
     *
     * @param subjectAlternativeNames Alternative domain names on your private certificate. 
     */
    override fun subjectAlternativeNames(vararg subjectAlternativeNames: String): Unit =
        subjectAlternativeNames(subjectAlternativeNames.toList())

    public fun build(): software.amazon.awscdk.services.certificatemanager.PrivateCertificate =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromCertificateArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      certificateArn: String,
    ): ICertificate =
        software.amazon.awscdk.services.certificatemanager.PrivateCertificate.fromCertificateArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, certificateArn).let(ICertificate::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PrivateCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PrivateCertificate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.PrivateCertificate):
        PrivateCertificate = PrivateCertificate(cdkObject)

    internal fun unwrap(wrapped: PrivateCertificate):
        software.amazon.awscdk.services.certificatemanager.PrivateCertificate = wrapped.cdkObject as
        software.amazon.awscdk.services.certificatemanager.PrivateCertificate
  }
}
