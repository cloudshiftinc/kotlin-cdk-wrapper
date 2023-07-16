@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeTlsValidationContextSdsTrustPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.TlsValidationContextSdsTrustProperty.Builder =
      CfnVirtualNode.TlsValidationContextSdsTrustProperty.builder()

  public fun secretName(secretName: String) {
    cdkBuilder.secretName(secretName)
  }

  public fun build(): CfnVirtualNode.TlsValidationContextSdsTrustProperty = cdkBuilder.build()
}
