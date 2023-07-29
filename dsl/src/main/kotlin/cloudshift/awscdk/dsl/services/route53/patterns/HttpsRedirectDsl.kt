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

package cloudshift.awscdk.dsl.services.route53.patterns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.route53.IHostedZone
import software.amazon.awscdk.services.route53.patterns.HttpsRedirect
import software.constructs.Construct

/**
 * Allows creating a domainA -&gt; domainB redirect using CloudFront and S3.
 *
 * You can specify multiple domains to be redirected.
 *
 * Example:
 * ```
 * HttpsRedirect.Builder.create(this, "Redirect")
 * .recordNames(List.of("foo.example.com"))
 * .targetDomain("bar.example.com")
 * .zone(HostedZone.fromHostedZoneAttributes(this, "HostedZone", HostedZoneAttributes.builder()
 * .hostedZoneId("ID")
 * .zoneName("example.com")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpsRedirectDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: HttpsRedirect.Builder = HttpsRedirect.Builder.create(scope, id)

    private val _recordNames: MutableList<String> = mutableListOf()

    /**
     * The AWS Certificate Manager (ACM) certificate that will be associated with the CloudFront
     * distribution that will be created.
     *
     * If provided, the certificate must be stored in us-east-1 (N. Virginia)
     *
     * Default: - A new certificate is created in us-east-1 (N. Virginia)
     *
     * @param certificate The AWS Certificate Manager (ACM) certificate that will be associated with
     *   the CloudFront distribution that will be created.
     */
    public fun certificate(certificate: ICertificate) {
        cdkBuilder.certificate(certificate)
    }

    /**
     * The domain names that will redirect to `targetDomain`.
     *
     * Default: - the domain name of the hosted zone
     *
     * @param recordNames The domain names that will redirect to `targetDomain`.
     */
    public fun recordNames(vararg recordNames: String) {
        _recordNames.addAll(listOf(*recordNames))
    }

    /**
     * The domain names that will redirect to `targetDomain`.
     *
     * Default: - the domain name of the hosted zone
     *
     * @param recordNames The domain names that will redirect to `targetDomain`.
     */
    public fun recordNames(recordNames: Collection<String>) {
        _recordNames.addAll(recordNames)
    }

    /**
     * The redirect target fully qualified domain name (FQDN).
     *
     * An alias record will be created that points to your CloudFront distribution. Root domain or
     * sub-domain can be supplied.
     *
     * @param targetDomain The redirect target fully qualified domain name (FQDN).
     */
    public fun targetDomain(targetDomain: String) {
        cdkBuilder.targetDomain(targetDomain)
    }

    /**
     * Hosted zone of the domain which will be used to create alias record(s) from domain names in
     * the hosted zone to the target domain.
     *
     * The hosted zone must contain entries for the domain name(s) supplied through `recordNames`
     * that will redirect to the target domain.
     *
     * Domain names in the hosted zone can include a specific domain (example.com) and its
     * subdomains (acme.example.com, zenith.example.com).
     *
     * @param zone Hosted zone of the domain which will be used to create alias record(s) from
     *   domain names in the hosted zone to the target domain.
     */
    public fun zone(zone: IHostedZone) {
        cdkBuilder.zone(zone)
    }

    public fun build(): HttpsRedirect {
        if (_recordNames.isNotEmpty()) cdkBuilder.recordNames(_recordNames)
        return cdkBuilder.build()
    }
}
