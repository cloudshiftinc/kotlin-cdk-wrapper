package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EksJobDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.EksJobDefinition,
) : Resource(cdkObject), IEksJobDefinition, IJobDefinition {
  public override fun addRetryStrategy(strategy: RetryStrategy) {
    unwrap(this).addRetryStrategy(strategy.let(RetryStrategy::unwrap))
  }

  public override fun container(): EksContainerDefinition =
      unwrap(this).getContainer().let(EksContainerDefinition::wrap)

  public override fun dnsPolicy(): DnsPolicy? = unwrap(this).getDnsPolicy()?.let(DnsPolicy::wrap)

  public override fun jobDefinitionArn(): String = unwrap(this).getJobDefinitionArn()

  public override fun jobDefinitionName(): String = unwrap(this).getJobDefinitionName()

  public override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  public override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

  public override fun retryStrategies(): List<RetryStrategy> =
      unwrap(this).getRetryStrategies().map(RetryStrategy::wrap)

  public override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

  public override fun serviceAccount(): String? = unwrap(this).getServiceAccount()

  public override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public override fun useHostNetwork(): Boolean? = unwrap(this).getUseHostNetwork()

  public interface Builder {
    public fun container(container: EksContainerDefinition)

    public fun dnsPolicy(dnsPolicy: DnsPolicy)

    public fun jobDefinitionName(jobDefinitionName: String)

    public fun parameters(parameters: Map<String, Any>)

    public fun retryAttempts(retryAttempts: Number)

    public fun retryStrategies(retryStrategies: List<RetryStrategy>)

    public fun retryStrategies(vararg retryStrategies: RetryStrategy)

    public fun schedulingPriority(schedulingPriority: Number)

    public fun serviceAccount(serviceAccount: String)

    public fun timeout(timeout: Duration)

    public fun useHostNetwork(useHostNetwork: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EksJobDefinition.Builder =
        software.amazon.awscdk.services.batch.EksJobDefinition.Builder.create(scope, id)

    override fun container(container: EksContainerDefinition) {
      cdkBuilder.container(container.let(EksContainerDefinition::unwrap))
    }

    override fun dnsPolicy(dnsPolicy: DnsPolicy) {
      cdkBuilder.dnsPolicy(dnsPolicy.let(DnsPolicy::unwrap))
    }

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

    override fun serviceAccount(serviceAccount: String) {
      cdkBuilder.serviceAccount(serviceAccount)
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun useHostNetwork(useHostNetwork: Boolean) {
      cdkBuilder.useHostNetwork(useHostNetwork)
    }

    public fun build(): software.amazon.awscdk.services.batch.EksJobDefinition = cdkBuilder.build()
  }

  public companion object {
    public open fun fromEksJobDefinitionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      eksJobDefinitionArn: String,
    ): IEksJobDefinition =
        software.amazon.awscdk.services.batch.EksJobDefinition.fromEksJobDefinitionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, eksJobDefinitionArn).let(IEksJobDefinition::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EksJobDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EksJobDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EksJobDefinition):
        EksJobDefinition = EksJobDefinition(cdkObject)

    internal fun unwrap(wrapped: EksJobDefinition):
        software.amazon.awscdk.services.batch.EksJobDefinition = wrapped.cdkObject
  }
}
