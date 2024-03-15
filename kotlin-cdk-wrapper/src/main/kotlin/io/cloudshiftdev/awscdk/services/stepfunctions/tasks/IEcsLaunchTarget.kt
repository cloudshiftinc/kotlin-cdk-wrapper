@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IEcsLaunchTarget {
  public fun bind(arg0: EcsRunTask, arg1: LaunchTargetBindOptions): EcsLaunchTargetConfig

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9be8b1f0cae602d733f00715d7adf0ffaba00624095ed77fb348fca6a99c06a8")
  public fun bind(arg0: EcsRunTask, arg1: LaunchTargetBindOptions.Builder.() -> Unit):
      EcsLaunchTargetConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget,
  ) : CdkObject(cdkObject), IEcsLaunchTarget {
    override fun bind(arg0: EcsRunTask, arg1: LaunchTargetBindOptions): EcsLaunchTargetConfig =
        unwrap(this).bind(arg0.let(EcsRunTask::unwrap),
        arg1.let(LaunchTargetBindOptions::unwrap)).let(EcsLaunchTargetConfig::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9be8b1f0cae602d733f00715d7adf0ffaba00624095ed77fb348fca6a99c06a8")
    override fun bind(arg0: EcsRunTask, arg1: LaunchTargetBindOptions.Builder.() -> Unit):
        EcsLaunchTargetConfig = bind(arg0, LaunchTargetBindOptions(arg1))
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget):
        IEcsLaunchTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsLaunchTarget):
        software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget
  }
}
