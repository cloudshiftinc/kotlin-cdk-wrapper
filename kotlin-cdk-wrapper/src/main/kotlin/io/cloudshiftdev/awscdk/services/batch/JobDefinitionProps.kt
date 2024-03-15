@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface JobDefinitionProps {
  public fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  public fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  public fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

  public fun retryStrategies(): List<RetryStrategy> =
      unwrap(this).getRetryStrategies()?.map(RetryStrategy::wrap) ?: emptyList()

  public fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun jobDefinitionName(jobDefinitionName: String)

    public fun parameters(parameters: Map<String, Any>)

    public fun retryAttempts(retryAttempts: Number)

    public fun retryStrategies(retryStrategies: List<RetryStrategy>)

    public fun retryStrategies(vararg retryStrategies: RetryStrategy)

    public fun schedulingPriority(schedulingPriority: Number)

    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.JobDefinitionProps.Builder =
        software.amazon.awscdk.services.batch.JobDefinitionProps.builder()

    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
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

    public fun build(): software.amazon.awscdk.services.batch.JobDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.JobDefinitionProps,
  ) : CdkObject(cdkObject), JobDefinitionProps {
    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    override fun retryStrategies(): List<RetryStrategy> =
        unwrap(this).getRetryStrategies()?.map(RetryStrategy::wrap) ?: emptyList()

    override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JobDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.JobDefinitionProps):
        JobDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: JobDefinitionProps):
        software.amazon.awscdk.services.batch.JobDefinitionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.batch.JobDefinitionProps
  }
}
