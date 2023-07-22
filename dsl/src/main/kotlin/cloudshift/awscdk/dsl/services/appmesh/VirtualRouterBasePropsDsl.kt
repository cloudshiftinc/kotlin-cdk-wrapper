@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.VirtualRouterBaseProps
import software.amazon.awscdk.services.appmesh.VirtualRouterListener

@CdkDslMarker
public class VirtualRouterBasePropsDsl {
  private val cdkBuilder: VirtualRouterBaseProps.Builder = VirtualRouterBaseProps.builder()

  private val _listeners: MutableList<VirtualRouterListener> = mutableListOf()

  /**
   * @param listeners Listener specification for the VirtualRouter.
   */
  public fun listeners(vararg listeners: VirtualRouterListener) {
    _listeners.addAll(listOf(*listeners))
  }

  /**
   * @param listeners Listener specification for the VirtualRouter.
   */
  public fun listeners(listeners: Collection<VirtualRouterListener>) {
    _listeners.addAll(listeners)
  }

  /**
   * @param virtualRouterName The name of the VirtualRouter.
   */
  public fun virtualRouterName(virtualRouterName: String) {
    cdkBuilder.virtualRouterName(virtualRouterName)
  }

  public fun build(): VirtualRouterBaseProps {
    if(_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
    return cdkBuilder.build()
  }
}
