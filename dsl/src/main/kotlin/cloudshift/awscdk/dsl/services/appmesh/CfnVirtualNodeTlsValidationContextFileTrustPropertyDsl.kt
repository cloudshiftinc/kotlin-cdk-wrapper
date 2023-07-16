@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeTlsValidationContextFileTrustPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.TlsValidationContextFileTrustProperty.Builder =
      CfnVirtualNode.TlsValidationContextFileTrustProperty.builder()

  public fun certificateChain(certificateChain: String) {
    cdkBuilder.certificateChain(certificateChain)
  }

  public fun build(): CfnVirtualNode.TlsValidationContextFileTrustProperty = cdkBuilder.build()
}
