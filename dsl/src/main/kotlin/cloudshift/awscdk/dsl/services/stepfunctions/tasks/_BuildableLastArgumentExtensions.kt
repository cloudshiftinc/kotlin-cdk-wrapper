@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget
import software.amazon.awscdk.services.stepfunctions.tasks.EcsLaunchTargetConfig
import software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask
import software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget
import software.amazon.awscdk.services.stepfunctions.tasks.ISageMakerTask
import software.amazon.awscdk.services.stepfunctions.tasks.S3Location
import software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig

public inline fun IEcsLaunchTarget.bind(arg0: EcsRunTask,
    block: LaunchTargetBindOptionsDsl.() -> Unit = {}): EcsLaunchTargetConfig {
  val builder = LaunchTargetBindOptionsDsl()
  builder.apply(block)
  return bind(arg0, builder.build())
}

/**
 * Called when the Fargate launch type configured on RunTask.
 *
 * @param _task 
 * @param launchTargetOptions 
 */
public inline fun EcsFargateLaunchTarget.bind(_task: EcsRunTask,
    block: LaunchTargetBindOptionsDsl.() -> Unit = {}): EcsLaunchTargetConfig {
  val builder = LaunchTargetBindOptionsDsl()
  builder.apply(block)
  return bind(_task, builder.build())
}

/**
 * Called when the EC2 launch type is configured on RunTask.
 *
 * @param _task 
 * @param launchTargetOptions 
 */
public inline fun EcsEc2LaunchTarget.bind(_task: EcsRunTask,
    block: LaunchTargetBindOptionsDsl.() -> Unit = {}): EcsLaunchTargetConfig {
  val builder = LaunchTargetBindOptionsDsl()
  builder.apply(block)
  return bind(_task, builder.build())
}

/**
 * Called when the S3Location is bound to a StepFunctions task.
 *
 * @param task 
 * @param opts 
 */
public inline fun S3Location.bind(arg0: ISageMakerTask, block: S3LocationBindOptionsDsl.() -> Unit =
    {}): S3LocationConfig {
  val builder = S3LocationBindOptionsDsl()
  builder.apply(block)
  return bind(arg0, builder.build())
}
