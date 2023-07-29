@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

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

/**
 * Construct properties for Listener.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.globalaccelerator.*;
 * Accelerator accelerator;
 * ListenerProps listenerProps = ListenerProps.builder()
 * .accelerator(accelerator)
 * .portRanges(List.of(PortRange.builder()
 * .fromPort(123)
 * // the properties below are optional
 * .toPort(123)
 * .build()))
 * // the properties below are optional
 * .clientAffinity(ClientAffinity.NONE)
 * .listenerName("listenerName")
 * .protocol(ConnectionProtocol.TCP)
 * .build();
 * ```
 */
@CdkDslMarker
public class ListenerPropsDsl {
    private val cdkBuilder: ListenerProps.Builder = ListenerProps.builder()

    private val _portRanges: MutableList<PortRange> = mutableListOf()

    /** @param accelerator The accelerator for this listener. */
    public fun accelerator(accelerator: IAccelerator) {
        cdkBuilder.accelerator(accelerator)
    }

    /**
     * @param clientAffinity Client affinity to direct all requests from a user to the same
     *   endpoint. If you have stateful applications, client affinity lets you direct all requests
     *   from a user to the same endpoint.
     *
     * By default, each connection from each client is routed to seperate endpoints. Set client
     * affinity to SOURCE_IP to route all connections from a single client to the same endpoint.
     */
    public fun clientAffinity(clientAffinity: ClientAffinity) {
        cdkBuilder.clientAffinity(clientAffinity)
    }

    /** @param listenerName Name of the listener. */
    public fun listenerName(listenerName: String) {
        cdkBuilder.listenerName(listenerName)
    }

    /**
     * @param portRanges The list of port ranges for the connections from clients to the
     *   accelerator.
     */
    public fun portRanges(portRanges: PortRangeDsl.() -> Unit) {
        _portRanges.add(PortRangeDsl().apply(portRanges).build())
    }

    /**
     * @param portRanges The list of port ranges for the connections from clients to the
     *   accelerator.
     */
    public fun portRanges(portRanges: Collection<PortRange>) {
        _portRanges.addAll(portRanges)
    }

    /** @param protocol The protocol for the connections from clients to the accelerator. */
    public fun protocol(protocol: ConnectionProtocol) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): ListenerProps {
        if (_portRanges.isNotEmpty()) cdkBuilder.portRanges(_portRanges)
        return cdkBuilder.build()
    }
}
