@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig

@CdkDslMarker
public class TlsValidationTrustConfigDsl {
  private val cdkBuilder: TlsValidationTrustConfig.Builder = TlsValidationTrustConfig.builder()

  /**
   * @param tlsValidationTrust VirtualNode CFN configuration for client policy's TLS Validation
   * Trust. 
   */
  public
      fun tlsValidationTrust(tlsValidationTrust: CfnVirtualNodeTlsValidationContextTrustPropertyDsl.() -> Unit
      = {}) {
    val builder = CfnVirtualNodeTlsValidationContextTrustPropertyDsl()
    builder.apply(tlsValidationTrust)
    cdkBuilder.tlsValidationTrust(builder.build())
  }

  /**
   * @param tlsValidationTrust VirtualNode CFN configuration for client policy's TLS Validation
   * Trust. 
   */
  public
      fun tlsValidationTrust(tlsValidationTrust: CfnVirtualNode.TlsValidationContextTrustProperty) {
    cdkBuilder.tlsValidationTrust(tlsValidationTrust)
  }

  public fun build(): TlsValidationTrustConfig = cdkBuilder.build()
}
