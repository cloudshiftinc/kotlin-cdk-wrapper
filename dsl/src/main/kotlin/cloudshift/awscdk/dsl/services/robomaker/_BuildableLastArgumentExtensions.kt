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

package cloudshift.awscdk.dsl.services.robomaker

import software.amazon.awscdk.services.robomaker.CfnRobotApplication
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication
import kotlin.Unit

public inline fun CfnSimulationApplication.setRobotSoftwareSuite(
    block: CfnSimulationApplicationRobotSoftwareSuitePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnSimulationApplicationRobotSoftwareSuitePropertyDsl()
    builder.apply(block)
    return setRobotSoftwareSuite(builder.build())
}

public inline fun CfnSimulationApplication.setSimulationSoftwareSuite(
    block: CfnSimulationApplicationSimulationSoftwareSuitePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnSimulationApplicationSimulationSoftwareSuitePropertyDsl()
    builder.apply(block)
    return setSimulationSoftwareSuite(builder.build())
}

public inline fun CfnSimulationApplication.setRenderingEngine(
    block: CfnSimulationApplicationRenderingEnginePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnSimulationApplicationRenderingEnginePropertyDsl()
    builder.apply(block)
    return setRenderingEngine(builder.build())
}

public inline fun CfnRobotApplication.setRobotSoftwareSuite(
    block: CfnRobotApplicationRobotSoftwareSuitePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnRobotApplicationRobotSoftwareSuitePropertyDsl()
    builder.apply(block)
    return setRobotSoftwareSuite(builder.build())
}
