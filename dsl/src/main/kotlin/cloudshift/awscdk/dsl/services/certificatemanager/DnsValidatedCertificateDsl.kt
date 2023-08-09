@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.certificatemanager.CertificateValidation
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.route53.IHostedZone
import software.constructs.Construct

/**
 * (deprecated) A certificate managed by AWS Certificate Manager.
 *
 * Will be automatically validated using DNS validation against the specified Route 53 hosted zone.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.certificatemanager.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.route53.*;
 * CertificateValidation certificateValidation;
 * HostedZone hostedZone;
 * Role role;
 * DnsValidatedCertificate dnsValidatedCertificate = DnsValidatedCertificate.Builder.create(this,
 * "MyDnsValidatedCertificate")
 * .domainName("domainName")
 * .hostedZone(hostedZone)
 * // the properties below are optional
 * .certificateName("certificateName")
 * .cleanupRoute53Records(false)
 * .customResourceRole(role)
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
@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class DnsValidatedCertificateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DnsValidatedCertificate.Builder =
        DnsValidatedCertificate.Builder.create(scope, id)

    private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

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
    public fun certificateName(certificateName: String) {
        cdkBuilder.certificateName(certificateName)
    }

    /**
     * When set to true, when the DnsValidatedCertificate is deleted, the associated Route53
     * validation records are removed.
     *
     * CAUTION: If multiple certificates share the same domains (and same validation records), this
     * can cause the other certificates to fail renewal and/or not validate. Not recommended for
     * production use.
     *
     * Default: false
     *
     * @param cleanupRoute53Records When set to true, when the DnsValidatedCertificate is deleted,
     *   the associated Route53 validation records are removed.
     */
    public fun cleanupRoute53Records(cleanupRoute53Records: Boolean) {
        cdkBuilder.cleanupRoute53Records(cleanupRoute53Records)
    }

    /**
     * Role to use for the custom resource that creates the validated certificate.
     *
     * Default: - A new role will be created
     *
     * @param customResourceRole Role to use for the custom resource that creates the validated
     *   certificate.
     */
    public fun customResourceRole(customResourceRole: IRole) {
        cdkBuilder.customResourceRole(customResourceRole)
    }

    /**
     * Fully-qualified domain name to request a certificate for.
     *
     * May contain wildcards, such as `*.domain.com`.
     *
     * @param domainName Fully-qualified domain name to request a certificate for.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * Route 53 Hosted Zone used to perform DNS validation of the request.
     *
     * The zone must be authoritative for the domain name specified in the Certificate Request.
     *
     * @param hostedZone Route 53 Hosted Zone used to perform DNS validation of the request.
     */
    public fun hostedZone(hostedZone: IHostedZone) {
        cdkBuilder.hostedZone(hostedZone)
    }

    /**
     * AWS region that will host the certificate.
     *
     * This is needed especially for certificates used for CloudFront distributions, which require
     * the region to be us-east-1.
     *
     * Default: the region the stack is deployed in.
     *
     * @param region AWS region that will host the certificate.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * An endpoint of Route53 service, which is not necessary as AWS SDK could figure out the right
     * endpoints for most regions, but for some regions such as those in aws-cn partition, the
     * default endpoint is not working now, hence the right endpoint need to be specified through
     * this prop.
     *
     * Route53 is not been officially launched in China, it is only available for AWS internal
     * accounts now. To make DnsValidatedCertificate work for internal accounts now, a special
     * endpoint needs to be provided.
     *
     * Default: - The AWS SDK will determine the Route53 endpoint to use based on region
     *
     * @param route53Endpoint An endpoint of Route53 service, which is not necessary as AWS SDK
     *   could figure out the right endpoints for most regions, but for some regions such as those
     *   in aws-cn partition, the default endpoint is not working now, hence the right endpoint need
     *   to be specified through this prop.
     */
    public fun route53Endpoint(route53Endpoint: String) {
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
    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String) {
        _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
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
    public fun subjectAlternativeNames(subjectAlternativeNames: Collection<String>) {
        _subjectAlternativeNames.addAll(subjectAlternativeNames)
    }

    /**
     * Enable or disable transparency logging for this certificate.
     *
     * Once a certificate has been logged, it cannot be removed from the log. Opting out at that
     * point will have no effect. If you opt out of logging when you request a certificate and then
     * choose later to opt back in, your certificate will not be logged until it is renewed. If you
     * want the certificate to be logged immediately, we recommend that you issue a new one.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency)
     *
     * @param transparencyLoggingEnabled Enable or disable transparency logging for this
     *   certificate.
     */
    public fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean) {
        cdkBuilder.transparencyLoggingEnabled(transparencyLoggingEnabled)
    }

    /**
     * How to validate this certificate.
     *
     * Default: CertificateValidation.fromEmail()
     *
     * @param validation How to validate this certificate.
     */
    public fun validation(validation: CertificateValidation) {
        cdkBuilder.validation(validation)
    }

    public fun build(): DnsValidatedCertificate {
        if (_subjectAlternativeNames.isNotEmpty())
            cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
        return cdkBuilder.build()
    }
}
