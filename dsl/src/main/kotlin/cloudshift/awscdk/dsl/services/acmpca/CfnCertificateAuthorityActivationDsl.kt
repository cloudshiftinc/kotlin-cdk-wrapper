@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation
import software.constructs.Construct

@CdkDslMarker
public class CfnCertificateAuthorityActivationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCertificateAuthorityActivation.Builder =
      CfnCertificateAuthorityActivation.Builder.create(scope, id)

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

  public fun build(): CfnCertificateAuthorityActivation = cdkBuilder.build()
}
