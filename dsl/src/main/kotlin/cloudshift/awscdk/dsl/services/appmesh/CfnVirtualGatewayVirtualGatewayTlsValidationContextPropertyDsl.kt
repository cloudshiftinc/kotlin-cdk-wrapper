@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayTlsValidationContextPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty.Builder =
      CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty.builder()

  /**
   * @param subjectAlternativeNames A reference to an object that represents the SANs for a virtual
   * gateway's listener's Transport Layer Security (TLS) validation context.
   */
  public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
    cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
  }

  /**
   * @param subjectAlternativeNames A reference to an object that represents the SANs for a virtual
   * gateway's listener's Transport Layer Security (TLS) validation context.
   */
  public
      fun subjectAlternativeNames(subjectAlternativeNames: CfnVirtualGateway.SubjectAlternativeNamesProperty) {
    cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
  }

  /**
   * @param trust A reference to where to retrieve the trust chain when validating a peer’s
   * Transport Layer Security (TLS) certificate. 
   */
  public fun trust(trust: IResolvable) {
    cdkBuilder.trust(trust)
  }

  /**
   * @param trust A reference to where to retrieve the trust chain when validating a peer’s
   * Transport Layer Security (TLS) certificate. 
   */
  public fun trust(trust: CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty) {
    cdkBuilder.trust(trust)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty =
      cdkBuilder.build()
}
