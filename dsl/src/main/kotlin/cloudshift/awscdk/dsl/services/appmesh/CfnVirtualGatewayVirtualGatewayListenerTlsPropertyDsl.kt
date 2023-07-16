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

  public fun certificate(certificate: IResolvable) {
    cdkBuilder.certificate(certificate)
  }

  public
      fun certificate(certificate: CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty) {
    cdkBuilder.certificate(certificate)
  }

  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun validation(validation: IResolvable) {
    cdkBuilder.validation(validation)
  }

  public
      fun validation(validation: CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty) {
    cdkBuilder.validation(validation)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayListenerTlsProperty = cdkBuilder.build()
}
