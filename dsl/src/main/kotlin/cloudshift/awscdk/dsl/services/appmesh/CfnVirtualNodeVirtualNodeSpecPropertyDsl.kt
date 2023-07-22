@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeVirtualNodeSpecPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.VirtualNodeSpecProperty.Builder =
      CfnVirtualNode.VirtualNodeSpecProperty.builder()

  private val _backends: MutableList<Any> = mutableListOf()

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
  public fun backendDefaults(backendDefaults: CfnVirtualNode.BackendDefaultsProperty) {
    cdkBuilder.backendDefaults(backendDefaults)
  }

  /**
   * @param backends The backends that the virtual node is expected to send outbound traffic to.
   *
   * App Mesh doesn't validate the existence of those virtual services specified in backends. This
   * is to prevent a cyclic dependency between virtual nodes and virtual services creation. Make sure
   * the virtual service name is correct. The virtual service can be created afterwards if it doesn't
   * already exist.
   */
  public fun backends(vararg backends: Any) {
    _backends.addAll(listOf(*backends))
  }

  /**
   * @param backends The backends that the virtual node is expected to send outbound traffic to.
   *
   * App Mesh doesn't validate the existence of those virtual services specified in backends. This
   * is to prevent a cyclic dependency between virtual nodes and virtual services creation. Make sure
   * the virtual service name is correct. The virtual service can be created afterwards if it doesn't
   * already exist.
   */
  public fun backends(backends: Collection<Any>) {
    _backends.addAll(backends)
  }

  /**
   * @param backends The backends that the virtual node is expected to send outbound traffic to.
   *
   * App Mesh doesn't validate the existence of those virtual services specified in backends. This
   * is to prevent a cyclic dependency between virtual nodes and virtual services creation. Make sure
   * the virtual service name is correct. The virtual service can be created afterwards if it doesn't
   * already exist.
   */
  public fun backends(backends: IResolvable) {
    cdkBuilder.backends(backends)
  }

  /**
   * @param listeners The listener that the virtual node is expected to receive inbound traffic
   * from.
   * You can specify one listener.
   */
  public fun listeners(vararg listeners: Any) {
    _listeners.addAll(listOf(*listeners))
  }

  /**
   * @param listeners The listener that the virtual node is expected to receive inbound traffic
   * from.
   * You can specify one listener.
   */
  public fun listeners(listeners: Collection<Any>) {
    _listeners.addAll(listeners)
  }

  /**
   * @param listeners The listener that the virtual node is expected to receive inbound traffic
   * from.
   * You can specify one listener.
   */
  public fun listeners(listeners: IResolvable) {
    cdkBuilder.listeners(listeners)
  }

  /**
   * @param logging The inbound and outbound access logging information for the virtual node.
   */
  public fun logging(logging: IResolvable) {
    cdkBuilder.logging(logging)
  }

  /**
   * @param logging The inbound and outbound access logging information for the virtual node.
   */
  public fun logging(logging: CfnVirtualNode.LoggingProperty) {
    cdkBuilder.logging(logging)
  }

  /**
   * @param serviceDiscovery The service discovery information for the virtual node.
   * If your virtual node does not expect ingress traffic, you can omit this parameter. If you
   * specify a `listener` , then you must specify service discovery information.
   */
  public fun serviceDiscovery(serviceDiscovery: IResolvable) {
    cdkBuilder.serviceDiscovery(serviceDiscovery)
  }

  /**
   * @param serviceDiscovery The service discovery information for the virtual node.
   * If your virtual node does not expect ingress traffic, you can omit this parameter. If you
   * specify a `listener` , then you must specify service discovery information.
   */
  public fun serviceDiscovery(serviceDiscovery: CfnVirtualNode.ServiceDiscoveryProperty) {
    cdkBuilder.serviceDiscovery(serviceDiscovery)
  }

  public fun build(): CfnVirtualNode.VirtualNodeSpecProperty {
    if(_backends.isNotEmpty()) cdkBuilder.backends(_backends)
    if(_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
    return cdkBuilder.build()
  }
}
