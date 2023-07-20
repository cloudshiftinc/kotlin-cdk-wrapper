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

package cloudshift.awscdk.dsl.services.rum

import software.amazon.awscdk.services.rum.CfnAppMonitor
import kotlin.Unit

public inline fun CfnAppMonitor.setAppMonitorConfiguration(
    block: CfnAppMonitorAppMonitorConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnAppMonitorAppMonitorConfigurationPropertyDsl()
    builder.apply(block)
    return setAppMonitorConfiguration(builder.build())
}

public inline fun CfnAppMonitor.setCustomEvents(block: CfnAppMonitorCustomEventsPropertyDsl.() -> Unit = {}) {
    val builder = CfnAppMonitorCustomEventsPropertyDsl()
    builder.apply(block)
    return setCustomEvents(builder.build())
}
