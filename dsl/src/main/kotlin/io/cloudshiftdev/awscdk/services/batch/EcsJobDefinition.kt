package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
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

public open class EcsJobDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.EcsJobDefinition,
) : Resource(cdkObject), IJobDefinition {
  public override fun addRetryStrategy(strategy: RetryStrategy) {
    unwrap(this).addRetryStrategy(strategy.let(RetryStrategy::unwrap))
  }

  public open fun container(): IEcsContainerDefinition =
      unwrap(this).getContainer().let(IEcsContainerDefinition::wrap)

  public open fun grantSubmitJob(identity: IGrantable, queue: IJobQueue) {
    unwrap(this).grantSubmitJob(identity.let(IGrantable::unwrap), queue.let(IJobQueue::unwrap))
  }

  public override fun jobDefinitionArn(): String = unwrap(this).getJobDefinitionArn()

  public override fun jobDefinitionName(): String = unwrap(this).getJobDefinitionName()

  public override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  public open fun propagateTags(): Boolean? = unwrap(this).getPropagateTags()

  public override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

  public override fun retryStrategies(): List<RetryStrategy> =
      unwrap(this).getRetryStrategies().map(RetryStrategy::wrap)

  public override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

  public override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public interface Builder {
    public fun container(container: IEcsContainerDefinition)

    public fun jobDefinitionName(jobDefinitionName: String)

    public fun parameters(parameters: Map<String, Any>)

    public fun propagateTags(propagateTags: Boolean)

    public fun retryAttempts(retryAttempts: Number)

    public fun retryStrategies(retryStrategies: List<RetryStrategy>)

    public fun schedulingPriority(schedulingPriority: Number)

    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EcsJobDefinition.Builder =
        software.amazon.awscdk.services.batch.EcsJobDefinition.Builder.create(scope, id)

    override fun container(container: IEcsContainerDefinition) {
      cdkBuilder.container(container.let(IEcsContainerDefinition::unwrap))
    }

    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
    }

    override fun propagateTags(propagateTags: Boolean) {
      cdkBuilder.propagateTags(propagateTags)
    }

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    override fun retryStrategies(retryStrategies: List<RetryStrategy>) {
      cdkBuilder.retryStrategies(retryStrategies.map(RetryStrategy::unwrap))
    }

    override fun schedulingPriority(schedulingPriority: Number) {
      cdkBuilder.schedulingPriority(schedulingPriority)
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.EcsJobDefinition = cdkBuilder.build()
  }

  public companion object {
    public open fun fromJobDefinitionArn(
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
        software.amazon.awscdk.services.batch.EcsJobDefinition = wrapped.cdkObject
  }
}
