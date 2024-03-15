@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * The placement strategies to use for tasks in the service. For more information, see [Amazon ECS
 * Task Placement
 * Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
 *
 * Tasks will preferentially be placed on instances that match these rules.
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
public open class PlacementStrategy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.PlacementStrategy,
) : CdkObject(cdkObject) {
  /**
   * Return the placement JSON.
   */
  public open fun toJson(): List<CfnService.PlacementStrategyProperty> =
      unwrap(this).toJson().map(CfnService.PlacementStrategyProperty::wrap)

  public companion object {
    public fun packedBy(resource: BinPackResource): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.packedBy(resource.let(BinPackResource::unwrap)).let(PlacementStrategy::wrap)

    public fun packedByCpu(): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.packedByCpu().let(PlacementStrategy::wrap)

    public fun packedByMemory(): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.packedByMemory().let(PlacementStrategy::wrap)

    public fun randomly(): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.randomly().let(PlacementStrategy::wrap)

    public fun spreadAcross(fields: String): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.spreadAcross(fields).let(PlacementStrategy::wrap)

    public fun spreadAcrossInstances(): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.spreadAcrossInstances().let(PlacementStrategy::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.PlacementStrategy):
        PlacementStrategy = PlacementStrategy(cdkObject)

    internal fun unwrap(wrapped: PlacementStrategy):
        software.amazon.awscdk.services.ecs.PlacementStrategy = wrapped.cdkObject
  }
}
