@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Props to configure a MultiNodeJobDefinition.
 *
 * Example:
 *
 * ```
 * MultiNodeJobDefinition multiNodeJob = MultiNodeJobDefinition.Builder.create(this,
 * "JobDefinition")
 * .instanceType(InstanceType.of(InstanceClass.R4, InstanceSize.LARGE)) // optional, omit to let
 * Batch choose the type for you
 * .containers(List.of(MultiNodeContainer.builder()
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "mainMPIContainer")
 * .image(ContainerImage.fromRegistry("yourregsitry.com/yourMPIImage:latest"))
 * .cpu(256)
 * .memory(Size.mebibytes(2048))
 * .build())
 * .startNode(0)
 * .endNode(5)
 * .build()))
 * .build();
 * // convenience method
 * multiNodeJob.addContainer(MultiNodeContainer.builder()
 * .startNode(6)
 * .endNode(10)
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "multiContainer")
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .cpu(256)
 * .memory(Size.mebibytes(2048))
 * .build())
 * .build());
 * ```
 */
public interface MultiNodeJobDefinitionProps : JobDefinitionProps {
  /**
   * The containers that this multinode job will run.
   *
   * Default: none
   *
   * [Documentation](https://aws.amazon.com/blogs/compute/building-a-tightly-coupled-molecular-dynamics-workflow-with-multi-node-parallel-jobs-in-aws-batch/)
   */
  public fun containers(): List<MultiNodeContainer> =
      unwrap(this).getContainers()?.map(MultiNodeContainer::wrap) ?: emptyList()

  /**
   * The instance type that this job definition will run.
   *
   * Default: - optimal instance, selected by Batch
   */
  public fun instanceType(): InstanceType? = unwrap(this).getInstanceType()?.let(InstanceType::wrap)

  /**
   * The index of the main node in this job.
   *
   * The main node is responsible for orchestration.
   *
   * Default: 0
   */
  public fun mainNode(): Number? = unwrap(this).getMainNode()

  /**
   * Whether to propagate tags from the JobDefinition to the ECS task that Batch spawns.
   *
   * Default: false
   */
  public fun propagateTags(): Boolean? = unwrap(this).getPropagateTags()

  /**
   * A builder for [MultiNodeJobDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containers The containers that this multinode job will run.
     */
    public fun containers(containers: List<MultiNodeContainer>)

    /**
     * @param containers The containers that this multinode job will run.
     */
    public fun containers(vararg containers: MultiNodeContainer)

    /**
     * @param instanceType The instance type that this job definition will run.
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * @param jobDefinitionName The name of this job definition.
     */
    public fun jobDefinitionName(jobDefinitionName: String)

    /**
     * @param mainNode The index of the main node in this job.
     * The main node is responsible for orchestration.
     */
    public fun mainNode(mainNode: Number)

    /**
     * @param parameters The default parameters passed to the container These parameters can be
     * referenced in the `command` that you give to the container.
     */
    public fun parameters(parameters: Map<String, Any>)

    /**
     * @param propagateTags Whether to propagate tags from the JobDefinition to the ECS task that
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
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps.Builder =
        software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps.builder()

    /**
     * @param containers The containers that this multinode job will run.
     */
    override fun containers(containers: List<MultiNodeContainer>) {
      cdkBuilder.containers(containers.map(MultiNodeContainer.Companion::unwrap))
    }

    /**
     * @param containers The containers that this multinode job will run.
     */
    override fun containers(vararg containers: MultiNodeContainer): Unit =
        containers(containers.toList())

    /**
     * @param instanceType The instance type that this job definition will run.
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType.Companion::unwrap))
    }

    /**
     * @param jobDefinitionName The name of this job definition.
     */
    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /**
     * @param mainNode The index of the main node in this job.
     * The main node is responsible for orchestration.
     */
    override fun mainNode(mainNode: Number) {
      cdkBuilder.mainNode(mainNode)
    }

    /**
     * @param parameters The default parameters passed to the container These parameters can be
     * referenced in the `command` that you give to the container.
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param propagateTags Whether to propagate tags from the JobDefinition to the ECS task that
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
      cdkBuilder.retryStrategies(retryStrategies.map(RetryStrategy.Companion::unwrap))
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
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps,
  ) : CdkObject(cdkObject),
      MultiNodeJobDefinitionProps {
    /**
     * The containers that this multinode job will run.
     *
     * Default: none
     *
     * [Documentation](https://aws.amazon.com/blogs/compute/building-a-tightly-coupled-molecular-dynamics-workflow-with-multi-node-parallel-jobs-in-aws-batch/)
     */
    override fun containers(): List<MultiNodeContainer> =
        unwrap(this).getContainers()?.map(MultiNodeContainer::wrap) ?: emptyList()

    /**
     * The instance type that this job definition will run.
     *
     * Default: - optimal instance, selected by Batch
     */
    override fun instanceType(): InstanceType? =
        unwrap(this).getInstanceType()?.let(InstanceType::wrap)

    /**
     * The name of this job definition.
     *
     * Default: - generated by CloudFormation
     */
    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    /**
     * The index of the main node in this job.
     *
     * The main node is responsible for orchestration.
     *
     * Default: 0
     */
    override fun mainNode(): Number? = unwrap(this).getMainNode()

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
     * Whether to propagate tags from the JobDefinition to the ECS task that Batch spawns.
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
    public operator fun invoke(block: Builder.() -> Unit = {}): MultiNodeJobDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps):
        MultiNodeJobDefinitionProps = CdkObjectWrappers.wrap(cdkObject) as?
        MultiNodeJobDefinitionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: MultiNodeJobDefinitionProps):
        software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps
  }
}
