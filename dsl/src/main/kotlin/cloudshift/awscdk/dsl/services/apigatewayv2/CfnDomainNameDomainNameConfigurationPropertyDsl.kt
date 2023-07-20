@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName

@CdkDslMarker
public class CfnDomainNameDomainNameConfigurationPropertyDsl {
  private val cdkBuilder: CfnDomainName.DomainNameConfigurationProperty.Builder =
      CfnDomainName.DomainNameConfigurationProperty.builder()

  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  public fun certificateName(certificateName: String) {
    cdkBuilder.certificateName(certificateName)
  }

  public fun endpointType(endpointType: String) {
    cdkBuilder.endpointType(endpointType)
  }

  public fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
    cdkBuilder.ownershipVerificationCertificateArn(ownershipVerificationCertificateArn)
  }

  public fun securityPolicy(securityPolicy: String) {
    cdkBuilder.securityPolicy(securityPolicy)
  }

  public fun build(): CfnDomainName.DomainNameConfigurationProperty = cdkBuilder.build()
}
