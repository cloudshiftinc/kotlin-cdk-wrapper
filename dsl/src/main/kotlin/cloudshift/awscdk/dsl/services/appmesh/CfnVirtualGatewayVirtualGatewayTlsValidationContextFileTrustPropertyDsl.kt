@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayTlsValidationContextFileTrustPropertyDsl {
  private val cdkBuilder:
      CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty.Builder =
      CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty.builder()

  /**
   * @param certificateChain The certificate trust chain for a certificate stored on the file system
   * of the virtual node that the proxy is running on. 
   */
  public fun certificateChain(certificateChain: String) {
    cdkBuilder.certificateChain(certificateChain)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty =
      cdkBuilder.build()
}
