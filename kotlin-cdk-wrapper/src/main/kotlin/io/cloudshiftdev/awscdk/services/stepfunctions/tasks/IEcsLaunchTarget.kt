@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An Amazon ECS launch type determines the type of infrastructure on which your tasks and services
 * are hosted.
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html)
 */
public interface IEcsLaunchTarget {
  /**
   * called when the ECS launch target is configured on RunTask.
   *
   * @param task 
   * @param launchTargetOptions 
   */
  public fun bind(task: EcsRunTask, launchTargetOptions: LaunchTargetBindOptions):
      EcsLaunchTargetConfig

  /**
   * called when the ECS launch target is configured on RunTask.
   *
   * @param task 
   * @param launchTargetOptions 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9be8b1f0cae602d733f00715d7adf0ffaba00624095ed77fb348fca6a99c06a8")
  public fun bind(task: EcsRunTask,
      launchTargetOptions: LaunchTargetBindOptions.Builder.() -> Unit): EcsLaunchTargetConfig

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget):
        IEcsLaunchTarget = CdkObjectWrappers.wrap(cdkObject) as IEcsLaunchTarget

    internal fun unwrap(wrapped: IEcsLaunchTarget):
        software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget
  }
}
