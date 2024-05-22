@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecs.PlacementConstraint
import io.cloudshiftdev.awscdk.services.ecs.PlacementStrategy
import kotlin.Unit
import kotlin.collections.List

/**
 * Options to run an ECS task on EC2 in StepFunctions and ECS.
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
 */
public interface EcsEc2LaunchTargetOptions {
  /**
   * Placement constraints.
   *
   * Default: - None
   */
  public fun placementConstraints(): List<PlacementConstraint> =
      unwrap(this).getPlacementConstraints()?.map(PlacementConstraint::wrap) ?: emptyList()

  /**
   * Placement strategies.
   *
   * Default: - None
   */
  public fun placementStrategies(): List<PlacementStrategy> =
      unwrap(this).getPlacementStrategies()?.map(PlacementStrategy::wrap) ?: emptyList()

  /**
   * A builder for [EcsEc2LaunchTargetOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param placementConstraints Placement constraints.
     */
    public fun placementConstraints(placementConstraints: List<PlacementConstraint>)

    /**
     * @param placementConstraints Placement constraints.
     */
    public fun placementConstraints(vararg placementConstraints: PlacementConstraint)

    /**
     * @param placementStrategies Placement strategies.
     */
    public fun placementStrategies(placementStrategies: List<PlacementStrategy>)

    /**
     * @param placementStrategies Placement strategies.
     */
    public fun placementStrategies(vararg placementStrategies: PlacementStrategy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTargetOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTargetOptions.builder()

    /**
     * @param placementConstraints Placement constraints.
     */
    override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint.Companion::unwrap))
    }

    /**
     * @param placementConstraints Placement constraints.
     */
    override fun placementConstraints(vararg placementConstraints: PlacementConstraint): Unit =
        placementConstraints(placementConstraints.toList())

    /**
     * @param placementStrategies Placement strategies.
     */
    override fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
      cdkBuilder.placementStrategies(placementStrategies.map(PlacementStrategy.Companion::unwrap))
    }

    /**
     * @param placementStrategies Placement strategies.
     */
    override fun placementStrategies(vararg placementStrategies: PlacementStrategy): Unit =
        placementStrategies(placementStrategies.toList())

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTargetOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTargetOptions,
  ) : CdkObject(cdkObject), EcsEc2LaunchTargetOptions {
    /**
     * Placement constraints.
     *
     * Default: - None
     */
    override fun placementConstraints(): List<PlacementConstraint> =
        unwrap(this).getPlacementConstraints()?.map(PlacementConstraint::wrap) ?: emptyList()

    /**
     * Placement strategies.
     *
     * Default: - None
     */
    override fun placementStrategies(): List<PlacementStrategy> =
        unwrap(this).getPlacementStrategies()?.map(PlacementStrategy::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsEc2LaunchTargetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTargetOptions):
        EcsEc2LaunchTargetOptions = CdkObjectWrappers.wrap(cdkObject) as? EcsEc2LaunchTargetOptions
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsEc2LaunchTargetOptions):
        software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTargetOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTargetOptions
  }
}
