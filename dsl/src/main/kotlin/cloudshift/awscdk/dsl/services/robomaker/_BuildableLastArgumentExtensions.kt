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

package cloudshift.awscdk.dsl.services.robomaker

import kotlin.Unit
import software.amazon.awscdk.services.robomaker.CfnRobotApplication
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication

/** The robot software suite used by the simulation application. */
public inline fun CfnSimulationApplication.setRobotSoftwareSuite(
    block: CfnSimulationApplicationRobotSoftwareSuitePropertyDsl.() -> Unit = {}
) {
    val builder = CfnSimulationApplicationRobotSoftwareSuitePropertyDsl()
    builder.apply(block)
    return setRobotSoftwareSuite(builder.build())
}

/** The simulation software suite used by the simulation application. */
public inline fun CfnSimulationApplication.setSimulationSoftwareSuite(
    block: CfnSimulationApplicationSimulationSoftwareSuitePropertyDsl.() -> Unit = {}
) {
    val builder = CfnSimulationApplicationSimulationSoftwareSuitePropertyDsl()
    builder.apply(block)
    return setSimulationSoftwareSuite(builder.build())
}

/** The rendering engine for the simulation application. */
public inline fun CfnSimulationApplication.setRenderingEngine(
    block: CfnSimulationApplicationRenderingEnginePropertyDsl.() -> Unit = {}
) {
    val builder = CfnSimulationApplicationRenderingEnginePropertyDsl()
    builder.apply(block)
    return setRenderingEngine(builder.build())
}

/** The robot software suite used by the robot application. */
public inline fun CfnRobotApplication.setRobotSoftwareSuite(
    block: CfnRobotApplicationRobotSoftwareSuitePropertyDsl.() -> Unit = {}
) {
    val builder = CfnRobotApplicationRobotSoftwareSuitePropertyDsl()
    builder.apply(block)
    return setRobotSoftwareSuite(builder.build())
}
