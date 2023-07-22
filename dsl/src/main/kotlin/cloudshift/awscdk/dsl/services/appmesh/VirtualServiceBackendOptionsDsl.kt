@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TlsClientPolicy
import software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions

@CdkDslMarker
public class VirtualServiceBackendOptionsDsl {
  private val cdkBuilder: VirtualServiceBackendOptions.Builder =
      VirtualServiceBackendOptions.builder()

  /**
   * @param tlsClientPolicy TLS properties for  Client policy for the backend.
   */
  public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicyDsl.() -> Unit = {}) {
    val builder = TlsClientPolicyDsl()
    builder.apply(tlsClientPolicy)
    cdkBuilder.tlsClientPolicy(builder.build())
  }

  /**
   * @param tlsClientPolicy TLS properties for  Client policy for the backend.
   */
  public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy) {
    cdkBuilder.tlsClientPolicy(tlsClientPolicy)
  }

  public fun build(): VirtualServiceBackendOptions = cdkBuilder.build()
}
