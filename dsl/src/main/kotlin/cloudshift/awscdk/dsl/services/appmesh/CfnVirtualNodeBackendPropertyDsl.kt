@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeBackendPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.BackendProperty.Builder =
      CfnVirtualNode.BackendProperty.builder()

  /**
   * @param virtualService Specifies a virtual service to use as a backend.
   */
  public fun virtualService(virtualService: IResolvable) {
    cdkBuilder.virtualService(virtualService)
  }

  /**
   * @param virtualService Specifies a virtual service to use as a backend.
   */
  public fun virtualService(virtualService: CfnVirtualNode.VirtualServiceBackendProperty) {
    cdkBuilder.virtualService(virtualService)
  }

  public fun build(): CfnVirtualNode.BackendProperty = cdkBuilder.build()
}
