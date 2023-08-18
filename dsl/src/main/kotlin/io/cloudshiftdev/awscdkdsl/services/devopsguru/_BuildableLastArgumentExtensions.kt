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

package io.cloudshiftdev.awscdkdsl.services.devopsguru

import kotlin.Unit
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection

/**
 * A `NotificationChannelConfig` object that contains information about configured notification
 * channels.
 */
public inline fun CfnNotificationChannel.setConfig(
    block: CfnNotificationChannelNotificationChannelConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnNotificationChannelNotificationChannelConfigPropertyDsl()
    builder.apply(block)
    return setConfig(builder.build())
}

/**
 * Information about a filter used to specify which AWS resources are analyzed for anomalous
 * behavior by DevOps Guru.
 */
public inline fun CfnResourceCollection.setResourceCollectionFilter(
    block: CfnResourceCollectionResourceCollectionFilterPropertyDsl.() -> Unit = {}
) {
    val builder = CfnResourceCollectionResourceCollectionFilterPropertyDsl()
    builder.apply(block)
    return setResourceCollectionFilter(builder.build())
}
