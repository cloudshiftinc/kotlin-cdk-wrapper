@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a Scheduling Policy.
 *
 * Scheduling Policies tell the Batch
 * Job Scheduler how to schedule incoming jobs.
 */
public interface ISchedulingPolicy : IResource {
  /**
   * The arn of this scheduling policy.
   */
  public fun schedulingPolicyArn(): String

  /**
   * The name of this scheduling policy.
   */
  public fun schedulingPolicyName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.ISchedulingPolicy):
        ISchedulingPolicy = CdkObjectWrappers.wrap(cdkObject) as ISchedulingPolicy

    internal fun unwrap(wrapped: ISchedulingPolicy):
        software.amazon.awscdk.services.batch.ISchedulingPolicy = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.batch.ISchedulingPolicy
  }
}
