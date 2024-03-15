@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ApiDestinationProps : TargetBaseProps {
  public fun event(): RuleTargetInput? = unwrap(this).getEvent()?.let(RuleTargetInput::wrap)

  public fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

  public fun headerParameters(): Map<String, String> = unwrap(this).getHeaderParameters() ?:
      emptyMap()

  public fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
      emptyList()

  public fun queryStringParameters(): Map<String, String> = unwrap(this).getQueryStringParameters()
      ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    public fun event(event: RuleTargetInput)

    public fun eventRole(eventRole: IRole)

    public fun headerParameters(headerParameters: Map<String, String>)

    public fun maxEventAge(maxEventAge: Duration)

    public fun pathParameterValues(pathParameterValues: List<String>)

    public fun pathParameterValues(vararg pathParameterValues: String)

    public fun queryStringParameters(queryStringParameters: Map<String, String>)

    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.ApiDestinationProps.Builder =
        software.amazon.awscdk.services.events.targets.ApiDestinationProps.builder()

    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    override fun event(event: RuleTargetInput) {
      cdkBuilder.event(event.let(RuleTargetInput::unwrap))
    }

    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole::unwrap))
    }

    override fun headerParameters(headerParameters: Map<String, String>) {
      cdkBuilder.headerParameters(headerParameters)
    }

    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    override fun pathParameterValues(pathParameterValues: List<String>) {
      cdkBuilder.pathParameterValues(pathParameterValues)
    }

    override fun pathParameterValues(vararg pathParameterValues: String): Unit =
        pathParameterValues(pathParameterValues.toList())

    override fun queryStringParameters(queryStringParameters: Map<String, String>) {
      cdkBuilder.queryStringParameters(queryStringParameters)
    }

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.ApiDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.ApiDestinationProps,
  ) : CdkObject(cdkObject), ApiDestinationProps {
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    override fun event(): RuleTargetInput? = unwrap(this).getEvent()?.let(RuleTargetInput::wrap)

    override fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

    override fun headerParameters(): Map<String, String> = unwrap(this).getHeaderParameters() ?:
        emptyMap()

    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    override fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
        emptyList()

    override fun queryStringParameters(): Map<String, String> =
        unwrap(this).getQueryStringParameters() ?: emptyMap()

    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.ApiDestinationProps):
        ApiDestinationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiDestinationProps):
        software.amazon.awscdk.services.events.targets.ApiDestinationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.ApiDestinationProps
  }
}
