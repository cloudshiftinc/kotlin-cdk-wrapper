@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.events.targets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ecs.FargatePlatformVersion
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.ITaskDefinition
import software.amazon.awscdk.services.ecs.LaunchType
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.events.targets.ContainerOverride
import software.amazon.awscdk.services.events.targets.EcsTask
import software.amazon.awscdk.services.events.targets.Tag
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Start a task on an ECS cluster.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.ec2.*;
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
@CdkDslMarker
public class EcsTaskDsl {
    private val cdkBuilder: EcsTask.Builder = EcsTask.Builder.create()

    private val _containerOverrides: MutableList<ContainerOverride> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    private val _tags: MutableList<Tag> = mutableListOf()

    /**
     * Specifies whether the task's elastic network interface receives a public IP address.
     *
     * You can specify true only when LaunchType is set to FARGATE.
     *
     * Default: - true if the subnet type is PUBLIC, otherwise false
     *
     * @param assignPublicIp Specifies whether the task's elastic network interface receives a
     *   public IP address.
     */
    public fun assignPublicIp(assignPublicIp: Boolean) {
        cdkBuilder.assignPublicIp(assignPublicIp)
    }

    /**
     * Cluster where service will be deployed.
     *
     * @param cluster Cluster where service will be deployed.
     */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * Container setting overrides.
     *
     * Key is the name of the container to override, value is the values you want to override.
     *
     * @param containerOverrides Container setting overrides.
     */
    public fun containerOverrides(containerOverrides: ContainerOverrideDsl.() -> Unit) {
        _containerOverrides.add(ContainerOverrideDsl().apply(containerOverrides).build())
    }

    /**
     * Container setting overrides.
     *
     * Key is the name of the container to override, value is the values you want to override.
     *
     * @param containerOverrides Container setting overrides.
     */
    public fun containerOverrides(containerOverrides: Collection<ContainerOverride>) {
        _containerOverrides.addAll(containerOverrides)
    }

    /**
     * The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time, depending on the retry policy of the target. If an event is not delivered before all
     * retry attempts are exhausted, it will be sent to the dead letter queue.
     *
     * Default: - no dead-letter queue
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     *   [considerations for using a dead-letter queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /**
     * Whether or not to enable the execute command functionality for the containers in this task.
     *
     * If true, this enables execute command functionality on all containers in the task.
     *
     * Default: - false
     *
     * @param enableExecuteCommand Whether or not to enable the execute command functionality for
     *   the containers in this task.
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * Specifies the launch type on which your task is running.
     *
     * The launch type that you specify here must match one of the launch type (compatibilities) of
     * the target task.
     *
     * Default: - 'EC2' if `isEc2Compatible` for the `taskDefinition` is true, otherwise 'FARGATE'
     *
     * @param launchType Specifies the launch type on which your task is running.
     */
    public fun launchType(launchType: LaunchType) {
        cdkBuilder.launchType(launchType)
    }

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60. Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     *   processing.
     */
    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    /**
     * The platform version on which to run your task.
     *
     * Unless you have specific compatibility requirements, you don't need to specify this.
     *
     * Default: - ECS will set the Fargate platform version to 'LATEST'
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     *
     * @param platformVersion The platform version on which to run your task.
     */
    public fun platformVersion(platformVersion: FargatePlatformVersion) {
        cdkBuilder.platformVersion(platformVersion)
    }

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags are not propagated.
     *
     * Default: - Tags will not be propagated
     *
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     *   task.
     */
    public fun propagateTags(propagateTags: PropagatedTagSource) {
        cdkBuilder.propagateTags(propagateTags)
    }

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0. Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     */
    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * Existing IAM role to run the ECS task.
     *
     * Default: A new IAM role is created
     *
     * @param role Existing IAM role to run the ECS task.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
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
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
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
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
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
    public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnetSelection)
        cdkBuilder.subnetSelection(builder.build())
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
    public fun subnetSelection(subnetSelection: SubnetSelection) {
        cdkBuilder.subnetSelection(subnetSelection)
    }

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No additional tags are applied to the task
     *
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     */
    public fun tags(tags: TagDsl.() -> Unit) {
        _tags.add(TagDsl().apply(tags).build())
    }

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No additional tags are applied to the task
     *
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     */
    public fun tags(tags: Collection<Tag>) {
        _tags.addAll(tags)
    }

    /**
     * How many tasks should be started when this event is triggered.
     *
     * Default: 1
     *
     * @param taskCount How many tasks should be started when this event is triggered.
     */
    public fun taskCount(taskCount: Number) {
        cdkBuilder.taskCount(taskCount)
    }

    /**
     * Task Definition of the task that should be started.
     *
     * @param taskDefinition Task Definition of the task that should be started.
     */
    public fun taskDefinition(taskDefinition: ITaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun build(): EcsTask {
        if (_containerOverrides.isNotEmpty()) cdkBuilder.containerOverrides(_containerOverrides)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
