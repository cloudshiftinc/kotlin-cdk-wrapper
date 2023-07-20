@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualService

@CdkDslMarker
public class CfnVirtualServiceVirtualRouterServiceProviderPropertyDsl {
  private val cdkBuilder: CfnVirtualService.VirtualRouterServiceProviderProperty.Builder =
      CfnVirtualService.VirtualRouterServiceProviderProperty.builder()

  public fun virtualRouterName(virtualRouterName: String) {
    cdkBuilder.virtualRouterName(virtualRouterName)
  }

  public fun build(): CfnVirtualService.VirtualRouterServiceProviderProperty = cdkBuilder.build()
}
