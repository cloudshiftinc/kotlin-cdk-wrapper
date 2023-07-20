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

package cloudshift.awscdk.dsl.services.simspaceweaver

import software.amazon.awscdk.services.simspaceweaver.CfnSimulation
import kotlin.Unit

public inline fun CfnSimulation.setSchemaS3Location(
    block: CfnSimulationS3LocationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnSimulationS3LocationPropertyDsl()
    builder.apply(block)
    return setSchemaS3Location(builder.build())
}

public inline fun CfnSimulation.setSnapshotS3Location(
    block: CfnSimulationS3LocationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnSimulationS3LocationPropertyDsl()
    builder.apply(block)
    return setSnapshotS3Location(builder.build())
}
