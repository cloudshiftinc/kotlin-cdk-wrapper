@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps
import software.amazon.awscdk.services.ecs.ProxyConfiguration
import software.amazon.awscdk.services.ecs.RuntimePlatform
import software.amazon.awscdk.services.ecs.Volume
import software.amazon.awscdk.services.iam.IRole

/**
 * The properties for a task definition.
 *
 * Example:
 *
 * ```
 * // Create a Task Definition for the Windows container to start
 * FargateTaskDefinition taskDefinition = FargateTaskDefinition.Builder.create(this, "TaskDef")
 * .runtimePlatform(RuntimePlatform.builder()
 * .operatingSystemFamily(OperatingSystemFamily.WINDOWS_SERVER_2019_CORE)
 * .cpuArchitecture(CpuArchitecture.X86_64)
 * .build())
 * .cpu(1024)
 * .memoryLimitMiB(2048)
 * .build();
 * taskDefinition.addContainer("windowsservercore", ContainerDefinitionOptions.builder()
 * .logging(LogDriver.awsLogs(AwsLogDriverProps.builder().streamPrefix("win-iis-on-fargate").build()))
 * .portMappings(List.of(PortMapping.builder().containerPort(80).build()))
 * .image(ContainerImage.fromRegistry("mcr.microsoft.com/windows/servercore/iis:windowsservercore-ltsc2019"))
 * .build());
 * ```
 */
@CdkDslMarker
public class FargateTaskDefinitionPropsDsl {
  private val cdkBuilder: FargateTaskDefinitionProps.Builder = FargateTaskDefinitionProps.builder()

  private val _volumes: MutableList<Volume> = mutableListOf()

  /**
   * @param cpu The number of cpu units used by the task.
   * For tasks using the Fargate launch type,
   * this field is required and you must use one of the following values,
   * which determines your range of valid values for the memory parameter:
   *
   * 256 (.25 vCPU) - Available memory values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
   *
   * 512 (.5 vCPU) - Available memory values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
   *
   * 1024 (1 vCPU) - Available memory values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB),
   * 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
   *
   * 2048 (2 vCPU) - Available memory values: Between 4096 (4 GB) and 16384 (16 GB) in increments of
   * 1024 (1 GB)
   *
   * 4096 (4 vCPU) - Available memory values: Between 8192 (8 GB) and 30720 (30 GB) in increments of
   * 1024 (1 GB)
   *
   * 8192 (8 vCPU) - Available memory values: Between 16384 (16 GB) and 61440 (60 GB) in increments
   * of 4096 (4 GB)
   *
   * 16384 (16 vCPU) - Available memory values: Between 32768 (32 GB) and 122880 (120 GB) in
   * increments of 8192 (8 GB)
   */
  public fun cpu(cpu: Number) {
    cdkBuilder.cpu(cpu)
  }

  /**
   * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to the
   * task.
   * The maximum supported value is 200 GiB.
   *
   * NOTE: This parameter is only supported for tasks hosted on AWS Fargate using platform version
   * 1.4.0 or later.
   */
  public fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
    cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
  }

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
   * @param memoryLimitMiB The amount (in MiB) of memory used by the task.
   * For tasks using the Fargate launch type,
   * this field is required and you must use one of the following values, which determines your
   * range of valid values for the cpu parameter:
   *
   * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available cpu values: 256 (.25 vCPU)
   *
   * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available cpu values: 512 (.5 vCPU)
   *
   * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) -
   * Available cpu values: 1024 (1 vCPU)
   *
   * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu values: 2048
   * (2 vCPU)
   *
   * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu values: 4096
   * (4 vCPU)
   *
   * Between 16384 (16 GB) and 61440 (60 GB) in increments of 4096 (4 GB) - Available cpu values:
   * 8192 (8 vCPU)
   *
   * Between 32768 (32 GB) and 122880 (120 GB) in increments of 8192 (8 GB) - Available cpu values:
   * 16384 (16 vCPU)
   */
  public fun memoryLimitMiB(memoryLimitMiB: Number) {
    cdkBuilder.memoryLimitMiB(memoryLimitMiB)
  }

  /**
   * @param proxyConfiguration The configuration details for the App Mesh proxy.
   */
  public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
    cdkBuilder.proxyConfiguration(proxyConfiguration)
  }

  /**
   * @param runtimePlatform The operating system that your task definitions are running on.
   * A runtimePlatform is supported only for tasks using the Fargate launch type.
   */
  public fun runtimePlatform(runtimePlatform: RuntimePlatformDsl.() -> Unit = {}) {
    val builder = RuntimePlatformDsl()
    builder.apply(runtimePlatform)
    cdkBuilder.runtimePlatform(builder.build())
  }

  /**
   * @param runtimePlatform The operating system that your task definitions are running on.
   * A runtimePlatform is supported only for tasks using the Fargate launch type.
   */
  public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
    cdkBuilder.runtimePlatform(runtimePlatform)
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

  public fun build(): FargateTaskDefinitionProps {
    if(_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
    return cdkBuilder.build()
  }
}
