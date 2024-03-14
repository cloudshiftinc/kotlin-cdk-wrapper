package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9be8b1f0cae602d733f00715d7adf0ffaba00624095ed77fb348fca6a99c06a8")
  public fun bind(task: EcsRunTask,
      launchTargetOptions: LaunchTargetBindOptions.Builder.() -> Unit): EcsLaunchTargetConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget,
  ) : IEcsLaunchTarget {
    /**
     * called when the ECS launch target is configured on RunTask.
     *
     * @param task 
     * @param launchTargetOptions 
     */
    override fun bind(task: EcsRunTask, launchTargetOptions: LaunchTargetBindOptions):
        EcsLaunchTargetConfig = unwrap(this).bind(task.let(EcsRunTask::unwrap),
        launchTargetOptions.let(LaunchTargetBindOptions::unwrap)).let(EcsLaunchTargetConfig::wrap)

    /**
     * called when the ECS launch target is configured on RunTask.
     *
     * @param task 
     * @param launchTargetOptions 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9be8b1f0cae602d733f00715d7adf0ffaba00624095ed77fb348fca6a99c06a8")
    override fun bind(task: EcsRunTask,
        launchTargetOptions: LaunchTargetBindOptions.Builder.() -> Unit): EcsLaunchTargetConfig =
        bind(task, LaunchTargetBindOptions(launchTargetOptions))
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget):
        IEcsLaunchTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsLaunchTarget):
        software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget = (wrapped as
        Wrapper).cdkObject
  }
}
