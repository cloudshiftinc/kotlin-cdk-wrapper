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
import cloudshift.awscdk.dsl.services.events.targets.TagDsl
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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ScheduledEc2TaskPropsDsl {
    private val cdkBuilder: ScheduledEc2TaskProps.Builder = ScheduledEc2TaskProps.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    private val _tags: MutableList<Tag> = mutableListOf()

    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun desiredTaskCount(desiredTaskCount: Number) {
        cdkBuilder.desiredTaskCount(desiredTaskCount)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun propagateTags(propagateTags: PropagatedTagSource) {
        cdkBuilder.propagateTags(propagateTags)
    }

    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    public fun schedule(schedule: Schedule) {
        cdkBuilder.schedule(schedule)
    }

    public fun scheduledEc2TaskDefinitionOptions(
        block: ScheduledEc2TaskDefinitionOptionsDsl.() -> Unit =
            {},
    ) {
        val builder = ScheduledEc2TaskDefinitionOptionsDsl()
        builder.apply(block)
        cdkBuilder.scheduledEc2TaskDefinitionOptions(builder.build())
    }

    public fun scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions) {
        cdkBuilder.scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions)
    }

    public fun scheduledEc2TaskImageOptions(block: ScheduledEc2TaskImageOptionsDsl.() -> Unit = {}) {
        val builder = ScheduledEc2TaskImageOptionsDsl()
        builder.apply(block)
        cdkBuilder.scheduledEc2TaskImageOptions(builder.build())
    }

    public fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions) {
        cdkBuilder.scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions)
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

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ScheduledEc2TaskProps {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
