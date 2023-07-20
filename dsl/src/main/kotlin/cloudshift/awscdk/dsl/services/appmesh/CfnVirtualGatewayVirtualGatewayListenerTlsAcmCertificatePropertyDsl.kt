@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayListenerTlsAcmCertificatePropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty.Builder
      = CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty.builder()

  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty =
      cdkBuilder.build()
}
