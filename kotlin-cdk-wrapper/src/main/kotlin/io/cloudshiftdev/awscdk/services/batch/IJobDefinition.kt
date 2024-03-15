@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public interface IJobDefinition : IResource {
  public fun addRetryStrategy(arg0: RetryStrategy)

  public fun jobDefinitionArn(): String

  public fun jobDefinitionName(): String

  public fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  public fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

  public fun retryStrategies(): List<RetryStrategy>

  public fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.IJobDefinition,
  ) : CdkObject(cdkObject), IJobDefinition {
    override fun addRetryStrategy(arg0: RetryStrategy) {
      unwrap(this).addRetryStrategy(arg0.let(RetryStrategy::unwrap))
    }

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun jobDefinitionArn(): String = unwrap(this).getJobDefinitionArn()

    override fun jobDefinitionName(): String = unwrap(this).getJobDefinitionName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    override fun retryStrategies(): List<RetryStrategy> =
        unwrap(this).getRetryStrategies().map(RetryStrategy::wrap)

    override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IJobDefinition):
        IJobDefinition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IJobDefinition):
        software.amazon.awscdk.services.batch.IJobDefinition = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.IJobDefinition
  }
}
