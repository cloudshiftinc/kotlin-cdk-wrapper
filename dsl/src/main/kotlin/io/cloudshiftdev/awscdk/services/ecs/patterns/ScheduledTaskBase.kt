package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.events.targets.Tag
import io.cloudshiftdev.constructs.Construct
import kotlin.Number
import kotlin.collections.List

public abstract class ScheduledTaskBase internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBase,
) : Construct(cdkObject) {
  public open fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

  public open fun desiredTaskCount(): Number = unwrap(this).getDesiredTaskCount()

  public open fun eventRule(): Rule = unwrap(this).getEventRule().let(Rule::wrap)

  public open fun propagateTags(): PropagatedTagSource? =
      unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

  public open fun subnetSelection(): SubnetSelection =
      unwrap(this).getSubnetSelection().let(SubnetSelection::wrap)

  public open fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBase,
  ) : ScheduledTaskBase(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBase):
        ScheduledTaskBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduledTaskBase):
        software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBase = (wrapped as
        Wrapper).cdkObject
  }
}
