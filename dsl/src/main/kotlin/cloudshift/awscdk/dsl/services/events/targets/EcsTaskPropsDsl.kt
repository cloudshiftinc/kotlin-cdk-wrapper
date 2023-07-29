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

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
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
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.events.targets.ContainerOverride
import software.amazon.awscdk.services.events.targets.EcsTaskProps
import software.amazon.awscdk.services.events.targets.Tag
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Properties to define an ECS Event Task.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.ecs.*;
 * ICluster cluster;
 * TaskDefinition taskDefinition;
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.hours(1)))
 * .build();
 * rule.addTarget(EcsTask.Builder.create()
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .taskCount(1)
 * .containerOverrides(List.of(ContainerOverride.builder()
 * .containerName("TheContainer")
 * .command(List.of("echo", EventField.fromPath("$.detail.event")))
 * .build()))
 * .enableExecuteCommand(true)
 * .build());
 * ```
 */
@CdkDslMarker
public class EcsTaskPropsDsl {
    private val cdkBuilder: EcsTaskProps.Builder = EcsTaskProps.builder()

    private val _containerOverrides: MutableList<ContainerOverride> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    private val _tags: MutableList<Tag> = mutableListOf()

    /**
     * @param assignPublicIp Specifies whether the task's elastic network interface receives a
     *   public IP address. You can specify true only when LaunchType is set to FARGATE.
     */
    public fun assignPublicIp(assignPublicIp: Boolean) {
        cdkBuilder.assignPublicIp(assignPublicIp)
    }

    /** @param cluster Cluster where service will be deployed. */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * @param containerOverrides Container setting overrides. Key is the name of the container to
     *   override, value is the values you want to override.
     */
    public fun containerOverrides(containerOverrides: ContainerOverrideDsl.() -> Unit) {
        _containerOverrides.add(ContainerOverrideDsl().apply(containerOverrides).build())
    }

    /**
     * @param containerOverrides Container setting overrides. Key is the name of the container to
     *   override, value is the values you want to override.
     */
    public fun containerOverrides(containerOverrides: Collection<ContainerOverride>) {
        _containerOverrides.addAll(containerOverrides)
    }

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     *   [considerations for using a dead-letter queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *   The events not successfully delivered are automatically retried for a specified period of
     *   time, depending on the retry policy of the target. If an event is not delivered before all
     *   retry attempts are exhausted, it will be sent to the dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /**
     * @param enableExecuteCommand Whether or not to enable the execute command functionality for
     *   the containers in this task. If true, this enables execute command functionality on all
     *   containers in the task.
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     *   processing. Minimum value of 60. Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    /**
     * @param platformVersion The platform version on which to run your task. Unless you have
     *   specific compatibility requirements, you don't need to specify this.
     */
    public fun platformVersion(platformVersion: FargatePlatformVersion) {
        cdkBuilder.platformVersion(platformVersion)
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     *   task. If no value is specified, the tags are not propagated.
     */
    public fun propagateTags(propagateTags: PropagatedTagSource) {
        cdkBuilder.propagateTags(propagateTags)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     *   Minimum value of 0. Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    /** @param role Existing IAM role to run the ECS task. */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param securityGroups Existing security groups to use for the task's ENIs. (Only applicable
     *   in case the TaskDefinition is configured for AwsVpc networking)
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups Existing security groups to use for the task's ENIs. (Only applicable
     *   in case the TaskDefinition is configured for AwsVpc networking)
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * @param subnetSelection In what subnets to place the task's ENIs. (Only applicable in case the
     *   TaskDefinition is configured for AwsVpc networking)
     */
    public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnetSelection)
        cdkBuilder.subnetSelection(builder.build())
    }

    /**
     * @param subnetSelection In what subnets to place the task's ENIs. (Only applicable in case the
     *   TaskDefinition is configured for AwsVpc networking)
     */
    public fun subnetSelection(subnetSelection: SubnetSelection) {
        cdkBuilder.subnetSelection(subnetSelection)
    }

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     *   Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(tags: TagDsl.() -> Unit) {
        _tags.add(TagDsl().apply(tags).build())
    }

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     *   Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(tags: Collection<Tag>) {
        _tags.addAll(tags)
    }

    /** @param taskCount How many tasks should be started when this event is triggered. */
    public fun taskCount(taskCount: Number) {
        cdkBuilder.taskCount(taskCount)
    }

    /** @param taskDefinition Task Definition of the task that should be started. */
    public fun taskDefinition(taskDefinition: ITaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun build(): EcsTaskProps {
        if (_containerOverrides.isNotEmpty()) cdkBuilder.containerOverrides(_containerOverrides)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
