@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewaySpecPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewaySpecProperty.Builder =
      CfnVirtualGateway.VirtualGatewaySpecProperty.builder()

  private val _listeners: MutableList<Any> = mutableListOf()

  /**
   * @param backendDefaults A reference to an object that represents the defaults for backends.
   */
  public fun backendDefaults(backendDefaults: IResolvable) {
    cdkBuilder.backendDefaults(backendDefaults)
  }

  /**
   * @param backendDefaults A reference to an object that represents the defaults for backends.
   */
  public
      fun backendDefaults(backendDefaults: CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty) {
    cdkBuilder.backendDefaults(backendDefaults)
  }

  /**
   * @param listeners The listeners that the mesh endpoint is expected to receive inbound traffic
   * from. 
   * You can specify one listener.
   */
  public fun listeners(vararg listeners: Any) {
    _listeners.addAll(listOf(*listeners))
  }

  /**
   * @param listeners The listeners that the mesh endpoint is expected to receive inbound traffic
   * from. 
   * You can specify one listener.
   */
  public fun listeners(listeners: Collection<Any>) {
    _listeners.addAll(listeners)
  }

  /**
   * @param listeners The listeners that the mesh endpoint is expected to receive inbound traffic
   * from. 
   * You can specify one listener.
   */
  public fun listeners(listeners: IResolvable) {
    cdkBuilder.listeners(listeners)
  }

  /**
   * @param logging An object that represents logging information.
   */
  public fun logging(logging: IResolvable) {
    cdkBuilder.logging(logging)
  }

  /**
   * @param logging An object that represents logging information.
   */
  public fun logging(logging: CfnVirtualGateway.VirtualGatewayLoggingProperty) {
    cdkBuilder.logging(logging)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewaySpecProperty {
    if(_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
    return cdkBuilder.build()
  }
}
