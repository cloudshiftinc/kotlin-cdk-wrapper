@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * The placement constraints to use for tasks in the service. For more information, see [Amazon ECS
 * Task Placement
 * Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
 *
 * Tasks will only be placed on instances that match these rules.
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
public open class PlacementConstraint(
  cdkObject: software.amazon.awscdk.services.ecs.PlacementConstraint,
) : CdkObject(cdkObject) {
  /**
   * Return the placement JSON.
   */
  public open fun toJson(): List<CfnService.PlacementConstraintProperty> =
      unwrap(this).toJson().map(CfnService.PlacementConstraintProperty::wrap)

  public companion object {
    public fun distinctInstances(): PlacementConstraint =
        software.amazon.awscdk.services.ecs.PlacementConstraint.distinctInstances().let(PlacementConstraint::wrap)

    public fun memberOf(expressions: String): PlacementConstraint =
        software.amazon.awscdk.services.ecs.PlacementConstraint.memberOf(expressions).let(PlacementConstraint::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.PlacementConstraint):
        PlacementConstraint = PlacementConstraint(cdkObject)

    internal fun unwrap(wrapped: PlacementConstraint):
        software.amazon.awscdk.services.ecs.PlacementConstraint = wrapped.cdkObject as
        software.amazon.awscdk.services.ecs.PlacementConstraint
  }
}
