@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.certificatemanager.CertificationValidationProps
import software.amazon.awscdk.services.certificatemanager.ValidationMethod
import software.amazon.awscdk.services.route53.IHostedZone

/**
 * Properties for certificate validation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.certificatemanager.*;
 * import software.amazon.awscdk.services.route53.*;
 * HostedZone hostedZone;
 * CertificationValidationProps certificationValidationProps =
 * CertificationValidationProps.builder()
 * .hostedZone(hostedZone)
 * .hostedZones(Map.of(
 * "hostedZonesKey", hostedZone))
 * .method(ValidationMethod.EMAIL)
 * .validationDomains(Map.of(
 * "validationDomainsKey", "validationDomains"))
 * .build();
 * ```
 */
@CdkDslMarker
public class CertificationValidationPropsDsl {
  private val cdkBuilder: CertificationValidationProps.Builder =
      CertificationValidationProps.builder()

  /**
   * @param hostedZone Hosted zone to use for DNS validation.
   */
  public fun hostedZone(hostedZone: IHostedZone) {
    cdkBuilder.hostedZone(hostedZone)
  }

  /**
   * @param hostedZones A map of hosted zones to use for DNS validation.
   */
  public fun hostedZones(hostedZones: Map<String, IHostedZone>) {
    cdkBuilder.hostedZones(hostedZones)
  }

  /**
   * @param method Validation method.
   */
  public fun method(method: ValidationMethod) {
    cdkBuilder.method(method)
  }

  /**
   * @param validationDomains Validation domains to use for email validation.
   */
  public fun validationDomains(validationDomains: Map<String, String>) {
    cdkBuilder.validationDomains(validationDomains)
  }

  public fun build(): CertificationValidationProps = cdkBuilder.build()
}
