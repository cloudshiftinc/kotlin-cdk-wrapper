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

package io.cloudshiftdev.awscdkdsl.services.globalaccelerator

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.Accelerator
import software.amazon.awscdk.services.globalaccelerator.EndpointGroup
import software.amazon.awscdk.services.globalaccelerator.Listener

/**
 * Add a listener to the accelerator.
 *
 * @param id
 * @param options
 */
public inline fun Accelerator.addListener(
    id: String,
    block: ListenerOptionsDsl.() -> Unit = {}
): Listener {
    val builder = ListenerOptionsDsl()
    builder.apply(block)
    return addListener(id, builder.build())
}

/**
 * Add a new endpoint group to this listener.
 *
 * @param id
 * @param options
 */
public inline fun Listener.addEndpointGroup(
    id: String,
    block: EndpointGroupOptionsDsl.() -> Unit = {}
): EndpointGroup {
    val builder = EndpointGroupOptionsDsl()
    builder.apply(block)
    return addEndpointGroup(id, builder.build())
}
