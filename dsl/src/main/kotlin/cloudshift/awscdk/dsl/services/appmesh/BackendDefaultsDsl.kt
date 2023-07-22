@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.BackendDefaults
import software.amazon.awscdk.services.appmesh.TlsClientPolicy

@CdkDslMarker
public class BackendDefaultsDsl {
  private val cdkBuilder: BackendDefaults.Builder = BackendDefaults.builder()

  /**
   * @param tlsClientPolicy TLS properties for Client policy for backend defaults.
   */
  public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicyDsl.() -> Unit = {}) {
    val builder = TlsClientPolicyDsl()
    builder.apply(tlsClientPolicy)
    cdkBuilder.tlsClientPolicy(builder.build())
  }

  /**
   * @param tlsClientPolicy TLS properties for Client policy for backend defaults.
   */
  public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy) {
    cdkBuilder.tlsClientPolicy(tlsClientPolicy)
  }

  public fun build(): BackendDefaults = cdkBuilder.build()
}
