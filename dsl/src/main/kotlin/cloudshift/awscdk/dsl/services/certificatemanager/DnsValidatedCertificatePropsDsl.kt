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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.certificatemanager.CertificateValidation
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.route53.IHostedZone

/**
 * Properties to create a DNS validated certificate managed by AWS Certificate Manager.
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
 * DnsValidatedCertificateProps dnsValidatedCertificateProps =
 * DnsValidatedCertificateProps.builder()
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
 */
@CdkDslMarker
public class DnsValidatedCertificatePropsDsl {
    private val cdkBuilder: DnsValidatedCertificateProps.Builder =
        DnsValidatedCertificateProps.builder()

    private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

    /**
     * @param certificateName The Certificate name. Since the Certificate resource doesn't support
     *   providing a physical name, the value provided here will be recorded in the `Name` tag
     */
    public fun certificateName(certificateName: String) {
        cdkBuilder.certificateName(certificateName)
    }

    /**
     * @param cleanupRoute53Records When set to true, when the DnsValidatedCertificate is deleted,
     *   the associated Route53 validation records are removed. CAUTION: If multiple certificates
     *   share the same domains (and same validation records), this can cause the other certificates
     *   to fail renewal and/or not validate. Not recommended for production use.
     */
    public fun cleanupRoute53Records(cleanupRoute53Records: Boolean) {
        cdkBuilder.cleanupRoute53Records(cleanupRoute53Records)
    }

    /**
     * @param customResourceRole Role to use for the custom resource that creates the validated
     *   certificate.
     */
    public fun customResourceRole(customResourceRole: IRole) {
        cdkBuilder.customResourceRole(customResourceRole)
    }

    /**
     * @param domainName Fully-qualified domain name to request a certificate for. May contain
     *   wildcards, such as `*.domain.com`.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * @param hostedZone Route 53 Hosted Zone used to perform DNS validation of the request. The
     *   zone must be authoritative for the domain name specified in the Certificate Request.
     */
    public fun hostedZone(hostedZone: IHostedZone) {
        cdkBuilder.hostedZone(hostedZone)
    }

    /**
     * @param region AWS region that will host the certificate. This is needed especially for
     *   certificates used for CloudFront distributions, which require the region to be us-east-1.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * @param route53Endpoint An endpoint of Route53 service, which is not necessary as AWS SDK
     *   could figure out the right endpoints for most regions, but for some regions such as those
     *   in aws-cn partition, the default endpoint is not working now, hence the right endpoint need
     *   to be specified through this prop. Route53 is not been officially launched in China, it is
     *   only available for AWS internal accounts now. To make DnsValidatedCertificate work for
     *   internal accounts now, a special endpoint needs to be provided.
     */
    public fun route53Endpoint(route53Endpoint: String) {
        cdkBuilder.route53Endpoint(route53Endpoint)
    }

    /**
     * @param subjectAlternativeNames Alternative domain names on your certificate. Use this to
     *   register alternative domain names that represent the same site.
     */
    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String) {
        _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
    }

    /**
     * @param subjectAlternativeNames Alternative domain names on your certificate. Use this to
     *   register alternative domain names that represent the same site.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: Collection<String>) {
        _subjectAlternativeNames.addAll(subjectAlternativeNames)
    }

    /**
     * @param transparencyLoggingEnabled Enable or disable transparency logging for this
     *   certificate. Once a certificate has been logged, it cannot be removed from the log. Opting
     *   out at that point will have no effect. If you opt out of logging when you request a
     *   certificate and then choose later to opt back in, your certificate will not be logged until
     *   it is renewed. If you want the certificate to be logged immediately, we recommend that you
     *   issue a new one.
     */
    public fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean) {
        cdkBuilder.transparencyLoggingEnabled(transparencyLoggingEnabled)
    }

    /** @param validation How to validate this certificate. */
    public fun validation(validation: CertificateValidation) {
        cdkBuilder.validation(validation)
    }

    public fun build(): DnsValidatedCertificateProps {
        if (_subjectAlternativeNames.isNotEmpty())
            cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
        return cdkBuilder.build()
    }
}
