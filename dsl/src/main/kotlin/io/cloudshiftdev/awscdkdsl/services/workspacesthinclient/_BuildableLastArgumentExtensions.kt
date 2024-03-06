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

package io.cloudshiftdev.awscdkdsl.services.workspacesthinclient

import kotlin.Unit
import software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment

/** A specification for a time window to apply software updates. */
public inline fun CfnEnvironment.setMaintenanceWindow(
    block: CfnEnvironmentMaintenanceWindowPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEnvironmentMaintenanceWindowPropertyDsl()
    builder.apply(block)
    return setMaintenanceWindow(builder.build())
}
