package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.events.targets.Tag
import io.cloudshiftdev.constructs.Construct
import kotlin.Number
import kotlin.collections.List

public abstract class ScheduledTaskBase
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBase,
) : Construct(cdkObject) {
    /** The name of the cluster that hosts the service. */
    public open fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    /**
     * The desired number of instantiations of the task definition to keep running on the service.
     *
     * The minimum value is 1
     */
    public open fun desiredTaskCount(): Number = unwrap(this).getDesiredTaskCount()

    /** The CloudWatch Events rule for the service. */
    public open fun eventRule(): Rule = unwrap(this).getEventRule().let(Rule::wrap)

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags are not propagated.
     *
     * Default: - Tags will not be propagated
     */
    public open fun propagateTags(): PropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

    /**
     * In what subnets to place the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: Private subnets
     */
    public open fun subnetSelection(): SubnetSelection =
        unwrap(this).getSubnetSelection().let(SubnetSelection::wrap)

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No tags are applied to the task
     */
    public open fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBase,
    ) : ScheduledTaskBase(cdkObject)

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBase
        ): ScheduledTaskBase = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ScheduledTaskBase
        ): software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBase =
            (wrapped as Wrapper).cdkObject
    }
}
