package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Number
import kotlin.String

public open class TaskDefinitionRevision internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.TaskDefinitionRevision,
) : CdkObject(cdkObject) {
  /**
   * The string representation of this revision.
   */
  public open fun revision(): String = unwrap(this).getRevision()

  public companion object {
    public val LATEST: TaskDefinitionRevision =
        TaskDefinitionRevision.wrap(software.amazon.awscdk.services.ecs.TaskDefinitionRevision.LATEST)

    public fun of(revision: Number): TaskDefinitionRevision =
        software.amazon.awscdk.services.ecs.TaskDefinitionRevision.of(revision).let(TaskDefinitionRevision::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.TaskDefinitionRevision):
        TaskDefinitionRevision = TaskDefinitionRevision(cdkObject)

    internal fun unwrap(wrapped: TaskDefinitionRevision):
        software.amazon.awscdk.services.ecs.TaskDefinitionRevision = wrapped.cdkObject
  }
}
