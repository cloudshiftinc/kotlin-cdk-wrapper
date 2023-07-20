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

package cloudshift.awscdk.dsl.services.kendraranking

import software.amazon.awscdk.services.kendraranking.CfnExecutionPlan
import kotlin.Unit

public inline fun CfnExecutionPlan.setCapacityUnits(
    block: CfnExecutionPlanCapacityUnitsConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnExecutionPlanCapacityUnitsConfigurationPropertyDsl()
    builder.apply(block)
    return setCapacityUnits(builder.build())
}
