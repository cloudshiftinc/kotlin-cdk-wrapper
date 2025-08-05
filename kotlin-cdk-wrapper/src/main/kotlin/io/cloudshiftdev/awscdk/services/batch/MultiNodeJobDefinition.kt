@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A JobDefinition that uses Ecs orchestration to run multiple containers.
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
public open class MultiNodeJobDefinition(
  cdkObject: software.amazon.awscdk.services.batch.MultiNodeJobDefinition,
) : Resource(cdkObject),
    IJobDefinition {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.batch.MultiNodeJobDefinition(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: MultiNodeJobDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.batch.MultiNodeJobDefinition(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(MultiNodeJobDefinitionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: MultiNodeJobDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, MultiNodeJobDefinitionProps(props)
  )

  /**
   * Add a container to this multinode job.
   *
   * @param container 
   */
  public open fun addContainer(container: MultiNodeContainer) {
    unwrap(this).addContainer(container.let(MultiNodeContainer.Companion::unwrap))
  }

  /**
   * Add a container to this multinode job.
   *
   * @param container 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c987f47ef6b23a5b312ae2b4f16935e7eefbdee58987ab5efca96f6749a44d8d")
  public open fun addContainer(container: MultiNodeContainer.Builder.() -> Unit): Unit =
      addContainer(MultiNodeContainer(container))

  /**
   * Add a RetryStrategy to this JobDefinition.
   *
   * @param strategy 
   */
  public override fun addRetryStrategy(strategy: RetryStrategy) {
    unwrap(this).addRetryStrategy(strategy.let(RetryStrategy.Companion::unwrap))
  }

  /**
   * The containers that this multinode job will run.
   */
  public open fun containers(): List<MultiNodeContainer> =
      unwrap(this).getContainers().map(MultiNodeContainer::wrap)

  /**
   * If the prop `instanceType` is left `undefined`, then this will hold a fake instance type, for
   * backwards compatibility reasons.
   */
  public open fun instanceType(): InstanceType =
      unwrap(this).getInstanceType().let(InstanceType::wrap)

  /**
   * The ARN of this job definition.
   */
  public override fun jobDefinitionArn(): String = unwrap(this).getJobDefinitionArn()

  /**
   * The name of this job definition.
   */
  public override fun jobDefinitionName(): String = unwrap(this).getJobDefinitionName()

  /**
   * The index of the main node in this job.
   *
   * The main node is responsible for orchestration.
   */
  public open fun mainNode(): Number? = unwrap(this).getMainNode()

  /**
   * The default parameters passed to the container These parameters can be referenced in the
   * `command` that you give to the container.
   */
  public override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * Whether to propagate tags from the JobDefinition to the ECS task that Batch spawns.
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.MultiNodeJobDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The containers that this multinode job will run.
     *
     * Default: none
     *
     * [Documentation](https://aws.amazon.com/blogs/compute/building-a-tightly-coupled-molecular-dynamics-workflow-with-multi-node-parallel-jobs-in-aws-batch/)
     * @param containers The containers that this multinode job will run. 
     */
    public fun containers(containers: List<MultiNodeContainer>)

    /**
     * The containers that this multinode job will run.
     *
     * Default: none
     *
     * [Documentation](https://aws.amazon.com/blogs/compute/building-a-tightly-coupled-molecular-dynamics-workflow-with-multi-node-parallel-jobs-in-aws-batch/)
     * @param containers The containers that this multinode job will run. 
     */
    public fun containers(vararg containers: MultiNodeContainer)

    /**
     * The instance type that this job definition will run.
     *
     * Default: - optimal instance, selected by Batch
     *
     * @param instanceType The instance type that this job definition will run. 
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * The name of this job definition.
     *
     * Default: - generated by CloudFormation
     *
     * @param jobDefinitionName The name of this job definition. 
     */
    public fun jobDefinitionName(jobDefinitionName: String)

    /**
     * The index of the main node in this job.
     *
     * The main node is responsible for orchestration.
     *
     * Default: 0
     *
     * @param mainNode The index of the main node in this job. 
     */
    public fun mainNode(mainNode: Number)

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
     * Whether to propagate tags from the JobDefinition to the ECS task that Batch spawns.
     *
     * Default: false
     *
     * @param propagateTags Whether to propagate tags from the JobDefinition to the ECS task that
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
    private val cdkBuilder: software.amazon.awscdk.services.batch.MultiNodeJobDefinition.Builder =
        software.amazon.awscdk.services.batch.MultiNodeJobDefinition.Builder.create(scope, id)

    /**
     * The containers that this multinode job will run.
     *
     * Default: none
     *
     * [Documentation](https://aws.amazon.com/blogs/compute/building-a-tightly-coupled-molecular-dynamics-workflow-with-multi-node-parallel-jobs-in-aws-batch/)
     * @param containers The containers that this multinode job will run. 
     */
    override fun containers(containers: List<MultiNodeContainer>) {
      cdkBuilder.containers(containers.map(MultiNodeContainer.Companion::unwrap))
    }

    /**
     * The containers that this multinode job will run.
     *
     * Default: none
     *
     * [Documentation](https://aws.amazon.com/blogs/compute/building-a-tightly-coupled-molecular-dynamics-workflow-with-multi-node-parallel-jobs-in-aws-batch/)
     * @param containers The containers that this multinode job will run. 
     */
    override fun containers(vararg containers: MultiNodeContainer): Unit =
        containers(containers.toList())

    /**
     * The instance type that this job definition will run.
     *
     * Default: - optimal instance, selected by Batch
     *
     * @param instanceType The instance type that this job definition will run. 
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType.Companion::unwrap))
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
     * The index of the main node in this job.
     *
     * The main node is responsible for orchestration.
     *
     * Default: 0
     *
     * @param mainNode The index of the main node in this job. 
     */
    override fun mainNode(mainNode: Number) {
      cdkBuilder.mainNode(mainNode)
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
      cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * Whether to propagate tags from the JobDefinition to the ECS task that Batch spawns.
     *
     * Default: false
     *
     * @param propagateTags Whether to propagate tags from the JobDefinition to the ECS task that
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
      cdkBuilder.retryStrategies(retryStrategies.map(RetryStrategy.Companion::unwrap))
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
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.MultiNodeJobDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.batch.MultiNodeJobDefinition.PROPERTY_INJECTION_ID

    public fun fromJobDefinitionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      jobDefinitionArn: String,
    ): IJobDefinition =
        software.amazon.awscdk.services.batch.MultiNodeJobDefinition.fromJobDefinitionArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, jobDefinitionArn).let(IJobDefinition::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): MultiNodeJobDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return MultiNodeJobDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.MultiNodeJobDefinition):
        MultiNodeJobDefinition = MultiNodeJobDefinition(cdkObject)

    internal fun unwrap(wrapped: MultiNodeJobDefinition):
        software.amazon.awscdk.services.batch.MultiNodeJobDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.batch.MultiNodeJobDefinition
  }
}
