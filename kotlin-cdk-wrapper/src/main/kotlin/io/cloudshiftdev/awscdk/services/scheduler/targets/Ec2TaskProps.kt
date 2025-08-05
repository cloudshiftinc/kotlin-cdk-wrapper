@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.CapacityProviderStrategy
import io.cloudshiftdev.awscdk.services.ecs.PlacementConstraint
import io.cloudshiftdev.awscdk.services.ecs.PlacementStrategy
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

/**
 * Properties for scheduling an ECS Task on EC2.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * ICluster cluster;
 * Ec2TaskDefinition taskDefinition;
 * Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.minutes(60)))
 * .target(EcsRunEc2Task.Builder.create(cluster)
 * .taskDefinition(taskDefinition)
 * .build())
 * .build();
 * ```
 */
public interface Ec2TaskProps : EcsRunTaskBaseProps {
  /**
   * The rules that must be met in order to place a task on a container instance.
   *
   * Default: - No placement constraints.
   */
  public fun placementConstraints(): List<PlacementConstraint> =
      unwrap(this).getPlacementConstraints()?.map(PlacementConstraint::wrap) ?: emptyList()

  /**
   * The algorithm for selecting container instances for task placement.
   *
   * Default: - No placement strategies.
   */
  public fun placementStrategies(): List<PlacementStrategy> =
      unwrap(this).getPlacementStrategies()?.map(PlacementStrategy::wrap) ?: emptyList()

