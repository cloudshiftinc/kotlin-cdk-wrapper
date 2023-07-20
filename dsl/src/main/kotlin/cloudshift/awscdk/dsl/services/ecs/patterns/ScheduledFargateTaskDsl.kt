@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.ecs.RuntimePlatformDsl
import cloudshift.awscdk.dsl.services.events.targets.TagDsl
import software.amazon.awscdk.services.applicationautoscaling.Schedule
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ecs.FargatePlatformVersion
import software.amazon.awscdk.services.ecs.FargateTaskDefinition
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.RuntimePlatform
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskImageOptions
import software.amazon.awscdk.services.events.targets.Tag
import software.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ScheduledFargateTaskDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ScheduledFargateTask.Builder = ScheduledFargateTask.Builder.create(
        scope,
        id,
    )

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    private val _tags: MutableList<Tag> = mutableListOf()

    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
    }

    public fun desiredTaskCount(desiredTaskCount: Number) {
        cdkBuilder.desiredTaskCount(desiredTaskCount)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
        cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    public fun platformVersion(platformVersion: FargatePlatformVersion) {
        cdkBuilder.platformVersion(platformVersion)
    }

    public fun propagateTags(propagateTags: PropagatedTagSource) {
        cdkBuilder.propagateTags(propagateTags)
    }

    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    public fun runtimePlatform(block: RuntimePlatformDsl.() -> Unit = {}) {
        val builder = RuntimePlatformDsl()
        builder.apply(block)
        cdkBuilder.runtimePlatform(builder.build())
    }

    public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
        cdkBuilder.runtimePlatform(runtimePlatform)
    }

    public fun schedule(schedule: Schedule) {
        cdkBuilder.schedule(schedule)
    }

    public fun scheduledFargateTaskDefinitionOptions(
        block: ScheduledFargateTaskDefinitionOptionsDsl.() -> Unit =
            {},
    ) {
        val builder = ScheduledFargateTaskDefinitionOptionsDsl()
        builder.apply(block)
        cdkBuilder.scheduledFargateTaskDefinitionOptions(builder.build())
    }

    public fun scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptions) {
        cdkBuilder.scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions)
    }

    public fun scheduledFargateTaskImageOptions(
        block: ScheduledFargateTaskImageOptionsDsl.() -> Unit =
            {},
    ) {
        val builder = ScheduledFargateTaskImageOptionsDsl()
        builder.apply(block)
        cdkBuilder.scheduledFargateTaskImageOptions(builder.build())
    }

    public fun scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions) {
        cdkBuilder.scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions)
    }

    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun subnetSelection(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.subnetSelection(builder.build())
    }

    public fun subnetSelection(subnetSelection: SubnetSelection) {
        cdkBuilder.subnetSelection(subnetSelection)
    }

    public fun tags(tags: TagDsl.() -> Unit) {
        _tags.add(TagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<Tag>) {
        _tags.addAll(tags)
    }

    public fun taskDefinition(taskDefinition: FargateTaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ScheduledFargateTask {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
