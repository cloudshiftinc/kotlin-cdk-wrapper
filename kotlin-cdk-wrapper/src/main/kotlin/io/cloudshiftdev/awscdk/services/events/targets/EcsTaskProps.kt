@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.ITaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.LaunchType
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties to define an ECS Event Task.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * ICluster cluster;
 * TaskDefinition taskDefinition;
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.hours(1)))
 * .build();
 * rule.addTarget(EcsTask.Builder.create()
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .taskCount(1)
 * // Overrides the cpu and memory values in the task definition
 * .cpu("512")
 * .memory("512")
 * .build());
 * ```
 */
public interface EcsTaskProps : TargetBaseProps {
  /**
   * Specifies whether the task's elastic network interface receives a public IP address.
   *
   * You can specify true only when LaunchType is set to FARGATE.
   *
   * Default: - true if the subnet type is PUBLIC, otherwise false
   */
  public fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

  /**
   * Cluster where service will be deployed.
   */
  public fun cluster(): ICluster

  /**
   * Container setting overrides.
   *
   * Key is the name of the container to override, value is the
   * values you want to override.
   */
  public fun containerOverrides(): List<ContainerOverride> =
      unwrap(this).getContainerOverrides()?.map(ContainerOverride::wrap) ?: emptyList()

  /**
   * The CPU override for the task.
   *
   * Default: - The task definition's CPU value
   */
  public fun cpu(): String? = unwrap(this).getCpu()

  /**
   * Whether or not to enable the execute command functionality for the containers in this task.
   *
   * If true, this enables execute command functionality on all containers in the task.
   *
   * Default: - false
   */
  public fun enableExecuteCommand(): Boolean? = unwrap(this).getEnableExecuteCommand()

  /**
   * The ephemeral storage setting override for the task.
   *
   * NOTE: This parameter is only supported for tasks hosted on Fargate that use the following
   * platform versions:
   *
   * * Linux platform version 1.4.0 or later.
   * * Windows platform version 1.0.0 or later.
   *
   * Default: - The task definition's ephemeral storage value
   */
  public fun ephemeralStorage(): EphemeralStorageOverride? =
      unwrap(this).getEphemeralStorage()?.let(EphemeralStorageOverride::wrap)

  /**
   * The execution role for the task.
   *
   * The Amazon Resource Name (ARN) of the task execution role override for the task.
   *
   * Default: - The task definition's execution role
   */
  public fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

  /**
   * The Elastic Inference accelerator override for the task.
   *
   * Default: - The task definition's inference accelerator overrides
   */
  public fun inferenceAcceleratorOverrides(): List<InferenceAcceleratorOverride> =
      unwrap(this).getInferenceAcceleratorOverrides()?.map(InferenceAcceleratorOverride::wrap) ?:
      emptyList()

  /**
   * Specifies the launch type on which your task is running.
   *
   * The launch type that you specify here
   * must match one of the launch type (compatibilities) of the target task.
   *
   * Default: - 'EC2' if `isEc2Compatible` for the `taskDefinition` is true, otherwise 'FARGATE'
   */
  public fun launchType(): LaunchType? = unwrap(this).getLaunchType()?.let(LaunchType::wrap)

  /**
   * The memory override for the task.
   *
   * Default: - The task definition's memory value
   */
  public fun memory(): String? = unwrap(this).getMemory()

  /**
   * The platform version on which to run your task.
   *
   * Unless you have specific compatibility requirements, you don't need to specify this.
   *
   * Default: - ECS will set the Fargate platform version to 'LATEST'
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
   */
  public fun platformVersion(): FargatePlatformVersion? =
      unwrap(this).getPlatformVersion()?.let(FargatePlatformVersion::wrap)

  /**
   * Specifies whether to propagate the tags from the task definition to the task.
   *
   * If no value is specified, the tags are not propagated.
   *
   * Default: - Tags will not be propagated
   */
  public fun propagateTags(): PropagatedTagSource? =
      unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

  /**
   * Existing IAM role to run the ECS task.
   *
   * Default: A new IAM role is created
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * Existing security groups to use for the task's ENIs.
   *
   * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
   *
   * Default: A new security group is created
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * In what subnets to place the task's ENIs.
   *
   * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
   *
   * Default: Private subnets
   */
  public fun subnetSelection(): SubnetSelection? =
      unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

  /**
   * The metadata that you apply to the task to help you categorize and organize them.
   *
   * Each tag consists of a key and an optional value, both of which you define.
   *
   * Default: - No additional tags are applied to the task
   */
  public fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()

  /**
   * How many tasks should be started when this event is triggered.
   *
   * Default: 1
   */
  public fun taskCount(): Number? = unwrap(this).getTaskCount()

  /**
   * Task Definition of the task that should be started.
   */
  public fun taskDefinition(): ITaskDefinition

  /**
   * The IAM role for the task.
   *
   * Default: - The task definition's task role
   */
  public fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)

  /**
   * A builder for [EcsTaskProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assignPublicIp Specifies whether the task's elastic network interface receives a
     * public IP address.
     * You can specify true only when LaunchType is set to FARGATE.
     */
    public fun assignPublicIp(assignPublicIp: Boolean)

    /**
     * @param cluster Cluster where service will be deployed. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param containerOverrides Container setting overrides.
     * Key is the name of the container to override, value is the
     * values you want to override.
     */
    public fun containerOverrides(containerOverrides: List<ContainerOverride>)

    /**
     * @param containerOverrides Container setting overrides.
     * Key is the name of the container to override, value is the
     * values you want to override.
     */
    public fun containerOverrides(vararg containerOverrides: ContainerOverride)

    /**
     * @param cpu The CPU override for the task.
     */
    public fun cpu(cpu: String)

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param enableExecuteCommand Whether or not to enable the execute command functionality for
     * the containers in this task.
     * If true, this enables execute command functionality on all containers in the task.
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    /**
     * @param ephemeralStorage The ephemeral storage setting override for the task.
     * NOTE: This parameter is only supported for tasks hosted on Fargate that use the following
     * platform versions:
     *
     * * Linux platform version 1.4.0 or later.
     * * Windows platform version 1.0.0 or later.
     */
    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageOverride)

    /**
     * @param ephemeralStorage The ephemeral storage setting override for the task.
     * NOTE: This parameter is only supported for tasks hosted on Fargate that use the following
     * platform versions:
     *
     * * Linux platform version 1.4.0 or later.
     * * Windows platform version 1.0.0 or later.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("757fd9b1d5d512ed25c058277fb303159977d70c541fcf96f77bdef65acc215f")
    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageOverride.Builder.() -> Unit)

    /**
     * @param executionRole The execution role for the task.
     * The Amazon Resource Name (ARN) of the task execution role override for the task.
     */
    public fun executionRole(executionRole: IRole)

    /**
     * @param inferenceAcceleratorOverrides The Elastic Inference accelerator override for the task.
     */
    public
        fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: List<InferenceAcceleratorOverride>)

    /**
     * @param inferenceAcceleratorOverrides The Elastic Inference accelerator override for the task.
     */
    public fun inferenceAcceleratorOverrides(vararg
        inferenceAcceleratorOverrides: InferenceAcceleratorOverride)

    /**
     * @param launchType Specifies the launch type on which your task is running.
     * The launch type that you specify here
     * must match one of the launch type (compatibilities) of the target task.
     */
    public fun launchType(launchType: LaunchType)

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * @param memory The memory override for the task.
     */
    public fun memory(memory: String)

    /**
     * @param platformVersion The platform version on which to run your task.
     * Unless you have specific compatibility requirements, you don't need to specify this.
     */
    public fun platformVersion(platformVersion: FargatePlatformVersion)

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task.
     * If no value is specified, the tags are not propagated.
     */
    public fun propagateTags(propagateTags: PropagatedTagSource)

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * @param role Existing IAM role to run the ECS task.
     */
    public fun role(role: IRole)

    /**
     * @param securityGroups Existing security groups to use for the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups Existing security groups to use for the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param subnetSelection In what subnets to place the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * @param subnetSelection In what subnets to place the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f27e73df4627a5dbe8551acea2a52312b2106b6c5f736a6a7c49f493369b6a90")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(tags: List<Tag>)

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(vararg tags: Tag)

    /**
     * @param taskCount How many tasks should be started when this event is triggered.
     */
    public fun taskCount(taskCount: Number)

    /**
     * @param taskDefinition Task Definition of the task that should be started. 
     */
    public fun taskDefinition(taskDefinition: ITaskDefinition)

    /**
     * @param taskRole The IAM role for the task.
     */
    public fun taskRole(taskRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.EcsTaskProps.Builder =
        software.amazon.awscdk.services.events.targets.EcsTaskProps.builder()

    /**
     * @param assignPublicIp Specifies whether the task's elastic network interface receives a
     * public IP address.
     * You can specify true only when LaunchType is set to FARGATE.
     */
    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    /**
     * @param cluster Cluster where service will be deployed. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * @param containerOverrides Container setting overrides.
     * Key is the name of the container to override, value is the
     * values you want to override.
     */
    override fun containerOverrides(containerOverrides: List<ContainerOverride>) {
      cdkBuilder.containerOverrides(containerOverrides.map(ContainerOverride.Companion::unwrap))
    }

    /**
     * @param containerOverrides Container setting overrides.
     * Key is the name of the container to override, value is the
     * values you want to override.
     */
    override fun containerOverrides(vararg containerOverrides: ContainerOverride): Unit =
        containerOverrides(containerOverrides.toList())

    /**
     * @param cpu The CPU override for the task.
     */
    override fun cpu(cpu: String) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * @param enableExecuteCommand Whether or not to enable the execute command functionality for
     * the containers in this task.
     * If true, this enables execute command functionality on all containers in the task.
     */
    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * @param ephemeralStorage The ephemeral storage setting override for the task.
     * NOTE: This parameter is only supported for tasks hosted on Fargate that use the following
     * platform versions:
     *
     * * Linux platform version 1.4.0 or later.
     * * Windows platform version 1.0.0 or later.
     */
    override fun ephemeralStorage(ephemeralStorage: EphemeralStorageOverride) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(EphemeralStorageOverride.Companion::unwrap))
    }

    /**
     * @param ephemeralStorage The ephemeral storage setting override for the task.
     * NOTE: This parameter is only supported for tasks hosted on Fargate that use the following
     * platform versions:
     *
     * * Linux platform version 1.4.0 or later.
     * * Windows platform version 1.0.0 or later.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("757fd9b1d5d512ed25c058277fb303159977d70c541fcf96f77bdef65acc215f")
    override fun ephemeralStorage(ephemeralStorage: EphemeralStorageOverride.Builder.() -> Unit):
        Unit = ephemeralStorage(EphemeralStorageOverride(ephemeralStorage))

    /**
     * @param executionRole The execution role for the task.
     * The Amazon Resource Name (ARN) of the task execution role override for the task.
     */
    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param inferenceAcceleratorOverrides The Elastic Inference accelerator override for the task.
     */
    override
        fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: List<InferenceAcceleratorOverride>) {
      cdkBuilder.inferenceAcceleratorOverrides(inferenceAcceleratorOverrides.map(InferenceAcceleratorOverride.Companion::unwrap))
    }

    /**
     * @param inferenceAcceleratorOverrides The Elastic Inference accelerator override for the task.
     */
    override fun inferenceAcceleratorOverrides(vararg
        inferenceAcceleratorOverrides: InferenceAcceleratorOverride): Unit =
        inferenceAcceleratorOverrides(inferenceAcceleratorOverrides.toList())

    /**
     * @param launchType Specifies the launch type on which your task is running.
     * The launch type that you specify here
     * must match one of the launch type (compatibilities) of the target task.
     */
    override fun launchType(launchType: LaunchType) {
      cdkBuilder.launchType(launchType.let(LaunchType.Companion::unwrap))
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * @param memory The memory override for the task.
     */
    override fun memory(memory: String) {
      cdkBuilder.memory(memory)
    }

    /**
     * @param platformVersion The platform version on which to run your task.
     * Unless you have specific compatibility requirements, you don't need to specify this.
     */
    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion.Companion::unwrap))
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task.
     * If no value is specified, the tags are not propagated.
     */
    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource.Companion::unwrap))
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param role Existing IAM role to run the ECS task.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param securityGroups Existing security groups to use for the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param securityGroups Existing security groups to use for the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param subnetSelection In what subnets to place the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param subnetSelection In what subnets to place the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f27e73df4627a5dbe8551acea2a52312b2106b6c5f736a6a7c49f493369b6a90")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    override fun tags(tags: List<Tag>) {
      cdkBuilder.tags(tags.map(Tag.Companion::unwrap))
    }

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    override fun tags(vararg tags: Tag): Unit = tags(tags.toList())

    /**
     * @param taskCount How many tasks should be started when this event is triggered.
     */
    override fun taskCount(taskCount: Number) {
      cdkBuilder.taskCount(taskCount)
    }

    /**
     * @param taskDefinition Task Definition of the task that should be started. 
     */
    override fun taskDefinition(taskDefinition: ITaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(ITaskDefinition.Companion::unwrap))
    }

    /**
     * @param taskRole The IAM role for the task.
     */
    override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.targets.EcsTaskProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.targets.EcsTaskProps,
  ) : CdkObject(cdkObject),
      EcsTaskProps {
    /**
     * Specifies whether the task's elastic network interface receives a public IP address.
     *
     * You can specify true only when LaunchType is set to FARGATE.
     *
     * Default: - true if the subnet type is PUBLIC, otherwise false
     */
    override fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

    /**
     * Cluster where service will be deployed.
     */
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    /**
     * Container setting overrides.
     *
     * Key is the name of the container to override, value is the
     * values you want to override.
     */
    override fun containerOverrides(): List<ContainerOverride> =
        unwrap(this).getContainerOverrides()?.map(ContainerOverride::wrap) ?: emptyList()

    /**
     * The CPU override for the task.
     *
     * Default: - The task definition's CPU value
     */
    override fun cpu(): String? = unwrap(this).getCpu()

    /**
     * The SQS queue to be used as deadLetterQueue. Check out the [considerations for using a
     * dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     *
     * Default: - no dead-letter queue
     */
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    /**
     * Whether or not to enable the execute command functionality for the containers in this task.
     *
     * If true, this enables execute command functionality on all containers in the task.
     *
     * Default: - false
     */
    override fun enableExecuteCommand(): Boolean? = unwrap(this).getEnableExecuteCommand()

    /**
     * The ephemeral storage setting override for the task.
     *
     * NOTE: This parameter is only supported for tasks hosted on Fargate that use the following
     * platform versions:
     *
     * * Linux platform version 1.4.0 or later.
     * * Windows platform version 1.0.0 or later.
     *
     * Default: - The task definition's ephemeral storage value
     */
    override fun ephemeralStorage(): EphemeralStorageOverride? =
        unwrap(this).getEphemeralStorage()?.let(EphemeralStorageOverride::wrap)

    /**
     * The execution role for the task.
     *
     * The Amazon Resource Name (ARN) of the task execution role override for the task.
     *
     * Default: - The task definition's execution role
     */
    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    /**
     * The Elastic Inference accelerator override for the task.
     *
     * Default: - The task definition's inference accelerator overrides
     */
    override fun inferenceAcceleratorOverrides(): List<InferenceAcceleratorOverride> =
        unwrap(this).getInferenceAcceleratorOverrides()?.map(InferenceAcceleratorOverride::wrap) ?:
        emptyList()

    /**
     * Specifies the launch type on which your task is running.
     *
     * The launch type that you specify here
     * must match one of the launch type (compatibilities) of the target task.
     *
     * Default: - 'EC2' if `isEc2Compatible` for the `taskDefinition` is true, otherwise 'FARGATE'
     */
    override fun launchType(): LaunchType? = unwrap(this).getLaunchType()?.let(LaunchType::wrap)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     */
    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    /**
     * The memory override for the task.
     *
     * Default: - The task definition's memory value
     */
    override fun memory(): String? = unwrap(this).getMemory()

    /**
     * The platform version on which to run your task.
     *
     * Unless you have specific compatibility requirements, you don't need to specify this.
     *
     * Default: - ECS will set the Fargate platform version to 'LATEST'
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     */
    override fun platformVersion(): FargatePlatformVersion? =
        unwrap(this).getPlatformVersion()?.let(FargatePlatformVersion::wrap)

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags are not propagated.
     *
     * Default: - Tags will not be propagated
     */
    override fun propagateTags(): PropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    /**
     * Existing IAM role to run the ECS task.
     *
     * Default: A new IAM role is created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Existing security groups to use for the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: A new security group is created
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * In what subnets to place the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: Private subnets
     */
    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No additional tags are applied to the task
     */
    override fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()

    /**
     * How many tasks should be started when this event is triggered.
     *
     * Default: 1
     */
    override fun taskCount(): Number? = unwrap(this).getTaskCount()

    /**
     * Task Definition of the task that should be started.
     */
    override fun taskDefinition(): ITaskDefinition =
        unwrap(this).getTaskDefinition().let(ITaskDefinition::wrap)

    /**
     * The IAM role for the task.
     *
     * Default: - The task definition's task role
     */
    override fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.EcsTaskProps):
        EcsTaskProps = CdkObjectWrappers.wrap(cdkObject) as? EcsTaskProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsTaskProps):
        software.amazon.awscdk.services.events.targets.EcsTaskProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.EcsTaskProps
  }
}
