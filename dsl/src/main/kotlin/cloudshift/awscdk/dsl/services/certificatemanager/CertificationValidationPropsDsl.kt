@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.certificatemanager.CertificationValidationProps
import software.amazon.awscdk.services.certificatemanager.ValidationMethod
import software.amazon.awscdk.services.route53.IHostedZone

@CdkDslMarker
public class CertificationValidationPropsDsl {
  private val cdkBuilder: CertificationValidationProps.Builder =
      CertificationValidationProps.builder()

  public fun hostedZone(hostedZone: IHostedZone) {
    cdkBuilder.hostedZone(hostedZone)
  }

  public fun hostedZones(hostedZones: Map<String, IHostedZone>) {
    cdkBuilder.hostedZones(hostedZones)
  }

  public fun method(method: ValidationMethod) {
    cdkBuilder.method(method)
  }

  public fun validationDomains(validationDomains: Map<String, String>) {
    cdkBuilder.validationDomains(validationDomains)
  }

  public fun build(): CertificationValidationProps = cdkBuilder.build()
}
