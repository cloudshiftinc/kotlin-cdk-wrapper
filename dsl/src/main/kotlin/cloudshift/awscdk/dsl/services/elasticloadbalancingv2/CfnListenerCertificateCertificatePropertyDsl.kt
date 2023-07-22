@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate

@CdkDslMarker
public class CfnListenerCertificateCertificatePropertyDsl {
  private val cdkBuilder: CfnListenerCertificate.CertificateProperty.Builder =
      CfnListenerCertificate.CertificateProperty.builder()

  /**
   * @param certificateArn The Amazon Resource Name (ARN) of the certificate.
   */
  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  public fun build(): CfnListenerCertificate.CertificateProperty = cdkBuilder.build()
}
