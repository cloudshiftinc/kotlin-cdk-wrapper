@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayTlsValidationContextTrustPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty.Builder
      = CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty.builder()

  public fun acm(acm: IResolvable) {
    cdkBuilder.acm(acm)
  }

  public fun acm(acm: CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty) {
    cdkBuilder.acm(acm)
  }

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

  public fun build(): CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty =
      cdkBuilder.build()
}
