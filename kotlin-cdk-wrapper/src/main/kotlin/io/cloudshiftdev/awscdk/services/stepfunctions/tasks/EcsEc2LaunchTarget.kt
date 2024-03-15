@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.PlacementConstraint
import io.cloudshiftdev.awscdk.services.ecs.PlacementStrategy
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Configuration for running an ECS task on EC2.
 *
 * Example:
 *
 * ```
 * IVpc vpc = Vpc.fromLookup(this, "Vpc", VpcLookupOptions.builder()
 * .isDefault(true)
 * .build());
 * Cluster cluster = Cluster.Builder.create(this, "Ec2Cluster").vpc(vpc).build();
 * cluster.addCapacity("DefaultAutoScalingGroup", AddCapacityOptions.builder()
 * .instanceType(new InstanceType("t2.micro"))
 * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
 * .build());
 * TaskDefinition taskDefinition = TaskDefinition.Builder.create(this, "TD")
 * .compatibility(Compatibility.EC2)
 * .build();
 * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("foo/bar"))
 * .memoryLimitMiB(256)
 * .build());
 * EcsRunTask runTask = EcsRunTask.Builder.create(this, "Run")
 * .integrationPattern(IntegrationPattern.RUN_JOB)
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .launchTarget(EcsEc2LaunchTarget.Builder.create()
 * .placementStrategies(List.of(PlacementStrategy.spreadAcrossInstances(),
 * PlacementStrategy.packedByCpu(), PlacementStrategy.randomly()))
 * .placementConstraints(List.of(PlacementConstraint.memberOf("blieptuut")))
 * .build())
 * .propagatedTagSource(PropagatedTagSource.TASK_DEFINITION)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/userguide/launch_types.html#launch-type-ec2)
 */
public open class EcsEc2LaunchTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget,
) : CdkObject(cdkObject), IEcsLaunchTarget {
  /**
   * Called when the EC2 launch type is configured on RunTask.
   *
   * @param _task 
   * @param launchTargetOptions 
   */
  public override fun bind(_task: EcsRunTask, launchTargetOptions: LaunchTargetBindOptions):
      EcsLaunchTargetConfig = unwrap(this).bind(_task.let(EcsRunTask::unwrap),
      launchTargetOptions.let(LaunchTargetBindOptions::unwrap)).let(EcsLaunchTargetConfig::wrap)

  /**
   * Called when the EC2 launch type is configured on RunTask.
   *
   * @param _task 
   * @param launchTargetOptions 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9be8b1f0cae602d733f00715d7adf0ffaba00624095ed77fb348fca6a99c06a8")
  public override fun bind(_task: EcsRunTask,
      launchTargetOptions: LaunchTargetBindOptions.Builder.() -> Unit): EcsLaunchTargetConfig =
      bind(_task, LaunchTargetBindOptions(launchTargetOptions))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Placement constraints.
     *
     * Default: - None
     *
     * @param placementConstraints Placement constraints. 
     */
    public fun placementConstraints(placementConstraints: List<PlacementConstraint>)

    /**
     * Placement constraints.
     *
     * Default: - None
     *
     * @param placementConstraints Placement constraints. 
     */
    public fun placementConstraints(vararg placementConstraints: PlacementConstraint)

    /**
     * Placement strategies.
     *
     * Default: - None
     *
     * @param placementStrategies Placement strategies. 
     */
    public fun placementStrategies(placementStrategies: List<PlacementStrategy>)

    /**
     * Placement strategies.
     *
     * Default: - None
     *
     * @param placementStrategies Placement strategies. 
     */
    public fun placementStrategies(vararg placementStrategies: PlacementStrategy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget.Builder.create()

    /**
     * Placement constraints.
     *
     * Default: - None
     *
     * @param placementConstraints Placement constraints. 
     */
    override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    /**
     * Placement constraints.
     *
     * Default: - None
     *
     * @param placementConstraints Placement constraints. 
     */
    override fun placementConstraints(vararg placementConstraints: PlacementConstraint): Unit =
        placementConstraints(placementConstraints.toList())

    /**
     * Placement strategies.
     *
     * Default: - None
     *
     * @param placementStrategies Placement strategies. 
     */
    override fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
      cdkBuilder.placementStrategies(placementStrategies.map(PlacementStrategy::unwrap))
    }

    /**
     * Placement strategies.
     *
     * Default: - None
     *
     * @param placementStrategies Placement strategies. 
     */
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
