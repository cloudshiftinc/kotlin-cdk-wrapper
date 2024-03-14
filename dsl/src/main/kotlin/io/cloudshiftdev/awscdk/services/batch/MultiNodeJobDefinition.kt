package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class MultiNodeJobDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.MultiNodeJobDefinition,
) : Resource(cdkObject), IJobDefinition {
  public open fun addContainer(container: MultiNodeContainer) {
    unwrap(this).addContainer(container.let(MultiNodeContainer::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c987f47ef6b23a5b312ae2b4f16935e7eefbdee58987ab5efca96f6749a44d8d")
  public open fun addContainer(container: MultiNodeContainer.Builder.() -> Unit): Unit =
      addContainer(MultiNodeContainer(container))

  public override fun addRetryStrategy(strategy: RetryStrategy) {
    unwrap(this).addRetryStrategy(strategy.let(RetryStrategy::unwrap))
  }

  public open fun containers(): List<MultiNodeContainer> =
      unwrap(this).getContainers().map(MultiNodeContainer::wrap)

  public open fun instanceType(): InstanceType =
      unwrap(this).getInstanceType().let(InstanceType::wrap)

  public override fun jobDefinitionArn(): String = unwrap(this).getJobDefinitionArn()

  public override fun jobDefinitionName(): String = unwrap(this).getJobDefinitionName()

  public open fun mainNode(): Number? = unwrap(this).getMainNode()

  public override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  public open fun propagateTags(): Boolean? = unwrap(this).getPropagateTags()

  public override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

  public override fun retryStrategies(): List<RetryStrategy> =
      unwrap(this).getRetryStrategies().map(RetryStrategy::wrap)

  public override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

  public override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public interface Builder {
    public fun containers(containers: List<MultiNodeContainer>)

    public fun instanceType(instanceType: InstanceType)

    public fun jobDefinitionName(jobDefinitionName: String)

    public fun mainNode(mainNode: Number)

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
    private val cdkBuilder: software.amazon.awscdk.services.batch.MultiNodeJobDefinition.Builder =
        software.amazon.awscdk.services.batch.MultiNodeJobDefinition.Builder.create(scope, id)

    override fun containers(containers: List<MultiNodeContainer>) {
      cdkBuilder.containers(containers.map(MultiNodeContainer::unwrap))
    }

    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    override fun mainNode(mainNode: Number) {
      cdkBuilder.mainNode(mainNode)
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

    public fun build(): software.amazon.awscdk.services.batch.MultiNodeJobDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromJobDefinitionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      jobDefinitionArn: String,
    ): IJobDefinition =
        software.amazon.awscdk.services.batch.MultiNodeJobDefinition.fromJobDefinitionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
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
        software.amazon.awscdk.services.batch.MultiNodeJobDefinition = wrapped.cdkObject
  }
}
