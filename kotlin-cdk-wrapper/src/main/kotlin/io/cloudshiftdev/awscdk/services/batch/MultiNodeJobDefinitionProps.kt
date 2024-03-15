@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface MultiNodeJobDefinitionProps : JobDefinitionProps {
  public fun containers(): List<MultiNodeContainer> =
      unwrap(this).getContainers()?.map(MultiNodeContainer::wrap) ?: emptyList()

  public fun instanceType(): InstanceType? = unwrap(this).getInstanceType()?.let(InstanceType::wrap)

  public fun mainNode(): Number? = unwrap(this).getMainNode()

  public fun propagateTags(): Boolean? = unwrap(this).getPropagateTags()

  @CdkDslMarker
  public interface Builder {
    public fun containers(containers: List<MultiNodeContainer>)

    public fun containers(vararg containers: MultiNodeContainer)

    public fun instanceType(instanceType: InstanceType)

    public fun jobDefinitionName(jobDefinitionName: String)

    public fun mainNode(mainNode: Number)

    public fun parameters(parameters: Map<String, Any>)

    public fun propagateTags(propagateTags: Boolean)

    public fun retryAttempts(retryAttempts: Number)

    public fun retryStrategies(retryStrategies: List<RetryStrategy>)

    public fun retryStrategies(vararg retryStrategies: RetryStrategy)

    public fun schedulingPriority(schedulingPriority: Number)

    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps.Builder =
        software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps.builder()

    override fun containers(containers: List<MultiNodeContainer>) {
      cdkBuilder.containers(containers.map(MultiNodeContainer::unwrap))
    }

    override fun containers(vararg containers: MultiNodeContainer): Unit =
        containers(containers.toList())

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

    override fun retryStrategies(vararg retryStrategies: RetryStrategy): Unit =
        retryStrategies(retryStrategies.toList())

    override fun schedulingPriority(schedulingPriority: Number) {
      cdkBuilder.schedulingPriority(schedulingPriority)
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps,
  ) : CdkObject(cdkObject), MultiNodeJobDefinitionProps {
    override fun containers(): List<MultiNodeContainer> =
        unwrap(this).getContainers()?.map(MultiNodeContainer::wrap) ?: emptyList()

    override fun instanceType(): InstanceType? =
        unwrap(this).getInstanceType()?.let(InstanceType::wrap)

    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    override fun mainNode(): Number? = unwrap(this).getMainNode()

    override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

    override fun propagateTags(): Boolean? = unwrap(this).getPropagateTags()

    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    override fun retryStrategies(): List<RetryStrategy> =
        unwrap(this).getRetryStrategies()?.map(RetryStrategy::wrap) ?: emptyList()

    override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MultiNodeJobDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps):
        MultiNodeJobDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MultiNodeJobDefinitionProps):
        software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps
  }
}
