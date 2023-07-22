@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents the listener's Secret Discovery Service certificate.
 *
 * The proxy must be configured with a local SDS provider via a Unix Domain Socket. See App Mesh
 * [TLS documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) for more info.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * ListenerTlsSdsCertificateProperty listenerTlsSdsCertificateProperty =
 * ListenerTlsSdsCertificateProperty.builder()
 * .secretName("secretName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlssdscertificate.html)
 */
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
