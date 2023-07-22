@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.ecs.RuntimePlatformDsl
import cloudshift.awscdk.dsl.services.events.targets.TagDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.applicationautoscaling.Schedule
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ecs.FargatePlatformVersion
import software.amazon.awscdk.services.ecs.FargateTaskDefinition
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.RuntimePlatform
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskImageOptions
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps
import software.amazon.awscdk.services.events.targets.Tag

/**
 * The properties for the ScheduledFargateTask task.
 *
 * Example:
 *
 * ```
 * Vpc vpc = Vpc.Builder.create(this, "Vpc").maxAzs(1).build();
 * Cluster cluster = Cluster.Builder.create(this, "EcsCluster").vpc(vpc).build();
 * ScheduledFargateTask scheduledFargateTask = ScheduledFargateTask.Builder.create(this,
 * "ScheduledFargateTask")
 * .cluster(cluster)
 * .scheduledFargateTaskImageOptions(ScheduledFargateTaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .memoryLimitMiB(512)
 * .build())
 * .schedule(Schedule.expression("rate(1 minute)"))
 * .tags(List.of(Tag.builder()
 * .key("my-tag")
 * .value("my-tag-value")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class ScheduledFargateTaskPropsDsl {
  private val cdkBuilder: ScheduledFargateTaskProps.Builder = ScheduledFargateTaskProps.builder()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  private val _tags: MutableList<Tag> = mutableListOf()

  /**
   * @param cluster The name of the cluster that hosts the service.
   * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
   * both cluster and vpc.
   */
  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  /**
   * @param cpu The number of cpu units used by the task.
   * Valid values, which determines your range of valid values for the memory parameter:
   *
   * 256 (.25 vCPU) - Available memory values: 0.5GB, 1GB, 2GB
   *
   * 512 (.5 vCPU) - Available memory values: 1GB, 2GB, 3GB, 4GB
   *
   * 1024 (1 vCPU) - Available memory values: 2GB, 3GB, 4GB, 5GB, 6GB, 7GB, 8GB
   *
   * 2048 (2 vCPU) - Available memory values: Between 4GB and 16GB in 1GB increments
   *
   * 4096 (4 vCPU) - Available memory values: Between 8GB and 30GB in 1GB increments
   *
   * 8192 (8 vCPU) - Available memory values: Between 16GB and 60GB in 4GB increments
   *
   * 16384 (16 vCPU) - Available memory values: Between 32GB and 120GB in 8GB increments
   *
   * This default is set in the underlying FargateTaskDefinition construct.
   */
  public fun cpu(cpu: Number) {
    cdkBuilder.cpu(cpu)
  }

  /**
   * @param desiredTaskCount The desired number of instantiations of the task definition to keep
   * running on the service.
   */
  public fun desiredTaskCount(desiredTaskCount: Number) {
    cdkBuilder.desiredTaskCount(desiredTaskCount)
  }

  /**
   * @param enabled Indicates whether the rule is enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param memoryLimitMiB The amount (in MiB) of memory used by the task.
   * This field is required and you must use one of the following values, which determines your
   * range of valid values
   * for the cpu parameter:
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
   *
   * This default is set in the underlying FargateTaskDefinition construct.
   */
  public fun memoryLimitMiB(memoryLimitMiB: Number) {
    cdkBuilder.memoryLimitMiB(memoryLimitMiB)
  }

  /**
   * @param platformVersion The platform version on which to run your service.
   * If one is not specified, the LATEST platform version is used by default. For more information,
   * see
   * [AWS Fargate Platform
   * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
   * in the Amazon Elastic Container Service Developer Guide.
   */
  public fun platformVersion(platformVersion: FargatePlatformVersion) {
    cdkBuilder.platformVersion(platformVersion)
  }

  /**
   * @param propagateTags Specifies whether to propagate the tags from the task definition to the
   * task.
   * If no value is specified, the tags are not propagated.
   */
  public fun propagateTags(propagateTags: PropagatedTagSource) {
    cdkBuilder.propagateTags(propagateTags)
  }

  /**
   * @param ruleName A name for the rule.
   */
  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  /**
   * @param runtimePlatform The runtime platform of the task definition.
   */
  public fun runtimePlatform(runtimePlatform: RuntimePlatformDsl.() -> Unit = {}) {
    val builder = RuntimePlatformDsl()
    builder.apply(runtimePlatform)
    cdkBuilder.runtimePlatform(builder.build())
  }

  /**
   * @param runtimePlatform The runtime platform of the task definition.
   */
  public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
    cdkBuilder.runtimePlatform(runtimePlatform)
  }

  /**
   * @param schedule The schedule or rate (frequency) that determines when CloudWatch Events runs
   * the rule. 
   * For more information, see
   * [Schedule Expression Syntax for
   * Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html)
   * in the Amazon CloudWatch User Guide.
   */
  public fun schedule(schedule: Schedule) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * @param scheduledFargateTaskDefinitionOptions The properties to define if using an existing
   * TaskDefinition in this construct.
   * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined, but
   * not both.
   */
  public
      fun scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptionsDsl.() -> Unit
      = {}) {
    val builder = ScheduledFargateTaskDefinitionOptionsDsl()
    builder.apply(scheduledFargateTaskDefinitionOptions)
    cdkBuilder.scheduledFargateTaskDefinitionOptions(builder.build())
  }

  /**
   * @param scheduledFargateTaskDefinitionOptions The properties to define if using an existing
   * TaskDefinition in this construct.
   * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined, but
   * not both.
   */
  public
      fun scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptions) {
    cdkBuilder.scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions)
  }

  /**
   * @param scheduledFargateTaskImageOptions The properties to define if the construct is to create
   * a TaskDefinition.
   * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined, but
   * not both.
   */
  public
      fun scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptionsDsl.() -> Unit
      = {}) {
    val builder = ScheduledFargateTaskImageOptionsDsl()
    builder.apply(scheduledFargateTaskImageOptions)
    cdkBuilder.scheduledFargateTaskImageOptions(builder.build())
  }

  /**
   * @param scheduledFargateTaskImageOptions The properties to define if the construct is to create
   * a TaskDefinition.
   * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined, but
   * not both.
   */
  public
      fun scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions) {
    cdkBuilder.scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions)
  }

  /**
   * @param securityGroups Existing security groups to use for your service.
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups Existing security groups to use for your service.
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * @param subnetSelection In what subnets to place the task's ENIs.
   * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
   */
  public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(subnetSelection)
    cdkBuilder.subnetSelection(builder.build())
  }

  /**
   * @param subnetSelection In what subnets to place the task's ENIs.
   * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
   */
  public fun subnetSelection(subnetSelection: SubnetSelection) {
    cdkBuilder.subnetSelection(subnetSelection)
  }

  /**
   * @param tags The metadata that you apply to the task to help you categorize and organize them.
   * Each tag consists of a key and an optional value, both of which you define.
   */
  public fun tags(tags: TagDsl.() -> Unit) {
    _tags.add(TagDsl().apply(tags).build())
  }

  /**
   * @param tags The metadata that you apply to the task to help you categorize and organize them.
   * Each tag consists of a key and an optional value, both of which you define.
   */
  public fun tags(tags: Collection<Tag>) {
    _tags.addAll(tags)
  }

  /**
   * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition or
   * TaskImageOptions must be specified, but not both.
   * [disable-awslint:ref-via-interface]
   */
  public fun taskDefinition(taskDefinition: FargateTaskDefinition) {
    cdkBuilder.taskDefinition(taskDefinition)
  }

  /**
   * @param vpc The VPC where the container instances will be launched or the elastic network
   * interfaces (ENIs) will be deployed.
   * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
   * both vpc and cluster.
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): ScheduledFargateTaskProps {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
