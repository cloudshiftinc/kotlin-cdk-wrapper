@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.globalaccelerator.ClientAffinity
import software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol
import software.amazon.awscdk.services.globalaccelerator.IAccelerator
import software.amazon.awscdk.services.globalaccelerator.Listener
import software.amazon.awscdk.services.globalaccelerator.PortRange
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ListenerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Listener.Builder = Listener.Builder.create(scope, id)

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

    public fun build(): Listener {
        if (_portRanges.isNotEmpty()) cdkBuilder.portRanges(_portRanges)
        return cdkBuilder.build()
    }
}
