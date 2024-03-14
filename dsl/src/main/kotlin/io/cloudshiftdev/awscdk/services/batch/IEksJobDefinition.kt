package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public interface IEksJobDefinition : IJobDefinition {
  public fun container(): EksContainerDefinition

  public fun dnsPolicy(): DnsPolicy? = unwrap(this).getDnsPolicy()?.let(DnsPolicy::wrap)

  public fun serviceAccount(): String? = unwrap(this).getServiceAccount()

  public fun useHostNetwork(): Boolean? = unwrap(this).getUseHostNetwork()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.IEksJobDefinition,
  ) : IEksJobDefinition {
    public override fun addRetryStrategy(arg0: RetryStrategy) {
      unwrap(this).addRetryStrategy(arg0.let(RetryStrategy::unwrap))
    }

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun container(): EksContainerDefinition =
        unwrap(this).getContainer().let(EksContainerDefinition::wrap)

    public override fun dnsPolicy(): DnsPolicy? = unwrap(this).getDnsPolicy()?.let(DnsPolicy::wrap)

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun jobDefinitionArn(): String = unwrap(this).getJobDefinitionArn()

    public override fun jobDefinitionName(): String = unwrap(this).getJobDefinitionName()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

    public override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    public override fun retryStrategies(): List<RetryStrategy> =
        unwrap(this).getRetryStrategies().map(RetryStrategy::wrap)

    public override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

    public override fun serviceAccount(): String? = unwrap(this).getServiceAccount()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    public override fun useHostNetwork(): Boolean? = unwrap(this).getUseHostNetwork()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IEksJobDefinition):
        IEksJobDefinition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEksJobDefinition):
        software.amazon.awscdk.services.batch.IEksJobDefinition = (wrapped as Wrapper).cdkObject
  }
}
