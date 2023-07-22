@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter
import software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig

@CdkDslMarker
public class VirtualRouterListenerConfigDsl {
  private val cdkBuilder: VirtualRouterListenerConfig.Builder =
      VirtualRouterListenerConfig.builder()

  /**
   * @param listener Single listener config for a VirtualRouter. 
   */
  public fun listener(listener: CfnVirtualRouterVirtualRouterListenerPropertyDsl.() -> Unit = {}) {
    val builder = CfnVirtualRouterVirtualRouterListenerPropertyDsl()
    builder.apply(listener)
    cdkBuilder.listener(builder.build())
  }

  /**
   * @param listener Single listener config for a VirtualRouter. 
   */
  public fun listener(listener: CfnVirtualRouter.VirtualRouterListenerProperty) {
    cdkBuilder.listener(listener)
  }

  public fun build(): VirtualRouterListenerConfig = cdkBuilder.build()
}
