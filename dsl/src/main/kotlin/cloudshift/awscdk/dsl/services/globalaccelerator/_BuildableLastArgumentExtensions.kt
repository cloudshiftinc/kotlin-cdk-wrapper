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

import software.amazon.awscdk.services.globalaccelerator.Accelerator
import software.amazon.awscdk.services.globalaccelerator.EndpointGroup
import software.amazon.awscdk.services.globalaccelerator.Listener
import kotlin.String
import kotlin.Unit

public inline fun Accelerator.addListener(id: String, block: ListenerOptionsDsl.() -> Unit = {}): Listener {
    val builder = ListenerOptionsDsl()
    builder.apply(block)
    return addListener(id, builder.build())
}

public inline fun Listener.addEndpointGroup(
    id: String,
    block: EndpointGroupOptionsDsl.() -> Unit =
        {},
): EndpointGroup {
    val builder = EndpointGroupOptionsDsl()
    builder.apply(block)
    return addEndpointGroup(id, builder.build())
}
