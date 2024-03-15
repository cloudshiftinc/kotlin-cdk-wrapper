@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Configuration for running an ECS task on Fargate.
 *
 * Example:
 *
 * ```
 * IVpc vpc = Vpc.fromLookup(this, "Vpc", VpcLookupOptions.builder()
 * .isDefault(true)
 * .build());
 * Cluster cluster = Cluster.Builder.create(this, "FargateCluster").vpc(vpc).build();
 * TaskDefinition taskDefinition = TaskDefinition.Builder.create(this, "TD")
 * .memoryMiB("512")
 * .cpu("256")
 * .compatibility(Compatibility.FARGATE)
 * .build();
 * ContainerDefinition containerDefinition = taskDefinition.addContainer("TheContainer",
 * ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("foo/bar"))
 * .memoryLimitMiB(256)
 * .build());
 * EcsRunTask runTask = EcsRunTask.Builder.create(this, "RunFargate")
 * .integrationPattern(IntegrationPattern.RUN_JOB)
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .assignPublicIp(true)
 * .containerOverrides(List.of(ContainerOverride.builder()
 * .containerDefinition(containerDefinition)
 * .environment(List.of(TaskEnvironmentVariable.builder().name("SOME_KEY").value(JsonPath.stringAt("$.SomeKey")).build()))
 * .build()))
 * .launchTarget(new EcsFargateLaunchTarget())
 * .propagatedTagSource(PropagatedTagSource.TASK_DEFINITION)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/userguide/launch_types.html#launch-type-fargate)
 */
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
  public override fun bind(task: EcsRunTask, launchTargetOptions: LaunchTargetBindOptions):
      EcsLaunchTargetConfig = unwrap(this).bind(task.let(EcsRunTask::unwrap),
      launchTargetOptions.let(LaunchTargetBindOptions::unwrap)).let(EcsLaunchTargetConfig::wrap)

  /**
   * Called when the Fargate launch type configured on RunTask.
   *
   * @param _task 
   * @param launchTargetOptions 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9be8b1f0cae602d733f00715d7adf0ffaba00624095ed77fb348fca6a99c06a8")
  public override fun bind(task: EcsRunTask,
      launchTargetOptions: LaunchTargetBindOptions.Builder.() -> Unit): EcsLaunchTargetConfig =
      bind(task, LaunchTargetBindOptions(launchTargetOptions))

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
