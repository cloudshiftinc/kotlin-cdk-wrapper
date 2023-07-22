@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualService

@CdkDslMarker
public class CfnVirtualServiceVirtualNodeServiceProviderPropertyDsl {
  private val cdkBuilder: CfnVirtualService.VirtualNodeServiceProviderProperty.Builder =
      CfnVirtualService.VirtualNodeServiceProviderProperty.builder()

  /**
   * @param virtualNodeName The name of the virtual node that is acting as a service provider. 
   */
  public fun virtualNodeName(virtualNodeName: String) {
    cdkBuilder.virtualNodeName(virtualNodeName)
  }

  public fun build(): CfnVirtualService.VirtualNodeServiceProviderProperty = cdkBuilder.build()
}
