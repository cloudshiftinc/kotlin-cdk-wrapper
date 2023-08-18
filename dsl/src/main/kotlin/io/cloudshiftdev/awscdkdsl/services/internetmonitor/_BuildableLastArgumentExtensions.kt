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

package io.cloudshiftdev.awscdkdsl.services.internetmonitor

import kotlin.Unit
import software.amazon.awscdk.services.internetmonitor.CfnMonitor

/**  */
public inline fun CfnMonitor.setHealthEventsConfig(
    block: CfnMonitorHealthEventsConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMonitorHealthEventsConfigPropertyDsl()
    builder.apply(block)
    return setHealthEventsConfig(builder.build())
}

/**
 * Publish internet measurements for a monitor for all city-networks (up to the 500,000 service
 * limit) to another location, such as an Amazon S3 bucket.
 */
public inline fun CfnMonitor.setInternetMeasurementsLogDelivery(
    block: CfnMonitorInternetMeasurementsLogDeliveryPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMonitorInternetMeasurementsLogDeliveryPropertyDsl()
    builder.apply(block)
    return setInternetMeasurementsLogDelivery(builder.build())
}
