@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig

@CdkDslMarker
public class VirtualGatewayListenerConfigDsl {
  private val cdkBuilder: VirtualGatewayListenerConfig.Builder =
      VirtualGatewayListenerConfig.builder()

  /**
   * @param listener Single listener config for a VirtualGateway. 
   */
  public fun listener(listener: CfnVirtualGatewayVirtualGatewayListenerPropertyDsl.() -> Unit =
      {}) {
    val builder = CfnVirtualGatewayVirtualGatewayListenerPropertyDsl()
    builder.apply(listener)
    cdkBuilder.listener(builder.build())
  }

  /**
   * @param listener Single listener config for a VirtualGateway. 
   */
  public fun listener(listener: CfnVirtualGateway.VirtualGatewayListenerProperty) {
    cdkBuilder.listener(listener)
  }

  public fun build(): VirtualGatewayListenerConfig = cdkBuilder.build()
}
