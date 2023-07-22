@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayTlsValidationContextTrustPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty.Builder
      = CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty.builder()

  /**
   * @param acm A reference to an object that represents a Transport Layer Security (TLS) validation
   * context trust for an AWS Certificate Manager certificate.
   */
  public fun acm(acm: IResolvable) {
    cdkBuilder.acm(acm)
  }

  /**
   * @param acm A reference to an object that represents a Transport Layer Security (TLS) validation
   * context trust for an AWS Certificate Manager certificate.
   */
  public fun acm(acm: CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty) {
    cdkBuilder.acm(acm)
  }

  /**
   * @param file An object that represents a Transport Layer Security (TLS) validation context trust
   * for a local file.
   */
  public fun `file`(`file`: IResolvable) {
    cdkBuilder.`file`(`file`)
  }

  /**
   * @param file An object that represents a Transport Layer Security (TLS) validation context trust
   * for a local file.
   */
  public fun `file`(`file`: CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty) {
    cdkBuilder.`file`(`file`)
  }

  /**
   * @param sds A reference to an object that represents a virtual gateway's Transport Layer
   * Security (TLS) Secret Discovery Service validation context trust.
   */
  public fun sds(sds: IResolvable) {
    cdkBuilder.sds(sds)
  }

  /**
   * @param sds A reference to an object that represents a virtual gateway's Transport Layer
   * Security (TLS) Secret Discovery Service validation context trust.
   */
  public fun sds(sds: CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty) {
    cdkBuilder.sds(sds)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty =
      cdkBuilder.build()
}
