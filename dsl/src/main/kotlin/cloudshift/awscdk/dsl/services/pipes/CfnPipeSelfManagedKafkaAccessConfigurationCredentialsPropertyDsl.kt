@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeSelfManagedKafkaAccessConfigurationCredentialsPropertyDsl {
  private val cdkBuilder: CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty.Builder =
      CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty.builder()

  /**
   * @param basicAuth The ARN of the Secrets Manager secret.
   */
  public fun basicAuth(basicAuth: String) {
    cdkBuilder.basicAuth(basicAuth)
  }

  /**
   * @param clientCertificateTlsAuth The ARN of the Secrets Manager secret.
   */
  public fun clientCertificateTlsAuth(clientCertificateTlsAuth: String) {
    cdkBuilder.clientCertificateTlsAuth(clientCertificateTlsAuth)
  }

  /**
   * @param saslScram256Auth The ARN of the Secrets Manager secret.
   */
  public fun saslScram256Auth(saslScram256Auth: String) {
    cdkBuilder.saslScram256Auth(saslScram256Auth)
  }

  /**
   * @param saslScram512Auth The ARN of the Secrets Manager secret.
   */
  public fun saslScram512Auth(saslScram512Auth: String) {
    cdkBuilder.saslScram512Auth(saslScram512Auth)
  }

  public fun build(): CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty =
      cdkBuilder.build()
}
