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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget
import software.amazon.awscdk.services.stepfunctions.tasks.EcsLaunchTargetConfig
import software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask
import software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget
import software.amazon.awscdk.services.stepfunctions.tasks.ISageMakerTask
import software.amazon.awscdk.services.stepfunctions.tasks.S3Location
import software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig
import kotlin.Unit

public inline fun IEcsLaunchTarget.bind(
    arg0: EcsRunTask,
    block: LaunchTargetBindOptionsDsl.() -> Unit = {},
): EcsLaunchTargetConfig {
    val builder = LaunchTargetBindOptionsDsl()
    builder.apply(block)
    return bind(arg0, builder.build())
}

public inline fun EcsFargateLaunchTarget.bind(
    _task: EcsRunTask,
    block: LaunchTargetBindOptionsDsl.() -> Unit = {},
): EcsLaunchTargetConfig {
    val builder = LaunchTargetBindOptionsDsl()
    builder.apply(block)
    return bind(_task, builder.build())
}

public inline fun EcsEc2LaunchTarget.bind(
    _task: EcsRunTask,
    block: LaunchTargetBindOptionsDsl.() -> Unit = {},
): EcsLaunchTargetConfig {
    val builder = LaunchTargetBindOptionsDsl()
    builder.apply(block)
    return bind(_task, builder.build())
}

public inline fun S3Location.bind(
    arg0: ISageMakerTask,
    block: S3LocationBindOptionsDsl.() -> Unit =
        {},
): S3LocationConfig {
    val builder = S3LocationBindOptionsDsl()
    builder.apply(block)
    return bind(arg0, builder.build())
}
