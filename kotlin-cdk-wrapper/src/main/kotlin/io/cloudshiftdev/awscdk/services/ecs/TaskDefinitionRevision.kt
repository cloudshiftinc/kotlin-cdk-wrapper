@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String

/**
 * Represents revision of a task definition, either a specific numbered revision or the `latest`
 * revision.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * ExternalService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .desiredCount(5)
 * .taskDefinitionRevision(TaskDefinitionRevision.of(1))
 * .build();
 * ExternalService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .desiredCount(5)
 * .taskDefinitionRevision(TaskDefinitionRevision.LATEST)
 * .build();
 * ```
 */
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
