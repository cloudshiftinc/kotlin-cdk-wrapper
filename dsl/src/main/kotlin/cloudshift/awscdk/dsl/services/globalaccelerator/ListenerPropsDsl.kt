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
import software.amazon.awscdk.services.globalaccelerator.ListenerProps
import software.amazon.awscdk.services.globalaccelerator.PortRange

@CdkDslMarker
public class ListenerPropsDsl {
  private val cdkBuilder: ListenerProps.Builder = ListenerProps.builder()

  private val _portRanges: MutableList<PortRange> = mutableListOf()

  public fun accelerator(accelerator: IAccelerator) {
    cdkBuilder.accelerator(accelerator)
  }

  public fun clientAffinity(clientAffinity: ClientAffinity) {
    cdkBuilder.clientAffinity(clientAffinity)
  }

  public fun listenerName(listenerName: String) {
    cdkBuilder.listenerName(listenerName)
  }

  public fun portRanges(portRanges: PortRangeDsl.() -> Unit) {
    _portRanges.add(PortRangeDsl().apply(portRanges).build())
  }

  public fun portRanges(portRanges: Collection<PortRange>) {
    _portRanges.addAll(portRanges)
  }

  public fun protocol(protocol: ConnectionProtocol) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): ListenerProps {
    if(_portRanges.isNotEmpty()) cdkBuilder.portRanges(_portRanges)
    return cdkBuilder.build()
  }
}
