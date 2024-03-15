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

public interface EksJobDefinitionProps : JobDefinitionProps {
  public fun container(): EksContainerDefinition

  public fun dnsPolicy(): DnsPolicy? = unwrap(this).getDnsPolicy()?.let(DnsPolicy::wrap)

  public fun serviceAccount(): String? = unwrap(this).getServiceAccount()

  public fun useHostNetwork(): Boolean? = unwrap(this).getUseHostNetwork()

  @CdkDslMarker
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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EksJobDefinitionProps.Builder =
        software.amazon.awscdk.services.batch.EksJobDefinitionProps.builder()

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

    public fun build(): software.amazon.awscdk.services.batch.EksJobDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.EksJobDefinitionProps,
  ) : CdkObject(cdkObject), EksJobDefinitionProps {
    override fun container(): EksContainerDefinition =
        unwrap(this).getContainer().let(EksContainerDefinition::wrap)

    override fun dnsPolicy(): DnsPolicy? = unwrap(this).getDnsPolicy()?.let(DnsPolicy::wrap)

    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    override fun retryStrategies(): List<RetryStrategy> =
        unwrap(this).getRetryStrategies()?.map(RetryStrategy::wrap) ?: emptyList()

    override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

    override fun serviceAccount(): String? = unwrap(this).getServiceAccount()

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun useHostNetwork(): Boolean? = unwrap(this).getUseHostNetwork()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EksJobDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EksJobDefinitionProps):
        EksJobDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EksJobDefinitionProps):
        software.amazon.awscdk.services.batch.EksJobDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.EksJobDefinitionProps
  }
}
