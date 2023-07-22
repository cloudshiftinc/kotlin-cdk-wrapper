@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.TlsCertificateConfig

/**
 * A wrapper for the tls config returned by `TlsCertificate.bind`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * TlsCertificateConfig tlsCertificateConfig = TlsCertificateConfig.builder()
 * .tlsCertificate(ListenerTlsCertificateProperty.builder()
 * .acm(ListenerTlsAcmCertificateProperty.builder()
 * .certificateArn("certificateArn")
 * .build())
 * .file(ListenerTlsFileCertificateProperty.builder()
 * .certificateChain("certificateChain")
 * .privateKey("privateKey")
 * .build())
 * .sds(ListenerTlsSdsCertificateProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * .build();
 * ```
 */
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
