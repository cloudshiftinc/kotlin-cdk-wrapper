@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53.patterns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.route53.IHostedZone
import software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps

/**
 * Properties to configure an HTTPS Redirect.
 *
 * Example:
 *
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
public class HttpsRedirectPropsDsl {
  private val cdkBuilder: HttpsRedirectProps.Builder = HttpsRedirectProps.builder()

  private val _recordNames: MutableList<String> = mutableListOf()

  /**
   * @param certificate The AWS Certificate Manager (ACM) certificate that will be associated with
   * the CloudFront distribution that will be created.
   * If provided, the certificate must be
   * stored in us-east-1 (N. Virginia)
   */
  public fun certificate(certificate: ICertificate) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param recordNames The domain names that will redirect to `targetDomain`.
   */
  public fun recordNames(vararg recordNames: String) {
    _recordNames.addAll(listOf(*recordNames))
  }

  /**
   * @param recordNames The domain names that will redirect to `targetDomain`.
   */
  public fun recordNames(recordNames: Collection<String>) {
    _recordNames.addAll(recordNames)
  }

  /**
   * @param targetDomain The redirect target fully qualified domain name (FQDN). 
   * An alias record
   * will be created that points to your CloudFront distribution. Root domain
   * or sub-domain can be supplied.
   */
  public fun targetDomain(targetDomain: String) {
    cdkBuilder.targetDomain(targetDomain)
  }

  /**
   * @param zone Hosted zone of the domain which will be used to create alias record(s) from domain
   * names in the hosted zone to the target domain. 
   * The hosted zone must
   * contain entries for the domain name(s) supplied through `recordNames` that
   * will redirect to the target domain.
   *
   * Domain names in the hosted zone can include a specific domain (example.com)
   * and its subdomains (acme.example.com, zenith.example.com).
   */
  public fun zone(zone: IHostedZone) {
    cdkBuilder.zone(zone)
  }

  public fun build(): HttpsRedirectProps {
    if(_recordNames.isNotEmpty()) cdkBuilder.recordNames(_recordNames)
    return cdkBuilder.build()
  }
}