  /**
   * A builder for [Ec2TaskProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capacityProviderStrategies The capacity provider strategy to use for the task.
     */
    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>)

    /**
     * @param capacityProviderStrategies The capacity provider strategy to use for the task.
     */
    public fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy)

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue.
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the task.
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    /**
     * @param enableExecuteCommand Whether to enable execute command functionality for the
     * containers in this task.
     * If true, this enables execute command functionality on all containers in the task.
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    /**
     * @param group Specifies an ECS task group for the task.
     */
    public fun group(group: String)

    /**
     * @param input Input passed to the target.
     */
    public fun input(input: ScheduleTargetInput)

    /**
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * @param placementConstraints The rules that must be met in order to place a task on a
     * container instance.
     */
    public fun placementConstraints(placementConstraints: List<PlacementConstraint>)

    /**
     * @param placementConstraints The rules that must be met in order to place a task on a
     * container instance.
     */
    public fun placementConstraints(vararg placementConstraints: PlacementConstraint)

    /**
     * @param placementStrategies The algorithm for selecting container instances for task
     * placement.
     */
    public fun placementStrategies(placementStrategies: List<PlacementStrategy>)

    /**
     * @param placementStrategies The algorithm for selecting container instances for task
     * placement.
     */
    public fun placementStrategies(vararg placementStrategies: PlacementStrategy)

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task.
     * If no value is specified, the tags are not propagated.
     */
    public fun propagateTags(propagateTags: Boolean)

    /**
     * @param referenceId The reference ID to use for the task.
     */
    public fun referenceId(referenceId: String)

    /**
     * @param retryAttempts The maximum number of times to retry when the target returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf.
     * If none provided templates target will automatically create an IAM role with all the minimum
     * necessary
     * permissions to interact with the templated target. If you wish you may specify your own IAM
     * role, then the templated targets
     * will grant minimal required permissions.
     */
    public fun role(role: IRole)

    /**
     * @param securityGroups The security groups associated with the task.
     * These security groups must all be in the same VPC.
     * Controls inbound and outbound network access for the task.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups The security groups associated with the task.
     * These security groups must all be in the same VPC.
     * Controls inbound and outbound network access for the task.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

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
     * @param taskCount The number of tasks to create based on TaskDefinition.
     */
    public fun taskCount(taskCount: Number)

    /**
     * @param taskDefinition The task definition to use for scheduled tasks. 
     * Note: this must be TaskDefinition, and not ITaskDefinition,
     * as it requires properties that are not known for imported task definitions
     * If you want to run a RunTask with an imported task definition,
     * consider using a Universal target.
     */
    public fun taskDefinition(taskDefinition: TaskDefinition)

    /**
     * @param vpcSubnets The subnets associated with the task.
     * These subnets must all be in the same VPC.
     * The task will be launched in these subnets.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets The subnets associated with the task.
     * These subnets must all be in the same VPC.
     * The task will be launched in these subnets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e931f77d500051ac5c4c139705230705bd7f812482bda282a93c21d718b67e2")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.scheduler.targets.Ec2TaskProps.Builder =
        software.amazon.awscdk.services.scheduler.targets.Ec2TaskProps.builder()

    /**
     * @param capacityProviderStrategies The capacity provider strategy to use for the task.
     */
    override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy.Companion::unwrap))
    }

    /**
     * @param capacityProviderStrategies The capacity provider strategy to use for the task.
     */
    override fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy): Unit =
        capacityProviderStrategies(capacityProviderStrategies.toList())

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue.
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
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the task.
     */
    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * @param enableExecuteCommand Whether to enable execute command functionality for the
     * containers in this task.
     * If true, this enables execute command functionality on all containers in the task.
     */
    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * @param group Specifies an ECS task group for the task.
     */
    override fun group(group: String) {
      cdkBuilder.group(group)
    }

    /**
     * @param input Input passed to the target.
     */
    override fun input(input: ScheduleTargetInput) {
      cdkBuilder.input(input.let(ScheduleTargetInput.Companion::unwrap))
    }

    /**
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * @param placementConstraints The rules that must be met in order to place a task on a
     * container instance.
     */
    override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint.Companion::unwrap))
    }

    /**
     * @param placementConstraints The rules that must be met in order to place a task on a
     * container instance.
     */
    override fun placementConstraints(vararg placementConstraints: PlacementConstraint): Unit =
        placementConstraints(placementConstraints.toList())

    /**
     * @param placementStrategies The algorithm for selecting container instances for task
     * placement.
     */
    override fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
      cdkBuilder.placementStrategies(placementStrategies.map(PlacementStrategy.Companion::unwrap))
    }

    /**
     * @param placementStrategies The algorithm for selecting container instances for task
     * placement.
     */
    override fun placementStrategies(vararg placementStrategies: PlacementStrategy): Unit =
        placementStrategies(placementStrategies.toList())

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task.
     * If no value is specified, the tags are not propagated.
     */
    override fun propagateTags(propagateTags: Boolean) {
      cdkBuilder.propagateTags(propagateTags)
    }

    /**
     * @param referenceId The reference ID to use for the task.
     */
    override fun referenceId(referenceId: String) {
      cdkBuilder.referenceId(referenceId)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the target returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf.
     * If none provided templates target will automatically create an IAM role with all the minimum
     * necessary
     * permissions to interact with the templated target. If you wish you may specify your own IAM
     * role, then the templated targets
     * will grant minimal required permissions.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param securityGroups The security groups associated with the task.
     * These security groups must all be in the same VPC.
     * Controls inbound and outbound network access for the task.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param securityGroups The security groups associated with the task.
     * These security groups must all be in the same VPC.
     * Controls inbound and outbound network access for the task.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

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
     * @param taskCount The number of tasks to create based on TaskDefinition.
     */
    override fun taskCount(taskCount: Number) {
      cdkBuilder.taskCount(taskCount)
    }

    /**
     * @param taskDefinition The task definition to use for scheduled tasks. 
     * Note: this must be TaskDefinition, and not ITaskDefinition,
     * as it requires properties that are not known for imported task definitions
     * If you want to run a RunTask with an imported task definition,
     * consider using a Universal target.
     */
    override fun taskDefinition(taskDefinition: TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition.Companion::unwrap))
    }

    /**
     * @param vpcSubnets The subnets associated with the task.
     * These subnets must all be in the same VPC.
     * The task will be launched in these subnets.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param vpcSubnets The subnets associated with the task.
     * These subnets must all be in the same VPC.
     * The task will be launched in these subnets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e931f77d500051ac5c4c139705230705bd7f812482bda282a93c21d718b67e2")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.scheduler.targets.Ec2TaskProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.targets.Ec2TaskProps,
  ) : CdkObject(cdkObject),
      Ec2TaskProps {
    /**
     * The capacity provider strategy to use for the task.
     *
     * Default: - No capacity provider strategy
     */
    override fun capacityProviderStrategies(): List<CapacityProviderStrategy> =
        unwrap(this).getCapacityProviderStrategies()?.map(CapacityProviderStrategy::wrap) ?:
        emptyList()

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
     */
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    /**
     * Specifies whether to enable Amazon ECS managed tags for the task.
     *
     * Default: - false
     */
    override fun enableEcsManagedTags(): Boolean? = unwrap(this).getEnableEcsManagedTags()

    /**
     * Whether to enable execute command functionality for the containers in this task.
     *
     * If true, this enables execute command functionality on all containers in the task.
     *
     * Default: - false
     */
    override fun enableExecuteCommand(): Boolean? = unwrap(this).getEnableExecuteCommand()

    /**
     * Specifies an ECS task group for the task.
     *
     * Default: - No group
     */
    override fun group(): String? = unwrap(this).getGroup()

    /**
     * Input passed to the target.
     *
     * Default: - no input.
     */
    override fun input(): ScheduleTargetInput? =
        unwrap(this).getInput()?.let(ScheduleTargetInput::wrap)

    /**
     * The maximum age of a request that Scheduler sends to a target for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     */
    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    /**
     * The rules that must be met in order to place a task on a container instance.
     *
     * Default: - No placement constraints.
     */
    override fun placementConstraints(): List<PlacementConstraint> =
        unwrap(this).getPlacementConstraints()?.map(PlacementConstraint::wrap) ?: emptyList()

    /**
     * The algorithm for selecting container instances for task placement.
     *
     * Default: - No placement strategies.
     */
    override fun placementStrategies(): List<PlacementStrategy> =
        unwrap(this).getPlacementStrategies()?.map(PlacementStrategy::wrap) ?: emptyList()

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags are not propagated.
     *
     * Default: - No tag propagation
     */
    override fun propagateTags(): Boolean? = unwrap(this).getPropagateTags()

    /**
     * The reference ID to use for the task.
     *
     * Default: - No reference ID.
     */
    override fun referenceId(): String? = unwrap(this).getReferenceId()

    /**
     * The maximum number of times to retry when the target returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

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
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The security groups associated with the task.
     *
     * These security groups must all be in the same VPC.
     * Controls inbound and outbound network access for the task.
     *
     * Default: - The security group for the VPC is used.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No tags
     */
    override fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()

    /**
     * The number of tasks to create based on TaskDefinition.
     *
     * Default: 1
     */
    override fun taskCount(): Number? = unwrap(this).getTaskCount()

    /**
     * The task definition to use for scheduled tasks.
     *
     * Note: this must be TaskDefinition, and not ITaskDefinition,
     * as it requires properties that are not known for imported task definitions
     * If you want to run a RunTask with an imported task definition,
     * consider using a Universal target.
     */
    override fun taskDefinition(): TaskDefinition =
        unwrap(this).getTaskDefinition().let(TaskDefinition::wrap)

    /**
     * The subnets associated with the task.
     *
     * These subnets must all be in the same VPC.
     * The task will be launched in these subnets.
     *
     * Default: - all private subnets of the VPC are selected.
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Ec2TaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.Ec2TaskProps):
        Ec2TaskProps = CdkObjectWrappers.wrap(cdkObject) as? Ec2TaskProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ec2TaskProps):
        software.amazon.awscdk.services.scheduler.targets.Ec2TaskProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.scheduler.targets.Ec2TaskProps
  }
}
