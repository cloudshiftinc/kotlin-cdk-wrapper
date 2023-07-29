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

package cloudshift.awscdk.dsl.services.simspaceweaver

import kotlin.Unit
import software.amazon.awscdk.services.simspaceweaver.CfnSimulation

/** The location of the simulation schema in Amazon Simple Storage Service ( Amazon S3 ). */
public inline fun CfnSimulation.setSchemaS3Location(
    block: CfnSimulationS3LocationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSimulationS3LocationPropertyDsl()
    builder.apply(block)
    return setSchemaS3Location(builder.build())
}

/** The location of the snapshot in Amazon Simple Storage Service ( Amazon S3 ). */
public inline fun CfnSimulation.setSnapshotS3Location(
    block: CfnSimulationS3LocationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSimulationS3LocationPropertyDsl()
    builder.apply(block)
    return setSnapshotS3Location(builder.build())
}
