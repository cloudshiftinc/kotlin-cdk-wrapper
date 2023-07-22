@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeMSKAccessCredentialsPropertyDsl {
  private val cdkBuilder: CfnPipe.MSKAccessCredentialsProperty.Builder =
      CfnPipe.MSKAccessCredentialsProperty.builder()

  /**
   * @param clientCertificateTlsAuth The ARN of the Secrets Manager secret.
   */
  public fun clientCertificateTlsAuth(clientCertificateTlsAuth: String) {
    cdkBuilder.clientCertificateTlsAuth(clientCertificateTlsAuth)
  }

  /**
   * @param saslScram512Auth The ARN of the Secrets Manager secret.
   */
  public fun saslScram512Auth(saslScram512Auth: String) {
    cdkBuilder.saslScram512Auth(saslScram512Auth)
  }

  public fun build(): CfnPipe.MSKAccessCredentialsProperty = cdkBuilder.build()
}
