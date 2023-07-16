@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.AccessLog
import software.amazon.awscdk.services.appmesh.BackendDefaults
import software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps
import software.amazon.awscdk.services.appmesh.VirtualGatewayListener

@CdkDslMarker
public class VirtualGatewayBasePropsDsl {
  private val cdkBuilder: VirtualGatewayBaseProps.Builder = VirtualGatewayBaseProps.builder()

  private val _listeners: MutableList<VirtualGatewayListener> = mutableListOf()

  public fun accessLog(accessLog: AccessLog) {
    cdkBuilder.accessLog(accessLog)
  }

  public fun backendDefaults(block: BackendDefaultsDsl.() -> Unit = {}) {
    val builder = BackendDefaultsDsl()
    builder.apply(block)
    cdkBuilder.backendDefaults(builder.build())
  }

  public fun backendDefaults(backendDefaults: BackendDefaults) {
    cdkBuilder.backendDefaults(backendDefaults)
  }

  public fun listeners(vararg listeners: VirtualGatewayListener) {
    _listeners.addAll(listOf(*listeners))
  }

  public fun listeners(listeners: Collection<VirtualGatewayListener>) {
    _listeners.addAll(listeners)
  }

  public fun virtualGatewayName(virtualGatewayName: String) {
    cdkBuilder.virtualGatewayName(virtualGatewayName)
  }

  public fun build(): VirtualGatewayBaseProps {
    if(_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
    return cdkBuilder.build()
  }
}
