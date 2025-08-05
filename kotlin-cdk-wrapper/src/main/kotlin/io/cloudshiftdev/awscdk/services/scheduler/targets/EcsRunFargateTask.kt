@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.CapacityProviderStrategy
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.TaskDefinition
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.scheduler.ScheduleTargetInput
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.ecs.ICluster as CloudshiftdevAwscdkServicesEcsICluster
import software.amazon.awscdk.services.ecs.ICluster as AmazonAwscdkServicesEcsICluster

/**
 * Schedule an ECS Task on Fargate using AWS EventBridge Scheduler.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * ICluster cluster;
 * FargateTaskDefinition taskDefinition;
 * Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.minutes(60)))
 * .target(EcsRunFargateTask.Builder.create(cluster)
 * .taskDefinition(taskDefinition)
 * .build())
 * .build();
 * ```
 */
public open class EcsRunFargateTask(
  cdkObject: software.amazon.awscdk.services.scheduler.targets.EcsRunFargateTask,
) : EcsRunTask(cdkObject) {
  public constructor(cluster: CloudshiftdevAwscdkServicesEcsICluster, props: FargateTaskProps) :
      this(software.amazon.awscdk.services.scheduler.targets.EcsRunFargateTask(cluster.let(CloudshiftdevAwscdkServicesEcsICluster.Companion::unwrap),
      props.let(FargateTaskProps.Companion::unwrap))
  )

  public constructor(cluster: CloudshiftdevAwscdkServicesEcsICluster,
      props: FargateTaskProps.Builder.() -> Unit) : this(cluster, FargateTaskProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.scheduler.targets.EcsRunFargateTask].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether the task's elastic network interface receives a public IP address.
     *
     * If true, the task will receive a public IP address and be accessible from the internet.
     * Should only be set to true when using public subnets.
     *
     * Default: - true if the subnet type is PUBLIC, otherwise false
     *
     * @param assignPublicIp Specifies whether the task's elastic network interface receives a
     * public IP address. 
     */
    public fun assignPublicIp(assignPublicIp: Boolean)

    /**
     * The capacity provider strategy to use for the task.
     *
     * Default: - No capacity provider strategy
     *
     * @param capacityProviderStrategies The capacity provider strategy to use for the task. 
     */
    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>)

    /**
     * The capacity provider strategy to use for the task.
     *
     * Default: - No capacity provider strategy
     *
     * @param capacityProviderStrategies The capacity provider strategy to use for the task. 
     */
    public fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy)

    /**
     * The SQS queue to be used as deadLetterQueue.
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     *
     * Default: - no dead-letter queue
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. 
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * Specifies whether to enable Amazon ECS managed tags for the task.
     *
     * Default: - false
     *
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the task.
     * 
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    /**
     * Whether to enable execute command functionality for the containers in this task.
     *
     * If true, this enables execute command functionality on all containers in the task.
     *
     * Default: - false
     *
     * @param enableExecuteCommand Whether to enable execute command functionality for the
     * containers in this task. 
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    /**
     * Specifies an ECS task group for the task.
     *
     * Default: - No group
     *
     * @param group Specifies an ECS task group for the task. 
     */
    public fun group(group: String)

    /**
     * Input passed to the target.
     *
     * Default: - no input.
     *
     * @param input Input passed to the target. 
     */
    public fun input(input: ScheduleTargetInput)

    /**
     * The maximum age of a request that Scheduler sends to a target for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing. 
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * Specifies the platform version for the task.
     *
     * Specify only the numeric portion of the platform version, such as 1.1.0.
     * Platform versions determine the underlying runtime environment for the task.
     *
     * Default: - LATEST
     *
     * @param platformVersion Specifies the platform version for the task. 
     */
    public fun platformVersion(platformVersion: FargatePlatformVersion)

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags are not propagated.
     *
     * Default: - No tag propagation
     *
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task. 
     */
    public fun propagateTags(propagateTags: Boolean)

    /**
     * The reference ID to use for the task.
     *
     * Default: - No reference ID.
     *
     * @param referenceId The reference ID to use for the task. 
     */
    public fun referenceId(referenceId: String)

    /**
     * The maximum number of times to retry when the target returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the target returns an error. 
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * An execution role is an IAM role that EventBridge Scheduler assumes in order to interact with
     * other AWS services on your behalf.
     *
     * If none provided templates target will automatically create an IAM role with all the minimum
     * necessary
     * permissions to interact with the templated target. If you wish you may specify your own IAM
     * role, then the templated targets
     * will grant minimal required permissions.
     *
     * Default: - created by target
     *
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf. 
     */
    public fun role(role: IRole)

    /**
     * The security groups associated with the task.
     *
     * These security groups must all be in the same VPC.
     * Controls inbound and outbound network access for the task.
     *
     * Default: - The security group for the VPC is used.
     *
     * @param securityGroups The security groups associated with the task. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * The security groups associated with the task.
     *
     * These security groups must all be in the same VPC.
     * Controls inbound and outbound network access for the task.
     *
     * Default: - The security group for the VPC is used.
     *
     * @param securityGroups The security groups associated with the task. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No tags
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
     * Default: - No tags
     *
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * 
     */
    public fun tags(vararg tags: Tag)

    /**
     * The number of tasks to create based on TaskDefinition.
     *
     * Default: 1
     *
     * @param taskCount The number of tasks to create based on TaskDefinition. 
     */
    public fun taskCount(taskCount: Number)

    /**
     * The task definition to use for scheduled tasks.
     *
     * Note: this must be TaskDefinition, and not ITaskDefinition,
     * as it requires properties that are not known for imported task definitions
     * If you want to run a RunTask with an imported task definition,
     * consider using a Universal target.
     *
     * @param taskDefinition The task definition to use for scheduled tasks. 
     */
    public fun taskDefinition(taskDefinition: TaskDefinition)

    /**
     * The subnets associated with the task.
     *
     * These subnets must all be in the same VPC.
     * The task will be launched in these subnets.
     *
     * Default: - all private subnets of the VPC are selected.
     *
     * @param vpcSubnets The subnets associated with the task. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * The subnets associated with the task.
     *
     * These subnets must all be in the same VPC.
     * The task will be launched in these subnets.
     *
     * Default: - all private subnets of the VPC are selected.
     *
     * @param vpcSubnets The subnets associated with the task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e469d820837f1061ebd150a686fbe5796278994f43281f442686198b06b7ee0b")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    cluster: AmazonAwscdkServicesEcsICluster,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.scheduler.targets.EcsRunFargateTask.Builder =
        software.amazon.awscdk.services.scheduler.targets.EcsRunFargateTask.Builder.create(cluster)

    /**
     * Specifies whether the task's elastic network interface receives a public IP address.
     *
     * If true, the task will receive a public IP address and be accessible from the internet.
     * Should only be set to true when using public subnets.
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
     * The capacity provider strategy to use for the task.
     *
     * Default: - No capacity provider strategy
     *
     * @param capacityProviderStrategies The capacity provider strategy to use for the task. 
     */
    override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy.Companion::unwrap))
    }

    /**
     * The capacity provider strategy to use for the task.
     *
     * Default: - No capacity provider strategy
     *
     * @param capacityProviderStrategies The capacity provider strategy to use for the task. 
     */
    override fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy): Unit =
        capacityProviderStrategies(capacityProviderStrategies.toList())

    /**
     * The SQS queue to be used as deadLetterQueue.
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     *
     * Default: - no dead-letter queue
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. 
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * Specifies whether to enable Amazon ECS managed tags for the task.
     *
     * Default: - false
     *
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the task.
     * 
     */
    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * Whether to enable execute command functionality for the containers in this task.
     *
     * If true, this enables execute command functionality on all containers in the task.
     *
     * Default: - false
     *
     * @param enableExecuteCommand Whether to enable execute command functionality for the
     * containers in this task. 
     */
    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * Specifies an ECS task group for the task.
     *
     * Default: - No group
     *
     * @param group Specifies an ECS task group for the task. 
     */
    override fun group(group: String) {
      cdkBuilder.group(group)
    }

    /**
     * Input passed to the target.
     *
     * Default: - no input.
     *
     * @param input Input passed to the target. 
     */
    override fun input(input: ScheduleTargetInput) {
      cdkBuilder.input(input.let(ScheduleTargetInput.Companion::unwrap))
    }

    /**
     * The maximum age of a request that Scheduler sends to a target for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing. 
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * Specifies the platform version for the task.
     *
     * Specify only the numeric portion of the platform version, such as 1.1.0.
     * Platform versions determine the underlying runtime environment for the task.
     *
     * Default: - LATEST
     *
     * @param platformVersion Specifies the platform version for the task. 
     */
    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion.Companion::unwrap))
    }

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags are not propagated.
     *
     * Default: - No tag propagation
     *
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task. 
     */
    override fun propagateTags(propagateTags: Boolean) {
      cdkBuilder.propagateTags(propagateTags)
    }

    /**
     * The reference ID to use for the task.
     *
     * Default: - No reference ID.
     *
     * @param referenceId The reference ID to use for the task. 
     */
    override fun referenceId(referenceId: String) {
      cdkBuilder.referenceId(referenceId)
    }

    /**
     * The maximum number of times to retry when the target returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the target returns an error. 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * An execution role is an IAM role that EventBridge Scheduler assumes in order to interact with
     * other AWS services on your behalf.
     *
     * If none provided templates target will automatically create an IAM role with all the minimum
     * necessary
     * permissions to interact with the templated target. If you wish you may specify your own IAM
     * role, then the templated targets
     * will grant minimal required permissions.
     *
     * Default: - created by target
     *
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * The security groups associated with the task.
     *
     * These security groups must all be in the same VPC.
     * Controls inbound and outbound network access for the task.
     *
     * Default: - The security group for the VPC is used.
     *
     * @param securityGroups The security groups associated with the task. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * The security groups associated with the task.
     *
     * These security groups must all be in the same VPC.
     * Controls inbound and outbound network access for the task.
     *
     * Default: - The security group for the VPC is used.
     *
     * @param securityGroups The security groups associated with the task. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No tags
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
     * Default: - No tags
     *
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * 
     */
    override fun tags(vararg tags: Tag): Unit = tags(tags.toList())

    /**
     * The number of tasks to create based on TaskDefinition.
     *
     * Default: 1
     *
     * @param taskCount The number of tasks to create based on TaskDefinition. 
     */
    override fun taskCount(taskCount: Number) {
      cdkBuilder.taskCount(taskCount)
    }

    /**
     * The task definition to use for scheduled tasks.
     *
     * Note: this must be TaskDefinition, and not ITaskDefinition,
     * as it requires properties that are not known for imported task definitions
     * If you want to run a RunTask with an imported task definition,
     * consider using a Universal target.
     *
     * @param taskDefinition The task definition to use for scheduled tasks. 
     */
    override fun taskDefinition(taskDefinition: TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition.Companion::unwrap))
    }

    /**
     * The subnets associated with the task.
     *
     * These subnets must all be in the same VPC.
     * The task will be launched in these subnets.
     *
     * Default: - all private subnets of the VPC are selected.
     *
     * @param vpcSubnets The subnets associated with the task. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * The subnets associated with the task.
     *
     * These subnets must all be in the same VPC.
     * The task will be launched in these subnets.
     *
     * Default: - all private subnets of the VPC are selected.
     *
     * @param vpcSubnets The subnets associated with the task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e469d820837f1061ebd150a686fbe5796278994f43281f442686198b06b7ee0b")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.scheduler.targets.EcsRunFargateTask =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(cluster: CloudshiftdevAwscdkServicesEcsICluster,
        block: Builder.() -> Unit = {}): EcsRunFargateTask {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesEcsICluster.unwrap(cluster))
      return EcsRunFargateTask(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.EcsRunFargateTask):
        EcsRunFargateTask = EcsRunFargateTask(cdkObject)

    internal fun unwrap(wrapped: EcsRunFargateTask):
        software.amazon.awscdk.services.scheduler.targets.EcsRunFargateTask = wrapped.cdkObject as
        software.amazon.awscdk.services.scheduler.targets.EcsRunFargateTask
  }
}
