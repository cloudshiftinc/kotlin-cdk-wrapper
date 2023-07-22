@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.BackendConfig
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class BackendConfigDsl {
  private val cdkBuilder: BackendConfig.Builder = BackendConfig.builder()

  /**
   * @param virtualServiceBackend Config for a Virtual Service backend. 
   */
  public
      fun virtualServiceBackend(virtualServiceBackend: CfnVirtualNodeBackendPropertyDsl.() -> Unit =
      {}) {
    val builder = CfnVirtualNodeBackendPropertyDsl()
    builder.apply(virtualServiceBackend)
    cdkBuilder.virtualServiceBackend(builder.build())
  }

  /**
   * @param virtualServiceBackend Config for a Virtual Service backend. 
   */
  public fun virtualServiceBackend(virtualServiceBackend: CfnVirtualNode.BackendProperty) {
    cdkBuilder.virtualServiceBackend(virtualServiceBackend)
  }

  public fun build(): BackendConfig = cdkBuilder.build()
}
