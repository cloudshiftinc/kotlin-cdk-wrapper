@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeListenerTlsFileCertificatePropertyDsl {
  private val cdkBuilder: CfnVirtualNode.ListenerTlsFileCertificateProperty.Builder =
      CfnVirtualNode.ListenerTlsFileCertificateProperty.builder()

  /**
   * @param certificateChain The certificate chain for the certificate. 
   */
  public fun certificateChain(certificateChain: String) {
    cdkBuilder.certificateChain(certificateChain)
  }

  /**
   * @param privateKey The private key for a certificate stored on the file system of the virtual
   * node that the proxy is running on. 
   */
  public fun privateKey(privateKey: String) {
    cdkBuilder.privateKey(privateKey)
  }

  public fun build(): CfnVirtualNode.ListenerTlsFileCertificateProperty = cdkBuilder.build()
}
