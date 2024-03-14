package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class EcsFargateLaunchTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget,
) : CdkObject(cdkObject), IEcsLaunchTarget {
  /**
   * Called when the Fargate launch type configured on RunTask.
   *
   * @param _task 
   * @param launchTargetOptions 
   */
  public override fun bind(_task: EcsRunTask, launchTargetOptions: LaunchTargetBindOptions):
      EcsLaunchTargetConfig = unwrap(this).bind(_task.let(EcsRunTask::unwrap),
      launchTargetOptions.let(LaunchTargetBindOptions::unwrap)).let(EcsLaunchTargetConfig::wrap)

  /**
   * Called when the Fargate launch type configured on RunTask.
   *
   * @param _task 
   * @param launchTargetOptions 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9be8b1f0cae602d733f00715d7adf0ffaba00624095ed77fb348fca6a99c06a8")
  public override fun bind(_task: EcsRunTask,
      launchTargetOptions: LaunchTargetBindOptions.Builder.() -> Unit): EcsLaunchTargetConfig =
      bind(_task, LaunchTargetBindOptions(launchTargetOptions))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Refers to a specific runtime environment for Fargate task infrastructure.
     *
     * Fargate platform version is a combination of the kernel and container runtime versions.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * @param platformVersion Refers to a specific runtime environment for Fargate task
     * infrastructure. 
     */
    public fun platformVersion(platformVersion: FargatePlatformVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget.Builder.create()

    /**
     * Refers to a specific runtime environment for Fargate task infrastructure.
     *
     * Fargate platform version is a combination of the kernel and container runtime versions.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * @param platformVersion Refers to a specific runtime environment for Fargate task
     * infrastructure. 
     */
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
