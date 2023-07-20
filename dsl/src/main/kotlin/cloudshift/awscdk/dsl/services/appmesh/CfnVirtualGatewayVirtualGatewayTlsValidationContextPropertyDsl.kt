@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayTlsValidationContextPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty.Builder =
      CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty.builder()

  public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
    cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
  }

  public
      fun subjectAlternativeNames(subjectAlternativeNames: CfnVirtualGateway.SubjectAlternativeNamesProperty) {
    cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
  }

  public fun trust(trust: IResolvable) {
    cdkBuilder.trust(trust)
  }

  public fun trust(trust: CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty) {
    cdkBuilder.trust(trust)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty =
      cdkBuilder.build()
}
