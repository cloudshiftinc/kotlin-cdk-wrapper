@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps

@CdkDslMarker
public class CfnCertificateAuthorityActivationPropsDsl {
  private val cdkBuilder: CfnCertificateAuthorityActivationProps.Builder =
      CfnCertificateAuthorityActivationProps.builder()

  public fun certificate(certificate: String) {
    cdkBuilder.certificate(certificate)
  }

  public fun certificateAuthorityArn(certificateAuthorityArn: String) {
    cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
  }

  public fun certificateChain(certificateChain: String) {
    cdkBuilder.certificateChain(certificateChain)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnCertificateAuthorityActivationProps = cdkBuilder.build()
}
