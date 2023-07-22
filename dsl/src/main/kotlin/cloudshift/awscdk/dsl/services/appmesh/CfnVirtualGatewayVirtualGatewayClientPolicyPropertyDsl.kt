@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayClientPolicyPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayClientPolicyProperty.Builder =
      CfnVirtualGateway.VirtualGatewayClientPolicyProperty.builder()

  /**
   * @param tls A reference to an object that represents a Transport Layer Security (TLS) client
   * policy.
   */
  public fun tls(tls: IResolvable) {
    cdkBuilder.tls(tls)
  }

  /**
   * @param tls A reference to an object that represents a Transport Layer Security (TLS) client
   * policy.
   */
  public fun tls(tls: CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty) {
    cdkBuilder.tls(tls)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayClientPolicyProperty = cdkBuilder.build()
}
