@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents an AWS Certificate Manager certificate.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * ListenerTlsAcmCertificateProperty listenerTlsAcmCertificateProperty =
 * ListenerTlsAcmCertificateProperty.builder()
 * .certificateArn("certificateArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsacmcertificate.html)
 */
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
