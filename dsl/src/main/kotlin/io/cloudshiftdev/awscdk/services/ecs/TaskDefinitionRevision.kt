package io.cloudshiftdev.awscdk.services.ecs

import kotlin.Number
import kotlin.String

public open class TaskDefinitionRevision internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.TaskDefinitionRevision,
) {
  public open fun revision(): String = unwrap(this).getRevision()

  public companion object {
    public open fun of(revision: Number): TaskDefinitionRevision =
        software.amazon.awscdk.services.ecs.TaskDefinitionRevision.of(revision).let(TaskDefinitionRevision::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.TaskDefinitionRevision):
        TaskDefinitionRevision = TaskDefinitionRevision(cdkObject)

    internal fun unwrap(wrapped: TaskDefinitionRevision):
        software.amazon.awscdk.services.ecs.TaskDefinitionRevision = wrapped.cdkObject
  }
}
