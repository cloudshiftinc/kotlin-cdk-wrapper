@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualService

@CdkDslMarker
public class CfnVirtualServiceVirtualServiceProviderPropertyDsl {
  private val cdkBuilder: CfnVirtualService.VirtualServiceProviderProperty.Builder =
      CfnVirtualService.VirtualServiceProviderProperty.builder()

  /**
   * @param virtualNode The virtual node associated with a virtual service.
   */
  public fun virtualNode(virtualNode: IResolvable) {
    cdkBuilder.virtualNode(virtualNode)
  }

  /**
   * @param virtualNode The virtual node associated with a virtual service.
   */
  public fun virtualNode(virtualNode: CfnVirtualService.VirtualNodeServiceProviderProperty) {
    cdkBuilder.virtualNode(virtualNode)
  }

  /**
   * @param virtualRouter The virtual router associated with a virtual service.
   */
  public fun virtualRouter(virtualRouter: IResolvable) {
    cdkBuilder.virtualRouter(virtualRouter)
  }

  /**
   * @param virtualRouter The virtual router associated with a virtual service.
   */
  public fun virtualRouter(virtualRouter: CfnVirtualService.VirtualRouterServiceProviderProperty) {
    cdkBuilder.virtualRouter(virtualRouter)
  }

  public fun build(): CfnVirtualService.VirtualServiceProviderProperty = cdkBuilder.build()
}
