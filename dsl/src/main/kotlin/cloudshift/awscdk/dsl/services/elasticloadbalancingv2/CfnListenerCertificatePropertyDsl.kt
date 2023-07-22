@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener

@CdkDslMarker
public class CfnListenerCertificatePropertyDsl {
  private val cdkBuilder: CfnListener.CertificateProperty.Builder =
      CfnListener.CertificateProperty.builder()

  /**
   * @param certificateArn The Amazon Resource Name (ARN) of the certificate.
   */
  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  public fun build(): CfnListener.CertificateProperty = cdkBuilder.build()
}
