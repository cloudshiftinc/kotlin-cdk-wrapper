@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration

/**
 * The `TlsConfig` property specifies the TLS configuration for a private integration.
 *
 * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
 * Supported only for HTTP APIs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * TlsConfigProperty tlsConfigProperty = TlsConfigProperty.builder()
 * .serverNameToVerify("serverNameToVerify")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
 */
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
