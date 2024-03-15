@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import kotlin.Unit
import kotlin.jvm.JvmName

public open class EcsFargateLaunchTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget,
) : CdkObject(cdkObject), IEcsLaunchTarget {
  public override fun bind(_task: EcsRunTask, launchTargetOptions: LaunchTargetBindOptions):
      EcsLaunchTargetConfig = unwrap(this).bind(_task.let(EcsRunTask::unwrap),
      launchTargetOptions.let(LaunchTargetBindOptions::unwrap)).let(EcsLaunchTargetConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9be8b1f0cae602d733f00715d7adf0ffaba00624095ed77fb348fca6a99c06a8")
  public override fun bind(_task: EcsRunTask,
      launchTargetOptions: LaunchTargetBindOptions.Builder.() -> Unit): EcsLaunchTargetConfig =
      bind(_task, LaunchTargetBindOptions(launchTargetOptions))

  @CdkDslMarker
  public interface Builder {
    public fun platformVersion(platformVersion: FargatePlatformVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget.Builder.create()

    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsFargateLaunchTarget {
      val builderImpl = BuilderImpl()
      return EcsFargateLaunchTarget(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget):
        EcsFargateLaunchTarget = EcsFargateLaunchTarget(cdkObject)

    internal fun unwrap(wrapped: EcsFargateLaunchTarget):
        software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget =
        wrapped.cdkObject
  }
}
