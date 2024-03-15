@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface EcsJobDefinitionProps : JobDefinitionProps {
  public fun container(): IEcsContainerDefinition

  public fun propagateTags(): Boolean? = unwrap(this).getPropagateTags()

  @CdkDslMarker
  public interface Builder {
    public fun container(container: IEcsContainerDefinition)

    public fun jobDefinitionName(jobDefinitionName: String)

    public fun parameters(parameters: Map<String, Any>)

    public fun propagateTags(propagateTags: Boolean)

    public fun retryAttempts(retryAttempts: Number)

    public fun retryStrategies(retryStrategies: List<RetryStrategy>)

    public fun retryStrategies(vararg retryStrategies: RetryStrategy)

    public fun schedulingPriority(schedulingPriority: Number)

    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EcsJobDefinitionProps.Builder =
        software.amazon.awscdk.services.batch.EcsJobDefinitionProps.builder()

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

    override fun retryStrategies(vararg retryStrategies: RetryStrategy): Unit =
        retryStrategies(retryStrategies.toList())

    override fun schedulingPriority(schedulingPriority: Number) {
      cdkBuilder.schedulingPriority(schedulingPriority)
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.EcsJobDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.EcsJobDefinitionProps,
  ) : CdkObject(cdkObject), EcsJobDefinitionProps {
    override fun container(): IEcsContainerDefinition =
        unwrap(this).getContainer().let(IEcsContainerDefinition::wrap)

    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

    override fun propagateTags(): Boolean? = unwrap(this).getPropagateTags()

    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    override fun retryStrategies(): List<RetryStrategy> =
        unwrap(this).getRetryStrategies()?.map(RetryStrategy::wrap) ?: emptyList()

    override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

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
