@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.certificatemanager.CfnCertificate

@CdkDslMarker
public class CfnCertificateDomainValidationOptionPropertyDsl {
  private val cdkBuilder: CfnCertificate.DomainValidationOptionProperty.Builder =
      CfnCertificate.DomainValidationOptionProperty.builder()

  /**
   * @param domainName A fully qualified domain name (FQDN) in the certificate request. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param hostedZoneId The `HostedZoneId` option, which is available if you are using Route 53 as
   * your domain registrar, causes ACM to add your CNAME to the domain record.
   * Your list of `DomainValidationOptions` must contain one and only one of the domain-validation
   * options, and the `HostedZoneId` can be used only when `DNS` is specified as your validation
   * method.
   *
   * Use the Route 53 `ListHostedZones` API to discover IDs for available hosted zones.
   *
   * This option is required for publicly trusted certificates.
   *
   *
   * The `ListHostedZones` API returns IDs in the format "/hostedzone/Z111111QQQQQQQ", but
   * CloudFormation requires the IDs to be in the format "Z111111QQQQQQQ".
   *
   *
   * When you change your `DomainValidationOptions` , a new resource is created.
   */
  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

  /**
   * @param validationDomain The domain name to which you want ACM to send validation emails.
   * This domain name is the suffix of the email addresses that you want ACM to use. This must be
   * the same as the `DomainName` value or a superdomain of the `DomainName` value. For example, if you
   * request a certificate for `testing.example.com` , you can specify `example.com` as this value. In
   * that case, ACM sends domain validation emails to the following five addresses:
   *
   * * admin&#64;example.com
   * * administrator&#64;example.com
   * * hostmaster&#64;example.com
   * * postmaster&#64;example.com
   * * webmaster&#64;example.com
   */
  public fun validationDomain(validationDomain: String) {
    cdkBuilder.validationDomain(validationDomain)
  }

  public fun build(): CfnCertificate.DomainValidationOptionProperty = cdkBuilder.build()
}
