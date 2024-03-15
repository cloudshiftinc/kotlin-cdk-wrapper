@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.PlacementConstraint
import io.cloudshiftdev.awscdk.services.ecs.PlacementStrategy
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class EcsEc2LaunchTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget,
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
    public fun placementConstraints(placementConstraints: List<PlacementConstraint>)

    public fun placementConstraints(vararg placementConstraints: PlacementConstraint)

    public fun placementStrategies(placementStrategies: List<PlacementStrategy>)

    public fun placementStrategies(vararg placementStrategies: PlacementStrategy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget.Builder.create()

    override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    override fun placementConstraints(vararg placementConstraints: PlacementConstraint): Unit =
        placementConstraints(placementConstraints.toList())

    override fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
      cdkBuilder.placementStrategies(placementStrategies.map(PlacementStrategy::unwrap))
    }

    override fun placementStrategies(vararg placementStrategies: PlacementStrategy): Unit =
        placementStrategies(placementStrategies.toList())

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsEc2LaunchTarget {
      val builderImpl = BuilderImpl()
      return EcsEc2LaunchTarget(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget):
        EcsEc2LaunchTarget = EcsEc2LaunchTarget(cdkObject)

    internal fun unwrap(wrapped: EcsEc2LaunchTarget):
        software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget = wrapped.cdkObject
  }
}
