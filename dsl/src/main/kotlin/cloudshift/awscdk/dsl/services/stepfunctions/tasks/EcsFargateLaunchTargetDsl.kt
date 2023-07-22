@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.FargatePlatformVersion
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget

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
@CdkDslMarker
public class EcsFargateLaunchTargetDsl {
  private val cdkBuilder: EcsFargateLaunchTarget.Builder = EcsFargateLaunchTarget.Builder.create()

  /**
   * Refers to a specific runtime environment for Fargate task infrastructure.
   *
   * Fargate platform version is a combination of the kernel and container runtime versions.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
   * @param platformVersion Refers to a specific runtime environment for Fargate task
   * infrastructure. 
   */
  public fun platformVersion(platformVersion: FargatePlatformVersion) {
    cdkBuilder.platformVersion(platformVersion)
  }

  public fun build(): EcsFargateLaunchTarget = cdkBuilder.build()
}
