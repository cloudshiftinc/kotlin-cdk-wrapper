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

  public fun authPassword(authPassword: String) {
    cdkBuilder.authPassword(authPassword)
  }

  public fun authType(authType: String) {
    cdkBuilder.authType(authType)
  }

  public fun authUserName(authUserName: String) {
    cdkBuilder.authUserName(authUserName)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun serverName(serverName: String) {
    cdkBuilder.serverName(serverName)
  }

  public fun sslCaCertificateArn(sslCaCertificateArn: String) {
    cdkBuilder.sslCaCertificateArn(sslCaCertificateArn)
  }

  public fun sslSecurityProtocol(sslSecurityProtocol: String) {
    cdkBuilder.sslSecurityProtocol(sslSecurityProtocol)
  }

  public fun build(): CfnEndpoint.RedisSettingsProperty = cdkBuilder.build()
}
