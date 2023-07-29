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

package cloudshift.awscdk.dsl.services.rum

import kotlin.Unit
import software.amazon.awscdk.services.rum.CfnAppMonitor

/** A structure that contains much of the configuration data for the app monitor. */
public inline fun CfnAppMonitor.setAppMonitorConfiguration(
    block: CfnAppMonitorAppMonitorConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAppMonitorAppMonitorConfigurationPropertyDsl()
    builder.apply(block)
    return setAppMonitorConfiguration(builder.build())
}

/** Specifies whether this app monitor allows the web client to define and send custom events. */
public inline fun CfnAppMonitor.setCustomEvents(
    block: CfnAppMonitorCustomEventsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAppMonitorCustomEventsPropertyDsl()
    builder.apply(block)
    return setCustomEvents(builder.build())
}
