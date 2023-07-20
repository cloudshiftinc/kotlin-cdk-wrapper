@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnCertificate
import software.constructs.Construct

@CdkDslMarker
public class CfnCertificateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCertificate.Builder = CfnCertificate.Builder.create(scope, id)

  public fun caCertificatePem(caCertificatePem: String) {
    cdkBuilder.caCertificatePem(caCertificatePem)
  }

  public fun certificateMode(certificateMode: String) {
    cdkBuilder.certificateMode(certificateMode)
  }

  public fun certificatePem(certificatePem: String) {
    cdkBuilder.certificatePem(certificatePem)
  }

  public fun certificateSigningRequest(certificateSigningRequest: String) {
    cdkBuilder.certificateSigningRequest(certificateSigningRequest)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnCertificate = cdkBuilder.build()
}
