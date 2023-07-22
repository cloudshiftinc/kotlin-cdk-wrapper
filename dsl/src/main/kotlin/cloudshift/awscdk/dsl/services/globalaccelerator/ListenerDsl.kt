@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.globalaccelerator.ClientAffinity
import software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol
import software.amazon.awscdk.services.globalaccelerator.IAccelerator
import software.amazon.awscdk.services.globalaccelerator.Listener
import software.amazon.awscdk.services.globalaccelerator.PortRange
import software.constructs.Construct

@CdkDslMarker
public class ListenerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Listener.Builder = Listener.Builder.create(scope, id)

  private val _portRanges: MutableList<PortRange> = mutableListOf()

  /**
   * The accelerator for this listener.
   *
   * @param accelerator The accelerator for this listener. 
   */
  public fun accelerator(accelerator: IAccelerator) {
    cdkBuilder.accelerator(accelerator)
  }

  /**
   * Client affinity to direct all requests from a user to the same endpoint.
   *
   * If you have stateful applications, client affinity lets you direct all
   * requests from a user to the same endpoint.
   *
   * By default, each connection from each client is routed to seperate
   * endpoints. Set client affinity to SOURCE_IP to route all connections from
   * a single client to the same endpoint.
   *
   * Default: ClientAffinity.NONE
   *
   * @param clientAffinity Client affinity to direct all requests from a user to the same endpoint. 
   */
  public fun clientAffinity(clientAffinity: ClientAffinity) {
    cdkBuilder.clientAffinity(clientAffinity)
  }

  /**
   * Name of the listener.
   *
   * Default: - logical ID of the resource
   *
   * @param listenerName Name of the listener. 
   */
  public fun listenerName(listenerName: String) {
    cdkBuilder.listenerName(listenerName)
  }

  /**
   * The list of port ranges for the connections from clients to the accelerator.
   *
   * @param portRanges The list of port ranges for the connections from clients to the accelerator. 
   */
  public fun portRanges(portRanges: PortRangeDsl.() -> Unit) {
    _portRanges.add(PortRangeDsl().apply(portRanges).build())
  }

  /**
   * The list of port ranges for the connections from clients to the accelerator.
   *
   * @param portRanges The list of port ranges for the connections from clients to the accelerator. 
   */
  public fun portRanges(portRanges: Collection<PortRange>) {
    _portRanges.addAll(portRanges)
  }

  /**
   * The protocol for the connections from clients to the accelerator.
   *
   * Default: ConnectionProtocol.TCP
   *
   * @param protocol The protocol for the connections from clients to the accelerator. 
   */
  public fun protocol(protocol: ConnectionProtocol) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): Listener {
    if(_portRanges.isNotEmpty()) cdkBuilder.portRanges(_portRanges)
    return cdkBuilder.build()
  }
}
