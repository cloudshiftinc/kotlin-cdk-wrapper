@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayListenerTlsValidationContextTrustPropertyDsl {
  private val cdkBuilder:
      CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty.Builder =
      CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty.builder()

  public fun `file`(`file`: IResolvable) {
    cdkBuilder.`file`(`file`)
  }

  public fun `file`(`file`: CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty) {
    cdkBuilder.`file`(`file`)
  }

  public fun sds(sds: IResolvable) {
    cdkBuilder.sds(sds)
  }

  public fun sds(sds: CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty) {
    cdkBuilder.sds(sds)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty =
      cdkBuilder.build()
}
