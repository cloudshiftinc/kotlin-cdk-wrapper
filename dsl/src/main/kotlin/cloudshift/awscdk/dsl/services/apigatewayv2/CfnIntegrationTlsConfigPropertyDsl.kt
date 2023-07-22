@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration

@CdkDslMarker
public class CfnIntegrationTlsConfigPropertyDsl {
  private val cdkBuilder: CfnIntegration.TlsConfigProperty.Builder =
      CfnIntegration.TlsConfigProperty.builder()

  /**
   * @param serverNameToVerify If you specify a server name, API Gateway uses it to verify the
   * hostname on the integration's certificate.
   * The server name is also included in the TLS handshake to support Server Name Indication (SNI)
   * or virtual hosting.
   */
  public fun serverNameToVerify(serverNameToVerify: String) {
    cdkBuilder.serverNameToVerify(serverNameToVerify)
  }

  public fun build(): CfnIntegration.TlsConfigProperty = cdkBuilder.build()
}
