@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeListenerTlsValidationContextTrustPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.ListenerTlsValidationContextTrustProperty.Builder =
      CfnVirtualNode.ListenerTlsValidationContextTrustProperty.builder()

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
  public fun `file`(`file`: CfnVirtualNode.TlsValidationContextFileTrustProperty) {
    cdkBuilder.`file`(`file`)
  }

  /**
   * @param sds A reference to an object that represents a listener's Transport Layer Security (TLS)
   * Secret Discovery Service validation context trust.
   */
  public fun sds(sds: IResolvable) {
    cdkBuilder.sds(sds)
  }

  /**
   * @param sds A reference to an object that represents a listener's Transport Layer Security (TLS)
   * Secret Discovery Service validation context trust.
   */
  public fun sds(sds: CfnVirtualNode.TlsValidationContextSdsTrustProperty) {
    cdkBuilder.sds(sds)
  }

  public fun build(): CfnVirtualNode.ListenerTlsValidationContextTrustProperty = cdkBuilder.build()
}
