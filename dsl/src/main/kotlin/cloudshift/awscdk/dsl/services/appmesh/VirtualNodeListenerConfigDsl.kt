@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig

@CdkDslMarker
public class VirtualNodeListenerConfigDsl {
  private val cdkBuilder: VirtualNodeListenerConfig.Builder = VirtualNodeListenerConfig.builder()

  /**
   * @param listener Single listener config for a VirtualNode. 
   */
  public fun listener(listener: CfnVirtualNodeListenerPropertyDsl.() -> Unit = {}) {
    val builder = CfnVirtualNodeListenerPropertyDsl()
    builder.apply(listener)
    cdkBuilder.listener(builder.build())
  }

  /**
   * @param listener Single listener config for a VirtualNode. 
   */
  public fun listener(listener: CfnVirtualNode.ListenerProperty) {
    cdkBuilder.listener(listener)
  }

  public fun build(): VirtualNodeListenerConfig = cdkBuilder.build()
}
