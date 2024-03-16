@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties to create a DNS validated certificate managed by AWS Certificate Manager.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * CertificateValidation certificateValidation;
 * HostedZone hostedZone;
 * KeyAlgorithm keyAlgorithm;
 * Role role;
 * DnsValidatedCertificateProps dnsValidatedCertificateProps =
 * DnsValidatedCertificateProps.builder()
 * .domainName("domainName")
 * .hostedZone(hostedZone)
 * // the properties below are optional
 * .certificateName("certificateName")
 * .cleanupRoute53Records(false)
 * .customResourceRole(role)
 * .keyAlgorithm(keyAlgorithm)
 * .region("region")
 * .route53Endpoint("route53Endpoint")
 * .subjectAlternativeNames(List.of("subjectAlternativeNames"))
 * .transparencyLoggingEnabled(false)
 * .validation(certificateValidation)
 * .build();
 * ```
 */
public interface DnsValidatedCertificateProps : CertificateProps {
  /**
   * When set to true, when the DnsValidatedCertificate is deleted, the associated Route53
   * validation records are removed.
   *
   * CAUTION: If multiple certificates share the same domains (and same validation records),
   * this can cause the other certificates to fail renewal and/or not validate.
   * Not recommended for production use.
   *
   * Default: false
   */
  public fun cleanupRoute53Records(): Boolean? = unwrap(this).getCleanupRoute53Records()

  /**
   * Role to use for the custom resource that creates the validated certificate.
   *
   * Default: - A new role will be created
   */
  public fun customResourceRole(): IRole? = unwrap(this).getCustomResourceRole()?.let(IRole::wrap)

  /**
   * Route 53 Hosted Zone used to perform DNS validation of the request.
   *
   * The zone
   * must be authoritative for the domain name specified in the Certificate Request.
   */
  public fun hostedZone(): IHostedZone

  /**
   * AWS region that will host the certificate.
   *
   * This is needed especially
   * for certificates used for CloudFront distributions, which require the region
   * to be us-east-1.
   *
   * Default: the region the stack is deployed in.
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * An endpoint of Route53 service, which is not necessary as AWS SDK could figure out the right
   * endpoints for most regions, but for some regions such as those in aws-cn partition, the default
   * endpoint is not working now, hence the right endpoint need to be specified through this prop.
   *
   * Route53 is not been officially launched in China, it is only available for AWS
   * internal accounts now. To make DnsValidatedCertificate work for internal accounts
   * now, a special endpoint needs to be provided.
   *
   * Default: - The AWS SDK will determine the Route53 endpoint to use based on region
   */
  public fun route53Endpoint(): String? = unwrap(this).getRoute53Endpoint()

  /**
   * A builder for [DnsValidatedCertificateProps]
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
     * @param cleanupRoute53Records When set to true, when the DnsValidatedCertificate is deleted,
     * the associated Route53 validation records are removed.
     * CAUTION: If multiple certificates share the same domains (and same validation records),
     * this can cause the other certificates to fail renewal and/or not validate.
     * Not recommended for production use.
     */
    public fun cleanupRoute53Records(cleanupRoute53Records: Boolean)

    /**
     * @param customResourceRole Role to use for the custom resource that creates the validated
     * certificate.
     */
    public fun customResourceRole(customResourceRole: IRole)

    /**
     * @param domainName Fully-qualified domain name to request a certificate for. 
     * May contain wildcards, such as `*.domain.com`.
     */
    public fun domainName(domainName: String)

    /**
     * @param hostedZone Route 53 Hosted Zone used to perform DNS validation of the request. 
     * The zone
     * must be authoritative for the domain name specified in the Certificate Request.
     */
    public fun hostedZone(hostedZone: IHostedZone)

    /**
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     * certificate uses to encrypt data.
     */
    public fun keyAlgorithm(keyAlgorithm: KeyAlgorithm)

    /**
     * @param region AWS region that will host the certificate.
     * This is needed especially
     * for certificates used for CloudFront distributions, which require the region
     * to be us-east-1.
     */
    public fun region(region: String)

    /**
     * @param route53Endpoint An endpoint of Route53 service, which is not necessary as AWS SDK
     * could figure out the right endpoints for most regions, but for some regions such as those in
     * aws-cn partition, the default endpoint is not working now, hence the right endpoint need to be
     * specified through this prop.
     * Route53 is not been officially launched in China, it is only available for AWS
     * internal accounts now. To make DnsValidatedCertificate work for internal accounts
     * now, a special endpoint needs to be provided.
     */
    public fun route53Endpoint(route53Endpoint: String)

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
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps.Builder =
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps.builder()

    /**
     * @param certificateName The Certificate name.
     * Since the Certificate resource doesn't support providing a physical name, the value provided
     * here will be recorded in the `Name` tag
     */
    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    /**
     * @param cleanupRoute53Records When set to true, when the DnsValidatedCertificate is deleted,
     * the associated Route53 validation records are removed.
     * CAUTION: If multiple certificates share the same domains (and same validation records),
     * this can cause the other certificates to fail renewal and/or not validate.
     * Not recommended for production use.
     */
    override fun cleanupRoute53Records(cleanupRoute53Records: Boolean) {
      cdkBuilder.cleanupRoute53Records(cleanupRoute53Records)
    }

    /**
     * @param customResourceRole Role to use for the custom resource that creates the validated
     * certificate.
     */
    override fun customResourceRole(customResourceRole: IRole) {
      cdkBuilder.customResourceRole(customResourceRole.let(IRole::unwrap))
    }

    /**
     * @param domainName Fully-qualified domain name to request a certificate for. 
     * May contain wildcards, such as `*.domain.com`.
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param hostedZone Route 53 Hosted Zone used to perform DNS validation of the request. 
     * The zone
     * must be authoritative for the domain name specified in the Certificate Request.
     */
    override fun hostedZone(hostedZone: IHostedZone) {
      cdkBuilder.hostedZone(hostedZone.let(IHostedZone::unwrap))
    }

    /**
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     * certificate uses to encrypt data.
     */
    override fun keyAlgorithm(keyAlgorithm: KeyAlgorithm) {
      cdkBuilder.keyAlgorithm(keyAlgorithm.let(KeyAlgorithm::unwrap))
    }

    /**
     * @param region AWS region that will host the certificate.
     * This is needed especially
     * for certificates used for CloudFront distributions, which require the region
     * to be us-east-1.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param route53Endpoint An endpoint of Route53 service, which is not necessary as AWS SDK
     * could figure out the right endpoints for most regions, but for some regions such as those in
     * aws-cn partition, the default endpoint is not working now, hence the right endpoint need to be
     * specified through this prop.
     * Route53 is not been officially launched in China, it is only available for AWS
     * internal accounts now. To make DnsValidatedCertificate work for internal accounts
     * now, a special endpoint needs to be provided.
     */
    override fun route53Endpoint(route53Endpoint: String) {
      cdkBuilder.route53Endpoint(route53Endpoint)
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

    public fun build():
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps,
  ) : CdkObject(cdkObject), DnsValidatedCertificateProps {
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
     * When set to true, when the DnsValidatedCertificate is deleted, the associated Route53
     * validation records are removed.
     *
     * CAUTION: If multiple certificates share the same domains (and same validation records),
     * this can cause the other certificates to fail renewal and/or not validate.
     * Not recommended for production use.
     *
     * Default: false
     */
    override fun cleanupRoute53Records(): Boolean? = unwrap(this).getCleanupRoute53Records()

    /**
     * Role to use for the custom resource that creates the validated certificate.
     *
     * Default: - A new role will be created
     */
    override fun customResourceRole(): IRole? =
        unwrap(this).getCustomResourceRole()?.let(IRole::wrap)

    /**
     * Fully-qualified domain name to request a certificate for.
     *
     * May contain wildcards, such as `*.domain.com`.
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * Route 53 Hosted Zone used to perform DNS validation of the request.
     *
     * The zone
     * must be authoritative for the domain name specified in the Certificate Request.
     */
    override fun hostedZone(): IHostedZone = unwrap(this).getHostedZone().let(IHostedZone::wrap)

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
     * AWS region that will host the certificate.
     *
     * This is needed especially
     * for certificates used for CloudFront distributions, which require the region
     * to be us-east-1.
     *
     * Default: the region the stack is deployed in.
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * An endpoint of Route53 service, which is not necessary as AWS SDK could figure out the right
     * endpoints for most regions, but for some regions such as those in aws-cn partition, the default
     * endpoint is not working now, hence the right endpoint need to be specified through this prop.
     *
     * Route53 is not been officially launched in China, it is only available for AWS
     * internal accounts now. To make DnsValidatedCertificate work for internal accounts
     * now, a special endpoint needs to be provided.
     *
     * Default: - The AWS SDK will determine the Route53 endpoint to use based on region
     */
    override fun route53Endpoint(): String? = unwrap(this).getRoute53Endpoint()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): DnsValidatedCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps):
        DnsValidatedCertificateProps = CdkObjectWrappers.wrap(cdkObject) as
        DnsValidatedCertificateProps

    internal fun unwrap(wrapped: DnsValidatedCertificateProps):
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps
  }
}
