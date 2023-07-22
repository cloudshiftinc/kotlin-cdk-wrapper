@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeListenerTlsSdsCertificatePropertyDsl {
  private val cdkBuilder: CfnVirtualNode.ListenerTlsSdsCertificateProperty.Builder =
      CfnVirtualNode.ListenerTlsSdsCertificateProperty.builder()

  /**
   * @param secretName A reference to an object that represents the name of the secret requested
   * from the Secret Discovery Service provider representing Transport Layer Security (TLS) materials
   * like a certificate or certificate chain. 
   */
  public fun secretName(secretName: String) {
    cdkBuilder.secretName(secretName)
  }

  public fun build(): CfnVirtualNode.ListenerTlsSdsCertificateProperty = cdkBuilder.build()
}
