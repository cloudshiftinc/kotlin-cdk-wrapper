@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Represents a JobDefinition.
 */
public interface IJobDefinition : IResource {
  /**
   * Add a RetryStrategy to this JobDefinition.
   *
   * @param strategy 
   */
  public fun addRetryStrategy(strategy: RetryStrategy)

  /**
   * The ARN of this job definition.
   */
  public fun jobDefinitionArn(): String

  /**
   * The name of this job definition.
   */
  public fun jobDefinitionName(): String

  /**
   * The default parameters passed to the container These parameters can be referenced in the
   * `command` that you give to the container.
   *
   * Default: none
   *
   * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html#parameters)
   */
  public fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * The number of times to retry a job.
   *
   * The job is retried on failure the same number of attempts as the value.
   *
   * Default: 1
   */
  public fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

  /**
   * Defines the retry behavior for this job.
   *
   * Default: - no `RetryStrategy`
   */
  public fun retryStrategies(): List<RetryStrategy>

  /**
   * The priority of this Job.
   *
   * Only used in Fairshare Scheduling
   * to decide which job to run first when there are multiple jobs
   * with the same share identifier.
   *
   * Default: none
   */
  public fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

  /**
   * The timeout time for jobs that are submitted with this job definition.
   *
   * After the amount of time you specify passes,
   * Batch terminates your jobs if they aren't finished.
   *
   * Default: - no timeout
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IJobDefinition):
        IJobDefinition = CdkObjectWrappers.wrap(cdkObject) as IJobDefinition

    internal fun unwrap(wrapped: IJobDefinition):
        software.amazon.awscdk.services.batch.IJobDefinition = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.IJobDefinition
  }
}
