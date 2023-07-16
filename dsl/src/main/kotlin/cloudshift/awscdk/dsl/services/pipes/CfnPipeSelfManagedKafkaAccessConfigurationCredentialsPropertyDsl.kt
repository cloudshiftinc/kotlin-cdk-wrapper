@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeSelfManagedKafkaAccessConfigurationCredentialsPropertyDsl {
  private val cdkBuilder: CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty.Builder =
      CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty.builder()

  public fun basicAuth(basicAuth: String) {
    cdkBuilder.basicAuth(basicAuth)
  }

  public fun clientCertificateTlsAuth(clientCertificateTlsAuth: String) {
    cdkBuilder.clientCertificateTlsAuth(clientCertificateTlsAuth)
  }

  public fun saslScram256Auth(saslScram256Auth: String) {
    cdkBuilder.saslScram256Auth(saslScram256Auth)
  }

  public fun saslScram512Auth(saslScram512Auth: String) {
    cdkBuilder.saslScram512Auth(saslScram512Auth)
  }

  public fun build(): CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty =
      cdkBuilder.build()
}
