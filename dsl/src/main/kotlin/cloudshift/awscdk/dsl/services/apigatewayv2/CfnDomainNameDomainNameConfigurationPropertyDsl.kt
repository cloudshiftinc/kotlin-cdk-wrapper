@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName

@CdkDslMarker
public class CfnDomainNameDomainNameConfigurationPropertyDsl {
  private val cdkBuilder: CfnDomainName.DomainNameConfigurationProperty.Builder =
      CfnDomainName.DomainNameConfigurationProperty.builder()

  /**
   * @param certificateArn An AWS -managed certificate that will be used by the edge-optimized
   * endpoint for this domain name.
   * AWS Certificate Manager is the only supported source.
   */
  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  /**
   * @param certificateName The user-friendly name of the certificate that will be used by the
   * edge-optimized endpoint for this domain name.
   */
  public fun certificateName(certificateName: String) {
    cdkBuilder.certificateName(certificateName)
  }

  /**
   * @param endpointType The endpoint type.
   */
  public fun endpointType(endpointType: String) {
    cdkBuilder.endpointType(endpointType)
  }

  /**
   * @param ownershipVerificationCertificateArn The Amazon resource name (ARN) for the public
   * certificate issued by AWS Certificate Manager .
   * This ARN is used to validate custom domain ownership. It's required only if you configure
   * mutual TLS and use either an ACM-imported or a private CA certificate ARN as the
   * regionalCertificateArn.
   */
  public fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
    cdkBuilder.ownershipVerificationCertificateArn(ownershipVerificationCertificateArn)
  }

  /**
   * @param securityPolicy The Transport Layer Security (TLS) version of the security policy for
   * this domain name.
   * The valid values are `TLS_1_0` and `TLS_1_2` .
   */
  public fun securityPolicy(securityPolicy: String) {
    cdkBuilder.securityPolicy(securityPolicy)
  }

  public fun build(): CfnDomainName.DomainNameConfigurationProperty = cdkBuilder.build()
}
