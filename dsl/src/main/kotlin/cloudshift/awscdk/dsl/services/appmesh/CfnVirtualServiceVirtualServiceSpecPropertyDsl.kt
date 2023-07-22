@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualService

@CdkDslMarker
public class CfnVirtualServiceVirtualServiceSpecPropertyDsl {
  private val cdkBuilder: CfnVirtualService.VirtualServiceSpecProperty.Builder =
      CfnVirtualService.VirtualServiceSpecProperty.builder()

  /**
   * @param provider The App Mesh object that is acting as the provider for a virtual service.
   * You can specify a single virtual node or virtual router.
   */
  public fun provider(provider: IResolvable) {
    cdkBuilder.provider(provider)
  }

  /**
   * @param provider The App Mesh object that is acting as the provider for a virtual service.
   * You can specify a single virtual node or virtual router.
   */
  public fun provider(provider: CfnVirtualService.VirtualServiceProviderProperty) {
    cdkBuilder.provider(provider)
  }

  public fun build(): CfnVirtualService.VirtualServiceSpecProperty = cdkBuilder.build()
}
