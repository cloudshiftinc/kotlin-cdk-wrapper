@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.dms.CfnEndpoint

@CdkDslMarker
public class CfnEndpointRedisSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.RedisSettingsProperty.Builder =
      CfnEndpoint.RedisSettingsProperty.builder()

  /**
   * @param authPassword The password provided with the `auth-role` and `auth-token` options of the
   * `AuthType` setting for a Redis target endpoint.
   */
  public fun authPassword(authPassword: String) {
    cdkBuilder.authPassword(authPassword)
  }

  /**
   * @param authType The type of authentication to perform when connecting to a Redis target.
   * Options include `none` , `auth-token` , and `auth-role` . The `auth-token` option requires an
   * `AuthPassword` value to be provided. The `auth-role` option requires `AuthUserName` and
   * `AuthPassword` values to be provided.
   */
  public fun authType(authType: String) {
    cdkBuilder.authType(authType)
  }

  /**
   * @param authUserName The user name provided with the `auth-role` option of the `AuthType`
   * setting for a Redis target endpoint.
   */
  public fun authUserName(authUserName: String) {
    cdkBuilder.authUserName(authUserName)
  }

  /**
   * @param port Transmission Control Protocol (TCP) port for the endpoint.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param serverName Fully qualified domain name of the endpoint.
   */
  public fun serverName(serverName: String) {
    cdkBuilder.serverName(serverName)
  }

  /**
   * @param sslCaCertificateArn The Amazon Resource Name (ARN) for the certificate authority (CA)
   * that DMS uses to connect to your Redis target endpoint.
   */
  public fun sslCaCertificateArn(sslCaCertificateArn: String) {
    cdkBuilder.sslCaCertificateArn(sslCaCertificateArn)
  }

  /**
   * @param sslSecurityProtocol The connection to a Redis target endpoint using Transport Layer
   * Security (TLS).
   * Valid values include `plaintext` and `ssl-encryption` . The default is `ssl-encryption` . The
   * `ssl-encryption` option makes an encrypted connection. Optionally, you can identify an Amazon
   * Resource Name (ARN) for an SSL certificate authority (CA) using the `SslCaCertificateArn` setting.
   * If an ARN isn't given for a CA, DMS uses the Amazon root CA.
   *
   * The `plaintext` option doesn't provide Transport Layer Security (TLS) encryption for traffic
   * between endpoint and database.
   */
  public fun sslSecurityProtocol(sslSecurityProtocol: String) {
    cdkBuilder.sslSecurityProtocol(sslSecurityProtocol)
  }

  public fun build(): CfnEndpoint.RedisSettingsProperty = cdkBuilder.build()
}
