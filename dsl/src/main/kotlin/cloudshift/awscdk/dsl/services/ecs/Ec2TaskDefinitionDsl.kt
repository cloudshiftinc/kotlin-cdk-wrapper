@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.Ec2TaskDefinition
import software.amazon.awscdk.services.ecs.InferenceAccelerator
import software.amazon.awscdk.services.ecs.IpcMode
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.ecs.PidMode
import software.amazon.awscdk.services.ecs.PlacementConstraint
import software.amazon.awscdk.services.ecs.ProxyConfiguration
import software.amazon.awscdk.services.ecs.Volume
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * The details of a task definition run on an EC2 cluster.
 *
 * Example:
 *
 * ```
 * Secret secret;
 * // Create a Task Definition for the container to start
 * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
 * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("example-image"))
 * .memoryLimitMiB(256)
 * .logging(LogDrivers.splunk(SplunkLogDriverProps.builder()
 * .secretToken(secret)
 * .url("my-splunk-url")
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class Ec2TaskDefinitionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Ec2TaskDefinition.Builder = Ec2TaskDefinition.Builder.create(scope, id)

  private val _inferenceAccelerators: MutableList<InferenceAccelerator> = mutableListOf()

  private val _placementConstraints: MutableList<PlacementConstraint> = mutableListOf()

  private val _volumes: MutableList<Volume> = mutableListOf()

  /**
   * The name of the IAM task execution role that grants the ECS agent permission to call AWS APIs
   * on your behalf.
   *
   * The role will be used to retrieve container images from ECR and create CloudWatch log groups.
   *
   * Default: - An execution role will be automatically created if you use ECR images in your task
   * definition.
   *
   * @param executionRole The name of the IAM task execution role that grants the ECS agent
   * permission to call AWS APIs on your behalf. 
   */
  public fun executionRole(executionRole: IRole) {
    cdkBuilder.executionRole(executionRole)
  }

  /**
   * The name of a family that this task definition is registered to.
   *
   * A family groups multiple versions of a task definition.
   *
   * Default: - Automatically generated name.
   *
   * @param family The name of a family that this task definition is registered to. 
   */
  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  /**
   * The inference accelerators to use for the containers in the task.
   *
   * Not supported in Fargate.
   *
   * Default: - No inference accelerators.
   *
   * @param inferenceAccelerators The inference accelerators to use for the containers in the task. 
   */
  public fun inferenceAccelerators(inferenceAccelerators: InferenceAcceleratorDsl.() -> Unit) {
    _inferenceAccelerators.add(InferenceAcceleratorDsl().apply(inferenceAccelerators).build())
  }

  /**
   * The inference accelerators to use for the containers in the task.
   *
   * Not supported in Fargate.
   *
   * Default: - No inference accelerators.
   *
   * @param inferenceAccelerators The inference accelerators to use for the containers in the task. 
   */
  public fun inferenceAccelerators(inferenceAccelerators: Collection<InferenceAccelerator>) {
    _inferenceAccelerators.addAll(inferenceAccelerators)
  }

  /**
   * The IPC resource namespace to use for the containers in the task.
   *
   * Not supported in Fargate and Windows containers.
   *
   * Default: - IpcMode used by the task is not specified
   *
   * @param ipcMode The IPC resource namespace to use for the containers in the task. 
   */
  public fun ipcMode(ipcMode: IpcMode) {
    cdkBuilder.ipcMode(ipcMode)
  }

  /**
   * The Docker networking mode to use for the containers in the task.
   *
   * The valid values are NONE, BRIDGE, AWS_VPC, and HOST.
   *
   * Default: - NetworkMode.BRIDGE for EC2 tasks, AWS_VPC for Fargate tasks.
   *
   * @param networkMode The Docker networking mode to use for the containers in the task. 
   */
  public fun networkMode(networkMode: NetworkMode) {
    cdkBuilder.networkMode(networkMode)
  }

  /**
   * The process namespace to use for the containers in the task.
   *
   * Not supported in Fargate and Windows containers.
   *
   * Default: - PidMode used by the task is not specified
   *
   * @param pidMode The process namespace to use for the containers in the task. 
   */
  public fun pidMode(pidMode: PidMode) {
    cdkBuilder.pidMode(pidMode)
  }

  /**
   * An array of placement constraint objects to use for the task.
   *
   * You can
   * specify a maximum of 10 constraints per task (this limit includes
   * constraints in the task definition and those specified at run time).
   *
   * Default: - No placement constraints.
   *
   * @param placementConstraints An array of placement constraint objects to use for the task. 
   */
  public fun placementConstraints(vararg placementConstraints: PlacementConstraint) {
    _placementConstraints.addAll(listOf(*placementConstraints))
  }

  /**
   * An array of placement constraint objects to use for the task.
   *
   * You can
   * specify a maximum of 10 constraints per task (this limit includes
   * constraints in the task definition and those specified at run time).
   *
   * Default: - No placement constraints.
   *
   * @param placementConstraints An array of placement constraint objects to use for the task. 
   */
  public fun placementConstraints(placementConstraints: Collection<PlacementConstraint>) {
    _placementConstraints.addAll(placementConstraints)
  }

  /**
   * The configuration details for the App Mesh proxy.
   *
   * Default: - No proxy configuration.
   *
   * @param proxyConfiguration The configuration details for the App Mesh proxy. 
   */
  public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
    cdkBuilder.proxyConfiguration(proxyConfiguration)
  }

  /**
   * The name of the IAM role that grants containers in the task permission to call AWS APIs on your
   * behalf.
   *
   * Default: - A task role is automatically created for you.
   *
   * @param taskRole The name of the IAM role that grants containers in the task permission to call
   * AWS APIs on your behalf. 
   */
  public fun taskRole(taskRole: IRole) {
    cdkBuilder.taskRole(taskRole)
  }

  /**
   * The list of volume definitions for the task.
   *
   * For more information, see
   * [Task Definition Parameter
   * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
   *
   * Default: - No volumes are passed to the Docker daemon on a container instance.
   *
   * @param volumes The list of volume definitions for the task. 
   */
  public fun volumes(volumes: VolumeDsl.() -> Unit) {
    _volumes.add(VolumeDsl().apply(volumes).build())
  }

  /**
   * The list of volume definitions for the task.
   *
   * For more information, see
   * [Task Definition Parameter
   * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
   *
   * Default: - No volumes are passed to the Docker daemon on a container instance.
   *
   * @param volumes The list of volume definitions for the task. 
   */
  public fun volumes(volumes: Collection<Volume>) {
    _volumes.addAll(volumes)
  }

  public fun build(): Ec2TaskDefinition {
    if(_inferenceAccelerators.isNotEmpty()) cdkBuilder.inferenceAccelerators(_inferenceAccelerators)
    if(_placementConstraints.isNotEmpty()) cdkBuilder.placementConstraints(_placementConstraints)
    if(_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
    return cdkBuilder.build()
  }
}
