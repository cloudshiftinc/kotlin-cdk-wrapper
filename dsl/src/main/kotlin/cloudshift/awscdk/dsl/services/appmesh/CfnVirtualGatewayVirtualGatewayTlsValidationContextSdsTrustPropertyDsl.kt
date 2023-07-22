@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayTlsValidationContextSdsTrustPropertyDsl {
  private val cdkBuilder:
      CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty.Builder =
      CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty.builder()

  /**
   * @param secretName A reference to an object that represents the name of the secret for a virtual
   * gateway's Transport Layer Security (TLS) Secret Discovery Service validation context trust. 
   */
  public fun secretName(secretName: String) {
    cdkBuilder.secretName(secretName)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty =
      cdkBuilder.build()
}
