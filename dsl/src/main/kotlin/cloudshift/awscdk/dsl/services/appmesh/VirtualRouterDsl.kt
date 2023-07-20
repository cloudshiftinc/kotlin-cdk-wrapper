@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualRouter
import software.amazon.awscdk.services.appmesh.VirtualRouterListener
import software.constructs.Construct

@CdkDslMarker
public class VirtualRouterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: VirtualRouter.Builder = VirtualRouter.Builder.create(scope, id)

  private val _listeners: MutableList<VirtualRouterListener> = mutableListOf()

  public fun listeners(vararg listeners: VirtualRouterListener) {
    _listeners.addAll(listOf(*listeners))
  }

  public fun listeners(listeners: Collection<VirtualRouterListener>) {
    _listeners.addAll(listeners)
  }

  public fun mesh(mesh: IMesh) {
    cdkBuilder.mesh(mesh)
  }

  public fun virtualRouterName(virtualRouterName: String) {
    cdkBuilder.virtualRouterName(virtualRouterName)
  }

  public fun build(): VirtualRouter {
    if(_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
    return cdkBuilder.build()
  }
}
