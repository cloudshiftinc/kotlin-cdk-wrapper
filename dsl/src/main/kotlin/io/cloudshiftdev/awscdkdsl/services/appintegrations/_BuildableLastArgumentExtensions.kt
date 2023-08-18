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

package io.cloudshiftdev.awscdkdsl.services.appintegrations

import kotlin.Unit
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration
import software.amazon.awscdk.services.appintegrations.CfnEventIntegration

/** The configuration for what files should be pulled from the source. */
public inline fun CfnDataIntegration.setFileConfiguration(
    block: CfnDataIntegrationFileConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataIntegrationFileConfigurationPropertyDsl()
    builder.apply(block)
    return setFileConfiguration(builder.build())
}

/** The name of the data and how often it should be pulled from the source. */
public inline fun CfnDataIntegration.setScheduleConfig(
    block: CfnDataIntegrationScheduleConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataIntegrationScheduleConfigPropertyDsl()
    builder.apply(block)
    return setScheduleConfig(builder.build())
}

/** The event integration filter. */
public inline fun CfnEventIntegration.setEventFilter(
    block: CfnEventIntegrationEventFilterPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEventIntegrationEventFilterPropertyDsl()
    builder.apply(block)
    return setEventFilter(builder.build())
}
