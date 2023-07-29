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

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
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
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps
import software.amazon.awscdk.services.events.targets.Tag

/**
 * The properties for the ScheduledEc2Task task.
 *
 * Example:
 * ```
 * // Instantiate an Amazon EC2 Task to run at a scheduled interval
 * Cluster cluster;
 * ScheduledEc2Task ecsScheduledTask = ScheduledEc2Task.Builder.create(this, "ScheduledTask")
 * .cluster(cluster)
 * .scheduledEc2TaskImageOptions(ScheduledEc2TaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .memoryLimitMiB(256)
 * .environment(Map.of("name", "TRIGGER", "value", "CloudWatch Events"))
 * .build())
 * .schedule(Schedule.expression("rate(1 minute)"))
 * .enabled(true)
 * .ruleName("sample-scheduled-task-rule")
 * .build();
 * ```
 */
@CdkDslMarker
public class ScheduledEc2TaskPropsDsl {
    private val cdkBuilder: ScheduledEc2TaskProps.Builder = ScheduledEc2TaskProps.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    private val _tags: MutableList<Tag> = mutableListOf()

    /**
     * @param cluster The name of the cluster that hosts the service. If a cluster is specified, the
     *   vpc construct should be omitted. Alternatively, you can omit both cluster and vpc.
     */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * @param desiredTaskCount The desired number of instantiations of the task definition to keep
     *   running on the service.
     */
    public fun desiredTaskCount(desiredTaskCount: Number) {
        cdkBuilder.desiredTaskCount(desiredTaskCount)
    }

    /** @param enabled Indicates whether the rule is enabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     *   task. If no value is specified, the tags are not propagated.
     */
    public fun propagateTags(propagateTags: PropagatedTagSource) {
        cdkBuilder.propagateTags(propagateTags)
    }

    /** @param ruleName A name for the rule. */
    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    /**
     * @param schedule The schedule or rate (frequency) that determines when CloudWatch Events runs
     *   the rule. For more information, see
     *   [Schedule Expression Syntax for Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html)
     *   in the Amazon CloudWatch User Guide.
     */
    public fun schedule(schedule: Schedule) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * @param scheduledEc2TaskDefinitionOptions The properties to define if using an existing
     *   TaskDefinition in this construct. ScheduledEc2TaskDefinitionOptions or
     *   ScheduledEc2TaskImageOptions must be defined, but not both.
     */
    public fun scheduledEc2TaskDefinitionOptions(
        scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptionsDsl.() -> Unit = {}
    ) {
        val builder = ScheduledEc2TaskDefinitionOptionsDsl()
        builder.apply(scheduledEc2TaskDefinitionOptions)
        cdkBuilder.scheduledEc2TaskDefinitionOptions(builder.build())
    }

    /**
     * @param scheduledEc2TaskDefinitionOptions The properties to define if using an existing
     *   TaskDefinition in this construct. ScheduledEc2TaskDefinitionOptions or
     *   ScheduledEc2TaskImageOptions must be defined, but not both.
     */
    public fun scheduledEc2TaskDefinitionOptions(
        scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions
    ) {
        cdkBuilder.scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions)
    }

    /**
     * @param scheduledEc2TaskImageOptions The properties to define if the construct is to create a
     *   TaskDefinition. ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be
     *   defined, but not both.
     */
    public fun scheduledEc2TaskImageOptions(
        scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptionsDsl.() -> Unit = {}
    ) {
        val builder = ScheduledEc2TaskImageOptionsDsl()
        builder.apply(scheduledEc2TaskImageOptions)
        cdkBuilder.scheduledEc2TaskImageOptions(builder.build())
    }

    /**
     * @param scheduledEc2TaskImageOptions The properties to define if the construct is to create a
     *   TaskDefinition. ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be
     *   defined, but not both.
     */
    public fun scheduledEc2TaskImageOptions(
        scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions
    ) {
        cdkBuilder.scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions)
    }

    /** @param securityGroups Existing security groups to use for your service. */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups Existing security groups to use for your service. */
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

    /**
     * @param vpc The VPC where the container instances will be launched or the elastic network
     *   interfaces (ENIs) will be deployed. If a vpc is specified, the cluster construct should be
     *   omitted. Alternatively, you can omit both vpc and cluster.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ScheduledEc2TaskProps {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
