@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeTlsValidationContextSdsTrustPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.TlsValidationContextSdsTrustProperty.Builder =
      CfnVirtualNode.TlsValidationContextSdsTrustProperty.builder()

  /**
   * @param secretName A reference to an object that represents the name of the secret for a
   * Transport Layer Security (TLS) Secret Discovery Service validation context trust. 
   */
  public fun secretName(secretName: String) {
    cdkBuilder.secretName(secretName)
  }

  public fun build(): CfnVirtualNode.TlsValidationContextSdsTrustProperty = cdkBuilder.build()
}
