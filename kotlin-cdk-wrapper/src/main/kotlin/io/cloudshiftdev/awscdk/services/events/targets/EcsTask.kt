@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.ITaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.LaunchType
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Start a task on an ECS cluster.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * ICluster cluster;
 * TaskDefinition taskDefinition;
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.hours(1)))
 * .build();
 * rule.addTarget(
 * EcsTask.Builder.create()
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .assignPublicIp(true)
 * .subnetSelection(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
 * .build());
 * ```
 */
public open class EcsTask(
  cdkObject: software.amazon.awscdk.services.events.targets.EcsTask,
) : CdkObject(cdkObject),
    IRuleTarget {
  public constructor(props: EcsTaskProps) :
      this(software.amazon.awscdk.services.events.targets.EcsTask(props.let(EcsTaskProps.Companion::unwrap))
  )

  public constructor(props: EcsTaskProps.Builder.() -> Unit) : this(EcsTaskProps(props)
  )

  /**
   * Allows using tasks as target of EventBridge events.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Allows using tasks as target of EventBridge events.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   * The security groups associated with the task.
   *
   * Only applicable with awsvpc network mode.
   *
   * Default: - A new security group is created.
   */
  public open fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.EcsTask].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether the task's elastic network interface receives a public IP address.
     *
     * You can specify true only when LaunchType is set to FARGATE.
     *
     * Default: - true if the subnet type is PUBLIC, otherwise false
     *
     * @param assignPublicIp Specifies whether the task's elastic network interface receives a
     * public IP address. 
     */
    public fun assignPublicIp(assignPublicIp: Boolean)

    /**
     * Cluster where service will be deployed.
     *
     * @param cluster Cluster where service will be deployed. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * Container setting overrides.
     *
     * Key is the name of the container to override, value is the
     * values you want to override.
     *
     * @param containerOverrides Container setting overrides. 
     */
    public fun containerOverrides(containerOverrides: List<ContainerOverride>)

    /**
     * Container setting overrides.
     *
     * Key is the name of the container to override, value is the
     * values you want to override.
     *
     * @param containerOverrides Container setting overrides. 
     */
    public fun containerOverrides(vararg containerOverrides: ContainerOverride)

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
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * 
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * Whether or not to enable the execute command functionality for the containers in this task.
     *
     * If true, this enables execute command functionality on all containers in the task.
     *
     * Default: - false
     *
     * @param enableExecuteCommand Whether or not to enable the execute command functionality for
     * the containers in this task. 
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    /**
     * Specifies the launch type on which your task is running.
     *
     * The launch type that you specify here
     * must match one of the launch type (compatibilities) of the target task.
     *
     * Default: - 'EC2' if `isEc2Compatible` for the `taskDefinition` is true, otherwise 'FARGATE'
     *
     * @param launchType Specifies the launch type on which your task is running. 
     */
    public fun launchType(launchType: LaunchType)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * The platform version on which to run your task.
     *
     * Unless you have specific compatibility requirements, you don't need to specify this.
     *
     * Default: - ECS will set the Fargate platform version to 'LATEST'
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * @param platformVersion The platform version on which to run your task. 
     */
    public fun platformVersion(platformVersion: FargatePlatformVersion)

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags are not propagated.
     *
     * Default: - Tags will not be propagated
     *
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task. 
     */
    public fun propagateTags(propagateTags: PropagatedTagSource)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * Existing IAM role to run the ECS task.
     *
     * Default: A new IAM role is created
     *
     * @param role Existing IAM role to run the ECS task. 
     */
    public fun role(role: IRole)

    /**
     * Existing security groups to use for the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: A new security group is created
     *
     * @param securityGroups Existing security groups to use for the task's ENIs. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * Existing security groups to use for the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: A new security group is created
     *
     * @param securityGroups Existing security groups to use for the task's ENIs. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * In what subnets to place the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: Private subnets
     *
     * @param subnetSelection In what subnets to place the task's ENIs. 
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * In what subnets to place the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: Private subnets
     *
     * @param subnetSelection In what subnets to place the task's ENIs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0054ca9d3ff7caa7352474696ceec73e2cbea31199c76ebc26b86fdc9cc0475b")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No additional tags are applied to the task
     *
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * 
     */
    public fun tags(tags: List<Tag>)

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No additional tags are applied to the task
     *
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * 
     */
    public fun tags(vararg tags: Tag)

    /**
     * How many tasks should be started when this event is triggered.
     *
     * Default: 1
     *
     * @param taskCount How many tasks should be started when this event is triggered. 
     */
    public fun taskCount(taskCount: Number)

    /**
     * Task Definition of the task that should be started.
     *
     * @param taskDefinition Task Definition of the task that should be started. 
     */
    public fun taskDefinition(taskDefinition: ITaskDefinition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.EcsTask.Builder =
        software.amazon.awscdk.services.events.targets.EcsTask.Builder.create()

    /**
     * Specifies whether the task's elastic network interface receives a public IP address.
     *
     * You can specify true only when LaunchType is set to FARGATE.
     *
     * Default: - true if the subnet type is PUBLIC, otherwise false
     *
     * @param assignPublicIp Specifies whether the task's elastic network interface receives a
     * public IP address. 
     */
    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    /**
     * Cluster where service will be deployed.
     *
     * @param cluster Cluster where service will be deployed. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * Container setting overrides.
     *
     * Key is the name of the container to override, value is the
     * values you want to override.
     *
     * @param containerOverrides Container setting overrides. 
     */
    override fun containerOverrides(containerOverrides: List<ContainerOverride>) {
      cdkBuilder.containerOverrides(containerOverrides.map(ContainerOverride.Companion::unwrap))
    }

    /**
     * Container setting overrides.
     *
     * Key is the name of the container to override, value is the
     * values you want to override.
     *
     * @param containerOverrides Container setting overrides. 
     */
    override fun containerOverrides(vararg containerOverrides: ContainerOverride): Unit =
        containerOverrides(containerOverrides.toList())

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
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * 
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * Whether or not to enable the execute command functionality for the containers in this task.
     *
     * If true, this enables execute command functionality on all containers in the task.
     *
     * Default: - false
     *
     * @param enableExecuteCommand Whether or not to enable the execute command functionality for
     * the containers in this task. 
     */
    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * Specifies the launch type on which your task is running.
     *
     * The launch type that you specify here
     * must match one of the launch type (compatibilities) of the target task.
     *
     * Default: - 'EC2' if `isEc2Compatible` for the `taskDefinition` is true, otherwise 'FARGATE'
     *
     * @param launchType Specifies the launch type on which your task is running. 
     */
    override fun launchType(launchType: LaunchType) {
      cdkBuilder.launchType(launchType.let(LaunchType.Companion::unwrap))
    }

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * The platform version on which to run your task.
     *
     * Unless you have specific compatibility requirements, you don't need to specify this.
     *
     * Default: - ECS will set the Fargate platform version to 'LATEST'
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * @param platformVersion The platform version on which to run your task. 
     */
    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion.Companion::unwrap))
    }

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags are not propagated.
     *
     * Default: - Tags will not be propagated
     *
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task. 
     */
    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource.Companion::unwrap))
    }

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * Existing IAM role to run the ECS task.
     *
     * Default: A new IAM role is created
     *
     * @param role Existing IAM role to run the ECS task. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * Existing security groups to use for the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: A new security group is created
     *
     * @param securityGroups Existing security groups to use for the task's ENIs. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * Existing security groups to use for the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: A new security group is created
     *
     * @param securityGroups Existing security groups to use for the task's ENIs. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * In what subnets to place the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: Private subnets
     *
     * @param subnetSelection In what subnets to place the task's ENIs. 
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * In what subnets to place the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: Private subnets
     *
     * @param subnetSelection In what subnets to place the task's ENIs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0054ca9d3ff7caa7352474696ceec73e2cbea31199c76ebc26b86fdc9cc0475b")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No additional tags are applied to the task
     *
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * 
     */
    override fun tags(tags: List<Tag>) {
      cdkBuilder.tags(tags.map(Tag.Companion::unwrap))
    }

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No additional tags are applied to the task
     *
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * 
     */
    override fun tags(vararg tags: Tag): Unit = tags(tags.toList())

    /**
     * How many tasks should be started when this event is triggered.
     *
     * Default: 1
     *
     * @param taskCount How many tasks should be started when this event is triggered. 
     */
    override fun taskCount(taskCount: Number) {
      cdkBuilder.taskCount(taskCount)
    }

    /**
     * Task Definition of the task that should be started.
     *
     * @param taskDefinition Task Definition of the task that should be started. 
     */
    override fun taskDefinition(taskDefinition: ITaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(ITaskDefinition.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.targets.EcsTask = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsTask {
      val builderImpl = BuilderImpl()
      return EcsTask(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.EcsTask): EcsTask =
        EcsTask(cdkObject)

    internal fun unwrap(wrapped: EcsTask): software.amazon.awscdk.services.events.targets.EcsTask =
        wrapped.cdkObject as software.amazon.awscdk.services.events.targets.EcsTask
  }
}
