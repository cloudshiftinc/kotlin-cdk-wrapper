@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A JobDefinition that uses ECS orchestration.
 *
 * Example:
 *
 * ```
 * IVpc vpc;
 * EcsJobDefinition ecsJob = EcsJobDefinition.Builder.create(this, "JobDefn")
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
 * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
 * .memory(Size.mebibytes(2048))
 * .cpu(256)
 * .build())
 * .build();
 * JobQueue queue = JobQueue.Builder.create(this, "JobQueue")
 * .computeEnvironments(List.of(OrderedComputeEnvironment.builder()
 * .computeEnvironment(ManagedEc2EcsComputeEnvironment.Builder.create(this, "managedEc2CE")
 * .vpc(vpc)
 * .build())
 * .order(1)
 * .build()))
 * .priority(10)
 * .build();
 * User user = new User(this, "MyUser");
 * ecsJob.grantSubmitJob(user, queue);
 * ```
 */
public open class EcsJobDefinition(
  cdkObject: software.amazon.awscdk.services.batch.EcsJobDefinition,
) : Resource(cdkObject), IJobDefinition {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EcsJobDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.batch.EcsJobDefinition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(EcsJobDefinitionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EcsJobDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, EcsJobDefinitionProps(props)
  )

  /**
   * Add a RetryStrategy to this JobDefinition.
   *
   * @param strategy 
   */
  public override fun addRetryStrategy(strategy: RetryStrategy) {
    unwrap(this).addRetryStrategy(strategy.let(RetryStrategy::unwrap))
  }

  /**
   * The container that this job will run.
   */
  public open fun container(): IEcsContainerDefinition =
      unwrap(this).getContainer().let(IEcsContainerDefinition::wrap)

  /**
   * Grants the `batch:submitJob` permission to the identity on both this job definition and the
   * `queue`.
   *
   * @param identity 
   * @param queue 
   */
  public open fun grantSubmitJob(identity: IGrantable, queue: IJobQueue) {
    unwrap(this).grantSubmitJob(identity.let(IGrantable::unwrap), queue.let(IJobQueue::unwrap))
  }

  /**
   * The ARN of this job definition.
   */
  public override fun jobDefinitionArn(): String = unwrap(this).getJobDefinitionArn()

  /**
   * The name of this job definition.
   */
  public override fun jobDefinitionName(): String = unwrap(this).getJobDefinitionName()

  /**
   * The default parameters passed to the container These parameters can be referenced in the
   * `command` that you give to the container.
   */
  public override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * Whether to propogate tags from the JobDefinition to the ECS task that Batch spawns.
   */
  public open fun propagateTags(): Boolean? = unwrap(this).getPropagateTags()

  /**
   * The number of times to retry a job.
   *
   * The job is retried on failure the same number of attempts as the value.
   */
  public override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

  /**
   * Defines the retry behavior for this job.
   */
  public override fun retryStrategies(): List<RetryStrategy> =
      unwrap(this).getRetryStrategies().map(RetryStrategy::wrap)

  /**
   * The priority of this Job.
   *
   * Only used in Fairshare Scheduling
   * to decide which job to run first when there are multiple jobs
   * with the same share identifier.
   */
  public override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

  /**
   * The timeout time for jobs that are submitted with this job definition.
   *
   * After the amount of time you specify passes,
   * Batch terminates your jobs if they aren't finished.
   */
  public override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.EcsJobDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The container that this job will run.
     *
     * @param container The container that this job will run. 
     */
    public fun container(container: IEcsContainerDefinition)

    /**
     * The name of this job definition.
     *
     * Default: - generated by CloudFormation
     *
     * @param jobDefinitionName The name of this job definition. 
     */
    public fun jobDefinitionName(jobDefinitionName: String)

    /**
     * The default parameters passed to the container These parameters can be referenced in the
     * `command` that you give to the container.
     *
     * Default: none
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html#parameters)
     * @param parameters The default parameters passed to the container These parameters can be
     * referenced in the `command` that you give to the container. 
     */
    public fun parameters(parameters: Map<String, Any>)

    /**
     * Whether to propogate tags from the JobDefinition to the ECS task that Batch spawns.
     *
     * Default: false
     *
     * @param propagateTags Whether to propogate tags from the JobDefinition to the ECS task that
     * Batch spawns. 
     */
    public fun propagateTags(propagateTags: Boolean)

    /**
     * The number of times to retry a job.
     *
     * The job is retried on failure the same number of attempts as the value.
     *
     * Default: 1
     *
     * @param retryAttempts The number of times to retry a job. 
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * Defines the retry behavior for this job.
     *
     * Default: - no `RetryStrategy`
     *
     * @param retryStrategies Defines the retry behavior for this job. 
     */
    public fun retryStrategies(retryStrategies: List<RetryStrategy>)

    /**
     * Defines the retry behavior for this job.
     *
     * Default: - no `RetryStrategy`
     *
     * @param retryStrategies Defines the retry behavior for this job. 
     */
    public fun retryStrategies(vararg retryStrategies: RetryStrategy)

    /**
     * The priority of this Job.
     *
     * Only used in Fairshare Scheduling
     * to decide which job to run first when there are multiple jobs
     * with the same share identifier.
     *
     * Default: none
     *
     * @param schedulingPriority The priority of this Job. 
     */
    public fun schedulingPriority(schedulingPriority: Number)

    /**
     * The timeout time for jobs that are submitted with this job definition.
     *
     * After the amount of time you specify passes,
     * Batch terminates your jobs if they aren't finished.
     *
     * Default: - no timeout
     *
     * @param timeout The timeout time for jobs that are submitted with this job definition. 
     */
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EcsJobDefinition.Builder =
        software.amazon.awscdk.services.batch.EcsJobDefinition.Builder.create(scope, id)

    /**
     * The container that this job will run.
     *
     * @param container The container that this job will run. 
     */
    override fun container(container: IEcsContainerDefinition) {
      cdkBuilder.container(container.let(IEcsContainerDefinition::unwrap))
    }

    /**
     * The name of this job definition.
     *
     * Default: - generated by CloudFormation
     *
     * @param jobDefinitionName The name of this job definition. 
     */
    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /**
     * The default parameters passed to the container These parameters can be referenced in the
     * `command` that you give to the container.
     *
     * Default: none
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html#parameters)
     * @param parameters The default parameters passed to the container These parameters can be
     * referenced in the `command` that you give to the container. 
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * Whether to propogate tags from the JobDefinition to the ECS task that Batch spawns.
     *
     * Default: false
     *
     * @param propagateTags Whether to propogate tags from the JobDefinition to the ECS task that
     * Batch spawns. 
     */
    override fun propagateTags(propagateTags: Boolean) {
      cdkBuilder.propagateTags(propagateTags)
    }

    /**
     * The number of times to retry a job.
     *
     * The job is retried on failure the same number of attempts as the value.
     *
     * Default: 1
     *
     * @param retryAttempts The number of times to retry a job. 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * Defines the retry behavior for this job.
     *
     * Default: - no `RetryStrategy`
     *
     * @param retryStrategies Defines the retry behavior for this job. 
     */
    override fun retryStrategies(retryStrategies: List<RetryStrategy>) {
      cdkBuilder.retryStrategies(retryStrategies.map(RetryStrategy::unwrap))
    }

    /**
     * Defines the retry behavior for this job.
     *
     * Default: - no `RetryStrategy`
     *
     * @param retryStrategies Defines the retry behavior for this job. 
     */
    override fun retryStrategies(vararg retryStrategies: RetryStrategy): Unit =
        retryStrategies(retryStrategies.toList())

    /**
     * The priority of this Job.
     *
     * Only used in Fairshare Scheduling
     * to decide which job to run first when there are multiple jobs
     * with the same share identifier.
     *
     * Default: none
     *
     * @param schedulingPriority The priority of this Job. 
     */
    override fun schedulingPriority(schedulingPriority: Number) {
      cdkBuilder.schedulingPriority(schedulingPriority)
    }

    /**
     * The timeout time for jobs that are submitted with this job definition.
     *
     * After the amount of time you specify passes,
     * Batch terminates your jobs if they aren't finished.
     *
     * Default: - no timeout
     *
     * @param timeout The timeout time for jobs that are submitted with this job definition. 
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.EcsJobDefinition = cdkBuilder.build()
  }

  public companion object {
    public fun fromJobDefinitionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      jobDefinitionArn: String,
    ): IJobDefinition =
        software.amazon.awscdk.services.batch.EcsJobDefinition.fromJobDefinitionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, jobDefinitionArn).let(IJobDefinition::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EcsJobDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EcsJobDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EcsJobDefinition):
        EcsJobDefinition = EcsJobDefinition(cdkObject)

    internal fun unwrap(wrapped: EcsJobDefinition):
        software.amazon.awscdk.services.batch.EcsJobDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.batch.EcsJobDefinition
  }
}
