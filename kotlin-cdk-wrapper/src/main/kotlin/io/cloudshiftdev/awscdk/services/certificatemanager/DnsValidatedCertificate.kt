@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * (deprecated) A certificate managed by AWS Certificate Manager.
 *
 * Will be automatically
 * validated using DNS validation against the specified Route 53 hosted zone.
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
 * DnsValidatedCertificate dnsValidatedCertificate = DnsValidatedCertificate.Builder.create(this,
 * "MyDnsValidatedCertificate")
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
 *
 * @deprecated use [Certificate ] instead
 */
public open class DnsValidatedCertificate internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate,
) : Resource(cdkObject), ICertificate, ITaggable {
  @Deprecated(message = "deprecated in CDK")
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DnsValidatedCertificateProps,
  ) :
      this(software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(DnsValidatedCertificateProps::unwrap))
  )

  @Deprecated(message = "deprecated in CDK")
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DnsValidatedCertificateProps.Builder.() -> Unit,
  ) : this(scope, id, DnsValidatedCertificateProps(props)
  )

  /**
   * (deprecated) Apply the given removal policy to this resource.
   *
   * The Removal Policy controls what happens to this resource when it stops
   * being managed by CloudFormation, either because you've removed it from the
   * CDK application or because you've made a change that requires the resource
   * to be replaced.
   *
   * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
   * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
   *
   * @param policy 
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun applyRemovalPolicy(policy: RemovalPolicy) {
    unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
  }

  /**
   * (deprecated) The certificate's ARN.
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun certificateArn(): String = unwrap(this).getCertificateArn()

  /**
   * (deprecated) Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By
   * default, this is the minimum value over 1 day.
   *
   * This metric is no longer emitted once the certificate has effectively
   * expired, so alarms configured on this metric should probably treat missing
   * data as "breaching".
   *
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricDaysToExpiry(): Metric =
      unwrap(this).metricDaysToExpiry().let(Metric::wrap)

  /**
   * (deprecated) Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By
   * default, this is the minimum value over 1 day.
   *
   * This metric is no longer emitted once the certificate has effectively
   * expired, so alarms configured on this metric should probably treat missing
   * data as "breaching".
   *
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricDaysToExpiry(props: MetricOptions): Metric =
      unwrap(this).metricDaysToExpiry(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By
   * default, this is the minimum value over 1 day.
   *
   * This metric is no longer emitted once the certificate has effectively
   * expired, so alarms configured on this metric should probably treat missing
   * data as "breaching".
   *
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ad895c8ac7bc6d03bba3058600c1021b398f352b3a3b16493165686a37bd590")
  public override fun metricDaysToExpiry(props: MetricOptions.Builder.() -> Unit): Metric =
      metricDaysToExpiry(MetricOptions(props))

  /**
   * (deprecated) Resource Tags.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags)
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * (deprecated) A fluent builder for
   * [io.cloudshiftdev.awscdk.services.certificatemanager.DnsValidatedCertificate].
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * The Certificate name.
     *
     * Since the Certificate resource doesn't support providing a physical name, the value provided
     * here will be recorded in the `Name` tag
     *
     * Default: the full, absolute path of this construct
     *
     * @param certificateName The Certificate name. 
     */
    public fun certificateName(certificateName: String)

    /**
     * When set to true, when the DnsValidatedCertificate is deleted, the associated Route53
     * validation records are removed.
     *
     * CAUTION: If multiple certificates share the same domains (and same validation records),
     * this can cause the other certificates to fail renewal and/or not validate.
     * Not recommended for production use.
     *
     * Default: false
     *
     * @param cleanupRoute53Records When set to true, when the DnsValidatedCertificate is deleted,
     * the associated Route53 validation records are removed. 
     */
    public fun cleanupRoute53Records(cleanupRoute53Records: Boolean)

    /**
     * Role to use for the custom resource that creates the validated certificate.
     *
     * Default: - A new role will be created
     *
     * @param customResourceRole Role to use for the custom resource that creates the validated
     * certificate. 
     */
    public fun customResourceRole(customResourceRole: IRole)

    /**
     * Fully-qualified domain name to request a certificate for.
     *
     * May contain wildcards, such as `*.domain.com`.
     *
     * @param domainName Fully-qualified domain name to request a certificate for. 
     */
    public fun domainName(domainName: String)

    /**
     * Route 53 Hosted Zone used to perform DNS validation of the request.
     *
     * The zone
     * must be authoritative for the domain name specified in the Certificate Request.
     *
     * @param hostedZone Route 53 Hosted Zone used to perform DNS validation of the request. 
     */
    public fun hostedZone(hostedZone: IHostedZone)

    /**
     * Specifies the algorithm of the public and private key pair that your certificate uses to
     * encrypt data.
     *
     * Default: KeyAlgorithm.RSA_2048
     *
     * [Documentation](https://docs.aws.amazon.com/acm/latest/userguide/acm-certificate.html#algorithms.title)
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     * certificate uses to encrypt data. 
     */
    public fun keyAlgorithm(keyAlgorithm: KeyAlgorithm)

    /**
     * AWS region that will host the certificate.
     *
     * This is needed especially
     * for certificates used for CloudFront distributions, which require the region
     * to be us-east-1.
     *
     * Default: the region the stack is deployed in.
     *
     * @param region AWS region that will host the certificate. 
     */
    public fun region(region: String)

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
     *
     * @param route53Endpoint An endpoint of Route53 service, which is not necessary as AWS SDK
     * could figure out the right endpoints for most regions, but for some regions such as those in
     * aws-cn partition, the default endpoint is not working now, hence the right endpoint need to be
     * specified through this prop. 
     */
    public fun route53Endpoint(route53Endpoint: String)

    /**
     * Alternative domain names on your certificate.
     *
     * Use this to register alternative domain names that represent the same site.
     *
     * Default: - No additional FQDNs will be included as alternative domain names.
     *
     * @param subjectAlternativeNames Alternative domain names on your certificate. 
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

    /**
     * Alternative domain names on your certificate.
     *
     * Use this to register alternative domain names that represent the same site.
     *
     * Default: - No additional FQDNs will be included as alternative domain names.
     *
     * @param subjectAlternativeNames Alternative domain names on your certificate. 
     */
    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)

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
     * @param transparencyLoggingEnabled Enable or disable transparency logging for this
     * certificate. 
     */
    public fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean)

    /**
     * How to validate this certificate.
     *
     * Default: CertificateValidation.fromEmail()
     *
     * @param validation How to validate this certificate. 
     */
    public fun validation(validation: CertificateValidation)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate.Builder =
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate.Builder.create(scope,
        id)

    /**
     * The Certificate name.
     *
     * Since the Certificate resource doesn't support providing a physical name, the value provided
     * here will be recorded in the `Name` tag
     *
     * Default: the full, absolute path of this construct
     *
     * @param certificateName The Certificate name. 
     */
    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    /**
     * When set to true, when the DnsValidatedCertificate is deleted, the associated Route53
     * validation records are removed.
     *
     * CAUTION: If multiple certificates share the same domains (and same validation records),
     * this can cause the other certificates to fail renewal and/or not validate.
     * Not recommended for production use.
     *
     * Default: false
     *
     * @param cleanupRoute53Records When set to true, when the DnsValidatedCertificate is deleted,
     * the associated Route53 validation records are removed. 
     */
    override fun cleanupRoute53Records(cleanupRoute53Records: Boolean) {
      cdkBuilder.cleanupRoute53Records(cleanupRoute53Records)
    }

    /**
     * Role to use for the custom resource that creates the validated certificate.
     *
     * Default: - A new role will be created
     *
     * @param customResourceRole Role to use for the custom resource that creates the validated
     * certificate. 
     */
    override fun customResourceRole(customResourceRole: IRole) {
      cdkBuilder.customResourceRole(customResourceRole.let(IRole::unwrap))
    }

    /**
     * Fully-qualified domain name to request a certificate for.
     *
     * May contain wildcards, such as `*.domain.com`.
     *
     * @param domainName Fully-qualified domain name to request a certificate for. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * Route 53 Hosted Zone used to perform DNS validation of the request.
     *
     * The zone
     * must be authoritative for the domain name specified in the Certificate Request.
     *
     * @param hostedZone Route 53 Hosted Zone used to perform DNS validation of the request. 
     */
    override fun hostedZone(hostedZone: IHostedZone) {
      cdkBuilder.hostedZone(hostedZone.let(IHostedZone::unwrap))
    }

    /**
     * Specifies the algorithm of the public and private key pair that your certificate uses to
     * encrypt data.
     *
     * Default: KeyAlgorithm.RSA_2048
     *
     * [Documentation](https://docs.aws.amazon.com/acm/latest/userguide/acm-certificate.html#algorithms.title)
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     * certificate uses to encrypt data. 
     */
    override fun keyAlgorithm(keyAlgorithm: KeyAlgorithm) {
      cdkBuilder.keyAlgorithm(keyAlgorithm.let(KeyAlgorithm::unwrap))
    }

    /**
     * AWS region that will host the certificate.
     *
     * This is needed especially
     * for certificates used for CloudFront distributions, which require the region
     * to be us-east-1.
     *
     * Default: the region the stack is deployed in.
     *
     * @param region AWS region that will host the certificate. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

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
     *
     * @param route53Endpoint An endpoint of Route53 service, which is not necessary as AWS SDK
     * could figure out the right endpoints for most regions, but for some regions such as those in
     * aws-cn partition, the default endpoint is not working now, hence the right endpoint need to be
     * specified through this prop. 
     */
    override fun route53Endpoint(route53Endpoint: String) {
      cdkBuilder.route53Endpoint(route53Endpoint)
    }

    /**
     * Alternative domain names on your certificate.
     *
     * Use this to register alternative domain names that represent the same site.
     *
     * Default: - No additional FQDNs will be included as alternative domain names.
     *
     * @param subjectAlternativeNames Alternative domain names on your certificate. 
     */
    override fun subjectAlternativeNames(subjectAlternativeNames: List<String>) {
      cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    /**
     * Alternative domain names on your certificate.
     *
     * Use this to register alternative domain names that represent the same site.
     *
     * Default: - No additional FQDNs will be included as alternative domain names.
     *
     * @param subjectAlternativeNames Alternative domain names on your certificate. 
     */
    override fun subjectAlternativeNames(vararg subjectAlternativeNames: String): Unit =
        subjectAlternativeNames(subjectAlternativeNames.toList())

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
     * @param transparencyLoggingEnabled Enable or disable transparency logging for this
     * certificate. 
     */
    override fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean) {
      cdkBuilder.transparencyLoggingEnabled(transparencyLoggingEnabled)
    }

    /**
     * How to validate this certificate.
     *
     * Default: CertificateValidation.fromEmail()
     *
     * @param validation How to validate this certificate. 
     */
    override fun validation(validation: CertificateValidation) {
      cdkBuilder.validation(validation.let(CertificateValidation::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DnsValidatedCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DnsValidatedCertificate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate):
        DnsValidatedCertificate = DnsValidatedCertificate(cdkObject)

    internal fun unwrap(wrapped: DnsValidatedCertificate):
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate =
        wrapped.cdkObject
  }
}
