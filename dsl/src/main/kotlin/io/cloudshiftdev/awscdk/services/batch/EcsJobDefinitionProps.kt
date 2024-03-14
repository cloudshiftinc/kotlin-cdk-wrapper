package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface EcsJobDefinitionProps : JobDefinitionProps {
  /**
   * The container that this job will run.
   */
  public fun container(): IEcsContainerDefinition

  /**
   * Whether to propogate tags from the JobDefinition to the ECS task that Batch spawns.
   *
   * Default: false
   */
  public fun propagateTags(): Boolean? = unwrap(this).getPropagateTags()

  /**
   * A builder for [EcsJobDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param container The container that this job will run. 
     */
    public fun container(container: IEcsContainerDefinition)

    /**
     * @param jobDefinitionName The name of this job definition.
     */
    public fun jobDefinitionName(jobDefinitionName: String)

    /**
     * @param parameters The default parameters passed to the container These parameters can be
     * referenced in the `command` that you give to the container.
     */
    public fun parameters(parameters: Map<String, Any>)

    /**
     * @param propagateTags Whether to propogate tags from the JobDefinition to the ECS task that
     * Batch spawns.
     */
    public fun propagateTags(propagateTags: Boolean)

    /**
     * @param retryAttempts The number of times to retry a job.
     * The job is retried on failure the same number of attempts as the value.
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * @param retryStrategies Defines the retry behavior for this job.
     */
    public fun retryStrategies(retryStrategies: List<RetryStrategy>)

    /**
     * @param retryStrategies Defines the retry behavior for this job.
     */
    public fun retryStrategies(vararg retryStrategies: RetryStrategy)

    /**
     * @param schedulingPriority The priority of this Job.
     * Only used in Fairshare Scheduling
     * to decide which job to run first when there are multiple jobs
     * with the same share identifier.
     */
    public fun schedulingPriority(schedulingPriority: Number)

    /**
     * @param timeout The timeout time for jobs that are submitted with this job definition.
     * After the amount of time you specify passes,
     * Batch terminates your jobs if they aren't finished.
     */
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EcsJobDefinitionProps.Builder =
        software.amazon.awscdk.services.batch.EcsJobDefinitionProps.builder()

    /**
     * @param container The container that this job will run. 
     */
    override fun container(container: IEcsContainerDefinition) {
      cdkBuilder.container(container.let(IEcsContainerDefinition::unwrap))
    }

    /**
     * @param jobDefinitionName The name of this job definition.
     */
    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /**
     * @param parameters The default parameters passed to the container These parameters can be
     * referenced in the `command` that you give to the container.
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param propagateTags Whether to propogate tags from the JobDefinition to the ECS task that
     * Batch spawns.
     */
    override fun propagateTags(propagateTags: Boolean) {
      cdkBuilder.propagateTags(propagateTags)
    }

    /**
     * @param retryAttempts The number of times to retry a job.
     * The job is retried on failure the same number of attempts as the value.
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param retryStrategies Defines the retry behavior for this job.
     */
    override fun retryStrategies(retryStrategies: List<RetryStrategy>) {
      cdkBuilder.retryStrategies(retryStrategies.map(RetryStrategy::unwrap))
    }

    /**
     * @param retryStrategies Defines the retry behavior for this job.
     */
    override fun retryStrategies(vararg retryStrategies: RetryStrategy): Unit =
        retryStrategies(retryStrategies.toList())

    /**
     * @param schedulingPriority The priority of this Job.
     * Only used in Fairshare Scheduling
     * to decide which job to run first when there are multiple jobs
     * with the same share identifier.
     */
    override fun schedulingPriority(schedulingPriority: Number) {
      cdkBuilder.schedulingPriority(schedulingPriority)
    }

    /**
     * @param timeout The timeout time for jobs that are submitted with this job definition.
     * After the amount of time you specify passes,
     * Batch terminates your jobs if they aren't finished.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.EcsJobDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.EcsJobDefinitionProps,
  ) : CdkObject(cdkObject), EcsJobDefinitionProps {
    /**
     * The container that this job will run.
     */
    override fun container(): IEcsContainerDefinition =
        unwrap(this).getContainer().let(IEcsContainerDefinition::wrap)

    /**
     * The name of this job definition.
     *
     * Default: - generated by CloudFormation
     */
    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    /**
     * The default parameters passed to the container These parameters can be referenced in the
     * `command` that you give to the container.
     *
     * Default: none
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html#parameters)
     */
    override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

    /**
     * Whether to propogate tags from the JobDefinition to the ECS task that Batch spawns.
     *
     * Default: false
     */
    override fun propagateTags(): Boolean? = unwrap(this).getPropagateTags()

    /**
     * The number of times to retry a job.
     *
     * The job is retried on failure the same number of attempts as the value.
     *
     * Default: 1
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    /**
     * Defines the retry behavior for this job.
     *
     * Default: - no `RetryStrategy`
     */
    override fun retryStrategies(): List<RetryStrategy> =
        unwrap(this).getRetryStrategies()?.map(RetryStrategy::wrap) ?: emptyList()

    /**
     * The priority of this Job.
     *
     * Only used in Fairshare Scheduling
     * to decide which job to run first when there are multiple jobs
     * with the same share identifier.
     *
     * Default: none
     */
    override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

    /**
     * The timeout time for jobs that are submitted with this job definition.
     *
     * After the amount of time you specify passes,
     * Batch terminates your jobs if they aren't finished.
     *
     * Default: - no timeout
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsJobDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EcsJobDefinitionProps):
        EcsJobDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsJobDefinitionProps):
        software.amazon.awscdk.services.batch.EcsJobDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.EcsJobDefinitionProps
  }
}
