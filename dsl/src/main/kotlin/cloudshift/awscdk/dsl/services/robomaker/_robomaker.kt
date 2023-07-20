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

import software.amazon.awscdk.services.robomaker.CfnFleet
import software.amazon.awscdk.services.robomaker.CfnFleetProps
import software.amazon.awscdk.services.robomaker.CfnRobot
import software.amazon.awscdk.services.robomaker.CfnRobotApplication
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps
import software.amazon.awscdk.services.robomaker.CfnRobotProps
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object robomaker {
    public inline fun cfnFleet(
        scope: Construct,
        id: String,
        block: CfnFleetDsl.() -> Unit = {},
    ): CfnFleet {
        val builder = CfnFleetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFleetProps(block: CfnFleetPropsDsl.() -> Unit = {}): CfnFleetProps {
        val builder = CfnFleetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRobot(
        scope: Construct,
        id: String,
        block: CfnRobotDsl.() -> Unit = {},
    ): CfnRobot {
        val builder = CfnRobotDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRobotApplication(
        scope: Construct,
        id: String,
        block: CfnRobotApplicationDsl.() -> Unit = {},
    ): CfnRobotApplication {
        val builder = CfnRobotApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRobotApplicationProps(block: CfnRobotApplicationPropsDsl.() -> Unit = {}): CfnRobotApplicationProps {
        val builder = CfnRobotApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRobotApplicationRobotSoftwareSuiteProperty(
        block: CfnRobotApplicationRobotSoftwareSuitePropertyDsl.() -> Unit =
            {},
    ): CfnRobotApplication.RobotSoftwareSuiteProperty {
        val builder = CfnRobotApplicationRobotSoftwareSuitePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRobotApplicationSourceConfigProperty(
        block: CfnRobotApplicationSourceConfigPropertyDsl.() -> Unit =
            {},
    ): CfnRobotApplication.SourceConfigProperty {
        val builder = CfnRobotApplicationSourceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRobotApplicationVersion(
        scope: Construct,
        id: String,
        block: CfnRobotApplicationVersionDsl.() -> Unit = {},
    ): CfnRobotApplicationVersion {
        val builder = CfnRobotApplicationVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRobotApplicationVersionProps(
        block: CfnRobotApplicationVersionPropsDsl.() -> Unit =
            {},
    ): CfnRobotApplicationVersionProps {
        val builder = CfnRobotApplicationVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRobotProps(block: CfnRobotPropsDsl.() -> Unit = {}): CfnRobotProps {
        val builder = CfnRobotPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSimulationApplication(
        scope: Construct,
        id: String,
        block: CfnSimulationApplicationDsl.() -> Unit = {},
    ): CfnSimulationApplication {
        val builder = CfnSimulationApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSimulationApplicationProps(
        block: CfnSimulationApplicationPropsDsl.() -> Unit =
            {},
    ): CfnSimulationApplicationProps {
        val builder = CfnSimulationApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSimulationApplicationRenderingEngineProperty(
        block: CfnSimulationApplicationRenderingEnginePropertyDsl.() -> Unit =
            {},
    ): CfnSimulationApplication.RenderingEngineProperty {
        val builder = CfnSimulationApplicationRenderingEnginePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSimulationApplicationRobotSoftwareSuiteProperty(
        block: CfnSimulationApplicationRobotSoftwareSuitePropertyDsl.() -> Unit =
            {},
    ): CfnSimulationApplication.RobotSoftwareSuiteProperty {
        val builder = CfnSimulationApplicationRobotSoftwareSuitePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSimulationApplicationSimulationSoftwareSuiteProperty(
        block: CfnSimulationApplicationSimulationSoftwareSuitePropertyDsl.() -> Unit =
            {},
    ): CfnSimulationApplication.SimulationSoftwareSuiteProperty {
        val builder = CfnSimulationApplicationSimulationSoftwareSuitePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSimulationApplicationSourceConfigProperty(
        block: CfnSimulationApplicationSourceConfigPropertyDsl.() -> Unit =
            {},
    ): CfnSimulationApplication.SourceConfigProperty {
        val builder = CfnSimulationApplicationSourceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSimulationApplicationVersion(
        scope: Construct,
        id: String,
        block: CfnSimulationApplicationVersionDsl.() -> Unit = {},
    ): CfnSimulationApplicationVersion {
        val builder = CfnSimulationApplicationVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSimulationApplicationVersionProps(
        block: CfnSimulationApplicationVersionPropsDsl.() -> Unit =
            {},
    ): CfnSimulationApplicationVersionProps {
        val builder = CfnSimulationApplicationVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
