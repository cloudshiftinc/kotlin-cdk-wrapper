@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.AccessLog
import software.amazon.awscdk.services.appmesh.BackendDefaults
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualGatewayListener
import software.amazon.awscdk.services.appmesh.VirtualGatewayProps

@CdkDslMarker
public class VirtualGatewayPropsDsl {
  private val cdkBuilder: VirtualGatewayProps.Builder = VirtualGatewayProps.builder()

  private val _listeners: MutableList<VirtualGatewayListener> = mutableListOf()

  /**
   * @param accessLog Access Logging Configuration for the VirtualGateway.
   */
  public fun accessLog(accessLog: AccessLog) {
    cdkBuilder.accessLog(accessLog)
  }

  /**
   * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
   * Service.
   */
  public fun backendDefaults(backendDefaults: BackendDefaultsDsl.() -> Unit = {}) {
    val builder = BackendDefaultsDsl()
    builder.apply(backendDefaults)
    cdkBuilder.backendDefaults(builder.build())
  }

  /**
   * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
   * Service.
   */
  public fun backendDefaults(backendDefaults: BackendDefaults) {
    cdkBuilder.backendDefaults(backendDefaults)
  }

  /**
   * @param listeners Listeners for the VirtualGateway.
   * Only one is supported.
   */
  public fun listeners(vararg listeners: VirtualGatewayListener) {
    _listeners.addAll(listOf(*listeners))
  }

  /**
   * @param listeners Listeners for the VirtualGateway.
   * Only one is supported.
   */
  public fun listeners(listeners: Collection<VirtualGatewayListener>) {
    _listeners.addAll(listeners)
  }

  /**
   * @param mesh The Mesh which the VirtualGateway belongs to. 
   */
  public fun mesh(mesh: IMesh) {
    cdkBuilder.mesh(mesh)
  }

  /**
   * @param virtualGatewayName Name of the VirtualGateway.
   */
  public fun virtualGatewayName(virtualGatewayName: String) {
    cdkBuilder.virtualGatewayName(virtualGatewayName)
  }

  public fun build(): VirtualGatewayProps {
    if(_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
    return cdkBuilder.build()
  }
}
