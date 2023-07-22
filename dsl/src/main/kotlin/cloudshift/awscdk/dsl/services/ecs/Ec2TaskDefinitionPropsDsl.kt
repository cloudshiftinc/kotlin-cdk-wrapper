@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps
import software.amazon.awscdk.services.ecs.InferenceAccelerator
import software.amazon.awscdk.services.ecs.IpcMode
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.ecs.PidMode
import software.amazon.awscdk.services.ecs.PlacementConstraint
import software.amazon.awscdk.services.ecs.ProxyConfiguration
import software.amazon.awscdk.services.ecs.Volume
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class Ec2TaskDefinitionPropsDsl {
  private val cdkBuilder: Ec2TaskDefinitionProps.Builder = Ec2TaskDefinitionProps.builder()

  private val _inferenceAccelerators: MutableList<InferenceAccelerator> = mutableListOf()

  private val _placementConstraints: MutableList<PlacementConstraint> = mutableListOf()

  private val _volumes: MutableList<Volume> = mutableListOf()

  /**
   * @param executionRole The name of the IAM task execution role that grants the ECS agent
   * permission to call AWS APIs on your behalf.
   * The role will be used to retrieve container images from ECR and create CloudWatch log groups.
   */
  public fun executionRole(executionRole: IRole) {
    cdkBuilder.executionRole(executionRole)
  }

  /**
   * @param family The name of a family that this task definition is registered to.
   * A family groups multiple versions of a task definition.
   */
  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  /**
   * @param inferenceAccelerators The inference accelerators to use for the containers in the task.
   * Not supported in Fargate.
   */
  public fun inferenceAccelerators(inferenceAccelerators: InferenceAcceleratorDsl.() -> Unit) {
    _inferenceAccelerators.add(InferenceAcceleratorDsl().apply(inferenceAccelerators).build())
  }

  /**
   * @param inferenceAccelerators The inference accelerators to use for the containers in the task.
   * Not supported in Fargate.
   */
  public fun inferenceAccelerators(inferenceAccelerators: Collection<InferenceAccelerator>) {
    _inferenceAccelerators.addAll(inferenceAccelerators)
  }

  /**
   * @param ipcMode The IPC resource namespace to use for the containers in the task.
   * Not supported in Fargate and Windows containers.
   */
  public fun ipcMode(ipcMode: IpcMode) {
    cdkBuilder.ipcMode(ipcMode)
  }

  /**
   * @param networkMode The Docker networking mode to use for the containers in the task.
   * The valid values are NONE, BRIDGE, AWS_VPC, and HOST.
   */
  public fun networkMode(networkMode: NetworkMode) {
    cdkBuilder.networkMode(networkMode)
  }

  /**
   * @param pidMode The process namespace to use for the containers in the task.
   * Not supported in Fargate and Windows containers.
   */
  public fun pidMode(pidMode: PidMode) {
    cdkBuilder.pidMode(pidMode)
  }

  /**
   * @param placementConstraints An array of placement constraint objects to use for the task.
   * You can
   * specify a maximum of 10 constraints per task (this limit includes
   * constraints in the task definition and those specified at run time).
   */
  public fun placementConstraints(vararg placementConstraints: PlacementConstraint) {
    _placementConstraints.addAll(listOf(*placementConstraints))
  }

  /**
   * @param placementConstraints An array of placement constraint objects to use for the task.
   * You can
   * specify a maximum of 10 constraints per task (this limit includes
   * constraints in the task definition and those specified at run time).
   */
  public fun placementConstraints(placementConstraints: Collection<PlacementConstraint>) {
    _placementConstraints.addAll(placementConstraints)
  }

  /**
   * @param proxyConfiguration The configuration details for the App Mesh proxy.
   */
  public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
    cdkBuilder.proxyConfiguration(proxyConfiguration)
  }

  /**
   * @param taskRole The name of the IAM role that grants containers in the task permission to call
   * AWS APIs on your behalf.
   */
  public fun taskRole(taskRole: IRole) {
    cdkBuilder.taskRole(taskRole)
  }

  /**
   * @param volumes The list of volume definitions for the task.
   * For more information, see
   * [Task Definition Parameter
   * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
   */
  public fun volumes(volumes: VolumeDsl.() -> Unit) {
    _volumes.add(VolumeDsl().apply(volumes).build())
  }

  /**
   * @param volumes The list of volume definitions for the task.
   * For more information, see
   * [Task Definition Parameter
   * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
   */
  public fun volumes(volumes: Collection<Volume>) {
    _volumes.addAll(volumes)
  }

  public fun build(): Ec2TaskDefinitionProps {
    if(_inferenceAccelerators.isNotEmpty()) cdkBuilder.inferenceAccelerators(_inferenceAccelerators)
    if(_placementConstraints.isNotEmpty()) cdkBuilder.placementConstraints(_placementConstraints)
    if(_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
    return cdkBuilder.build()
  }
}
