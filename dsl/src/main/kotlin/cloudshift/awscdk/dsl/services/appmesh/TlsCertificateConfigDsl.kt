@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.TlsCertificateConfig

@CdkDslMarker
public class TlsCertificateConfigDsl {
  private val cdkBuilder: TlsCertificateConfig.Builder = TlsCertificateConfig.builder()

  /**
   * @param tlsCertificate The CFN shape for a TLS certificate. 
   */
  public
      fun tlsCertificate(tlsCertificate: CfnVirtualNodeListenerTlsCertificatePropertyDsl.() -> Unit
      = {}) {
    val builder = CfnVirtualNodeListenerTlsCertificatePropertyDsl()
    builder.apply(tlsCertificate)
    cdkBuilder.tlsCertificate(builder.build())
  }

  /**
   * @param tlsCertificate The CFN shape for a TLS certificate. 
   */
  public fun tlsCertificate(tlsCertificate: CfnVirtualNode.ListenerTlsCertificateProperty) {
    cdkBuilder.tlsCertificate(tlsCertificate)
  }

  public fun build(): TlsCertificateConfig = cdkBuilder.build()
}
