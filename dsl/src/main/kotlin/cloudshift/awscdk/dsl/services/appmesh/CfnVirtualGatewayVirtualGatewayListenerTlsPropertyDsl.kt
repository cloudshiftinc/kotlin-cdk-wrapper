@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayListenerTlsPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayListenerTlsProperty.Builder =
      CfnVirtualGateway.VirtualGatewayListenerTlsProperty.builder()

  /**
   * @param certificate An object that represents a Transport Layer Security (TLS) certificate. 
   */
  public fun certificate(certificate: IResolvable) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param certificate An object that represents a Transport Layer Security (TLS) certificate. 
   */
  public
      fun certificate(certificate: CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty) {
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
   * @param validation A reference to an object that represents a virtual gateway's listener's
   * Transport Layer Security (TLS) validation context.
   */
  public fun validation(validation: IResolvable) {
    cdkBuilder.validation(validation)
  }

  /**
   * @param validation A reference to an object that represents a virtual gateway's listener's
   * Transport Layer Security (TLS) validation context.
   */
  public
      fun validation(validation: CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty) {
    cdkBuilder.validation(validation)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayListenerTlsProperty = cdkBuilder.build()
}
