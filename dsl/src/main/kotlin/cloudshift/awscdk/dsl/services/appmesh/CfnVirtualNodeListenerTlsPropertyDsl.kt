@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeListenerTlsPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.ListenerTlsProperty.Builder =
      CfnVirtualNode.ListenerTlsProperty.builder()

  /**
   * @param certificate A reference to an object that represents a listener's Transport Layer
   * Security (TLS) certificate. 
   */
  public fun certificate(certificate: IResolvable) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param certificate A reference to an object that represents a listener's Transport Layer
   * Security (TLS) certificate. 
   */
  public fun certificate(certificate: CfnVirtualNode.ListenerTlsCertificateProperty) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param mode Specify one of the following modes. 
   * * ** STRICT – Listener only accepts connections with TLS enabled.
   * * ** PERMISSIVE – Listener accepts connections with or without TLS enabled.
   * * ** DISABLED – Listener only accepts connections without TLS.
   */
  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  /**
   * @param validation A reference to an object that represents a listener's Transport Layer
   * Security (TLS) validation context.
   */
  public fun validation(validation: IResolvable) {
    cdkBuilder.validation(validation)
  }

  /**
   * @param validation A reference to an object that represents a listener's Transport Layer
   * Security (TLS) validation context.
   */
  public fun validation(validation: CfnVirtualNode.ListenerTlsValidationContextProperty) {
    cdkBuilder.validation(validation)
  }

  public fun build(): CfnVirtualNode.ListenerTlsProperty = cdkBuilder.build()
}
