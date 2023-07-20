@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeTlsValidationContextPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.TlsValidationContextProperty.Builder =
      CfnVirtualNode.TlsValidationContextProperty.builder()

  public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
    cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
  }

  public
      fun subjectAlternativeNames(subjectAlternativeNames: CfnVirtualNode.SubjectAlternativeNamesProperty) {
    cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
  }

  public fun trust(trust: IResolvable) {
    cdkBuilder.trust(trust)
  }

  public fun trust(trust: CfnVirtualNode.TlsValidationContextTrustProperty) {
    cdkBuilder.trust(trust)
  }

  public fun build(): CfnVirtualNode.TlsValidationContextProperty = cdkBuilder.build()
}
