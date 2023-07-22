@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig

/**
 * All Properties for TLS Validation Trusts for both Client Policy and Listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * TlsValidationTrustConfig tlsValidationTrustConfig = TlsValidationTrustConfig.builder()
 * .tlsValidationTrust(TlsValidationContextTrustProperty.builder()
 * .acm(TlsValidationContextAcmTrustProperty.builder()
 * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
 * .build())
 * .file(TlsValidationContextFileTrustProperty.builder()
 * .certificateChain("certificateChain")
 * .build())
 * .sds(TlsValidationContextSdsTrustProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * .build();
 * ```
 */
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
