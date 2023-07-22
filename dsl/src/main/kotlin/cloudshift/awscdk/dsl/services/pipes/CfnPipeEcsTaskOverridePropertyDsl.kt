@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The overrides that are associated with a task.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * EcsTaskOverrideProperty ecsTaskOverrideProperty = EcsTaskOverrideProperty.builder()
 * .containerOverrides(List.of(EcsContainerOverrideProperty.builder()
 * .command(List.of("command"))
 * .cpu(123)
 * .environment(List.of(EcsEnvironmentVariableProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .environmentFiles(List.of(EcsEnvironmentFileProperty.builder()
 * .type("type")
 * .value("value")
 * .build()))
 * .memory(123)
 * .memoryReservation(123)
 * .name("name")
 * .resourceRequirements(List.of(EcsResourceRequirementProperty.builder()
 * .type("type")
 * .value("value")
 * .build()))
 * .build()))
 * .cpu("cpu")
 * .ephemeralStorage(EcsEphemeralStorageProperty.builder()
 * .sizeInGiB(123)
 * .build())
 * .executionRoleArn("executionRoleArn")
 * .inferenceAcceleratorOverrides(List.of(EcsInferenceAcceleratorOverrideProperty.builder()
 * .deviceName("deviceName")
 * .deviceType("deviceType")
 * .build()))
 * .memory("memory")
 * .taskRoleArn("taskRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html)
 */
@CdkDslMarker
public class CfnPipeEcsTaskOverridePropertyDsl {
  private val cdkBuilder: CfnPipe.EcsTaskOverrideProperty.Builder =
      CfnPipe.EcsTaskOverrideProperty.builder()

  private val _containerOverrides: MutableList<Any> = mutableListOf()

  private val _inferenceAcceleratorOverrides: MutableList<Any> = mutableListOf()

  /**
   * @param containerOverrides One or more container overrides that are sent to a task.
   */
  public fun containerOverrides(vararg containerOverrides: Any) {
    _containerOverrides.addAll(listOf(*containerOverrides))
  }

  /**
   * @param containerOverrides One or more container overrides that are sent to a task.
   */
  public fun containerOverrides(containerOverrides: Collection<Any>) {
    _containerOverrides.addAll(containerOverrides)
  }

  /**
   * @param containerOverrides One or more container overrides that are sent to a task.
   */
  public fun containerOverrides(containerOverrides: IResolvable) {
    cdkBuilder.containerOverrides(containerOverrides)
  }

  /**
   * @param cpu The cpu override for the task.
   */
  public fun cpu(cpu: String) {
    cdkBuilder.cpu(cpu)
  }

  /**
   * @param ephemeralStorage The ephemeral storage setting override for the task.
   *
   * This parameter is only supported for tasks hosted on Fargate that use the following platform
   * versions:
   *
   * * Linux platform version `1.4.0` or later.
   * * Windows platform version `1.0.0` or later.
   */
  public fun ephemeralStorage(ephemeralStorage: IResolvable) {
    cdkBuilder.ephemeralStorage(ephemeralStorage)
  }

  /**
   * @param ephemeralStorage The ephemeral storage setting override for the task.
   *
   * This parameter is only supported for tasks hosted on Fargate that use the following platform
   * versions:
   *
   * * Linux platform version `1.4.0` or later.
   * * Windows platform version `1.0.0` or later.
   */
  public fun ephemeralStorage(ephemeralStorage: CfnPipe.EcsEphemeralStorageProperty) {
    cdkBuilder.ephemeralStorage(ephemeralStorage)
  }

  /**
   * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution IAM role override
   * for the task.
   * For more information, see [Amazon ECS task execution IAM
   * role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html) in
   * the *Amazon Elastic Container Service Developer Guide* .
   */
  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  /**
   * @param inferenceAcceleratorOverrides The Elastic Inference accelerator override for the task.
   */
  public fun inferenceAcceleratorOverrides(vararg inferenceAcceleratorOverrides: Any) {
    _inferenceAcceleratorOverrides.addAll(listOf(*inferenceAcceleratorOverrides))
  }

  /**
   * @param inferenceAcceleratorOverrides The Elastic Inference accelerator override for the task.
   */
  public fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: Collection<Any>) {
    _inferenceAcceleratorOverrides.addAll(inferenceAcceleratorOverrides)
  }

  /**
   * @param inferenceAcceleratorOverrides The Elastic Inference accelerator override for the task.
   */
  public fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: IResolvable) {
    cdkBuilder.inferenceAcceleratorOverrides(inferenceAcceleratorOverrides)
  }

  /**
   * @param memory The memory override for the task.
   */
  public fun memory(memory: String) {
    cdkBuilder.memory(memory)
  }

  /**
   * @param taskRoleArn The Amazon Resource Name (ARN) of the IAM role that containers in this task
   * can assume.
   * All containers in this task are granted the permissions that are specified in this role. For
   * more information, see [IAM Role for
   * Tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   */
  public fun taskRoleArn(taskRoleArn: String) {
    cdkBuilder.taskRoleArn(taskRoleArn)
  }

  public fun build(): CfnPipe.EcsTaskOverrideProperty {
    if(_containerOverrides.isNotEmpty()) cdkBuilder.containerOverrides(_containerOverrides)
    if(_inferenceAcceleratorOverrides.isNotEmpty())
        cdkBuilder.inferenceAcceleratorOverrides(_inferenceAcceleratorOverrides)
    return cdkBuilder.build()
  }
}
