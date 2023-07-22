@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayListenerTlsFileCertificatePropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty.Builder
      = CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty.builder()

  /**
   * @param certificateChain The certificate chain for the certificate. 
   */
  public fun certificateChain(certificateChain: String) {
    cdkBuilder.certificateChain(certificateChain)
  }

  /**
   * @param privateKey The private key for a certificate stored on the file system of the mesh
   * endpoint that the proxy is running on. 
   */
  public fun privateKey(privateKey: String) {
    cdkBuilder.privateKey(privateKey)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty =
      cdkBuilder.build()
}
