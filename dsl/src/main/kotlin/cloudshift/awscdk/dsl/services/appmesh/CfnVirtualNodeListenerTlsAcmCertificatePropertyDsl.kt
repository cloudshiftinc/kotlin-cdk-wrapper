@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeListenerTlsAcmCertificatePropertyDsl {
  private val cdkBuilder: CfnVirtualNode.ListenerTlsAcmCertificateProperty.Builder =
      CfnVirtualNode.ListenerTlsAcmCertificateProperty.builder()

  /**
   * @param certificateArn The Amazon Resource Name (ARN) for the certificate. 
   * The certificate must meet specific requirements and you must have proxy authorization enabled.
   * For more information, see [Transport Layer Security
   * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites)
   * .
   */
  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  public fun build(): CfnVirtualNode.ListenerTlsAcmCertificateProperty = cdkBuilder.build()
}
