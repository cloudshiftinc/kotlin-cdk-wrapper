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
import software.amazon.awscdk.services.appmesh.VirtualGateway
import software.amazon.awscdk.services.appmesh.VirtualGatewayListener
import software.constructs.Construct

@CdkDslMarker
public class VirtualGatewayDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: VirtualGateway.Builder = VirtualGateway.Builder.create(scope, id)

  private val _listeners: MutableList<VirtualGatewayListener> = mutableListOf()

  /**
   * Access Logging Configuration for the VirtualGateway.
   *
   * Default: - no access logging
   *
   * @param accessLog Access Logging Configuration for the VirtualGateway. 
   */
  public fun accessLog(accessLog: AccessLog) {
    cdkBuilder.accessLog(accessLog)
  }

  /**
   * Default Configuration Virtual Node uses to communicate with Virtual Service.
   *
   * Default: - No Config
   *
   * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
   * Service. 
   */
  public fun backendDefaults(backendDefaults: BackendDefaultsDsl.() -> Unit = {}) {
    val builder = BackendDefaultsDsl()
    builder.apply(backendDefaults)
    cdkBuilder.backendDefaults(builder.build())
  }

  /**
   * Default Configuration Virtual Node uses to communicate with Virtual Service.
   *
   * Default: - No Config
   *
   * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
   * Service. 
   */
  public fun backendDefaults(backendDefaults: BackendDefaults) {
    cdkBuilder.backendDefaults(backendDefaults)
  }

  /**
   * Listeners for the VirtualGateway.
   *
   * Only one is supported.
   *
   * Default: - Single HTTP listener on port 8080
   *
   * @param listeners Listeners for the VirtualGateway. 
   */
  public fun listeners(vararg listeners: VirtualGatewayListener) {
    _listeners.addAll(listOf(*listeners))
  }

  /**
   * Listeners for the VirtualGateway.
   *
   * Only one is supported.
   *
   * Default: - Single HTTP listener on port 8080
   *
   * @param listeners Listeners for the VirtualGateway. 
   */
  public fun listeners(listeners: Collection<VirtualGatewayListener>) {
    _listeners.addAll(listeners)
  }

  /**
   * The Mesh which the VirtualGateway belongs to.
   *
   * @param mesh The Mesh which the VirtualGateway belongs to. 
   */
  public fun mesh(mesh: IMesh) {
    cdkBuilder.mesh(mesh)
  }

  /**
   * Name of the VirtualGateway.
   *
   * Default: - A name is automatically determined
   *
   * @param virtualGatewayName Name of the VirtualGateway. 
   */
  public fun virtualGatewayName(virtualGatewayName: String) {
    cdkBuilder.virtualGatewayName(virtualGatewayName)
  }

  public fun build(): VirtualGateway {
    if(_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
    return cdkBuilder.build()
  }
}
