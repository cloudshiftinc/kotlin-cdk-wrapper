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

package io.cloudshiftdev.awscdkdsl.services.kendraranking

import kotlin.Unit
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlan

/** You can set additional capacity units to meet the needs of your rescore execution plan. */
public inline fun CfnExecutionPlan.setCapacityUnits(
    block: CfnExecutionPlanCapacityUnitsConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnExecutionPlanCapacityUnitsConfigurationPropertyDsl()
    builder.apply(block)
    return setCapacityUnits(builder.build())
}
